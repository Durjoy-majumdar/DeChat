package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.opengl.GLUtils;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.mc */
public final class C104557mc {

    /* renamed from: a */
    public static final int f309949a = 1;

    /* renamed from: b */
    public static final int f309950b = 2;

    /* renamed from: a */
    private static float m140049a(float f, float f2) {
        return (float) ((int) ((f * f2) + 0.5f));
    }

    /* renamed from: a */
    private static Bitmap m140054a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = 2;
        int i2 = 2;
        while (i2 < width) {
            i2 <<= 1;
        }
        while (i < height) {
            i <<= 1;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(0);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setDensity(0);
            createBitmap.eraseColor(0);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Bitmap m140062b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = 2;
        int i2 = 2;
        while (i2 < width) {
            i2 <<= 1;
        }
        while (i < height) {
            i <<= 1;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i, false);
        if (createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    /* renamed from: c */
    private static Bitmap m140066c(TencentMapContext tencentMapContext, Bitmap bitmap, String str, int i, int i2) {
        C104558mm mmVar = new C104558mm(tencentMapContext);
        mmVar.setColor(i);
        mmVar.setTextSize(m140049a((float) i2, 2.0f));
        mmVar.setTypeface(Typeface.DEFAULT_BOLD);
        float f = mmVar.getFontMetrics().bottom - mmVar.getFontMetrics().top;
        int ceil = (int) Math.ceil((double) (Math.max((float) bitmap.getWidth(), mmVar.measureText(str)) + 0.0f));
        int ceil2 = (int) Math.ceil((double) (Math.max((float) bitmap.getHeight(), f) + 0.0f));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new Paint());
        float f2 = (float) ceil2;
        float f3 = (f2 - ((f2 - f) / 2.0f)) - mmVar.getFontMetrics().bottom;
        mmVar.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) (((long) ceil) / 2), f3, mmVar);
        return createBitmap;
    }

    /* renamed from: b */
    private static int m140061b(GL10 gl10) {
        int a = m140051a(gl10);
        gl10.glBindTexture(3553, a);
        gl10.glTexParameterf(3553, 10241, 9729.0f);
        gl10.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        gl10.glTexParameterf(3553, 10242, 33071.0f);
        gl10.glTexParameterf(3553, 10243, 33071.0f);
        return a;
    }

    /* renamed from: a */
    private static Bitmap m140056a(InputStream inputStream) {
        return BitmapFactory.decodeStream(inputStream, (Rect) null, m140059a());
    }

    /* renamed from: b */
    private static Bitmap m140065b(byte[] bArr) {
        return m140062b(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, m140059a()));
    }

    /* renamed from: a */
    private static Bitmap m140058a(byte[] bArr) {
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, m140059a());
    }

    /* renamed from: a */
    private static BitmapFactory.Options m140059a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return options;
    }

    /* renamed from: b */
    private static Bitmap m140064b(InputStream inputStream) {
        return m140062b(BitmapFactory.decodeStream(inputStream, (Rect) null, m140059a()));
    }

    /* renamed from: b */
    private static Bitmap m140063b(TencentMapContext tencentMapContext, Bitmap bitmap, String str, int i, int i2) {
        C104558mm mmVar = new C104558mm(tencentMapContext);
        mmVar.setColor(i);
        mmVar.setTextSize(m140049a((float) i2, 2.0f));
        mmVar.setTypeface(Typeface.DEFAULT_BOLD);
        float f = mmVar.getFontMetrics().bottom - mmVar.getFontMetrics().top;
        int ceil = (int) Math.ceil((double) (Math.max((float) bitmap.getWidth(), mmVar.measureText(str)) + 0.0f));
        int ceil2 = (int) Math.ceil((double) (Math.max((float) bitmap.getHeight(), f) + 0.0f));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new Paint());
        float f2 = (float) ceil2;
        float f3 = (f2 - ((f2 - f) / 2.0f)) - mmVar.getFontMetrics().bottom;
        mmVar.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) (((long) ceil) / 2), f3, mmVar);
        return createBitmap;
    }

    /* renamed from: a */
    private static int m140053a(GL10 gl10, Bitmap bitmap) {
        int b = m140061b(gl10);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return b;
    }

    /* renamed from: a */
    private static void m140060a(GL10 gl10, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        asIntBuffer.put(i);
        asIntBuffer.position(0);
        gl10.glDeleteTextures(1, asIntBuffer);
    }

    /* renamed from: a */
    private static int m140052a(GL10 gl10, int i, int i2, int i3, int i4, IntBuffer intBuffer) {
        int b = m140061b(gl10);
        gl10.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i, i2, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
        gl10.glTexSubImage2D(3553, 0, 0, 0, i3, i4, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, intBuffer);
        return b;
    }

    /* renamed from: a */
    private static float m140050a(TencentMapContext tencentMapContext, String str, int i, float f) {
        C104558mm mmVar = new C104558mm(tencentMapContext);
        mmVar.setTextSize(m140049a((float) i, f));
        mmVar.setTypeface(Typeface.DEFAULT_BOLD);
        return mmVar.measureText(str);
    }

    /* renamed from: a */
    private static Bitmap m140057a(String str, float f, int i, int i2, int i3, Typeface typeface) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setTextSize(f);
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        Paint paint2 = new Paint(paint);
        paint2.setColor(i2);
        paint2.setStrokeWidth(paint.getStrokeWidth() + 2.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f2 = fontMetrics.bottom - fontMetrics.top;
        if (i3 == 1) {
            int ceil = (int) Math.ceil((double) (((f2 + 2.0f) * ((float) str.length())) + 4.0f));
            float f3 = 0.0f - fontMetrics.top;
            Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil((double) (paint2.measureText(str.substring(0, 1)) + 4.0f)), ceil, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            for (int i4 = 0; i4 < str.length(); i4++) {
                char charAt = str.charAt(i4);
                canvas.drawText(String.valueOf(charAt), 2.0f, f3, paint2);
                canvas.drawText(String.valueOf(charAt), 2.0f, f3, paint);
                f3 += f2;
            }
            return createBitmap;
        } else if (i3 != 2) {
            return null;
        } else {
            int ceil2 = (int) Math.ceil((double) (paint2.measureText(str) + 4.0f));
            int ceil3 = (int) Math.ceil((double) f2);
            Bitmap createBitmap2 = Bitmap.createBitmap(ceil2, ceil3, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            float f4 = (float) (((long) ceil2) / 2);
            float f5 = (float) ((((long) ceil3) / 2) + 1);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint.setTextAlign(Paint.Align.CENTER);
            canvas2.drawText(str, f4, f5, paint2);
            canvas2.drawText(str, f4, f5, paint);
            return createBitmap2;
        }
    }

    /* renamed from: a */
    private static int m140051a(GL10 gl10) {
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    /* renamed from: a */
    private static Bitmap m140055a(TencentMapContext tencentMapContext, Bitmap bitmap, String str, int i, int i2) {
        C104558mm mmVar = new C104558mm(tencentMapContext);
        mmVar.setColor(i);
        mmVar.setTextSize(m140049a((float) i2, 2.0f));
        mmVar.setTypeface(Typeface.DEFAULT_BOLD);
        float f = mmVar.getFontMetrics().bottom - mmVar.getFontMetrics().top;
        int ceil = (int) Math.ceil((double) (Math.max((float) bitmap.getWidth(), mmVar.measureText(str)) + 0.0f));
        int ceil2 = (int) Math.ceil((double) (Math.max((float) bitmap.getHeight(), f) + 0.0f));
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new Paint());
        float f2 = (float) ceil2;
        float f3 = (f2 - ((f2 - f) / 2.0f)) - mmVar.getFontMetrics().bottom;
        mmVar.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) (((long) ceil) / 2), f3, mmVar);
        return createBitmap;
    }
}
