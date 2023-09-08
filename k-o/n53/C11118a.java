package n53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10765k;
import te3.C48739an;
import te3.C48881bn;

/* renamed from: n53.a */
public final class C11118a extends C11131n<C48881bn> {
    public C11118a(String str) {
        C87412m.m108594g(str, "billNo");
        C48739an anVar = new C48739an();
        anVar.f130641d = str;
        anVar.f130642e = C10765k.f32240b;
        mo11234k(anVar, new C48881bn(), 6233, "/cgi-bin/micromsg-bin/cancelwecoinrecharge");
        Log.m105924i("MicroMsg.CommonWeCoinCgi", "CgiCancelWecoinRechargeRequest: billNo: " + str);
    }
}
