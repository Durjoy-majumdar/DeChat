package com.tencent.xweb.updater;

import com.tencent.xweb.util.AbiUtil;

public abstract class EmbededUpdateConfig extends UpdateConfig {
    public EmbededUpdateConfig(int i) {
        super("", false, i, AbiUtil.getRuntimeAbi(), 0);
    }

    public boolean checkValid() {
        return this.apkVer > 0;
    }

    public abstract boolean copyPackageToLocal(String str, String str2);

    public String getDownloadPath() {
        return super.getDownloadPath();
    }
}
