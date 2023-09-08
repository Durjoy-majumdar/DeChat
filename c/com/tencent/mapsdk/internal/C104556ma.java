package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.ma */
public final class C104556ma {

    /* renamed from: a */
    public static final long f309944a = 20;

    /* renamed from: b */
    public static int f309945b = 0;

    /* renamed from: c */
    private static final int f309946c = 0;

    /* renamed from: d */
    private static final int f309947d = 1;

    /* renamed from: e */
    private static final int f309948e = 2;

    static {
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory <= 16777216) {
            f309945b = 1;
        } else if (maxMemory >= 67108864) {
            f309945b = 2;
        } else {
            f309945b = 0;
        }
    }

    /* renamed from: a */
    public static double m140030a(double d, double d2, long j, long j2) {
        return ((d2 - d) * (((double) j2) / ((double) j))) + d;
    }

    /* renamed from: a */
    private static boolean m140039a() {
        return f309945b == 1;
    }

    /* renamed from: b */
    public static double m140040b(double d, double d2, long j, long j2) {
        double d3 = ((double) j2) / ((double) j);
        return ((d2 - d) * d3 * d3) + d;
    }

    /* renamed from: b */
    private static ShortBuffer m140041b(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.rewind();
        return asShortBuffer;
    }

    /* renamed from: c */
    public static double m140042c(double d, double d2, long j, long j2) {
        double d3 = (((double) j2) / ((double) j)) - 1.0d;
        return ((d2 - d) * (1.0d - (d3 * d3))) + d;
    }

    /* renamed from: c */
    private static float[] m140043c(int i) {
        return new float[]{((float) ((i >> 16) & 255)) / 255.0f, ((float) ((i >> 8) & 255)) / 255.0f, ((float) (i & 255)) / 255.0f, ((float) ((i >> 24) & 255)) / 255.0f};
    }

    /* renamed from: d */
    public static double m140044d(double d, double d2, long j, long j2) {
        double d3 = ((double) j2) / ((double) j);
        double d4 = d3 * d3;
        double d5 = d4 * d4;
        return ((d2 - d) * d5 * d5) + d;
    }

    /* renamed from: e */
    public static double m140045e(double d, double d2, long j, long j2) {
        double d3 = (((double) j2) / ((double) j)) - 1.0d;
        double d4 = d3 * d3;
        double d5 = d4 * d4;
        return ((d2 - d) * (1.0d - (d5 * d5))) + d;
    }

    /* renamed from: f */
    private static double m140046f(double d, double d2, long j, long j2) {
        double d3 = ((double) j2) / ((double) j);
        return ((d2 - d) * d3 * d3 * d3 * d3) + d;
    }

    /* renamed from: g */
    private static double m140047g(double d, double d2, long j, long j2) {
        double d3 = (((double) j2) / ((double) j)) - 1.0d;
        return ((d2 - d) * (1.0d - (((d3 * d3) * d3) * d3))) + d;
    }

    /* renamed from: h */
    private static double m140048h(double d, double d2, long j, long j2) {
        double d3 = ((double) j2) / ((double) (j - 1));
        double d4 = d3 * d3;
        return ((d - d2) * (1.0d - (d4 * d4))) + d2;
    }

    /* renamed from: a */
    private static FloatBuffer m140035a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    /* renamed from: a */
    private static FloatBuffer m140034a(int i) {
        ByteBuffer byteBuffer;
        ByteBuffer.allocate(0);
        int i2 = i * 4;
        try {
            byteBuffer = ByteBuffer.allocateDirect(i2);
        } catch (OutOfMemoryError unused) {
            byteBuffer = ByteBuffer.allocateDirect(i2);
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = byteBuffer.asFloatBuffer();
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    /* renamed from: a */
    private static FloatBuffer m140036a(float[] fArr, FloatBuffer floatBuffer) {
        int length = fArr.length;
        if (floatBuffer == null || floatBuffer.capacity() != length) {
            floatBuffer = m140034a(length);
        }
        floatBuffer.put(fArr);
        floatBuffer.rewind();
        return floatBuffer;
    }

    /* renamed from: a */
    private static ShortBuffer m140037a(short[] sArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.put(sArr);
        asShortBuffer.rewind();
        return asShortBuffer;
    }

    /* renamed from: a */
    private static ShortBuffer m140038a(short[] sArr, ShortBuffer shortBuffer) {
        int length = sArr.length;
        if (shortBuffer == null || shortBuffer.capacity() != length) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length * 2);
            allocateDirect.order(ByteOrder.nativeOrder());
            shortBuffer = allocateDirect.asShortBuffer();
            shortBuffer.rewind();
        }
        shortBuffer.put(sArr);
        shortBuffer.rewind();
        return shortBuffer;
    }

    /* renamed from: a */
    private static int m140032a(GL10 gl10, Bitmap bitmap) {
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        gl10.glBindTexture(3553, i);
        gl10.glTexParameterf(3553, 10241, 9729.0f);
        gl10.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return i;
    }

    /* renamed from: a */
    private static Bitmap m140033a(Bitmap bitmap) {
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
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    /* renamed from: a */
    private static int m140031a(float f) {
        int i = 1;
        while (true) {
            int i2 = i + 1;
            int i3 = 2 << i;
            if (i3 >= ((int) Math.ceil((double) f))) {
                return i3;
            }
            i = i2;
        }
    }
}
