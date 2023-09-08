package o04;

import b04.C23659o;
import d04.C24442a;
import gy3.C24560g0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n04.C25102a0;
import n04.C25103a1;
import n04.C25109c0;
import n04.C25116e;
import n04.C25119f0;
import n04.C25124h0;
import n04.C25134i1;
import n04.C25143j0;
import n04.C25144j1;
import n04.C25146k0;
import n04.C25153l0;
import n04.C25154l1;
import n04.C25158m1;
import n04.C25173r0;
import n04.C25176s0;
import n04.C25177t;
import n04.C25180t1;
import n04.C25184u1;
import n04.C25186v0;
import n04.C25187v1;
import n04.C25190w0;
import n04.C25198y1;
import n04.C25199z;
import n04.C25202z1;
import p04.C25416i;
import p04.C25417j;
import q04.C25519a;
import q04.C25520c;
import q04.C25521d;
import q04.C25522e;
import q04.C25523f;
import q04.C25524g;
import q04.C25526i;
import q04.C25527j;
import q04.C25528k;
import q04.C25529m;
import q04.C25530n;
import q04.C25531o;
import q04.C25532p;
import q04.C25533q;
import q04.C25535s;
import q04.C25536t;
import q04.C35757b;
import q04.C35758l;
import r04.C26094c;
import rx3.C13603j;
import sx3.C110818d0;
import sx3.C36907w;
import ty3.C22558j;
import ty3.C26336h;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C22827d;
import wy3.C22935h;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26453f;
import wy3.C26455f1;
import wy3.C26519x;
import zz3.C26798j;

/* renamed from: o04.b */
public interface C25315b extends C25184u1, C25532p {

    /* renamed from: o04.b$a */
    public static final class C25316a {

        /* renamed from: o04.b$a$a */
        public static final class C25317a extends C25134i1.C25135b.C25136a {

            /* renamed from: a */
            public final /* synthetic */ C25315b f71819a;

            /* renamed from: b */
            public final /* synthetic */ C25180t1 f71820b;

            public C25317a(C25315b bVar, C25180t1 t1Var) {
                this.f71819a = bVar;
                this.f71820b = t1Var;
            }

            /* renamed from: a */
            public C25528k mo52285a(C25134i1 i1Var, C25526i iVar) {
                C87412m.m108594g(i1Var, "state");
                C87412m.m108594g(iVar, "type");
                C25315b bVar = this.f71819a;
                C25180t1 t1Var = this.f71820b;
                C25528k q0 = bVar.mo52474q0(iVar);
                C87412m.m108592e(q0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                C25143j0 i = t1Var.mo52313i((C25143j0) q0, C25202z1.INVARIANT);
                C87412m.m108593f(i, "substitutor.safeSubstitu…VARIANT\n                )");
                C25528k a = bVar.mo52398a(i);
                C87412m.m108591d(a);
                return a;
            }
        }

        /* renamed from: A */
        public static List<C25526i> m32220A(C25315b bVar, C25531o oVar) {
            C87412m.m108594g(oVar, "$receiver");
            if (oVar instanceof C26446d1) {
                List<C25143j0> upperBounds = ((C26446d1) oVar).getUpperBounds();
                C87412m.m108593f(upperBounds, "this.upperBounds");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C24560g0.m30725a(oVar.getClass())).toString());
        }

        /* renamed from: B */
        public static C25536t m32221B(C25315b bVar, C25529m mVar) {
            C87412m.m108594g(mVar, "$receiver");
            if (mVar instanceof C25158m1) {
                C25202z1 a = ((C25158m1) mVar).mo52295a();
                C87412m.m108593f(a, "this.projectionKind");
                return C25533q.m33029a(a);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C24560g0.m30725a(mVar.getClass())).toString());
        }

        /* renamed from: C */
        public static C25536t m32222C(C25315b bVar, C25531o oVar) {
            C87412m.m108594g(oVar, "$receiver");
            if (oVar instanceof C26446d1) {
                C25202z1 o = ((C26446d1) oVar).mo53423o();
                C87412m.m108593f(o, "this.variance");
                return C25533q.m33029a(o);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C24560g0.m30725a(oVar.getClass())).toString());
        }

        /* renamed from: D */
        public static boolean m32223D(C25315b bVar, C25526i iVar, C22826c cVar) {
            C87412m.m108594g(iVar, "$receiver");
            C87412m.m108594g(cVar, "fqName");
            if (iVar instanceof C25143j0) {
                return ((C25143j0) iVar).getAnnotations().mo51479q(cVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: E */
        public static boolean m32224E(C25315b bVar, C25531o oVar, C25530n nVar) {
            C87412m.m108594g(oVar, "$receiver");
            if (oVar instanceof C26446d1) {
                if (nVar == null ? true : nVar instanceof C25144j1) {
                    return C26094c.m33428h((C26446d1) oVar, (C25144j1) nVar, (Set) null, 4, (Object) null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C24560g0.m30725a(oVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C24560g0.m30725a(oVar.getClass())).toString());
        }

        /* renamed from: F */
        public static boolean m32225F(C25315b bVar, C25528k kVar, C25528k kVar2) {
            C87412m.m108594g(kVar, "a");
            C87412m.m108594g(kVar2, "b");
            if (!(kVar instanceof C25176s0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
            } else if (kVar2 instanceof C25176s0) {
                return ((C25176s0) kVar).mo37079I0() == ((C25176s0) kVar2).mo37079I0();
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar2 + ", " + C24560g0.m30725a(kVar2.getClass())).toString());
            }
        }

        /* renamed from: G */
        public static C25526i m32226G(C25315b bVar, List<? extends C25526i> list) {
            C25176s0 s0Var;
            C87412m.m108594g(list, "types");
            int size = list.size();
            if (size == 0) {
                throw new IllegalStateException("Expected some types".toString());
            } else if (size == 1) {
                return (C25198y1) C110818d0.m150938j0(list);
            } else {
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                Iterator<T> it = list.iterator();
                boolean z = false;
                boolean z2 = false;
                while (it.hasNext()) {
                    C25198y1 y1Var = (C25198y1) it.next();
                    z = z || C25153l0.m31968a(y1Var);
                    if (y1Var instanceof C25176s0) {
                        s0Var = (C25176s0) y1Var;
                    } else if (!(y1Var instanceof C25109c0)) {
                        throw new C13603j();
                    } else if (C25102a0.m31816a(y1Var)) {
                        return y1Var;
                    } else {
                        s0Var = ((C25109c0) y1Var).f71540e;
                        z2 = true;
                    }
                    arrayList.add(s0Var);
                }
                if (z) {
                    return C25417j.m32698c(C25416i.INTERSECTION_OF_ERROR_TYPES, list.toString());
                } else if (!z2) {
                    return C25336r.f71847a.mo52488b(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
                    Iterator<T> it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(C25119f0.m31894d((C25198y1) it4.next()));
                    }
                    C25336r rVar = C25336r.f71847a;
                    return C25146k0.m31957c(rVar.mo52488b(arrayList), rVar.mo52488b(arrayList2));
                }
            }
        }

        /* renamed from: H */
        public static boolean m32227H(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                return C26336h.m33834K((C25144j1) nVar, C26343l.C26344a.f73409b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: I */
        public static boolean m32228I(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                return ((C25144j1) nVar).mo37094o() instanceof C26447e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: J */
        public static boolean m32229J(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C22935h o = ((C25144j1) nVar).mo37094o();
                C26447e eVar = o instanceof C26447e ? (C26447e) o : null;
                if (eVar == null) {
                    return false;
                }
                return (!(eVar.mo51802j() == C26442c0.FINAL && eVar.mo51796f() != C26453f.ENUM_CLASS) || eVar.mo51796f() == C26453f.ENUM_ENTRY || eVar.mo51796f() == C26453f.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: K */
        public static boolean m32230K(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            C25528k a = bVar.mo52398a(iVar);
            return (a != null ? bVar.mo52473q(a) : null) != null;
        }

        /* renamed from: L */
        public static boolean m32231L(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                return ((C25144j1) nVar).mo37095p();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: M */
        public static boolean m32232M(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                return C25153l0.m31968a((C25143j0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: N */
        public static boolean m32233N(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C22935h o = ((C25144j1) nVar).mo37094o();
                C26455f1<C25176s0> f1Var = null;
                C26447e eVar = o instanceof C26447e ? (C26447e) o : null;
                if (eVar != null) {
                    f1Var = eVar.mo51789K();
                }
                return f1Var instanceof C26519x;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: O */
        public static boolean m32234O(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                return nVar instanceof C23659o;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: P */
        public static boolean m32235P(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                return nVar instanceof C25124h0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: Q */
        public static boolean m32236Q(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (kVar instanceof C25176s0) {
                return ((C25176s0) kVar).mo37082L0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: R */
        public static boolean m32237R(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                return C26336h.m33834K((C25144j1) nVar, C26343l.C26344a.f73411c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: S */
        public static boolean m32238S(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                return C25187v1.m32087g((C25143j0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: T */
        public static boolean m32239T(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (kVar instanceof C25143j0) {
                return C26336h.m33831H((C25143j0) kVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: U */
        public static boolean m32240U(C25315b bVar, C25521d dVar) {
            C87412m.m108594g(dVar, "$receiver");
            if (dVar instanceof C25326g) {
                return ((C25326g) dVar).f71830j;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C24560g0.m30725a(dVar.getClass())).toString());
        }

        /* renamed from: V */
        public static boolean m32241V(C25315b bVar, C25529m mVar) {
            C87412m.m108594g(mVar, "$receiver");
            if (mVar instanceof C25158m1) {
                return ((C25158m1) mVar).mo52296b();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C24560g0.m30725a(mVar.getClass())).toString());
        }

        /* renamed from: W */
        public static boolean m32242W(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (kVar instanceof C25176s0) {
                C25143j0 j0Var = (C25143j0) kVar;
                if (j0Var instanceof C25116e) {
                    return true;
                }
                return (j0Var instanceof C25177t) && (((C25177t) j0Var).f71624e instanceof C25116e);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: X */
        public static boolean m32243X(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (kVar instanceof C25176s0) {
                C25143j0 j0Var = (C25143j0) kVar;
                if (j0Var instanceof C25103a1) {
                    return true;
                }
                return (j0Var instanceof C25177t) && (((C25177t) j0Var).f71624e instanceof C25103a1);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: Y */
        public static boolean m32244Y(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C22935h o = ((C25144j1) nVar).mo37094o();
                return o != null && C26336h.m33835L(o);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: Z */
        public static C25528k m32245Z(C25315b bVar, C25524g gVar) {
            C87412m.m108594g(gVar, "$receiver");
            if (gVar instanceof C25109c0) {
                return ((C25109c0) gVar).f71540e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C24560g0.m30725a(gVar.getClass())).toString());
        }

        /* renamed from: a */
        public static boolean m32246a(C25315b bVar, C25530n nVar, C25530n nVar2) {
            C87412m.m108594g(nVar, "c1");
            C87412m.m108594g(nVar2, "c2");
            if (!(nVar instanceof C25144j1)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
            } else if (nVar2 instanceof C25144j1) {
                return C87412m.m108589b(nVar, nVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar2 + ", " + C24560g0.m30725a(nVar2.getClass())).toString());
            }
        }

        /* renamed from: a0 */
        public static C25528k m32247a0(C25315b bVar, C25526i iVar) {
            C25528k f;
            C87412m.m108594g(iVar, "$receiver");
            C25524g b0 = bVar.mo52450b0(iVar);
            if (b0 != null && (f = bVar.mo52403f(b0)) != null) {
                return f;
            }
            C25528k a = bVar.mo52398a(iVar);
            C87412m.m108591d(a);
            return a;
        }

        /* renamed from: b */
        public static int m32248b(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                return ((C25143j0) iVar).mo37079I0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: b0 */
        public static C25526i m32249b0(C25315b bVar, C25521d dVar) {
            C87412m.m108594g(dVar, "$receiver");
            if (dVar instanceof C25326g) {
                return ((C25326g) dVar).f71827g;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C24560g0.m30725a(dVar.getClass())).toString());
        }

        /* renamed from: c */
        public static C35758l m32250c(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (kVar instanceof C25176s0) {
                return (C35758l) kVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: c0 */
        public static C25526i m32251c0(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25198y1) {
                return C25190w0.m32110a((C25198y1) iVar, false);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: d */
        public static C25521d m32252d(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (!(kVar instanceof C25176s0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
            } else if (kVar instanceof C25186v0) {
                return bVar.mo52401d(((C25186v0) kVar).f71639e);
            } else {
                if (kVar instanceof C25326g) {
                    return (C25326g) kVar;
                }
                return null;
            }
        }

        /* renamed from: d0 */
        public static C25528k m32253d0(C25315b bVar, C25522e eVar) {
            C87412m.m108594g(eVar, "$receiver");
            if (eVar instanceof C25177t) {
                return ((C25177t) eVar).f71624e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + eVar + ", " + C24560g0.m30725a(eVar.getClass())).toString());
        }

        /* renamed from: e */
        public static C25522e m32254e(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (!(kVar instanceof C25176s0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
            } else if (kVar instanceof C25177t) {
                return (C25177t) kVar;
            } else {
                return null;
            }
        }

        /* renamed from: e0 */
        public static int m32255e0(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                return ((C25144j1) nVar).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: f */
        public static C25523f m32256f(C25315b bVar, C25524g gVar) {
            C87412m.m108594g(gVar, "$receiver");
            if (!(gVar instanceof C25109c0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C24560g0.m30725a(gVar.getClass())).toString());
            } else if (gVar instanceof C25199z) {
                return (C25199z) gVar;
            } else {
                return null;
            }
        }

        /* renamed from: f0 */
        public static Collection<C25526i> m32257f0(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            C25530n e = bVar.mo52402e(kVar);
            if (e instanceof C23659o) {
                return ((C23659o) e).f67848c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: g */
        public static C25524g m32258g(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                C25198y1 N0 = ((C25143j0) iVar).mo52229N0();
                if (N0 instanceof C25109c0) {
                    return (C25109c0) N0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: g0 */
        public static C25529m m32259g0(C25315b bVar, C25520c cVar) {
            C87412m.m108594g(cVar, "$receiver");
            if (cVar instanceof C25327i) {
                return ((C25327i) cVar).f71831a;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + C24560g0.m30725a(cVar.getClass())).toString());
        }

        /* renamed from: h */
        public static C25527j m32260h(C25315b bVar, C25524g gVar) {
            C87412m.m108594g(gVar, "$receiver");
            if (!(gVar instanceof C25109c0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C24560g0.m30725a(gVar.getClass())).toString());
            } else if (gVar instanceof C25173r0) {
                return (C25173r0) gVar;
            } else {
                return null;
            }
        }

        /* renamed from: h0 */
        public static int m32261h0(C25315b bVar, C35758l lVar) {
            C87412m.m108594g(lVar, "$receiver");
            if (lVar instanceof C25528k) {
                return bVar.mo52444V((C25526i) lVar);
            }
            if (lVar instanceof C25519a) {
                return ((C25519a) lVar).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + C24560g0.m30725a(lVar.getClass())).toString());
        }

        /* renamed from: i */
        public static C25528k m32262i(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                C25198y1 N0 = ((C25143j0) iVar).mo52229N0();
                if (N0 instanceof C25176s0) {
                    return (C25176s0) N0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: i0 */
        public static C25134i1.C25135b m32263i0(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "type");
            if (kVar instanceof C25176s0) {
                return new C25317a(bVar, C25180t1.m32044e(C25154l1.f71605b.mo52292a((C25143j0) kVar)));
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: j */
        public static C25529m m32264j(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                return C26094c.m33421a((C25143j0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: j0 */
        public static Collection<C25526i> m32265j0(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                Collection<C25143j0> r = ((C25144j1) nVar).mo37096r();
                C87412m.m108593f(r, "this.supertypes");
                return r;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x018b  */
        /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static q04.C25528k m32266k(o04.C25315b r22, q04.C25528k r23, q04.C35757b r24) {
            /*
                r0 = r23
                java.lang.String r1 = "type"
                gy3.C87412m.m108594g(r0, r1)
                java.lang.String r1 = "status"
                r11 = r24
                gy3.C87412m.m108594g(r11, r1)
                boolean r1 = r0 instanceof n04.C25176s0
                if (r1 == 0) goto L_0x01a0
                n04.s0 r0 = (n04.C25176s0) r0
                n04.z1 r1 = n04.C25202z1.INVARIANT
                java.util.List r2 = r0.mo37079I0()
                int r2 = r2.size()
                n04.j1 r3 = r0.mo37081K0()
                java.util.List r3 = r3.getParameters()
                int r3 = r3.size()
                r12 = 0
                if (r2 == r3) goto L_0x002e
                goto L_0x005d
            L_0x002e:
                java.util.List r13 = r0.mo37079I0()
                boolean r2 = r13 instanceof java.util.Collection
                r14 = 0
                r3 = 1
                if (r2 == 0) goto L_0x003f
                boolean r2 = r13.isEmpty()
                if (r2 == 0) goto L_0x003f
                goto L_0x005b
            L_0x003f:
                java.util.Iterator r2 = r13.iterator()
            L_0x0043:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x005b
                java.lang.Object r4 = r2.next()
                n04.m1 r4 = (n04.C25158m1) r4
                n04.z1 r4 = r4.mo52295a()
                if (r4 != r1) goto L_0x0057
                r4 = 1
                goto L_0x0058
            L_0x0057:
                r4 = 0
            L_0x0058:
                if (r4 != 0) goto L_0x0043
                r3 = 0
            L_0x005b:
                if (r3 == 0) goto L_0x0060
            L_0x005d:
                r6 = r12
                goto L_0x0189
            L_0x0060:
                n04.j1 r2 = r0.mo37081K0()
                java.util.List r2 = r2.getParameters()
                java.lang.String r3 = "type.constructor.parameters"
                gy3.C87412m.m108593f(r2, r3)
                java.util.List r2 = sx3.C110818d0.m150908F0(r13, r2)
                java.util.ArrayList r15 = new java.util.ArrayList
                r3 = 10
                int r3 = sx3.C36907w.m41090l(r2, r3)
                r15.<init>(r3)
                java.util.ArrayList r2 = (java.util.ArrayList) r2
                java.util.Iterator r16 = r2.iterator()
            L_0x0082:
                boolean r2 = r16.hasNext()
                if (r2 == 0) goto L_0x00e9
                java.lang.Object r2 = r16.next()
                rx3.l r2 = (rx3.C13604l) r2
                A r3 = r2.f38555d
                r5 = r3
                n04.m1 r5 = (n04.C25158m1) r5
                B r2 = r2.f38556e
                r8 = r2
                wy3.d1 r8 = (wy3.C26446d1) r8
                n04.z1 r2 = r5.mo52295a()
                if (r2 != r1) goto L_0x009f
                goto L_0x00e5
            L_0x009f:
                boolean r2 = r5.mo52296b()
                if (r2 != 0) goto L_0x00b8
                n04.z1 r2 = r5.mo52295a()
                n04.z1 r3 = n04.C25202z1.IN_VARIANCE
                if (r2 != r3) goto L_0x00b8
                n04.j0 r2 = r5.getType()
                n04.y1 r2 = r2.mo52229N0()
                r17 = r2
                goto L_0x00ba
            L_0x00b8:
                r17 = r12
            L_0x00ba:
                o04.g r18 = new o04.g
                java.lang.String r2 = "parameter"
                gy3.C87412m.m108593f(r8, r2)
                o04.i r19 = new o04.i
                r20 = 0
                r7 = 0
                r9 = 6
                r21 = 0
                r6 = 0
                r10 = 0
                r4 = r19
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r7 = 0
                r8 = 0
                r9 = 56
                r2 = r18
                r3 = r24
                r5 = r17
                r6 = r20
                r10 = r21
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                n04.m1 r5 = r04.C26094c.m33421a(r18)
            L_0x00e5:
                r15.add(r5)
                goto L_0x0082
            L_0x00e9:
                n04.l1$a r2 = n04.C25154l1.f71605b
                n04.j1 r3 = r0.mo37081K0()
                n04.p1 r2 = r2.mo52293b(r3, r15)
                n04.t1 r2 = n04.C25180t1.m32044e(r2)
                int r3 = r13.size()
            L_0x00fb:
                if (r14 >= r3) goto L_0x0188
                java.lang.Object r4 = r13.get(r14)
                n04.m1 r4 = (n04.C25158m1) r4
                java.lang.Object r5 = r15.get(r14)
                n04.m1 r5 = (n04.C25158m1) r5
                n04.z1 r6 = r4.mo52295a()
                if (r6 == r1) goto L_0x0184
                n04.j1 r6 = r0.mo37081K0()
                java.util.List r6 = r6.getParameters()
                java.lang.Object r6 = r6.get(r14)
                wy3.d1 r6 = (wy3.C26446d1) r6
                java.util.List r6 = r6.getUpperBounds()
                java.lang.String r7 = "type.constructor.parameters[index].upperBounds"
                gy3.C87412m.m108593f(r6, r7)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r6 = r6.iterator()
            L_0x012f:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x014d
                java.lang.Object r8 = r6.next()
                n04.j0 r8 = (n04.C25143j0) r8
                o04.d$a r9 = o04.C25320d.C25321a.f71822a
                n04.j0 r8 = r2.mo52313i(r8, r1)
                n04.y1 r8 = r8.mo52229N0()
                n04.y1 r8 = r9.mo52291a(r8)
                r7.add(r8)
                goto L_0x012f
            L_0x014d:
                boolean r6 = r4.mo52296b()
                if (r6 != 0) goto L_0x016a
                n04.z1 r6 = r4.mo52295a()
                n04.z1 r8 = n04.C25202z1.OUT_VARIANCE
                if (r6 != r8) goto L_0x016a
                o04.d$a r6 = o04.C25320d.C25321a.f71822a
                n04.j0 r4 = r4.getType()
                n04.y1 r4 = r4.mo52229N0()
                n04.y1 r4 = r6.mo52291a(r4)
                goto L_0x016b
            L_0x016a:
                r4 = r12
            L_0x016b:
                n04.j0 r5 = r5.getType()
                java.lang.String r6 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType"
                gy3.C87412m.m108592e(r5, r6)
                o04.g r5 = (o04.C25326g) r5
                o04.i r5 = r5.f71826f
                r5.getClass()
                r5.f71836f = r4
                o04.j r4 = new o04.j
                r4.<init>(r7)
                r5.f71832b = r4
            L_0x0184:
                int r14 = r14 + 1
                goto L_0x00fb
            L_0x0188:
                r6 = r15
            L_0x0189:
                if (r6 == 0) goto L_0x019f
                n04.g1 r4 = r0.mo37080J0()
                n04.j1 r5 = r0.mo37081K0()
                boolean r7 = r0.mo37082L0()
                r8 = 0
                r9 = 16
                r10 = 0
                n04.s0 r12 = n04.C25146k0.m31961g(r4, r5, r6, r7, r8, r9, r10)
            L_0x019f:
                return r12
            L_0x01a0:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ClassicTypeSystemContext couldn't handle: "
                r1.append(r2)
                r1.append(r0)
                java.lang.String r2 = ", "
                r1.append(r2)
                java.lang.Class r0 = r23.getClass()
                ny3.d r0 = gy3.C24560g0.m30725a(r0)
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o04.C25315b.C25316a.m32266k(o04.b, q04.k, q04.b):q04.k");
        }

        /* renamed from: k0 */
        public static C25520c m32267k0(C25315b bVar, C25521d dVar) {
            C87412m.m108594g(dVar, "$receiver");
            if (dVar instanceof C25326g) {
                return ((C25326g) dVar).f71826f;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C24560g0.m30725a(dVar.getClass())).toString());
        }

        /* renamed from: l */
        public static C35757b m32268l(C25315b bVar, C25521d dVar) {
            C87412m.m108594g(dVar, "$receiver");
            if (dVar instanceof C25326g) {
                return ((C25326g) dVar).f71825e;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + dVar + ", " + C24560g0.m30725a(dVar.getClass())).toString());
        }

        /* renamed from: l0 */
        public static C25530n m32269l0(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            C25528k a = bVar.mo52398a(iVar);
            if (a == null) {
                a = bVar.mo52474q0(iVar);
            }
            return bVar.mo52402e(a);
        }

        /* renamed from: m */
        public static C25526i m32270m(C25315b bVar, C25528k kVar, C25528k kVar2) {
            C87412m.m108594g(kVar, "lowerBound");
            C87412m.m108594g(kVar2, "upperBound");
            if (!(kVar instanceof C25176s0)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C24560g0.m30725a(bVar.getClass())).toString());
            } else if (kVar2 instanceof C25176s0) {
                return C25146k0.m31957c((C25176s0) kVar, (C25176s0) kVar2);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + bVar + ", " + C24560g0.m30725a(bVar.getClass())).toString());
            }
        }

        /* renamed from: m0 */
        public static C25530n m32271m0(C25315b bVar, C25528k kVar) {
            C87412m.m108594g(kVar, "$receiver");
            if (kVar instanceof C25176s0) {
                return ((C25176s0) kVar).mo37081K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: n */
        public static C25529m m32272n(C25315b bVar, C35758l lVar, int i) {
            C87412m.m108594g(lVar, "$receiver");
            if (lVar instanceof C25528k) {
                return bVar.mo52478t((C25526i) lVar, i);
            }
            if (lVar instanceof C25519a) {
                Object obj = ((C25519a) lVar).get(i);
                C87412m.m108593f(obj, "get(index)");
                return (C25529m) obj;
            }
            throw new IllegalStateException(("unknown type argument list type: " + lVar + ", " + C24560g0.m30725a(lVar.getClass())).toString());
        }

        /* renamed from: n0 */
        public static C25528k m32273n0(C25315b bVar, C25524g gVar) {
            C87412m.m108594g(gVar, "$receiver");
            if (gVar instanceof C25109c0) {
                return ((C25109c0) gVar).f71541f;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + gVar + ", " + C24560g0.m30725a(gVar.getClass())).toString());
        }

        /* renamed from: o */
        public static C25529m m32274o(C25315b bVar, C25526i iVar, int i) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                return ((C25143j0) iVar).mo37079I0().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: o0 */
        public static C25528k m32275o0(C25315b bVar, C25526i iVar) {
            C25528k b;
            C87412m.m108594g(iVar, "$receiver");
            C25524g b0 = bVar.mo52450b0(iVar);
            if (b0 != null && (b = bVar.mo52399b(b0)) != null) {
                return b;
            }
            C25528k a = bVar.mo52398a(iVar);
            C87412m.m108591d(a);
            return a;
        }

        /* renamed from: p */
        public static List<C25529m> m32276p(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                return ((C25143j0) iVar).mo37079I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }

        /* renamed from: p0 */
        public static C25526i m32277p0(C25315b bVar, C25526i iVar, boolean z) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25528k) {
                return bVar.mo52400c((C25528k) iVar, z);
            }
            if (iVar instanceof C25524g) {
                C25524g gVar = (C25524g) iVar;
                return bVar.mo52397H(bVar.mo52400c(bVar.mo52403f(gVar), z), bVar.mo52400c(bVar.mo52399b(gVar), z));
            }
            throw new IllegalStateException("sealed".toString());
        }

        /* renamed from: q */
        public static C22827d m32278q(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C22935h o = ((C25144j1) nVar).mo37094o();
                C87412m.m108592e(o, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C24442a.m30541h((C26447e) o);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: q0 */
        public static C25528k m32279q0(C25315b bVar, C25528k kVar, boolean z) {
            C87412m.m108594g(kVar, "$receiver");
            if (kVar instanceof C25176s0) {
                return ((C25176s0) kVar).mo37084O0(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + kVar + ", " + C24560g0.m30725a(kVar.getClass())).toString());
        }

        /* renamed from: r */
        public static C25531o m32280r(C25315b bVar, C25530n nVar, int i) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C26446d1 d1Var = ((C25144j1) nVar).getParameters().get(i);
                C87412m.m108593f(d1Var, "this.parameters[index]");
                return d1Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: s */
        public static List<C25531o> m32281s(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                List<C26446d1> parameters = ((C25144j1) nVar).getParameters();
                C87412m.m108593f(parameters, "this.parameters");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: t */
        public static C22558j m32282t(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C22935h o = ((C25144j1) nVar).mo37094o();
                C87412m.m108592e(o, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C26336h.m33839s((C26447e) o);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: u */
        public static C22558j m32283u(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C22935h o = ((C25144j1) nVar).mo37094o();
                C87412m.m108592e(o, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return C26336h.m33840u((C26447e) o);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: v */
        public static C25526i m32284v(C25315b bVar, C25531o oVar) {
            C87412m.m108594g(oVar, "$receiver");
            if (oVar instanceof C26446d1) {
                return C26094c.m33426f((C26446d1) oVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + oVar + ", " + C24560g0.m30725a(oVar.getClass())).toString());
        }

        /* renamed from: w */
        public static C25526i m32285w(C25315b bVar, C25529m mVar) {
            C87412m.m108594g(mVar, "$receiver");
            if (mVar instanceof C25158m1) {
                return ((C25158m1) mVar).getType().mo52229N0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + mVar + ", " + C24560g0.m30725a(mVar.getClass())).toString());
        }

        /* renamed from: x */
        public static C25531o m32286x(C25315b bVar, C25535s sVar) {
            C87412m.m108594g(sVar, "$receiver");
            if (sVar instanceof C25333m) {
                return ((C25333m) sVar).mo52424a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + sVar + ", " + C24560g0.m30725a(sVar.getClass())).toString());
        }

        /* renamed from: y */
        public static C25531o m32287y(C25315b bVar, C25530n nVar) {
            C87412m.m108594g(nVar, "$receiver");
            if (nVar instanceof C25144j1) {
                C22935h o = ((C25144j1) nVar).mo37094o();
                if (o instanceof C26446d1) {
                    return (C26446d1) o;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + nVar + ", " + C24560g0.m30725a(nVar.getClass())).toString());
        }

        /* renamed from: z */
        public static C25526i m32288z(C25315b bVar, C25526i iVar) {
            C87412m.m108594g(iVar, "$receiver");
            if (iVar instanceof C25143j0) {
                return C26798j.m35242e((C25143j0) iVar);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + iVar + ", " + C24560g0.m30725a(iVar.getClass())).toString());
        }
    }

    /* renamed from: H */
    C25526i mo52397H(C25528k kVar, C25528k kVar2);

    /* renamed from: a */
    C25528k mo52398a(C25526i iVar);

    /* renamed from: b */
    C25528k mo52399b(C25524g gVar);

    /* renamed from: c */
    C25528k mo52400c(C25528k kVar, boolean z);

    /* renamed from: d */
    C25521d mo52401d(C25528k kVar);

    /* renamed from: e */
    C25530n mo52402e(C25528k kVar);

    /* renamed from: f */
    C25528k mo52403f(C25524g gVar);
}
