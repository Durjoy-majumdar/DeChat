package p869y0;

import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110095a;
import p1140p1.C110096b;
import p1140p1.C110098d;
import p1140p1.C110099e;
import p1140p1.C110100f;
import p410k0.C108793e;
import p721v0.C65503j;
import rx3.C13598b0;

/* renamed from: y0.h */
public final class C112317h implements C110098d<C112317h>, C110096b {

    /* renamed from: d */
    public final C32226l<C66476a0, C13598b0> f336322d;

    /* renamed from: e */
    public C112317h f336323e;

    /* renamed from: f */
    public final C108793e<C112317h> f336324f = new C108793e<>(new C112317h[16], 0);

    /* renamed from: g */
    public final C108793e<C112321l> f336325g = new C108793e<>(new C112321l[16], 0);

    public C112317h(C32226l<? super C66476a0, C13598b0> lVar) {
        C87412m.m108594g(lVar, "onFocusEvent");
        this.f336322d = lVar;
    }

    /* renamed from: S */
    public <R> R mo74969S(R r, C32227p<? super C65503j.C65506c, ? super R, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(this, r);
    }

    /* renamed from: U */
    public void mo145808U(C110099e eVar) {
        C87412m.m108594g(eVar, "scope");
        C110095a aVar = C112311e.f336315a;
        C112317h hVar = (C112317h) eVar.mo161499a(aVar);
        if (!C87412m.m108589b(hVar, this.f336323e)) {
            C112317h hVar2 = this.f336323e;
            if (hVar2 != null) {
                hVar2.f336324f.mo159869k(this);
                hVar2.mo164049g(this.f336325g);
            }
            this.f336323e = hVar;
            if (hVar != null) {
                hVar.f336324f.mo159860b(this);
                hVar.mo164046d(this.f336325g);
            }
        }
        this.f336323e = (C112317h) eVar.mo161499a(aVar);
    }

    /* renamed from: a */
    public boolean mo74970a(C32226l<? super C65503j.C65506c, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        return C65503j.C65506c.C65507a.m77190a(this, lVar);
    }

    /* renamed from: b */
    public final void mo164045b(C112321l lVar) {
        C87412m.m108594g(lVar, "focusModifier");
        this.f336325g.mo159860b(lVar);
        C112317h hVar = this.f336323e;
        if (hVar != null) {
            hVar.mo164045b(lVar);
        }
    }

    /* renamed from: c */
    public <R> R mo74971c(R r, C32227p<? super R, ? super C65503j.C65506c, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* renamed from: d */
    public final void mo164046d(C108793e<C112321l> eVar) {
        C108793e<C112321l> eVar2 = this.f336325g;
        eVar2.mo159862d(eVar2.f325786f, eVar);
        C112317h hVar = this.f336323e;
        if (hVar != null) {
            hVar.mo164046d(eVar);
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if (r5 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        r5 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo164047e() {
        /*
            r10 = this;
            y0.b0 r0 = p869y0.C112306b0.Inactive
            k0.e<y0.l> r1 = r10.f336325g
            int r2 = r1.f325786f
            if (r2 == 0) goto L_0x005c
            r3 = 0
            r4 = 1
            if (r2 == r4) goto L_0x0054
            r5 = 0
            if (r2 <= 0) goto L_0x003f
            T[] r1 = r1.f325784d
            r6 = r5
        L_0x0012:
            r7 = r1[r3]
            y0.l r7 = (p869y0.C112321l) r7
            y0.b0 r8 = r7.f336333g
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x0035
            if (r8 == r4) goto L_0x0035
            r9 = 2
            if (r8 == r9) goto L_0x0035
            r9 = 3
            if (r8 == r9) goto L_0x0030
            r9 = 4
            if (r8 == r9) goto L_0x0035
            r7 = 5
            if (r8 == r7) goto L_0x002d
            goto L_0x0038
        L_0x002d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            goto L_0x0038
        L_0x0030:
            if (r5 != 0) goto L_0x0038
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            goto L_0x0038
        L_0x0035:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = r7
        L_0x0038:
            int r3 = r3 + 1
            if (r3 < r2) goto L_0x0012
            r1 = r5
            r5 = r6
            goto L_0x0040
        L_0x003f:
            r1 = r5
        L_0x0040:
            if (r5 == 0) goto L_0x0049
            y0.b0 r2 = r5.f336333g
            if (r2 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r0 = r2
            goto L_0x005c
        L_0x0049:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 == 0) goto L_0x005c
            y0.b0 r0 = p869y0.C112306b0.Deactivated
            goto L_0x005c
        L_0x0054:
            T[] r0 = r1.f325784d
            r0 = r0[r3]
            y0.l r0 = (p869y0.C112321l) r0
            y0.b0 r0 = r0.f336333g
        L_0x005c:
            fy3.l<y0.a0, rx3.b0> r1 = r10.f336322d
            r1.invoke(r0)
            y0.h r0 = r10.f336323e
            if (r0 == 0) goto L_0x0068
            r0.mo164047e()
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p869y0.C112317h.mo164047e():void");
    }

    /* renamed from: f */
    public final void mo164048f(C112321l lVar) {
        C87412m.m108594g(lVar, "focusModifier");
        this.f336325g.mo159869k(lVar);
        C112317h hVar = this.f336323e;
        if (hVar != null) {
            hVar.mo164048f(lVar);
        }
    }

    /* renamed from: g */
    public final void mo164049g(C108793e<C112321l> eVar) {
        this.f336325g.mo159870l(eVar);
        C112317h hVar = this.f336323e;
        if (hVar != null) {
            hVar.mo164049g(eVar);
        }
    }

    public C110100f<C112317h> getKey() {
        return C112311e.f336315a;
    }

    public Object getValue() {
        return this;
    }

    /* renamed from: i0 */
    public C65503j mo74972i0(C65503j jVar) {
        C87412m.m108594g(jVar, "other");
        return C65503j.C65505b.m77189a(this, jVar);
    }
}
