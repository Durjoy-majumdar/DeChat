package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50712op0;
import te3.C50858pp0;
import te3.C51163rv3;

/* renamed from: je1.o0 */
public final class C46528o0 extends C60625c<C50858pp0> {

    /* renamed from: s */
    public final String f125350s = "Finder.CgiFinderGetShareProductInfo";

    /* renamed from: t */
    public C50712op0 f125351t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46528o0(String str, long j, long j2, int i, String str2) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "ecSource");
        C50712op0 op02 = new C50712op0();
        this.f125351t = op02;
        op02.f139297d = C46523h2.f125330a.mo71860b(4117, (C49712hj1) null);
        C50712op0 op03 = this.f125351t;
        op03.f139298e = str;
        op03.f139299f = j;
        op03.f139300g = j2;
        op03.f139301h = i;
        op03.f139305o = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = op03;
        C50858pp0 pp02 = new C50858pp0();
        pp02.setBaseResponse(new C49966ja());
        pp02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = pp02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/findergetshareproductinfo";
        bVar.f127069d = 4117;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderGetShareProductInfo", "init finderUsername:" + str + ", objectId:" + C61926c.m72691p(j) + ", productId:" + C61926c.m72691p(j2) + ", shareScene:" + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50858pp0) eu32, "resp");
        String str2 = this.f125350s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
