package com.tencent.p014mm.plugin.appbrand.jsapi.file;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import js0.C9514m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.file.p1 */
public final class C82469p1 extends C82430g {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.jsapi.file.C82446i mo114803b(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r35, java.lang.String r36, org.json.JSONObject r37) {
        /*
            r34 = this;
            r1 = r34
            r10 = r36
            r2 = r37
            com.tencent.mm.plugin.appbrand.appstorage.b0 r11 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
            com.tencent.mm.plugin.appbrand.appstorage.h0 r0 = r35.getFileSystem()
            com.tencent.mm.vfs.m1 r0 = r0.getAbsoluteFile(r10)
            r3 = 1
            r13 = 0
            java.lang.String r14 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntry"
            if (r0 == 0) goto L_0x0038
            boolean r4 = r0.mo119967g()
            if (r4 != 0) goto L_0x001d
            goto L_0x0038
        L_0x001d:
            boolean r4 = r0.mo119977o()
            if (r4 != 0) goto L_0x002c
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0.m99867a(r0)
            if (r4 == 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r15 = 0
            goto L_0x0091
        L_0x002c:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r13] = r10
            java.lang.String r3 = "fail permission denied, open \"%s\""
            r0.<init>(r3, r2)
            return r0
        L_0x0038:
            com.tencent.mm.plugin.appbrand.appstorage.h0 r4 = r35.getFileSystem()
            com.tencent.mm.plugin.appbrand.appstorage.b0 r4 = r4.access(r10)
            if (r4 != r11) goto L_0x0081
            com.tencent.mm.plugin.appbrand.appstorage.h0 r4 = r35.getFileSystem()
            java.lang.String r5 = java.net.URLEncoder.encode(r36)
            com.tencent.mm.vfs.m1 r4 = r4.allocTempFile(r5)
            if (r4 == 0) goto L_0x0081
            js0.m r0 = new js0.m
            r0.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r5 = r35.getFileSystem()
            r5.readFile(r10, r0)
            java.io.OutputStream r5 = com.tencent.p014mm.vfs.C86013q1.m106426H(r4)     // Catch:{ IOException -> 0x0076 }
            java.nio.channels.WritableByteChannel r5 = java.nio.channels.Channels.newChannel(r5)     // Catch:{ IOException -> 0x0076 }
            T r0 = r0.f29691a     // Catch:{ IOException -> 0x0076 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ IOException -> 0x0076 }
            r5.write(r0)     // Catch:{ IOException -> 0x0076 }
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x0076 }
            java.lang.String r4 = r4.mo119971i()     // Catch:{ IOException -> 0x0076 }
            r0.<init>((java.lang.String) r4)     // Catch:{ IOException -> 0x0076 }
            r4 = 1
            goto L_0x0082
        L_0x0076:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r13] = r0
            java.lang.String r0 = "copy ByteBuffer failed e = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r14, r0, r4)
            r0 = 0
        L_0x0081:
            r4 = 0
        L_0x0082:
            if (r0 != 0) goto L_0x0090
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r13] = r10
            java.lang.String r3 = "fail no such file \"%s\""
            r0.<init>(r3, r2)
            return r0
        L_0x0090:
            r15 = r4
        L_0x0091:
            com.tencent.mm.plugin.appbrand.jsapi.file.i r8 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = "ok"
            r8.<init>(r5, r4)
            js0.m r9 = new js0.m
            r9.<init>()
            r9.f29691a = r8
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            js0.m r7 = new js0.m
            r7.<init>()
            r7.f29691a = r6
            java.lang.String r5 = "entries"
            java.lang.String r4 = ""
            java.lang.String r12 = r2.optString(r5, r4)
            java.lang.String r3 = "all"
            boolean r3 = r3.equals(r12)
            java.lang.String r12 = "fail invalid encoding"
            java.lang.String r13 = "encoding"
            if (r3 == 0) goto L_0x0160
            java.lang.String r2 = r2.optString(r13)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r10
            r4 = 1
            r3[r4] = r2
            java.lang.String r4 = "call, all files, path %s, encoding %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r3 == 0) goto L_0x00db
            r12 = 0
            goto L_0x00f5
        L_0x00db:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.file.h> r3 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82432h.C82433a.f241519a
            java.lang.String r2 = r2.toLowerCase()
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r2 = r3.get(r2)
            com.tencent.mm.plugin.appbrand.jsapi.file.h r2 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82432h) r2
            if (r2 != 0) goto L_0x00f4
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.<init>(r12, r2)
            return r0
        L_0x00f4:
            r12 = r2
        L_0x00f5:
            js0.m r13 = new js0.m
            r13.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r2 = r35.getFileSystem()     // Catch:{ Exception -> 0x0148 }
            java.lang.String r16 = ""
            r18 = 0
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r36
            r4 = r13
            r22 = r5
            r5 = r16
            r10 = r7
            r17 = r14
            r14 = r6
            r6 = r18
            r19 = r8
            r18 = r14
            r14 = r9
            r8 = r20
            com.tencent.mm.plugin.appbrand.appstorage.b0 r2 = r2.readZipEntry(r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x0146 }
            java.lang.String r0 = r0.mo119971i()     // Catch:{ Exception -> 0x0146 }
            if (r15 == 0) goto L_0x0128
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ Exception -> 0x0146 }
        L_0x0128:
            if (r2 != r11) goto L_0x013f
            T r0 = r13.f29691a
            if (r0 == 0) goto L_0x013f
            r1.mo114819e(r13, r12, r14, r10)
            r10 = r19
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f242316a
            java.util.HashMap r0 = (java.util.HashMap) r0
            r8 = r18
            r9 = r22
            r0.put(r9, r8)
            return r10
        L_0x013f:
            r6 = r36
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = r1.mo114818d(r2, r6)
            return r0
        L_0x0146:
            r0 = move-exception
            goto L_0x014b
        L_0x0148:
            r0 = move-exception
            r17 = r14
        L_0x014b:
            r3 = 0
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "read zip stream, all files mode"
            r7 = r17
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r4, r2)
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail read zip data"
            r0.<init>(r3, r2)
            return r0
        L_0x0160:
            r3 = 0
            r32 = r9
            r9 = r5
            r5 = r7
            r7 = r14
            r14 = r32
            r33 = r8
            r8 = r6
            r6 = r10
            r10 = r33
            org.json.JSONArray r2 = r2.optJSONArray(r9)
            if (r2 != 0) goto L_0x017e
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r3 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail invalid input: entries format wrong"
            r0.<init>(r3, r2)
            return r0
        L_0x017e:
            r17 = r5
            r3 = 0
        L_0x0181:
            int r5 = r2.length()
            if (r3 >= r5) goto L_0x0326
            org.json.JSONObject r5 = r2.optJSONObject(r3)
            if (r5 == 0) goto L_0x031b
            r37 = r2
            java.lang.String r2 = "path"
            java.lang.String r18 = r5.optString(r2)
            boolean r18 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            if (r18 == 0) goto L_0x019e
            goto L_0x031b
        L_0x019e:
            java.lang.String r2 = r5.optString(r2)
            java.lang.String r18 = r5.optString(r13, r4)
            r20 = r3
            r19 = r4
            r3 = 0
            java.lang.String r6 = "position"
            long r21 = r5.optLong(r6, r3)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r6 = "length"
            long r23 = r5.optLong(r6, r3)
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r18)
            java.lang.String r6 = "file:"
            java.lang.String r5 = "errMsg"
            if (r3 == 0) goto L_0x01ca
            r4 = 0
            goto L_0x020a
        L_0x01ca:
            java.util.Map<java.lang.String, com.tencent.mm.plugin.appbrand.jsapi.file.h> r3 = com.tencent.p014mm.plugin.appbrand.jsapi.file.C82432h.C82433a.f241519a
            java.lang.String r4 = r18.toLowerCase()
            java.util.HashMap r3 = (java.util.HashMap) r3
            java.lang.Object r3 = r3.get(r4)
            com.tencent.mm.plugin.appbrand.jsapi.file.h r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.file.C82432h) r3
            if (r3 != 0) goto L_0x0209
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r3.put(r5, r12)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r8.put(r2, r3)
            r3 = r36
            r25 = r37
            r29 = r7
            r6 = r8
            r31 = r9
            r26 = r12
            r27 = r13
            r13 = r17
            r18 = r20
            r17 = r10
            goto L_0x02ea
        L_0x0209:
            r4 = r3
        L_0x020a:
            js0.m r3 = new js0.m
            r3.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r18 = r35.getFileSystem()     // Catch:{ Exception -> 0x0303 }
            r25 = r37
            r37 = r2
            r2 = r18
            r18 = r20
            r20 = r3
            r3 = r36
            r26 = r12
            r12 = r4
            r4 = r20
            r27 = r13
            r13 = r17
            r17 = r10
            r10 = r5
            r5 = r37
            r28 = r6
            r29 = r7
            r6 = r21
            r30 = r8
            r31 = r9
            r8 = r23
            com.tencent.mm.plugin.appbrand.appstorage.b0 r2 = r2.readZipEntry(r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x0301 }
            java.lang.String r3 = r0.mo119971i()     // Catch:{ Exception -> 0x0301 }
            if (r15 == 0) goto L_0x0246
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)     // Catch:{ Exception -> 0x0301 }
        L_0x0246:
            r3 = r20
            if (r2 != r11) goto L_0x0261
            T r4 = r3.f29691a
            if (r4 == 0) goto L_0x0261
            T r4 = r3.f29691a
            java.util.Map r4 = (java.util.Map) r4
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0261
            r1.mo114819e(r3, r12, r14, r13)
            r3 = r36
            r6 = r30
            goto L_0x02ea
        L_0x0261:
            T r4 = r3.f29691a
            if (r4 == 0) goto L_0x0294
            T r3 = r3.f29691a
            java.util.Map r3 = (java.util.Map) r3
            int r3 = r3.size()
            if (r3 != 0) goto L_0x0294
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "fail no such file"
            r2.put(r10, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r28
            r3.append(r4)
            r5 = r37
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r6 = r30
            r6.put(r3, r2)
            r3 = r36
            goto L_0x02ea
        L_0x0294:
            r5 = r37
            r4 = r28
            r6 = r30
            int r3 = r2.ordinal()
            r7 = 11
            if (r3 == r7) goto L_0x02cc
            r7 = 12
            if (r3 == r7) goto L_0x02ad
            r3 = r36
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = r1.mo114818d(r2, r3)
            return r0
        L_0x02ad:
            r3 = r36
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r7 = "fail the value of length is out of range"
            r2.put(r10, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            r6.put(r4, r2)
            goto L_0x02ea
        L_0x02cc:
            r3 = r36
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r7 = "fail the value of position is out of range"
            r2.put(r10, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = r7.toString()
            r6.put(r4, r2)
        L_0x02ea:
            int r2 = r18 + 1
            r8 = r6
            r10 = r17
            r4 = r19
            r12 = r26
            r7 = r29
            r9 = r31
            r6 = r3
            r17 = r13
            r13 = r27
            r3 = r2
            r2 = r25
            goto L_0x0181
        L_0x0301:
            r0 = move-exception
            goto L_0x0306
        L_0x0303:
            r0 = move-exception
            r29 = r7
        L_0x0306:
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = "read zip stream, single file mode"
            r5 = r29
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r4, r3)
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntryfail read ZipEntry"
            r0.<init>(r3, r2)
            return r0
        L_0x031b:
            r2 = 0
            com.tencent.mm.plugin.appbrand.jsapi.file.i r0 = new com.tencent.mm.plugin.appbrand.jsapi.file.i
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "MicroMsg.AppBrand.FileSystem.UnitReadZipEntryinvalid input data"
            r0.<init>(r3, r2)
            return r0
        L_0x0326:
            r6 = r8
            r31 = r9
            r0 = r10
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f242316a
            java.util.HashMap r2 = (java.util.HashMap) r2
            r3 = r31
            r2.put(r3, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.file.C82469p1.mo114803b(com.tencent.mm.plugin.appbrand.jsapi.f, java.lang.String, org.json.JSONObject):com.tencent.mm.plugin.appbrand.jsapi.file.i");
    }

    /* renamed from: d */
    public final C82446i mo114818d(C81410b0 b0Var, String str) {
        int ordinal = b0Var.ordinal();
        if (ordinal == 2) {
            return new C82446i("fail sdcard not mounted", new Object[0]);
        }
        if (ordinal == 3) {
            return new C82446i("fail no such file or directory, open \"%s\"", str);
        } else if (ordinal != 4) {
            return new C82446i("fail " + b0Var.name(), new Object[0]);
        } else {
            return new C82446i("fail permission denied, open \"%s\"", str);
        }
    }

    /* renamed from: e */
    public final void mo114819e(C9514m<Map<String, ByteBuffer>> mVar, C82432h hVar, C9514m<C82446i> mVar2, C9514m<Map<String, Object>> mVar3) {
        if (mVar.f29691a != null && mVar2.f29691a != null && mVar3.f29691a != null) {
            for (Map.Entry entry : ((Map) mVar.f29691a).entrySet()) {
                HashMap hashMap = new HashMap();
                if (hVar == null) {
                    Object value = entry.getValue();
                    ((HashMap) ((C82446i) mVar2.f29691a).f242316a).put("file:" + ((String) entry.getKey()), value);
                    hashMap.put("errMsg", "ok");
                } else {
                    hashMap.put("data", hVar.mo114814b((ByteBuffer) entry.getValue()));
                    hashMap.put("errMsg", "ok");
                }
                ((Map) mVar3.f29691a).put("file:" + ((String) entry.getKey()), hashMap);
            }
        }
    }
}
