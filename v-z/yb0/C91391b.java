package yb0;

/* renamed from: yb0.b */
public class C91391b {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.ObjectInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f A[SYNTHETIC, Splitter:B:20:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[SYNTHETIC, Splitter:B:25:0x005c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m114666a(java.io.InputStream r6) {
        /*
            java.lang.String r0 = "Read close exception:"
            java.lang.String r1 = "MicroMsg.ObjectUtil"
            r2 = 0
            if (r6 == 0) goto L_0x0078
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0033, all -> 0x0031 }
            java.lang.Object r2 = r3.readObject()     // Catch:{ Exception -> 0x002f }
            r3.close()     // Catch:{ Exception -> 0x0014 }
            goto L_0x0078
        L_0x0014:
            r6 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x001a:
            r3.append(r0)
            java.lang.String r6 = r6.getMessage()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)
            goto L_0x0078
        L_0x002c:
            r6 = move-exception
            r2 = r3
            goto L_0x005a
        L_0x002f:
            r6 = move-exception
            goto L_0x0035
        L_0x0031:
            r6 = move-exception
            goto L_0x005a
        L_0x0033:
            r6 = move-exception
            r3 = r2
        L_0x0035:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
            r4.<init>()     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "Read exception:"
            r4.append(r5)     // Catch:{ all -> 0x002c }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x002c }
            r4.append(r6)     // Catch:{ all -> 0x002c }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x002c }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r6)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0078
            r3.close()     // Catch:{ Exception -> 0x0053 }
            goto L_0x0078
        L_0x0053:
            r6 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x001a
        L_0x005a:
            if (r2 == 0) goto L_0x0077
            r2.close()     // Catch:{ Exception -> 0x0060 }
            goto L_0x0077
        L_0x0060:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
        L_0x0077:
            throw r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C91391b.m114666a(java.io.InputStream):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[SYNTHETIC, Splitter:B:22:0x0053] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC, Splitter:B:27:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m114667b(java.io.Serializable r4, java.io.OutputStream r5) {
        /*
            java.lang.String r0 = "Write close exception:"
            java.lang.String r1 = "MicroMsg.ObjectUtil"
            if (r4 == 0) goto L_0x007c
            if (r5 == 0) goto L_0x007c
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0038 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0038 }
            r3.writeObject(r4)     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r3.flush()     // Catch:{ Exception -> 0x0033, all -> 0x0030 }
            r3.close()     // Catch:{ Exception -> 0x0018 }
            goto L_0x007c
        L_0x0018:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
        L_0x001e:
            r5.append(r0)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)
            goto L_0x007c
        L_0x0030:
            r4 = move-exception
            r2 = r3
            goto L_0x005e
        L_0x0033:
            r4 = move-exception
            r2 = r3
            goto L_0x0039
        L_0x0036:
            r4 = move-exception
            goto L_0x005e
        L_0x0038:
            r4 = move-exception
        L_0x0039:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r5.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "Write exception:"
            r5.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0036 }
            r5.append(r4)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0036 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r4)     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x007c
            r2.close()     // Catch:{ Exception -> 0x0057 }
            goto L_0x007c
        L_0x0057:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            goto L_0x001e
        L_0x005e:
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ Exception -> 0x0064 }
            goto L_0x007b
        L_0x0064:
            r5 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r5)
        L_0x007b:
            throw r4
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C91391b.m114667b(java.io.Serializable, java.io.OutputStream):void");
    }
}
