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
import te3.C49494g01;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C64356f01;

/* renamed from: qg1.o */
public final class C62615o extends C60625c<C49494g01> {

    /* renamed from: s */
    public final String f177818s;

    /* renamed from: t */
    public C64356f01 f177819t;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62615o(long j, long j2, int i, String str, C89349b bVar, String str2, String str3, String str4, int i2, C8480h hVar) {
        this(j, j2, i, str, bVar, str2, str3, (i2 & 128) != 0 ? "" : str4);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C49494g01) eu32, "resp");
        String str2 = this.f177818s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62615o(long j, long j2, int i, String str, C89349b bVar, String str2, String str3, String str4) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "jumpId");
        C87412m.m108594g(str4, "ecSource");
        this.f177818s = "Finder.CgiFinderLiveGetJumpInfo";
        C64356f01 f012 = new C64356f01();
        this.f177819t = f012;
        f012.f183068d = C46523h2.f125330a.mo71859a(6283);
        C64356f01 f013 = this.f177819t;
        f013.f183069e = j;
        f013.f183070f = j2;
        f013.f183071g = i;
        f013.f183072h = str;
        f013.f183073i = bVar;
        f013.f183074j = str4;
        if (str2 != null) {
            f013.f183075n = C89349b.m111675b(str2);
        }
        if (str3 != null) {
            this.f177819t.f183076o = C89349b.m111675b(str3);
        }
        C64356f01 f014 = this.f177819t;
        f014.f183077p = 1;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = f014;
        C49494g01 g012 = new C49494g01();
        g012.setBaseResponse(new C49966ja());
        g012.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = g012;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetjumpinfo";
        bVar2.f127069d = 6283;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetJumpInfo", "init liveId:" + j2 + ", objectId:" + j + '}');
    }
}
