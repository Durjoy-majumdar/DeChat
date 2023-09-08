package androidx.camera.lifecycle;

import android.os.Build;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

final class LifecycleCamera implements C0124r, Camera {
    private final CameraUseCaseAdapter mCameraUseCaseAdapter;
    private volatile boolean mIsActive = false;
    private final C0125s mLifecycleOwner;
    private final Object mLock = new Object();
    private boolean mReleased = false;
    private boolean mSuspended = false;

    public LifecycleCamera(C0125s sVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.mLifecycleOwner = sVar;
        this.mCameraUseCaseAdapter = cameraUseCaseAdapter;
        if (sVar.getLifecycle().getCurrentState().mo62187a(C39623j.C39626c.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        sVar.getLifecycle().addObserver(this);
    }

    public void bind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            this.mCameraUseCaseAdapter.addUseCases(collection);
        }
    }

    public CameraControl getCameraControl() {
        return this.mCameraUseCaseAdapter.getCameraControl();
    }

    public CameraInfo getCameraInfo() {
        return this.mCameraUseCaseAdapter.getCameraInfo();
    }

    public LinkedHashSet<CameraInternal> getCameraInternals() {
        return this.mCameraUseCaseAdapter.getCameraInternals();
    }

    public CameraUseCaseAdapter getCameraUseCaseAdapter() {
        return this.mCameraUseCaseAdapter;
    }

    public CameraConfig getExtendedConfig() {
        return this.mCameraUseCaseAdapter.getExtendedConfig();
    }

    public C0125s getLifecycleOwner() {
        C0125s sVar;
        synchronized (this.mLock) {
            sVar = this.mLifecycleOwner;
        }
        return sVar;
    }

    public List<UseCase> getUseCases() {
        List<UseCase> unmodifiableList;
        synchronized (this.mLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCameraUseCaseAdapter.getUseCases());
        }
        return unmodifiableList;
    }

    public boolean isActive() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mIsActive;
        }
        return z;
    }

    public boolean isBound(UseCase useCase) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCameraUseCaseAdapter.getUseCases().contains(useCase);
        }
        return contains;
    }

    public boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return this.mCameraUseCaseAdapter.isUseCasesCombinationSupported(useCaseArr);
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onDestroy(C0125s sVar) {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onPause(C0125s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mCameraUseCaseAdapter.setActiveResumingMode(false);
        }
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onResume(C0125s sVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mCameraUseCaseAdapter.setActiveResumingMode(true);
        }
    }

    @C112974b0(C39623j.C39625b.ON_START)
    public void onStart(C0125s sVar) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.attachUseCases();
                this.mIsActive = true;
            }
        }
    }

    @C112974b0(C39623j.C39625b.ON_STOP)
    public void onStop(C0125s sVar) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.detachUseCases();
                this.mIsActive = false;
            }
        }
    }

    public void release() {
        synchronized (this.mLock) {
            this.mReleased = true;
            this.mIsActive = false;
            this.mLifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    public void setExtendedConfig(CameraConfig cameraConfig) {
        this.mCameraUseCaseAdapter.setExtendedConfig(cameraConfig);
    }

    public void suspend() {
        synchronized (this.mLock) {
            if (!this.mSuspended) {
                onStop(this.mLifecycleOwner);
                this.mSuspended = true;
            }
        }
    }

    public void unbind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.mCameraUseCaseAdapter.getUseCases());
            this.mCameraUseCaseAdapter.removeUseCases(arrayList);
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void unsuspend() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            boolean r1 = r3.mSuspended     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0009:
            r1 = 0
            r3.mSuspended = r1     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.s r1 = r3.mLifecycleOwner     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.j r1 = r1.getLifecycle()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.j$c r1 = r1.getCurrentState()     // Catch:{ all -> 0x0025 }
            androidx.lifecycle.j$c r2 = androidx.lifecycle.C39623j.C39626c.STARTED     // Catch:{ all -> 0x0025 }
            boolean r1 = r1.mo62187a(r2)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            androidx.lifecycle.s r1 = r3.mLifecycleOwner     // Catch:{ all -> 0x0025 }
            r3.onStart(r1)     // Catch:{ all -> 0x0025 }
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.lifecycle.LifecycleCamera.unsuspend():void");
    }
}
