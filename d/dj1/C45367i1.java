package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51903x01;
import te3.C52047y01;

/* renamed from: dj1.i1 */
public final class C45367i1 extends C58286q<C52047y01> {

    /* renamed from: t */
    public final String f122871t = "Finder.CgiGetProductReplayUrl";

    /* renamed from: u */
    public C51903x01 f122872u;

    public C45367i1(long j) {
        super((C49712hj1) null, 1, (C8480h) null);
        C51903x01 x012 = new C51903x01();
        this.f122872u = x012;
        x012.f144379d = C46523h2.f125330a.mo71859a(6613);
        C51903x01 x013 = this.f122872u;
        x013.f144380e = j;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = x013;
        C52047y01 y012 = new C52047y01();
        y012.setBaseResponse(new C49966ja());
        y012.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = y012;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetreplayurl";
        bVar.f127069d = 6613;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiGetProductReplayUrl", "init " + this.f122872u.f144380e);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C52047y01) eu32, "resp");
        String str2 = this.f122871t;
        Log.m105924i(str2, "errcode " + i2 + " , errType:" + i);
    }
}
