package androidx.camera.camera2.interop;

import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.Executor;
import p1167z8.C112608f;
import p202m2.C117512b;
import p329d3.C20434g;
import p378r.a$$a;
import p378r.a$$b;
import p378r.a$$c;
import p378r.a$$d;
import p378r.a$$e;
import p378r.a$$f;
import p378r.a$$g;
import p378r.a$$h;

public final class Camera2CameraControl {
    public static final String TAG_KEY = "Camera2CameraControl";
    private Camera2ImplConfig.Builder mBuilder = new Camera2ImplConfig.Builder();
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new a$$e(this);
    public C117512b.C117513a<Void> mCompleter;
    public final Executor mExecutor;
    private boolean mIsActive = false;
    public final Object mLock = new Object();
    private boolean mPendingUpdate = false;

    public Camera2CameraControl(Camera2CameraControlImpl camera2CameraControlImpl, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
    }

    private void addCaptureRequestOptionsInternal(CaptureRequestOptions captureRequestOptions) {
        synchronized (this.mLock) {
            for (Config.Option option : captureRequestOptions.listOptions()) {
                this.mBuilder.getMutableConfig().insertOption(option, captureRequestOptions.retrieveOption(option));
            }
        }
    }

    private void clearCaptureRequestOptionsInternal() {
        synchronized (this.mLock) {
            this.mBuilder = new Camera2ImplConfig.Builder();
        }
    }

    public static Camera2CameraControl from(CameraControl cameraControl) {
        C20434g.m22018b(cameraControl instanceof Camera2CameraControlImpl, "CameraControl doesn't contain Camera2 implementation.");
        return ((Camera2CameraControlImpl) cameraControl).getCamera2CameraControl();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$addCaptureRequestOptions$4(C117512b.C117513a aVar) {
        this.mExecutor.execute(new a$$a(this, aVar));
        return "addCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$clearCaptureRequestOptions$6(C117512b.C117513a aVar) {
        this.mExecutor.execute(new a$$g(this, aVar));
        return "clearCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ boolean lambda$new$0(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            m2.b$a<java.lang.Void> r0 = r2.mCompleter
            r1 = 0
            if (r0 == 0) goto L_0x0032
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.TagBundle
            if (r0 == 0) goto L_0x0032
            androidx.camera.core.impl.TagBundle r3 = (androidx.camera.core.impl.TagBundle) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.getTag(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L_0x0032
            m2.b$a<java.lang.Void> r0 = r2.mCompleter
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            m2.b$a<java.lang.Void> r3 = r2.mCompleter
            r2.mCompleter = r1
            goto L_0x0033
        L_0x0032:
            r3 = r1
        L_0x0033:
            if (r3 == 0) goto L_0x0038
            r3.mo182231a(r1)
        L_0x0038:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.interop.Camera2CameraControl.lambda$new$0(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$setCaptureRequestOptions$2(C117512b.C117513a aVar) {
        this.mExecutor.execute(new a$$h(this, aVar));
        return "setCaptureRequestOptions";
    }

    /* access modifiers changed from: private */
    /* renamed from: setActiveInternal */
    public void lambda$setActive$7(boolean z) {
        if (this.mIsActive != z) {
            this.mIsActive = z;
            if (!z) {
                C117512b.C117513a<Void> aVar = this.mCompleter;
                if (aVar != null) {
                    aVar.mo182232b(new CameraControl.OperationCanceledException("The camera control has became inactive."));
                    this.mCompleter = null;
                }
            } else if (this.mPendingUpdate) {
                updateSession();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: updateConfig */
    public void lambda$setCaptureRequestOptions$1(C117512b.C117513a<Void> aVar) {
        this.mPendingUpdate = true;
        C117512b.C117513a<Void> aVar2 = this.mCompleter;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.mCompleter = aVar;
        if (this.mIsActive) {
            updateSession();
        }
        if (aVar2 != null) {
            aVar2.mo182232b(new CameraControl.OperationCanceledException("Camera2CameraControl was updated with new options."));
        }
    }

    private void updateSession() {
        this.mCamera2CameraControlImpl.updateSessionConfig();
        this.mPendingUpdate = false;
    }

    public C112608f<Void> addCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(C117512b.m165760a(new a$$d(this)));
    }

    public C112608f<Void> clearCaptureRequestOptions() {
        clearCaptureRequestOptionsInternal();
        return Futures.nonCancellationPropagating(C117512b.m165760a(new a$$c(this)));
    }

    public Camera2ImplConfig getCamera2ImplConfig() {
        Camera2ImplConfig build;
        synchronized (this.mLock) {
            if (this.mCompleter != null) {
                this.mBuilder.getMutableConfig().insertOption(Camera2ImplConfig.CAPTURE_REQUEST_TAG_OPTION, Integer.valueOf(this.mCompleter.hashCode()));
            }
            build = this.mBuilder.build();
        }
        return build;
    }

    public Camera2CameraControlImpl.CaptureResultListener getCaptureRequestListener() {
        return this.mCaptureResultListener;
    }

    public CaptureRequestOptions getCaptureRequestOptions() {
        CaptureRequestOptions build;
        synchronized (this.mLock) {
            build = CaptureRequestOptions.Builder.from(this.mBuilder.build()).build();
        }
        return build;
    }

    public void setActive(boolean z) {
        this.mExecutor.execute(new a$$b(this, z));
    }

    public C112608f<Void> setCaptureRequestOptions(CaptureRequestOptions captureRequestOptions) {
        clearCaptureRequestOptionsInternal();
        addCaptureRequestOptionsInternal(captureRequestOptions);
        return Futures.nonCancellationPropagating(C117512b.m165760a(new a$$f(this)));
    }
}
