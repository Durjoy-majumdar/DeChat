package com.tencent.liteav.trtc;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Handler;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C113471i;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.TimeUtil;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.device.TXDeviceManager;
import com.tencent.liteav.device.TXDeviceManagerImpl;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.trtc.TRTCCloud;
import com.tencent.trtc.TRTCCloudDef;
import com.tencent.trtc.TRTCCloudListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class TRTCCloudImpl extends TRTCCloud implements TXAudioEffectManager.TXMusicPlayObserver {

    /* renamed from: a */
    private static boolean f46411a;

    /* renamed from: b */
    private static TRTCCloudImpl f46412b;

    /* renamed from: c */
    private Context f46413c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public TRTCCloudListener f46414d;

    /* renamed from: e */
    private TrtcCloudJni f46415e;

    /* renamed from: f */
    private TRTCCloud.BGMNotify f46416f;

    /* renamed from: g */
    private TXAudioEffectManagerImpl f46417g;

    /* renamed from: h */
    private TXDeviceManagerImpl f46418h;

    /* renamed from: i */
    private TXBeautyManager f46419i;

    /* renamed from: j */
    private int f46420j;

    /* renamed from: k */
    private ArrayList<TRTCCloudImpl> f46421k = new ArrayList<>();

    private TRTCCloudImpl(Context context) {
        m17018b(context);
        this.f46413c = context;
        m17012a(context, 0);
    }

    /* renamed from: b */
    private static void m17018b(Context context) {
        synchronized (TRTCCloudImpl.class) {
            if (!f46411a) {
                ContextUtils.initApplicationContext(context.getApplicationContext());
                ContextUtils.setDataDirectorySuffix("liteav");
                TrtcCloudJni.init(0);
                f46411a = true;
            }
        }
    }

    public static TRTCCloud createInstance(Context context) {
        return new TRTCCloudImpl(context);
    }

    public static void destroyInstance(TRTCCloud tRTCCloud) {
        if (tRTCCloud instanceof TRTCCloudImpl) {
            ((TRTCCloudImpl) tRTCCloud).f46415e.destroy();
        } else {
            LiteavLog.m16905w("TRTCCloudImpl", "destroyInstance trtcCloud=".concat(String.valueOf(tRTCCloud)));
        }
    }

    public void ConnectOtherRoom(String str) {
        this.f46415e.connectOtherRoom(str);
    }

    public void DisconnectOtherRoom() {
        this.f46415e.disconnectOtherRoom();
    }

    public void callExperimentalAPI(String str) {
        this.f46415e.callExperimentalAPI(str);
    }

    public int checkAudioCapabilitySupport(int i) {
        return (i != 2 || !this.f46418h.isLowLatencyEarMonitorSupported()) ? 0 : 1;
    }

    public TRTCCloud createSubCloud() {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            tRTCCloudImpl = new TRTCCloudImpl(ContextUtils.getApplicationContext(), this.f46415e.getTrtcCloudJni());
            this.f46421k.add(tRTCCloudImpl);
        }
        return tRTCCloudImpl;
    }

    public void destroySubCloud(TRTCCloud tRTCCloud) {
        synchronized (TRTCCloudImpl.class) {
            if (tRTCCloud instanceof TRTCCloudImpl) {
                LiteavLog.m16901i("TRTCCloudImpl", "destructor destroySubCloud");
                ((TRTCCloudImpl) tRTCCloud).f46415e.destroy();
                this.f46421k.remove(tRTCCloud);
            }
        }
    }

    public void enableAudioEarMonitoring(boolean z) {
        this.f46417g.enableVoiceEarMonitor(z);
    }

    public void enableAudioVolumeEvaluation(int i) {
        this.f46415e.enableAudioVolumeEvaluation(i);
    }

    public void enableCustomAudioCapture(boolean z) {
        this.f46415e.enableCustomAudioCapture(z);
    }

    public void enableCustomAudioRendering(boolean z) {
        this.f46415e.enableCustomAudioRendering(z);
    }

    public void enableCustomVideoCapture(int i, boolean z) {
        this.f46415e.enableCustomVideoCapture(i, z);
    }

    public int enableEncSmallVideoStream(boolean z, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        return this.f46415e.enableEncSmallVideoStream(z, tRTCVideoEncParam);
    }

    public void enableMixExternalAudioFrame(boolean z, boolean z2) {
        this.f46415e.enableMixExternalAudioFrame(z, z2);
    }

    public boolean enableTorch(boolean z) {
        return this.f46418h.enableCameraTorch(z);
    }

    public void enterRoom(TRTCCloudDef.TRTCParams tRTCParams, int i) {
        this.f46415e.enterRoom(tRTCParams, i);
    }

    public void exitRoom() {
        this.f46415e.exitRoom();
        try {
            File file = new File(m17016b());
            if (file.exists() && file.isDirectory() && C113471i.m155357a(file, 5) > 52428800) {
                for (File delete : file.listFiles()) {
                    delete.delete();
                }
            }
        } catch (Exception e) {
            LiteavLog.m16905w("TRTCCloudImpl", "clearCache error " + e.toString());
        }
    }

    public long generateCustomPTS() {
        return TimeUtil.m16909a();
    }

    public int getAudioCaptureVolume() {
        return this.f46415e.getAudioCaptureVolume();
    }

    public TXAudioEffectManager getAudioEffectManager() {
        return this.f46417g;
    }

    public int getAudioPlayoutVolume() {
        return this.f46415e.getAudioPlayoutVolume();
    }

    public int getBGMDuration(String str) {
        return (int) this.f46417g.getMusicDurationInMS(str);
    }

    public TXBeautyManager getBeautyManager() {
        return this.f46419i;
    }

    public void getCustomAudioRenderingFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.f46415e.getCustomAudioRenderingFrame(tRTCAudioFrame);
    }

    public TXDeviceManager getDeviceManager() {
        return this.f46418h;
    }

    public boolean isCameraAutoFocusFaceModeSupported() {
        return this.f46418h.isCameraAutoFocusFaceModeSupported();
    }

    public boolean isCameraFocusPositionInPreviewSupported() {
        return this.f46418h.isCameraFocusPositionInPreviewSupported();
    }

    public boolean isCameraTorchSupported() {
        return this.f46418h.isCameraTorchSupported();
    }

    public boolean isCameraZoomSupported() {
        return this.f46418h.isCameraZoomSupported();
    }

    public int mixExternalAudioFrame(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        return this.f46415e.mixExternalAudioFrame(tRTCAudioFrame);
    }

    public void muteAllRemoteAudio(boolean z) {
        this.f46415e.muteAllRemoteAudio(z);
    }

    public void muteAllRemoteVideoStreams(boolean z) {
        this.f46415e.muteAllRemoteVideoStreams(z);
    }

    public void muteLocalAudio(boolean z) {
        this.f46415e.muteLocalAudio(z);
    }

    public void muteLocalVideo(int i, boolean z) {
        this.f46415e.muteLocalVideo(i, z);
    }

    public void muteRemoteAudio(String str, boolean z) {
        this.f46415e.muteRemoteAudio(str, z);
    }

    public void muteRemoteVideoStream(String str, int i, boolean z) {
        this.f46415e.muteRemoteVideoStream(str, i, z);
    }

    public void onComplete(int i, int i2) {
        TRTCCloud.BGMNotify bGMNotify = this.f46416f;
        if (bGMNotify != null) {
            bGMNotify.onBGMComplete(i2);
        }
    }

    public void onPlayProgress(int i, long j, long j2) {
        TRTCCloud.BGMNotify bGMNotify = this.f46416f;
        if (bGMNotify != null) {
            bGMNotify.onBGMProgress(j, j2);
        }
    }

    public void onStart(int i, int i2) {
        TRTCCloud.BGMNotify bGMNotify = this.f46416f;
        if (bGMNotify != null) {
            bGMNotify.onBGMStart(i2);
        }
    }

    public void pauseAudioEffect(int i) {
        this.f46417g.pauseAudioEffect(i);
    }

    public void pauseBGM() {
        this.f46417g.pausePlayMusic(Integer.MAX_VALUE);
    }

    public void pauseScreenCapture() {
        this.f46415e.pauseScreenCapture(this.f46420j);
    }

    public void playAudioEffect(TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam) {
        if (tRTCAudioEffectParam != null) {
            final int i = tRTCAudioEffectParam.effectId;
            TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(i, m17017b(tRTCAudioEffectParam.path));
            audioMusicParam.publish = tRTCAudioEffectParam.publish;
            audioMusicParam.loopCount = tRTCAudioEffectParam.loopCount;
            audioMusicParam.isShortFile = true;
            this.f46417g.playAudioEffect(audioMusicParam);
            this.f46417g.setEffectObserver(i, new TXAudioEffectManager.TXMusicPlayObserver() {
                public final void onComplete(int i, int i2) {
                    TRTCCloudListener a = TRTCCloudImpl.this.f46414d;
                    if (a != null) {
                        a.onAudioEffectFinished(i, i2);
                    }
                }

                public final void onPlayProgress(int i, long j, long j2) {
                }

                public final void onStart(int i, int i2) {
                    TRTCCloudListener a = TRTCCloudImpl.this.f46414d;
                    if (a != null && i2 < 0) {
                        a.onAudioEffectFinished(i, i2);
                    }
                }
            });
        }
    }

    public void playBGM(String str, TRTCCloud.BGMNotify bGMNotify) {
        this.f46416f = bGMNotify;
        TXAudioEffectManager.AudioMusicParam audioMusicParam = new TXAudioEffectManager.AudioMusicParam(Integer.MAX_VALUE, str);
        audioMusicParam.publish = true;
        audioMusicParam.loopCount = 0;
        this.f46417g.setMusicObserver(Integer.MAX_VALUE, this);
        this.f46417g.startPlayMusic(audioMusicParam);
    }

    public void resumeAudioEffect(int i) {
        this.f46417g.resumeAudioEffect(i);
    }

    public void resumeBGM() {
        this.f46417g.resumePlayMusic(Integer.MAX_VALUE);
    }

    public void resumeScreenCapture() {
        this.f46415e.resumeScreenCapture(this.f46420j);
    }

    public void selectMotionTmpl(String str) {
        this.f46419i.setMotionTmpl(str);
    }

    public void sendCustomAudioData(TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        this.f46415e.sendCustomAudioData(tRTCAudioFrame);
    }

    public boolean sendCustomCmdMsg(int i, byte[] bArr, boolean z, boolean z2) {
        if (bArr != null) {
            return this.f46415e.sendCustomCmdMsg(i, bArr, z, z2);
        }
        LiteavLog.m16905w("TRTCCloudImpl", "custom msg data is null.");
        return false;
    }

    public void sendCustomVideoData(int i, TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        if (tRTCVideoFrame == null) {
            LiteavLog.m16905w("TRTCCloudImpl", "sendCustomVideoData frame is null");
            return;
        }
        if (tRTCVideoFrame.bufferType == 2) {
            GLES20.glFinish();
        }
        this.f46415e.sendCustomVideoData(i, tRTCVideoFrame);
    }

    public boolean sendSEIMsg(byte[] bArr, int i) {
        if (bArr != null && i != 0) {
            return this.f46415e.sendSEIMsg(bArr, i);
        }
        LiteavLog.m16905w("TRTCCloudImpl", "sei msg data is null or repeatCount is zero.");
        return false;
    }

    public void setAllAudioEffectsVolume(int i) {
        this.f46417g.setAllAudioEffectsVolume(i);
    }

    public void setAudioCaptureVolume(int i) {
        this.f46415e.setAudioCaptureVolume(i);
    }

    public void setAudioEffectVolume(int i, int i2) {
        this.f46417g.setAudioEffectVolume(i, i2);
    }

    public void setAudioFrameListener(TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener) {
        this.f46415e.setAudioFrameListener(tRTCAudioFrameListener);
    }

    public void setAudioPlayoutVolume(int i) {
        this.f46415e.setAudioPlayoutVolume(i);
    }

    public void setAudioQuality(int i) {
        this.f46415e.setAudioQuality(i);
    }

    public void setAudioRoute(int i) {
        this.f46418h.setAudioRoute(TXDeviceManagerImpl.audioRouteFromInt(i));
    }

    public void setBGMPlayoutVolume(int i) {
        this.f46417g.setMusicPlayoutVolume(Integer.MAX_VALUE, i);
    }

    public int setBGMPosition(int i) {
        this.f46417g.seekMusicToPosInMS(Integer.MAX_VALUE, i);
        return 0;
    }

    public void setBGMPublishVolume(int i) {
        this.f46417g.setMusicPublishVolume(Integer.MAX_VALUE, i);
    }

    public void setBGMVolume(int i) {
        this.f46417g.setMusicPlayoutVolume(Integer.MAX_VALUE, i);
        this.f46417g.setMusicPublishVolume(Integer.MAX_VALUE, i);
    }

    public void setBeautyStyle(int i, int i2, int i3, int i4) {
        this.f46419i.setBeautyStyle(i);
        this.f46419i.setBeautyLevel((float) i2);
        this.f46419i.setWhitenessLevel((float) i3);
        this.f46419i.setRuddyLevel((float) i4);
    }

    public int setCapturedRawAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        return this.f46415e.setCapturedRawAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall);
    }

    public void setChinLevel(int i) {
        this.f46419i.setChinLevel((float) i);
    }

    public void setDebugViewMargin(String str, TRTCCloud.TRTCViewMargin tRTCViewMargin) {
    }

    public void setDefaultStreamRecvMode(boolean z, boolean z2) {
        this.f46415e.setDefaultStreamRecvMode(z, z2);
    }

    public void setEyeScaleLevel(int i) {
        this.f46419i.setEyeScaleLevel((float) i);
    }

    public void setFaceShortLevel(int i) {
        this.f46419i.setFaceShortLevel((float) i);
    }

    public void setFaceSlimLevel(int i) {
        this.f46419i.setFaceSlimLevel((float) i);
    }

    public void setFaceVLevel(int i) {
        this.f46419i.setFaceVLevel((float) i);
    }

    public void setFilter(Bitmap bitmap) {
        this.f46419i.setFilter(bitmap);
    }

    public void setFilterConcentration(float f) {
        this.f46419i.setFilterStrength(f);
    }

    public void setFocusPosition(int i, int i2) {
        this.f46418h.setCameraFocusPosition(i, i2);
    }

    public void setGSensorMode(int i) {
        this.f46415e.setGSensorMode(0, i);
    }

    public boolean setGreenScreenFile(String str) {
        return false;
    }

    public void setListener(TRTCCloudListener tRTCCloudListener) {
        Log.m97545d("TRTCCloudImpl", "setListener ".concat(String.valueOf(tRTCCloudListener)), new Object[0]);
        this.f46414d = tRTCCloudListener;
        this.f46415e.setListener(tRTCCloudListener);
    }

    public void setListenerHandler(Handler handler) {
        this.f46415e.setListenerHandler(handler);
    }

    public int setLocalProcessedAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        return this.f46415e.setLocalProcessedAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall);
    }

    public void setLocalRenderParams(TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        setLocalViewFillMode(tRTCRenderParams.fillMode);
        setLocalViewRotation(tRTCRenderParams.rotation);
        setLocalViewMirror(tRTCRenderParams.mirrorType);
    }

    public int setLocalVideoProcessListener(int i, int i2, TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener) {
        return this.f46415e.setLocalVideoProcessListener(0, i, i2, tRTCVideoFrameListener);
    }

    public int setLocalVideoRenderListener(int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f46415e.setLocalVideoRenderListener(i, i2, tRTCVideoRenderListener);
    }

    public void setLocalViewFillMode(int i) {
        this.f46415e.setLocalViewFillMode(i);
    }

    public void setLocalViewMirror(int i) {
        this.f46415e.setLocalViewMirror(i);
    }

    public void setLocalViewRotation(int i) {
        this.f46415e.setLocalViewRotation(m17015b(i));
    }

    public void setMicVolumeOnMixing(int i) {
        this.f46417g.setVoiceCaptureVolume(i);
    }

    public void setMixExternalAudioVolume(int i, int i2) {
        this.f46415e.setMixExternalAudioVolume(i, i2);
    }

    public void setMixTranscodingConfig(TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig) {
        this.f46415e.setMixTranscodingConfig(tRTCTranscodingConfig);
    }

    public int setMixedPlayAudioFrameCallbackFormat(TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat) {
        return this.f46415e.setMixedPlayAudioFrameCallbackFormat(tRTCAudioFrameCallbackFormat.sampleRate, tRTCAudioFrameCallbackFormat.channel, tRTCAudioFrameCallbackFormat.samplesPerCall);
    }

    public void setMotionMute(boolean z) {
        this.f46419i.setMotionMute(z);
    }

    public void setNetworkQosParam(TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam) {
        this.f46415e.setNetworkQosParam(tRTCNetworkQosParam);
    }

    public void setNoseSlimLevel(int i) {
        this.f46419i.setNoseSlimLevel((float) i);
    }

    public int setPriorRemoteVideoStreamType(int i) {
        return this.f46415e.setPriorRemoteVideoStreamType(i);
    }

    public void setRemoteAudioParallelParams(TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams) {
        this.f46415e.setRemoteAudioParallelParams(tRTCAudioParallelParams);
    }

    public void setRemoteAudioVolume(String str, int i) {
        this.f46415e.setRemoteAudioVolume(str, i);
    }

    public void setRemoteRenderParams(String str, int i, TRTCCloudDef.TRTCRenderParams tRTCRenderParams) {
        this.f46415e.setRemoteViewFillMode(str, i, tRTCRenderParams.fillMode);
        this.f46415e.setRemoteViewRotation(str, i, m17015b(tRTCRenderParams.rotation));
        this.f46415e.setRemoteViewMirror(str, i, tRTCRenderParams.mirrorType);
    }

    public void setRemoteSubStreamViewFillMode(String str, int i) {
        this.f46415e.setRemoteViewFillMode(str, 2, i);
    }

    public void setRemoteSubStreamViewRotation(String str, int i) {
        this.f46415e.setRemoteViewRotation(str, 2, m17015b(i));
    }

    public int setRemoteVideoRenderListener(String str, int i, int i2, TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener) {
        return this.f46415e.setRemoteVideoRenderListener(str, i, i2, tRTCVideoRenderListener);
    }

    public int setRemoteVideoStreamType(String str, int i) {
        return this.f46415e.setRemoteVideoStreamType(str, i);
    }

    public void setRemoteViewFillMode(String str, int i) {
        this.f46415e.setRemoteViewFillMode(str, 0, i);
    }

    public void setRemoteViewRotation(String str, int i) {
        this.f46415e.setRemoteViewRotation(str, 0, m17015b(i));
    }

    public void setReverbType(int i) {
        this.f46417g.setVoiceReverbType(TXAudioEffectManagerImpl.voiceReverbTypeFromInt(i));
    }

    public void setSubStreamEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f46415e.setVideoEncoderParams(2, tRTCVideoEncParam);
    }

    public void setSystemVolumeType(int i) {
        this.f46418h.setSystemVolumeType(TXDeviceManagerImpl.systemVolumeTypefromInt(i));
    }

    public void setVideoEncoderMirror(boolean z) {
        this.f46415e.setVideoEncoderMirror(z);
    }

    public void setVideoEncoderParam(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam) {
        this.f46415e.setVideoEncoderParams(0, tRTCVideoEncParam);
    }

    public void setVideoEncoderRotation(int i) {
        this.f46415e.setVideoEncoderRotation(m17015b(i));
    }

    public void setVideoMuteImage(Bitmap bitmap, int i) {
        this.f46415e.setVideoMuteImage(0, bitmap, i);
    }

    public boolean setVoiceChangerType(int i) {
        this.f46417g.setVoiceChangerType(TXAudioEffectManagerImpl.voiceChangerTypeFromInt(i));
        return true;
    }

    public void setWatermark(Bitmap bitmap, int i, float f, float f2, float f3) {
        this.f46415e.setWatermark(bitmap, i, f, f2, f3);
    }

    public void setZoom(int i) {
        this.f46418h.setCameraZoomRatio((float) i);
    }

    public void showDebugView(int i) {
        this.f46415e.showDashboardManager(i);
    }

    public void snapshotVideo(String str, int i, TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener) {
        this.f46415e.snapshotVideo(str, i, tRTCSnapshotListener);
    }

    public int startAudioRecording(TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams) {
        return this.f46415e.startAudioRecording(tRTCAudioRecordingParams);
    }

    public void startLocalAudio(int i) {
        this.f46415e.startLocalAudio(i);
    }

    public void startLocalPreview(boolean z, TXCloudVideoView tXCloudVideoView) {
        this.f46415e.startLocalPreview(z, tXCloudVideoView);
    }

    public void startLocalRecording(TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams) {
        this.f46415e.startLocalRecording(tRTCLocalRecordingParams);
    }

    public void startPublishCDNStream(TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam) {
        this.f46415e.startPublishCDNStream(tRTCPublishCDNParam);
    }

    public void startPublishing(String str, int i) {
        this.f46415e.startPublishing(str, i);
    }

    public void startRemoteSubStreamView(String str, TXCloudVideoView tXCloudVideoView) {
        startRemoteView(str, 2, tXCloudVideoView);
    }

    public void startRemoteView(String str, int i, TXCloudVideoView tXCloudVideoView) {
        this.f46415e.startRemoteView(str, i, tXCloudVideoView);
    }

    public void startScreenCapture(int i, TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f46420j = i;
        this.f46415e.startScreenCapture(i, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    public int startSpeedTest(TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams) {
        this.f46415e.startSpeedTest(true, tRTCSpeedTestParams);
        return 0;
    }

    public void startSystemAudioLoopback() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            LiteavLog.m16898e("TRTCCloudImpl", "current system don't support system audio loopback");
        } else {
            this.f46415e.startSystemAudioLoopback();
        }
    }

    public void stopAllAudioEffects() {
        this.f46417g.stopAllAudioEffects();
    }

    public void stopAllRemoteView() {
        this.f46415e.stopAllRemoteView();
    }

    public void stopAudioEffect(int i) {
        this.f46417g.stopAudioEffect(i);
    }

    public void stopAudioRecording() {
        this.f46415e.stopAudioRecording();
    }

    public void stopBGM() {
        this.f46417g.stopPlayMusic(Integer.MAX_VALUE);
        this.f46417g.setMusicObserver(Integer.MAX_VALUE, (TXAudioEffectManager.TXMusicPlayObserver) null);
    }

    public void stopLocalAudio() {
        this.f46415e.stopLocalAudio();
    }

    public void stopLocalPreview() {
        this.f46415e.stopLocalPreview();
    }

    public void stopLocalRecording() {
        this.f46415e.stopLocalRecording();
    }

    public void stopPublishCDNStream() {
        this.f46415e.stopPublishCDNStream();
    }

    public void stopPublishing() {
        this.f46415e.stopPublishing();
    }

    public void stopRemoteSubStreamView(String str) {
        stopRemoteView(str, 2);
    }

    public void stopRemoteView(String str, int i) {
        this.f46415e.stopRemoteView(str, i);
    }

    public void stopScreenCapture() {
        this.f46415e.stopScreenCapture(this.f46420j);
    }

    public void stopSpeedTest() {
        this.f46415e.stopSpeedTest();
    }

    public void stopSystemAudioLoopback() {
        this.f46415e.stopSystemAudioLoopback();
    }

    public void switchCamera() {
        this.f46418h.switchCamera(!this.f46418h.isFrontCamera());
    }

    public void switchRole(int i) {
        this.f46415e.switchRole(i);
    }

    public void switchRoom(TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig) {
        this.f46415e.switchRoom(tRTCSwitchRoomConfig);
    }

    public void updateLocalView(TXCloudVideoView tXCloudVideoView) {
        this.f46415e.updateLocalView(tXCloudVideoView);
    }

    public void updateRemoteView(String str, int i, TXCloudVideoView tXCloudVideoView) {
        this.f46415e.updateRemoteView(str, i, tXCloudVideoView);
    }

    /* renamed from: a */
    public static TRTCCloud m17008a(Context context) {
        TRTCCloudImpl tRTCCloudImpl;
        synchronized (TRTCCloudImpl.class) {
            if (f46412b == null) {
                f46412b = new TRTCCloudImpl(context);
            }
            tRTCCloudImpl = f46412b;
        }
        return tRTCCloudImpl;
    }

    public void enableCustomVideoCapture(boolean z) {
        enableCustomVideoCapture(0, z);
    }

    public void muteLocalVideo(boolean z) {
        this.f46415e.muteLocalVideo(0, z);
    }

    public void muteRemoteVideoStream(String str, boolean z) {
        muteRemoteVideoStream(str, 0, z);
    }

    public void startLocalAudio() {
        this.f46415e.startLocalAudio();
    }

    public void startRemoteView(String str, TXCloudVideoView tXCloudVideoView) {
        this.f46415e.startRemoteView(str, tXCloudVideoView);
    }

    public void startSpeedTest(int i, String str, String str2) {
        TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams = new TRTCCloudDef.TRTCSpeedTestParams();
        tRTCSpeedTestParams.sdkAppId = i;
        tRTCSpeedTestParams.userId = str;
        tRTCSpeedTestParams.userSig = str2;
        this.f46415e.startSpeedTest(false, tRTCSpeedTestParams);
    }

    public void stopRemoteView(String str) {
        this.f46415e.stopRemoteView(str);
    }

    public void startScreenCapture(TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams) {
        this.f46420j = 0;
        startScreenCapture(0, tRTCVideoEncParam, tRTCScreenShareParams);
    }

    public void sendCustomVideoData(TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame) {
        sendCustomVideoData(0, tRTCVideoFrame);
    }

    private TRTCCloudImpl(Context context, long j) {
        m17018b(context);
        this.f46413c = context;
        m17012a(context, j);
    }

    /* renamed from: a */
    public static void m17010a() {
        synchronized (TRTCCloudImpl.class) {
            if (f46412b != null) {
                LiteavLog.m16901i("TRTCCloudImpl", "destructor destroySharedInstance");
                Iterator<TRTCCloudImpl> it = f46412b.f46421k.iterator();
                while (it.hasNext()) {
                    it.next().f46415e.destroy();
                }
                f46412b.f46415e.destroy();
                f46412b = null;
            }
        }
    }

    /* renamed from: b */
    public static void m17019b(boolean z) {
        TrtcCloudJni.setLogCompressEnabled(z);
    }

    /* renamed from: b */
    private String m17016b() {
        return this.f46413c.getCacheDir() + File.separator + "liteav_effect";
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x010d */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bf A[Catch:{ Exception -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fd A[SYNTHETIC, Splitter:B:61:0x00fd] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0107 A[SYNTHETIC, Splitter:B:67:0x0107] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m17017b(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "TRTCCloudImpl"
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto L_0x0009
            return r11
        L_0x0009:
            java.lang.String r1 = "/assets/"
            boolean r1 = r11.startsWith(r1)
            if (r1 != 0) goto L_0x0012
            return r11
        L_0x0012:
            r1 = 8
            java.lang.String r1 = r11.substring(r1)
            android.content.Context r2 = r10.f46413c     // Catch:{ Exception -> 0x0027 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x0027 }
            android.content.res.AssetFileDescriptor r2 = r2.openFd(r1)     // Catch:{ Exception -> 0x0027 }
            long r2 = r2.getLength()     // Catch:{ Exception -> 0x0027 }
            goto L_0x003f
        L_0x0027:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
            java.lang.String r4 = "playAudioEffect openFd error "
            r3.<init>(r4)     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x010e }
            r3.append(r2)     // Catch:{ Exception -> 0x010e }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x010e }
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r2)     // Catch:{ Exception -> 0x010e }
            r2 = 0
        L_0x003f:
            java.lang.String r4 = r10.m17016b()     // Catch:{ Exception -> 0x010e }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x010e }
            r5.<init>(r4)     // Catch:{ Exception -> 0x010e }
            boolean r6 = r5.exists()     // Catch:{ Exception -> 0x010e }
            if (r6 != 0) goto L_0x0052
            r5.mkdirs()     // Catch:{ Exception -> 0x010e }
            goto L_0x005e
        L_0x0052:
            boolean r6 = r5.isFile()     // Catch:{ Exception -> 0x010e }
            if (r6 == 0) goto L_0x005e
            r5.delete()     // Catch:{ Exception -> 0x010e }
            r5.mkdirs()     // Catch:{ Exception -> 0x010e }
        L_0x005e:
            char r5 = java.io.File.separatorChar     // Catch:{ Exception -> 0x010e }
            int r5 = r1.lastIndexOf(r5)     // Catch:{ Exception -> 0x010e }
            r6 = -1
            r7 = 1
            java.lang.String r8 = "_"
            if (r5 == r6) goto L_0x008a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
            r6.<init>()     // Catch:{ Exception -> 0x010e }
            r6.append(r4)     // Catch:{ Exception -> 0x010e }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x010e }
            r6.append(r4)     // Catch:{ Exception -> 0x010e }
            r6.append(r2)     // Catch:{ Exception -> 0x010e }
            r6.append(r8)     // Catch:{ Exception -> 0x010e }
            int r5 = r5 + r7
            java.lang.String r2 = r1.substring(r5)     // Catch:{ Exception -> 0x010e }
            r6.append(r2)     // Catch:{ Exception -> 0x010e }
            java.lang.String r11 = r6.toString()     // Catch:{ Exception -> 0x010e }
            goto L_0x00a4
        L_0x008a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010e }
            r5.<init>()     // Catch:{ Exception -> 0x010e }
            r5.append(r4)     // Catch:{ Exception -> 0x010e }
            java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x010e }
            r5.append(r4)     // Catch:{ Exception -> 0x010e }
            r5.append(r2)     // Catch:{ Exception -> 0x010e }
            r5.append(r8)     // Catch:{ Exception -> 0x010e }
            r5.append(r1)     // Catch:{ Exception -> 0x010e }
            java.lang.String r11 = r5.toString()     // Catch:{ Exception -> 0x010e }
        L_0x00a4:
            boolean r2 = android.text.TextUtils.isEmpty(r11)     // Catch:{ Exception -> 0x010e }
            if (r2 != 0) goto L_0x00bc
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x010e }
            r2.<init>(r11)     // Catch:{ Exception -> 0x010e }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x010e }
            if (r3 == 0) goto L_0x00bc
            boolean r2 = r2.isFile()     // Catch:{ Exception -> 0x010e }
            if (r2 == 0) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r7 = 0
        L_0x00bd:
            if (r7 != 0) goto L_0x0124
            android.content.Context r2 = r10.f46413c     // Catch:{ Exception -> 0x010e }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ Exception -> 0x010e }
            r3 = 0
            java.io.InputStream r1 = r2.open(r1)     // Catch:{ IOException -> 0x00ed, all -> 0x00e8 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00e3, all -> 0x00de }
            r2.<init>(r11)     // Catch:{ IOException -> 0x00e3, all -> 0x00de }
            com.tencent.liteav.base.util.C113471i.m155359a((java.io.InputStream) r1, (java.io.OutputStream) r2)     // Catch:{ IOException -> 0x00dc }
            com.tencent.liteav.base.util.C113471i.m155358a(r1)     // Catch:{ Exception -> 0x010e }
            r2.flush()     // Catch:{ IOException -> 0x0124 }
        L_0x00d8:
            r2.close()     // Catch:{ IOException -> 0x0124 }
            goto L_0x0124
        L_0x00dc:
            r3 = move-exception
            goto L_0x00f1
        L_0x00de:
            r2 = move-exception
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0102
        L_0x00e3:
            r2 = move-exception
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x00f1
        L_0x00e8:
            r1 = move-exception
            r2 = r3
            r3 = r1
            r1 = r2
            goto L_0x0102
        L_0x00ed:
            r1 = move-exception
            r2 = r3
            r3 = r1
            r1 = r2
        L_0x00f1:
            java.lang.String r4 = "FileUtil"
            java.lang.String r5 = "copy asset file failed."
            com.tencent.liteav.base.util.LiteavLog.m16899e((java.lang.String) r4, (java.lang.String) r5, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0101 }
            com.tencent.liteav.base.util.C113471i.m155358a(r1)     // Catch:{ Exception -> 0x010e }
            if (r2 == 0) goto L_0x0124
            r2.flush()     // Catch:{ IOException -> 0x0124 }
            goto L_0x00d8
        L_0x0101:
            r3 = move-exception
        L_0x0102:
            com.tencent.liteav.base.util.C113471i.m155358a(r1)     // Catch:{ Exception -> 0x010e }
            if (r2 == 0) goto L_0x010d
            r2.flush()     // Catch:{ IOException -> 0x010d }
            r2.close()     // Catch:{ IOException -> 0x010d }
        L_0x010d:
            throw r3     // Catch:{ Exception -> 0x010e }
        L_0x010e:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "playAudioEffect error "
            r2.<init>(r3)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.liteav.base.util.LiteavLog.m16898e(r0, r1)
        L_0x0124:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.trtc.TRTCCloudImpl.m17017b(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private void m17012a(Context context, long j) {
        this.f46413c = context.getApplicationContext();
        if (j == 0) {
            this.f46415e = new TrtcCloudJni();
        } else {
            this.f46415e = new TrtcCloudJni(j);
        }
        this.f46418h = new TXDeviceManagerImpl(this.f46415e.createDeviceManager());
        this.f46417g = new TXAudioEffectManagerImpl(this.f46415e.createAudioEffectManager());
        this.f46419i = new TXBeautyManagerImpl(this.f46415e.createBeautyManager());
    }

    /* renamed from: a */
    public static void m17011a(int i) {
        TrtcCloudJni.setLogLevel(i);
    }

    /* renamed from: a */
    public static void m17014a(boolean z) {
        TrtcCloudJni.setConsoleEnabled(z);
    }

    /* renamed from: a */
    public static void m17013a(String str) {
        TrtcCloudJni.setLogDirPath(str);
    }

    /* renamed from: b */
    private static int m17015b(int i) {
        if (i < 0) {
            return 0;
        }
        return i > 3 ? (i / 90) % 4 : i;
    }
}
