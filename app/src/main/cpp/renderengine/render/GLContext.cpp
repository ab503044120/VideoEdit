//
// Created by huihui on 2023/10/11.
//

#include "GLContext.h"

namespace RenderEngine {
std::shared_ptr<GLContext> GLContext::create() {
  return std::shared_ptr<GLContext>();
}

GLContext::GLContext(EGLContext sharedContext, int flags) {

}

bool GLContext::init(EGLContext sharedContext, int flags) {
  return false;
}

void GLContext::release() {

}

EGLContext GLContext::getEGLContext() {
  return nullptr;
}

void GLContext::releaseSurface(EGLSurface eglSurface) {

}

EGLSurface GLContext::createWindowSurface(ANativeWindow *surface) {
  return nullptr;
}

EGLSurface GLContext::createOffscreenSurface(int width, int height) {
  return nullptr;
}

void GLContext::makeCurrent(EGLSurface eglSurface) {

}

void GLContext::makeCurrent(EGLSurface drawSurface, EGLSurface readSurface) {

}

void GLContext::makeNothingCurrent() {

}

bool GLContext::swapBuffers(EGLSurface eglSurface) {
  return false;
}

void GLContext::setPresentationTime(EGLSurface eglSurface, long nsecs) {

}

bool GLContext::isCurrent(EGLSurface eglSurface) {
  return false;
}

int GLContext::querySurface(EGLSurface eglSurface, int what) {
  return 0;
}

const char *GLContext::queryString(int what) {
  return nullptr;
}

int GLContext::getGlVersion() {
  return 0;
}
} // RenderEngine