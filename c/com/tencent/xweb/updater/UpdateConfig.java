package com.tencent.xweb.updater;

import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.XWebFileUtil;

public class UpdateConfig {
    public String abi;
    public int apkVer;
    public boolean bTryUseSharedCore;
    public boolean bUseCdn;
    public String downUrl;
    public String downloadFileMd5;
    public boolean isMatchMd5;
    public boolean isPatchUpdate;
    public int nPatchTargetVersion;
    public String patchEndFileMd5;
    public int patchType;
    public Scheduler scheduler;
    public String versionDetail;

    public UpdateConfig(String str, boolean z, int i, String str2, int i2, int i3) {
        this.isMatchMd5 = false;
        this.isPatchUpdate = z;
        this.downUrl = str;
        this.apkVer = i;
        this.abi = str2;
        this.nPatchTargetVersion = i2;
        this.patchType = i3;
        if (!checkValid()) {
            throw new RuntimeException("invalid update config");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        r0 = r3.patchEndFileMd5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean checkValid() {
        /*
            r3 = this;
            boolean r0 = r3.isMatchMd5
            r1 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r3.downloadFileMd5
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            return r1
        L_0x0010:
            java.lang.String r0 = r3.downUrl
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001b
            goto L_0x0034
        L_0x001b:
            int r0 = r3.apkVer
            r2 = -1
            if (r0 != r2) goto L_0x0021
            return r1
        L_0x0021:
            boolean r0 = r3.isMatchMd5
            if (r0 == 0) goto L_0x0033
            boolean r0 = r3.isPatchUpdate
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r3.patchEndFileMd5
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.updater.UpdateConfig.checkValid():boolean");
    }

    public String getDownloadPath() {
        if (!checkValid()) {
            throw new RuntimeException("invalid update config");
        } else if (!this.isPatchUpdate) {
            return XWebFileUtil.getDownloadZipPath(this.apkVer);
        } else {
            int i = this.patchType;
            if (i == 1 || i == 2) {
                return XWebFileUtil.getDownloadPatchPath(this.apkVer, i);
            }
            throw new RuntimeException("invalid patchType in updateConfig");
        }
    }

    public String getLogString() {
        if (!checkValid()) {
            return "invalid update config";
        }
        return "{UpdateConfig isMatchMd5:" + this.isMatchMd5 + ",downloadFileMd5:" + this.downloadFileMd5 + ",isPatchUpdate:" + this.isPatchUpdate + ",downUrl:" + this.downUrl + ",apkVer:" + this.apkVer + ",useCDN:" + this.bUseCdn + ",downloadPath:" + getDownloadPath() + "}";
    }

    public int getUpdateBizType() {
        return this.isPatchUpdate ? 2 : 1;
    }

    public UpdateConfig(String str, boolean z, String str2, String str3, int i, String str4, int i2, int i3) {
        this.isMatchMd5 = true;
        this.downloadFileMd5 = str;
        this.isPatchUpdate = z;
        this.patchEndFileMd5 = str2;
        this.downUrl = str3;
        this.apkVer = i;
        this.abi = str4;
        this.nPatchTargetVersion = i2;
        this.patchType = i3;
        if (!checkValid()) {
            throw new RuntimeException("invalid update config");
        }
    }

    public UpdateConfig(String str, boolean z, int i, String str2, int i2) {
        this.patchType = 1;
        this.isMatchMd5 = false;
        this.isPatchUpdate = z;
        this.downUrl = str;
        this.apkVer = i;
        this.abi = str2;
        this.nPatchTargetVersion = i2;
        if (!checkValid()) {
            throw new RuntimeException("invalid update config");
        }
    }

    public UpdateConfig(String str, boolean z, String str2, String str3, int i, String str4, int i2) {
        this.patchType = 1;
        this.isMatchMd5 = true;
        this.downloadFileMd5 = str;
        this.isPatchUpdate = z;
        this.patchEndFileMd5 = str2;
        this.downUrl = str3;
        this.apkVer = i;
        this.abi = str4;
        this.nPatchTargetVersion = i2;
        if (!checkValid()) {
            throw new RuntimeException("invalid update config");
        }
    }
}
