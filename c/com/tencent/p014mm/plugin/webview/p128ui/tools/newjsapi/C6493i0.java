package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import t83.C13855j;
import ym0.C91515l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.i0 */
public final class C6493i0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23585d;

    /* renamed from: e */
    public final /* synthetic */ float f23586e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6493i0(C13855j jVar, float f) {
        super(0);
        this.f23585d = jVar;
        this.f23586e = f;
    }

    public Object invoke() {
        C91515l.m114821e(this.f23585d.f38998a, this.f23586e);
        Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "setScreenBrightness, brightness:" + this.f23586e);
        return C13598b0.f38549a;
    }
}
