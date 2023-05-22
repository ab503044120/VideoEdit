package mltJNI;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class mlt_image_format {
  public final static mlt_image_format mlt_image_none = new mlt_image_format("mlt_image_none", mltJNI.mlt_image_none_get());
  public final static mlt_image_format mlt_image_rgb = new mlt_image_format("mlt_image_rgb");
  public final static mlt_image_format mlt_image_rgba = new mlt_image_format("mlt_image_rgba");
  public final static mlt_image_format mlt_image_yuv422 = new mlt_image_format("mlt_image_yuv422");
  public final static mlt_image_format mlt_image_yuv420p = new mlt_image_format("mlt_image_yuv420p");
  public final static mlt_image_format mlt_image_movit = new mlt_image_format("mlt_image_movit");
  public final static mlt_image_format mlt_image_opengl_texture = new mlt_image_format("mlt_image_opengl_texture");
  public final static mlt_image_format mlt_image_yuv422p16 = new mlt_image_format("mlt_image_yuv422p16");
  public final static mlt_image_format mlt_image_yuv420p10 = new mlt_image_format("mlt_image_yuv420p10");
  public final static mlt_image_format mlt_image_yuv444p10 = new mlt_image_format("mlt_image_yuv444p10");
  public final static mlt_image_format mlt_image_invalid = new mlt_image_format("mlt_image_invalid");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static mlt_image_format swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + mlt_image_format.class + " with value " + swigValue);
  }

  private mlt_image_format(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private mlt_image_format(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private mlt_image_format(String swigName, mlt_image_format swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static mlt_image_format[] swigValues = { mlt_image_none, mlt_image_rgb, mlt_image_rgba, mlt_image_yuv422, mlt_image_yuv420p, mlt_image_movit, mlt_image_opengl_texture, mlt_image_yuv422p16, mlt_image_yuv420p10, mlt_image_yuv444p10, mlt_image_invalid };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

