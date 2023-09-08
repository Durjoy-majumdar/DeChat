package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.base.util.C28637q;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.live.TXLivePusherJni;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.ugc.TXRecordCommon;

public class TXLivePusher implements C26957b {
    public static final int RGB_BGRA = 4;
    public static final int RGB_RGBA = 5;
    private static final String TAG = "TXLivePusher";
    public static final int YUV_420P = 3;
    public static final int YUV_420SP = 1;
    public static final int YUV_420YpCbCr = 2;
    private C26957b mImpl;

    public interface AudioCustomProcessListener {
        void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3);

        void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z);
    }

    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i);
    }

    public interface ITXSnapshotListener {
        void onSnapshot(Bitmap bitmap);
    }

    @Deprecated
    public interface OnBGMNotify {
        void onBGMComplete(int i);

        void onBGMProgress(long j, long j2);

        void onBGMStart();
    }

    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i, int i2, int i3);

        void onTextureDestoryed();
    }

    static {
        C28637q.m38304a();
    }

    public TXLivePusher(Context context) {
        this.mImpl = new TXLivePusherJni(context);
        LiteavLog.m16901i(TAG, "Create instance:" + this.mImpl.toString());
    }

    public synchronized void callExperimentalAPI(String str) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.callExperimentalAPI(str);
        }
    }

    public synchronized void enableAudioVolumeEvaluation(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.enableAudioVolumeEvaluation(i);
        }
    }

    public synchronized TXAudioEffectManager getAudioEffectManager() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getAudioEffectManager();
    }

    public synchronized TXBeautyManager getBeautyManager() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getBeautyManager();
    }

    public synchronized TXLivePushConfig getConfig() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return new TXLivePushConfig();
        }
        return bVar.getConfig();
    }

    public synchronized int getMaxZoom() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMaxZoom();
    }

    @Deprecated
    public synchronized int getMusicDuration(String str) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMusicDuration(str);
    }

    public synchronized boolean isPushing() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.isPushing();
    }

    public synchronized void onLogRecord(String str) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.onLogRecord(str);
        }
    }

    @Deprecated
    public synchronized boolean pauseBGM() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.pauseBGM();
    }

    public synchronized void pausePusher() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.pausePusher();
        }
    }

    @Deprecated
    public synchronized boolean playBGM(String str) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.playBGM(str);
    }

    public synchronized void release() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.release();
            LiteavLog.m16901i(TAG, "Release instance:" + this.mImpl.toString());
            this.mImpl = null;
        }
    }

    @Deprecated
    public synchronized boolean resumeBGM() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.resumeBGM();
    }

    public synchronized void resumePusher() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.resumePusher();
        }
    }

    public synchronized void sendCustomPCMData(byte[] bArr) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.sendCustomPCMData(bArr);
        }
    }

    public synchronized int sendCustomVideoData(byte[] bArr, int i, int i2, int i3) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoData(bArr, i, i2, i3);
    }

    public synchronized int sendCustomVideoTexture(int i, int i2, int i3) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoTexture(i, i2, i3);
    }

    @Deprecated
    public synchronized void sendMessage(byte[] bArr) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.sendMessage(bArr);
        }
    }

    public synchronized boolean sendMessageEx(byte[] bArr) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.sendMessageEx(bArr);
    }

    public synchronized void setAudioProcessListener(AudioCustomProcessListener audioCustomProcessListener) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setAudioProcessListener(audioCustomProcessListener);
        }
    }

    public synchronized void setAudioVolumeEvaluationListener(ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setAudioVolumeEvaluationListener(iTXAudioVolumeEvaluationListener);
        }
    }

    @Deprecated
    public synchronized void setBGMNofify(OnBGMNotify onBGMNotify) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setBGMNofify(onBGMNotify);
        }
    }

    @Deprecated
    public synchronized void setBGMPitch(float f) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setBGMPitch(f);
        }
    }

    @Deprecated
    public synchronized boolean setBGMPosition(int i) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMPosition(i);
    }

    @Deprecated
    public synchronized boolean setBGMVolume(float f) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMVolume(f);
    }

    public synchronized boolean setBeautyFilter(int i, int i2, int i3, int i4) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBeautyFilter(i, i2, i3, i4);
    }

    @Deprecated
    public synchronized void setChinLevel(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setChinLevel(i);
        }
    }

    public synchronized void setConfig(TXLivePushConfig tXLivePushConfig) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setConfig(tXLivePushConfig);
        }
    }

    public synchronized void setExposureCompensation(float f) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setExposureCompensation(f);
        }
    }

    @Deprecated
    public synchronized void setEyeScaleLevel(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setEyeScaleLevel(i);
        }
    }

    @Deprecated
    public synchronized void setFaceShortLevel(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setFaceShortLevel(i);
        }
    }

    @Deprecated
    public synchronized void setFaceSlimLevel(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setFaceSlimLevel(i);
        }
    }

    @Deprecated
    public synchronized void setFaceVLevel(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setFaceVLevel(i);
        }
    }

    @Deprecated
    public synchronized void setFilter(Bitmap bitmap) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setFilter(bitmap);
        }
    }

    public synchronized void setFocusPosition(float f, float f2) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setFocusPosition(f, f2);
        }
    }

    @Deprecated
    public synchronized boolean setGreenScreenFile(String str) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setGreenScreenFile(str);
    }

    @Deprecated
    public synchronized boolean setMicVolume(float f) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMicVolume(f);
    }

    public synchronized boolean setMirror(boolean z) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMirror(z);
    }

    @Deprecated
    public synchronized void setMotionMute(boolean z) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setMotionMute(z);
        }
    }

    @Deprecated
    public synchronized void setMotionTmpl(String str) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setMotionTmpl(str);
        }
    }

    public synchronized void setMute(boolean z) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setMute(z);
        }
    }

    @Deprecated
    public synchronized void setNoseSlimLevel(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setNoseSlimLevel(i);
        }
    }

    public synchronized void setPushListener(ITXLivePushListener iTXLivePushListener) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setPushListener(iTXLivePushListener);
        }
    }

    public synchronized void setRenderRotation(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setRenderRotation(i);
        }
    }

    @Deprecated
    public synchronized void setReverb(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setReverb(i);
        }
    }

    @Deprecated
    public synchronized void setSpecialRatio(float f) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setSpecialRatio(f);
        }
    }

    public synchronized void setSurface(Surface surface) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setSurface(surface);
        }
    }

    public synchronized void setSurfaceSize(int i, int i2) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setSurfaceSize(i, i2);
        }
    }

    public synchronized void setVideoProcessListener(VideoCustomProcessListener videoCustomProcessListener) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setVideoProcessListener(videoCustomProcessListener);
        }
    }

    public synchronized void setVideoQuality(int i, boolean z, boolean z2) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setVideoQuality(i, z, z2);
        }
    }

    public synchronized void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setVideoRecordListener(iTXVideoRecordListener);
        }
    }

    @Deprecated
    public synchronized void setVoiceChangerType(int i) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.setVoiceChangerType(i);
        }
    }

    public synchronized boolean setZoom(int i) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setZoom(i);
    }

    public synchronized void snapshot(ITXSnapshotListener iTXSnapshotListener) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.snapshot(iTXSnapshotListener);
        }
    }

    public synchronized void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.startCameraPreview(tXCloudVideoView);
        }
    }

    public synchronized int startPusher(String str) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.startPusher(str);
    }

    public synchronized int startRecord(String str) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return -3;
        }
        return bVar.startRecord(str);
    }

    public synchronized void startScreenCapture() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.startScreenCapture();
        }
    }

    @Deprecated
    public synchronized boolean stopBGM() {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.stopBGM();
    }

    public synchronized void stopCameraPreview(boolean z) {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.stopCameraPreview(z);
        }
    }

    public synchronized void stopPusher() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.stopPusher();
        }
    }

    public synchronized void stopRecord() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.stopRecord();
        }
    }

    public synchronized void stopScreenCapture() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.stopScreenCapture();
        }
    }

    public synchronized void switchCamera() {
        C26957b bVar = this.mImpl;
        if (bVar != null) {
            bVar.switchCamera();
        }
    }

    public synchronized boolean turnOnFlashLight(boolean z) {
        C26957b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.turnOnFlashLight(z);
    }
}
