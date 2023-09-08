package com.tencent.maas.camstudio;

import com.tencent.maas.camerafun.MJCaptureOptions;
import com.tencent.maas.camerafun.MJRecordingFinishInfo;
import com.tencent.maas.camstudio.MJCamSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.internal.NativeCallbackManager;
import com.tencent.maas.model.time.MJTime;
import java.lang.ref.WeakReference;

public class MJCamSessionCallback {

    public static class CompleteCallback extends BaseCallback<MJCamSessionCallbackArg.CompleteArg> {
        private final MJCamSession.OnComplete onComplete;

        public CompleteCallback(MJCamSession mJCamSession, MJCamSession.OnComplete onComplete2) {
            super(mJCamSession);
            this.onComplete = onComplete2;
        }

        public void onInvoke(MJCamSession mJCamSession, MJCamSessionCallbackArg.CompleteArg completeArg) {
            MJCamSession.OnComplete onComplete2 = this.onComplete;
            if (onComplete2 != null && completeArg != null) {
                onComplete2.onComplete(completeArg.error);
            }
        }

        public CompleteCallback(MJCamSession mJCamSession, MJCamSession.OnComplete onComplete2, boolean z) {
            super(mJCamSession, z);
            this.onComplete = onComplete2;
        }
    }

    public static class MJCamSessionCallbackArg extends NativeCallbackManager.CallbackArgs {

        public static class CompleteArg extends MJCamSessionCallbackArg {
            public final MJError error;

            public CompleteArg(MJError mJError) {
                this.error = mJError;
            }
        }

        public static class OptionsCompleteArg extends MJCamSessionCallbackArg {
            public final MJError error;
            public final MJCaptureOptions options;

            public OptionsCompleteArg(MJCaptureOptions mJCaptureOptions, MJError mJError) {
                this.options = mJCaptureOptions;
                this.error = mJError;
            }
        }

        public static class ProgressArg extends MJCamSessionCallbackArg {
            public final float progress;

            public ProgressArg(float f) {
                this.progress = f;
            }
        }

        public static class RecordingTimeChangeArg extends MJCamSessionCallbackArg {
            public final MJTime lastFrameTime;
            public final MJTime maxRecordingDuration;

            public RecordingTimeChangeArg(MJTime mJTime, MJTime mJTime2) {
                this.lastFrameTime = mJTime;
                this.maxRecordingDuration = mJTime2;
            }
        }

        public static class StopRecordingArg extends MJCamSessionCallbackArg {
            public final MJError error;
            public final MJRecordingFinishInfo finishInfo;

            public StopRecordingArg(MJRecordingFinishInfo mJRecordingFinishInfo, MJError mJError) {
                this.finishInfo = mJRecordingFinishInfo;
                this.error = mJError;
            }
        }
    }

    public static class OptionsCompleteCallback extends BaseCallback<MJCamSessionCallbackArg.OptionsCompleteArg> {
        private final MJCamSession.OnOptionsComplete onComplete;

        public OptionsCompleteCallback(MJCamSession mJCamSession, MJCamSession.OnOptionsComplete onOptionsComplete) {
            super(mJCamSession);
            this.onComplete = onOptionsComplete;
        }

        public void onInvoke(MJCamSession mJCamSession, MJCamSessionCallbackArg.OptionsCompleteArg optionsCompleteArg) {
            MJCamSession.OnOptionsComplete onOptionsComplete = this.onComplete;
            if (onOptionsComplete != null && optionsCompleteArg != null) {
                onOptionsComplete.onComplete(optionsCompleteArg.options, optionsCompleteArg.error);
            }
        }

        public OptionsCompleteCallback(MJCamSession mJCamSession, MJCamSession.OnOptionsComplete onOptionsComplete, boolean z) {
            super(mJCamSession, z);
            this.onComplete = onOptionsComplete;
        }
    }

    public static class ProgressCallback extends BaseCallback<MJCamSessionCallbackArg.ProgressArg> {
        private final MJCamSession.OnProgress onProgress;

        public ProgressCallback(MJCamSession mJCamSession, MJCamSession.OnProgress onProgress2) {
            super(mJCamSession);
            this.onProgress = onProgress2;
        }

        public void onInvoke(MJCamSession mJCamSession, MJCamSessionCallbackArg.ProgressArg progressArg) {
            MJCamSession.OnProgress onProgress2 = this.onProgress;
            if (onProgress2 != null && progressArg != null) {
                onProgress2.onProgress(progressArg.progress);
            }
        }

        public ProgressCallback(MJCamSession mJCamSession, MJCamSession.OnProgress onProgress2, boolean z) {
            super(mJCamSession, z);
            this.onProgress = onProgress2;
        }
    }

    public static class RecordingTimeChangeCallback extends BaseCallback<MJCamSessionCallbackArg.RecordingTimeChangeArg> {
        private final MJCamSession.OnRecordingTimeChange onRecordingTimeChange;

        public RecordingTimeChangeCallback(MJCamSession mJCamSession, MJCamSession.OnRecordingTimeChange onRecordingTimeChange2) {
            super(mJCamSession);
            this.onRecordingTimeChange = onRecordingTimeChange2;
        }

        public void onInvoke(MJCamSession mJCamSession, MJCamSessionCallbackArg.RecordingTimeChangeArg recordingTimeChangeArg) {
            MJCamSession.OnRecordingTimeChange onRecordingTimeChange2 = this.onRecordingTimeChange;
            if (onRecordingTimeChange2 != null && recordingTimeChangeArg != null) {
                onRecordingTimeChange2.onRecordingTimeChange(recordingTimeChangeArg.lastFrameTime, recordingTimeChangeArg.maxRecordingDuration);
            }
        }

        public RecordingTimeChangeCallback(MJCamSession mJCamSession, MJCamSession.OnRecordingTimeChange onRecordingTimeChange2, boolean z) {
            super(mJCamSession, z);
            this.onRecordingTimeChange = onRecordingTimeChange2;
        }
    }

    public static class StopRecordingCallback extends BaseCallback<MJCamSessionCallbackArg.StopRecordingArg> {
        private final MJCamSession.OnStopRecording onStopRecording;

        public StopRecordingCallback(MJCamSession mJCamSession, MJCamSession.OnStopRecording onStopRecording2) {
            super(mJCamSession);
            this.onStopRecording = onStopRecording2;
        }

        public void onInvoke(MJCamSession mJCamSession, MJCamSessionCallbackArg.StopRecordingArg stopRecordingArg) {
            MJCamSession.OnStopRecording onStopRecording2 = this.onStopRecording;
            if (onStopRecording2 != null && stopRecordingArg != null) {
                onStopRecording2.onStopRecording(stopRecordingArg.finishInfo, stopRecordingArg.error);
            }
        }

        public StopRecordingCallback(MJCamSession mJCamSession, MJCamSession.OnStopRecording onStopRecording2, boolean z) {
            super(mJCamSession, z);
            this.onStopRecording = onStopRecording2;
        }
    }

    public static abstract class BaseCallback<T> extends NativeCallbackManager.Callback {
        private final WeakReference<MJCamSession> mjCamSessionWeakReference;

        public BaseCallback(MJCamSession mJCamSession) {
            this.mjCamSessionWeakReference = new WeakReference<>(mJCamSession);
        }

        public final void invoke(NativeCallbackManager.CallbackArgs callbackArgs) {
            onInvoke(this.mjCamSessionWeakReference.get(), callbackArgs);
        }

        public abstract void onInvoke(MJCamSession mJCamSession, T t);

        public BaseCallback(MJCamSession mJCamSession, boolean z) {
            super(z);
            this.mjCamSessionWeakReference = new WeakReference<>(mJCamSession);
        }
    }
}
