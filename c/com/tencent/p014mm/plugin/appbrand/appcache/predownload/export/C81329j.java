package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29211f;
import com.tencent.p014mm.plugin.appbrand.launching.C29567d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kr0.C33983a1;
import lp3.C46888b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import te3.C50446mt;
import te3.q45;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.j */
public final class C81329j implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C33983a1.C33984a f238785d;

    /* renamed from: e */
    public final /* synthetic */ C46888b f238786e;

    /* renamed from: f */
    public final /* synthetic */ String f238787f;

    /* renamed from: g */
    public final /* synthetic */ int f238788g;

    public C81329j(C33983a1.C33984a aVar, C46888b bVar, String str, int i) {
        this.f238785d = aVar;
        this.f238786e = bVar;
        this.f238787f = str;
        this.f238788g = i;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        q45 q45;
        q45 q452;
        q45 q453;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Class cls = C29211f.class;
        C47465a aVar = cVar.f127056b.f127083a;
        String str3 = null;
        C50446mt mtVar = aVar instanceof C50446mt ? (C50446mt) aVar : null;
        if (i3 == 0 && i4 == 0) {
            if ((mtVar == null || (q453 = mtVar.f138186d) == null || q453.f140139d != 0) ? false : true) {
                if (mtVar.f138187e) {
                    String str4 = mtVar.f138189g;
                    if (!(str4 == null || str4.length() == 0)) {
                        if (!C87412m.m108589b(mtVar.f138189g, ((C29211f) C81161g2.Bx0(cls)).mo56519Lo(this.f238787f, this.f238788g))) {
                            String str5 = mtVar.f138188f;
                            if (!(str5 == null || str5.length() == 0)) {
                                C81161g2.requireAccountInitializedOnDemand();
                                C81161g2.f238471g.mo113526j(this.f238787f, this.f238788g, mtVar.f138188f, mtVar.f138189g, 0, 0);
                            }
                            ((C29567d1) C81161g2.Bx0(C29567d1.class)).mo56816qq(this.f238787f, this.f238788g, mtVar.f138193n, true);
                            String str6 = this.f238787f;
                            int i5 = this.f238788g;
                            String str7 = mtVar.f138189g;
                            C87412m.m108593f(str7, "resp.new_demo_md5");
                            ((C29211f) C81161g2.Bx0(cls)).mo56521qq(str6, i5, str7);
                        }
                    }
                }
                this.f238786e.mo72093c(Boolean.TRUE);
                return 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startDownloadPkg, waitFor demo info failed, errType:");
        sb.append(i3);
        sb.append(", errCode:");
        sb.append(i4);
        sb.append(", errMsg:");
        sb.append(str2);
        sb.append(", wxaapp_baseresponse:{ErrCode:");
        sb.append((mtVar == null || (q452 = mtVar.f138186d) == null) ? null : Integer.valueOf(q452.f140139d));
        sb.append(", ErrMsg:");
        if (!(mtVar == null || (q45 = mtVar.f138186d) == null)) {
            str3 = q45.f140140e;
        }
        sb.append(str3);
        sb.append('}');
        Log.m105920e("MicroMsg.WxaPkgDownloaderExportServiceImpl", sb.toString());
        C33983a1.C33984a aVar2 = this.f238785d;
        if (aVar2 != null) {
            aVar2.mo8657a(i4, str2);
        }
        this.f238786e.mo72091a(new Exception());
        return 0;
    }
}
