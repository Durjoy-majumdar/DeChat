package oz3;

import fy3.C32224a;
import g04.C20770i;
import gy3.C87412m;
import gy3.C87413o;
import j04.C108521t;
import j04.C24747g;
import j04.C24763k;
import java.util.Collection;
import java.util.Set;
import l04.C24917k;
import pz3.C25505a;
import qz3.C26019c;
import qz3.C26046l;
import rx3.C13604l;
import sx3.C110826x0;
import sx3.C22415w0;
import sx3.C64186f0;
import uz3.C111238e;
import uz3.C26378f;
import uz3.C26380h;
import vz3.C22830f;
import wy3.C26465i0;
import xz3.C26601j;

/* renamed from: oz3.g */
public final class C25378g {

    /* renamed from: b */
    public static final Set<C25505a.C25506a> f71914b = C22415w0.m26092a(C25505a.C25506a.CLASS);

    /* renamed from: c */
    public static final Set<C25505a.C25506a> f71915c = C110826x0.m151017e(C25505a.C25506a.FILE_FACADE, C25505a.C25506a.MULTIFILE_CLASS_PART);

    /* renamed from: d */
    public static final C111238e f71916d = new C111238e(1, 1, 2);

    /* renamed from: e */
    public static final C111238e f71917e = new C111238e(1, 1, 11);

    /* renamed from: f */
    public static final C111238e f71918f = new C111238e(1, 1, 13);

    /* renamed from: a */
    public C24763k f71919a;

    /* renamed from: oz3.g$a */
    public static final class C25379a extends C87413o implements C32224a<Collection<? extends C22830f>> {

        /* renamed from: d */
        public static final C25379a f71920d = new C25379a();

        public C25379a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C64186f0.f181907d;
        }
    }

    /* renamed from: a */
    public final C20770i mo52572a(C26465i0 i0Var, C25395q qVar) {
        String[] strArr;
        C13604l<C26378f, C26046l> lVar;
        C87412m.m108594g(i0Var, "descriptor");
        C87412m.m108594g(qVar, "kotlinClass");
        Set<C25505a.C25506a> set = f71915c;
        C25505a b = qVar.mo37224b();
        String[] strArr2 = b.f72191c;
        if (strArr2 == null) {
            strArr2 = b.f72192d;
        }
        if (strArr2 == null || !set.contains(b.f72189a)) {
            strArr2 = null;
        }
        if (strArr2 == null || (strArr = qVar.mo37224b().f72193e) == null) {
            return null;
        }
        try {
            lVar = C26380h.m33953h(strArr2, strArr);
        } catch (C26601j e) {
            throw new IllegalStateException("Could not read data from " + qVar.mo37223a(), e);
        } catch (Throwable th) {
            if (mo52574c().f70624c.mo51749f() || qVar.mo37224b().f72190b.mo162990c()) {
                throw th;
            }
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        C26046l lVar2 = (C26046l) lVar.f38556e;
        C26378f fVar = (C26378f) lVar.f38555d;
        C25383k kVar = new C25383k(qVar, lVar2, fVar, mo52575d(qVar), mo52576e(qVar), mo52573b(qVar));
        return new C24917k(i0Var, lVar2, fVar, qVar.mo37224b().f72190b, kVar, mo52574c(), "scope for " + kVar + " in " + i0Var, C25379a.f71920d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (((r6 & 32) != 0) == false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final l04.C34153g mo52573b(oz3.C25395q r6) {
        /*
            r5 = this;
            l04.g r0 = l04.C34153g.STABLE
            j04.k r1 = r5.mo52574c()
            j04.l r1 = r1.f70624c
            boolean r1 = r1.mo51746c()
            if (r1 == 0) goto L_0x000f
            goto L_0x004f
        L_0x000f:
            pz3.a r1 = r6.mo37224b()
            int r1 = r1.f72195g
            r2 = r1 & 64
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001d
            r2 = 1
            goto L_0x001e
        L_0x001d:
            r2 = 0
        L_0x001e:
            if (r2 == 0) goto L_0x002b
            r1 = r1 & 32
            if (r1 == 0) goto L_0x0026
            r1 = 1
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            if (r1 != 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0031
            l04.g r0 = l04.C34153g.FIR_UNSTABLE
            goto L_0x004f
        L_0x0031:
            pz3.a r6 = r6.mo37224b()
            int r6 = r6.f72195g
            r1 = r6 & 16
            if (r1 == 0) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r1 == 0) goto L_0x004a
            r6 = r6 & 32
            if (r6 == 0) goto L_0x0046
            r6 = 1
            goto L_0x0047
        L_0x0046:
            r6 = 0
        L_0x0047:
            if (r6 != 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r3 = 0
        L_0x004b:
            if (r3 == 0) goto L_0x004f
            l04.g r0 = l04.C34153g.IR_UNSTABLE
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.C25378g.mo52573b(oz3.q):l04.g");
    }

    /* renamed from: c */
    public final C24763k mo52574c() {
        C24763k kVar = this.f71919a;
        if (kVar != null) {
            return kVar;
        }
        C87412m.m108603p("components");
        throw null;
    }

    /* renamed from: d */
    public final C108521t<C111238e> mo52575d(C25395q qVar) {
        if (mo52574c().f70624c.mo51749f() || qVar.mo37224b().f72190b.mo162990c()) {
            return null;
        }
        return new C108521t<>(qVar.mo37224b().f72190b, C111238e.f333108g, qVar.mo37223a(), qVar.mo37228f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (gy3.C87412m.m108589b(r5.mo37224b().f72190b, f71916d) == false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52576e(oz3.C25395q r5) {
        /*
            r4 = this;
            j04.k r0 = r4.mo52574c()
            j04.l r0 = r0.f70624c
            boolean r0 = r0.mo51747d()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            pz3.a r0 = r5.mo37224b()
            int r0 = r0.f72195g
            r0 = r0 & 2
            if (r0 == 0) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 != 0) goto L_0x0059
            pz3.a r0 = r5.mo37224b()
            uz3.e r0 = r0.f72190b
            uz3.e r3 = f71916d
            boolean r0 = gy3.C87412m.m108589b(r0, r3)
            if (r0 != 0) goto L_0x0059
        L_0x002b:
            j04.k r0 = r4.mo52574c()
            j04.l r0 = r0.f70624c
            boolean r0 = r0.mo51745b()
            if (r0 != 0) goto L_0x0056
            pz3.a r0 = r5.mo37224b()
            int r0 = r0.f72195g
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x0056
            pz3.a r5 = r5.mo37224b()
            uz3.e r5 = r5.f72190b
            uz3.e r0 = f71917e
            boolean r5 = gy3.C87412m.m108589b(r5, r0)
            if (r5 == 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.C25378g.mo52576e(oz3.q):boolean");
    }

    /* renamed from: f */
    public final C24747g mo52577f(C25395q qVar) {
        String[] strArr;
        C13604l<C26378f, C26019c> lVar;
        C87412m.m108594g(qVar, "kotlinClass");
        Set<C25505a.C25506a> set = f71914b;
        C25505a b = qVar.mo37224b();
        String[] strArr2 = b.f72191c;
        if (strArr2 == null) {
            strArr2 = b.f72192d;
        }
        if (strArr2 == null || !set.contains(b.f72189a)) {
            strArr2 = null;
        }
        if (strArr2 == null || (strArr = qVar.mo37224b().f72193e) == null) {
            return null;
        }
        try {
            lVar = C26380h.m33952f(strArr2, strArr);
        } catch (C26601j e) {
            throw new IllegalStateException("Could not read data from " + qVar.mo37223a(), e);
        } catch (Throwable th) {
            if (mo52574c().f70624c.mo51749f() || qVar.mo37224b().f72190b.mo162990c()) {
                throw th;
            }
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        return new C24747g((C26378f) lVar.f38555d, (C26019c) lVar.f38556e, qVar.mo37224b().f72190b, new C25402s(qVar, mo52575d(qVar), mo52576e(qVar), mo52573b(qVar)));
    }
}
