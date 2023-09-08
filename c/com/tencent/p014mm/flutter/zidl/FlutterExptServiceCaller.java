package com.tencent.p014mm.flutter.zidl;

/* renamed from: com.tencent.mm.flutter.zidl.FlutterExptServiceCaller */
public class FlutterExptServiceCaller {
    private native String jniGetExpt(String str);

    public String getExpt(String str) {
        return jniGetExpt(str);
    }
}
