package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.LruCache;

/* renamed from: com.tencent.mm.storage.v1$$d */
public final class v1$$d<K> extends LruCache<K, Object> {

    /* renamed from: a */
    public final String f249903a;

    /* renamed from: b */
    public final /* synthetic */ C85801v1 f249904b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1$$d(C85801v1 v1Var, String str, String str2, int i) {
        super(i);
        this.f249904b = v1Var;
        this.f249903a = "SELECT * FROM " + str + " WHERE " + str2 + "=?;";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
        switch(r4) {
            case 1: goto L_0x0065;
            case 2: goto L_0x0060;
            case 3: goto L_0x005e;
            case 4: goto L_0x005a;
            case 5: goto L_0x0055;
            case 6: goto L_0x0050;
            default: goto L_0x004f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = java.lang.Double.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        r4 = java.lang.Float.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        r7 = java.lang.Boolean.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r4 = java.lang.Long.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object create(K r10) {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.ConfigStorage"
            r1 = 0
            r2 = 0
            com.tencent.mm.storage.v1 r3 = r9.f249904b     // Catch:{ RuntimeException -> 0x00aa }
            zh3.f r3 = r3.f249894c     // Catch:{ RuntimeException -> 0x00aa }
            java.lang.String r4 = r9.f249903a     // Catch:{ RuntimeException -> 0x00aa }
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ RuntimeException -> 0x00aa }
            java.lang.String r7 = r10.toString()     // Catch:{ RuntimeException -> 0x00aa }
            r6[r2] = r7     // Catch:{ RuntimeException -> 0x00aa }
            r7 = 2
            android.database.Cursor r3 = r3.rawQuery(r4, r6, r7)     // Catch:{ RuntimeException -> 0x00aa }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x009e }
            java.lang.String r6 = "GET: "
            if (r4 == 0) goto L_0x007d
            int r4 = r3.getInt(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r7 = r3.getString(r7)     // Catch:{ all -> 0x009e }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r8.<init>()     // Catch:{ all -> 0x009e }
            r8.append(r6)     // Catch:{ all -> 0x009e }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x009e }
            r8.append(r6)     // Catch:{ all -> 0x009e }
            java.lang.String r6 = " => "
            r8.append(r6)     // Catch:{ all -> 0x009e }
            r8.append(r7)     // Catch:{ all -> 0x009e }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = com.tencent.p014mm.storage.C85801v1.f249893l     // Catch:{ all -> 0x009e }
            if (r7 != r6) goto L_0x004c
        L_0x004a:
            r4 = r1
            goto L_0x0079
        L_0x004c:
            switch(r4) {
                case 1: goto L_0x0065;
                case 2: goto L_0x0060;
                case 3: goto L_0x005e;
                case 4: goto L_0x005a;
                case 5: goto L_0x0055;
                case 6: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x004a
        L_0x0050:
            java.lang.Double r4 = java.lang.Double.valueOf(r7)     // Catch:{ Exception -> 0x006a }
            goto L_0x0079
        L_0x0055:
            java.lang.Float r4 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x006a }
            goto L_0x0079
        L_0x005a:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ Exception -> 0x006a }
        L_0x005e:
            r4 = r7
            goto L_0x0079
        L_0x0060:
            java.lang.Long r4 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x006a }
            goto L_0x0079
        L_0x0065:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x006a }
            goto L_0x0079
        L_0x006a:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x009e }
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r4)     // Catch:{ all -> 0x009e }
            r5[r2] = r4     // Catch:{ all -> 0x009e }
            java.lang.String r4 = "exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r4, r5)     // Catch:{ all -> 0x009e }
            goto L_0x004a
        L_0x0079:
            r3.close()     // Catch:{ RuntimeException -> 0x00aa }
            return r4
        L_0x007d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r4.<init>()     // Catch:{ all -> 0x009e }
            r4.append(r6)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = r10.toString()     // Catch:{ all -> 0x009e }
            r4.append(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r5 = " => (NOT EXIST)"
            r4.append(r5)     // Catch:{ all -> 0x009e }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x009e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)     // Catch:{ all -> 0x009e }
            java.lang.Object r4 = com.tencent.p014mm.storage.C85801v1.f249893l     // Catch:{ all -> 0x009e }
            r3.close()     // Catch:{ RuntimeException -> 0x00aa }
            return r4
        L_0x009e:
            r4 = move-exception
            if (r3 == 0) goto L_0x00a9
            r3.close()     // Catch:{ all -> 0x00a5 }
            goto L_0x00a9
        L_0x00a5:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch:{ RuntimeException -> 0x00aa }
        L_0x00a9:
            throw r4     // Catch:{ RuntimeException -> 0x00aa }
        L_0x00aa:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to query UserInfo, id: "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r10 = r4.toString()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.v1$$d.create(java.lang.Object):java.lang.Object");
    }
}
