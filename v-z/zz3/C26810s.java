package zz3;

import a04.C23604a;
import fy3.C32227p;
import gy3.C87412m;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import n04.C25134i1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25166p0;
import o04.C25315b;
import o04.C25318c;
import o04.C25320d;
import o04.C25323e;
import q04.C25520c;
import q04.C25521d;
import q04.C25522e;
import q04.C25523f;
import q04.C25524g;
import q04.C25526i;
import q04.C25528k;
import q04.C25529m;
import q04.C25530n;
import q04.C25531o;
import q04.C25535s;
import q04.C25536t;
import q04.C35757b;
import q04.C35758l;

/* renamed from: zz3.s */
public final class C26810s implements C25315b {

    /* renamed from: a */
    public final Map<C25144j1, C25144j1> f74550a;

    /* renamed from: b */
    public final C25318c.C25319a f74551b;

    /* renamed from: c */
    public final C25323e f74552c;

    /* renamed from: d */
    public final C25320d f74553d;

    /* renamed from: e */
    public final C32227p<C25143j0, C25143j0, Boolean> f74554e;

    public C26810s(Map<C25144j1, ? extends C25144j1> map, C25318c.C25319a aVar, C25323e eVar, C25320d dVar, C32227p<? super C25143j0, ? super C25143j0, Boolean> pVar) {
        C87412m.m108594g(aVar, "equalityAxioms");
        C87412m.m108594g(eVar, "kotlinTypeRefiner");
        C87412m.m108594g(dVar, "kotlinTypePreparator");
        this.f74550a = map;
        this.f74551b = aVar;
        this.f74552c = eVar;
        this.f74553d = dVar;
        this.f74554e = pVar;
    }

    /* renamed from: A */
    public boolean mo52425A(C25530n nVar) {
        return C25315b.C25316a.m32237R(this, nVar);
    }

    /* renamed from: B */
    public boolean mo52426B(C25526i iVar) {
        return C25315b.C25316a.m32230K(this, iVar);
    }

    /* renamed from: C */
    public C25531o mo52427C(C25530n nVar, int i) {
        return C25315b.C25316a.m32280r(this, nVar, i);
    }

    /* renamed from: D */
    public Collection<C25526i> mo52428D(C25530n nVar) {
        return C25315b.C25316a.m32265j0(this, nVar);
    }

    /* renamed from: E */
    public C25528k mo52429E(C25528k kVar, C35757b bVar) {
        return C25315b.C25316a.m32266k(this, kVar, bVar);
    }

    /* renamed from: F */
    public boolean mo52430F(C25530n nVar) {
        return C25315b.C25316a.m32231L(this, nVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (gy3.C87412m.m108589b(r0, r6) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (gy3.C87412m.m108589b(r3, r5) != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo52431G(q04.C25530n r5, q04.C25530n r6) {
        /*
            r4 = this;
            java.lang.String r0 = "c1"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "c2"
            gy3.C87412m.m108594g(r6, r0)
            boolean r0 = r5 instanceof n04.C25144j1
            java.lang.String r1 = "Failed requirement."
            if (r0 == 0) goto L_0x005e
            boolean r0 = r6 instanceof n04.C25144j1
            if (r0 == 0) goto L_0x0054
            boolean r0 = o04.C25315b.C25316a.m32246a(r4, r5, r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0053
            n04.j1 r5 = (n04.C25144j1) r5
            n04.j1 r6 = (n04.C25144j1) r6
            o04.c$a r0 = r4.f74551b
            boolean r0 = r0.mo52405a(r5, r6)
            if (r0 == 0) goto L_0x0029
            goto L_0x004c
        L_0x0029:
            java.util.Map<n04.j1, n04.j1> r0 = r4.f74550a
            if (r0 != 0) goto L_0x002e
            goto L_0x004e
        L_0x002e:
            java.lang.Object r0 = r0.get(r5)
            n04.j1 r0 = (n04.C25144j1) r0
            java.util.Map<n04.j1, n04.j1> r3 = r4.f74550a
            java.lang.Object r3 = r3.get(r6)
            n04.j1 r3 = (n04.C25144j1) r3
            if (r0 == 0) goto L_0x0044
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            if (r6 != 0) goto L_0x004c
        L_0x0044:
            if (r3 == 0) goto L_0x004e
            boolean r5 = gy3.C87412m.m108589b(r3, r5)
            if (r5 == 0) goto L_0x004e
        L_0x004c:
            r5 = 1
            goto L_0x004f
        L_0x004e:
            r5 = 0
        L_0x004f:
            if (r5 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            return r1
        L_0x0054:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L_0x005e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zz3.C26810s.mo52431G(q04.n, q04.n):boolean");
    }

    /* renamed from: H */
    public C25526i mo52397H(C25528k kVar, C25528k kVar2) {
        return C25315b.C25316a.m32270m(this, kVar, kVar2);
    }

    /* renamed from: I */
    public boolean mo52432I(C25530n nVar) {
        return C25315b.C25316a.m32228I(this, nVar);
    }

    /* renamed from: J */
    public C25529m mo52433J(C25528k kVar, int i) {
        C87412m.m108594g(kVar, "$receiver");
        boolean z = false;
        if (i >= 0 && i < mo52444V(kVar)) {
            z = true;
        }
        if (z) {
            return mo52478t(kVar, i);
        }
        return null;
    }

    /* renamed from: K */
    public boolean mo52434K(C25530n nVar) {
        return C25315b.C25316a.m32235P(this, nVar);
    }

    /* renamed from: L */
    public boolean mo52435L(C25530n nVar) {
        return C25315b.C25316a.m32234O(this, nVar);
    }

    /* renamed from: M */
    public boolean mo52436M(C25528k kVar) {
        return C25315b.C25316a.m32236Q(this, kVar);
    }

    /* renamed from: N */
    public boolean mo52437N(C25521d dVar) {
        C87412m.m108594g(dVar, "$receiver");
        return dVar instanceof C23604a;
    }

    /* renamed from: O */
    public boolean mo52438O(C25526i iVar) {
        C87412m.m108594g(iVar, "$receiver");
        return iVar instanceof C25166p0;
    }

    /* renamed from: P */
    public int mo52439P(C35758l lVar) {
        return C25315b.C25316a.m32261h0(this, lVar);
    }

    /* renamed from: Q */
    public boolean mo52440Q(C25529m mVar) {
        return C25315b.C25316a.m32241V(this, mVar);
    }

    /* renamed from: R */
    public C25536t mo52441R(C25529m mVar) {
        return C25315b.C25316a.m32221B(this, mVar);
    }

    /* renamed from: S */
    public C25528k mo52442S(C25526i iVar) {
        return C25315b.C25316a.m32275o0(this, iVar);
    }

    /* renamed from: T */
    public C25526i mo52316T(C25531o oVar) {
        return C25315b.C25316a.m32284v(this, oVar);
    }

    /* renamed from: U */
    public boolean mo52443U(C25528k kVar) {
        return C25315b.C25316a.m32242W(this, kVar);
    }

    /* renamed from: V */
    public int mo52444V(C25526i iVar) {
        return C25315b.C25316a.m32248b(this, iVar);
    }

    /* renamed from: W */
    public C25528k mo52445W(C25522e eVar) {
        return C25315b.C25316a.m32253d0(this, eVar);
    }

    /* renamed from: X */
    public boolean mo52446X(C25528k kVar) {
        C87412m.m108594g(kVar, "$receiver");
        return mo52432I(mo52402e(kVar));
    }

    /* renamed from: Y */
    public boolean mo52447Y(C25531o oVar, C25530n nVar) {
        return C25315b.C25316a.m32224E(this, oVar, nVar);
    }

    /* renamed from: Z */
    public C25526i mo52448Z(C25526i iVar) {
        return C25315b.C25316a.m32251c0(this, iVar);
    }

    /* renamed from: a */
    public C25528k mo52398a(C25526i iVar) {
        return C25315b.C25316a.m32262i(this, iVar);
    }

    /* renamed from: a0 */
    public C25520c mo52449a0(C25521d dVar) {
        return C25315b.C25316a.m32267k0(this, dVar);
    }

    /* renamed from: b */
    public C25528k mo52399b(C25524g gVar) {
        return C25315b.C25316a.m32273n0(this, gVar);
    }

    /* renamed from: b0 */
    public C25524g mo52450b0(C25526i iVar) {
        return C25315b.C25316a.m32258g(this, iVar);
    }

    /* renamed from: c */
    public C25528k mo52400c(C25528k kVar, boolean z) {
        return C25315b.C25316a.m32279q0(this, kVar, z);
    }

    /* renamed from: c0 */
    public boolean mo52451c0(C25526i iVar) {
        C87412m.m108594g(iVar, "$receiver");
        return (iVar instanceof C25528k) && mo52436M((C25528k) iVar);
    }

    /* renamed from: d */
    public C25521d mo52401d(C25528k kVar) {
        return C25315b.C25316a.m32252d(this, kVar);
    }

    /* renamed from: d0 */
    public boolean mo52452d0(C25526i iVar) {
        return C25315b.C25316a.m32238S(this, iVar);
    }

    /* renamed from: e */
    public C25530n mo52402e(C25528k kVar) {
        return C25315b.C25316a.m32271m0(this, kVar);
    }

    /* renamed from: e0 */
    public boolean mo52453e0(C25530n nVar) {
        return C25315b.C25316a.m32229J(this, nVar);
    }

    /* renamed from: f */
    public C25528k mo52403f(C25524g gVar) {
        return C25315b.C25316a.m32245Z(this, gVar);
    }

    /* renamed from: f0 */
    public C35757b mo52454f0(C25521d dVar) {
        return C25315b.C25316a.m32268l(this, dVar);
    }

    /* renamed from: g */
    public boolean mo52455g(C25528k kVar, C25528k kVar2) {
        return C25315b.C25316a.m32225F(this, kVar, kVar2);
    }

    /* renamed from: g0 */
    public int mo52456g0(C25530n nVar) {
        return C25315b.C25316a.m32255e0(this, nVar);
    }

    /* renamed from: h */
    public boolean mo52457h(C25526i iVar) {
        C87412m.m108594g(iVar, "$receiver");
        C25524g b0 = mo52450b0(iVar);
        return (b0 != null ? mo53768t0(b0) : null) != null;
    }

    /* renamed from: h0 */
    public boolean mo52458h0(C25526i iVar) {
        C87412m.m108594g(iVar, "$receiver");
        C25528k a = mo52398a(iVar);
        return (a != null ? mo52401d(a) : null) != null;
    }

    /* renamed from: i */
    public C25529m mo52459i(C25520c cVar) {
        return C25315b.C25316a.m32259g0(this, cVar);
    }

    /* renamed from: i0 */
    public C25536t mo52460i0(C25531o oVar) {
        return C25315b.C25316a.m32222C(this, oVar);
    }

    /* renamed from: j */
    public boolean mo52461j(C25528k kVar) {
        return C25315b.C25316a.m32239T(this, kVar);
    }

    /* renamed from: j0 */
    public boolean mo52462j0(C25521d dVar) {
        return C25315b.C25316a.m32240U(this, dVar);
    }

    /* renamed from: k */
    public C25529m mo52463k(C25526i iVar) {
        return C25315b.C25316a.m32264j(this, iVar);
    }

    /* renamed from: k0 */
    public boolean mo52317k0(C25530n nVar) {
        return C25315b.C25316a.m32233N(this, nVar);
    }

    /* renamed from: l */
    public C25526i mo52464l(C25521d dVar) {
        return C25315b.C25316a.m32249b0(this, dVar);
    }

    /* renamed from: l0 */
    public boolean mo52465l0(C25528k kVar) {
        return C25315b.C25316a.m32243X(this, kVar);
    }

    /* renamed from: m */
    public C25526i mo52466m(C25529m mVar) {
        return C25315b.C25316a.m32285w(this, mVar);
    }

    /* renamed from: m0 */
    public C25529m mo52467m0(C35758l lVar, int i) {
        return C25315b.C25316a.m32272n(this, lVar, i);
    }

    /* renamed from: n */
    public boolean mo52468n(C25528k kVar) {
        C87412m.m108594g(kVar, "$receiver");
        return mo52435L(mo52402e(kVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = mo52400c(r0, true);
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q04.C25526i mo52318n0(q04.C25526i r3) {
        /*
            r2 = this;
            java.lang.String r0 = "$receiver"
            gy3.C87412m.m108594g(r3, r0)
            q04.k r0 = r2.mo52398a(r3)
            if (r0 == 0) goto L_0x0013
            r1 = 1
            q04.k r0 = r2.mo52400c(r0, r1)
            if (r0 == 0) goto L_0x0013
            r3 = r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zz3.C26810s.mo52318n0(q04.i):q04.i");
    }

    /* renamed from: o */
    public C25134i1.C25135b mo52469o(C25528k kVar) {
        return C25315b.C25316a.m32263i0(this, kVar);
    }

    /* renamed from: o0 */
    public C25526i mo52470o0(C25526i iVar, boolean z) {
        return C25315b.C25316a.m32277p0(this, iVar, z);
    }

    /* renamed from: p */
    public C35758l mo52471p(C25528k kVar) {
        return C25315b.C25316a.m32250c(this, kVar);
    }

    /* renamed from: p0 */
    public C25531o mo52472p0(C25535s sVar) {
        return C25315b.C25316a.m32286x(this, sVar);
    }

    /* renamed from: q */
    public C25522e mo52473q(C25528k kVar) {
        return C25315b.C25316a.m32254e(this, kVar);
    }

    /* renamed from: q0 */
    public C25528k mo52474q0(C25526i iVar) {
        return C25315b.C25316a.m32247a0(this, iVar);
    }

    /* renamed from: r */
    public C25526i mo52475r(List<? extends C25526i> list) {
        return C25315b.C25316a.m32226G(this, list);
    }

    /* renamed from: r0 */
    public C25531o mo52476r0(C25530n nVar) {
        return C25315b.C25316a.m32287y(this, nVar);
    }

    /* renamed from: s */
    public C25526i mo52319s(C25526i iVar) {
        return C25315b.C25316a.m32288z(this, iVar);
    }

    /* renamed from: s0 */
    public List<C25528k> mo52477s0(C25528k kVar, C25530n nVar) {
        C87412m.m108594g(kVar, "$receiver");
        C87412m.m108594g(nVar, "constructor");
        return null;
    }

    /* renamed from: t */
    public C25529m mo52478t(C25526i iVar, int i) {
        return C25315b.C25316a.m32274o(this, iVar, i);
    }

    /* renamed from: t0 */
    public C25523f mo53768t0(C25524g gVar) {
        return C25315b.C25316a.m32256f(this, gVar);
    }

    /* renamed from: u */
    public Collection<C25526i> mo52480u(C25528k kVar) {
        return C25315b.C25316a.m32257f0(this, kVar);
    }

    /* renamed from: v */
    public boolean mo52482v(C25526i iVar) {
        C87412m.m108594g(iVar, "$receiver");
        return mo52425A(mo52485y(iVar)) && !mo52452d0(iVar);
    }

    /* renamed from: w */
    public boolean mo52483w(C25526i iVar) {
        C87412m.m108594g(iVar, "$receiver");
        return mo52436M(mo52474q0(iVar)) != mo52436M(mo52442S(iVar));
    }

    /* renamed from: x */
    public boolean mo52484x(C25530n nVar) {
        return C25315b.C25316a.m32227H(this, nVar);
    }

    /* renamed from: y */
    public C25530n mo52485y(C25526i iVar) {
        return C25315b.C25316a.m32269l0(this, iVar);
    }

    /* renamed from: z */
    public boolean mo52486z(C25526i iVar) {
        return C25315b.C25316a.m32232M(this, iVar);
    }
}
