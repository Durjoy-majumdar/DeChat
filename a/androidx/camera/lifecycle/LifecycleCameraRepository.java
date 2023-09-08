package androidx.camera.lifecycle;

import androidx.camera.core.UseCase;
import androidx.camera.core.ViewPort;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p329d3.C20434g;

final class LifecycleCameraRepository {
    private final ArrayDeque<C0125s> mActiveLifecycleOwners = new ArrayDeque<>();
    private final Map<Key, LifecycleCamera> mCameraMap = new HashMap();
    private final Map<LifecycleCameraRepositoryObserver, Set<Key>> mLifecycleObserverMap = new HashMap();
    private final Object mLock = new Object();

    public static abstract class Key {
        public static Key create(C0125s sVar, CameraUseCaseAdapter.CameraId cameraId) {
            return new AutoValue_LifecycleCameraRepository_Key(sVar, cameraId);
        }

        public abstract CameraUseCaseAdapter.CameraId getCameraId();

        public abstract C0125s getLifecycleOwner();
    }

    public static class LifecycleCameraRepositoryObserver implements C0124r {
        private final LifecycleCameraRepository mLifecycleCameraRepository;
        private final C0125s mLifecycleOwner;

        public LifecycleCameraRepositoryObserver(C0125s sVar, LifecycleCameraRepository lifecycleCameraRepository) {
            this.mLifecycleOwner = sVar;
            this.mLifecycleCameraRepository = lifecycleCameraRepository;
        }

        public C0125s getLifecycleOwner() {
            return this.mLifecycleOwner;
        }

        @C112974b0(C39623j.C39625b.ON_DESTROY)
        public void onDestroy(C0125s sVar) {
            this.mLifecycleCameraRepository.unregisterLifecycle(sVar);
        }

        @C112974b0(C39623j.C39625b.ON_START)
        public void onStart(C0125s sVar) {
            this.mLifecycleCameraRepository.setActive(sVar);
        }

        @C112974b0(C39623j.C39625b.ON_STOP)
        public void onStop(C0125s sVar) {
            this.mLifecycleCameraRepository.setInactive(sVar);
        }
    }

    private LifecycleCameraRepositoryObserver getLifecycleCameraRepositoryObserver(C0125s sVar) {
        synchronized (this.mLock) {
            for (LifecycleCameraRepositoryObserver next : this.mLifecycleObserverMap.keySet()) {
                if (sVar.equals(next.getLifecycleOwner())) {
                    return next;
                }
            }
            return null;
        }
    }

    private boolean hasUseCaseBound(C0125s sVar) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(sVar);
            if (lifecycleCameraRepositoryObserver == null) {
                return false;
            }
            for (Key key : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    return true;
                }
            }
            return false;
        }
    }

    private void registerCamera(LifecycleCamera lifecycleCamera) {
        synchronized (this.mLock) {
            C0125s lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            Key create = Key.create(lifecycleOwner, lifecycleCamera.getCameraUseCaseAdapter().getCameraId());
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(lifecycleOwner);
            Set hashSet = lifecycleCameraRepositoryObserver != null ? this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver) : new HashSet();
            hashSet.add(create);
            this.mCameraMap.put(create, lifecycleCamera);
            if (lifecycleCameraRepositoryObserver == null) {
                LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver2 = new LifecycleCameraRepositoryObserver(lifecycleOwner, this);
                this.mLifecycleObserverMap.put(lifecycleCameraRepositoryObserver2, hashSet);
                lifecycleOwner.getLifecycle().addObserver(lifecycleCameraRepositoryObserver2);
            }
        }
    }

    private void suspendUseCases(C0125s sVar) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(sVar);
            if (lifecycleCameraRepositoryObserver != null) {
                for (Key key : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                    LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                    lifecycleCamera.getClass();
                    lifecycleCamera.suspend();
                }
            }
        }
    }

    private void unsuspendUseCases(C0125s sVar) {
        synchronized (this.mLock) {
            for (Key key : this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(sVar))) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.getClass();
                if (!lifecycleCamera.getUseCases().isEmpty()) {
                    lifecycleCamera.unsuspend();
                }
            }
        }
    }

    public void bindToLifecycleCamera(LifecycleCamera lifecycleCamera, ViewPort viewPort, Collection<UseCase> collection) {
        synchronized (this.mLock) {
            C20434g.m22017a(!collection.isEmpty());
            C0125s lifecycleOwner = lifecycleCamera.getLifecycleOwner();
            for (Key key : this.mLifecycleObserverMap.get(getLifecycleCameraRepositoryObserver(lifecycleOwner))) {
                LifecycleCamera lifecycleCamera2 = this.mCameraMap.get(key);
                lifecycleCamera2.getClass();
                if (!lifecycleCamera2.equals(lifecycleCamera)) {
                    if (!lifecycleCamera2.getUseCases().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                lifecycleCamera.getCameraUseCaseAdapter().setViewPort(viewPort);
                lifecycleCamera.bind(collection);
                if (lifecycleOwner.getLifecycle().getCurrentState().mo62187a(C39623j.C39626c.STARTED)) {
                    setActive(lifecycleOwner);
                }
            } catch (CameraUseCaseAdapter.CameraException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }
    }

    public void clear() {
        synchronized (this.mLock) {
            Iterator it = new HashSet(this.mLifecycleObserverMap.keySet()).iterator();
            while (it.hasNext()) {
                unregisterLifecycle(((LifecycleCameraRepositoryObserver) it.next()).getLifecycleOwner());
            }
        }
    }

    public LifecycleCamera createLifecycleCamera(C0125s sVar, CameraUseCaseAdapter cameraUseCaseAdapter) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            C20434g.m22018b(this.mCameraMap.get(Key.create(sVar, cameraUseCaseAdapter.getCameraId())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
            if (sVar.getLifecycle().getCurrentState() != C39623j.C39626c.DESTROYED) {
                lifecycleCamera = new LifecycleCamera(sVar, cameraUseCaseAdapter);
                if (cameraUseCaseAdapter.getUseCases().isEmpty()) {
                    lifecycleCamera.suspend();
                }
                registerCamera(lifecycleCamera);
            } else {
                throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
            }
        }
        return lifecycleCamera;
    }

    public LifecycleCamera getLifecycleCamera(C0125s sVar, CameraUseCaseAdapter.CameraId cameraId) {
        LifecycleCamera lifecycleCamera;
        synchronized (this.mLock) {
            lifecycleCamera = this.mCameraMap.get(Key.create(sVar, cameraId));
        }
        return lifecycleCamera;
    }

    public Collection<LifecycleCamera> getLifecycleCameras() {
        Collection<LifecycleCamera> unmodifiableCollection;
        synchronized (this.mLock) {
            unmodifiableCollection = Collections.unmodifiableCollection(this.mCameraMap.values());
        }
        return unmodifiableCollection;
    }

    public void setActive(C0125s sVar) {
        synchronized (this.mLock) {
            if (hasUseCaseBound(sVar)) {
                if (this.mActiveLifecycleOwners.isEmpty()) {
                    this.mActiveLifecycleOwners.push(sVar);
                } else {
                    C0125s peek = this.mActiveLifecycleOwners.peek();
                    if (!sVar.equals(peek)) {
                        suspendUseCases(peek);
                        this.mActiveLifecycleOwners.remove(sVar);
                        this.mActiveLifecycleOwners.push(sVar);
                    }
                }
                unsuspendUseCases(sVar);
            }
        }
    }

    public void setInactive(C0125s sVar) {
        synchronized (this.mLock) {
            this.mActiveLifecycleOwners.remove(sVar);
            suspendUseCases(sVar);
            if (!this.mActiveLifecycleOwners.isEmpty()) {
                unsuspendUseCases(this.mActiveLifecycleOwners.peek());
            }
        }
    }

    public void unbind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            for (Key key : this.mCameraMap.keySet()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                boolean z = !lifecycleCamera.getUseCases().isEmpty();
                lifecycleCamera.unbind(collection);
                if (z && lifecycleCamera.getUseCases().isEmpty()) {
                    setInactive(lifecycleCamera.getLifecycleOwner());
                }
            }
        }
    }

    public void unbindAll() {
        synchronized (this.mLock) {
            for (Key key : this.mCameraMap.keySet()) {
                LifecycleCamera lifecycleCamera = this.mCameraMap.get(key);
                lifecycleCamera.unbindAll();
                setInactive(lifecycleCamera.getLifecycleOwner());
            }
        }
    }

    public void unregisterLifecycle(C0125s sVar) {
        synchronized (this.mLock) {
            LifecycleCameraRepositoryObserver lifecycleCameraRepositoryObserver = getLifecycleCameraRepositoryObserver(sVar);
            if (lifecycleCameraRepositoryObserver != null) {
                setInactive(sVar);
                for (Key remove : this.mLifecycleObserverMap.get(lifecycleCameraRepositoryObserver)) {
                    this.mCameraMap.remove(remove);
                }
                this.mLifecycleObserverMap.remove(lifecycleCameraRepositoryObserver);
                lifecycleCameraRepositoryObserver.getLifecycleOwner().getLifecycle().removeObserver(lifecycleCameraRepositoryObserver);
            }
        }
    }
}
