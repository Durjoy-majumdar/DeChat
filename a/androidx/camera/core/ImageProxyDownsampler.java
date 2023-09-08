package androidx.camera.core;

import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;

final class ImageProxyDownsampler {

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$2 */
    public static /* synthetic */ class C165072 {

        /* renamed from: $SwitchMap$androidx$camera$core$ImageProxyDownsampler$DownsamplingMethod */
        public static final /* synthetic */ int[] f44259x2bb1831c;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod[] r0 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44259x2bb1831c = r0
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.NEAREST_NEIGHBOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44259x2bb1831c     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.AVERAGING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProxyDownsampler.C165072.<clinit>():void");
        }
    }

    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    public static final class ForwardingImageProxyImpl extends ForwardingImageProxy {
        private final int mDownsampledHeight;
        private final ImageProxy.PlaneProxy[] mDownsampledPlanes;
        private final int mDownsampledWidth;

        public ForwardingImageProxyImpl(ImageProxy imageProxy, ImageProxy.PlaneProxy[] planeProxyArr, int i, int i2) {
            super(imageProxy);
            this.mDownsampledPlanes = planeProxyArr;
            this.mDownsampledWidth = i;
            this.mDownsampledHeight = i2;
        }

        public synchronized int getHeight() {
            return this.mDownsampledHeight;
        }

        public synchronized ImageProxy.PlaneProxy[] getPlanes() {
            return this.mDownsampledPlanes;
        }

        public synchronized int getWidth() {
            return this.mDownsampledWidth;
        }
    }

    private ImageProxyDownsampler() {
    }

    private static ImageProxy.PlaneProxy createPlaneProxy(int i, int i2, byte[] bArr) {
        return new ImageProxy.PlaneProxy(bArr, i, i2) {
            public final ByteBuffer mBuffer;
            public final /* synthetic */ byte[] val$data;
            public final /* synthetic */ int val$pixelStride;
            public final /* synthetic */ int val$rowStride;

            {
                this.val$data = r1;
                this.val$rowStride = r2;
                this.val$pixelStride = r3;
                this.mBuffer = ByteBuffer.wrap(r1);
            }

            public ByteBuffer getBuffer() {
                return this.mBuffer;
            }

            public int getPixelStride() {
                return this.val$pixelStride;
            }

            public int getRowStride() {
                return this.val$rowStride;
            }
        };
    }

    public static ForwardingImageProxy downsample(ImageProxy imageProxy, int i, int i2, DownsamplingMethod downsamplingMethod) {
        byte[] bArr;
        ImageProxy imageProxy2 = imageProxy;
        int i3 = i;
        int i4 = i2;
        if (imageProxy.getFormat() != 35) {
            throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        } else if (imageProxy.getWidth() < i3 || imageProxy.getHeight() < i4) {
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i3, i4) + " is not <= original dimension " + new Size(imageProxy.getWidth(), imageProxy.getHeight()) + ".");
        } else if (imageProxy.getWidth() == i3 && imageProxy.getHeight() == i4) {
            return new ForwardingImageProxyImpl(imageProxy2, imageProxy.getPlanes(), i3, i4);
        } else {
            int[] iArr = {imageProxy.getWidth(), imageProxy.getWidth() / 2, imageProxy.getWidth() / 2};
            int[] iArr2 = {imageProxy.getHeight(), imageProxy.getHeight() / 2, imageProxy.getHeight() / 2};
            int i5 = i3 / 2;
            int[] iArr3 = {i3, i5, i5};
            int i6 = i4 / 2;
            int[] iArr4 = {i4, i6, i6};
            ImageProxy.PlaneProxy[] planeProxyArr = new ImageProxy.PlaneProxy[3];
            for (int i7 = 0; i7 < 3; i7++) {
                ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[i7];
                ByteBuffer buffer = planeProxy.getBuffer();
                byte[] bArr2 = new byte[(iArr3[i7] * iArr4[i7])];
                int i8 = C165072.f44259x2bb1831c[downsamplingMethod.ordinal()];
                if (i8 == 1) {
                    bArr = bArr2;
                    resizeNearestNeighbor(buffer, iArr[i7], planeProxy.getPixelStride(), planeProxy.getRowStride(), iArr2[i7], bArr, iArr3[i7], iArr4[i7]);
                } else if (i8 != 2) {
                    bArr = bArr2;
                } else {
                    int i9 = iArr[i7];
                    int pixelStride = planeProxy.getPixelStride();
                    bArr = bArr2;
                    resizeAveraging(buffer, i9, pixelStride, planeProxy.getRowStride(), iArr2[i7], bArr, iArr3[i7], iArr4[i7]);
                }
                planeProxyArr[i7] = createPlaneProxy(iArr3[i7], 1, bArr);
            }
            return new ForwardingImageProxyImpl(imageProxy2, planeProxyArr, i3, i4);
        }
    }

    private static void resizeAveraging(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        int i15 = i6;
        float f = ((float) i) / ((float) i9);
        float f2 = ((float) i8) / ((float) i15);
        byte[] bArr2 = new byte[i7];
        byte[] bArr3 = new byte[i7];
        int[] iArr = new int[i9];
        int i16 = 0;
        for (int i17 = 0; i17 < i9; i17++) {
            iArr[i17] = ((int) (((float) i17) * f)) * i2;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            int i18 = 0;
            while (i18 < i15) {
                int i19 = (int) (((float) i18) * f2);
                int i25 = i8 - 1;
                int i26 = i18 * i9;
                byteBuffer2.position(Math.min(i19, i25) * i7);
                byteBuffer2.get(bArr2, i16, Math.min(i7, byteBuffer.remaining()));
                byteBuffer2.position(Math.min(i19 + 1, i25) * i7);
                byteBuffer2.get(bArr3, i16, Math.min(i7, byteBuffer.remaining()));
                for (int i27 = 0; i27 < i9; i27++) {
                    int i28 = iArr[i27];
                    bArr[i26 + i27] = (byte) ((((((bArr2[i28] & ExifInterface.MARKER) + (bArr2[i28 + i2] & ExifInterface.MARKER)) + (bArr3[i28] & ExifInterface.MARKER)) + (bArr3[i28 + i2] & ExifInterface.MARKER)) / 4) & 255);
                }
                i18++;
                i16 = 0;
            }
        }
    }

    private static void resizeNearestNeighbor(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        float f = ((float) i) / ((float) i5);
        float f2 = ((float) i4) / ((float) i6);
        byte[] bArr2 = new byte[i3];
        int[] iArr = new int[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            iArr[i7] = ((int) (((float) i7) * f)) * i2;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = i8 * i5;
                byteBuffer.position(Math.min((int) (((float) i8) * f2), i4 - 1) * i3);
                byteBuffer.get(bArr2, 0, Math.min(i3, byteBuffer.remaining()));
                for (int i15 = 0; i15 < i5; i15++) {
                    bArr[i9 + i15] = bArr2[iArr[i15]];
                }
            }
        }
    }
}
