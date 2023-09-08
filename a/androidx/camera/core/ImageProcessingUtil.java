package androidx.camera.core;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.util.Locale;
import k20.C9556a;
import p329d3.C20434g;

final class ImageProcessingUtil {
    private static final String TAG = "ImageProcessingUtil";
    private static int sImageCount;
    private byte _hellAccFlag_;

    public enum Result {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("image_processing_util_jni");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "androidx/camera/core/ImageProcessingUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "androidx/camera/core/ImageProcessingUtil", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private ImageProcessingUtil() {
    }

    public static boolean applyPixelShiftForYUV(ImageProxy imageProxy) {
        if (!isSupportedYUVFormat(imageProxy)) {
            Logger.m15473e(TAG, "Unsupported format for YUV to RGB");
            return false;
        } else if (applyPixelShiftInternal(imageProxy) != Result.ERROR_CONVERSION) {
            return true;
        } else {
            Logger.m15473e(TAG, "One pixel shift for YUV failure");
            return false;
        }
    }

    private static Result applyPixelShiftInternal(ImageProxy imageProxy) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        return nativeShiftPixel(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, width, height, pixelStride, pixelStride2, pixelStride2) != 0 ? Result.ERROR_CONVERSION : Result.SUCCESS;
    }

    public static ImageProxy convertJpegBytesToImage(ImageReaderProxy imageReaderProxy, byte[] bArr) {
        C20434g.m22017a(imageReaderProxy.getImageFormat() == 256);
        bArr.getClass();
        Surface surface = imageReaderProxy.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            Logger.m15473e(TAG, "Failed to enqueue JPEG image.");
            return null;
        }
        ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
        if (acquireLatestImage == null) {
            Logger.m15473e(TAG, "Failed to get acquire JPEG image.");
        }
        return acquireLatestImage;
    }

    public static ImageProxy convertYUVToRGB(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ByteBuffer byteBuffer, int i, boolean z) {
        if (!isSupportedYUVFormat(imageProxy)) {
            Logger.m15473e(TAG, "Unsupported format for YUV to RGB");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!isSupportedRotationDegrees(i)) {
            Logger.m15473e(TAG, "Unsupported rotation degrees for rotate RGB");
            return null;
        } else if (convertYUVToRGBInternal(imageProxy, imageReaderProxy.getSurface(), byteBuffer, i, z) == Result.ERROR_CONVERSION) {
            Logger.m15473e(TAG, "YUV to RGB conversion failure");
            return null;
        } else {
            if (Log.isLoggable("MH", 3)) {
                Logger.m15471d(TAG, String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Integer.valueOf(sImageCount)}));
                sImageCount++;
            }
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage == null) {
                Logger.m15473e(TAG, "YUV to RGB acquireLatestImage failure");
                return null;
            }
            SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(acquireLatestImage);
            singleCloseImageProxy.addOnImageCloseListener(new ImageProcessingUtil$$a(acquireLatestImage, imageProxy));
            return singleCloseImageProxy;
        }
    }

    private static Result convertYUVToRGBInternal(ImageProxy imageProxy, Surface surface, ByteBuffer byteBuffer, int i, boolean z) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[0].getPixelStride();
        int pixelStride2 = imageProxy.getPlanes()[1].getPixelStride();
        return nativeConvertAndroid420ToABGR(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, surface, byteBuffer, width, height, z ? pixelStride : 0, z ? pixelStride2 : 0, z ? pixelStride2 : 0, i) != 0 ? Result.ERROR_CONVERSION : Result.SUCCESS;
    }

    private static boolean isSupportedRotationDegrees(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }

    private static boolean isSupportedYUVFormat(ImageProxy imageProxy) {
        return imageProxy.getFormat() == 35 && imageProxy.getPlanes().length == 3;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$convertYUVToRGB$0(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy != null && imageProxy2 != null) {
            imageProxy2.close();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$rotateYUV$1(ImageProxy imageProxy, ImageProxy imageProxy2, ImageProxy imageProxy3) {
        if (imageProxy != null && imageProxy2 != null) {
            imageProxy2.close();
        }
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i15, int i16);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, ByteBuffer byteBuffer4, int i5, int i6, ByteBuffer byteBuffer5, int i7, int i8, ByteBuffer byteBuffer6, int i9, int i15, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i16, int i17, int i18);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);

    public static ImageProxy rotateYUV(ImageProxy imageProxy, ImageReaderProxy imageReaderProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (!isSupportedYUVFormat(imageProxy)) {
            Logger.m15473e(TAG, "Unsupported format for rotate YUV");
            return null;
        } else if (!isSupportedRotationDegrees(i)) {
            Logger.m15473e(TAG, "Unsupported rotation degrees for rotate YUV");
            return null;
        } else {
            Result result = Result.ERROR_CONVERSION;
            if (((Build.VERSION.SDK_INT < 23 || i <= 0) ? result : rotateYUVInternal(imageProxy, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i)) == result) {
                Logger.m15473e(TAG, "rotate YUV failure");
                return null;
            }
            ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (acquireLatestImage == null) {
                Logger.m15473e(TAG, "YUV rotation acquireLatestImage failure");
                return null;
            }
            SingleCloseImageProxy singleCloseImageProxy = new SingleCloseImageProxy(acquireLatestImage);
            singleCloseImageProxy.addOnImageCloseListener(new ImageProcessingUtil$$b(acquireLatestImage, imageProxy));
            return singleCloseImageProxy;
        }
    }

    private static Result rotateYUVInternal(ImageProxy imageProxy, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        int width = imageProxy.getWidth();
        int height = imageProxy.getHeight();
        int rowStride = imageProxy.getPlanes()[0].getRowStride();
        int rowStride2 = imageProxy.getPlanes()[1].getRowStride();
        int rowStride3 = imageProxy.getPlanes()[2].getRowStride();
        int pixelStride = imageProxy.getPlanes()[1].getPixelStride();
        Image dequeueInputImage = ImageWriterCompat.dequeueInputImage(imageWriter);
        if (dequeueInputImage == null) {
            return Result.ERROR_CONVERSION;
        }
        Image image = dequeueInputImage;
        Image image2 = image;
        if (nativeRotateYUV(imageProxy.getPlanes()[0].getBuffer(), rowStride, imageProxy.getPlanes()[1].getBuffer(), rowStride2, imageProxy.getPlanes()[2].getBuffer(), rowStride3, pixelStride, dequeueInputImage.getPlanes()[0].getBuffer(), dequeueInputImage.getPlanes()[0].getRowStride(), dequeueInputImage.getPlanes()[0].getPixelStride(), dequeueInputImage.getPlanes()[1].getBuffer(), dequeueInputImage.getPlanes()[1].getRowStride(), dequeueInputImage.getPlanes()[1].getPixelStride(), dequeueInputImage.getPlanes()[2].getBuffer(), dequeueInputImage.getPlanes()[2].getRowStride(), image.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i) != 0) {
            return Result.ERROR_CONVERSION;
        }
        ImageWriterCompat.queueInputImage(imageWriter, image2);
        return Result.SUCCESS;
    }
}
