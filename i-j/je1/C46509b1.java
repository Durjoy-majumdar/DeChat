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
import te3.C50226l71;
import te3.C50364m71;
import te3.C51163rv3;

/* renamed from: je1.b1 */
public final class C46509b1 extends C60625c<C50364m71> {

    /* renamed from: s */
    public final String f125297s = "Finder.CgiFinderLiveRespondGameInvitation";

    /* renamed from: t */
    public C50226l71 f125298t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46509b1(long j, long j2, String str, String str2, int i) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "nonceId");
        C87412m.m108594g(str2, "invitation_id");
        C50226l71 l712 = new C50226l71();
        this.f125298t = l712;
        l712.f137234d = C46523h2.f125330a.mo71859a(6625);
        C50226l71 l713 = this.f125298t;
        l713.f137236f = j;
        l713.f137235e = j2;
        l713.f137237g = str;
        l713.f137239i = str2;
        l713.f137238h = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = l713;
        C50364m71 m712 = new C50364m71();
        m712.setBaseResponse(new C49966ja());
        m712.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = m712;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliverespondgameinvitation";
        bVar.f127069d = 6625;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveRespondGameInvitation", "init feedId:" + j + ", liveId:" + j2 + ", object_nonce_id:" + str + ", linvitation_id:" + str2);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50364m71) eu32, "resp");
        String str2 = this.f125297s;
        Log.m105924i(str2, "ljd [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
