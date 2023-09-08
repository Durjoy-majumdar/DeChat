package com.huawei.easygo.sdk.module;

import android.os.Bundle;

public class EasyGoRet {
    public int code;
    public Bundle result;

    public EasyGoRet(com.huawei.easygo.module.EasyGoRet easyGoRet) {
        this.code = 0;
        this.result = new Bundle();
        if (easyGoRet != null) {
            this.code = easyGoRet.code;
            this.result = easyGoRet.result;
        }
    }

    public EasyGoRet(int i, Bundle bundle) {
        this.code = 0;
        new Bundle();
        this.code = i;
        this.result = bundle;
    }
}
