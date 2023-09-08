package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.OutputSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.SessionProcessorSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p1167z8.C112608f;
import p329d3.C20434g;

final class ProcessingCaptureSession implements CaptureSessionInterface {
    private static final String TAG = "ProcessingCaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    private static List<DeferrableSurface> sHeldProcessorSurfaces = new ArrayList();
    private static int sNextInstanceId = 0;
    private final Camera2CameraInfoImpl mCamera2CameraInfoImpl;
    private final CaptureSession mCaptureSession = new CaptureSession();
    public final Executor mExecutor;
    private int mInstanceId = 0;
    public volatile boolean mIsExecutingStillCaptureRequest = false;
    private boolean mIsRepeatingRequestStarted = false;
    private List<DeferrableSurface> mOutputSurfaces = new ArrayList();
    private volatile CaptureConfig mPendingCaptureConfig = null;
    private SessionConfig mProcessorSessionConfig;
    private ProcessorState mProcessorState;
    private Camera2RequestProcessor mRequestProcessor;
    private final ScheduledExecutorService mScheduledExecutorService;
    private SessionConfig mSessionConfig;
    private CaptureRequestOptions mSessionOptions = new CaptureRequestOptions.Builder().build();
    private final SessionProcessor mSessionProcessor;
    private final SessionProcessorCaptureCallback mSessionProcessorCaptureCallback;
    private CaptureRequestOptions mStillCaptureOptions = new CaptureRequestOptions.Builder().build();

    /* renamed from: androidx.camera.camera2.internal.ProcessingCaptureSession$3 */
    public static /* synthetic */ class C164853 {

        /* renamed from: $SwitchMap$androidx$camera$camera2$internal$ProcessingCaptureSession$ProcessorState */
        public static final /* synthetic */ int[] f44071x5f8a1974;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState[] r0 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44071x5f8a1974 = r0
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44071x5f8a1974     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.SESSION_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44071x5f8a1974     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44071x5f8a1974     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.ON_CAPTURE_SESSION_ENDED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f44071x5f8a1974     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.ProcessingCaptureSession$ProcessorState r1 = androidx.camera.camera2.internal.ProcessingCaptureSession.ProcessorState.CLOSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.ProcessingCaptureSession.C164853.<clinit>():void");
        }
    }

    public enum ProcessorState {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    public static class SessionProcessorCaptureCallback implements SessionProcessor.CaptureCallback {
        private List<CameraCaptureCallback> mCameraCaptureCallbacks = Collections.emptyList();
        private final Executor mExecutor;

        public SessionProcessorCaptureCallback(Executor executor) {
            this.mExecutor = executor;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureFailed$0() {
            for (CameraCaptureCallback onCaptureFailed : this.mCameraCaptureCallbacks) {
                onCaptureFailed.onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureSequenceCompleted$1() {
            for (CameraCaptureCallback onCaptureCompleted : this.mCameraCaptureCallbacks) {
                onCaptureCompleted.onCaptureCompleted(CameraCaptureResult.EmptyCameraCaptureResult.create());
            }
        }

        public void onCaptureFailed(int i) {
            this.mExecutor.execute(new ProcessingCaptureSession$SessionProcessorCaptureCallback$$b(this));
        }

        public void onCaptureProcessStarted(int i) {
        }

        public void onCaptureSequenceAborted(int i) {
        }

        public void onCaptureSequenceCompleted(int i) {
            this.mExecutor.execute(new ProcessingCaptureSession$SessionProcessorCaptureCallback$$a(this));
        }

        public void onCaptureStarted(int i, long j) {
        }

        public void setCameraCaptureCallbacks(List<CameraCaptureCallback> list) {
            this.mCameraCaptureCallbacks = list;
        }
    }

    public ProcessingCaptureSession(SessionProcessor sessionProcessor, Camera2CameraInfoImpl camera2CameraInfoImpl, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.mSessionProcessor = sessionProcessor;
        this.mCamera2CameraInfoImpl = camera2CameraInfoImpl;
        this.mExecutor = executor;
        this.mScheduledExecutorService = scheduledExecutorService;
        this.mProcessorState = ProcessorState.UNINITIALIZED;
        this.mSessionProcessorCaptureCallback = new SessionProcessorCaptureCallback(executor);
        int i = sNextInstanceId;
        sNextInstanceId = i + 1;
        this.mInstanceId = i;
        Logger.m15471d(TAG, "New ProcessingCaptureSession (id=" + this.mInstanceId + ")");
    }

    private static void cancelRequests(List<CaptureConfig> list) {
        for (CaptureConfig cameraCaptureCallbacks : list) {
            for (CameraCaptureCallback onCaptureCancelled : cameraCaptureCallbacks.getCameraCaptureCallbacks()) {
                onCaptureCancelled.onCaptureCancelled();
            }
        }
    }

    private static List<SessionProcessorSurface> getSessionProcessorSurfaceList(List<DeferrableSurface> list) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface next : list) {
            C20434g.m22018b(next instanceof SessionProcessorSurface, "Surface must be SessionProcessorSurface");
            arrayList.add((SessionProcessorSurface) next);
        }
        return arrayList;
    }

    private boolean isStillCapture(List<CaptureConfig> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (CaptureConfig templateType : list) {
            if (templateType.getTemplateType() != 2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$open$0() {
        DeferrableSurfaces.decrementAll(this.mOutputSurfaces);
    }

    /* access modifiers changed from: private */
    public C112608f lambda$open$2(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener, List list) {
        Logger.m15471d(TAG, "-- getSurfaces done, start init (id=" + this.mInstanceId + ")");
        if (this.mProcessorState == ProcessorState.CLOSED) {
            return Futures.immediateFailedFuture(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        OutputSurface outputSurface = null;
        if (list.contains((Object) null)) {
            return Futures.immediateFailedFuture(new DeferrableSurface.SurfaceClosedException("Surface closed", sessionConfig.getSurfaces().get(list.indexOf((Object) null))));
        }
        try {
            DeferrableSurfaces.incrementAll(this.mOutputSurfaces);
            OutputSurface outputSurface2 = null;
            OutputSurface outputSurface3 = null;
            for (int i = 0; i < sessionConfig.getSurfaces().size(); i++) {
                DeferrableSurface deferrableSurface = sessionConfig.getSurfaces().get(i);
                if (Objects.equals(deferrableSurface.getContainerClass(), Preview.class)) {
                    outputSurface = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
                } else if (Objects.equals(deferrableSurface.getContainerClass(), ImageCapture.class)) {
                    outputSurface2 = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
                } else if (Objects.equals(deferrableSurface.getContainerClass(), ImageAnalysis.class)) {
                    outputSurface3 = OutputSurface.create(deferrableSurface.getSurface().get(), new Size(deferrableSurface.getPrescribedSize().getWidth(), deferrableSurface.getPrescribedSize().getHeight()), deferrableSurface.getPrescribedStreamFormat());
                }
            }
            this.mProcessorState = ProcessorState.SESSION_INITIALIZED;
            Logger.m15477w(TAG, "== initSession (id=" + this.mInstanceId + ")");
            SessionConfig initSession = this.mSessionProcessor.initSession(this.mCamera2CameraInfoImpl, outputSurface, outputSurface2, outputSurface3);
            this.mProcessorSessionConfig = initSession;
            initSession.getSurfaces().get(0).getTerminationFuture().addListener(new ProcessingCaptureSession$$a(this), CameraXExecutors.directExecutor());
            for (DeferrableSurface next : this.mProcessorSessionConfig.getSurfaces()) {
                sHeldProcessorSurfaces.add(next);
                next.getTerminationFuture().addListener(new ProcessingCaptureSession$$b(next), this.mExecutor);
            }
            SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
            validatingBuilder.add(sessionConfig);
            validatingBuilder.clearSurfaces();
            validatingBuilder.add(this.mProcessorSessionConfig);
            C20434g.m22018b(validatingBuilder.isValid(), "Cannot transform the SessionConfig");
            SessionConfig build = validatingBuilder.build();
            CaptureSession captureSession = this.mCaptureSession;
            cameraDevice.getClass();
            C112608f<Void> open = captureSession.open(build, cameraDevice, synchronizedCaptureSessionOpener);
            Futures.addCallback(open, new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    Logger.m15474e(ProcessingCaptureSession.TAG, "open session failed ", th);
                    ProcessingCaptureSession.this.close();
                }

                public void onSuccess(Void voidR) {
                }
            }, this.mExecutor);
            return open;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return Futures.immediateFailedFuture(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void lambda$open$3(Void voidR) {
        onConfigured(this.mCaptureSession);
        return null;
    }

    private void updateParameters(CaptureRequestOptions captureRequestOptions, CaptureRequestOptions captureRequestOptions2) {
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(captureRequestOptions);
        builder.insertAllOptions(captureRequestOptions2);
        this.mSessionProcessor.setParameters(builder.build());
    }

    public void cancelIssuedCaptureRequests() {
        Logger.m15471d(TAG, "cancelIssuedCaptureRequests (id=" + this.mInstanceId + ")");
        if (this.mPendingCaptureConfig != null) {
            for (CameraCaptureCallback onCaptureCancelled : this.mPendingCaptureConfig.getCameraCaptureCallbacks()) {
                onCaptureCancelled.onCaptureCancelled();
            }
            this.mPendingCaptureConfig = null;
        }
    }

    public void close() {
        Logger.m15471d(TAG, "close (id=" + this.mInstanceId + ") state=" + this.mProcessorState);
        int i = C164853.f44071x5f8a1974[this.mProcessorState.ordinal()];
        if (i != 2) {
            if (i == 3) {
                this.mSessionProcessor.onCaptureSessionEnd();
                Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
                if (camera2RequestProcessor != null) {
                    camera2RequestProcessor.close();
                }
                this.mProcessorState = ProcessorState.ON_CAPTURE_SESSION_ENDED;
            } else if (i != 4) {
                if (i == 5) {
                    return;
                }
                this.mProcessorState = ProcessorState.CLOSED;
                this.mCaptureSession.close();
            }
        }
        this.mSessionProcessor.deInitSession();
        this.mProcessorState = ProcessorState.CLOSED;
        this.mCaptureSession.close();
    }

    public List<CaptureConfig> getCaptureConfigs() {
        if (this.mPendingCaptureConfig == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(new CaptureConfig[]{this.mPendingCaptureConfig});
    }

    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    public void issueCaptureRequests(List<CaptureConfig> list) {
        if (!list.isEmpty()) {
            if (list.size() > 1 || !isStillCapture(list)) {
                cancelRequests(list);
            } else if (this.mPendingCaptureConfig != null || this.mIsExecutingStillCaptureRequest) {
                cancelRequests(list);
            } else {
                final CaptureConfig captureConfig = list.get(0);
                Logger.m15471d(TAG, "issueCaptureRequests (id=" + this.mInstanceId + ") + state =" + this.mProcessorState);
                int i = C164853.f44071x5f8a1974[this.mProcessorState.ordinal()];
                if (i == 1 || i == 2) {
                    this.mPendingCaptureConfig = captureConfig;
                } else if (i == 3) {
                    this.mIsExecutingStillCaptureRequest = true;
                    CaptureRequestOptions.Builder from = CaptureRequestOptions.Builder.from(captureConfig.getImplementationOptions());
                    Config implementationOptions = captureConfig.getImplementationOptions();
                    Config.Option<Integer> option = CaptureConfig.OPTION_ROTATION;
                    if (implementationOptions.containsOption(option)) {
                        from.setCaptureRequestOption(CaptureRequest.JPEG_ORIENTATION, (Integer) captureConfig.getImplementationOptions().retrieveOption(option));
                    }
                    Config implementationOptions2 = captureConfig.getImplementationOptions();
                    Config.Option<Integer> option2 = CaptureConfig.OPTION_JPEG_QUALITY;
                    if (implementationOptions2.containsOption(option2)) {
                        from.setCaptureRequestOption(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) captureConfig.getImplementationOptions().retrieveOption(option2)).byteValue()));
                    }
                    CaptureRequestOptions build = from.build();
                    this.mStillCaptureOptions = build;
                    updateParameters(this.mSessionOptions, build);
                    this.mSessionProcessor.startCapture(new SessionProcessor.CaptureCallback() {
                        /* access modifiers changed from: private */
                        public /* synthetic */ void lambda$onCaptureFailed$0(CaptureConfig captureConfig) {
                            for (CameraCaptureCallback onCaptureFailed : captureConfig.getCameraCaptureCallbacks()) {
                                onCaptureFailed.onCaptureFailed(new CameraCaptureFailure(CameraCaptureFailure.Reason.ERROR));
                            }
                            ProcessingCaptureSession.this.mIsExecutingStillCaptureRequest = false;
                        }

                        /* access modifiers changed from: private */
                        public /* synthetic */ void lambda$onCaptureSequenceCompleted$1(CaptureConfig captureConfig) {
                            for (CameraCaptureCallback onCaptureCompleted : captureConfig.getCameraCaptureCallbacks()) {
                                onCaptureCompleted.onCaptureCompleted(new CameraCaptureResult.EmptyCameraCaptureResult());
                            }
                            ProcessingCaptureSession.this.mIsExecutingStillCaptureRequest = false;
                        }

                        public void onCaptureFailed(int i) {
                            ProcessingCaptureSession.this.mExecutor.execute(new ProcessingCaptureSession$2$$b(this, captureConfig));
                        }

                        public void onCaptureProcessStarted(int i) {
                        }

                        public void onCaptureSequenceAborted(int i) {
                        }

                        public void onCaptureSequenceCompleted(int i) {
                            ProcessingCaptureSession.this.mExecutor.execute(new ProcessingCaptureSession$2$$a(this, captureConfig));
                        }

                        public void onCaptureStarted(int i, long j) {
                        }
                    });
                } else if (i == 4 || i == 5) {
                    Logger.m15471d(TAG, "Run issueCaptureRequests in wrong state, state = " + this.mProcessorState);
                    cancelRequests(list);
                }
            }
        }
    }

    public void onConfigured(CaptureSession captureSession) {
        boolean z = this.mProcessorState == ProcessorState.SESSION_INITIALIZED;
        C20434g.m22018b(z, "Invalid state state:" + this.mProcessorState);
        Camera2RequestProcessor camera2RequestProcessor = new Camera2RequestProcessor(captureSession, getSessionProcessorSurfaceList(this.mProcessorSessionConfig.getSurfaces()));
        this.mRequestProcessor = camera2RequestProcessor;
        this.mSessionProcessor.onCaptureSessionStart(camera2RequestProcessor);
        this.mProcessorState = ProcessorState.ON_CAPTURE_SESSION_STARTED;
        SessionConfig sessionConfig = this.mSessionConfig;
        if (sessionConfig != null) {
            setSessionConfig(sessionConfig);
        }
        if (this.mPendingCaptureConfig != null) {
            List asList = Arrays.asList(new CaptureConfig[]{this.mPendingCaptureConfig});
            this.mPendingCaptureConfig = null;
            issueCaptureRequests(asList);
        }
    }

    public C112608f<Void> open(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener) {
        boolean z = this.mProcessorState == ProcessorState.UNINITIALIZED;
        C20434g.m22018b(z, "Invalid state state:" + this.mProcessorState);
        C20434g.m22018b(sessionConfig.getSurfaces().isEmpty() ^ true, "SessionConfig contains no surfaces");
        Logger.m15471d(TAG, "open (id=" + this.mInstanceId + ")");
        List<DeferrableSurface> surfaces = sessionConfig.getSurfaces();
        this.mOutputSurfaces = surfaces;
        return FutureChain.from(DeferrableSurfaces.surfaceListWithTimeout(surfaces, false, 5000, this.mExecutor, this.mScheduledExecutorService)).transformAsync(new ProcessingCaptureSession$$c(this, sessionConfig, cameraDevice, synchronizedCaptureSessionOpener), this.mExecutor).transform(new ProcessingCaptureSession$$d(this), this.mExecutor);
    }

    public C112608f<Void> release(boolean z) {
        C20434g.m22021e(this.mProcessorState == ProcessorState.CLOSED, "release() can only be called in CLOSED state");
        Logger.m15471d(TAG, "release (id=" + this.mInstanceId + ")");
        return this.mCaptureSession.release(z);
    }

    public void setSessionConfig(SessionConfig sessionConfig) {
        Logger.m15471d(TAG, "setSessionConfig (id=" + this.mInstanceId + ")");
        this.mSessionConfig = sessionConfig;
        if (sessionConfig != null) {
            Camera2RequestProcessor camera2RequestProcessor = this.mRequestProcessor;
            if (camera2RequestProcessor != null) {
                camera2RequestProcessor.updateSessionConfig(sessionConfig);
            }
            if (this.mProcessorState == ProcessorState.ON_CAPTURE_SESSION_STARTED) {
                CaptureRequestOptions build = CaptureRequestOptions.Builder.from(sessionConfig.getImplementationOptions()).build();
                this.mSessionOptions = build;
                updateParameters(build, this.mStillCaptureOptions);
                if (!this.mIsRepeatingRequestStarted) {
                    this.mSessionProcessor.startRepeating(this.mSessionProcessorCaptureCallback);
                    this.mIsRepeatingRequestStarted = true;
                }
            }
        }
    }
}
