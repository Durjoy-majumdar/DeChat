package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import iy3.C60641c;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.f0 */
public final class C6428f0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23440d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23441e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6428f0(C13855j jVar, C13851h1 h1Var) {
        super(0);
        this.f23440d = jVar;
        this.f23441e = h1Var;
    }

    public Object invoke() {
        MMWebView mMWebView = this.f23440d.f39002e;
        C87412m.m108591d(mMWebView);
        float mMDensity = mMWebView.getMMDensity();
        if (mMDensity <= 0.0f) {
            Log.m105920e("MicroMsg.JsApiHandleDeviceInfo", "getStatusBarAndActionBarHeight fail, density=" + mMDensity);
            C13849g gVar = this.f23440d.f39001d;
            String str = this.f23441e.f38990c;
            gVar.mo10774a(str, this.f23441e.f38996i + ":fail invalid density", (Map<String, Object>) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("statusBarHeight", Integer.valueOf(C60641c.m70921b(((float) C75044y4.m89994f(this.f23440d.f38998a)) / mMDensity)));
            hashMap.put("actionBarHeight", Integer.valueOf(C60641c.m70921b(((float) C75044y4.m89989a(this.f23440d.f38998a)) / mMDensity)));
            C13849g gVar2 = this.f23440d.f39001d;
            String str2 = this.f23441e.f38990c;
            gVar2.mo10774a(str2, this.f23441e.f38996i + ":ok", hashMap);
        }
        return C13598b0.f38549a;
    }
}
