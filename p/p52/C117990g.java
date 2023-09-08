package p52;

/* renamed from: p52.g */
public class C117990g {

    /* renamed from: a */
    public static C117989f f352682a;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.Bundle, java.lang.String[], android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0129, code lost:
        if (r2 == 0) goto L_0x012e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle m166405a(java.lang.String r9, java.lang.String r10, android.os.Bundle r11) {
        /*
            p52.f r0 = f352682a
            java.lang.String r1 = "MagicPkgInfo"
            r2 = 0
            if (r0 != 0) goto L_0x0016
            p52.f r0 = new p52.f
            f40.o r3 = f40.C86709a0.m107535s()
            zh3.f r3 = r3.f251811i
            com.tencent.mm.sdk.storage.IAutoDBItem$MAutoDBInfo r4 = p52.C117988e.f352679J
            r0.<init>(r3, r4, r1, r2)
            f352682a = r0
        L_0x0016:
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r4 = 0
            r3[r4] = r9
            r5 = 1
            r3[r5] = r10
            java.lang.String r6 = "MicroMsg.MagicPkgStorageHelper"
            java.lang.String r7 = "call %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r3)
            r9.getClass()
            r3 = -1
            int r7 = r9.hashCode()
            r8 = 3
            switch(r7) {
                case -1673037661: goto L_0x0054;
                case -1672952685: goto L_0x0049;
                case -666465071: goto L_0x003e;
                case -30560378: goto L_0x0033;
                default: goto L_0x0032;
            }
        L_0x0032:
            goto L_0x005e
        L_0x0033:
            java.lang.String r7 = "insertMagicPkgInfo"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x003c
            goto L_0x005e
        L_0x003c:
            r3 = 3
            goto L_0x005e
        L_0x003e:
            java.lang.String r7 = "removeMagicPkgInfo"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x0047
            goto L_0x005e
        L_0x0047:
            r3 = 2
            goto L_0x005e
        L_0x0049:
            java.lang.String r7 = "getMagicPkgList"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x0052
            goto L_0x005e
        L_0x0052:
            r3 = 1
            goto L_0x005e
        L_0x0054:
            java.lang.String r7 = "getMagicPkgInfo"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            java.lang.String r9 = "MagicPkg"
            java.lang.String r7 = "MicroMsg.MagicPkgInfoStorage"
            if (r3 == 0) goto L_0x0166
            if (r3 == r5) goto L_0x00e5
            if (r3 == r0) goto L_0x00c7
            if (r3 == r8) goto L_0x006b
            return r2
        L_0x006b:
            android.os.Parcelable r9 = r11.getParcelable(r9)
            com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r9 = (com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo) r9
            if (r9 != 0) goto L_0x0074
            return r2
        L_0x0074:
            p52.e r10 = new p52.e
            r10.<init>()
            java.lang.String r11 = r9.f81564d
            r10.field_pkgId = r11
            int r0 = r9.f81570j
            r10.field_pkgType = r0
            java.lang.String r0 = r9.f81567g
            r10.field_pkgPath = r0
            java.lang.String r0 = r9.f81568h
            r10.field_unZipPath = r0
            java.lang.String r0 = r9.f81571n
            r10.field_patchId = r0
            long r5 = r9.f81574q
            r10.field_updateTime = r5
            java.lang.String r0 = r9.f81565e
            r10.field_url = r0
            java.lang.String r0 = r9.f81566f
            r10.field_md5 = r0
            long r5 = r9.f81575r
            r10.field_lastUseTime = r5
            java.lang.String r0 = r9.f81572o
            r10.field_version = r0
            java.lang.String r0 = r9.f81573p
            r10.field_wxaPkgPath = r0
            java.lang.String r9 = r9.f81569i
            r10.field_originalName = r9
            p52.f r9 = f352682a
            p52.e r9 = r9.mo182752jo(r11)
            if (r9 != 0) goto L_0x00bf
            p52.f r9 = f352682a
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r9.f352681d
            android.content.ContentValues r10 = r10.convertTo()
            java.lang.String r11 = "pkgId"
            r9.insert(r1, r11, r10)
            goto L_0x00c6
        L_0x00bf:
            p52.f r9 = f352682a
            java.lang.String[] r11 = new java.lang.String[r4]
            r9.update(r10, (java.lang.String[]) r11)
        L_0x00c6:
            return r2
        L_0x00c7:
            p52.f r9 = f352682a
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r9.f352681d
            java.lang.String[] r11 = new java.lang.String[r5]
            r11[r4] = r10
            java.lang.String r3 = "pkgId=?"
            int r9 = r9.delete(r1, r3, r11)
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r4] = r10
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11[r5] = r9
            java.lang.String r9 = "remove magicpkg: %s, ret:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r11)
            return r2
        L_0x00e5:
            p52.f r9 = f352682a
            r9.getClass()
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r4] = r1
            java.lang.String r11 = "select * from %s "
            java.lang.String r10 = java.lang.String.format(r11, r10)
            java.lang.String[] r11 = new java.lang.String[r4]
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r9 = r9.f352681d     // Catch:{ Exception -> 0x011b }
            android.database.Cursor r2 = r9.rawQuery(r10, r11, r0)     // Catch:{ Exception -> 0x011b }
            boolean r9 = r2.moveToFirst()     // Catch:{ Exception -> 0x011b }
            if (r9 == 0) goto L_0x012b
        L_0x0107:
            p52.e r9 = new p52.e     // Catch:{ Exception -> 0x011b }
            r9.<init>()     // Catch:{ Exception -> 0x011b }
            r9.convertFrom(r2)     // Catch:{ Exception -> 0x011b }
            r1.add(r9)     // Catch:{ Exception -> 0x011b }
            boolean r9 = r2.moveToNext()     // Catch:{ Exception -> 0x011b }
            if (r9 != 0) goto L_0x0107
            goto L_0x012b
        L_0x0119:
            r9 = move-exception
            goto L_0x0160
        L_0x011b:
            r9 = move-exception
            java.lang.String r10 = "getMagicPkgList failed. :%s"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0119 }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r9)     // Catch:{ all -> 0x0119 }
            r11[r4] = r9     // Catch:{ all -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r10, r11)     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x012e
        L_0x012b:
            r2.close()
        L_0x012e:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r10 = r1.size()
            if (r10 <= 0) goto L_0x014f
        L_0x0139:
            int r10 = r1.size()
            if (r4 >= r10) goto L_0x014f
            java.lang.Object r10 = r1.get(r4)
            p52.e r10 = (p52.C117988e) r10
            com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r10 = r10.mo182751l2()
            r9.add(r10)
            int r4 = r4 + 1
            goto L_0x0139
        L_0x014f:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            boolean r11 = r9.isEmpty()
            if (r11 != 0) goto L_0x015f
            java.lang.String r11 = "MagicPkgList"
            r10.putParcelableArrayList(r11, r9)
        L_0x015f:
            return r10
        L_0x0160:
            if (r2 == 0) goto L_0x0165
            r2.close()
        L_0x0165:
            throw r9
        L_0x0166:
            p52.f r11 = f352682a     // Catch:{ Exception -> 0x017b }
            p52.e r11 = r11.mo182752jo(r10)     // Catch:{ Exception -> 0x017b }
            if (r11 == 0) goto L_0x0189
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ Exception -> 0x017b }
            r0.<init>()     // Catch:{ Exception -> 0x017b }
            com.tencent.mm.plugin.magicbrush.api.WxaMagicPkgInfo r11 = r11.mo182751l2()     // Catch:{ Exception -> 0x017b }
            r0.putParcelable(r9, r11)     // Catch:{ Exception -> 0x017b }
            return r0
        L_0x017b:
            r9 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r5]
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r9)
            r11[r4] = r9
            java.lang.String r9 = "getMagicPkgInfo failed. :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r9, r11)
        L_0x0189:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "null == info, pkgId:"
            r9.append(r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p52.C117990g.m166405a(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }
}
