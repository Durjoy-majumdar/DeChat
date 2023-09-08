package com.tencent.maas.camerafun;

import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.facebook.jni.HybridData;
import com.tencent.maas.camerafun.MJCamFunSessionCallback;
import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJRecordingSettings;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.internal.MJVideoOutputSetter;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.time.MJTime;
import java.security.InvalidParameterException;
import p172io.clipworks.corekit.NativeLogger;
import p172io.clipworks.displaysys.DSProxySurface;
import p172io.clipworks.displaysys.DSProxySurfaceHolder;
import p172io.clipworks.displaysys.DSRenderView;
import p172io.clipworks.displaysys.DSViewProxy;

@Deprecated
public class MJCamFunSession implements MJVideoOutputSetter {
    private static final String TAG = "MJCamFunSession";
    private DSViewProxy dsViewProxy = null;
    private final NativeCallbackManager mCallbackManager;
    private final HybridData mHybridData;

    public enum EMFVideoOrientation {
        nMFVideoOrientationNone(-1),
        nMFVideoOrientationPortrait(1),
        nMFVideoOrientationPortraitUpsideDown(2),
        nMFVideoOrientationLandscapeRight(3),
        nMFVideoOrientationLandscapeLeft(4),
        nMFVideoOrientationLandscape(r5.getOrientationVal()),
        nMFVideoOrientationDefault(r5.getOrientationVal()),
        nMFVideoOrientationCW90(r1.getOrientationVal()),
        nMFVideoOrientationCW180(r7.getOrientationVal()),
        nMFVideoOrientationCW270(r3.getOrientationVal()),
        nMFVideoOrientationMin(1),
        nMFVideoOrientationCount(4),
        nMFVideoOrientationNext(100);
        
        private final int orientationVal;

        private EMFVideoOrientation(int i) {
            this.orientationVal = i;
        }

        public static EMFVideoOrientation fromInt(int i) {
            for (EMFVideoOrientation eMFVideoOrientation : values()) {
                if (eMFVideoOrientation.getOrientationVal() == i) {
                    return eMFVideoOrientation;
                }
            }
            return nMFVideoOrientationNone;
        }

        public int getOrientationVal() {
            return this.orientationVal;
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

    public MJCamFunSession(Handler handler) {
        NativeCallbackManager nativeCallbackManager = new NativeCallbackManager(handler.getLooper());
        this.mCallbackManager = nativeCallbackManager;
        this.mHybridData = initHybrid(handler, nativeCallbackManager);
    }

    public static DimensionLevel getPreferredCameraDimensionLevel() {
        return DimensionLevel.valueOf(nativeGetPreferredCameraDimensionLevel());
    }

    private native HybridData initHybrid(Handler handler, NativeCallbackManager nativeCallbackManager);

    private native MJError nativeCancelSwitching(int i);

    private native MJError nativeCapturePhoto(MJCapturePhotoSettings mJCapturePhotoSettings, int i);

    private native MJError nativeConnectRenderView(String str);

    private native MJError nativeConnectToView(Object obj);

    private native MJError nativeDisconnectFromView();

    private native MJBeautifyingOptions nativeGetBeautifyOptions();

    private native MJCamFunMusicInfo nativeGetCurrentMusicInfo();

    private native int nativeGetCurrentState();

    private native MJCamFunLUTFilter nativeGetLUTFilter();

    private static native int nativeGetPreferredCameraDimensionLevel();

    private native MJError nativePauseMusic(int i);

    private native MJError nativeResumeMusic(int i);

    private native void nativeSendAudioFrame(MJAudioFrame mJAudioFrame);

    private native void nativeSendVideoFrame(MJVideoFrame mJVideoFrame);

    private native void nativeSetAudioDeviceType(int i);

    private native void nativeSetFirstFrameDidPresentFunc(int i);

    private native MJError nativeSetLUTFilter(MJCamFunLUTFilter mJCamFunLUTFilter);

    private native void nativeSetRecordingDidFailFunc(int i);

    private native void nativeSetRecordingTimeDidChangeFunc(int i);

    private native MJError nativeStart(int i);

    private native MJError nativeStartRecording(String str, MJRecordingSettings mJRecordingSettings, MJAuditCaptureSettings mJAuditCaptureSettings, int i);

    private native MJAsyncTaskInfo nativeStartWithTemplate(String str, int i, int i2);

    private native MJError nativeStopRecording(int i);

    private native MJError nativeSwitchToEmptyTemplate(int i);

    private native MJAsyncTaskInfo nativeSwitchToMusic(MJCamFunMusicInfo mJCamFunMusicInfo, int i, int i2);

    private native MJAsyncTaskInfo nativeSwitchToTemplate(String str, MJCamFunMusicInfo mJCamFunMusicInfo, int i, int i2);

    private native MJError nativeTeardown(int i);

    private native void nativeUpdateBackgroundImage(String str, int i);

    private native MJError nativeUpdateBeautifyOptions(MJBeautifyingOptions mJBeautifyingOptions);

    public MJError cancelSwitching(OnComplete onComplete) {
        return nativeCancelSwitching(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError capturePhoto(MJCapturePhotoSettings mJCapturePhotoSettings, OnComplete onComplete) {
        return nativeCapturePhoto(mJCapturePhotoSettings, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError connectRenderView(String str) {
        return nativeConnectRenderView(str);
    }

    public EMFVideoOrientation convertEMFVideoOrientation(int i) {
        return i != 0 ? i != 90 ? i != 180 ? i != 270 ? EMFVideoOrientation.nMFVideoOrientationNone : EMFVideoOrientation.nMFVideoOrientationCW270 : EMFVideoOrientation.nMFVideoOrientationCW180 : EMFVideoOrientation.nMFVideoOrientationCW90 : EMFVideoOrientation.nMFVideoOrientationNone;
    }

    public MJBeautifyingOptions getBeautifyOptions() {
        return nativeGetBeautifyOptions();
    }

    public MJCamFunMusicInfo getCurrentMusicInfo() {
        return nativeGetCurrentMusicInfo();
    }

    public MJCamFunSessionState getCurrentState() {
        return MJCamFunSessionState.fromInt(nativeGetCurrentState());
    }

    public MJCamFunLUTFilter getLUTFilter() {
        return nativeGetLUTFilter();
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

    public MJError pauseMusic(OnComplete onComplete) {
        return nativePauseMusic(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void release() {
        this.mHybridData.resetNative();
    }

    public MJError resumeMusic(OnComplete onComplete) {
        return nativeResumeMusic(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void sendAudioFrame(MJAudioFrame mJAudioFrame) {
        nativeSendAudioFrame(mJAudioFrame);
    }

    public void sendVideoFrame(MJVideoFrame mJVideoFrame) {
        nativeSendVideoFrame(mJVideoFrame);
    }

    public void setAudioDeviceType(MJAudioDeviceType mJAudioDeviceType) {
        nativeSetAudioDeviceType(mJAudioDeviceType.getValue());
    }

    public void setFirstFrameDidPresentFunc(OnComplete onComplete) {
        nativeSetFirstFrameDidPresentFunc(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError setLUTFilter(MJCamFunLUTFilter mJCamFunLUTFilter) {
        return nativeSetLUTFilter(mJCamFunLUTFilter);
    }

    public void setRecordingDidFailFunc(OnComplete onComplete) {
        nativeSetRecordingDidFailFunc(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void setRecordingTimeDidChangeFunc(OnRecordingTimeChange onRecordingTimeChange) {
        nativeSetRecordingTimeDidChangeFunc(onRecordingTimeChange != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.RecordingTimeChangeCallback(this, onRecordingTimeChange, false)) : -1);
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

    public MJError start(OnOptionsComplete onOptionsComplete) {
        return nativeStart(onOptionsComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.OptionsCompleteCallback(this, onOptionsComplete)) : -1);
    }

    public MJError startRecording(String str, MJRecordingSettings mJRecordingSettings, MJAuditCaptureSettings mJAuditCaptureSettings, OnComplete onComplete) {
        return nativeStartRecording(str, mJRecordingSettings, mJAuditCaptureSettings, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJAsyncTaskInfo startWithTemplate(String str, OnProgress onProgress, OnOptionsComplete onOptionsComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamFunSessionCallback.ProgressCallback(this, onProgress, false), new MJCamFunSessionCallback.OptionsCompleteCallback(this, onOptionsComplete));
        return nativeStartWithTemplate(str, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public MJError stopRecording(OnStopRecording onStopRecording) {
        return nativeStopRecording(onStopRecording != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.StopRecordingCallback(this, onStopRecording)) : -1);
    }

    public MJError switchToEmptyTemplate(OnOptionsComplete onOptionsComplete) {
        return nativeSwitchToEmptyTemplate(onOptionsComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.OptionsCompleteCallback(this, onOptionsComplete)) : -1);
    }

    public MJAsyncTaskInfo switchToMusic(MJCamFunMusicInfo mJCamFunMusicInfo, OnProgress onProgress, OnOptionsComplete onOptionsComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamFunSessionCallback.ProgressCallback(this, onProgress, false), new MJCamFunSessionCallback.OptionsCompleteCallback(this, onOptionsComplete));
        return nativeSwitchToMusic(mJCamFunMusicInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public MJAsyncTaskInfo switchToTemplate(String str, OnProgress onProgress, OnOptionsComplete onOptionsComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamFunSessionCallback.ProgressCallback(this, onProgress, false), new MJCamFunSessionCallback.OptionsCompleteCallback(this, onOptionsComplete));
        return nativeSwitchToTemplate(str, (MJCamFunMusicInfo) null, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }

    public MJError teardown(OnComplete onComplete) {
        return nativeTeardown(onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public void updateBackgroundImage(String str, OnComplete onComplete) {
        nativeUpdateBackgroundImage(str, onComplete != null ? this.mCallbackManager.registerCallback(new MJCamFunSessionCallback.CompleteCallback(this, onComplete)) : -1);
    }

    public MJError updateBeautifyOptions(MJBeautifyingOptions mJBeautifyingOptions) {
        return nativeUpdateBeautifyOptions(mJBeautifyingOptions);
    }

    public MJAsyncTaskInfo switchToTemplate(String str, MJCamFunMusicInfo mJCamFunMusicInfo, OnProgress onProgress, OnOptionsComplete onOptionsComplete) {
        int[] registerProgressWithComplete = this.mCallbackManager.registerProgressWithComplete(new MJCamFunSessionCallback.ProgressCallback(this, onProgress, false), new MJCamFunSessionCallback.OptionsCompleteCallback(this, onOptionsComplete));
        return nativeSwitchToTemplate(str, mJCamFunMusicInfo, registerProgressWithComplete[0], registerProgressWithComplete[1]);
    }
}
