package mz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kz0.C46827q;
import te3.C51337t30;
import te3.C51638v30;

/* renamed from: mz0.a */
public final class C47143a extends C46827q<C51638v30> {
    public C47143a(String str) {
        C87412m.m108594g(str, "cardId");
        C51337t30 t302 = new C51337t30();
        C51638v30 v302 = new C51638v30();
        t302.f141915d = str;
        mo72033k(t302, v302, 5027, "/cgi-bin/mmpay-bin/mktdeletecoupon");
        Log.m105925i("MicroMsg.CgiDeleteCouponRequest", "cardid: %s", str);
    }
}
