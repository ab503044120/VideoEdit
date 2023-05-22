/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Animation {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Animation(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Animation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mltJNI.delete_Animation(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Animation() {
    this(mltJNI.new_Animation__SWIG_0(), true);
  }

  public Animation(SWIGTYPE_p_mlt_animation_s animation) {
    this(mltJNI.new_Animation__SWIG_1(SWIGTYPE_p_mlt_animation_s.getCPtr(animation)), true);
  }

  public Animation(Animation arg0) {
    this(mltJNI.new_Animation__SWIG_2(Animation.getCPtr(arg0), arg0), true);
  }

  public boolean is_valid() {
    return mltJNI.Animation_is_valid(swigCPtr, this);
  }

  public SWIGTYPE_p_mlt_animation_s get_animation() {
    long cPtr = mltJNI.Animation_get_animation(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_mlt_animation_s(cPtr, false);
  }

  public Animation __assign__(Animation arg0) {
    return new Animation(mltJNI.Animation___assign__(swigCPtr, this, Animation.getCPtr(arg0), arg0), false);
  }

  public int length() {
    return mltJNI.Animation_length(swigCPtr, this);
  }

  public int get_item(int position, SWIGTYPE_p_bool is_key, SWIGTYPE_p_mlt_keyframe_type arg2) {
    return mltJNI.Animation_get_item(swigCPtr, this, position, SWIGTYPE_p_bool.getCPtr(is_key), SWIGTYPE_p_mlt_keyframe_type.getCPtr(arg2));
  }

  public boolean is_key(int position) {
    return mltJNI.Animation_is_key(swigCPtr, this, position);
  }

  public mlt_keyframe_type keyframe_type(int position) {
    return mlt_keyframe_type.swigToEnum(mltJNI.Animation_keyframe_type(swigCPtr, this, position));
  }

  public int next_key(int position) {
    return mltJNI.Animation_next_key__SWIG_0(swigCPtr, this, position);
  }

  public boolean next_key(int position, SWIGTYPE_p_int key) {
    return mltJNI.Animation_next_key__SWIG_1(swigCPtr, this, position, SWIGTYPE_p_int.getCPtr(key));
  }

  public int previous_key(int position) {
    return mltJNI.Animation_previous_key__SWIG_0(swigCPtr, this, position);
  }

  public boolean previous_key(int position, SWIGTYPE_p_int key) {
    return mltJNI.Animation_previous_key__SWIG_1(swigCPtr, this, position, SWIGTYPE_p_int.getCPtr(key));
  }

  public int key_count() {
    return mltJNI.Animation_key_count(swigCPtr, this);
  }

  public int key_get(int index, SWIGTYPE_p_int frame, SWIGTYPE_p_mlt_keyframe_type arg2) {
    return mltJNI.Animation_key_get(swigCPtr, this, index, SWIGTYPE_p_int.getCPtr(frame), SWIGTYPE_p_mlt_keyframe_type.getCPtr(arg2));
  }

  public int key_get_frame(int index) {
    return mltJNI.Animation_key_get_frame(swigCPtr, this, index);
  }

  public mlt_keyframe_type key_get_type(int index) {
    return mlt_keyframe_type.swigToEnum(mltJNI.Animation_key_get_type(swigCPtr, this, index));
  }

  public int key_set_type(int index, mlt_keyframe_type type) {
    return mltJNI.Animation_key_set_type(swigCPtr, this, index, type.swigValue());
  }

  public int key_set_frame(int index, int frame) {
    return mltJNI.Animation_key_set_frame(swigCPtr, this, index, frame);
  }

  public void shift_frames(int shift) {
    mltJNI.Animation_shift_frames(swigCPtr, this, shift);
  }

  public void set_length(int length) {
    mltJNI.Animation_set_length(swigCPtr, this, length);
  }

  public int remove(int position) {
    return mltJNI.Animation_remove(swigCPtr, this, position);
  }

  public void interpolate() {
    mltJNI.Animation_interpolate(swigCPtr, this);
  }

  public String serialize_cut(int in, int out) {
    return mltJNI.Animation_serialize_cut__SWIG_0(swigCPtr, this, in, out);
  }

  public String serialize_cut(int in) {
    return mltJNI.Animation_serialize_cut__SWIG_1(swigCPtr, this, in);
  }

  public String serialize_cut() {
    return mltJNI.Animation_serialize_cut__SWIG_2(swigCPtr, this);
  }

  public String serialize_cut(mlt_time_format format, int in, int out) {
    return mltJNI.Animation_serialize_cut__SWIG_3(swigCPtr, this, format.swigValue(), in, out);
  }

  public String serialize_cut(mlt_time_format format, int in) {
    return mltJNI.Animation_serialize_cut__SWIG_4(swigCPtr, this, format.swigValue(), in);
  }

  public String serialize_cut(mlt_time_format format) {
    return mltJNI.Animation_serialize_cut__SWIG_5(swigCPtr, this, format.swigValue());
  }

}
