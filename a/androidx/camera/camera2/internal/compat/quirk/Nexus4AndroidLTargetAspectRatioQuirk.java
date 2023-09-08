package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Nexus4AndroidLTargetAspectRatioQuirk implements Quirk {
    private static final List<String> DEVICE_MODELS = Arrays.asList(new String[]{"NEXUS 4"});

    public static boolean load() {
        return "GOOGLE".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT < 23 && DEVICE_MODELS.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public int getCorrectedAspectRatio() {
        return 2;
    }
}
