package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50401mh0;
import te3.C51163rv3;
import te3.C51861wo1;
import te3.C51999xo1;
import zc1.C66785b;

/* renamed from: je1.t1 */
public final class C9378t1 extends C60625c<C51999xo1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9378t1(int i, String str, int i2, C50401mh0 mh02, int i3, C8480h hVar) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        str = (i3 & 2) != 0 ? "" : str;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        mh02 = (i3 & 8) != 0 ? null : mh02;
        C87412m.m108594g(str, "url");
        C51861wo1 wo12 = new C51861wo1();
        wo12.f144171d = C46523h2.f125330a.mo71860b(4046, this.f172731j);
        wo12.f144172e = C66785b.f191882e.mo90662O5();
        wo12.f144173f = i;
        wo12.f144174g = str;
        wo12.f144176i = i2;
        wo12.f144177j = mh02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = wo12;
        C51999xo1 xo12 = new C51999xo1();
        xo12.setBaseResponse(new C49966ja());
        xo12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = xo12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderutils";
        bVar.f127069d = 4046;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderUtils", "init type:" + i + ", url:" + str);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51999xo1) eu32, "resp");
        Log.m105924i("Finder.CgiFinderUtils", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
