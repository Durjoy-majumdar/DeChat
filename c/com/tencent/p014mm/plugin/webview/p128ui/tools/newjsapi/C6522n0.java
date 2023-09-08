package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import c00.C0408t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.n0 */
public final class C6522n0 extends C15053a {

    /* renamed from: d */
    public static final C6522n0 f23670d = new C6522n0();

    /* renamed from: e */
    public static final boolean f23671e = true;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        Activity activity;
        String string;
        C13855j jVar2 = jVar;
        C13851h1 h1Var2 = h1Var;
        Class cls = C0408t.class;
        C87412m.m108594g(jVar2, "env");
        C87412m.m108594g(h1Var2, "msg");
        String str = (String) h1Var2.f38983a.get("action");
        Log.m105925i("MicroMsg.JsApiHandleHaoKanAction", "JsApiHandleHaoKanAction action=%s", str);
        C13598b0 b0Var = null;
        if (str == null || str.length() == 0) {
            C13849g gVar = jVar2.f39001d;
            String str2 = h1Var2.f38990c;
            gVar.mo10774a(str2, h1Var2.f38996i + ":fail action is empty", (Map<String, Object>) null);
            return true;
        } else if (C87412m.m108589b(str, "checkSyncHaoKanPermission")) {
            if (!MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("tophitory_show_init_dialog", false)) {
                WeakReference<Activity> g = AppForegroundDelegate.m161224g();
                if (!(g == null || (activity = g.get()) == null)) {
                    String string2 = activity.getString(C0966R.string.m0b);
                    C87412m.m108593f(string2, "activity.getString(com.t…haokan_education_publish)");
                    try {
                        Object obj = h1Var2.f38983a.get("haoKanScene");
                        if (C87412m.m108589b("1", obj)) {
                            string = activity.getString(C0966R.string.m0b);
                            C87412m.m108593f(string, "activity.getString(com.t…haokan_education_publish)");
                        } else if (C87412m.m108589b("2", obj)) {
                            string = activity.getString(C0966R.string.m2i);
                            C87412m.m108593f(string, "activity.getString(com.t…k_haokan_education_ontop)");
                        } else {
                            if (C87412m.m108589b("3", obj)) {
                                string = activity.getString(C0966R.string.m2j);
                                C87412m.m108593f(string, "activity.getString(com.t…_haokan_education_upload)");
                            }
                            Log.m105925i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction, type = %s, tips = %s", obj, string2);
                            ((C0408t) C86312j.m106911c(cls)).mo450FR(activity, new C6516m0(jVar2, h1Var2), string2);
                            b0Var = C13598b0.f38549a;
                        }
                        string2 = string;
                        Log.m105925i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction, type = %s, tips = %s", obj, string2);
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.JsApiHandleHaoKanAction", "checkHaoKanPermission, e = %s", e);
                    }
                    ((C0408t) C86312j.m106911c(cls)).mo450FR(activity, new C6516m0(jVar2, h1Var2), string2);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var != null) {
                    return true;
                }
                Log.m105924i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncHanKanPermissionAction activity is null");
                HashMap hashMap = new HashMap();
                hashMap.put("result", 0);
                hashMap.put("dialogShowed", 0);
                C13849g gVar2 = jVar2.f39001d;
                String str3 = h1Var2.f38990c;
                gVar2.mo10774a(str3, h1Var2.f38996i + ":ok", hashMap);
                return true;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("result", 1);
            hashMap2.put("dialogShowed", 0);
            C13849g gVar3 = jVar2.f39001d;
            String str4 = h1Var2.f38990c;
            gVar3.mo10774a(str4, h1Var2.f38996i + ":ok", hashMap2);
            return true;
        } else if (!C87412m.m108589b(str, "checkSyncCommentPermission")) {
            return false;
        } else {
            if (!MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("tophitory_show_comment_dialog", false)) {
                WeakReference<Activity> g2 = AppForegroundDelegate.m161224g();
                C87412m.m108593f(g2, "getTopActivity()");
                if (g2.get() != null) {
                    Activity activity2 = g2.get();
                    C87412m.m108591d(activity2);
                    ((C0408t) C86312j.m106911c(cls)).y80(activity2, new C6508l0(jVar2, h1Var2), true);
                    return true;
                }
                Log.m105924i("MicroMsg.JsApiHandleHaoKanAction", "handleCheckSyncCommentPermission activity is null");
                HashMap hashMap3 = new HashMap();
                hashMap3.put("result", 0);
                hashMap3.put("dialogShowed", 0);
                C13849g gVar4 = jVar2.f39001d;
                String str5 = h1Var2.f38990c;
                gVar4.mo10774a(str5, h1Var2.f38996i + ":ok", hashMap3);
                return true;
            }
            HashMap hashMap4 = new HashMap();
            hashMap4.put("result", 1);
            hashMap4.put("dialogShowed", 0);
            C13849g gVar5 = jVar2.f39001d;
            String str6 = h1Var2.f38990c;
            gVar5.mo10774a(str6, h1Var2.f38996i + ":ok", hashMap4);
            return true;
        }
    }

    /* renamed from: b */
    public int mo7287b() {
        return 335;
    }

    /* renamed from: c */
    public String mo7288c() {
        return "handleHaokanAction";
    }

    /* renamed from: d */
    public boolean mo7507d() {
        return f23671e;
    }
}
