package com.tencent.tinker.loader;

import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.hotplug.ComponentHotplug;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.ShareIntentUtil;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import com.tencent.tinker.loader.shareutil.ShareSecurityCheck;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.io.File;

public class TinkerLoader extends AbstractTinkerLoader {
    private static final String TAG = "Tinker.TinkerLoader";
    private SharePatchInfo patchInfo;

    private boolean checkSafeModeCount(TinkerApplication tinkerApplication) {
        int safeModeCount = ShareTinkerInternals.getSafeModeCount(tinkerApplication);
        if (safeModeCount >= 2) {
            ShareTinkerInternals.setSafeModeCount(tinkerApplication, 0);
            return false;
        }
        tinkerApplication.setUseSafeMode(true);
        ShareTinkerInternals.setSafeModeCount(tinkerApplication, safeModeCount + 1);
        return true;
    }

    private void tryLoadPatchFilesInternal(TinkerApplication tinkerApplication, Intent intent) {
        int i;
        boolean z;
        boolean z2;
        ShareSecurityCheck shareSecurityCheck;
        int i2;
        int i3;
        int i4;
        TinkerApplication tinkerApplication2 = tinkerApplication;
        Intent intent2 = intent;
        int tinkerFlags = tinkerApplication.getTinkerFlags();
        if (!ShareTinkerInternals.isTinkerEnabled(tinkerFlags)) {
            ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles: tinker is disable, just return", new Object[0]);
            ShareIntentUtil.setIntentReturnCode(intent2, -1);
        } else if (ShareTinkerInternals.isInPatchProcess(tinkerApplication)) {
            ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles: we don't load patch with :patch process itself, just return", new Object[0]);
            ShareIntentUtil.setIntentReturnCode(intent2, -1);
        } else {
            File patchDirectory = SharePatchFileUtil.getPatchDirectory(tinkerApplication);
            if (patchDirectory == null) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:getPatchDirectory == null", new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -2);
                return;
            }
            String absolutePath = patchDirectory.getAbsolutePath();
            if (!patchDirectory.exists()) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:patch dir not exist:" + absolutePath, new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -2);
                return;
            }
            File patchInfoFile = SharePatchFileUtil.getPatchInfoFile(absolutePath);
            if (!patchInfoFile.exists()) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:patch info not exist:" + patchInfoFile.getAbsolutePath(), new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -3);
                return;
            }
            File patchInfoLockFile = SharePatchFileUtil.getPatchInfoLockFile(absolutePath);
            SharePatchInfo readAndCheckPropertyWithLock = SharePatchInfo.readAndCheckPropertyWithLock(patchInfoFile, patchInfoLockFile);
            this.patchInfo = readAndCheckPropertyWithLock;
            if (readAndCheckPropertyWithLock == null) {
                ShareIntentUtil.setIntentReturnCode(intent2, -4);
                return;
            }
            boolean z3 = readAndCheckPropertyWithLock.isProtectedApp;
            intent2.putExtra(ShareIntentUtil.INTENT_IS_PROTECTED_APP, z3);
            intent2.putExtra(ShareIntentUtil.INTENT_USE_CUSTOM_PATCH, this.patchInfo.useCustomPatch);
            SharePatchInfo sharePatchInfo = this.patchInfo;
            String str = sharePatchInfo.oldVersion;
            String str2 = sharePatchInfo.newVersion;
            String str3 = sharePatchInfo.oatDir;
            if (str == null || str2 == null || str3 == null) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onPatchInfoCorrupted", new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -4);
                return;
            }
            boolean isInMainProcess = ShareTinkerInternals.isInMainProcess(tinkerApplication);
            String str4 = this.patchInfo.versionToRemove;
            boolean z4 = z3;
            if (isInMainProcess) {
                if (ShareTinkerInternals.isNullOrNil(str4)) {
                    i = tinkerFlags;
                } else if (str2.equals(str4)) {
                    i = tinkerFlags;
                    ShareTinkerLog.m106534w(TAG, "found new version clean patch mark and we are in main process, delete patch file now.", new Object[0]);
                    String patchVersionDirectory = SharePatchFileUtil.getPatchVersionDirectory(str2);
                    if (patchVersionDirectory != null) {
                        boolean equals = str.equals(str2);
                        if (equals) {
                            str = "";
                        }
                        SharePatchInfo sharePatchInfo2 = this.patchInfo;
                        sharePatchInfo2.oldVersion = str;
                        sharePatchInfo2.newVersion = str;
                        sharePatchInfo2.versionToRemove = "";
                        SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, sharePatchInfo2, patchInfoLockFile);
                        String str5 = absolutePath + "/" + patchVersionDirectory;
                        if (equals) {
                            ShareTinkerInternals.killProcessExceptMain(tinkerApplication);
                            SharePatchFileUtil.deleteDirAsync(str5);
                            ShareIntentUtil.setIntentReturnCode(intent2, -2);
                            return;
                        }
                        SharePatchFileUtil.deleteDirAsync(str5);
                        str2 = str;
                    }
                } else {
                    i = tinkerFlags;
                    if (str.equals(str4)) {
                        ShareTinkerLog.m106534w(TAG, "found old version clean patch mark and we are in main process, delete patch file now.", new Object[0]);
                        String patchVersionDirectory2 = SharePatchFileUtil.getPatchVersionDirectory(str);
                        if (patchVersionDirectory2 != null) {
                            SharePatchInfo sharePatchInfo3 = this.patchInfo;
                            sharePatchInfo3.oldVersion = str2;
                            sharePatchInfo3.newVersion = str2;
                            sharePatchInfo3.versionToRemove = "";
                            SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, sharePatchInfo3, patchInfoLockFile);
                            ShareTinkerInternals.killProcessExceptMain(tinkerApplication);
                            SharePatchFileUtil.deleteDirAsync(absolutePath + "/" + patchVersionDirectory2);
                            str = str2;
                        }
                    } else {
                        SharePatchInfo sharePatchInfo4 = this.patchInfo;
                        sharePatchInfo4.versionToRemove = "";
                        SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, sharePatchInfo4, patchInfoLockFile);
                    }
                }
                if (this.patchInfo.isRemoveInterpretOATDir) {
                    ShareTinkerLog.m106532i(TAG, "tryLoadPatchFiles: isRemoveInterpretOATDir is true, try to delete interpret optimize files", new Object[0]);
                    SharePatchInfo sharePatchInfo5 = this.patchInfo;
                    sharePatchInfo5.isRemoveInterpretOATDir = false;
                    SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, sharePatchInfo5, patchInfoLockFile);
                    ShareTinkerInternals.killProcessExceptMain(tinkerApplication);
                    SharePatchFileUtil.deleteDirAsync((absolutePath + "/" + SharePatchFileUtil.getPatchVersionDirectory(str2)) + "/" + ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH);
                }
            } else {
                i = tinkerFlags;
            }
            intent2.putExtra(ShareIntentUtil.INTENT_PATCH_OLD_VERSION, str);
            intent2.putExtra(ShareIntentUtil.INTENT_PATCH_NEW_VERSION, str2);
            boolean z5 = !str.equals(str2);
            boolean equals2 = str3.equals(ShareConstants.CHANING_DEX_OPTIMIZE_PATH);
            String currentOatMode = ShareTinkerInternals.getCurrentOatMode(tinkerApplication2, str3);
            intent2.putExtra(ShareIntentUtil.INTENT_PATCH_OAT_DIR, currentOatMode);
            if (z5 && isInMainProcess) {
                str = str2;
            }
            if (ShareTinkerInternals.isNullOrNil(str)) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:version is blank, wait main process to restart", new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -5);
                return;
            }
            String patchVersionDirectory3 = SharePatchFileUtil.getPatchVersionDirectory(str);
            String str6 = ShareIntentUtil.INTENT_PATCH_OAT_DIR;
            if (patchVersionDirectory3 == null) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:patchName is null", new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -6);
                return;
            }
            String str7 = absolutePath + "/" + patchVersionDirectory3;
            File file = new File(str7);
            if (!file.exists()) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onPatchVersionDirectoryNotFound", new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -6);
                return;
            }
            String str8 = ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH;
            String patchVersionFile = SharePatchFileUtil.getPatchVersionFile(str);
            String str9 = patchVersionDirectory3;
            File file2 = patchVersionFile != null ? new File(file.getAbsolutePath(), patchVersionFile) : null;
            if (!SharePatchFileUtil.isLegalFile(file2)) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onPatchVersionFileNotFound", new Object[0]);
                ShareIntentUtil.setIntentReturnCode(intent2, -7);
                return;
            }
            ShareSecurityCheck shareSecurityCheck2 = new ShareSecurityCheck(tinkerApplication2);
            int i5 = i;
            int checkTinkerPackage = ShareTinkerInternals.checkTinkerPackage(tinkerApplication2, i5, file2, shareSecurityCheck2);
            if (checkTinkerPackage != 0) {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:checkTinkerPackage", new Object[0]);
                intent2.putExtra(ShareIntentUtil.INTENT_PATCH_PACKAGE_PATCH_CHECK, checkTinkerPackage);
                ShareIntentUtil.setIntentReturnCode(intent2, -8);
                return;
            }
            String str10 = "/";
            intent2.putExtra(ShareIntentUtil.INTENT_PATCH_PACKAGE_CONFIG, shareSecurityCheck2.getPackagePropertiesIfPresent());
            boolean isTinkerEnabledForDex = ShareTinkerInternals.isTinkerEnabledForDex(i5);
            boolean isArkHotRuning = ShareTinkerInternals.isArkHotRuning();
            if (isArkHotRuning || !isTinkerEnabledForDex || TinkerDexLoader.checkComplete(str7, shareSecurityCheck2, currentOatMode, intent2)) {
                boolean z6 = isTinkerEnabledForDex;
                boolean isTinkerEnabledForArkHot = ShareTinkerInternals.isTinkerEnabledForArkHot(i5);
                if (isArkHotRuning && isTinkerEnabledForArkHot && !TinkerArkHotLoader.checkComplete(str7, shareSecurityCheck2, intent2)) {
                    ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:dex check fail", new Object[0]);
                } else if (!ShareTinkerInternals.isTinkerEnabledForNativeLib(i5) || TinkerSoLoader.checkComplete(str7, shareSecurityCheck2, intent2)) {
                    boolean isTinkerEnabledForResource = ShareTinkerInternals.isTinkerEnabledForResource(i5);
                    String str11 = absolutePath;
                    ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:isEnabledForResource:" + isTinkerEnabledForResource, new Object[0]);
                    if (!isTinkerEnabledForResource || TinkerResourceLoader.checkComplete(tinkerApplication2, str7, shareSecurityCheck2, intent2)) {
                        boolean z7 = ShareTinkerInternals.isVmArt() && ShareTinkerInternals.isSystemOTA(this.patchInfo.fingerPrint) && !ShareTinkerInternals.isAfterAndroidO();
                        intent2.putExtra(ShareIntentUtil.INTENT_PATCH_SYSTEM_OTA, z7);
                        if (isInMainProcess) {
                            if (z5) {
                                this.patchInfo.oldVersion = str;
                            }
                            if (equals2) {
                                SharePatchInfo sharePatchInfo6 = this.patchInfo;
                                sharePatchInfo6.oatDir = currentOatMode;
                                sharePatchInfo6.isRemoveInterpretOATDir = true;
                            }
                        }
                        if (!checkSafeModeCount(tinkerApplication)) {
                            if (isInMainProcess) {
                                SharePatchInfo sharePatchInfo7 = this.patchInfo;
                                sharePatchInfo7.oldVersion = "";
                                sharePatchInfo7.newVersion = "";
                                sharePatchInfo7.versionToRemove = "";
                                SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, sharePatchInfo7, patchInfoLockFile);
                                ShareTinkerInternals.killProcessExceptMain(tinkerApplication);
                                SharePatchFileUtil.deleteDirAsync(str11 + str10 + str9);
                                intent2.putExtra(ShareIntentUtil.INTENT_PATCH_EXCEPTION, new TinkerRuntimeException("checkSafeModeCount fail"));
                                ShareIntentUtil.setIntentReturnCode(intent2, -25);
                                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:checkSafeModeCount fail, patch was deleted.", new Object[0]);
                                return;
                            }
                            ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:checkSafeModeCount fail, but we are not in main process, mark the patch to be deleted and continue load patch.", new Object[0]);
                            ShareTinkerInternals.cleanPatch(tinkerApplication);
                        }
                        if (isArkHotRuning || !z6) {
                            shareSecurityCheck = shareSecurityCheck2;
                            z = isTinkerEnabledForResource;
                            z2 = isInMainProcess;
                            i2 = -19;
                        } else {
                            String str12 = str6;
                            z2 = isInMainProcess;
                            String str13 = str8;
                            shareSecurityCheck = shareSecurityCheck2;
                            String str14 = str12;
                            boolean z8 = z7;
                            z = isTinkerEnabledForResource;
                            i2 = -19;
                            boolean loadTinkerJars = TinkerDexLoader.loadTinkerJars(tinkerApplication, str7, currentOatMode, intent, z7, z4);
                            if (z8) {
                                SharePatchInfo sharePatchInfo8 = this.patchInfo;
                                sharePatchInfo8.fingerPrint = Build.FINGERPRINT;
                                sharePatchInfo8.oatDir = loadTinkerJars ? str13 : "odex";
                                if (!SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, sharePatchInfo8, patchInfoLockFile)) {
                                    ShareIntentUtil.setIntentReturnCode(intent2, -19);
                                    ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onReWritePatchInfoCorrupted", new Object[0]);
                                    return;
                                }
                                i4 = 0;
                                intent2.putExtra(str14, this.patchInfo.oatDir);
                                equals2 = false;
                            } else {
                                i4 = 0;
                            }
                            if (!loadTinkerJars) {
                                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onPatchLoadDexesFail", new Object[i4]);
                                return;
                            }
                        }
                        if (isArkHotRuning && isTinkerEnabledForArkHot && !TinkerArkHotLoader.loadTinkerArkHot(tinkerApplication2, str7, intent2)) {
                            ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onPatchLoadArkApkFail", new Object[0]);
                        } else if (!z || TinkerResourceLoader.loadTinkerResources(tinkerApplication2, str7, intent2)) {
                            if ((z6 || isTinkerEnabledForArkHot) && z) {
                                ComponentHotplug.install(tinkerApplication2, shareSecurityCheck);
                            }
                            if (!AppInfoChangedBlocker.tryStart(tinkerApplication)) {
                                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:AppInfoChangedBlocker install fail.", new Object[0]);
                                ShareIntentUtil.setIntentReturnCode(intent2, -28);
                                return;
                            }
                            if (!z2 || (!z5 && !equals2)) {
                                i3 = 0;
                            } else if (!SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, this.patchInfo, patchInfoLockFile)) {
                                ShareIntentUtil.setIntentReturnCode(intent2, i2);
                                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onReWritePatchInfoCorrupted", new Object[0]);
                                return;
                            } else {
                                i3 = 0;
                                ShareTinkerInternals.killProcessExceptMain(tinkerApplication);
                            }
                            ShareIntentUtil.setIntentReturnCode(intent2, i3);
                            ShareTinkerLog.m106532i(TAG, "tryLoadPatchFiles: load end, ok!", new Object[i3]);
                        } else {
                            ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:onPatchLoadResourcesFail", new Object[0]);
                        }
                    } else {
                        ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:resource check fail", new Object[0]);
                    }
                } else {
                    ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:native lib check fail", new Object[0]);
                }
            } else {
                ShareTinkerLog.m106534w(TAG, "tryLoadPatchFiles:dex check fail", new Object[0]);
            }
        }
    }

    public Intent tryLoad(TinkerApplication tinkerApplication) {
        ShareTinkerLog.m106530d(TAG, "tryLoad test test", new Object[0]);
        Intent intent = new Intent();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        tryLoadPatchFilesInternal(tinkerApplication, intent);
        ShareIntentUtil.setIntentPatchCostTime(intent, SystemClock.elapsedRealtime() - elapsedRealtime);
        return intent;
    }
}
