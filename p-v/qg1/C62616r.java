package qg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import er1.C58782w0;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import o40.C61937h;
import ob0.C117747y;
import ob0.C47350c;
import p671qy.C63344h;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C50336m11;
import te3.C51163rv3;
import te3.C64508l11;
import te3.C64741tx0;
import zc1.C66785b;

/* renamed from: qg1.r */
public final class C62616r extends C60625c<C50336m11> {

    /* renamed from: s */
    public final String f177820s;

    /* renamed from: t */
    public C64508l11 f177821t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62616r(String str, int i, boolean z) {
        super((C49712hj1) null, (C9487b) null, 2, (C8480h) null);
        C87412m.m108594g(str, "appid");
        this.f177820s = "Finder.CgiFinderLiveGetUserGameConfig";
        C64508l11 l112 = new C64508l11();
        this.f177821t = l112;
        l112.f184010d = C46523h2.f125330a.mo71859a(5274);
        this.f177821t.f184011e = C66785b.f191882e.mo90662O5();
        C64508l11 l113 = this.f177821t;
        l113.f184012f = str;
        l113.f184013g = i;
        l113.f184014h = C58782w0.f168290a.mo83846e();
        C64508l11 l114 = this.f177821t;
        l114.f184019p = z;
        C64741tx0 tx02 = new C64741tx0();
        tx02.f185693d = ((C63344h) C86312j.m106911c(C63344h.class)).mo88245QC();
        l114.f184020q = tx02;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = this.f177821t;
        C50336m11 m112 = new C50336m11();
        m112.setBaseResponse(new C49966ja());
        m112.getBaseResponse().f135956e = new C51163rv3();
        bVar.f127067b = m112;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivegetusergameconfig";
        bVar.f127069d = 5274;
        mo123453j(bVar.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveGetUserGameConfig", "init " + str + ", " + i);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50336m11 m112 = (C50336m11) eu32;
        C87412m.m108594g(m112, "resp");
        String str2 = this.f177820s;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread() + " resp=" + C61937h.m72709h(m112));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C62616r(String str, int i, boolean z, int i2, C8480h hVar) {
        this(str, i, (i2 & 4) != 0 ? false : z);
    }
}
