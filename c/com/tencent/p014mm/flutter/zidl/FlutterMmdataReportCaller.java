package com.tencent.p014mm.flutter.zidl;

/* renamed from: com.tencent.mm.flutter.zidl.FlutterMmdataReportCaller */
public class FlutterMmdataReportCaller {
    private native void jniIdKeyReport(long j, long j2, long j3);

    private native void jniKvReport(long j, String str);

    public void idKeyReport(long j, long j2, long j3) {
        jniIdKeyReport(j, j2, j3);
    }

    public void kvReport(long j, String str) {
        jniKvReport(j, str);
    }
}
