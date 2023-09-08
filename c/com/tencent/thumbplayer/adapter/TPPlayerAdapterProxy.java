package com.tencent.thumbplayer.adapter;

import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPDrmInfo;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.event.TPPlayerEventInfo;
import com.tencent.thumbplayer.tplayer.TPContext;
import com.tencent.thumbplayer.utils.TPLogUtil;
import com.tencent.tmassistantsdk.downloadservice.DownloadSetting;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class TPPlayerAdapterProxy implements InvocationHandler {
    private static final String METHOD_NAME_PAUSE = "pause";
    private static final String METHOD_NAME_PREPARE = "prepareAsync";
    private static final String METHOD_NAME_RELEASE = "release";
    private static final String METHOD_NAME_RESET = "reset";
    private static final String METHOD_NAME_SEEK_TO = "seekTo";
    private static final String METHOD_NAME_SELECT_TRACK = "selectTrack";
    private static final String METHOD_NAME_SET_ON_ERROR_LISTENER = "setOnErrorListener";
    private static final String METHOD_NAME_SET_ON_INFO_LISTENER = "setOnInfoListener";
    private static final String METHOD_NAME_SET_ON_PREPARED_LISTENER = "setOnPreparedListener";
    private static final String METHOD_NAME_SET_ON_SEEK_COMPLETION_LISTENER = "setOnSeekCompleteListener";
    private static final String METHOD_NAME_SET_PLAY_SPEED = "setPlaySpeedRatio";
    private static final String METHOD_NAME_START = "start";
    private static final String METHOD_NAME_STOP = "stop";
    private static final Map<String, Class> REPORT_LISTENER_CLASS_MAP;
    private static final String TAG = "TPPlayerAdapterProxy";
    /* access modifiers changed from: private */
    public TPPlayerAdapter mPlayerAdapter;
    private Object mPlayerAdapterInterfaceProxy;
    private TPPlayerAdapterProxyListeners mPlayerAdapterProxyListeners;
    /* access modifiers changed from: private */
    public TPPlayerBaseListeners mPlayerBaseListeners = new TPPlayerBaseListeners(TAG);
    /* access modifiers changed from: private */
    public TPContext mPlayerContext;

    public class TPPlayerAdapterProxyListeners implements ITPPlayerBaseListener.IOnPreparedListener, ITPPlayerBaseListener.IOnInfoListener, ITPPlayerBaseListener.IOnErrorListener, ITPPlayerBaseListener.IOnSeekCompleteListener, ITPPlayerBaseListener.IOnEventRecordListener {
        private TPPlayerAdapterProxyListeners() {
        }

        private void publishBufferingEndEvent(long j, long j2, Object obj) {
            TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.BufferingEndEventInfo());
        }

        private void publishBufferingStartEvent(long j, long j2, Object obj) {
            TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.BufferingStartEventInfo());
        }

        private void publishSelectTrackEndEvent(long j, long j2, Object obj) {
            TPPlayerEventInfo.SelectTrackEndEventInfo selectTrackEndEventInfo = new TPPlayerEventInfo.SelectTrackEndEventInfo();
            selectTrackEndEventInfo.setOpaque(((Long) obj).longValue());
            selectTrackEndEventInfo.setErrorCode((int) j2);
            TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(selectTrackEndEventInfo);
        }

        public void onDrmInfo(TPDrmInfo tPDrmInfo) {
            TPPlayerEventInfo.DrmEventInfo drmEventInfo = new TPPlayerEventInfo.DrmEventInfo();
            drmEventInfo.setDrmInfo(tPDrmInfo);
            TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(drmEventInfo);
            TPPlayerAdapterProxy.this.mPlayerBaseListeners.onDrmInfo(tPDrmInfo);
        }

        public void onError(@TPCommonEnum.TPErrorType int i, int i2, long j, long j2) {
            TPPlayerEventInfo.PlayErrorEventInfo playErrorEventInfo = new TPPlayerEventInfo.PlayErrorEventInfo();
            playErrorEventInfo.setErrorCode(i2);
            playErrorEventInfo.setErrorType(i);
            TPGeneralPlayFlowParams generalPlayFlowParams = TPPlayerAdapterProxy.this.mPlayerAdapter.getGeneralPlayFlowParams();
            if (generalPlayFlowParams == null) {
                generalPlayFlowParams = new TPGeneralPlayFlowParams();
            }
            playErrorEventInfo.setGeneralPlayFlowParams(generalPlayFlowParams);
            TPDynamicStatisticParams dynamicStatisticParams = TPPlayerAdapterProxy.this.mPlayerAdapter.getDynamicStatisticParams(false);
            if (dynamicStatisticParams == null) {
                dynamicStatisticParams = new TPDynamicStatisticParams();
            }
            playErrorEventInfo.setDynamicStatisticParams(dynamicStatisticParams);
            TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(playErrorEventInfo);
            TPPlayerAdapterProxy.this.mPlayerBaseListeners.onError(i, i2, j, j2);
        }

        public void onInfo(int i, long j, long j2, Object obj) {
            if (i == 4) {
                publishSelectTrackEndEvent(j, j2, obj);
            } else if (i == 200) {
                publishBufferingStartEvent(j, j2, obj);
            } else if (i == 201) {
                publishBufferingEndEvent(j, j2, obj);
            }
            TPPlayerAdapterProxy.this.mPlayerBaseListeners.onInfo(i, j, j2, obj);
        }

        public void onPrepared() {
            TPPlayerEventInfo.PrepareEndEventInfo prepareEndEventInfo = new TPPlayerEventInfo.PrepareEndEventInfo();
            prepareEndEventInfo.setPlayerType(TPPlayerAdapterProxy.this.mPlayerAdapter.getPlayerType());
            prepareEndEventInfo.setDurationMs(TPPlayerAdapterProxy.this.mPlayerAdapter.getDurationMs());
            TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(prepareEndEventInfo);
            TPPlayerAdapterProxy.this.mPlayerBaseListeners.onPrepared();
        }

        public void onSeekComplete() {
            TPPlayerAdapterProxy.this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.SeekEndEventInfo());
            TPPlayerAdapterProxy.this.mPlayerBaseListeners.onSeekComplete();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        REPORT_LISTENER_CLASS_MAP = hashMap;
        hashMap.put(METHOD_NAME_SET_ON_PREPARED_LISTENER, ITPPlayerBaseListener.IOnPreparedListener.class);
        hashMap.put(METHOD_NAME_SET_ON_INFO_LISTENER, ITPPlayerBaseListener.IOnInfoListener.class);
        hashMap.put(METHOD_NAME_SET_ON_ERROR_LISTENER, ITPPlayerBaseListener.IOnErrorListener.class);
        hashMap.put(METHOD_NAME_SET_ON_SEEK_COMPLETION_LISTENER, ITPPlayerBaseListener.IOnSeekCompleteListener.class);
    }

    public TPPlayerAdapterProxy(TPPlayerAdapter tPPlayerAdapter, TPContext tPContext) {
        TPPlayerAdapterProxyListeners tPPlayerAdapterProxyListeners = new TPPlayerAdapterProxyListeners();
        this.mPlayerAdapterProxyListeners = tPPlayerAdapterProxyListeners;
        this.mPlayerAdapter = tPPlayerAdapter;
        this.mPlayerContext = tPContext;
        tPPlayerAdapter.setOnEventRecordListener(tPPlayerAdapterProxyListeners);
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

    private void doHookListener(Method method, Object[] objArr) {
        Map<String, Class> map = REPORT_LISTENER_CLASS_MAP;
        if (map.containsKey(method.getName())) {
            try {
                this.mPlayerBaseListeners.getClass().getMethod(method.getName(), new Class[]{map.get(method.getName())}).invoke(this.mPlayerBaseListeners, new Object[]{objArr[0]});
                objArr[0] = this.mPlayerAdapterProxyListeners;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
    }

    private void doPublishEventIfNeed(Method method, Object[] objArr) {
        String name = method.getName();
        name.getClass();
        char c = 65535;
        switch (name.hashCode()) {
            case -2055859787:
                if (name.equals(METHOD_NAME_PREPARE)) {
                    c = 0;
                    break;
                }
                break;
            case -906224877:
                if (name.equals(METHOD_NAME_SEEK_TO)) {
                    c = 1;
                    break;
                }
                break;
            case 3540994:
                if (name.equals(METHOD_NAME_STOP)) {
                    c = 2;
                    break;
                }
                break;
            case 106440182:
                if (name.equals(METHOD_NAME_PAUSE)) {
                    c = 3;
                    break;
                }
                break;
            case 108404047:
                if (name.equals(METHOD_NAME_RESET)) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (name.equals("start")) {
                    c = 5;
                    break;
                }
                break;
            case 205228463:
                if (name.equals(METHOD_NAME_SELECT_TRACK)) {
                    c = 6;
                    break;
                }
                break;
            case 218603354:
                if (name.equals(METHOD_NAME_SET_PLAY_SPEED)) {
                    c = 7;
                    break;
                }
                break;
            case 1090594823:
                if (name.equals("release")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                publishPrepareEvent(objArr);
                return;
            case 1:
                publishSeekToEvent(objArr);
                return;
            case 2:
                publishStopEvent(objArr);
                return;
            case 3:
                publishPauseEvent(objArr);
                return;
            case 4:
                publishResetEvent(objArr);
                return;
            case 5:
                publishStartEvent(objArr);
                return;
            case 6:
                publishSelectTrackEvent(objArr);
                return;
            case 7:
                publishSetPlaySpeedRatioEvent(objArr);
                return;
            case 8:
                publishReleaseEvent(objArr);
                return;
            default:
                return;
        }
    }

    private void publishPauseEvent(Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.PlayPauseEventInfo());
    }

    private void publishPrepareEvent(Object[] objArr) {
    }

    private void publishReleaseEvent(Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.PlayReleaseEventInfo());
    }

    private void publishResetEvent(Object[] objArr) {
        TPPlayerEventInfo.PlayResetEventInfo playResetEventInfo = new TPPlayerEventInfo.PlayResetEventInfo();
        TPGeneralPlayFlowParams generalPlayFlowParams = this.mPlayerAdapter.getGeneralPlayFlowParams();
        if (generalPlayFlowParams == null) {
            generalPlayFlowParams = new TPGeneralPlayFlowParams();
        }
        playResetEventInfo.setGeneralPlayFlowParams(generalPlayFlowParams);
        TPDynamicStatisticParams dynamicStatisticParams = this.mPlayerAdapter.getDynamicStatisticParams(false);
        if (dynamicStatisticParams == null) {
            dynamicStatisticParams = new TPDynamicStatisticParams();
        }
        playResetEventInfo.setDynamicStatisticParams(dynamicStatisticParams);
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(playResetEventInfo);
    }

    private void publishSeekToEvent(Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.SeekStartEventInfo());
    }

    private void publishSelectTrackEvent(Object[] objArr) {
        TPPlayerEventInfo.SelectTrackStartEventInfo selectTrackStartEventInfo = new TPPlayerEventInfo.SelectTrackStartEventInfo();
        selectTrackStartEventInfo.setTrackIndex(objArr[0].intValue());
        selectTrackStartEventInfo.setOpaque(objArr[1].longValue());
        selectTrackStartEventInfo.setTrackInfo(this.mPlayerAdapter.getTrackInfo()[objArr[0].intValue()]);
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(selectTrackStartEventInfo);
    }

    private void publishSetPlaySpeedRatioEvent(Object[] objArr) {
        TPPlayerEventInfo.SetPlaySpeedEventInfo setPlaySpeedEventInfo = new TPPlayerEventInfo.SetPlaySpeedEventInfo();
        setPlaySpeedEventInfo.setPlaySpeedRatio(objArr[0].floatValue());
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(setPlaySpeedEventInfo);
    }

    private void publishStartEvent(Object[] objArr) {
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(new TPPlayerEventInfo.PlayStartEventInfo());
    }

    private void publishStopEvent(Object[] objArr) {
        TPPlayerEventInfo.PlayStopEventInfo playStopEventInfo = new TPPlayerEventInfo.PlayStopEventInfo();
        TPGeneralPlayFlowParams generalPlayFlowParams = this.mPlayerAdapter.getGeneralPlayFlowParams();
        if (generalPlayFlowParams == null) {
            generalPlayFlowParams = new TPGeneralPlayFlowParams();
        }
        playStopEventInfo.setGeneralPlayFlowParams(generalPlayFlowParams);
        TPDynamicStatisticParams dynamicStatisticParams = this.mPlayerAdapter.getDynamicStatisticParams(false);
        if (dynamicStatisticParams == null) {
            dynamicStatisticParams = new TPDynamicStatisticParams();
        }
        playStopEventInfo.setDynamicStatisticParams(dynamicStatisticParams);
        this.mPlayerContext.getPlayerEventPublisher().publishEvent(playStopEventInfo);
    }

    public synchronized Object getProxyInstance() {
        if (this.mPlayerAdapterInterfaceProxy == null) {
            this.mPlayerAdapterInterfaceProxy = Proxy.newProxyInstance(this.mPlayerAdapter.getClass().getClassLoader(), this.mPlayerAdapter.getClass().getInterfaces(), this);
        }
        return this.mPlayerAdapterInterfaceProxy;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            doPublishEventIfNeed(method, objArr);
            doHookListener(method, objArr);
            return method.invoke(this.mPlayerAdapter, objArr);
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
