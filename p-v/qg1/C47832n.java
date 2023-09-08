package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48787b01;
import te3.C48933c01;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import zc1.C66785b;

/* renamed from: qg1.n */
public final class C47832n extends C60625c<C48933c01> {

    /* renamed from: s */
    public final String f128402s;

    /* renamed from: t */
    public C48787b01 f128403t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47832n(long j, long j2, C89349b bVar, String str, int i) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(bVar, "liveCookies");
        C87412m.m108594g(str, "nonceId");
        this.f128402s = "Finder.CgiFinderLiveGetGameTeamInfo";
        C48787b01 b012 = new C48787b01();
        this.f128403t = b012;
        b012.f130862d = C46523h2.f125330a.mo71859a(4159);
        C48787b01 b013 = this.f128403t;
        b013.f130863e = j;
        b013.f130864f = j2;
        b013.f130865g = bVar;
        b013.f130866h = str;
        b013.f130867i = C66785b.f191882e.mo90662O5();
        C48787b01 b014 = this.f128403t;
        b014.f130868j = i;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = b014;
        C48933c01 c012 = new C48933c01();
        c012.setBaseResponse(new C49966ja());
        c012.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = c012;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivegetgameteaminfo";
        bVar2.f127069d = 4159;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetGameTeamInfo", "init feedId:" + j + ", liveId:" + j2 + ", nonceId:" + str + ", liveCookies size:" + bVar.f257327a.length);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C48933c01 c012 = (C48933c01) eu32;
        C87412m.m108594g(c012, "resp");
        String str2 = this.f128402s;
        StringBuilder sb = new StringBuilder();
        sb.append("[onCgiBack] errType=");
        sb.append(i);
        sb.append(" errCode=");
        sb.append(i2);
        sb.append(" errMsg=");
        sb.append(str);
        sb.append(" thread=");
        sb.append(Thread.currentThread());
        sb.append(" resp = ");
        Object obj = c012.f131419d;
        if (obj == null) {
            obj = "";
        }
        sb.append(C61937h.m72709h(obj));
        Log.m105924i(str2, sb.toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C47832n(long j, long j2, C89349b bVar, String str, int i, int i2, C8480h hVar) {
        this(j, j2, bVar, str, (i2 & 16) != 0 ? 2 : i);
    }
}
