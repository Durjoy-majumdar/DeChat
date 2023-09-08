package com.tencent.xweb;

import android.content.Context;
import android.os.Handler;
import androidx.camera.camera2.internal.Camera2CameraImpl;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.internal.IWebViewProvider;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.WebViewWrapperFactory;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.util.XWebSharedPreferenceUtil;
import com.tencent.xweb.xwalk.plugin.XWalkPluginUpdateListener;
import java.util.HashMap;
import org.xwalk.core.XWalkEnvironment;

public class WCWebUpdater {
    public static final String TAG = "WCWebUpdater";
    public static final String XWEB_UPDATER_START_CHECK_TYPE = "UpdaterCheckType";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY = "5";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL = "4";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_FORCE_CHECK = "2";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_FORCE_DOWNLOAD = "3";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_NOTIFY = "1";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_NOTIFY_ONLY_INSTALL_EMBED_PLUGIN = "6";
    public static final String XWEB_UPDATER_START_CHECK_TYPE_TIMER = "0";
    private static IWebviewPluginUpdater sPluginUpdater;
    private static IWebviewUpdater sWebviewUpdater;

    public interface IWebviewPluginUpdater extends IWebviewUpdater {
        void cancelPluginUpdate();

        void setPluginOnlyOneToUpdate(String str, XWalkPluginUpdateListener xWalkPluginUpdateListener);
    }

    public interface IWebviewUpdater {
        boolean isBusy();

        boolean needCheckUpdate();

        void startCheck(Context context, HashMap<String, String> hashMap);
    }

    static {
        IWebViewProvider xWebViewProvider = WebViewWrapperFactory.getXWebViewProvider();
        if (xWebViewProvider != null) {
            sWebviewUpdater = (IWebviewUpdater) xWebViewProvider.execute(ConstValue.STR_CMD_GET_UPDATER, (Object[]) null);
            sPluginUpdater = (IWebviewPluginUpdater) xWebViewProvider.execute(ConstValue.STR_CMD_GET_PLUGIN_UPDATER, (Object[]) null);
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void checkConfigUpdate(Context context) {
        if (XWalkEnvironment.getApplicationContext() == null) {
            XWebLog.m21913w(TAG, "checkConfigUpdate, init xwalk environment first");
            XWalkEnvironment.init(context);
        }
        if (sWebviewUpdater != null) {
            XWebLog.m21911i(TAG, "checkConfigUpdate, start check base config update");
            HashMap hashMap = new HashMap();
            hashMap.put(XWEB_UPDATER_START_CHECK_TYPE, XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            sWebviewUpdater.startCheck(XWalkEnvironment.getApplicationContext(), hashMap);
        } else {
            XWebLog.m21913w(TAG, "checkConfigUpdate, no sWebviewUpdater");
        }
        if (sPluginUpdater != null) {
            XWebLog.m21911i(TAG, "checkConfigUpdate, start check plugin config update");
            HashMap hashMap2 = new HashMap();
            hashMap2.put(XWEB_UPDATER_START_CHECK_TYPE, XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY);
            sPluginUpdater.startCheck(XWalkEnvironment.getApplicationContext(), hashMap2);
            return;
        }
        XWebLog.m21913w(TAG, "checkConfigUpdate, no sPluginUpdater");
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void checkNeedDownload() {
        if (sWebviewUpdater != null) {
            XWebLog.m21911i(TAG, "checkNeedDownload, start check runtime update");
            HashMap hashMap = new HashMap();
            hashMap.put(XWEB_UPDATER_START_CHECK_TYPE, "2");
            sWebviewUpdater.startCheck(XWalkEnvironment.getApplicationContext(), hashMap);
            return;
        }
        XWebLog.m21913w(TAG, "checkNeedDownload, no sWebviewUpdater");
    }

    private static boolean checkUpdateTimeThreshold() {
        if (XWebSharedPreferenceUtil.getApplicationContext() == null) {
            XWebLog.m21913w(TAG, "checkUpdateTimeThreshold, init first");
            return false;
        }
        long j = XWebSharedPreferenceUtil.getSharedPreferencesForUpdateConfig().getLong("last_check_update_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (XWebSdk.getInstalledNewstVersion(XWalkEnvironment.getApplicationContext()) <= 0 || Math.abs(currentTimeMillis - j) >= ((long) getCheckUpdateTimeThreshold())) {
            return true;
        }
        XWebLog.m21913w(TAG, "checkUpdateTimeThreshold, check too fast");
        return false;
    }

    public static int getCheckUpdateTimeThreshold() {
        return CommandCfg.getInstance().getCmdAsInt(CommandDef.COMMAND_CHECK_UPDATE_TIME_THRESHOLD, XWalkEnvironment.MODULE_TOOLS, Camera2CameraImpl.StateCallback.CameraReopenMonitor.ACTIVE_REOPEN_LIMIT_MS);
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean isBusy() {
        boolean z;
        boolean z2;
        IWebviewUpdater iWebviewUpdater = sWebviewUpdater;
        if (iWebviewUpdater != null) {
            z = iWebviewUpdater.isBusy();
        } else {
            XWebLog.m21913w(TAG, "isBusy, no sWebviewUpdater");
            z = false;
        }
        IWebviewPluginUpdater iWebviewPluginUpdater = sPluginUpdater;
        if (iWebviewPluginUpdater != null) {
            z2 = iWebviewPluginUpdater.isBusy();
        } else {
            XWebLog.m21913w(TAG, "isBusy, no sPluginUpdater");
            z2 = false;
        }
        return z || z2;
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static boolean needCheckUpdate(boolean z) {
        synchronized (WCWebUpdater.class) {
            if (!checkUpdateTimeThreshold()) {
                XWebLog.m21911i(TAG, "needCheckUpdate, time not up");
                return false;
            }
            IWebviewUpdater iWebviewUpdater = sWebviewUpdater;
            if (iWebviewUpdater == null || !iWebviewUpdater.needCheckUpdate()) {
                XWebLog.m21913w(TAG, "needCheckUpdate, sWebviewUpdater ret false");
                if (!z) {
                    return false;
                }
                IWebviewPluginUpdater iWebviewPluginUpdater = sPluginUpdater;
                if (iWebviewPluginUpdater == null || !iWebviewPluginUpdater.needCheckUpdate()) {
                    XWebLog.m21913w(TAG, "needCheckUpdate, sPluginUpdater ret false");
                    return false;
                }
                XWebLog.m21911i(TAG, "needCheckUpdate, sPluginUpdater ret true");
                return true;
            }
            XWebLog.m21911i(TAG, "needCheckUpdate, sWebviewUpdater ret true");
            return true;
        }
    }

    private static void saveCheckUpdateTime() {
        if (XWebSharedPreferenceUtil.getApplicationContext() == null) {
            XWebLog.m21913w(TAG, "saveCheckUpdateTime, init first");
        } else {
            XWebSharedPreferenceUtil.getSharedPreferencesForUpdateConfig().edit().putLong("last_check_update_time", System.currentTimeMillis()).apply();
        }
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void startCheck(final Context context, final HashMap<String, String> hashMap) {
        synchronized (WCWebUpdater.class) {
            if (sWebviewUpdater != null) {
                WXWebReporter.onStartCheckUpdate();
                XWebLog.m21911i(TAG, "startCheck, start check runtime update");
                saveCheckUpdateTime();
                sWebviewUpdater.startCheck(context, hashMap);
            } else {
                XWebLog.m21913w(TAG, "startCheck, no sWebviewUpdater");
            }
            if (sPluginUpdater != null) {
                String str = null;
                if (hashMap != null) {
                    str = hashMap.get(XWEB_UPDATER_START_CHECK_TYPE);
                }
                XWebLog.m21911i(TAG, "startCheck, check type:" + str);
                if (str == null || !str.equals("0")) {
                    startCheckPluginUpdate(context, hashMap);
                } else {
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            WCWebUpdater.startCheckPluginUpdate(context, hashMap);
                        }
                    }, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
            } else {
                XWebLog.m21913w(TAG, "startCheck, no sPluginUpdater");
            }
        }
    }

    /* access modifiers changed from: private */
    public static void startCheckPluginUpdate(Context context, HashMap<String, String> hashMap) {
        if (sPluginUpdater != null) {
            WXWebReporter.onStartCheckPluginUpdate();
            XWebLog.m21911i(TAG, "startCheck, start check plugin update");
            sPluginUpdater.setPluginOnlyOneToUpdate("", (XWalkPluginUpdateListener) null);
            sPluginUpdater.startCheck(context, hashMap);
            return;
        }
        XWebLog.m21913w(TAG, "startCheckPluginUpdate, no sPluginUpdater");
    }

    public static void tryEmbedInstall() {
        if (sWebviewUpdater != null) {
            XWebLog.m21911i(TAG, "tryEmbedInstall, start check runtime update");
            HashMap hashMap = new HashMap();
            hashMap.put(XWEB_UPDATER_START_CHECK_TYPE, XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL);
            sWebviewUpdater.startCheck(XWalkEnvironment.getApplicationContext(), hashMap);
            return;
        }
        XWebLog.m21913w(TAG, "tryEmbedInstall, no sWebviewUpdater");
    }

    @DeprecatedOutsideXWebSdk
    @Deprecated
    public static void tryStartDownload() {
        if (sWebviewUpdater != null) {
            XWebLog.m21911i(TAG, "tryStartDownload, start check runtime update");
            sWebviewUpdater.startCheck(XWalkEnvironment.getApplicationContext(), (HashMap<String, String>) null);
            return;
        }
        XWebLog.m21913w(TAG, "tryStartDownload, no sWebviewUpdater");
    }
}
