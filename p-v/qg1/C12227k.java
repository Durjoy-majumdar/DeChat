package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C52040xz0;
import te3.C52188yz0;
import zc1.C66785b;

/* renamed from: qg1.k */
public final class C12227k extends C60625c<C52188yz0> {

    /* renamed from: s */
    public final String f35297s = "CgiFinderLiveFanClubMember";

    public C12227k(C89349b bVar, long j, long j2, C89349b bVar2, int i, C49712hj1 hj12) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        C52040xz0 xz02 = new C52040xz0();
        xz02.f145028d = C46523h2.f125330a.mo71859a(6282);
        xz02.f145029e = C66785b.f191882e.mo90662O5();
        xz02.f145030f = bVar;
        xz02.f145031g = j;
        xz02.f145032h = j2;
        xz02.f145033i = bVar2;
        xz02.f145034j = i;
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = xz02;
        C52188yz0 yz02 = new C52188yz0();
        yz02.setBaseResponse(new C49966ja());
        yz02.getBaseResponse().f135956e = new C51163rv3();
        bVar3.f127067b = yz02;
        bVar3.f127068c = "/cgi-bin/micromsg-bin/finderlivegetfanclubmembers";
        bVar3.f127069d = 6282;
        mo123453j(bVar3.mo72403a());
        Log.m105924i("CgiFinderLiveFanClubMember", "init " + xz02.f145029e + ',' + xz02.f145030f + ',' + xz02.f145031g + ',' + xz02.f145032h + ',' + xz02.f145033i + ',' + xz02.f145034j);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C52188yz0 yz02 = (C52188yz0) eu32;
        C87412m.m108594g(yz02, "resp");
        String str2 = this.f35297s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " size=" + yz02.f145588g.size() + " thread=" + Thread.currentThread());
    }
}
