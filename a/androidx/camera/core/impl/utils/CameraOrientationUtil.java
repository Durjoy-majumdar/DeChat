package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;
import com.tencent.wxmm.v2helper;

public final class CameraOrientationUtil {
    private static final String TAG = "CameraOrientationUtil";

    private CameraOrientationUtil() {
    }

    public static int degreesToSurfaceRotation(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 90) {
            return 1;
        }
        if (i == 180) {
            return 2;
        }
        if (i == 270) {
            return 3;
        }
        throw new IllegalStateException("Invalid sensor rotation: " + i);
    }

    public static int getRelativeImageRotation(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + v2helper.VOIP_ENC_HEIGHT_LV1) % v2helper.VOIP_ENC_HEIGHT_LV1 : (i2 + i) % v2helper.VOIP_ENC_HEIGHT_LV1;
        if (Logger.isDebugEnabled(TAG)) {
            Logger.m15471d(TAG, String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3)}));
        }
        return i3;
    }

    public static int surfaceRotationToDegrees(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i);
    }
}
