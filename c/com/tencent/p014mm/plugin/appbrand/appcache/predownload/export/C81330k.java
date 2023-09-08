package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.C29315z2;
import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kr0.C33983a1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.k */
public final class C81330k extends C87413o implements C32226l<C83368m1.C83377e, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f238789d;

    /* renamed from: e */
    public final /* synthetic */ int f238790e;

    /* renamed from: f */
    public final /* synthetic */ C83368m1.C83374d f238791f;

    /* renamed from: g */
    public final /* synthetic */ C33983a1.C33985b f238792g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81330k(String str, int i, C83368m1.C83374d dVar, C33983a1.C33985b bVar) {
        super(1);
        this.f238789d = str;
        this.f238790e = i;
        this.f238791f = dVar;
        this.f238792g = bVar;
    }

    public Object invoke(Object obj) {
        C83368m1.C83377e eVar = (C83368m1.C83377e) obj;
        C87412m.m108594g(eVar, "response");
        C81161g2.requireAccountInitializedOnDemand();
        C29315z2 m = C81161g2.f238471g.mo113533pl(this.f238789d, eVar.f243626a.pkgVersion(), this.f238790e, new String[0]);
        Log.m105924i("MicroMsg.WxaPkgDownloaderExportServiceImpl", "startDownloadPkg, onSuccess, request:" + this.f238791f + ", respsonse:" + eVar);
        C33983a1.C33985b bVar = this.f238792g;
        if (bVar != null) {
            C87412m.m108591d(m);
            String pkgPath = eVar.f243626a.pkgPath();
            C87412m.m108591d(pkgPath);
            bVar.mo56555b(m, pkgPath);
        }
        return C13598b0.f38549a;
    }
}
