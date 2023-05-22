package mltJNI;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class mlt_keyframe_type {
  public final static mlt_keyframe_type mlt_keyframe_discrete = new mlt_keyframe_type("mlt_keyframe_discrete", mltJNI.mlt_keyframe_discrete_get());
  public final static mlt_keyframe_type mlt_keyframe_linear = new mlt_keyframe_type("mlt_keyframe_linear");
  public final static mlt_keyframe_type mlt_keyframe_smooth = new mlt_keyframe_type("mlt_keyframe_smooth");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static mlt_keyframe_type swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + mlt_keyframe_type.class + " with value " + swigValue);
  }

  private mlt_keyframe_type(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private mlt_keyframe_type(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private mlt_keyframe_type(String swigName, mlt_keyframe_type swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static mlt_keyframe_type[] swigValues = { mlt_keyframe_discrete, mlt_keyframe_linear, mlt_keyframe_smooth };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

