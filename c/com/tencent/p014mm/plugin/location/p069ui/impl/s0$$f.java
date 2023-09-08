package com.tencent.p014mm.plugin.location.p069ui.impl;

import com.tencent.p014mm.plugin.location.model.LocationInfo;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86299o;
import di0.C97479p;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import h81.C32735h;
import kr0.C76630x0;
import te3.C101857vk;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.s0$$f */
public final /* synthetic */ class s0$$f implements C32224a {

    /* renamed from: d */
    public final /* synthetic */ C94167s0 f272031d;

    public /* synthetic */ s0$$f(C94167s0 s0Var) {
        this.f272031d = s0Var;
    }

    public final Object invoke() {
        C94167s0 s0Var = this.f272031d;
        s0Var.getClass();
        Class cls = C76630x0.class;
        boolean z = false;
        if (C86312j.m106911c(cls) != null) {
            C101857vk vkVar = new C101857vk();
            vkVar.f299676e = "wx65cc950f42e8fff1";
            vkVar.f299678g = "腾讯聚合打车";
            vkVar.f299675d = "gh_ad64296dc8bd@app";
            vkVar.f299680i = "modules/aggretakecar/pages/tripdetail/tripdetail.html?from=locationnew";
            C76630x0 x0Var = (C76630x0) C86312j.m106911c(cls);
            C86299o oVar = new C86299o();
            oVar.f250930b = vkVar.f299676e;
            oVar.f250929a = vkVar.f299675d;
            oVar.f250931c = 0;
            oVar.f250932d = vkVar.f299681j;
            oVar.f250934f = vkVar.f299680i;
            oVar.f250939k = 1146;
            C97479p pVar = new C97479p();
            LocationInfo locationInfo = s0Var.f271951g;
            pVar.f286114d = (float) locationInfo.f271930e;
            pVar.f286115e = (float) locationInfo.f271931f;
            pVar.f286119i = C31543z5.m39451a();
            pVar.f286117g = s0Var.f272023p0;
            pVar.f286118h = s0Var.f272024x0;
            pVar.f286116f = s0Var.f271951g.f271935j;
            boolean booleanExtra = s0Var.mo129361n().getBooleanExtra("KIsFromPoiList", false);
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32738b.clicfg_take_car_poi_id, 1) == 1) {
                String str = s0Var.f271951g.f271938p;
                if (!Util.isNullOrNil(str) && booleanExtra) {
                    pVar.f286120j = str;
                }
            }
            Log.m105925i("MicroMsg.TrackMapUI", "openAppBrand,versionType：%s extra data: %s. poiId:%s isFromPoiList:%s", 0, pVar.mo3693a(), s0Var.f271951g.f271938p, Boolean.valueOf(booleanExtra));
            oVar.f250937i = pVar;
            C115669n.INSTANCE.mo160131h(12809, 20, oVar.f250930b, "", s0Var.f271951g.f271938p);
            x0Var.mo106898tv(s0Var.f271948d, oVar);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
