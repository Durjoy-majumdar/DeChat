package mz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kz0.C46827q;
import te3.C50466my1;
import te3.C64595ny1;

/* renamed from: mz0.c */
public final class C47145c extends C46827q<C64595ny1> {
    public C47145c(long j, long j2, int i) {
        C50466my1 my12 = new C50466my1();
        C64595ny1 ny12 = new C64595ny1();
        my12.f138284d = j;
        my12.f138285e = j2;
        my12.f138286f = i;
        mo72033k(my12, ny12, 4796, "/cgi-bin/mmpay-bin/mktgetcouponandgiftlist");
        Log.m105924i("MicroMsg.CgiGetCouponAndGiftList", "pageNum: " + j + ", pageSize: " + j2);
    }
}
