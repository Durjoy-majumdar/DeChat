package jy1;

import com.tencent.p014mm.plugin.game.luggage.model.H5CgiPreloadModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jy1.C46582b;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import pe3.C47465a;
import py1.C47592h2;

/* renamed from: jy1.c */
public final class C46585c implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ long f125493d;

    public C46585c(long j) {
        this.f125493d = j;
    }

    /* renamed from: a */
    public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        long currentTimeMillis = System.currentTimeMillis() - this.f125493d;
        if (i == 0 && i2 == 0) {
            C47465a aVar = cVar.f127056b.f127083a;
            if (aVar instanceof C47592h2) {
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.protobuf.GetGameIndexPreloadCgiResponse");
                H5CgiPreloadModel a = C46582b.f125486a.mo71883a();
                a.f112945g = ((C47592h2) aVar).f127754d;
                a.f112944f = false;
                a.f112942d = System.currentTimeMillis();
                a.f112943e = currentTimeMillis;
                C46582b.m51904b(true);
            }
            Log.m105924i("GameH5CgiPreloadManager", "gamelog.preloadH5CgiData, docgi , success cgiResponseStr= " + C46582b.f125486a.mo71883a());
        } else {
            H5CgiPreloadModel a2 = C46582b.f125486a.mo71883a();
            a2.f112945g = null;
            a2.f112944f = true;
            a2.f112942d = System.currentTimeMillis();
            a2.f112943e = currentTimeMillis;
            C46582b.m51904b(true);
            Log.m105924i("GameH5CgiPreloadManager", "gamelog.preloadH5CgiData, docgi , falied  errorCode =" + i2 + " errorMsg = " + str);
        }
        C46582b.C46583a aVar2 = C46582b.f125491f;
        if (aVar2 != null) {
            aVar2.mo71884a(C46582b.f125486a.mo71883a());
        }
        return 0;
    }
}
