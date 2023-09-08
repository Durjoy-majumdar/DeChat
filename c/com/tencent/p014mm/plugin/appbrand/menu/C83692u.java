package com.tencent.p014mm.plugin.appbrand.menu;

import ai0.C79553f;
import ak0.C79584a;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.HashMap;
import java.util.Map;
import kr0.C88267e;
import lp0.C88619a;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.u */
public final class C83692u extends C88619a<C83928t1> {

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.u$a */
    public static final class C83693a extends C82926s {
        private static final int CTRL_INDEX = 76;
        public static final String NAME = "onShareTimeline";
    }

    public C83692u() {
        super(4);
    }

    /* renamed from: c */
    public static boolean m102735c(C83928t1 t1Var) {
        if (t1Var.mo116155J0(4) == null || t1Var.mo116155J0(4).f244319c) {
            return false;
        }
        return !C79584a.f233382a.mo109700c(t1Var.getRuntime());
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        boolean z;
        C83928t1 t1Var = (C83928t1) d1Var;
        t1Var.getRuntime().mo121254q1();
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        boolean z2 = S1 == null || t1Var.getContext() == null || (S1.f234880U0 & 64) > 0;
        Log.m105925i("MicroMsg.MenuDelegate_ShareToTimeline", "isShow isPermissionDenied:%b", Boolean.valueOf(z2));
        if (!z2) {
            int i = this.f255896a;
            String string = context.getString(C0966R.string.a79);
            if (m102735c(t1Var)) {
                if (!C79584a.f233382a.mo109700c(t1Var.getRuntime())) {
                    Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
                    if (!(context instanceof AppBrandAdUI)) {
                        z = false;
                        e0Var.mo107150j(i, string, C0966R.raw.bottomsheet_icon_moment, 0, z);
                    }
                }
            }
            z = true;
            e0Var.mo107150j(i, string, C0966R.raw.bottomsheet_icon_moment, 0, z);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        Log.m105924i("MicroMsg.MenuDelegate_ShareToTimeline", "performItemClick");
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        C83693a aVar = new C83693a();
        HashMap hashMap = new HashMap();
        String K0 = t1Var.mo116156K0();
        if (Util.isNullOrNil(K0)) {
            K0 = S1.f261061d;
        }
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, K0);
        hashMap.put("path", t1Var.mo116163R0());
        aVar.mo115195q((C88267e) t1Var.getRuntime().f238150p, t1Var.getComponentId());
        aVar.mo115165o(hashMap);
        aVar.mo115158h();
        C84240s.m103840f(str, t1Var.mo116162Q0(), 41, "", Util.nowSecond(), 1, 0);
    }
}
