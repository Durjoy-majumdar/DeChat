package com.tencent.trtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.trtc.TRTCCloudImpl;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.lang.ref.WeakReference;

public abstract class TRTCCloud {
    private static C57936a mTXLogListener;
    public static WeakReference<TRTCCloud> sInstance;

    @Deprecated
    public interface BGMNotify {
        void onBGMComplete(int i);

        void onBGMProgress(long j, long j2);

        void onBGMStart(int i);
    }

    public static class TRTCViewMargin {
        public float bottomMargin;
        public float leftMargin;
        public float rightMargin;
        public float topMargin;

        public TRTCViewMargin(float f, float f2, float f3, float f4) {
            this.leftMargin = f;
            this.topMargin = f3;
            this.rightMargin = f2;
            this.bottomMargin = f4;
        }
    }

    /* renamed from: com.tencent.trtc.TRTCCloud$a */
    public static class C57936a implements LiteavLog.C17108a {

        /* renamed from: a */
        public TRTCCloudListener.TRTCLogListener f165817a = null;

        /* renamed from: a */
        public final void mo19357a(LiteavLog.C17107b bVar, String str, String str2) {
            TRTCCloudListener.TRTCLogListener tRTCLogListener = this.f165817a;
            if (tRTCLogListener != null) {
                tRTCLogListener.onLog(str2, bVar.mNativeValue, str);
            }
        }
    }

    public static void destroySharedInstance() {
        TRTCCloudImpl.m17010a();
    }

    public static String getSDKVersion() {
        return CommonUtil.getSDKVersionStr();
    }

    public static void setConsoleEnabled(boolean z) {
        TRTCCloudImpl.m17014a(z);
    }

    public static void setLogCompressEnabled(boolean z) {
        TRTCCloudImpl.m17019b(z);
    }

    public static void setLogDirPath(String str) {
        TRTCCloudImpl.m17013a(str);
    }

    public static void setLogLevel(int i) {
        TRTCCloudImpl.m17011a(i);
    }

    public static void setLogListener(TRTCCloudListener.TRTCLogListener tRTCLogListener) {
        C57936a aVar = mTXLogListener;
        if (aVar != null) {
            aVar.f165817a = null;
        }
        if (tRTCLogListener != null) {
            C57936a aVar2 = new C57936a();
            mTXLogListener = aVar2;
            aVar2.f165817a = tRTCLogListener;
        } else {
            mTXLogListener = null;
        }
        LiteavLog.setCallback(mTXLogListener);
        LiteavLog.nativeSetLogCallbackEnabled(mTXLogListener != null);
    }

    public static TRTCCloud sharedInstance(Context context) {
        return TRTCCloudImpl.m17008a(context);
    }

    public abstract void ConnectOtherRoom(String str);

    public abstract void DisconnectOtherRoom();

    public abstract void callExperimentalAPI(String str);

    @Deprecated
    public abstract int checkAudioCapabilitySupport(int i);

    public abstract TRTCCloud createSubCloud();

    public abstract void destroySubCloud(TRTCCloud tRTCCloud);

    public abstract void enableAudioEarMonitoring(boolean z);

    public abstract void enableAudioVolumeEvaluation(int i);

    public abstract void enableCustomAudioCapture(boolean z);

    public abstract void enableCustomAudioRendering(boolean z);

    public abstract void enableCustomVideoCapture(int i, boolean z);

    @Deprecated
    public abstract void enableCustomVideoCapture(boolean z);

    public abstract int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void enableMixExternalAudioFrame(boolean z, boolean z2);

    @Deprecated
    public abstract boolean enableTorch(boolean z);

    public abstract void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i);

    public abstract void exitRoom();

    public abstract long generateCustomPTS();

    public abstract int getAudioCaptureVolume();

    public abstract TXAudioEffectManager getAudioEffectManager();

    public abstract int getAudioPlayoutVolume();

    @Deprecated
    public abstract int getBGMDuration(String str);

    public abstract TXBeautyManager getBeautyManager();

    public abstract void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract TXDeviceManager getDeviceManager();

    @Deprecated
    public abstract boolean isCameraAutoFocusFaceModeSupported();

    @Deprecated
    public abstract boolean isCameraFocusPositionInPreviewSupported();

    @Deprecated
    public abstract boolean isCameraTorchSupported();

    @Deprecated
    public abstract boolean isCameraZoomSupported();

    public abstract int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract void muteAllRemoteAudio(boolean z);

    public abstract void muteAllRemoteVideoStreams(boolean z);

    public abstract void muteLocalAudio(boolean z);

    public abstract void muteLocalVideo(int i, boolean z);

    @Deprecated
    public abstract void muteLocalVideo(boolean z);

    public abstract void muteRemoteAudio(String str, boolean z);

    public abstract void muteRemoteVideoStream(String str, int i, boolean z);

    @Deprecated
    public abstract void muteRemoteVideoStream(String str, boolean z);

    @Deprecated
    public abstract void pauseAudioEffect(int i);

    @Deprecated
    public abstract void pauseBGM();

    public abstract void pauseScreenCapture();

    @Deprecated
    public abstract void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam);

    @Deprecated
    public abstract void playBGM(String str, BGMNotify bGMNotify);

    @Deprecated
    public abstract void resumeAudioEffect(int i);

    @Deprecated
    public abstract void resumeBGM();

    public abstract void resumeScreenCapture();

    @Deprecated
    public abstract void selectMotionTmpl(String str);

    public abstract void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract boolean sendCustomCmdMsg(int i, byte[] bArr, boolean z, boolean z2);

    public abstract void sendCustomVideoData(int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);

    @Deprecated
    public abstract void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);

    public abstract boolean sendSEIMsg(byte[] bArr, int i);

    @Deprecated
    public abstract void setAllAudioEffectsVolume(int i);

    public abstract void setAudioCaptureVolume(int i);

    @Deprecated
    public abstract void setAudioEffectVolume(int i, int i2);

    public abstract void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener);

    public abstract void setAudioPlayoutVolume(int i);

    @Deprecated
    public abstract void setAudioQuality(int i);

    public abstract void setAudioRoute(int i);

    @Deprecated
    public abstract void setBGMPlayoutVolume(int i);

    @Deprecated
    public abstract int setBGMPosition(int i);

    @Deprecated
    public abstract void setBGMPublishVolume(int i);

    @Deprecated
    public abstract void setBGMVolume(int i);

    @Deprecated
    public abstract void setBeautyStyle(int i, int i2, int i3, int i4);

    public abstract int setCapturedRawAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    @Deprecated
    public abstract void setChinLevel(int i);

    public abstract void setDebugViewMargin(String str, TRTCViewMargin tRTCViewMargin);

    public abstract void setDefaultStreamRecvMode(boolean z, boolean z2);

    @Deprecated
    public abstract void setEyeScaleLevel(int i);

    @Deprecated
    public abstract void setFaceShortLevel(int i);

    @Deprecated
    public abstract void setFaceSlimLevel(int i);

    @Deprecated
    public abstract void setFaceVLevel(int i);

    @Deprecated
    public abstract void setFilter(Bitmap bitmap);

    @Deprecated
    public abstract void setFilterConcentration(float f);

    @Deprecated
    public abstract void setFocusPosition(int i, int i2);

    public abstract void setGSensorMode(int i);

    @Deprecated
    public abstract boolean setGreenScreenFile(String str);

    public abstract void setListener(TRTCCloudListener tRTCCloudListener);

    public abstract void setListenerHandler(Handler handler);

    public abstract int setLocalProcessedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    public abstract void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams);

    public abstract int setLocalVideoProcessListener(int i, int i2, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener);

    public abstract int setLocalVideoRenderListener(int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    @Deprecated
    public abstract void setLocalViewFillMode(int i);

    @Deprecated
    public abstract void setLocalViewMirror(int i);

    @Deprecated
    public abstract void setLocalViewRotation(int i);

    @Deprecated
    public abstract void setMicVolumeOnMixing(int i);

    public abstract void setMixExternalAudioVolume(int i, int i2);

    public abstract void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig);

    public abstract int setMixedPlayAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    @Deprecated
    public abstract void setMotionMute(boolean z);

    public abstract void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam);

    @Deprecated
    public abstract void setNoseSlimLevel(int i);

    @Deprecated
    public abstract int setPriorRemoteVideoStreamType(int i);

    public abstract void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams);

    public abstract void setRemoteAudioVolume(String str, int i);

    public abstract void setRemoteRenderParams(String str, int i, TRTCCloudDef.TRTCRenderParams tRTCRenderParams);

    @Deprecated
    public abstract void setRemoteSubStreamViewFillMode(String str, int i);

    @Deprecated
    public abstract void setRemoteSubStreamViewRotation(String str, int i);

    public abstract int setRemoteVideoRenderListener(String str, int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    public abstract int setRemoteVideoStreamType(String str, int i);

    @Deprecated
    public abstract void setRemoteViewFillMode(String str, int i);

    @Deprecated
    public abstract void setRemoteViewRotation(String str, int i);

    @Deprecated
    public abstract void setReverbType(int i);

    public abstract void setSubStreamEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void setSystemVolumeType(int i);

    public abstract void setVideoEncoderMirror(boolean z);

    public abstract void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void setVideoEncoderRotation(int i);

    public abstract void setVideoMuteImage(Bitmap bitmap, int i);

    @Deprecated
    public abstract boolean setVoiceChangerType(int i);

    public abstract void setWatermark(Bitmap bitmap, int i, float f, float f2, float f3);

    @Deprecated
    public abstract void setZoom(int i);

    public abstract void showDebugView(int i);

    public abstract void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    public abstract int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams);

    @Deprecated
    public abstract void startLocalAudio();

    public abstract void startLocalAudio(int i);

    public abstract void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView);

    public abstract void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams);

    public abstract void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam);

    public abstract void startPublishing(String str, int i);

    @Deprecated
    public abstract void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView);

    public abstract void startRemoteView(String str, int i, TXCloudVideoView tXCloudVideoView);

    @Deprecated
    public abstract void startRemoteView(String str, TXCloudVideoView tXCloudVideoView);

    public abstract void startScreenCapture(int i, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams);

    @Deprecated
    public abstract void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams);

    public abstract int startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams);

    @Deprecated
    public abstract void startSpeedTest(int i, String str, String str2);

    public abstract void startSystemAudioLoopback();

    @Deprecated
    public abstract void stopAllAudioEffects();

    public abstract void stopAllRemoteView();

    @Deprecated
    public abstract void stopAudioEffect(int i);

    public abstract void stopAudioRecording();

    @Deprecated
    public abstract void stopBGM();

    public abstract void stopLocalAudio();

    public abstract void stopLocalPreview();

    public abstract void stopLocalRecording();

    public abstract void stopPublishCDNStream();

    public abstract void stopPublishing();

    @Deprecated
    public abstract void stopRemoteSubStreamView(String str);

    @Deprecated
    public abstract void stopRemoteView(String str);

    public abstract void stopRemoteView(String str, int i);

    public abstract void stopScreenCapture();

    public abstract void stopSpeedTest();

    public abstract void stopSystemAudioLoopback();

    @Deprecated
    public abstract void switchCamera();

    public abstract void switchRole(int i);

    public abstract void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig);

    public abstract void updateLocalView(TXCloudVideoView tXCloudVideoView);

    public abstract void updateRemoteView(String str, int i, TXCloudVideoView tXCloudVideoView);
}
