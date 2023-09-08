package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import kt1.C46744d;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49902iv0;
import te3.C49966ja;
import te3.C50041jv0;
import te3.C51163rv3;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.t */
public final class C45391t extends C58286q<C50041jv0> {

    /* renamed from: t */
    public final String f122907t = "Finder.CgiFinderLiveApplyBattle";

    /* renamed from: u */
    public C49902iv0 f122908u;

    /* renamed from: dj1.t$a */
    public interface C45392a {
        /* renamed from: a */
        void mo70899a(int i, int i2, String str, C50041jv0 jv02);
    }

    public C45391t(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02) {
        super((C49712hj1) null, 1, (C8480h) null);
        C49902iv0 iv02 = new C49902iv0();
        this.f122908u = iv02;
        iv02.f135691g = j;
        iv02.f135688d = C46523h2.f125330a.mo71859a(5817);
        C49902iv0 iv03 = this.f122908u;
        iv03.f135692h = j2;
        iv03.f135693i = str;
        iv03.f135689e = C89349b.m111674a(bArr);
        this.f122908u.f135695n = C66785b.f191882e.mo90662O5();
        C49902iv0 iv04 = this.f122908u;
        iv04.f135694j = i;
        iv04.f135690f = xs02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = iv04;
        C50041jv0 jv02 = new C50041jv0();
        jv02.setBaseResponse(new C49966ja());
        jv02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = jv02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveapplybattle";
        bVar.f127069d = 5817;
        C47350c a = bVar.mo72403a();
        Log.m105924i("Finder.CgiFinderLiveApplyBattle", "liveId:" + this.f122908u.f135691g + " objectId:" + this.f122908u.f135692h + " nonceId:" + this.f122908u.f135693i + " username:" + this.f122908u.f135695n + " scene:" + this.f122908u.f135694j);
        mo123453j(a);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50041jv0) eu32, "resp");
        String str2 = this.f122907t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
