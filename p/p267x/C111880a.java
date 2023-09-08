package p267x;

import androidx.compose.p002ui.platform.C54172f1;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import p1166z0.C112535a;
import p1166z0.C112536b;
import p1166z0.C112540f;
import p1166z0.C112541g;
import p1166z0.C112543i;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p436a1.C103237h0;
import p436a1.C103252o0;
import p436a1.C103257q;
import p436a1.C103266t0;
import p436a1.C103272w;
import p436a1.C103274x;
import p436a1.C27726j0;
import p721v0.C65503j;
import p835c1.C104231f;
import p835c1.C104233g;
import p835c1.C104236j;
import p835c1.C54601d;
import p868x0.C111982h;
import rx3.C13603j;
import rx3.C90109v;

/* renamed from: x.a */
public final class C111880a extends C54172f1 implements C111982h {

    /* renamed from: e */
    public final C103272w f334964e;

    /* renamed from: f */
    public final C103257q f334965f;

    /* renamed from: g */
    public final float f334966g;

    /* renamed from: h */
    public final C103266t0 f334967h;

    /* renamed from: i */
    public C112545k f334968i;

    /* renamed from: j */
    public C103237h0 f334969j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111880a(C103272w wVar, C103257q qVar, float f, C103266t0 t0Var, C32226l lVar, int i, C8480h hVar) {
        super(lVar);
        wVar = (i & 1) != 0 ? null : wVar;
        qVar = (i & 2) != 0 ? null : qVar;
        f = (i & 4) != 0 ? 1.0f : f;
        this.f334964e = wVar;
        this.f334965f = qVar;
        this.f334966g = f;
        this.f334967h = t0Var;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: V */
    public void mo90316V(C54601d dVar) {
        C103237h0 h0Var;
        String str;
        String str2;
        C27726j0 j0Var;
        C27726j0 j0Var2;
        C54601d dVar2 = dVar;
        C87412m.m108594g(dVar2, "<this>");
        if (this.f334967h == C103252o0.f304457a) {
            C103272w wVar = this.f334964e;
            if (wVar != null) {
                C104231f.C104232a.m139087f(dVar, wVar.f304517a, 0, 0, 0.0f, (C104233g) null, (C103274x) null, 0, 126, (Object) null);
            }
            C103257q qVar = this.f334965f;
            if (qVar != null) {
                C104231f.C104232a.m139086e(dVar, qVar, 0, 0, this.f334966g, (C104233g) null, (C103274x) null, 0, 118, (Object) null);
            }
        } else {
            long e = dVar.mo145819e();
            C112545k kVar = this.f334968i;
            int i = C112545k.f336975d;
            boolean z = false;
            if ((kVar instanceof C112545k) && e == kVar.f336976a) {
                z = true;
            }
            if (!z || dVar.getLayoutDirection() != null) {
                h0Var = this.f334967h.mo143025a(dVar.mo145819e(), dVar.getLayoutDirection(), dVar2);
            } else {
                h0Var = this.f334969j;
                C87412m.m108591d(h0Var);
            }
            C103237h0 h0Var2 = h0Var;
            C103272w wVar2 = this.f334964e;
            if (wVar2 != null) {
                long j = wVar2.f304517a;
                C104236j jVar = C104236j.f308530a;
                C87412m.m108594g(h0Var2, "outline");
                C87412m.m108594g(jVar, "style");
                if (h0Var2 instanceof C103237h0.C103238b) {
                    C112541g gVar = ((C103237h0.C103238b) h0Var2).f304446a;
                    dVar.mo145816W(j, C112540f.m153745a(gVar.f336961a, gVar.f336962b), C112546l.m153761a(gVar.f336963c - gVar.f336961a, gVar.f336964d - gVar.f336962b), 1.0f, jVar, (C103274x) null, 3);
                    str = "style";
                    str2 = "outline";
                } else {
                    C104236j jVar2 = jVar;
                    String str3 = "outline";
                    String str4 = "style";
                    if (h0Var2 instanceof C103237h0.C103239c) {
                        C103237h0.C103239c cVar = (C103237h0.C103239c) h0Var2;
                        j0Var2 = cVar.f304448b;
                        if (j0Var2 != null) {
                            str = str4;
                            str2 = str3;
                        } else {
                            C112543i iVar = cVar.f304447a;
                            str2 = str3;
                            str = str4;
                            dVar.mo145828u0(j, C112540f.m153745a(iVar.f336965a, iVar.f336966b), C112546l.m153761a(iVar.f336967c - iVar.f336965a, iVar.f336968d - iVar.f336966b), C112536b.m153732b(C112535a.m153728b(iVar.f336972h), 0.0f, 2, (Object) null), jVar2, 1.0f, (C103274x) null, 3);
                        }
                    } else {
                        str = str4;
                        str2 = str3;
                        if (h0Var2 instanceof C103237h0.C27725a) {
                            C103237h0.C27725a aVar = (C103237h0.C27725a) h0Var2;
                            j0Var2 = null;
                        } else {
                            throw new C13603j();
                        }
                    }
                    dVar.mo145824m0(j0Var2, j, 1.0f, jVar2, (C103274x) null, 3);
                }
            } else {
                str2 = "outline";
                str = "style";
            }
            C103257q qVar2 = this.f334965f;
            if (qVar2 != null) {
                float f = this.f334966g;
                C104236j jVar3 = C104236j.f308530a;
                C87412m.m108594g(h0Var2, str2);
                C87412m.m108594g(jVar3, str);
                if (h0Var2 instanceof C103237h0.C103238b) {
                    C112541g gVar2 = ((C103237h0.C103238b) h0Var2).f304446a;
                    dVar.mo145826p(qVar2, C112540f.m153745a(gVar2.f336961a, gVar2.f336962b), C112546l.m153761a(gVar2.f336963c - gVar2.f336961a, gVar2.f336964d - gVar2.f336962b), f, jVar3, (C103274x) null, 3);
                } else {
                    if (h0Var2 instanceof C103237h0.C103239c) {
                        C103237h0.C103239c cVar2 = (C103237h0.C103239c) h0Var2;
                        j0Var = cVar2.f304448b;
                        if (j0Var == null) {
                            C112543i iVar2 = cVar2.f304447a;
                            dVar.mo145823l0(qVar2, C112540f.m153745a(iVar2.f336965a, iVar2.f336966b), C112546l.m153761a(iVar2.f336967c - iVar2.f336965a, iVar2.f336968d - iVar2.f336966b), C112536b.m153732b(C112535a.m153728b(iVar2.f336972h), 0.0f, 2, (Object) null), f, jVar3, (C103274x) null, 3);
                        }
                    } else if (h0Var2 instanceof C103237h0.C27725a) {
                        C103237h0.C27725a aVar2 = (C103237h0.C27725a) h0Var2;
                        j0Var = null;
                    } else {
                        throw new C13603j();
                    }
                    dVar.mo145827r0(j0Var, qVar2, f, jVar3, (C103274x) null, 3);
                }
            }
            this.f334969j = h0Var2;
            this.f334968i = new C112545k(dVar.mo145819e());
        }
        dVar.mo75508h0();
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public boolean equals(Object obj) {
        C111880a aVar = obj instanceof C111880a ? (C111880a) obj : null;
        if (aVar == null || !C87412m.m108589b(this.f334964e, aVar.f334964e) || !C87412m.m108589b(this.f334965f, aVar.f334965f)) {
            return false;
        }
        return ((this.f334966g > aVar.f334966g ? 1 : (this.f334966g == aVar.f334966g ? 0 : -1)) == 0) && C87412m.m108589b(this.f334967h, aVar.f334967h);
    }

    public int hashCode() {
        C103272w wVar = this.f334964e;
        int i = 0;
        int a = (wVar != null ? C90109v.m112737a(wVar.f304517a) : 0) * 31;
        C103257q qVar = this.f334965f;
        if (qVar != null) {
            i = qVar.hashCode();
        }
        return ((((a + i) * 31) + Float.floatToIntBits(this.f334966g)) * 31) + this.f334967h.hashCode();
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }

    public String toString() {
        return "Background(color=" + this.f334964e + ", brush=" + this.f334965f + ", alpha = " + this.f334966g + ", shape=" + this.f334967h + ')';
    }
}
