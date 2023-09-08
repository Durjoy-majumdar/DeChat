package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CameraNoResponseWhenEnablingFlashQuirk implements UseTorchAsFlashQuirk {
    public static final List<String> AFFECTED_MODELS = Arrays.asList(new String[]{"SM-N9200", "SM-N9208", "SAMSUNG-SM-N920A", "SM-N920C", "SM-N920F", "SM-N920G", "SM-N920I", "SM-N920K", "SM-N920L", "SM-N920P", "SM-N920R4", "SM-N920R6", "SM-N920R7", "SM-N920S", "SM-N920T", "SM-N920V", "SM-N920W8", "SM-N920X", "SM-J510FN"});
    public static final String BUILD_BRAND = "SAMSUNG";

    public static boolean load(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        String str = Build.BRAND;
        Locale locale = Locale.US;
        return "SAMSUNG".equals(str.toUpperCase(locale)) && AFFECTED_MODELS.contains(Build.MODEL.toUpperCase(locale)) && ((Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.LENS_FACING)).intValue() == 1;
    }
}
