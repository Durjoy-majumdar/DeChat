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
import te3.C51169rx0;
import te3.C51311sx0;

/* renamed from: je1.w0 */
public final class C46544w0 extends C60625c<C51311sx0> {

    /* renamed from: s */
    public final String f125414s = "Finder.CgiFinderLiveDislikeBanner";

    /* renamed from: t */
    public C51169rx0 f125415t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46544w0(long j, long j2, C89349b bVar, String str, String str2, String str3) {
        super((C49712hj1) null, (C9487b) null, 3, (C8480h) null);
        C87412m.m108594g(bVar, "liveCookies");
        C87412m.m108594g(str, "finderUsername");
        C87412m.m108594g(str2, "nonce_id");
        C87412m.m108594g(str3, "dislikeId");
        C51169rx0 rx02 = new C51169rx0();
        this.f125415t = rx02;
        rx02.f141196d = C46523h2.f125330a.mo71859a(4268);
        C51169rx0 rx03 = this.f125415t;
        rx03.f141199g = j;
        rx03.f141200h = j2;
        rx03.f141198f = bVar;
        rx03.f141197e = str;
        rx03.f141201i = str3;
        rx03.f141202j = str2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = rx03;
        C51311sx0 sx02 = new C51311sx0();
        sx02.setBaseResponse(new C49966ja());
        sx02.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = sx02;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderlivedislikebanner";
        bVar2.f127069d = 4268;
        mo123453j(bVar2.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveDislikeBanner", "init feedId:" + j + ", liveId:" + j2 + ", finderUsername:" + str + ", liveCookies size:" + bVar.f257327a.length + ", dislikeId:" + str3);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C51311sx0) eu32, "resp");
        String str2 = this.f125414s;
        Log.m105924i(str2, "ljd [onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + ' ');
    }
}
