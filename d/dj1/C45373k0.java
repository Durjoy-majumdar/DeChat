package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C48792b11;
import te3.C48938c11;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: dj1.k0 */
public final class C45373k0 extends C58286q<C48938c11> {

    /* renamed from: t */
    public final JSONObject f122880t = new JSONObject();

    /* renamed from: u */
    public C48792b11 f122881u;

    public C45373k0(String str, long j, long j2) {
        super((C49712hj1) null, 1, (C8480h) null);
        C48792b11 b112 = new C48792b11();
        this.f122881u = b112;
        b112.f130884d = C46523h2.f125330a.mo71860b(7875, this.f172731j);
        C48792b11 b113 = this.f122881u;
        b113.f130885e = str;
        b113.f130886f = j;
        b113.f130887g = j2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = b113;
        C48938c11 c112 = new C48938c11();
        c112.setBaseResponse(new C49966ja());
        c112.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = c112;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetroommanager";
        bVar.f127069d = 7875;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f122880t;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C48938c11) eu32, "resp");
        Log.m105924i("Finder.CgiFinderLiveGetRoomManager", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
