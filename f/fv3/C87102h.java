package fv3;

/* renamed from: fv3.h */
public class C87102h extends C87095a {
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r2v100 */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w("Tinker.DexDiffPatchInternal", "meta file md5 invalid, type:%s, name: %s, md5: %s", com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(3), r7.rawName, r2);
        r1.f254232e.mo109440b(r15, fv3.C87097c.m108111b(3));
        r41 = r4;
        r0 = r6;
        r39 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w("Tinker.DexDiffPatchInternal", "patch entry is null. path:" + r0, new java.lang.Object[0]);
        r1.f254232e.mo109442d(r15, r3, r7.rawName, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x047f, code lost:
        r41 = r4;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r2v14, types: [boolean, int] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0646  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0798  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo121561a(android.content.Context r43, java.lang.String r44, hv3.C87598a r45) {
        /*
            r42 = this;
            r0 = r43
            r8 = r45
            iv3.a r9 = iv3.C87821a.m109275c(r43)
            java.io.File r10 = new java.io.File
            r1 = r44
            r10.<init>(r1)
            int r1 = r9.f254237j
            boolean r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnabled(r1)
            r11 = 0
            if (r1 == 0) goto L_0x0887
            boolean r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnableWithSharedPreferences(r43)
            if (r1 != 0) goto L_0x0020
            goto L_0x0887
        L_0x0020:
            boolean r1 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.isLegalFile(r10)
            if (r1 != 0) goto L_0x0030
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:patch file is not found, just return"
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r2)
            return r11
        L_0x0030:
            com.tencent.tinker.loader.shareutil.ShareSecurityCheck r12 = new com.tencent.tinker.loader.shareutil.ShareSecurityCheck
            r12.<init>(r0)
            int r1 = r9.f254237j
            int r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.checkTinkerPackage(r0, r1, r10, r12)
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r2 = "UpgradePatch tryPatch:onPatchPackageCheckFail"
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r2, r3)
            gv3.d r0 = r9.f254232e
            r0.mo109440b(r10, r1)
            return r11
        L_0x004c:
            java.lang.String r7 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5((java.io.File) r10)
            if (r7 != 0) goto L_0x005c
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:patch md5 is null, just return"
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r2)
            return r11
        L_0x005c:
            r8.f253689j = r7
            java.lang.String r1 = "Tinker.UpgradePatch"
            java.lang.String r2 = "UpgradePatch tryPatch:patchMd5:%s"
            r6 = 1
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r11] = r7
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r1, r2, r3)
            java.io.File r1 = r9.f254229b
            java.lang.String r1 = r1.getAbsolutePath()
            java.io.File r5 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoLockFile(r1)
            java.io.File r4 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoFile(r1)
            java.util.HashMap r2 = r12.getPackagePropertiesIfPresent()
            if (r2 != 0) goto L_0x0088
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch packageProperties is null, do we process a valid patch apk ?"
            java.lang.Object[] r2 = new java.lang.Object[r11]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r2)
            return r11
        L_0x0088:
            java.lang.String r3 = "is_protected_app"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x00a3
            boolean r13 = r3.isEmpty()
            if (r13 != 0) goto L_0x00a3
            java.lang.String r13 = "0"
            boolean r3 = r13.equals(r3)
            if (r3 != 0) goto L_0x00a3
            r16 = 1
            goto L_0x00a5
        L_0x00a3:
            r16 = 0
        L_0x00a5:
            java.lang.String r3 = "use_custom_file_patch"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00c1
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00c1
            java.lang.String r3 = "0"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x00c1
            r22 = 1
            goto L_0x00c3
        L_0x00c1:
            r22 = 0
        L_0x00c3:
            com.tencent.tinker.loader.shareutil.SharePatchInfo r2 = com.tencent.tinker.loader.shareutil.SharePatchInfo.readAndCheckPropertyWithLock(r4, r5)
            if (r2 == 0) goto L_0x0181
            java.lang.String r3 = r2.oldVersion
            if (r3 == 0) goto L_0x016e
            java.lang.String r3 = r2.newVersion
            if (r3 == 0) goto L_0x016e
            java.lang.String r3 = r2.oatDir
            if (r3 != 0) goto L_0x00d7
            goto L_0x016e
        L_0x00d7:
            boolean r3 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r7)
            if (r3 != 0) goto L_0x00ee
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:onPatchVersionCheckFail md5 %s is valid"
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r11] = r7
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r3)
            gv3.d r0 = r9.f254232e
            r0.mo109439a(r10, r2, r7)
            return r11
        L_0x00ee:
            java.lang.String r3 = r2.oatDir
            java.lang.String r13 = "interpet"
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x0126
            java.lang.String r13 = r2.newVersion
            boolean r13 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNullOrNil(r13)
            if (r13 != 0) goto L_0x0126
            java.lang.String r13 = r2.newVersion
            boolean r13 = r13.equals(r7)
            if (r13 == 0) goto L_0x0126
            java.lang.String r13 = r2.newVersion
            java.lang.String r14 = r2.versionToRemove
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0126
            java.lang.String r1 = "Tinker.UpgradePatch"
            java.lang.String r2 = "patch already applied, md5: %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r11] = r7
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r1, r2, r3)
            jv3.b r0 = jv3.C88034b.m109603b(r43)
            r0.mo122483d(r7)
            return r6
        L_0x0126:
            if (r3 == 0) goto L_0x012b
            java.lang.String r3 = "changing"
            goto L_0x012d
        L_0x012b:
            java.lang.String r3 = r2.oatDir
        L_0x012d:
            r20 = r3
            java.lang.String r3 = r2.newVersion
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L_0x014f
            java.lang.String r3 = r2.newVersion
            java.lang.String r13 = r2.oldVersion
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x014f
            java.lang.String r3 = r2.newVersion
            java.lang.String r3 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(r3)
            java.io.File r13 = new java.io.File
            r13.<init>(r1, r3)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir((java.io.File) r13)
        L_0x014f:
            java.lang.String r3 = r2.versionToRemove
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x015a
            java.lang.String r3 = ""
            goto L_0x015c
        L_0x015a:
            java.lang.String r3 = r2.versionToRemove
        L_0x015c:
            r18 = r3
            com.tencent.tinker.loader.shareutil.SharePatchInfo r3 = new com.tencent.tinker.loader.shareutil.SharePatchInfo
            java.lang.String r14 = r2.oldVersion
            java.lang.String r19 = android.os.Build.FINGERPRINT
            r21 = 0
            r13 = r3
            r15 = r7
            r17 = r22
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x0194
        L_0x016e:
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:onPatchInfoCorrupted"
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r3)
            gv3.d r0 = r9.f254232e
            java.lang.String r1 = r2.oldVersion
            java.lang.String r2 = r2.newVersion
            r0.mo109444f(r10, r1, r2)
            return r11
        L_0x0181:
            com.tencent.tinker.loader.shareutil.SharePatchInfo r3 = new com.tencent.tinker.loader.shareutil.SharePatchInfo
            java.lang.String r14 = ""
            java.lang.String r18 = ""
            java.lang.String r19 = android.os.Build.FINGERPRINT
            java.lang.String r20 = "odex"
            r21 = 0
            r13 = r3
            r15 = r7
            r17 = r22
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
        L_0x0194:
            java.lang.String r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(r7)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r14 = r3.toString()
            java.lang.String r1 = "Tinker.UpgradePatch"
            java.lang.String r2 = "UpgradePatch tryPatch:patchVersionDirectory:%s"
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r3[r11] = r14
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r1, r2, r3)
            java.io.File r15 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r14)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionFile(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r15.<init>(r1)
            java.lang.String r2 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getMD5((java.io.File) r15)     // Catch:{ IOException -> 0x0864 }
            boolean r2 = r7.equals(r2)     // Catch:{ IOException -> 0x0864 }
            if (r2 != 0) goto L_0x020f
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.copyFileUsingStream(r10, r15)     // Catch:{ IOException -> 0x0864 }
            java.lang.String r2 = "Tinker.UpgradePatch"
            java.lang.String r3 = "UpgradePatch copy patch file, src file: %s size: %d, dest file: %s size:%d"
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0864 }
            java.lang.String r17 = r10.getAbsolutePath()     // Catch:{ IOException -> 0x0864 }
            r1[r11] = r17     // Catch:{ IOException -> 0x0864 }
            long r17 = r10.length()     // Catch:{ IOException -> 0x0864 }
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ IOException -> 0x0864 }
            r1[r6] = r17     // Catch:{ IOException -> 0x0864 }
            java.lang.String r17 = r15.getAbsolutePath()     // Catch:{ IOException -> 0x0864 }
            r16 = 2
            r1[r16] = r17     // Catch:{ IOException -> 0x0864 }
            long r17 = r15.length()     // Catch:{ IOException -> 0x0864 }
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ IOException -> 0x0864 }
            r18 = 3
            r1[r18] = r17     // Catch:{ IOException -> 0x0864 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r2, r3, r1)     // Catch:{ IOException -> 0x0864 }
        L_0x020f:
            java.util.ArrayList<java.io.File> r1 = fv3.C87099e.f252700a
            int r1 = r9.f254237j
            boolean r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isTinkerEnabledForDex(r1)
            if (r1 != 0) goto L_0x0224
            java.lang.String r1 = "Tinker.DexDiffPatchInternal"
            java.lang.String r2 = "patch recover, dex is not enabled"
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r2, r3)
            goto L_0x023c
        L_0x0224:
            java.util.HashMap r1 = r12.getMetaContentMap()
            java.lang.String r2 = "assets/dex_meta.txt"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0250
            java.lang.String r1 = "Tinker.DexDiffPatchInternal"
            java.lang.String r2 = "patch recover, dex is not contained"
            java.lang.Object[] r3 = new java.lang.Object[r11]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r2, r3)
        L_0x023c:
            r19 = r4
            r21 = r5
            r29 = r7
            r35 = r9
            r34 = r10
            r36 = r12
            r30 = r13
            r1 = 1
            r2 = 0
            r12 = r8
            r8 = r14
            goto L_0x078c
        L_0x0250:
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            java.lang.String r6 = "/"
            r11.append(r6)
            java.lang.String r6 = "dex"
            r11.append(r6)
            java.lang.String r6 = "/"
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> r11 = fv3.C87099e.f252701b
            r11.clear()
            java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> r11 = fv3.C87099e.f252701b
            com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo.parseDexDiffPatchInfo(r1, r11)
            java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> r1 = fv3.C87099e.f252701b
            boolean r1 = r1.isEmpty()
            java.lang.String r11 = "Tinker.DexDiffPatchInternal"
            if (r1 == 0) goto L_0x029e
            r19 = r4
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r1 = 3
            java.lang.String r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r1)
            r17 = 0
            r4[r17] = r1
            java.lang.String r1 = "extract patch list is empty! type:%s:"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r1, r4)
            r21 = r5
            r29 = r7
            r30 = r13
            goto L_0x0309
        L_0x029e:
            r19 = r4
            java.io.File r1 = new java.io.File
            r1.<init>(r6)
            boolean r4 = r1.exists()
            if (r4 != 0) goto L_0x02ae
            r1.mkdirs()
        L_0x02ae:
            iv3.a r1 = iv3.C87821a.m109275c(r43)
            android.content.pm.ApplicationInfo r4 = r43.getApplicationInfo()     // Catch:{ all -> 0x082b }
            if (r4 != 0) goto L_0x02db
            java.lang.String r1 = "applicationInfo == null!!!!"
            r21 = r5
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x082b }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r1, r5)     // Catch:{ all -> 0x082b }
            r5 = 0
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r5)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r5)
            r37 = r2
            r29 = r7
            r35 = r9
            r34 = r10
            r36 = r12
            r30 = r13
            r39 = r14
            r13 = r0
            r0 = r6
            goto L_0x063b
        L_0x02db:
            r21 = r5
            r5 = 0
            java.lang.String r4 = r4.sourceDir     // Catch:{ all -> 0x082b }
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch:{ all -> 0x082b }
            r5.<init>(r4)     // Catch:{ all -> 0x082b }
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch:{ all -> 0x0829 }
            r4.<init>(r15)     // Catch:{ all -> 0x0829 }
            boolean r20 = fv3.C87099e.m108112c(r6)     // Catch:{ all -> 0x0823 }
            if (r20 == 0) goto L_0x0317
            java.lang.String r1 = "class n dex file %s is already exist, and md5 match, just continue"
            r29 = r7
            r30 = r13
            r7 = 1
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x0823 }
            java.lang.String r7 = "tinker_classN.apk"
            r17 = 0
            r13[r17] = r7     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r1, r13)     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r5)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r4)
        L_0x0309:
            r13 = r0
            r37 = r2
            r0 = r6
            r35 = r9
            r34 = r10
            r36 = r12
            r39 = r14
            goto L_0x0643
        L_0x0317:
            r29 = r7
            r30 = r13
            java.util.ArrayList<com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo> r7 = fv3.C87099e.f252701b     // Catch:{ all -> 0x0823 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0823 }
            r13 = r0
        L_0x0322:
            boolean r20 = r7.hasNext()     // Catch:{ all -> 0x0823 }
            if (r20 == 0) goto L_0x0622
            java.lang.Object r20 = r7.next()     // Catch:{ all -> 0x0823 }
            r31 = r7
            r7 = r20
            com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo r7 = (com.tencent.tinker.loader.shareutil.ShareDexDiffPatchInfo) r7     // Catch:{ all -> 0x0823 }
            long r32 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0823 }
            r34 = r10
            java.lang.String r10 = r7.path     // Catch:{ all -> 0x0823 }
            java.lang.String r0 = ""
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0823 }
            if (r0 == 0) goto L_0x0345
            java.lang.String r0 = r7.rawName     // Catch:{ all -> 0x0823 }
            goto L_0x035d
        L_0x0345:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0823 }
            r0.<init>()     // Catch:{ all -> 0x0823 }
            java.lang.String r10 = r7.path     // Catch:{ all -> 0x0823 }
            r0.append(r10)     // Catch:{ all -> 0x0823 }
            java.lang.String r10 = "/"
            r0.append(r10)     // Catch:{ all -> 0x0823 }
            java.lang.String r10 = r7.rawName     // Catch:{ all -> 0x0823 }
            r0.append(r10)     // Catch:{ all -> 0x0823 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0823 }
        L_0x035d:
            java.lang.String r10 = r7.dexDiffMd5     // Catch:{ all -> 0x0823 }
            r35 = r9
            java.lang.String r9 = r7.oldDexCrC     // Catch:{ all -> 0x0823 }
            boolean r20 = fv3.C87099e.f252703d     // Catch:{ all -> 0x0823 }
            r36 = r12
            java.lang.String r12 = "0"
            if (r20 != 0) goto L_0x0389
            r37 = r2
            java.lang.String r2 = r7.destMd5InDvm     // Catch:{ all -> 0x0823 }
            boolean r2 = r2.equals(r12)     // Catch:{ all -> 0x0823 }
            if (r2 == 0) goto L_0x038b
            java.lang.String r2 = "patch dex %s is only for art, just continue"
            r3 = 1
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x0823 }
            r3 = 0
            r7[r3] = r0     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r2, r7)     // Catch:{ all -> 0x0823 }
            r41 = r4
            r40 = r6
            r39 = r14
            goto L_0x060c
        L_0x0389:
            r37 = r2
        L_0x038b:
            boolean r2 = fv3.C87099e.f252703d     // Catch:{ all -> 0x0823 }
            if (r2 == 0) goto L_0x0392
            java.lang.String r2 = r7.destMd5InArt     // Catch:{ all -> 0x0823 }
            goto L_0x0394
        L_0x0392:
            java.lang.String r2 = r7.destMd5InDvm     // Catch:{ all -> 0x0823 }
        L_0x0394:
            boolean r3 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r2)     // Catch:{ all -> 0x0823 }
            java.lang.String r8 = "meta file md5 invalid, type:%s, name: %s, md5: %s"
            if (r3 != 0) goto L_0x03c2
            r3 = 3
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x0823 }
            java.lang.String r9 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r3)     // Catch:{ all -> 0x0823 }
            r3 = 0
            r0[r3] = r9     // Catch:{ all -> 0x0823 }
            java.lang.String r3 = r7.rawName     // Catch:{ all -> 0x0823 }
            r7 = 1
            r0[r7] = r3     // Catch:{ all -> 0x0823 }
            r3 = 2
            r0[r3] = r2     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r8, r0)     // Catch:{ all -> 0x0823 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0823 }
            r1 = 3
            int r2 = fv3.C87097c.m108111b(r1)     // Catch:{ all -> 0x0823 }
            r0.mo109440b(r15, r2)     // Catch:{ all -> 0x0823 }
            r41 = r4
            r0 = r6
            r39 = r14
            goto L_0x0635
        L_0x03c2:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0823 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0823 }
            r13.<init>()     // Catch:{ all -> 0x0823 }
            r13.append(r6)     // Catch:{ all -> 0x0823 }
            r39 = r14
            java.lang.String r14 = r7.realName     // Catch:{ all -> 0x0823 }
            r13.append(r14)     // Catch:{ all -> 0x0823 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0823 }
            r3.<init>(r13)     // Catch:{ all -> 0x0823 }
            boolean r13 = r3.exists()     // Catch:{ all -> 0x0823 }
            if (r13 == 0) goto L_0x041a
            boolean r13 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyDexFileMd5(r3, r2)     // Catch:{ all -> 0x0823 }
            if (r13 == 0) goto L_0x03f9
            java.lang.String r0 = "dex file %s is already exist, and md5 match, just continue"
            r2 = 1
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x0823 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0823 }
            r3 = 0
            r7[r3] = r2     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r7)     // Catch:{ all -> 0x0823 }
            r40 = r6
            goto L_0x0483
        L_0x03f9:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0823 }
            r13.<init>()     // Catch:{ all -> 0x0823 }
            java.lang.String r14 = "have a mismatch corrupted dex "
            r13.append(r14)     // Catch:{ all -> 0x0823 }
            java.lang.String r14 = r3.getPath()     // Catch:{ all -> 0x0823 }
            r13.append(r14)     // Catch:{ all -> 0x0823 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0823 }
            r40 = r6
            r14 = 0
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r13, r6)     // Catch:{ all -> 0x0823 }
            r3.delete()     // Catch:{ all -> 0x0823 }
            goto L_0x0423
        L_0x041a:
            r40 = r6
            java.io.File r6 = r3.getParentFile()     // Catch:{ all -> 0x0823 }
            r6.mkdirs()     // Catch:{ all -> 0x0823 }
        L_0x0423:
            java.util.zip.ZipEntry r6 = r4.getEntry(r0)     // Catch:{ all -> 0x0823 }
            java.util.zip.ZipEntry r13 = r5.getEntry(r0)     // Catch:{ all -> 0x0823 }
            boolean r14 = r9.equals(r12)     // Catch:{ all -> 0x0823 }
            r20 = r8
            java.lang.String r8 = "patch entry is null. path:"
            if (r14 == 0) goto L_0x0487
            if (r6 != 0) goto L_0x0456
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0823 }
            r2.<init>()     // Catch:{ all -> 0x0823 }
            r2.append(r8)     // Catch:{ all -> 0x0823 }
            r2.append(r0)     // Catch:{ all -> 0x0823 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0823 }
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r6)     // Catch:{ all -> 0x0823 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0823 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0823 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0823 }
            goto L_0x047f
        L_0x0456:
            boolean r0 = fv3.C87099e.m108113d(r4, r6, r3, r7)     // Catch:{ all -> 0x0823 }
            if (r0 != 0) goto L_0x0483
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0823 }
            r0.<init>()     // Catch:{ all -> 0x0823 }
            java.lang.String r2 = "Failed to extract raw patch file "
            r0.append(r2)     // Catch:{ all -> 0x0823 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0823 }
            r0.append(r2)     // Catch:{ all -> 0x0823 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0823 }
            r2 = 0
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x0823 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r6)     // Catch:{ all -> 0x0823 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0823 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0823 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0823 }
        L_0x047f:
            r41 = r4
            goto L_0x05dd
        L_0x0483:
            r41 = r4
            goto L_0x060a
        L_0x0487:
            boolean r12 = r10.equals(r12)     // Catch:{ all -> 0x0823 }
            java.lang.String r14 = "Failed to recover dex file when verify patched dex: "
            r41 = r4
            java.lang.String r4 = "apk entry %s crc is not equal, expect crc: %s, got crc: %s"
            r23 = r10
            java.lang.String r10 = "apk entry is null. path:"
            if (r12 == 0) goto L_0x0514
            boolean r6 = fv3.C87099e.f252703d     // Catch:{ all -> 0x0821 }
            if (r6 != 0) goto L_0x049d
            goto L_0x060a
        L_0x049d:
            if (r13 != 0) goto L_0x04be
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0821 }
            r2.<init>()     // Catch:{ all -> 0x0821 }
            r2.append(r10)     // Catch:{ all -> 0x0821 }
            r2.append(r0)     // Catch:{ all -> 0x0821 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0821 }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r4)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0821 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0821 }
            goto L_0x05dd
        L_0x04be:
            long r23 = r13.getCrc()     // Catch:{ all -> 0x0821 }
            java.lang.String r6 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x0821 }
            boolean r8 = r6.equals(r9)     // Catch:{ all -> 0x0821 }
            if (r8 != 0) goto L_0x04e5
            r8 = 3
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x0821 }
            r8 = 0
            r2[r8] = r0     // Catch:{ all -> 0x0821 }
            r0 = 1
            r2[r0] = r9     // Catch:{ all -> 0x0821 }
            r0 = 2
            r2[r0] = r6     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r11, r4, r2)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0821 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0821 }
            goto L_0x05dd
        L_0x04e5:
            fv3.C87099e.m108113d(r5, r13, r3, r7)     // Catch:{ all -> 0x0821 }
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyDexFileMd5(r3, r2)     // Catch:{ all -> 0x0821 }
            if (r0 != 0) goto L_0x060a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0821 }
            r0.<init>()     // Catch:{ all -> 0x0821 }
            r0.append(r14)     // Catch:{ all -> 0x0821 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0821 }
            r0.append(r2)     // Catch:{ all -> 0x0821 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0821 }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r4)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0821 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r3)     // Catch:{ all -> 0x0821 }
            goto L_0x05dd
        L_0x0514:
            if (r6 != 0) goto L_0x0535
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0821 }
            r2.<init>()     // Catch:{ all -> 0x0821 }
            r2.append(r8)     // Catch:{ all -> 0x0821 }
            r2.append(r0)     // Catch:{ all -> 0x0821 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0821 }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r4)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0821 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0821 }
            goto L_0x05dd
        L_0x0535:
            boolean r8 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r23)     // Catch:{ all -> 0x0821 }
            if (r8 != 0) goto L_0x055e
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x0821 }
            java.lang.String r2 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r8)     // Catch:{ all -> 0x0821 }
            r3 = 0
            r0[r3] = r2     // Catch:{ all -> 0x0821 }
            java.lang.String r2 = r7.rawName     // Catch:{ all -> 0x0821 }
            r3 = 1
            r0[r3] = r2     // Catch:{ all -> 0x0821 }
            r2 = 2
            r0[r2] = r23     // Catch:{ all -> 0x0821 }
            r2 = r20
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r2, r0)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            r1 = 3
            int r2 = fv3.C87097c.m108111b(r1)     // Catch:{ all -> 0x0821 }
            r0.mo109440b(r15, r2)     // Catch:{ all -> 0x0821 }
            goto L_0x05dd
        L_0x055e:
            if (r13 != 0) goto L_0x057e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0821 }
            r2.<init>()     // Catch:{ all -> 0x0821 }
            r2.append(r10)     // Catch:{ all -> 0x0821 }
            r2.append(r0)     // Catch:{ all -> 0x0821 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0821 }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r4)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0821 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0821 }
            goto L_0x05dd
        L_0x057e:
            long r23 = r13.getCrc()     // Catch:{ all -> 0x0821 }
            java.lang.String r8 = java.lang.String.valueOf(r23)     // Catch:{ all -> 0x0821 }
            boolean r10 = r8.equals(r9)     // Catch:{ all -> 0x0821 }
            if (r10 != 0) goto L_0x05a4
            r10 = 3
            java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ all -> 0x0821 }
            r6 = 0
            r2[r6] = r0     // Catch:{ all -> 0x0821 }
            r0 = 1
            r2[r0] = r9     // Catch:{ all -> 0x0821 }
            r0 = 2
            r2[r0] = r8     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r11, r4, r2)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0821 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0821 }
            goto L_0x05dd
        L_0x05a4:
            r23 = r5
            r24 = r41
            r25 = r13
            r26 = r6
            r27 = r7
            r28 = r3
            fv3.C87099e.m108115f(r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0821 }
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.verifyDexFileMd5(r3, r2)     // Catch:{ all -> 0x0821 }
            if (r0 != 0) goto L_0x05e2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0821 }
            r0.<init>()     // Catch:{ all -> 0x0821 }
            r0.append(r14)     // Catch:{ all -> 0x0821 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0821 }
            r0.append(r2)     // Catch:{ all -> 0x0821 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0821 }
            r2 = 0
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r4)     // Catch:{ all -> 0x0821 }
            gv3.d r0 = r1.f254232e     // Catch:{ all -> 0x0821 }
            java.lang.String r1 = r7.rawName     // Catch:{ all -> 0x0821 }
            r2 = 3
            r0.mo109442d(r15, r3, r1, r2)     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.safeDeleteFile(r3)     // Catch:{ all -> 0x0821 }
        L_0x05dd:
            r13 = r43
            r0 = r40
            goto L_0x0635
        L_0x05e2:
            java.lang.String r0 = "success recover dex file: %s, size: %d, use time: %d"
            r2 = 3
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0821 }
            java.lang.String r2 = r3.getPath()     // Catch:{ all -> 0x0821 }
            r6 = 0
            r4[r6] = r2     // Catch:{ all -> 0x0821 }
            long r2 = r3.length()     // Catch:{ all -> 0x0821 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0821 }
            r3 = 1
            r4[r3] = r2     // Catch:{ all -> 0x0821 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0821 }
            long r2 = r2 - r32
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0821 }
            r3 = 2
            r4[r3] = r2     // Catch:{ all -> 0x0821 }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r11, r0, r4)     // Catch:{ all -> 0x0821 }
        L_0x060a:
            r13 = r43
        L_0x060c:
            r0 = r43
            r8 = r45
            r7 = r31
            r10 = r34
            r9 = r35
            r12 = r36
            r2 = r37
            r14 = r39
            r6 = r40
            r4 = r41
            goto L_0x0322
        L_0x0622:
            r37 = r2
            r41 = r4
            r0 = r6
            r35 = r9
            r34 = r10
            r36 = r12
            r39 = r14
            boolean r1 = fv3.C87099e.m108114e(r13, r15, r0)     // Catch:{ all -> 0x0821 }
            if (r1 != 0) goto L_0x063d
        L_0x0635:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r5)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r41)
        L_0x063b:
            r1 = 0
            goto L_0x0644
        L_0x063d:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r5)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r41)
        L_0x0643:
            r1 = 1
        L_0x0644:
            if (r1 != 0) goto L_0x0655
            java.lang.String r0 = "Tinker.DexDiffPatchInternal"
            java.lang.String r1 = "patch recover, extractDiffInternals fail"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r0, r1, r3)
            r8 = r39
            goto L_0x06ee
        L_0x0655:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File[] r0 = r1.listFiles()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L_0x0693
            int r2 = r0.length
            r3 = 0
        L_0x0667:
            if (r3 >= r2) goto L_0x0693
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L_0x0690
            java.lang.String r6 = ".dex"
            boolean r6 = r5.endsWith(r6)
            if (r6 != 0) goto L_0x068d
            java.lang.String r6 = ".jar"
            boolean r6 = r5.endsWith(r6)
            if (r6 != 0) goto L_0x068d
            java.lang.String r6 = ".apk"
            boolean r5 = r5.endsWith(r6)
            if (r5 == 0) goto L_0x0690
        L_0x068d:
            r1.add(r4)
        L_0x0690:
            int r3 = r3 + 1
            goto L_0x0667
        L_0x0693:
            java.lang.String r0 = "Tinker.DexDiffPatchInternal"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "legal files to do dexopt: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r0, r2, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r8 = r39
            r0.append(r8)
            java.lang.String r2 = "/"
            r0.append(r2)
            java.lang.String r2 = "odex"
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            iv3.a r2 = iv3.C87821a.m109275c(r43)
            java.util.ArrayList<java.io.File> r3 = fv3.C87099e.f252700a
            r3.clear()
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x06f2
            boolean r4 = r3.mkdirs()
            if (r4 != 0) goto L_0x06f2
            java.lang.String r0 = "Tinker.DexDiffPatchInternal"
            java.lang.String r1 = "patch recover, make optimizeDexDirectoryFile fail"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r0, r1, r3)
        L_0x06ee:
            r12 = r45
            r2 = 0
            goto L_0x0766
        L_0x06f2:
            java.util.Iterator r4 = r1.iterator()
        L_0x06f6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0711
            java.lang.Object r5 = r4.next()
            java.io.File r5 = (java.io.File) r5
            java.lang.String r5 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.optimizedPathFor(r5, r3)
            java.util.ArrayList<java.io.File> r6 = fv3.C87099e.f252700a
            java.io.File r7 = new java.io.File
            r7.<init>(r5)
            r6.add(r7)
            goto L_0x06f6
        L_0x0711:
            java.lang.String r4 = "Tinker.DexDiffPatchInternal"
            java.lang.String r5 = "patch recover, try to optimize dex file count:%d, optimizeDexDirectory:%s"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r6 = r1.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 0
            r7[r9] = r6
            r6 = 1
            r7[r6] = r0
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r4, r5, r7)
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            java.lang.Throwable[] r4 = new java.lang.Throwable[r6]
            long r10 = java.lang.System.currentTimeMillis()
            r12 = r45
            r12.f253686g = r10
            com.tencent.tinker.loader.app.TinkerApplication r5 = com.tencent.tinker.loader.app.TinkerApplication.getInstance()
            boolean r5 = r5.isUseDelegateLastClassLoader()
            boolean[] r7 = new boolean[r6]
            r7[r9] = r9
            fv3.d r6 = new fv3.d
            r6.<init>(r7, r0, r4)
            com.tencent.tinker.loader.TinkerDexOptimizer.optimizeAll(r13, r1, r3, r5, r6)
            monitor-enter(r7)
            boolean r1 = r7[r9]     // Catch:{ all -> 0x081e }
            if (r1 != 0) goto L_0x0754
            r1 = 1
            goto L_0x0755
        L_0x0754:
            r1 = 0
        L_0x0755:
            r12.f253687h = r1     // Catch:{ all -> 0x081e }
            monitor-exit(r7)     // Catch:{ all -> 0x081e }
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0769
            gv3.d r1 = r2.f254232e
            r2 = 0
            r3 = r4[r2]
            r1.mo109443e(r15, r0, r3)
        L_0x0766:
            r17 = 0
            goto L_0x076c
        L_0x0769:
            r2 = 0
            r17 = 1
        L_0x076c:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r37
            java.lang.String r3 = "Tinker.DexDiffPatchInternal"
            java.lang.String r4 = "recover dex result:%b, cost:%d"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r17)
            r5[r2] = r6
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6 = 1
            r5[r6] = r0
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r3, r4, r5)
            r1 = r17
        L_0x078c:
            if (r1 != 0) goto L_0x0798
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:new patch recover, try patch dex failed"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r3)
            return r2
        L_0x0798:
            r0 = r43
            r9 = r35
            r10 = r36
            fv3.C87096b.m108109c(r9, r10, r0, r8, r15)
            r1 = r9
            r2 = r10
            r3 = r43
            r11 = r19
            r4 = r8
            r13 = r21
            r5 = r15
            r14 = 1
            r6 = r22
            r14 = r29
            r7 = r45
            boolean r1 = fv3.C87101g.m108119c(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x07c3
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:new patch recover, try patch library failed"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r3)
            return r2
        L_0x07c3:
            r1 = r9
            r2 = r10
            r3 = r43
            r4 = r8
            r5 = r15
            r6 = r22
            r7 = r45
            boolean r1 = fv3.C87100f.m108118d(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L_0x07de
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:new patch recover, try patch resource failed"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r3)
            return r2
        L_0x07de:
            r1 = r34
            r2 = 0
            boolean r3 = fv3.C87099e.m108116g(r1, r9)
            if (r3 != 0) goto L_0x07f1
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:new patch recover, check dex opt file failed"
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r3)
            return r2
        L_0x07f1:
            r3 = r30
            boolean r4 = com.tencent.tinker.loader.shareutil.SharePatchInfo.rewritePatchInfoFileWithLock(r11, r3, r13)
            if (r4 != 0) goto L_0x080c
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r4 = "UpgradePatch tryPatch:new patch recover, rewrite patch info failed"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r4, r5)
            gv3.d r0 = r9.f254232e
            java.lang.String r4 = r3.oldVersion
            java.lang.String r3 = r3.newVersion
            r0.mo109444f(r1, r4, r3)
            return r2
        L_0x080c:
            jv3.b r0 = jv3.C88034b.m109603b(r43)
            r0.mo122483d(r14)
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch: done, it is ok"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r0, r1, r2)
            r0 = 1
            return r0
        L_0x081e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x081e }
            throw r0
        L_0x0821:
            r0 = move-exception
            goto L_0x0826
        L_0x0823:
            r0 = move-exception
            r41 = r4
        L_0x0826:
            r4 = r41
            goto L_0x082e
        L_0x0829:
            r0 = move-exception
            goto L_0x082d
        L_0x082b:
            r0 = move-exception
            r5 = 0
        L_0x082d:
            r4 = 0
        L_0x082e:
            com.tencent.tinker.loader.TinkerRuntimeException r1 = new com.tencent.tinker.loader.TinkerRuntimeException     // Catch:{ all -> 0x085c }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x085c }
            r2.<init>()     // Catch:{ all -> 0x085c }
            java.lang.String r3 = "patch "
            r2.append(r3)     // Catch:{ all -> 0x085c }
            r3 = 3
            java.lang.String r3 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.getTypeString(r3)     // Catch:{ all -> 0x085c }
            r2.append(r3)     // Catch:{ all -> 0x085c }
            java.lang.String r3 = " extract failed ("
            r2.append(r3)     // Catch:{ all -> 0x085c }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x085c }
            r2.append(r3)     // Catch:{ all -> 0x085c }
            java.lang.String r3 = ")."
            r2.append(r3)     // Catch:{ all -> 0x085c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x085c }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x085c }
            throw r1     // Catch:{ all -> 0x085c }
        L_0x085c:
            r0 = move-exception
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r5)
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeZip(r4)
            throw r0
        L_0x0864:
            r1 = r10
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r2 = "UpgradePatch tryPatch:copy patch file fail from %s to %s"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r1.getPath()
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = r15.getPath()
            r6 = 1
            r3[r6] = r4
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r2, r3)
            gv3.d r0 = r9.f254232e
            java.lang.String r2 = r1.getName()
            r0.mo109442d(r1, r15, r2, r6)
            return r5
        L_0x0887:
            r5 = 0
            java.lang.String r0 = "Tinker.UpgradePatch"
            java.lang.String r1 = "UpgradePatch tryPatch:patch is disabled, just return"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106531e(r0, r1, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fv3.C87102h.mo121561a(android.content.Context, java.lang.String, hv3.a):boolean");
    }
}
