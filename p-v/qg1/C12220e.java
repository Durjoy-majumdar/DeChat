package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50172ks0;
import te3.C50326ly0;
import te3.C51005qs0;
import te3.C51148rs0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: qg1.e */
public final class C12220e extends C60625c<C51148rs0> {

    /* renamed from: s */
    public final String f35283s = "Finder.CgiFinderLiveAnchorOpFanClub";

    /* renamed from: t */
    public final C51005qs0 f35284t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12220e(int i, C50326ly0 ly02, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(ly02, "info");
        C51005qs0 qs02 = new C51005qs0();
        this.f35284t = qs02;
        qs02.f140517d = C46523h2.f125330a.mo71859a(6632);
        qs02.f140518e = C66785b.f191882e.mo90662O5();
        qs02.f140519f = i;
        qs02.f140520g = ly02;
        mo11953s();
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51148rs0) eu32, "resp");
        String str2 = this.f35283s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }

    /* renamed from: s */
    public final void mo11953s() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f35284t;
        C51148rs0 rs02 = new C51148rs0();
        rs02.setBaseResponse(new C49966ja());
        rs02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = rs02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveanchoropfanclub";
        bVar.f127069d = 6632;
        mo123453j(bVar.mo72403a());
        String str = this.f35283s;
        StringBuilder sb = new StringBuilder();
        sb.append("init ");
        sb.append(this.f35284t.f140518e);
        sb.append(',');
        sb.append(this.f35284t.f140519f);
        sb.append(',');
        C50326ly0 ly02 = this.f35284t.f140520g;
        sb.append(ly02 != null ? ly02.f137706d : null);
        Log.m105924i(str, sb.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12220e(int i, C50172ks0 ks02, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(ks02, "customGiftInfo");
        C51005qs0 qs02 = new C51005qs0();
        this.f35284t = qs02;
        qs02.f140517d = C46523h2.f125330a.mo71859a(6632);
        qs02.f140518e = C66785b.f191882e.mo90662O5();
        qs02.f140519f = i;
        qs02.f140521h = ks02;
        mo11953s();
    }
}
