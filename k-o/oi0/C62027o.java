package oi0;

import com.tencent.p014mm.plugin.appbrand.report.AppBrandRecommendStatObj;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49445fm3;
import te3.C64345em3;
import te3.C64369fo3;
import te3.C64416ha3;
import te3.C64544m5;
import te3.C64560mo3;
import te3.C64716sw;

/* renamed from: oi0.o */
public class C62027o extends C89132b<C49445fm3> {
    public C62027o(int i, long j, long j2, AppBrandRecommendStatObj appBrandRecommendStatObj) {
        mo123453j(m72773k(i, j, j2, appBrandRecommendStatObj).mo72403a());
    }

    /* renamed from: k */
    public static C47350c.C47352b m72773k(int i, long j, long j2, AppBrandRecommendStatObj appBrandRecommendStatObj) {
        Log.m105925i("MicroMsg.Recommend.CgiRTReportRecommdClick", "clickType:%d, page_stay_time:%d, app_stay_time:%d, recommendStatObj:%s", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), appBrandRecommendStatObj.toString());
        C47350c.C47352b bVar = new C47350c.C47352b();
        C64345em3 em32 = new C64345em3();
        C64560mo3 mo32 = new C64560mo3();
        C64369fo3 fo32 = new C64369fo3();
        mo32.f184365d = appBrandRecommendStatObj.f158169r;
        C64716sw swVar = new C64716sw();
        swVar.f185450d = NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
        swVar.f185451e = (double) appBrandRecommendStatObj.f158167p;
        swVar.f185452f = (double) appBrandRecommendStatObj.f158168q;
        em32.f183006d = mo32;
        em32.f183007e = fo32;
        fo32.f183153d = i;
        if (i == 1) {
            C64416ha3 ha32 = new C64416ha3();
            ha32.f183446d = appBrandRecommendStatObj.f158158d;
            ha32.f183447e = appBrandRecommendStatObj.f158159e;
            ha32.f183448f = "" + System.currentTimeMillis();
            ha32.f183449g = appBrandRecommendStatObj.f158160f;
            ha32.f183450h = appBrandRecommendStatObj.f158161g;
            ha32.f183451i = appBrandRecommendStatObj.f158165n;
            ha32.f183452j = appBrandRecommendStatObj.f158166o;
            ha32.f183453n = (int) j;
            ha32.f183454o = (int) j2;
            fo32.f183154e = ha32;
        } else {
            C64544m5 m5Var = new C64544m5();
            m5Var.f184202d = appBrandRecommendStatObj.f158158d;
            m5Var.f184203e = "" + System.currentTimeMillis();
            m5Var.f184204f = appBrandRecommendStatObj.f158160f;
            m5Var.f184205g = appBrandRecommendStatObj.f158161g;
            m5Var.f184206h = appBrandRecommendStatObj.f158165n;
            m5Var.f184207i = appBrandRecommendStatObj.f158166o;
            m5Var.f184208j = (int) j2;
            fo32.f183155f = m5Var;
        }
        bVar.f127066a = em32;
        bVar.f127067b = new C49445fm3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxabusiness/rtreportrecommdclick";
        bVar.f127069d = 2799;
        return bVar;
    }
}
