package kz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C51054r30;
import te3.C51196s30;

/* renamed from: kz0.i */
public final class C46817i extends C46827q<C51196s30> {
    public C46817i(String str) {
        C87412m.m108594g(str, "cardId");
        C51054r30 r302 = new C51054r30();
        C51196s30 s302 = new C51196s30();
        r302.f140683d = str;
        mo72033k(r302, s302, 2707, "/cgi-bin/mmpay-bin/mktdeletecardininvalidlist");
        Log.m105925i("MicroMsg.CgiDeleteCardInInvalidList", "cardid: %s", str);
    }
}
