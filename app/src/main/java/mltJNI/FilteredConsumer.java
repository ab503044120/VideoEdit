package mltJNI;/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class FilteredConsumer extends Consumer {
  private transient long swigCPtr;

  protected FilteredConsumer(long cPtr, boolean cMemoryOwn) {
    super(mltJNI.FilteredConsumer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FilteredConsumer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        mltJNI.delete_FilteredConsumer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FilteredConsumer(Profile profile, String id, String arg) {
    this(mltJNI.new_FilteredConsumer__SWIG_0(Profile.getCPtr(profile), profile, id, arg), true);
  }

  public FilteredConsumer(Profile profile, String id) {
    this(mltJNI.new_FilteredConsumer__SWIG_1(Profile.getCPtr(profile), profile, id), true);
  }

  public FilteredConsumer(Consumer consumer) {
    this(mltJNI.new_FilteredConsumer__SWIG_2(Consumer.getCPtr(consumer), consumer), true);
  }

  public int connect(Service service) {
    return mltJNI.FilteredConsumer_connect(swigCPtr, this, Service.getCPtr(service), service);
  }

  public int attach(Filter filter) {
    return mltJNI.FilteredConsumer_attach(swigCPtr, this, Filter.getCPtr(filter), filter);
  }

  public int last(Filter filter) {
    return mltJNI.FilteredConsumer_last(swigCPtr, this, Filter.getCPtr(filter), filter);
  }

  public int detach(Filter filter) {
    return mltJNI.FilteredConsumer_detach(swigCPtr, this, Filter.getCPtr(filter), filter);
  }

}
