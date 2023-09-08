package com.tencent.p014mm.plugin.appbrand.appstorage;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.e0 */
public class C40431e0 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.io.OutputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0086  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m43625a(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            r0.<init>((java.lang.String) r8)
            boolean r2 = r0.mo119967g()
            if (r2 != 0) goto L_0x0014
            return r1
        L_0x0014:
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            r2.<init>((java.lang.String) r9)
            boolean r3 = r0.mo119978p()
            r4 = 1
            if (r3 == 0) goto L_0x008c
            boolean r3 = r2.mo119978p()
            if (r3 != 0) goto L_0x002d
            boolean r2 = r2.mo119967g()
            if (r2 == 0) goto L_0x002d
            return r1
        L_0x002d:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r3 = "MicroMsg.AppBrand.FileCopy"
            if (r2 != 0) goto L_0x007d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r2 == 0) goto L_0x003c
            goto L_0x007d
        L_0x003c:
            boolean r2 = r8.equals(r9)
            if (r2 == 0) goto L_0x0043
            goto L_0x0055
        L_0x0043:
            r2 = 0
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r8)     // Catch:{ Exception -> 0x0064, all -> 0x0061 }
            java.io.OutputStream r2 = com.tencent.p014mm.vfs.C86013q1.m106429K(r9, r1)     // Catch:{ Exception -> 0x005c, all -> 0x0057 }
            s24.C90125c.m112775b(r8, r2)     // Catch:{ Exception -> 0x005c, all -> 0x0057 }
            s24.C90125c.m112774a(r8)
            s24.C90125c.m112774a(r2)
        L_0x0055:
            r8 = 1
            goto L_0x0083
        L_0x0057:
            r9 = move-exception
            r7 = r2
            r2 = r8
            r8 = r7
            goto L_0x0076
        L_0x005c:
            r9 = move-exception
            r7 = r2
            r2 = r8
            r8 = r7
            goto L_0x0066
        L_0x0061:
            r9 = move-exception
            r8 = r2
            goto L_0x0076
        L_0x0064:
            r9 = move-exception
            r8 = r2
        L_0x0066:
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0075 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r9, r5, r6)     // Catch:{ all -> 0x0075 }
            s24.C90125c.m112774a(r2)
            s24.C90125c.m112774a(r8)
        L_0x0073:
            r8 = 0
            goto L_0x0083
        L_0x0075:
            r9 = move-exception
        L_0x0076:
            s24.C90125c.m112774a(r2)
            s24.C90125c.m112774a(r8)
            throw r9
        L_0x007d:
            java.lang.String r8 = "copy file but src path or dest path is null, return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r8)
            goto L_0x0073
        L_0x0083:
            if (r8 != 0) goto L_0x0086
            return r1
        L_0x0086:
            if (r10 == 0) goto L_0x00d9
            r0.mo119966f()
            goto L_0x00d9
        L_0x008c:
            boolean r3 = r0.mo119977o()
            if (r3 == 0) goto L_0x00d9
            boolean r3 = r2.mo119967g()
            if (r3 != 0) goto L_0x009b
            r2.mo119987x()
        L_0x009b:
            boolean r2 = r2.mo119977o()
            if (r2 != 0) goto L_0x00a2
            return r1
        L_0x00a2:
            java.lang.String[] r0 = r0.mo119981s()
        L_0x00a6:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x00d9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            java.lang.String r3 = "/"
            r2.append(r3)
            r5 = r0[r1]
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r3)
            r3 = r0[r1]
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            m43625a(r2, r3, r10)
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00d9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.C40431e0.m43625a(java.lang.String, java.lang.String, boolean):boolean");
    }
}
