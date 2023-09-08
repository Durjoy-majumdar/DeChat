package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.graphics.Rect;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.d0 */
public final class C6418d0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Activity f23408d;

    /* renamed from: e */
    public final /* synthetic */ C13855j f23409e;

    /* renamed from: f */
    public final /* synthetic */ C13851h1 f23410f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6418d0(Activity activity, C13855j jVar, C13851h1 h1Var) {
        super(0);
        this.f23408d = activity;
        this.f23409e = jVar;
        this.f23410f = h1Var;
    }

    public Object invoke() {
        Rect m = C85875k4.m106194m(this.f23408d);
        MMWebView mMWebView = this.f23409e.f39002e;
        C87412m.m108591d(mMWebView);
        float mMDensity = mMWebView.getMMDensity();
        if (m == null || mMDensity <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("getSafeAreaInsets fail, rect is null");
            sb.append(m == null);
            sb.append(", density=");
            sb.append(mMDensity);
            Log.m105920e("MicroMsg.JsApiHandleDeviceInfo", sb.toString());
            C13849g gVar = this.f23409e.f39001d;
            String str = this.f23410f.f38990c;
            gVar.mo10774a(str, this.f23410f.f38996i + ":fail invalid params", (Map<String, Object>) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("left", Float.valueOf(((float) m.left) / mMDensity));
            hashMap.put("top", Float.valueOf(((float) m.top) / mMDensity));
            hashMap.put("right", Float.valueOf(((float) m.right) / mMDensity));
            hashMap.put("bottom", Float.valueOf(((float) m.bottom) / mMDensity));
            C13849g gVar2 = this.f23409e.f39001d;
            String str2 = this.f23410f.f38990c;
            gVar2.mo10774a(str2, this.f23410f.f38996i + ":ok", hashMap);
            Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "getSafeAreaInsets, rect=" + m.toShortString());
        }
        return C13598b0.f38549a;
    }
}
