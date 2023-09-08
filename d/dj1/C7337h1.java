package dj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import ob0.C117747y;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C49335eu3;
import te3.C49586go1;
import te3.C49712hj1;
import te3.C49732ho1;
import te3.C49966ja;
import te3.C51163rv3;

/* renamed from: dj1.h1 */
public final class C7337h1 extends C58286q<C49732ho1> {

    /* renamed from: t */
    public final JSONObject f25453t = new JSONObject();

    /* renamed from: u */
    public C49586go1 f25454u;

    /* renamed from: dj1.h1$a */
    public interface C7338a {
        /* renamed from: a */
        void mo8507a(int i, int i2, String str, C49732ho1 ho12);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7337h1(String str, int i, long j, long j2, long j3, String str2, C7338a aVar, int i2, C8480h hVar) {
        super((C49712hj1) null, 1, (C8480h) null);
        C87412m.m108594g(str2, "userName");
        C49586go1 go12 = new C49586go1();
        this.f25454u = go12;
        go12.f134168d = C46523h2.f125330a.mo71860b(11174, this.f172731j);
        C49586go1 go13 = this.f25454u;
        go13.f134169e = str;
        go13.f134170f = i;
        go13.f134171g = j;
        go13.f134172h = j2;
        go13.f134173i = j3;
        go13.f134174j = str2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = go13;
        C49732ho1 ho12 = new C49732ho1();
        ho12.setBaseResponse(new C49966ja());
        ho12.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = ho12;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderupdatelivesongstate";
        bVar.f127069d = 11174;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: N */
    public JSONObject mo8506N() {
        return this.f25453t;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49732ho1) eu32, "resp");
        Log.m105924i("Finder.CgiFinderUpdateLiveSongState", "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
