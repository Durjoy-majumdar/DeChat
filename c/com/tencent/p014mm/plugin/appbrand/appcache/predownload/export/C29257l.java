package com.tencent.p014mm.plugin.appbrand.appcache.predownload.export;

import com.tencent.p014mm.plugin.appbrand.launching.C83368m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kr0.C33983a1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.export.l */
public final class C29257l extends C87413o implements C32227p<C83368m1.C83369a, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C83368m1.C83374d f79938d;

    /* renamed from: e */
    public final /* synthetic */ C33983a1.C33984a f79939e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29257l(C83368m1.C83374d dVar, C33983a1.C33984a aVar) {
        super(2);
        this.f79938d = dVar;
        this.f79939e = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C83368m1.C83369a aVar = (C83368m1.C83369a) obj;
        String str = (String) obj2;
        C87412m.m108594g(aVar, "err");
        Log.m105920e("MicroMsg.WxaPkgDownloaderExportServiceImpl", "startDownloadPkg, onError, request:" + this.f79938d + ", errCode:" + aVar.f243607d + ", errMsg:" + str);
        C33983a1.C33984a aVar2 = this.f79939e;
        if (aVar2 != null) {
            aVar2.mo8657a(aVar.f243607d, str);
        }
        return C13598b0.f38549a;
    }
}
