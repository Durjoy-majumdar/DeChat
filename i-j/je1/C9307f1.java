package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48853bg1;
import te3.C48999cg1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import vq1.C14960h0;

/* renamed from: je1.f1 */
public final class C9307f1 extends C60625c<C48999cg1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9307f1(C14960h0 h0Var) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(h0Var, "action");
        C48853bg1 bg12 = new C48853bg1();
        bg12.f131098d = C46523h2.f125330a.mo71860b(11259, this.f172731j);
        bg12.f131099e = h0Var.f41016e;
        bg12.f131100f = h0Var.f41014c.f131802d;
        bg12.f131101g = h0Var.f41015d;
        C48999cg1 cg12 = new C48999cg1();
        cg12.setBaseResponse(new C49966ja());
        cg12.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = bg12;
        bVar.f127067b = cg12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderopbuzzword";
        bVar.f127069d = 11259;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C48999cg1) eu32, "resp");
        Log.m105924i("Finder.CgiFinderOpBuzzword", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
