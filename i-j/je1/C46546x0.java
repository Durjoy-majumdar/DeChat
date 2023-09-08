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
import te3.C49503g21;
import te3.C49645h21;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: je1.x0 */
public final class C46546x0 extends C60625c<C49645h21> {

    /* renamed from: s */
    public final String f125418s = "Finder.CgiFinderLiveJoinGameTeamPrepare";

    /* renamed from: t */
    public C49503g21 f125419t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46546x0(long j, long j2, C89349b bVar, String str, int i) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(bVar, "liveCookies");
        C87412m.m108594g(str, "nonceId");
        C49503g21 g212 = new C49503g21();
        this.f125419t = g212;
        g212.f133798d = C46523h2.f125330a.mo71859a(6235);
        C49503g21 g213 = this.f125419t;
        g213.f133799e = j;
        g213.f133800f = j2;
        g213.f133802h = bVar;
        g213.f133801g = str;
        g213.f133803i = C66785b.f191882e.mo90662O5();
        C49503g21 g214 = this.f125419t;
        g214.f133804j = 2;
        g214.f133805n = i;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = g214;
        C49645h21 h212 = new C49645h21();
        h212.setBaseResponse(new C49966ja());
        h212.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = h212;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivejoingameteamprepare";
        bVar2.f127069d = 6235;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveJoinGameTeamPrepare", "init feedId:" + j + ", liveId:" + j2 + ", nonceId:" + str + ", liveCookies size:" + bVar.f257327a.length);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49645h21) eu32, "resp");
        String str2 = this.f125418s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
