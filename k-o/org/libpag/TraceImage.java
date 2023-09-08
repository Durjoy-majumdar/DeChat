package org.libpag;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class TraceImage {
    public static void Trace(String str, ByteBuffer byteBuffer, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(byteBuffer);
        createBitmap.getWidth();
        createBitmap.getHeight();
    }
}
