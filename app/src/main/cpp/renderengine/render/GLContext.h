//
// by huihui on 2023/10/11.
//

#ifndef VIDEOEDIT_APP_SRC_MAIN_CPP_RENDERENGINE_RENDER_GLCONTEXT_H
#define VIDEOEDIT_APP_SRC_MAIN_CPP_RENDERENGINE_RENDER_GLCONTEXT_H
#include <android/native_window.h>
#include <EGL/egl.h>
#include <EGL/eglext.h>
#include <memory>
namespace RenderEngine {

class GLContext {
private:

public:
  static std::shared_ptr<GLContext> create();

  GLContext(EGLContext sharedContext, int flags);

  bool init(EGLContext sharedContext, int flags);

  void release();

  EGLContext getEGLContext();

  void releaseSurface(EGLSurface eglSurface);

  EGLSurface createWindowSurface(ANativeWindow *surface);

  EGLSurface createOffscreenSurface(int width, int height);

  void makeCurrent(EGLSurface eglSurface);

  void makeCurrent(EGLSurface drawSurface, EGLSurface readSurface);

  void makeNothingCurrent();

  bool swapBuffers(EGLSurface eglSurface);

  void setPresentationTime(EGLSurface eglSurface, long nsecs);

  bool isCurrent(EGLSurface eglSurface);

  int querySurface(EGLSurface eglSurface, int what);

  const char *queryString(int what);

  int getGlVersion();

};

}

#endif //VIDEOEDIT_APP_SRC_MAIN_CPP_RENDERENGINE_RENDER_GLCONTEXT_H
