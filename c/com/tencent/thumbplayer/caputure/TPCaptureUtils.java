package com.tencent.thumbplayer.caputure;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.tencent.thumbplayer.core.common.TPVideoFrame;
import java.nio.ByteBuffer;

public class TPCaptureUtils {
    private static Bitmap byte2Bitmap(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        createBitmap.copyPixelsFromBuffer(wrap);
        if (i3 == 0) {
            return createBitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i3);
        return Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true);
    }

    public static Bitmap frame2Bitmap(TPVideoFrame tPVideoFrame) {
        int i;
        int i2;
        byte[][] bArr = tPVideoFrame.data;
        if (bArr.length <= 0 || (i = tPVideoFrame.height) == 0 || (i2 = tPVideoFrame.width) == 0) {
            return null;
        }
        return byte2Bitmap(bArr[0], i2, i, tPVideoFrame.rotation);
    }

    public static Bitmap[] frame2Bitmaps(TPVideoFrame tPVideoFrame) {
        byte[][] bArr = tPVideoFrame.data;
        if (bArr.length <= 0 || tPVideoFrame.height == 0 || tPVideoFrame.width == 0) {
            return null;
        }
        Bitmap[] bitmapArr = new Bitmap[bArr.length];
        int i = 0;
        while (true) {
            byte[][] bArr2 = tPVideoFrame.data;
            if (i >= bArr2.length) {
                return bitmapArr;
            }
            bitmapArr[i] = byte2Bitmap(bArr2[i], tPVideoFrame.width, tPVideoFrame.height, tPVideoFrame.rotation);
            i++;
        }
    }
}
