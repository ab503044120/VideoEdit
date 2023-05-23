#include <jni.h>
#include <string>
#include "mlt++/Mlt.h"
extern "C" JNIEXPORT jstring JNICALL
Java_org_huihui_videoedit_MainActivity_stringFromJNI(
	JNIEnv *env,
	jobject /* this */) {
  std::string hello = "Hello from C++";
  Mlt::Properties p;
  p.debug("hah");
  return env->NewStringUTF(hello.c_str());
}