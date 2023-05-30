//
// Created by huihui on 2023/5/25.
//
#include <jni.h>
#include <string>
#include "mlt++/Mlt.h"
#include "videoedit/VideoEdit.h"
#include "Log.h"
#include "stdlib.h"
static void mlt_log_callback(void *service, int level, const char *fmt, va_list vl);

JNIEXPORT jint JNI_OnLoad(JavaVM *vm, void *reserved) {
    mlt_log_set_callback(mlt_log_callback);
    return JNI_VERSION_1_6;
}

static int32_t mlt_log_level = MLT_LOG_DEBUG;

static void mlt_log_callback(void *service, int level, const char *fmt, va_list vl) {
    if (level > mlt_log_level) {
        return;
    }
    int32_t l = ANDROID_LOG_VERBOSE;
    switch (level) {
        case MLT_LOG_DEBUG   : l = ANDROID_LOG_VERBOSE;
            break;
        case MLT_LOG_VERBOSE :
        case MLT_LOG_TIMINGS : l = ANDROID_LOG_DEBUG;
            break;
        case MLT_LOG_INFO    : l = ANDROID_LOG_INFO;
            break;
        case MLT_LOG_WARNING : l = ANDROID_LOG_WARN;
            break;
        case MLT_LOG_ERROR   : l = ANDROID_LOG_ERROR;
            break;
        case MLT_LOG_FATAL   :
        default: l = ANDROID_LOG_FATAL;
    }

    mlt_properties properties = service ? MLT_SERVICE_PROPERTIES((mlt_service)service) : nullptr;
    char service_str[100]{};
    if (properties != nullptr) {
        const char *mlt_type = mlt_properties_get(properties, "mlt_type");
        if (mlt_type == nullptr) {
            mlt_type = "mlt_type_unknown";
        }
        const char *mlt_service = mlt_properties_get(properties, "mlt_service");
        if (mlt_service == nullptr) {
            mlt_service = "mlt_service_unknown";
        }
        const char *resource = mlt_properties_get(properties, "resource");
        if (resource == nullptr) {
            resource = "resource_unknown";
        }
        snprintf(service_str, 100, "%s:%s:%s", mlt_type, mlt_service, resource);
    } else {
        strncpy(service_str, "null", 5);
    }
    char str[1024]{};
    vsnprintf(str, 1024, fmt, vl);
    Logger::log(l, "mlt_internal", "%s:%s", service_str, str);

}

extern "C"
JNIEXPORT void JNICALL
Java_org_huihui_videoedit_VideoEditJNI_nInitLog(JNIEnv *env, jclass clazz, jint log_level) {
    mlt_log_level = log_level;
    mlt_log_set_callback(mlt_log_callback);
}
extern "C"
JNIEXPORT void JNICALL
Java_org_huihui_videoedit_VideoEditJNI_nInit(JNIEnv *env,
                                             jclass clazz,
                                             jstring pluginPath,
                                             jstring metaPath) {
    const char *plugin = env->GetStringUTFChars(pluginPath, nullptr);
    const char *meta = env->GetStringUTFChars(metaPath, nullptr);
    VideoEdit::getInstance()->init(plugin, meta);
    env->ReleaseStringUTFChars(pluginPath, plugin);
    env->ReleaseStringUTFChars(metaPath, meta);
}
extern "C"
JNIEXPORT void JNICALL
Java_org_huihui_videoedit_VideoEditJNI_nRelease(JNIEnv *env, jclass clazz, jstring path) {

}