package androidx.camera.extensions.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.Quirk;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;

public class ExtensionDisabledQuirk implements Quirk {
    private boolean mIsAdvancedInterface = isAdvancedExtenderSupported();

    private static boolean isAdvancedExtenderSupported() {
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    private static boolean isMotoRazr5G() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "smith".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean isPixel5() {
        return "google".equalsIgnoreCase(Build.BRAND) && "redfin".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean load() {
        return isPixel5() || isMotoRazr5G() || isAdvancedExtenderSupported();
    }

    public boolean shouldDisableExtension(String str, int i) {
        if (this.mIsAdvancedInterface) {
            return true;
        }
        if (isPixel5() && !this.mIsAdvancedInterface) {
            return true;
        }
        if (isMotoRazr5G()) {
            return ("0".equals(str) || "1".equals(str)) && 1 == i;
        }
        return false;
    }
}
