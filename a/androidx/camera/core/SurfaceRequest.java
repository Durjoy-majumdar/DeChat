package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p1167z8.C112608f;
import p202m2.C117512b;
import p202m2.C117518e;
import p329d3.C20434g;
import p329d3.C86165a;

public final class SurfaceRequest {
    private final CameraInternal mCamera;
    private final DeferrableSurface mInternalDeferrableSurface;
    private final Object mLock = new Object();
    private final boolean mRGBA8888Required;
    private final C117512b.C117513a<Void> mRequestCancellationCompleter;
    private final Size mResolution;
    private final C112608f<Void> mSessionStatusFuture;
    private final C117512b.C117513a<Surface> mSurfaceCompleter;
    public final C112608f<Surface> mSurfaceFuture;
    private TransformationInfo mTransformationInfo;
    private Executor mTransformationInfoExecutor;
    private TransformationInfoListener mTransformationInfoListener;

    public static final class RequestCancelledException extends RuntimeException {
        public RequestCancelledException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class Result {
        public static final int RESULT_INVALID_SURFACE = 2;
        public static final int RESULT_REQUEST_CANCELLED = 1;
        public static final int RESULT_SURFACE_ALREADY_PROVIDED = 3;
        public static final int RESULT_SURFACE_USED_SUCCESSFULLY = 0;
        public static final int RESULT_WILL_NOT_PROVIDE_SURFACE = 4;

        @Retention(RetentionPolicy.SOURCE)
        public @interface ResultCode {
        }

        /* renamed from: of */
        public static Result m15500of(int i, Surface surface) {
            return new AutoValue_SurfaceRequest_Result(i, surface);
        }

        public abstract int getResultCode();

        public abstract Surface getSurface();
    }

    public static abstract class TransformationInfo {
        /* renamed from: of */
        public static TransformationInfo m15501of(Rect rect, int i, int i2) {
            return new AutoValue_SurfaceRequest_TransformationInfo(rect, i, i2);
        }

        public abstract Rect getCropRect();

        public abstract int getRotationDegrees();

        public abstract int getTargetRotation();
    }

    public interface TransformationInfoListener {
        void onTransformationInfoUpdate(TransformationInfo transformationInfo);
    }

    public SurfaceRequest(Size size, CameraInternal cameraInternal, boolean z) {
        this.mResolution = size;
        this.mCamera = cameraInternal;
        this.mRGBA8888Required = z;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        final C112608f a = C117512b.m165760a(new SurfaceRequest$$c(atomicReference, str));
        final C117512b.C117513a<Void> aVar = (C117512b.C117513a) atomicReference.get();
        aVar.getClass();
        this.mRequestCancellationCompleter = aVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        C112608f<Void> a2 = C117512b.m165760a(new SurfaceRequest$$d(atomicReference2, str));
        this.mSessionStatusFuture = a2;
        Futures.addCallback(a2, new FutureCallback<Void>() {
            public void onFailure(Throwable th) {
                if (th instanceof RequestCancelledException) {
                    C20434g.m22021e(a.cancel(false), (String) null);
                } else {
                    C20434g.m22021e(aVar.mo182231a(null), (String) null);
                }
            }

            public void onSuccess(Void voidR) {
                C20434g.m22021e(aVar.mo182231a(null), (String) null);
            }
        }, CameraXExecutors.directExecutor());
        final C117512b.C117513a aVar2 = (C117512b.C117513a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        C112608f<Surface> a3 = C117512b.m165760a(new SurfaceRequest$$e(atomicReference3, str));
        this.mSurfaceFuture = a3;
        C117512b.C117513a<Surface> aVar3 = (C117512b.C117513a) atomicReference3.get();
        aVar3.getClass();
        this.mSurfaceCompleter = aVar3;
        C165182 r1 = new DeferrableSurface(size, 34) {
            public C112608f<Surface> provideSurface() {
                return SurfaceRequest.this.mSurfaceFuture;
            }
        };
        this.mInternalDeferrableSurface = r1;
        final C112608f<Void> terminationFuture = r1.getTerminationFuture();
        Futures.addCallback(a3, new FutureCallback<Surface>() {
            public void onFailure(Throwable th) {
                if (th instanceof CancellationException) {
                    C117512b.C117513a aVar = aVar2;
                    C20434g.m22021e(aVar.mo182232b(new RequestCancelledException(str + " cancelled.", th)), (String) null);
                    return;
                }
                aVar2.mo182231a(null);
            }

            public void onSuccess(Surface surface) {
                Futures.propagate(terminationFuture, aVar2);
            }
        }, CameraXExecutors.directExecutor());
        terminationFuture.addListener(new SurfaceRequest$$f(this), CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$3() {
        this.mSurfaceFuture.cancel(true);
    }

    public void addRequestCancellationListener(Executor executor, Runnable runnable) {
        C117518e<Void> eVar = this.mRequestCancellationCompleter.f351636c;
        if (eVar != null) {
            eVar.addListener(runnable, executor);
        }
    }

    public void clearTransformationInfoListener() {
        synchronized (this.mLock) {
            this.mTransformationInfoListener = null;
            this.mTransformationInfoExecutor = null;
        }
    }

    public CameraInternal getCamera() {
        return this.mCamera;
    }

    public DeferrableSurface getDeferrableSurface() {
        return this.mInternalDeferrableSurface;
    }

    public Size getResolution() {
        return this.mResolution;
    }

    public boolean isRGBA8888Required() {
        return this.mRGBA8888Required;
    }

    public void provideSurface(final Surface surface, Executor executor, final C86165a<Result> aVar) {
        if (this.mSurfaceCompleter.mo182231a(surface) || this.mSurfaceFuture.isCancelled()) {
            Futures.addCallback(this.mSessionStatusFuture, new FutureCallback<Void>() {
                public void onFailure(Throwable th) {
                    C20434g.m22021e(th instanceof RequestCancelledException, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
                    aVar.accept(Result.m15500of(1, surface));
                }

                public void onSuccess(Void voidR) {
                    aVar.accept(Result.m15500of(0, surface));
                }
            }, executor);
            return;
        }
        C20434g.m22021e(this.mSurfaceFuture.isDone(), (String) null);
        try {
            this.mSurfaceFuture.get();
            executor.execute(new SurfaceRequest$$a(aVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new SurfaceRequest$$b(aVar, surface));
        }
    }

    public void setTransformationInfoListener(Executor executor, TransformationInfoListener transformationInfoListener) {
        TransformationInfo transformationInfo;
        synchronized (this.mLock) {
            this.mTransformationInfoListener = transformationInfoListener;
            this.mTransformationInfoExecutor = executor;
            transformationInfo = this.mTransformationInfo;
        }
        if (transformationInfo != null) {
            executor.execute(new SurfaceRequest$$g(transformationInfoListener, transformationInfo));
        }
    }

    public void updateTransformationInfo(TransformationInfo transformationInfo) {
        TransformationInfoListener transformationInfoListener;
        Executor executor;
        synchronized (this.mLock) {
            this.mTransformationInfo = transformationInfo;
            transformationInfoListener = this.mTransformationInfoListener;
            executor = this.mTransformationInfoExecutor;
        }
        if (transformationInfoListener != null && executor != null) {
            executor.execute(new SurfaceRequest$$h(transformationInfoListener, transformationInfo));
        }
    }

    public boolean willNotProvideSurface() {
        return this.mSurfaceCompleter.mo182232b(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}
