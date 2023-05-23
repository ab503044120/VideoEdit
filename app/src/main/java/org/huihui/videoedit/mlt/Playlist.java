/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */
package org.huihui.videoedit.mlt;

public class Playlist extends Producer {
  private transient long swigCPtr;

  protected Playlist(long cPtr, boolean cMemoryOwn) {
    super(mltJNI.Playlist_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Playlist obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mltJNI.delete_Playlist(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Playlist() {
    this(mltJNI.new_Playlist__SWIG_0(), true);
  }

  public Playlist(Profile profile) {
    this(mltJNI.new_Playlist__SWIG_1(Profile.getCPtr(profile), profile), true);
  }

  public Playlist(Service playlist) {
    this(mltJNI.new_Playlist__SWIG_2(Service.getCPtr(playlist), playlist), true);
  }

  public Playlist(Playlist playlist) {
    this(mltJNI.new_Playlist__SWIG_3(Playlist.getCPtr(playlist), playlist), true);
  }

  public Playlist(SWIGTYPE_p_mlt_playlist_s playlist) {
    this(mltJNI.new_Playlist__SWIG_4(SWIGTYPE_p_mlt_playlist_s.getCPtr(playlist)), true);
  }

  public SWIGTYPE_p_mlt_playlist_s get_playlist() {
    long cPtr = mltJNI.Playlist_get_playlist(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_mlt_playlist_s(cPtr, false);
  }

  public SWIGTYPE_p_mlt_producer_s get_producer() {
    long cPtr = mltJNI.Playlist_get_producer(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_mlt_producer_s(cPtr, false);
  }

  public int count() {
    return mltJNI.Playlist_count(swigCPtr, this);
  }

  public int clear() {
    return mltJNI.Playlist_clear(swigCPtr, this);
  }

  public int append(Producer producer, int in, int out) {
    return mltJNI.Playlist_append__SWIG_0(swigCPtr, this, Producer.getCPtr(producer), producer, in, out);
  }

  public int append(Producer producer, int in) {
    return mltJNI.Playlist_append__SWIG_1(swigCPtr, this, Producer.getCPtr(producer), producer, in);
  }

  public int append(Producer producer) {
    return mltJNI.Playlist_append__SWIG_2(swigCPtr, this, Producer.getCPtr(producer), producer);
  }

  public int blank(int out) {
    return mltJNI.Playlist_blank__SWIG_0(swigCPtr, this, out);
  }

  public int blank(String length) {
    return mltJNI.Playlist_blank__SWIG_1(swigCPtr, this, length);
  }

  public int clip(mlt_whence whence, int index) {
    return mltJNI.Playlist_clip(swigCPtr, this, whence.swigValue(), index);
  }

  public int current_clip() {
    return mltJNI.Playlist_current_clip(swigCPtr, this);
  }

  public Producer current() {
    long cPtr = mltJNI.Playlist_current(swigCPtr, this);
    return (cPtr == 0) ? null : new Producer(cPtr, true);
  }

  public ClipInfo clip_info(int index, ClipInfo info) {
    long cPtr = mltJNI.Playlist_clip_info__SWIG_0(swigCPtr, this, index, ClipInfo.getCPtr(info), info);
    return (cPtr == 0) ? null : new ClipInfo(cPtr, false);
  }

  public ClipInfo clip_info(int index) {
    long cPtr = mltJNI.Playlist_clip_info__SWIG_1(swigCPtr, this, index);
    return (cPtr == 0) ? null : new ClipInfo(cPtr, true);
  }

  public static void delete_clip_info(ClipInfo info) {
    mltJNI.Playlist_delete_clip_info(ClipInfo.getCPtr(info), info);
  }

  public int insert(Producer producer, int where, int in, int out) {
    return mltJNI.Playlist_insert__SWIG_0(swigCPtr, this, Producer.getCPtr(producer), producer, where, in, out);
  }

  public int insert(Producer producer, int where, int in) {
    return mltJNI.Playlist_insert__SWIG_1(swigCPtr, this, Producer.getCPtr(producer), producer, where, in);
  }

  public int insert(Producer producer, int where) {
    return mltJNI.Playlist_insert__SWIG_2(swigCPtr, this, Producer.getCPtr(producer), producer, where);
  }

  public int remove(int where) {
    return mltJNI.Playlist_remove(swigCPtr, this, where);
  }

  public int move(int from, int to) {
    return mltJNI.Playlist_move(swigCPtr, this, from, to);
  }

  public int reorder(SWIGTYPE_p_int indices) {
    return mltJNI.Playlist_reorder(swigCPtr, this, SWIGTYPE_p_int.getCPtr(indices));
  }

  public int resize_clip(int clip, int in, int out) {
    return mltJNI.Playlist_resize_clip(swigCPtr, this, clip, in, out);
  }

  public int split(int clip, int position) {
    return mltJNI.Playlist_split(swigCPtr, this, clip, position);
  }

  public int split_at(int position, boolean left) {
    return mltJNI.Playlist_split_at__SWIG_0(swigCPtr, this, position, left);
  }

  public int split_at(int position) {
    return mltJNI.Playlist_split_at__SWIG_1(swigCPtr, this, position);
  }

  public int join(int clip, int count, int merge) {
    return mltJNI.Playlist_join__SWIG_0(swigCPtr, this, clip, count, merge);
  }

  public int join(int clip, int count) {
    return mltJNI.Playlist_join__SWIG_1(swigCPtr, this, clip, count);
  }

  public int join(int clip) {
    return mltJNI.Playlist_join__SWIG_2(swigCPtr, this, clip);
  }

  public int mix(int clip, int length, Transition transition) {
    return mltJNI.Playlist_mix__SWIG_0(swigCPtr, this, clip, length, Transition.getCPtr(transition), transition);
  }

  public int mix(int clip, int length) {
    return mltJNI.Playlist_mix__SWIG_1(swigCPtr, this, clip, length);
  }

  public int mix_in(int clip, int length) {
    return mltJNI.Playlist_mix_in(swigCPtr, this, clip, length);
  }

  public int mix_out(int clip, int length) {
    return mltJNI.Playlist_mix_out(swigCPtr, this, clip, length);
  }

  public int mix_add(int clip, Transition transition) {
    return mltJNI.Playlist_mix_add(swigCPtr, this, clip, Transition.getCPtr(transition), transition);
  }

  public int repeat(int clip, int count) {
    return mltJNI.Playlist_repeat(swigCPtr, this, clip, count);
  }

  public Producer get_clip(int clip) {
    long cPtr = mltJNI.Playlist_get_clip(swigCPtr, this, clip);
    return (cPtr == 0) ? null : new Producer(cPtr, true);
  }

  public Producer get_clip_at(int position) {
    long cPtr = mltJNI.Playlist_get_clip_at(swigCPtr, this, position);
    return (cPtr == 0) ? null : new Producer(cPtr, false);
  }

  public int get_clip_index_at(int position) {
    return mltJNI.Playlist_get_clip_index_at(swigCPtr, this, position);
  }

  public boolean is_mix(int clip) {
    return mltJNI.Playlist_is_mix(swigCPtr, this, clip);
  }

  public boolean is_blank(int clip) {
    return mltJNI.Playlist_is_blank(swigCPtr, this, clip);
  }

  public boolean is_blank_at(int position) {
    return mltJNI.Playlist_is_blank_at(swigCPtr, this, position);
  }

  public void consolidate_blanks(int keep_length) {
    mltJNI.Playlist_consolidate_blanks__SWIG_0(swigCPtr, this, keep_length);
  }

  public void consolidate_blanks() {
    mltJNI.Playlist_consolidate_blanks__SWIG_1(swigCPtr, this);
  }

  public Producer replace_with_blank(int clip) {
    long cPtr = mltJNI.Playlist_replace_with_blank(swigCPtr, this, clip);
    return (cPtr == 0) ? null : new Producer(cPtr, false);
  }

  public void insert_blank(int clip, int out) {
    mltJNI.Playlist_insert_blank(swigCPtr, this, clip, out);
  }

  public void pad_blanks(int position, int length, int find) {
    mltJNI.Playlist_pad_blanks__SWIG_0(swigCPtr, this, position, length, find);
  }

  public void pad_blanks(int position, int length) {
    mltJNI.Playlist_pad_blanks__SWIG_1(swigCPtr, this, position, length);
  }

  public int insert_at(int position, Producer producer, int mode) {
    return mltJNI.Playlist_insert_at__SWIG_0(swigCPtr, this, position, Producer.getCPtr(producer), producer, mode);
  }

  public int insert_at(int position, Producer producer) {
    return mltJNI.Playlist_insert_at__SWIG_1(swigCPtr, this, position, Producer.getCPtr(producer), producer);
  }

  public int clip_start(int clip) {
    return mltJNI.Playlist_clip_start(swigCPtr, this, clip);
  }

  public int clip_length(int clip) {
    return mltJNI.Playlist_clip_length(swigCPtr, this, clip);
  }

  public int blanks_from(int clip, int bounded) {
    return mltJNI.Playlist_blanks_from__SWIG_0(swigCPtr, this, clip, bounded);
  }

  public int blanks_from(int clip) {
    return mltJNI.Playlist_blanks_from__SWIG_1(swigCPtr, this, clip);
  }

  public int remove_region(int position, int length) {
    return mltJNI.Playlist_remove_region(swigCPtr, this, position, length);
  }

}