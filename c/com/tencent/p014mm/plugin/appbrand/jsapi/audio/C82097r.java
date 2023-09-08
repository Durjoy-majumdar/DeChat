package com.tencent.p014mm.plugin.appbrand.jsapi.audio;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.r */
public class C82097r implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f240743d;

    /* renamed from: e */
    public final /* synthetic */ JsApiOperateRecorder f240744e;

    public C82097r(JsApiOperateRecorder jsApiOperateRecorder, boolean z) {
        this.f240744e = jsApiOperateRecorder;
        this.f240743d = z;
    }

    public void run() {
        JsApiOperateRecorder.m100744w(this.f240744e, this.f240743d);
    }
}
