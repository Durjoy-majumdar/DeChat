package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dp1.C58417y0;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50581nr0;
import te3.C51000qr0;
import te3.C51143rr0;
import te3.C51163rv3;
import te3.C51431tq1;
import zc1.C66785b;

/* renamed from: je1.v0 */
public final class C46541v0 extends C60625c<C51143rr0> {

    /* renamed from: w */
    public static long f125402w;

    /* renamed from: s */
    public final C50581nr0 f125403s;

    /* renamed from: t */
    public final String f125404t = "Finder.CgiFinderLikeFriend";

    /* renamed from: u */
    public C51000qr0 f125405u;

    /* renamed from: v */
    public long f125406v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46541v0(C51431tq1 tq12, C50581nr0 nr02, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(tq12, "action");
        C87412m.m108594g(nr02, "likeInfo");
        this.f125403s = nr02;
        long c = C31543z5.m39453c();
        this.f125406v = c;
        long j = f125402w;
        if (c < j) {
            f125402w = 1 + j;
            this.f125406v = j;
        }
        f125402w = this.f125406v;
        C51000qr0 qr02 = new C51000qr0();
        this.f125405u = qr02;
        qr02.f140492d = tq12.f142357d;
        qr02.f140499n = tq12.f142358e;
        qr02.f140495g = this.f125406v;
        qr02.f140493e = nr02.f138726f;
        qr02.f140497i = C66785b.f191882e.mo90662O5();
        C51000qr0 qr03 = this.f125405u;
        qr03.f140498j = tq12.f142359f;
        qr03.f140502q = nr02.f138729i;
        qr03.f140494f = nr02.f138727g == 1 ? 5 : 6;
        qr03.f140500o = C46523h2.f125330a.mo71860b(3710, hj12);
        this.f125405u.f140501p = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(tq12.f142357d, hj12 != null ? hj12.f134675i : 0);
        Log.m105924i("Finder.CgiFinderLikeFriend", "likeId:" + this.f125406v + " objectId:" + this.f125405u.f140492d + " commentId：" + this.f125405u.f140493e + " opType:" + this.f125405u.f140494f + " likeId:" + this.f125405u.f140495g + " username:" + this.f125405u.f140497i + " action:" + nr02.f138727g);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f125405u;
        C51143rr0 rr02 = new C51143rr0();
        rr02.setBaseResponse(new C49966ja());
        rr02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = rr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlike";
        bVar.f127069d = 3710;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLikeFriend", "likeId:" + this.f125406v + " CgiFinderLikeComment init " + this.f125405u.f140492d + ' ');
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51143rr0) eu32, "resp");
        String str2 = this.f125404t;
        Log.m105924i(str2, "likeId:" + this.f125406v + " [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + " objectId:" + this.f125405u.f140492d + " opType:" + this.f125405u.f140494f + " likeId:" + this.f125405u.f140495g + " username:" + this.f125405u.f140497i + " action:" + this.f125403s.f138727g);
    }
}
