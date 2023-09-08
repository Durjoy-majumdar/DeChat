package dj1;

import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import fj1.C45795b;
import gy3.C8480h;
import gy3.C87412m;
import je1.C46523h2;
import kt1.C46744d;
import o40.C61926c;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48828ba1;
import te3.C49335eu3;
import te3.C49712hj1;
import te3.C49966ja;
import te3.C64228aa1;
import te3.C64674r41;
import zc1.C66785b;

/* renamed from: dj1.b1 */
public final class C58275b1 extends C58286q<C48828ba1> {

    /* renamed from: t */
    public C45795b f166872t;

    /* renamed from: u */
    public C64674r41 f166873u;

    /* renamed from: v */
    public final String f166874v = "Finder.CgiFinderLiveTopComment";

    /* renamed from: w */
    public C64228aa1 f166875w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58275b1(C45795b bVar, C64674r41 r412, int i) {
        super((C49712hj1) null, 1, (C8480h) null);
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(bVar, "liveData");
        C87412m.m108594g(r412, "msg");
        this.f166872t = bVar;
        this.f166873u = r412;
        C64228aa1 aa12 = new C64228aa1();
        this.f166875w = aa12;
        aa12.f182046d = C46523h2.f125330a.mo71859a(6295);
        this.f166875w.f182048f = ((C55001u) this.f166872t.mo71262a(cls2)).f154420q.f182392d;
        this.f166875w.f182047e = ((C55001u) this.f166872t.mo71262a(cls2)).f154416j;
        C64228aa1 aa13 = this.f166875w;
        aa13.f182052j = this.f166873u.f185130j + '_' + C31543z5.m39455e() + '_' + ((C54991o) this.f166872t.mo71262a(cls)).mo75979Q3();
        this.f166875w.f182051i = C89349b.m111674a(((C55001u) this.f166872t.mo71262a(cls2)).f154417n);
        C64228aa1 aa14 = this.f166875w;
        aa14.f182049g = this.f166873u.f185129i;
        aa14.f182050h = i;
        aa14.f182053n = C61926c.m72671P(((C55001u) this.f166872t.mo71262a(cls2)).f154423t);
        C64228aa1 aa15 = this.f166875w;
        C66785b bVar2 = C66785b.f191882e;
        aa15.f182054o = bVar2.mo90662O5();
        this.f166875w.f182055p = ((C55001u) this.f166872t.mo71262a(cls2)).f154423t;
        this.f166875w.f182057r = this.f166873u.f185130j;
        ((C54991o) this.f166872t.mo71262a(cls)).f154216J2.add(this.f166875w.f182052j);
        C47350c.C47352b bVar3 = new C47350c.C47352b();
        bVar3.f127066a = this.f166875w;
        C48828ba1 ba12 = new C48828ba1();
        ba12.setBaseResponse(new C49966ja());
        bVar3.f127067b = ba12;
        bVar3.f127068c = "/cgi-bin/micromsg-bin/finderlivetopcomment";
        bVar3.f127069d = 6295;
        mo123453j(bVar3.mo72403a());
        Log.m105924i("Finder.CgiFinderLiveTopComment", "CgiFinderLiveTopComment init " + this.f166875w.f182048f + ',' + bVar2.mo90662O5() + ',' + this.f166873u.f185126f + " opType:" + this.f166875w.f182050h);
    }

    /* renamed from: M */
    public C46744d mo8509M() {
        return C46744d.Enable;
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        C87412m.m108594g((C48828ba1) eu32, "resp");
        String str2 = this.f166874v;
        Log.m105924i(str2, "[onCgiBack] errType=" + i + " errCode=" + i2 + " errMsg=" + str + " thread=" + Thread.currentThread());
    }
}
