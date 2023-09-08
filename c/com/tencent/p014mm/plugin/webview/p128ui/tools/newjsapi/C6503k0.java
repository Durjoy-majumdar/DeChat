package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import ca3.C0442a;
import com.google.android.gms.common.internal.Constants;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.webview.p128ui.tools.WebViewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import lg3.C88494d;
import o40.C61926c;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import tm0.C14016b0;
import tm0.C14039u;
import tm0.C90548o;
import w83.C15053a;
import xk0.C91263b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.k0 */
public final class C6503k0 extends C15053a {

    /* renamed from: d */
    public static final C6503k0 f23616d = new C6503k0();

    /* renamed from: e */
    public static final int f23617e = C91263b.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23618f = "handleDeviceInfo";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        String str = (String) h1Var2.f38983a.get("action");
        int i = 0;
        Log.m105925i("MicroMsg.JsApiHandleDeviceInfo", "handleDeviceInfo action=%s", str);
        if (Util.isNullOrNil(str)) {
            C13849g gVar = jVar2.f39001d;
            String str2 = h1Var2.f38990c;
            gVar.mo10774a(str2, h1Var2.f38996i + ":fail action is empty", (Map<String, Object>) null);
            return true;
        } else if (C87412m.m108589b("enableSwipeBackGesture", str)) {
            Context context = jVar2.f38998a;
            WebViewUI webViewUI = context instanceof WebViewUI ? (WebViewUI) context : null;
            if (webViewUI != null) {
                boolean z = Util.getBoolean((String) h1Var2.f38983a.get("enable"), true);
                Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "enableSwipeBackGesture " + z);
                webViewUI.getSwipeBackLayout().setEnableGesture(z);
            }
            C13849g gVar2 = jVar2.f39001d;
            String str3 = h1Var2.f38990c;
            gVar2.mo10774a(str3, h1Var2.f38996i + ":ok", (Map<String, Object>) null);
            return true;
        } else if (C87412m.m108589b("enableFullScreen", str)) {
            boolean z2 = Util.getBoolean((String) h1Var2.f38983a.get("enable"), false);
            Context context2 = jVar2.f38998a;
            if (context2 instanceof C0442a) {
                if (z2) {
                    int i2 = Util.getInt((String) h1Var2.f38983a.get("orientation"), 0);
                    if (i2 == -90) {
                        i = -90;
                    } else if (i2 == 90) {
                        i = 90;
                    }
                    Context context3 = jVar2.f38998a;
                    C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUIFullScreen");
                    ((C0442a) context3).mo484w4((View) null, i);
                } else {
                    C87412m.m108592e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUIFullScreen");
                    ((C0442a) context2).mo483t0();
                }
            }
            C13849g gVar3 = jVar2.f39001d;
            String str4 = h1Var2.f38990c;
            gVar3.mo10774a(str4, h1Var2.f38996i + ":ok", (Map<String, Object>) null);
            return true;
        } else if (C87412m.m108589b("setOrientation", str)) {
            int i3 = Util.getInt((String) h1Var2.f38983a.get("orientation"), 0);
            boolean z3 = Util.getBoolean((String) h1Var2.f38983a.get("lock"), true);
            Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "setOrientation orientation=" + i3 + ", lock=" + z3);
            Context context4 = jVar2.f38998a;
            if (context4 instanceof C0442a) {
                if (z3) {
                    Activity activity = context4 instanceof Activity ? (Activity) context4 : null;
                    if (activity != null) {
                        if (i3 == -90) {
                            activity.setRequestedOrientation(8);
                        } else if (i3 != 90) {
                            activity.setRequestedOrientation(1);
                        } else {
                            activity.setRequestedOrientation(0);
                        }
                    }
                } else {
                    Activity activity2 = context4 instanceof Activity ? (Activity) context4 : null;
                    if (activity2 != null) {
                        activity2.setRequestedOrientation(-1);
                    }
                }
            }
            C13849g gVar4 = jVar2.f39001d;
            String str5 = h1Var2.f38990c;
            gVar4.mo10774a(str5, h1Var2.f38996i + ":ok", (Map<String, Object>) null);
            return true;
        } else {
            float f = 0.0f;
            if (C87412m.m108589b(C14016b0.NAME, str)) {
                Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", C14016b0.NAME);
                float f2 = (float) Util.getDouble((String) h1Var2.f38983a.get("data"), 0.0d);
                if (f2 < 0.0f || f2 > 1.0f) {
                    return false;
                }
                Context context5 = jVar2.f38998a;
                Activity activity3 = context5 instanceof Activity ? (Activity) context5 : null;
                if (activity3 != null) {
                    C61926c.m72668M(new C6498j0(activity3, f2, jVar2, h1Var2));
                    return true;
                }
                C13849g gVar5 = jVar2.f39001d;
                String str6 = h1Var2.f38990c;
                gVar5.mo10774a(str6, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
                return true;
            } else if (C87412m.m108589b(C14039u.NAME, str)) {
                Context context6 = jVar2.f38998a;
                Activity activity4 = context6 instanceof Activity ? (Activity) context6 : null;
                if (activity4 != null) {
                    C61926c.m72668M(new C6437g0(activity4, jVar2, h1Var2));
                    return true;
                }
                C13849g gVar6 = jVar2.f39001d;
                String str7 = h1Var2.f38990c;
                gVar6.mo10774a(str7, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
                return false;
            } else if (C87412m.m108589b("setScreenBrightness", str)) {
                Log.m105924i("MicroMsg.JsApiHandleDeviceInfo", "setScreenBrightness");
                float f3 = (float) Util.getDouble((String) h1Var2.f38983a.get("data"), 0.0d);
                if (f3 < 0.0f || f3 > 1.0f) {
                    return false;
                }
                Context context7 = jVar2.f38998a;
                if ((context7 instanceof Activity ? (Activity) context7 : null) != null) {
                    C61926c.m72668M(new C6493i0(jVar2, f3));
                    C13849g gVar7 = jVar2.f39001d;
                    String str8 = h1Var2.f38990c;
                    gVar7.mo10774a(str8, h1Var2.f38996i + ":ok", (Map<String, Object>) null);
                    return true;
                }
                C13849g gVar8 = jVar2.f39001d;
                String str9 = h1Var2.f38990c;
                gVar8.mo10774a(str9, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
                return true;
            } else if (C87412m.m108589b(C90548o.NAME, str)) {
                Context context8 = jVar2.f38998a;
                Activity activity5 = context8 instanceof Activity ? (Activity) context8 : null;
                if (activity5 != null) {
                    C61926c.m72668M(new C6422e0(activity5, jVar2, h1Var2));
                    return true;
                }
                C13849g gVar9 = jVar2.f39001d;
                String str10 = h1Var2.f38990c;
                gVar9.mo10774a(str10, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
                return false;
            } else if (C87412m.m108589b("getSafeAreaInsets", str)) {
                Context context9 = jVar2.f38998a;
                Activity activity6 = context9 instanceof Activity ? (Activity) context9 : null;
                if (activity6 != null) {
                    C61926c.m72668M(new C6418d0(activity6, jVar2, h1Var2));
                    return true;
                }
                C13849g gVar10 = jVar2.f39001d;
                String str11 = h1Var2.f38990c;
                gVar10.mo10774a(str11, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
                return false;
            } else if (C87412m.m108589b("getStatusBarAndActionBarHeight", str)) {
                C61926c.m72668M(new C6428f0(jVar2, h1Var2));
                return true;
            } else if (C87412m.m108589b("hideKeyBoard", str)) {
                Context context10 = jVar2.f38998a;
                WebViewUI webViewUI2 = context10 instanceof WebViewUI ? (WebViewUI) context10 : null;
                if (webViewUI2 != null) {
                    C61926c.m72668M(new C6487h0(webViewUI2, jVar2, h1Var2));
                    return true;
                }
                C13849g gVar11 = jVar2.f39001d;
                String str12 = h1Var2.f38990c;
                gVar11.mo10774a(str12, h1Var2.f38996i + ":fail", (Map<String, Object>) null);
                return false;
            } else {
                if (C87412m.m108589b("getSystemScale", str)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("systemScale", Float.valueOf(C88494d.f255615g));
                    MMWebView mMWebView = jVar2.f39002e;
                    if (mMWebView != null) {
                        f = mMWebView.getMMDensity();
                    }
                    hashMap.put(Constants.PARAM_DENSITY, Float.valueOf(f));
                    C13849g gVar12 = jVar2.f39001d;
                    String str13 = h1Var2.f38990c;
                    gVar12.mo10774a(str13, h1Var2.f38996i + ":ok", hashMap);
                }
                return false;
            }
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23617e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23618f;
    }
}
