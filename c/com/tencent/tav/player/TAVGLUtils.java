package com.tencent.tav.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.tav.decoder.logger.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Scanner;

public class TAVGLUtils {
    private static final String TAG = "TAVGLUtils";

    public static String convertStreamToString(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream, "UTF-8").useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static boolean isSupportGLOES3() {
        String glGetString = GLES20.glGetString(7939);
        return glGetString != null && glGetString.contains("GL_OES_EGL_image_external_essl3");
    }

    public static boolean isSupportGLSL3() {
        String glGetString = GLES20.glGetString(35724);
        return glGetString != null && glGetString.contains("OpenGL ES GLSL ES 3");
    }

    public static float lerp(float f, float f2, float f3) {
        return (f * (1.0f - f3)) + (f2 * f3);
    }

    public static String loadShaderCode(Context context, String str) {
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(str);
            String convertStreamToString = convertStreamToString(open);
            if (open != null) {
                try {
                    open.close();
                } catch (IOException unused) {
                }
            }
            return convertStreamToString;
        } catch (Exception e) {
            Logger.m144644e(TAG, "loadShaderCode", (Throwable) e);
            if (inputStream == null) {
                return "";
            }
            try {
                inputStream.close();
                return "";
            } catch (IOException unused2) {
                return "";
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static Bitmap saveBitmap(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glBindTexture(3553, i);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        GLES20.glReadPixels(0, 0, i2, i3, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_4444);
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        GLES20.glBindTexture(3553, 0);
        return createBitmap;
    }
}
