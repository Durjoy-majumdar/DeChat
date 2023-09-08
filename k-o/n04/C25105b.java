package n04;

import d04.C24442a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m04.C24980n;
import ty3.C26336h;
import w04.C26413e;
import wy3.C26447e;
import wy3.C26469k;

/* renamed from: n04.b */
public abstract class C25105b extends C25127i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25105b(C24980n nVar) {
        super(nVar);
        if (nVar != null) {
        } else {
            m31828j(0);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m31828j(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = 3
            goto L_0x0018
        L_0x0017:
            r5 = 2
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25105b.m31828j(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (gy3.C87412m.m108589b(((wy3.C26465i0) r0).mo53444d(), ((wy3.C26465i0) r6).mo53444d()) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r6 = true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo52233b(wy3.C22935h r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x007c
            boolean r0 = r6 instanceof wy3.C26447e
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x007b
            wy3.e r0 = r5.mo37094o()
            java.lang.String r3 = "first"
            gy3.C87412m.m108594g(r0, r3)
            java.lang.String r3 = "second"
            gy3.C87412m.m108594g(r6, r3)
            vz3.f r3 = r0.getName()
            vz3.f r4 = r6.getName()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 != 0) goto L_0x0025
            goto L_0x0059
        L_0x0025:
            wy3.k r0 = r0.mo51892b()
            wy3.k r6 = r6.mo51892b()
        L_0x002d:
            if (r0 == 0) goto L_0x0057
            if (r6 == 0) goto L_0x0057
            boolean r3 = r0 instanceof wy3.C26448e0
            if (r3 == 0) goto L_0x0038
            boolean r6 = r6 instanceof wy3.C26448e0
            goto L_0x0078
        L_0x0038:
            boolean r3 = r6 instanceof wy3.C26448e0
            if (r3 == 0) goto L_0x003d
            goto L_0x0059
        L_0x003d:
            boolean r3 = r0 instanceof wy3.C26465i0
            if (r3 == 0) goto L_0x005b
            boolean r3 = r6 instanceof wy3.C26465i0
            if (r3 == 0) goto L_0x0059
            wy3.i0 r0 = (wy3.C26465i0) r0
            vz3.c r0 = r0.mo53444d()
            wy3.i0 r6 = (wy3.C26465i0) r6
            vz3.c r6 = r6.mo53444d()
            boolean r6 = gy3.C87412m.m108589b(r0, r6)
            if (r6 == 0) goto L_0x0059
        L_0x0057:
            r6 = 1
            goto L_0x0078
        L_0x0059:
            r6 = 0
            goto L_0x0078
        L_0x005b:
            boolean r3 = r6 instanceof wy3.C26465i0
            if (r3 == 0) goto L_0x0060
            goto L_0x0059
        L_0x0060:
            vz3.f r3 = r0.getName()
            vz3.f r4 = r6.getName()
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 != 0) goto L_0x006f
            goto L_0x0059
        L_0x006f:
            wy3.k r0 = r0.mo51892b()
            wy3.k r6 = r6.mo51892b()
            goto L_0x002d
        L_0x0078:
            if (r6 == 0) goto L_0x007b
            r1 = 1
        L_0x007b:
            return r1
        L_0x007c:
            r6 = 2
            m31828j(r6)
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n04.C25105b.mo52233b(wy3.h):boolean");
    }

    /* renamed from: d */
    public C25143j0 mo52234d() {
        if (C26336h.m33832I(mo37094o())) {
            return null;
        }
        return mo37092m().mo53314f();
    }

    /* renamed from: e */
    public Collection<C25143j0> mo52235e(boolean z) {
        C26469k b = mo37094o().mo51892b();
        if (!(b instanceof C26447e)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            m31828j(3);
            throw null;
        }
        C26413e eVar = new C26413e();
        C26447e eVar2 = (C26447e) b;
        eVar.add(eVar2.mo36111s());
        C26447e A0 = eVar2.mo51787A0();
        if (z && A0 != null) {
            eVar.add(A0.mo36111s());
        }
        return eVar;
    }

    /* renamed from: k */
    public abstract C26447e mo37094o();

    /* renamed from: m */
    public C26336h mo37092m() {
        C26336h e = C24442a.m30538e(mo37094o());
        if (e != null) {
            return e;
        }
        m31828j(1);
        throw null;
    }
}
