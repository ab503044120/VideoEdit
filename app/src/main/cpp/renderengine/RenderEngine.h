//
// Created by huihui on 2023/6/14.
//

#ifndef RENDERENGINE_RENDERENGINE_H_
#define RENDERENGINE_RENDERENGINE_H_
#include <android/native_window.h>
#include <vector>
namespace RenderEngine {
class RenderEngine {
private:
  uint32_t mWindowWidth{};
  uint32_t mWindowHeight{};

public:
  void start();

  void stop();

  void setSurface(ANativeWindow *window);

  void updateSurfaceSize(uint32_t width, uint32_t height);

};
}
#endif //RENDERENGINE_RENDERENGINE_H_
