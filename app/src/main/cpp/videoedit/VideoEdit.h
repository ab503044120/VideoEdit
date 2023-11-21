//
// Created by huihui on 2023/5/25.
//

#ifndef VIDEOEDIT_H_
#define VIDEOEDIT_H_

#include <mutex>
#include <memory>
#include <string>
#include <mlt++/Mlt.h>

using namespace std;

class VideoEdit {
 private:
    static mutex sMutex;
    static shared_ptr<VideoEdit> mInstance;
 public:
    static shared_ptr<VideoEdit> getInstance();

 private:
    Mlt::Repository *mRepository = nullptr;
 public:
    void init(const char *pluginPath, const char *metaPath);
};

#endif //VIDEOEDIT_H_
