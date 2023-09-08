package jz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import ez3.C24476d;
import fy3.C32224a;
import fy3.C32226l;
import fz3.C24508n0;
import g04.C20770i;
import g04.C24528c;
import g04.C24531d;
import g04.C24538j;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import gz3.C24588g;
import gz3.C24594j;
import gz3.C24597k;
import hz3.C24610e;
import iz3.C24648f;
import iz3.C24651h;
import iz3.C24652i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kz3.C24863e;
import m04.C21479h;
import m04.C21480i;
import m04.C24959e;
import m04.C24975g;
import m04.C24979m;
import mz3.C25065q;
import mz3.C25072x;
import n04.C25143j0;
import ny3.C89104m;
import oz3.C25404v;
import rx3.C13604l;
import sx3.C110818d0;
import sx3.C36903g0;
import sx3.C36907w;
import sx3.C64186f0;
import sx3.C90363p0;
import vz3.C22830f;
import w04.C26412a;
import wy3.C26442c0;
import wy3.C26446d1;
import wy3.C26453f;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26509u0;
import wy3.C26520x0;
import xy3.C26571h;
import zz3.C23602t;
import zz3.C26792g;
import zz3.C26794h;

/* renamed from: jz3.l */
public abstract class C24832l extends C24538j {

    /* renamed from: m */
    public static final /* synthetic */ C89104m<Object>[] f70793m;

    /* renamed from: b */
    public final C24651h f70794b;

    /* renamed from: c */
    public final C24832l f70795c;

    /* renamed from: d */
    public final C21480i<Collection<C26469k>> f70796d;

    /* renamed from: e */
    public final C21480i<C24794b> f70797e;

    /* renamed from: f */
    public final C24975g<C22830f, Collection<C26520x0>> f70798f;

    /* renamed from: g */
    public final C21479h<C22830f, C26504r0> f70799g;

    /* renamed from: h */
    public final C24975g<C22830f, Collection<C26520x0>> f70800h;

    /* renamed from: i */
    public final C21480i f70801i;

    /* renamed from: j */
    public final C21480i f70802j;

    /* renamed from: k */
    public final C21480i f70803k;

    /* renamed from: l */
    public final C24975g<C22830f, List<C26504r0>> f70804l;

    /* renamed from: jz3.l$a */
    public static final class C24833a {

        /* renamed from: a */
        public final C25143j0 f70805a;

        /* renamed from: b */
        public final C25143j0 f70806b;

        /* renamed from: c */
        public final List<C26463h1> f70807c;

        /* renamed from: d */
        public final List<C26446d1> f70808d;

        /* renamed from: e */
        public final boolean f70809e;

        /* renamed from: f */
        public final List<String> f70810f;

        public C24833a(C25143j0 j0Var, C25143j0 j0Var2, List<? extends C26463h1> list, List<? extends C26446d1> list2, boolean z, List<String> list3) {
            C87412m.m108594g(j0Var, "returnType");
            C87412m.m108594g(list, "valueParameters");
            C87412m.m108594g(list2, "typeParameters");
            C87412m.m108594g(list3, "errors");
            this.f70805a = j0Var;
            this.f70806b = j0Var2;
            this.f70807c = list;
            this.f70808d = list2;
            this.f70809e = z;
            this.f70810f = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C24833a)) {
                return false;
            }
            C24833a aVar = (C24833a) obj;
            return C87412m.m108589b(this.f70805a, aVar.f70805a) && C87412m.m108589b(this.f70806b, aVar.f70806b) && C87412m.m108589b(this.f70807c, aVar.f70807c) && C87412m.m108589b(this.f70808d, aVar.f70808d) && this.f70809e == aVar.f70809e && C87412m.m108589b(this.f70810f, aVar.f70810f);
        }

        public int hashCode() {
            int hashCode = this.f70805a.hashCode() * 31;
            C25143j0 j0Var = this.f70806b;
            int hashCode2 = (((((hashCode + (j0Var == null ? 0 : j0Var.hashCode())) * 31) + this.f70807c.hashCode()) * 31) + this.f70808d.hashCode()) * 31;
            boolean z = this.f70809e;
            if (z) {
                z = true;
            }
            return ((hashCode2 + (z ? 1 : 0)) * 31) + this.f70810f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f70805a + ", receiverType=" + this.f70806b + ", valueParameters=" + this.f70807c + ", typeParameters=" + this.f70808d + ", hasStableParameterNames=" + this.f70809e + ", errors=" + this.f70810f + ')';
        }
    }

    /* renamed from: jz3.l$b */
    public static final class C24834b {

        /* renamed from: a */
        public final List<C26463h1> f70811a;

        /* renamed from: b */
        public final boolean f70812b;

        public C24834b(List<? extends C26463h1> list, boolean z) {
            C87412m.m108594g(list, "descriptors");
            this.f70811a = list;
            this.f70812b = z;
        }
    }

    /* renamed from: jz3.l$c */
    public static final class C24835c extends C87413o implements C32224a<Collection<? extends C26469k>> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70813d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24835c(C24832l lVar) {
            super(0);
            this.f70813d = lVar;
        }

        public Object invoke() {
            C24832l lVar = this.f70813d;
            C24531d dVar = C24531d.f70104m;
            C20770i.f58680a.getClass();
            C32226l<C22830f, Boolean> lVar2 = C20770i.C20771a.f58682b;
            lVar.getClass();
            C87412m.m108594g(dVar, "kindFilter");
            C87412m.m108594g(lVar2, "nameFilter");
            C24476d dVar2 = C24476d.WHEN_GET_ALL_DESCRIPTORS;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (dVar.mo51213a(C24531d.f70103l)) {
                for (C22830f next : lVar.mo51830h(dVar, lVar2)) {
                    if (((Boolean) ((C20770i.C20771a.C20772a) lVar2).invoke(next)).booleanValue()) {
                        C26412a.m34008a(linkedHashSet, lVar.mo32462g(next, dVar2));
                    }
                }
            }
            if (dVar.mo51213a(C24531d.f70100i) && !dVar.f70111a.contains(C24528c.C24529a.f70091a)) {
                for (C22830f next2 : lVar.mo51831i(dVar, lVar2)) {
                    if (((Boolean) ((C20770i.C20771a.C20772a) lVar2).invoke(next2)).booleanValue()) {
                        linkedHashSet.addAll(lVar.mo32456a(next2, dVar2));
                    }
                }
            }
            if (dVar.mo51213a(C24531d.f70101j) && !dVar.f70111a.contains(C24528c.C24529a.f70091a)) {
                for (C22830f next3 : lVar.mo51836o(dVar, lVar2)) {
                    if (((Boolean) ((C20770i.C20771a.C20772a) lVar2).invoke(next3)).booleanValue()) {
                        linkedHashSet.addAll(lVar.mo32457b(next3, dVar2));
                    }
                }
            }
            return C110818d0.m150953y0(linkedHashSet);
        }
    }

    /* renamed from: jz3.l$d */
    public static final class C24836d extends C87413o implements C32224a<Set<? extends C22830f>> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24836d(C24832l lVar) {
            super(0);
            this.f70814d = lVar;
        }

        public Object invoke() {
            return this.f70814d.mo51830h(C24531d.f70106o, (C32226l<? super C22830f, Boolean>) null);
        }
    }

    /* renamed from: jz3.l$e */
    public static final class C24837e extends C87413o implements C32226l<C22830f, C26504r0> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24837e(C24832l lVar) {
            super(1);
            this.f70815d = lVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x011a, code lost:
            if (ty3.C26348p.m33867a(r6) == false) goto L_0x011d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00b1  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00d0  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x0120  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r22) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                vz3.f r1 = (vz3.C22830f) r1
                java.lang.String r2 = "name"
                gy3.C87412m.m108594g(r1, r2)
                jz3.l r2 = r0.f70815d
                jz3.l r3 = r2.f70795c
                r4 = 0
                if (r3 == 0) goto L_0x001d
                m04.h<vz3.f, wy3.r0> r2 = r3.f70799g
                java.lang.Object r1 = r2.invoke(r1)
                r4 = r1
                wy3.r0 r4 = (wy3.C26504r0) r4
                goto L_0x013b
            L_0x001d:
                m04.i<jz3.b> r2 = r2.f70797e
                java.lang.Object r2 = r2.invoke()
                jz3.b r2 = (jz3.C24794b) r2
                mz3.n r1 = r2.mo51777b(r1)
                if (r1 == 0) goto L_0x013b
                boolean r2 = r1.mo51107M()
                if (r2 != 0) goto L_0x013b
                jz3.l r2 = r0.f70815d
                r2.getClass()
                boolean r3 = r1.isFinal()
                r5 = 1
                r10 = r3 ^ 1
                iz3.h r3 = r2.f70794b
                xy3.h r7 = iz3.C24648f.m30829a(r3, r1)
                wy3.k r6 = r2.mo51838q()
                wy3.c0 r8 = wy3.C26442c0.FINAL
                wy3.l1 r3 = r1.getVisibility()
                wy3.s r9 = fz3.C24508n0.m30644a(r3)
                vz3.f r11 = r1.getName()
                iz3.h r3 = r2.f70794b
                iz3.c r3 = r3.f70290a
                lz3.b r3 = r3.f70265j
                lz3.a r12 = r3.mo37235a(r1)
                boolean r3 = r1.isFinal()
                r14 = 0
                if (r3 == 0) goto L_0x006e
                boolean r3 = r1.mo51020O()
                if (r3 == 0) goto L_0x006e
                r13 = 1
                goto L_0x006f
            L_0x006e:
                r13 = 0
            L_0x006f:
                hz3.f r3 = hz3.C24614f.m30802P0(r6, r7, r8, r9, r10, r11, r12, r13)
                r3.mo53725M0(r4, r4, r4, r4)
                iz3.h r6 = r2.f70794b
                kz3.d r6 = r6.f70294e
                mz3.w r7 = r1.getType()
                gz3.k r8 = gz3.C24597k.COMMON
                r9 = 3
                kz3.a r8 = kz3.C24863e.m31346b(r8, r14, r4, r9, r4)
                n04.j0 r6 = r6.mo51869e(r7, r8)
                boolean r7 = ty3.C26336h.m33831H(r6)
                if (r7 != 0) goto L_0x0095
                boolean r7 = ty3.C26336h.m33833J(r6)
                if (r7 == 0) goto L_0x00ae
            L_0x0095:
                boolean r7 = r1.isFinal()
                if (r7 == 0) goto L_0x00a3
                boolean r7 = r1.mo51020O()
                if (r7 == 0) goto L_0x00a3
                r7 = 1
                goto L_0x00a4
            L_0x00a3:
                r7 = 0
            L_0x00a4:
                if (r7 == 0) goto L_0x00ae
                boolean r7 = r1.mo51106E()
                if (r7 == 0) goto L_0x00ae
                r7 = 1
                goto L_0x00af
            L_0x00ae:
                r7 = 0
            L_0x00af:
                if (r7 == 0) goto L_0x00ba
                n04.j0 r6 = n04.C25187v1.m32089i(r6)
                java.lang.String r7 = "makeNotNullable(propertyType)"
                gy3.C87412m.m108593f(r6, r7)
            L_0x00ba:
                r16 = r6
                sx3.f0 r20 = sx3.C64186f0.f181907d
                wy3.u0 r18 = r2.mo51837p()
                r19 = 0
                r15 = r3
                r17 = r20
                r15.mo53726O0(r16, r17, r18, r19, r20)
                n04.j0 r6 = r3.getType()
                if (r6 == 0) goto L_0x0135
                int r7 = zz3.C26794h.f74523a
                boolean r7 = r3.f74445i
                if (r7 != 0) goto L_0x011d
                boolean r7 = n04.C25153l0.m31968a(r6)
                if (r7 == 0) goto L_0x00dd
                goto L_0x011d
            L_0x00dd:
                boolean r7 = n04.C25187v1.m32082b(r6)
                if (r7 == 0) goto L_0x00e4
                goto L_0x011e
            L_0x00e4:
                ty3.h r7 = d04.C24442a.m30538e(r3)
                boolean r8 = ty3.C26336h.m33831H(r6)
                if (r8 != 0) goto L_0x011e
                o04.c r8 = o04.C25318c.f71821a
                n04.s0 r9 = r7.mo53328v()
                o04.l r8 = (o04.C25332l) r8
                boolean r9 = r8.mo52404a(r9, r6)
                if (r9 != 0) goto L_0x011e
                java.lang.String r9 = "Number"
                wy3.e r9 = r7.mo53319k(r9)
                n04.s0 r9 = r9.mo36111s()
                boolean r9 = r8.mo52404a(r9, r6)
                if (r9 != 0) goto L_0x011e
                n04.s0 r7 = r7.mo53314f()
                boolean r7 = r8.mo52404a(r7, r6)
                if (r7 != 0) goto L_0x011e
                boolean r6 = ty3.C26348p.m33867a(r6)
                if (r6 == 0) goto L_0x011d
                goto L_0x011e
            L_0x011d:
                r5 = 0
            L_0x011e:
                if (r5 == 0) goto L_0x0128
                jz3.n r5 = new jz3.n
                r5.<init>(r2, r1, r3)
                r3.mo53748I0(r4, r5)
            L_0x0128:
                iz3.h r1 = r2.f70794b
                iz3.c r1 = r1.f70290a
                gz3.g r1 = r1.f70262g
                gz3.g$a r1 = (gz3.C24588g.C24589a) r1
                r1.getClass()
                r4 = r3
                goto L_0x013b
            L_0x0135:
                r1 = 64
                zz3.C26794h.m35213a(r1)
                throw r4
            L_0x013b:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: jz3.C24832l.C24837e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: jz3.l$f */
    public static final class C24838f extends C87413o implements C32226l<C22830f, Collection<? extends C26520x0>> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24838f(C24832l lVar) {
            super(1);
            this.f70816d = lVar;
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, "name");
            C24832l lVar = this.f70816d.f70795c;
            if (lVar != null) {
                return (Collection) ((C24959e.C24972m) lVar.f70798f).invoke(fVar);
            }
            ArrayList arrayList = new ArrayList();
            for (C25065q t : ((C24794b) this.f70816d.f70797e.invoke()).mo51778c(fVar)) {
                C24610e t2 = this.f70816d.mo51848t(t);
                if (this.f70816d.mo51839r(t2)) {
                    ((C24588g.C24589a) this.f70816d.f70794b.f70290a.f70262g).getClass();
                    arrayList.add(t2);
                }
            }
            this.f70816d.mo51832j(arrayList, fVar);
            return arrayList;
        }
    }

    /* renamed from: jz3.l$g */
    public static final class C24839g extends C87413o implements C32224a<C24794b> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24839g(C24832l lVar) {
            super(0);
            this.f70817d = lVar;
        }

        public Object invoke() {
            return this.f70817d.mo51833k();
        }
    }

    /* renamed from: jz3.l$h */
    public static final class C24840h extends C87413o implements C32224a<Set<? extends C22830f>> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24840h(C24832l lVar) {
            super(0);
            this.f70818d = lVar;
        }

        public Object invoke() {
            return this.f70818d.mo51831i(C24531d.f70107p, (C32226l<? super C22830f, Boolean>) null);
        }
    }

    /* renamed from: jz3.l$i */
    public static final class C24841i extends C87413o implements C32226l<C22830f, Collection<? extends C26520x0>> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24841i(C24832l lVar) {
            super(1);
            this.f70819d = lVar;
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, "name");
            LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) ((C24959e.C24972m) this.f70819d.f70798f).invoke(fVar));
            this.f70819d.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : linkedHashSet) {
                String a = C25404v.m32595a((C26520x0) next, false, false, 2, (Object) null);
                Object obj2 = linkedHashMap.get(a);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(a, obj2);
                }
                ((List) obj2).add(next);
            }
            for (List list : linkedHashMap.values()) {
                if (list.size() != 1) {
                    Collection a2 = C23602t.m28184a(list, C21295o.f60151d);
                    linkedHashSet.removeAll(list);
                    linkedHashSet.addAll(a2);
                }
            }
            this.f70819d.mo51834m(linkedHashSet, fVar);
            C24651h hVar = this.f70819d.f70794b;
            return C110818d0.m150953y0(hVar.f70290a.f70273r.mo52388c(hVar, linkedHashSet));
        }
    }

    /* renamed from: jz3.l$j */
    public static final class C24842j extends C87413o implements C32226l<C22830f, List<? extends C26504r0>> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24842j(C24832l lVar) {
            super(1);
            this.f70820d = lVar;
        }

        public Object invoke(Object obj) {
            C22830f fVar = (C22830f) obj;
            C87412m.m108594g(fVar, "name");
            ArrayList arrayList = new ArrayList();
            C26412a.m34008a(arrayList, this.f70820d.f70799g.invoke(fVar));
            this.f70820d.mo51835n(fVar, arrayList);
            if (C26794h.m35227o(this.f70820d.mo51838q(), C26453f.ANNOTATION_CLASS)) {
                return C110818d0.m150953y0(arrayList);
            }
            C24651h hVar = this.f70820d.f70794b;
            return C110818d0.m150953y0(hVar.f70290a.f70273r.mo52388c(hVar, arrayList));
        }
    }

    /* renamed from: jz3.l$k */
    public static final class C24843k extends C87413o implements C32224a<Set<? extends C22830f>> {

        /* renamed from: d */
        public final /* synthetic */ C24832l f70821d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24843k(C24832l lVar) {
            super(0);
            this.f70821d = lVar;
        }

        public Object invoke() {
            return this.f70821d.mo51836o(C24531d.f70108q, (C32226l<? super C22830f, Boolean>) null);
        }
    }

    static {
        Class<C24832l> cls = C24832l.class;
        f70793m = new C89104m[]{C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), C24560g0.m30727c(new C24575y(C24560g0.m30725a(cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public C24832l(C24651h hVar, C24832l lVar) {
        C87412m.m108594g(hVar, "c");
        this.f70794b = hVar;
        this.f70795c = lVar;
        this.f70796d = hVar.f70290a.f70256a.mo52001b(new C24835c(this), C64186f0.f181907d);
        this.f70797e = hVar.f70290a.f70256a.mo52006g(new C24839g(this));
        this.f70798f = hVar.f70290a.f70256a.mo52007h(new C24838f(this));
        this.f70799g = hVar.f70290a.f70256a.mo52004e(new C24837e(this));
        this.f70800h = hVar.f70290a.f70256a.mo52007h(new C24841i(this));
        this.f70801i = hVar.f70290a.f70256a.mo52006g(new C24840h(this));
        this.f70802j = hVar.f70290a.f70256a.mo52006g(new C24843k(this));
        this.f70803k = hVar.f70290a.f70256a.mo52006g(new C24836d(this));
        this.f70804l = hVar.f70290a.f70256a.mo52007h(new C24842j(this));
    }

    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return !mo32458c().contains(fVar) ? C64186f0.f181907d : (Collection) ((C24959e.C24972m) this.f70800h).invoke(fVar);
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return !mo32459d().contains(fVar) ? C64186f0.f181907d : (Collection) ((C24959e.C24972m) this.f70804l).invoke(fVar);
    }

    /* renamed from: c */
    public Set<C22830f> mo32458c() {
        return (Set) C24979m.m31587a(this.f70801i, this, f70793m[0]);
    }

    /* renamed from: d */
    public Set<C22830f> mo32459d() {
        return (Set) C24979m.m31587a(this.f70802j, this, f70793m[1]);
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        return (Collection) this.f70796d.invoke();
    }

    /* renamed from: f */
    public Set<C22830f> mo32461f() {
        return (Set) C24979m.m31587a(this.f70803k, this, f70793m[2]);
    }

    /* renamed from: h */
    public abstract Set<C22830f> mo51830h(C24531d dVar, C32226l<? super C22830f, Boolean> lVar);

    /* renamed from: i */
    public abstract Set<C22830f> mo51831i(C24531d dVar, C32226l<? super C22830f, Boolean> lVar);

    /* renamed from: j */
    public void mo51832j(Collection<C26520x0> collection, C22830f fVar) {
        C87412m.m108594g(collection, "result");
        C87412m.m108594g(fVar, "name");
    }

    /* renamed from: k */
    public abstract C24794b mo51833k();

    /* renamed from: l */
    public final C25143j0 mo51847l(C25065q qVar, C24651h hVar) {
        C87412m.m108594g(qVar, FirebaseAnalytics.C113379b.METHOD);
        C87412m.m108594g(hVar, "c");
        return hVar.f70294e.mo51869e(qVar.getReturnType(), C24863e.m31346b(C24597k.COMMON, qVar.mo51019F().mo51095x(), (C26446d1) null, 2, (Object) null));
    }

    /* renamed from: m */
    public abstract void mo51834m(Collection<C26520x0> collection, C22830f fVar);

    /* renamed from: n */
    public abstract void mo51835n(C22830f fVar, Collection<C26504r0> collection);

    /* renamed from: o */
    public abstract Set<C22830f> mo51836o(C24531d dVar, C32226l<? super C22830f, Boolean> lVar);

    /* renamed from: p */
    public abstract C26509u0 mo51837p();

    /* renamed from: q */
    public abstract C26469k mo51838q();

    /* renamed from: r */
    public boolean mo51839r(C24610e eVar) {
        C87412m.m108594g(eVar, "<this>");
        return true;
    }

    /* renamed from: s */
    public abstract C24833a mo51840s(C25065q qVar, List<? extends C26446d1> list, C25143j0 j0Var, List<? extends C26463h1> list2);

    /* renamed from: t */
    public final C24610e mo51848t(C25065q qVar) {
        C25065q qVar2 = qVar;
        C87412m.m108594g(qVar2, FirebaseAnalytics.C113379b.METHOD);
        C24610e X0 = C24610e.m30795X0(mo51838q(), C24648f.m30829a(this.f70794b, qVar2), qVar.getName(), this.f70794b.f70290a.f70265j.mo37235a(qVar2), ((C24794b) this.f70797e.invoke()).mo51781f(qVar.getName()) != null && qVar.mo51039h().isEmpty());
        C24651h hVar = this.f70794b;
        C87412m.m108594g(hVar, "<this>");
        C24651h hVar2 = new C24651h(hVar.f70290a, new C24652i(hVar, X0, qVar2, 0), hVar.f70292c);
        List<C25072x> typeParameters = qVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(typeParameters, 10));
        for (C25072x a : typeParameters) {
            C26446d1 a2 = hVar2.f70291b.mo51482a(a);
            C87412m.m108591d(a2);
            arrayList.add(a2);
        }
        C24834b u = mo51849u(hVar2, X0, qVar.mo51039h());
        C24833a s = mo51840s(qVar2, arrayList, mo51847l(qVar2, hVar2), u.f70811a);
        C25143j0 j0Var = s.f70806b;
        X0.mo51322W0(j0Var != null ? C26792g.m35208g(X0, j0Var, C26571h.C26572a.f73937a) : null, mo51837p(), C64186f0.f181907d, s.f70808d, s.f70807c, s.f70805a, qVar.isAbstract() ? C26442c0.ABSTRACT : qVar.isFinal() ^ true ? C26442c0.OPEN : C26442c0.FINAL, C24508n0.m30644a(qVar.getVisibility()), s.f70806b != null ? C90363p0.m113143b(new C13604l(C24610e.f70207M, C110818d0.m150914L(u.f70811a))) : C36903g0.f97931d);
        X0.mo51323Y0(s.f70809e, u.f70812b);
        if (!(!s.f70810f.isEmpty())) {
            return X0;
        }
        C24594j jVar = hVar2.f70290a.f70260e;
        List<String> list = s.f70810f;
        ((C24594j.C24595a) jVar).getClass();
        if (list == null) {
            C24594j.C24595a.m30776a(6);
            throw null;
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + mo51838q();
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [mz3.w] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final jz3.C24832l.C24834b mo51849u(iz3.C24651h r23, wy3.C26516w r24, java.util.List<? extends mz3.C25074z> r25) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "c"
            gy3.C87412m.m108594g(r0, r1)
            java.lang.String r1 = "function"
            r14 = r24
            gy3.C87412m.m108594g(r14, r1)
            java.lang.String r1 = "jValueParameters"
            r15 = r25
            gy3.C87412m.m108594g(r15, r1)
            java.lang.Iterable r1 = sx3.C110818d0.m150906E0(r25)
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = sx3.C36907w.m41090l(r1, r2)
            r13.<init>(r2)
            sx3.j0 r1 = (sx3.C26234j0) r1
            java.util.Iterator r1 = r1.iterator()
            r12 = 0
            r2 = 0
        L_0x002c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0129
            java.lang.Object r3 = r1.next()
            sx3.i0 r3 = (sx3.C64188i0) r3
            int r5 = r3.f181909a
            T r3 = r3.f181910b
            mz3.z r3 = (mz3.C25074z) r3
            xy3.h r6 = iz3.C24648f.m30829a(r0, r3)
            gz3.k r4 = gz3.C24597k.COMMON
            r7 = 3
            r8 = 0
            kz3.a r4 = kz3.C24863e.m31346b(r4, r12, r8, r7, r8)
            boolean r7 = r3.mo51068a()
            r9 = 1
            if (r7 == 0) goto L_0x008d
            mz3.w r7 = r3.getType()
            boolean r10 = r7 instanceof mz3.C25054f
            if (r10 == 0) goto L_0x005c
            r8 = r7
            mz3.f r8 = (mz3.C25054f) r8
        L_0x005c:
            if (r8 == 0) goto L_0x0076
            kz3.d r7 = r0.f70294e
            n04.j0 r4 = r7.mo51868c(r8, r4, r9)
            iz3.c r7 = r0.f70290a
            wy3.e0 r7 = r7.f70270o
            ty3.h r7 = r7.mo52623m()
            n04.j0 r7 = r7.mo53315g(r4)
            rx3.l r8 = new rx3.l
            r8.<init>(r4, r7)
            goto L_0x009d
        L_0x0076:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Vararg parameter should be an array: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008d:
            kz3.d r7 = r0.f70294e
            mz3.w r10 = r3.getType()
            n04.j0 r4 = r7.mo51869e(r10, r4)
            rx3.l r7 = new rx3.l
            r7.<init>(r4, r8)
            r8 = r7
        L_0x009d:
            A r4 = r8.f38555d
            r10 = r4
            n04.j0 r10 = (n04.C25143j0) r10
            B r4 = r8.f38556e
            r16 = r4
            n04.j0 r16 = (n04.C25143j0) r16
            vz3.f r4 = r24.getName()
            java.lang.String r4 = r4.mo35995b()
            java.lang.String r7 = "equals"
            boolean r4 = gy3.C87412m.m108589b(r4, r7)
            if (r4 == 0) goto L_0x00d7
            int r4 = r25.size()
            if (r4 != r9) goto L_0x00d7
            iz3.c r4 = r0.f70290a
            wy3.e0 r4 = r4.f70270o
            ty3.h r4 = r4.mo52623m()
            n04.s0 r4 = r4.mo53324p()
            boolean r4 = gy3.C87412m.m108589b(r4, r10)
            if (r4 == 0) goto L_0x00d7
            java.lang.String r4 = "other"
            vz3.f r4 = vz3.C22830f.m26794f(r4)
            goto L_0x00f5
        L_0x00d7:
            vz3.f r4 = r3.getName()
            if (r4 != 0) goto L_0x00de
            r2 = 1
        L_0x00de:
            if (r4 != 0) goto L_0x00f5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r7 = 112(0x70, float:1.57E-43)
            r4.append(r7)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            vz3.f r4 = vz3.C22830f.m26794f(r4)
        L_0x00f5:
            r17 = r2
            r7 = r4
            zy3.p0 r11 = new zy3.p0
            r4 = 0
            r9 = 0
            r18 = 0
            r19 = 0
            iz3.c r2 = r0.f70290a
            lz3.b r2 = r2.f70265j
            lz3.a r20 = r2.mo37235a(r3)
            r2 = r11
            r3 = r24
            r8 = r10
            r10 = r18
            r21 = r11
            r11 = r19
            r18 = 0
            r12 = r16
            r0 = r13
            r13 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r21
            r0.add(r2)
            r13 = r0
            r2 = r17
            r12 = 0
            r0 = r23
            goto L_0x002c
        L_0x0129:
            r0 = r13
            java.util.List r0 = sx3.C110818d0.m150953y0(r0)
            jz3.l$b r1 = new jz3.l$b
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jz3.C24832l.mo51849u(iz3.h, wy3.w, java.util.List):jz3.l$b");
    }
}
