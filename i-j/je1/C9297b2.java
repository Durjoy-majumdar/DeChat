package je1;

import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C49078d11;
import te3.C49214e11;
import te3.C49335eu3;
import te3.C49521g61;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50646o81;
import te3.C51163rv3;
import wg1.C15320l4;

/* renamed from: je1.b2 */
public final class C9297b2 extends C60625c<C49214e11> {

    /* renamed from: s */
    public C49078d11 f29070s;

    /* renamed from: t */
    public C47350c f29071t;

    public C9297b2(long j) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C49078d11 d112 = new C49078d11();
        this.f29070s = d112;
        d112.f132062d = C46523h2.f125330a.mo71859a(8350);
        C49078d11 d113 = this.f29070s;
        d113.f132063e = j;
        C15320l4 l4Var = C15320l4.f41639a;
        d113.f132064f = C15320l4.f41640b;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = d113;
        C49214e11 e112 = new C49214e11();
        e112.setBaseResponse(new C49966ja());
        e112.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = e112;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetshareqrcode";
        bVar.f127069d = 8350;
        C47350c a = bVar.mo72403a();
        this.f29071t = a;
        mo123453j(a);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49521g61 g612;
        C87412m.m108594g((C49214e11) eu32, "resp");
        C47350c cVar = this.f29071t;
        if (cVar != null) {
            C47465a aVar = cVar.f127056b.f127083a;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveGetShareQRCodeResponse");
            C50646o81 o812 = ((C49214e11) aVar).f132618d;
            if (o812 != null && (g612 = o812.f139023j) != null) {
                C15320l4.f41639a.mo14172c(g612.f133890f, g612.f133889e, g612.f133888d);
                return;
            }
            return;
        }
        C87412m.m108603p("rr");
        throw null;
    }
}
