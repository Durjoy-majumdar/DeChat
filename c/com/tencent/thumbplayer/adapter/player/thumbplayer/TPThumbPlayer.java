package com.tencent.thumbplayer.adapter.player.thumbplayer;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.adapter.TPPlayerBaseListeners;
import com.tencent.thumbplayer.adapter.player.ITPCapture;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBase;
import com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener;
import com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap;
import com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil;
import com.tencent.thumbplayer.api.TPAudioAttributes;
import com.tencent.thumbplayer.api.TPCaptureCallBack;
import com.tencent.thumbplayer.api.TPCaptureParams;
import com.tencent.thumbplayer.api.TPCommonEnum;
import com.tencent.thumbplayer.api.TPHlsTag;
import com.tencent.thumbplayer.api.TPJitterBufferConfig;
import com.tencent.thumbplayer.api.TPOptionalParam;
import com.tencent.thumbplayer.api.TPPlayerMsg;
import com.tencent.thumbplayer.api.TPPostProcessFrameBuffer;
import com.tencent.thumbplayer.api.TPProgramInfo;
import com.tencent.thumbplayer.api.TPSubtitleData;
import com.tencent.thumbplayer.api.TPSubtitleRenderModel;
import com.tencent.thumbplayer.api.TPTrackInfo;
import com.tencent.thumbplayer.api.composition.ITPMediaAsset;
import com.tencent.thumbplayer.caputure.TPThumbCapture;
import com.tencent.thumbplayer.core.common.TPAudioFrame;
import com.tencent.thumbplayer.core.common.TPDetailInfo;
import com.tencent.thumbplayer.core.common.TPGeneralError;
import com.tencent.thumbplayer.core.common.TPMediaTrackHlsTag;
import com.tencent.thumbplayer.core.common.TPMediaTrackInfo;
import com.tencent.thumbplayer.core.common.TPPostProcessFrame;
import com.tencent.thumbplayer.core.common.TPSubtitleFrame;
import com.tencent.thumbplayer.core.common.TPVideoFrame;
import com.tencent.thumbplayer.core.demuxer.ITPNativeDemuxerCallback;
import com.tencent.thumbplayer.core.demuxer.TPNativeRemoteSdpInfo;
import com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams;
import com.tencent.thumbplayer.core.player.ITPNativePlayerAudioFrameCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerEventRecordCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerPostProcessFrameCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerSubtitleFrameCallback;
import com.tencent.thumbplayer.core.player.ITPNativePlayerVideoFrameCallback;
import com.tencent.thumbplayer.core.player.TPDynamicStatisticParams;
import com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams;
import com.tencent.thumbplayer.core.player.TPNativePlayer;
import com.tencent.thumbplayer.core.player.TPNativePlayerInitConfig;
import com.tencent.thumbplayer.core.player.TPNativePlayerProgramInfo;
import com.tencent.thumbplayer.log.TPBaseLogger;
import com.tencent.thumbplayer.log.TPLoggerContext;
import com.tencent.xweb.IXWebBroadcastListener;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TPThumbPlayer implements ITPPlayerBase {
    private static final int EVENT_MSG_ASYNC_CALL = 1;
    private static final int EVENT_MSG_ON_DETAIL_INFO = 5;
    private static final int EVENT_MSG_ON_ERROR = 4;
    private static final int EVENT_MSG_ON_INFO_LONG = 2;
    private static final int EVENT_MSG_ON_INFO_OBJECT = 3;
    private static final String TAG = "TPThumbPlayer";
    public static final Set<Integer> sVerboseObjectInfoTypes = new HashSet<Integer>() {
        {
            add(503);
        }
    };
    /* access modifiers changed from: private */
    public EventHandler mEventHandler;
    private ITPCapture mImageGenerator;
    /* access modifiers changed from: private */
    public TPBaseLogger mLogger;
    private ITPNativePlayerAudioFrameCallback mNativeAudioFrameCallback = new ITPNativePlayerAudioFrameCallback() {
        public void onAudioFrame(TPAudioFrame tPAudioFrame, int i) {
            TPThumbPlayer.this.mPlayerListenerReps.onAudioPcmOut(TPThumbPlayerUtils.convert2TPAudioFrameBuffer(tPAudioFrame));
        }
    };
    private ITPNativeDemuxerCallback mNativeDemuxerCallback = new ITPNativeDemuxerCallback() {
        public TPNativeRemoteSdpInfo onSdpExchange(String str, int i) {
            return TPThumbPlayerUtils.convert2TPNativeRemoteSdpInfo(TPThumbPlayer.this.mPlayerListenerReps.onSdpExchange(str, i));
        }
    };
    private ITPNativePlayerEventRecordCallback mNativeEventRecordCallback = new ITPNativePlayerEventRecordCallback() {
        public void onDrmInfo(TPGeneralPlayFlowParams.TPPlayerDrmParams tPPlayerDrmParams) {
            if (tPPlayerDrmParams == null) {
                TPThumbPlayer.this.mLogger.error("Native DrmInfo is null!");
                return;
            }
            TPThumbPlayer.this.mLogger.info("onDrmInfo");
            TPThumbPlayer.this.mPlayerListenerReps.onDrmInfo(TPThumbPlayerUtils.convert2TPDrmInfo(tPPlayerDrmParams));
        }
    };
    private TPNativePlayerInitConfig mNativeInitConfig;
    private ITPNativePlayerMessageCallback mNativeMessageCallback = new ITPNativePlayerMessageCallback() {
        private void sendMessage(int i, Object obj) {
            if (TPThumbPlayer.this.mEventHandler != null) {
                Message.obtain(TPThumbPlayer.this.mEventHandler, i, obj).sendToTarget();
            }
        }

        public void onASyncCallResult(int i, long j, int i2, int i3) {
            TPBaseLogger access$000 = TPThumbPlayer.this.mLogger;
            access$000.info("onASyncCallResult, callType:" + i + ", opaque:" + j + ", errorType:" + i2 + ", errorCode:" + i3);
            OnASyncCallResultInfo onASyncCallResultInfo = new OnASyncCallResultInfo();
            onASyncCallResultInfo.callType = i;
            onASyncCallResultInfo.opaque = j;
            onASyncCallResultInfo.errorType = i2;
            onASyncCallResultInfo.errorCode = i3;
            sendMessage(1, onASyncCallResultInfo);
        }

        public void onDetailInfo(TPDetailInfo tPDetailInfo) {
            TPBaseLogger access$000 = TPThumbPlayer.this.mLogger;
            access$000.info("onDetailInfo, type:" + tPDetailInfo.type + ", time:" + tPDetailInfo.timeSince1970Us);
            sendMessage(5, tPDetailInfo);
        }

        public void onError(int i, int i2) {
            TPBaseLogger access$000 = TPThumbPlayer.this.mLogger;
            access$000.info("onError, msgType:" + i + ", errorCode:" + i2);
            OnErrorInfo onErrorInfo = new OnErrorInfo();
            onErrorInfo.msgType = i;
            onErrorInfo.errorCode = i2;
            sendMessage(4, onErrorInfo);
        }

        public void onInfoLong(int i, long j, long j2) {
            TPBaseLogger access$000 = TPThumbPlayer.this.mLogger;
            access$000.info("onInfoLong, infoType:" + i + ", lParam1:" + j + ", lParam2:" + j2);
            if (i == 253) {
                TPDrmCapability.addDRMBlacklist(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapDrmType.class, (int) j));
                return;
            }
            OnInfoLongInfo onInfoLongInfo = new OnInfoLongInfo();
            onInfoLongInfo.infoType = i;
            onInfoLongInfo.lParam1 = j;
            onInfoLongInfo.lParam2 = j2;
            sendMessage(2, onInfoLongInfo);
        }

        public void onInfoObject(int i, Object obj) {
            if (!TPThumbPlayer.this.isObjectInfoTypeVerbose(i)) {
                TPBaseLogger access$000 = TPThumbPlayer.this.mLogger;
                access$000.info("onInfoObject, infoType:" + i + ", objParam:" + obj);
            }
            OnInfoObjectInfo onInfoObjectInfo = new OnInfoObjectInfo();
            onInfoObjectInfo.infoType = i;
            onInfoObjectInfo.objParam = obj;
            sendMessage(3, onInfoObjectInfo);
        }
    };
    private ITPNativePlayerPostProcessFrameCallback mNativePostProcessFrameCallback = new ITPNativePlayerPostProcessFrameCallback() {
        public TPPostProcessFrame onPostProcessFrame(TPPostProcessFrame tPPostProcessFrame, int i) {
            TPPostProcessFrameBuffer convert2TPPostProcessFrameBuffer = TPThumbPlayerUtils.convert2TPPostProcessFrameBuffer(tPPostProcessFrame);
            convert2TPPostProcessFrameBuffer.eventFlag = i;
            int i2 = tPPostProcessFrame.mediaType;
            if (i2 == 0) {
                return TPThumbPlayerUtils.convert2TPPostProcessFrame(TPThumbPlayer.this.mPlayerListenerReps.onVideoProcessFrameOut(convert2TPPostProcessFrameBuffer));
            }
            if (i2 == 1) {
                return TPThumbPlayerUtils.convert2TPPostProcessFrame(TPThumbPlayer.this.mPlayerListenerReps.onAudioProcessFrameOut(convert2TPPostProcessFrameBuffer));
            }
            return null;
        }
    };
    private ITPNativePlayerSubtitleFrameCallback mNativeSubtitleFrameCallback = new ITPNativePlayerSubtitleFrameCallback() {
        public void onSubtitleFrame(TPSubtitleFrame tPSubtitleFrame, int i) {
            TPThumbPlayer.this.mPlayerListenerReps.onSubtitleFrameOut(TPThumbPlayerUtils.convert2TPSubtitleFrameBuffer(tPSubtitleFrame));
        }
    };
    private ITPNativePlayerVideoFrameCallback mNativeVideoFrameCallback = new ITPNativePlayerVideoFrameCallback() {
        public void onVideoFrame(TPVideoFrame tPVideoFrame, int i) {
            TPThumbPlayer.this.mPlayerListenerReps.onVideoFrameOut(TPThumbPlayerUtils.convert2TPVideoFrameBuffer(tPVideoFrame));
        }
    };
    private TPNativePlayer mPlayer;
    /* access modifiers changed from: private */
    public TPPlayerBaseListeners mPlayerListenerReps;
    /* access modifiers changed from: private */
    public TPSubtitleData mSubtitleData = new TPSubtitleData();

    public class EventHandler extends Handler {
        private WeakReference<TPThumbPlayer> mWeakRef;

        public EventHandler(Looper looper, TPThumbPlayer tPThumbPlayer) {
            super(looper);
            this.mWeakRef = new WeakReference<>(tPThumbPlayer);
        }

        private void handleOnAsyncCallResult(OnASyncCallResultInfo onASyncCallResultInfo) {
            int i = onASyncCallResultInfo.callType;
            if (i == 1) {
                TPThumbPlayer.this.handleOnPrepared();
            } else if (i != 2) {
                TPThumbPlayer.this.handleCommonASyncCallResult(onASyncCallResultInfo);
            } else {
                TPThumbPlayer.this.handleOnSeekComplete();
            }
        }

        private void handleOnDetailInfo(TPDetailInfo tPDetailInfo) {
            TPThumbPlayer.this.mPlayerListenerReps.onDetailInfo(TPThumbPlayerUtils.convert2TPPlayerDetailInfo(tPDetailInfo));
        }

        private void handleOnError(@TPCommonEnum.NativeErrorType int i, int i2) {
            TPThumbPlayer.this.mPlayerListenerReps.onError(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapErrorType.class, i), i2, 0, 0);
        }

        private void handleOnInfoLong(OnInfoLongInfo onInfoLongInfo) {
            int i = onInfoLongInfo.infoType;
            if (i == 154) {
                TPThumbPlayer.this.handleOnComplete();
            } else if (i != 250) {
                TPThumbPlayer.this.handleOnInfoLongNoConvertToListener(i, onInfoLongInfo);
            } else {
                TPThumbPlayer.this.handleOnVideoSizeChanged(onInfoLongInfo.lParam1, onInfoLongInfo.lParam2);
            }
        }

        private void handleOnInfoObject(OnInfoObjectInfo onInfoObjectInfo) {
            int i = onInfoObjectInfo.infoType;
            if (i != 502) {
                TPThumbPlayer.this.handleOnInfoObjectNoConvertToListener(i, onInfoObjectInfo);
            } else if (onInfoObjectInfo.objParam instanceof String) {
                TPThumbPlayer.this.mSubtitleData.subtitleData = (String) onInfoObjectInfo.objParam;
                TPThumbPlayer.this.mPlayerListenerReps.onSubtitleData(TPThumbPlayer.this.mSubtitleData);
            }
        }

        public void handleMessage(Message message) {
            if (this.mWeakRef.get() == null) {
                TPThumbPlayer.this.mLogger.error("mWeakRef is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                handleOnAsyncCallResult((OnASyncCallResultInfo) message.obj);
            } else if (i == 2) {
                handleOnInfoLong((OnInfoLongInfo) message.obj);
            } else if (i == 3) {
                handleOnInfoObject((OnInfoObjectInfo) message.obj);
            } else if (i == 4) {
                OnErrorInfo onErrorInfo = (OnErrorInfo) message.obj;
                handleOnError(onErrorInfo.msgType, onErrorInfo.errorCode);
            } else if (i != 5) {
                TPBaseLogger access$000 = TPThumbPlayer.this.mLogger;
                access$000.warn("message :" + message.what + "  not recognition");
            } else {
                handleOnDetailInfo((TPDetailInfo) message.obj);
            }
        }
    }

    public static class OnASyncCallResultInfo {
        @TPCommonEnum.NativeMsgInfo
        public int callType;
        public int errorCode;
        public int errorType;
        public long opaque;
    }

    public static class OnErrorInfo {
        public int errorCode;
        public int msgType;
    }

    public static class OnInfoLongInfo {
        public int infoType;
        public long lParam1;
        public long lParam2;
    }

    public static class OnInfoObjectInfo {
        public int infoType;
        public Object objParam;
    }

    public TPThumbPlayer(Context context, TPLoggerContext tPLoggerContext) {
        this.mLogger = new TPBaseLogger(tPLoggerContext, TAG);
        TPNativePlayer tPNativePlayer = new TPNativePlayer(context);
        this.mPlayer = tPNativePlayer;
        tPNativePlayer.setMessageCallback(this.mNativeMessageCallback);
        this.mPlayer.setAudioFrameCallback(this.mNativeAudioFrameCallback);
        this.mPlayer.setVideoFrameCallback(this.mNativeVideoFrameCallback);
        this.mPlayer.setSubtitleFrameCallback(this.mNativeSubtitleFrameCallback);
        this.mPlayer.setPostProcessFrameCallback(this.mNativePostProcessFrameCallback);
        this.mPlayer.setDemuxerCallback(this.mNativeDemuxerCallback);
        this.mPlayer.setEventRecordCallback(this.mNativeEventRecordCallback);
        this.mNativeInitConfig = new TPNativePlayerInitConfig();
        this.mPlayerListenerReps = new TPPlayerBaseListeners(this.mLogger.getTag());
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new EventHandler(myLooper, this);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            this.mEventHandler = new EventHandler(mainLooper, this);
        } else {
            this.mEventHandler = null;
        }
    }

    /* access modifiers changed from: private */
    public void handleCommonASyncCallResult(OnASyncCallResultInfo onASyncCallResultInfo) {
        this.mPlayerListenerReps.onInfo(TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, onASyncCallResultInfo.callType), (long) onASyncCallResultInfo.errorType, (long) onASyncCallResultInfo.errorCode, Long.valueOf(onASyncCallResultInfo.opaque));
    }

    /* access modifiers changed from: private */
    public void handleOnComplete() {
        this.mPlayerListenerReps.onCompletion();
    }

    /* access modifiers changed from: private */
    public void handleOnInfoLongNoConvertToListener(@TPCommonEnum.NativeErrorType int i, OnInfoLongInfo onInfoLongInfo) {
        long j;
        int i2;
        int tPIntValue = TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapMsgInfo.class, i);
        if (tPIntValue < 0) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.warn("msgType:" + i + ", cannot convert to thumbPlayer Info");
            return;
        }
        long j2 = onInfoLongInfo.lParam1;
        long j3 = onInfoLongInfo.lParam2;
        if (tPIntValue == 203) {
            i2 = TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapAudioDecoderType.class, (int) j2);
        } else if (tPIntValue != 204) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.warn("unhandled thumbPlayerInfo=" + tPIntValue);
            j = j2;
            this.mPlayerListenerReps.onInfo(tPIntValue, j, j3, (Object) null);
        } else {
            i2 = TPNativeKeyMapUtil.toTPIntValue(TPNativeKeyMap.MapVideoDecoderType.class, (int) j2);
        }
        j = (long) i2;
        this.mPlayerListenerReps.onInfo(tPIntValue, j, j3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0047, code lost:
        r7 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        r7 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r8.mPlayerListenerReps.onInfo(r2, 0, 0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleOnInfoObjectNoConvertToListener(@com.tencent.thumbplayer.api.TPCommonEnum.NativeMsgInfo int r9, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.OnInfoObjectInfo r10) {
        /*
            r8 = this;
            java.lang.Class<com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap$MapMsgInfo> r0 = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapMsgInfo.class
            int r2 = com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.toTPIntValue(r0, r9)
            if (r2 < 0) goto L_0x0054
            java.lang.Object r10 = r10.objParam
            if (r10 != 0) goto L_0x000d
            goto L_0x0054
        L_0x000d:
            switch(r2) {
                case 500: goto L_0x0041;
                case 501: goto L_0x0010;
                case 502: goto L_0x003a;
                case 503: goto L_0x0031;
                case 504: goto L_0x0010;
                case 505: goto L_0x002a;
                case 506: goto L_0x0011;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0049
        L_0x0011:
            java.lang.String r10 = (java.lang.String) r10
            com.tencent.thumbplayer.log.TPBaseLogger r9 = r8.mLogger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TP_PLAYER_INFO_OBJECT_SUBTITLE_NOTE:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r9.info(r0)
            goto L_0x0049
        L_0x002a:
            com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$MediaDrmInfo r10 = (com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.MediaDrmInfo) r10
            com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaDrmInfo r9 = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPMediaDrmInfo(r10)
            goto L_0x0047
        L_0x0031:
            if (r10 == 0) goto L_0x0049
            com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$VideoSeiInfo r10 = (com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.VideoSeiInfo) r10
            com.tencent.thumbplayer.api.TPPlayerMsg$TPVideoSeiInfo r9 = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPVideoSeiInfo(r10)
            goto L_0x0047
        L_0x003a:
            com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$MediaCodecInfo r10 = (com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.MediaCodecInfo) r10
            com.tencent.thumbplayer.api.TPPlayerMsg$TPMediaCodecInfo r9 = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPMediaCodecInfo(r10)
            goto L_0x0047
        L_0x0041:
            com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback$VideoCropInfo r10 = (com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.VideoCropInfo) r10
            com.tencent.thumbplayer.api.TPPlayerMsg$TPVideoCropInfo r9 = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPVideoCropInfo((com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.VideoCropInfo) r10)
        L_0x0047:
            r7 = r9
            goto L_0x004a
        L_0x0049:
            r7 = r10
        L_0x004a:
            com.tencent.thumbplayer.adapter.TPPlayerBaseListeners r1 = r8.mPlayerListenerReps
            r3 = 0
            r5 = 0
            r1.onInfo(r2, r3, r5, r7)
            return
        L_0x0054:
            com.tencent.thumbplayer.log.TPBaseLogger r10 = r8.mLogger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "msgType:"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r9 = ", cannot convert to thumbPlayer Info"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.warn(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer.handleOnInfoObjectNoConvertToListener(int, com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayer$OnInfoObjectInfo):void");
    }

    /* access modifiers changed from: private */
    public void handleOnPrepared() {
        this.mPlayerListenerReps.onPrepared();
    }

    /* access modifiers changed from: private */
    public void handleOnSeekComplete() {
        this.mPlayerListenerReps.onSeekComplete();
    }

    /* access modifiers changed from: private */
    public void handleOnVideoSizeChanged(long j, long j2) {
        this.mPlayerListenerReps.onVideoSizeChanged(j, j2);
    }

    /* access modifiers changed from: private */
    public boolean isObjectInfoTypeVerbose(int i) {
        return sVerboseObjectInfoTypes.contains(Integer.valueOf(i));
    }

    private TPProgramInfo programInfoConvert(TPNativePlayerProgramInfo tPNativePlayerProgramInfo) {
        if (tPNativePlayerProgramInfo == null) {
            return null;
        }
        TPProgramInfo tPProgramInfo = new TPProgramInfo();
        tPProgramInfo.url = tPNativePlayerProgramInfo.url;
        tPProgramInfo.bandwidth = tPNativePlayerProgramInfo.bandwidth;
        tPProgramInfo.resolution = tPNativePlayerProgramInfo.resolution;
        tPProgramInfo.programId = tPNativePlayerProgramInfo.programId;
        tPProgramInfo.actived = tPNativePlayerProgramInfo.actived;
        return tPProgramInfo;
    }

    private void setPlayerInitConfigWithParamBoolean(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping boolean is invalid, not found in array, id: " + i);
        } else if (convertToNativeOptionalId.getOptionalIDType() != 3) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        } else {
            this.mNativeInitConfig.setBool(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamBoolean.value);
        }
    }

    private void setPlayerInitConfigWithParamFloat(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamFloat optionalParamFloat) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping float is invalid, not found in array, id: " + i);
        } else if (7 != convertToNativeOptionalId.getOptionalIDType()) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID:" + convertToNativeOptionalId.getNativePlayerOptionalID() + " is not float");
        } else {
            this.mNativeInitConfig.setFloat(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamFloat.value);
        }
    }

    private void setPlayerInitConfigWithParamInt(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamInt optionalParamInt) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId == null) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping int is invalid, not found in array, id: " + i);
        } else if (4 != convertToNativeOptionalId.getOptionalIDType()) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID:" + convertToNativeOptionalId.getNativePlayerOptionalID() + " is not int");
        } else {
            this.mNativeInitConfig.setInt(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamInt.value);
        }
    }

    private void setPlayerInitConfigWithParamLong(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamLong optionalParamLong) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping long is invalid, not found in array, id: " + i);
            return;
        }
        int optionalIDType = convertToNativeOptionalId.getOptionalIDType();
        boolean z = true;
        if (optionalIDType == 1) {
            this.mNativeInitConfig.setLong(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamLong.value);
        } else if (optionalIDType == 3) {
            TPNativePlayerInitConfig tPNativePlayerInitConfig = this.mNativeInitConfig;
            int nativePlayerOptionalID = convertToNativeOptionalId.getNativePlayerOptionalID();
            if (optionalParamLong.value <= 0) {
                z = false;
            }
            tPNativePlayerInitConfig.setBool(nativePlayerOptionalID, z);
        } else if (optionalIDType != 4) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        } else {
            this.mNativeInitConfig.setInt(convertToNativeOptionalId.getNativePlayerOptionalID(), (int) optionalParamLong.value);
        }
    }

    private void setPlayerInitConfigWithParamObject(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamObject optionalParamObject) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId == null) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("convertToNativeOptionalId failed, key: " + i);
        } else if (convertToNativeOptionalId.isIllegal()) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("player optionalIdMapping object is invalid, not found in array, id: " + i);
        } else {
            int nativePlayerOptionalID = convertToNativeOptionalId.getNativePlayerOptionalID();
            if (nativePlayerOptionalID == 126) {
                this.mNativeInitConfig.setObject(convertToNativeOptionalId.getNativePlayerOptionalID(), TPThumbPlayerUtils.convert2TPNativeBufferConfig((TPJitterBufferConfig) optionalParamObject.objectValue));
            } else if (nativePlayerOptionalID != 414) {
                TPBaseLogger tPBaseLogger3 = this.mLogger;
                tPBaseLogger3.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
            } else {
                this.mNativeInitConfig.setObject(convertToNativeOptionalId.getNativePlayerOptionalID(), TPThumbPlayerUtils.convertToTPNativeAudioAttributes((TPAudioAttributes) optionalParamObject.objectValue));
            }
        }
    }

    private void setPlayerInitConfigWithParamQueueInt(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamQueueInt optionalParamQueueInt) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping queue_int is invalid, not found in array, id: " + i);
            return;
        }
        int[] iArr = optionalParamQueueInt.queueValue;
        if (iArr == null || iArr.length == 0) {
            this.mLogger.error("queueint params is empty in" + i);
        } else if (convertToNativeOptionalId.getOptionalIDType() != 5) {
            this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        } else {
            for (int addQueueInt : optionalParamQueueInt.queueValue) {
                this.mNativeInitConfig.addQueueInt(convertToNativeOptionalId.getNativePlayerOptionalID(), addQueueInt);
            }
        }
    }

    private void setPlayerInitConfigWithParamQueueString(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamQueueString optionalParamQueueString) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            this.mLogger.error("player optionalIdMapping queue_string is invalid, not found in array, id: " + i);
            return;
        }
        String[] strArr = optionalParamQueueString.queueValue;
        if (strArr == null || strArr.length == 0) {
            this.mLogger.error("queue String params is empty in" + i);
        } else if (convertToNativeOptionalId.getOptionalIDType() != 6) {
            this.mLogger.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        } else {
            for (String addQueueString : optionalParamQueueString.queueValue) {
                this.mNativeInitConfig.addQueueString(convertToNativeOptionalId.getNativePlayerOptionalID(), addQueueString);
            }
        }
    }

    private void setPlayerInitConfigWithParamString(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamString optionalParamString) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId == null) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping int is invalid, not found in array, id: " + i);
        } else if (2 != convertToNativeOptionalId.getOptionalIDType()) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID:" + convertToNativeOptionalId.getNativePlayerOptionalID() + " is not string");
        } else {
            this.mNativeInitConfig.setString(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamString.value);
        }
    }

    private void setPlayerOptionWithParamBoolean(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamBoolean optionalParamBoolean) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping string is invalid, not found in array, id: " + i);
        } else if (convertToNativeOptionalId.getOptionalIDType() != 3) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        } else {
            this.mPlayer.setOptionLong(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamBoolean.value ? 1 : 0, 0);
        }
    }

    private void setPlayerOptionWithParamLong(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamLong optionalParamLong) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping long is invalid, not found in array, id: " + i);
            return;
        }
        int optionalIDType = convertToNativeOptionalId.getOptionalIDType();
        if (optionalIDType == 1 || optionalIDType == 3 || optionalIDType == 4) {
            this.mPlayer.setOptionLong(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamLong.value, optionalParamLong.param1);
            return;
        }
        TPBaseLogger tPBaseLogger2 = this.mLogger;
        tPBaseLogger2.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
    }

    private void setPlayerOptionWithParamObject(int i, TPOptionalParam.OptionalParamObject optionalParamObject) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId == null) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionaIdMapping object is invalid, not found in array, id: " + i);
        } else if (convertToNativeOptionalId.getNativePlayerOptionalID() != 1001) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        } else {
            this.mPlayer.setOptionObject(convertToNativeOptionalId.getNativePlayerOptionalID(), TPThumbPlayerUtils.convert2TPNativeSubtitleRenderParams((TPSubtitleRenderModel) optionalParamObject.objectValue));
        }
    }

    private void setPlayerOptionWithParamString(@TPCommonEnum.TPOptionalId int i, TPOptionalParam.OptionalParamString optionalParamString) {
        TPThumbPlayerUtils.OptionIdMapping convertToNativeOptionalId = TPNativeKeyMapUtil.convertToNativeOptionalId(i);
        if (convertToNativeOptionalId.isIllegal()) {
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.error("player optionalIdMapping string is invalid, not found in array, id: " + i);
        } else if (convertToNativeOptionalId.getOptionalIDType() != 2) {
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.error("optionID type:" + convertToNativeOptionalId.getOptionalIDType() + " is not implement");
        } else {
            this.mPlayer.setOptionObject(convertToNativeOptionalId.getNativePlayerOptionalID(), optionalParamString.value);
        }
    }

    private void throwExceptionIfPlayerReleased() {
        if (this.mPlayer == null) {
            throw new IllegalStateException("player has release");
        }
    }

    private TPTrackInfo trackInfoConvert(TPMediaTrackInfo tPMediaTrackInfo) {
        TPTrackInfo tPTrackInfo = new TPTrackInfo();
        tPTrackInfo.name = tPMediaTrackInfo.trackName;
        tPTrackInfo.trackType = tPMediaTrackInfo.trackType;
        int i = tPMediaTrackInfo.contianerType;
        tPTrackInfo.containerType = i;
        if (i == 1) {
            TPHlsTag tPHlsTag = tPTrackInfo.hlsTag;
            TPMediaTrackHlsTag tPMediaTrackHlsTag = tPMediaTrackInfo.hlsTag;
            tPHlsTag.name = tPMediaTrackHlsTag.name;
            tPHlsTag.bandwidth = tPMediaTrackHlsTag.bandwidth;
            tPHlsTag.resolution = tPMediaTrackHlsTag.resolution;
            tPHlsTag.framerate = tPMediaTrackHlsTag.framerate;
            tPHlsTag.codecs = tPMediaTrackHlsTag.codecs;
            tPHlsTag.groupId = tPMediaTrackHlsTag.groupId;
            tPHlsTag.language = tPMediaTrackHlsTag.language;
        } else if (i == 2) {
            tPTrackInfo.dashFormat = TPThumbPlayerUtils.convert2TPDashFormat(tPMediaTrackInfo.dashFormat);
        }
        tPTrackInfo.isExclusive = tPMediaTrackInfo.isExclusive;
        tPTrackInfo.isSelected = tPMediaTrackInfo.isSelected;
        tPTrackInfo.isInternal = tPMediaTrackInfo.isInternal;
        return tPTrackInfo;
    }

    public void addAudioTrackSource(String str, String str2, List<TPOptionalParam> list) {
        addAudioTrackSource(str, (Map<String, String>) null, str2, list);
    }

    public void addSubtitleSource(String str, String str2, String str3) {
        addSubtitleSource(str, (Map<String, String>) null, str2, str3);
    }

    public void captureVideo(TPCaptureParams tPCaptureParams, TPCaptureCallBack tPCaptureCallBack) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("captureVideo, params" + tPCaptureParams);
        if (this.mImageGenerator != null) {
            TPImageGeneratorParams tPImageGeneratorParams = new TPImageGeneratorParams();
            tPImageGeneratorParams.width = tPCaptureParams.width;
            tPImageGeneratorParams.height = tPCaptureParams.height;
            tPImageGeneratorParams.format = tPCaptureParams.format;
            tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
            tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
            this.mImageGenerator.generateImageAsyncAtTime(getCurrentPositionMs(), tPImageGeneratorParams, tPCaptureCallBack);
            return;
        }
        tPCaptureCallBack.onCaptureVideoFailed(TPGeneralError.UNMATCHED_STATE);
    }

    public void deselectTrack(int i, long j) {
        this.mLogger.info("selectTrack");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.deselectTrackAsync(i, j);
        }
    }

    public long getCurrentPositionMs() {
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getCurrentPositionMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    public long getDemuxerOffsetInFile() {
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDemuxerOffsetInFile();
        }
        this.mLogger.info("player has released, return -1");
        return -1;
    }

    public long getDurationMs() {
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getDurationMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    public TPDynamicStatisticParams getDynamicStatisticParams(boolean z) {
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getDynamicStatisticParams(z);
    }

    public TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            return null;
        }
        return tPNativePlayer.getGeneralPlayFlowParams();
    }

    public long getPlayableDurationMs() {
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getBufferedDurationMs() + this.mPlayer.getCurrentPositionMs();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    public TPProgramInfo[] getProgramInfo() {
        this.mLogger.info("getProgramInfo");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        TPProgramInfo[] tPProgramInfoArr = null;
        if (tPNativePlayer == null) {
            this.mLogger.info("player has released, return 0");
            return null;
        }
        TPNativePlayerProgramInfo[] programInfo = tPNativePlayer.getProgramInfo();
        if (programInfo != null && programInfo.length >= 1) {
            tPProgramInfoArr = new TPProgramInfo[programInfo.length];
            for (int i = 0; i < programInfo.length; i++) {
                tPProgramInfoArr[i] = programInfoConvert(programInfo[i]);
            }
        }
        return tPProgramInfoArr;
    }

    public long getPropertyLong(int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("getPropertyLong:" + i);
        throwExceptionIfPlayerReleased();
        int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapPropertyId.class, i);
        if (nativeIntValue >= 0) {
            return this.mPlayer.getPropertyLong(nativeIntValue);
        }
        this.mLogger.warn("paramId not found, return -1");
        return -1;
    }

    public String getPropertyString(int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("getPropertyString:" + i);
        throwExceptionIfPlayerReleased();
        try {
            int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapPropertyId.class, i);
            if (nativeIntValue >= 0) {
                return this.mPlayer.getPropertyString(nativeIntValue);
            }
            TPBaseLogger tPBaseLogger2 = this.mLogger;
            tPBaseLogger2.warn("getPropertyString, tpToNativeValue(TPNativeKeyMap.MapPropertyId.class," + i + "), return" + nativeIntValue);
            return "";
        } catch (IllegalArgumentException unused) {
            this.mLogger.warn("paramId not found, return");
            return "";
        }
    }

    public TPTrackInfo[] getTrackInfo() {
        this.mLogger.info("getTrackInfo");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        TPTrackInfo[] tPTrackInfoArr = null;
        if (tPNativePlayer == null) {
            this.mLogger.info("player has released, return 0");
            return null;
        }
        TPMediaTrackInfo[] trackInfo = tPNativePlayer.getTrackInfo();
        if (trackInfo != null && trackInfo.length >= 1) {
            tPTrackInfoArr = new TPTrackInfo[trackInfo.length];
            for (int i = 0; i < trackInfo.length; i++) {
                tPTrackInfoArr[i] = trackInfoConvert(trackInfo[i]);
            }
        }
        return tPTrackInfoArr;
    }

    public int getVideoHeight() {
        this.mLogger.info("getVideoHeight");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoHeight();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    public int getVideoWidth() {
        this.mLogger.info("getVideoWidth");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            return tPNativePlayer.getVideoWidth();
        }
        this.mLogger.info("player has released, return 0");
        return 0;
    }

    public void pause() {
        this.mLogger.info("pause");
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.pause() != 0) {
            throw new IllegalStateException("pause failed!!");
        }
    }

    public void prepare() {
        this.mLogger.info("prepare");
        throwExceptionIfPlayerReleased();
        this.mPlayer.setInitConfig(this.mNativeInitConfig);
        if (this.mPlayer.prepare() != 0) {
            throw new IllegalStateException("prepare failed!!");
        }
    }

    public void prepareAsync() {
        this.mLogger.info("prepareAsync");
        throwExceptionIfPlayerReleased();
        this.mPlayer.setInitConfig(this.mNativeInitConfig);
        if (this.mPlayer.prepareAsync() != 0) {
            throw new IllegalStateException("prepareAsync failed!!");
        }
    }

    public void release() {
        this.mLogger.info("release");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer != null) {
            tPNativePlayer.release();
            this.mPlayer = null;
        }
        ITPCapture iTPCapture = this.mImageGenerator;
        if (iTPCapture != null) {
            iTPCapture.release();
            this.mImageGenerator = null;
        }
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages((Object) null);
            this.mEventHandler = null;
        }
    }

    public void reset() {
        this.mLogger.info("reset");
        if (this.mPlayer == null) {
            this.mLogger.warn("reset, player has released.");
            return;
        }
        this.mLogger.info("reset before");
        this.mPlayer.reset();
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeCallbacksAndMessages((Object) null);
        }
        this.mLogger.info("reset after");
    }

    public void seekTo(int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("seekTo:" + i);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.seekToAsync(i, 1, 0) != 0) {
            throw new IllegalStateException("seek to position:" + i + " failed!!");
        }
    }

    public void selectProgram(int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("selectProgram, programIndex:" + i);
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.selectProgramAsync(i, j);
        }
    }

    public void selectTrack(int i, long j) {
        this.mLogger.info("selectTrack");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.selectTrackAsync(i, j);
        }
    }

    public void setAudioGainRatio(float f) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setAudioGainRatio:" + f);
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setAudioVolume(f);
        }
    }

    public void setAudioNormalizeVolumeParams(String str) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setAudioNormalizeVolumeParams:" + str);
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setAudioNormalizeVolumeParams(str);
        }
    }

    public void setDataSource(String str) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setDataSource: " + str);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.setDataSource(str) == 0) {
            this.mImageGenerator = new TPThumbCapture(str);
            return;
        }
        throw new IllegalStateException("setDataSource url failed!!");
    }

    public void setLoopback(boolean z) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setLoopback:" + z);
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setLoopback(z, 0, -1);
        }
    }

    public void setOnAudioPcmOutputListener(ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        this.mPlayerListenerReps.setOnAudioPcmOutListener(iOnAudioPcmOutListener);
    }

    public void setOnAudioProcessOutputListener(ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        this.mPlayerListenerReps.setOnAudioProcessFrameListener(iOnAudioProcessOutListener);
    }

    public void setOnCompletionListener(ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mPlayerListenerReps.setOnCompletionListener(iOnCompletionListener);
    }

    public void setOnDemuxerListener(ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
        this.mPlayerListenerReps.setOnDemuxerListener(iOnDemuxerListener);
    }

    public void setOnDetailInfoListener(ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
        this.mPlayerListenerReps.setOnDetailInfoListener(iOnDetailInfoListener);
    }

    public void setOnErrorListener(ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mPlayerListenerReps.setOnErrorListener(iOnErrorListener);
    }

    public void setOnEventRecordListener(ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
        this.mPlayerListenerReps.setOnEventRecordListener(iOnEventRecordListener);
    }

    public void setOnInfoListener(ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mPlayerListenerReps.setOnInfoListener(iOnInfoListener);
    }

    public void setOnPreparedListener(ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        this.mPlayerListenerReps.setOnPreparedListener(iOnPreparedListener);
    }

    public void setOnSeekCompleteListener(ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.mPlayerListenerReps.setOnSeekCompleteListener(iOnSeekCompleteListener);
    }

    public void setOnSubtitleDataListener(ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.mPlayerListenerReps.setOnSubtitleDataListener(iOnSubtitleDataListener);
    }

    public void setOnSubtitleFrameOutListener(ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.mPlayerListenerReps.setOnSubtitleFrameOutListener(iOnSubtitleFrameOutListener);
    }

    public void setOnVideoFrameOutListener(ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        this.mPlayerListenerReps.setOnVideoFrameOutListener(iOnVideoFrameOutListener);
    }

    public void setOnVideoProcessOutputListener(ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        this.mPlayerListenerReps.setOnVideoProcessFrameListener(iOnVideoProcessOutListener);
    }

    public void setOnVideoSizeChangedListener(ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mPlayerListenerReps.setOnVideoSizeChangedListener(iOnVideoSizeChangedListener);
    }

    public void setOutputMute(boolean z) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setOutputMute:" + z);
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setAudioMute(z);
        }
    }

    public void setPlaySharpenSwitch() {
        this.mLogger.info("setPlaySharpenSwitch");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setPlaySharpenSwitch();
        }
    }

    public void setPlaySpeedRatio(float f) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setPlaySpeedRatio:" + f);
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.setPlaybackRate(f);
        }
    }

    public void setPlayerOptionalParam(TPOptionalParam tPOptionalParam) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setPlayerOptionalParam:" + tPOptionalParam);
        if (this.mPlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (tPOptionalParam.getParamType() == 1) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamBoolean(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
            } else {
                setPlayerOptionWithParamBoolean(tPOptionalParam.getKey(), tPOptionalParam.getParamBoolean());
            }
        } else if (tPOptionalParam.getParamType() == 2) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamLong(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
            } else {
                setPlayerOptionWithParamLong(tPOptionalParam.getKey(), tPOptionalParam.getParamLong());
            }
        } else if (tPOptionalParam.getParamType() == 6) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamFloat(tPOptionalParam.getKey(), tPOptionalParam.getParamFloat());
            }
        } else if (tPOptionalParam.getParamType() == 8) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamInt(tPOptionalParam.getKey(), tPOptionalParam.getParamInt());
            }
        } else if (tPOptionalParam.getParamType() == 3) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamString(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
            } else {
                setPlayerOptionWithParamString(tPOptionalParam.getKey(), tPOptionalParam.getParamString());
            }
        } else if (tPOptionalParam.getParamType() == 4) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamQueueInt(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueInt());
            }
        } else if (tPOptionalParam.getParamType() == 5) {
            if (tPOptionalParam.getKey() < 500) {
                setPlayerInitConfigWithParamQueueString(tPOptionalParam.getKey(), tPOptionalParam.getParamQueueString());
            }
        } else if (tPOptionalParam.getParamType() != 7) {
            this.mLogger.warn("optionalParam param type is unknown, return");
        } else if (tPOptionalParam.getKey() < 500) {
            setPlayerInitConfigWithParamObject(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
        } else {
            setPlayerOptionWithParamObject(tPOptionalParam.getKey(), tPOptionalParam.getParamObject());
        }
    }

    public void setSurface(Surface surface, @TPCommonEnum.TPSurfaceType int i) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        StringBuilder sb = new StringBuilder();
        sb.append("setSurface, surface is null ? : ");
        sb.append(surface == null);
        tPBaseLogger.info(sb.toString());
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (tPNativePlayer.setVideoSurfaceWithType(surface, TPNativeKeyMapUtil.convertToNativeSurfaceType(i)) != 0) {
            throw new IllegalStateException("setSurface failed!!");
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        StringBuilder sb = new StringBuilder();
        sb.append("SurfaceHolder, surfaceHolder is null ? : ");
        sb.append(surfaceHolder == null);
        tPBaseLogger.info(sb.toString());
        if (this.mPlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (surfaceHolder == null || surfaceHolder.getSurface() != null) {
            if (this.mPlayer.setVideoSurface(surfaceHolder == null ? null : surfaceHolder.getSurface()) != 0) {
                throw new IllegalStateException("setSurface failed!!");
            }
        } else {
            this.mLogger.error("SurfaceHolder，err.");
        }
    }

    public void start() {
        this.mLogger.info(IXWebBroadcastListener.STAGE_START);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.start() != 0) {
            throw new IllegalStateException("start failed!!");
        }
    }

    public void stop() {
        this.mLogger.info("stop");
        throwExceptionIfPlayerReleased();
        this.mLogger.info("stop before");
        int stop = this.mPlayer.stop();
        this.mLogger.info("stop after");
        if (stop != 0) {
            throw new IllegalStateException("stop failed!!");
        }
    }

    public void switchDefinition(String str, @TPCommonEnum.TPSwitchDefMode int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("switchDefinition url:" + str + " opaque:" + j);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.switchDefinitionAsync(str, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i), j) == 0) {
            ITPCapture iTPCapture = this.mImageGenerator;
            if (iTPCapture != null) {
                iTPCapture.release();
                this.mImageGenerator = null;
            }
            this.mImageGenerator = new TPThumbCapture(str);
            return;
        }
        throw new IllegalStateException("switchDefinition in invalid state");
    }

    public void updateLoggerContext(TPLoggerContext tPLoggerContext) {
        this.mLogger.updateContext(new TPLoggerContext(tPLoggerContext, TAG));
        if (tPLoggerContext != null) {
            this.mPlayerListenerReps.updateTag(this.mLogger.getTPLoggerContext().getTag());
        }
    }

    public void addAudioTrackSource(String str, Map<String, String> map, String str2, List<TPOptionalParam> list) {
        this.mLogger.info("addAudioTrackSource");
        if (this.mPlayer == null) {
            this.mLogger.warn("player has released, return");
            return;
        }
        TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new TPPlayerMsg.TPAudioTrackInfo();
        tPAudioTrackInfo.audioTrackUrl = str;
        tPAudioTrackInfo.paramData = list;
        TPPlayerBaseListeners tPPlayerBaseListeners = this.mPlayerListenerReps;
        if (tPPlayerBaseListeners != null) {
            tPPlayerBaseListeners.onInfo(1012, 0, 0, tPAudioTrackInfo);
        }
        if (TextUtils.isEmpty(tPAudioTrackInfo.proxyUrl)) {
            this.mPlayer.addAudioTrackSource(tPAudioTrackInfo.audioTrackUrl, str2, tPAudioTrackInfo.httpHeader);
        } else {
            this.mPlayer.addAudioTrackSource(tPAudioTrackInfo.proxyUrl, str2, tPAudioTrackInfo.httpHeader);
        }
    }

    public void addSubtitleSource(String str, Map<String, String> map, String str2, String str3) {
        this.mLogger.info("addSubtitleSource");
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else {
            tPNativePlayer.addSubtitleTrackSource(str, str3, map);
        }
    }

    public void seekTo(int i, @TPCommonEnum.TPSeekMode int i2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("seekTo:" + i + " mode:" + i2);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.seekToAsync(i, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSeekMode.class, i2), 0) != 0) {
            throw new IllegalStateException("seek to position:" + i + " failed!!");
        }
    }

    public void setLoopback(boolean z, long j, long j2) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setLoopback:" + z + " loopStartPositionMs:" + j + " loopEndPositionMs:" + j2);
        TPNativePlayer tPNativePlayer = this.mPlayer;
        if (tPNativePlayer == null) {
            this.mLogger.warn("player has released, return");
        } else if (tPNativePlayer.setLoopback(z, j, j2) != 0) {
            throw new IllegalStateException("set loopback failed!!");
        }
    }

    public void setDataSource(String str, Map<String, String> map) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setDataSource: " + str);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.setDataSource(str, map) == 0) {
            this.mImageGenerator = new TPThumbCapture(str);
            return;
        }
        throw new IllegalStateException("setDataSource url and header failed!!");
    }

    public void setDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            int detachFd = parcelFileDescriptor.detachFd();
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(detachFd);
            int detachFd2 = fromFd.detachFd();
            fromFd.close();
            parcelFileDescriptor.close();
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("setDataSource: " + parcelFileDescriptor + ", playFd:" + detachFd + ", captureFd: " + detachFd2);
            throwExceptionIfPlayerReleased();
            if (this.mPlayer.setDataSource(detachFd, 0, 0) == 0) {
                this.mImageGenerator = new TPThumbCapture(detachFd2);
                return;
            }
            throw new IllegalStateException("setDataSource url pfd failed!!");
        }
        throw new IllegalStateException("setDataSource url pfd is null!!");
    }

    public void switchDefinition(String str, Map<String, String> map, @TPCommonEnum.TPSwitchDefMode int i, long j) {
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("switchDefinition url:" + str + "httpHeader:" + map + " opaque:" + j);
        throwExceptionIfPlayerReleased();
        if (this.mPlayer.switchDefinitionAsync(str, map, TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i), j) == 0) {
            ITPCapture iTPCapture = this.mImageGenerator;
            if (iTPCapture != null) {
                iTPCapture.release();
                this.mImageGenerator = null;
            }
            this.mImageGenerator = new TPThumbCapture(str);
            return;
        }
        throw new IllegalStateException("switchDefinition in invalid state");
    }

    public void switchDefinition(ITPMediaAsset iTPMediaAsset, @TPCommonEnum.TPSwitchDefMode int i, long j) {
        int i2;
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("switchDefinition mediaAsset:" + iTPMediaAsset + " opaque:" + j);
        throwExceptionIfPlayerReleased();
        if (iTPMediaAsset != null) {
            int nativeIntValue = TPNativeKeyMapUtil.toNativeIntValue(TPNativeKeyMap.MapSwitchDefMode.class, i);
            Map<String, String> httpHeader = iTPMediaAsset.getHttpHeader();
            if (httpHeader == null) {
                i2 = this.mPlayer.switchDefinitionAsync(iTPMediaAsset.getUrl(), nativeIntValue, j);
            } else {
                i2 = this.mPlayer.switchDefinitionAsync(iTPMediaAsset.getUrl(), httpHeader, nativeIntValue, j);
            }
            if (i2 == 0) {
                this.mImageGenerator = new TPThumbCapture(iTPMediaAsset.getUrl());
                return;
            }
            throw new IllegalStateException("switchDefinition in invalid state");
        }
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            int detachFd = assetFileDescriptor.getParcelFileDescriptor().detachFd();
            long startOffset = assetFileDescriptor.getStartOffset();
            long length = assetFileDescriptor.getLength();
            ParcelFileDescriptor fromFd = ParcelFileDescriptor.fromFd(detachFd);
            int detachFd2 = fromFd.detachFd();
            fromFd.close();
            assetFileDescriptor.close();
            TPBaseLogger tPBaseLogger = this.mLogger;
            tPBaseLogger.info("setDataSource: " + assetFileDescriptor + ", playFd: " + detachFd + ", offset: " + startOffset + ", length: " + length + ", captureFd: " + detachFd2);
            throwExceptionIfPlayerReleased();
            if (this.mPlayer.setDataSource(detachFd, startOffset, length) == 0) {
                this.mImageGenerator = new TPThumbCapture(detachFd2, startOffset, length);
                return;
            }
            throw new IllegalStateException("setDataSource url afd failed!!");
        }
        throw new IllegalStateException("setDataSource url afd is null!!");
    }

    public void setDataSource(ITPMediaAsset iTPMediaAsset) {
        int i;
        TPBaseLogger tPBaseLogger = this.mLogger;
        tPBaseLogger.info("setDataSource: " + iTPMediaAsset);
        throwExceptionIfPlayerReleased();
        if (iTPMediaAsset != null) {
            String url = iTPMediaAsset.getUrl();
            Map<String, String> httpHeader = iTPMediaAsset.getHttpHeader();
            if (httpHeader == null) {
                i = this.mPlayer.setDataSource(url);
            } else {
                i = this.mPlayer.setDataSource(url, httpHeader);
            }
            if (i == 0) {
                this.mImageGenerator = new TPThumbCapture(url);
                return;
            }
            throw new IllegalStateException("setDataSource mediaAsset failed!!");
        }
        throw new IllegalStateException("media asset is null!");
    }
}
