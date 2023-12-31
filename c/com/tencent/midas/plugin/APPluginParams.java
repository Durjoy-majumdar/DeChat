package com.tencent.midas.plugin;

import android.app.Dialog;
import android.content.Intent;

public class APPluginParams {
    public String mApkFilePath;
    public String mConponentName;
    public Dialog mDialog;
    public boolean mDialogDismissBySDK = true;
    public Intent mIntent;
    public String mPluginName;
    public int mPluginType;
    public String mProgressTips;
    public Class<?> mProxyActivityClass;
    public int mRequestCode = -1;
    public int mTimeOut = 10000;

    public APPluginParams(int i) {
        this.mPluginType = i;
    }
}
