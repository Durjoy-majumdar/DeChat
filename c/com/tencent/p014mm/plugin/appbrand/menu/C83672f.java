package com.tencent.p014mm.plugin.appbrand.menu;

import ai0.C79553f;
import android.content.Context;
import com.tencent.p014mm.C0966R;
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
import lp0.C88619a;
import nj3.C76874e0;
import xn0.C91304m;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.f */
public class C83672f extends C88619a<C83928t1> {

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.f$a */
    public static final class C83673a extends C82926s {
        private static final int CTRL_INDEX = 799;
        public static final String NAME = "onAddToFavorites";
    }

    public C83672f() {
        super(28);
    }

    /* renamed from: a */
    public void mo115966a(Context context, C83780d1 d1Var, C76874e0 e0Var, String str) {
        C83928t1 t1Var = (C83928t1) d1Var;
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        if (context instanceof AppBrandAdUI) {
            Log.m105924i("MicroMsg.MenuDelegate_Fav", "AppBrandAdUI not support favorite");
        } else if (t1Var.getRuntime().mo113210l1().f239373d1) {
            Log.m105924i("MicroMsg.MenuDelegate_Fav", "isPluginApp not support");
        } else {
            e0Var.mo107150j(this.f255896a, context.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0, t1Var.mo116155J0(28).f244319c);
        }
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        String K0 = t1Var.mo116156K0();
        if (Util.isNullOrNil(K0)) {
            K0 = t1Var.getRuntime().mo113210l1().f239363e;
        }
        C91304m I1 = t1Var.mo116520A1();
        String url = I1 == null ? "" : I1.getWebView().getUrl();
        C83673a aVar = new C83673a();
        HashMap hashMap = new HashMap();
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_TITLE, K0);
        hashMap.put("path", t1Var.mo116163R0());
        hashMap.put("webViewUrl", url);
        aVar.mo115165o(hashMap);
        t1Var.mo109669n(aVar, (int[]) null);
        C84240s.m103840f(str, t1Var.mo116162Q0(), 4, "", Util.nowSecond(), 1, 0);
    }
}
