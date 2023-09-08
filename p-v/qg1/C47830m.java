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
import te3.C49765hx0;
import te3.C49966ja;
import te3.C50891pz0;
import te3.C51032qz0;
import te3.C51163rv3;

/* renamed from: qg1.m */
public final class C47830m extends C60625c<C51032qz0> {

    /* renamed from: s */
    public final String f128400s = "Finder.CgiFinderLiveGetContact";

    /* renamed from: t */
    public C50891pz0 f128401t;

    /* renamed from: qg1.m$a */
    public interface C47831a {
        /* renamed from: a */
        void mo72576a(boolean z, C49765hx0 hx02);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47830m(long j, long j2, String str, int i, C89349b bVar, C47831a aVar) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(str, "finderUserName");
        C50891pz0 pz02 = new C50891pz0();
        this.f128401t = pz02;
        pz02.f140056e = j;
        pz02.f140057f = j2;
        pz02.f140058g = str;
        pz02.f140055d = C46523h2.f125330a.mo71859a(6678);
        C50891pz0 pz03 = this.f128401t;
        pz03.f140061j = bVar;
        pz03.f140059h = i;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = pz03;
        C51032qz0 qz02 = new C51032qz0();
        qz02.setBaseResponse(new C49966ja());
        qz02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = qz02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetcontact";
        bVar2.f127069d = 6678;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetContact", "init " + this.f128401t.f140056e + ',' + this.f128401t.f140058g + ',' + this.f128401t.f140059h);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51032qz0) eu32, "resp");
        String str2 = this.f128400s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
