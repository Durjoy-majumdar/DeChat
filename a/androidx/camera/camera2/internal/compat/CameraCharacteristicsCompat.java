package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CameraCharacteristicsCompat {
    private final CameraCharacteristicsCompatImpl mCameraCharacteristicsImpl;
    private final Map<CameraCharacteristics.Key<?>, Object> mValuesCache = new HashMap();

    public interface CameraCharacteristicsCompatImpl {
        <T> T get(CameraCharacteristics.Key<T> key);

        Set<String> getPhysicalCameraIds();

        CameraCharacteristics unwrap();
    }

    private CameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsApi28Impl(cameraCharacteristics);
        } else {
            this.mCameraCharacteristicsImpl = new CameraCharacteristicsBaseImpl(cameraCharacteristics);
        }
    }

    private boolean isKeyNonCacheable(CameraCharacteristics.Key<?> key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static CameraCharacteristicsCompat toCameraCharacteristicsCompat(CameraCharacteristics cameraCharacteristics) {
        return new CameraCharacteristicsCompat(cameraCharacteristics);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> r3) {
        /*
            r2 = this;
            boolean r0 = r2.isKeyNonCacheable(r3)
            if (r0 == 0) goto L_0x000d
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl r0 = r2.mCameraCharacteristicsImpl
            java.lang.Object r3 = r0.get(r3)
            return r3
        L_0x000d:
            monitor-enter(r2)
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r0 = r2.mValuesCache     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0018
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0018:
            androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat$CameraCharacteristicsCompatImpl r0 = r2.mCameraCharacteristicsImpl     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0027 }
            if (r0 == 0) goto L_0x0025
            java.util.Map<android.hardware.camera2.CameraCharacteristics$Key<?>, java.lang.Object> r1 = r2.mValuesCache     // Catch:{ all -> 0x0027 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }

    public Set<String> getPhysicalCameraIds() {
        return this.mCameraCharacteristicsImpl.getPhysicalCameraIds();
    }

    public CameraCharacteristics toCameraCharacteristics() {
        return this.mCameraCharacteristicsImpl.unwrap();
    }
}
