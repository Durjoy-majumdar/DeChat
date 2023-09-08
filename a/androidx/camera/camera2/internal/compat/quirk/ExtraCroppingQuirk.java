package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.SurfaceConfig;
import com.tencent.tavkit.component.TAVExporter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ExtraCroppingQuirk implements Quirk {
    private static final List<String> SAMSUNG_DISTORTION_MODELS = Arrays.asList(new String[]{"SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M"});

    /* renamed from: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk$1 */
    public static /* synthetic */ class C1128571 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.impl.SurfaceConfig$ConfigType[] r0 = androidx.camera.core.impl.SurfaceConfig.ConfigType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType = r0
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.PRIV     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.YUV     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.SurfaceConfig$ConfigType r1 = androidx.camera.core.impl.SurfaceConfig.ConfigType.JPEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.C1128571.<clinit>():void");
        }
    }

    private static boolean isSamsungDistortion() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && SAMSUNG_DISTORTION_MODELS.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    public static boolean load() {
        return isSamsungDistortion();
    }

    public Size getVerifiedResolution(SurfaceConfig.ConfigType configType) {
        if (!isSamsungDistortion()) {
            return null;
        }
        int i = C1128571.$SwitchMap$androidx$camera$core$impl$SurfaceConfig$ConfigType[configType.ordinal()];
        if (i == 1) {
            return new Size(1920, 1080);
        }
        if (i == 2) {
            return new Size(1280, TAVExporter.VIDEO_EXPORT_WIDTH);
        }
        if (i != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
