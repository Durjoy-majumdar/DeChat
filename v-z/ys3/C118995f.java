package ys3;

/* renamed from: ys3.f */
public class C118995f {

    /* renamed from: a */
    public static Boolean f356429a;

    /* renamed from: b */
    public static final Object f356430b = new Object();

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m167760a() {
        /*
            java.lang.Object r0 = f356430b
            monitor-enter(r0)
            java.lang.Boolean r1 = f356429a     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x0041
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "/sys/fs/selinux/enforce"
            r1.<init>(r2)     // Catch:{ all -> 0x0049 }
            boolean r1 = r1.exists()     // Catch:{ all -> 0x0049 }
            r2 = 0
            if (r1 == 0) goto L_0x003b
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0039, all -> 0x0031 }
            java.lang.String r3 = "/sys/fs/selinux/enforce"
            r1.<init>(r3)     // Catch:{ Exception -> 0x0039, all -> 0x0031 }
            int r3 = r1.read()     // Catch:{ Exception -> 0x002b, all -> 0x002f }
            r4 = 49
            if (r3 != r4) goto L_0x0026
            r3 = 1
            goto L_0x0027
        L_0x0026:
            r3 = 0
        L_0x0027:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x002b, all -> 0x002f }
        L_0x002b:
            ys3.C118990b.m167754a(r1)     // Catch:{ all -> 0x0049 }
            goto L_0x003b
        L_0x002f:
            r2 = move-exception
            goto L_0x0035
        L_0x0031:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
        L_0x0035:
            ys3.C118990b.m167754a(r1)     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0039:
            r1 = r2
            goto L_0x002b
        L_0x003b:
            if (r2 != 0) goto L_0x003f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0049 }
        L_0x003f:
            f356429a = r2     // Catch:{ all -> 0x0049 }
        L_0x0041:
            java.lang.Boolean r1 = f356429a     // Catch:{ all -> 0x0049 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return r1
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ys3.C118995f.m167760a():boolean");
    }
}
