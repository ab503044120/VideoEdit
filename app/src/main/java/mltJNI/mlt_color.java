/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class mlt_color {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected mlt_color(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(mlt_color obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mltJNI.delete_mlt_color(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setR(SWIGTYPE_p_uint8_t value) {
    mltJNI.mlt_color_r_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getR() {
    return new SWIGTYPE_p_uint8_t(mltJNI.mlt_color_r_get(swigCPtr, this), true);
  }

  public void setG(SWIGTYPE_p_uint8_t value) {
    mltJNI.mlt_color_g_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getG() {
    return new SWIGTYPE_p_uint8_t(mltJNI.mlt_color_g_get(swigCPtr, this), true);
  }

  public void setB(SWIGTYPE_p_uint8_t value) {
    mltJNI.mlt_color_b_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getB() {
    return new SWIGTYPE_p_uint8_t(mltJNI.mlt_color_b_get(swigCPtr, this), true);
  }

  public void setA(SWIGTYPE_p_uint8_t value) {
    mltJNI.mlt_color_a_set(swigCPtr, this, SWIGTYPE_p_uint8_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint8_t getA() {
    return new SWIGTYPE_p_uint8_t(mltJNI.mlt_color_a_get(swigCPtr, this), true);
  }

  public mlt_color() {
    this(mltJNI.new_mlt_color(), true);
  }

}
