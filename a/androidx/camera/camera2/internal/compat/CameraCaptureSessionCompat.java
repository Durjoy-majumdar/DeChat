package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.ApiCompat;
import androidx.camera.core.impl.utils.MainThreadAsyncHandler;
import java.util.List;
import java.util.concurrent.Executor;

public final class CameraCaptureSessionCompat {
    private final CameraCaptureSessionCompatImpl mImpl;

    public interface CameraCaptureSessionCompatImpl {
        int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        CameraCaptureSession unwrap();
    }

    public static final class CaptureCallbackExecutorWrapper extends CameraCaptureSession.CaptureCallback {
        private final Executor mExecutor;
        public final CameraCaptureSession.CaptureCallback mWrappedCallback;

        public CaptureCallbackExecutorWrapper(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = captureCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureBufferLost$6(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            ApiCompat.Api24Impl.onCaptureBufferLost(this.mWrappedCallback, cameraCaptureSession, captureRequest, surface, j);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureCompleted$2(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.mWrappedCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureFailed$3(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.mWrappedCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProgressed$1(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.mWrappedCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureSequenceAborted$5(CameraCaptureSession cameraCaptureSession, int i) {
            this.mWrappedCallback.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureSequenceCompleted$4(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.mWrappedCallback.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.mWrappedCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }

        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$b(this, cameraCaptureSession, captureRequest, surface, j));
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$e(this, cameraCaptureSession, captureRequest, totalCaptureResult));
        }

        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$g(this, cameraCaptureSession, captureRequest, captureFailure));
        }

        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$d(this, cameraCaptureSession, captureRequest, captureResult));
        }

        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$a(this, cameraCaptureSession, i));
        }

        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$c(this, cameraCaptureSession, i, j));
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper$$f(this, cameraCaptureSession, captureRequest, j, j2));
        }
    }

    public static final class StateCallbackExecutorWrapper extends CameraCaptureSession.StateCallback {
        private final Executor mExecutor;
        public final CameraCaptureSession.StateCallback mWrappedCallback;

        public StateCallbackExecutorWrapper(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.mExecutor = executor;
            this.mWrappedCallback = stateCallback;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onActive$3(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onActive(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureQueueEmpty$4(CameraCaptureSession cameraCaptureSession) {
            ApiCompat.Api26Impl.onCaptureQueueEmpty(this.mWrappedCallback, cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onClosed$5(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onClosed(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigureFailed$1(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onConfigureFailed(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onConfigured$0(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onConfigured(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onReady$2(CameraCaptureSession cameraCaptureSession) {
            this.mWrappedCallback.onReady(cameraCaptureSession);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onSurfacePrepared$6(CameraCaptureSession cameraCaptureSession, Surface surface) {
            ApiCompat.Api23Impl.onSurfacePrepared(this.mWrappedCallback, cameraCaptureSession, surface);
        }

        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$d(this, cameraCaptureSession));
        }

        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$c(this, cameraCaptureSession));
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$b(this, cameraCaptureSession));
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$e(this, cameraCaptureSession));
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$a(this, cameraCaptureSession));
        }

        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$f(this, cameraCaptureSession));
        }

        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.mExecutor.execute(new CameraCaptureSessionCompat$StateCallbackExecutorWrapper$$g(this, cameraCaptureSession, surface));
        }
    }

    private CameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new CameraCaptureSessionCompatApi28Impl(cameraCaptureSession);
        } else {
            this.mImpl = CameraCaptureSessionCompatBaseImpl.create(cameraCaptureSession, handler);
        }
    }

    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        return toCameraCaptureSessionCompat(cameraCaptureSession, MainThreadAsyncHandler.getInstance());
    }

    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mImpl.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession toCameraCaptureSession() {
        return this.mImpl.unwrap();
    }

    public static CameraCaptureSessionCompat toCameraCaptureSessionCompat(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new CameraCaptureSessionCompat(cameraCaptureSession, handler);
    }
}
