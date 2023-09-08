package com.tencent.maas.camstudio;

import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.jni.HybridData;
import com.tencent.maas.camerafun.MJAudioDeviceType;
import com.tencent.maas.camerafun.MJAudioFrame;
import com.tencent.maas.camerafun.MJAuditCaptureSettings;
import com.tencent.maas.camerafun.MJCaptureOptions;
import com.tencent.maas.camerafun.MJRecordingFinishInfo;
import com.tencent.maas.camstudio.MJCamSessionCallback;
import com.tencent.maas.camstudio.frame.VideoFrame;
import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJRecordingSettings;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.internal.MJVideoOutputSetter;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.time.MJTime;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import p172io.clipworks.corekit.NativeLogger;
import p172io.clipworks.displaysys.DSProxySurface;
import p172io.clipworks.displaysys.DSProxySurfaceHolder;
import p172io.clipworks.displaysys.DSRenderView;
import p172io.clipworks.displaysys.DSViewProxy;

public class MJCamSession implements MJVideoOutputSetter {
    private static final String TAG = "MJCamSession";
    private DSViewProxy dsViewProxy = null;
    private final NativeCallbackManager mCallbackManager;
    private final HybridData mHybridData;

    public enum ImageType {
        Invalid(0),
        JPEG(1),
        PNG(2);
        
        private final int value;

        private ImageType(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public interface OnComplete {
        void onComplete(MJError mJError);
    }

    public interface OnOptionsComplete {
        void onComplete(MJCaptureOptions mJCaptureOptions, MJError mJError);
    }

    public interface OnProgress {
        void onProgress(float f);
    }

    public interface OnRecordingTimeChange {
        void onRecordingTimeChange(MJTime mJTime, MJTime mJTime2);
    }

    public interface OnStopRecording {
        void onStopRecording(MJRecordingFinishInfo mJRecordingFinishInfo, MJError mJError);
    }

    public MJCamSession(Handler handler) {
        NativeCallbackManager nativeCallbackManager = new NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    public static DimensionLevel getPreferredCameraDimensionLevel() {
        return DimensionLevel.valueOf(nativeGetPreferredCameraDimensionLevel());
    }

    private native HybridData initHybrid(Handler handler, NativeCallbackManager nativeCallbackManager);

    private native void nativeBeginPlayBackgroundMusic(MJCamMusicDesc mJCamMusicDesc, int i);

    private native void nativeBeginUseTemplate(String str, int i);

    private native void nativeClearTemplate(int i);

    private native MJError nativeConnectRenderView(String str);

    private native MJError nativeConnectToView(Object obj);

    private native MJError nativeDisconnectFromView();

    private native void nativeExportPhoto(VideoFrame videoFrame, String str, boolean z, int i, int i2);

    private native MJBeautyAdjustmentDesc nativeGetBeautyAdjustmentDesc();

    private native MJCamMusicDesc nativeGetCurrentBackgroundMusicDesc();

    private native int nativeGetCurrentState();

    private native MJCamFilterDesc nativeGetFilterDesc();

    private native Object[] nativeGetMultiFilterDescs();

    private static native int nativeGetPreferredCameraDimensionLevel();

    private native Object nativeGetSDKSharableEGLContext();

    private native void nativePauseBackgroundMusic(int i);

    private native void nativePausePreviewing(int i);

    private native void nativeResumeBackgroundMusic(int i);

    private native void nativeResumePreviewing(int i);

    private native void nativeSendAudioFrame(MJAudioFrame mJAudioFrame);

    private native void nativeSendVideoFrame(VideoFrame videoFrame);

    private native void nativeSetAudioDeviceType(int i);

    private native void nativeSetBeautyAdjustmentDesc(MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, int i);

    private native void nativeSetFilterDesc(MJCamFilterDesc mJCamFilterDesc, int i);

    private native void nativeSetFilterDescsToTemplateDefault(int i);

    private native void nativeSetFirstFrameDidPresentFunc(int i);

    private native void nativeSetRecordingDidFailFunc(int i);

    private native void nativeSetRecordingTimeDidChangeFunc(int i);

    private native void nativeStartPreviewing(MJCamPreviewSettings mJCamPreviewSettings, int i);

    private native void nativeStartPreviewingWithTemplate(String str, MJCamTemplateOverridingParams mJCamTemplateOverridingParams, String str2, MJCamTemplateOverridingParams mJCamTemplateOverridingParams2, MJCamPreviewSettings mJCamPreviewSettings, int i);

    private native void nativeStartRecording(String str, MJRecordingSettings mJRecordingSettings, MJAuditCaptureSettings mJAuditCaptureSettings, int i);

    private native void nativeStopRecording(boolean z, int i);

    private native MJAsyncTaskInfo nativeSwitchToTemplate(String str, int i, int i2);

    private native void nativeTeardown(int i);

    public void beginPlayBackgroundMusic(MJCamMusicDesc mJCamMusicDesc, OnComplete onComplete) {
        nativeBeginPlayBackgroundMusic(mJCamMusicDesc, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void beginUseTemplate(String str, OnComplete onComplete) {
        nativeBeginUseTemplate(str, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void clearBackgroundMusic(OnComplete onComplete) {
        beginPlayBackgroundMusic(new MJCamMusicDesc(), onComplete);
    }

    public void clearBeautyAdjustmentDesc(OnComplete onComplete) {
        setBeautyAdjustmentDesc(new MJBeautyAdjustmentDesc(), onComplete);
    }

    public void clearFilterDesc(OnComplete onComplete) {
        setFilterDesc(new MJCamFilterDesc(), onComplete);
    }

    public void clearTemplate(OnComplete onComplete) {
        nativeClearTemplate(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError connectRenderView(String str) {
        return nativeConnectRenderView(str);
    }

    public void exportPhoto(VideoFrame videoFrame, String str, boolean z, ImageType imageType, OnComplete onComplete) {
        nativeExportPhoto(videoFrame, str, z, imageType.getValue(), onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJBeautyAdjustmentDesc getBeautyAdjustmentDesc() {
        return nativeGetBeautyAdjustmentDesc();
    }

    public MJCamMusicDesc getCurrentBackgroundMusicDesc() {
        return nativeGetCurrentBackgroundMusicDesc();
    }

    public MJCamSessionState getCurrentState() {
        return MJCamSessionState.fromInt(nativeGetCurrentState());
    }

    public MJCamFilterDesc getFilterDesc() {
        return nativeGetFilterDesc();
    }

    public ArrayList<MJCamFilterDesc> getMultiFilterDescs() {
        Object[] nativeGetMultiFilterDescs = nativeGetMultiFilterDescs();
        ArrayList<MJCamFilterDesc> arrayList = new ArrayList<>();
        if (nativeGetMultiFilterDescs != null) {
            for (Object obj : nativeGetMultiFilterDescs) {
                arrayList.add((MJCamFilterDesc) obj);
            }
        }
        return arrayList;
    }

    public Object getSDKSharableEGLContext() {
        return nativeGetSDKSharableEGLContext();
    }

    public void notifySurfaceChanged(int i, int i2, int i3) {
        DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy == null || !(dSViewProxy instanceof DSProxySurface)) {
            NativeLogger.error(TAG, "current surface is not DSProxySurface");
            throw new IllegalStateException("current surface is not DSProxySurface");
        } else {
            ((DSProxySurface) dSViewProxy).notifySurfaceChanged(i, i2, i3);
        }
    }

    public void pauseBackgroundMusic(OnComplete onComplete) {
        nativePauseBackgroundMusic(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void pausePreviewing(OnComplete onComplete) {
        nativePausePreviewing(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void release() {
        this.mHybridData.resetNative();
    }

    public void resumeBackgroundMusic(OnComplete onComplete) {
        nativeResumeBackgroundMusic(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void resumePreviewing(OnComplete onComplete) {
        nativeResumePreviewing(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void sendAudioFrame(MJAudioFrame mJAudioFrame) {
        nativeSendAudioFrame(mJAudioFrame);
    }

    public void sendVideoFrame(VideoFrame videoFrame) {
        nativeSendVideoFrame(videoFrame);
    }

    public void setAudioDeviceType(MJAudioDeviceType mJAudioDeviceType) {
        nativeSetAudioDeviceType(mJAudioDeviceType.getValue());
    }

    public void setBeautyAdjustmentDesc(MJBeautyAdjustmentDesc mJBeautyAdjustmentDesc, OnComplete onComplete) {
        nativeSetBeautyAdjustmentDesc(mJBeautyAdjustmentDesc, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void setFilterDesc(MJCamFilterDesc mJCamFilterDesc, OnComplete onComplete) {
        nativeSetFilterDesc(mJCamFilterDesc, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void setFilterDescsToTemplateDefault(OnComplete onComplete) {
        nativeSetFilterDescsToTemplateDefault(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void setFirstFrameDidPresentFunc(OnComplete onComplete) {
        nativeSetFirstFrameDidPresentFunc(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void setRecordingDidFailFunc(OnComplete onComplete) {
        nativeSetRecordingDidFailFunc(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void setRecordingTimeDidChangeFunc(OnRecordingTimeChange onRecordingTimeChange) {
        nativeSetRecordingTimeDidChangeFunc(onRecordingTimeChange != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.RecordingTimeChangeCallback(this, onRecordingTimeChange, false)) : -1);
    }

    public void setRenderView(SurfaceView surfaceView) {
        if (!(surfaceView instanceof DSRenderView)) {
            NativeLogger.error(TAG, "renderView must be SDK DSRenderView");
            throw new InvalidParameterException("renderView must be SDK DSRenderView");
        } else if (this.dsViewProxy == null) {
            DSViewProxy dSViewProxy = ((DSRenderView) surfaceView).getDSViewProxy();
            MJError nativeConnectToView = nativeConnectToView(dSViewProxy);
            if (nativeConnectToView == null) {
                this.dsViewProxy = dSViewProxy;
                return;
            }
            String str = TAG;
            NativeLogger.error(str, "Fail to connect to RenderView, " + nativeConnectToView.message);
            throw new IllegalStateException("Fail to connect to RenderView, " + nativeConnectToView.message);
        } else {
            throw new IllegalStateException("Already a view connected!");
        }
    }

    public void setSurface(Surface surface) {
        DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy != null && !(dSViewProxy instanceof DSProxySurface)) {
            NativeLogger.error(TAG, "Already a non surface output connected");
            throw new IllegalArgumentException("Already a non surface output connected");
        } else if (surface != null || dSViewProxy != null) {
            if (dSViewProxy == null) {
                DSProxySurface dSProxySurface = new DSProxySurface(surface);
                MJError nativeConnectToView = nativeConnectToView(dSProxySurface);
                if (nativeConnectToView == null) {
                    this.dsViewProxy = dSProxySurface;
                    dSProxySurface.notifySurfaceCreated(surface);
                    String str = TAG;
                    NativeLogger.info(str, "nativeConnectToView, new surface created: " + surface);
                    return;
                }
                String str2 = TAG;
                NativeLogger.error(str2, "Fail to connect to surface, " + nativeConnectToView.message);
                throw new IllegalStateException("Fail to connect to surface, " + nativeConnectToView.message);
            }
            DSProxySurface dSProxySurface2 = (DSProxySurface) dSViewProxy;
            if (surface == null) {
                dSProxySurface2.updateSurface((Surface) null);
                dSProxySurface2.notifySurfaceDidDestroy();
                NativeLogger.info(TAG, "setSurface, surface destroyed");
            } else if (dSProxySurface2.getSurface() == null) {
                dSProxySurface2.updateSurface(surface);
                dSProxySurface2.notifySurfaceCreated(surface);
                String str3 = TAG;
                NativeLogger.info(str3, "setSurface, surface changed: " + surface);
            } else {
                NativeLogger.error(TAG, "Already a surface connect, please setSurface(null) firstly");
                throw new IllegalStateException("Already a surface connect, please setSurface(null) firstly");
            }
        }
    }

    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        DSViewProxy dSViewProxy = this.dsViewProxy;
        if (dSViewProxy != null) {
            if (!(dSViewProxy instanceof DSProxySurfaceHolder)) {
                NativeLogger.error(TAG, "Already a non SurfaceHolder connected");
                throw new IllegalArgumentException("Already a non SurfaceHolder connected");
            }
        } else if (surfaceHolder != null) {
            DSProxySurfaceHolder dSProxySurfaceHolder = new DSProxySurfaceHolder(surfaceHolder);
            MJError nativeConnectToView = nativeConnectToView(dSProxySurfaceHolder);
            if (nativeConnectToView == null) {
                this.dsViewProxy = dSProxySurfaceHolder;
                if (surfaceHolder.getSurface() != null) {
                    this.dsViewProxy.notifySurfaceCreated(surfaceHolder.getSurface());
                    return;
                }
                return;
            }
            String str = TAG;
            NativeLogger.error(str, "Fail to connect to surface, " + nativeConnectToView.message);
            throw new IllegalStateException("Fail to connect to surface, " + nativeConnectToView.message);
        }
    }

    public void startPreviewing(OnComplete onComplete) {
        startPreviewing(new MJCamPreviewSettings(DimensionLevel.DIMENSION_LEVEL_1080), onComplete);
    }

    public void startPreviewingWithTemplate(String str, MJCamTemplateOverridingParams mJCamTemplateOverridingParams, MJCamPreviewSettings mJCamPreviewSettings, OnComplete onComplete) {
        nativeStartPreviewingWithTemplate(str, mJCamTemplateOverridingParams, (String) null, (MJCamTemplateOverridingParams) null, mJCamPreviewSettings, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void startPreviewingWithVideoRemixTemplate(String str, MJCamTemplateOverridingParams mJCamTemplateOverridingParams, MJCamPreviewSettings mJCamPreviewSettings, OnComplete onComplete) {
        nativeStartPreviewingWithTemplate((String) null, (MJCamTemplateOverridingParams) null, str, mJCamTemplateOverridingParams, mJCamPreviewSettings, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void startRecording(String str, MJRecordingSettings mJRecordingSettings, OnComplete onComplete) {
        startRecording(str, mJRecordingSettings, (MJAuditCaptureSettings) null, onComplete);
    }

    public void stopRecording(OnStopRecording onStopRecording) {
        stopRecording(false, onStopRecording);
    }

    public MJAsyncTaskInfo switchToTemplate(String str, OnProgress onProgress, OnOptionsComplete onOptionsComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamSessionCallback.ProgressCallback(this, onProgress, false), new MJCamSessionCallback.OptionsCompleteCallback(this, onOptionsComplete));
        return nativeSwitchToTemplate(str, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public void teardown(OnComplete onComplete) {
        if (this.dsViewProxy != null) {
            NativeLogger.info(TAG, "nativeDisconnectFromView");
            nativeDisconnectFromView();
            this.dsViewProxy = null;
        }
        nativeTeardown(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void startRecording(String str, MJRecordingSettings mJRecordingSettings, MJAuditCaptureSettings mJAuditCaptureSettings, OnComplete onComplete) {
        nativeStartRecording(str, mJRecordingSettings, mJAuditCaptureSettings, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void stopRecording(boolean z, OnStopRecording onStopRecording) {
        nativeStopRecording(z, onStopRecording != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.StopRecordingCallback(this, onStopRecording)) : -1);
    }

    public void startPreviewing(MJCamPreviewSettings mJCamPreviewSettings, OnComplete onComplete) {
        nativeStartPreviewing(mJCamPreviewSettings, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }
}
