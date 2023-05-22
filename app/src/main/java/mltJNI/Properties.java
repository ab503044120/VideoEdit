/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Properties {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Properties(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Properties obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mltJNI.delete_Properties(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Properties() {
    this(mltJNI.new_Properties__SWIG_0(), true);
  }

  public Properties(boolean dummy) {
    this(mltJNI.new_Properties__SWIG_1(dummy), true);
  }

  public Properties(Properties properties) {
    this(mltJNI.new_Properties__SWIG_2(Properties.getCPtr(properties), properties), true);
  }

  public Properties(SWIGTYPE_p_mlt_properties_s properties) {
    this(mltJNI.new_Properties__SWIG_4(SWIGTYPE_p_mlt_properties_s.getCPtr(properties)), true);
  }

  public Properties(SWIGTYPE_p_void properties) {
    this(mltJNI.new_Properties__SWIG_5(SWIGTYPE_p_void.getCPtr(properties)), true);
  }

  public Properties(String file) {
    this(mltJNI.new_Properties__SWIG_6(file), true);
  }

  public SWIGTYPE_p_mlt_properties_s get_properties() {
    long cPtr = mltJNI.Properties_get_properties(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_mlt_properties_s(cPtr, false);
  }

  public int inc_ref() {
    return mltJNI.Properties_inc_ref(swigCPtr, this);
  }

  public int dec_ref() {
    return mltJNI.Properties_dec_ref(swigCPtr, this);
  }

  public int ref_count() {
    return mltJNI.Properties_ref_count(swigCPtr, this);
  }

  public void lock() {
    mltJNI.Properties_lock(swigCPtr, this);
  }

  public void unlock() {
    mltJNI.Properties_unlock(swigCPtr, this);
  }

  public void block(SWIGTYPE_p_void object) {
    mltJNI.Properties_block__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(object));
  }

  public void block() {
    mltJNI.Properties_block__SWIG_1(swigCPtr, this);
  }

  public void unblock(SWIGTYPE_p_void object) {
    mltJNI.Properties_unblock__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(object));
  }

  public void unblock() {
    mltJNI.Properties_unblock__SWIG_1(swigCPtr, this);
  }

  public int fire_event(String event) {
    return mltJNI.Properties_fire_event(swigCPtr, this, event);
  }

  public boolean is_valid() {
    return mltJNI.Properties_is_valid(swigCPtr, this);
  }

  public int count() {
    return mltJNI.Properties_count(swigCPtr, this);
  }

  public String get(String name) {
    return mltJNI.Properties_get__SWIG_0(swigCPtr, this, name);
  }

  public int get_int(String name) {
    return mltJNI.Properties_get_int(swigCPtr, this, name);
  }

  public SWIGTYPE_p_int64_t get_int64(String name) {
    return new SWIGTYPE_p_int64_t(mltJNI.Properties_get_int64(swigCPtr, this, name), true);
  }

  public double get_double(String name) {
    return mltJNI.Properties_get_double(swigCPtr, this, name);
  }

  public SWIGTYPE_p_void get_data(String name, SWIGTYPE_p_int size) {
    long cPtr = mltJNI.Properties_get_data__SWIG_0(swigCPtr, this, name, SWIGTYPE_p_int.getCPtr(size));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SWIGTYPE_p_void get_data(String name) {
    long cPtr = mltJNI.Properties_get_data__SWIG_1(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public int set(String name, String value) {
    return mltJNI.Properties_set__SWIG_0(swigCPtr, this, name, value);
  }

  public int set_string(String name, String value) {
    return mltJNI.Properties_set_string(swigCPtr, this, name, value);
  }

  public int set(String name, int value) {
    return mltJNI.Properties_set__SWIG_1(swigCPtr, this, name, value);
  }

  public int set(String name, SWIGTYPE_p_int64_t value) {
    return mltJNI.Properties_set__SWIG_2(swigCPtr, this, name, SWIGTYPE_p_int64_t.getCPtr(value));
  }

  public int set(String name, double value) {
    return mltJNI.Properties_set__SWIG_3(swigCPtr, this, name, value);
  }

  public int set(String name, SWIGTYPE_p_void value, int size, SWIGTYPE_p_f_p_void__void destroy, SWIGTYPE_p_f_p_void_int__p_char serial) {
    return mltJNI.Properties_set__SWIG_4(swigCPtr, this, name, SWIGTYPE_p_void.getCPtr(value), size, SWIGTYPE_p_f_p_void__void.getCPtr(destroy), SWIGTYPE_p_f_p_void_int__p_char.getCPtr(serial));
  }

  public int set(String name, SWIGTYPE_p_void value, int size, SWIGTYPE_p_f_p_void__void destroy) {
    return mltJNI.Properties_set__SWIG_5(swigCPtr, this, name, SWIGTYPE_p_void.getCPtr(value), size, SWIGTYPE_p_f_p_void__void.getCPtr(destroy));
  }

  public int set(String name, SWIGTYPE_p_void value, int size) {
    return mltJNI.Properties_set__SWIG_6(swigCPtr, this, name, SWIGTYPE_p_void.getCPtr(value), size);
  }

  public int copy(Properties that, String prefix) {
    return mltJNI.Properties_copy(swigCPtr, this, Properties.getCPtr(that), that, prefix);
  }

  public void pass_property(Properties that, String name) {
    mltJNI.Properties_pass_property(swigCPtr, this, Properties.getCPtr(that), that, name);
  }

  public int pass_values(Properties that, String prefix) {
    return mltJNI.Properties_pass_values(swigCPtr, this, Properties.getCPtr(that), that, prefix);
  }

  public int pass_list(Properties that, String list) {
    return mltJNI.Properties_pass_list(swigCPtr, this, Properties.getCPtr(that), that, list);
  }

  public int parse(String namevalue) {
    return mltJNI.Properties_parse(swigCPtr, this, namevalue);
  }

  public String get_name(int index) {
    return mltJNI.Properties_get_name(swigCPtr, this, index);
  }

  public String get(int index) {
    return mltJNI.Properties_get__SWIG_1(swigCPtr, this, index);
  }

  public String get(int index, mlt_time_format arg1) {
    return mltJNI.Properties_get__SWIG_2(swigCPtr, this, index, arg1.swigValue());
  }

  public SWIGTYPE_p_void get_data(int index, SWIGTYPE_p_int size) {
    long cPtr = mltJNI.Properties_get_data__SWIG_2(swigCPtr, this, index, SWIGTYPE_p_int.getCPtr(size));
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void mirror(Properties that) {
    mltJNI.Properties_mirror(swigCPtr, this, Properties.getCPtr(that), that);
  }

  public int inherit(Properties that) {
    return mltJNI.Properties_inherit(swigCPtr, this, Properties.getCPtr(that), that);
  }

  public int rename(String source, String dest) {
    return mltJNI.Properties_rename(swigCPtr, this, source, dest);
  }

  public void dump(SWIGTYPE_p_FILE output) {
    mltJNI.Properties_dump__SWIG_0(swigCPtr, this, SWIGTYPE_p_FILE.getCPtr(output));
  }

  public void dump() {
    mltJNI.Properties_dump__SWIG_1(swigCPtr, this);
  }

  public void debug(String title, SWIGTYPE_p_FILE output) {
    mltJNI.Properties_debug__SWIG_0(swigCPtr, this, title, SWIGTYPE_p_FILE.getCPtr(output));
  }

  public void debug(String title) {
    mltJNI.Properties_debug__SWIG_1(swigCPtr, this, title);
  }

  public void debug() {
    mltJNI.Properties_debug__SWIG_2(swigCPtr, this);
  }

  public void load(String file) {
    mltJNI.Properties_load(swigCPtr, this, file);
  }

  public int save(String file) {
    return mltJNI.Properties_save(swigCPtr, this, file);
  }

  public Event listen(String id, SWIGTYPE_p_void object, SWIGTYPE_p_mlt_listener arg2) {
    long cPtr = mltJNI.Properties_listen(swigCPtr, this, id, SWIGTYPE_p_void.getCPtr(object), SWIGTYPE_p_mlt_listener.getCPtr(arg2));
    return (cPtr == 0) ? null : new Event(cPtr, true);
  }

  public static void delete_event(Event arg0) {
    mltJNI.Properties_delete_event(Event.getCPtr(arg0), arg0);
  }

  public Event setup_wait_for(String id) {
    long cPtr = mltJNI.Properties_setup_wait_for(swigCPtr, this, id);
    return (cPtr == 0) ? null : new Event(cPtr, true);
  }

  public void wait_for(Event arg0, boolean destroy) {
    mltJNI.Properties_wait_for__SWIG_0(swigCPtr, this, Event.getCPtr(arg0), arg0, destroy);
  }

  public void wait_for(Event arg0) {
    mltJNI.Properties_wait_for__SWIG_1(swigCPtr, this, Event.getCPtr(arg0), arg0);
  }

  public void wait_for(String id) {
    mltJNI.Properties_wait_for__SWIG_2(swigCPtr, this, id);
  }

  public boolean is_sequence() {
    return mltJNI.Properties_is_sequence(swigCPtr, this);
  }

  public static Properties parse_yaml(String file) {
    long cPtr = mltJNI.Properties_parse_yaml(file);
    return (cPtr == 0) ? null : new Properties(cPtr, true);
  }

  public String serialise_yaml() {
    return mltJNI.Properties_serialise_yaml(swigCPtr, this);
  }

  public int preset(String name) {
    return mltJNI.Properties_preset(swigCPtr, this, name);
  }

  public int set_lcnumeric(String locale) {
    return mltJNI.Properties_set_lcnumeric(swigCPtr, this, locale);
  }

  public String get_lcnumeric() {
    return mltJNI.Properties_get_lcnumeric(swigCPtr, this);
  }

  public void clear(String name) {
    mltJNI.Properties_clear(swigCPtr, this, name);
  }

  public boolean property_exists(String name) {
    return mltJNI.Properties_property_exists(swigCPtr, this, name);
  }

  public String get_time(String name, mlt_time_format arg1) {
    return mltJNI.Properties_get_time__SWIG_0(swigCPtr, this, name, arg1.swigValue());
  }

  public String get_time(String name) {
    return mltJNI.Properties_get_time__SWIG_1(swigCPtr, this, name);
  }

  public String frames_to_time(int arg0, mlt_time_format arg1) {
    return mltJNI.Properties_frames_to_time__SWIG_0(swigCPtr, this, arg0, arg1.swigValue());
  }

  public String frames_to_time(int arg0) {
    return mltJNI.Properties_frames_to_time__SWIG_1(swigCPtr, this, arg0);
  }

  public int time_to_frames(String time) {
    return mltJNI.Properties_time_to_frames(swigCPtr, this, time);
  }

  public mlt_color get_color(String name) {
    return new mlt_color(mltJNI.Properties_get_color(swigCPtr, this, name), true);
  }

  public int set(String name, mlt_color value) {
    return mltJNI.Properties_set__SWIG_7(swigCPtr, this, name, mlt_color.getCPtr(value), value);
  }

  public mlt_color anim_get_color(String name, int position, int length) {
    return new mlt_color(mltJNI.Properties_anim_get_color__SWIG_0(swigCPtr, this, name, position, length), true);
  }

  public mlt_color anim_get_color(String name, int position) {
    return new mlt_color(mltJNI.Properties_anim_get_color__SWIG_1(swigCPtr, this, name, position), true);
  }

  public int anim_set(String name, mlt_color value, int position, int length, mlt_keyframe_type keyframe_type) {
    return mltJNI.Properties_anim_set__SWIG_0(swigCPtr, this, name, mlt_color.getCPtr(value), value, position, length, keyframe_type.swigValue());
  }

  public int anim_set(String name, mlt_color value, int position, int length) {
    return mltJNI.Properties_anim_set__SWIG_1(swigCPtr, this, name, mlt_color.getCPtr(value), value, position, length);
  }

  public int anim_set(String name, mlt_color value, int position) {
    return mltJNI.Properties_anim_set__SWIG_2(swigCPtr, this, name, mlt_color.getCPtr(value), value, position);
  }

  public String anim_get(String name, int position, int length) {
    return mltJNI.Properties_anim_get__SWIG_0(swigCPtr, this, name, position, length);
  }

  public String anim_get(String name, int position) {
    return mltJNI.Properties_anim_get__SWIG_1(swigCPtr, this, name, position);
  }

  public int anim_set(String name, String value, int position, int length) {
    return mltJNI.Properties_anim_set__SWIG_3(swigCPtr, this, name, value, position, length);
  }

  public int anim_set(String name, String value, int position) {
    return mltJNI.Properties_anim_set__SWIG_4(swigCPtr, this, name, value, position);
  }

  public int anim_get_int(String name, int position, int length) {
    return mltJNI.Properties_anim_get_int__SWIG_0(swigCPtr, this, name, position, length);
  }

  public int anim_get_int(String name, int position) {
    return mltJNI.Properties_anim_get_int__SWIG_1(swigCPtr, this, name, position);
  }

  public int anim_set(String name, int value, int position, int length, mlt_keyframe_type keyframe_type) {
    return mltJNI.Properties_anim_set__SWIG_5(swigCPtr, this, name, value, position, length, keyframe_type.swigValue());
  }

  public int anim_set(String name, int value, int position, int length) {
    return mltJNI.Properties_anim_set__SWIG_6(swigCPtr, this, name, value, position, length);
  }

  public int anim_set(String name, int value, int position) {
    return mltJNI.Properties_anim_set__SWIG_7(swigCPtr, this, name, value, position);
  }

  public double anim_get_double(String name, int position, int length) {
    return mltJNI.Properties_anim_get_double__SWIG_0(swigCPtr, this, name, position, length);
  }

  public double anim_get_double(String name, int position) {
    return mltJNI.Properties_anim_get_double__SWIG_1(swigCPtr, this, name, position);
  }

  public int anim_set(String name, double value, int position, int length, mlt_keyframe_type keyframe_type) {
    return mltJNI.Properties_anim_set__SWIG_8(swigCPtr, this, name, value, position, length, keyframe_type.swigValue());
  }

  public int anim_set(String name, double value, int position, int length) {
    return mltJNI.Properties_anim_set__SWIG_9(swigCPtr, this, name, value, position, length);
  }

  public int anim_set(String name, double value, int position) {
    return mltJNI.Properties_anim_set__SWIG_10(swigCPtr, this, name, value, position);
  }

  public int set(String name, mlt_rect value) {
    return mltJNI.Properties_set__SWIG_8(swigCPtr, this, name, mlt_rect.getCPtr(value), value);
  }

  public int set(String name, double x, double y, double w, double h, double opacity) {
    return mltJNI.Properties_set__SWIG_9(swigCPtr, this, name, x, y, w, h, opacity);
  }

  public int set(String name, double x, double y, double w, double h) {
    return mltJNI.Properties_set__SWIG_10(swigCPtr, this, name, x, y, w, h);
  }

  public mlt_rect get_rect(String name) {
    return new mlt_rect(mltJNI.Properties_get_rect(swigCPtr, this, name), true);
  }

  public int anim_set(String name, mlt_rect value, int position, int length, mlt_keyframe_type keyframe_type) {
    return mltJNI.Properties_anim_set__SWIG_11(swigCPtr, this, name, mlt_rect.getCPtr(value), value, position, length, keyframe_type.swigValue());
  }

  public int anim_set(String name, mlt_rect value, int position, int length) {
    return mltJNI.Properties_anim_set__SWIG_12(swigCPtr, this, name, mlt_rect.getCPtr(value), value, position, length);
  }

  public int anim_set(String name, mlt_rect value, int position) {
    return mltJNI.Properties_anim_set__SWIG_13(swigCPtr, this, name, mlt_rect.getCPtr(value), value, position);
  }

  public mlt_rect anim_get_rect(String name, int position, int length) {
    return new mlt_rect(mltJNI.Properties_anim_get_rect__SWIG_0(swigCPtr, this, name, position, length), true);
  }

  public mlt_rect anim_get_rect(String name, int position) {
    return new mlt_rect(mltJNI.Properties_anim_get_rect__SWIG_1(swigCPtr, this, name, position), true);
  }

  public SWIGTYPE_p_mlt_animation_s get_animation(String name) {
    long cPtr = mltJNI.Properties_get_animation(swigCPtr, this, name);
    return (cPtr == 0) ? null : new SWIGTYPE_p_mlt_animation_s(cPtr, false);
  }

  public Animation get_anim(String name) {
    long cPtr = mltJNI.Properties_get_anim(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Animation(cPtr, false);
  }

  public boolean is_anim(String name) {
    return mltJNI.Properties_is_anim(swigCPtr, this, name);
  }

  public int set(String name, Properties properties) {
    return mltJNI.Properties_set__SWIG_11(swigCPtr, this, name, Properties.getCPtr(properties), properties);
  }

  public Properties get_props(String name) {
    long cPtr = mltJNI.Properties_get_props(swigCPtr, this, name);
    return (cPtr == 0) ? null : new Properties(cPtr, false);
  }

  public Properties get_props_at(int index) {
    long cPtr = mltJNI.Properties_get_props_at(swigCPtr, this, index);
    return (cPtr == 0) ? null : new Properties(cPtr, false);
  }

}
