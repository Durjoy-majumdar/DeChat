package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import pe3.C89349b;
import te3.C48898bs0;
import te3.C49106d71;
import te3.C49335eu3;
import te3.C49513g41;
import te3.C49656h41;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: dj1.q0 */
public final class C45383q0 extends C58286q<C49656h41> {

    /* renamed from: t */
    public final JSONObject f122897t;

    /* renamed from: u */
    public C49513g41 f122898u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45383q0(String str, long j, long j2, int i, C48898bs0 bs02, C49106d71 d712, int i2, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C89349b bVar = null;
        bs02 = (i2 & 16) != 0 ? null : bs02;
        d712 = (i2 & 32) != 0 ? null : d712;
        this.f122897t = new JSONObject();
        C49513g41 g412 = new C49513g41();
        this.f122898u = g412;
        g412.f133834d = C46523h2.f125330a.mo71860b(10497, this.f172731j);
        C49513g41 g413 = this.f122898u;
        g413.f133835e = str;
        g413.f133836f = j;
        g413.f133837g = j2;
        g413.f133838h = i;
        if (i == 2) {
            g413.f133839i = d712 != null ? C58739j4.f168176a.mo83710g0(d712) : bVar;
        } else {
            g413.f133839i = bs02 != null ? C58739j4.f168176a.mo83710g0(bs02) : bVar;
        }
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f122898u;
        C49656h41 h412 = new C49656h41();
        h412.setBaseResponse(new C49966ja());
        h412.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = h412;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivemodroommanager";
        bVar2.f127069d = 10497;
        mo123453j(bVar2.mo72403a());
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122897t;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49656h41) eu32, "resp");
        Log.m105924i("Finder.CgiFinderLiveModRoomManager", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
