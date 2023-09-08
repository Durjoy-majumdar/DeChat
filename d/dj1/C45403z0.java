package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49533g91;
import te3.C49675h91;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: dj1.z0 */
public final class C45403z0 extends C58286q<C49675h91> {

    /* renamed from: t */
    public final C45404a f122923t;

    /* renamed from: dj1.z0$a */
    public interface C45404a {
        /* renamed from: a */
        void mo70904a(int i, int i2, String str, C49675h91 h912);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45403z0(long j, long j2, int i, String str, C45404a aVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str, "verificationId");
        this.f122923t = aVar;
        C49533g91 g912 = new C49533g91();
        g912.f133937g = j;
        g912.f133936f = j2;
        g912.f133938h = i;
        g912.f133939i = str;
        g912.f133934d = C46523h2.f125330a.mo71859a(5281);
        g912.f133935e = C66785b.f191882e.mo90662O5();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = g912;
        C49675h91 h912 = new C49675h91();
        h912.setBaseResponse(new C49966ja());
        h912.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = h912;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivesuspiciousverify";
        bVar.f127069d = 5281;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveSuspiciousVerify", "init: liveId:" + j + ", objectId:" + j2 + ", scene:" + i + ", verification_id:" + str);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C49675h91 h912 = (C49675h91) eu32;
        C87412m.m108594g(h912, "resp");
        Log.m105924i("Finder.CgiFinderLiveSuspiciousVerify", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C45404a aVar = this.f122923t;
        if (aVar != null) {
            aVar.mo70904a(i, i2, str, h912);
        }
    }
}
