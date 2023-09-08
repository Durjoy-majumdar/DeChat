package je1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C51163rv3;
import te3.C51352t7;
import te3.C51501u7;

/* renamed from: je1.a */
public final class C46503a extends C60625c<C51501u7> {

    /* renamed from: s */
    public final String f125285s = "Finder.CgiAudienceSendCommentToReserveGame";

    /* renamed from: t */
    public C51352t7 f125286t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46503a(long j, long j2, C89349b bVar, String str, String str2) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(bVar, "liveCookies");
        C87412m.m108594g(str, "comment_msg");
        C87412m.m108594g(str2, "finderUsername");
        C51352t7 t7Var = new C51352t7();
        this.f125286t = t7Var;
        t7Var.f142002d = C46523h2.f125330a.mo71859a(4226);
        C51352t7 t7Var2 = this.f125286t;
        t7Var2.f142004f = j;
        t7Var2.f142005g = j2;
        t7Var2.f142007i = bVar;
        t7Var2.f142006h = str;
        t7Var2.f142003e = str2;
        t7Var2.f142008j = 2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = t7Var2;
        C51501u7 u7Var = new C51501u7();
        u7Var.setBaseResponse(new C49966ja());
        u7Var.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = u7Var;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/audiencesendcommenttoreservegame";
        bVar2.f127069d = 4226;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiAudienceSendCommentToReserveGame", "init feedId:" + j + ", liveId:" + j2 + ", comment_msg:" + str + ", liveCookies size:" + bVar.f257327a.length);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51501u7) eu32, "resp");
        String str2 = this.f125285s;
        Log.m105924i(str2, "ljd [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
