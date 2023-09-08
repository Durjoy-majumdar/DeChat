package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87203t;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64381fz0;
import te3.C64408gz0;
import zc1.C66785b;

/* renamed from: qg1.l */
public final class C62614l extends C60625c<C64408gz0> {

    /* renamed from: s */
    public final String f177816s = "Finder.CgiFinderLiveGetAuthorization";

    /* renamed from: t */
    public C64381fz0 f177817t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62614l(String str, int i, String str2, int i2, int i3, String str3) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "appid");
        C87412m.m108594g(str2, "ticket");
        C87412m.m108594g(str3, "gameUserId");
        C64381fz0 fz02 = new C64381fz0();
        this.f177817t = fz02;
        fz02.f183257d = C46523h2.f125330a.mo71859a(4261);
        this.f177817t.f183258e = C66785b.f191882e.mo90662O5();
        this.f177817t.f183259f = C87203t.m108273i();
        C64381fz0 fz03 = this.f177817t;
        fz03.f183260g = str2;
        fz03.f183261h = str;
        fz03.f183262i = i;
        fz03.f183263j = i2;
        fz03.f183264n = i3;
        fz03.f183265o = str3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = fz03;
        C64408gz0 gz02 = new C64408gz0();
        gz02.setBaseResponse(new C49966ja());
        gz02.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = gz02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetauthorization";
        bVar.f127069d = 4261;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetAuthorization", "init " + str + ", " + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C64408gz0) eu32, "resp");
        String str2 = this.f177816s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
