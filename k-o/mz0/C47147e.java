package mz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kz0.C46827q;
import te3.C49323er3;
import te3.C49463fr3;

/* renamed from: mz0.e */
public final class C47147e extends C46827q<C49463fr3> {
    public C47147e(String str) {
        C87412m.m108594g(str, "cardId");
        C49323er3 er32 = new C49323er3();
        C49463fr3 fr32 = new C49463fr3();
        er32.f133086d = str;
        mo72033k(er32, fr32, 5170, "/cgi-bin/mmpay-bin/mktremovecoupon");
        Log.m105925i("MicroMsg.CgiRemoveCouponRequest", "cardid: %s", str);
    }
}
