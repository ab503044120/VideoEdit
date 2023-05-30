//
// Created by huihui on 2023/5/25.
//

#include "VideoEdit.h"

shared_ptr<VideoEdit> VideoEdit::mInstance;

mutex VideoEdit::sMutex;

shared_ptr<VideoEdit> VideoEdit::getInstance() {
    if (!mInstance) {
        lock_guard<mutex> lock(sMutex);
        if (!mInstance) {
            mInstance = std::make_shared<VideoEdit>();
        }
    }
    return mInstance;
}

void VideoEdit::init(const char *pluginPath, const char *metaPath) {
    lock_guard<mutex> lock(sMutex);
    if (!mRepository) {
        setenv("MLT_REPOSITORY", pluginPath, true);
        setenv("MLT_DATA", metaPath, true);
        mRepository = Mlt::Factory::init();
    }
}

