package com.tencent.xweb.updater;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.util.LocalBroadcastManager;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebCleaner;
import com.tencent.xweb.util.XWebLog;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public class XWalkRuntimeUpdater implements WCWebUpdater.IWebviewUpdater {
    public static final String TAG = "XWalkRuntimeUpdater";

    public static void sendBroadcast(String str, int i) {
        Intent intent = new Intent();
        intent.setAction(IXWebBroadcastListener.UPDATE_ACTION);
        intent.putExtra(IXWebBroadcastListener.STAGE_TAG, str);
        intent.putExtra(IXWebBroadcastListener.DATA_TAG, i);
        LocalBroadcastManager.getInstance(XWalkEnvironment.getApplicationContext()).sendBroadcast(intent);
    }

    private void tryUpdateRuntimeFromEmbed() {
        new XWebRuntimeInstaller().updateRuntimeFromEmbed();
    }

    private void tryUpdateRuntimeFromRemote(HashMap<String, String> hashMap) {
        new XWalkRuntimeUpdateChecker(hashMap).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    public boolean isBusy() {
        return Math.abs(System.currentTimeMillis() - XWalkUpdateLocker.getUpdateFinishedTime()) < 10000 || XWalkUpdateLocker.isInUpdatingProgress() || XWebCleaner.isBusy();
    }

    public boolean needCheckUpdate() {
        return XWalkRuntimeUpdateChecker.checkNeedFetchConfig();
    }

    public void startCheck(Context context, HashMap<String, String> hashMap) {
        synchronized (this) {
            WXWebReporter.reportCoreInstalled();
            String str = null;
            if (hashMap != null) {
                str = hashMap.get(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE);
            }
            XWebLog.m21911i(TAG, "startCheck, check type:" + str);
            if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY.equals(str)) {
                XWebLog.m21911i(TAG, "startCheck, check config update only");
                tryUpdateRuntimeFromRemote(hashMap);
            } else if (WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL.equals(str)) {
                XWebLog.m21911i(TAG, "startCheck, check embed install only");
                tryUpdateRuntimeFromEmbed();
            } else {
                tryUpdateRuntimeFromEmbed();
                tryUpdateRuntimeFromRemote(hashMap);
                XWebCleaner.tryClean(context);
            }
        }
    }
}
