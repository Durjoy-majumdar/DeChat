package cz3;

import gy3.C87412m;
import mz3.C25070v;

/* renamed from: cz3.g0 */
public final class C24420g0 extends C24406b0 implements C25070v {

    /* renamed from: a */
    public final Object f69869a;

    public C24420g0(Object obj) {
        C87412m.m108594g(obj, "recordComponent");
        this.f69869a = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Member mo51021P() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f69869a
            java.lang.String r1 = "recordComponent"
            gy3.C87412m.m108594g(r0, r1)
            cz3.a$a r1 = cz3.C24401a.f69843a
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x002f
            java.lang.Class r1 = r0.getClass()
            cz3.a$a r4 = new cz3.a$a     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.String r5 = "getType"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.String r6 = "getAccessor"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0028 }
            r4.<init>(r5, r1)     // Catch:{ NoSuchMethodException -> 0x0028 }
            r1 = r4
            goto L_0x002d
        L_0x0028:
            cz3.a$a r1 = new cz3.a$a
            r1.<init>(r3, r3)
        L_0x002d:
            cz3.C24401a.f69843a = r1
        L_0x002f:
            java.lang.reflect.Method r1 = r1.f69845b
            if (r1 != 0) goto L_0x0034
            goto L_0x0042
        L_0x0034:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.reflect.Method"
            gy3.C87412m.m108592e(r0, r1)
            r3 = r0
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
        L_0x0042:
            if (r3 == 0) goto L_0x0045
            return r3
        L_0x0045:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            java.lang.String r1 = "Can't find `getAccessor` method"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cz3.C24420g0.mo51021P():java.lang.reflect.Member");
    }

    /* renamed from: a */
    public boolean mo51058a() {
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public mz3.C25071w getType() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f69869a
            java.lang.String r1 = "recordComponent"
            gy3.C87412m.m108594g(r0, r1)
            cz3.a$a r1 = cz3.C24401a.f69843a
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x002f
            java.lang.Class r1 = r0.getClass()
            cz3.a$a r4 = new cz3.a$a     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.String r5 = "getType"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.String r6 = "getAccessor"
            java.lang.Class[] r7 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0028 }
            java.lang.reflect.Method r1 = r1.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0028 }
            r4.<init>(r5, r1)     // Catch:{ NoSuchMethodException -> 0x0028 }
            r1 = r4
            goto L_0x002d
        L_0x0028:
            cz3.a$a r1 = new cz3.a$a
            r1.<init>(r3, r3)
        L_0x002d:
            cz3.C24401a.f69843a = r1
        L_0x002f:
            java.lang.reflect.Method r1 = r1.f69844a
            if (r1 != 0) goto L_0x0034
            goto L_0x0042
        L_0x0034:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = r1.invoke(r0, r2)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<*>"
            gy3.C87412m.m108592e(r0, r1)
            r3 = r0
            java.lang.Class r3 = (java.lang.Class) r3
        L_0x0042:
            if (r3 == 0) goto L_0x004a
            cz3.v r0 = new cz3.v
            r0.<init>(r3)
            return r0
        L_0x004a:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            java.lang.String r1 = "Can't find `getType` method"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cz3.C24420g0.getType():mz3.w");
    }
}
