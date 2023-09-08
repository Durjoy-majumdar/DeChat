package g04;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.List;
import m04.C21480i;
import m04.C24979m;
import m04.C24980n;
import ny3.C89104m;
import sx3.C64186f0;
import vz3.C22830f;
import w04.C26413e;
import wy3.C26447e;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26516w;
import wy3.C26520x0;

/* renamed from: g04.e */
public abstract class C24534e extends C24538j {

    /* renamed from: d */
    public static final /* synthetic */ C89104m<Object>[] f70115d = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C24534e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b */
    public final C26447e f70116b;

    /* renamed from: c */
    public final C21480i f70117c;

    /* renamed from: g04.e$a */
    public static final class C24535a extends C87413o implements C32224a<List<? extends C26469k>> {

        /* renamed from: d */
        public final /* synthetic */ C24534e f70118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24535a(C24534e eVar) {
            super(0);
            this.f70118d = eVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: sx3.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: sx3.f0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: sx3.f0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r12 = this;
                g04.e r0 = r12.f70118d
                java.util.List r0 = r0.mo51217h()
                g04.e r1 = r12.f70118d
                r1.getClass()
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 3
                r2.<init>(r3)
                wy3.e r4 = r1.f70116b
                n04.j1 r4 = r4.mo36110l()
                java.util.Collection r4 = r4.mo37096r()
                java.lang.String r5 = "containingClass.typeConstructor.supertypes"
                gy3.C87412m.m108593f(r4, r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x0029:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0042
                java.lang.Object r6 = r4.next()
                n04.j0 r6 = (n04.C25143j0) r6
                g04.i r6 = r6.mo37088n()
                r7 = 0
                java.util.Collection r6 = g04.C20774l.C20775a.m22732a(r6, r7, r7, r3, r7)
                sx3.C64175a0.m75508p(r5, r6)
                goto L_0x0029
            L_0x0042:
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r4 = r5.iterator()
            L_0x004b:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x005d
                java.lang.Object r5 = r4.next()
                boolean r6 = r5 instanceof wy3.C26436b
                if (r6 == 0) goto L_0x004b
                r3.add(r5)
                goto L_0x004b
            L_0x005d:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x0066:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x008b
                java.lang.Object r5 = r3.next()
                r6 = r5
                wy3.b r6 = (wy3.C26436b) r6
                vz3.f r6 = r6.getName()
                java.lang.Object r7 = r4.get(r6)
                if (r7 != 0) goto L_0x0085
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                r4.put(r6, r7)
            L_0x0085:
                java.util.List r7 = (java.util.List) r7
                r7.add(r5)
                goto L_0x0066
            L_0x008b:
                java.util.Set r3 = r4.entrySet()
                java.util.Iterator r3 = r3.iterator()
            L_0x0093:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0137
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                vz3.f r5 = (vz3.C22830f) r5
                java.lang.Object r4 = r4.getValue()
                java.util.List r4 = (java.util.List) r4
                java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
                r6.<init>()
                java.util.Iterator r4 = r4.iterator()
            L_0x00b4:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x00db
                java.lang.Object r7 = r4.next()
                r8 = r7
                wy3.b r8 = (wy3.C26436b) r8
                boolean r8 = r8 instanceof wy3.C26516w
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                java.lang.Object r9 = r6.get(r8)
                if (r9 != 0) goto L_0x00d5
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                r6.put(r8, r9)
            L_0x00d5:
                java.util.List r9 = (java.util.List) r9
                r9.add(r7)
                goto L_0x00b4
            L_0x00db:
                java.util.Set r4 = r6.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x00e3:
                boolean r6 = r4.hasNext()
                if (r6 == 0) goto L_0x0093
                java.lang.Object r6 = r4.next()
                java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                java.lang.Object r7 = r6.getKey()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                java.lang.Object r6 = r6.getValue()
                r8 = r6
                java.util.List r8 = (java.util.List) r8
                zz3.n r6 = zz3.C26802n.f74534f
                if (r7 == 0) goto L_0x0128
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Iterator r9 = r0.iterator()
            L_0x010d:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L_0x012a
                java.lang.Object r10 = r9.next()
                r11 = r10
                wy3.w r11 = (wy3.C26516w) r11
                vz3.f r11 = r11.getName()
                boolean r11 = gy3.C87412m.m108589b(r11, r5)
                if (r11 == 0) goto L_0x010d
                r7.add(r10)
                goto L_0x010d
            L_0x0128:
                sx3.f0 r7 = sx3.C64186f0.f181907d
            L_0x012a:
                r9 = r7
                wy3.e r10 = r1.f70116b
                g04.f r11 = new g04.f
                r11.<init>(r2, r1)
                r7 = r5
                r6.mo53763h(r7, r8, r9, r10, r11)
                goto L_0x00e3
            L_0x0137:
                java.util.List r1 = w04.C26412a.m34009b(r2)
                java.util.List r0 = sx3.C110818d0.m150933e0(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: g04.C24534e.C24535a.invoke():java.lang.Object");
        }
    }

    public C24534e(C24980n nVar, C26447e eVar) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(eVar, "containingClass");
        this.f70116b = eVar;
        this.f70117c = nVar.mo52006g(new C24535a(this));
    }

    /* renamed from: a */
    public Collection<C26520x0> mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C26413e eVar = new C26413e();
        for (Object next : (List) C24979m.m31587a(this.f70117c, this, f70115d[0])) {
            if ((next instanceof C26520x0) && C87412m.m108589b(((C26520x0) next).getName(), fVar)) {
                eVar.add(next);
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public Collection<C26504r0> mo32457b(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C26413e eVar = new C26413e();
        for (Object next : (List) C24979m.m31587a(this.f70117c, this, f70115d[0])) {
            if ((next instanceof C26504r0) && C87412m.m108589b(((C26504r0) next).getName(), fVar)) {
                eVar.add(next);
            }
        }
        return eVar;
    }

    /* renamed from: e */
    public Collection<C26469k> mo32460e(C24531d dVar, C32226l<? super C22830f, Boolean> lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        return !dVar.mo51213a(C24531d.f70105n.f70112b) ? C64186f0.f181907d : (List) C24979m.m31587a(this.f70117c, this, f70115d[0]);
    }

    /* renamed from: h */
    public abstract List<C26516w> mo51217h();
}
