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
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51585ur0;
import te3.C51727vr0;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: dj1.r */
public final class C45384r extends C58286q<C51727vr0> {

    /* renamed from: t */
    public final String f122899t = "Finder.CgiFinderLiveAcceptBattle";

    /* renamed from: u */
    public C51585ur0 f122900u;

    /* renamed from: dj1.r$a */
    public interface C45385a {
        /* renamed from: a */
        void mo70898a(int i, int i2, String str, C51727vr0 vr02);
    }

    public C45384r(long j, long j2, String str, byte[] bArr, int i, C52013xs0 xs02) {
        super((C49712hj1) null, 1, (C8480h) null);
        C51585ur0 ur02 = new C51585ur0();
        this.f122900u = ur02;
        ur02.f143036g = j;
        ur02.f143033d = C46523h2.f125330a.mo71859a(5804);
        C51585ur0 ur03 = this.f122900u;
        ur03.f143037h = j2;
        ur03.f143038i = str;
        ur03.f143034e = C89349b.m111674a(bArr);
        this.f122900u.f143040n = C66785b.f191882e.mo90662O5();
        C51585ur0 ur04 = this.f122900u;
        ur04.f143039j = i;
        ur04.f143035f = xs02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = ur04;
        C51727vr0 vr02 = new C51727vr0();
        vr02.setBaseResponse(new C49966ja());
        vr02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = vr02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveacceptbattle";
        bVar.f127069d = 5804;
        C47350c a = bVar.mo72403a();
        Log.m105924i("Finder.CgiFinderLiveAcceptBattle", "liveId:" + this.f122900u.f143036g + " objectId:" + this.f122900u.f143037h + " nonceId:" + this.f122900u.f143038i + " username:" + this.f122900u.f143040n + " scene:" + this.f122900u.f143039j);
        mo123453j(a);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51727vr0) eu32, "resp");
        String str2 = this.f122899t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
