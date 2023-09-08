package jz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d04.C24442a;
import dz3.C24465a;
import ez3.C24473b;
import ez3.C24476d;
import fy3.C32224a;
import fy3.C32226l;
import fz3.C20742e0;
import fz3.C20744g;
import fz3.C20745h;
import fz3.C20750j;
import fz3.C20753l;
import fz3.C20754l0;
import fz3.C20759m0;
import fz3.C24503f0;
import fz3.C24508n0;
import fz3.C24513s;
import fz3.C24517v;
import fz3.C24521w;
import g04.C24531d;
import gy3.C24560g0;
import gy3.C24563k;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import gz3.C24577a;
import gz3.C24588g;
import gz3.C24594j;
import gz3.C24597k;
import hz3.C24608b;
import hz3.C24609d;
import hz3.C24610e;
import hz3.C24614f;
import iz3.C24643c;
import iz3.C24648f;
import iz3.C24651h;
import iz3.C24652i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jz3.C24832l;
import kz3.C24859a;
import kz3.C24863e;
import m04.C21479h;
import m04.C21480i;
import mz3.C25054f;
import mz3.C25055g;
import mz3.C25059k;
import mz3.C25062n;
import mz3.C25065q;
import mz3.C25070v;
import mz3.C25071w;
import mz3.C25072x;
import n04.C25143j0;
import n04.C25187v1;
import ny3.C109824f;
import nz3.C25304s;
import o04.C25318c;
import o04.C25332l;
import oz3.C25404v;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C48501y0;
import sx3.C64175a0;
import sx3.C64186f0;
import sx3.C64197v;
import sx3.C90363p0;
import ty3.C26336h;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import w04.C22850f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26442c0;
import wy3.C26444d;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26463h1;
import wy3.C26467j;
import wy3.C26469k;
import wy3.C26491r;
import wy3.C26504r0;
import wy3.C26505s;
import wy3.C26506s0;
import wy3.C26507t0;
import wy3.C26508u;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26520x0;
import xy3.C26571h;
import zy3.C26749h0;
import zy3.C26751i0;
import zy3.C26752j;
import zy3.C26765p0;
import zy3.C26768q;
import zz3.C26792g;
import zz3.C26794h;
import zz3.C26802n;

/* renamed from: jz3.h */
public final class C24810h extends C24832l {

    /* renamed from: n */
    public final C26447e f70754n;

    /* renamed from: o */
    public final C25055g f70755o;

    /* renamed from: p */
    public final boolean f70756p;

    /* renamed from: q */
    public final C21480i<List<C26444d>> f70757q;

    /* renamed from: r */
    public final C21480i<Set<C22830f>> f70758r;

    /* renamed from: s */
    public final C21480i<Map<C22830f, C25062n>> f70759s;

    /* renamed from: t */
    public final C21479h<C22830f, C26752j> f70760t;

    /* renamed from: jz3.h$a */
    public /* synthetic */ class C24811a extends C24563k implements C32226l<C22830f, Collection<? extends C26520x0>> {
        public C24811a(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        public final C109824f getOwner() {
            return C24560g0.m30725a(C24810h.class);
        }

        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, "p0");
            return C24810h.m31252v((C24810h) this.receiver, fVar);
        }
    }

    /* renamed from: jz3.h$b */
    public /* synthetic */ class C24812b extends C24563k implements C32226l<C22830f, Collection<? extends C26520x0>> {
        public C24812b(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        public final C109824f getOwner() {
            return C24560g0.m30725a(C24810h.class);
        }

        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, "p0");
            return C24810h.m31253w((C24810h) this.receiver, fVar);
        }
    }

    /* renamed from: jz3.h$c */
    public static final class C24813c extends C87413o implements C32226l<C22830f, Collection<? extends C26520x0>> {

        /* renamed from: d */
        public final /* synthetic */ C24810h f70761d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24813c(C24810h hVar) {
            super(1);
            this.f70761d = hVar;
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
            return C24810h.m31252v(this.f70761d, fVar);
        }
    }

    /* renamed from: jz3.h$d */
    public static final class C24814d extends C87413o implements C32226l<C22830f, Collection<? extends C26520x0>> {

        /* renamed from: d */
        public final /* synthetic */ C24810h f70762d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24814d(C24810h hVar) {
            super(1);
            this.f70762d = hVar;
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, LocaleUtil.ITALIAN);
            return C24810h.m31253w(this.f70762d, fVar);
        }
    }

    /* renamed from: jz3.h$e */
    public static final class C24815e extends C87413o implements C32224a<List<? extends C26444d>> {

        /* renamed from: d */
        public final /* synthetic */ C24810h f70763d;

        /* renamed from: e */
        public final /* synthetic */ C24651h f70764e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24815e(C24810h hVar, C24651h hVar2) {
            super(0);
            this.f70763d = hVar;
            this.f70764e = hVar2;
        }

        public Object invoke() {
            C24608b bVar;
            C24608b bVar2;
            List list;
            C26447e eVar;
            ArrayList arrayList;
            ArrayList arrayList2;
            C13604l lVar;
            boolean z;
            C24597k kVar = C24597k.COMMON;
            Collection<C25059k> q = this.f70763d.f70755o.mo51087q();
            ArrayList arrayList3 = new ArrayList(q.size());
            for (C25059k next : q) {
                C24810h hVar = this.f70763d;
                C26447e eVar2 = hVar.f70754n;
                C24608b W0 = C24608b.m30786W0(eVar2, C24648f.m30829a(hVar.f70794b, next), false, hVar.f70794b.f70290a.f70265j.mo37235a(next));
                C24651h hVar2 = hVar.f70794b;
                int size = eVar2.mo51805t().size();
                C87412m.m108594g(hVar2, "<this>");
                C24651h hVar3 = new C24651h(hVar2.f70290a, new C24652i(hVar2, W0, next, size), hVar2.f70292c);
                C24832l.C24834b u = hVar.mo51849u(hVar3, W0, next.mo51103h());
                List<C26446d1> t = eVar2.mo51805t();
                C87412m.m108593f(t, "classDescriptor.declaredTypeParameters");
                List<C25072x> typeParameters = next.getTypeParameters();
                ArrayList arrayList4 = new ArrayList(C36907w.m41090l(typeParameters, 10));
                for (C25072x a : typeParameters) {
                    C26446d1 a2 = hVar3.f70291b.mo51482a(a);
                    C87412m.m108591d(a2);
                    arrayList4.add(a2);
                }
                W0.mo53732V0(u.f70811a, C24508n0.m30644a(next.getVisibility()), C110818d0.m150933e0(t, arrayList4));
                W0.mo51318P0(false);
                W0.mo51319Q0(u.f70812b);
                W0.mo53751R0(eVar2.mo36111s());
                ((C24588g.C24589a) hVar3.f70290a.f70262g).getClass();
                arrayList3.add(W0);
            }
            C25143j0 j0Var = null;
            if (this.f70763d.f70755o.mo51080H()) {
                C24810h hVar4 = this.f70763d;
                C26447e eVar3 = hVar4.f70754n;
                C24608b W02 = C24608b.m30786W0(eVar3, C26571h.C26572a.f73937a, true, hVar4.f70794b.f70290a.f70265j.mo37235a(hVar4.f70755o));
                Collection<C25070v> G = hVar4.f70755o.mo51079G();
                ArrayList arrayList5 = new ArrayList(G.size());
                C24859a b = C24863e.m31346b(kVar, false, (C26446d1) null, 2, (Object) null);
                int i = 0;
                for (C25070v next2 : G) {
                    int i2 = i + 1;
                    C25143j0 e = hVar4.f70794b.f70294e.mo51869e(next2.getType(), b);
                    C25143j0 g = next2.mo51058a() ? hVar4.f70794b.f70290a.f70270o.mo52623m().mo53315g(e) : j0Var;
                    ArrayList arrayList6 = arrayList5;
                    arrayList6.add(new C26765p0(W02, (C26463h1) null, i, C26571h.C26572a.f73937a, next2.getName(), e, false, false, false, g, hVar4.f70794b.f70290a.f70265j.mo37235a(next2)));
                    b = b;
                    arrayList5 = arrayList6;
                    i = i2;
                    j0Var = null;
                }
                ArrayList arrayList7 = arrayList5;
                W02.mo51319Q0(false);
                C26505s visibility = eVar3.getVisibility();
                C87412m.m108593f(visibility, "classDescriptor.visibility");
                if (C87412m.m108589b(visibility, C24517v.f70077b)) {
                    visibility = C24517v.f70078c;
                    C87412m.m108593f(visibility, "PROTECTED_AND_PACKAGE");
                }
                W02.mo53731U0(arrayList7, visibility);
                W02.mo51318P0(false);
                W02.mo53751R0(eVar3.mo36111s());
                int i3 = 2;
                Object obj = null;
                String a3 = C25404v.m32595a(W02, false, false, 2, (Object) null);
                if (!arrayList3.isEmpty()) {
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (C87412m.m108589b(C25404v.m32595a((C26444d) it.next(), false, false, i3, obj), a3)) {
                            z = false;
                            break;
                        } else {
                            i3 = 2;
                            obj = null;
                        }
                    }
                }
                z = true;
                if (z) {
                    arrayList3.add(W02);
                    C24588g gVar = this.f70764e.f70290a.f70262g;
                    C25055g gVar2 = this.f70763d.f70755o;
                    ((C24588g.C24589a) gVar).getClass();
                    if (gVar2 == null) {
                        C24588g.C24589a.m30773a(3);
                        throw null;
                    }
                }
            }
            this.f70764e.f70290a.f70279x.mo51165a(this.f70763d.f70754n, arrayList3);
            C24651h hVar5 = this.f70764e;
            C25304s sVar = hVar5.f70290a.f70273r;
            C24810h hVar6 = this.f70763d;
            boolean isEmpty = arrayList3.isEmpty();
            List list2 = arrayList3;
            if (isEmpty) {
                boolean x = hVar6.f70755o.mo51095x();
                if ((hVar6.f70755o.mo51094w() || !hVar6.f70755o.mo51093v()) && !x) {
                    bVar = null;
                } else {
                    C26447e eVar4 = hVar6.f70754n;
                    C24608b W03 = C24608b.m30786W0(eVar4, C26571h.C26572a.f73937a, true, hVar6.f70794b.f70290a.f70265j.mo37235a(hVar6.f70755o));
                    if (x) {
                        Collection<C25065q> t2 = hVar6.f70755o.mo51090t();
                        ArrayList arrayList8 = new ArrayList(t2.size());
                        C24859a b2 = C24863e.m31346b(kVar, true, (C26446d1) null, 2, (Object) null);
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        for (T next3 : t2) {
                            if (C87412m.m108589b(((C25065q) next3).getName(), C24503f0.f70031b)) {
                                arrayList9.add(next3);
                            } else {
                                arrayList10.add(next3);
                            }
                        }
                        arrayList9.size();
                        C25065q qVar = (C25065q) C110818d0.m150916N(arrayList9);
                        if (qVar != null) {
                            C25071w returnType = qVar.getReturnType();
                            if (returnType instanceof C25054f) {
                                C25054f fVar = (C25054f) returnType;
                                lVar = new C13604l(hVar6.f70794b.f70294e.mo51868c(fVar, b2, true), hVar6.f70794b.f70294e.mo51869e(fVar.mo51072g(), b2));
                            } else {
                                lVar = new C13604l(hVar6.f70794b.f70294e.mo51869e(returnType, b2), null);
                            }
                            arrayList = arrayList10;
                            arrayList2 = arrayList8;
                            bVar2 = W03;
                            eVar = eVar4;
                            hVar6.mo51842x(arrayList8, W03, 0, qVar, (C25143j0) lVar.f38555d, (C25143j0) lVar.f38556e);
                        } else {
                            arrayList = arrayList10;
                            arrayList2 = arrayList8;
                            bVar2 = W03;
                            eVar = eVar4;
                        }
                        int i4 = qVar != null ? 1 : 0;
                        Iterator it4 = arrayList.iterator();
                        int i5 = 0;
                        while (it4.hasNext()) {
                            C25065q qVar2 = (C25065q) it4.next();
                            hVar6.mo51842x(arrayList2, bVar2, i5 + i4, qVar2, hVar6.f70794b.f70294e.mo51869e(qVar2.getReturnType(), b2), (C25143j0) null);
                            i5++;
                        }
                        list = arrayList2;
                    } else {
                        bVar2 = W03;
                        eVar = eVar4;
                        list = Collections.emptyList();
                    }
                    C24608b bVar3 = bVar2;
                    bVar3.mo51319Q0(false);
                    C26505s visibility2 = eVar.getVisibility();
                    C87412m.m108593f(visibility2, "classDescriptor.visibility");
                    if (C87412m.m108589b(visibility2, C24517v.f70077b)) {
                        visibility2 = C24517v.f70078c;
                        C87412m.m108593f(visibility2, "PROTECTED_AND_PACKAGE");
                    }
                    bVar3.mo53731U0(list, visibility2);
                    bVar3.mo51318P0(true);
                    bVar3.mo53751R0(eVar.mo36111s());
                    C24588g gVar3 = hVar6.f70794b.f70290a.f70262g;
                    C25055g gVar4 = hVar6.f70755o;
                    ((C24588g.C24589a) gVar3).getClass();
                    if (gVar4 != null) {
                        bVar = bVar3;
                    } else {
                        C24588g.C24589a.m30773a(3);
                        throw null;
                    }
                }
                list2 = C64197v.m75538g(bVar);
            }
            return C110818d0.m150953y0(sVar.mo52388c(hVar5, list2));
        }
    }

    /* renamed from: jz3.h$f */
    public static final class C24816f extends C87413o implements C32224a<Map<C22830f, ? extends C25062n>> {

        /* renamed from: d */
        public final /* synthetic */ C24810h f70765d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24816f(C24810h hVar) {
            super(0);
            this.f70765d = hVar;
        }

        public Object invoke() {
            Collection<C25062n> K = this.f70765d.f70755o.mo51082K();
            ArrayList arrayList = new ArrayList();
            for (T next : K) {
                if (((C25062n) next).mo51107M()) {
                    arrayList.add(next);
                }
            }
            int a = C90363p0.m113142a(C36907w.m41090l(arrayList, 10));
            if (a < 16) {
                a = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                linkedHashMap.put(((C25062n) next2).getName(), next2);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: jz3.h$g */
    public static final class C24817g extends C87413o implements C32226l<C22830f, Collection<? extends C26520x0>> {

        /* renamed from: d */
        public final /* synthetic */ C26520x0 f70766d;

        /* renamed from: e */
        public final /* synthetic */ C24810h f70767e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24817g(C26520x0 x0Var, C24810h hVar) {
            super(1);
            this.f70766d = x0Var;
            this.f70767e = hVar;
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, "accessorName");
            return C87412m.m108589b(this.f70766d.getName(), fVar) ? C26236u.m33719b(this.f70766d) : C110818d0.m150933e0(C24810h.m31252v(this.f70767e, fVar), C24810h.m31253w(this.f70767e, fVar));
        }
    }

    /* renamed from: jz3.h$h */
    public static final class C24818h extends C87413o implements C32224a<Set<? extends C22830f>> {

        /* renamed from: d */
        public final /* synthetic */ C24810h f70768d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24818h(C24810h hVar) {
            super(0);
            this.f70768d = hVar;
        }

        public Object invoke() {
            return C110818d0.m150904D0(this.f70768d.f70755o.mo51096z());
        }
    }

    /* renamed from: jz3.h$i */
    public static final class C24819i extends C87413o implements C32226l<C22830f, C26752j> {

        /* renamed from: d */
        public final /* synthetic */ C24810h f70769d;

        /* renamed from: e */
        public final /* synthetic */ C24651h f70770e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24819i(C24810h hVar, C24651h hVar2) {
            super(1);
            this.f70769d = hVar;
            this.f70770e = hVar2;
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, "name");
            if (!((Set) this.f70769d.f70758r.invoke()).contains(fVar)) {
                C25062n nVar = (C25062n) ((Map) this.f70769d.f70759s.invoke()).get(fVar);
                if (nVar == null) {
                    return null;
                }
                C21480i g = this.f70770e.f70290a.f70256a.mo52006g(new C24820i(this.f70769d));
                C24651h hVar = this.f70770e;
                return C26768q.m35056J0(hVar.f70290a.f70256a, this.f70769d.f70754n, fVar, g, C24648f.m30829a(hVar, nVar), this.f70770e.f70290a.f70265j.mo37235a(nVar));
            }
            C24513s sVar = this.f70770e.f70290a.f70257b;
            C26408b f = C24442a.m30539f(this.f70769d.f70754n);
            C87412m.m108591d(f);
            C25055g c = sVar.mo37222c(new C24513s.C20766a(f.mo53389d(fVar), (byte[]) null, this.f70769d.f70755o, 2, (C8480h) null));
            if (c == null) {
                return null;
            }
            C24651h hVar2 = this.f70770e;
            C24803f fVar2 = new C24803f(hVar2, this.f70769d.f70754n, c, (C26447e) null, 8, (C8480h) null);
            hVar2.f70290a.f70274s.mo51198a(fVar2);
            return fVar2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24810h(C24651h hVar, C26447e eVar, C25055g gVar, boolean z, C24810h hVar2) {
        super(hVar, hVar2);
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(eVar, "ownerDescriptor");
        C87412m.m108594g(gVar, "jClass");
        this.f70754n = eVar;
        this.f70755o = gVar;
        this.f70756p = z;
        this.f70757q = hVar.f70290a.f70256a.mo52006g(new C24815e(this, hVar));
        this.f70758r = hVar.f70290a.f70256a.mo52006g(new C24818h(this));
        this.f70759s = hVar.f70290a.f70256a.mo52006g(new C24816f(this));
        this.f70760t = hVar.f70290a.f70256a.mo52004e(new C24819i(this, hVar));
    }

    /* renamed from: v */
    public static final Collection m31252v(C24810h hVar, C22830f fVar) {
        Collection<C25065q> c = ((C24794b) hVar.f70797e.invoke()).mo51778c(fVar);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(c, 10));
        for (C25065q t : c) {
            arrayList.add(hVar.mo51848t(t));
        }
        return arrayList;
    }

    /* renamed from: w */
    public static final Collection m31253w(C24810h hVar, C22830f fVar) {
        Set<C26520x0> K = hVar.mo51825K(fVar);
        ArrayList arrayList = new ArrayList();
        for (T next : K) {
            C26520x0 x0Var = (C26520x0) next;
            C87412m.m108594g(x0Var, "<this>");
            boolean z = true;
            if (!(C20754l0.m22705b(x0Var) != null) && C20745h.m22700a(x0Var) == null) {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public final void mo51815A(Set<? extends C26504r0> set, Collection<C26504r0> collection, Set<C26504r0> set2, C32226l<? super C22830f, ? extends Collection<? extends C26520x0>> lVar) {
        C26520x0 x0Var;
        C26751i0 i0Var;
        C26749h0 h0Var;
        C24609d dVar;
        Set<C26504r0> set3 = set2;
        C32226l<? super C22830f, ? extends Collection<? extends C26520x0>> lVar2 = lVar;
        for (C26504r0 r0Var : set) {
            C24609d dVar2 = null;
            if (mo51819E(r0Var, lVar2)) {
                C26520x0 I = mo51823I(r0Var, lVar2);
                C87412m.m108591d(I);
                if (r0Var.mo52631c0()) {
                    x0Var = mo51824J(r0Var, lVar2);
                    C87412m.m108591d(x0Var);
                } else {
                    x0Var = null;
                }
                if (x0Var != null) {
                    x0Var.mo51802j();
                    I.mo51802j();
                }
                C24609d dVar3 = new C24609d(this.f70754n, I, x0Var, r0Var);
                C25143j0 returnType = I.getReturnType();
                C87412m.m108591d(returnType);
                C64186f0 f0Var = C64186f0.f181907d;
                C24609d dVar4 = dVar3;
                dVar4.mo53726O0(returnType, f0Var, mo51837p(), (C26509u0) null, f0Var);
                C26749h0 h = C26792g.m35209h(dVar4, I.getAnnotations(), false, false, false, I.getSource());
                h.f74347r = I;
                h.mo53729L0(dVar3.getType());
                if (x0Var != null) {
                    List<C26463h1> h2 = x0Var.mo52639h();
                    C87412m.m108593f(h2, "setterMethod.valueParameters");
                    C26463h1 h1Var = (C26463h1) C110818d0.m150916N(h2);
                    if (h1Var != null) {
                        C26749h0 h0Var2 = h;
                        dVar = dVar3;
                        i0Var = C26792g.m35210i(dVar3, x0Var.getAnnotations(), h1Var.getAnnotations(), false, false, false, x0Var.getVisibility(), x0Var.getSource());
                        i0Var.f74347r = x0Var;
                        h0Var = h0Var2;
                    } else {
                        throw new AssertionError("No parameter found for " + x0Var);
                    }
                } else {
                    dVar = dVar3;
                    i0Var = null;
                    h0Var = h;
                }
                dVar.mo53725M0(h0Var, i0Var, (C26508u) null, (C26508u) null);
                dVar2 = dVar;
            }
            Collection<C26504r0> collection2 = collection;
            if (dVar2 != null) {
                collection2.add(dVar2);
                if (set3 != null) {
                    set3.add(r0Var);
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: B */
    public final Collection<C25143j0> mo51816B() {
        if (!this.f70756p) {
            return this.f70794b.f70290a.f70276u.mo52421b().mo52413g(this.f70754n);
        }
        Collection<C25143j0> r = this.f70754n.mo36110l().mo37096r();
        C87412m.m108593f(r, "ownerDescriptor.typeConstructor.supertypes");
        return r;
    }

    /* renamed from: C */
    public final C26520x0 mo51817C(C26520x0 x0Var, C26434a aVar, Collection<? extends C26520x0> collection) {
        boolean z;
        boolean z2 = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C26520x0 x0Var2 = (C26520x0) it.next();
                if (C87412m.m108589b(x0Var, x0Var2) || x0Var2.mo53473D0() != null || !mo51820F(x0Var2, aVar)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            return x0Var;
        }
        Object build = x0Var.mo52597p().mo52600b().build();
        C87412m.m108591d(build);
        return (C26520x0) build;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final wy3.C26520x0 mo51818D(wy3.C26520x0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.mo52639h()
            java.lang.String r1 = "valueParameters"
            gy3.C87412m.m108593f(r0, r1)
            java.lang.Object r0 = sx3.C110818d0.m150925W(r0)
            wy3.h1 r0 = (wy3.C26463h1) r0
            r2 = 0
            if (r0 == 0) goto L_0x007b
            n04.j0 r3 = r0.getType()
            n04.j1 r3 = r3.mo37081K0()
            wy3.h r3 = r3.mo37094o()
            if (r3 == 0) goto L_0x0033
            vz3.d r3 = d04.C24442a.m30541h(r3)
            boolean r4 = r3.mo35989f()
            if (r4 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r3 = r2
        L_0x002c:
            if (r3 == 0) goto L_0x0033
            vz3.c r3 = r3.mo35993i()
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            vz3.c r4 = ty3.C26343l.f73371e
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r0 = r2
        L_0x003e:
            if (r0 != 0) goto L_0x0041
            goto L_0x007b
        L_0x0041:
            wy3.w$a r2 = r6.mo52597p()
            java.util.List r6 = r6.mo52639h()
            gy3.C87412m.m108593f(r6, r1)
            r1 = 1
            java.util.List r6 = sx3.C110818d0.m150909G(r6, r1)
            wy3.w$a r6 = r2.mo52612m(r6)
            n04.j0 r0 = r0.getType()
            java.util.List r0 = r0.mo37079I0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            n04.m1 r0 = (n04.C25158m1) r0
            n04.j0 r0 = r0.getType()
            wy3.w$a r6 = r6.mo52604e(r0)
            wy3.w r6 = r6.build()
            wy3.x0 r6 = (wy3.C26520x0) r6
            r0 = r6
            zy3.k0 r0 = (zy3.C26755k0) r0
            if (r0 != 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r0.f74449B = r1
        L_0x007a:
            return r6
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24810h.mo51818D(wy3.x0):wy3.x0");
    }

    /* renamed from: E */
    public final boolean mo51819E(C26504r0 r0Var, C32226l<? super C22830f, ? extends Collection<? extends C26520x0>> lVar) {
        if (C24796c.m31212a(r0Var)) {
            return false;
        }
        C26520x0 I = mo51823I(r0Var, lVar);
        C26520x0 J = mo51824J(r0Var, lVar);
        if (I == null) {
            return false;
        }
        if (!r0Var.mo52631c0()) {
            return true;
        }
        return J != null && J.mo51802j() == I.mo51802j();
    }

    /* renamed from: F */
    public final boolean mo51820F(C26434a aVar, C26434a aVar2) {
        C26802n.C26805c.C26806a c = C26802n.f74534f.mo53766n(aVar2, aVar, true).mo53767c();
        C87412m.m108593f(c, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return c == C26802n.C26805c.C26806a.OVERRIDABLE && !C24521w.f70080a.mo51203a(aVar2, aVar);
    }

    /* renamed from: G */
    public final boolean mo51821G(C26520x0 x0Var, C26516w wVar) {
        int i = C20744g.f58633m;
        C87412m.m108594g(x0Var, "<this>");
        if (C87412m.m108589b(x0Var.getName().mo35995b(), "removeAt") && C87412m.m108589b(C25404v.m32596b(x0Var), C20759m0.f58656h.f58662b)) {
            wVar = wVar.mo36109a();
        }
        C87412m.m108593f(wVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return mo51820F(wVar, x0Var);
    }

    /* renamed from: H */
    public final C26520x0 mo51822H(C26504r0 r0Var, String str, C32226l<? super C22830f, ? extends Collection<? extends C26520x0>> lVar) {
        C26520x0 x0Var;
        boolean z;
        Iterator it = ((Iterable) lVar.invoke(C22830f.m26794f(str))).iterator();
        do {
            x0Var = null;
            if (!it.hasNext()) {
                break;
            }
            C26520x0 x0Var2 = (C26520x0) it.next();
            if (x0Var2.mo52639h().size() == 0) {
                C25318c cVar = C25318c.f71821a;
                C25143j0 returnType = x0Var2.getReturnType();
                if (returnType == null) {
                    z = false;
                } else {
                    z = ((C25332l) cVar).mo52423d(returnType, r0Var.getType());
                }
                if (z) {
                    x0Var = x0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (x0Var == null);
        return x0Var;
    }

    /* renamed from: I */
    public final C26520x0 mo51823I(C26504r0 r0Var, C32226l<? super C22830f, ? extends Collection<? extends C26520x0>> lVar) {
        C26506s0 g = r0Var.mo52635g();
        String str = null;
        C26506s0 s0Var = g != null ? (C26506s0) C20754l0.m22705b(g) : null;
        if (s0Var != null) {
            C26336h.m33824A(s0Var);
            C26436b b = C24442a.m30535b(C24442a.m30545l(s0Var), false, C20753l.f58644d, 1, (Object) null);
            if (b != null) {
                Map<C22826c, C22830f> map = C20750j.f58640a;
                C22830f fVar = C20750j.f58640a.get(C24442a.m30540g(b));
                if (fVar != null) {
                    str = fVar.mo35995b();
                }
            }
        }
        if (str != null && !C20754l0.m22707d(this.f70754n, s0Var)) {
            return mo51822H(r0Var, str, lVar);
        }
        String b2 = r0Var.getName().mo35995b();
        C87412m.m108593f(b2, "name.asString()");
        return mo51822H(r0Var, C20742e0.m22697a(b2), lVar);
    }

    /* renamed from: J */
    public final C26520x0 mo51824J(C26504r0 r0Var, C32226l<? super C22830f, ? extends Collection<? extends C26520x0>> lVar) {
        C26520x0 x0Var;
        C25143j0 returnType;
        String b = r0Var.getName().mo35995b();
        C87412m.m108593f(b, "name.asString()");
        Iterator it = ((Iterable) lVar.invoke(C22830f.m26794f(C20742e0.m22698b(b)))).iterator();
        do {
            x0Var = null;
            if (!it.hasNext()) {
                break;
            }
            C26520x0 x0Var2 = (C26520x0) it.next();
            if (x0Var2.mo52639h().size() == 1 && (returnType = x0Var2.getReturnType()) != null) {
                C22830f fVar = C26336h.f73354e;
                if (!C26336h.m33828E(returnType, C26343l.C26344a.f73415e)) {
                    continue;
                } else {
                    C25318c cVar = C25318c.f71821a;
                    List<C26463h1> h = x0Var2.mo52639h();
                    C87412m.m108593f(h, "descriptor.valueParameters");
                    if (((C25332l) cVar).mo52404a(((C26463h1) C110818d0.m150938j0(h)).getType(), r0Var.getType())) {
                        x0Var = x0Var2;
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } while (x0Var == null);
        return x0Var;
    }

    /* renamed from: K */
    public final Set<C26520x0> mo51825K(C22830f fVar) {
        Collection<C25143j0> B = mo51816B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C25143j0 n : B) {
            C64175a0.m75508p(linkedHashSet, n.mo37088n().mo32456a(fVar, C24476d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    /* renamed from: L */
    public final Set<C26504r0> mo51826L(C22830f fVar) {
        Collection<C25143j0> B = mo51816B();
        ArrayList arrayList = new ArrayList();
        for (C25143j0 n : B) {
            Collection<? extends C26504r0> b = n.mo37088n().mo32457b(fVar, C24476d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(b, 10));
            for (C26504r0 add : b) {
                arrayList2.add(add);
            }
            C64175a0.m75508p(arrayList, arrayList2);
        }
        return C110818d0.m150904D0(arrayList);
    }

    /* renamed from: M */
    public final boolean mo51827M(C26520x0 x0Var, C26516w wVar) {
        String a = C25404v.m32595a(x0Var, false, false, 2, (Object) null);
        C26516w a2 = wVar.mo36109a();
        C87412m.m108593f(a2, "builtinWithErasedParameters.original");
        return C87412m.m108589b(a, C25404v.m32595a(a2, false, false, 2, (Object) null)) && !mo51820F(x0Var, wVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d8, code lost:
        if (z04.C112551y.m153819s(r2, "set", false) == false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x00df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ea  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo51828N(wy3.C26520x0 r12) {
        /*
            r11 = this;
            vz3.f r6 = r12.getName()
            java.lang.String r0 = "function.name"
            gy3.C87412m.m108593f(r6, r0)
            java.lang.String r0 = r6.mo35995b()
            java.lang.String r1 = "name.asString()"
            gy3.C87412m.m108593f(r0, r1)
            vz3.c r1 = fz3.C20742e0.f58630a
            java.lang.String r1 = "get"
            r7 = 0
            boolean r1 = z04.C112551y.m153819s(r0, r1, r7)
            r8 = 1
            if (r1 != 0) goto L_0x0029
            java.lang.String r1 = "is"
            boolean r1 = z04.C112551y.m153819s(r0, r1, r7)
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            java.lang.String r9 = "set"
            if (r1 == 0) goto L_0x004d
            r2 = 0
            r3 = 0
            r4 = 12
            r5 = 0
            java.lang.String r1 = "get"
            r0 = r6
            vz3.f r0 = fz3.C20751j0.m22702a(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0048
            r2 = 0
            r3 = 0
            r4 = 8
            r5 = 0
            java.lang.String r1 = "is"
            r0 = r6
            vz3.f r0 = fz3.C20751j0.m22702a(r0, r1, r2, r3, r4, r5)
        L_0x0048:
            java.util.List r0 = sx3.C64197v.m75538g(r0)
            goto L_0x0084
        L_0x004d:
            boolean r0 = z04.C112551y.m153819s(r0, r9, r7)
            if (r0 == 0) goto L_0x0076
            r0 = 2
            vz3.f[] r10 = new vz3.C22830f[r0]
            r3 = 0
            r4 = 4
            r5 = 0
            r2 = 0
            java.lang.String r1 = "set"
            r0 = r6
            vz3.f r0 = fz3.C20751j0.m22702a(r0, r1, r2, r3, r4, r5)
            r10[r7] = r0
            r4 = 4
            r5 = 0
            r2 = 0
            java.lang.String r1 = "set"
            java.lang.String r3 = "is"
            r0 = r6
            vz3.f r0 = fz3.C20751j0.m22702a(r0, r1, r2, r3, r4, r5)
            r10[r8] = r0
            java.util.List r0 = sx3.C110823p.m151010z(r10)
            goto L_0x0084
        L_0x0076:
            java.util.Map<vz3.f, java.util.List<vz3.f>> r0 = fz3.C20750j.f58641b
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0084
            sx3.f0 r0 = sx3.C64186f0.f181907d
        L_0x0084:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x008b
            goto L_0x00e6
        L_0x008b:
            java.util.Iterator r0 = r0.iterator()
        L_0x008f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r1 = r0.next()
            vz3.f r1 = (vz3.C22830f) r1
            java.util.Set r1 = r11.mo51826L(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x00a6
            goto L_0x00e1
        L_0x00a6:
            java.util.Iterator r1 = r1.iterator()
        L_0x00aa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r2 = r1.next()
            wy3.r0 r2 = (wy3.C26504r0) r2
            jz3.h$g r3 = new jz3.h$g
            r3.<init>(r12, r11)
            boolean r3 = r11.mo51819E(r2, r3)
            if (r3 == 0) goto L_0x00dc
            boolean r2 = r2.mo52631c0()
            if (r2 != 0) goto L_0x00da
            vz3.f r2 = r12.getName()
            java.lang.String r2 = r2.mo35995b()
            java.lang.String r3 = "function.name.asString()"
            gy3.C87412m.m108593f(r2, r3)
            boolean r2 = z04.C112551y.m153819s(r2, r9, r7)
            if (r2 != 0) goto L_0x00dc
        L_0x00da:
            r2 = 1
            goto L_0x00dd
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            if (r2 == 0) goto L_0x00aa
            r1 = 1
            goto L_0x00e2
        L_0x00e1:
            r1 = 0
        L_0x00e2:
            if (r1 == 0) goto L_0x008f
            r0 = 1
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            if (r0 == 0) goto L_0x00ea
            return r7
        L_0x00ea:
            fz3.m0$a r0 = fz3.C20759m0.f58649a
            vz3.f r0 = r12.getName()
            java.lang.String r1 = "name"
            gy3.C87412m.m108593f(r0, r1)
            java.util.Map<vz3.f, vz3.f> r2 = fz3.C20759m0.f58660l
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r0 = r2.get(r0)
            vz3.f r0 = (vz3.C22830f) r0
            if (r0 != 0) goto L_0x0102
            goto L_0x016c
        L_0x0102:
            java.util.Set r2 = r11.mo51825K(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x010f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0130
            java.lang.Object r4 = r2.next()
            r5 = r4
            wy3.x0 r5 = (wy3.C26520x0) r5
            java.lang.String r6 = "<this>"
            gy3.C87412m.m108594g(r5, r6)
            wy3.b r5 = fz3.C20754l0.m22705b(r5)
            if (r5 == 0) goto L_0x0129
            r5 = 1
            goto L_0x012a
        L_0x0129:
            r5 = 0
        L_0x012a:
            if (r5 == 0) goto L_0x010f
            r3.add(r4)
            goto L_0x010f
        L_0x0130:
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0137
            goto L_0x016c
        L_0x0137:
            wy3.w$a r2 = r12.mo52597p()
            r2.mo52602c(r0)
            r2.mo52617r()
            r2.mo52607h()
            wy3.w r0 = r2.build()
            gy3.C87412m.m108591d(r0)
            wy3.x0 r0 = (wy3.C26520x0) r0
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0154
            goto L_0x016c
        L_0x0154:
            java.util.Iterator r2 = r3.iterator()
        L_0x0158:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016c
            java.lang.Object r3 = r2.next()
            wy3.x0 r3 = (wy3.C26520x0) r3
            boolean r3 = r11.mo51821G(r3, r0)
            if (r3 == 0) goto L_0x0158
            r0 = 1
            goto L_0x016d
        L_0x016c:
            r0 = 0
        L_0x016d:
            if (r0 != 0) goto L_0x020b
            fz3.h r0 = fz3.C20745h.f58634m
            vz3.f r2 = r12.getName()
            gy3.C87412m.m108593f(r2, r1)
            boolean r0 = r0.mo32446b(r2)
            if (r0 != 0) goto L_0x017f
            goto L_0x01c8
        L_0x017f:
            vz3.f r0 = r12.getName()
            gy3.C87412m.m108593f(r0, r1)
            java.util.Set r0 = r11.mo51825K(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0193:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01a9
            java.lang.Object r3 = r0.next()
            wy3.x0 r3 = (wy3.C26520x0) r3
            wy3.w r3 = fz3.C20745h.m22700a(r3)
            if (r3 == 0) goto L_0x0193
            r2.add(r3)
            goto L_0x0193
        L_0x01a9:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x01b0
            goto L_0x01c8
        L_0x01b0:
            java.util.Iterator r0 = r2.iterator()
        L_0x01b4:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01c8
            java.lang.Object r2 = r0.next()
            wy3.w r2 = (wy3.C26516w) r2
            boolean r2 = r11.mo51827M(r12, r2)
            if (r2 == 0) goto L_0x01b4
            r0 = 1
            goto L_0x01c9
        L_0x01c8:
            r0 = 0
        L_0x01c9:
            if (r0 != 0) goto L_0x020b
            wy3.x0 r0 = r11.mo51818D(r12)
            if (r0 != 0) goto L_0x01d2
            goto L_0x0207
        L_0x01d2:
            vz3.f r12 = r12.getName()
            gy3.C87412m.m108593f(r12, r1)
            java.util.Set r12 = r11.mo51825K(r12)
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x01e4
            goto L_0x0207
        L_0x01e4:
            java.util.Iterator r12 = r12.iterator()
        L_0x01e8:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0207
            java.lang.Object r1 = r12.next()
            wy3.x0 r1 = (wy3.C26520x0) r1
            boolean r2 = r1.isSuspend()
            if (r2 == 0) goto L_0x0202
            boolean r1 = r11.mo51820F(r0, r1)
            if (r1 == 0) goto L_0x0202
            r1 = 1
            goto L_0x0203
        L_0x0202:
            r1 = 0
        L_0x0203:
            if (r1 == 0) goto L_0x01e8
            r12 = 1
            goto L_0x0208
        L_0x0207:
            r12 = 0
        L_0x0208:
            if (r12 != 0) goto L_0x020b
            r7 = 1
        L_0x020b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24810h.mo51828N(wy3.x0):boolean");
    }

    /* renamed from: O */
    public void mo51829O(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C24465a.m30602a(this.f70794b.f70290a.f70269n, bVar, this.f70754n, fVar);
    }

    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        mo51829O(fVar, bVar);
        return super.mo32456a(fVar, bVar);
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        mo51829O(fVar, bVar);
        return super.mo32457b(fVar, bVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r3 = (r3 = r3.f70760t).invoke(r2);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public wy3.C22935h mo32462g(vz3.C22830f r2, ez3.C24473b r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "location"
            gy3.C87412m.m108594g(r3, r0)
            r1.mo51829O(r2, r3)
            jz3.l r3 = r1.f70795c
            jz3.h r3 = (jz3.C24810h) r3
            if (r3 == 0) goto L_0x0020
            m04.h<vz3.f, zy3.j> r3 = r3.f70760t
            if (r3 == 0) goto L_0x0020
            java.lang.Object r3 = r3.invoke(r2)
            zy3.j r3 = (zy3.C26752j) r3
            if (r3 == 0) goto L_0x0020
            goto L_0x0029
        L_0x0020:
            m04.h<vz3.f, zy3.j> r3 = r1.f70760t
            java.lang.Object r2 = r3.invoke(r2)
            r3 = r2
            wy3.h r3 = (wy3.C22935h) r3
        L_0x0029:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24810h.mo32462g(vz3.f, ez3.b):wy3.h");
    }

    /* renamed from: h */
    public Set<C22830f> mo51830h(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        return C48501y0.m53872g((Set) this.f70758r.invoke(), ((Map) this.f70759s.invoke()).keySet());
    }

    /* renamed from: i */
    public Set mo51831i(C24531d dVar, C32226l lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        Collection<C25143j0> r = this.f70754n.mo36110l().mo37096r();
        C87412m.m108593f(r, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C25143j0 n : r) {
            C64175a0.m75508p(linkedHashSet, n.mo37088n().mo32458c());
        }
        linkedHashSet.addAll(((C24794b) this.f70797e.invoke()).mo51776a());
        linkedHashSet.addAll(((C24794b) this.f70797e.invoke()).mo51779d());
        linkedHashSet.addAll(mo51830h(dVar, lVar));
        linkedHashSet.addAll(this.f70794b.f70290a.f70279x.mo51168d(this.f70754n));
        return linkedHashSet;
    }

    /* renamed from: j */
    public void mo51832j(Collection<C26520x0> collection, C22830f fVar) {
        boolean z;
        Collection<C26520x0> collection2 = collection;
        C22830f fVar2 = fVar;
        C87412m.m108594g(collection2, "result");
        C87412m.m108594g(fVar2, "name");
        if (this.f70755o.mo51080H() && ((C24794b) this.f70797e.invoke()).mo51781f(fVar2) != null) {
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C26520x0) it.next()).mo52639h().isEmpty()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                C25070v f = ((C24794b) this.f70797e.invoke()).mo51781f(fVar2);
                C87412m.m108591d(f);
                C24610e X0 = C24610e.m30795X0(this.f70754n, C24648f.m30829a(this.f70794b, f), f.getName(), this.f70794b.f70290a.f70265j.mo37235a(f), true);
                C25143j0 e = this.f70794b.f70294e.mo51869e(f.getType(), C24863e.m31346b(C24597k.COMMON, false, (C26446d1) null, 2, (Object) null));
                C26509u0 p = mo51837p();
                C64186f0 f0Var = C64186f0.f181907d;
                X0.mo51322W0((C26509u0) null, p, f0Var, f0Var, f0Var, e, C26442c0.OPEN, C26491r.f73782e, (Map<? extends C26434a.C22933a<?>, ?>) null);
                X0.mo51323Y0(false, false);
                ((C24588g.C24589a) this.f70794b.f70290a.f70262g).getClass();
                collection2.add(X0);
            }
        }
        this.f70794b.f70290a.f70279x.mo51167c(this.f70754n, fVar2, collection2);
    }

    /* renamed from: k */
    public C24794b mo51833k() {
        return new C24792a(this.f70755o, C24809g.f70753d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo51834m(java.util.Collection<wy3.C26520x0> r11, vz3.C22830f r12) {
        /*
            r10 = this;
            java.lang.String r0 = "result"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "name"
            gy3.C87412m.m108594g(r12, r0)
            java.util.Set r6 = r10.mo51825K(r12)
            fz3.m0$a r0 = fz3.C20759m0.f58649a
            java.util.List<vz3.f> r0 = fz3.C20759m0.f58659k
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r12)
            r7 = 1
            if (r0 != 0) goto L_0x006a
            fz3.h r0 = fz3.C20745h.f58634m
            boolean r0 = r0.mo32446b(r12)
            if (r0 != 0) goto L_0x006a
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            goto L_0x0043
        L_0x002b:
            java.util.Iterator r0 = r6.iterator()
        L_0x002f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r0.next()
            wy3.w r2 = (wy3.C26516w) r2
            boolean r2 = r2.isSuspend()
            if (r2 == 0) goto L_0x002f
            r0 = 0
            goto L_0x0044
        L_0x0043:
            r0 = 1
        L_0x0044:
            if (r0 == 0) goto L_0x006a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x004f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r2.next()
            r4 = r3
            wy3.x0 r4 = (wy3.C26520x0) r4
            boolean r4 = r10.mo51828N(r4)
            if (r4 == 0) goto L_0x004f
            r0.add(r3)
            goto L_0x004f
        L_0x0066:
            r10.mo51843y(r11, r12, r0, r1)
            return
        L_0x006a:
            w04.f$b r0 = w04.C22850f.f65674f
            w04.f r8 = r0.mo36008a()
            sx3.f0 r2 = sx3.C64186f0.f181907d
            wy3.e r3 = r10.f70754n
            j04.r r4 = j04.C21150r.f59798a
            iz3.h r0 = r10.f70794b
            iz3.c r0 = r0.f70290a
            o04.k r0 = r0.f70276u
            zz3.n r5 = r0.mo52422c()
            r0 = r12
            r1 = r6
            java.util.Collection r9 = gz3.C24577a.m30758d(r0, r1, r2, r3, r4, r5)
            jz3.h$a r5 = new jz3.h$a
            r5.<init>(r10)
            r0 = r10
            r1 = r12
            r2 = r11
            r3 = r9
            r4 = r11
            r0.mo51844z(r1, r2, r3, r4, r5)
            jz3.h$b r5 = new jz3.h$b
            r5.<init>(r10)
            r4 = r8
            r0.mo51844z(r1, r2, r3, r4, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L_0x00a5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bc
            java.lang.Object r2 = r1.next()
            r3 = r2
            wy3.x0 r3 = (wy3.C26520x0) r3
            boolean r3 = r10.mo51828N(r3)
            if (r3 == 0) goto L_0x00a5
            r0.add(r2)
            goto L_0x00a5
        L_0x00bc:
            java.util.List r0 = sx3.C110818d0.m150933e0(r0, r8)
            r10.mo51843y(r11, r12, r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24810h.mo51834m(java.util.Collection, vz3.f):void");
    }

    /* renamed from: n */
    public void mo51835n(C22830f fVar, Collection<C26504r0> collection) {
        C25065q qVar;
        C22830f fVar2 = fVar;
        Collection<C26504r0> collection2 = collection;
        C87412m.m108594g(fVar2, "name");
        C87412m.m108594g(collection2, "result");
        if (this.f70755o.mo51095x() && (qVar = (C25065q) C110818d0.m150939k0(((C24794b) this.f70797e.invoke()).mo51778c(fVar2))) != null) {
            C26442c0 c0Var = C26442c0.FINAL;
            C24614f P0 = C24614f.m30802P0(this.f70754n, C24648f.m30829a(this.f70794b, qVar), c0Var, C24508n0.m30644a(qVar.getVisibility()), false, qVar.getName(), this.f70794b.f70290a.f70265j.mo37235a(qVar), false);
            C26749h0 c = C26792g.m35204c(P0, C26571h.C26572a.f73937a);
            P0.mo53725M0(c, (C26507t0) null, (C26508u) null, (C26508u) null);
            C24651h hVar = this.f70794b;
            C87412m.m108594g(hVar, "<this>");
            C25143j0 l = mo51847l(qVar, new C24651h(hVar.f70290a, new C24652i(hVar, P0, qVar, 0), hVar.f70292c));
            C64186f0 f0Var = C64186f0.f181907d;
            P0.mo53726O0(l, f0Var, mo51837p(), (C26509u0) null, f0Var);
            c.mo53729L0(l);
            collection2.add(P0);
        }
        Set<C26504r0> L = mo51826L(fVar);
        if (!L.isEmpty()) {
            C22850f.C22851b bVar = C22850f.f65674f;
            C22850f a = bVar.mo36008a();
            C22850f a2 = bVar.mo36008a();
            mo51815A(L, collection2, a, new C24813c(this));
            mo51815A(C48501y0.m53871f(L, a), a2, (Set<C26504r0>) null, new C24814d(this));
            Set<T> g = C48501y0.m53872g(L, a2);
            C26447e eVar = this.f70754n;
            C24643c cVar = this.f70794b.f70290a;
            collection2.addAll(C24577a.m30758d(fVar, g, collection, eVar, cVar.f70261f, cVar.f70276u.mo52422c()));
        }
    }

    /* renamed from: o */
    public Set<C22830f> mo51836o(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        if (this.f70755o.mo51095x()) {
            return mo32458c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((C24794b) this.f70797e.invoke()).mo51780e());
        Collection<C25143j0> r = this.f70754n.mo36110l().mo37096r();
        C87412m.m108593f(r, "ownerDescriptor.typeConstructor.supertypes");
        for (C25143j0 n : r) {
            C64175a0.m75508p(linkedHashSet, n.mo37088n().mo32459d());
        }
        return linkedHashSet;
    }

    /* renamed from: p */
    public C26509u0 mo51837p() {
        C26447e eVar = this.f70754n;
        if (eVar != null) {
            int i = C26794h.f74523a;
            return eVar.mo53429o0();
        }
        C26794h.m35213a(0);
        throw null;
    }

    /* renamed from: q */
    public C26469k mo51838q() {
        return this.f70754n;
    }

    /* renamed from: r */
    public boolean mo51839r(C24610e eVar) {
        C87412m.m108594g(eVar, "<this>");
        if (this.f70755o.mo51095x()) {
            return false;
        }
        return mo51828N(eVar);
    }

    /* renamed from: s */
    public C24832l.C24833a mo51840s(C25065q qVar, List<? extends C26446d1> list, C25143j0 j0Var, List<? extends C26463h1> list2) {
        C87412m.m108594g(qVar, FirebaseAnalytics.C113379b.METHOD);
        C87412m.m108594g(list, "methodTypeParameters");
        C87412m.m108594g(j0Var, "returnType");
        C87412m.m108594g(list2, "valueParameters");
        C24594j jVar = this.f70794b.f70290a.f70260e;
        C26447e eVar = this.f70754n;
        ((C24594j.C24595a) jVar).getClass();
        if (eVar != null) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return new C24832l.C24833a(j0Var, (C25143j0) null, list2, list, false, emptyList);
            }
            C24594j.C24596b.m30777a(3);
            throw null;
        }
        C24594j.C24595a.m30776a(1);
        throw null;
    }

    public String toString() {
        return "Lazy Java member scope for " + this.f70755o.mo51084d();
    }

    /* renamed from: x */
    public final void mo51842x(List<C26463h1> list, C26467j jVar, int i, C25065q qVar, C25143j0 j0Var, C25143j0 j0Var2) {
        int i2 = C26571h.f73936P0;
        C26571h hVar = C26571h.C26572a.f73937a;
        C22830f name = qVar.getName();
        C25143j0 i3 = C25187v1.m32089i(j0Var);
        C87412m.m108593f(i3, "makeNotNullable(returnType)");
        List<C26463h1> list2 = list;
        list.add(new C26765p0(jVar, (C26463h1) null, i, hVar, name, i3, qVar.mo51035N(), false, false, j0Var2 != null ? C25187v1.m32089i(j0Var2) : null, this.f70794b.f70290a.f70265j.mo37235a(qVar)));
    }

    /* renamed from: y */
    public final void mo51843y(Collection<C26520x0> collection, C22830f fVar, Collection<? extends C26520x0> collection2, boolean z) {
        C26447e eVar = this.f70754n;
        C24643c cVar = this.f70794b.f70290a;
        Collection<D> d = C24577a.m30758d(fVar, collection2, collection, eVar, cVar.f70261f, cVar.f70276u.mo52422c());
        if (!z) {
            collection.addAll(d);
            return;
        }
        List<T> e0 = C110818d0.m150933e0(collection, d);
        ArrayList arrayList = new ArrayList(C36907w.m41090l(d, 10));
        for (D d2 : d) {
            C26520x0 x0Var = (C26520x0) C20754l0.m22706c(d2);
            if (x0Var == null) {
                C87412m.m108593f(d2, "resolvedOverride");
            } else {
                C87412m.m108593f(d2, "resolvedOverride");
                d2 = mo51817C(d2, x0Var, e0);
            }
            arrayList.add(d2);
        }
        collection.addAll(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135 A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51844z(vz3.C22830f r9, java.util.Collection<? extends wy3.C26520x0> r10, java.util.Collection<? extends wy3.C26520x0> r11, java.util.Collection<wy3.C26520x0> r12, fy3.C32226l<? super vz3.C22830f, ? extends java.util.Collection<? extends wy3.C26520x0>> r13) {
        /*
            r8 = this;
            java.util.Iterator r11 = r11.iterator()
        L_0x0004:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x013a
            java.lang.Object r0 = r11.next()
            wy3.x0 r0 = (wy3.C26520x0) r0
            wy3.b r1 = fz3.C20754l0.m22705b(r0)
            wy3.x0 r1 = (wy3.C26520x0) r1
            r2 = 0
            if (r1 != 0) goto L_0x001a
            goto L_0x005c
        L_0x001a:
            java.lang.String r3 = fz3.C20754l0.m22704a(r1)
            gy3.C87412m.m108591d(r3)
            vz3.f r3 = vz3.C22830f.m26794f(r3)
            java.lang.Object r3 = r13.invoke(r3)
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x002f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005c
            java.lang.Object r4 = r3.next()
            wy3.x0 r4 = (wy3.C26520x0) r4
            wy3.w$a r4 = r4.mo52597p()
            r4.mo52602c(r9)
            r4.mo52617r()
            r4.mo52607h()
            wy3.w r4 = r4.build()
            gy3.C87412m.m108591d(r4)
            wy3.x0 r4 = (wy3.C26520x0) r4
            boolean r5 = r8.mo51821G(r1, r4)
            if (r5 == 0) goto L_0x002f
            wy3.x0 r1 = r8.mo51817C(r4, r1, r10)
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            w04.C26412a.m34008a(r12, r1)
            wy3.w r1 = fz3.C20745h.m22700a(r0)
            if (r1 != 0) goto L_0x0068
            goto L_0x00fa
        L_0x0068:
            vz3.f r3 = r1.getName()
            java.lang.String r4 = "overridden.name"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Object r3 = r13.invoke(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x007b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008f
            java.lang.Object r4 = r3.next()
            r5 = r4
            wy3.x0 r5 = (wy3.C26520x0) r5
            boolean r5 = r8.mo51827M(r5, r1)
            if (r5 == 0) goto L_0x007b
            goto L_0x0090
        L_0x008f:
            r4 = r2
        L_0x0090:
            wy3.x0 r4 = (wy3.C26520x0) r4
            if (r4 == 0) goto L_0x00e8
            wy3.w$a r3 = r4.mo52597p()
            java.util.List r5 = r1.mo52639h()
            java.lang.String r6 = "overridden.valueParameters"
            gy3.C87412m.m108593f(r5, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x00b0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00c4
            java.lang.Object r7 = r5.next()
            wy3.h1 r7 = (wy3.C26463h1) r7
            n04.j0 r7 = r7.getType()
            r6.add(r7)
            goto L_0x00b0
        L_0x00c4:
            java.util.List r4 = r4.mo52639h()
            java.lang.String r5 = "override.valueParameters"
            gy3.C87412m.m108593f(r4, r5)
            java.util.List r4 = hz3.C24616h.m30810a(r6, r4, r1)
            r3.mo52612m(r4)
            r3.mo52617r()
            r3.mo52607h()
            wy3.a$a<java.lang.Boolean> r4 = hz3.C24610e.f70208N
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r3.mo52605f(r4, r5)
            wy3.w r3 = r3.build()
            wy3.x0 r3 = (wy3.C26520x0) r3
            goto L_0x00e9
        L_0x00e8:
            r3 = r2
        L_0x00e9:
            if (r3 == 0) goto L_0x00fa
            boolean r4 = r8.mo51828N(r3)
            if (r4 == 0) goto L_0x00f2
            goto L_0x00f3
        L_0x00f2:
            r3 = r2
        L_0x00f3:
            if (r3 == 0) goto L_0x00fa
            wy3.x0 r1 = r8.mo51817C(r3, r1, r10)
            goto L_0x00fb
        L_0x00fa:
            r1 = r2
        L_0x00fb:
            w04.C26412a.m34008a(r12, r1)
            boolean r1 = r0.isSuspend()
            if (r1 != 0) goto L_0x0105
            goto L_0x0135
        L_0x0105:
            vz3.f r1 = r0.getName()
            java.lang.String r3 = "descriptor.name"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.Object r1 = r13.invoke(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0118:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0135
            java.lang.Object r3 = r1.next()
            wy3.x0 r3 = (wy3.C26520x0) r3
            wy3.x0 r3 = r8.mo51818D(r3)
            if (r3 == 0) goto L_0x0131
            boolean r4 = r8.mo51820F(r3, r0)
            if (r4 == 0) goto L_0x0131
            goto L_0x0132
        L_0x0131:
            r3 = r2
        L_0x0132:
            if (r3 == 0) goto L_0x0118
            r2 = r3
        L_0x0135:
            w04.C26412a.m34008a(r12, r2)
            goto L_0x0004
        L_0x013a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24810h.mo51844z(vz3.f, java.util.Collection, java.util.Collection, java.util.Collection, fy3.l):void");
    }
}
