package h61;

/* renamed from: h61.b */
public final class C32717b {

    /* renamed from: a */
    public static final C32717b f86777a = new C32717b();

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0094 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58771a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.Class<kr0.b1> r0 = kr0.C33987b1.class
            r1 = 0
            if (r10 != 0) goto L_0x0006
            return r1
        L_0x0006:
            nl.j r2 = p207nl.C89008j.f256613a
            java.lang.String r3 = "temp"
            boolean r10 = r2.mo123382a(r10, r3)
            r3 = 0
            java.lang.String r4 = "MicroMsg.MagicEmojiFileUtil"
            if (r10 != 0) goto L_0x0015
            goto L_0x0088
        L_0x0015:
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.mo123383b()
            r5.append(r2)
            java.lang.String r2 = "/temp"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "magicemoji.json"
            r10.<init>((java.lang.String) r2, (java.lang.String) r5)
            java.lang.String r2 = "appId"
            java.lang.String r5 = "read magic emoji pkg info failed"
            boolean r6 = r10.mo119967g()
            if (r6 != 0) goto L_0x003d
            goto L_0x0088
        L_0x003d:
            java.lang.String r10 = r10.mo119971i()     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            java.lang.String r10 = com.tencent.p014mm.vfs.C86013q1.m106432N(r10)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            r6.<init>(r10)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            java.lang.String r10 = r6.getString(r2)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            java.lang.String r7 = "version"
            int r6 = r6.getInt(r7)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            r7.<init>()     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            java.lang.String r8 = "read magic emoji pkg info, appId:"
            r7.append(r8)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            r7.append(r10)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            java.lang.String r8 = " version:"
            r7.append(r8)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            r7.append(r6)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            e61.c r7 = new e61.c     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            gy3.C87412m.m108593f(r10, r2)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            r7.<init>(r10, r6)     // Catch:{ IOException -> 0x0082, JSONException -> 0x007b }
            goto L_0x0089
        L_0x007b:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r10, r5, r2)
            goto L_0x0088
        L_0x0082:
            r10 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r10, r5, r2)
        L_0x0088:
            r7 = r3
        L_0x0089:
            if (r7 != 0) goto L_0x008c
            return r1
        L_0x008c:
            di3.d r10 = di3.C86312j.m106911c(r0)
            kr0.b1 r10 = (kr0.C33987b1) r10
            if (r10 != 0) goto L_0x0095
            return r1
        L_0x0095:
            java.lang.String r2 = r7.f84107a
            com.tencent.mm.plugin.appbrand.appcache.z2 r10 = r10.so0(r2)
            if (r10 == 0) goto L_0x00c2
            int r10 = r10.field_version
            int r2 = r7.f84108b
            if (r10 >= r2) goto L_0x00a4
            goto L_0x00c2
        L_0x00a4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "magic emoji version "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = " should bigger than "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            goto L_0x0145
        L_0x00c2:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            nl.j r2 = p207nl.C89008j.f256613a
            java.lang.String r2 = r2.mo123383b()
            r10.append(r2)
            java.lang.String r2 = "/temp/"
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            java.lang.String r5 = "magicemoji.wxapkg.br"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r10)
            java.lang.String r10 = "magicemoji.wxapkg"
            r5.append(r10)
            java.lang.String r10 = r5.toString()
            java.lang.Class<kr0.p0> r5 = kr0.C34008p0.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kr0.p0 r5 = (kr0.C34008p0) r5
            boolean r2 = r5.mo56467wB(r2, r10)
            if (r2 == 0) goto L_0x0140
            di3.d r0 = di3.C86312j.m106911c(r0)
            kr0.b1 r0 = (kr0.C33987b1) r0
            if (r0 == 0) goto L_0x011d
            java.lang.String r2 = r7.f84107a
            int r3 = r7.f84108b
            boolean r10 = r0.cm0(r2, r3, r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
        L_0x011d:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r10 = gy3.C87412m.m108589b(r10, r3)
            if (r10 == 0) goto L_0x012b
            java.lang.String r10 = "insert magic emoji pkg success"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r10)
            goto L_0x0145
        L_0x012b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "insert magic emoji pkg failed, ok = "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
            goto L_0x0145
        L_0x0140:
            java.lang.String r10 = "magic emoji pkg br decompress failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r10)
        L_0x0145:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h61.C32717b.mo58771a(java.lang.String):int");
    }
}
