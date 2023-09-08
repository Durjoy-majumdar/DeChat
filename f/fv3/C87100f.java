package fv3;

/* renamed from: fv3.f */
public class C87100f extends C87097c {
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r13v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0252 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0277  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m108117c(android.content.Context r23, java.lang.String r24, java.io.File r25, java.io.File r26, java.io.File r27, com.tencent.tinker.loader.shareutil.ShareResPatchInfo r28, int r29, boolean r30) {
        /*
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            java.lang.String r4 = "resources.arsc"
            long r5 = java.lang.System.currentTimeMillis()
            iv3.a r7 = iv3.C87821a.m109275c(r23)
            r8 = 0
            java.util.zip.ZipFile r9 = new java.util.zip.ZipFile     // Catch:{ all -> 0x02e1 }
            r10 = r24
            r9.<init>(r10)     // Catch:{ all -> 0x02e1 }
            java.util.zip.ZipEntry r10 = r9.getEntry(r4)     // Catch:{ all -> 0x02de }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x02de }
            r12 = r25
            r11.<init>(r12, r4)     // Catch:{ all -> 0x02de }
            java.lang.String r12 = "Tinker.ResDiffPatchInternal"
            r13 = 0
            if (r10 != 0) goto L_0x0042
            java.lang.String r0 = "resources apk entry is null. path:resources.arsc"
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x003f }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r2)     // Catch:{ all -> 0x003f }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x003f }
            r0.mo109442d(r1, r11, r4, r3)     // Catch:{ all -> 0x003f }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r8)
            return r13
        L_0x003f:
            r0 = move-exception
            goto L_0x02e4
        L_0x0042:
            long r14 = r10.getCrc()     // Catch:{ all -> 0x02de }
            java.lang.String r10 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x02de }
            java.lang.String r14 = r2.arscBaseCrc     // Catch:{ all -> 0x02de }
            boolean r14 = r10.equals(r14)     // Catch:{ all -> 0x02de }
            r15 = 2
            r8 = 1
            if (r14 != 0) goto L_0x006f
            java.lang.String r0 = "resources.arsc's crc is not equal, expect crc: %s, got crc: %s"
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ all -> 0x02de }
            java.lang.String r2 = r2.arscBaseCrc     // Catch:{ all -> 0x02de }
            r5[r13] = r2     // Catch:{ all -> 0x02de }
            r5[r8] = r10     // Catch:{ all -> 0x02de }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r12, r0, r5)     // Catch:{ all -> 0x02de }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02de }
            r0.mo109442d(r1, r11, r4, r3)     // Catch:{ all -> 0x02de }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            r1 = 0
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r1)
            return r13
        L_0x006f:
            java.util.ArrayList<java.lang.String> r4 = r2.largeModRes     // Catch:{ all -> 0x02de }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x02de }
            if (r4 == 0) goto L_0x008e
            java.util.HashMap<java.lang.String, java.io.File> r4 = r2.storeRes     // Catch:{ all -> 0x02de }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x02de }
            if (r4 == 0) goto L_0x008e
            java.lang.String r0 = "no large modify or store resources, just return"
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x02de }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r12, r0, r1)     // Catch:{ all -> 0x02de }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            r1 = 0
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r1)
            return r8
        L_0x008e:
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ all -> 0x02de }
            r4.<init>(r1)     // Catch:{ all -> 0x02de }
            java.util.HashMap<java.lang.String, java.io.File> r10 = r2.storeRes     // Catch:{ all -> 0x02db }
            java.util.Set r10 = r10.keySet()     // Catch:{ all -> 0x02db }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x02db }
        L_0x009d:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x02db }
            if (r11 == 0) goto L_0x0158
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x02db }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x02db }
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02db }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x02db }
            r14.<init>(r0, r11)     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.ensureFileDirectory(r14)     // Catch:{ all -> 0x02db }
            java.util.zip.ZipEntry r15 = r4.getEntry(r11)     // Catch:{ all -> 0x02db }
            if (r15 != 0) goto L_0x00de
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02db }
            r0.<init>()     // Catch:{ all -> 0x02db }
            java.lang.String r2 = "store patch entry is null. path:"
            r0.append(r2)     // Catch:{ all -> 0x02db }
            r0.append(r11)     // Catch:{ all -> 0x02db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02db }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r2)     // Catch:{ all -> 0x02db }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02db }
            r0.mo109442d(r1, r14, r11, r3)     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r4)
            return r13
        L_0x00de:
            r8 = 0
            fv3.C87097c.m108110a(r4, r15, r14, r8, r13)     // Catch:{ all -> 0x02db }
            long r19 = r15.getSize()     // Catch:{ all -> 0x02db }
            long r21 = r14.length()     // Catch:{ all -> 0x02db }
            int r16 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r16 == 0) goto L_0x0126
            java.lang.String r0 = "resource meta file size mismatch, type:%s, name: %s, patch size: %d, file size; %d"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02db }
            java.lang.String r5 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r29)     // Catch:{ all -> 0x02db }
            r2[r13] = r5     // Catch:{ all -> 0x02db }
            r5 = 1
            r2[r5] = r11     // Catch:{ all -> 0x02db }
            long r5 = r15.getSize()     // Catch:{ all -> 0x02db }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x02db }
            r6 = 2
            r2[r6] = r5     // Catch:{ all -> 0x02db }
            long r5 = r14.length()     // Catch:{ all -> 0x02db }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x02db }
            r6 = 3
            r2[r6] = r5     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r2)     // Catch:{ all -> 0x02db }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02db }
            int r2 = fv3.C87097c.m108111b(r29)     // Catch:{ all -> 0x02db }
            r0.mo109440b(r1, r2)     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r4)
            return r13
        L_0x0126:
            java.util.HashMap<java.lang.String, java.io.File> r15 = r2.storeRes     // Catch:{ all -> 0x02db }
            r15.put(r11, r14)     // Catch:{ all -> 0x02db }
            java.lang.String r11 = "success recover store file:%s, file size:%d, use time:%d"
            r15 = 3
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch:{ all -> 0x02db }
            java.lang.String r16 = r14.getPath()     // Catch:{ all -> 0x02db }
            r15[r13] = r16     // Catch:{ all -> 0x02db }
            long r19 = r14.length()     // Catch:{ all -> 0x02db }
            java.lang.Long r14 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x02db }
            r16 = 1
            r15[r16] = r14     // Catch:{ all -> 0x02db }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02db }
            long r19 = r19 - r17
            java.lang.Long r14 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x02db }
            r16 = 2
            r15[r16] = r14     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r11, r15)     // Catch:{ all -> 0x02db }
            r8 = 1
            r15 = 2
            goto L_0x009d
        L_0x0158:
            r8 = 0
            java.util.ArrayList<java.lang.String> r10 = r2.largeModRes     // Catch:{ all -> 0x02db }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x02db }
        L_0x015f:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x02db }
            if (r11 == 0) goto L_0x02be
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x02db }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x02db }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02db }
            java.util.HashMap<java.lang.String, com.tencent.tinker.loader.shareutil.ShareResPatchInfo$LargeModeInfo> r8 = r2.largeModMap     // Catch:{ all -> 0x02db }
            java.lang.Object r8 = r8.get(r11)     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareResPatchInfo$LargeModeInfo r8 = (com.tencent.tinker.loader.shareutil.ShareResPatchInfo.LargeModeInfo) r8     // Catch:{ all -> 0x02db }
            if (r8 != 0) goto L_0x019b
            java.lang.String r0 = "resource not found largeModeInfo, type:%s, name: %s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02db }
            java.lang.String r5 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r29)     // Catch:{ all -> 0x02db }
            r2[r13] = r5     // Catch:{ all -> 0x02db }
            r5 = 1
            r2[r5] = r11     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r2)     // Catch:{ all -> 0x02db }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02db }
            int r2 = fv3.C87097c.m108111b(r29)     // Catch:{ all -> 0x02db }
            r0.mo109440b(r1, r2)     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r4)
            return r13
        L_0x019b:
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x02db }
            r13.<init>(r0, r11)     // Catch:{ all -> 0x02db }
            r8.file = r13     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.ensureFileDirectory(r13)     // Catch:{ all -> 0x02db }
            java.lang.String r13 = r8.md5     // Catch:{ all -> 0x02db }
            boolean r13 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r13)     // Catch:{ all -> 0x02db }
            if (r13 != 0) goto L_0x01d0
            java.lang.String r0 = "resource meta file md5 mismatch, type:%s, name: %s, md5: %s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02db }
            java.lang.String r5 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r29)     // Catch:{ all -> 0x02db }
            r6 = 0
            r2[r6] = r5     // Catch:{ all -> 0x02db }
            r5 = 1
            r2[r5] = r11     // Catch:{ all -> 0x02db }
            java.lang.String r5 = r8.md5     // Catch:{ all -> 0x02db }
            r6 = 2
            r2[r6] = r5     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r2)     // Catch:{ all -> 0x02db }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02db }
            int r2 = fv3.C87097c.m108111b(r29)     // Catch:{ all -> 0x02db }
            r0.mo109440b(r1, r2)     // Catch:{ all -> 0x02db }
            goto L_0x026f
        L_0x01d0:
            java.util.zip.ZipEntry r13 = r4.getEntry(r11)     // Catch:{ all -> 0x02db }
            if (r13 != 0) goto L_0x01f6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02db }
            r0.<init>()     // Catch:{ all -> 0x02db }
            java.lang.String r2 = "large mod patch entry is null. path:"
            r0.append(r2)     // Catch:{ all -> 0x02db }
            r0.append(r11)     // Catch:{ all -> 0x02db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02db }
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r5)     // Catch:{ all -> 0x02db }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02db }
            java.io.File r2 = r8.file     // Catch:{ all -> 0x02db }
            r0.mo109442d(r1, r2, r11, r3)     // Catch:{ all -> 0x02db }
            goto L_0x026f
        L_0x01f6:
            java.util.zip.ZipEntry r0 = r9.getEntry(r11)     // Catch:{ all -> 0x02db }
            if (r0 != 0) goto L_0x021c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x02db }
            r0.<init>()     // Catch:{ all -> 0x02db }
            java.lang.String r2 = "resources apk entry is null. path:"
            r0.append(r2)     // Catch:{ all -> 0x02db }
            r0.append(r11)     // Catch:{ all -> 0x02db }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x02db }
            r2 = 0
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r5)     // Catch:{ all -> 0x02db }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02db }
            java.io.File r2 = r8.file     // Catch:{ all -> 0x02db }
            r0.mo109442d(r1, r2, r11, r3)     // Catch:{ all -> 0x02db }
            goto L_0x026f
        L_0x021c:
            java.io.InputStream r2 = r9.getInputStream(r0)     // Catch:{ all -> 0x02b3 }
            java.io.InputStream r13 = r4.getInputStream(r13)     // Catch:{ all -> 0x02b0 }
            iv3.a r0 = iv3.C87821a.m109275c(r23)     // Catch:{ all -> 0x02ad }
            cv3.a r0 = r0.f254234g     // Catch:{ all -> 0x02ad }
            if (r0 == 0) goto L_0x0236
            if (r30 != 0) goto L_0x022f
            goto L_0x0236
        L_0x022f:
            iv3.a r0 = iv3.C87821a.m109275c(r23)     // Catch:{ all -> 0x02ad }
            cv3.a r0 = r0.f254234g     // Catch:{ all -> 0x02ad }
            goto L_0x023b
        L_0x0236:
            cv3.b r0 = new cv3.b     // Catch:{ all -> 0x02ad }
            r0.<init>()     // Catch:{ all -> 0x02ad }
        L_0x023b:
            r18 = r10
            java.io.File r10 = r8.file     // Catch:{ all -> 0x02ad }
            r0.mo120560a(r2, r13, r10)     // Catch:{ all -> 0x02ad }
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x02db }
            av3.C79633a.m96712a(r13)     // Catch:{ all -> 0x02db }
            java.io.File r0 = r8.file     // Catch:{ all -> 0x02db }
            java.lang.String r2 = r8.md5     // Catch:{ all -> 0x02db }
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyFileMd5(r0, r2)     // Catch:{ all -> 0x02db }
            if (r0 != 0) goto L_0x0277
            java.lang.String r0 = "Failed to recover large modify file:%s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02db }
            java.io.File r5 = r8.file     // Catch:{ all -> 0x02db }
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x02db }
            r6 = 0
            r2[r6] = r5     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r2)     // Catch:{ all -> 0x02db }
            java.io.File r0 = r8.file     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r0)     // Catch:{ all -> 0x02db }
            gv3.d r0 = r7.f254232e     // Catch:{ all -> 0x02db }
            java.io.File r2 = r8.file     // Catch:{ all -> 0x02db }
            r0.mo109442d(r1, r2, r11, r3)     // Catch:{ all -> 0x02db }
        L_0x026f:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r4)
            r0 = 0
            return r0
        L_0x0277:
            java.lang.String r0 = "success recover large modify file:%s, file size:%d, use time:%d"
            r2 = 3
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x02db }
            java.io.File r11 = r8.file     // Catch:{ all -> 0x02db }
            java.lang.String r11 = r11.getPath()     // Catch:{ all -> 0x02db }
            r13 = 0
            r10[r13] = r11     // Catch:{ all -> 0x02db }
            java.io.File r8 = r8.file     // Catch:{ all -> 0x02db }
            long r19 = r8.length()     // Catch:{ all -> 0x02db }
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x02db }
            r11 = 1
            r10[r11] = r8     // Catch:{ all -> 0x02db }
            long r19 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02db }
            long r19 = r19 - r14
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x02db }
            r11 = 2
            r10[r11] = r8     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r10)     // Catch:{ all -> 0x02db }
            r0 = r26
            r2 = r28
            r10 = r18
            r8 = 0
            r13 = 0
            goto L_0x015f
        L_0x02ad:
            r0 = move-exception
            r8 = r13
            goto L_0x02b7
        L_0x02b0:
            r0 = move-exception
            r1 = r2
            goto L_0x02b5
        L_0x02b3:
            r0 = move-exception
            r1 = 0
        L_0x02b5:
            r2 = r1
            r8 = 0
        L_0x02b7:
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x02db }
            av3.C79633a.m96712a(r8)     // Catch:{ all -> 0x02db }
            throw r0     // Catch:{ all -> 0x02db }
        L_0x02be:
            java.lang.String r0 = "success recover all large modify and store resources use time:%d"
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x02db }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02db }
            long r7 = r7 - r5
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x02db }
            r5 = 0
            r2[r5] = r1     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r12, r0, r2)     // Catch:{ all -> 0x02db }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r4)
            r0 = 1
            return r0
        L_0x02db:
            r0 = move-exception
            r8 = r4
            goto L_0x02e4
        L_0x02de:
            r0 = move-exception
            r8 = 0
            goto L_0x02e4
        L_0x02e1:
            r0 = move-exception
            r8 = 0
            r9 = 0
        L_0x02e4:
            com.tencent.tinker.loader.TinkerRuntimeException r1 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch:{ all -> 0x0311 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0311 }
            r2.<init>()     // Catch:{ all -> 0x0311 }
            java.lang.String r4 = "patch "
            r2.append(r4)     // Catch:{ all -> 0x0311 }
            java.lang.String r3 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r29)     // Catch:{ all -> 0x0311 }
            r2.append(r3)     // Catch:{ all -> 0x0311 }
            java.lang.String r3 = " extract failed ("
            r2.append(r3)     // Catch:{ all -> 0x0311 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0311 }
            r2.append(r3)     // Catch:{ all -> 0x0311 }
            java.lang.String r3 = ")."
            r2.append(r3)     // Catch:{ all -> 0x0311 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0311 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0311 }
            throw r1     // Catch:{ all -> 0x0311 }
        L_0x0311:
            r0 = move-exception
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r9)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fv3.C87100f.m108117c(android.content.Context, java.lang.String, java.io.File, java.io.File, java.io.File, com.tencent.tinker.loader.shareutil.ShareResPatchInfo, int, boolean):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: kv3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: kv3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: kv3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: kv3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: kv3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: kv3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: kv3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: kv3.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: kv3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: kv3.h} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b9, code lost:
        if (r14.storeRes.containsKey(r7) == false) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02bb, code lost:
        kv3.C88318i.m110094a(r8, r14.storeRes.get(r7), r8.f255285f, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02c9, code lost:
        kv3.C88318i.m110095b(r4, r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02cc, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02cf, code lost:
        r3.mo122695a();
        r1 = r3.f255298h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d4, code lost:
        if (r1 != null) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02d6, code lost:
        r2.f255304e = kv3.C88317h.f255302o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02db, code lost:
        r1 = r1.getBytes(kv3.C88312d.f255281a);
        r2.mo122703a("Comment", r1);
        r2.f255304e = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        av3.C79633a.m96712a(r2);
        av3.C79633a.m96712a(r3);
        av3.C79633a.m96712a(r4);
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02fb, code lost:
        if (com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkResourceArscMd5(r15, r14.resArscMd5) != false) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fd, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i("Tinker.ResDiffPatchInternal", "check final new resource file fail path:%s, entry count:%d, size:%d", r15.getAbsolutePath(), java.lang.Integer.valueOf(r5), java.lang.Long.valueOf(r15.length()));
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r15);
        r6.f254232e.mo109442d(r0, r15, r17, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x032a, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i("Tinker.ResDiffPatchInternal", "final new resource file:%s, entry count:%d, size:%d", r15.getAbsolutePath(), java.lang.Integer.valueOf(r5), java.lang.Long.valueOf(r15.length()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x019e, code lost:
        r1 = r3.mo122696b(com.tencent.tinker.loader.shareutil.ShareConstants.RES_MANIFEST);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a2, code lost:
        if (r1 != null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a4, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w("Tinker.ResDiffPatchInternal", "manifest patch entry is null. path:AndroidManifest.xml", new java.lang.Object[0]);
        r19.f254232e.mo109442d(r0, r15, com.tencent.tinker.loader.shareutil.ShareConstants.RES_MANIFEST, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        av3.C79633a.m96712a(r2);
        av3.C79633a.m96712a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01b9, code lost:
        av3.C79633a.m96712a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bd, code lost:
        r6 = r19;
        r8 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        kv3.C88318i.m110095b(r3, r1, r2);
        r5 = r5 + 1;
        r1 = r14.largeModRes.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cf, code lost:
        if (r1.hasNext() == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d1, code lost:
        r7 = r1.next();
        r11 = r3.mo122696b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01db, code lost:
        if (r11 != null) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01dd, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w("Tinker.ResDiffPatchInternal", "large patch entry is null. path:" + r7, new java.lang.Object[r10]);
        r6.f254232e.mo109442d(r0, r15, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        av3.C79633a.m96712a(r2);
        av3.C79633a.m96712a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ff, code lost:
        com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r7 = r14.largeModMap.get(r7);
        kv3.C88318i.m110094a(r11, r7.file, r7.crc, r2);
        r5 = r5 + 1;
        r8 = 6;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021c, code lost:
        r1 = r14.addRes.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0226, code lost:
        if (r1.hasNext() == false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0228, code lost:
        r7 = r1.next();
        r8 = r4.mo122696b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0232, code lost:
        if (r8 != null) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0234, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w("Tinker.ResDiffPatchInternal", "add patch entry is null. path:" + r7, new java.lang.Object[0]);
        r6.f254232e.mo109442d(r0, r15, r7, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        av3.C79633a.m96712a(r2);
        av3.C79633a.m96712a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0257, code lost:
        av3.C79633a.m96712a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0261, code lost:
        if (r14.storeRes.containsKey(r7) == false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0263, code lost:
        kv3.C88318i.m110094a(r8, r14.storeRes.get(r7), r8.f255285f, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0271, code lost:
        kv3.C88318i.m110095b(r4, r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0274, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0277, code lost:
        r1 = r14.modRes.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0281, code lost:
        if (r1.hasNext() == false) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0283, code lost:
        r7 = r1.next();
        r8 = r4.mo122696b(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x028d, code lost:
        if (r8 != null) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x028f, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w("Tinker.ResDiffPatchInternal", "mod patch entry is null. path:" + r7, new java.lang.Object[0]);
        r6.f254232e.mo109442d(r0, r15, r7, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        av3.C79633a.m96712a(r2);
        av3.C79633a.m96712a(r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0358  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m108118d(iv3.C87821a r21, com.tencent.tinker.loader.shareutil.ShareSecurityCheck r22, android.content.Context r23, java.lang.String r24, java.io.File r25, boolean r26, hv3.C87598a r27) {
        /*
            r0 = r25
            r1 = r21
            int r1 = r1.f254237j
            boolean r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnabledForResource(r1)
            java.lang.String r9 = "Tinker.ResDiffPatchInternal"
            r10 = 0
            r11 = 1
            if (r1 != 0) goto L_0x0019
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "patch recover, resource is not enabled"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r0)
            return r11
        L_0x0019:
            java.util.HashMap r1 = r22.getMetaContentMap()
            java.lang.String r2 = "assets/res_meta.txt"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x03ca
            int r2 = r1.length()
            if (r2 != 0) goto L_0x002f
            goto L_0x03ca
        L_0x002f:
            long r12 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = r24
            r2.append(r3)
            java.lang.String r3 = "/"
            r2.append(r3)
            java.lang.String r4 = "res"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.tinker.loader.shareutil.ShareResPatchInfo r14 = new com.tencent.tinker.loader.shareutil.ShareResPatchInfo
            r14.<init>()
            com.tencent.tinker.loader.shareutil.ShareResPatchInfo.parseAllResPatchInfo(r1, r14)
            r15 = 2
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r10] = r2
            java.lang.String r3 = r14.toString()
            r1[r11] = r3
            java.lang.String r3 = "res dir: %s, meta: %s"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r9, r3, r1)
            iv3.a r8 = iv3.C87821a.m109275c(r23)
            java.lang.String r1 = r14.resArscMd5
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r1)
            r7 = 6
            if (r1 != 0) goto L_0x0092
            java.lang.Object[] r1 = new java.lang.Object[r15]
            java.lang.String r2 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r7)
            r1[r10] = r2
            java.lang.String r2 = r14.resArscMd5
            r1[r11] = r2
            java.lang.String r2 = "resource meta file md5 mismatch, type:%s, md5: %s"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r2, r1)
            gv3.d r1 = r8.f254232e
            int r2 = fv3.C87097c.m108111b(r7)
            r1.mo109440b(r0, r2)
            goto L_0x0328
        L_0x0092:
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "res_temp"
            r6.<init>(r3, r1)
            java.io.File r5 = new java.io.File
            java.lang.String r4 = "resources.apk"
            r5.<init>(r3, r4)
            boolean r1 = r5.exists()
            if (r1 == 0) goto L_0x00e3
            java.lang.String r1 = r14.resArscMd5
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkResourceArscMd5(r5, r1)
            if (r1 == 0) goto L_0x00c5
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.String r1 = r5.getPath()
            r0[r10] = r1
            java.lang.String r1 = "resource file %s is already exist, and md5 match, just return true"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r0)
            goto L_0x034a
        L_0x00c5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "have a mismatch corrupted resource "
            r1.append(r2)
            java.lang.String r2 = r5.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r10]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r2)
            r5.delete()
            goto L_0x00ea
        L_0x00e3:
            java.io.File r1 = r5.getParentFile()
            r1.mkdirs()
        L_0x00ea:
            android.content.pm.ApplicationInfo r1 = r23.getApplicationInfo()     // Catch:{ all -> 0x039b }
            if (r1 != 0) goto L_0x00f9
            java.lang.String r0 = "applicationInfo == null!!!!"
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch:{ all -> 0x039b }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r0, r1)     // Catch:{ all -> 0x039b }
            goto L_0x0328
        L_0x00f9:
            java.lang.String r2 = r1.sourceDir     // Catch:{ all -> 0x039b }
            r16 = 6
            r1 = r23
            r21 = r2
            r17 = r4
            r4 = r6
            r15 = r5
            r5 = r25
            r18 = r6
            r6 = r14
            r7 = r16
            r19 = r8
            r8 = r26
            boolean r1 = m108117c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x039b }
            if (r1 != 0) goto L_0x0118
            goto L_0x0328
        L_0x0118:
            r1 = 0
            kv3.h r2 = new kv3.h     // Catch:{ all -> 0x038b }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x038b }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x038b }
            r4.<init>(r15)     // Catch:{ all -> 0x038b }
            r3.<init>(r4)     // Catch:{ all -> 0x038b }
            r2.<init>(r3)     // Catch:{ all -> 0x038b }
            kv3.g r3 = new kv3.g     // Catch:{ all -> 0x0383 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0383 }
            r5 = r21
            r4.<init>(r5)     // Catch:{ all -> 0x0383 }
            r3.<init>(r4, r11)     // Catch:{ all -> 0x0383 }
            kv3.g r4 = new kv3.g     // Catch:{ all -> 0x037c }
            r4.<init>(r0, r11)     // Catch:{ all -> 0x037c }
            r3.mo122695a()     // Catch:{ all -> 0x0379 }
            java.util.LinkedHashMap<java.lang.String, kv3.f> r1 = r3.f255295e     // Catch:{ all -> 0x0379 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0379 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0379 }
            r5 = 0
        L_0x0147:
            r3.mo122695a()     // Catch:{ all -> 0x0379 }
            boolean r6 = r1.hasNext()     // Catch:{ all -> 0x0379 }
            java.lang.String r7 = "AndroidManifest.xml"
            if (r6 == 0) goto L_0x019e
            r3.mo122695a()     // Catch:{ all -> 0x0379 }
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x0379 }
            kv3.f r6 = (kv3.C88314f) r6     // Catch:{ all -> 0x0379 }
            if (r6 == 0) goto L_0x0195
            java.lang.String r8 = r6.f255283d     // Catch:{ all -> 0x0379 }
            java.lang.String r11 = "../"
            boolean r11 = r8.contains(r11)     // Catch:{ all -> 0x0379 }
            if (r11 == 0) goto L_0x0168
            goto L_0x0193
        L_0x0168:
            java.util.HashSet<java.util.regex.Pattern> r11 = r14.patterns     // Catch:{ all -> 0x0379 }
            boolean r11 = com.tencent.tinker.loader.shareutil.ShareResPatchInfo.checkFileInPattern(r11, r8)     // Catch:{ all -> 0x0379 }
            if (r11 == 0) goto L_0x0193
            java.util.ArrayList<java.lang.String> r11 = r14.deleteRes     // Catch:{ all -> 0x0379 }
            boolean r11 = r11.contains(r8)     // Catch:{ all -> 0x0379 }
            if (r11 != 0) goto L_0x0193
            java.util.ArrayList<java.lang.String> r11 = r14.modRes     // Catch:{ all -> 0x0379 }
            boolean r11 = r11.contains(r8)     // Catch:{ all -> 0x0379 }
            if (r11 != 0) goto L_0x0193
            java.util.ArrayList<java.lang.String> r11 = r14.largeModRes     // Catch:{ all -> 0x0379 }
            boolean r11 = r11.contains(r8)     // Catch:{ all -> 0x0379 }
            if (r11 != 0) goto L_0x0193
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x0379 }
            if (r7 != 0) goto L_0x0193
            kv3.C88318i.m110095b(r3, r6, r2)     // Catch:{ all -> 0x0379 }
            int r5 = r5 + 1
        L_0x0193:
            r11 = 1
            goto L_0x0147
        L_0x0195:
            com.tencent.tinker.loader.TinkerRuntimeException r0 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch:{ all -> 0x0379 }
            java.lang.String r1 = "zipEntry is null when get from oldApk"
            r0.<init>(r1)     // Catch:{ all -> 0x0379 }
            throw r0     // Catch:{ all -> 0x0379 }
        L_0x019e:
            kv3.f r1 = r3.mo122696b(r7)     // Catch:{ all -> 0x0379 }
            if (r1 != 0) goto L_0x01bd
            java.lang.String r1 = "manifest patch entry is null. path:AndroidManifest.xml"
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x0379 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r5)     // Catch:{ all -> 0x0379 }
            r6 = r19
            gv3.d r1 = r6.f254232e     // Catch:{ all -> 0x0379 }
            r8 = 6
            r1.mo109442d(r0, r15, r7, r8)     // Catch:{ all -> 0x0379 }
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x039b }
        L_0x01b9:
            av3.C79633a.m96712a(r4)     // Catch:{ all -> 0x039b }
            goto L_0x01ff
        L_0x01bd:
            r6 = r19
            r8 = 6
            kv3.C88318i.m110095b(r3, r1, r2)     // Catch:{ all -> 0x0379 }
            r1 = 1
            int r5 = r5 + r1
            java.util.ArrayList<java.lang.String> r1 = r14.largeModRes     // Catch:{ all -> 0x0379 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0379 }
        L_0x01cb:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x0379 }
            if (r7 == 0) goto L_0x021c
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x0379 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0379 }
            kv3.f r11 = r3.mo122696b(r7)     // Catch:{ all -> 0x0379 }
            if (r11 != 0) goto L_0x0204
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0379 }
            r1.<init>()     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = "large patch entry is null. path:"
            r1.append(r5)     // Catch:{ all -> 0x0379 }
            r1.append(r7)     // Catch:{ all -> 0x0379 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0379 }
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ all -> 0x0379 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r5)     // Catch:{ all -> 0x0379 }
            gv3.d r1 = r6.f254232e     // Catch:{ all -> 0x0379 }
            r1.mo109442d(r0, r15, r7, r8)     // Catch:{ all -> 0x0379 }
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x039b }
            goto L_0x01b9
        L_0x01ff:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir((java.io.File) r18)     // Catch:{ all -> 0x039b }
            goto L_0x0328
        L_0x0204:
            java.util.HashMap<java.lang.String, com.tencent.tinker.loader.shareutil.ShareResPatchInfo$LargeModeInfo> r8 = r14.largeModMap     // Catch:{ all -> 0x0379 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x0379 }
            com.tencent.tinker.loader.shareutil.ShareResPatchInfo$LargeModeInfo r7 = (com.tencent.tinker.loader.shareutil.ShareResPatchInfo.LargeModeInfo) r7     // Catch:{ all -> 0x0379 }
            java.io.File r8 = r7.file     // Catch:{ all -> 0x0379 }
            r23 = r11
            long r10 = r7.crc     // Catch:{ all -> 0x0379 }
            r7 = r23
            kv3.C88318i.m110094a(r7, r8, r10, r2)     // Catch:{ all -> 0x0379 }
            int r5 = r5 + 1
            r8 = 6
            r10 = 0
            goto L_0x01cb
        L_0x021c:
            java.util.ArrayList<java.lang.String> r1 = r14.addRes     // Catch:{ all -> 0x0379 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0379 }
        L_0x0222:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x0379 }
            if (r7 == 0) goto L_0x0277
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x0379 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0379 }
            kv3.f r8 = r4.mo122696b(r7)     // Catch:{ all -> 0x0379 }
            if (r8 != 0) goto L_0x025b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0379 }
            r1.<init>()     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = "add patch entry is null. path:"
            r1.append(r5)     // Catch:{ all -> 0x0379 }
            r1.append(r7)     // Catch:{ all -> 0x0379 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0379 }
            r5 = 0
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0379 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r8)     // Catch:{ all -> 0x0379 }
            gv3.d r1 = r6.f254232e     // Catch:{ all -> 0x0379 }
            r5 = 6
            r1.mo109442d(r0, r15, r7, r5)     // Catch:{ all -> 0x0379 }
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x039b }
        L_0x0257:
            av3.C79633a.m96712a(r4)     // Catch:{ all -> 0x039b }
            goto L_0x01ff
        L_0x025b:
            java.util.HashMap<java.lang.String, java.io.File> r10 = r14.storeRes     // Catch:{ all -> 0x0379 }
            boolean r10 = r10.containsKey(r7)     // Catch:{ all -> 0x0379 }
            if (r10 == 0) goto L_0x0271
            java.util.HashMap<java.lang.String, java.io.File> r10 = r14.storeRes     // Catch:{ all -> 0x0379 }
            java.lang.Object r7 = r10.get(r7)     // Catch:{ all -> 0x0379 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ all -> 0x0379 }
            long r10 = r8.f255285f     // Catch:{ all -> 0x0379 }
            kv3.C88318i.m110094a(r8, r7, r10, r2)     // Catch:{ all -> 0x0379 }
            goto L_0x0274
        L_0x0271:
            kv3.C88318i.m110095b(r4, r8, r2)     // Catch:{ all -> 0x0379 }
        L_0x0274:
            int r5 = r5 + 1
            goto L_0x0222
        L_0x0277:
            java.util.ArrayList<java.lang.String> r1 = r14.modRes     // Catch:{ all -> 0x0379 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0379 }
        L_0x027d:
            boolean r7 = r1.hasNext()     // Catch:{ all -> 0x0379 }
            if (r7 == 0) goto L_0x02cf
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x0379 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0379 }
            kv3.f r8 = r4.mo122696b(r7)     // Catch:{ all -> 0x0379 }
            if (r8 != 0) goto L_0x02b3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0379 }
            r1.<init>()     // Catch:{ all -> 0x0379 }
            java.lang.String r5 = "mod patch entry is null. path:"
            r1.append(r5)     // Catch:{ all -> 0x0379 }
            r1.append(r7)     // Catch:{ all -> 0x0379 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0379 }
            r5 = 0
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0379 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r8)     // Catch:{ all -> 0x0379 }
            gv3.d r1 = r6.f254232e     // Catch:{ all -> 0x0379 }
            r5 = 6
            r1.mo109442d(r0, r15, r7, r5)     // Catch:{ all -> 0x0379 }
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x039b }
            goto L_0x0257
        L_0x02b3:
            java.util.HashMap<java.lang.String, java.io.File> r10 = r14.storeRes     // Catch:{ all -> 0x0379 }
            boolean r10 = r10.containsKey(r7)     // Catch:{ all -> 0x0379 }
            if (r10 == 0) goto L_0x02c9
            java.util.HashMap<java.lang.String, java.io.File> r10 = r14.storeRes     // Catch:{ all -> 0x0379 }
            java.lang.Object r7 = r10.get(r7)     // Catch:{ all -> 0x0379 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ all -> 0x0379 }
            long r10 = r8.f255285f     // Catch:{ all -> 0x0379 }
            kv3.C88318i.m110094a(r8, r7, r10, r2)     // Catch:{ all -> 0x0379 }
            goto L_0x02cc
        L_0x02c9:
            kv3.C88318i.m110095b(r4, r8, r2)     // Catch:{ all -> 0x0379 }
        L_0x02cc:
            int r5 = r5 + 1
            goto L_0x027d
        L_0x02cf:
            r3.mo122695a()     // Catch:{ all -> 0x0379 }
            java.lang.String r1 = r3.f255298h     // Catch:{ all -> 0x0379 }
            if (r1 != 0) goto L_0x02db
            byte[] r1 = kv3.C88317h.f255302o     // Catch:{ all -> 0x0379 }
            r2.f255304e = r1     // Catch:{ all -> 0x0379 }
            goto L_0x02e8
        L_0x02db:
            java.nio.charset.Charset r7 = kv3.C88312d.f255281a     // Catch:{ all -> 0x0379 }
            byte[] r1 = r1.getBytes(r7)     // Catch:{ all -> 0x0379 }
            java.lang.String r7 = "Comment"
            r2.mo122703a(r7, r1)     // Catch:{ all -> 0x0379 }
            r2.f255304e = r1     // Catch:{ all -> 0x0379 }
        L_0x02e8:
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r4)     // Catch:{ all -> 0x039b }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir((java.io.File) r18)     // Catch:{ all -> 0x039b }
            java.lang.String r1 = r14.resArscMd5     // Catch:{ all -> 0x039b }
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkResourceArscMd5(r15, r1)     // Catch:{ all -> 0x039b }
            r2 = 3
            if (r1 != 0) goto L_0x032a
            java.lang.String r1 = "check final new resource file fail path:%s, entry count:%d, size:%d"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x039b }
            java.lang.String r3 = r15.getAbsolutePath()     // Catch:{ all -> 0x039b }
            r4 = 0
            r2[r4] = r3     // Catch:{ all -> 0x039b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x039b }
            r4 = 1
            r2[r4] = r3     // Catch:{ all -> 0x039b }
            long r3 = r15.length()     // Catch:{ all -> 0x039b }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x039b }
            r4 = 2
            r2[r4] = r3     // Catch:{ all -> 0x039b }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r9, r1, r2)     // Catch:{ all -> 0x039b }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r15)     // Catch:{ all -> 0x039b }
            gv3.d r1 = r6.f254232e     // Catch:{ all -> 0x039b }
            r2 = r17
            r3 = 6
            r1.mo109442d(r0, r15, r2, r3)     // Catch:{ all -> 0x039b }
        L_0x0328:
            r0 = 0
            goto L_0x034b
        L_0x032a:
            java.lang.String r0 = "final new resource file:%s, entry count:%d, size:%d"
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x039b }
            java.lang.String r2 = r15.getAbsolutePath()     // Catch:{ all -> 0x039b }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x039b }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x039b }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x039b }
            long r2 = r15.length()     // Catch:{ all -> 0x039b }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x039b }
            r3 = 2
            r1[r3] = r2     // Catch:{ all -> 0x039b }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r9, r0, r1)     // Catch:{ all -> 0x039b }
        L_0x034a:
            r0 = 1
        L_0x034b:
            if (r0 != 0) goto L_0x0358
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "patch recover, extractDiffInternals fail"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r0, r1)
            r0 = 0
            goto L_0x0359
        L_0x0358:
            r0 = 1
        L_0x0359:
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r12
            r27.getClass()
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r5 = 0
            r3[r5] = r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 1
            r3[r2] = r1
            java.lang.String r1 = "recover resource result:%b, cost:%d"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r9, r1, r3)
            return r0
        L_0x0379:
            r0 = move-exception
            r1 = r4
            goto L_0x037d
        L_0x037c:
            r0 = move-exception
        L_0x037d:
            r20 = r3
            r3 = r1
            r1 = r20
            goto L_0x0385
        L_0x0383:
            r0 = move-exception
            r3 = r1
        L_0x0385:
            r20 = r2
            r2 = r1
            r1 = r20
            goto L_0x038e
        L_0x038b:
            r0 = move-exception
            r2 = r1
            r3 = r2
        L_0x038e:
            av3.C79633a.m96712a(r1)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x039b }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x039b }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir((java.io.File) r18)     // Catch:{ all -> 0x039b }
            throw r0     // Catch:{ all -> 0x039b }
        L_0x039b:
            r0 = move-exception
            com.tencent.tinker.loader.TinkerRuntimeException r1 = new com.tencent.tinker.loader.TinkerRuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "patch "
            r2.append(r3)
            r3 = 6
            java.lang.String r3 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r3)
            r2.append(r3)
            java.lang.String r3 = " extract failed ("
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r3 = ")."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r0)
            throw r1
        L_0x03ca:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "patch recover, resource is not contained"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r9, r1, r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fv3.C87100f.m108118d(iv3.a, com.tencent.tinker.loader.shareutil.ShareSecurityCheck, android.content.Context, java.lang.String, java.io.File, boolean, hv3.a):boolean");
    }
}
