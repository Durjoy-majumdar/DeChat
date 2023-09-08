package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C80910p;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84543i2;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.page.C83977y2;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import jk0.C87978d;
import js0.C88020k;
import org.json.JSONObject;
import p385u2.C111105a;
import s00.C90110f;
import uj0.C90675f;
import xn0.C91304m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.q */
public class C83118q extends C87978d<C83928t1> {
    public static final int CTRL_INDEX = 298;
    public static final String NAME = "insertHTMLWebView";

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(2:3|(1:5))|6|7|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0038 */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m101947J(com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h r3) {
        /*
            com.tencent.mm.plugin.appbrand.page.d1 r0 = r3.getPageView()     // Catch:{ all -> 0x0038 }
            com.tencent.mm.plugin.appbrand.page.e3 r0 = r0.f244558J     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x0038
            android.view.View r1 = r0.getWrapperView()     // Catch:{ all -> 0x0038 }
            r2 = 0
            r1.setFocusable(r2)     // Catch:{ all -> 0x0038 }
            android.view.View r1 = r0.getWrapperView()     // Catch:{ all -> 0x0038 }
            r1.setFocusableInTouchMode(r2)     // Catch:{ all -> 0x0038 }
            android.view.View r1 = r0.getContentView()     // Catch:{ all -> 0x0038 }
            r1.setFocusable(r2)     // Catch:{ all -> 0x0038 }
            android.view.View r1 = r0.getContentView()     // Catch:{ all -> 0x0038 }
            r1.setFocusableInTouchMode(r2)     // Catch:{ all -> 0x0038 }
            android.view.View r1 = r0.getWrapperView()     // Catch:{ all -> 0x0038 }
            boolean r1 = r1 instanceof android.view.ViewGroup     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x0038
            android.view.View r0 = r0.getWrapperView()     // Catch:{ all -> 0x0038 }
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch:{ all -> 0x0038 }
            r1 = 393216(0x60000, float:5.51013E-40)
            r0.setDescendantFocusability(r1)     // Catch:{ all -> 0x0038 }
        L_0x0038:
            com.tencent.mm.ui.widget.MMWebView r0 = r3.getWebView()     // Catch:{ all -> 0x0054 }
            android.view.View r0 = r0.getView()     // Catch:{ all -> 0x0054 }
            r1 = 1
            r0.setFocusable(r1)     // Catch:{ all -> 0x0054 }
            r0.setFocusableInTouchMode(r1)     // Catch:{ all -> 0x0054 }
            r0.setFocusable(r1)     // Catch:{ all -> 0x0054 }
            r0.setFocusableInTouchMode(r1)     // Catch:{ all -> 0x0054 }
            android.view.View r3 = r3.getAndroidView()     // Catch:{ all -> 0x0054 }
            r3.requestFocus()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83118q.m101947J(com.tencent.mm.plugin.appbrand.jsapi.webview.h):void");
    }

    /* renamed from: B */
    public int mo22376B(JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    /* renamed from: E */
    public View mo22377E(C82520h hVar, JSONObject jSONObject) {
        int i;
        C83928t1 t1Var = (C83928t1) hVar;
        if (t1Var.mo116520A1() != null) {
            return null;
        }
        if (!XWebSdk.hasWebViewCoreInited()) {
            ((C90110f) C86312j.m106911c(C90110f.class)).po0(WebView.sDefaultWebViewKind, (WebView.PreInitCallback) null);
        }
        t1Var.mo116275j0(new C83114n(this, t1Var));
        Context context = t1Var.getContext();
        AppBrandRuntimeWC J1 = t1Var.getRuntime();
        int i2 = C91304m.f261898z;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(J1, "rt");
        C91304m mVar = new C91304m(C84543i2.m104128b(context), J1, t1Var, (C8480h) null);
        mVar.setAndroidViewId(C0966R.C0970id.f5956ta);
        try {
            if (jSONObject.has("backgroundColor")) {
                i = C88020k.m109562m(jSONObject.getString("backgroundColor"));
                mVar.setBackgroundColor(i);
                t1Var.f244657w.f241649h.add(new C83116o(this, mVar));
                t1Var.mo114868y(new C83117p(this, mVar));
                return mVar.getAndroidView();
            }
        } catch (Exception unused) {
        }
        i = t1Var instanceof C90675f ? 0 : t1Var.getRuntime().mo113008F().mo113988g() ? C111105a.m151500b(t1Var.getContext(), C0966R.color.f2947a4) : -1;
        mVar.setBackgroundColor(i);
        t1Var.f244657w.f241649h.add(new C83116o(this, mVar));
        t1Var.mo114868y(new C83117p(this, mVar));
        return mVar.getAndroidView();
    }

    /* renamed from: H */
    public void mo22378H(C82520h hVar, int i, View view, JSONObject jSONObject) {
        C83928t1 t1Var = (C83928t1) hVar;
        ((C40478h) view).setCoverViewId(i);
        Log.m105925i("MicroMsg.AppBrand.JsApiInsertHTMLWebView", "onInsertView appId[%s] viewId[%d] viewHash[%d]", t1Var.getAppId(), Integer.valueOf(i), Integer.valueOf(view.hashCode()));
        if (!C44594n1.m49046b()) {
            C80910p.m98789a(WeChatProcess.PROCESS_TOOLS);
        }
        C40478h hVar2 = (C40478h) view;
        m101947J(hVar2);
        if (t1Var instanceof C90675f) {
            hVar2.getController().mo74061u(jSONObject.optString("src"));
        }
        t1Var.mo116272g0(new C83977y2(t1Var, hVar2));
    }
}
