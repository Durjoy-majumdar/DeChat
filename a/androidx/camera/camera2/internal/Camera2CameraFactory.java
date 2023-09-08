package androidx.camera.camera2.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraStateRegistry;
import androidx.camera.core.impl.CameraThreadConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Camera2CameraFactory implements CameraFactory {
    private static final int DEFAULT_ALLOWED_CONCURRENT_OPEN_CAMERAS = 1;
    private static final String TAG = "Camera2CameraFactory";
    private final List<String> mAvailableCameraIds;
    private final Map<String, Camera2CameraInfoImpl> mCameraInfos = new HashMap();
    private final CameraManagerCompat mCameraManager;
    private final CameraStateRegistry mCameraStateRegistry;
    private final DisplayInfoManager mDisplayInfoManager;
    private final CameraThreadConfig mThreadConfig;

    public Camera2CameraFactory(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector) {
        this.mThreadConfig = cameraThreadConfig;
        this.mCameraStateRegistry = new CameraStateRegistry(1);
        this.mCameraManager = CameraManagerCompat.from(context, cameraThreadConfig.getSchedulerHandler());
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
        this.mAvailableCameraIds = getBackwardCompatibleCameraIds(CameraSelectionOptimizer.getSelectedAvailableCameraIds(this, cameraSelector));
    }

    private List<String> getBackwardCompatibleCameraIds(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String next : list) {
            if (next.equals("0") || next.equals("1")) {
                arrayList.add(next);
            } else if (isBackwardCompatible(next)) {
                arrayList.add(next);
            } else {
                Logger.m15471d(TAG, "Camera " + next + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    private boolean isBackwardCompatible(String str) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.mCameraManager.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException((Throwable) CameraUnavailableExceptionHelper.createFrom(e));
        }
    }

    public Set<String> getAvailableCameraIds() {
        return new LinkedHashSet(this.mAvailableCameraIds);
    }

    public CameraInternal getCamera(String str) {
        if (this.mAvailableCameraIds.contains(str)) {
            return new Camera2CameraImpl(this.mCameraManager, str, getCameraInfo(str), this.mCameraStateRegistry, this.mThreadConfig.getCameraExecutor(), this.mThreadConfig.getSchedulerHandler(), this.mDisplayInfoManager);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public Camera2CameraInfoImpl getCameraInfo(String str) {
        try {
            Camera2CameraInfoImpl camera2CameraInfoImpl = this.mCameraInfos.get(str);
            if (camera2CameraInfoImpl != null) {
                return camera2CameraInfoImpl;
            }
            Camera2CameraInfoImpl camera2CameraInfoImpl2 = new Camera2CameraInfoImpl(str, this.mCameraManager);
            this.mCameraInfos.put(str, camera2CameraInfoImpl2);
            return camera2CameraInfoImpl2;
        } catch (CameraAccessExceptionCompat e) {
            throw CameraUnavailableExceptionHelper.createFrom(e);
        }
    }

    public CameraManagerCompat getCameraManager() {
        return this.mCameraManager;
    }
}
