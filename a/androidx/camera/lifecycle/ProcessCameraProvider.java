package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraXConfig;
import androidx.camera.core.UseCase;
import androidx.camera.core.UseCaseGroup;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.C0125s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;

public final class ProcessCameraProvider implements LifecycleCameraProvider {
    private static final ProcessCameraProvider sAppInstance = new ProcessCameraProvider();
    private CameraX mCameraX;
    private CameraXConfig.Provider mCameraXConfigProvider = null;
    private C112608f<CameraX> mCameraXInitializeFuture;
    private C112608f<Void> mCameraXShutdownFuture = Futures.immediateFuture(null);
    private Context mContext;
    private final LifecycleCameraRepository mLifecycleCameraRepository = new LifecycleCameraRepository();
    private final Object mLock = new Object();

    private ProcessCameraProvider() {
    }

    public static void configureInstance(CameraXConfig cameraXConfig) {
        sAppInstance.configureInstanceInternal(cameraXConfig);
    }

    private void configureInstanceInternal(CameraXConfig cameraXConfig) {
        synchronized (this.mLock) {
            cameraXConfig.getClass();
            C20434g.m22021e(this.mCameraXConfigProvider == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
            this.mCameraXConfigProvider = new ProcessCameraProvider$$b(cameraXConfig);
        }
    }

    public static C112608f<ProcessCameraProvider> getInstance(Context context) {
        context.getClass();
        return Futures.transform(sAppInstance.getOrCreateCameraXInstance(context), new ProcessCameraProvider$$c(context), CameraXExecutors.directExecutor());
    }

    private C112608f<CameraX> getOrCreateCameraXInstance(Context context) {
        synchronized (this.mLock) {
            C112608f<CameraX> fVar = this.mCameraXInitializeFuture;
            if (fVar != null) {
                return fVar;
            }
            C112608f<CameraX> a = C117512b.m165760a(new ProcessCameraProvider$$d(this, new CameraX(context, this.mCameraXConfigProvider)));
            this.mCameraXInitializeFuture = a;
            return a;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CameraXConfig lambda$configureInstanceInternal$3(CameraXConfig cameraXConfig) {
        return cameraXConfig;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ProcessCameraProvider lambda$getInstance$0(Context context, CameraX cameraX) {
        ProcessCameraProvider processCameraProvider = sAppInstance;
        processCameraProvider.setCameraX(cameraX);
        processCameraProvider.setContext(ContextUtil.getApplicationContext(context));
        return processCameraProvider;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$getOrCreateCameraXInstance$2(final CameraX cameraX, final C117512b.C117513a aVar) {
        synchronized (this.mLock) {
            Futures.addCallback(FutureChain.from(this.mCameraXShutdownFuture).transformAsync(new ProcessCameraProvider$$a(cameraX), CameraXExecutors.directExecutor()), new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    aVar.mo182232b(th);
                }

                public void onSuccess(Void voidR) {
                    aVar.mo182231a(cameraX);
                }
            }, CameraXExecutors.directExecutor());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    private void setCameraX(CameraX cameraX) {
        this.mCameraX = cameraX;
    }

    private void setContext(Context context) {
        this.mContext = context;
    }

    public Camera bindToLifecycle(C0125s sVar, CameraSelector cameraSelector, UseCase... useCaseArr) {
        return bindToLifecycle(sVar, cameraSelector, (ViewPort) null, useCaseArr);
    }

    public List<CameraInfo> getAvailableCameraInfos() {
        ArrayList arrayList = new ArrayList();
        for (CameraInternal cameraInfo : this.mCameraX.getCameraRepository().getCameras()) {
            arrayList.add(cameraInfo.getCameraInfo());
        }
        return arrayList;
    }

    public boolean hasCamera(CameraSelector cameraSelector) {
        try {
            cameraSelector.select(this.mCameraX.getCameraRepository().getCameras());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean isBound(UseCase useCase) {
        for (LifecycleCamera isBound : this.mLifecycleCameraRepository.getLifecycleCameras()) {
            if (isBound.isBound(useCase)) {
                return true;
            }
        }
        return false;
    }

    public C112608f<Void> shutdown() {
        this.mLifecycleCameraRepository.clear();
        CameraX cameraX = this.mCameraX;
        C112608f<Void> shutdown = cameraX != null ? cameraX.shutdown() : Futures.immediateFuture(null);
        synchronized (this.mLock) {
            this.mCameraXConfigProvider = null;
            this.mCameraXInitializeFuture = null;
            this.mCameraXShutdownFuture = shutdown;
        }
        this.mCameraX = null;
        this.mContext = null;
        return shutdown;
    }

    public void unbind(UseCase... useCaseArr) {
        Threads.checkMainThread();
        this.mLifecycleCameraRepository.unbind(Arrays.asList(useCaseArr));
    }

    public void unbindAll() {
        Threads.checkMainThread();
        this.mLifecycleCameraRepository.unbindAll();
    }

    public Camera bindToLifecycle(C0125s sVar, CameraSelector cameraSelector, UseCaseGroup useCaseGroup) {
        return bindToLifecycle(sVar, cameraSelector, useCaseGroup.getViewPort(), (UseCase[]) useCaseGroup.getUseCases().toArray(new UseCase[0]));
    }

    public Camera bindToLifecycle(C0125s sVar, CameraSelector cameraSelector, ViewPort viewPort, UseCase... useCaseArr) {
        CameraConfig cameraConfig;
        CameraConfig config;
        Threads.checkMainThread();
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        int length = useCaseArr.length;
        int i = 0;
        while (true) {
            cameraConfig = null;
            if (i >= length) {
                break;
            }
            CameraSelector cameraSelector2 = useCaseArr[i].getCurrentConfig().getCameraSelector((CameraSelector) null);
            if (cameraSelector2 != null) {
                Iterator<CameraFilter> it = cameraSelector2.getCameraFilterSet().iterator();
                while (it.hasNext()) {
                    fromSelector.addCameraFilter(it.next());
                }
            }
            i++;
        }
        LinkedHashSet<CameraInternal> filter = fromSelector.build().filter(this.mCameraX.getCameraRepository().getCameras());
        if (!filter.isEmpty()) {
            LifecycleCamera lifecycleCamera = this.mLifecycleCameraRepository.getLifecycleCamera(sVar, CameraUseCaseAdapter.generateCameraId(filter));
            Collection<LifecycleCamera> lifecycleCameras = this.mLifecycleCameraRepository.getLifecycleCameras();
            for (UseCase useCase : useCaseArr) {
                for (LifecycleCamera next : lifecycleCameras) {
                    if (next.isBound(useCase) && next != lifecycleCamera) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{useCase}));
                    }
                }
            }
            if (lifecycleCamera == null) {
                lifecycleCamera = this.mLifecycleCameraRepository.createLifecycleCamera(sVar, new CameraUseCaseAdapter(filter, this.mCameraX.getCameraDeviceSurfaceManager(), this.mCameraX.getDefaultConfigFactory()));
            }
            Iterator<CameraFilter> it4 = cameraSelector.getCameraFilterSet().iterator();
            while (it4.hasNext()) {
                CameraFilter next2 = it4.next();
                if (!(next2.getIdentifier() == CameraFilter.DEFAULT_ID || (config = ExtendedCameraConfigProviderStore.getConfigProvider(next2.getIdentifier()).getConfig(lifecycleCamera.getCameraInfo(), this.mContext)) == null)) {
                    if (cameraConfig == null) {
                        cameraConfig = config;
                    } else {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                }
            }
            lifecycleCamera.setExtendedConfig(cameraConfig);
            if (useCaseArr.length == 0) {
                return lifecycleCamera;
            }
            this.mLifecycleCameraRepository.bindToLifecycleCamera(lifecycleCamera, viewPort, Arrays.asList(useCaseArr));
            return lifecycleCamera;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }
}
