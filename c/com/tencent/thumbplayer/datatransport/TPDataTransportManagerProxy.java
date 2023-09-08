package com.tencent.thumbplayer.datatransport;

import com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.TPContext;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class TPDataTransportManagerProxy implements InvocationHandler {
    private static final String METHOD_NAME_SET_PLAYER_LISTENER = "setPlayListener";
    private static final String METHOD_NAME_START_DOWNLOAD_PLAY = "startDownloadPlay";
    private static final String METHOD_NAME_START_DOWNLOAD_PLAY_BY_ASSET = "startDownloadPlayByAsset";
    private static final String TAG = "TPDataTransportManagerProxy";
    private TPPlayManagerImpl mPlayManagerImpl;
    private Object mPlayManagerImplInterfaceProxy;
    /* access modifiers changed from: private */
    public ITPPlayListener mPlayManagerImplListener;
    private TPPlayManagerImplProxyListener mPlayManagerImplProxyListener = new TPPlayManagerImplProxyListener();
    /* access modifiers changed from: private */
    public TPContext mPlayerContext;

    public class TPPlayManagerImplProxyListener implements ITPPlayListener {
        private TPPlayManagerImplProxyListener() {
        }

        public long getAdvRemainTime() {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getAdvRemainTime();
        }

        public String getContentType(int i, String str) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getContentType(i, str);
        }

        public int getCurrentPlayClipNo() {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getCurrentPlayClipNo();
        }

        public long getCurrentPlayOffset() {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getCurrentPlayOffset();
        }

        public long getCurrentPosition() {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getCurrentPosition();
        }

        public String getDataFilePath(int i, String str) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getDataFilePath(i, str);
        }

        public long getDataTotalSize(int i, String str) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getDataTotalSize(i, str);
        }

        public Object getPlayInfo(long j) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getPlayInfo(j);
        }

        public long getPlayerBufferLength() {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getPlayerBufferLength();
        }

        public void onDownloadCdnUrlExpired(Map<String, String> map) {
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadCdnUrlExpired(map);
        }

        public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) {
            TPPlayerEventInfo.DTCdnUrlUpdataEventInfo dTCdnUrlUpdataEventInfo = new TPPlayerEventInfo.DTCdnUrlUpdataEventInfo();
            dTCdnUrlUpdataEventInfo.setCdnIp(str2);
            dTCdnUrlUpdataEventInfo.setUserIp(str3);
            TPDataTransportManagerProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(dTCdnUrlUpdataEventInfo);
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadCdnUrlInfoUpdate(str, str2, str3, str4);
        }

        public void onDownloadCdnUrlUpdate(String str) {
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadCdnUrlUpdate(str);
        }

        public void onDownloadError(int i, int i2, String str) {
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadError(i, i2, str);
        }

        public void onDownloadFinish() {
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadFinish();
        }

        public void onDownloadProgressUpdate(int i, int i2, long j, long j2, String str) {
            TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo dTDownloadProgressUpdataEventInfo = new TPPlayerEventInfo.DTDownloadProgressUpdataEventInfo();
            dTDownloadProgressUpdataEventInfo.setDownloadSpeedKbps(i2 * 8);
            TPDataTransportManagerProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(dTDownloadProgressUpdataEventInfo);
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadProgressUpdate(i, i2, j, j2, str);
        }

        public void onDownloadProtocolUpdate(String str, String str2) {
            TPPlayerEventInfo.DTProtocalUpdateEventInfo dTProtocalUpdateEventInfo = new TPPlayerEventInfo.DTProtocalUpdateEventInfo();
            dTProtocalUpdateEventInfo.setProtocol(str);
            dTProtocalUpdateEventInfo.setProtocolVer(str2);
            TPDataTransportManagerProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(dTProtocalUpdateEventInfo);
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadProtocolUpdate(str, str2);
        }

        public void onDownloadStatusUpdate(int i) {
            TPDataTransportManagerProxy.this.mPlayManagerImplListener.onDownloadStatusUpdate(i);
        }

        public Object onPlayCallback(int i, Object obj, Object obj2, Object obj3, Object obj4) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.onPlayCallback(i, obj, obj2, obj3, obj4);
        }

        public int onReadData(int i, String str, long j, long j2) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.onReadData(i, str, j, j2);
        }

        public int onStartReadData(int i, String str, long j, long j2) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.onStartReadData(i, str, j, j2);
        }

        public int onStopReadData(int i, String str, int i2) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.onStopReadData(i, str, i2);
        }

        public Object getPlayInfo(String str) {
            return TPDataTransportManagerProxy.this.mPlayManagerImplListener.getPlayInfo(str);
        }
    }

    public TPDataTransportManagerProxy(TPPlayManagerImpl tPPlayManagerImpl, TPContext tPContext) {
        this.mPlayManagerImpl = tPPlayManagerImpl;
        this.mPlayerContext = tPContext;
    }

    private static Object dealReturn(Method method) {
        String name = method.getReturnType().getName();
        if (name.equals(DownloadSetting.TYPE_BOOLEAN)) {
            return Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return Float.valueOf(0.0f);
        }
        return null;
    }

    private void hookListenerIfNeed(Method method, Object[] objArr) {
        if (method.getName().equals(METHOD_NAME_SET_PLAYER_LISTENER)) {
            this.mPlayManagerImplListener = objArr[0];
            objArr[0] = this.mPlayManagerImplProxyListener;
        }
    }

    private void publishEventAfterMethodInvokeIfNeed(Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        if (name.equals(METHOD_NAME_START_DOWNLOAD_PLAY_BY_ASSET) || name.equals(METHOD_NAME_START_DOWNLOAD_PLAY)) {
            publishReturnConvertedUrlEvent(objArr);
        }
    }

    private void publishReturnConvertedUrlEvent(Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.DTReturnConvertedUrlEventInfo());
    }

    public synchronized Object getProxyInstance() {
        if (this.mPlayManagerImplInterfaceProxy == null) {
            this.mPlayManagerImplInterfaceProxy = Proxy.newProxyInstance(this.mPlayManagerImpl.getClass().getClassLoader(), this.mPlayManagerImpl.getClass().getInterfaces(), this);
        }
        return this.mPlayManagerImplInterfaceProxy;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        hookListenerIfNeed(method, objArr);
        try {
            Object invoke = method.invoke(this.mPlayManagerImpl, objArr);
            publishEventAfterMethodInvokeIfNeed(method, objArr);
            return invoke;
        } catch (InvocationTargetException e) {
            if (e.getTargetException() == null) {
                TPLogUtil.m21894e(TAG, "invokeMethod " + method.getName() + " has excecption: " + e.toString());
                return dealReturn(method);
            }
            throw e.getTargetException();
        } catch (Throwable th) {
            TPLogUtil.m21894e(TAG, "invokeMethod " + method.getName() + " has excecption: " + th.toString());
            return dealReturn(method);
        }
    }
}
