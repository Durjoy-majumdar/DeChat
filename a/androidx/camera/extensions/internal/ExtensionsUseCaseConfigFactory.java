package androidx.camera.extensions.internal;

import android.content.Context;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfigFactory;

public final class ExtensionsUseCaseConfigFactory implements UseCaseConfigFactory {
    private final ImageCaptureConfigProvider mImageCaptureConfigProvider;
    private final PreviewConfigProvider mPreviewConfigProvider;

    /* renamed from: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory$1 */
    public static /* synthetic */ class C165641 {

        /* renamed from: $SwitchMap$androidx$camera$core$impl$UseCaseConfigFactory$CaptureType */
        public static final /* synthetic */ int[] f44376x65b8d150;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType[] r0 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44376x65b8d150 = r0
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44376x65b8d150     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44376x65b8d150     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.UseCaseConfigFactory$CaptureType r1 = androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory.C165641.<clinit>():void");
        }
    }

    public ExtensionsUseCaseConfigFactory(int i, VendorExtender vendorExtender, Context context) {
        this.mImageCaptureConfigProvider = new ImageCaptureConfigProvider(i, vendorExtender, context);
        this.mPreviewConfigProvider = new PreviewConfigProvider(i, vendorExtender, context);
    }

    public Config getConfig(UseCaseConfigFactory.CaptureType captureType, int i) {
        MutableOptionsBundle mutableOptionsBundle;
        int i2 = C165641.f44376x65b8d150[captureType.ordinal()];
        if (i2 == 1) {
            mutableOptionsBundle = MutableOptionsBundle.from(this.mImageCaptureConfigProvider.getConfig());
        } else if (i2 == 2) {
            mutableOptionsBundle = MutableOptionsBundle.from(this.mPreviewConfigProvider.getConfig());
        } else if (i2 != 3) {
            return null;
        } else {
            throw new IllegalArgumentException("CameraX Extensions doesn't support VideoCapture!");
        }
        return OptionsBundle.from(mutableOptionsBundle);
    }
}
