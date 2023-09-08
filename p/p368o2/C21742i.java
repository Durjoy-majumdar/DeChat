package p368o2;

import java.util.ArrayList;
import p363n2.C21586b;
import p363n2.C21589e;
import p363n2.C21593h;
import p368o2.C21735e;
import p368o2.C21738f;

/* renamed from: o2.i */
public class C21742i extends C21738f {

    /* renamed from: i0 */
    public float f61642i0 = -1.0f;

    /* renamed from: j0 */
    public int f61643j0 = -1;

    /* renamed from: k0 */
    public int f61644k0 = -1;

    /* renamed from: l0 */
    public C21735e f61645l0 = this.f61604t;

    /* renamed from: m0 */
    public int f61646m0;

    public C21742i() {
        this.f61646m0 = 0;
        this.f61552B.clear();
        this.f61552B.add(this.f61645l0);
        int length = this.f61551A.length;
        for (int i = 0; i < length; i++) {
            this.f61551A[i] = this.f61645l0;
        }
    }

    /* renamed from: F */
    public void mo34035F(C21589e eVar) {
        if (this.f61554D != null) {
            int m = eVar.mo33846m(this.f61645l0);
            if (this.f61646m0 == 1) {
                this.f61559I = m;
                this.f61560J = 0;
                mo34057z(this.f61554D.mo34043k());
                mo34033D(0);
                return;
            }
            this.f61559I = 0;
            this.f61560J = m;
            mo34033D(this.f61554D.mo34049q());
            mo34057z(0);
        }
    }

    /* renamed from: G */
    public void mo34066G(int i) {
        if (this.f61646m0 != i) {
            this.f61646m0 = i;
            this.f61552B.clear();
            if (this.f61646m0 == 1) {
                this.f61645l0 = this.f61603s;
            } else {
                this.f61645l0 = this.f61604t;
            }
            this.f61552B.add(this.f61645l0);
            int length = this.f61551A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f61551A[i2] = this.f61645l0;
            }
        }
    }

    /* renamed from: a */
    public void mo34019a(C21589e eVar) {
        C21738f.C21739a aVar = C21738f.C21739a.WRAP_CONTENT;
        C21740g gVar = (C21740g) this.f61554D;
        if (gVar != null) {
            C21735e f = gVar.mo34038f(C21735e.C21737b.LEFT);
            C21735e f2 = gVar.mo34038f(C21735e.C21737b.RIGHT);
            C21738f fVar = this.f61554D;
            boolean z = true;
            boolean z2 = fVar != null && fVar.f61553C[0] == aVar;
            if (this.f61646m0 == 0) {
                f = gVar.mo34038f(C21735e.C21737b.TOP);
                f2 = gVar.mo34038f(C21735e.C21737b.BOTTOM);
                C21738f fVar2 = this.f61554D;
                if (fVar2 == null || fVar2.f61553C[1] != aVar) {
                    z = false;
                }
                z2 = z;
            }
            if (this.f61643j0 != -1) {
                C21593h j = eVar.mo33843j(this.f61645l0);
                eVar.mo33837d(j, eVar.mo33843j(f), this.f61643j0, 6);
                if (z2) {
                    eVar.mo33839f(eVar.mo33843j(f2), j, 0, 5);
                }
            } else if (this.f61644k0 != -1) {
                C21593h j2 = eVar.mo33843j(this.f61645l0);
                C21593h j3 = eVar.mo33843j(f2);
                eVar.mo33837d(j2, j3, -this.f61644k0, 6);
                if (z2) {
                    eVar.mo33839f(j2, eVar.mo33843j(f), 0, 5);
                    eVar.mo33839f(j3, j2, 0, 5);
                }
            } else if (this.f61642i0 != -1.0f) {
                C21593h j4 = eVar.mo33843j(this.f61645l0);
                C21593h j5 = eVar.mo33843j(f);
                C21593h j6 = eVar.mo33843j(f2);
                float f3 = this.f61642i0;
                C21586b k = eVar.mo33844k();
                k.f61129c.mo33825f(j4, -1.0f);
                k.f61129c.mo33825f(j5, 1.0f - f3);
                k.f61129c.mo33825f(j6, f3);
                eVar.mo33836c(k);
            }
        }
    }

    /* renamed from: b */
    public boolean mo34020b() {
        return true;
    }

    /* renamed from: c */
    public void mo34021c(int i) {
        C21738f.C21739a aVar = C21738f.C21739a.FIXED;
        C21738f fVar = this.f61554D;
        if (fVar != null) {
            if (this.f61646m0 == 1) {
                this.f61604t.f61530a.mo34069g(1, fVar.f61604t.f61530a, 0);
                this.f61606v.f61530a.mo34069g(1, fVar.f61604t.f61530a, 0);
                int i2 = this.f61643j0;
                if (i2 != -1) {
                    this.f61603s.f61530a.mo34069g(1, fVar.f61603s.f61530a, i2);
                    this.f61605u.f61530a.mo34069g(1, fVar.f61603s.f61530a, this.f61643j0);
                    return;
                }
                int i3 = this.f61644k0;
                if (i3 != -1) {
                    this.f61603s.f61530a.mo34069g(1, fVar.f61605u.f61530a, -i3);
                    this.f61605u.f61530a.mo34069g(1, fVar.f61605u.f61530a, -this.f61644k0);
                    return;
                }
                float f = this.f61642i0;
                if (f != -1.0f && fVar.f61553C[0] == aVar) {
                    int i4 = (int) (((float) fVar.f61555E) * f);
                    this.f61603s.f61530a.mo34069g(1, fVar.f61603s.f61530a, i4);
                    this.f61605u.f61530a.mo34069g(1, fVar.f61603s.f61530a, i4);
                    return;
                }
                return;
            }
            this.f61603s.f61530a.mo34069g(1, fVar.f61603s.f61530a, 0);
            this.f61605u.f61530a.mo34069g(1, fVar.f61603s.f61530a, 0);
            int i5 = this.f61643j0;
            if (i5 != -1) {
                this.f61604t.f61530a.mo34069g(1, fVar.f61604t.f61530a, i5);
                this.f61606v.f61530a.mo34069g(1, fVar.f61604t.f61530a, this.f61643j0);
                return;
            }
            int i6 = this.f61644k0;
            if (i6 != -1) {
                this.f61604t.f61530a.mo34069g(1, fVar.f61606v.f61530a, -i6);
                this.f61606v.f61530a.mo34069g(1, fVar.f61606v.f61530a, -this.f61644k0);
                return;
            }
            float f2 = this.f61642i0;
            if (f2 != -1.0f && fVar.f61553C[1] == aVar) {
                int i7 = (int) (((float) fVar.f61556F) * f2);
                this.f61604t.f61530a.mo34069g(1, fVar.f61604t.f61530a, i7);
                this.f61606v.f61530a.mo34069g(1, fVar.f61604t.f61530a, i7);
            }
        }
    }

    /* renamed from: f */
    public C21735e mo34038f(C21735e.C21737b bVar) {
        switch (bVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f61646m0 == 1) {
                    return this.f61645l0;
                }
                break;
            case 2:
            case 4:
                if (this.f61646m0 == 0) {
                    return this.f61645l0;
                }
                break;
        }
        throw new AssertionError(bVar.name());
    }

    /* renamed from: g */
    public ArrayList<C21735e> mo34039g() {
        return this.f61552B;
    }
}
