package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50443ms0;
import te3.C50585ns0;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: qg1.q */
public final class C12229q extends C60625c<C50585ns0> {

    /* renamed from: s */
    public final String f35299s = "Finder.CgiFinderLiveGetPromoteInfoList";

    /* renamed from: t */
    public C50443ms0 f35300t;

    public C12229q(long j, long j2) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C50443ms0 ms02 = new C50443ms0();
        this.f35300t = ms02;
        ms02.f138173d = C46523h2.f125330a.mo71859a(5250);
        C50443ms0 ms03 = this.f35300t;
        ms03.f138175f = j;
        ms03.f138176g = j2;
        ms03.f138174e = C66785b.f191882e.mo90662O5();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f35300t;
        C50585ns0 ns02 = new C50585ns0();
        ns02.setBaseResponse(new C49966ja());
        ns02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ns02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderliveanchorgetpromoteinfolist";
        bVar.f127069d = 5250;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetPromoteInfoList", "init liveId:" + j2 + ", objectId:" + j + '}');
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C50585ns0) eu32, "resp");
        String str2 = this.f35299s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
        switch (i2) {
            case -200194:
            case -200193:
                C61926c.m72668M(C12228p.f35298d);
                return;
            default:
                return;
        }
    }
}
