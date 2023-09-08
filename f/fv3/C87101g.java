package fv3;

/* renamed from: fv3.g */
public class C87101g extends C87097c {
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02aa  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m108119c(iv3.C87821a r23, com.tencent.tinker.loader.shareutil.ShareSecurityCheck r24, android.content.Context r25, java.lang.String r26, java.io.File r27, boolean r28, hv3.C87598a r29) {
        /*
            r0 = r27
            r1 = r23
            int r1 = r1.f254237j
            boolean r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnabledForNativeLib(r1)
            r2 = 1
            r3 = 0
            java.lang.String r4 = "Tinker.BsDiffPatchInternal"
            if (r1 != 0) goto L_0x0019
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "patch recover, library is not enabled"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r1, r0)
            return r2
        L_0x0019:
            java.util.HashMap r1 = r24.getMetaContentMap()
            java.lang.String r5 = "assets/so_meta.txt"
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "patch recover, library is not contained"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r1, r0)
            return r2
        L_0x0030:
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r26
            r7.append(r8)
            java.lang.String r8 = "/"
            r7.append(r8)
            java.lang.String r9 = "lib"
            r7.append(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo.parseDiffPatchInfo(r1, r9)
            boolean r1 = r9.isEmpty()
            r11 = 5
            if (r1 == 0) goto L_0x006d
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r11)
            r0[r3] = r1
            java.lang.String r1 = "extract patch list is empty! type:%s:"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r1, r0)
            goto L_0x02e9
        L_0x006d:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r12 = r1.exists()
            if (r12 != 0) goto L_0x007b
            r1.mkdirs()
        L_0x007b:
            iv3.a r1 = iv3.C87821a.m109275c(r25)
            android.content.pm.ApplicationInfo r12 = r25.getApplicationInfo()
            if (r12 != 0) goto L_0x008e
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "applicationInfo == null!!!!"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r1, r0)
            goto L_0x02a8
        L_0x008e:
            java.lang.String r12 = r12.sourceDir     // Catch:{ all -> 0x0310 }
            java.util.zip.ZipFile r14 = new java.util.zip.ZipFile     // Catch:{ all -> 0x0310 }
            r14.<init>(r12)     // Catch:{ all -> 0x0310 }
            java.util.zip.ZipFile r12 = new java.util.zip.ZipFile     // Catch:{ all -> 0x030d }
            r12.<init>(r0)     // Catch:{ all -> 0x030d }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x030a }
            r15 = r7
        L_0x009f:
            boolean r16 = r9.hasNext()     // Catch:{ all -> 0x030a }
            if (r16 == 0) goto L_0x02e3
            java.lang.Object r16 = r9.next()     // Catch:{ all -> 0x030a }
            r13 = r16
            com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo r13 = (com.tencent.tinker.loader.shareutil.ShareBsDiffPatchInfo) r13     // Catch:{ all -> 0x030a }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030a }
            java.lang.String r10 = r13.path     // Catch:{ all -> 0x030a }
            java.lang.String r2 = ""
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x030a }
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = r13.name     // Catch:{ all -> 0x030a }
            goto L_0x00d4
        L_0x00be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r2.<init>()     // Catch:{ all -> 0x030a }
            java.lang.String r10 = r13.path     // Catch:{ all -> 0x030a }
            r2.append(r10)     // Catch:{ all -> 0x030a }
            r2.append(r8)     // Catch:{ all -> 0x030a }
            java.lang.String r10 = r13.name     // Catch:{ all -> 0x030a }
            r2.append(r10)     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x030a }
        L_0x00d4:
            java.lang.String r10 = r13.md5     // Catch:{ all -> 0x030a }
            boolean r18 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r10)     // Catch:{ all -> 0x030a }
            java.lang.String r3 = "meta file md5 mismatch, type:%s, name: %s, md5: %s"
            r11 = 3
            if (r18 != 0) goto L_0x0102
            java.lang.Object[] r2 = new java.lang.Object[r11]     // Catch:{ all -> 0x030a }
            r7 = 5
            java.lang.String r8 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r7)     // Catch:{ all -> 0x030a }
            r7 = 0
            r2[r7] = r8     // Catch:{ all -> 0x030a }
            java.lang.String r7 = r13.name     // Catch:{ all -> 0x030a }
            r8 = 1
            r2[r8] = r7     // Catch:{ all -> 0x030a }
            java.lang.String r7 = r13.md5     // Catch:{ all -> 0x030a }
            r8 = 2
            r2[r8] = r7     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r3, r2)     // Catch:{ all -> 0x030a }
            gv3.d r1 = r1.f254232e     // Catch:{ all -> 0x030a }
            r2 = 5
            int r3 = fv3.C87097c.m108111b(r2)     // Catch:{ all -> 0x030a }
            r1.mo109440b(r0, r3)     // Catch:{ all -> 0x030a }
            goto L_0x02a2
        L_0x0102:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r11.<init>()     // Catch:{ all -> 0x030a }
            r19 = r7
            java.lang.String r7 = r13.path     // Catch:{ all -> 0x030a }
            r11.append(r7)     // Catch:{ all -> 0x030a }
            r11.append(r8)     // Catch:{ all -> 0x030a }
            java.lang.String r7 = r13.name     // Catch:{ all -> 0x030a }
            r11.append(r7)     // Catch:{ all -> 0x030a }
            java.lang.String r7 = r11.toString()     // Catch:{ all -> 0x030a }
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x030a }
            r20 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r8.<init>()     // Catch:{ all -> 0x030a }
            r8.append(r15)     // Catch:{ all -> 0x030a }
            r8.append(r7)     // Catch:{ all -> 0x030a }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x030a }
            r11.<init>(r7)     // Catch:{ all -> 0x030a }
            boolean r7 = r11.exists()     // Catch:{ all -> 0x030a }
            if (r7 == 0) goto L_0x0170
            java.lang.String r7 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5((java.io.File) r11)     // Catch:{ all -> 0x030a }
            boolean r7 = r10.equals(r7)     // Catch:{ all -> 0x030a }
            if (r7 == 0) goto L_0x0151
            java.lang.String r2 = "bsdiff file %s is already exist, and md5 match, just continue"
            r3 = 1
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x030a }
            java.lang.String r3 = r11.getPath()     // Catch:{ all -> 0x030a }
            r8 = 0
            r7[r8] = r3     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r2, r7)     // Catch:{ all -> 0x030a }
            goto L_0x02c9
        L_0x0151:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r7.<init>()     // Catch:{ all -> 0x030a }
            java.lang.String r8 = "have a mismatch corrupted dex "
            r7.append(r8)     // Catch:{ all -> 0x030a }
            java.lang.String r8 = r11.getPath()     // Catch:{ all -> 0x030a }
            r7.append(r8)     // Catch:{ all -> 0x030a }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x030a }
            r8 = 0
            java.lang.Object[] r15 = new java.lang.Object[r8]     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r7, r15)     // Catch:{ all -> 0x030a }
            r11.delete()     // Catch:{ all -> 0x030a }
            goto L_0x0177
        L_0x0170:
            java.io.File r7 = r11.getParentFile()     // Catch:{ all -> 0x030a }
            r7.mkdirs()     // Catch:{ all -> 0x030a }
        L_0x0177:
            java.lang.String r7 = r13.patchMd5     // Catch:{ all -> 0x030a }
            java.util.zip.ZipEntry r8 = r12.getEntry(r2)     // Catch:{ all -> 0x030a }
            if (r8 != 0) goto L_0x01a1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r3.<init>()     // Catch:{ all -> 0x030a }
            java.lang.String r7 = "patch entry is null. path:"
            r3.append(r7)     // Catch:{ all -> 0x030a }
            r3.append(r2)     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x030a }
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r2, r7)     // Catch:{ all -> 0x030a }
            gv3.d r1 = r1.f254232e     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r13.name     // Catch:{ all -> 0x030a }
            r3 = 5
            r1.mo109442d(r0, r11, r2, r3)     // Catch:{ all -> 0x030a }
            goto L_0x02a2
        L_0x01a1:
            java.lang.String r15 = "0"
            boolean r15 = r7.equals(r15)     // Catch:{ all -> 0x030a }
            if (r15 == 0) goto L_0x01d5
            r15 = 0
            boolean r2 = fv3.C87097c.m108110a(r12, r8, r11, r10, r15)     // Catch:{ all -> 0x030a }
            if (r2 != 0) goto L_0x02c7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r2.<init>()     // Catch:{ all -> 0x030a }
            java.lang.String r3 = "Failed to extract file "
            r2.append(r3)     // Catch:{ all -> 0x030a }
            java.lang.String r3 = r11.getPath()     // Catch:{ all -> 0x030a }
            r2.append(r3)     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x030a }
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r2, r7)     // Catch:{ all -> 0x030a }
            gv3.d r1 = r1.f254232e     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r13.name     // Catch:{ all -> 0x030a }
            r3 = 5
            r1.mo109442d(r0, r11, r2, r3)     // Catch:{ all -> 0x030a }
            goto L_0x02a2
        L_0x01d5:
            boolean r15 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r7)     // Catch:{ all -> 0x030a }
            if (r15 != 0) goto L_0x01fd
            r15 = 3
            java.lang.Object[] r2 = new java.lang.Object[r15]     // Catch:{ all -> 0x030a }
            r8 = 5
            java.lang.String r9 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r8)     // Catch:{ all -> 0x030a }
            r8 = 0
            r2[r8] = r9     // Catch:{ all -> 0x030a }
            java.lang.String r8 = r13.name     // Catch:{ all -> 0x030a }
            r9 = 1
            r2[r9] = r8     // Catch:{ all -> 0x030a }
            r8 = 2
            r2[r8] = r7     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r3, r2)     // Catch:{ all -> 0x030a }
            gv3.d r1 = r1.f254232e     // Catch:{ all -> 0x030a }
            r2 = 5
            int r3 = fv3.C87097c.m108111b(r2)     // Catch:{ all -> 0x030a }
            r1.mo109440b(r0, r3)     // Catch:{ all -> 0x030a }
            goto L_0x02a2
        L_0x01fd:
            java.util.zip.ZipEntry r3 = r14.getEntry(r2)     // Catch:{ all -> 0x030a }
            if (r3 != 0) goto L_0x0224
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r3.<init>()     // Catch:{ all -> 0x030a }
            java.lang.String r7 = "apk entry is null. path:"
            r3.append(r7)     // Catch:{ all -> 0x030a }
            r3.append(r2)     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x030a }
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r2, r7)     // Catch:{ all -> 0x030a }
            gv3.d r1 = r1.f254232e     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r13.name     // Catch:{ all -> 0x030a }
            r3 = 5
            r1.mo109442d(r0, r11, r2, r3)     // Catch:{ all -> 0x030a }
            goto L_0x02a2
        L_0x0224:
            java.lang.String r7 = r13.rawCrc     // Catch:{ all -> 0x030a }
            long r21 = r3.getCrc()     // Catch:{ all -> 0x030a }
            java.lang.String r15 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x030a }
            boolean r21 = r15.equals(r7)     // Catch:{ all -> 0x030a }
            if (r21 != 0) goto L_0x024e
            java.lang.String r3 = "apk entry %s crc is not equal, expect crc: %s, got crc: %s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x030a }
            r9 = 0
            r8[r9] = r2     // Catch:{ all -> 0x030a }
            r2 = 1
            r8[r2] = r7     // Catch:{ all -> 0x030a }
            r2 = 2
            r8[r2] = r15     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r4, r3, r8)     // Catch:{ all -> 0x030a }
            gv3.d r1 = r1.f254232e     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r13.name     // Catch:{ all -> 0x030a }
            r3 = 5
            r1.mo109442d(r0, r11, r2, r3)     // Catch:{ all -> 0x030a }
            goto L_0x02a2
        L_0x024e:
            java.io.InputStream r2 = r14.getInputStream(r3)     // Catch:{ all -> 0x02d9 }
            java.io.InputStream r3 = r12.getInputStream(r8)     // Catch:{ all -> 0x02d5 }
            iv3.a r7 = iv3.C87821a.m109275c(r25)     // Catch:{ all -> 0x02d2 }
            cv3.a r7 = r7.f254234g     // Catch:{ all -> 0x02d2 }
            if (r7 == 0) goto L_0x0268
            if (r28 != 0) goto L_0x0261
            goto L_0x0268
        L_0x0261:
            iv3.a r7 = iv3.C87821a.m109275c(r25)     // Catch:{ all -> 0x02d2 }
            cv3.a r7 = r7.f254234g     // Catch:{ all -> 0x02d2 }
            goto L_0x026d
        L_0x0268:
            cv3.b r7 = new cv3.b     // Catch:{ all -> 0x02d2 }
            r7.<init>()     // Catch:{ all -> 0x02d2 }
        L_0x026d:
            r7.mo120560a(r2, r3, r11)     // Catch:{ all -> 0x02d2 }
            av3.C79633a.m96712a(r2)     // Catch:{ all -> 0x030a }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x030a }
            boolean r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyFileMd5(r11, r10)     // Catch:{ all -> 0x030a }
            if (r2 != 0) goto L_0x02aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x030a }
            r2.<init>()     // Catch:{ all -> 0x030a }
            java.lang.String r3 = "Failed to recover diff file "
            r2.append(r3)     // Catch:{ all -> 0x030a }
            java.lang.String r3 = r11.getPath()     // Catch:{ all -> 0x030a }
            r2.append(r3)     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x030a }
            r3 = 0
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r2, r7)     // Catch:{ all -> 0x030a }
            gv3.d r1 = r1.f254232e     // Catch:{ all -> 0x030a }
            java.lang.String r2 = r13.name     // Catch:{ all -> 0x030a }
            r3 = 5
            r1.mo109442d(r0, r11, r2, r3)     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r11)     // Catch:{ all -> 0x030a }
        L_0x02a2:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r14)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r12)
        L_0x02a8:
            r7 = 0
            goto L_0x02ea
        L_0x02aa:
            java.lang.String r2 = "success recover bsdiff file: %s, use time: %d"
            r3 = 2
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x030a }
            java.lang.String r3 = r11.getPath()     // Catch:{ all -> 0x030a }
            r8 = 0
            r7[r8] = r3     // Catch:{ all -> 0x030a }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x030a }
            long r10 = r10 - r16
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x030a }
            r8 = 1
            r7[r8] = r3     // Catch:{ all -> 0x030a }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r4, r2, r7)     // Catch:{ all -> 0x030a }
        L_0x02c7:
            r15 = r19
        L_0x02c9:
            r7 = r19
            r8 = r20
            r2 = 1
            r3 = 0
            r11 = 5
            goto L_0x009f
        L_0x02d2:
            r0 = move-exception
            r13 = r2
            goto L_0x02dc
        L_0x02d5:
            r0 = move-exception
            r13 = r2
            r3 = 0
            goto L_0x02dc
        L_0x02d9:
            r0 = move-exception
            r3 = 0
            r13 = 0
        L_0x02dc:
            av3.C79633a.m96712a(r13)     // Catch:{ all -> 0x030a }
            av3.C79633a.m96712a(r3)     // Catch:{ all -> 0x030a }
            throw r0     // Catch:{ all -> 0x030a }
        L_0x02e3:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r14)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r12)
        L_0x02e9:
            r7 = 1
        L_0x02ea:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r5
            r29.getClass()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r5 = 0
            r2[r5] = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 1
            r2[r1] = r0
            java.lang.String r0 = "recover lib result:%b, cost:%d"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r4, r0, r2)
            return r7
        L_0x030a:
            r0 = move-exception
            r13 = r12
            goto L_0x0313
        L_0x030d:
            r0 = move-exception
            r13 = 0
            goto L_0x0313
        L_0x0310:
            r0 = move-exception
            r13 = 0
            r14 = 0
        L_0x0313:
            com.tencent.tinker.loader.TinkerRuntimeException r1 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch:{ all -> 0x0341 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0341 }
            r2.<init>()     // Catch:{ all -> 0x0341 }
            java.lang.String r3 = "patch "
            r2.append(r3)     // Catch:{ all -> 0x0341 }
            r3 = 5
            java.lang.String r3 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r3)     // Catch:{ all -> 0x0341 }
            r2.append(r3)     // Catch:{ all -> 0x0341 }
            java.lang.String r3 = " extract failed ("
            r2.append(r3)     // Catch:{ all -> 0x0341 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x0341 }
            r2.append(r3)     // Catch:{ all -> 0x0341 }
            java.lang.String r3 = ")."
            r2.append(r3)     // Catch:{ all -> 0x0341 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0341 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0341 }
            throw r1     // Catch:{ all -> 0x0341 }
        L_0x0341:
            r0 = move-exception
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r14)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fv3.C87101g.m108119c(iv3.a, com.tencent.tinker.loader.shareutil.ShareSecurityCheck, android.content.Context, java.lang.String, java.io.File, boolean, hv3.a):boolean");
    }
}
