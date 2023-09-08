package com.tencent.thumbplayer.datatransport;

import com.tencent.thumbplayer.api.TPPlayerMgr;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyFactory;
import com.tencent.thumbplayer.datatransport.config.TPProxyConfig;
import com.tencent.thumbplayer.datatransport.config.TPProxyServiceConfig;
import com.tencent.thumbplayer.utils.TPGlobalEventNofication;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.thumbplayer.utils.TPNetworkChangeMonitor;
import com.tencent.xweb.file.XVFSFile;
import java.util.concurrent.ConcurrentHashMap;

public class TPProxyGlobalManager implements TPGlobalEventNofication.OnGlobalEventChangeListener, TPNetworkChangeMonitor.OnNetStatusChangeListener {
    private static final String TAG = "TPProxyGlobalManager";
    private int mAppBackOrFront;
    private ConcurrentHashMap<Integer, ITPProxyManagerAdapter> mServiceTypeDownloadProxyMap;
    private String mUpc;
    private int mUpcState;

    public static class InstanceHolder {
        /* access modifiers changed from: private */
        public static TPProxyGlobalManager instance = new TPProxyGlobalManager();

        private InstanceHolder() {
        }
    }

    public static TPProxyGlobalManager getInstance() {
        return InstanceHolder.instance;
    }

    private void pushAllProxyManagerEvent(int i) {
        for (ITPProxyManagerAdapter pushEvent : this.mServiceTypeDownloadProxyMap.values()) {
            pushEvent.pushEvent(i);
        }
    }

    private void pushAllProxyManagerUpcChanged(String str, int i) {
        this.mUpc = str;
        this.mUpcState = i;
        for (ITPProxyManagerAdapter next : this.mServiceTypeDownloadProxyMap.values()) {
            next.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_UPC, str);
            next.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(i));
        }
    }

    public ITPProxyManagerAdapter getPlayerProxy(int i) {
        if (i < 0) {
            return null;
        }
        if (this.mServiceTypeDownloadProxyMap.containsKey(Integer.valueOf(i))) {
            return this.mServiceTypeDownloadProxyMap.get(Integer.valueOf(i));
        }
        ITPDownloadProxy tPDownloadProxy = TPDownloadProxyFactory.getTPDownloadProxy(i);
        if (tPDownloadProxy != null) {
            try {
                int init = tPDownloadProxy.init(TPPlayerMgr.getAppContext(), TPProxyConfig.getProxyInitParam(i));
                if (init < 0) {
                    TPLogUtil.m21897i(TAG, "downloadProxy init failed with status:" + init + " downloadProxy:" + tPDownloadProxy);
                    return null;
                }
                tPDownloadProxy.setLogListener(new ITPDLProxyLogListener() {
                    /* renamed from: d */
                    public int mo28881d(String str, int i, String str2, String str3) {
                        TPLogUtil.m21893d(str2, "[" + str + XVFSFile.PATH_SEPARATOR + i + "] " + str3);
                        return 0;
                    }

                    /* renamed from: e */
                    public int mo28882e(String str, int i, String str2, String str3) {
                        TPLogUtil.m21894e(str2, "[" + str + XVFSFile.PATH_SEPARATOR + i + "] " + str3);
                        return 0;
                    }

                    /* renamed from: i */
                    public int mo28883i(String str, int i, String str2, String str3) {
                        TPLogUtil.m21897i(str2, "[" + str + XVFSFile.PATH_SEPARATOR + i + "] " + str3);
                        return 0;
                    }

                    /* renamed from: w */
                    public int mo28884w(String str, int i, String str2, String str3) {
                        TPLogUtil.m21899w(str2, "[" + str + XVFSFile.PATH_SEPARATOR + i + "] " + str3);
                        return 0;
                    }
                });
                TPProxyServiceConfig proxyConfig = TPProxyConfig.getProxyConfig(i);
                int networkStatus = TPNetworkChangeMonitor.getNetworkStatus();
                if (networkStatus == 1) {
                    tPDownloadProxy.pushEvent(1);
                    tPDownloadProxy.pushEvent(10);
                } else if (networkStatus == 2) {
                    tPDownloadProxy.pushEvent(2);
                    tPDownloadProxy.pushEvent(9);
                } else if (networkStatus == 3) {
                    tPDownloadProxy.pushEvent(2);
                    tPDownloadProxy.pushEvent(10);
                }
                tPDownloadProxy.pushEvent(this.mAppBackOrFront);
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC, this.mUpc);
                tPDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(this.mUpcState));
                long j = proxyConfig.maxUseStorageMB;
                if (j > 0) {
                    tPDownloadProxy.setMaxStorageSizeMB(j);
                }
                TPProxyManagerAdapterImpl tPProxyManagerAdapterImpl = new TPProxyManagerAdapterImpl(tPDownloadProxy);
                this.mServiceTypeDownloadProxyMap.put(Integer.valueOf(i), tPProxyManagerAdapterImpl);
                TPLogUtil.m21897i(TAG, "getPlayerProxy, init proxy succeeded, serviceType:" + i);
                return tPProxyManagerAdapterImpl;
            } catch (Throwable th) {
                TPLogUtil.m21894e(TAG, "init proxy failed:" + th);
            }
        }
        return null;
    }

    public void onEvent(int i, int i2, int i3, Object obj) {
        TPLogUtil.m21897i(TAG, "onEvent eventId: " + i + ", arg1: " + i2 + ", arg2: " + i3 + ", object" + obj);
        switch (i) {
            case 100001:
                this.mAppBackOrFront = 13;
                pushAllProxyManagerEvent(13);
                return;
            case 100002:
                this.mAppBackOrFront = 14;
                pushAllProxyManagerEvent(14);
                return;
            case TPGlobalEventNofication.EVENT_ID_UPC_CHANGED /*100003*/:
                pushAllProxyManagerUpcChanged((String) obj, i2);
                return;
            default:
                return;
        }
    }

    public void onStatusChanged(int i, int i2, int i3, int i4) {
        if (i2 == 1) {
            pushAllProxyManagerEvent(1);
            pushAllProxyManagerEvent(10);
        } else if (i2 == 2) {
            pushAllProxyManagerEvent(2);
            pushAllProxyManagerEvent(9);
        } else if (i2 == 3) {
            pushAllProxyManagerEvent(2);
            pushAllProxyManagerEvent(10);
        }
    }

    public void proxyInit() {
        getInstance().getPlayerProxy(TPPlayerConfig.getProxyServiceType());
    }

    public void updateDataReportEnable(boolean z) {
        for (ITPProxyManagerAdapter downloadProxy : this.mServiceTypeDownloadProxyMap.values()) {
            downloadProxy.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, TPProxyServiceConfig.Helper.reportEnableJsonConfig(z));
        }
    }

    public void updateMaxStorageSizeMB(long j) {
        for (ITPProxyManagerAdapter downloadProxy : this.mServiceTypeDownloadProxyMap.values()) {
            ITPDownloadProxy downloadProxy2 = downloadProxy.getDownloadProxy();
            if (downloadProxy2 != null && j > 0) {
                downloadProxy2.setMaxStorageSizeMB(j);
            }
        }
    }

    public void updateMaxUseMemoryMB(long j) {
        for (ITPProxyManagerAdapter next : this.mServiceTypeDownloadProxyMap.values()) {
            if (next.getDownloadProxy() != null && j > 0) {
                next.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, TPProxyServiceConfig.Helper.maxUseMemoryMBJsonConfig(j));
            }
        }
    }

    public void updateVodCachedEnable(boolean z) {
        for (ITPProxyManagerAdapter next : this.mServiceTypeDownloadProxyMap.values()) {
            if (next.getDownloadProxy() != null) {
                next.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_SERVICE_CONFIG, TPProxyServiceConfig.Helper.vodCachedEnableJsonConfig(z));
            }
        }
    }

    private TPProxyGlobalManager() {
        this.mAppBackOrFront = 0;
        this.mUpc = "";
        this.mUpcState = 0;
        if (this.mServiceTypeDownloadProxyMap == null) {
            this.mServiceTypeDownloadProxyMap = new ConcurrentHashMap<>();
        }
        TPGlobalEventNofication.addEventListener(this);
        TPNetworkChangeMonitor.getInstance().addOnNetStatusChangeListener(this);
    }

    public void updateMaxStorageSizeMB(int i, long j) {
        ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(Integer.valueOf(i));
        if (iTPProxyManagerAdapter != null && iTPProxyManagerAdapter.getDownloadProxy() != null && j > 0) {
            iTPProxyManagerAdapter.getDownloadProxy().setMaxStorageSizeMB(j);
        }
    }

    public void updateDataReportEnable(int i, boolean z) {
        ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(Integer.valueOf(i));
        if (iTPProxyManagerAdapter != null && iTPProxyManagerAdapter.getDownloadProxy() != null) {
            iTPProxyManagerAdapter.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, TPProxyServiceConfig.Helper.reportEnableJsonConfig(z));
        }
    }

    public void updateMaxUseMemoryMB(int i, long j) {
        ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(Integer.valueOf(i));
        if (iTPProxyManagerAdapter != null && iTPProxyManagerAdapter.getDownloadProxy() != null && j > 0) {
            iTPProxyManagerAdapter.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_PROXY_CONFIG, TPProxyServiceConfig.Helper.maxUseMemoryMBJsonConfig(j));
        }
    }

    public void updateVodCachedEnable(int i, boolean z) {
        ITPProxyManagerAdapter iTPProxyManagerAdapter = this.mServiceTypeDownloadProxyMap.get(Integer.valueOf(i));
        if (iTPProxyManagerAdapter != null && iTPProxyManagerAdapter.getDownloadProxy() != null) {
            iTPProxyManagerAdapter.getDownloadProxy().setUserData(TPDownloadProxyEnum.USER_SERVICE_CONFIG, TPProxyServiceConfig.Helper.vodCachedEnableJsonConfig(z));
        }
    }
}
