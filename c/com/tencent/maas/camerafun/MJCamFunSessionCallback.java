package com.tencent.maas.camerafun;

import com.tencent.maas.camerafun.MJCamFunSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.time.MJTime;
import java.lang.ref.WeakReference;

public class MJCamFunSessionCallback {

    public static class CompleteCallback extends BaseCallback<MJCamFunSessionCallbackArg.CompleteArg> {
        private final MJCamFunSession.OnComplete onComplete;

        public CompleteCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnComplete onComplete2) {
            super(mJCamFunSession);
            this.onComplete = onComplete2;
        }

        public void onInvoke(MJCamFunSession mJCamFunSession, MJCamFunSessionCallbackArg.CompleteArg completeArg) {
            MJCamFunSession.OnComplete onComplete2 = this.onComplete;
            if (onComplete2 != null && completeArg != null) {
                onComplete2.onComplete(completeArg.error);
            }
        }

        public CompleteCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnComplete onComplete2, boolean z) {
            super(mJCamFunSession, z);
            this.onComplete = onComplete2;
        }
    }

    public static class MJCamFunSessionCallbackArg extends NativeCallbackManager.CallbackArgs {

        public static class CompleteArg extends MJCamFunSessionCallbackArg {
            public final MJError error;

            public CompleteArg(MJError mJError) {
                this.error = mJError;
            }
        }

        public static class OptionsCompleteArg extends MJCamFunSessionCallbackArg {
            public final MJError error;
            public final MJCaptureOptions options;

            public OptionsCompleteArg(MJCaptureOptions mJCaptureOptions, MJError mJError) {
                this.options = mJCaptureOptions;
                this.error = mJError;
            }
        }

        public static class ProgressArg extends MJCamFunSessionCallbackArg {
            public final float progress;

            public ProgressArg(float f) {
                this.progress = f;
            }
        }

        public static class RecordingTimeChangeArg extends MJCamFunSessionCallbackArg {
            public final MJTime lastFrameTime;
            public final MJTime maxRecordingDuration;

            public RecordingTimeChangeArg(MJTime mJTime, MJTime mJTime2) {
                this.lastFrameTime = mJTime;
                this.maxRecordingDuration = mJTime2;
            }
        }

        public static class StopRecordingArg extends MJCamFunSessionCallbackArg {
            public final MJError error;
            public final MJRecordingFinishInfo finishInfo;

            public StopRecordingArg(MJRecordingFinishInfo mJRecordingFinishInfo, MJError mJError) {
                this.finishInfo = mJRecordingFinishInfo;
                this.error = mJError;
            }
        }
    }

    public static class OptionsCompleteCallback extends BaseCallback<MJCamFunSessionCallbackArg.OptionsCompleteArg> {
        private final MJCamFunSession.OnOptionsComplete onComplete;

        public OptionsCompleteCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnOptionsComplete onOptionsComplete) {
            super(mJCamFunSession);
            this.onComplete = onOptionsComplete;
        }

        public void onInvoke(MJCamFunSession mJCamFunSession, MJCamFunSessionCallbackArg.OptionsCompleteArg optionsCompleteArg) {
            MJCamFunSession.OnOptionsComplete onOptionsComplete = this.onComplete;
            if (onOptionsComplete != null && optionsCompleteArg != null) {
                onOptionsComplete.onComplete(optionsCompleteArg.options, optionsCompleteArg.error);
            }
        }

        public OptionsCompleteCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnOptionsComplete onOptionsComplete, boolean z) {
            super(mJCamFunSession, z);
            this.onComplete = onOptionsComplete;
        }
    }

    public static class ProgressCallback extends BaseCallback<MJCamFunSessionCallbackArg.ProgressArg> {
        private final MJCamFunSession.OnProgress onProgress;

        public ProgressCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnProgress onProgress2) {
            super(mJCamFunSession);
            this.onProgress = onProgress2;
        }

        public void onInvoke(MJCamFunSession mJCamFunSession, MJCamFunSessionCallbackArg.ProgressArg progressArg) {
            MJCamFunSession.OnProgress onProgress2 = this.onProgress;
            if (onProgress2 != null && progressArg != null) {
                onProgress2.onProgress(progressArg.progress);
            }
        }

        public ProgressCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnProgress onProgress2, boolean z) {
            super(mJCamFunSession, z);
            this.onProgress = onProgress2;
        }
    }

    public static class RecordingTimeChangeCallback extends BaseCallback<MJCamFunSessionCallbackArg.RecordingTimeChangeArg> {
        private final MJCamFunSession.OnRecordingTimeChange onRecordingTimeChange;

        public RecordingTimeChangeCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnRecordingTimeChange onRecordingTimeChange2) {
            super(mJCamFunSession);
            this.onRecordingTimeChange = onRecordingTimeChange2;
        }

        public void onInvoke(MJCamFunSession mJCamFunSession, MJCamFunSessionCallbackArg.RecordingTimeChangeArg recordingTimeChangeArg) {
            MJCamFunSession.OnRecordingTimeChange onRecordingTimeChange2 = this.onRecordingTimeChange;
            if (onRecordingTimeChange2 != null && recordingTimeChangeArg != null) {
                onRecordingTimeChange2.onRecordingTimeChange(recordingTimeChangeArg.lastFrameTime, recordingTimeChangeArg.maxRecordingDuration);
            }
        }

        public RecordingTimeChangeCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnRecordingTimeChange onRecordingTimeChange2, boolean z) {
            super(mJCamFunSession, z);
            this.onRecordingTimeChange = onRecordingTimeChange2;
        }
    }

    public static class StopRecordingCallback extends BaseCallback<MJCamFunSessionCallbackArg.StopRecordingArg> {
        private final MJCamFunSession.OnStopRecording onStopRecording;

        public StopRecordingCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnStopRecording onStopRecording2) {
            super(mJCamFunSession);
            this.onStopRecording = onStopRecording2;
        }

        public void onInvoke(MJCamFunSession mJCamFunSession, MJCamFunSessionCallbackArg.StopRecordingArg stopRecordingArg) {
            MJCamFunSession.OnStopRecording onStopRecording2 = this.onStopRecording;
            if (onStopRecording2 != null && stopRecordingArg != null) {
                onStopRecording2.onStopRecording(stopRecordingArg.finishInfo, stopRecordingArg.error);
            }
        }

        public StopRecordingCallback(MJCamFunSession mJCamFunSession, MJCamFunSession.OnStopRecording onStopRecording2, boolean z) {
            super(mJCamFunSession, z);
            this.onStopRecording = onStopRecording2;
        }
    }

    public static abstract class BaseCallback<T> extends NativeCallbackManager.Callback {
        private final WeakReference<MJCamFunSession> mjCamFunSessionWeakReference;

        public BaseCallback(MJCamFunSession mJCamFunSession) {
            this.mjCamFunSessionWeakReference = new WeakReference<>(mJCamFunSession);
        }

        public final void invoke(NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjCamFunSessionWeakReference.get(), callbackArgs);
        }

        public abstract void onInvoke(MJCamFunSession mJCamFunSession, T t);

        public BaseCallback(MJCamFunSession mJCamFunSession, boolean z) {
            super(z);
            this.mjCamFunSessionWeakReference = new WeakReference<>(mJCamFunSession);
        }
    }
}
