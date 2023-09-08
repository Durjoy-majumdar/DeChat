package hz3;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import n04.C25143j0;
import rx3.C13604l;
import vz3.C22830f;
import wy3.C26434a;
import wy3.C26436b;
import wy3.C26463h1;
import wy3.C26469k;
import wy3.C26509u0;
import wy3.C26516w;
import wy3.C26520x0;
import wy3.C26521y0;
import xy3.C26571h;
import zy3.C26755k0;
import zy3.C26777s;
import zz3.C26792g;

/* renamed from: hz3.e */
public class C24610e extends C26755k0 implements C24607a {

    /* renamed from: M */
    public static final C26434a.C22933a<C26463h1> f70207M = new C24611a();

    /* renamed from: N */
    public static final C26434a.C22933a<Boolean> f70208N = new C24612b();

    /* renamed from: K */
    public C24613c f70209K;

    /* renamed from: L */
    public final boolean f70210L;

    /* renamed from: hz3.e$a */
    public static class C24611a implements C26434a.C22933a<C26463h1> {
    }

    /* renamed from: hz3.e$b */
    public static class C24612b implements C26434a.C22933a<Boolean> {
    }

    /* renamed from: hz3.e$c */
    public enum C24613c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        

        /* renamed from: d */
        public final boolean f70216d;

        /* renamed from: e */
        public final boolean f70217e;

        /* access modifiers changed from: public */
        C24613c(boolean z, boolean z2) {
            this.f70216d = z;
            this.f70217e = z2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24610e(C26469k kVar, C26520x0 x0Var, C26571h hVar, C22830f fVar, C26436b.C26437a aVar, C26521y0 y0Var, boolean z) {
        super(kVar, x0Var, hVar, fVar, aVar, y0Var);
        if (kVar == null) {
            m30794D(0);
            throw null;
        } else if (hVar == null) {
            m30794D(1);
            throw null;
        } else if (fVar == null) {
            m30794D(2);
            throw null;
        } else if (aVar == null) {
            m30794D(3);
            throw null;
        } else if (y0Var != null) {
            this.f70209K = null;
            this.f70210L = z;
        } else {
            m30794D(4);
            throw null;
        }
    }

    /* renamed from: D */
    public static /* synthetic */ void m30794D(int i) {
        String str = (i == 13 || i == 18 || i == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 13 || i == 18 || i == 21) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = FirebaseAnalytics.C113379b.SOURCE;
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 13) {
            objArr[1] = "initialize";
        } else if (i == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 13 || i == 18 || i == 21) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: X0 */
    public static C24610e m30795X0(C26469k kVar, C26571h hVar, C22830f fVar, C26521y0 y0Var, boolean z) {
        if (kVar == null) {
            m30794D(5);
            throw null;
        } else if (hVar == null) {
            m30794D(6);
            throw null;
        } else if (fVar == null) {
            m30794D(7);
            throw null;
        } else if (y0Var != null) {
            return new C24610e(kVar, (C26520x0) null, hVar, fVar, C26436b.C26437a.DECLARATION, y0Var, z);
        } else {
            m30794D(8);
            throw null;
        }
    }

    /* renamed from: J0 */
    public C26777s mo51316J0(C26469k kVar, C26516w wVar, C26436b.C26437a aVar, C22830f fVar, C26571h hVar, C26521y0 y0Var) {
        if (kVar == null) {
            m30794D(14);
            throw null;
        } else if (aVar == null) {
            m30794D(15);
            throw null;
        } else if (hVar == null) {
            m30794D(16);
            throw null;
        } else if (y0Var != null) {
            C26520x0 x0Var = (C26520x0) wVar;
            if (fVar == null) {
                fVar = getName();
            }
            C24610e eVar = new C24610e(kVar, x0Var, hVar, fVar, aVar, y0Var, this.f70210L);
            C24613c cVar = this.f70209K;
            eVar.mo51323Y0(cVar.f70216d, cVar.f70217e);
            return eVar;
        } else {
            m30794D(17);
            throw null;
        }
    }

    /* renamed from: M */
    public boolean mo51317M() {
        return this.f70209K.f70217e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (r3.f73193b.mo90759d(r4) == false) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0067 A[SYNTHETIC] */
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zy3.C26755k0 mo51322W0(wy3.C26509u0 r2, wy3.C26509u0 r3, java.util.List<wy3.C26509u0> r4, java.util.List<? extends wy3.C26446d1> r5, java.util.List<wy3.C26463h1> r6, n04.C25143j0 r7, wy3.C26442c0 r8, wy3.C26505s r9, java.util.Map<? extends wy3.C26434a.C22933a<?>, ?> r10) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00a4
            if (r6 == 0) goto L_0x009e
            if (r9 == 0) goto L_0x0098
            super.mo51322W0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            t04.q r2 = t04.C26276q.f73210a
            r2.getClass()
            java.util.List r2 = r2.mo53166a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0091
            java.lang.Object r3 = r2.next()
            t04.h r3 = (t04.C26261h) r3
            r3.getClass()
            vz3.f r4 = r3.f73192a
            r5 = 0
            if (r4 == 0) goto L_0x003a
            vz3.f r4 = r1.getName()
            vz3.f r6 = r3.f73192a
            boolean r4 = gy3.C87412m.m108589b(r4, r6)
            if (r4 != 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            z04.k r4 = r3.f73193b
            if (r4 == 0) goto L_0x0054
            vz3.f r4 = r1.getName()
            java.lang.String r4 = r4.mo35995b()
            java.lang.String r6 = "functionDescriptor.name.asString()"
            gy3.C87412m.m108593f(r4, r6)
            z04.k r6 = r3.f73193b
            boolean r4 = r6.mo90759d(r4)
            if (r4 != 0) goto L_0x0054
            goto L_0x0062
        L_0x0054:
            java.util.Collection<vz3.f> r4 = r3.f73194c
            if (r4 == 0) goto L_0x0064
            vz3.f r6 = r1.getName()
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x0064
        L_0x0062:
            r4 = 0
            goto L_0x0065
        L_0x0064:
            r4 = 1
        L_0x0065:
            if (r4 == 0) goto L_0x0019
            t04.f[] r2 = r3.f73196e
            int r4 = r2.length
        L_0x006a:
            if (r5 >= r4) goto L_0x007d
            r6 = r2[r5]
            java.lang.String r6 = r6.mo53156a(r1)
            if (r6 == 0) goto L_0x007a
            t04.g$b r2 = new t04.g$b
            r2.<init>(r6)
            goto L_0x0093
        L_0x007a:
            int r5 = r5 + 1
            goto L_0x006a
        L_0x007d:
            fy3.l<wy3.w, java.lang.String> r2 = r3.f73195d
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x008e
            t04.g$b r3 = new t04.g$b
            r3.<init>(r2)
            r2 = r3
            goto L_0x0093
        L_0x008e:
            t04.g$c r2 = t04.C26257g.C26260c.f73191b
            goto L_0x0093
        L_0x0091:
            t04.g$a r2 = t04.C26257g.C26258a.f73190b
        L_0x0093:
            boolean r2 = r2.f73189a
            r1.f74466s = r2
            return r1
        L_0x0098:
            r2 = 12
            m30794D(r2)
            throw r0
        L_0x009e:
            r2 = 11
            m30794D(r2)
            throw r0
        L_0x00a4:
            r2 = 10
            m30794D(r2)
            throw r0
        L_0x00aa:
            r2 = 9
            m30794D(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: hz3.C24610e.mo51322W0(wy3.u0, wy3.u0, java.util.List, java.util.List, java.util.List, n04.j0, wy3.c0, wy3.s, java.util.Map):zy3.k0");
    }

    /* renamed from: Y0 */
    public void mo51323Y0(boolean z, boolean z2) {
        this.f70209K = z ? z2 ? C24613c.STABLE_SYNTHESIZED : C24613c.STABLE_DECLARED : z2 ? C24613c.NON_STABLE_SYNTHESIZED : C24613c.NON_STABLE_DECLARED;
    }

    /* renamed from: y0 */
    public C24607a mo51315y0(C25143j0 j0Var, List list, C25143j0 j0Var2, C13604l lVar) {
        if (list == null) {
            m30794D(19);
            throw null;
        } else if (j0Var2 != null) {
            List<C26463h1> a = C24616h.m30810a(list, mo52639h(), this);
            C26509u0 g = j0Var == null ? null : C26792g.m35208g(this, j0Var, C26571h.C26572a.f73937a);
            C26777s.C26780c cVar = (C26777s.C26780c) mo52597p();
            cVar.f74483g = a;
            cVar.mo52604e(j0Var2);
            cVar.f74485i = g;
            cVar.f74492p = true;
            cVar.f74491o = true;
            C24610e eVar = (C24610e) cVar.build();
            if (lVar != null) {
                eVar.mo53750O0((C26434a.C22933a) lVar.f38555d, lVar.f38556e);
            }
            if (eVar != null) {
                return eVar;
            }
            m30794D(21);
            throw null;
        } else {
            m30794D(20);
            throw null;
        }
    }
}
