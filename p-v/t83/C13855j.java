package t83;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.core.C5852g;
import com.tencent.p014mm.plugin.webview.stub.C43791l;
import com.tencent.p014mm.plugin.webview.stub.C6107m;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import e00.C45520t;
import e00.C7580y;
import gy3.C87412m;

/* renamed from: t83.j */
public final class C13855j {

    /* renamed from: a */
    public Context f38998a;

    /* renamed from: b */
    public final JsapiPermissionWrapper f38999b;

    /* renamed from: c */
    public final C43791l f39000c;

    /* renamed from: d */
    public final C13849g f39001d;

    /* renamed from: e */
    public final MMWebView f39002e;

    public C13855j(Context context, JsapiPermissionWrapper jsapiPermissionWrapper, C43791l lVar, C13849g gVar, MMWebView mMWebView) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(gVar, "jsApiHandler");
        this.f38998a = context;
        this.f38999b = jsapiPermissionWrapper;
        this.f39001d = gVar;
        this.f39000c = lVar;
        this.f39002e = mMWebView;
    }

    /* renamed from: a */
    public final C13849g mo13181a() {
        return this.f39001d;
    }

    /* renamed from: b */
    public final JsapiPermissionWrapper mo13182b() {
        return this.f38999b;
    }

    /* renamed from: c */
    public final C45520t mo13183c() {
        C45520t u;
        Context context = this.f38998a;
        C5852g gVar = context instanceof C5852g ? (C5852g) context : null;
        if (gVar != null && (u = gVar.mo6897u()) != null) {
            return u;
        }
        C13849g gVar2 = this.f39001d;
        C7580y yVar = gVar2 instanceof C7580y ? (C7580y) gVar2 : null;
        if (yVar != null) {
            return yVar.mo8704u();
        }
        return null;
    }

    /* renamed from: d */
    public final C6107m mo13184d() {
        C6107m Y5;
        Context context = this.f38998a;
        C5852g gVar = context instanceof C5852g ? (C5852g) context : null;
        if (gVar != null && (Y5 = gVar.mo6895Y5()) != null) {
            return Y5;
        }
        C13849g gVar2 = this.f39001d;
        C7580y yVar = gVar2 instanceof C7580y ? (C7580y) gVar2 : null;
        if (yVar != null) {
            return yVar.mo8703i();
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo13185e(int i) {
        JsapiPermissionWrapper jsapiPermissionWrapper = this.f38999b;
        if (jsapiPermissionWrapper != null) {
            return jsapiPermissionWrapper.mo69447f(i);
        }
        return false;
    }
}
