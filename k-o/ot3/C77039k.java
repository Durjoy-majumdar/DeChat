package ot3;

/* renamed from: ot3.k */
public class C77039k implements C77037c {

    /* renamed from: a */
    public static int f225049a;

    /* renamed from: b */
    public static int[] f225050b;

    /* renamed from: b */
    public static void m92957b(String str, Object obj) {
        synchronized (C77039k.class) {
            if ("fingerprint_type".equals(str)) {
                f225049a = ((Integer) obj).intValue();
            } else if ("fingerprint_hardware_position".equals(str)) {
                f225050b = (int[]) obj;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        return r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo107364a(java.lang.String r3, java.lang.Object r4) {
        /*
            r2 = this;
            java.lang.Class<ot3.k> r0 = ot3.C77039k.class
            monitor-enter(r0)
            java.lang.String r1 = "fingerprint_type"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0015
            int r3 = f225049a     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0013
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0027 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r4
        L_0x0015:
            java.lang.String r1 = "fingerprint_hardware_position"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0024
            int[] r3 = f225050b     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0022
            r4 = r3
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r4
        L_0x0024:
            r3 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return r3
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ot3.C77039k.mo107364a(java.lang.String, java.lang.Object):java.lang.Object");
    }
}
