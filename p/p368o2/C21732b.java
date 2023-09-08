package p368o2;

import java.util.ArrayList;
import p363n2.C21586b;
import p363n2.C21589e;
import p363n2.C21593h;
import p368o2.C21738f;

/* renamed from: o2.b */
public class C21732b extends C21743j {

    /* renamed from: k0 */
    public int f61510k0 = 0;

    /* renamed from: l0 */
    public ArrayList<C21745l> f61511l0 = new ArrayList<>(4);

    /* renamed from: m0 */
    public boolean f61512m0 = true;

    /* renamed from: a */
    public void mo34019a(C21589e eVar) {
        C21735e[] eVarArr;
        boolean z;
        int i;
        C21738f.C21739a aVar = C21738f.C21739a.MATCH_CONSTRAINT;
        C21738f.C21739a aVar2 = C21738f.C21739a.WRAP_CONTENT;
        C21735e[] eVarArr2 = this.f61551A;
        eVarArr2[0] = this.f61603s;
        eVarArr2[2] = this.f61604t;
        eVarArr2[1] = this.f61605u;
        eVarArr2[3] = this.f61606v;
        int i2 = 0;
        while (true) {
            eVarArr = this.f61551A;
            if (i2 >= eVarArr.length) {
                break;
            }
            C21735e eVar2 = eVarArr[i2];
            eVar2.f61538i = eVar.mo33843j(eVar2);
            i2++;
        }
        int i3 = this.f61510k0;
        if (i3 >= 0 && i3 < 4) {
            C21735e eVar3 = eVarArr[i3];
            int i4 = 0;
            while (true) {
                if (i4 >= this.f61648j0) {
                    z = false;
                    break;
                }
                C21738f fVar = this.f61647i0[i4];
                if ((this.f61512m0 || fVar.mo34020b()) && ((((i = this.f61510k0) == 0 || i == 1) && fVar.f61553C[0] == aVar) || ((i == 2 || i == 3) && fVar.f61553C[1] == aVar))) {
                    z = true;
                } else {
                    i4++;
                }
            }
            z = true;
            int i5 = this.f61510k0;
            if (i5 == 0 || i5 == 1 ? this.f61554D.f61553C[0] == aVar2 : this.f61554D.f61553C[1] == aVar2) {
                z = false;
            }
            for (int i6 = 0; i6 < this.f61648j0; i6++) {
                C21738f fVar2 = this.f61647i0[i6];
                if (this.f61512m0 || fVar2.mo34020b()) {
                    C21593h j = eVar.mo33843j(fVar2.f61551A[this.f61510k0]);
                    C21735e[] eVarArr3 = fVar2.f61551A;
                    int i7 = this.f61510k0;
                    eVarArr3[i7].f61538i = j;
                    if (i7 == 0 || i7 == 2) {
                        C21593h hVar = eVar3.f61538i;
                        C21586b k = eVar.mo33844k();
                        C21593h l = eVar.mo33845l();
                        l.f61153c = 0;
                        k.mo33830c(hVar, j, l, 0);
                        if (z) {
                            int c = (int) (k.f61129c.mo33822c(l) * -1.0f);
                            k.f61129c.mo33825f(eVar.mo33842i(1, (String) null), (float) c);
                        }
                        eVar.mo33836c(k);
                    } else {
                        C21593h hVar2 = eVar3.f61538i;
                        C21586b k2 = eVar.mo33844k();
                        C21593h l2 = eVar.mo33845l();
                        l2.f61153c = 0;
                        k2.mo33829b(hVar2, j, l2, 0);
                        if (z) {
                            int c2 = (int) (k2.f61129c.mo33822c(l2) * -1.0f);
                            k2.f61129c.mo33825f(eVar.mo33842i(1, (String) null), (float) c2);
                        }
                        eVar.mo33836c(k2);
                    }
                }
            }
            int i8 = this.f61510k0;
            if (i8 == 0) {
                eVar.mo33837d(this.f61605u.f61538i, this.f61603s.f61538i, 0, 6);
                if (!z) {
                    eVar.mo33837d(this.f61603s.f61538i, this.f61554D.f61605u.f61538i, 0, 5);
                }
            } else if (i8 == 1) {
                eVar.mo33837d(this.f61603s.f61538i, this.f61605u.f61538i, 0, 6);
                if (!z) {
                    eVar.mo33837d(this.f61603s.f61538i, this.f61554D.f61603s.f61538i, 0, 5);
                }
            } else if (i8 == 2) {
                eVar.mo33837d(this.f61606v.f61538i, this.f61604t.f61538i, 0, 6);
                if (!z) {
                    eVar.mo33837d(this.f61604t.f61538i, this.f61554D.f61606v.f61538i, 0, 5);
                }
            } else if (i8 == 3) {
                eVar.mo33837d(this.f61604t.f61538i, this.f61606v.f61538i, 0, 6);
                if (!z) {
                    eVar.mo33837d(this.f61604t.f61538i, this.f61554D.f61604t.f61538i, 0, 5);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo34020b() {
        return true;
    }

    /* renamed from: c */
    public void mo34021c(int i) {
        C21745l lVar;
        C21738f fVar = this.f61554D;
        if (fVar != null && ((C21740g) fVar).mo34061J(2)) {
            int i2 = this.f61510k0;
            if (i2 == 0) {
                lVar = this.f61603s.f61530a;
            } else if (i2 == 1) {
                lVar = this.f61605u.f61530a;
            } else if (i2 == 2) {
                lVar = this.f61604t.f61530a;
            } else if (i2 == 3) {
                lVar = this.f61606v.f61530a;
            } else {
                return;
            }
            lVar.f61655h = 5;
            if (i2 == 0 || i2 == 1) {
                this.f61604t.f61530a.mo34073k((C21745l) null, 0.0f);
                this.f61606v.f61530a.mo34073k((C21745l) null, 0.0f);
            } else {
                this.f61603s.f61530a.mo34073k((C21745l) null, 0.0f);
                this.f61605u.f61530a.mo34073k((C21745l) null, 0.0f);
            }
            this.f61511l0.clear();
            for (int i3 = 0; i3 < this.f61648j0; i3++) {
                C21738f fVar2 = this.f61647i0[i3];
                if (this.f61512m0 || fVar2.mo34020b()) {
                    int i4 = this.f61510k0;
                    C21745l lVar2 = i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? null : fVar2.f61606v.f61530a : fVar2.f61604t.f61530a : fVar2.f61605u.f61530a : fVar2.f61603s.f61530a;
                    if (lVar2 != null) {
                        this.f61511l0.add(lVar2);
                        lVar2.mo34078a(lVar);
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public void mo34022v() {
        super.mo34022v();
        this.f61511l0.clear();
    }

    /* renamed from: x */
    public void mo34023x() {
        C21745l lVar;
        float f;
        C21745l lVar2;
        int i = this.f61510k0;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                lVar = this.f61605u.f61530a;
            } else if (i == 2) {
                lVar = this.f61604t.f61530a;
            } else if (i == 3) {
                lVar = this.f61606v.f61530a;
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            lVar = this.f61603s.f61530a;
        }
        int size = this.f61511l0.size();
        C21745l lVar3 = null;
        int i2 = 0;
        while (i2 < size) {
            C21745l lVar4 = this.f61511l0.get(i2);
            if (lVar4.f61662b == 1) {
                int i3 = this.f61510k0;
                if (i3 == 0 || i3 == 2) {
                    f = lVar4.f61654g;
                    if (f < f2) {
                        lVar2 = lVar4.f61653f;
                    } else {
                        i2++;
                    }
                } else {
                    f = lVar4.f61654g;
                    if (f > f2) {
                        lVar2 = lVar4.f61653f;
                    } else {
                        i2++;
                    }
                }
                lVar3 = lVar2;
                f2 = f;
                i2++;
            } else {
                return;
            }
        }
        lVar.f61653f = lVar3;
        lVar.f61654g = f2;
        lVar.mo34079b();
        int i4 = this.f61510k0;
        if (i4 == 0) {
            this.f61605u.f61530a.mo34073k(lVar3, f2);
        } else if (i4 == 1) {
            this.f61603s.f61530a.mo34073k(lVar3, f2);
        } else if (i4 == 2) {
            this.f61606v.f61530a.mo34073k(lVar3, f2);
        } else if (i4 == 3) {
            this.f61604t.f61530a.mo34073k(lVar3, f2);
        }
    }
}
