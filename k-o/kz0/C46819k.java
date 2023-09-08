package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C51777w30;
import te3.C51917x30;

/* renamed from: kz0.k */
public final class C46819k extends C46827q<C51917x30> {
    public C46819k(String str) {
        C87412m.m108594g(str, "marchantId");
        C51777w30 w302 = new C51777w30();
        C51917x30 x302 = new C51917x30();
        w302.f143842d = str;
        mo72033k(w302, x302, 1768, "/cgi-bin/mmpay-bin/mktdeletemchinlist");
        Log.m105925i("MicroMsg.CgiDeleteMchInList", "delete mch: %s", str);
    }
}
