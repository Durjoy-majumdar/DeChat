package a91;

/* renamed from: a91.a */
public abstract class C79474a implements C79475b {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r8.isReleased() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r8.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r8.isReleased() != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(com.eclipsesource.mmv8.V8Object r7, com.eclipsesource.mmv8.V8Array r8) {
        /*
            r6 = this;
            java.lang.String r0 = "EdgeComputingJsApiBase"
            r1 = 0
            if (r8 != 0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0049 }
            java.lang.Object r1 = r6.mo109467a(r8)     // Catch:{ Exception -> 0x0049 }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0049 }
            long r4 = r4 - r2
            int r2 = r6.getType()     // Catch:{ Exception -> 0x0049 }
            w81.C90900a.m114030c(r4, r2)     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            r2.<init>()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r3 = "[EdgeComputingJsApiBase] invoke type : "
            r2.append(r3)     // Catch:{ Exception -> 0x0049 }
            int r3 = r6.getType()     // Catch:{ Exception -> 0x0049 }
            r2.append(r3)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0049 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)     // Catch:{ Exception -> 0x0049 }
            if (r7 == 0) goto L_0x003d
            boolean r0 = r7.isReleased()
            if (r0 != 0) goto L_0x003d
            r7.release()
        L_0x003d:
            boolean r7 = r8.isReleased()
            if (r7 != 0) goto L_0x0074
        L_0x0043:
            r8.release()
            goto L_0x0074
        L_0x0047:
            r0 = move-exception
            goto L_0x0075
        L_0x0049:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0047 }
            r3.<init>()     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "[EdgeComputingJsApiBase] invoke throw Exception e : "
            r3.append(r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0047 }
            r3.append(r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0047 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ all -> 0x0047 }
            if (r7 == 0) goto L_0x006d
            boolean r0 = r7.isReleased()
            if (r0 != 0) goto L_0x006d
            r7.release()
        L_0x006d:
            boolean r7 = r8.isReleased()
            if (r7 != 0) goto L_0x0074
            goto L_0x0043
        L_0x0074:
            return r1
        L_0x0075:
            if (r7 == 0) goto L_0x0080
            boolean r1 = r7.isReleased()
            if (r1 != 0) goto L_0x0080
            r7.release()
        L_0x0080:
            boolean r7 = r8.isReleased()
            if (r7 != 0) goto L_0x0089
            r8.release()
        L_0x0089:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a91.C79474a.invoke(com.eclipsesource.mmv8.V8Object, com.eclipsesource.mmv8.V8Array):java.lang.Object");
    }
}
