package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.u1 */
public final class C82487u1 extends C82430g {
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00aa  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i mo114803b(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r10, java.lang.String r11, org.json.JSONObject r12) {
        /*
            r9 = this;
            java.lang.String r0 = "fail read zip data"
            java.lang.String r1 = "targetDirectory"
            java.lang.String r2 = ""
            java.lang.String r12 = r12.optString(r1, r2)
            com.tencent.mm.plugin.appbrand.appstorage.h0 r1 = r10.getFileSystem()
            com.tencent.mm.plugin.appbrand.appstorage.b0 r1 = r1.isdir(r12)
            int r1 = r1.ordinal()
            java.lang.String r2 = "fail permission denied, open \"%s\""
            r3 = 1
            r4 = 0
            if (r1 == r3) goto L_0x014e
            r5 = 4
            if (r1 == r5) goto L_0x014e
            r6 = 8
            if (r1 == r6) goto L_0x014e
            com.tencent.mm.plugin.appbrand.appstorage.h0 r1 = r10.getFileSystem()
            com.tencent.mm.vfs.m1 r1 = r1.getAbsoluteFile(r11)
            java.lang.String r6 = "MicroMsg.AppBrand.FileSystem.UnitUnzip"
            if (r1 == 0) goto L_0x0050
            boolean r7 = r1.mo119967g()
            if (r7 != 0) goto L_0x0037
            goto L_0x0050
        L_0x0037:
            boolean r7 = r1.mo119977o()
            if (r7 != 0) goto L_0x0046
            boolean r7 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99867a(r1)
            if (r7 == 0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r7 = 0
            goto L_0x00b6
        L_0x0046:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r4] = r11
            r10.<init>(r2, r12)
            return r10
        L_0x0050:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r7 = r10.getFileSystem()
            com.tencent.mm.plugin.appbrand.appstorage.b0 r7 = r7.access(r11)
            com.tencent.mm.plugin.appbrand.appstorage.b0 r8 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
            if (r7 != r8) goto L_0x00a7
            com.tencent.mm.plugin.appbrand.appstorage.h0 r1 = r10.getFileSystem()
            java.lang.String r7 = java.net.URLEncoder.encode(r11)
            com.tencent.mm.vfs.m1 r1 = r1.allocTempFile(r7)
            if (r1 == 0) goto L_0x009d
            js0.m r7 = new js0.m
            r7.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r8 = r10.getFileSystem()
            r8.readFile(r11, r7)
            java.io.OutputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106426H(r1)     // Catch:{ IOException -> 0x0091 }
            java.nio.channels.WritableByteChannel r8 = java.nio.channels.Channels.newChannel(r8)     // Catch:{ IOException -> 0x0091 }
            T r7 = r7.f29691a     // Catch:{ IOException -> 0x0091 }
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ IOException -> 0x0091 }
            r8.write(r7)     // Catch:{ IOException -> 0x0091 }
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x0091 }
            java.lang.String r1 = r1.mo119971i()     // Catch:{ IOException -> 0x0091 }
            r7.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0091 }
            r1 = r7
            r7 = 1
            goto L_0x00a8
        L_0x0091:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r4] = r1
            java.lang.String r1 = "copy ByteBuffer failed e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r1, r7)
            r1 = 0
            goto L_0x00a7
        L_0x009d:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r12 = "fail allocTempFile failed"
            r10.<init>(r12, r11)
            return r10
        L_0x00a7:
            r7 = 0
        L_0x00a8:
            if (r1 != 0) goto L_0x00b6
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r12 = new java.lang.Object[r3]
            r12[r4] = r11
            java.lang.String r11 = "fail no such file \"%s\""
            r10.<init>(r11, r12)
            return r10
        L_0x00b6:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r10 = r10.getFileSystem()     // Catch:{ Exception -> 0x013d }
            com.tencent.mm.plugin.appbrand.appstorage.b0 r10 = r10.unzip(r12, r1)     // Catch:{ Exception -> 0x013d }
            if (r7 == 0) goto L_0x00c7
            java.lang.String r12 = r1.mo119971i()     // Catch:{ Exception -> 0x013d }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r12)     // Catch:{ Exception -> 0x013d }
        L_0x00c7:
            int r12 = r10.ordinal()     // Catch:{ Exception -> 0x013d }
            if (r12 == 0) goto L_0x0133
            r1 = 3
            if (r12 == r1) goto L_0x0127
            if (r12 == r5) goto L_0x011d
            r1 = 5
            if (r12 == r1) goto L_0x0111
            switch(r12) {
                case 13: goto L_0x0109;
                case 14: goto L_0x00ff;
                case 15: goto L_0x00f5;
                default: goto L_0x00d8;
            }     // Catch:{ Exception -> 0x013d }
        L_0x00d8:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r11 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013d }
            r12.<init>()     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = "fail "
            r12.append(r1)     // Catch:{ Exception -> 0x013d }
            java.lang.String r10 = r10.name()     // Catch:{ Exception -> 0x013d }
            r12.append(r10)     // Catch:{ Exception -> 0x013d }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x013d }
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x013d }
            r11.<init>(r10, r12)     // Catch:{ Exception -> 0x013d }
            return r11
        L_0x00f5:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.String r11 = "fail the maximum size of the file storage limit is exceeded"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x013d }
            r10.<init>(r11, r12)     // Catch:{ Exception -> 0x013d }
            return r10
        L_0x00ff:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.String r11 = "fail write entry"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x013d }
            r10.<init>(r11, r12)     // Catch:{ Exception -> 0x013d }
            return r10
        L_0x0109:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x013d }
            r10.<init>(r0, r11)     // Catch:{ Exception -> 0x013d }
            return r10
        L_0x0111:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.String r12 = "fail illegal operation on a filePath, open \"%s\""
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x013d }
            r1[r4] = r11     // Catch:{ Exception -> 0x013d }
            r10.<init>(r12, r1)     // Catch:{ Exception -> 0x013d }
            return r10
        L_0x011d:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x013d }
            r12[r4] = r11     // Catch:{ Exception -> 0x013d }
            r10.<init>(r2, r12)     // Catch:{ Exception -> 0x013d }
            return r10
        L_0x0127:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.String r12 = "fail no such file or directory, open \"%s\""
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x013d }
            r1[r4] = r11     // Catch:{ Exception -> 0x013d }
            r10.<init>(r12, r1)     // Catch:{ Exception -> 0x013d }
            return r10
        L_0x0133:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i     // Catch:{ Exception -> 0x013d }
            java.lang.String r11 = "ok"
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x013d }
            r10.<init>(r11, r12)     // Catch:{ Exception -> 0x013d }
            return r10
        L_0x013d:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.lang.String r12 = "write zip stream"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r10, r12, r11)
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r11 = new java.lang.Object[r4]
            r10.<init>(r0, r11)
            return r10
        L_0x014e:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r10 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r11 = new java.lang.Object[r3]
            r11[r4] = r12
            java.lang.String r11 = java.lang.String.format(r2, r11)
            java.lang.Object[] r12 = new java.lang.Object[r4]
            r10.<init>(r11, r12)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.file.C82487u1.mo114803b(com.tencent.mm.plugin.appbrand.jsapi.f, java.lang.String, org.json.JSONObject):com.tencent.mm.plugin.appbrand.jsapi.file.i");
    }

    /* renamed from: c */
    public String mo114812c(JSONObject jSONObject) {
        return jSONObject.optString("zipFilePath");
    }
}
