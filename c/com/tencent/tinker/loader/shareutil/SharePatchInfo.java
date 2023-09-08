package com.tencent.tinker.loader.shareutil;

import com.tencent.tinker.loader.TinkerRuntimeException;
import java.io.File;
import java.io.IOException;

public class SharePatchInfo {
    public static final String DEFAULT_DIR = "odex";
    public static final String FINGER_PRINT = "print";
    public static final String IS_PROTECTED_APP = "is_protected_app";
    public static final String IS_REMOVE_INTERPRET_OAT_DIR = "is_remove_interpret_oat_dir";
    public static final int MAX_EXTRACT_ATTEMPTS = 2;
    public static final String NEW_VERSION = "new";
    public static final String OAT_DIR = "dir";
    public static final String OLD_VERSION = "old";
    private static final String TAG = "Tinker.PatchInfo";
    public static final String USE_CUSTOM_FILE_PATCH = "use_custom_file_patch";
    public static final String VERSION_TO_REMOVE = "version_to_remove";
    public String fingerPrint;
    public boolean isProtectedApp;
    public boolean isRemoveInterpretOATDir;
    public String newVersion;
    public String oatDir;
    public String oldVersion;
    public boolean useCustomPatch;
    public String versionToRemove;

    public SharePatchInfo(String str, String str2, boolean z, boolean z2, String str3, String str4, String str5, boolean z3) {
        this.oldVersion = str;
        this.newVersion = str2;
        this.isProtectedApp = z;
        this.versionToRemove = str3;
        this.fingerPrint = str4;
        this.oatDir = str5;
        this.isRemoveInterpretOATDir = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0090, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[Catch:{ IOException -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e A[Catch:{ IOException -> 0x008e }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0092 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b6 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.tencent.tinker.loader.shareutil.SharePatchInfo readAndCheckProperty(java.io.File r17) {
        /*
            java.lang.String r1 = "Tinker.PatchInfo"
            r0 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x000c:
            r6 = 2
            if (r0 >= r6) goto L_0x00f6
            if (r5 != 0) goto L_0x00f6
            int r6 = r0 + 1
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0095, all -> 0x0092 }
            r2 = r17
            r15.<init>(r2)     // Catch:{ IOException -> 0x0090, all -> 0x0092 }
            r0.load(r15)     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = "old"
            java.lang.String r7 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = "new"
            java.lang.String r8 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = "is_protected_app"
            java.lang.String r3 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            java.lang.String r4 = "0"
            if (r3 == 0) goto L_0x0046
            boolean r16 = r3.isEmpty()     // Catch:{ IOException -> 0x008e }
            if (r16 != 0) goto L_0x0046
            boolean r3 = r4.equals(r3)     // Catch:{ IOException -> 0x008e }
            if (r3 != 0) goto L_0x0046
            r9 = 1
            goto L_0x0047
        L_0x0046:
            r9 = 0
        L_0x0047:
            java.lang.String r3 = "use_custom_file_patch"
            java.lang.String r3 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            if (r3 == 0) goto L_0x005e
            boolean r16 = r3.isEmpty()     // Catch:{ IOException -> 0x008e }
            if (r16 != 0) goto L_0x005e
            boolean r3 = r4.equals(r3)     // Catch:{ IOException -> 0x008e }
            if (r3 != 0) goto L_0x005e
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            java.lang.String r3 = "version_to_remove"
            java.lang.String r11 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = "print"
            java.lang.String r12 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = "dir"
            java.lang.String r13 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = "is_remove_interpret_oat_dir"
            java.lang.String r0 = r0.getProperty(r3)     // Catch:{ IOException -> 0x008e }
            if (r0 == 0) goto L_0x0089
            boolean r3 = r0.isEmpty()     // Catch:{ IOException -> 0x008e }
            if (r3 != 0) goto L_0x0089
            boolean r0 = r4.equals(r0)     // Catch:{ IOException -> 0x008e }
            if (r0 != 0) goto L_0x0089
            r14 = 1
            goto L_0x00b1
        L_0x0089:
            r14 = 0
            goto L_0x00b1
        L_0x008b:
            r0 = move-exception
            r3 = r15
            goto L_0x00f2
        L_0x008e:
            r0 = move-exception
            goto L_0x0099
        L_0x0090:
            r0 = move-exception
            goto L_0x0098
        L_0x0092:
            r0 = move-exception
            r3 = 0
            goto L_0x00f2
        L_0x0095:
            r0 = move-exception
            r2 = r17
        L_0x0098:
            r15 = 0
        L_0x0099:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r3.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r4 = "read property failed, e:"
            r3.append(r4)     // Catch:{ all -> 0x008b }
            r3.append(r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x008b }
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x008b }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r0, r4)     // Catch:{ all -> 0x008b }
        L_0x00b1:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r15)
            if (r7 == 0) goto L_0x00ee
            if (r8 != 0) goto L_0x00b9
            goto L_0x00ee
        L_0x00b9:
            java.lang.String r0 = ""
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x00c7
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r7)
            if (r0 == 0) goto L_0x00cd
        L_0x00c7:
            boolean r0 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.checkIfMd5Valid(r8)
            if (r0 != 0) goto L_0x00ea
        L_0x00cd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "path info file  corrupted:"
            r0.append(r3)
            java.lang.String r3 = r17.getAbsolutePath()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r1, r0, r4)
            goto L_0x00ef
        L_0x00ea:
            r0 = r6
            r5 = 1
            goto L_0x000c
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            r0 = r6
            goto L_0x000c
        L_0x00f2:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r3)
            throw r0
        L_0x00f6:
            if (r5 == 0) goto L_0x00ff
            com.tencent.tinker.loader.shareutil.SharePatchInfo r0 = new com.tencent.tinker.loader.shareutil.SharePatchInfo
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x00ff:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.SharePatchInfo.readAndCheckProperty(java.io.File):com.tencent.tinker.loader.shareutil.SharePatchInfo");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.tencent.tinker.loader.shareutil.SharePatchInfo, com.tencent.tinker.loader.shareutil.ShareFileLockHelper] */
    public static SharePatchInfo readAndCheckPropertyWithLock(File file, File file2) {
        ? r2 = 0;
        if (file == null || file2 == null) {
            return r2;
        }
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            ShareFileLockHelper fileLock = ShareFileLockHelper.getFileLock(file2);
            SharePatchInfo readAndCheckProperty = readAndCheckProperty(file);
            if (fileLock != null) {
                try {
                    fileLock.close();
                } catch (IOException e) {
                    ShareTinkerLog.m106534w(TAG, "releaseInfoLock error", e);
                }
            }
            return readAndCheckProperty;
        } catch (Exception e2) {
            throw new TinkerRuntimeException("readAndCheckPropertyWithLock fail", e2);
        } catch (Throwable th) {
            if (r2 != 0) {
                try {
                    r2.close();
                } catch (IOException e3) {
                    ShareTinkerLog.m106534w(TAG, "releaseInfoLock error", e3);
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean rewritePatchInfoFile(java.io.File r8, com.tencent.tinker.loader.shareutil.SharePatchInfo r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0171
            if (r9 != 0) goto L_0x0007
            goto L_0x0171
        L_0x0007:
            java.lang.String r1 = r9.fingerPrint
            boolean r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNullOrNil(r1)
            if (r1 == 0) goto L_0x0013
            java.lang.String r1 = android.os.Build.FINGERPRINT
            r9.fingerPrint = r1
        L_0x0013:
            java.lang.String r1 = r9.oatDir
            boolean r1 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isNullOrNil(r1)
            if (r1 == 0) goto L_0x001f
            java.lang.String r1 = "odex"
            r9.oatDir = r1
        L_0x001f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "rewritePatchInfoFile file path:"
            r1.append(r2)
            java.lang.String r2 = r8.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = " , oldVer:"
            r1.append(r2)
            java.lang.String r2 = r9.oldVersion
            r1.append(r2)
            java.lang.String r2 = ", newVer:"
            r1.append(r2)
            java.lang.String r2 = r9.newVersion
            r1.append(r2)
            java.lang.String r2 = ", isProtectedApp:"
            r1.append(r2)
            boolean r2 = r9.isProtectedApp
            r1.append(r2)
            java.lang.String r2 = ", versionToRemove:"
            r1.append(r2)
            java.lang.String r2 = r9.versionToRemove
            r1.append(r2)
            java.lang.String r2 = ", fingerprint:"
            r1.append(r2)
            java.lang.String r2 = r9.fingerPrint
            r1.append(r2)
            java.lang.String r2 = ", oatDir:"
            r1.append(r2)
            java.lang.String r2 = r9.oatDir
            r1.append(r2)
            java.lang.String r2 = ", isRemoveInterpretOATDir:"
            r1.append(r2)
            boolean r2 = r9.isRemoveInterpretOATDir
            r1.append(r2)
            java.lang.String r2 = ", stack: "
            r1.append(r2)
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>()
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r3 = "Tinker.PatchInfo"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106532i(r3, r1, r2)
            java.io.File r1 = r8.getParentFile()
            boolean r2 = r1.exists()
            if (r2 != 0) goto L_0x00a0
            r1.mkdirs()
        L_0x00a0:
            r1 = 0
            r2 = 0
        L_0x00a2:
            r4 = 2
            if (r1 >= r4) goto L_0x0170
            if (r2 != 0) goto L_0x0170
            int r1 = r1 + 1
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r4 = r9.oldVersion
            java.lang.String r5 = "old"
            r2.put(r5, r4)
            java.lang.String r4 = r9.newVersion
            java.lang.String r5 = "new"
            r2.put(r5, r4)
            boolean r4 = r9.isProtectedApp
            java.lang.String r5 = "1"
            java.lang.String r6 = "0"
            if (r4 == 0) goto L_0x00c6
            r4 = r5
            goto L_0x00c7
        L_0x00c6:
            r4 = r6
        L_0x00c7:
            java.lang.String r7 = "is_protected_app"
            r2.put(r7, r4)
            boolean r4 = r9.useCustomPatch
            if (r4 == 0) goto L_0x00d2
            r4 = r5
            goto L_0x00d3
        L_0x00d2:
            r4 = r6
        L_0x00d3:
            java.lang.String r7 = "use_custom_file_patch"
            r2.put(r7, r4)
            java.lang.String r4 = r9.versionToRemove
            java.lang.String r7 = "version_to_remove"
            r2.put(r7, r4)
            java.lang.String r4 = r9.fingerPrint
            java.lang.String r7 = "print"
            r2.put(r7, r4)
            java.lang.String r4 = r9.oatDir
            java.lang.String r7 = "dir"
            r2.put(r7, r4)
            boolean r4 = r9.isRemoveInterpretOATDir
            if (r4 == 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r5 = r6
        L_0x00f6:
            java.lang.String r4 = "is_remove_interpret_oat_dir"
            r2.put(r4, r5)
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x012d }
            r5.<init>(r8, r0)     // Catch:{ Exception -> 0x012d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            r4.<init>()     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            java.lang.String r6 = "from old version:"
            r4.append(r6)     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            java.lang.String r6 = r9.oldVersion     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            r4.append(r6)     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            java.lang.String r6 = " to new version:"
            r4.append(r6)     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            java.lang.String r6 = r9.newVersion     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            r4.append(r6)     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            r2.store(r5, r4)     // Catch:{ Exception -> 0x0128, all -> 0x0125 }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r5)
            goto L_0x0148
        L_0x0125:
            r8 = move-exception
            r4 = r5
            goto L_0x016c
        L_0x0128:
            r2 = move-exception
            r4 = r5
            goto L_0x012e
        L_0x012b:
            r8 = move-exception
            goto L_0x016c
        L_0x012d:
            r2 = move-exception
        L_0x012e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x012b }
            r5.<init>()     // Catch:{ all -> 0x012b }
            java.lang.String r6 = "write property failed, e:"
            r5.append(r6)     // Catch:{ all -> 0x012b }
            r5.append(r2)     // Catch:{ all -> 0x012b }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x012b }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x012b }
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106534w(r3, r2, r5)     // Catch:{ all -> 0x012b }
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r4)
        L_0x0148:
            com.tencent.tinker.loader.shareutil.SharePatchInfo r2 = readAndCheckProperty(r8)
            if (r2 == 0) goto L_0x0164
            java.lang.String r4 = r2.oldVersion
            java.lang.String r5 = r9.oldVersion
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0164
            java.lang.String r2 = r2.newVersion
            java.lang.String r4 = r9.newVersion
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0164
            r2 = 1
            goto L_0x0165
        L_0x0164:
            r2 = 0
        L_0x0165:
            if (r2 != 0) goto L_0x00a2
            r8.delete()
            goto L_0x00a2
        L_0x016c:
            com.tencent.tinker.loader.shareutil.SharePatchFileUtil.closeQuietly(r4)
            throw r8
        L_0x0170:
            return r2
        L_0x0171:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.SharePatchInfo.rewritePatchInfoFile(java.io.File, com.tencent.tinker.loader.shareutil.SharePatchInfo):boolean");
    }

    public static boolean rewritePatchInfoFileWithLock(File file, SharePatchInfo sharePatchInfo, File file2) {
        if (file == null || sharePatchInfo == null || file2 == null) {
            return false;
        }
        File parentFile = file2.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        ShareFileLockHelper shareFileLockHelper = null;
        try {
            ShareFileLockHelper fileLock = ShareFileLockHelper.getFileLock(file2);
            boolean rewritePatchInfoFile = rewritePatchInfoFile(file, sharePatchInfo);
            if (fileLock != null) {
                try {
                    fileLock.close();
                } catch (IOException e) {
                    ShareTinkerLog.m106532i(TAG, "releaseInfoLock error", e);
                }
            }
            return rewritePatchInfoFile;
        } catch (Exception e2) {
            throw new TinkerRuntimeException("rewritePatchInfoFileWithLock fail", e2);
        } catch (Throwable th) {
            if (shareFileLockHelper != null) {
                try {
                    shareFileLockHelper.close();
                } catch (IOException e3) {
                    ShareTinkerLog.m106532i(TAG, "releaseInfoLock error", e3);
                }
            }
            throw th;
        }
    }
}
