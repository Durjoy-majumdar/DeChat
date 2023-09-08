package com.tencent.p014mm.flutter.zidl;

/* renamed from: com.tencent.mm.flutter.zidl.ZidlFoundationApiManagerCaller */
public class ZidlFoundationApiManagerCaller {
    private static ZidlFoundationApiManagerCaller instance = new ZidlFoundationApiManagerCaller();

    public ZidlFoundationApiManagerCaller() {
        jniCreateZidlFoundationApiManager();
    }

    public static ZidlFoundationApiManagerCaller getInstance() {
        return instance;
    }

    private native void jniCreateZidlFoundationApiManager();

    private native Object jniGetPropFlutterCgiService();

    private native Object jniGetPropFlutterExptService();

    private native Object jniGetPropFlutterMmdataReport();

    private native void jniSetPropFlutterCgiService(Object obj);

    private native void jniSetPropFlutterExptService(Object obj);

    private native void jniSetPropFlutterMmdataReport(Object obj);

    public <T> T getPropFlutterCgiService() {
        return jniGetPropFlutterCgiService();
    }

    public <T> T getPropFlutterExptService() {
        return jniGetPropFlutterExptService();
    }

    public <T> T getPropFlutterMmdataReport() {
        return jniGetPropFlutterMmdataReport();
    }

    public void setPropFlutterCgiService(Object obj) {
        jniSetPropFlutterCgiService(obj);
    }

    public void setPropFlutterExptService(Object obj) {
        jniSetPropFlutterExptService(obj);
    }

    public void setPropFlutterMmdataReport(Object obj) {
        jniSetPropFlutterMmdataReport(obj);
    }
}
