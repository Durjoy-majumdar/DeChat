package androidx.camera.camera2.internal;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import androidx.camera.core.impl.SurfaceConfig;
import androidx.camera.core.impl.UseCaseConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p329d3.C20434g;

public final class Camera2DeviceSurfaceManager implements CameraDeviceSurfaceManager {
    private static final String TAG = "Camera2DeviceSurfaceManager";
    private final CamcorderProfileHelper mCamcorderProfileHelper;
    private final Map<String, SupportedSurfaceCombination> mCameraSupportedSurfaceCombinationMap;

    public Camera2DeviceSurfaceManager(Context context, Object obj, Set<String> set) {
        this(context, new CamcorderProfileHelper() {
            public CamcorderProfile get(int i, int i2) {
                return CamcorderProfile.get(i, i2);
            }

            public boolean hasProfile(int i, int i2) {
                return CamcorderProfile.hasProfile(i, i2);
            }
        }, obj, set);
    }

    private void init(Context context, CameraManagerCompat cameraManagerCompat, Set<String> set) {
        context.getClass();
        for (String next : set) {
            this.mCameraSupportedSurfaceCombinationMap.put(next, new SupportedSurfaceCombination(context, next, cameraManagerCompat, this.mCamcorderProfileHelper));
        }
    }

    public boolean checkSupported(String str, List<SurfaceConfig> list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.checkSupported(list);
        }
        return false;
    }

    public Map<UseCaseConfig<?>, Size> getSuggestedResolutions(String str, List<SurfaceConfig> list, List<UseCaseConfig<?>> list2) {
        C20434g.m22018b(!list2.isEmpty(), "No new use cases to be bound.");
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.getSuggestedResolutions(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    public SurfaceConfig transformSurfaceConfig(String str, int i, Size size) {
        SupportedSurfaceCombination supportedSurfaceCombination = this.mCameraSupportedSurfaceCombinationMap.get(str);
        if (supportedSurfaceCombination != null) {
            return supportedSurfaceCombination.transformSurfaceConfig(i, size);
        }
        return null;
    }

    public Camera2DeviceSurfaceManager(Context context, CamcorderProfileHelper camcorderProfileHelper, Object obj, Set<String> set) {
        CameraManagerCompat cameraManagerCompat;
        this.mCameraSupportedSurfaceCombinationMap = new HashMap();
        camcorderProfileHelper.getClass();
        this.mCamcorderProfileHelper = camcorderProfileHelper;
        if (obj instanceof CameraManagerCompat) {
            cameraManagerCompat = (CameraManagerCompat) obj;
        } else {
            cameraManagerCompat = CameraManagerCompat.from(context);
        }
        init(context, cameraManagerCompat, set);
    }
}
