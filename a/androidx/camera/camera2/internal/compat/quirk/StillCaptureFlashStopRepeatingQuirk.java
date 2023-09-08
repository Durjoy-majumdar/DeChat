package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Locale;

public class StillCaptureFlashStopRepeatingQuirk implements Quirk {
    public static boolean load() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && Build.MODEL.toUpperCase(locale).startsWith("SM-A716");
    }
}
