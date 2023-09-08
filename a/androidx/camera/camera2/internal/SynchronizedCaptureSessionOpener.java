package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p1167z8.C112608f;

final class SynchronizedCaptureSessionOpener {
    private final OpenerImpl mImpl;

    public static class Builder {
        private final Quirks mCameraQuirks;
        private final CaptureSessionRepository mCaptureSessionRepository;
        private final Handler mCompatHandler;
        private final Quirks mDeviceQuirks;
        private final Executor mExecutor;
        private final boolean mQuirkExist;
        private final ScheduledExecutorService mScheduledExecutorService;

        public Builder(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, CaptureSessionRepository captureSessionRepository, Quirks quirks, Quirks quirks2) {
            this.mExecutor = executor;
            this.mScheduledExecutorService = scheduledExecutorService;
            this.mCompatHandler = handler;
            this.mCaptureSessionRepository = captureSessionRepository;
            this.mCameraQuirks = quirks;
            this.mDeviceQuirks = quirks2;
            this.mQuirkExist = new ForceCloseDeferrableSurface(quirks, quirks2).shouldForceClose() || new WaitForRepeatingRequestStart(quirks).shouldWaitRepeatingSubmit() || new ForceCloseCaptureSession(quirks2).shouldForceClose();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener build() {
            /*
                r9 = this;
                androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r0 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener
                boolean r1 = r9.mQuirkExist
                if (r1 == 0) goto L_0x0019
                androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl r1 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl
                androidx.camera.core.impl.Quirks r3 = r9.mCameraQuirks
                androidx.camera.core.impl.Quirks r4 = r9.mDeviceQuirks
                androidx.camera.camera2.internal.CaptureSessionRepository r5 = r9.mCaptureSessionRepository
                java.util.concurrent.Executor r6 = r9.mExecutor
                java.util.concurrent.ScheduledExecutorService r7 = r9.mScheduledExecutorService
                android.os.Handler r8 = r9.mCompatHandler
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8)
                goto L_0x0026
            L_0x0019:
                androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl r1 = new androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl
                androidx.camera.camera2.internal.CaptureSessionRepository r2 = r9.mCaptureSessionRepository
                java.util.concurrent.Executor r3 = r9.mExecutor
                java.util.concurrent.ScheduledExecutorService r4 = r9.mScheduledExecutorService
                android.os.Handler r5 = r9.mCompatHandler
                r1.<init>(r2, r3, r4, r5)
            L_0x0026:
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.Builder.build():androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener");
        }
    }

    public interface OpenerImpl {
        SessionConfigurationCompat createSessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback);

        Executor getExecutor();

        C112608f<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list);

        C112608f<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j);

        boolean stop();
    }

    public SynchronizedCaptureSessionOpener(OpenerImpl openerImpl) {
        this.mImpl = openerImpl;
    }

    public SessionConfigurationCompat createSessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback) {
        return this.mImpl.createSessionConfigurationCompat(i, list, stateCallback);
    }

    public Executor getExecutor() {
        return this.mImpl.getExecutor();
    }

    public C112608f<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list) {
        return this.mImpl.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    public C112608f<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j) {
        return this.mImpl.startWithDeferrableSurface(list, j);
    }

    public boolean stop() {
        return this.mImpl.stop();
    }
}
