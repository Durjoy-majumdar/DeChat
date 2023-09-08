package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.p014mm.plugin.appbrand.C83231l;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.report.model.AdReportCgiHelper;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.p */
public final class C82816p {

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.p$a */
    public class C82817a extends C83231l.C83234d {

        /* renamed from: d */
        public final /* synthetic */ String f242205d;

        /* renamed from: e */
        public final /* synthetic */ String f242206e;

        /* renamed from: f */
        public final /* synthetic */ String f242207f;

        /* renamed from: g */
        public final /* synthetic */ long f242208g;

        /* renamed from: h */
        public final /* synthetic */ AppBrandStatObject f242209h;

        public C82817a(String str, String str2, String str3, long j, AppBrandStatObject appBrandStatObject) {
            this.f242205d = str;
            this.f242206e = str2;
            this.f242207f = str3;
            this.f242208g = j;
            this.f242209h = appBrandStatObject;
        }

        /* renamed from: c */
        public void mo109497c() {
            mo115051g(C83231l.m102143d(this.f242205d), this.f242205d, this.f242206e, this.f242207f);
        }

        /* renamed from: e */
        public void mo74049e(C83231l.C83235e eVar) {
            mo115051g(eVar, this.f242205d, this.f242206e, this.f242207f);
        }

        /* renamed from: g */
        public final void mo115051g(C83231l.C83235e eVar, String str, String str2, String str3) {
            long nowMilliSecond = Util.nowMilliSecond() - this.f242208g;
            int ordinal = eVar.ordinal();
            C82816p.m101562b((ordinal == 0 || ordinal == 1) ? 1 : ordinal != 4 ? ordinal != 7 ? 0 : 3 : 2, str, str2, str3, nowMilliSecond);
            this.f242209h.f245537j = null;
            C83231l.m102144e(str, this);
        }
    }

    /* renamed from: a */
    public static void m101561a(String str, String str2, AppBrandStatObject appBrandStatObject) {
        if (appBrandStatObject != null) {
            String str3 = appBrandStatObject.f245537j;
            if (!Util.isNullOrNil(str3)) {
                C83231l.m102140a(str, new C82817a(str, str2, str3, System.currentTimeMillis(), appBrandStatObject));
            }
        }
    }

    /* renamed from: b */
    public static void m101562b(int i, String str, String str2, String str3, long j) {
        int i2;
        long nowMilliSecond = Util.nowMilliSecond();
        ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
        String formattedWiFiSsid = companion.getFormattedWiFiSsid();
        String formattedWiFiBssid = companion.getFormattedWiFiBssid();
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(",");
        sb.append(str2);
        sb.append(",");
        sb.append(str);
        sb.append(",");
        sb.append(nowMilliSecond);
        sb.append(",");
        sb.append(j);
        sb.append(",");
        sb.append(i);
        sb.append(",");
        switch (NetStatusUtil.getNetType(MMApplicationContext.getContext())) {
            case -1:
                i2 = 255;
                break;
            case 0:
                i2 = 1;
                break;
            case 1:
            case 6:
            case 8:
                i2 = 3;
                break;
            case 2:
            case 5:
            case 7:
                i2 = 2;
                break;
            case 3:
            case 4:
                i2 = 4;
                break;
            case 10:
                i2 = 5;
                break;
            default:
                i2 = 6;
                break;
        }
        sb.append(i2);
        sb.append(",");
        sb.append(formattedWiFiSsid);
        sb.append(",");
        sb.append(formattedWiFiBssid);
        sb.append(",,");
        String sb4 = sb.toString();
        Log.m105927v("MicroMsg.MiniProgramNavigatorAdReportHelper", "closeType:%d stayTime:%d", Integer.valueOf(i), Long.valueOf(j));
        AdReportCgiHelper.m1949a(16004, sb4, (AdReportCgiHelper.C1964b) null);
    }

    /* renamed from: c */
    public static void m101563c(String str, String str2, AppBrandStatObject appBrandStatObject) {
        if (appBrandStatObject != null && !Util.isNullOrNil(appBrandStatObject.f245537j)) {
            m101562b(4, str, str2, appBrandStatObject.f245537j, 0);
        }
    }
}
