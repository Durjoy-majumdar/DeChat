package bp3;

/* renamed from: bp3.o */
public final class C79757o {

    /* renamed from: a */
    public static final String[] f233759a = {null, null};

    /* JADX WARNING: Can't wrap try/catch for region: R(12:6|(2:8|(3:10|11|12))|13|14|15|(4:17|18|19|20)|21|22|(5:23|24|(2:25|(1:27)(1:55))|28|(6:30|31|32|33|34|35)(2:36|37))|45|46|47) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x008a */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005b A[Catch:{ all -> 0x0080, all -> 0x0085, all -> 0x008a }, LOOP:0: B:25:0x0055->B:27:0x005b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[Catch:{ all -> 0x0080, all -> 0x0085, all -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c A[SYNTHETIC, Splitter:B:36:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x005f A[EDGE_INSN: B:55:0x005f->B:28:0x005f ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m96896a(android.content.Context r5) {
        /*
            java.lang.String[] r5 = f233759a
            r0 = 0
            r1 = r5[r0]
            if (r1 != 0) goto L_0x0097
            monitor-enter(r5)
            r1 = r5[r0]     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0092
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0094 }
            r2 = 28
            if (r1 < r2) goto L_0x0020
            java.lang.String r1 = android.app.Application.getProcessName()     // Catch:{ all -> 0x0094 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0094 }
            if (r2 != 0) goto L_0x0020
            r5[r0] = r1     // Catch:{ all -> 0x0094 }
            monitor-exit(r5)     // Catch:{ all -> 0x0094 }
            return r1
        L_0x0020:
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ all -> 0x0045 }
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch:{ all -> 0x0045 }
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ all -> 0x0045 }
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0045 }
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0045 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0045 }
            if (r2 != 0) goto L_0x0045
            r5[r0] = r1     // Catch:{ all -> 0x0045 }
            monitor-exit(r5)     // Catch:{ all -> 0x0094 }
            return r1
        L_0x0045:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "/proc/self/cmdline"
            r1.<init>(r2)     // Catch:{ all -> 0x008a }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0080 }
            r3 = 256(0x100, float:3.59E-43)
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0080 }
        L_0x0055:
            int r4 = r1.read(r3)     // Catch:{ all -> 0x0080 }
            if (r4 <= 0) goto L_0x005f
            r2.write(r3, r0, r4)     // Catch:{ all -> 0x0080 }
            goto L_0x0055
        L_0x005f:
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = r3.name()     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.toString(r3)     // Catch:{ all -> 0x0080 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0080 }
            if (r3 != 0) goto L_0x007c
            java.lang.String[] r3 = f233759a     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x0080 }
            r3[r0] = r2     // Catch:{ all -> 0x0080 }
            r1.close()     // Catch:{ all -> 0x008a }
            monitor-exit(r5)     // Catch:{ all -> 0x0094 }
            return r2
        L_0x007c:
            r1.close()     // Catch:{ all -> 0x008a }
            goto L_0x008a
        L_0x0080:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ all -> 0x008a }
        L_0x0089:
            throw r0     // Catch:{ all -> 0x008a }
        L_0x008a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "Fail to get current process name."
            r0.<init>(r1)     // Catch:{ all -> 0x0094 }
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0097
        L_0x0094:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0094 }
            throw r0
        L_0x0097:
            r5 = r5[r0]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bp3.C79757o.m96896a(android.content.Context):java.lang.String");
    }
}
