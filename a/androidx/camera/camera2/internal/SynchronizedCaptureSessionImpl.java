package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p1167z8.C112608f;

class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl {
    private static final String TAG = "SyncCaptureSessionImpl";
    private final ForceCloseDeferrableSurface mCloseSurfaceQuirk;
    private List<DeferrableSurface> mDeferrableSurfaces;
    private final ForceCloseCaptureSession mForceCloseSessionQuirk;
    private final Object mObjectLock = new Object();
    public C112608f<Void> mOpeningCaptureSession;
    private final WaitForRepeatingRequestStart mWaitForOtherSessionCompleteQuirk;

    public SynchronizedCaptureSessionImpl(Quirks quirks, Quirks quirks2, CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.mCloseSurfaceQuirk = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.mWaitForOtherSessionCompleteQuirk = new WaitForRepeatingRequestStart(quirks);
        this.mForceCloseSessionQuirk = new ForceCloseCaptureSession(quirks2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$close$3() {
        debugLog("Session call super.close()");
        super.close();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onConfigured$2(SynchronizedCaptureSession synchronizedCaptureSession) {
        super.onConfigured(synchronizedCaptureSession);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C112608f lambda$openCaptureSession$0(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ int lambda$setSingleRepeatingRequest$1(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.setSingleRepeatingRequest(captureRequest, captureCallback);
    }

    public void close() {
        debugLog("Session call close()");
        this.mWaitForOtherSessionCompleteQuirk.onSessionEnd();
        this.mWaitForOtherSessionCompleteQuirk.getStartStreamFuture().addListener(new SynchronizedCaptureSessionImpl$$a(this), getExecutor());
    }

    public void debugLog(String str) {
        Logger.m15471d(TAG, "[" + this + "] " + str);
    }

    public C112608f<Void> getOpeningBlocker() {
        return this.mWaitForOtherSessionCompleteQuirk.getStartStreamFuture();
    }

    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mObjectLock) {
            this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
        }
        debugLog("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        debugLog("Session onConfigured()");
        this.mForceCloseSessionQuirk.onSessionConfigured(synchronizedCaptureSession, this.mCaptureSessionRepository.getCreatingCaptureSessions(), this.mCaptureSessionRepository.getCaptureSessions(), new SynchronizedCaptureSessionImpl$$c(this));
    }

    public C112608f<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list) {
        C112608f<Void> nonCancellationPropagating;
        synchronized (this.mObjectLock) {
            C112608f<Void> openCaptureSession = this.mWaitForOtherSessionCompleteQuirk.openCaptureSession(cameraDevice, sessionConfigurationCompat, list, this.mCaptureSessionRepository.getClosingCaptureSession(), new SynchronizedCaptureSessionImpl$$b(this));
            this.mOpeningCaptureSession = openCaptureSession;
            nonCancellationPropagating = Futures.nonCancellationPropagating(openCaptureSession);
        }
        return nonCancellationPropagating;
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mWaitForOtherSessionCompleteQuirk.setSingleRepeatingRequest(captureRequest, captureCallback, new SynchronizedCaptureSessionImpl$$d(this));
    }

    public C112608f<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j) {
        C112608f<List<Surface>> startWithDeferrableSurface;
        synchronized (this.mObjectLock) {
            this.mDeferrableSurfaces = list;
            startWithDeferrableSurface = super.startWithDeferrableSurface(list, j);
        }
        return startWithDeferrableSurface;
    }

    public boolean stop() {
        boolean stop;
        synchronized (this.mObjectLock) {
            if (isCameraCaptureSessionOpen()) {
                this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
            } else {
                C112608f<Void> fVar = this.mOpeningCaptureSession;
                if (fVar != null) {
                    fVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
