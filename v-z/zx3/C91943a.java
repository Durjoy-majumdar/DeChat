package zx3;

import gy3.C87412m;
import java.lang.reflect.Method;
import ky3.C88332b;
import ky3.C88334c;

/* renamed from: zx3.a */
public class C91943a {

    /* renamed from: zx3.a$a */
    public static final class C91944a {

        /* renamed from: a */
        public static final Method f263215a;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Class[]} */
        /* JADX WARNING: type inference failed for: r5v5 */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
            if (gy3.C87412m.m108589b(r5, r0) != false) goto L_0x0037;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                gy3.C87412m.m108593f(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x000f:
                r5 = 0
                if (r4 >= r2) goto L_0x003e
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = gy3.C87412m.m108589b(r7, r8)
                r8 = 1
                if (r7 == 0) goto L_0x0036
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                gy3.C87412m.m108593f(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L_0x002f
                r5 = r7[r3]
            L_0x002f:
                boolean r5 = gy3.C87412m.m108589b(r5, r0)
                if (r5 == 0) goto L_0x0036
                goto L_0x0037
            L_0x0036:
                r8 = 0
            L_0x0037:
                if (r8 == 0) goto L_0x003b
                r5 = r6
                goto L_0x003e
            L_0x003b:
                int r4 = r4 + 1
                goto L_0x000f
            L_0x003e:
                f263215a = r5
                int r0 = r1.length
            L_0x0041:
                if (r3 >= r0) goto L_0x0055
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = gy3.C87412m.m108589b(r2, r4)
                if (r2 == 0) goto L_0x0052
                goto L_0x0055
            L_0x0052:
                int r3 = r3 + 1
                goto L_0x0041
            L_0x0055:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zx3.C91943a.C91944a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo109775a(Throwable th, Throwable th4) {
        C87412m.m108594g(th, "cause");
        C87412m.m108594g(th4, "exception");
        Method method = C91944a.f263215a;
        if (method != null) {
            method.invoke(th, new Object[]{th4});
        }
    }

    /* renamed from: b */
    public C88334c mo110032b() {
        return new C88332b();
    }
}
