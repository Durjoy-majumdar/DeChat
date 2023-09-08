package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.List;
import p1167z8.C112608f;
import p202m2.C117512b;

public class WaitForRepeatingRequestStart {
    private final CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() {
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            C117512b.C117513a<Void> aVar = WaitForRepeatingRequestStart.this.mStartStreamingCompleter;
            if (aVar != null) {
                boolean z = true;
                aVar.f351637d = true;
                C117512b.C117516d<T> dVar = aVar.f351635b;
                if (dVar == null || !dVar.f351639e.cancel(true)) {
                    z = false;
                }
                if (z) {
                    aVar.f351634a = null;
                    aVar.f351635b = null;
                    aVar.f351636c = null;
                }
                WaitForRepeatingRequestStart.this.mStartStreamingCompleter = null;
            }
        }

        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            C117512b.C117513a<Void> aVar = WaitForRepeatingRequestStart.this.mStartStreamingCompleter;
            if (aVar != null) {
                aVar.mo182231a(null);
                WaitForRepeatingRequestStart.this.mStartStreamingCompleter = null;
            }
        }
    };
    private final boolean mHasCaptureSessionStuckQuirk;
    private boolean mHasSubmittedRepeating;
    private final Object mLock = new Object();
    public C117512b.C117513a<Void> mStartStreamingCompleter;
    private final C112608f<Void> mStartStreamingFuture;

    @FunctionalInterface
    public interface OpenCaptureSession {
        C112608f<Void> run(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list);
    }

    @FunctionalInterface
    public interface SingleRepeatingRequest {
        int run(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);
    }

    public WaitForRepeatingRequestStart(Quirks quirks) {
        this.mHasCaptureSessionStuckQuirk = quirks.contains(CaptureSessionStuckQuirk.class);
        if (shouldWaitRepeatingSubmit()) {
            this.mStartStreamingFuture = C117512b.m165760a(new WaitForRepeatingRequestStart$$a(this));
        } else {
            this.mStartStreamingFuture = Futures.immediateFuture(null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(C117512b.C117513a aVar) {
        this.mStartStreamingCompleter = aVar;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    public C112608f<Void> getStartStreamFuture() {
        return Futures.nonCancellationPropagating(this.mStartStreamingFuture);
    }

    public void onSessionEnd() {
        synchronized (this.mLock) {
            if (shouldWaitRepeatingSubmit() && !this.mHasSubmittedRepeating) {
                this.mStartStreamingFuture.cancel(true);
            }
        }
    }

    public C112608f<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list, List<SynchronizedCaptureSession> list2, OpenCaptureSession openCaptureSession) {
        ArrayList arrayList = new ArrayList();
        for (SynchronizedCaptureSession openingBlocker : list2) {
            arrayList.add(openingBlocker.getOpeningBlocker());
        }
        return FutureChain.from(Futures.successfulAsList(arrayList)).transformAsync(new WaitForRepeatingRequestStart$$b(openCaptureSession, cameraDevice, sessionConfigurationCompat, list), CameraXExecutors.directExecutor());
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, SingleRepeatingRequest singleRepeatingRequest) {
        int run;
        synchronized (this.mLock) {
            if (shouldWaitRepeatingSubmit()) {
                captureCallback = Camera2CaptureCallbacks.createComboCallback(this.mCaptureCallback, captureCallback);
                this.mHasSubmittedRepeating = true;
            }
            run = singleRepeatingRequest.run(captureRequest, captureCallback);
        }
        return run;
    }

    public boolean shouldWaitRepeatingSubmit() {
        return this.mHasCaptureSessionStuckQuirk;
    }
}
