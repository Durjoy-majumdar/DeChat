package dj1;

import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49747hs1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51893wy0;
import te3.C52037xy0;

/* renamed from: dj1.d0 */
public final class C45348d0 extends C60625c<C52037xy0> {

    /* renamed from: s */
    public final String f122830s = "Finder.CgiFinderLiveGamePopScene";

    /* renamed from: t */
    public C51893wy0 f122831t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45348d0(int i, int i2, C45795b bVar, C49747hs1 hs12) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(hs12, "info");
        C51893wy0 wy02 = new C51893wy0();
        this.f122831t = wy02;
        wy02.f144351d = C46523h2.f125330a.mo71860b(6965, this.f172731j);
        C51893wy0 wy03 = this.f122831t;
        wy03.f144352e = i;
        wy03.f144353f = i2;
        wy03.f144354g = ((C55001u) bVar.mo71262a(C55001u.class)).f154420q.f182392d;
        C51893wy0 wy04 = this.f122831t;
        FinderObject finderObject = ((C54991o) bVar.mo71262a(C54991o.class)).f154341n;
        wy04.f144355h = finderObject != null ? finderObject.f164794id : -1;
        C51893wy0 wy05 = this.f122831t;
        wy05.f144356i = hs12.f134839d;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = wy05;
        C52037xy0 xy02 = new C52037xy0();
        xy02.setBaseResponse(new C49966ja());
        xy02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = xy02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegamepopscene";
        bVar2.f127069d = 6965;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGamePopScene", "init scene:" + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52037xy0) eu32, "resp");
        String str2 = this.f122830s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
