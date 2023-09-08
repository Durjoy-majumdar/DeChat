package w33;

import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import l33.C109247e;
import p156gj.C107835h0;
import v33.C111382a;
import v33.C111384c;
import x33.C112039b;
import z33.C112595h;

/* renamed from: w33.x */
public final class C111728x {

    /* renamed from: a */
    public C111726v f334526a;

    /* renamed from: b */
    public Size f334527b;

    /* renamed from: c */
    public Size f334528c;

    /* renamed from: d */
    public int f334529d;

    /* renamed from: e */
    public int f334530e;

    /* renamed from: f */
    public long f334531f;

    /* renamed from: g */
    public boolean f334532g;

    /* renamed from: h */
    public long f334533h;

    /* renamed from: i */
    public boolean f334534i;

    /* renamed from: j */
    public long f334535j;

    /* renamed from: k */
    public boolean f334536k;

    /* renamed from: l */
    public int f334537l;

    /* renamed from: m */
    public int f334538m;

    /* renamed from: n */
    public int f334539n;

    /* renamed from: o */
    public final int f334540o = (C112595h.m153917a() / 2);

    public C111728x() {
        C111726v vVar = new C111726v();
        this.f334526a = vVar;
        C111384c.f333462a = new C111714a();
        C111384c.f333463b = new C111719c();
        C111384c.f333464c = new C111727w();
        C111384c.f333465d = new C111725u();
        C111384c.f333466e = new C111717b();
        C111384c.f333467f = new C111721d();
        C111382a.f333440a.add(vVar);
    }

    /* renamed from: a */
    public final void mo163439a(boolean z) {
        C111721d dVar = C111384c.f333467f;
        if (dVar != null) {
            if (z && dVar.f334457e == 0) {
                long j = (C107835h0.f322845b.f322806e != 1 || C109247e.vx0().f333455o) ? C109247e.vx0().f333458r : C109247e.vx0().f333459s;
                if (j != 0) {
                    dVar.f334457e = Util.milliSecondsToNow(j);
                    Log.m105924i("MicroMsg.VoIPProfileReport", "local first frame come cost " + dVar.f334457e);
                }
            } else if (!z && dVar.f334458f == 0 && C109247e.vx0().f333459s != 0) {
                long j2 = C109247e.vx0().f333459s;
                if (j2 != 0) {
                    dVar.f334458f = Util.milliSecondsToNow(j2);
                    Log.m105924i("MicroMsg.VoIPProfileReport", "remote first frame come cost " + dVar.f334458f);
                }
            }
        }
        if (z) {
            if (this.f334532g) {
                this.f334532g = false;
                C111725u uVar = C111384c.f333465d;
                if (uVar != null) {
                    uVar.mo163432n(true, Util.milliSecondsToNow(this.f334531f));
                }
            }
            this.f334537l++;
            this.f334531f = Util.nowMilliSecond();
        } else {
            if (this.f334534i) {
                this.f334534i = false;
                C111725u uVar2 = C111384c.f333465d;
                if (uVar2 != null) {
                    uVar2.mo163432n(false, Util.milliSecondsToNow(this.f334533h));
                }
            }
            this.f334538m++;
            this.f334533h = Util.nowMilliSecond();
        }
        C111725u uVar3 = C111384c.f333465d;
        if (uVar3 != null) {
            uVar3.mo163429k(z);
        }
    }

    /* renamed from: b */
    public final void mo163440b(boolean z, int i) {
        if (z && i != this.f334529d) {
            this.f334529d = i;
            this.f334526a.mo162594a(29);
        } else if (!z && this.f334530e != i) {
            this.f334530e = i;
            this.f334526a.mo162594a(32);
        }
    }

    /* renamed from: c */
    public final void mo163441c(boolean z, Size size) {
        C87412m.m108594g(size, "size");
        if (z && (!C87412m.m108589b(size, this.f334527b) || this.f334527b == null)) {
            this.f334527b = size;
            this.f334526a.mo162594a(27);
        } else if (z) {
        } else {
            if (!C87412m.m108589b(size, this.f334528c) || this.f334528c == null) {
                this.f334528c = size;
                this.f334526a.mo162594a(30);
            }
        }
    }

    /* renamed from: d */
    public final void mo163442d() {
        C112039b.C112040a aVar;
        if (this.f334534i) {
            this.f334534i = false;
            C111725u uVar = C111384c.f333465d;
            if (uVar != null) {
                uVar.mo163432n(false, Util.milliSecondsToNow(this.f334533h));
            }
        }
        if (this.f334536k) {
            this.f334536k = false;
            C111717b bVar = C111384c.f333466e;
            if (bVar != null) {
                bVar.mo163394b(Util.milliSecondsToNow(this.f334535j));
            }
        }
        if (this.f334532g) {
            this.f334532g = false;
            C111725u uVar2 = C111384c.f333465d;
            if (uVar2 != null) {
                uVar2.mo163432n(true, Util.milliSecondsToNow(this.f334531f));
            }
        }
        C111725u uVar3 = C111384c.f333465d;
        if (uVar3 != null) {
            uVar3.mo163429k(false);
        }
        C111725u uVar4 = C111384c.f333465d;
        if (uVar4 != null) {
            uVar4.mo163429k(true);
        }
        C111719c cVar = C111384c.f333463b;
        if (cVar != null && (aVar = cVar.f334429a.get(cVar.f334431c)) != null) {
            aVar.mo163758b();
        }
    }
}
