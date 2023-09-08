package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49929j11;
import te3.C49966ja;
import te3.C50065k11;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.u1 */
public final class C46538u1 extends C60625c<C50065k11> {

    /* renamed from: s */
    public final String f125394s = "Finder.CgiFinderliveGetTeamupGiftPrepare";

    /* renamed from: t */
    public C49929j11 f125395t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46538u1(long j, long j2, C89349b bVar, String str, String str2) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(bVar, "liveCookies");
        C87412m.m108594g(str, "nonceId");
        C49929j11 j112 = new C49929j11();
        this.f125395t = j112;
        j112.f135810d = C46523h2.f125330a.mo71859a(6863);
        C49929j11 j113 = this.f125395t;
        j113.f135811e = j;
        j113.f135812f = j2;
        j113.f135813g = bVar;
        j113.f135814h = str;
        j113.f135817n = str2 == null ? "" : str2;
        j113.f135815i = C66785b.f191882e.mo90662O5();
        C49929j11 j114 = this.f125395t;
        j114.f135816j = 2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = j114;
        C50065k11 k112 = new C50065k11();
        k112.setBaseResponse(new C49966ja());
        k112.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = k112;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetteamupgiftprepare";
        bVar2.f127069d = 6863;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderliveGetTeamupGiftPrepare", "init feedId:" + j + ", liveId:" + j2 + ", object_nonce_id:" + str + ", reddot_id:" + str2);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50065k11) eu32, "resp");
        String str2 = this.f125394s;
        Log.m105924i(str2, "ljd [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
