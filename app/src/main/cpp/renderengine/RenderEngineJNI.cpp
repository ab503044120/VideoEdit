//
// Created by huihui on 2023/10/3.
//
#include <jni.h>
#include "RenderEngine.h"
#include <android/native_window_jni.h>
#include "effect/Effect.h"
#include <vector>
RenderEngine::RenderEngine engine;

extern "C"
JNIEXPORT void JNICALL
Java_org_huihui_videoedit_RenderEngineJNI_start(JNIEnv *env, jclass clazz) {
  engine.start();
}
extern "C"
JNIEXPORT void JNICALL
Java_org_huihui_videoedit_RenderEngineJNI_stop(JNIEnv *env, jclass clazz) {
  engine.stop();
}
extern "C"
JNIEXPORT void JNICALL
Java_org_huihui_videoedit_RenderEngineJNI_setSurface(JNIEnv *env, jclass clazz, jobject surface) {
  if (surface == nullptr) {
    engine.setSurface(nullptr);
  } else {
    engine.setSurface(ANativeWindow_fromSurface(env, surface));
  }
}
extern "C"
JNIEXPORT void JNICALL
Java_org_huihui_videoedit_RenderEngineJNI_updateSurfaceSize(JNIEnv *env, jclass clazz, jint width,
                                                            jint height) {
  engine.updateSurfaceSize(width, height);
}