package com.tencent.liteav.live;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.audio.TXAudioEffectManager;
import com.tencent.liteav.audio.TXAudioEffectManagerImpl;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.C26957b;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.ugc.TXRecordCommon;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

@JNINamespace("liteav")
public class TXLivePusherJni implements ITXLivePushListener, TXLivePusher.AudioCustomProcessListener, TXLivePusher.ITXAudioVolumeEvaluationListener, TXLivePusher.ITXSnapshotListener, TXLivePusher.OnBGMNotify, TXLivePusher.VideoCustomProcessListener, C26957b, TXCloudVideoView.C106890b {
    private TXLivePusher.AudioCustomProcessListener mAudioCustomProcessListener;
    private TXAudioEffectManager mAudioEffectManager;
    private TXBeautyManager mBeautyManager;
    private TXLivePushConfig mConfig;
    private TXLivePusher.ITXAudioVolumeEvaluationListener mITXAudioVolumeEvaluationListener;
    private ITXLivePushListener mITXLivePushListener;
    private TXLivePusher.ITXSnapshotListener mITXSnapshotListener;
    private TXRecordCommon.ITXVideoRecordListener mITXVideoRecordListener;
    private long mNativeTXLivePusherJni = 0;
    private TXLivePusher.OnBGMNotify mOnBGMNotify;
    private Surface mSurface;
    private int mSurfaceHeight = -1;
    private int mSurfaceWidth = -1;
    private TXLivePusher.VideoCustomProcessListener mVideoCustomProcessListener;
    private int mVideoQuality = -1;

    public TXLivePusherJni(Context context) {
        ContextUtils.initApplicationContext(context.getApplicationContext());
        ContextUtils.setDataDirectorySuffix("liteav");
        this.mConfig = new TXLivePushConfig();
        long nativeCreate = nativeCreate(new WeakReference(this));
        this.mNativeTXLivePusherJni = nativeCreate;
        this.mAudioEffectManager = new TXAudioEffectManagerImpl(nativeCreateAudioEffectManager(nativeCreate));
        this.mBeautyManager = new TXBeautyManagerImpl(nativeCreateBeautyManager(this.mNativeTXLivePusherJni));
    }

    private static native void nativeCallExperimentalAPI(long j, String str);

    private static native long nativeCreate(WeakReference<TXLivePusherJni> weakReference);

    private static native long nativeCreateAudioEffectManager(long j);

    private static native long nativeCreateBeautyManager(long j);

    private static native void nativeDestroy(long j);

    private static native void nativeEnableAudioVolumeEvaluation(long j, int i);

    private static native int nativeGetMaxZoom(long j);

    private static native int nativeGetMusicDuration(long j, String str);

    private static native boolean nativeIsPushing(long j);

    private static native void nativeOnLogRecord(long j, String str);

    private static native boolean nativePauseBGM(long j);

    private static native void nativePausePusher(long j);

    private static native boolean nativePlayBGM(long j, String str);

    private static native boolean nativeResumeBGM(long j);

    private static native void nativeResumePusher(long j);

    private static native void nativeSendCustomPCMData(long j, byte[] bArr);

    private static native void nativeSendCustomVideoFrame(long j, PixelFrame pixelFrame);

    private static native void nativeSendMessage(long j, byte[] bArr);

    private static native boolean nativeSendMessageEx(long j, byte[] bArr);

    private static native void nativeSetAudioConfig(long j, int i, int i2, int i3, boolean z, boolean z2);

    private static native void nativeSetBGMPitch(long j, float f);

    private static native boolean nativeSetBGMPosition(long j, int i);

    private static native boolean nativeSetBGMVolume(long j, float f);

    private static native boolean nativeSetBeautyFilter(long j, int i, int i2, int i3, int i4);

    private static native void nativeSetCaptureConfig(long j, int i, int i2, Bitmap bitmap, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4);

    private static native void nativeSetEncoderConfig(long j, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, boolean z2, int i8, boolean z3);

    private static native void nativeSetExposureCompensation(long j, float f);

    private static native void nativeSetFilter(long j, Bitmap bitmap);

    private static native void nativeSetFocusPosition(long j, float f, float f2);

    private static native boolean nativeSetMicVolume(long j, float f);

    private static native boolean nativeSetMirror(long j, boolean z);

    private static native void nativeSetMute(long j, boolean z);

    private static native void nativeSetNetworkConfig(long j, int i, boolean z, int i2, int i3, int i4);

    private static native void nativeSetRenderRotation(long j, int i);

    private static native void nativeSetReverb(long j, int i);

    private static native void nativeSetSpecialRatio(long j, float f);

    private static native void nativeSetView(long j, DisplayTarget displayTarget);

    private static native void nativeSetVoiceChangerType(long j, int i);

    private static native void nativeSetWaterMark(long j, Bitmap bitmap, float f, float f2, float f3);

    private static native boolean nativeSetZoom(long j, int i);

    private static native void nativeShowDebugView(long j, boolean z);

    private static native void nativeSnapshot(long j);

    private static native void nativeStartCamera(long j);

    private static native int nativeStartPusher(long j, String str);

    private static native int nativeStartRecord(long j, String str);

    private static native void nativeStartScreenCapture(long j);

    private static native boolean nativeStopBGM(long j);

    private static native void nativeStopCameraPreview(long j, boolean z);

    private static native void nativeStopPusher(long j);

    private static native void nativeStopRecord(long j);

    private static native void nativeStopScreenCapture(long j);

    private static native void nativeSwitchCamera(long j);

    private static native boolean nativeTurnOnFlashLight(long j, boolean z);

    public static TXLivePusherJni weakToStrongReference(WeakReference<TXLivePusherJni> weakReference) {
        return weakReference.get();
    }

    public void callExperimentalAPI(String str) {
        nativeCallExperimentalAPI(this.mNativeTXLivePusherJni, str);
    }

    public void enableAudioVolumeEvaluation(int i) {
        nativeEnableAudioVolumeEvaluation(this.mNativeTXLivePusherJni, i);
    }

    public void finalize() {
        super.finalize();
        release();
    }

    public TXAudioEffectManager getAudioEffectManager() {
        return this.mAudioEffectManager;
    }

    public TXBeautyManager getBeautyManager() {
        return this.mBeautyManager;
    }

    public TXLivePushConfig getConfig() {
        return this.mConfig;
    }

    public int getMaxZoom() {
        return nativeGetMaxZoom(this.mNativeTXLivePusherJni);
    }

    public int getMusicDuration(String str) {
        return nativeGetMusicDuration(this.mNativeTXLivePusherJni, str);
    }

    public boolean isPushing() {
        return nativeIsPushing(this.mNativeTXLivePusherJni);
    }

    public void onAudioVolumeEvaluationNotify(int i) {
        TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener = this.mITXAudioVolumeEvaluationListener;
        if (iTXAudioVolumeEvaluationListener != null) {
            iTXAudioVolumeEvaluationListener.onAudioVolumeEvaluationNotify(i);
        }
    }

    public void onBGMComplete(int i) {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMComplete(i);
        }
    }

    public void onBGMProgress(long j, long j2) {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMProgress(j, j2);
        }
    }

    public void onBGMStart() {
        TXLivePusher.OnBGMNotify onBGMNotify = this.mOnBGMNotify;
        if (onBGMNotify != null) {
            onBGMNotify.onBGMStart();
        }
    }

    public boolean onCustomPreprocessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2) {
        int onTextureCustomProcess = onTextureCustomProcess(pixelFrame.getTextureId(), pixelFrame.getWidth(), pixelFrame.getHeight());
        if (onTextureCustomProcess == -1) {
            return false;
        }
        pixelFrame2.setTextureId(onTextureCustomProcess);
        return true;
    }

    public void onDetectFacePoints(float[] fArr) {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onDetectFacePoints(fArr);
        }
    }

    public void onLogRecord(String str) {
        nativeOnLogRecord(this.mNativeTXLivePusherJni, str);
    }

    public byte[] onNativeRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        onRecordPcmData(bArr, j, i, i2, i3);
        return bArr;
    }

    public byte[] onNativeRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
        onRecordRawPcmData(bArr, j, i, i2, i3, z);
        return bArr;
    }

    public void onNetStatus(Bundle bundle) {
        ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onNetStatus(bundle);
        }
    }

    public void onPushEvent(int i, Bundle bundle) {
        ITXLivePushListener iTXLivePushListener = this.mITXLivePushListener;
        if (iTXLivePushListener != null) {
            iTXLivePushListener.onPushEvent(i, bundle);
        }
    }

    public void onRecordComplete(int i, String str, String str2, String str3) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            TXRecordCommon.TXRecordResult tXRecordResult = new TXRecordCommon.TXRecordResult();
            if (i == 0) {
                tXRecordResult.retCode = 0;
            } else {
                tXRecordResult.retCode = -1;
            }
            tXRecordResult.descMsg = str;
            tXRecordResult.videoPath = str2;
            tXRecordResult.coverPath = str3;
            iTXVideoRecordListener.onRecordComplete(tXRecordResult);
        }
    }

    public void onRecordEvent(int i, Bundle bundle) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordEvent(i, bundle);
        }
    }

    public void onRecordPcmData(byte[] bArr, long j, int i, int i2, int i3) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordPcmData(bArr, j, i, i2, i3);
        }
    }

    public void onRecordProgress(long j) {
        TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener = this.mITXVideoRecordListener;
        if (iTXVideoRecordListener != null) {
            iTXVideoRecordListener.onRecordProgress(j);
        }
    }

    public void onRecordRawPcmData(byte[] bArr, long j, int i, int i2, int i3, boolean z) {
        TXLivePusher.AudioCustomProcessListener audioCustomProcessListener = this.mAudioCustomProcessListener;
        if (audioCustomProcessListener != null) {
            audioCustomProcessListener.onRecordRawPcmData(bArr, j, i, i2, i3, z);
        }
    }

    public void onShowLog(boolean z) {
        nativeShowDebugView(this.mNativeTXLivePusherJni, z);
    }

    public void onSnapshot(Bitmap bitmap) {
        TXLivePusher.ITXSnapshotListener iTXSnapshotListener = this.mITXSnapshotListener;
        if (iTXSnapshotListener != null) {
            iTXSnapshotListener.onSnapshot(bitmap);
        }
    }

    public int onTextureCustomProcess(int i, int i2, int i3) {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            return videoCustomProcessListener.onTextureCustomProcess(i, i2, i3);
        }
        return -1;
    }

    public void onTextureDestoryed() {
        TXLivePusher.VideoCustomProcessListener videoCustomProcessListener = this.mVideoCustomProcessListener;
        if (videoCustomProcessListener != null) {
            videoCustomProcessListener.onTextureDestoryed();
        }
    }

    public boolean pauseBGM() {
        return nativePauseBGM(this.mNativeTXLivePusherJni);
    }

    public void pausePusher() {
        nativePausePusher(this.mNativeTXLivePusherJni);
    }

    public boolean playBGM(String str) {
        return nativePlayBGM(this.mNativeTXLivePusherJni, str);
    }

    public void release() {
        long j = this.mNativeTXLivePusherJni;
        if (j != 0) {
            nativeDestroy(j);
            this.mNativeTXLivePusherJni = 0;
        }
    }

    public boolean resumeBGM() {
        return nativeResumeBGM(this.mNativeTXLivePusherJni);
    }

    public void resumePusher() {
        nativeResumePusher(this.mNativeTXLivePusherJni);
    }

    public void sendCustomPCMData(byte[] bArr) {
        nativeSendCustomPCMData(this.mNativeTXLivePusherJni, bArr);
    }

    public int sendCustomVideoData(byte[] bArr, int i, int i2, int i3) {
        PixelFrame pixelFrame = new PixelFrame();
        if (i == 3) {
            pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.I420);
        } else if (i != 5) {
            return -3;
        } else {
            pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        }
        pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.BYTE_ARRAY);
        pixelFrame.setData(bArr);
        pixelFrame.setWidth(i2);
        pixelFrame.setHeight(i3);
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, pixelFrame);
        return 0;
    }

    public int sendCustomVideoTexture(int i, int i2, int i3) {
        EGLContext eGLContext;
        PixelFrame pixelFrame = new PixelFrame();
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        if (egl10 != null) {
            eGLContext = egl10.eglGetCurrentContext();
            pixelFrame.setGLContext(eGLContext);
        } else {
            eGLContext = null;
        }
        if (eGLContext == null) {
            return -1;
        }
        pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.TEXTURE_2D);
        pixelFrame.setTextureId(i);
        pixelFrame.setWidth(i2);
        pixelFrame.setHeight(i3);
        nativeSendCustomVideoFrame(this.mNativeTXLivePusherJni, pixelFrame);
        return 0;
    }

    public void sendMessage(byte[] bArr) {
        nativeSendMessage(this.mNativeTXLivePusherJni, bArr);
    }

    public boolean sendMessageEx(byte[] bArr) {
        return nativeSendMessageEx(this.mNativeTXLivePusherJni, bArr);
    }

    public void setAudioProcessListener(TXLivePusher.AudioCustomProcessListener audioCustomProcessListener) {
        this.mAudioCustomProcessListener = audioCustomProcessListener;
    }

    public void setAudioVolumeEvaluationListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mITXAudioVolumeEvaluationListener = iTXAudioVolumeEvaluationListener;
    }

    public void setBGMNofify(TXLivePusher.OnBGMNotify onBGMNotify) {
        this.mOnBGMNotify = onBGMNotify;
    }

    public void setBGMPitch(float f) {
        nativeSetBGMPitch(this.mNativeTXLivePusherJni, f);
    }

    public boolean setBGMPosition(int i) {
        return nativeSetBGMPosition(this.mNativeTXLivePusherJni, i);
    }

    public boolean setBGMVolume(float f) {
        return nativeSetBGMVolume(this.mNativeTXLivePusherJni, f);
    }

    public boolean setBeautyFilter(int i, int i2, int i3, int i4) {
        return nativeSetBeautyFilter(this.mNativeTXLivePusherJni, i, i2, i3, i4);
    }

    public void setChinLevel(int i) {
        this.mBeautyManager.setChinLevel((float) i);
    }

    public void setConfig(TXLivePushConfig tXLivePushConfig) {
        TXLivePushConfig tXLivePushConfig2 = tXLivePushConfig;
        if (tXLivePushConfig2 != null) {
            this.mConfig = tXLivePushConfig2;
            nativeSetCaptureConfig(this.mNativeTXLivePusherJni, tXLivePushConfig2.mCustomModeType, tXLivePushConfig2.mLocalVideoMirrorType, tXLivePushConfig2.mPauseImg, tXLivePushConfig2.mPauseFps, tXLivePushConfig2.mFrontCamera, tXLivePushConfig2.mTouchFocus, tXLivePushConfig2.mEnableZoom, tXLivePushConfig2.mEnableScreenCaptureAutoRotate, tXLivePushConfig2.mEnableHighResolutionCapture, tXLivePushConfig2.mPauseFlag);
            long j = this.mNativeTXLivePusherJni;
            TXLivePushConfig tXLivePushConfig3 = this.mConfig;
            int i = tXLivePushConfig3.mHomeOrientation;
            int ordinal = tXLivePushConfig3.mVideoResolution.ordinal();
            TXLivePushConfig tXLivePushConfig4 = this.mConfig;
            nativeSetEncoderConfig(j, i, ordinal, tXLivePushConfig4.mAutoAdjustBitrate, tXLivePushConfig4.mVideoBitrate, tXLivePushConfig4.mMaxVideoBitrate, tXLivePushConfig4.mMinVideoBitrate, tXLivePushConfig4.mVideoEncodeGop, tXLivePushConfig4.mVideoFPS, tXLivePushConfig4.mVideoEncoderXMirror, tXLivePushConfig4.mHardwareAccel, tXLivePushConfig4.mEnableVideoHardEncoderMainProfile);
            long j2 = this.mNativeTXLivePusherJni;
            TXLivePushConfig tXLivePushConfig5 = this.mConfig;
            nativeSetWaterMark(j2, tXLivePushConfig5.mWatermark, tXLivePushConfig5.mWatermarkXF, tXLivePushConfig5.mWatermarkYF, tXLivePushConfig5.mWatermarkWidth);
            long j3 = this.mNativeTXLivePusherJni;
            TXLivePushConfig tXLivePushConfig6 = this.mConfig;
            nativeSetAudioConfig(j3, tXLivePushConfig6.mAudioChannels, tXLivePushConfig6.mAudioSample, tXLivePushConfig6.mVolumeType, tXLivePushConfig6.mEnableAudioPreview, tXLivePushConfig6.mEnableAns);
            long j4 = this.mNativeTXLivePusherJni;
            TXLivePushConfig tXLivePushConfig7 = this.mConfig;
            nativeSetNetworkConfig(j4, tXLivePushConfig7.mAutoAdjustStrategy, tXLivePushConfig7.mEnablePureAudioPush, tXLivePushConfig7.mConnectRetryCount, tXLivePushConfig7.mConnectRetryInterval, tXLivePushConfig7.mRtmpChannelType);
        }
    }

    public void setExposureCompensation(float f) {
        nativeSetExposureCompensation(this.mNativeTXLivePusherJni, f);
    }

    public void setEyeScaleLevel(int i) {
        this.mBeautyManager.setEyeScaleLevel((float) i);
    }

    public void setFaceShortLevel(int i) {
        this.mBeautyManager.setFaceShortLevel((float) i);
    }

    public void setFaceSlimLevel(int i) {
        this.mBeautyManager.setFaceSlimLevel((float) i);
    }

    public void setFaceVLevel(int i) {
        this.mBeautyManager.setFaceVLevel((float) i);
    }

    public void setFilter(Bitmap bitmap) {
        nativeSetFilter(this.mNativeTXLivePusherJni, bitmap);
    }

    public void setFocusPosition(float f, float f2) {
        nativeSetFocusPosition(this.mNativeTXLivePusherJni, f, f2);
    }

    public boolean setGreenScreenFile(String str) {
        return this.mBeautyManager.setGreenScreenFile(str) != 0;
    }

    public boolean setMicVolume(float f) {
        return nativeSetMicVolume(this.mNativeTXLivePusherJni, f);
    }

    public boolean setMirror(boolean z) {
        return nativeSetMirror(this.mNativeTXLivePusherJni, z);
    }

    public void setMotionMute(boolean z) {
        this.mBeautyManager.setMotionMute(z);
    }

    public void setMotionTmpl(String str) {
        this.mBeautyManager.setMotionTmpl(str);
    }

    public void setMute(boolean z) {
        nativeSetMute(this.mNativeTXLivePusherJni, z);
    }

    public void setNoseSlimLevel(int i) {
        this.mBeautyManager.setNoseSlimLevel((float) i);
    }

    public void setPushListener(ITXLivePushListener iTXLivePushListener) {
        this.mITXLivePushListener = iTXLivePushListener;
    }

    public void setRenderRotation(int i) {
        nativeSetRenderRotation(this.mNativeTXLivePusherJni, i);
    }

    public void setReverb(int i) {
        nativeSetReverb(this.mNativeTXLivePusherJni, i);
    }

    public void setSpecialRatio(float f) {
        nativeSetSpecialRatio(this.mNativeTXLivePusherJni, f);
    }

    public void setSurface(Surface surface) {
        int i;
        if (surface != null) {
            this.mSurface = surface;
            int i2 = this.mSurfaceWidth;
            if (i2 >= 0 && (i = this.mSurfaceHeight) >= 0) {
                nativeSetView(this.mNativeTXLivePusherJni, new DisplayTarget(surface, i2, i));
            }
        }
    }

    public void setSurfaceSize(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            this.mSurfaceWidth = i;
            this.mSurfaceHeight = i2;
            Surface surface = this.mSurface;
            if (surface != null) {
                nativeSetView(this.mNativeTXLivePusherJni, new DisplayTarget(surface, i, i2));
            }
        }
    }

    public void setVideoProcessListener(TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        this.mVideoCustomProcessListener = videoCustomProcessListener;
    }

    public void setVideoQuality(int i, boolean z, boolean z2) {
        int i2 = i;
        boolean z3 = z;
        boolean z4 = z2;
        boolean z5 = z3 && z4;
        this.mVideoQuality = i2;
        this.mConfig.setAudioSampleRate(48000);
        this.mConfig.setHardwareAcceleration(1);
        this.mConfig.setAutoAdjustBitrate(z3);
        switch (i2) {
            case 1:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(z4 ? 1 : 0);
                this.mConfig.setVideoEncodeGop(3);
                if (z5) {
                    this.mConfig.setMinVideoBitrate(301);
                } else {
                    this.mConfig.setMinVideoBitrate(500);
                }
                this.mConfig.setVideoBitrate(800);
                this.mConfig.setMaxVideoBitrate(900);
                break;
            case 2:
                this.mConfig.setVideoResolution(1);
                this.mConfig.setAutoAdjustStrategy(z4);
                this.mConfig.setVideoEncodeGop(3);
                if (z5) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(800);
                }
                this.mConfig.setVideoBitrate(1200);
                this.mConfig.setMaxVideoBitrate(1500);
                break;
            case 3:
                this.mConfig.setVideoResolution(2);
                this.mConfig.setAutoAdjustStrategy(z4);
                this.mConfig.setVideoEncodeGop(3);
                if (z5) {
                    this.mConfig.setMinVideoBitrate(600);
                } else {
                    this.mConfig.setMinVideoBitrate(1000);
                }
                this.mConfig.setVideoBitrate(1800);
                this.mConfig.setMaxVideoBitrate(1800);
                break;
            case 4:
                int i3 = this.mVideoQuality;
                if (i3 == 1) {
                    this.mConfig.setVideoResolution(0);
                    this.mConfig.setMinVideoBitrate(500);
                    this.mConfig.setVideoBitrate(800);
                    this.mConfig.setMaxVideoBitrate(900);
                } else if (i3 == 3) {
                    this.mConfig.setVideoResolution(2);
                    this.mConfig.setMinVideoBitrate(1000);
                    this.mConfig.setVideoBitrate(1800);
                    this.mConfig.setMaxVideoBitrate(1800);
                } else if (i3 == 7) {
                    this.mConfig.setVideoResolution(30);
                    this.mConfig.setMinVideoBitrate(2000);
                    this.mConfig.setVideoBitrate(3000);
                    this.mConfig.setMaxVideoBitrate(3000);
                } else {
                    this.mConfig.setVideoResolution(1);
                    this.mConfig.setMinVideoBitrate(800);
                    this.mConfig.setVideoBitrate(1200);
                    this.mConfig.setMaxVideoBitrate(1500);
                }
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 5:
                this.mConfig.setVideoResolution(6);
                this.mConfig.setMinVideoBitrate(TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
                this.mConfig.setVideoBitrate(TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
                this.mConfig.setMaxVideoBitrate(TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE);
                this.mConfig.setAutoAdjustStrategy(4);
                this.mConfig.setVideoEncodeGop(1);
                break;
            case 6:
                this.mConfig.setVideoResolution(0);
                this.mConfig.setAutoAdjustStrategy(5);
                this.mConfig.setVideoEncodeGop(1);
                this.mConfig.setMinVideoBitrate(190);
                this.mConfig.setVideoBitrate(400);
                this.mConfig.setMaxVideoBitrate(810);
                break;
            case 7:
                this.mConfig.setVideoResolution(30);
                this.mConfig.setAutoAdjustStrategy(z4);
                this.mConfig.setVideoEncodeGop(3);
                this.mConfig.setMinVideoBitrate(2500);
                this.mConfig.setVideoBitrate(3000);
                this.mConfig.setMaxVideoBitrate(3000);
                break;
            default:
                return;
        }
        setConfig(this.mConfig);
    }

    public void setVideoRecordListener(TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mITXVideoRecordListener = iTXVideoRecordListener;
    }

    public void setVoiceChangerType(int i) {
        nativeSetVoiceChangerType(this.mNativeTXLivePusherJni, i);
    }

    public boolean setZoom(int i) {
        return nativeSetZoom(this.mNativeTXLivePusherJni, i);
    }

    public void snapshot(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        this.mITXSnapshotListener = iTXSnapshotListener;
        nativeSnapshot(this.mNativeTXLivePusherJni);
    }

    public void startCameraPreview(TXCloudVideoView tXCloudVideoView) {
        if (tXCloudVideoView != null) {
            C104511a.m139800a(tXCloudVideoView, new WeakReference(this));
            nativeShowDebugView(this.mNativeTXLivePusherJni, C104511a.m139801a(tXCloudVideoView));
        }
        nativeSetView(this.mNativeTXLivePusherJni, new DisplayTarget(tXCloudVideoView));
        nativeStartCamera(this.mNativeTXLivePusherJni);
    }

    public int startPusher(String str) {
        return nativeStartPusher(this.mNativeTXLivePusherJni, str);
    }

    public int startRecord(String str) {
        return nativeStartRecord(this.mNativeTXLivePusherJni, str);
    }

    public void startScreenCapture() {
        nativeStartScreenCapture(this.mNativeTXLivePusherJni);
    }

    public boolean stopBGM() {
        return nativeStopBGM(this.mNativeTXLivePusherJni);
    }

    public void stopCameraPreview(boolean z) {
        nativeStopCameraPreview(this.mNativeTXLivePusherJni, z);
    }

    public void stopPusher() {
        nativeStopPusher(this.mNativeTXLivePusherJni);
    }

    public void stopRecord() {
        nativeStopRecord(this.mNativeTXLivePusherJni);
    }

    public void stopScreenCapture() {
        nativeStopScreenCapture(this.mNativeTXLivePusherJni);
    }

    public void switchCamera() {
        TXLivePushConfig tXLivePushConfig = this.mConfig;
        tXLivePushConfig.setFrontCamera(!tXLivePushConfig.mFrontCamera);
        nativeSwitchCamera(this.mNativeTXLivePusherJni);
    }

    public boolean turnOnFlashLight(boolean z) {
        return nativeTurnOnFlashLight(this.mNativeTXLivePusherJni, z);
    }
}
