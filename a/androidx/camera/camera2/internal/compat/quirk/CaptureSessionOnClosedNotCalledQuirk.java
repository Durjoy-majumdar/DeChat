package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;

public class CaptureSessionOnClosedNotCalledQuirk implements Quirk {
    public static boolean load() {
        return Build.VERSION.SDK_INT < 23;
    }
}
