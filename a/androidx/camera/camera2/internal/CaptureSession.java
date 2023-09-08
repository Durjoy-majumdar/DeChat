package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.SynchronizedCaptureSessionStateCallbacks;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.StillCaptureFlow;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;

final class CaptureSession implements CaptureSessionInterface {
    private static final String TAG = "CaptureSession";
    private static final long TIMEOUT_GET_SURFACE_IN_MS = 5000;
    public CameraEventCallbacks mCameraEventCallbacks;
    public Config mCameraEventOnRepeatingOptions;
    private final CameraCaptureSession.CaptureCallback mCaptureCallback;
    private final List<CaptureConfig> mCaptureConfigs;
    private final StateCallback mCaptureSessionStateCallback;
    public List<DeferrableSurface> mConfiguredDeferrableSurfaces;
    private final Map<DeferrableSurface, Surface> mConfiguredSurfaceMap;
    public C117512b.C117513a<Void> mReleaseCompleter;
    public C112608f<Void> mReleaseFuture;
    public SessionConfig mSessionConfig;
    public final Object mSessionLock;
    public State mState;
    public final StillCaptureFlow mStillCaptureFlow;
    public SynchronizedCaptureSession mSynchronizedCaptureSession;
    public SynchronizedCaptureSessionOpener mSynchronizedCaptureSessionOpener;

    /* renamed from: androidx.camera.camera2.internal.CaptureSession$3 */
    public static /* synthetic */ class C164783 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.camera2.internal.CaptureSession$State[] r0 = androidx.camera.camera2.internal.CaptureSession.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State = r0
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.GET_SURFACE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.OPENED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.CLOSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.camera2.internal.CaptureSession$State r1 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.C164783.<clinit>():void");
        }
    }

    public enum State {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    public final class StateCallback extends SynchronizedCaptureSession.StateCallback {
        public StateCallback() {
        }

        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                    case 6:
                    case 7:
                        CaptureSession.this.finishClose();
                        break;
                    case 8:
                        Logger.m15471d(CaptureSession.TAG, "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                Logger.m15473e(CaptureSession.TAG, "CameraCaptureSession.onConfigureFailed() " + CaptureSession.this.mState);
            }
        }

        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                switch (C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + CaptureSession.this.mState);
                    case 4:
                        CaptureSession captureSession = CaptureSession.this;
                        captureSession.mState = State.OPENED;
                        captureSession.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        if (captureSession.mSessionConfig != null) {
                            List<CaptureConfig> onEnableSession = captureSession.mCameraEventCallbacks.createComboCallback().onEnableSession();
                            if (!onEnableSession.isEmpty()) {
                                CaptureSession captureSession2 = CaptureSession.this;
                                captureSession2.issueBurstCaptureRequest(captureSession2.setupConfiguredSurface(onEnableSession));
                            }
                        }
                        Logger.m15471d(CaptureSession.TAG, "Attempting to send capture request onConfigured");
                        CaptureSession captureSession3 = CaptureSession.this;
                        captureSession3.issueRepeatingCaptureRequests(captureSession3.mSessionConfig);
                        CaptureSession.this.issuePendingCaptureRequest();
                        break;
                    case 6:
                        CaptureSession.this.mSynchronizedCaptureSession = synchronizedCaptureSession;
                        break;
                    case 7:
                        synchronizedCaptureSession.close();
                        break;
                }
                Logger.m15471d(CaptureSession.TAG, "CameraCaptureSession.onConfigured() mState=" + CaptureSession.this.mState);
            }
        }

        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()] != 1) {
                    Logger.m15471d(CaptureSession.TAG, "CameraCaptureSession.onReady() " + CaptureSession.this.mState);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }

        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
            synchronized (CaptureSession.this.mSessionLock) {
                if (CaptureSession.this.mState != State.UNINITIALIZED) {
                    Logger.m15471d(CaptureSession.TAG, "onSessionFinished()");
                    CaptureSession.this.finishClose();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + CaptureSession.this.mState);
                }
            }
        }
    }

    public CaptureSession() {
        this.mSessionLock = new Object();
        this.mCaptureConfigs = new ArrayList();
        this.mCaptureCallback = new CameraCaptureSession.CaptureCallback() {
            public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            }
        };
        this.mCameraEventOnRepeatingOptions = OptionsBundle.emptyBundle();
        this.mCameraEventCallbacks = CameraEventCallbacks.createEmptyCallback();
        this.mConfiguredSurfaceMap = new HashMap();
        this.mConfiguredDeferrableSurfaces = Collections.emptyList();
        this.mState = State.UNINITIALIZED;
        this.mStillCaptureFlow = new StillCaptureFlow();
        this.mState = State.INITIALIZED;
        this.mCaptureSessionStateCallback = new StateCallback();
    }

    private CameraCaptureSession.CaptureCallback createCamera2CaptureCallback(List<CameraCaptureCallback> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (CameraCaptureCallback captureCallback : list) {
            arrayList.add(CaptureCallbackConverter.toCaptureCallback(captureCallback));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return Camera2CaptureCallbacks.createComboCallback((List<CameraCaptureSession.CaptureCallback>) arrayList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$issueBurstCaptureRequest$2(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.mSessionLock) {
            if (this.mState == State.OPENED) {
                issueRepeatingCaptureRequests(this.mSessionConfig);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$release$1(C117512b.C117513a aVar) {
        String str;
        synchronized (this.mSessionLock) {
            C20434g.m22021e(this.mReleaseCompleter == null, "Release completer expected to be null");
            this.mReleaseCompleter = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    private static Config mergeOptions(List<CaptureConfig> list) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        for (CaptureConfig implementationOptions : list) {
            Config implementationOptions2 = implementationOptions.getImplementationOptions();
            for (Config.Option next : implementationOptions2.listOptions()) {
                Object retrieveOption = implementationOptions2.retrieveOption(next, null);
                if (create.containsOption(next)) {
                    Object retrieveOption2 = create.retrieveOption(next, null);
                    if (!Objects.equals(retrieveOption2, retrieveOption)) {
                        Logger.m15471d(TAG, "Detect conflicting option " + next.getId() + " : " + retrieveOption + " != " + retrieveOption2);
                    }
                } else {
                    create.insertOption(next, retrieveOption);
                }
            }
        }
        return create;
    }

    /* access modifiers changed from: private */
    /* renamed from: openCaptureSession */
    public C112608f<Void> lambda$open$0(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.mSessionLock) {
            int i = C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()];
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    this.mConfiguredSurfaceMap.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.mConfiguredSurfaceMap.put(this.mConfiguredDeferrableSurfaces.get(i2), list.get(i2));
                    }
                    ArrayList arrayList = new ArrayList(new LinkedHashSet(list));
                    this.mState = State.OPENING;
                    Logger.m15471d(TAG, "Opening capture session.");
                    SynchronizedCaptureSession.StateCallback createComboCallback = SynchronizedCaptureSessionStateCallbacks.createComboCallback(this.mCaptureSessionStateCallback, new SynchronizedCaptureSessionStateCallbacks.Adapter(sessionConfig.getSessionStateCallbacks()));
                    Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(sessionConfig.getImplementationOptions());
                    CameraEventCallbacks cameraEventCallback = camera2ImplConfig.getCameraEventCallback(CameraEventCallbacks.createEmptyCallback());
                    this.mCameraEventCallbacks = cameraEventCallback;
                    List<CaptureConfig> onPresetSession = cameraEventCallback.createComboCallback().onPresetSession();
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(sessionConfig.getRepeatingCaptureConfig());
                    for (CaptureConfig implementationOptions : onPresetSession) {
                        from.addImplementationOptions(implementationOptions.getImplementationOptions());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        OutputConfigurationCompat outputConfigurationCompat = new OutputConfigurationCompat((Surface) it.next());
                        outputConfigurationCompat.setPhysicalCameraId(camera2ImplConfig.getPhysicalCameraId((String) null));
                        arrayList2.add(outputConfigurationCompat);
                    }
                    SessionConfigurationCompat createSessionConfigurationCompat = this.mSynchronizedCaptureSessionOpener.createSessionConfigurationCompat(0, arrayList2, createComboCallback);
                    try {
                        CaptureRequest buildWithoutTarget = Camera2CaptureRequestBuilder.buildWithoutTarget(from.build(), cameraDevice);
                        if (buildWithoutTarget != null) {
                            createSessionConfigurationCompat.setSessionParameters(buildWithoutTarget);
                        }
                        C112608f<Void> openCaptureSession = this.mSynchronizedCaptureSessionOpener.openCaptureSession(cameraDevice, createSessionConfigurationCompat, this.mConfiguredDeferrableSurfaces);
                        return openCaptureSession;
                    } catch (CameraAccessException e) {
                        return Futures.immediateFailedFuture(e);
                    }
                } else if (i != 5) {
                    C112608f<Void> immediateFailedFuture = Futures.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.mState));
                    return immediateFailedFuture;
                }
            }
            C112608f<Void> immediateFailedFuture2 = Futures.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.mState));
            return immediateFailedFuture2;
        }
    }

    public void abortCaptures() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.m15473e(TAG, "Unable to abort captures. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.abortCaptures();
            } catch (CameraAccessException e) {
                Logger.m15474e(TAG, "Unable to abort captures.", e);
            }
        }
    }

    public void cancelIssuedCaptureRequests() {
        ArrayList<CaptureConfig> arrayList;
        synchronized (this.mSessionLock) {
            if (!this.mCaptureConfigs.isEmpty()) {
                arrayList = new ArrayList<>(this.mCaptureConfigs);
                this.mCaptureConfigs.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (CaptureConfig cameraCaptureCallbacks : arrayList) {
                for (CameraCaptureCallback onCaptureCancelled : cameraCaptureCallbacks.getCameraCaptureCallbacks()) {
                    onCaptureCancelled.onCaptureCancelled();
                }
            }
        }
    }

    public void close() {
        synchronized (this.mSessionLock) {
            int i = C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.mSessionConfig != null) {
                                    List<CaptureConfig> onDisableSession = this.mCameraEventCallbacks.createComboCallback().onDisableSession();
                                    if (!onDisableSession.isEmpty()) {
                                        try {
                                            issueCaptureRequests(setupConfiguredSurface(onDisableSession));
                                        } catch (IllegalStateException e) {
                                            Logger.m15474e(TAG, "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener = this.mSynchronizedCaptureSessionOpener;
                        C20434g.m22020d(synchronizedCaptureSessionOpener, "The Opener shouldn't null in state:" + this.mState);
                        this.mSynchronizedCaptureSessionOpener.stop();
                        this.mState = State.CLOSED;
                        this.mSessionConfig = null;
                    } else {
                        SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener2 = this.mSynchronizedCaptureSessionOpener;
                        C20434g.m22020d(synchronizedCaptureSessionOpener2, "The Opener shouldn't null in state:" + this.mState);
                        this.mSynchronizedCaptureSessionOpener.stop();
                    }
                }
                this.mState = State.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.mState);
            }
        }
    }

    public void finishClose() {
        State state = this.mState;
        State state2 = State.RELEASED;
        if (state == state2) {
            Logger.m15471d(TAG, "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.mState = state2;
        this.mSynchronizedCaptureSession = null;
        C117512b.C117513a<Void> aVar = this.mReleaseCompleter;
        if (aVar != null) {
            aVar.mo182231a(null);
            this.mReleaseCompleter = null;
        }
    }

    public List<CaptureConfig> getCaptureConfigs() {
        List<CaptureConfig> unmodifiableList;
        synchronized (this.mSessionLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCaptureConfigs);
        }
        return unmodifiableList;
    }

    public SessionConfig getSessionConfig() {
        SessionConfig sessionConfig;
        synchronized (this.mSessionLock) {
            sessionConfig = this.mSessionConfig;
        }
        return sessionConfig;
    }

    public State getState() {
        State state;
        synchronized (this.mSessionLock) {
            state = this.mState;
        }
        return state;
    }

    public int issueBurstCaptureRequest(List<CaptureConfig> list) {
        boolean z;
        synchronized (this.mSessionLock) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                CameraBurstCaptureCallback cameraBurstCaptureCallback = new CameraBurstCaptureCallback();
                ArrayList arrayList = new ArrayList();
                Logger.m15471d(TAG, "Issuing capture request.");
                boolean z2 = false;
                for (CaptureConfig next : list) {
                    if (next.getSurfaces().isEmpty()) {
                        Logger.m15471d(TAG, "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it = next.getSurfaces().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            }
                            DeferrableSurface next2 = it.next();
                            if (!this.mConfiguredSurfaceMap.containsKey(next2)) {
                                Logger.m15471d(TAG, "Skipping capture request with invalid surface: " + next2);
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            if (next.getTemplateType() == 2) {
                                z2 = true;
                            }
                            CaptureConfig.Builder from = CaptureConfig.Builder.from(next);
                            if (next.getTemplateType() == 5 && next.getCameraCaptureResult() != null) {
                                from.setCameraCaptureResult(next.getCameraCaptureResult());
                            }
                            SessionConfig sessionConfig = this.mSessionConfig;
                            if (sessionConfig != null) {
                                from.addImplementationOptions(sessionConfig.getRepeatingCaptureConfig().getImplementationOptions());
                            }
                            from.addImplementationOptions(this.mCameraEventOnRepeatingOptions);
                            from.addImplementationOptions(next.getImplementationOptions());
                            CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                            if (build == null) {
                                Logger.m15471d(TAG, "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (CameraCaptureCallback captureCallback : next.getCameraCaptureCallbacks()) {
                                CaptureCallbackConverter.toCaptureCallback(captureCallback, arrayList2);
                            }
                            cameraBurstCaptureCallback.addCamera2Callbacks(build, arrayList2);
                            arrayList.add(build);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (this.mStillCaptureFlow.shouldStopRepeatingBeforeCapture(arrayList, z2)) {
                        this.mSynchronizedCaptureSession.stopRepeating();
                        cameraBurstCaptureCallback.setCaptureSequenceCallback(new CaptureSession$$a(this));
                    }
                    int captureBurstRequests = this.mSynchronizedCaptureSession.captureBurstRequests(arrayList, cameraBurstCaptureCallback);
                    return captureBurstRequests;
                }
                Logger.m15471d(TAG, "Skipping issuing burst request due to no valid request elements");
            } catch (CameraAccessException e) {
                Logger.m15473e(TAG, "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
        }
        return -1;
    }

    public void issueCaptureRequests(List<CaptureConfig> list) {
        synchronized (this.mSessionLock) {
            switch (C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.mState);
                case 2:
                case 3:
                case 4:
                    this.mCaptureConfigs.addAll(list);
                    break;
                case 5:
                    this.mCaptureConfigs.addAll(list);
                    issuePendingCaptureRequest();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    public void issuePendingCaptureRequest() {
        if (!this.mCaptureConfigs.isEmpty()) {
            try {
                issueBurstCaptureRequest(this.mCaptureConfigs);
            } finally {
                this.mCaptureConfigs.clear();
            }
        }
    }

    public int issueRepeatingCaptureRequests(SessionConfig sessionConfig) {
        synchronized (this.mSessionLock) {
            if (sessionConfig == null) {
                Logger.m15471d(TAG, "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                Logger.m15471d(TAG, "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.mSynchronizedCaptureSession.stopRepeating();
                } catch (CameraAccessException e) {
                    Logger.m15473e(TAG, "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
            } else {
                try {
                    Logger.m15471d(TAG, "Issuing request for session.");
                    CaptureConfig.Builder from = CaptureConfig.Builder.from(repeatingCaptureConfig);
                    Config mergeOptions = mergeOptions(this.mCameraEventCallbacks.createComboCallback().onRepeating());
                    this.mCameraEventOnRepeatingOptions = mergeOptions;
                    from.addImplementationOptions(mergeOptions);
                    CaptureRequest build = Camera2CaptureRequestBuilder.build(from.build(), this.mSynchronizedCaptureSession.getDevice(), this.mConfiguredSurfaceMap);
                    if (build == null) {
                        Logger.m15471d(TAG, "Skipping issuing empty request for session.");
                        return -1;
                    }
                    int singleRepeatingRequest = this.mSynchronizedCaptureSession.setSingleRepeatingRequest(build, createCamera2CaptureCallback(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.mCaptureCallback));
                    return singleRepeatingRequest;
                } catch (CameraAccessException e2) {
                    Logger.m15473e(TAG, "Unable to access camera: " + e2.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
            }
        }
        return -1;
    }

    public C112608f<Void> open(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener) {
        synchronized (this.mSessionLock) {
            if (C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[this.mState.ordinal()] != 2) {
                Logger.m15473e(TAG, "Open not allowed in state: " + this.mState);
                C112608f<Void> immediateFailedFuture = Futures.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.mState));
                return immediateFailedFuture;
            }
            this.mState = State.GET_SURFACE;
            ArrayList arrayList = new ArrayList(sessionConfig.getSurfaces());
            this.mConfiguredDeferrableSurfaces = arrayList;
            this.mSynchronizedCaptureSessionOpener = synchronizedCaptureSessionOpener;
            FutureChain<T> transformAsync = FutureChain.from(synchronizedCaptureSessionOpener.startWithDeferrableSurface(arrayList, 5000)).transformAsync(new CaptureSession$$b(this, sessionConfig, cameraDevice), this.mSynchronizedCaptureSessionOpener.getExecutor());
            Futures.addCallback(transformAsync, new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    synchronized (CaptureSession.this.mSessionLock) {
                        CaptureSession.this.mSynchronizedCaptureSessionOpener.stop();
                        int i = C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State[CaptureSession.this.mState.ordinal()];
                        if (i == 4 || i == 6 || i == 7) {
                            if (!(th instanceof CancellationException)) {
                                Logger.m15478w(CaptureSession.TAG, "Opening session with fail " + CaptureSession.this.mState, th);
                                CaptureSession.this.finishClose();
                            }
                        }
                    }
                }

                public void onSuccess(Void voidR) {
                }
            }, this.mSynchronizedCaptureSessionOpener.getExecutor());
            C112608f<Void> nonCancellationPropagating = Futures.nonCancellationPropagating(transformAsync);
            return nonCancellationPropagating;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r3.mState = androidx.camera.camera2.internal.CaptureSession.State.RELEASING;
        r4 = r3.mSynchronizedCaptureSessionOpener;
        p329d3.C20434g.m22020d(r4, "The Opener shouldn't null in state:" + r3.mState);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r3.mSynchronizedCaptureSessionOpener.stop() == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        finishClose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r3.mReleaseFuture != null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r3.mReleaseFuture = p202m2.C117512b.m165760a(new androidx.camera.camera2.internal.CaptureSession$$c(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r4 = r3.mReleaseFuture;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r3.mState = androidx.camera.camera2.internal.CaptureSession.State.RELEASED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1167z8.C112608f<java.lang.Void> release(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x00a6 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x00a6 }
            r1 = r1[r2]     // Catch:{ all -> 0x00a6 }
            switch(r1) {
                case 1: goto L_0x0086;
                case 2: goto L_0x0081;
                case 3: goto L_0x0064;
                case 4: goto L_0x0029;
                case 5: goto L_0x0012;
                case 6: goto L_0x0012;
                case 7: goto L_0x0051;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x00a6 }
        L_0x0010:
            goto L_0x009f
        L_0x0012:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r1 = r3.mSynchronizedCaptureSession     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0024
            r1.abortCaptures()     // Catch:{ CameraAccessException -> 0x001c }
            goto L_0x0024
        L_0x001c:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.Logger.m15474e(r1, r2, r4)     // Catch:{ all -> 0x00a6 }
        L_0x0024:
            androidx.camera.camera2.internal.SynchronizedCaptureSession r4 = r3.mSynchronizedCaptureSession     // Catch:{ all -> 0x00a6 }
            r4.close()     // Catch:{ all -> 0x00a6 }
        L_0x0029:
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASING     // Catch:{ all -> 0x00a6 }
            r3.mState = r4     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            p329d3.C20434g.m22020d(r4, r1)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a6 }
            boolean r4 = r4.stop()     // Catch:{ all -> 0x00a6 }
            if (r4 == 0) goto L_0x0051
            r3.finishClose()     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x0051:
            z8.f<java.lang.Void> r4 = r3.mReleaseFuture     // Catch:{ all -> 0x00a6 }
            if (r4 != 0) goto L_0x0060
            androidx.camera.camera2.internal.CaptureSession$$c r4 = new androidx.camera.camera2.internal.CaptureSession$$c     // Catch:{ all -> 0x00a6 }
            r4.<init>(r3)     // Catch:{ all -> 0x00a6 }
            z8.f r4 = p202m2.C117512b.m165760a(r4)     // Catch:{ all -> 0x00a6 }
            r3.mReleaseFuture = r4     // Catch:{ all -> 0x00a6 }
        L_0x0060:
            z8.f<java.lang.Void> r4 = r3.mReleaseFuture     // Catch:{ all -> 0x00a6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            return r4
        L_0x0064:
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            p329d3.C20434g.m22020d(r4, r1)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener r4 = r3.mSynchronizedCaptureSessionOpener     // Catch:{ all -> 0x00a6 }
            r4.stop()     // Catch:{ all -> 0x00a6 }
        L_0x0081:
            androidx.camera.camera2.internal.CaptureSession$State r4 = androidx.camera.camera2.internal.CaptureSession.State.RELEASED     // Catch:{ all -> 0x00a6 }
            r3.mState = r4     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x0086:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a6 }
            r1.<init>()     // Catch:{ all -> 0x00a6 }
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x00a6 }
            r1.append(r2)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00a6 }
            r4.<init>(r1)     // Catch:{ all -> 0x00a6 }
            throw r4     // Catch:{ all -> 0x00a6 }
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            r4 = 0
            z8.f r4 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r4)
            return r4
        L_0x00a6:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a6 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.release(boolean):z8.f");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSessionConfig(androidx.camera.core.impl.SessionConfig r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mSessionLock
            monitor-enter(r0)
            int[] r1 = androidx.camera.camera2.internal.CaptureSession.C164783.$SwitchMap$androidx$camera$camera2$internal$CaptureSession$State     // Catch:{ all -> 0x0064 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x0064 }
            int r2 = r2.ordinal()     // Catch:{ all -> 0x0064 }
            r1 = r1[r2]     // Catch:{ all -> 0x0064 }
            switch(r1) {
                case 1: goto L_0x0048;
                case 2: goto L_0x0045;
                case 3: goto L_0x0045;
                case 4: goto L_0x0045;
                case 5: goto L_0x0019;
                case 6: goto L_0x0011;
                case 7: goto L_0x0011;
                case 8: goto L_0x0011;
                default: goto L_0x0010;
            }     // Catch:{ all -> 0x0064 }
        L_0x0010:
            goto L_0x0062
        L_0x0011:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0019:
            r3.mSessionConfig = r4     // Catch:{ all -> 0x0064 }
            if (r4 != 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x001f:
            java.util.Map<androidx.camera.core.impl.DeferrableSurface, android.view.Surface> r1 = r3.mConfiguredSurfaceMap     // Catch:{ all -> 0x0064 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0064 }
            java.util.List r4 = r4.getSurfaces()     // Catch:{ all -> 0x0064 }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x0064 }
            if (r4 != 0) goto L_0x0038
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Does not have the proper configured lists"
            androidx.camera.core.Logger.m15473e(r4, r1)     // Catch:{ all -> 0x0064 }
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0038:
            java.lang.String r4 = "CaptureSession"
            java.lang.String r1 = "Attempting to submit CaptureRequest after setting"
            androidx.camera.core.Logger.m15471d(r4, r1)     // Catch:{ all -> 0x0064 }
            androidx.camera.core.impl.SessionConfig r4 = r3.mSessionConfig     // Catch:{ all -> 0x0064 }
            r3.issueRepeatingCaptureRequests(r4)     // Catch:{ all -> 0x0064 }
            goto L_0x0062
        L_0x0045:
            r3.mSessionConfig = r4     // Catch:{ all -> 0x0064 }
            goto L_0x0062
        L_0x0048:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r1.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x0064 }
            androidx.camera.camera2.internal.CaptureSession$State r2 = r3.mState     // Catch:{ all -> 0x0064 }
            r1.append(r2)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0064 }
            r4.<init>(r1)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            return
        L_0x0064:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0064 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.CaptureSession.setSessionConfig(androidx.camera.core.impl.SessionConfig):void");
    }

    public List<CaptureConfig> setupConfiguredSurface(List<CaptureConfig> list) {
        ArrayList arrayList = new ArrayList();
        for (CaptureConfig from : list) {
            CaptureConfig.Builder from2 = CaptureConfig.Builder.from(from);
            from2.setTemplateType(1);
            for (DeferrableSurface addSurface : this.mSessionConfig.getRepeatingCaptureConfig().getSurfaces()) {
                from2.addSurface(addSurface);
            }
            arrayList.add(from2.build());
        }
        return arrayList;
    }

    public void stopRepeating() {
        synchronized (this.mSessionLock) {
            if (this.mState != State.OPENED) {
                Logger.m15473e(TAG, "Unable to stop repeating. Incorrect state:" + this.mState);
                return;
            }
            try {
                this.mSynchronizedCaptureSession.stopRepeating();
            } catch (CameraAccessException e) {
                Logger.m15474e(TAG, "Unable to stop repeating.", e);
            }
        }
    }
}
