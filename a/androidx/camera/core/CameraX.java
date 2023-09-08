package androidx.camera.core;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.impl.C16539j;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.CameraThreadConfig;
import androidx.camera.core.impl.CameraValidator;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;
import p834a3.C103298d;

public final class CameraX {
    private static final Object MIN_LOG_LEVEL_LOCK = new Object();
    private static final long RETRY_SLEEP_MILLIS = 500;
    private static final String RETRY_TOKEN = "retry_token";
    private static final String TAG = "CameraX";
    private static final long WAIT_INITIALIZED_TIMEOUT_MILLIS = 3000;
    private static final SparseArray<Integer> sMinLogLevelReferenceCountMap = new SparseArray<>();
    private Context mAppContext;
    private final Executor mCameraExecutor;
    private CameraFactory mCameraFactory;
    public final CameraRepository mCameraRepository = new CameraRepository();
    private final CameraXConfig mCameraXConfig;
    private UseCaseConfigFactory mDefaultConfigFactory;
    private final C112608f<Void> mInitInternalFuture;
    private InternalInitState mInitState = InternalInitState.UNINITIALIZED;
    private final Object mInitializeLock = new Object();
    private final Integer mMinLogLevel;
    private final Handler mSchedulerHandler;
    private final HandlerThread mSchedulerThread;
    private C112608f<Void> mShutdownInternalFuture = Futures.immediateFuture(null);
    private CameraDeviceSurfaceManager mSurfaceManager;

    /* renamed from: androidx.camera.core.CameraX$1 */
    public static /* synthetic */ class C164941 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$CameraX$InternalInitState;

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
                androidx.camera.core.CameraX$InternalInitState[] r0 = androidx.camera.core.CameraX.InternalInitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$CameraX$InternalInitState = r0
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZING_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$androidx$camera$core$CameraX$InternalInitState     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.core.CameraX$InternalInitState r1 = androidx.camera.core.CameraX.InternalInitState.SHUTDOWN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.CameraX.C164941.<clinit>():void");
        }
    }

    public enum InternalInitState {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public CameraX(Context context, CameraXConfig.Provider provider) {
        if (provider != null) {
            this.mCameraXConfig = provider.getCameraXConfig();
        } else {
            CameraXConfig.Provider configProvider = getConfigProvider(context);
            if (configProvider != null) {
                this.mCameraXConfig = configProvider.getCameraXConfig();
            } else {
                throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            }
        }
        Executor cameraExecutor = this.mCameraXConfig.getCameraExecutor((Executor) null);
        Handler schedulerHandler = this.mCameraXConfig.getSchedulerHandler((Handler) null);
        this.mCameraExecutor = cameraExecutor == null ? new CameraExecutor() : cameraExecutor;
        if (schedulerHandler == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.mSchedulerThread = handlerThread;
            handlerThread.start();
            this.mSchedulerHandler = C103298d.m136811a(handlerThread.getLooper());
        } else {
            this.mSchedulerThread = null;
            this.mSchedulerHandler = schedulerHandler;
        }
        CameraXConfig cameraXConfig = this.mCameraXConfig;
        Config.Option<Integer> option = CameraXConfig.OPTION_MIN_LOGGING_LEVEL;
        cameraXConfig.getClass();
        Integer num = (Integer) C16539j.m15576g(cameraXConfig, option, (Object) null);
        this.mMinLogLevel = num;
        increaseMinLogLevelReference(num);
        this.mInitInternalFuture = initInternal(context);
    }

    private static void decreaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num != null) {
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                int intValue = sparseArray.get(num.intValue()).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                updateOrResetMinLogLevel();
            }
        }
    }

    private static CameraXConfig.Provider getConfigProvider(Context context) {
        Application applicationFromContext = ContextUtil.getApplicationFromContext(context);
        if (applicationFromContext instanceof CameraXConfig.Provider) {
            return (CameraXConfig.Provider) applicationFromContext;
        }
        try {
            Context applicationContext = ContextUtil.getApplicationContext(context);
            Bundle bundle = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (CameraXConfig.Provider) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            Logger.m15473e(TAG, "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            Logger.m15474e(TAG, "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
            return null;
        }
    }

    private static void increaseMinLogLevelReference(Integer num) {
        synchronized (MIN_LOG_LEVEL_LOCK) {
            if (num != null) {
                C20434g.m22019c(num.intValue(), 3, 6, "minLogLevel");
                SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
                int i = 1;
                if (sparseArray.get(num.intValue()) != null) {
                    i = 1 + sparseArray.get(num.intValue()).intValue();
                }
                sparseArray.put(num.intValue(), Integer.valueOf(i));
                updateOrResetMinLogLevel();
            }
        }
    }

    private void initAndRetryRecursively(Executor executor, long j, Context context, C117512b.C117513a<Void> aVar) {
        executor.execute(new CameraX$$d(this, context, executor, aVar, j));
    }

    private C112608f<Void> initInternal(Context context) {
        C112608f<Void> a;
        synchronized (this.mInitializeLock) {
            C20434g.m22021e(this.mInitState == InternalInitState.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.mInitState = InternalInitState.INITIALIZING;
            a = C117512b.m165760a(new CameraX$$e(this, context));
        }
        return a;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$initAndRetryRecursively$1(Executor executor, long j, C117512b.C117513a aVar) {
        initAndRetryRecursively(executor, j, this.mAppContext, aVar);
    }

    /* access modifiers changed from: private */
    public void lambda$initAndRetryRecursively$2(Context context, Executor executor, C117512b.C117513a aVar, long j) {
        try {
            Application applicationFromContext = ContextUtil.getApplicationFromContext(context);
            this.mAppContext = applicationFromContext;
            if (applicationFromContext == null) {
                this.mAppContext = ContextUtil.getApplicationContext(context);
            }
            CameraFactory.Provider cameraFactoryProvider = this.mCameraXConfig.getCameraFactoryProvider((CameraFactory.Provider) null);
            if (cameraFactoryProvider != null) {
                CameraThreadConfig create = CameraThreadConfig.create(this.mCameraExecutor, this.mSchedulerHandler);
                CameraSelector availableCamerasLimiter = this.mCameraXConfig.getAvailableCamerasLimiter((CameraSelector) null);
                this.mCameraFactory = cameraFactoryProvider.newInstance(this.mAppContext, create, availableCamerasLimiter);
                CameraDeviceSurfaceManager.Provider deviceSurfaceManagerProvider = this.mCameraXConfig.getDeviceSurfaceManagerProvider((CameraDeviceSurfaceManager.Provider) null);
                if (deviceSurfaceManagerProvider != null) {
                    this.mSurfaceManager = deviceSurfaceManagerProvider.newInstance(this.mAppContext, this.mCameraFactory.getCameraManager(), this.mCameraFactory.getAvailableCameraIds());
                    UseCaseConfigFactory.Provider useCaseConfigFactoryProvider = this.mCameraXConfig.getUseCaseConfigFactoryProvider((UseCaseConfigFactory.Provider) null);
                    if (useCaseConfigFactoryProvider != null) {
                        this.mDefaultConfigFactory = useCaseConfigFactoryProvider.newInstance(this.mAppContext);
                        if (executor instanceof CameraExecutor) {
                            ((CameraExecutor) executor).init(this.mCameraFactory);
                        }
                        this.mCameraRepository.init(this.mCameraFactory);
                        CameraValidator.validateCameras(this.mAppContext, this.mCameraRepository, availableCamerasLimiter);
                        setStateToInitialized();
                        aVar.mo182231a(null);
                        return;
                    }
                    throw new InitializationException((Throwable) new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
                }
                throw new InitializationException((Throwable) new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            throw new InitializationException((Throwable) new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
        } catch (InitializationException | CameraValidator.CameraIdListIncorrectException | RuntimeException e) {
            if (SystemClock.elapsedRealtime() - j < 2500) {
                Logger.m15478w(TAG, "Retry init. Start time " + j + " current time " + SystemClock.elapsedRealtime(), e);
                Handler handler = this.mSchedulerHandler;
                CameraX$$b cameraX$$b = new CameraX$$b(this, executor, j, aVar);
                if (Build.VERSION.SDK_INT >= 28) {
                    C103298d.C103299a.m136813b(handler, cameraX$$b, RETRY_TOKEN, 500);
                    return;
                }
                Message obtain = Message.obtain(handler, cameraX$$b);
                obtain.obj = RETRY_TOKEN;
                handler.sendMessageDelayed(obtain, 500);
                return;
            }
            synchronized (this.mInitializeLock) {
                this.mInitState = InternalInitState.INITIALIZING_ERROR;
                if (e instanceof CameraValidator.CameraIdListIncorrectException) {
                    Logger.m15473e(TAG, "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                    aVar.mo182231a(null);
                } else if (e instanceof InitializationException) {
                    aVar.mo182232b(e);
                } else {
                    aVar.mo182232b(new InitializationException(e));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$initInternal$0(Context context, C117512b.C117513a aVar) {
        initAndRetryRecursively(this.mCameraExecutor, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$shutdownInternal$3(C117512b.C117513a aVar) {
        if (this.mSchedulerThread != null) {
            Executor executor = this.mCameraExecutor;
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).deinit();
            }
            this.mSchedulerThread.quit();
        }
        aVar.mo182231a(null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$shutdownInternal$4(C117512b.C117513a aVar) {
        this.mCameraRepository.deinit().addListener(new CameraX$$c(this, aVar), this.mCameraExecutor);
        return "CameraX shutdownInternal";
    }

    private void setStateToInitialized() {
        synchronized (this.mInitializeLock) {
            this.mInitState = InternalInitState.INITIALIZED;
        }
    }

    private C112608f<Void> shutdownInternal() {
        synchronized (this.mInitializeLock) {
            this.mSchedulerHandler.removeCallbacksAndMessages(RETRY_TOKEN);
            int i = C164941.$SwitchMap$androidx$camera$core$CameraX$InternalInitState[this.mInitState.ordinal()];
            if (i == 1) {
                this.mInitState = InternalInitState.SHUTDOWN;
                C112608f<Void> immediateFuture = Futures.immediateFuture(null);
                return immediateFuture;
            } else if (i != 2) {
                if (i == 3 || i == 4) {
                    this.mInitState = InternalInitState.SHUTDOWN;
                    decreaseMinLogLevelReference(this.mMinLogLevel);
                    this.mShutdownInternalFuture = C117512b.m165760a(new CameraX$$a(this));
                }
                C112608f<Void> fVar = this.mShutdownInternalFuture;
                return fVar;
            } else {
                throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
            }
        }
    }

    private static void updateOrResetMinLogLevel() {
        SparseArray<Integer> sparseArray = sMinLogLevelReferenceCountMap;
        if (sparseArray.size() == 0) {
            Logger.resetMinLogLevel();
        } else if (sparseArray.get(3) != null) {
            Logger.setMinLogLevel(3);
        } else if (sparseArray.get(4) != null) {
            Logger.setMinLogLevel(4);
        } else if (sparseArray.get(5) != null) {
            Logger.setMinLogLevel(5);
        } else if (sparseArray.get(6) != null) {
            Logger.setMinLogLevel(6);
        }
    }

    public CameraDeviceSurfaceManager getCameraDeviceSurfaceManager() {
        CameraDeviceSurfaceManager cameraDeviceSurfaceManager = this.mSurfaceManager;
        if (cameraDeviceSurfaceManager != null) {
            return cameraDeviceSurfaceManager;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraFactory getCameraFactory() {
        CameraFactory cameraFactory = this.mCameraFactory;
        if (cameraFactory != null) {
            return cameraFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public CameraRepository getCameraRepository() {
        return this.mCameraRepository;
    }

    public UseCaseConfigFactory getDefaultConfigFactory() {
        UseCaseConfigFactory useCaseConfigFactory = this.mDefaultConfigFactory;
        if (useCaseConfigFactory != null) {
            return useCaseConfigFactory;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public C112608f<Void> getInitializeFuture() {
        return this.mInitInternalFuture;
    }

    public boolean isInitialized() {
        boolean z;
        synchronized (this.mInitializeLock) {
            z = this.mInitState == InternalInitState.INITIALIZED;
        }
        return z;
    }

    public C112608f<Void> shutdown() {
        return shutdownInternal();
    }
}
