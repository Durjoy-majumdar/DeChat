package n53;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import m53.C10765k;
import pe3.C89349b;
import te3.C48786b00;
import te3.C48932c00;

/* renamed from: n53.b */
public final class C11119b extends C11131n<C48932c00> {
    public C11119b(C89349b bVar, C89349b bVar2) {
        C87412m.m108594g(bVar, "ctxBuff");
        C87412m.m108594g(bVar2, "signBuff");
        C48786b00 b002 = new C48786b00();
        b002.f130860e = bVar2;
        b002.f130859d = bVar;
        b002.f130861f = C10765k.f32240b;
        mo11234k(b002, new C48932c00(), 5994, "/cgi-bin/micromsg-bin/consumewecoin");
        Log.m105924i("MicroMsg.CommonWeCoinCgi", "CgiConsumeWecoinRequest: ctxBuff: " + bVar + ", sign: " + bVar2);
    }
}
