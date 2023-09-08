package com.tencent.p014mm.plugin.appbrand.menu;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.JsApiGetAdPushMsg;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import java.util.Arrays;
import kr0.C76630x0;
import lp0.C88619a;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.menu.w */
public final class C83695w extends C88619a<C83928t1> {

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.w$a */
    public static final class C83696a {
        public C83696a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.menu.w$b */
    public /* synthetic */ class C83697b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f244314a;

        static {
            int[] iArr = new int[C83700z.values().length];
            iArr[1] = 1;
            f244314a = iArr;
        }
    }

    static {
        new C83696a((C8480h) null);
    }

    public C83695w() {
        super(33);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (r0 != false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r8 = r8.mo113213o1();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo115966a(android.content.Context r7, com.tencent.p014mm.plugin.appbrand.page.C83780d1 r8, nj3.C76874e0 r9, java.lang.String r10) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.page.t1 r8 = (com.tencent.p014mm.plugin.appbrand.page.C83928t1) r8
            java.lang.String r10 = "context"
            gy3.C87412m.m108594g(r7, r10)
            java.lang.String r10 = "pageView"
            gy3.C87412m.m108594g(r8, r10)
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r8 = r8.getRuntime()
            r10 = 0
            r0 = 0
            if (r8 == 0) goto L_0x0023
            com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC r8 = r8.mo113213o1()
            if (r8 == 0) goto L_0x0023
            wi0.a r1 = wi0.C90972a.ShowTradeComplaint
            r2 = 2
            int r8 = wi0.C90972a.m114132b(r1, r8, r0, r2, r10)
            goto L_0x0024
        L_0x0023:
            r8 = 0
        L_0x0024:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getState, controlByte: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.AppBrand.MenuDelegate_TradeComplaint"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 1
            if (r8 != r1) goto L_0x0040
            com.tencent.mm.plugin.appbrand.menu.z r8 = com.tencent.p014mm.plugin.appbrand.menu.C83700z.SHOW_CLICKABLE
            goto L_0x0042
        L_0x0040:
            com.tencent.mm.plugin.appbrand.menu.z r8 = com.tencent.p014mm.plugin.appbrand.menu.C83700z.HIDDEN
        L_0x0042:
            int[] r3 = com.tencent.p014mm.plugin.appbrand.menu.C83695w.C83697b.f244314a
            int r8 = r8.ordinal()
            r8 = r3[r8]
            if (r8 != r1) goto L_0x0102
            com.tencent.mm.plugin.appbrand.menu.d0 r8 = com.tencent.p014mm.plugin.appbrand.menu.C83664d0.f244290a
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            rx3.g r3 = com.tencent.p014mm.plugin.appbrand.menu.C83664d0.f244293d
            r4 = r3
            rx3.n r4 = (rx3.C36570n) r4
            java.lang.Object r4 = r4.getValue()
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            if (r4 == 0) goto L_0x008d
            java.lang.String r4 = r4.optString(r8)
            if (r4 == 0) goto L_0x008d
            int r5 = r4.length()
            if (r5 != 0) goto L_0x006d
            r5 = 1
            goto L_0x006e
        L_0x006d:
            r5 = 0
        L_0x006e:
            if (r5 == 0) goto L_0x0082
            rx3.n r3 = (rx3.C36570n) r3
            java.lang.Object r3 = r3.getValue()
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            if (r3 == 0) goto L_0x0081
            java.lang.String r4 = "en"
            java.lang.String r4 = r3.optString(r4)
            goto L_0x0082
        L_0x0081:
            r4 = r10
        L_0x0082:
            if (r4 == 0) goto L_0x008d
            int r3 = r4.length()
            if (r3 != 0) goto L_0x008b
            r0 = 1
        L_0x008b:
            if (r0 == 0) goto L_0x008e
        L_0x008d:
            r4 = r10
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "complaintWording#get, curLang: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = ", "
            r0.append(r8)
            r0.append(r4)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "MicroMsg.AppBrand.TradeGuaranteeMenuSetting"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            r8 = 2131230993(0x7f080111, float:1.8078054E38)
            if (r4 == 0) goto L_0x00f4
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r0 == 0) goto L_0x00c2
            rx3.g r0 = com.tencent.p014mm.plugin.appbrand.menu.C83664d0.f244297h
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00cc
        L_0x00c2:
            rx3.g r0 = com.tencent.p014mm.plugin.appbrand.menu.C83664d0.f244296g
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
        L_0x00cc:
            java.lang.String r1 = lb0.C88394b.f255384g
            lb0.b r1 = lb0.C88394b.C88418q.f255427a
            android.graphics.Bitmap r10 = r1.mo122791g(r0, r10)
            if (r10 != 0) goto L_0x00e3
            java.lang.String r7 = "attachTo, complaintIcon is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            if (r9 == 0) goto L_0x0102
            int r7 = r6.f255896a
            r9.mo107144g(r7, r4, r8)
            goto L_0x0102
        L_0x00e3:
            if (r9 == 0) goto L_0x0102
            int r8 = r6.f255896a
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r7 = r7.getResources()
            r0.<init>(r7, r10)
            r9.mo107152l(r8, r4, r0)
            goto L_0x0102
        L_0x00f4:
            if (r9 == 0) goto L_0x0102
            int r10 = r6.f255896a
            r0 = 2131821294(0x7f1102ee, float:1.9275327E38)
            java.lang.String r7 = r7.getString(r0)
            r9.mo107144g(r10, r7, r8)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.menu.C83695w.mo115966a(android.content.Context, com.tencent.mm.plugin.appbrand.page.d1, nj3.e0, java.lang.String):void");
    }

    /* renamed from: b */
    public void mo115967b(Context context, C83780d1 d1Var, String str, C83699y yVar) {
        C83928t1 t1Var = (C83928t1) d1Var;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(t1Var, "pageView");
        Log.m105924i("MicroMsg.AppBrand.MenuDelegate_TradeComplaint", "performItemClick");
        C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
        if (x0Var != null) {
            C86299o oVar = new C86299o();
            AppBrandRuntimeWC J1 = t1Var.getRuntime();
            oVar.f250939k = J1 != null && true == J1.mo121254q1() ? 1085 : JsApiGetAdPushMsg.CTRL_INDEX;
            oVar.f250929a = "gh_af04e9bb7e91@app";
            String format = String.format("/complaint/pages/addComplaint/addComplaint.html?guarantee=0&self=1&entry=native&scene=1000&appid=%s", Arrays.copyOf(new Object[]{str}, 1));
            C87412m.m108593f(format, "format(this, *args)");
            oVar.f250934f = format;
            C13598b0 b0Var = C13598b0.f38549a;
            x0Var.mo106898tv(context, oVar);
        }
        C84240s.m103840f(t1Var.getAppId(), t1Var.mo116162Q0(), 51, "", Util.nowSecond(), 1, 0);
    }
}
