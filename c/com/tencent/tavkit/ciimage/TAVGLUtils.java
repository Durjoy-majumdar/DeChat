package com.tencent.tavkit.ciimage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Environment;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.RenderContext;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class TAVGLUtils {
    private static final String TAG = "TAVGLUtils";
    private static final String TAV_DEBUG_IMAGE_DIR = (Environment.getExternalStorageDirectory().getPath() + "/TAV调试图片");

    private static TextureInfo checkTextureInfo(TextureInfo textureInfo) {
        if (textureInfo.textureType == 3553) {
            return textureInfo;
        }
        TextureInfo textureInfo2 = new TextureInfo(RenderContext.createTexture(3553), 3553, textureInfo.width, textureInfo.height, (Matrix) null, 0);
        TextureFilter textureFilter = new TextureFilter();
        textureFilter.setOutputTextureInfo(textureInfo2);
        textureFilter.applyFilter(textureInfo, (Matrix) null, textureInfo.getTextureMatrix(), 1.0f, (CGRect) null);
        return textureInfo2;
    }

    public static File newDebugImageFile(int i, int i2, int i3) {
        String str = Long.toHexString(System.currentTimeMillis()) + "_id=" + i + "_" + i2 + "_" + i3 + ".png";
        String str2 = TAV_DEBUG_IMAGE_DIR;
        File file = new File(str2);
        if (file.exists() || file.mkdir()) {
            return new File(str2, str);
        }
        throw new RuntimeException("mkdir return false, path = " + file.getAbsolutePath());
    }

    public static Bitmap saveBitmap(int i, int i2, int i3) {
        return saveBitmap(i, 3553, i2, i3);
    }

    public static void saveBitmapToFile(TextureInfo textureInfo) {
        saveBitmapToFile(textureInfo, newDebugImageFile(textureInfo.textureID, textureInfo.width, textureInfo.height));
    }

    public static Bitmap saveBitmap(int i, int i2, int i3, int i4) {
        return saveBitmap(new TextureInfo(i, i2, i3, i4, 0));
    }

    public static Bitmap saveBitmap(CIImage cIImage) {
        TextureInfo newTextureInfo = CIContext.newTextureInfo(cIImage.getSize().width, cIImage.getSize().height);
        CIImageFilter cIImageFilter = new CIImageFilter();
        cIImageFilter.setOutputTextureInfo(newTextureInfo);
        cIImage.draw(cIImageFilter);
        return saveBitmap(newTextureInfo);
    }

    public static void saveBitmapToFile(TextureInfo textureInfo, File file) {
        saveBitmapToFile(saveBitmap(textureInfo), file);
    }

    public static Bitmap saveBitmap(TextureInfo textureInfo) {
        TextureInfo checkTextureInfo = checkTextureInfo(textureInfo);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, checkTextureInfo.textureID, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(checkTextureInfo.width * checkTextureInfo.height * 4);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        allocateDirect.rewind();
        GLES20.glReadPixels(0, 0, checkTextureInfo.width, checkTextureInfo.height, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(checkTextureInfo.width, checkTextureInfo.height, Bitmap.Config.ARGB_4444);
        allocateDirect.rewind();
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return createBitmap;
    }

    public static void saveBitmapToFile(Bitmap bitmap) {
        saveBitmapToFile(bitmap, newDebugImageFile(0, bitmap.getWidth(), bitmap.getHeight()));
    }

    public static void saveBitmapToFile(Bitmap bitmap, File file) {
        if (file.createNewFile()) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
            return;
        }
        throw new RuntimeException("createNewFile return false, path = " + file.getAbsolutePath());
    }
}
