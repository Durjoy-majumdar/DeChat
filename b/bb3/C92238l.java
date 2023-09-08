package bb3;

import xa3.C102602r;

/* renamed from: bb3.l */
public class C92238l {

    /* renamed from: b */
    public static volatile C92238l f264000b;

    /* renamed from: a */
    public C102602r f264001a = null;

    /* renamed from: b */
    public static C92238l m115958b() {
        if (f264000b == null) {
            synchronized (C92238l.class) {
                if (f264000b == null) {
                    f264000b = new C92238l();
                }
            }
        }
        return f264000b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: xa3.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.ObjectInputStream} */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007a A[SYNTHETIC, Splitter:B:35:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[Catch:{ Exception -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ab A[SYNTHETIC, Splitter:B:51:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3 A[Catch:{ Exception -> 0x00af }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xa3.C102602r mo126233a() {
        /*
            r11 = this;
            xa3.r r0 = r11.f264001a
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WENOTE_KEEP_TOP_DATA_STRING_SYNC
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.mo119685f(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r0
            java.lang.String r4 = "WNNoteKeepTopManager"
            java.lang.String r5 = "getCurrentTopItem itemStr: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r5, r2)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r5 = 0
            if (r2 == 0) goto L_0x002c
            return r5
        L_0x002c:
            byte[] r0 = com.tencent.p014mm.sdk.platformtools.Util.decodeHexString(r0)
            if (r0 == 0) goto L_0x00bf
            int r2 = r0.length
            if (r2 > 0) goto L_0x0037
            goto L_0x00bf
        L_0x0037:
            java.lang.String r2 = "toObject close exception:%s"
            int r6 = r0.length
            if (r6 > 0) goto L_0x003e
            goto L_0x008d
        L_0x003e:
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x006a, all -> 0x0067 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x0063, all -> 0x0061 }
            java.lang.Object r7 = r0.readObject()     // Catch:{ Exception -> 0x005f }
            xa3.r r7 = (xa3.C102602r) r7     // Catch:{ Exception -> 0x005f }
            r0.close()     // Catch:{ Exception -> 0x0055 }
            r6.close()     // Catch:{ Exception -> 0x0055 }
            goto L_0x005d
        L_0x0055:
            r0 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r5)
        L_0x005d:
            r5 = r7
            goto L_0x008d
        L_0x005f:
            r7 = move-exception
            goto L_0x006e
        L_0x0061:
            r0 = move-exception
            goto L_0x00a9
        L_0x0063:
            r0 = move-exception
            r7 = r0
            r0 = r5
            goto L_0x006e
        L_0x0067:
            r0 = move-exception
            r6 = r5
            goto L_0x00a9
        L_0x006a:
            r0 = move-exception
            r7 = r0
            r0 = r5
            r6 = r0
        L_0x006e:
            java.lang.String r8 = "toObject exception:%s"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
            r9[r3] = r7     // Catch:{ all -> 0x00a5 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r8, r9)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0080
            r0.close()     // Catch:{ Exception -> 0x007e }
            goto L_0x0080
        L_0x007e:
            r0 = move-exception
            goto L_0x0086
        L_0x0080:
            if (r6 == 0) goto L_0x008d
            r6.close()     // Catch:{ Exception -> 0x007e }
            goto L_0x008d
        L_0x0086:
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r6[r3] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r6)
        L_0x008d:
            r11.f264001a = r5
            java.lang.Object[] r0 = new java.lang.Object[r1]
            if (r5 == 0) goto L_0x0098
            java.lang.String r1 = r5.mo142219a()
            goto L_0x009b
        L_0x0098:
            java.lang.String r1 = "null"
        L_0x009b:
            r0[r3] = r1
            java.lang.String r1 = "getCurrentTopItem item: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r1, r0)
            xa3.r r0 = r11.f264001a
            return r0
        L_0x00a5:
            r5 = move-exception
            r10 = r5
            r5 = r0
            r0 = r10
        L_0x00a9:
            if (r5 == 0) goto L_0x00b1
            r5.close()     // Catch:{ Exception -> 0x00af }
            goto L_0x00b1
        L_0x00af:
            r5 = move-exception
            goto L_0x00b7
        L_0x00b1:
            if (r6 == 0) goto L_0x00be
            r6.close()     // Catch:{ Exception -> 0x00af }
            goto L_0x00be
        L_0x00b7:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r2, r1)
        L_0x00be:
            throw r0
        L_0x00bf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92238l.mo126233a():xa3.r");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.ObjectOutputStream} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004b A[SYNTHETIC, Splitter:B:24:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053 A[Catch:{ Exception -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0 A[SYNTHETIC, Splitter:B:45:0x00a0] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8 A[Catch:{ Exception -> 0x00a4 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo126234c(xa3.C102602r r10) {
        /*
            r9 = this;
            r9.f264001a = r10
            java.lang.String r0 = "toByteArray close exception:%s"
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "WNNoteKeepTopManager"
            if (r10 != 0) goto L_0x000d
            goto L_0x005e
        L_0x000d:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r5.<init>()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r6.writeObject(r10)     // Catch:{ Exception -> 0x0031 }
            r6.flush()     // Catch:{ Exception -> 0x0031 }
            byte[] r1 = r5.toByteArray()     // Catch:{ Exception -> 0x0031 }
            r6.close()     // Catch:{ Exception -> 0x0028 }
            r5.close()     // Catch:{ Exception -> 0x0028 }
            goto L_0x005e
        L_0x0028:
            r10 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r5)
            goto L_0x005e
        L_0x0031:
            r10 = move-exception
            goto L_0x003f
        L_0x0033:
            r10 = move-exception
            goto L_0x009e
        L_0x0036:
            r10 = move-exception
            r6 = r1
            goto L_0x003f
        L_0x0039:
            r10 = move-exception
            r5 = r1
            goto L_0x009e
        L_0x003c:
            r10 = move-exception
            r5 = r1
            r6 = r5
        L_0x003f:
            java.lang.String r7 = "toByteArray exception:%s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x009c }
            r8[r3] = r10     // Catch:{ all -> 0x009c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r7, r8)     // Catch:{ all -> 0x009c }
            if (r6 == 0) goto L_0x0051
            r6.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x0051
        L_0x004f:
            r10 = move-exception
            goto L_0x0057
        L_0x0051:
            if (r5 == 0) goto L_0x005e
            r5.close()     // Catch:{ Exception -> 0x004f }
            goto L_0x005e
        L_0x0057:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r5)
        L_0x005e:
            if (r1 == 0) goto L_0x0068
            int r10 = r1.length
            if (r10 <= 0) goto L_0x0068
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r1)
            goto L_0x006a
        L_0x0068:
            java.lang.String r10 = ""
        L_0x006a:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            xa3.r r1 = r9.f264001a
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = r1.mo142219a()
            goto L_0x0078
        L_0x0075:
            java.lang.String r1 = "null"
        L_0x0078:
            r0[r3] = r1
            java.lang.String r1 = "setCurrentTopItem item: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r10
            java.lang.String r1 = "setCurrentTopItem itemStr: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WENOTE_KEEP_TOP_DATA_STRING_SYNC
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)
            r0.mo119677K(r1, r10)
            return
        L_0x009c:
            r10 = move-exception
            r1 = r6
        L_0x009e:
            if (r1 == 0) goto L_0x00a6
            r1.close()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a6
        L_0x00a4:
            r1 = move-exception
            goto L_0x00ac
        L_0x00a6:
            if (r5 == 0) goto L_0x00b3
            r5.close()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00b3
        L_0x00ac:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r1
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r2)
        L_0x00b3:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bb3.C92238l.mo126234c(xa3.r):void");
    }
}
