package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.camera.camera2.internal.compat.workaround.PreviewPixelHDRnet;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;

public final class Camera2UseCaseConfigFactory implements UseCaseConfigFactory {
    public final DisplayInfoManager mDisplayInfoManager;

    /* renamed from: androidx.camera.camera2.internal.Camera2UseCaseConfigFactory$1 */
    public static /* synthetic */ class C164741 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        public static final /* synthetic */ int[] f44039x65b8d150;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44039x65b8d150 = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44039x65b8d150     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44039x65b8d150     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44039x65b8d150     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2UseCaseConfigFactory.C164741.<clinit>():void");
        }
    }

    public Camera2UseCaseConfigFactory(Context context) {
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
    }

    public Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        int[] iArr = C164741.f44039x65b8d150;
        int i2 = iArr[captureType.ordinal()];
        int i3 = 5;
        if (i2 == 1) {
            builder.setTemplateType(i == 2 ? 5 : 1);
        } else if (i2 == 2 || i2 == 3) {
            builder.setTemplateType(1);
        } else if (i2 == 4) {
            builder.setTemplateType(3);
        }
        UseCaseConfigFactory.CaptureType captureType2 = UseCaseConfigFactory.CaptureType.PREVIEW;
        if (captureType == captureType2) {
            PreviewPixelHDRnet.setHDRnet(builder);
        }
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, Camera2SessionOptionUnpacker.INSTANCE);
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        int i4 = iArr[captureType.ordinal()];
        if (i4 == 1) {
            if (i != 2) {
                i3 = 2;
            }
            builder2.setTemplateType(i3);
        } else if (i4 == 2 || i4 == 3) {
            builder2.setTemplateType(1);
        } else if (i4 == 4) {
            builder2.setTemplateType(3);
        }
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        create.insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? ImageCaptureOptionUnpacker.INSTANCE : Camera2CaptureOptionUnpacker.INSTANCE);
        if (captureType == captureType2) {
            create.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, this.mDisplayInfoManager.getPreviewSize());
        }
        create.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(this.mDisplayInfoManager.getMaxSizeDisplay().getRotation()));
        return OptionsBundle.from(create);
    }
}
