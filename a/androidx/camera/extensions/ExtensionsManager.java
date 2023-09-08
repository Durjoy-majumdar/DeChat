package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.camera.extensions.internal.VersionName;
import java.util.concurrent.ExecutionException;
import p1167z8.C112608f;
import p202m2.C117512b;

public final class ExtensionsManager {
    private static final Object EXTENSIONS_LOCK = new Object();
    private static final String TAG = "ExtensionsManager";
    private static C112608f<Void> sDeinitializeFuture;
    private static ExtensionsManager sExtensionsManager;
    private static C112608f<ExtensionsManager> sInitializeFuture;
    private final ExtensionsAvailability mExtensionsAvailability;
    private final ExtensionsInfo mExtensionsInfo;

    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider) {
        this.mExtensionsAvailability = extensionsAvailability;
        this.mExtensionsInfo = new ExtensionsInfo(cameraProvider);
    }

    public static C112608f<ExtensionsManager> getInstanceAsync(Context context, CameraProvider cameraProvider) {
        return getInstanceAsync(context, cameraProvider, VersionName.getCurrentVersion());
    }

    public static ExtensionsManager getOrCreateExtensionsManager(ExtensionsAvailability extensionsAvailability, CameraProvider cameraProvider) {
        synchronized (EXTENSIONS_LOCK) {
            ExtensionsManager extensionsManager = sExtensionsManager;
            if (extensionsManager != null) {
                return extensionsManager;
            }
            ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, cameraProvider);
            sExtensionsManager = extensionsManager2;
            return extensionsManager2;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getInstanceAsync$0(VersionName versionName, Context context, final CameraProvider cameraProvider, final C117512b.C117513a aVar) {
        try {
            InitializerImpl.init(versionName.toVersionString(), ContextUtil.getApplicationContext(context), new InitializerImpl.OnExtensionsInitializedCallback() {
                public void onFailure(int i) {
                    Logger.m15473e(ExtensionsManager.TAG, "Failed to initialize extensions");
                    C117512b.C117513a.this.mo182231a(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
                }

                public void onSuccess() {
                    Logger.m15471d(ExtensionsManager.TAG, "Successfully initialized extensions");
                    C117512b.C117513a.this.mo182231a(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
                }
            }, CameraXExecutors.directExecutor());
            return "Initialize extensions";
        } catch (AbstractMethodError | NoClassDefFoundError | NoSuchMethodError e) {
            Logger.m15473e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            aVar.mo182231a(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (RuntimeException e2) {
            Logger.m15473e(TAG, "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e2);
            aVar.mo182231a(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
            return "Initialize extensions";
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$shutdown$1(final C117512b.C117513a aVar) {
        try {
            InitializerImpl.deinit(new InitializerImpl.OnExtensionsDeinitializedCallback() {
                public void onFailure(int i) {
                    aVar.mo182232b(new Exception("Failed to deinitialize extensions."));
                }

                public void onSuccess() {
                    aVar.mo182231a(null);
                }
            }, CameraXExecutors.directExecutor());
            return null;
        } catch (NoClassDefFoundError | NoSuchMethodError e) {
            aVar.mo182232b(e);
            return null;
        }
    }

    public Range<Long> getEstimatedCaptureLatencyRange(CameraSelector cameraSelector, int i) {
        if (i != 0 && this.mExtensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.mExtensionsInfo.getEstimatedCaptureLatencyRange(cameraSelector, i, (Size) null);
        }
        throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getEstimatedCaptureLatencyRange.");
    }

    public CameraSelector getExtensionEnabledCameraSelector(CameraSelector cameraSelector, int i) {
        if (i == 0) {
            return cameraSelector;
        }
        if (this.mExtensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.mExtensionsInfo.getExtensionCameraSelectorAndInjectCameraConfig(cameraSelector, i);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    public ExtensionsAvailability getExtensionsAvailability() {
        return this.mExtensionsAvailability;
    }

    public boolean isExtensionAvailable(CameraSelector cameraSelector, int i) {
        if (i == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isExtensionAvailable(cameraSelector, i);
    }

    public C112608f<Void> shutdown() {
        synchronized (EXTENSIONS_LOCK) {
            if (ExtensionVersion.getRuntimeVersion() == null) {
                sInitializeFuture = null;
                sExtensionsManager = null;
                C112608f<Void> immediateFuture = Futures.immediateFuture(null);
                return immediateFuture;
            }
            C112608f<ExtensionsManager> fVar = sInitializeFuture;
            if (fVar == null) {
                C112608f<Void> immediateFuture2 = Futures.immediateFuture(null);
                return immediateFuture2;
            }
            C112608f<Void> fVar2 = sDeinitializeFuture;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                fVar.get();
                sInitializeFuture = null;
                ExtensionsAvailability extensionsAvailability = sExtensionsManager.mExtensionsAvailability;
                sExtensionsManager = null;
                if (extensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
                    sDeinitializeFuture = C117512b.m165760a(new ExtensionsManager$$b(this));
                } else {
                    sDeinitializeFuture = Futures.immediateFuture(null);
                }
                C112608f<Void> fVar3 = sDeinitializeFuture;
                return fVar3;
            } catch (ExecutionException e) {
                e = e;
                C112608f<Void> immediateFailedFuture = Futures.immediateFailedFuture(e);
                sDeinitializeFuture = immediateFailedFuture;
                return immediateFailedFuture;
            } catch (InterruptedException e2) {
                e = e2;
                C112608f<Void> immediateFailedFuture2 = Futures.immediateFailedFuture(e);
                sDeinitializeFuture = immediateFailedFuture2;
                return immediateFailedFuture2;
            }
        }
    }

    public static C112608f<ExtensionsManager> getInstanceAsync(Context context, CameraProvider cameraProvider, VersionName versionName) {
        synchronized (EXTENSIONS_LOCK) {
            C112608f<Void> fVar = sDeinitializeFuture;
            if (fVar != null) {
                if (!fVar.isDone()) {
                    throw new IllegalStateException("Not yet done deinitializing extensions");
                }
            }
            sDeinitializeFuture = null;
            if (ExtensionVersion.getRuntimeVersion() == null) {
                C112608f<ExtensionsManager> immediateFuture = Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.NONE, cameraProvider));
                return immediateFuture;
            } else if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) < 0) {
                C112608f<ExtensionsManager> immediateFuture2 = Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
                return immediateFuture2;
            } else {
                if (sInitializeFuture == null) {
                    sInitializeFuture = C117512b.m165760a(new ExtensionsManager$$a(versionName, context, cameraProvider));
                }
                C112608f<ExtensionsManager> fVar2 = sInitializeFuture;
                return fVar2;
            }
        }
    }
}
