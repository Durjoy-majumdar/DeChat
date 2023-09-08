package com.tencent.thumbplayer.datatransport;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.thumbplayer.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPDownloadProxy;
import com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.xweb.file.XVFSFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class TPPreloadProxyImpl implements ITPPreloadProxy {
    private static final int LOD_P2P_TIMES = 3;
    private static final int PRELOAD_ID_INVALID = -1;
    private static final String TAG = "TPPreloadProxyImpl";
    private boolean loadProxySucc = false;
    private Context mContext;
    private ITPDownloadProxy mDownloadProxy;
    private InnerProxyListener mInnerProxyListener = new InnerProxyListener();
    /* access modifiers changed from: private */
    public ITPPreloadProxy.IPreloadListener mPreloadListener = new TPPlayProxyListenerEmptyImpl(TAG);
    private int mServiceType;

    public class InnerProxyListener implements ITPPreLoadListener, ITPDLProxyLogListener {
        private InnerProxyListener() {
        }

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

        public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
            TPPreloadProxyImpl.this.mPreloadListener.onPrepareDownloadProgressUpdate(i, i2, j, j2);
        }

        public void onPrepareError(int i, int i2, String str) {
            TPPreloadProxyImpl.this.mPreloadListener.onPrepareError();
        }

        public void onPrepareOK() {
            TPPreloadProxyImpl.this.mPreloadListener.onPrepareSuccess();
        }

        /* renamed from: w */
        public int mo28884w(String str, int i, String str2, String str3) {
            TPLogUtil.m21899w(str2, "[" + str + XVFSFile.PATH_SEPARATOR + i + "] " + str3);
            return 0;
        }
    }

    public TPPreloadProxyImpl(Context context, int i) {
        this.mContext = context;
        this.mServiceType = i;
        initProxy();
    }

    private void initProxy() {
        int i = 3;
        while (i > 0 && !this.loadProxySucc) {
            try {
                ITPProxyManagerAdapter playerProxy = TPProxyGlobalManager.getInstance().getPlayerProxy(this.mServiceType);
                if (playerProxy == null || playerProxy.getDownloadProxy() == null) {
                    i--;
                    TPLogUtil.m21894e(TAG, "p2p so load failed");
                } else {
                    ITPDownloadProxy downloadProxy = playerProxy.getDownloadProxy();
                    this.mDownloadProxy = downloadProxy;
                    downloadProxy.setLogListener(this.mInnerProxyListener);
                    this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_IS_VIP, Boolean.valueOf(TPPlayerConfig.isUserIsVip()));
                    if (!TextUtils.isEmpty(TPPlayerConfig.getUserUin())) {
                        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UIN, TPPlayerConfig.getUserUin());
                    }
                    if (!TextUtils.isEmpty(TPPlayerConfig.getAppVersionName(this.mContext))) {
                        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_APP_VERSION, TPPlayerConfig.getAppVersionName(this.mContext));
                    }
                    if (TPPlayerConfig.getBuildNumber(this.mContext) != -1) {
                        this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_APP_VERSION_CODE, String.valueOf(TPPlayerConfig.getBuildNumber(this.mContext)));
                    }
                    this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC, TPPlayerConfig.getUserUpc());
                    this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_UPC_STATE, Integer.valueOf(TPPlayerConfig.getUserUpcState()));
                    this.mDownloadProxy.setUserData(TPDownloadProxyEnum.USER_EXTERNAL_NETWORK_IP, TPPlayerConfig.getOutNetIp());
                    this.loadProxySucc = true;
                    return;
                }
            } catch (Exception e) {
                i--;
                TPLogUtil.m21895e(TAG, (Throwable) e);
            }
        }
    }

    public String getPlayErrorCodeStr(int i) {
        return null;
    }

    public boolean isAvailable() {
        return this.mDownloadProxy != null && this.loadProxySucc;
    }

    public void pushEvent(int i) {
        if (isAvailable()) {
            try {
                this.mDownloadProxy.pushEvent(i);
            } catch (Throwable th) {
                TPLogUtil.m21895e(TAG, th);
            }
        }
    }

    public void setPreloadListener(ITPPreloadProxy.IPreloadListener iPreloadListener) {
        if (iPreloadListener == null) {
            this.mPreloadListener = new TPPlayProxyListenerEmptyImpl(TAG);
        } else {
            this.mPreloadListener = iPreloadListener;
        }
    }

    public int startClipPreload(String str, ArrayList<TPDownloadParamData> arrayList) {
        TPLogUtil.m21897i(TAG, "[startClipPreload] Preloading clips.");
        if (arrayList == null) {
            TPLogUtil.m21894e(TAG, "[startClipPreload] Fail to start clip preload: null download parameter list.");
            return -1;
        }
        if (!isAvailable()) {
            initProxy();
            if (!isAvailable()) {
                TPLogUtil.m21894e(TAG, "[startClipPreload] Fail to initialize proxy.");
                return -1;
            }
        }
        int startClipPreload = this.mDownloadProxy.startClipPreload(str, arrayList.size(), this.mInnerProxyListener);
        if (startClipPreload <= 0) {
            TPLogUtil.m21894e(TAG, "[startClipPreload] Fail to start clip preload: invalid preload ID.");
            stopPreload(startClipPreload);
            return -1;
        }
        Iterator<TPDownloadParamData> it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            TPDownloadParamData next = it.next();
            if (!this.mDownloadProxy.setClipInfo(startClipPreload, i, next.getDownloadFileID(), TPProxyUtils.convertProxyDownloadParams(next.getUrl(), next, (Map<String, String>) null, (Map<String, Object>) null))) {
                TPLogUtil.m21894e(TAG, "[startClipPreload] Fail to set clip info.");
                stopPreload(startClipPreload);
                return -1;
            }
            i++;
        }
        try {
            this.mDownloadProxy.startTask(startClipPreload);
            return startClipPreload;
        } catch (Throwable th) {
            TPLogUtil.m21894e(TAG, "[startClipPreload] Fail to start task: " + th.toString());
            stopPreload(startClipPreload);
            return -1;
        }
    }

    public int startPreload(String str, TPDownloadParamData tPDownloadParamData) {
        return startPreload(str, tPDownloadParamData, (Map<String, String>) null);
    }

    public void stopPreload(int i) {
        ITPDownloadProxy iTPDownloadProxy = this.mDownloadProxy;
        if (iTPDownloadProxy != null) {
            try {
                iTPDownloadProxy.stopPreload(i);
            } catch (Throwable th) {
                TPLogUtil.m21895e(TAG, th);
            }
        }
    }

    public int startPreload(String str, TPDownloadParamData tPDownloadParamData, Map<String, String> map) {
        if (!isAvailable()) {
            initProxy();
            if (!isAvailable()) {
                return -1;
            }
        }
        if (tPDownloadParamData != null) {
            try {
                return this.mDownloadProxy.startPreload(str, TPProxyUtils.convertProxyDownloadParams((String) null, tPDownloadParamData, map, (Map<String, Object>) null), this.mInnerProxyListener);
            } catch (Throwable th) {
                TPLogUtil.m21895e(TAG, th);
            }
        }
        return -1;
    }
}
