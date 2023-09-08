package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p1167z8.C112608f;
import p202m2.C117512b;

public final class CameraRepository {
    private static final String TAG = "CameraRepository";
    private final Map<String, CameraInternal> mCameras = new LinkedHashMap();
    private final Object mCamerasLock = new Object();
    private C117512b.C117513a<Void> mDeinitCompleter;
    private C112608f<Void> mDeinitFuture;
    private final Set<CameraInternal> mReleasingCameras = new HashSet();

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$deinit$0(C117512b.C117513a aVar) {
        synchronized (this.mCamerasLock) {
            this.mDeinitCompleter = aVar;
        }
        return "CameraRepository-deinit";
    }

    /* access modifiers changed from: private */
    public void lambda$deinit$1(CameraInternal cameraInternal) {
        synchronized (this.mCamerasLock) {
            this.mReleasingCameras.remove(cameraInternal);
            if (this.mReleasingCameras.isEmpty()) {
                this.mDeinitCompleter.getClass();
                this.mDeinitCompleter.mo182231a(null);
                this.mDeinitCompleter = null;
                this.mDeinitFuture = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p1167z8.C112608f<java.lang.Void> deinit() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.mCamerasLock
            monitor-enter(r0)
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r1 = r6.mCameras     // Catch:{ all -> 0x005e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0016
            z8.f<java.lang.Void> r1 = r6.mDeinitFuture     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0014
            r1 = 0
            z8.f r1 = androidx.camera.core.impl.utils.futures.Futures.immediateFuture(r1)     // Catch:{ all -> 0x005e }
        L_0x0014:
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return r1
        L_0x0016:
            z8.f<java.lang.Void> r1 = r6.mDeinitFuture     // Catch:{ all -> 0x005e }
            if (r1 != 0) goto L_0x0025
            androidx.camera.core.impl.CameraRepository$$a r1 = new androidx.camera.core.impl.CameraRepository$$a     // Catch:{ all -> 0x005e }
            r1.<init>(r6)     // Catch:{ all -> 0x005e }
            z8.f r1 = p202m2.C117512b.m165760a(r1)     // Catch:{ all -> 0x005e }
            r6.mDeinitFuture = r1     // Catch:{ all -> 0x005e }
        L_0x0025:
            java.util.Set<androidx.camera.core.impl.CameraInternal> r2 = r6.mReleasingCameras     // Catch:{ all -> 0x005e }
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r3 = r6.mCameras     // Catch:{ all -> 0x005e }
            java.util.Collection r3 = r3.values()     // Catch:{ all -> 0x005e }
            r2.addAll(r3)     // Catch:{ all -> 0x005e }
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r6.mCameras     // Catch:{ all -> 0x005e }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x005e }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005e }
        L_0x003a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x005e }
            if (r3 == 0) goto L_0x0057
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x005e }
            androidx.camera.core.impl.CameraInternal r3 = (androidx.camera.core.impl.CameraInternal) r3     // Catch:{ all -> 0x005e }
            z8.f r4 = r3.release()     // Catch:{ all -> 0x005e }
            androidx.camera.core.impl.CameraRepository$$b r5 = new androidx.camera.core.impl.CameraRepository$$b     // Catch:{ all -> 0x005e }
            r5.<init>(r6, r3)     // Catch:{ all -> 0x005e }
            java.util.concurrent.Executor r3 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch:{ all -> 0x005e }
            r4.addListener(r5, r3)     // Catch:{ all -> 0x005e }
            goto L_0x003a
        L_0x0057:
            java.util.Map<java.lang.String, androidx.camera.core.impl.CameraInternal> r2 = r6.mCameras     // Catch:{ all -> 0x005e }
            r2.clear()     // Catch:{ all -> 0x005e }
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            return r1
        L_0x005e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraRepository.deinit():z8.f");
    }

    public CameraInternal getCamera(String str) {
        CameraInternal cameraInternal;
        synchronized (this.mCamerasLock) {
            cameraInternal = this.mCameras.get(str);
            if (cameraInternal == null) {
                throw new IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return cameraInternal;
    }

    public Set<String> getCameraIds() {
        LinkedHashSet linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet(this.mCameras.keySet());
        }
        return linkedHashSet;
    }

    public LinkedHashSet<CameraInternal> getCameras() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet<>(this.mCameras.values());
        }
        return linkedHashSet;
    }

    public void init(CameraFactory cameraFactory) {
        synchronized (this.mCamerasLock) {
            try {
                for (String next : cameraFactory.getAvailableCameraIds()) {
                    Logger.m15471d(TAG, "Added camera: " + next);
                    this.mCameras.put(next, cameraFactory.getCamera(next));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException((Throwable) e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
