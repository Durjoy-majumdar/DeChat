package com.tencent.xweb;

import android.text.TextUtils;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewContextWrapper;
import com.tencent.xweb.internal.IWebViewCoreWrapper;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public abstract class XWebInitializer {
    private static final String TAG = "XWebInitializer";
    private boolean mHasInited = false;
    private boolean mIsWebViewCoreReady;
    public IWebViewContextWrapper webViewContextWrapper;
    public IWebViewCoreWrapper webViewCoreWrapper;

    private boolean init() {
        WXWebReporter.idkeyReport(1749, 67, 1);
        if (!XWalkEnvironment.hasAvailableVersion()) {
            if (XWalkEnvironment.getAvailableVersion() == -1) {
                XWebLog.addInitializeLog(TAG, "init, no available version, need download");
            } else {
                XWebLog.addInitializeLog(TAG, "init, sdk not support this apk, need update new");
            }
            WXWebReporter.idkeyReport(1749, 69, 1);
            return false;
        }
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        boolean doInitWebViewCore = doInitWebViewCore(availableVersion);
        XWebLog.addInitializeLog(TAG, "init, do init webview core result:" + doInitWebViewCore);
        if (doInitWebViewCore) {
            this.mIsWebViewCoreReady = true;
            postInitWebViewCore(availableVersion);
            WXWebReporter.idkeyReport(1749, 70, 1);
            return true;
        }
        WXWebReporter.idkeyReport(1749, 68, 1);
        return false;
    }

    public abstract boolean doInitWebViewCore(int i);

    public IWebViewContextWrapper getWebViewContextWrapper() {
        return this.webViewContextWrapper;
    }

    public IWebViewCoreWrapper getWebViewCoreWrapper() {
        return this.webViewCoreWrapper;
    }

    public void initWebViewCore() {
        if (!this.mHasInited) {
            this.mHasInited = true;
            XWebLog.m21911i(TAG, "initWebViewCore, start");
            if (init()) {
                XWebLog.m21911i(TAG, "initWebViewCore, success");
            } else {
                XWebLog.m21913w(TAG, "initWebViewCore, fail");
            }
        }
    }

    public boolean isWebViewCoreReady() {
        if (!this.mHasInited) {
            return false;
        }
        return this.mIsWebViewCoreReady;
    }

    public abstract void postInitWebViewCore(int i);

    public void setLocalStorageSuffix() {
        String processName = XWalkEnvironment.getProcessName();
        if (TextUtils.isEmpty(processName)) {
            processName = XWalkEnvironment.getApplicationContext().getPackageName();
        }
        String replace = processName.replace(XVFSFile.PATH_SEPARATOR, ".");
        IWebViewCoreWrapper webViewCoreWrapper2 = getWebViewCoreWrapper();
        webViewCoreWrapper2.invokeRuntimeChannel(ConstValue.APP_SET_LOCAL_STG_SUFFIX, new Object[]{replace + "." + XWebGrayValueUtil.getGrayValue()});
    }
}
