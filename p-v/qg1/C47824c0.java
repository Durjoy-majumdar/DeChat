package qg1;

import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import fj1.C45795b;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import it1.C60625c;
import je1.C46523h2;
import jp3.C9487b;
import ob0.C117747y;
import ob0.C47350c;
import ok1.C62042e;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C26236u;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C49966ja;
import te3.C49992jh1;
import te3.C50131kh1;
import te3.C50263lh1;
import te3.C51163rv3;
import te3.C51741vu0;
import te3.C52013xs0;
import zc1.C66785b;

/* renamed from: qg1.c0 */
public final class C47824c0 extends C60625c<C50131kh1> {

    /* renamed from: v */
    public static final C47825a f128387v = new C47825a((C8480h) null);

    /* renamed from: s */
    public C32229r<? super Integer, ? super Integer, ? super String, ? super C50131kh1, C13598b0> f128388s;

    /* renamed from: t */
    public final String f128389t = "Finder.CgiFinderPostLiveAppMsg";

    /* renamed from: u */
    public C49992jh1 f128390u;

    /* renamed from: qg1.c0$a */
    public static final class C47825a {
        public C47825a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C52013xs0 mo72575a(C49765hx0 hx02, String str, String str2, int i) {
            C87412m.m108594g(hx02, "atUser");
            C87412m.m108594g(str, "replyContent");
            C52013xs0 xs02 = new C52013xs0();
            xs02.f144902d = hx02;
            C51741vu0 vu02 = new C51741vu0();
            vu02.f143698d = str;
            C50263lh1 lh12 = new C50263lh1();
            lh12.f137422d = str2;
            vu02.f143699e = lh12;
            xs02.f144906h = C89349b.m111674a(vu02.toByteArray());
            xs02.f144903e = 20002;
            xs02.f144912q = i;
            xs02.f144911p = i > 0 ? 1 : 0;
            xs02.f144904f = C75592q0.m90789s() + System.currentTimeMillis();
            return xs02;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47824c0(C52013xs0 xs02, C45795b bVar, C49712hj1 hj12, C32229r<? super Integer, ? super Integer, ? super String, ? super C50131kh1, C13598b0> rVar) {
        super(hj12, (C9487b) null, 2, (C8480h) null);
        Class cls = C55001u.class;
        C87412m.m108594g(xs02, "appMsg");
        C87412m.m108594g(bVar, "roomData");
        Integer num = null;
        int i = 2;
        this.f128388s = rVar;
        C49992jh1 jh12 = new C49992jh1();
        this.f128390u = jh12;
        jh12.f136120e = C89349b.m111674a(((C55001u) ((C54991o) bVar.mo71262a(C54991o.class)).business(cls)).f154417n);
        C49992jh1 jh13 = this.f128390u;
        jh13.f136121f = xs02;
        jh13.f136122g = ((C55001u) bVar.mo71262a(cls)).f154420q.f182392d;
        this.f128390u.f136123h = ((C55001u) bVar.mo71262a(cls)).f154416j;
        this.f128390u.f136124i = ((C55001u) bVar.mo71262a(cls)).f154423t;
        this.f128390u.f136125j = C62042e.f176370a.mo87027N0() ? 1 : i;
        this.f128390u.f136126n = C66785b.f191882e.mo90662O5();
        C49992jh1 jh14 = this.f128390u;
        C46523h2 h2Var = C46523h2.f125330a;
        jh14.f136119d = h2Var.mo71859a(6888);
        h2Var.mo71865g(this.f128390u.f136119d, C26236u.m33719b(new C13604l(Integer.valueOf(hj12 != null ? hj12.f134677n : 0), Long.valueOf(((C55001u) bVar.mo71262a(cls)).f154416j))), (C49712hj1) null);
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = this.f128390u;
        C50131kh1 kh12 = new C50131kh1();
        kh12.setBaseResponse(new C49966ja());
        kh12.getBaseResponse().f135956e = new C51163rv3();
        bVar2.f127067b = kh12;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/finderpostliveappmsg";
        bVar2.f127069d = 6888;
        mo123453j(bVar2.mo72403a());
        StringBuilder sb = new StringBuilder();
        sb.append("CgiFinderPostLiveAppMsg init ");
        sb.append(this.f128390u.f136122g);
        sb.append(",msgType ");
        C52013xs0 xs03 = this.f128390u.f136121f;
        sb.append(xs03 != null ? Integer.valueOf(xs03.f144903e) : null);
        sb.append(",is_float:");
        C52013xs0 xs04 = this.f128390u.f136121f;
        sb.append(xs04 != null ? Integer.valueOf(xs04.f144911p) : null);
        sb.append(",floatType:");
        C52013xs0 xs05 = this.f128390u.f136121f;
        sb.append(xs05 != null ? Integer.valueOf(xs05.f144912q) : num);
        Log.m105924i("Finder.CgiFinderPostLiveAppMsg", sb.toString());
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C50131kh1 kh12 = (C50131kh1) eu32;
        C87412m.m108594g(kh12, "resp");
        String str2 = this.f128389t;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
        C32229r<? super Integer, ? super Integer, ? super String, ? super C50131kh1, C13598b0> rVar = this.f128388s;
        if (rVar != null) {
            rVar.mo162I(Integer.valueOf(i), Integer.valueOf(i2), str, kh12);
        }
    }
}
