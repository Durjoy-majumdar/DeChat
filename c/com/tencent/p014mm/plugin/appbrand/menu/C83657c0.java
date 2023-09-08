package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessSharedPreferences;
import java.util.HashMap;
import kr0.C88267e;
import nj3.C76879j;
import xn0.C91304m;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.c0 */
public class C83657c0 {

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.c0$a */
    public class C83658a implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f244280d;

        /* renamed from: e */
        public final /* synthetic */ C83928t1 f244281e;

        /* renamed from: f */
        public final /* synthetic */ C83699y f244282f;

        public C83658a(Runnable runnable, C83928t1 t1Var, C83699y yVar) {
            this.f244280d = runnable;
            this.f244281e = t1Var;
            this.f244282f = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Runnable runnable = this.f244280d;
            if (runnable != null) {
                runnable.run();
            }
            C83657c0.m102698a(this.f244281e, this.f244282f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.c0$b */
    public class C83659b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f244283d;

        /* renamed from: e */
        public final /* synthetic */ C83928t1 f244284e;

        /* renamed from: f */
        public final /* synthetic */ C83699y f244285f;

        public C83659b(Runnable runnable, C83928t1 t1Var, C83699y yVar) {
            this.f244283d = runnable;
            this.f244284e = t1Var;
            this.f244285f = yVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Runnable runnable = this.f244283d;
            if (runnable != null) {
                runnable.run();
            }
            C83657c0.m102698a(this.f244284e, this.f244285f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.c0$c */
    public static final class C83660c extends C82926s {
        private static final int CTRL_INDEX = 75;
        public static final String NAME = "onShareAppMessage";
    }

    /* renamed from: a */
    public static void m102698a(C83928t1 t1Var, C83699y yVar) {
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        C83660c cVar = new C83660c();
        HashMap hashMap = new HashMap();
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, S1.f261061d);
        hashMap.put("desc", "");
        hashMap.put("path", t1Var.mo116163R0());
        C91304m I1 = t1Var.mo116520A1();
        hashMap.put("webViewUrl", I1 != null ? I1.getWebView().getUrl() : null);
        hashMap.put("imgUrl", S1.f261063f);
        hashMap.put("mode", WxaMenuHelper.m102687c(yVar, "enable_share_with_share_ticket", false) ? "withShareTicket" : "common");
        hashMap.put("dynamic", Boolean.valueOf(WxaMenuHelper.m102687c(yVar, "enable_share_dynamic", false)));
        hashMap.put(FirebaseAnalytics.C113379b.ORIGIN, "weixin");
        if (yVar != null) {
            yVar.f244320d.mo120963j("user_clicked_share_btn", true);
        } else {
            Log.m105928w("MicroMsg.AppBrand.WxaMenuHelper", "safeSetBoolean, menuInfo is null, key: user_clicked_share_btn");
        }
        cVar.mo115195q((C88267e) t1Var.getRuntime().f238150p, t1Var.getComponentId());
        cVar.mo115165o(hashMap);
        cVar.mo115158h();
    }

    /* renamed from: b */
    public static void m102699b(Context context, C83928t1 t1Var, C83699y yVar, Runnable runnable) {
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        SharedPreferences sharedPreferences = MultiProcessSharedPreferences.getSharedPreferences(context, "pref_appbrand_" + t1Var.getRuntime().mo113210l1().f234818T, 4);
        if (S1.f261072r.f238585d == 1 && !sharedPreferences.contains("has_share_dev_tips")) {
            sharedPreferences.edit().putLong("has_share_dev_tips", System.currentTimeMillis()).commit();
            C76879j.m92744o(context, C0966R.string.f7693o7, C0966R.string.a3h, false, new C83658a(runnable, t1Var, yVar));
        } else if (S1.f261072r.f238585d != 2 || sharedPreferences.contains("has_share_beta_tips")) {
            if (runnable != null) {
                runnable.run();
            }
            m102698a(t1Var, yVar);
        } else {
            sharedPreferences.edit().putLong("has_share_beta_tips", System.currentTimeMillis()).commit();
            C76879j.m92744o(context, C0966R.string.f7692o6, C0966R.string.a3h, false, new C83659b(runnable, t1Var, yVar));
        }
    }
}
