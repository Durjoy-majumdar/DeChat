package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import ym0.C91515l;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.e0 */
public final class C6422e0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f23424d;

    /* renamed from: e */
    public final /* synthetic */ C13855j f23425e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23426f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6422e0(Activity activity, C13855j jVar, C13851h1 h1Var) {
        super(0);
        this.f23424d = activity;
        this.f23425e = jVar;
        this.f23426f = h1Var;
    }

    public Object invoke() {
        float b = C91515l.m114818b(this.f23424d);
        HashMap hashMap = new HashMap();
        hashMap.put("data", Float.valueOf(b));
        C13849g gVar = this.f23425e.f39001d;
        String str = this.f23426f.f38990c;
        gVar.mo10774a(str, this.f23426f.f38996i + ":ok", hashMap);
        Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "getScreenBrightness, currentBrightness=" + b);
        return C13598b0.f38549a;
    }
}
