package ry3;

import d04.C24442a;
import gy3.C87412m;
import java.lang.reflect.Method;
import n04.C25143j0;
import n04.C25187v1;
import qy3.C118215l0;
import qy3.C25987u0;
import ty3.C26336h;
import wy3.C22935h;
import wy3.C26436b;
import wy3.C26447e;
import wy3.C26467j;
import wy3.C26469k;
import wy3.C26509u0;
import zz3.C26798j;

/* renamed from: ry3.i */
public final class C26150i {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = m33569e((r0 = m33567c(r2)));
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m33565a(java.lang.Object r1, wy3.C26436b r2) {
        /*
            java.lang.String r0 = "descriptor"
            gy3.C87412m.m108594g(r2, r0)
            boolean r0 = r2 instanceof wy3.C26504r0
            if (r0 == 0) goto L_0x0013
            r0 = r2
            wy3.i1 r0 = (wy3.C26466i1) r0
            boolean r0 = zz3.C26798j.m35241d(r0)
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            n04.j0 r0 = m33567c(r2)
            if (r0 == 0) goto L_0x002a
            java.lang.Class r0 = m33569e(r0)
            if (r0 == 0) goto L_0x002a
            java.lang.reflect.Method r2 = m33568d(r0, r2)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object r1 = r2.invoke(r1, r0)
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ry3.C26150i.m33565a(java.lang.Object, wy3.b):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if ((r0 != null && zz3.C26798j.m35240c(r0)) != false) goto L_0x006d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.lang.reflect.Member> ry3.C26121e<M> m33566b(ry3.C26121e<? extends M> r5, wy3.C26436b r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "descriptor"
            gy3.C87412m.m108594g(r6, r0)
            boolean r0 = zz3.C26798j.m35238a(r6)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x006d
            java.util.List r0 = r6.mo52639h()
            java.lang.String r3 = "descriptor.valueParameters"
            gy3.C87412m.m108593f(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x0023
        L_0x0021:
            r0 = 0
            goto L_0x0043
        L_0x0023:
            java.util.Iterator r0 = r0.iterator()
        L_0x0027:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0021
            java.lang.Object r3 = r0.next()
            wy3.h1 r3 = (wy3.C26463h1) r3
            n04.j0 r3 = r3.getType()
            java.lang.String r4 = "it.type"
            gy3.C87412m.m108593f(r3, r4)
            boolean r3 = zz3.C26798j.m35240c(r3)
            if (r3 == 0) goto L_0x0027
            r0 = 1
        L_0x0043:
            if (r0 != 0) goto L_0x006d
            n04.j0 r0 = r6.getReturnType()
            if (r0 == 0) goto L_0x0053
            boolean r0 = zz3.C26798j.m35240c(r0)
            if (r0 != r1) goto L_0x0053
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            if (r0 != 0) goto L_0x006d
            boolean r0 = r5 instanceof ry3.C26120d
            if (r0 != 0) goto L_0x006c
            n04.j0 r0 = m33567c(r6)
            if (r0 == 0) goto L_0x0068
            boolean r0 = zz3.C26798j.m35240c(r0)
            if (r0 != r1) goto L_0x0068
            r0 = 1
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            if (r1 == 0) goto L_0x0075
            ry3.h r0 = new ry3.h
            r0.<init>(r6, r5, r7)
            r5 = r0
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ry3.C26150i.m33566b(ry3.e, wy3.b, boolean):ry3.e");
    }

    /* renamed from: c */
    public static final C25143j0 m33567c(C26436b bVar) {
        C26509u0 I = bVar.mo52627I();
        C26509u0 H = bVar.mo52626H();
        if (I != null) {
            return I.getType();
        }
        if (H == null) {
            return null;
        }
        if (bVar instanceof C26467j) {
            return H.getType();
        }
        C26469k b = bVar.mo51892b();
        C26447e eVar = b instanceof C26447e ? (C26447e) b : null;
        if (eVar != null) {
            return eVar.mo36111s();
        }
        return null;
    }

    /* renamed from: d */
    public static final Method m33568d(Class<?> cls, C26436b bVar) {
        C87412m.m108594g(cls, "<this>");
        C87412m.m108594g(bVar, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C87412m.m108593f(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new C118215l0("No unbox method found in inline class: " + cls + " (calling " + bVar + ')');
        }
    }

    /* renamed from: e */
    public static final Class<?> m33569e(C25143j0 j0Var) {
        C87412m.m108594g(j0Var, "<this>");
        Class<?> f = m33570f(j0Var.mo37081K0().mo37094o());
        if (f == null) {
            return null;
        }
        if (!C25187v1.m32087g(j0Var)) {
            return f;
        }
        C25143j0 e = C26798j.m35242e(j0Var);
        if (e != null && !C25187v1.m32087g(e) && !C26336h.m33831H(e)) {
            return f;
        }
        return null;
    }

    /* renamed from: f */
    public static final Class<?> m33570f(C26469k kVar) {
        if (!(kVar instanceof C26447e) || !C26798j.m35239b(kVar)) {
            return null;
        }
        C26447e eVar = (C26447e) kVar;
        Class<?> h = C25987u0.m33177h(eVar);
        if (h != null) {
            return h;
        }
        throw new C118215l0("Class object for the class " + eVar.getName() + " cannot be found (classId=" + C24442a.m30539f((C22935h) kVar) + ')');
    }
}
