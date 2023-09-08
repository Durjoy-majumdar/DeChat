package w24;

import java.lang.reflect.Method;

/* renamed from: w24.a */
public class C90888a {

    /* renamed from: a */
    public static final Object f260865a = new Object();

    /* renamed from: b */
    public static String[] f260866b = {"getCause", "getNextException", "getTargetException", "getException", "getSourceException", "getRootCause", "getCausedByException", "getNested", "getLinkedException", "getNestedException", "getLinkedCause", "getThrowable"};

    /* renamed from: c */
    public static final Method f260867c;

    /* renamed from: d */
    public static /* synthetic */ Class f260868d;

    static {
        Method method = null;
        try {
            Class cls = f260868d;
            if (cls == null) {
                cls = m114014a("java.lang.Throwable");
                f260868d = cls;
            }
            method = cls.getMethod("getCause", (Class[]) null);
        } catch (Exception unused) {
        }
        f260867c = method;
        try {
            Class cls2 = f260868d;
            if (cls2 == null) {
                cls2 = m114014a("java.lang.Throwable");
                f260868d = cls2;
            }
            Class[] clsArr = new Class[1];
            Class cls3 = f260868d;
            if (cls3 == null) {
                cls3 = m114014a("java.lang.Throwable");
                f260868d = cls3;
            }
            clsArr[0] = cls3;
            cls2.getMethod("initCause", clsArr);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Class m114014a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0072 A[EDGE_INSN: B:62:0x0072->B:45:0x0072 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x006f A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Throwable m114015b(java.lang.Throwable r5, java.lang.String[] r6) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof w24.C90889b
            if (r1 == 0) goto L_0x0010
            r1 = r5
            w24.b r1 = (w24.C90889b) r1
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0029
        L_0x0010:
            boolean r1 = r5 instanceof java.sql.SQLException
            if (r1 == 0) goto L_0x001c
            r1 = r5
            java.sql.SQLException r1 = (java.sql.SQLException) r1
            java.sql.SQLException r1 = r1.getNextException()
            goto L_0x0029
        L_0x001c:
            boolean r1 = r5 instanceof java.lang.reflect.InvocationTargetException
            if (r1 == 0) goto L_0x0028
            r1 = r5
            java.lang.reflect.InvocationTargetException r1 = (java.lang.reflect.InvocationTargetException) r1
            java.lang.Throwable r1 = r1.getTargetException()
            goto L_0x0029
        L_0x0028:
            r1 = r0
        L_0x0029:
            if (r1 != 0) goto L_0x00a1
            if (r6 != 0) goto L_0x0037
            java.lang.Object r2 = f260865a
            monitor-enter(r2)
            java.lang.String[] r6 = f260866b     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0037
        L_0x0034:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0034 }
            throw r5
        L_0x0037:
            r2 = 0
        L_0x0038:
            int r3 = r6.length
            if (r2 >= r3) goto L_0x0072
            r3 = r6[r2]
            if (r3 == 0) goto L_0x006f
            java.lang.Class r1 = r5.getClass()     // Catch:{ NoSuchMethodException | SecurityException -> 0x0048 }
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch:{ NoSuchMethodException | SecurityException -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r1 = r0
        L_0x004a:
            if (r1 == 0) goto L_0x006b
            java.lang.Class r3 = f260868d
            if (r3 != 0) goto L_0x0058
            java.lang.String r3 = "java.lang.Throwable"
            java.lang.Class r3 = m114014a(r3)
            f260868d = r3
        L_0x0058:
            java.lang.Class r4 = r1.getReturnType()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L_0x006b
            java.lang.Object[] r3 = u24.C90595a.f260300a     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006b }
            java.lang.Object r1 = r1.invoke(r5, r3)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006b }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r1 = r0
        L_0x006c:
            if (r1 == 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0072:
            if (r1 != 0) goto L_0x00a1
            java.lang.String r6 = "detail"
            java.lang.Class r1 = r5.getClass()     // Catch:{ NoSuchFieldException | SecurityException -> 0x007f }
            java.lang.reflect.Field r6 = r1.getField(r6)     // Catch:{ NoSuchFieldException | SecurityException -> 0x007f }
            goto L_0x0081
        L_0x007f:
            r6 = r0
        L_0x0081:
            if (r6 == 0) goto L_0x00a0
            java.lang.Class r1 = f260868d
            if (r1 != 0) goto L_0x008f
            java.lang.String r1 = "java.lang.Throwable"
            java.lang.Class r1 = m114014a(r1)
            f260868d = r1
        L_0x008f:
            java.lang.Class r2 = r6.getType()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r5 = r6.get(r5)     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x00a0 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ IllegalAccessException | IllegalArgumentException -> 0x00a0 }
            r0 = r5
        L_0x00a0:
            r1 = r0
        L_0x00a1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w24.C90888a.m114015b(java.lang.Throwable, java.lang.String[]):java.lang.Throwable");
    }
}
