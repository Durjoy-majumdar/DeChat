package com.tencent.liteav.videobase.utils;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C104507p;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

@JNINamespace("liteav::video")
public class OpenGlUtils {
    private static final String TAG = "OpenGlUtils";

    /* renamed from: com.tencent.liteav.videobase.utils.OpenGlUtils$1 */
    public static /* synthetic */ class C1045201 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f309799a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tencent.liteav.videobase.utils.Rotation[] r0 = com.tencent.liteav.videobase.utils.Rotation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f309799a = r0
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_90     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f309799a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_180     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f309799a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.ROTATION_270     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f309799a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tencent.liteav.videobase.utils.Rotation r1 = com.tencent.liteav.videobase.utils.Rotation.NORMAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videobase.utils.OpenGlUtils.C1045201.<clinit>():void");
        }
    }

    public static void attachTextureToFrameBuffer(int i, int i2) {
        GLES20.glBindFramebuffer(36160, i2);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public static void bindFramebuffer(int i, int i2) {
        GLES20.glBindFramebuffer(i, i2);
    }

    public static void bindTexture(int i, int i2) {
        GLES20.glBindTexture(i, i2);
    }

    public static void checkGlError(String str) {
    }

    public static void convertYuvFormat(GLConstants.PixelFormatType pixelFormatType, Object obj, GLConstants.PixelFormatType pixelFormatType2, Object obj2, int i, int i2) {
        int value = pixelFormatType.getValue();
        int value2 = pixelFormatType2.getValue();
        boolean z = obj instanceof ByteBuffer;
        if (!((!z || !(obj2 instanceof ByteBuffer)) ? (!z || !(obj2 instanceof byte[])) ? (!(obj instanceof byte[]) || !(obj2 instanceof ByteBuffer)) ? nativeConvertYuvFormatArrayToArray(value, (byte[]) obj, value2, (byte[]) obj2, i, i2) : nativeConvertYuvFormatArrayToBuffer(value, (byte[]) obj, value2, (ByteBuffer) obj2, i, i2) : nativeConvertYuvFormatBufferToArray(value, (ByteBuffer) obj, value2, (byte[]) obj2, i, i2) : nativeConvertYuvFormatBufferToBuffer(value, (ByteBuffer) obj, value2, (ByteBuffer) obj2, i, i2))) {
            throw new IllegalArgumentException("Do not support " + pixelFormatType + " to " + pixelFormatType2);
        }
    }

    public static FloatBuffer createNormalCubeVerticesBuffer() {
        float[] fArr = GLConstants.f309789c;
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
    }

    public static int createTexture(int i, int i2, int i3, int i4) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        LiteavLog.m16896d(TAG, "glGenTextures textureId: " + iArr[0]);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, i4, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
        return iArr[0];
    }

    public static FloatBuffer createTextureCoordsBuffer(Rotation rotation, boolean z, boolean z2) {
        float[] fArr = GLConstants.f309790d;
        float[] fArr2 = new float[fArr.length];
        initTextureCoordsBuffer(fArr2, rotation, z, z2);
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr2).position(0);
        return asFloatBuffer;
    }

    public static void deleteFrameBuffer(int i) {
        if (i != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        }
    }

    public static void deleteShaderId(int i) {
        if (i != -1) {
            GLES20.glDeleteShader(i);
        }
    }

    public static void deleteTexture(int i) {
        if (i != -1) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
    }

    public static void detachTextureFromFrameBuffer(int i) {
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    private static float flip(float f) {
        return f == 0.0f ? 1.0f : 0.0f;
    }

    public static int generateFrameBufferId() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static int generateTextureOES() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static Object getCurrentContext() {
        return LiteavSystemInfo.getSystemOSVersionInt() >= 17 ? EGL14.eglGetCurrentContext() : ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public static void glViewport(int i, int i2, int i3, int i4) {
        GLES20.glViewport(i, i2, i3, i4);
    }

    public static void initTextureCoordsBuffer(float[] fArr, Rotation rotation, boolean z, boolean z2) {
        float[] fArr2 = GLConstants.f309790d;
        if (rotation != null) {
            int i = C1045201.f309799a[rotation.ordinal()];
            if (i == 1) {
                fArr2 = GLConstants.f309792f;
            } else if (i == 2) {
                fArr2 = GLConstants.f309793g;
            } else if (i == 3) {
                fArr2 = GLConstants.f309791e;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z) {
            fArr[0] = flip(fArr[0]);
            fArr[2] = flip(fArr[2]);
            fArr[4] = flip(fArr[4]);
            fArr[6] = flip(fArr[6]);
        }
        if (z2) {
            fArr[1] = flip(fArr[1]);
            fArr[3] = flip(fArr[3]);
            fArr[5] = flip(fArr[5]);
            fArr[7] = flip(fArr[7]);
        }
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            LiteavLog.m16896d(TAG, "glGenTextures textureId: " + iArr[0]);
            bindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            bindTexture(3553, i);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void loadYuv420DataToTextures(ByteBuffer byteBuffer, int i, int i2, int i3, int[] iArr) {
        if (byteBuffer.isDirect()) {
            nativeLoadYuv420ByteBufferToTextures(byteBuffer, i, i2, i3, iArr);
        } else {
            nativeLoadYuv420ByteArrayToTextures(byteBuffer.array(), i, i2, i3, iArr);
        }
    }

    private static native boolean nativeConvertYuvFormatArrayToArray(int i, byte[] bArr, int i2, byte[] bArr2, int i3, int i4);

    private static native boolean nativeConvertYuvFormatArrayToBuffer(int i, byte[] bArr, int i2, ByteBuffer byteBuffer, int i3, int i4);

    private static native boolean nativeConvertYuvFormatBufferToArray(int i, ByteBuffer byteBuffer, int i2, byte[] bArr, int i3, int i4);

    private static native boolean nativeConvertYuvFormatBufferToBuffer(int i, ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public static native void nativeCopyDataFromByteArrayToByteBuffer(byte[] bArr, ByteBuffer byteBuffer, int i);

    public static native void nativeCopyDataFromByteBufferToByteArray(ByteBuffer byteBuffer, byte[] bArr, int i);

    public static native void nativeCopyDataFromByteBufferToByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i);

    private static native void nativeLoadYuv420ByteArrayToTextures(byte[] bArr, int i, int i2, int i3, int[] iArr);

    private static native void nativeLoadYuv420ByteBufferToTextures(ByteBuffer byteBuffer, int i, int i2, int i3, int[] iArr);

    public static void readPixels(int i, int i2, int i3, int i4, Object obj) {
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            buffer.position(0);
            GLES20.glReadPixels(i, i2, i3, i4, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer);
        } else if (obj instanceof byte[]) {
            GLES20.glReadPixels(i, i2, i3, i4, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, ByteBuffer.wrap((byte[]) obj));
        } else {
            LiteavLog.m16898e(TAG, "read pixels failed due to unsupport object. ".concat(String.valueOf(obj)));
        }
    }

    public static Point reverseMappingPoint(GLConstants.GLScaleType gLScaleType, Rotation rotation, Point point, C104507p pVar, C104507p pVar2) {
        float f = (((float) pVar2.f309736a) * 1.0f) / ((float) pVar.f309736a);
        float f2 = (((float) pVar2.f309737b) * 1.0f) / ((float) pVar.f309737b);
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) (-pVar.f309736a)) / 2.0f, ((float) (-pVar.f309737b)) / 2.0f);
        if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
            float min = Math.min(f, f2);
            matrix.postScale(min, min);
        } else if (gLScaleType == GLConstants.GLScaleType.FILL) {
            matrix.postScale(f, f2);
        } else if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            float max = Math.max(f, f2);
            matrix.postScale(max, max);
        }
        matrix.postRotate((float) (360 - rotation.mValue));
        if (rotation == Rotation.ROTATION_90 || rotation == Rotation.ROTATION_270) {
            matrix.postTranslate(((float) pVar2.f309737b) / 2.0f, ((float) pVar2.f309736a) / 2.0f);
        } else {
            matrix.postTranslate(((float) pVar2.f309736a) / 2.0f, ((float) pVar2.f309737b) / 2.0f);
        }
        float[] fArr = new float[2];
        matrix.mapPoints(fArr, new float[]{(float) point.x, (float) point.y});
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public static int loadTexture(int i, Buffer buffer, int i2, int i3, int i4) {
        int i5 = i4;
        int[] iArr = new int[1];
        if (i5 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            LiteavLog.m16896d(TAG, "glGenTextures textureId: " + iArr[0]);
            bindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, i, i2, i3, 0, i, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer);
        } else {
            bindTexture(3553, i5);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i2, i3, i, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, buffer);
            iArr[0] = i5;
        }
        return iArr[0];
    }
}
