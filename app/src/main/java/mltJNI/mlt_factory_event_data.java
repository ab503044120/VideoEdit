/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class mlt_factory_event_data {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected mlt_factory_event_data(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(mlt_factory_event_data obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mltJNI.delete_mlt_factory_event_data(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    mltJNI.mlt_factory_event_data_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return mltJNI.mlt_factory_event_data_name_get(swigCPtr, this);
  }

  public void setInput(SWIGTYPE_p_void value) {
    mltJNI.mlt_factory_event_data_input_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getInput() {
    long cPtr = mltJNI.mlt_factory_event_data_input_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setService(SWIGTYPE_p_void value) {
    mltJNI.mlt_factory_event_data_service_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getService() {
    long cPtr = mltJNI.mlt_factory_event_data_service_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public mlt_factory_event_data() {
    this(mltJNI.new_mlt_factory_event_data(), true);
  }

}
