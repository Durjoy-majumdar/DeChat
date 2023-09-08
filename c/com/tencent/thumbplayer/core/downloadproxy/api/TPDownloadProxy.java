package com.tencent.thumbplayer.core.downloadproxy.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.thumbplayer.core.downloadproxy.apiinner.TPListenerManager;
import com.tencent.thumbplayer.core.downloadproxy.jni.TPDownloadProxyNative;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLFileSystem;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyLog;
import com.tencent.thumbplayer.core.downloadproxy.utils.TPDLProxyUtils;
import java.io.File;

public class TPDownloadProxy implements ITPDownloadProxy {
    private static final String FILE_NAME = "TPDownloadProxy";
    private ConnectivityManager mConnectivityManager;
    private String mCurrentStoragePath = "";
    private boolean mIsInit = false;
    private ConnectivityManager.NetworkCallback mNetworkCallback;
    private int mServiceType;

    public TPDownloadProxy(int i) {
        this.mServiceType = i;
    }

    private void registerNetworkConnectivity(Context context) {
        if (context == null) {
            TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, context is null, can not set interface 4g");
        } else if (Build.VERSION.SDK_INT >= 23) {
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.mConnectivityManager = connectivityManager;
            if (connectivityManager == null) {
                TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, connectivityManager is null, can not set interface 4g");
                return;
            }
            NetworkRequest build = builder.build();
            C200671 r0 = new ConnectivityManager.NetworkCallback() {
                public void onAvailable(Network network) {
                    super.onAvailable(network);
                    TPListenerManager.getInstance().setNetwork(network);
                    long networkHandle = network.getNetworkHandle();
                    TPDLProxyLog.m21866i(TPDownloadProxy.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network, net_id_t: " + networkHandle);
                    TPDownloadProxy.this.setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, Long.valueOf(networkHandle));
                }

                public void onLost(Network network) {
                    super.onLost(network);
                    TPDownloadProxy.this.setUserData(TPDownloadProxyEnum.CELLULAR_NETWORK_INTERFACE_ID, 0);
                    TPDLProxyLog.m21866i(TPDownloadProxy.FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network failed");
                }
            };
            this.mNetworkCallback = r0;
            this.mConnectivityManager.requestNetwork(build, r0);
        }
    }

    private void unregisterNetworkConnectivity() {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT >= 23 && (connectivityManager = this.mConnectivityManager) != null) {
            connectivityManager.unregisterNetworkCallback(this.mNetworkCallback);
        }
    }

    public int checkResourceStatus(String str, String str2, int i) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().checkResourceStatus(str, str2, i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "checkResourceStatus failed, error:" + th.toString());
            }
        }
        return -1;
    }

    public int clearCache(String str, String str2, int i) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            return TPDownloadProxyNative.getInstance().clearCache(str, str2, i);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "clearCache failed, error:" + th.toString());
            return -1;
        }
    }

    public int deinit() {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            this.mIsInit = false;
            unregisterNetworkConnectivity();
            return TPDownloadProxyNative.getInstance().deInitService(this.mServiceType);
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deinit failed, error:" + th.toString());
            return -1;
        }
    }

    public String getClipPlayUrl(int i, int i2, int i3) {
        String str = "";
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                str = TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getClipPlayUrl(i, i2, i3));
                if (i3 != 2) {
                    TPDownloadProxyNative.getInstance().startDownload(i);
                }
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getClipPlayUrl failed, error:" + th.toString());
            }
        }
        return str;
    }

    public String getNativeInfo(int i) {
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return null;
        }
        try {
            return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getNativeInfo(i));
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getNativeInfo failed, error:" + th.toString());
            return null;
        }
    }

    public String getPlayErrorCodeStr(int i) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getErrorCodeStr(i));
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayErrorCodeStr failed, error:" + th.toString());
            }
        }
        return "";
    }

    public String getPlayUrl(int i, int i2) {
        String str = "";
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                str = TPDLProxyUtils.byteArrayToString(TPDownloadProxyNative.getInstance().getClipPlayUrl(i, 1, i2));
                if (i2 != 2) {
                    TPDownloadProxyNative.getInstance().startDownload(i);
                }
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getPlayUrl failed, error:" + th.toString());
            }
        }
        return str;
    }

    public long getResourceSize(String str, String str2) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().getResourceSize(str, str2);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "getResourceSize failed, error:" + th.toString());
            }
        }
        return -1;
    }

    public synchronized int init(Context context, TPDLProxyInitParam tPDLProxyInitParam) {
        String cacheDir;
        int i;
        if (this.mIsInit) {
            TPDLProxyLog.m21866i(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "download already init");
            return 0;
        }
        TPDownloadProxyNative.getInstance().setAppContext(context);
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (!TextUtils.isEmpty(tPDLProxyInitParam.getAppVer())) {
                    setUserData(TPDownloadProxyEnum.USER_APP_VERSION, tPDLProxyInitParam.getAppVer());
                }
                if (tPDLProxyInitParam.getPlatform() > 0) {
                    setUserData("platform", Integer.valueOf(tPDLProxyInitParam.getPlatform()));
                }
                if (!TextUtils.isEmpty(tPDLProxyInitParam.getGuid())) {
                    setUserData("guid", tPDLProxyInitParam.getGuid());
                }
                cacheDir = tPDLProxyInitParam.getCacheDir();
                if (TextUtils.isEmpty(cacheDir) && context != null) {
                    File properCacheDirectory = TPDLFileSystem.getProperCacheDirectory(context, "download");
                    if (properCacheDirectory != null) {
                        cacheDir = properCacheDirectory.getAbsolutePath();
                    }
                }
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "init failed, error:" + th.toString());
            }
            TPListenerManager.getInstance().initHandler();
            if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir()) || TextUtils.isEmpty(this.mCurrentStoragePath)) {
                if (!TextUtils.isEmpty(tPDLProxyInitParam.getDataDir())) {
                    this.mCurrentStoragePath = tPDLProxyInitParam.getDataDir();
                }
                i = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, tPDLProxyInitParam.getDataDir(), tPDLProxyInitParam.getConfigStr());
            } else {
                i = TPDownloadProxyNative.getInstance().initService(this.mServiceType, cacheDir, this.mCurrentStoragePath, tPDLProxyInitParam.getConfigStr());
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C200662 r2 = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    String action = intent.getAction();
                    if ("android.intent.action.SCREEN_OFF".equals(action)) {
                        TPDownloadProxy.this.pushEvent(20);
                    } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                        TPDownloadProxy.this.pushEvent(19);
                    }
                }
            };
            if (context != null) {
                context.registerReceiver(r2, intentFilter);
            }
            if (i == 0) {
                this.mIsInit = true;
            }
            registerNetworkConnectivity(context);
            return i;
        }
        return -1;
    }

    public int pauseDownload(int i) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().pauseDownload(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "pauseDownload failed, error:" + th.toString());
            }
        }
        return -1;
    }

    public void pushEvent(int i) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().pushEvent(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "cellular_network pushEvent failed, error:" + th.toString());
            }
        }
    }

    public int removeStorageCache(String str) {
        if (!TextUtils.isEmpty(str) && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().deleteCache(this.mCurrentStoragePath, str);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "deleteCache failed, error:" + th.toString());
            }
        }
        return -1;
    }

    public int resumeDownload(int i) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                return TPDownloadProxyNative.getInstance().resumeDownload(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "resumeDownload failed, error:" + th.toString());
            }
        }
        return -1;
    }

    public boolean setClipInfo(int i, int i2, String str, TPDownloadParam tPDownloadParam) {
        int dlType = tPDownloadParam.getDlType();
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int i3 = dlType;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return false;
        }
        try {
            return TPDownloadProxyNative.getInstance().setClipInfo(i, i2, str, i3, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo()) >= 0;
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setClipInfo failed, error:" + th.toString());
            return false;
        }
    }

    public void setLogListener(ITPDLProxyLogListener iTPDLProxyLogListener) {
        TPDLProxyLog.setLogListener(this.mServiceType, iTPDLProxyLogListener);
    }

    public void setMaxStorageSizeMB(long j) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setMaxStorageSizeMB(this.mServiceType, j);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setMaxStorageSizeMB failed, error:" + th.toString());
            }
        }
    }

    public void setPlayState(int i, int i2) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().setPlayerState(i, i2);
                if (i2 == 1) {
                    TPDownloadProxyNative.getInstance().updateTaskInfo(i, TPDownloadProxyEnum.TASKINFO_PLAY_OFFSET, String.valueOf(TPListenerManager.getInstance().getPlaylistener(i).getCurrentPlayOffset()));
                    TPDownloadProxyNative.getInstance().updatePlayerPlayMsg(i, (int) (TPListenerManager.getInstance().getPlaylistener(i).getCurrentPosition() / 1000), (int) (TPListenerManager.getInstance().getPlaylistener(i).getPlayerBufferLength() / 1000), (int) (TPListenerManager.getInstance().getPlaylistener(i).getAdvRemainTime() / 1000));
                }
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setPlayState failed, error:" + th.toString());
            }
        }
    }

    public void setUserData(String str, Object obj) {
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_APP_VERSION)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_APP_VERSION, (String) obj);
                } else if (str.equalsIgnoreCase("platform")) {
                    TPDownloadProxyNative.getInstance().setUserData("platform", obj.toString());
                } else if (str.equalsIgnoreCase("guid")) {
                    TPDownloadProxyNative.getInstance().setUserData("guid", (String) obj);
                } else if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_IS_VIP)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_IS_VIP, ((Boolean) obj).booleanValue() ? "1" : "0");
                } else if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_UPC)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_UPC, (String) obj);
                } else if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_UPC_STATE)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_UPC_STATE, obj.toString());
                } else if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_PROXY_CONFIG)) {
                    TPDownloadProxyNative.getInstance().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, obj.toString());
                } else if (str.equalsIgnoreCase(TPDownloadProxyEnum.USER_SERVICE_CONFIG)) {
                    TPDownloadProxyNative.getInstance().setServiceConfig(this.mServiceType, obj.toString());
                } else {
                    TPDownloadProxyNative.getInstance().setUserData(str, obj.toString());
                }
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "setUserData failed, error:" + th.toString());
            }
        }
    }

    public int startClipOfflineDownload(String str, int i, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        int i2 = -1;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            i2 = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 102, i);
            TPListenerManager.getInstance().setOfflineDownloadListener(i2, iTPOfflineDownloadListener);
            return i2;
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipOfflineDownload failed, error:" + th.toString());
            return i2;
        }
    }

    public int startClipPlay(String str, int i, ITPPlayListener iTPPlayListener) {
        int i2 = -1;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            i2 = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 2, i);
            TPListenerManager.getInstance().setPlayListener(i2, iTPPlayListener);
            return i2;
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPlay failed, error:" + th.toString());
            return i2;
        }
    }

    public int startClipPreload(String str, int i, ITPPreLoadListener iTPPreLoadListener) {
        int i2 = -1;
        if (!TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            return -1;
        }
        try {
            i2 = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, 202, i);
            TPListenerManager.getInstance().setPreLoadListener(i2, iTPPreLoadListener);
            return i2;
        } catch (Throwable th) {
            TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startClipPreload failed, error:" + th.toString());
            return i2;
        }
    }

    public int startOfflineDownload(String str, TPDownloadParam tPDownloadParam, ITPOfflineDownloadListener iTPOfflineDownloadListener) {
        int i = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 100;
                i = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                TPListenerManager.getInstance().setOfflineDownloadListener(i, iTPOfflineDownloadListener);
                if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                int i2 = i;
                TPDownloadProxyNative.getInstance().setClipInfo(i2, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th.toString());
            }
        }
        return i;
    }

    public int startPlay(String str, TPDownloadParam tPDownloadParam, ITPPlayListener iTPPlayListener) {
        int dlType = tPDownloadParam.getDlType();
        if (iTPPlayListener != null) {
            tPDownloadParam.getExtInfoMap().put(TPDownloadProxyEnum.DLPARAM_ADV_REMAIN_TIME, Long.valueOf(iTPPlayListener.getAdvRemainTime() / 1000));
        }
        if (tPDownloadParam.isOffline()) {
            dlType += 300;
        }
        int i = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                if (tPDownloadParam.isAdaptive() && (dlType == 3 || dlType == 5)) {
                    dlType += 400;
                }
                int i2 = dlType;
                i = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, i2, tPDownloadParam.getClipCount());
                if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                int i3 = i;
                TPDownloadProxyNative.getInstance().setClipInfo(i3, tPDownloadParam.getClipNo(), str, i2, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                TPListenerManager.getInstance().setPlayListener(i, iTPPlayListener);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPlay failed, error:" + th.toString());
            }
        }
        return i;
    }

    public int startPreload(String str, TPDownloadParam tPDownloadParam, ITPPreLoadListener iTPPreLoadListener) {
        int i = -1;
        if (TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                int dlType = tPDownloadParam.getDlType() + 200;
                i = TPDownloadProxyNative.getInstance().createDownloadTask(this.mServiceType, str, dlType, tPDownloadParam.getClipCount());
                TPListenerManager.getInstance().setPreLoadListener(i, iTPPreLoadListener);
                if (!TextUtils.isEmpty(tPDownloadParam.getKeyid())) {
                    str = tPDownloadParam.getKeyid();
                }
                int i2 = i;
                TPDownloadProxyNative.getInstance().setClipInfo(i2, tPDownloadParam.getClipNo(), str, dlType, tPDownloadParam.getCdnUrls(), tPDownloadParam.getSavaPath(), tPDownloadParam.getExtraJsonInfo());
                TPDownloadProxyNative.getInstance().startDownload(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startPreload failed, error:" + th.toString());
            }
        }
        return i;
    }

    public void startTask(int i) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().startDownload(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "startTask failed, error:" + th.toString());
            }
        }
    }

    public void stopOfflineDownload(int i) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i);
                TPListenerManager.getInstance().removeOfflineDownloadListener(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopOfflineDownload failed, error:" + th.toString());
            }
        }
    }

    public void stopPlay(int i) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i);
                TPListenerManager.getInstance().removePlayListener(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPlay failed, error:" + th.toString());
            }
        }
    }

    public void stopPreload(int i) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().stopDownload(i);
                TPListenerManager.getInstance().removePreLoadListener(i);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "stopPreload failed, error:" + th.toString());
            }
        }
    }

    public void updateStoragePath(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.mCurrentStoragePath = str;
                TPDownloadProxyNative.getInstance().updateStoragePath(this.mServiceType, str);
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateStoragePath failed, error:" + th.toString());
            }
        }
    }

    public void updateTaskInfo(int i, String str, Object obj) {
        if (i > 0 && TPDownloadProxyNative.getInstance().isNativeLoaded()) {
            try {
                TPDownloadProxyNative.getInstance().updateTaskInfo(i, str, obj.toString());
            } catch (Throwable th) {
                TPDLProxyLog.m21865e(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "updateTaskInfo failed, error:" + th.toString());
            }
        }
    }
}
