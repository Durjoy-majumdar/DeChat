package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
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
import te3.C50299lr0;
import te3.C50439mr0;
import te3.C51163rv3;
import vq1.C14958f0;

/* renamed from: je1.s0 */
public final class C9374s0 extends C60625c<C50439mr0> {

    /* renamed from: t */
    public static long f29268t;

    /* renamed from: s */
    public long f29269s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9374s0(C14958f0 f0Var) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(f0Var, "action");
        long c = C31543z5.m39453c();
        this.f29269s = c;
        long j = f29268t;
        if (c < j) {
            f29268t = 1 + j;
            this.f29269s = j;
        }
        f29268t = this.f29269s;
        C50299lr0 lr02 = new C50299lr0();
        lr02.f137606d = C46523h2.f125330a.mo71860b(10512, this.f172731j);
        lr02.f137607e = f0Var.f41011e;
        lr02.f137608f = f0Var.f41009c.f131802d;
        lr02.f137609g = this.f29269s;
        lr02.f137610h = f0Var.f41010d ? 1 : 2;
        C50439mr0 mr02 = new C50439mr0();
        mr02.setBaseResponse(new C49966ja());
        mr02.getBaseResponse().f135956e = new C51163rv3();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = lr02;
        bVar.f127067b = mr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlikebuzzword";
        bVar.f127069d = 10512;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLikeBuzzword", "[init] feedId = " + f0Var.f41011e + " buzzwordId = " + f0Var.f41009c.f131802d + " likeSeq = " + this.f29269s + " isLike = " + f0Var.f41010d);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50439mr0) eu32, "resp");
        Log.m105924i("Finder.CgiFinderLikeBuzzword", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
