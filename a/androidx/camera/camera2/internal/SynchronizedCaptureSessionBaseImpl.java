package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;

class SynchronizedCaptureSessionBaseImpl extends SynchronizedCaptureSession.StateCallback implements SynchronizedCaptureSession, SynchronizedCaptureSessionOpener.OpenerImpl {
    private static final String TAG = "SyncCaptureSessionBase";
    public CameraCaptureSessionCompat mCameraCaptureSessionCompat;
    public final CaptureSessionRepository mCaptureSessionRepository;
    public SynchronizedCaptureSession.StateCallback mCaptureSessionStateCallback;
    private boolean mClosed = false;
    public final Handler mCompatHandler;
    public final Executor mExecutor;
    private List<DeferrableSurface> mHeldDeferrableSurfaces = null;
    public final Object mLock = new Object();
    public C117512b.C117513a<Void> mOpenCaptureSessionCompleter;
    public C112608f<Void> mOpenCaptureSessionFuture;
    private boolean mOpenerDisabled = false;
    private final ScheduledExecutorService mScheduledExecutorService;
    private boolean mSessionFinished = false;
    private C112608f<List<Surface>> mStartingSurface;

    public static class Api23Impl {
        private Api23Impl() {
        }

        public static Surface getInputSurface(CameraCaptureSession cameraCaptureSession) {
            return cameraCaptureSession.getInputSurface();
        }
    }

    public SynchronizedCaptureSessionBaseImpl(CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.mCaptureSessionRepository = captureSessionRepository;
        this.mCompatHandler = handler;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$close$2() {
        onSessionFinished(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onClosed$3(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionRepository.onCaptureSessionClosed(this);
        onSessionFinished(synchronizedCaptureSession);
        this.mCaptureSessionStateCallback.onClosed(synchronizedCaptureSession);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$onSessionFinished$4(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onSessionFinished(synchronizedCaptureSession);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$openCaptureSession$0(List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat, C117512b.C117513a aVar) {
        String str;
        synchronized (this.mLock) {
            holdDeferrableSurfaces(list);
            C20434g.m22021e(this.mOpenCaptureSessionCompleter == null, "The openCaptureSessionCompleter can only set once!");
            this.mOpenCaptureSessionCompleter = aVar;
            cameraDeviceCompat.createCaptureSession(sessionConfigurationCompat);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C112608f lambda$startWithDeferrableSurface$1(List list, List list2) {
        Logger.m15471d(TAG, "[" + this + "] getSurface...done");
        return list2.contains((Object) null) ? Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf((Object) null)))) : list2.isEmpty() ? Futures.immediateFailedFuture(new IllegalArgumentException("Unable to open capture session without surfaces")) : Futures.immediateFuture(list2);
    }

    public void abortCaptures() {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().abortCaptures();
    }

    public int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, getExecutor(), captureCallback);
    }

    public int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, getExecutor(), captureCallback);
    }

    public void close() {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCaptureSessionRepository.onCaptureSessionClosing(this);
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().close();
        getExecutor().execute(new SynchronizedCaptureSessionBaseImpl$$e(this));
    }

    public void createCaptureSessionCompat(CameraCaptureSession cameraCaptureSession) {
        if (this.mCameraCaptureSessionCompat == null) {
            this.mCameraCaptureSessionCompat = CameraCaptureSessionCompat.toCameraCaptureSessionCompat(cameraCaptureSession, this.mCompatHandler);
        }
    }

    public SessionConfigurationCompat createSessionConfigurationCompat(int i, List<OutputConfigurationCompat> list, SynchronizedCaptureSession.StateCallback stateCallback) {
        this.mCaptureSessionStateCallback = stateCallback;
        return new SessionConfigurationCompat(i, list, getExecutor(), new CameraCaptureSession.StateCallback() {
            public void onActive(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onActive(synchronizedCaptureSessionBaseImpl);
            }

            public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onCaptureQueueEmpty(synchronizedCaptureSessionBaseImpl);
            }

            public void onClosed(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onClosed(synchronizedCaptureSessionBaseImpl);
            }

            public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                C117512b.C117513a<Void> aVar;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigureFailed(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C20434g.m22020d(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        aVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    aVar.mo182232b(new IllegalStateException("onConfigureFailed"));
                } catch (Throwable th) {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C20434g.m22020d(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        C117512b.C117513a<Void> aVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        aVar2.mo182232b(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            }

            public void onConfigured(CameraCaptureSession cameraCaptureSession) {
                C117512b.C117513a<Void> aVar;
                try {
                    SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.onConfigured(synchronizedCaptureSessionBaseImpl);
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C20434g.m22020d(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl2 = SynchronizedCaptureSessionBaseImpl.this;
                        aVar = synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl2.mOpenCaptureSessionCompleter = null;
                    }
                    aVar.mo182231a(null);
                } catch (Throwable th) {
                    synchronized (SynchronizedCaptureSessionBaseImpl.this.mLock) {
                        C20434g.m22020d(SynchronizedCaptureSessionBaseImpl.this.mOpenCaptureSessionCompleter, "OpenCaptureSession completer should not null");
                        SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl3 = SynchronizedCaptureSessionBaseImpl.this;
                        C117512b.C117513a<Void> aVar2 = synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter;
                        synchronizedCaptureSessionBaseImpl3.mOpenCaptureSessionCompleter = null;
                        aVar2.mo182231a(null);
                        throw th;
                    }
                }
            }

            public void onReady(CameraCaptureSession cameraCaptureSession) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onReady(synchronizedCaptureSessionBaseImpl);
            }

            public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
                SynchronizedCaptureSessionBaseImpl.this.createCaptureSessionCompat(cameraCaptureSession);
                SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                synchronizedCaptureSessionBaseImpl.onSurfacePrepared(synchronizedCaptureSessionBaseImpl, surface);
            }
        });
    }

    public void finishClose() {
        releaseDeferrableSurfaces();
    }

    public CameraDevice getDevice() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat.toCameraCaptureSession().getDevice();
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public Surface getInputSurface() {
        this.mCameraCaptureSessionCompat.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            return Api23Impl.getInputSurface(this.mCameraCaptureSessionCompat.toCameraCaptureSession());
        }
        return null;
    }

    public C112608f<Void> getOpeningBlocker() {
        return Futures.immediateFuture(null);
    }

    public SynchronizedCaptureSession.StateCallback getStateCallback() {
        return this;
    }

    public void holdDeferrableSurfaces(List<DeferrableSurface> list) {
        synchronized (this.mLock) {
            releaseDeferrableSurfaces();
            DeferrableSurfaces.incrementAll(list);
            this.mHeldDeferrableSurfaces = list;
        }
    }

    public boolean isCameraCaptureSessionOpen() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mOpenCaptureSessionFuture != null;
        }
        return z;
    }

    public void onActive(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onActive(synchronizedCaptureSession);
    }

    public void onCaptureQueueEmpty(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onCaptureQueueEmpty(synchronizedCaptureSession);
    }

    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        C112608f<Void> fVar;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mClosed = true;
                C20434g.m22020d(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                fVar = this.mOpenCaptureSessionFuture;
            } else {
                fVar = null;
            }
        }
        finishClose();
        if (fVar != null) {
            fVar.addListener(new SynchronizedCaptureSessionBaseImpl$$d(this, synchronizedCaptureSession), CameraXExecutors.directExecutor());
        }
    }

    public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        finishClose();
        this.mCaptureSessionRepository.onCaptureSessionConfigureFail(this);
        this.mCaptureSessionStateCallback.onConfigureFailed(synchronizedCaptureSession);
    }

    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionRepository.onCaptureSessionCreated(this);
        this.mCaptureSessionStateCallback.onConfigured(synchronizedCaptureSession);
    }

    public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
        this.mCaptureSessionStateCallback.onReady(synchronizedCaptureSession);
    }

    public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
        C112608f<Void> fVar;
        synchronized (this.mLock) {
            if (!this.mSessionFinished) {
                this.mSessionFinished = true;
                C20434g.m22020d(this.mOpenCaptureSessionFuture, "Need to call openCaptureSession before using this API.");
                fVar = this.mOpenCaptureSessionFuture;
            } else {
                fVar = null;
            }
        }
        if (fVar != null) {
            fVar.addListener(new SynchronizedCaptureSessionBaseImpl$$a(this, synchronizedCaptureSession), CameraXExecutors.directExecutor());
        }
    }

    public void onSurfacePrepared(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        this.mCaptureSessionStateCallback.onSurfacePrepared(synchronizedCaptureSession, surface);
    }

    public C112608f<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list) {
        synchronized (this.mLock) {
            if (this.mOpenerDisabled) {
                C112608f<Void> immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                return immediateFailedFuture;
            }
            this.mCaptureSessionRepository.onCreateCaptureSession(this);
            C112608f<Void> a = C117512b.m165760a(new SynchronizedCaptureSessionBaseImpl$$c(this, list, CameraDeviceCompat.toCameraDeviceCompat(cameraDevice, this.mCompatHandler), sessionConfigurationCompat));
            this.mOpenCaptureSessionFuture = a;
            Futures.addCallback(a, new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    SynchronizedCaptureSessionBaseImpl.this.finishClose();
                    SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl = SynchronizedCaptureSessionBaseImpl.this;
                    synchronizedCaptureSessionBaseImpl.mCaptureSessionRepository.onCaptureSessionConfigureFail(synchronizedCaptureSessionBaseImpl);
                }

                public void onSuccess(Void voidR) {
                }
            }, CameraXExecutors.directExecutor());
            C112608f<Void> nonCancellationPropagating = Futures.nonCancellationPropagating(this.mOpenCaptureSessionFuture);
            return nonCancellationPropagating;
        }
    }

    public void releaseDeferrableSurfaces() {
        synchronized (this.mLock) {
            List<DeferrableSurface> list = this.mHeldDeferrableSurfaces;
            if (list != null) {
                DeferrableSurfaces.decrementAll(list);
                this.mHeldDeferrableSurfaces = null;
            }
        }
    }

    public int setRepeatingBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, getExecutor(), captureCallback);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, getExecutor(), captureCallback);
    }

    public C112608f<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j) {
        synchronized (this.mLock) {
            if (this.mOpenerDisabled) {
                C112608f<List<Surface>> immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("Opener is disabled"));
                return immediateFailedFuture;
            }
            FutureChain<T> transformAsync = FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(list, false, j, getExecutor(), this.mScheduledExecutorService)).transformAsync(new SynchronizedCaptureSessionBaseImpl$$b(this, list), getExecutor());
            this.mStartingSurface = transformAsync;
            C112608f<List<Surface>> nonCancellationPropagating = Futures.nonCancellationPropagating(transformAsync);
            return nonCancellationPropagating;
        }
    }

    public boolean stop() {
        boolean z;
        C112608f<List<Surface>> fVar = null;
        try {
            synchronized (this.mLock) {
                if (!this.mOpenerDisabled) {
                    C112608f<List<Surface>> fVar2 = this.mStartingSurface;
                    if (fVar2 != null) {
                        fVar = fVar2;
                    }
                    this.mOpenerDisabled = true;
                }
                z = !isCameraCaptureSessionOpen();
            }
            if (fVar != null) {
                fVar.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (fVar != null) {
                fVar.cancel(true);
            }
            throw th;
        }
    }

    public void stopRepeating() {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        this.mCameraCaptureSessionCompat.toCameraCaptureSession().stopRepeating();
    }

    public CameraCaptureSessionCompat toCameraCaptureSessionCompat() {
        this.mCameraCaptureSessionCompat.getClass();
        return this.mCameraCaptureSessionCompat;
    }

    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureBurstRequests(list, executor, captureCallback);
    }

    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.captureSingleRequest(captureRequest, executor, captureCallback);
    }

    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setRepeatingBurstRequests(list, executor, captureCallback);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        C20434g.m22020d(this.mCameraCaptureSessionCompat, "Need to call openCaptureSession before using this API.");
        return this.mCameraCaptureSessionCompat.setSingleRepeatingRequest(captureRequest, executor, captureCallback);
    }
}
