package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p1167z8.C112608f;
import p202m2.C117512b;

class Camera2CapturePipeline {
    private static final String TAG = "Camera2CapturePipeline";
    private final Camera2CameraControlImpl mCameraControl;
    private final Quirks mCameraQuirk;
    private final Executor mExecutor;
    private final boolean mIsLegacyDevice;
    private int mTemplate = 1;
    private final UseTorchAsFlash mUseTorchAsFlash;

    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        public AePreCaptureTask(Camera2CameraControlImpl camera2CameraControlImpl, int i, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(C117512b.C117513a aVar) {
            this.mCameraControl.getFocusMeteringControl().triggerAePrecapture(aVar);
            this.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.m15471d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }

        public C112608f<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            if (!Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                return Futures.immediateFuture(Boolean.FALSE);
            }
            Logger.m15471d(Camera2CapturePipeline.TAG, "Trigger AE");
            this.mIsExecuted = true;
            return FutureChain.from(C117512b.m165760a(new Camera2CapturePipeline$AePreCaptureTask$$a(this))).transform(new Camera2CapturePipeline$AePreCaptureTask$$b(), CameraXExecutors.directExecutor());
        }
    }

    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        public AfTask(Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        public boolean isCaptureResultNeeded() {
            return true;
        }

        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.m15471d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }

        public C112608f<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Integer num;
            C112608f<Boolean> immediateFuture = Futures.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return immediateFuture;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                Logger.m15471d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.m15471d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf((C117512b.C117513a<CameraCaptureResult>) null, false);
                }
            }
            return immediateFuture;
        }
    }

    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS;
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS;
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final PipelineTask mPipelineSubTask = new PipelineTask() {
            public boolean isCaptureResultNeeded() {
                for (PipelineTask isCaptureResultNeeded : Pipeline.this.mTasks) {
                    if (isCaptureResultNeeded.isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            public void postCapture() {
                for (PipelineTask postCapture : Pipeline.this.mTasks) {
                    postCapture.postCapture();
                }
            }

            public C112608f<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (PipelineTask preCapture : Pipeline.this.mTasks) {
                    arrayList.add(preCapture.preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new Camera2CapturePipeline$Pipeline$1$$a(), CameraXExecutors.directExecutor());
            }
        };
        public final List<PipelineTask> mTasks = new ArrayList();
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            CHECK_3A_TIMEOUT_IN_NS = timeUnit.toNanos(1);
            CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = timeUnit.toNanos(5);
        }

        public Pipeline(int i, Executor executor, Camera2CameraControlImpl camera2CameraControlImpl, boolean z, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i;
            this.mExecutor = executor;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        private void applyAeModeQuirk(CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private void applyStillCaptureTemplate(CaptureConfig.Builder builder, CaptureConfig captureConfig) {
            int i = (this.mTemplate != 3 || this.mIsLegacyDevice) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
            if (i != -1) {
                builder.setTemplateType(i);
            }
        }

        /* access modifiers changed from: private */
        public boolean is3AConverged(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            Camera2CameraCaptureResult camera2CameraCaptureResult = new Camera2CameraCaptureResult(totalCaptureResult);
            boolean z = camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.OFF || camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.UNKNOWN || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.PASSIVE_FOCUSED || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.LOCKED_FOCUSED || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED;
            boolean z2 = camera2CameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.CONVERGED || camera2CameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.FLASH_REQUIRED || camera2CameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.UNKNOWN;
            boolean z3 = camera2CameraCaptureResult.getAwbState() == CameraCaptureMetaData.AwbState.CONVERGED || camera2CameraCaptureResult.getAwbState() == CameraCaptureMetaData.AwbState.UNKNOWN;
            Logger.m15471d(Camera2CapturePipeline.TAG, "checkCaptureResult, AE=" + camera2CameraCaptureResult.getAeState() + " AF =" + camera2CameraCaptureResult.getAfState() + " AWB=" + camera2CameraCaptureResult.getAwbState());
            return z && z2 && z3;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C112608f lambda$executeCapture$0(int i, TotalCaptureResult totalCaptureResult) {
            if (Camera2CapturePipeline.isFlashRequired(i, totalCaptureResult)) {
                setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return this.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C112608f lambda$executeCapture$1(Boolean bool) {
            return bool.booleanValue() ? waitForResult(this.mTimeout3A, new Camera2CapturePipeline$Pipeline$$f(this)) : Futures.immediateFuture(null);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C112608f lambda$executeCapture$2(List list, int i, TotalCaptureResult totalCaptureResult) {
            return submitConfigsInternal(list, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$executeCapture$3() {
            this.mPipelineSubTask.postCapture();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object lambda$submitConfigsInternal$4(CaptureConfig.Builder builder, final C117512b.C117513a aVar) {
            builder.addCameraCaptureCallback(new CameraCaptureCallback() {
                public void onCaptureCancelled() {
                    aVar.mo182232b(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", (Throwable) null));
                }

                public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                    aVar.mo182231a(null);
                }

                public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                    aVar.mo182232b(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), (Throwable) null));
                }
            });
            return "submitStillCapture";
        }

        private void setTimeout3A(long j) {
            this.mTimeout3A = j;
        }

        private C112608f<TotalCaptureResult> waitForResult(long j, ResultListener.Checker checker) {
            ResultListener resultListener = new ResultListener(j, checker);
            this.mCameraControl.addCaptureResultListener(resultListener);
            return resultListener.getFuture();
        }

        public void addTask(PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        public C112608f<List<Void>> executeCapture(List<CaptureConfig> list, int i) {
            C112608f immediateFuture = Futures.immediateFuture(null);
            if (!this.mTasks.isEmpty()) {
                immediateFuture = FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? waitForResult(0, (ResultListener.Checker) null) : Futures.immediateFuture(null)).transformAsync(new Camera2CapturePipeline$Pipeline$$b(this, i), this.mExecutor).transformAsync(new Camera2CapturePipeline$Pipeline$$c(this), this.mExecutor);
            }
            FutureChain transformAsync = FutureChain.from(immediateFuture).transformAsync(new Camera2CapturePipeline$Pipeline$$d(this, list, i), this.mExecutor);
            transformAsync.addListener(new Camera2CapturePipeline$Pipeline$$e(this), this.mExecutor);
            return transformAsync;
        }

        public C112608f<List<Void>> submitConfigsInternal(List<CaptureConfig> list, int i) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig next : list) {
                CaptureConfig.Builder from = CaptureConfig.Builder.from(next);
                CameraCaptureResult cameraCaptureResult = null;
                if (next.getTemplateType() == 5) {
                    ImageProxy dequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer();
                    if (dequeueImageFromBuffer != null && this.mCameraControl.getZslControl().enqueueImageToImageWriter(dequeueImageFromBuffer)) {
                        cameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(dequeueImageFromBuffer.getImageInfo());
                    }
                }
                if (cameraCaptureResult != null) {
                    from.setCameraCaptureResult(cameraCaptureResult);
                } else {
                    applyStillCaptureTemplate(from, next);
                }
                if (this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i)) {
                    applyAeModeQuirk(from);
                }
                arrayList.add(C117512b.m165760a(new Camera2CapturePipeline$Pipeline$$a(this, from)));
                arrayList2.add(from.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }
    }

    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        C112608f<Boolean> preCapture(TotalCaptureResult totalCaptureResult);
    }

    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        public static final long NO_TIMEOUT = 0;
        private final Checker mChecker;
        private C117512b.C117513a<TotalCaptureResult> mCompleter;
        private final C112608f<TotalCaptureResult> mFuture = C117512b.m165760a(new Camera2CapturePipeline$ResultListener$$a(this));
        private final long mTimeLimitNs;
        private volatile Long mTimestampOfFirstUpdateNs = null;

        public interface Checker {
            boolean check(TotalCaptureResult totalCaptureResult);
        }

        public ResultListener(long j, Checker checker) {
            this.mTimeLimitNs = j;
            this.mChecker = checker;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object lambda$new$0(C117512b.C117513a aVar) {
            this.mCompleter = aVar;
            return "waitFor3AResult";
        }

        public C112608f<TotalCaptureResult> getFuture() {
            return this.mFuture;
        }

        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.mTimestampOfFirstUpdateNs == null) {
                this.mTimestampOfFirstUpdateNs = l;
            }
            Long l2 = this.mTimestampOfFirstUpdateNs;
            if (0 == this.mTimeLimitNs || l2 == null || l == null || l.longValue() - l2.longValue() <= this.mTimeLimitNs) {
                Checker checker = this.mChecker;
                if (checker != null && !checker.check(totalCaptureResult)) {
                    return false;
                }
                this.mCompleter.mo182231a(totalCaptureResult);
                return true;
            }
            this.mCompleter.mo182231a(null);
            Logger.m15471d(Camera2CapturePipeline.TAG, "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }
    }

    public static class TorchTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;

        public TorchTask(Camera2CameraControlImpl camera2CameraControlImpl, int i) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Object lambda$preCapture$0(C117512b.C117513a aVar) {
            this.mCameraControl.getTorchControl().lambda$enableTorch$1(aVar, true);
            return "TorchOn";
        }

        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().lambda$enableTorch$1((C117512b.C117513a<Void>) null, false);
                Logger.m15471d(Camera2CapturePipeline.TAG, "Turn off torch");
            }
        }

        public C112608f<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (this.mCameraControl.isTorchOn()) {
                    Logger.m15471d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
                } else {
                    Logger.m15471d(Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return FutureChain.from(C117512b.m165760a(new Camera2CapturePipeline$TorchTask$$a(this))).transform(new Camera2CapturePipeline$TorchTask$$b(), CameraXExecutors.directExecutor());
                }
            }
            return Futures.immediateFuture(Boolean.FALSE);
        }
    }

    public Camera2CapturePipeline(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Quirks quirks, Executor executor) {
        boolean z = true;
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = (num == null || num.intValue() != 2) ? false : z;
        this.mExecutor = executor;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
    }

    public static boolean isFlashRequired(int i, TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
    }

    private boolean isTorchAsFlash(int i) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i == 1;
    }

    public void setTemplate(int i) {
        this.mTemplate = i;
    }

    public C112608f<List<Void>> submitStillCaptures(List<CaptureConfig> list, int i, int i2, int i3) {
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (isTorchAsFlash(i3)) {
            pipeline.addTask(new TorchTask(this.mCameraControl, i2));
        } else {
            pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i2, overrideAeModeForStillCapture));
        }
        return Futures.nonCancellationPropagating(pipeline.executeCapture(list, i2));
    }
}
