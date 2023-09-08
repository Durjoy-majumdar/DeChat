package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class ImageUtil {
    private static final String TAG = "ImageUtil";

    private ImageUtil() {
    }

    public static Rect computeCropRectFromAspectRatio(Size size, Rational rational) {
        int i;
        if (!isAspectRatioValid(rational)) {
            Logger.m15477w(TAG, "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = (float) width;
        float f2 = (float) height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f / f2) {
            int round = Math.round((f / ((float) numerator)) * ((float) denominator));
            int i3 = round;
            i = (height - round) / 2;
            height = i3;
        } else {
            int round2 = Math.round((f2 / ((float) denominator)) * ((float) numerator));
            i2 = (width - round2) / 2;
            width = round2;
            i = 0;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    public static Rect computeCropRectFromDispatchInfo(Rect rect, int i, Size size, int i2) {
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (i2 - i));
        float[] sizeToVertexes = sizeToVertexes(size);
        matrix.mapPoints(sizeToVertexes);
        matrix.postTranslate(-min(sizeToVertexes[0], sizeToVertexes[2], sizeToVertexes[4], sizeToVertexes[6]), -min(sizeToVertexes[1], sizeToVertexes[3], sizeToVertexes[5], sizeToVertexes[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static byte[] cropJpegByteArray(byte[] bArr, Rect rect, int i) {
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream)) {
                    decodeRegion.recycle();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new CodecFailedException("Encode bitmap failed.", CodecFailedException.FailureType.ENCODE_FAILED);
            }
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
        } catch (IllegalArgumentException e) {
            throw new CodecFailedException("Decode byte array failed with illegal argument." + e, CodecFailedException.FailureType.DECODE_FAILED);
        } catch (IOException unused) {
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    public static Rational getRotatedAspectRatio(int i, Rational rational) {
        return (i == 90 || i == 270) ? inverseRational(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    private static Rational inverseRational(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    public static boolean isAspectRatioValid(Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    private static boolean isCropAspectRatioHasEffect(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = (float) rational.getNumerator();
        float denominator = (float) rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static byte[] jpegImageToJpegByteArray(ImageProxy imageProxy) {
        if (imageProxy.getFormat() == 256) {
            ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
            byte[] bArr = new byte[buffer.capacity()];
            buffer.rewind();
            buffer.get(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }

    public static float min(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    private static byte[] nv21ToJpeg(byte[] bArr, int i, int i2, Rect rect, int i3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, (int[]) null);
        if (rect == null) {
            rect = new Rect(0, 0, i, i2);
        }
        if (yuvImage.compressToJpeg(rect, i3, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.FailureType.ENCODE_FAILED);
    }

    public static boolean shouldCropImage(int i, int i2, int i3, int i4) {
        return (i == i3 && i2 == i4) ? false : true;
    }

    public static boolean shouldCropImage(ImageProxy imageProxy) {
        return shouldCropImage(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy.getCropRect().width(), imageProxy.getCropRect().height());
    }

    public static float[] sizeToVertexes(Size size) {
        return new float[]{0.0f, 0.0f, (float) size.getWidth(), 0.0f, (float) size.getWidth(), (float) size.getHeight(), 0.0f, (float) size.getHeight()};
    }

    public static byte[] yuvImageToJpegByteArray(ImageProxy imageProxy, Rect rect, int i) {
        if (imageProxy.getFormat() == 35) {
            return nv21ToJpeg(yuv_420_888toNv21(imageProxy), imageProxy.getWidth(), imageProxy.getHeight(), rect, i);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }

    public static byte[] yuv_420_888toNv21(ImageProxy imageProxy) {
        ImageProxy.PlaneProxy planeProxy = imageProxy.getPlanes()[0];
        ImageProxy.PlaneProxy planeProxy2 = imageProxy.getPlanes()[1];
        ImageProxy.PlaneProxy planeProxy3 = imageProxy.getPlanes()[2];
        ByteBuffer buffer = planeProxy.getBuffer();
        ByteBuffer buffer2 = planeProxy2.getBuffer();
        ByteBuffer buffer3 = planeProxy3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[(((imageProxy.getWidth() * imageProxy.getHeight()) / 2) + remaining)];
        int i = 0;
        for (int i2 = 0; i2 < imageProxy.getHeight(); i2++) {
            buffer.get(bArr, i, imageProxy.getWidth());
            i += imageProxy.getWidth();
            buffer.position(Math.min(remaining, (buffer.position() - imageProxy.getWidth()) + planeProxy.getRowStride()));
        }
        int height = imageProxy.getHeight() / 2;
        int width = imageProxy.getWidth() / 2;
        int rowStride = planeProxy3.getRowStride();
        int rowStride2 = planeProxy2.getRowStride();
        int pixelStride = planeProxy3.getPixelStride();
        int pixelStride2 = planeProxy2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        for (int i3 = 0; i3 < height; i3++) {
            buffer3.get(bArr2, 0, Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(rowStride2, buffer2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += pixelStride;
                i5 += pixelStride2;
            }
        }
        return bArr;
    }

    public static final class CodecFailedException extends Exception {
        private FailureType mFailureType;

        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str) {
            super(str);
            this.mFailureType = FailureType.UNKNOWN;
        }

        public FailureType getFailureType() {
            return this.mFailureType;
        }

        public CodecFailedException(String str, FailureType failureType) {
            super(str);
            this.mFailureType = failureType;
        }
    }

    public static boolean isAspectRatioValid(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && isCropAspectRatioHasEffect(size, rational) && !rational.isNaN();
    }

    public static byte[] jpegImageToJpegByteArray(ImageProxy imageProxy, Rect rect, int i) {
        if (imageProxy.getFormat() == 256) {
            return cropJpegByteArray(jpegImageToJpegByteArray(imageProxy), rect, i);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + imageProxy.getFormat());
    }
}
