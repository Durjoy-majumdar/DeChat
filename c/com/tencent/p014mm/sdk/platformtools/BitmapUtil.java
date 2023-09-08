package com.tencent.p014mm.sdk.platformtools;

import a70.C112760b;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.ScopedStorageUtil;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2encoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import p823sg.C101610c;

/* renamed from: com.tencent.mm.sdk.platformtools.BitmapUtil */
public class BitmapUtil {
    private static final int ANDROID_API_LEVEL_11 = 11;
    private static final int DEFAULT_DECODE_MARK_SIZE = 8388608;
    private static final int DEFAULT_TARGET_WIDTH = 2500;
    private static long MAGIC_FREE_BUFFER = ((long) (((double) Runtime.getRuntime().maxMemory()) * 0.05d));
    public static final int MAX_DECODE_PICTURE_SIZE = 2764800;
    public static final int RECORDING_CANVAS_MAX_BITMAP_SIZE = 104857600;
    public static final double SCALE_HORIZONTAL = 1.2d;
    private static final String TAG = "MicroMsg.BitmapUtil";
    public static final long WX_MAX_BITMAP_SIZE = 99614720;
    public static boolean hasNoInNativeField;
    private static DisplayMetrics metrics = null;
    private static boolean sDisableMediaApi;

    /* renamed from: com.tencent.mm.sdk.platformtools.BitmapUtil$ImageWriteOSCallback */
    public interface ImageWriteOSCallback {
        void callback(OutputStream outputStream);
    }

    public static byte[] Bitmap2Bytes(Bitmap bitmap) {
        return Bitmap2Bytes(bitmap, 100);
    }

    public static byte[] Bitmap2PngBytes(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        compress(bitmap, Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return byteArray;
    }

    public static void bindlowMemeryOption(BitmapFactory.Options options) {
    }

    public static Bitmap bitmapFromRgba(int i, int i2, byte[] bArr) {
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i4 + 1;
            byte b = bArr[i4] & ExifInterface.MARKER;
            int i6 = i5 + 1;
            byte b2 = bArr[i5] & ExifInterface.MARKER;
            int i7 = i6 + 1;
            iArr[i3] = (b << v2encoder.enumCODEC_vcodec2) | ((bArr[i7] & ExifInterface.MARKER) << 24) | (b2 << 8) | (bArr[i6] & ExifInterface.MARKER);
            i3++;
            i4 = i7 + 1;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
            return createBitmap;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "bitmapFromRgba throw Exception", new Object[0]);
            return null;
        }
    }

    public static Bitmap blendBitmap(Bitmap bitmap, Bitmap bitmap2, RectF rectF) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (Paint) null);
        Rect rect = new Rect();
        rectF.round(rect);
        canvas.drawBitmap(bitmap2, rect, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), (Paint) null);
        return createBitmap;
    }

    public static int calculateInSampleSize(int i, int i2, int i3, int i4) {
        if (i <= i4 && i2 <= i3) {
            return 1;
        }
        int round = i2 > i ? Math.round((((float) i) / ((float) i4)) + 0.5f) : Math.round((((float) i2) / ((float) i3)) + 0.5f);
        while (((float) (i2 * i)) / ((float) (round * round)) > ((float) (i3 * i4 * 2))) {
            round++;
        }
        return round;
    }

    public static int checkDegree(String str) {
        return Exif.fromFile(str).getOrientationInDegree();
    }

    public static Bitmap checkImgInsideCanvasMaxBitmapSize(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            long min = Math.min(getMaxJavaFreeHeap(), WX_MAX_BITMAP_SIZE);
            long bitmapSize = (long) getBitmapSize(bitmap);
            Log.m105925i(TAG, "checkImgInsideCanvasMaxBitmapSize: current free memory: %d, previewDecodedBmLength: %d", Long.valueOf(min), Long.valueOf(bitmapSize));
            if (min >= bitmapSize) {
                return bitmap;
            }
            double sqrt = Math.sqrt(((double) min) / ((double) bitmapSize));
            Log.m105927v(TAG, "checkImgInsideCanvasMaxBitmapSize: scale is %f", Double.valueOf(sqrt));
            float f = (float) sqrt;
            return scaleBitmap(bitmap, f, f);
        } catch (OutOfMemoryError e) {
            Log.printErrStackTrace(TAG, e, "checkImgInsideCanvasMaxBitmapSize: out of memory! try use fallback bitmap", new Object[0]);
            return bitmap;
        } catch (Exception e2) {
            Log.printErrStackTrace(TAG, e2, "checkImgInsideCanvasMaxBitmapSize, others", new Object[0]);
            return bitmap;
        }
    }

    private static boolean checkTimeout(long j, long j2) {
        return j2 != -1 && System.currentTimeMillis() - j > j2;
    }

    public static boolean compress(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i, OutputStream outputStream) {
        if (bitmap == null) {
            Log.m105921e(TAG, "bitmap error %s", bitmap);
            return false;
        }
        boolean compress = bitmap.compress(compressFormat, i, outputStream);
        if (!compress) {
            Log.m105921e(TAG, "compress error %s", Util.getStack().toString());
        }
        return compress;
    }

    public static boolean convertImageFile(C86009m1 m1Var, C86009m1 m1Var2, Bitmap.CompressFormat compressFormat) {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            MMBitmapFactory.Options options = new MMBitmapFactory.Options();
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(C86013q1.m106426H(m1Var2));
            try {
                boolean convertImageFile = convertImageFile(m1Var, bufferedOutputStream2, options, compressFormat);
                Util.qualityClose(bufferedOutputStream2);
                return convertImageFile;
            } catch (OutOfMemoryError e) {
                e = e;
                bufferedOutputStream = bufferedOutputStream2;
                Log.printErrStackTrace(TAG, e, "[-] OOM when convert source image: %s", m1Var.mo119971i());
                Util.qualityClose(bufferedOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                try {
                    Log.printErrStackTrace(TAG, th, "[-] Fail to convert source image: %s", m1Var.mo119971i());
                    return false;
                } finally {
                    Util.qualityClose(bufferedOutputStream);
                }
            }
        } catch (OutOfMemoryError e2) {
            e = e2;
            Log.printErrStackTrace(TAG, e, "[-] OOM when convert source image: %s", m1Var.mo119971i());
            Util.qualityClose(bufferedOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            Log.printErrStackTrace(TAG, th, "[-] Fail to convert source image: %s", m1Var.mo119971i());
            return false;
        }
    }

    public static Bitmap createBitmap(int i, int i2, Bitmap.Config config, boolean z) {
        int i3;
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(i, i2, config);
        } catch (Throwable unused) {
        }
        setBitmapDensity(bitmap);
        return BitmapTracer.trace(bitmap);
    }

    public static Bitmap createBitmapByPixels(int[] iArr, int i, int i2, Bitmap.Config config) {
        Bitmap createBitmap = createBitmap(i, i2, config);
        if (createBitmap != null) {
            if (i != createBitmap.getWidth() || i2 != createBitmap.getHeight()) {
                return null;
            }
            createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        }
        setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    public static Bitmap createBitmapWithColor(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static Bitmap createChattingImage(Bitmap bitmap, int i) {
        Log.m105918d(TAG, "begin createChattingImage");
        long currentTimeMillis = System.currentTimeMillis();
        if (bitmap == null) {
            Log.m105928w(TAG, "sourceBitmap is null .");
            return null;
        }
        setBitmapDensity(bitmap);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= 0 || height <= 0) {
            Log.m105928w(TAG, "sourceBitmap width or height is 0.");
            return null;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            Bitmap createBitmap = createBitmap(width, height, Bitmap.Config.ARGB_8888);
            NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) MMApplicationContext.getContext().getResources().getDrawable(i);
            ninePatchDrawable.setBounds(0, 0, width, height);
            ninePatchDrawable.draw(new Canvas(createBitmap));
            Log.m105918d(TAG, "create nine patch bitmap " + (System.currentTimeMillis() - currentTimeMillis2));
            if (createBitmap == null) {
                Log.m105920e(TAG, "[createChattingImage] maskBitmap is null.");
                return null;
            }
            int width2 = createBitmap.getWidth();
            int height2 = createBitmap.getHeight();
            if (width2 <= 0 || height2 <= 0) {
                Log.m105928w(TAG, "maskBitmap width or height is 0.");
                return null;
            } else if (height2 == height && width2 == width) {
                int[] iArr = new int[(width * height)];
                int i2 = width2 * height2;
                int[] iArr2 = iArr;
                int i3 = width;
                int[] iArr3 = new int[i2];
                int i4 = width;
                int[] iArr4 = iArr;
                int i5 = height;
                bitmap.getPixels(iArr2, 0, i3, 0, 0, i4, i5);
                createBitmap.getPixels(iArr3, 0, i3, 0, 0, i4, i5);
                long currentTimeMillis3 = System.currentTimeMillis();
                int i6 = 0;
                while (i6 < i2) {
                    try {
                        int i7 = iArr3[i6];
                        if (i7 != -16777216) {
                            if (i7 == 0) {
                                iArr4[i6] = 0;
                            } else if (i7 != -1) {
                                iArr4[i6] = i7 & iArr4[i6];
                            }
                        }
                        i6++;
                    } catch (Exception e) {
                        Log.m105920e(TAG, e.toString());
                    }
                }
                Log.m105918d(TAG, "meger pixels  " + (System.currentTimeMillis() - currentTimeMillis3));
                long currentTimeMillis4 = System.currentTimeMillis();
                createBitmap.setPixels(iArr4, 0, width, 0, 0, width, height);
                Log.m105918d(TAG, "setPixels " + (System.currentTimeMillis() - currentTimeMillis4));
                Log.m105918d(TAG, "createTime" + (System.currentTimeMillis() - currentTimeMillis));
                setBitmapDensity(createBitmap);
                return BitmapTracer.trace(createBitmap);
            } else {
                Log.m105920e(TAG, "maskHeiht maskWidth != height width.");
                return null;
            }
        } catch (Exception unused) {
            Log.m105920e(TAG, "[createChattingImage] create nine pathc bitmap faild.");
            return null;
        }
    }

    public static Bitmap createColorBitmap(int i, int i2, int i3) {
        try {
            Bitmap createBitmap = createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(i);
            return BitmapTracer.trace(createBitmap);
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return null;
        }
    }

    public static Bitmap createLayerBitmap(Bitmap bitmap, Bitmap bitmap2, boolean z) {
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = Integer.valueOf(bitmap == null ? 0 : bitmap.getWidth());
        objArr[1] = Integer.valueOf(bitmap == null ? 0 : bitmap.getHeight());
        objArr[2] = Integer.valueOf(bitmap2 == null ? 0 : bitmap2.getWidth());
        if (bitmap2 != null) {
            i = bitmap2.getHeight();
        }
        objArr[3] = Integer.valueOf(i);
        Log.m105925i(TAG, "src(%d,%d) background(%d,%d)", objArr);
        if (bitmap == null || bitmap2 == null) {
            return null;
        }
        int max = Math.max(bitmap.getWidth(), bitmap2.getWidth());
        int max2 = Math.max(bitmap.getHeight(), bitmap2.getHeight());
        Bitmap trace = BitmapTracer.trace(createBitmap(max, max2, Bitmap.Config.ARGB_8888));
        Canvas canvas = new Canvas(trace);
        canvas.drawBitmap(bitmap2, ((float) (max - bitmap2.getWidth())) / 2.0f, ((float) (max2 - bitmap2.getHeight())) / 2.0f, new Paint());
        canvas.drawBitmap(bitmap, ((float) (max - bitmap.getWidth())) / 2.0f, ((float) (max2 - bitmap.getHeight())) / 2.0f, new Paint());
        if (z) {
            bitmap2.recycle();
            bitmap.recycle();
        }
        return trace;
    }

    public static Bitmap createLocation(int i, int i2, int i3, int i4) {
        if (i < 0 || i2 < 0 || i3 < 0 || i4 < 0) {
            Log.m105928w(TAG, "createLocation fail. srcResId or maskResId is null,or width/height <0");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap trace = BitmapTracer.trace(createBitmap(i3, i4, Bitmap.Config.ARGB_8888));
        setBitmapDensity(trace);
        NinePatchDrawable ninePatchDrawable = (NinePatchDrawable) MMApplicationContext.getContext().getResources().getDrawable(i);
        ninePatchDrawable.setBounds(0, 0, i3, i4);
        ninePatchDrawable.draw(new Canvas(trace));
        Log.m105918d(TAG, "create nine patch bitmap " + (System.currentTimeMillis() - currentTimeMillis));
        return createChattingImage(trace, i2);
    }

    public static Bitmap createMaskImage(Bitmap bitmap, int i, int i2, int i3) {
        if (bitmap == null || i < 0 || i2 < 0 || i3 < 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap trace = BitmapTracer.trace(createBitmap(i2, i3, Bitmap.Config.ARGB_8888));
        Canvas canvas = new Canvas(trace);
        Log.m105919d(TAG, "bm size w %d h %d target w %d h %d", Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), Integer.valueOf(i2), Integer.valueOf(i3));
        canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, i2, i3), new Paint());
        Log.m105918d(TAG, "create nine patch bitmap " + (System.currentTimeMillis() - currentTimeMillis));
        return createChattingImage(trace, i);
    }

    public static Path createRoundedRectPath(RectF rectF, float f, float f2, float f3, float f4) {
        Path path = new Path();
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        path.moveTo(rectF.left + f, rectF.top);
        path.lineTo(rectF.right - f2, rectF.top);
        float f5 = rectF.right;
        float f6 = rectF.top;
        path.quadTo(f5, f6, f5, f2 + f6);
        path.lineTo(rectF.right, rectF.bottom - f3);
        float f7 = rectF.right;
        float f8 = rectF.bottom;
        path.quadTo(f7, f8, f7 - f3, f8);
        path.lineTo(rectF.left + f4, rectF.bottom);
        float f9 = rectF.left;
        float f15 = rectF.bottom;
        path.quadTo(f9, f15, f9, f15 - f4);
        path.lineTo(rectF.left, rectF.top + f);
        float f16 = rectF.left;
        float f17 = rectF.top;
        path.quadTo(f16, f17, f + f16, f17);
        path.close();
        return path;
    }

    public static Bitmap createShareAppImage(int i, int i2) {
        if (i < 0 || i2 < 0) {
            Log.m105928w(TAG, "createShareAppImage fail. srcResId or maskResId is null");
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap trace = BitmapTracer.trace(getBitmapNative(i));
        Log.m105918d(TAG, "create nine patch bitmap " + (System.currentTimeMillis() - currentTimeMillis));
        return createChattingImage(trace, i2);
    }

    public static Bitmap createThumbBitmap(String str, int i, int i2, boolean z, boolean z2) {
        return createThumbBitmap(str, i, i2, z, z2, 0);
    }

    public static Bitmap createThumbCropBitmap(String str, int i, int i2, boolean z) {
        Bitmap decodeFile = decodeFile(str);
        if (decodeFile == null) {
            return null;
        }
        if (z) {
            int orientationInDegree = Exif.fromFile(str).getOrientationInDegree();
            Log.m105919d(TAG, "degress:%d", Integer.valueOf(orientationInDegree));
            decodeFile = rotate(decodeFile, (float) orientationInDegree);
        }
        return extractThumbNail(decodeFile, i2, i, true, true);
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, String str3, boolean z, boolean z2) {
        return createThumbNail(false, str, i, i2, compressFormat, i3, str2 + str3, z, new PInt(), new PInt(), z2, (C101610c) null, 0);
    }

    public static int createThumbNailMayUseOpt(boolean z, String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, C101610c cVar, int i4) {
        Bitmap extractThumbNail = extractThumbNail(str, i, i2, false);
        if (extractThumbNail == null) {
            return -1;
        }
        Bitmap rotate = rotate(extractThumbNail, (float) Exif.fromFile(str).getOrientationInDegree());
        if (cVar != null) {
            cVar.mo141082a();
        }
        Bitmap drawBackgroundInNeed = drawBackgroundInNeed(rotate, str, i4);
        if (z) {
            try {
                int compressByQualityOptim = ImageOptimLib.compressByQualityOptim(drawBackgroundInNeed, i3, false, str2);
                Log.m105925i(TAG, "dkimgopt compressByQualityOptim ret:%d  [%d,%d,%d] path:%s", Integer.valueOf(compressByQualityOptim), Integer.valueOf(i3), Integer.valueOf(drawBackgroundInNeed.getWidth()), Integer.valueOf(drawBackgroundInNeed.getHeight()), str2);
                return compressByQualityOptim;
            } catch (IOException unused) {
                Log.m105920e(TAG, "create thumbnail from orig failed: " + str2);
                return -2;
            }
        } else {
            saveBitmapToImage(drawBackgroundInNeed, i3, compressFormat, str2, true);
            return 1;
        }
    }

    public static Bitmap createVideoThumbnail(String str, int i) {
        return createVideoThumbnail(str, i, -1);
    }

    public static Bitmap cropBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, i, i2, Math.min(i3, bitmap.getWidth() - i), Math.min(i4, bitmap.getHeight() - i2));
            if (bitmap != createBitmap && z) {
                bitmap.recycle();
            }
            return createBitmap;
        } catch (Throwable unused) {
            if (!z || bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            bitmap.recycle();
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0083 */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0080 A[SYNTHETIC, Splitter:B:43:0x0080] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap decodeBitmap(android.graphics.BitmapFactory.Options r2, byte[] r3, java.lang.String r4, android.net.Uri r5, java.io.InputStream r6, boolean r7, int r8) {
        /*
            r0 = 0
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r3)     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0017
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0017
            if (r5 != 0) goto L_0x0017
            if (r8 > 0) goto L_0x0017
            if (r6 != 0) goto L_0x0017
            setBitmapDensity(r0)
            return r0
        L_0x0017:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r3)     // Catch:{ all -> 0x0084 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0026
            r4 = 0
            int r5 = r3.length     // Catch:{ all -> 0x0084 }
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98733b(r3, r4, r5, r2)     // Catch:{ all -> 0x0084 }
            goto L_0x0075
        L_0x0026:
            if (r8 <= 0) goto L_0x0035
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0084 }
            android.content.res.Resources r3 = r3.getResources()     // Catch:{ all -> 0x0084 }
            android.graphics.Bitmap r2 = p996kj.C88155a.decodeResource(r3, r8, r2)     // Catch:{ all -> 0x0084 }
            goto L_0x0075
        L_0x0035:
            if (r6 == 0) goto L_0x003c
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r6, r0, r2)     // Catch:{ all -> 0x0084 }
            goto L_0x0075
        L_0x003c:
            if (r7 == 0) goto L_0x0058
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x0048
            setBitmapDensity(r0)
            return r0
        L_0x0048:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0055 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ all -> 0x0055 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ all -> 0x0055 }
            goto L_0x006b
        L_0x0055:
            r2 = move-exception
            r3 = r0
            goto L_0x007e
        L_0x0058:
            if (r5 == 0) goto L_0x0067
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0055 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0055 }
            java.io.InputStream r3 = r3.openInputStream(r5)     // Catch:{ all -> 0x0055 }
            goto L_0x006b
        L_0x0067:
            java.io.InputStream r3 = com.tencent.p014mm.vfs.C86013q1.m106423E(r4)     // Catch:{ all -> 0x0055 }
        L_0x006b:
            android.graphics.Bitmap r0 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r3, r0, r2)     // Catch:{ all -> 0x007d }
            if (r3 == 0) goto L_0x0074
            r3.close()     // Catch:{ IOException -> 0x0074 }
        L_0x0074:
            r2 = r0
        L_0x0075:
            setBitmapDensity(r2)
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r2)
            return r2
        L_0x007d:
            r2 = move-exception
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            r3.close()     // Catch:{ IOException -> 0x0083 }
        L_0x0083:
            throw r2     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r2 = move-exception
            setBitmapDensity(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeBitmap(android.graphics.BitmapFactory$Options, byte[], java.lang.String, android.net.Uri, java.io.InputStream, boolean, int):android.graphics.Bitmap");
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i, int i2, Bitmap.Config config) {
        if (Util.isNullOrNil(bArr)) {
            Log.m105928w(TAG, "error input: data is null");
            return null;
        } else if (i >= 0 && i2 >= 0) {
            return getBitmapNative(0, (String) null, bArr, (Uri) null, false, 0.0f, i, i2, config);
        } else {
            Log.m105929w(TAG, "error input: targetWidth %d, targetHeight %d", Integer.valueOf(i), Integer.valueOf(i2));
            return null;
        }
    }

    public static Bitmap decodeByteArrayDisplayMetrics(byte[] bArr) {
        DisplayMetrics defaultDisplayMetrics = getDefaultDisplayMetrics();
        return decodeByteArray(bArr, defaultDisplayMetrics.widthPixels, defaultDisplayMetrics.heightPixels);
    }

    @Deprecated
    public static Bitmap decodeFile(String str) {
        return decodeFile(str, (BitmapFactory.Options) null);
    }

    public static Bitmap decodeFileWithSample(String str) {
        return decodeFileWithSample(str, DEFAULT_TARGET_WIDTH, DEFAULT_TARGET_WIDTH);
    }

    public static Bitmap decodeStream(InputStream inputStream, float f, int i, int i2) {
        return decodeStream(inputStream, f, i, i2, false);
    }

    public static Bitmap drawBackgroundInNeed(Bitmap bitmap, String str, int i) {
        if (bitmap == null || bitmap.isRecycled() || Color.alpha(i) == 0 || !".png".equals(ImgUtil.identifyImgType(str))) {
            return bitmap;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(i);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            bitmap.recycle();
            return BitmapTracer.trace(createBitmap);
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    public static Bitmap extractDrawableThumbNail(Drawable drawable, int i, int i2, boolean z, boolean z2) {
        return extractThumbNail(transformDrawableToBitmap(drawable), i, i2, z, z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC, Splitter:B:23:0x003c] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap extractThumbNail(java.lang.String r10, int r11, int r12, boolean r13) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            java.lang.String r1 = "MicroMsg.BitmapUtil"
            r2 = 0
            if (r0 == 0) goto L_0x000f
            java.lang.String r10 = "extractThumbNail path null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r10)
            return r2
        L_0x000f:
            android.graphics.BitmapFactory$Options r4 = getImageOptions(r10)     // Catch:{ FileNotFoundException -> 0x0030, all -> 0x002e }
            java.io.InputStream r10 = com.tencent.p014mm.vfs.C86013q1.m106423E(r10)     // Catch:{ FileNotFoundException -> 0x0030, all -> 0x002e }
            int r5 = r4.outWidth     // Catch:{ FileNotFoundException -> 0x002c }
            int r6 = r4.outHeight     // Catch:{ FileNotFoundException -> 0x002c }
            r3 = r10
            r7 = r12
            r8 = r11
            r9 = r13
            android.graphics.Bitmap r11 = extractThumbNailFromStream(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ FileNotFoundException -> 0x002c }
            if (r10 == 0) goto L_0x0028
            r10.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            return r11
        L_0x0029:
            r11 = move-exception
            r2 = r10
            goto L_0x0040
        L_0x002c:
            r11 = move-exception
            goto L_0x0032
        L_0x002e:
            r11 = move-exception
            goto L_0x0040
        L_0x0030:
            r11 = move-exception
            r10 = r2
        L_0x0032:
            java.lang.String r12 = "Failed decode bitmap."
            r13 = 0
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0029 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r11, r12, r13)     // Catch:{ all -> 0x0029 }
            if (r10 == 0) goto L_0x003f
            r10.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return r2
        L_0x0040:
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(java.lang.String, int, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap extractThumbNailAssets(String str, int i, int i2) {
        return getBitmapNative(0, str, (byte[]) null, (Uri) null, true, 0.0f, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e4 A[Catch:{ OutOfMemoryError -> 0x024a }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e5 A[Catch:{ OutOfMemoryError -> 0x024a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8 A[Catch:{ OutOfMemoryError -> 0x024a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e9 A[Catch:{ OutOfMemoryError -> 0x024a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f A[Catch:{ OutOfMemoryError -> 0x0245 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0135 A[Catch:{ OutOfMemoryError -> 0x0245 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap extractThumbNailFromStream(java.io.InputStream r26, android.graphics.BitmapFactory.Options r27, int r28, int r29, int r30, int r31, boolean r32) {
        /*
            r0 = r26
            r1 = r28
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            java.lang.String r6 = "x"
            java.lang.String r8 = "MicroMsg.BitmapUtil"
            if (r3 <= 0) goto L_0x0287
            if (r4 > 0) goto L_0x0017
            goto L_0x0287
        L_0x0017:
            if (r1 <= 0) goto L_0x026a
            if (r2 > 0) goto L_0x0021
            r7 = r0
            r4 = r8
            r0 = 3
            r3 = 0
            goto L_0x026e
        L_0x0021:
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x024e }
            r13.<init>()     // Catch:{ OutOfMemoryError -> 0x024e }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x024e }
            r14.<init>()     // Catch:{ OutOfMemoryError -> 0x024e }
            java.lang.String r15 = "extractThumbNail: round="
            r14.append(r15)     // Catch:{ OutOfMemoryError -> 0x024e }
            r14.append(r3)     // Catch:{ OutOfMemoryError -> 0x024e }
            r14.append(r6)     // Catch:{ OutOfMemoryError -> 0x024e }
            r14.append(r4)     // Catch:{ OutOfMemoryError -> 0x024e }
            java.lang.String r15 = ", crop="
            r14.append(r15)     // Catch:{ OutOfMemoryError -> 0x024e }
            r14.append(r5)     // Catch:{ OutOfMemoryError -> 0x024e }
            java.lang.String r14 = r14.toString()     // Catch:{ OutOfMemoryError -> 0x024e }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r14)     // Catch:{ OutOfMemoryError -> 0x024e }
            double r14 = (double) r2
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r18 = r14 * r16
            double r9 = (double) r4
            double r11 = r18 / r9
            r19 = r8
            double r7 = (double) r1
            double r20 = r7 * r16
            r22 = r9
            double r9 = (double) r3
            double r3 = r20 / r9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x024a }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x024a }
            r20 = r6
            java.lang.String r6 = "extractThumbNail: extract beX = "
            r0.append(r6)     // Catch:{ OutOfMemoryError -> 0x024a }
            r0.append(r3)     // Catch:{ OutOfMemoryError -> 0x024a }
            java.lang.String r6 = ", beY = "
            r0.append(r6)     // Catch:{ OutOfMemoryError -> 0x024a }
            r0.append(r11)     // Catch:{ OutOfMemoryError -> 0x024a }
            java.lang.String r0 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x024a }
            r6 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r0)     // Catch:{ OutOfMemoryError -> 0x0247 }
            if (r5 == 0) goto L_0x0081
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
            goto L_0x0085
        L_0x0081:
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x008b
        L_0x0085:
            r19 = r6
            r24 = r7
            r6 = r3
            goto L_0x0090
        L_0x008b:
            r19 = r6
            r24 = r7
            r6 = r11
        L_0x0090:
            int r0 = (int) r6
            r13.inSampleSize = r0     // Catch:{ OutOfMemoryError -> 0x024a }
            r6 = 1
            if (r0 > r6) goto L_0x0098
            r13.inSampleSize = r6     // Catch:{ OutOfMemoryError -> 0x024a }
        L_0x0098:
            int r0 = r2 * r1
            int r6 = r13.inSampleSize     // Catch:{ OutOfMemoryError -> 0x024a }
            int r0 = r0 / r6
            int r0 = r0 / r6
            r7 = 2764800(0x2a3000, float:3.87431E-39)
            if (r0 <= r7) goto L_0x00a8
            int r6 = r6 + 1
            r13.inSampleSize = r6     // Catch:{ OutOfMemoryError -> 0x024a }
            goto L_0x0098
        L_0x00a8:
            if (r5 == 0) goto L_0x00c3
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b9
            double r9 = r9 * r16
            double r9 = r9 * r14
            double r9 = r9 / r24
            double r3 = java.lang.Math.ceil(r9)     // Catch:{ OutOfMemoryError -> 0x024a }
            goto L_0x00d1
        L_0x00b9:
            double r9 = r22 * r16
            double r9 = r9 * r24
            double r9 = r9 / r14
            double r3 = java.lang.Math.ceil(r9)     // Catch:{ OutOfMemoryError -> 0x024a }
            goto L_0x00de
        L_0x00c3:
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d5
            double r9 = r9 * r16
            double r9 = r9 * r14
            double r9 = r9 / r24
            double r3 = java.lang.Math.ceil(r9)     // Catch:{ OutOfMemoryError -> 0x024a }
        L_0x00d1:
            int r0 = (int) r3     // Catch:{ OutOfMemoryError -> 0x024a }
            r3 = r30
            goto L_0x00e2
        L_0x00d5:
            double r9 = r22 * r16
            double r9 = r9 * r24
            double r9 = r9 / r14
            double r3 = java.lang.Math.ceil(r9)     // Catch:{ OutOfMemoryError -> 0x024a }
        L_0x00de:
            int r0 = (int) r3     // Catch:{ OutOfMemoryError -> 0x024a }
            r3 = r0
            r0 = r31
        L_0x00e2:
            if (r0 <= 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r0 = 1
        L_0x00e6:
            if (r3 <= 0) goto L_0x00e9
            goto L_0x00ea
        L_0x00e9:
            r3 = 1
        L_0x00ea:
            r4 = 1
            r13.inMutable = r4     // Catch:{ OutOfMemoryError -> 0x024a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x024a }
            r4.<init>()     // Catch:{ OutOfMemoryError -> 0x024a }
            java.lang.String r6 = "bitmap required size="
            r4.append(r6)     // Catch:{ OutOfMemoryError -> 0x024a }
            r4.append(r3)     // Catch:{ OutOfMemoryError -> 0x024a }
            r6 = r20
            r4.append(r6)     // Catch:{ OutOfMemoryError -> 0x024a }
            r4.append(r0)     // Catch:{ OutOfMemoryError -> 0x024a }
            java.lang.String r7 = ", orig="
            r4.append(r7)     // Catch:{ OutOfMemoryError -> 0x024a }
            r4.append(r1)     // Catch:{ OutOfMemoryError -> 0x024a }
            r4.append(r6)     // Catch:{ OutOfMemoryError -> 0x024a }
            r4.append(r2)     // Catch:{ OutOfMemoryError -> 0x024a }
            java.lang.String r1 = ", sample="
            r4.append(r1)     // Catch:{ OutOfMemoryError -> 0x024a }
            int r1 = r13.inSampleSize     // Catch:{ OutOfMemoryError -> 0x024a }
            r4.append(r1)     // Catch:{ OutOfMemoryError -> 0x024a }
            java.lang.String r1 = r4.toString()     // Catch:{ OutOfMemoryError -> 0x024a }
            r4 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            bindlowMemeryOption(r13)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r7 = r26
            r1 = 0
            android.graphics.Bitmap r2 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r7, r1, r13)     // Catch:{ OutOfMemoryError -> 0x0245 }
            if (r2 != 0) goto L_0x0135
            java.lang.String r0 = "bitmap decode failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ OutOfMemoryError -> 0x0245 }
            return r1
        L_0x0135:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0245 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.String r7 = "bitmap decoded size="
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r7 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r1.append(r6)     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r7 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r1.append(r7)     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r1 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r2, r3, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            if (r2 == r0) goto L_0x016e
            if (r0 == 0) goto L_0x016e
            java.lang.String r3 = "extractThumbNail bitmap recycle adsfad. %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ OutOfMemoryError -> 0x0245 }
            r1 = 0
            r7[r1] = r2     // Catch:{ OutOfMemoryError -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r3, r7)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r2.recycle()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r2 = r0
        L_0x016e:
            if (r5 == 0) goto L_0x023d
            int r0 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r1 = r30
            if (r0 >= r1) goto L_0x0197
            java.lang.String r0 = "bmw < width %d %d"
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r3 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r7 = 0
            r5[r7] = r3     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r30)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r3 = 1
            r5[r3] = r1     // Catch:{ OutOfMemoryError -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r5)     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r0 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0245 }
            goto L_0x0198
        L_0x0197:
            r0 = r1
        L_0x0198:
            int r1 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r3 = r31
            if (r1 >= r3) goto L_0x01bf
            java.lang.String r1 = "bmh < height %d %d"
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r5 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r8 = 0
            r7[r8] = r5     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r31)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r5 = 1
            r7[r5] = r3     // Catch:{ OutOfMemoryError -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r7)     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r1 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0245 }
            goto L_0x01c0
        L_0x01bf:
            r1 = r3
        L_0x01c0:
            int r3 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r3 = r3 - r0
            r5 = 1
            int r3 = r3 >> r5
            int r7 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r7 = r7 - r1
            int r7 = r7 >> r5
            if (r3 < 0) goto L_0x01d1
            if (r7 >= 0) goto L_0x0203
        L_0x01d1:
            java.lang.String r5 = "fix crop image error %d %d %d %d"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r9 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r10 = 0
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r9 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r10 = 1
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r10 = 2
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r10 = 3
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r5, r8)     // Catch:{ OutOfMemoryError -> 0x0245 }
            if (r3 >= 0) goto L_0x0200
            r3 = 0
        L_0x0200:
            if (r7 >= 0) goto L_0x0203
            r7 = 0
        L_0x0203:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r3, r7, r0, r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            if (r0 != 0) goto L_0x020a
            return r2
        L_0x020a:
            if (r0 == r2) goto L_0x021b
            java.lang.String r1 = "extractThumbNail bitmap recycle adsfaasdfad. %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x0245 }
            r5 = 0
            r3[r5] = r2     // Catch:{ OutOfMemoryError -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r3)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r2.recycle()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r2 = r0
        L_0x021b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0245 }
            r0.<init>()     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.String r1 = "bitmap croped size="
            r0.append(r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r1 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r0.append(r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            r0.append(r6)     // Catch:{ OutOfMemoryError -> 0x0245 }
            int r1 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0245 }
            r0.append(r1)     // Catch:{ OutOfMemoryError -> 0x0245 }
            java.lang.String r0 = r0.toString()     // Catch:{ OutOfMemoryError -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)     // Catch:{ OutOfMemoryError -> 0x0245 }
        L_0x023d:
            setBitmapDensity(r2)     // Catch:{ OutOfMemoryError -> 0x0245 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r2)     // Catch:{ OutOfMemoryError -> 0x0245 }
            return r0
        L_0x0245:
            r0 = move-exception
            goto L_0x0250
        L_0x0247:
            r0 = move-exception
            r4 = r6
            goto L_0x0250
        L_0x024a:
            r0 = move-exception
            r4 = r19
            goto L_0x0250
        L_0x024e:
            r0 = move-exception
            r4 = r8
        L_0x0250:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "decode bitmap failed: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r3 = 0
            return r3
        L_0x026a:
            r7 = r0
            r4 = r8
            r3 = 0
            r0 = 3
        L_0x026e:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r5 = 0
            r0[r5] = r7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r5 = 1
            r0[r5] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = "decode[%s] error, outHeight[%d] outWidth[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r1, r0)
            return r3
        L_0x0287:
            r1 = r3
            r3 = r4
            r4 = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "extractThumbNail height:"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = " width:"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNailFromStream(java.io.InputStream, android.graphics.BitmapFactory$Options, int, int, int, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap extractThumeNail(Bitmap bitmap, int i, int i2, boolean z) {
        int i3;
        Bitmap createBitmap;
        int i4 = 56;
        float f = 2.5f;
        if (bitmap.getHeight() >= bitmap.getWidth()) {
            float height = ((float) bitmap.getHeight()) / ((float) bitmap.getWidth());
            if (height <= 2.0f) {
                i4 = (int) (((((double) i) * 1.0d) * ((double) bitmap.getWidth())) / ((double) bitmap.getHeight()));
                i3 = i;
            } else {
                if (((double) height) > 2.5d) {
                    bitmap = Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() - ((int) (((float) bitmap.getWidth()) * 2.5f))) / 2, bitmap.getWidth(), (int) (((float) bitmap.getWidth()) * 2.5f));
                } else {
                    f = height;
                }
                i3 = (int) (((float) 56) * f);
            }
        } else {
            float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
            if (width <= 2.0f) {
                i3 = (int) (((((double) i2) * 1.0d) * ((double) bitmap.getHeight())) / ((double) bitmap.getWidth()));
                i4 = i2;
            } else {
                if (((double) width) > 2.5d) {
                    bitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - ((int) (((float) bitmap.getHeight()) * 2.5f))) / 2, 0, (int) (((float) bitmap.getHeight()) * 2.5f), bitmap.getHeight());
                } else {
                    f = width;
                }
                i4 = (int) (((float) 56) * f);
                i3 = 56;
            }
        }
        Log.m105918d(TAG, "bitmap decoded size=" + bitmap.getWidth() + "x" + bitmap.getHeight());
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i3, true);
        if (!(createScaledBitmap == null || bitmap == createScaledBitmap)) {
            Log.m105925i(TAG, "extractThumeNail bitmap recycle. %s", bitmap);
            bitmap.recycle();
            bitmap = createScaledBitmap;
        }
        if (!z || (createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - i2) >> 1, (bitmap.getHeight() - i) >> 1, i2, i)) == null) {
            return bitmap;
        }
        if (bitmap != createBitmap) {
            Log.m105925i(TAG, "extractThumeNail bitmap recycle 2. %s", bitmap);
            bitmap.recycle();
        }
        Log.m105918d(TAG, "bitmap croped size=" + createBitmap.getWidth() + "x" + createBitmap.getHeight());
        return createBitmap;
    }

    public static Bitmap fastBlurBitmap(Bitmap bitmap, float f, int i) {
        return fastBlurBitmap(bitmap, f, i, false, -1);
    }

    public static Bitmap fastblur(Bitmap bitmap, int i) {
        int[] iArr;
        Bitmap bitmap2 = bitmap;
        int i2 = i;
        if (bitmap2 == null) {
            Log.m105928w(TAG, "fastblur: but sentBitmap is null");
            return null;
        }
        Bitmap copy = bitmap2.copy(bitmap.getConfig(), true);
        if (i2 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        StringBuilder sb = new StringBuilder();
        sb.append(width);
        String str = " ";
        sb.append(str);
        sb.append(height);
        sb.append(str);
        sb.append(i3);
        Log.m105920e("pix", sb.toString());
        String str2 = "pix";
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i7 = (i6 + 1) >> 1;
        int i8 = i7 * i7;
        int i9 = i8 * 256;
        Bitmap bitmap3 = copy;
        int[] iArr7 = new int[i9];
        int i15 = i3;
        for (int i16 = 0; i16 < i9; i16++) {
            iArr7[i16] = i16 / i8;
        }
        int[] iArr8 = new int[2];
        iArr8[1] = 3;
        iArr8[0] = i6;
        int[][] iArr9 = (int[][]) Array.newInstance(Integer.TYPE, iArr8);
        int i17 = i2 + 1;
        int i18 = 0;
        int i19 = 0;
        int i25 = 0;
        while (i18 < height) {
            String str3 = str;
            int i26 = -i2;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            int i38 = 0;
            int i39 = 0;
            int i44 = 0;
            while (i26 <= i2) {
                int i45 = height;
                int i46 = i5;
                int i47 = iArr2[i19 + Math.min(i4, Math.max(i26, 0))];
                int[] iArr10 = iArr9[i26 + i2];
                iArr10[0] = (i47 & 16711680) >> 16;
                iArr10[1] = (i47 & 65280) >> 8;
                iArr10[2] = i47 & 255;
                int abs = i17 - Math.abs(i26);
                int i48 = iArr10[0];
                i27 += i48 * abs;
                int i49 = iArr10[1];
                i28 += i49 * abs;
                int i54 = iArr10[2];
                i29 += abs * i54;
                if (i26 > 0) {
                    i38 += i48;
                    i39 += i49;
                    i44 += i54;
                } else {
                    i35 += i48;
                    i36 += i49;
                    i37 += i54;
                }
                i26++;
                height = i45;
                i5 = i46;
            }
            int i55 = height;
            int i56 = i5;
            int i57 = i2;
            int i58 = 0;
            while (i58 < width) {
                iArr3[i19] = iArr7[i27];
                iArr4[i19] = iArr7[i28];
                iArr5[i19] = iArr7[i29];
                int i59 = i27 - i35;
                int i64 = i28 - i36;
                int i65 = i29 - i37;
                int[] iArr11 = iArr9[((i57 - i2) + i6) % i6];
                int i66 = i35 - iArr11[0];
                int i67 = i36 - iArr11[1];
                int i68 = i37 - iArr11[2];
                if (i18 == 0) {
                    iArr = iArr7;
                    iArr6[i58] = Math.min(i58 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i69 = iArr2[i25 + iArr6[i58]];
                int i74 = (i69 & 16711680) >> 16;
                iArr11[0] = i74;
                int i75 = (i69 & 65280) >> 8;
                iArr11[1] = i75;
                int i76 = i69 & 255;
                iArr11[2] = i76;
                int i77 = i38 + i74;
                int i78 = i39 + i75;
                int i79 = i44 + i76;
                i27 = i59 + i77;
                i28 = i64 + i78;
                i29 = i65 + i79;
                i57 = (i57 + 1) % i6;
                int[] iArr12 = iArr9[i57 % i6];
                int i84 = iArr12[0];
                i35 = i66 + i84;
                int i85 = iArr12[1];
                i36 = i67 + i85;
                int i86 = iArr12[2];
                i37 = i68 + i86;
                i38 = i77 - i84;
                i39 = i78 - i85;
                i44 = i79 - i86;
                i19++;
                i58++;
                iArr7 = iArr;
            }
            int[] iArr13 = iArr7;
            i25 += width;
            i18++;
            str = str3;
            height = i55;
            i5 = i56;
        }
        int[] iArr14 = iArr7;
        int i87 = height;
        int i88 = i5;
        String str4 = str;
        int i89 = 0;
        while (i89 < width) {
            int i94 = -i2;
            int i95 = i94 * width;
            int i96 = 0;
            int i97 = 0;
            int i98 = 0;
            int i99 = 0;
            int i100 = 0;
            int i101 = 0;
            int i102 = 0;
            int i103 = 0;
            int i104 = 0;
            while (i94 <= i2) {
                int[] iArr15 = iArr6;
                int max = Math.max(0, i95) + i89;
                int[] iArr16 = iArr9[i94 + i2];
                iArr16[0] = iArr3[max];
                iArr16[1] = iArr4[max];
                iArr16[2] = iArr5[max];
                int abs2 = i17 - Math.abs(i94);
                i96 += iArr3[max] * abs2;
                i97 += iArr4[max] * abs2;
                i98 += iArr5[max] * abs2;
                if (i94 > 0) {
                    i102 += iArr16[0];
                    i103 += iArr16[1];
                    i104 += iArr16[2];
                } else {
                    i99 += iArr16[0];
                    i100 += iArr16[1];
                    i101 += iArr16[2];
                }
                int i105 = i88;
                if (i94 < i105) {
                    i95 += width;
                }
                i94++;
                i88 = i105;
                iArr6 = iArr15;
            }
            int[] iArr17 = iArr6;
            int i106 = i88;
            int i107 = i89;
            int i108 = i2;
            int i109 = i87;
            int i110 = 0;
            while (i110 < i109) {
                iArr2[i107] = (iArr2[i107] & -16777216) | (iArr14[i96] << 16) | (iArr14[i97] << 8) | iArr14[i98];
                int i111 = i96 - i99;
                int i112 = i97 - i100;
                int i113 = i98 - i101;
                int[] iArr18 = iArr9[((i108 - i2) + i6) % i6];
                int i114 = i99 - iArr18[0];
                int i115 = i100 - iArr18[1];
                int i116 = i101 - iArr18[2];
                if (i89 == 0) {
                    iArr17[i110] = Math.min(i110 + i17, i106) * width;
                }
                int i117 = iArr17[i110] + i89;
                int i118 = iArr3[i117];
                iArr18[0] = i118;
                int i119 = iArr4[i117];
                iArr18[1] = i119;
                int i120 = iArr5[i117];
                iArr18[2] = i120;
                int i121 = i102 + i118;
                int i122 = i103 + i119;
                int i123 = i104 + i120;
                i96 = i111 + i121;
                i97 = i112 + i122;
                i98 = i113 + i123;
                i108 = (i108 + 1) % i6;
                int[] iArr19 = iArr9[i108];
                int i124 = iArr19[0];
                i99 = i114 + i124;
                int i125 = iArr19[1];
                i100 = i115 + i125;
                int i126 = iArr19[2];
                i101 = i116 + i126;
                i102 = i121 - i124;
                i103 = i122 - i125;
                i104 = i123 - i126;
                i107 += width;
                i110++;
                i2 = i;
            }
            i89++;
            i2 = i;
            i87 = i109;
            i88 = i106;
            iArr6 = iArr17;
        }
        int i127 = i87;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(width);
        String str5 = str4;
        sb4.append(str5);
        sb4.append(i127);
        sb4.append(str5);
        sb4.append(i15);
        Log.m105920e(str2, sb4.toString());
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, i127);
        setBitmapDensity(bitmap3);
        return BitmapTracer.trace(bitmap3);
    }

    public static Bitmap getBitmapFromRect(Bitmap bitmap, Rect rect, boolean z) {
        if (bitmap == null) {
            return null;
        }
        setBitmapDensity(bitmap);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, rect.width(), rect.height(), (Matrix) null, false);
            if (z) {
                Log.m105925i(TAG, "getBitmapFromRect bitmap recycle %s", bitmap);
                bitmap.recycle();
            }
            setBitmapDensity(createBitmap);
            return BitmapTracer.trace(createBitmap);
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "getBitmapFromRect exception", new Object[0]);
            return null;
        }
    }

    public static Bitmap getBitmapFromRectFixed(Bitmap bitmap, Rect rect, boolean z) {
        if (bitmap == null) {
            return null;
        }
        setBitmapDensity(bitmap);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), (Matrix) null, false);
            if (z) {
                Log.m105925i(TAG, "getBitmapFromRect bitmap recycle %s", bitmap);
                bitmap.recycle();
            }
            setBitmapDensity(createBitmap);
            return BitmapTracer.trace(createBitmap);
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "getBitmapFromRect exception", new Object[0]);
            return null;
        }
    }

    public static Bitmap getBitmapFromView(View view) {
        if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        }
        view.draw(canvas);
        setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    public static Bitmap getBitmapNative(String str) {
        return getBitmapNative(str, 0, 0, 0.0f);
    }

    public static Bitmap getBitmapNativeDisplayMetrics(int i) {
        DisplayMetrics defaultDisplayMetrics = getDefaultDisplayMetrics();
        return getBitmapNative(i, (String) null, (byte[]) null, (Uri) null, false, 0.0f, defaultDisplayMetrics.widthPixels, defaultDisplayMetrics.heightPixels);
    }

    public static int getBitmapSize(Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(TAG, "BitmapUtil decode getCenterCropBitmap fail");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r8 = android.graphics.Bitmap.createBitmap(r8, r9, android.graphics.Bitmap.Config.RGB_565);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap getCenterCropBitmap(android.graphics.Bitmap r7, int r8, int r9, boolean r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            setBitmapDensity(r7)
            int r1 = r7.getWidth()
            int r2 = r7.getHeight()
            float r3 = (float) r8
            float r1 = (float) r1
            float r4 = r3 / r1
            float r5 = (float) r9
            float r2 = (float) r2
            float r6 = r5 / r2
            float r4 = java.lang.Math.max(r4, r6)
            float r1 = r1 * r4
            float r4 = r4 * r2
            float r3 = r3 - r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r2
            float r5 = r5 - r4
            float r5 = r5 / r2
            android.graphics.RectF r2 = new android.graphics.RectF
            float r1 = r1 + r3
            float r4 = r4 + r5
            r2.<init>(r3, r5, r1, r4)
            android.graphics.Bitmap$Config r1 = r7.getConfig()
            java.lang.String r3 = "MicroMsg.BitmapUtil"
            if (r1 != 0) goto L_0x003b
            java.lang.String r1 = "get center crop bitmap, config is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
        L_0x003b:
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r1)     // Catch:{ all -> 0x0040 }
            goto L_0x0046
        L_0x0040:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x0066 }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8, r9, r1)     // Catch:{ all -> 0x0066 }
        L_0x0046:
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r8)
            r9.drawBitmap(r7, r0, r2, r0)
            if (r10 == 0) goto L_0x005e
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r9[r10] = r7
            java.lang.String r10 = "getCenterCropBitmap bitmap recycle %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r10, r9)
            r7.recycle()
        L_0x005e:
            setBitmapDensity(r8)
            android.graphics.Bitmap r7 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r8)
            return r7
        L_0x0066:
            java.lang.String r8 = "BitmapUtil decode getCenterCropBitmap fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.getCenterCropBitmap(android.graphics.Bitmap, int, int, boolean):android.graphics.Bitmap");
    }

    public static DisplayMetrics getDefaultDisplayMetrics() {
        if (metrics == null) {
            metrics = MMApplicationContext.getContext().getResources().getDisplayMetrics();
        }
        return metrics;
    }

    public static BitmapFactory.Options getImageOptions(InputStream inputStream, boolean z) {
        InputStream inputStream2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        bindlowMemeryOption(options);
        if (inputStream == null) {
            Log.m105920e(TAG, "getImageOptions decode stream is null!!");
            return options;
        }
        if (!z) {
            if (!inputStream.markSupported()) {
                if (inputStream instanceof FileInputStream) {
                    inputStream2 = new FileSeekingInputStream((FileInputStream) inputStream);
                } else {
                    inputStream2 = new BufferedInputStream(inputStream);
                }
                inputStream = inputStream2;
            }
            inputStream.mark(8388608);
        }
        try {
            Bitmap g = MMBitmapFactory.m98738g(inputStream, (Rect) null, options);
            if (g != null) {
                Log.m105925i(TAG, "getImageOptions bitmap recycle. %s", g);
                g.recycle();
            }
            if (z) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Log.printErrStackTrace(TAG, e, "hy: stream close failed ", new Object[0]);
                }
            } else {
                Log.m105928w(TAG, "hy: not auto close. reset for invoker");
                try {
                    inputStream.reset();
                } catch (Exception e2) {
                    Log.printErrStackTrace(TAG, e2, "hy: stream reset failed", new Object[0]);
                }
            }
        } catch (OutOfMemoryError e3) {
            Log.printErrStackTrace(TAG, e3, "Decode bitmap failed.", new Object[0]);
            if (z) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace(TAG, e4, "hy: stream close failed ", new Object[0]);
                }
            } else {
                Log.m105928w(TAG, "hy: not auto close. reset for invoker");
                try {
                    inputStream.reset();
                } catch (Exception e5) {
                    Log.printErrStackTrace(TAG, e5, "hy: stream reset failed", new Object[0]);
                }
            }
        } catch (Throwable th) {
            if (z) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    Log.printErrStackTrace(TAG, e6, "hy: stream close failed ", new Object[0]);
                }
            } else {
                Log.m105928w(TAG, "hy: not auto close. reset for invoker");
                try {
                    inputStream.reset();
                } catch (Exception e7) {
                    Log.printErrStackTrace(TAG, e7, "hy: stream reset failed", new Object[0]);
                }
            }
            throw th;
        }
        return options;
    }

    @Deprecated
    public static OutputStream getImageWriteOutputStream(C86009m1 m1Var) {
        if (pathNeedUseMediaApi(m1Var.mo119971i())) {
            return ScopedStorageUtil.Exports.getImageOutputStream(MMApplicationContext.getContext(), m1Var.mo119971i());
        }
        return C86013q1.m106426H(m1Var);
    }

    private static long getMaxJavaFreeHeap() {
        return Math.max((Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory()) - MAGIC_FREE_BUFFER, 0);
    }

    public static Point getPictureSize(String str) {
        BitmapFactory.Options imageOptions = getImageOptions(str);
        if (imageOptions != null) {
            return new Point(imageOptions.outWidth, imageOptions.outHeight);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e A[SYNTHETIC, Splitter:B:15:0x002e] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getRent(java.lang.String r7, com.tencent.p014mm.pointers.PInt r8, com.tencent.p014mm.pointers.PInt r9) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "MicroMsg.BitmapUtil"
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inJustDecodeBounds = r3
            bindlowMemeryOption(r2)
            r4 = 0
            r5 = 0
            java.io.InputStream r7 = com.tencent.p014mm.vfs.C86013q1.m106423E(r7)     // Catch:{ FileNotFoundException -> 0x0039, all -> 0x002b }
            android.graphics.Bitmap r4 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r7, r4, r2)     // Catch:{ FileNotFoundException -> 0x0029, all -> 0x0026 }
            if (r7 == 0) goto L_0x0047
            r7.close()     // Catch:{ IOException -> 0x001f }
            goto L_0x0047
        L_0x001f:
            r7 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r6)
            goto L_0x0047
        L_0x0026:
            r8 = move-exception
            r4 = r7
            goto L_0x002c
        L_0x0029:
            goto L_0x003b
        L_0x002b:
            r8 = move-exception
        L_0x002c:
            if (r4 == 0) goto L_0x0038
            r4.close()     // Catch:{ IOException -> 0x0032 }
            goto L_0x0038
        L_0x0032:
            r7 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r9)
        L_0x0038:
            throw r8
        L_0x0039:
            r7 = r4
        L_0x003b:
            if (r7 == 0) goto L_0x0047
            r7.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r7 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r7, r0, r6)
        L_0x0047:
            if (r4 == 0) goto L_0x0055
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r5] = r4
            java.lang.String r0 = "getRent bitmap recycle %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r7)
            r4.recycle()
        L_0x0055:
            int r7 = r2.outWidth
            r8.value = r7
            int r7 = r2.outHeight
            r9.value = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.getRent(java.lang.String, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt):void");
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, boolean z, float f, boolean z2) {
        return getRoundedCornerBitmap(bitmap, z, f, z2, (int[]) null);
    }

    public static String getYUVType(byte[] bArr) {
        for (int i = 0; i < bArr.length - 1; i++) {
            if ((bArr[i] & ExifInterface.MARKER) == 255) {
                int i2 = i + 1;
                byte b = 255 & bArr[i2];
                if (b >= 192 && b <= 207) {
                    Log.m105918d(TAG, "match 0xff-" + Integer.toHexString(b) + "  at:" + i);
                    if (i2 + 17 >= bArr.length) {
                        Log.m105918d(TAG, "not engouht len at " + i);
                        return null;
                    }
                    int i3 = i + 2;
                    if (bArr[i3 + 7] != 3) {
                        Log.m105918d(TAG, "num != 3 at " + i);
                    } else {
                        byte b2 = bArr[i3 + 8];
                        byte b3 = bArr[i3 + 11];
                        byte b4 = bArr[i3 + 14];
                        if (b2 == 1 || b3 == 2 || b4 == 3) {
                            byte b5 = bArr[i3 + 9];
                            byte b6 = bArr[i3 + 12];
                            byte b7 = bArr[i3 + 15];
                            if (!(b5 == 0 || b6 == 0 || b7 == 0)) {
                                if (b5 == b6 && b5 == b7) {
                                    return "YUV444";
                                }
                                int i4 = ((b5 & ExifInterface.MARKER) >> 4) & 15;
                                byte b8 = b5 & 15;
                                int i5 = ((b6 & ExifInterface.MARKER) >> 4) & 15;
                                byte b9 = b6 & 15;
                                int i6 = ((b7 & ExifInterface.MARKER) >> 4) & 15;
                                byte b15 = b7 & 15;
                                if (!(i5 == 0 || i6 == 0 || b9 == 0 || b15 == 0 || i4 / i5 != 2 || i4 / i6 != 2)) {
                                    if (b8 / b9 == 2 && b8 / b15 == 2) {
                                        return "YUV420";
                                    }
                                    if (b8 == b9 && b8 == b15) {
                                        return "YUV422";
                                    }
                                }
                            }
                        } else {
                            Log.m105918d(TAG, "Y/Cb/Cr Tag is not right at " + i);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Bitmap handleDegree(int i, Bitmap bitmap) {
        return rotate(bitmap, (float) i);
    }

    public static boolean isDisableMediaApi() {
        return sDisableMediaApi;
    }

    private static boolean isSystemPath(String str) {
        return str.contains(C112760b.m154240l());
    }

    private static void megerPixels(int[] iArr, int[] iArr2, int i) {
        try {
            int i2 = iArr[i];
            if (i2 != -16777216) {
                if (i2 == 0) {
                    iArr2[i] = 0;
                } else if (i2 != -1) {
                    int i3 = i2 & iArr2[i];
                    iArr2[i] = i3;
                    iArr2[i] = iArr[i] & i3;
                }
            }
        } catch (Exception e) {
            Log.m105921e(TAG, "megerPixels:%s", e.toString());
        }
    }

    private static boolean pathNeedUseMediaApi(String str) {
        return isSystemPath(str) && !sDisableMediaApi && Build.VERSION.SDK_INT >= 29;
    }

    public static Bitmap rotate(Bitmap bitmap, float f) {
        Throwable th;
        Bitmap bitmap2;
        if (bitmap == null || f % 360.0f == 0.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.setRotate(f, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        try {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            try {
                setBitmapDensity(bitmap2);
                StringBuilder sb = new StringBuilder();
                sb.append("resultBmp is null: ");
                sb.append(bitmap2 == null);
                sb.append("  degree:");
                sb.append(f);
                Log.m105918d(TAG, sb.toString());
                if (bitmap != bitmap2) {
                    Log.m105925i(TAG, "rotate bitmap recycle ajsdfasdf adsf. %s", bitmap);
                    bitmap.recycle();
                }
                return BitmapTracer.trace(bitmap2);
            } catch (Throwable th4) {
                th = th4;
                Log.m105919d(TAG, "createBitmap failed : %s ", Util.stackTraceToString(th));
                return bitmap2;
            }
        } catch (Throwable th5) {
            bitmap2 = bitmap;
            th = th5;
            Log.m105919d(TAG, "createBitmap failed : %s ", Util.stackTraceToString(th));
            return bitmap2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008b, code lost:
        if (r3 <= 1.001d) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap rotateAndScale(android.graphics.Bitmap r16, float r17, float r18, float r19) {
        /*
            r8 = r16
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r9 = "MicroMsg.BitmapUtil"
            if (r8 != 0) goto L_0x0014
            java.lang.String r0 = "rotateAndScale temBmp is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r0 = 0
            return r0
        L_0x0014:
            int r3 = r16.getWidth()
            r4 = 2
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x00d6
            int r3 = r16.getHeight()
            if (r3 != 0) goto L_0x0025
            goto L_0x00d6
        L_0x0025:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r17)
            r3[r11] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r18)
            r3[r10] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r19)
            r3[r4] = r5
            java.lang.String r5 = "rotateAndScale degree: %s, scaleWidth: %s, scaleHeight: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r3)
            r3 = 0
            r5 = 4607186922399644778(0x3ff004189374bc6a, double:1.001)
            r12 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0062
            double r14 = (double) r1
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0062
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0062
            double r14 = (double) r2
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0062
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0062
            return r8
        L_0x0062:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r7.reset()
            if (r3 == 0) goto L_0x007b
            int r3 = r16.getWidth()
            int r3 = r3 / r4
            float r3 = (float) r3
            int r14 = r16.getHeight()
            int r14 = r14 / r4
            float r4 = (float) r14
            r7.setRotate(r0, r3, r4)
        L_0x007b:
            double r3 = (double) r1
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x008d
            double r3 = (double) r2
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0090
        L_0x008d:
            r7.postScale(r1, r2)
        L_0x0090:
            r2 = 0
            r3 = 0
            int r4 = r16.getWidth()     // Catch:{ all -> 0x00c7 }
            int r5 = r16.getHeight()     // Catch:{ all -> 0x00c7 }
            r0 = 1
            r1 = r16
            r6 = r7
            r7 = r0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c7 }
            setBitmapDensity(r1)     // Catch:{ all -> 0x00c4 }
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r1
            java.lang.String r2 = "rotateAndScale, resultBmp: %s. "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            if (r8 == r1) goto L_0x00bf
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.String r2 = "rotateAndScale bitmap recycle %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            r16.recycle()
        L_0x00bf:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r1)
            return r0
        L_0x00c4:
            r0 = move-exception
            r8 = r1
            goto L_0x00c8
        L_0x00c7:
            r0 = move-exception
        L_0x00c8:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r11] = r0
            java.lang.String r0 = "createBitmap failed : %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r1)
            return r8
        L_0x00d6:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r16.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r11] = r1
            int r1 = r16.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r10] = r1
            java.lang.String r1 = "rotateAndScale failed width : %s, height : %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(android.graphics.Bitmap, float, float, float):android.graphics.Bitmap");
    }

    public static boolean saveBitmapToImage(Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat, String str, boolean z) {
        if (!Util.isNullOrNil(str)) {
            Log.m105924i(TAG, "saving to " + str);
            OutputStream outputStream = null;
            C86013q1.m106461v(C86013q1.m106458s(str));
            try {
                if (pathNeedUseMediaApi(str)) {
                    final ScopedStorageUtil.MediaStoreOps.Controller[] controllerArr = new ScopedStorageUtil.MediaStoreOps.Controller[1];
                    ScopedStorageUtil.Exports.getImageOutputStream(MMApplicationContext.getContext(), str, new ScopedStorageUtil.MediaStoreOps.Callback() {
                        public void onSuccess(ScopedStorageUtil.MediaStoreOps.Controller controller) {
                            controllerArr[0] = controller;
                        }
                    });
                    ScopedStorageUtil.MediaStoreOps.Controller controller = controllerArr[0];
                    if (controller != null) {
                        OutputStream outputStream2 = controller.getOutputStream();
                        boolean saveBitmapToStream = saveBitmapToStream(bitmap, i, compressFormat, outputStream2, z);
                        controllerArr[0].removePendingStats();
                        if (z) {
                            Log.m105925i(TAG, "bitmap recycle %s", bitmap.toString());
                            bitmap.recycle();
                        }
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        return saveBitmapToStream;
                    }
                    if (z) {
                        Log.m105925i(TAG, "bitmap recycle %s", bitmap.toString());
                        bitmap.recycle();
                    }
                    return false;
                }
                OutputStream K = C86013q1.m106429K(str, false);
                boolean saveBitmapToStream2 = saveBitmapToStream(bitmap, i, compressFormat, K, z);
                if (z) {
                    Log.m105925i(TAG, "bitmap recycle %s", bitmap.toString());
                    bitmap.recycle();
                }
                if (K != null) {
                    try {
                        K.close();
                    } catch (IOException unused2) {
                    }
                }
                return saveBitmapToStream2;
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "saveBitmapToImage failed: %s", str);
                throw new IOException(e);
            } catch (Throwable th) {
                if (z) {
                    Log.m105925i(TAG, "bitmap recycle %s", bitmap.toString());
                    bitmap.recycle();
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } else {
            throw new IOException("saveBitmapToImage pathName null or nil");
        }
    }

    public static boolean saveBitmapToImageWithMediaStore(Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat, String str, boolean z) {
        if (!Util.isNullOrNil(str)) {
            Log.m105924i(TAG, "saving to " + str);
            OutputStream outputStream = null;
            C86013q1.m106461v(C86013q1.m106458s(str));
            try {
                final ScopedStorageUtil.MediaStoreOps.Controller[] controllerArr = new ScopedStorageUtil.MediaStoreOps.Controller[1];
                ScopedStorageUtil.Exports.getImageOutputStream(MMApplicationContext.getContext(), str, new ScopedStorageUtil.MediaStoreOps.Callback() {
                    public void onSuccess(ScopedStorageUtil.MediaStoreOps.Controller controller) {
                        controllerArr[0] = controller;
                    }
                });
                ScopedStorageUtil.MediaStoreOps.Controller controller = controllerArr[0];
                if (controller != null) {
                    OutputStream outputStream2 = controller.getOutputStream();
                    boolean saveBitmapToStream = saveBitmapToStream(bitmap, i, compressFormat, outputStream2, z);
                    controllerArr[0].removePendingStats();
                    if (z) {
                        Log.m105925i(TAG, "bitmap recycle %s", bitmap.toString());
                        bitmap.recycle();
                    }
                    if (outputStream2 != null) {
                        try {
                            outputStream2.close();
                        } catch (IOException unused) {
                        }
                    }
                    return saveBitmapToStream;
                }
                if (z) {
                    Log.m105925i(TAG, "bitmap recycle %s", bitmap.toString());
                    bitmap.recycle();
                }
                return false;
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "saveBitmapToImage failed: %s", str);
                throw new IOException(e);
            } catch (Throwable th) {
                if (z) {
                    Log.m105925i(TAG, "bitmap recycle %s", bitmap.toString());
                    bitmap.recycle();
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } else {
            throw new IOException("saveBitmapToImage pathName null or nil");
        }
    }

    public static boolean saveBitmapToStream(Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat, OutputStream outputStream, boolean z) {
        boolean compress = compress(bitmap, compressFormat, i, outputStream);
        if (z) {
            Log.m105925i(TAG, "saveBitmapToStream bitmap recycle. %s", bitmap);
            bitmap.recycle();
        }
        return compress;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r2 <= 1.001d) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap scaleBitmap(android.graphics.Bitmap r13, float r14, float r15) {
        /*
            java.lang.String r9 = "MicroMsg.BitmapUtil"
            if (r13 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            double r2 = (double) r14
            r4 = 4607186922399644778(0x3ff004189374bc6a, double:1.001)
            r6 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0023
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0023
            double r10 = (double) r15
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0023
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 >= 0) goto L_0x0023
            return r13
        L_0x0023:
            int r10 = r13.getWidth()
            if (r10 == 0) goto L_0x00a5
            int r10 = r13.getHeight()
            if (r10 != 0) goto L_0x0031
            goto L_0x00a5
        L_0x0031:
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            r10.reset()
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L_0x004a
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x004a
            double r2 = (double) r15
            int r11 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r11 < 0) goto L_0x004a
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x004d
        L_0x004a:
            r10.postScale(r14, r15)
        L_0x004d:
            r2 = 0
            r3 = 0
            r11 = 0
            r12 = 1
            int r4 = r13.getWidth()     // Catch:{ all -> 0x0094 }
            int r5 = r13.getHeight()     // Catch:{ all -> 0x0094 }
            r7 = 1
            r1 = r13
            r6 = r10
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0094 }
            setBitmapDensity(r1)     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "resultBmp is null: "
            r0.append(r2)
            if (r1 != 0) goto L_0x0072
            r2 = 1
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r0)
            if (r13 == r1) goto L_0x008c
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r13
            java.lang.String r2 = "scale bitmap recycle. %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            r13.recycle()
        L_0x008c:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r1)
            return r0
        L_0x0091:
            r0 = move-exception
            r8 = r1
            goto L_0x0096
        L_0x0094:
            r0 = move-exception
            r8 = r13
        L_0x0096:
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r11] = r0
            java.lang.String r0 = "scaleBitmap failed : %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r1)
            return r8
        L_0x00a5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.scaleBitmap(android.graphics.Bitmap, float, float):android.graphics.Bitmap");
    }

    public static void setAllDrawingCacheEnable(View view, boolean z) {
        if (view != null) {
            view.setDrawingCacheEnabled(z);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    setAllDrawingCacheEnable(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static Bitmap setAlpha(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawARGB(0, 0, 0, 0);
        Paint paint = new Paint();
        paint.setAlpha((int) (f * 255.0f));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    public static void setBitmapDensity(Bitmap bitmap) {
        if (bitmap != null) {
            bitmap.setDensity(MMApplicationContext.getContext().getResources().getDisplayMetrics().densityDpi);
            Class<Bitmap> cls = Bitmap.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setDefaultDensity", new Class[]{Integer.TYPE});
                declaredMethod.setAccessible(true);
                declaredMethod.invoke((Object) null, new Object[]{Integer.valueOf(MMApplicationContext.getContext().getResources().getDisplayMetrics().densityDpi)});
            } catch (Exception e) {
                Log.m105921e(TAG, "Exception:%s", e);
            }
        }
    }

    public static Bitmap setContrast(Bitmap bitmap, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    public static void setDisableMediaApi(boolean z) {
        sDisableMediaApi = z;
    }

    public static Bitmap setGrayscale(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    public static Bitmap transformDrawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    public static byte[] Bitmap2Bytes(Bitmap bitmap, int i) {
        if (bitmap == null || bitmap.isRecycled()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        compress(bitmap, Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return byteArray;
    }

    public static Bitmap createThumbBitmap(String str, int i, int i2, boolean z, boolean z2, int i3) {
        Bitmap extractThumbNail = extractThumbNail(str, i, i2, z2);
        if (extractThumbNail == null) {
            return null;
        }
        Bitmap drawBackgroundInNeed = drawBackgroundInNeed(extractThumbNail, str, i3);
        if (!z) {
            return drawBackgroundInNeed;
        }
        int orientationInDegree = Exif.fromFile(str).getOrientationInDegree();
        Log.m105919d(TAG, "degress:%d", Integer.valueOf(orientationInDegree));
        return rotate(drawBackgroundInNeed, (float) orientationInDegree);
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, String str3, boolean z) {
        StringBuilder sb = new StringBuilder();
        String str4 = str2;
        sb.append(str2);
        String str5 = str3;
        sb.append(str3);
        return createThumbNail(false, str, i, i2, compressFormat, i3, sb.toString(), z);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap createVideoThumbnail(java.lang.String r4, int r5, int r6) {
        /*
            oj.c r0 = new oj.c
            r0.<init>()
            r1 = 0
            r0.setDataSource(r4)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0019, all -> 0x0014 }
            long r2 = (long) r6     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0019, all -> 0x0014 }
            android.graphics.Bitmap r4 = r0.getFrameAtTime(r2)     // Catch:{ IllegalArgumentException | RuntimeException -> 0x0019, all -> 0x0014 }
            r0.release()     // Catch:{ RuntimeException -> 0x0012 }
            goto L_0x001f
        L_0x0012:
            goto L_0x001f
        L_0x0014:
            r4 = move-exception
            r0.release()     // Catch:{ RuntimeException -> 0x0018 }
        L_0x0018:
            throw r4
        L_0x0019:
            r0.release()     // Catch:{ RuntimeException -> 0x001d }
            goto L_0x001e
        L_0x001d:
        L_0x001e:
            r4 = r1
        L_0x001f:
            if (r4 != 0) goto L_0x0022
            return r1
        L_0x0022:
            r6 = 1
            if (r5 != r6) goto L_0x0053
            int r5 = r4.getWidth()
            int r0 = r4.getHeight()
            int r2 = java.lang.Math.max(r5, r0)
            r3 = 512(0x200, float:7.175E-43)
            if (r2 <= r3) goto L_0x0050
            r3 = 1140850688(0x44000000, float:512.0)
            float r2 = (float) r2
            float r3 = r3 / r2
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r0 = (float) r0
            float r3 = r3 * r0
            int r0 = java.lang.Math.round(r3)
            if (r5 <= 0) goto L_0x0051
            if (r0 <= 0) goto L_0x0051
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r4, r5, r0, r6)
            goto L_0x0051
        L_0x0050:
            r1 = r4
        L_0x0051:
            r4 = r1
            goto L_0x005d
        L_0x0053:
            r6 = 3
            if (r5 != r6) goto L_0x005d
            r5 = 2
            r6 = 96
            android.graphics.Bitmap r4 = android.media.ThumbnailUtils.extractThumbnail(r4, r6, r6, r5)
        L_0x005d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.createVideoThumbnail(java.lang.String, int, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC, Splitter:B:22:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003e A[SYNTHETIC, Splitter:B:27:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeFile(java.lang.String r6, android.graphics.BitmapFactory.Options r7) {
        /*
            if (r7 != 0) goto L_0x0007
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
        L_0x0007:
            r0 = 0
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106423E(r6)     // Catch:{ IOException -> 0x0020, all -> 0x001e }
            bindlowMemeryOption(r7)     // Catch:{ IOException -> 0x001c }
            android.graphics.Bitmap r6 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r1, r0, r7)     // Catch:{ IOException -> 0x001c }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r6
        L_0x0019:
            r6 = move-exception
            r0 = r1
            goto L_0x003c
        L_0x001c:
            r7 = move-exception
            goto L_0x0022
        L_0x001e:
            r6 = move-exception
            goto L_0x003c
        L_0x0020:
            r7 = move-exception
            r1 = r0
        L_0x0022:
            java.lang.String r2 = "MicroMsg.BitmapUtil"
            java.lang.String r3 = "Cannot decode file '%s': %s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0019 }
            r5 = 0
            r4[r5] = r6     // Catch:{ all -> 0x0019 }
            r6 = 1
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0019 }
            r4[r6] = r7     // Catch:{ all -> 0x0019 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            return r0
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public static Bitmap decodeFileWithSample(String str, int i, int i2) {
        return decodeFileWithSample(str, i, i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeStream(java.io.InputStream r5, float r6, int r7, int r8, boolean r9) {
        /*
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0011
            r1 = 1126170624(0x43200000, float:160.0)
            float r6 = r6 * r1
            int r6 = (int) r6
            r0.inDensity = r6
        L_0x0011:
            java.lang.String r6 = "MicroMsg.BitmapUtil"
            r1 = 0
            if (r7 != 0) goto L_0x0018
            if (r8 == 0) goto L_0x0083
        L_0x0018:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r7 != 0) goto L_0x0020
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x0020:
            if (r8 != 0) goto L_0x0025
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x0025:
            boolean r2 = r5 instanceof java.io.FileInputStream
            if (r2 == 0) goto L_0x0032
            com.tencent.mm.sdk.platformtools.FileSeekingInputStream r2 = new com.tencent.mm.sdk.platformtools.FileSeekingInputStream
            java.io.FileInputStream r5 = (java.io.FileInputStream) r5
            r2.<init>(r5)
        L_0x0030:
            r5 = r2
            goto L_0x0040
        L_0x0032:
            boolean r2 = r5.markSupported()
            if (r2 != 0) goto L_0x0040
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r3 = 65536(0x10000, float:9.18355E-41)
            r2.<init>(r5, r3)
            goto L_0x0030
        L_0x0040:
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            r5.mark(r2)
            r2 = 1
            r0.inJustDecodeBounds = r2
            com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r5, r1, r0)
            int r2 = r0.outWidth
            int r3 = r0.outHeight
            if (r7 <= r8) goto L_0x0053
            if (r2 < r3) goto L_0x0057
        L_0x0053:
            if (r7 >= r8) goto L_0x005a
            if (r2 <= r3) goto L_0x005a
        L_0x0057:
            r4 = r3
            r3 = r2
            r2 = r4
        L_0x005a:
            if (r9 == 0) goto L_0x0063
            int r7 = calculateInSampleSize(r2, r3, r7, r8)
            r0.inSampleSize = r7
            goto L_0x0074
        L_0x0063:
            if (r2 > r7) goto L_0x0067
            if (r3 <= r8) goto L_0x0074
        L_0x0067:
            float r9 = (float) r2
            float r7 = (float) r7
            float r9 = r9 / r7
            float r7 = (float) r3
            float r8 = (float) r8
            float r7 = r7 / r8
            float r7 = java.lang.Math.max(r9, r7)
            int r7 = (int) r7
            r0.inSampleSize = r7
        L_0x0074:
            r7 = 0
            r0.inJustDecodeBounds = r7
            r5.reset()     // Catch:{ IOException -> 0x007b }
            goto L_0x0083
        L_0x007b:
            r8 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r9 = "Failed seeking InputStream."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r8, r9, r7)
        L_0x0083:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            r0.inPreferredConfig = r7
            bindlowMemeryOption(r0)
            android.graphics.Bitmap r1 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r5, r1, r0)     // Catch:{ OutOfMemoryError -> 0x008f }
            goto L_0x00a0
        L_0x008f:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.RGB_565
            r0.inPreferredConfig = r7
            bindlowMemeryOption(r0)
            android.graphics.Bitmap r1 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r5, r1, r0)     // Catch:{ OutOfMemoryError -> 0x009b }
            goto L_0x00a0
        L_0x009b:
            java.lang.String r5 = "decodeStream OutOfMemoryError return null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r5)
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(java.io.InputStream, float, int, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap extractThumbNailAssets(InputStream inputStream, int i, int i2) {
        return getBitmapNative(0, (String) null, (byte[]) null, (Uri) null, inputStream, true, 0.0f, i, i2, (Bitmap.Config) null);
    }

    public static Bitmap fastBlurBitmap(Bitmap bitmap, float f, int i, boolean z, long j) {
        int i2;
        String str;
        int i3;
        long j2;
        String str2;
        int[] iArr;
        int i4 = i;
        long j3 = j;
        long currentTimeMillis = System.currentTimeMillis();
        int round = Math.round(((float) bitmap.getWidth()) * f);
        int round2 = Math.round(((float) bitmap.getHeight()) * f);
        if (round <= 10 || round2 <= 10) {
            round = bitmap.getWidth();
            round2 = bitmap.getHeight();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        if (i4 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i5 = width * height;
        int[] iArr2 = new int[i5];
        Log.m105919d(TAG, "alvinluo fastBlurBitmap w: %d, h: %d, length: %d", Integer.valueOf(width), Integer.valueOf(height), Integer.valueOf(i5));
        String str3 = TAG;
        int[] iArr3 = iArr2;
        int i6 = i5;
        int i7 = height;
        int i8 = width;
        copy.getPixels(iArr2, 0, width, 0, 0, width, i7);
        int i9 = width - 1;
        int i15 = i7;
        int i16 = i15 - 1;
        if (i9 <= 0 || i16 <= 0) {
            return null;
        }
        int i17 = i4 + i4 + 1;
        int[] iArr4 = new int[i6];
        int[] iArr5 = new int[i6];
        int[] iArr6 = new int[i6];
        int i18 = (i17 + 1) >> 1;
        int i19 = i18 * i18;
        Bitmap bitmap2 = copy;
        int i25 = i19 * 256;
        int i26 = i16;
        int[] iArr7 = new int[i25];
        int[] iArr8 = new int[Math.max(width, i15)];
        for (int i27 = 0; i27 < i25; i27++) {
            iArr7[i27] = i27 / i19;
        }
        int[] iArr9 = new int[2];
        iArr9[1] = 3;
        iArr9[0] = i17;
        int[][] iArr10 = (int[][]) Array.newInstance(Integer.TYPE, iArr9);
        int i28 = i4 + 1;
        int i29 = 0;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            int i37 = i17;
            String str4 = "alvinluo fastBlurBitmap timeOut and return null";
            if (i29 >= i15) {
                int[] iArr11 = iArr6;
                int[] iArr12 = iArr7;
                int[] iArr13 = iArr4;
                int[] iArr14 = iArr5;
                int i38 = i15;
                String str5 = str3;
                int i39 = 0;
                while (i39 < width) {
                    int i44 = -i4;
                    int i45 = i44 * width;
                    if (!z || !checkTimeout(currentTimeMillis, j3)) {
                        String str6 = str4;
                        String str7 = str5;
                        int i46 = 0;
                        int i47 = 0;
                        int i48 = 0;
                        int i49 = 0;
                        int i54 = 0;
                        int i55 = 0;
                        int i56 = 0;
                        int i57 = i44;
                        int i58 = i45;
                        int i59 = 0;
                        int i64 = 0;
                        while (i57 <= i4) {
                            int max = Math.max(0, i58) + i39;
                            int[] iArr15 = iArr10[i57 + i4];
                            iArr15[0] = iArr13[max];
                            iArr15[1] = iArr14[max];
                            iArr15[2] = iArr11[max];
                            int abs = i28 - Math.abs(i57);
                            i59 += iArr13[max] * abs;
                            i64 += iArr14[max] * abs;
                            i46 += iArr11[max] * abs;
                            if (i57 > 0) {
                                i54 += iArr15[0];
                                i55 += iArr15[1];
                                i56 += iArr15[2];
                            } else {
                                i47 += iArr15[0];
                                i48 += iArr15[1];
                                i49 += iArr15[2];
                            }
                            int i65 = i26;
                            if (i57 < i65) {
                                i58 += width;
                            }
                            i57++;
                            i26 = i65;
                            long j4 = j;
                        }
                        int i66 = i26;
                        if (z) {
                            int i67 = i59;
                            i3 = i64;
                            j2 = j;
                            if (checkTimeout(currentTimeMillis, j2)) {
                                Log.m105920e(str7, str6);
                                return null;
                            }
                            i2 = i67;
                            str = str6;
                            str2 = str7;
                        } else {
                            i2 = i59;
                            i3 = i64;
                            str = str6;
                            str2 = str7;
                            j2 = j;
                        }
                        int i68 = i4;
                        String str8 = str2;
                        int i69 = i39;
                        int i74 = i38;
                        int i75 = i55;
                        int i76 = i54;
                        int i77 = i49;
                        int i78 = i48;
                        int i79 = i47;
                        int i84 = i46;
                        int i85 = 0;
                        while (i85 < i74) {
                            iArr3[i69] = (iArr3[i69] & -16777216) | (iArr12[i2] << 16) | (iArr12[i3] << 8) | iArr12[i84];
                            int i86 = i2 - i79;
                            int i87 = i3 - i78;
                            int i88 = i84 - i77;
                            int[] iArr16 = iArr10[((i68 - i4) + i37) % i37];
                            int i89 = i79 - iArr16[0];
                            int i94 = i78 - iArr16[1];
                            int i95 = i77 - iArr16[2];
                            if (i39 == 0) {
                                iArr8[i85] = Math.min(i85 + i28, i66) * width;
                            }
                            int i96 = iArr8[i85] + i39;
                            int i97 = iArr13[i96];
                            iArr16[0] = i97;
                            int i98 = iArr14[i96];
                            iArr16[1] = i98;
                            int i99 = iArr11[i96];
                            iArr16[2] = i99;
                            int i100 = i76 + i97;
                            int i101 = i75 + i98;
                            int i102 = i56 + i99;
                            i2 = i86 + i100;
                            i3 = i87 + i101;
                            i84 = i88 + i102;
                            i68 = (i68 + 1) % i37;
                            int[] iArr17 = iArr10[i68];
                            int i103 = iArr17[0];
                            i79 = i89 + i103;
                            int i104 = iArr17[1];
                            i78 = i94 + i104;
                            int i105 = iArr17[2];
                            i77 = i95 + i105;
                            i76 = i100 - i103;
                            i75 = i101 - i104;
                            i56 = i102 - i105;
                            i69 += width;
                            i85++;
                            i4 = i;
                        }
                        i39++;
                        i4 = i;
                        i26 = i66;
                        i38 = i74;
                        j3 = j2;
                        str4 = str;
                        str5 = str8;
                    } else {
                        Log.m105920e(str5, str4);
                        return null;
                    }
                }
                bitmap2.setPixels(iArr3, 0, width, 0, 0, width, i38);
                return bitmap2;
            } else if (!z || !checkTimeout(currentTimeMillis, j3)) {
                int i106 = i15;
                String str9 = str3;
                int i107 = i29;
                int[] iArr18 = iArr6;
                int i108 = -i4;
                int i109 = 0;
                int i110 = 0;
                int i111 = 0;
                int i112 = 0;
                int i113 = 0;
                int i114 = 0;
                int i115 = 0;
                int i116 = 0;
                int i117 = 0;
                while (i108 <= i4) {
                    int[] iArr19 = iArr4;
                    int[] iArr20 = iArr5;
                    int i118 = iArr3[i35 + Math.min(i9, Math.max(i108, 0))];
                    int[] iArr21 = iArr10[i108 + i4];
                    iArr21[0] = (i118 & 16711680) >> 16;
                    iArr21[1] = (i118 & 65280) >> 8;
                    iArr21[2] = i118 & 255;
                    int abs2 = i28 - Math.abs(i108);
                    int i119 = iArr21[0];
                    i109 += i119 * abs2;
                    int i120 = iArr21[1];
                    i110 += i120 * abs2;
                    int i121 = iArr21[2];
                    i111 += abs2 * i121;
                    if (i108 > 0) {
                        i115 += i119;
                        i116 += i120;
                        i117 += i121;
                    } else {
                        i112 += i119;
                        i113 += i120;
                        i114 += i121;
                    }
                    i108++;
                    iArr5 = iArr20;
                    iArr4 = iArr19;
                }
                int[] iArr22 = iArr4;
                int[] iArr23 = iArr5;
                if (!z || !checkTimeout(currentTimeMillis, j3)) {
                    int i122 = i4;
                    int i123 = 0;
                    while (i123 < width) {
                        iArr22[i35] = iArr7[i109];
                        iArr23[i35] = iArr7[i110];
                        iArr18[i35] = iArr7[i111];
                        int i124 = i109 - i112;
                        int i125 = i110 - i113;
                        int i126 = i111 - i114;
                        int[] iArr24 = iArr10[((i122 - i4) + i37) % i37];
                        int i127 = i112 - iArr24[0];
                        int i128 = i113 - iArr24[1];
                        int i129 = i114 - iArr24[2];
                        if (i107 == 0) {
                            iArr = iArr7;
                            iArr8[i123] = Math.min(i123 + i4 + 1, i9);
                        } else {
                            iArr = iArr7;
                        }
                        int i130 = iArr3[i36 + iArr8[i123]];
                        int i131 = (i130 & 16711680) >> 16;
                        iArr24[0] = i131;
                        int i132 = (i130 & 65280) >> 8;
                        iArr24[1] = i132;
                        int i133 = i130 & 255;
                        iArr24[2] = i133;
                        int i134 = i115 + i131;
                        int i135 = i116 + i132;
                        int i136 = i117 + i133;
                        i109 = i124 + i134;
                        i110 = i125 + i135;
                        i111 = i126 + i136;
                        i122 = (i122 + 1) % i37;
                        int[] iArr25 = iArr10[i122 % i37];
                        int i137 = iArr25[0];
                        i112 = i127 + i137;
                        int i138 = iArr25[1];
                        i113 = i128 + i138;
                        int i139 = iArr25[2];
                        i114 = i129 + i139;
                        i115 = i134 - i137;
                        i116 = i135 - i138;
                        i117 = i136 - i139;
                        i35++;
                        i123++;
                        iArr7 = iArr;
                    }
                    int[] iArr26 = iArr7;
                    i36 += width;
                    i29 = i107 + 1;
                    str3 = str9;
                    i17 = i37;
                    i15 = i106;
                    iArr6 = iArr18;
                    iArr5 = iArr23;
                    iArr4 = iArr22;
                } else {
                    Log.m105920e(str9, str4);
                    return null;
                }
            } else {
                Log.m105920e(str3, str4);
                return null;
            }
        }
    }

    public static Bitmap getBitmapNative(String str, Bitmap.Config config) {
        return getBitmapNative(str, 0, 0, 0.0f, config);
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, boolean z, float f, boolean z2, int[] iArr) {
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105920e(TAG, "getRoundedCornerBitmap in bitmap is null");
            return null;
        }
        setBitmapDensity(bitmap);
        if (iArr == null) {
            iArr = new int[]{bitmap.getWidth(), bitmap.getHeight()};
        }
        Bitmap createBitmap = createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888, z2);
        if (createBitmap == null) {
            return null;
        }
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        Rect rect2 = new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        RectF rectF = new RectF(rect2);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-4144960);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        if (z) {
            Log.m105925i(TAG, "getRoundedCornerBitmap bitmap recycle %s", bitmap);
            bitmap.recycle();
        }
        setBitmapDensity(createBitmap);
        return BitmapTracer.trace(createBitmap);
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, String str3) {
        return createThumbNail(str, i, i2, compressFormat, i3, str2, str3, false);
    }

    public static Bitmap decodeFileWithSample(String str, int i, int i2, boolean z) {
        int i3;
        int i4;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        decodeFile(str, options);
        Log.m105925i(TAG, "decodeFileWithSample >> outWidth: %d, outHeight: %d, targetWidth: %d, targetHeight: %d, adapt: %b", Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight), Integer.valueOf(i2), Integer.valueOf(i), Boolean.valueOf(z));
        if (z && (i3 = options.outWidth) <= i && (i4 = options.outHeight) <= i2) {
            i = i3;
            i2 = i4;
        }
        int calculateInSampleSize = calculateInSampleSize(options.outWidth, options.outHeight, i, i2);
        options.inSampleSize = calculateInSampleSize;
        options.inJustDecodeBounds = false;
        Log.m105925i(TAG, "decodeFileWithSample >> inSampleSize: %d", Integer.valueOf(calculateInSampleSize));
        return decodeFile(str, options);
    }

    public static Bitmap getBitmapNative(InputStream inputStream) {
        return getBitmapNative(0, (String) null, (byte[]) null, (Uri) null, inputStream, false, 0.0f, 0, 0, (Bitmap.Config) null);
    }

    public static Bitmap getBitmapNativeDisplayMetrics(String str) {
        DisplayMetrics defaultDisplayMetrics = getDefaultDisplayMetrics();
        return getBitmapNative(str, defaultDisplayMetrics.widthPixels, defaultDisplayMetrics.heightPixels);
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2) {
        return createThumbNail(false, str, i, i2, compressFormat, i3, str2, false);
    }

    public static Bitmap getBitmapNative(int i) {
        return getBitmapNative(i, (String) null, (byte[]) null, (Uri) null, false, 0.0f, 0, 0);
    }

    public static void getImageWriteOutputStream(C86009m1 m1Var, ImageWriteOSCallback imageWriteOSCallback) {
        getImageWriteOutputStream(m1Var.mo119971i(), imageWriteOSCallback);
    }

    public static boolean createThumbNail(boolean z, String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2) {
        return createThumbNail(z, str, i, i2, compressFormat, i3, str2, false);
    }

    public static Bitmap decodeByteArray(byte[] bArr, int i, int i2) {
        return decodeByteArray(bArr, i, i2, (Bitmap.Config) null);
    }

    public static Bitmap getBitmapNative(int i, float f) {
        return getBitmapNative(i, (String) null, (byte[]) null, (Uri) null, false, f, 0, 0);
    }

    @Deprecated
    public static OutputStream getImageWriteOutputStream(String str) {
        if (pathNeedUseMediaApi(str)) {
            return ScopedStorageUtil.Exports.getImageOutputStream(MMApplicationContext.getContext(), str);
        }
        return C86013q1.m106429K(str, false);
    }

    public static Bitmap createBitmapWithColor(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, (float) bitmap.getHeight(), (float) bitmap.getWidth(), 0.0f, i, i2, Shader.TileMode.CLAMP));
        paint.setStrokeWidth((float) bitmap.getWidth());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawRect(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight(), paint);
        return createBitmap;
    }

    public static boolean createThumbNail(boolean z, String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z2) {
        return createThumbNail(z, str, i, i2, compressFormat, i3, str2, z2, new PInt(), new PInt());
    }

    public static Bitmap decodeByteArray(byte[] bArr) {
        return decodeByteArray(bArr, 0, 0);
    }

    public static Bitmap getBitmapNative(int i, int i2, int i3) {
        return getBitmapNative(i, (String) null, (byte[]) null, (Uri) null, false, 0.0f, i2, i3);
    }

    public static Bitmap createBitmap(int i, int i2, Bitmap.Config config) {
        return createBitmap(i, i2, config, false);
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z) {
        return createThumbNail(false, str, i, i2, compressFormat, i3, str2, z, new PInt(), new PInt());
    }

    public static Bitmap decodeByteArray(byte[] bArr, Bitmap.Config config) {
        return decodeByteArray(bArr, DEFAULT_TARGET_WIDTH, DEFAULT_TARGET_WIDTH, config);
    }

    public static Bitmap getBitmapNative(String str, float f) {
        return getBitmapNative(str, 0, 0, f);
    }

    public static boolean createThumbNail(boolean z, String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z2, PInt pInt, PInt pInt2) {
        return createThumbNail(z, str, i, i2, compressFormat, i3, str2, z2, pInt, pInt2, false, (C101610c) null, 0);
    }

    public static Bitmap getBitmapNative(String str, int i, int i2) {
        return getBitmapNative(str, i, i2, 0.0f);
    }

    public static void getImageWriteOutputStream(String str, final ImageWriteOSCallback imageWriteOSCallback) {
        if (pathNeedUseMediaApi(str)) {
            ScopedStorageUtil.Exports.getImageOutputStream(MMApplicationContext.getContext(), str, new ScopedStorageUtil.MediaStoreOps.Callback() {
                public void onSuccess(ScopedStorageUtil.MediaStoreOps.Controller controller) {
                    ImageWriteOSCallback.this.callback(controller.getOutputStream());
                    controller.removePendingStats();
                }
            });
        } else {
            imageWriteOSCallback.callback(C86013q1.m106429K(str, false));
        }
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z, PInt pInt, PInt pInt2) {
        return createThumbNail(false, str, i, i2, compressFormat, i3, str2, z, pInt, pInt2, false, (C101610c) null, 0);
    }

    public static Bitmap getBitmapNative(InputStream inputStream, int i, int i2) {
        return getBitmapNative(0, (String) null, (byte[]) null, (Uri) null, inputStream, false, 0.0f, i, i2, (Bitmap.Config) null);
    }

    public static boolean convertImageFile(C86009m1 m1Var, OutputStream outputStream, Bitmap.CompressFormat compressFormat) {
        try {
            boolean convertImageFile = convertImageFile(m1Var, outputStream, new MMBitmapFactory.Options(), compressFormat);
            outputStream.flush();
            return convertImageFile;
        } catch (OutOfMemoryError e) {
            Log.printErrStackTrace(TAG, e, "[-] OOM when convert source image: %s", m1Var.mo119971i());
            return false;
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "[-] Fail to convert source image: %s", m1Var.mo119971i());
            return false;
        }
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z, PInt pInt, PInt pInt2, boolean z2) {
        return createThumbNail(false, str, i, i2, compressFormat, i3, str2, z, pInt, pInt2, z2, (C101610c) null, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0148 A[ADDED_TO_REGION, Catch:{ all -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015b A[Catch:{ all -> 0x0220 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap extractThumbNail(android.graphics.Bitmap r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            java.lang.String r5 = "x"
            r6 = 0
            java.lang.String r7 = "MicroMsg.BitmapUtil"
            if (r1 != 0) goto L_0x0018
            java.lang.String r0 = "extractThumbNail bitmap is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            return r6
        L_0x0018:
            if (r0 <= 0) goto L_0x01fd
            if (r2 > 0) goto L_0x001e
            goto L_0x01fd
        L_0x001e:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x01fa }
            r6.<init>()     // Catch:{ all -> 0x01fa }
            bindlowMemeryOption(r6)     // Catch:{ all -> 0x01fa }
            int r8 = r17.getHeight()     // Catch:{ all -> 0x01fa }
            r6.outHeight = r8     // Catch:{ all -> 0x01fa }
            int r8 = r17.getWidth()     // Catch:{ all -> 0x01fa }
            r6.outWidth = r8     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r8.<init>()     // Catch:{ all -> 0x01fa }
            java.lang.String r9 = "extractThumbNail: round="
            r8.append(r9)     // Catch:{ all -> 0x01fa }
            r8.append(r2)     // Catch:{ all -> 0x01fa }
            r8.append(r5)     // Catch:{ all -> 0x01fa }
            r8.append(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r9 = ", crop="
            r8.append(r9)     // Catch:{ all -> 0x01fa }
            r8.append(r3)     // Catch:{ all -> 0x01fa }
            java.lang.String r9 = ", recycle="
            r8.append(r9)     // Catch:{ all -> 0x01fa }
            r8.append(r4)     // Catch:{ all -> 0x01fa }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x01fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)     // Catch:{ all -> 0x01fa }
            int r8 = r6.outHeight     // Catch:{ all -> 0x01fa }
            double r8 = (double) r8     // Catch:{ all -> 0x01fa }
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 * r10
            double r12 = (double) r0     // Catch:{ all -> 0x01fa }
            double r8 = r8 / r12
            int r14 = r6.outWidth     // Catch:{ all -> 0x01fa }
            double r14 = (double) r14     // Catch:{ all -> 0x01fa }
            double r14 = r14 * r10
            double r10 = (double) r2     // Catch:{ all -> 0x01fa }
            double r14 = r14 / r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r0.<init>()     // Catch:{ all -> 0x01fa }
            java.lang.String r2 = "extractThumbNail: extract beX = "
            r0.append(r2)     // Catch:{ all -> 0x01fa }
            r0.append(r14)     // Catch:{ all -> 0x01fa }
            java.lang.String r2 = ", beY = "
            r0.append(r2)     // Catch:{ all -> 0x01fa }
            r0.append(r8)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)     // Catch:{ all -> 0x01fa }
            if (r3 == 0) goto L_0x008f
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            goto L_0x0093
        L_0x008f:
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0095
        L_0x0093:
            r0 = r14
            goto L_0x0096
        L_0x0095:
            r0 = r8
        L_0x0096:
            int r0 = (int) r0
            r6.inSampleSize = r0     // Catch:{ all -> 0x01f6 }
            r1 = 1
            if (r0 > r1) goto L_0x009e
            r6.inSampleSize = r1     // Catch:{ all -> 0x01f6 }
        L_0x009e:
            int r0 = r6.outHeight     // Catch:{ all -> 0x01f6 }
            int r2 = r6.outWidth     // Catch:{ all -> 0x01f6 }
            int r16 = r0 * r2
            int r1 = r6.inSampleSize     // Catch:{ all -> 0x01f6 }
            int r16 = r16 / r1
            int r4 = r16 / r1
            r16 = r7
            r7 = 2764800(0x2a3000, float:3.87431E-39)
            if (r4 <= r7) goto L_0x00bb
            int r1 = r1 + 1
            r6.inSampleSize = r1     // Catch:{ all -> 0x01f6 }
            r4 = r21
            r7 = r16
            r1 = 1
            goto L_0x009e
        L_0x00bb:
            if (r3 == 0) goto L_0x00de
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cf
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 * r7
            double r0 = (double) r0     // Catch:{ all -> 0x01f6 }
            double r10 = r10 * r0
            double r0 = (double) r2     // Catch:{ all -> 0x01f6 }
            double r10 = r10 / r0
            double r0 = java.lang.Math.ceil(r10)     // Catch:{ all -> 0x01f6 }
            goto L_0x00ef
        L_0x00cf:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 * r7
            double r1 = (double) r2     // Catch:{ all -> 0x01f6 }
            double r12 = r12 * r1
            double r0 = (double) r0     // Catch:{ all -> 0x01f6 }
            double r12 = r12 / r0
            double r0 = java.lang.Math.ceil(r12)     // Catch:{ all -> 0x01f6 }
        L_0x00dc:
            int r0 = (int) r0     // Catch:{ all -> 0x01f6 }
            goto L_0x0102
        L_0x00de:
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 >= 0) goto L_0x00f4
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r10 * r7
            double r0 = (double) r0     // Catch:{ all -> 0x01f6 }
            double r10 = r10 * r0
            double r0 = (double) r2     // Catch:{ all -> 0x01f6 }
            double r10 = r10 / r0
            double r0 = java.lang.Math.ceil(r10)     // Catch:{ all -> 0x01f6 }
        L_0x00ef:
            int r0 = (int) r0     // Catch:{ all -> 0x01f6 }
            r1 = r0
            r0 = r19
            goto L_0x0104
        L_0x00f4:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r12 * r7
            double r1 = (double) r2     // Catch:{ all -> 0x01f6 }
            double r12 = r12 * r1
            double r0 = (double) r0     // Catch:{ all -> 0x01f6 }
            double r12 = r12 / r0
            double r0 = java.lang.Math.ceil(r12)     // Catch:{ all -> 0x01f6 }
            goto L_0x00dc
        L_0x0102:
            r1 = r18
        L_0x0104:
            r2 = 0
            r6.inJustDecodeBounds = r2     // Catch:{ all -> 0x01f6 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r4.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r7 = "bitmap required size="
            r4.append(r7)     // Catch:{ all -> 0x01f6 }
            r4.append(r0)     // Catch:{ all -> 0x01f6 }
            r4.append(r5)     // Catch:{ all -> 0x01f6 }
            r4.append(r1)     // Catch:{ all -> 0x01f6 }
            java.lang.String r7 = ", orig="
            r4.append(r7)     // Catch:{ all -> 0x01f6 }
            int r7 = r6.outWidth     // Catch:{ all -> 0x01f6 }
            r4.append(r7)     // Catch:{ all -> 0x01f6 }
            r4.append(r5)     // Catch:{ all -> 0x01f6 }
            int r7 = r6.outHeight     // Catch:{ all -> 0x01f6 }
            r4.append(r7)     // Catch:{ all -> 0x01f6 }
            java.lang.String r7 = ", sample="
            r4.append(r7)     // Catch:{ all -> 0x01f6 }
            int r6 = r6.inSampleSize     // Catch:{ all -> 0x01f6 }
            r4.append(r6)     // Catch:{ all -> 0x01f6 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01f6 }
            r7 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)     // Catch:{ all -> 0x01f6 }
            r6 = 1
            r4 = r17
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r4, r0, r1, r6)     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0159
            if (r21 == 0) goto L_0x0158
            if (r4 == r0) goto L_0x0158
            java.lang.String r1 = "extractThumbNail bitmap recycle asdfjasjdfja asdfasd. %s"
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0220 }
            r8[r2] = r4     // Catch:{ all -> 0x0220 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r1, r8)     // Catch:{ all -> 0x0220 }
            r17.recycle()     // Catch:{ all -> 0x0220 }
        L_0x0158:
            r4 = r0
        L_0x0159:
            if (r3 == 0) goto L_0x01f2
            int r0 = r4.getWidth()     // Catch:{ all -> 0x0220 }
            r1 = 2
            r3 = r19
            if (r0 >= r3) goto L_0x0181
            java.lang.String r0 = "bmw < width %d %d"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x0220 }
            int r8 = r4.getWidth()     // Catch:{ all -> 0x0220 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0220 }
            r6[r2] = r8     // Catch:{ all -> 0x0220 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)     // Catch:{ all -> 0x0220 }
            r8 = 1
            r6[r8] = r3     // Catch:{ all -> 0x0220 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r0, r6)     // Catch:{ all -> 0x0220 }
            int r0 = r4.getWidth()     // Catch:{ all -> 0x0220 }
            goto L_0x0182
        L_0x0181:
            r0 = r3
        L_0x0182:
            int r3 = r4.getHeight()     // Catch:{ all -> 0x0220 }
            r8 = r18
            if (r3 >= r8) goto L_0x01a7
            java.lang.String r3 = "bmh < height %d %d"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0220 }
            int r6 = r4.getHeight()     // Catch:{ all -> 0x0220 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0220 }
            r1[r2] = r6     // Catch:{ all -> 0x0220 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x0220 }
            r8 = 1
            r1[r8] = r6     // Catch:{ all -> 0x0220 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r3, r1)     // Catch:{ all -> 0x0220 }
            int r1 = r4.getHeight()     // Catch:{ all -> 0x0220 }
            goto L_0x01a8
        L_0x01a7:
            r1 = r8
        L_0x01a8:
            int r3 = r4.getWidth()     // Catch:{ all -> 0x0220 }
            int r3 = r3 - r0
            r6 = 1
            int r3 = r3 >> r6
            int r8 = r4.getHeight()     // Catch:{ all -> 0x0220 }
            int r8 = r8 - r1
            int r8 = r8 >> r6
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r4, r3, r8, r0, r1)     // Catch:{ all -> 0x0220 }
            if (r1 != 0) goto L_0x01bf
            setBitmapDensity(r4)
            return r4
        L_0x01bf:
            if (r21 == 0) goto L_0x01cf
            if (r4 == r1) goto L_0x01cf
            java.lang.String r0 = "extractThumbNail bitmap recycle ajdfjajsdfjdsajjfsad. %s"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0220 }
            r3[r2] = r4     // Catch:{ all -> 0x0220 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r0, r3)     // Catch:{ all -> 0x0220 }
            r4.recycle()     // Catch:{ all -> 0x0220 }
        L_0x01cf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r0.<init>()     // Catch:{ all -> 0x01fa }
            java.lang.String r2 = "bitmap croped size="
            r0.append(r2)     // Catch:{ all -> 0x01fa }
            int r2 = r1.getWidth()     // Catch:{ all -> 0x01fa }
            r0.append(r2)     // Catch:{ all -> 0x01fa }
            r0.append(r5)     // Catch:{ all -> 0x01fa }
            int r2 = r1.getHeight()     // Catch:{ all -> 0x01fa }
            r0.append(r2)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r0)     // Catch:{ all -> 0x01fa }
            r4 = r1
        L_0x01f2:
            setBitmapDensity(r4)
            return r4
        L_0x01f6:
            r0 = move-exception
            r4 = r17
            goto L_0x0221
        L_0x01fa:
            r0 = move-exception
            r4 = r1
            goto L_0x0221
        L_0x01fd:
            r8 = r0
            r4 = r1
            r3 = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r0.<init>()     // Catch:{ all -> 0x0220 }
            java.lang.String r1 = "extractThumbNail height:"
            r0.append(r1)     // Catch:{ all -> 0x0220 }
            r0.append(r8)     // Catch:{ all -> 0x0220 }
            java.lang.String r1 = " width:"
            r0.append(r1)     // Catch:{ all -> 0x0220 }
            r0.append(r3)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0220 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)     // Catch:{ all -> 0x0220 }
            setBitmapDensity(r17)
            return r6
        L_0x0220:
            r0 = move-exception
        L_0x0221:
            setBitmapDensity(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(android.graphics.Bitmap, int, int, boolean, boolean):android.graphics.Bitmap");
    }

    public static Bitmap getBitmapNative(String str, int i, int i2, float f) {
        return getBitmapNative(0, str, (byte[]) null, (Uri) null, false, f, i, i2);
    }

    public static Bitmap createLocation(String str, int i, int i2, int i3) {
        if (str == null || str.equals("") || i < 0 || i2 < 0 || i3 < 0) {
            Log.m105928w(TAG, "createLocation fail. srcResId or maskResId is null,or width/height <0");
            return null;
        }
        Bitmap trace = BitmapTracer.trace(decodeByteArray(C86013q1.m106433O(str, 0, -1)), str);
        if (trace == null || trace.isRecycled()) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Bitmap trace2 = BitmapTracer.trace(createBitmap(i2, i3, Bitmap.Config.ARGB_8888));
        setBitmapDensity(trace2);
        Canvas canvas = new Canvas(trace2);
        Log.m105919d(TAG, "bm size w %d h %d target w %d h %d", Integer.valueOf(trace.getWidth()), Integer.valueOf(trace.getHeight()), Integer.valueOf(i2), Integer.valueOf(i3));
        canvas.drawBitmap(trace, (Rect) null, new Rect(0, 0, i2, i3), new Paint());
        Log.m105918d(TAG, "create nine patch bitmap " + (System.currentTimeMillis() - currentTimeMillis));
        return createChattingImage(trace2, i);
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z, PInt pInt, PInt pInt2, boolean z2, int i4) {
        return createThumbNail(false, str, i, i2, compressFormat, i3, str2, z, pInt, pInt2, z2, (C101610c) null, i4);
    }

    public static Bitmap getBitmapNative(String str, int i, int i2, float f, Bitmap.Config config) {
        return getBitmapNative(0, str, (byte[]) null, (Uri) null, false, f, i, i2, config);
    }

    public static boolean rotate(String str, int i, Bitmap.CompressFormat compressFormat, int i2, String str2) {
        Bitmap bitmapNative = getBitmapNative(str);
        if (bitmapNative == null) {
            Log.m105920e(TAG, "rotate: create bitmap fialed");
            return false;
        }
        float width = (float) bitmapNative.getWidth();
        float height = (float) bitmapNative.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i, width / 2.0f, height / 2.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmapNative, 0, 0, (int) width, (int) height, matrix, true);
        if (bitmapNative != createBitmap) {
            Log.m105925i(TAG, "rotate bitmap recycle adjfjads fadsj fsadjf dsa. %s", bitmapNative.toString());
            bitmapNative.recycle();
        }
        try {
            saveBitmapToImage(createBitmap, i2, compressFormat, str2, true);
            return true;
        } catch (IOException e) {
            Log.printErrStackTrace(TAG, e, "create %s from orig failed: " + str2, new Object[0]);
            return false;
        }
    }

    public static boolean createThumbNail(boolean z, String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z2, PInt pInt, PInt pInt2, boolean z3, C101610c cVar, int i4) {
        try {
            Bitmap extractThumbNail = extractThumbNail(str, i, i2, z3);
            if (extractThumbNail == null) {
                return false;
            }
            if (z2) {
                extractThumbNail = rotate(extractThumbNail, (float) Exif.fromFile(str).getOrientationInDegree());
            }
            if (cVar != null) {
                cVar.mo141082a();
            }
            pInt.value = extractThumbNail.getWidth();
            pInt2.value = extractThumbNail.getHeight();
            Bitmap drawBackgroundInNeed = drawBackgroundInNeed(extractThumbNail, str, i4);
            if (z) {
                int compressByQualityOptim = ImageOptimLib.compressByQualityOptim(drawBackgroundInNeed, i3, false, str2);
                Log.m105925i(TAG, "dkimgopt compressByQualityOptim ret:%d  [%d,%d,%d] path:%s", Integer.valueOf(compressByQualityOptim), Integer.valueOf(i3), Integer.valueOf(drawBackgroundInNeed.getWidth()), Integer.valueOf(drawBackgroundInNeed.getHeight()), str2);
                if (compressByQualityOptim == 1) {
                    return true;
                }
                return false;
            }
            saveBitmapToImage(drawBackgroundInNeed, i3, compressFormat, str2, true);
            return true;
        } catch (Throwable unused) {
            Log.m105920e(TAG, "create thumbnail from orig failed: " + str2);
            return false;
        }
    }

    public static Bitmap getBitmapNative(Uri uri, int i, int i2, float f) {
        return getBitmapNative(0, (String) null, (byte[]) null, uri, false, f, i, i2);
    }

    public static Bitmap getBitmapNative(Uri uri, float f) {
        return getBitmapNative(0, (String) null, (byte[]) null, uri, false, f, 0, 0);
    }

    public static Bitmap getBitmapNative(Uri uri, int i, int i2) {
        return getBitmapNative(uri, i, i2, 0.0f);
    }

    private static boolean convertImageFile(C86009m1 m1Var, OutputStream outputStream, BitmapFactory.Options options, Bitmap.CompressFormat compressFormat) {
        try {
            Bitmap d = MMBitmapFactory.m98735d(m1Var.mo119971i(), options);
            if (d == null) {
                Log.m105921e(TAG, "[-] Fail to decode source image: %s", m1Var.mo119971i());
                return false;
            }
            int orientationInDegree = Exif.fromFile(m1Var.mo119971i()).getOrientationInDegree();
            if (!(orientationInDegree == 0 || orientationInDegree == 360)) {
                d = rotate(d, (float) orientationInDegree);
            }
            try {
                d.compress(compressFormat, 95, outputStream);
                outputStream.flush();
                return true;
            } catch (OutOfMemoryError e) {
                Log.printErrStackTrace(TAG, e, "[-] OOM when convert source image: %s", m1Var.mo119971i());
                return false;
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "[-] Fail to compress source image: %s", m1Var.mo119971i());
                return false;
            } finally {
                d.recycle();
            }
        } catch (OutOfMemoryError e2) {
            Log.printErrStackTrace(TAG, e2, "[-] OOM when decode source image: %s", m1Var.mo119971i());
            return false;
        } catch (Throwable th4) {
            Log.printErrStackTrace(TAG, th4, "[-] Fail to decode source image: %s", m1Var.mo119971i());
            return false;
        }
    }

    public static Bitmap getBitmapNative(Uri uri) {
        return getBitmapNative(uri, 0, 0);
    }

    private static Bitmap getBitmapNative(int i, String str, byte[] bArr, Uri uri, boolean z, float f, int i2, int i3) {
        return getBitmapNative(i, str, bArr, uri, (InputStream) null, z, f, i2, i3, (Bitmap.Config) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008d, code lost:
        if (r3 <= 1.001d) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap rotateAndScale(android.graphics.Bitmap r16, float r17, float r18, float r19, boolean r20) {
        /*
            r8 = r16
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r9 = "MicroMsg.BitmapUtil"
            if (r8 != 0) goto L_0x0014
            java.lang.String r0 = "rotateAndScale temBmp is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r0 = 0
            return r0
        L_0x0014:
            int r3 = r16.getWidth()
            r4 = 2
            r10 = 1
            r11 = 0
            if (r3 == 0) goto L_0x00e1
            int r3 = r16.getHeight()
            if (r3 != 0) goto L_0x0025
            goto L_0x00e1
        L_0x0025:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Float r5 = java.lang.Float.valueOf(r17)
            r3[r11] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r18)
            r3[r10] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r19)
            r3[r4] = r5
            java.lang.String r5 = "rotateAndScale degree: %s, scaleWidth: %s, scaleHeight: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r5, r3)
            r3 = 0
            r5 = 4607186922399644778(0x3ff004189374bc6a, double:1.001)
            r12 = 4607173411600762667(0x3feff7ced916872b, double:0.999)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x0064
            double r14 = (double) r1
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0064
            double r14 = (double) r2
            int r7 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0064
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0064
            if (r20 != 0) goto L_0x0064
            return r8
        L_0x0064:
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r7.reset()
            if (r3 == 0) goto L_0x007d
            int r3 = r16.getWidth()
            int r3 = r3 / r4
            float r3 = (float) r3
            int r14 = r16.getHeight()
            int r14 = r14 / r4
            float r4 = (float) r14
            r7.setRotate(r0, r3, r4)
        L_0x007d:
            double r3 = (double) r1
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x008f
            double r3 = (double) r2
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x008f
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0092
        L_0x008f:
            r7.postScale(r1, r2)
        L_0x0092:
            if (r20 == 0) goto L_0x009b
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.postScale(r0, r1)
        L_0x009b:
            r2 = 0
            r3 = 0
            int r4 = r16.getWidth()     // Catch:{ all -> 0x00d2 }
            int r5 = r16.getHeight()     // Catch:{ all -> 0x00d2 }
            r0 = 1
            r1 = r16
            r6 = r7
            r7 = r0
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00d2 }
            setBitmapDensity(r1)     // Catch:{ all -> 0x00cf }
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r1
            java.lang.String r2 = "rotateAndScale, resultBmp: %s. "
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            if (r8 == r1) goto L_0x00ca
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            java.lang.String r2 = "rotateAndScale bitmap recycle %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r0)
            r16.recycle()
        L_0x00ca:
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r1)
            return r0
        L_0x00cf:
            r0 = move-exception
            r8 = r1
            goto L_0x00d3
        L_0x00d2:
            r0 = move-exception
        L_0x00d3:
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r0)
            r1[r11] = r0
            java.lang.String r0 = "createBitmap failed : %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r0, r1)
            return r8
        L_0x00e1:
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r1 = r16.getWidth()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r11] = r1
            int r1 = r16.getHeight()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r10] = r1
            java.lang.String r1 = "rotateAndScale failed width : %s, height : %s "
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotateAndScale(android.graphics.Bitmap, float, float, float, boolean):android.graphics.Bitmap");
    }

    private static Bitmap getBitmapNative(int i, String str, byte[] bArr, Uri uri, boolean z, float f, int i2, int i3, Bitmap.Config config) {
        return getBitmapNative(i, str, bArr, uri, (InputStream) null, z, f, i2, i3, config);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[Catch:{ all -> 0x00b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0099 A[SYNTHETIC, Splitter:B:41:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3 A[Catch:{ all -> 0x00e5, all -> 0x00f4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap getBitmapNative(int r21, java.lang.String r22, byte[] r23, android.net.Uri r24, java.io.InputStream r25, boolean r26, float r27, int r28, int r29, android.graphics.Bitmap.Config r30) {
        /*
            r1 = r25
            r0 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = ""
            java.lang.String r5 = "MicroMsg.BitmapUtil"
            r6 = 1
            r7 = 0
            if (r0 != 0) goto L_0x0014
            if (r2 != 0) goto L_0x0014
            r8 = 1
            goto L_0x0015
        L_0x0014:
            r8 = 0
        L_0x0015:
            r9 = 0
            if (r0 < 0) goto L_0x00f9
            if (r2 >= 0) goto L_0x001c
            goto L_0x00f9
        L_0x001c:
            r10 = 1126170624(0x43200000, float:160.0)
            r11 = 0
            if (r1 == 0) goto L_0x0045
            boolean r12 = r25.markSupported()     // Catch:{ all -> 0x0041 }
            if (r12 == 0) goto L_0x0028
            goto L_0x0045
        L_0x0028:
            boolean r12 = r1 instanceof java.io.FileInputStream     // Catch:{ all -> 0x0041 }
            if (r12 == 0) goto L_0x0035
            com.tencent.mm.sdk.platformtools.FileSeekingInputStream r12 = new com.tencent.mm.sdk.platformtools.FileSeekingInputStream     // Catch:{ all -> 0x0041 }
            r13 = r1
            java.io.FileInputStream r13 = (java.io.FileInputStream) r13     // Catch:{ all -> 0x0041 }
            r12.<init>(r13)     // Catch:{ all -> 0x0041 }
            goto L_0x0046
        L_0x0035:
            boolean r12 = r25.markSupported()     // Catch:{ all -> 0x0041 }
            if (r12 != 0) goto L_0x0045
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0041 }
            r12.<init>(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x0046
        L_0x0041:
            r0 = move-exception
            r14 = r1
            goto L_0x00b4
        L_0x0045:
            r12 = r1
        L_0x0046:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00b2 }
            r1.<init>()     // Catch:{ all -> 0x00b2 }
            int r13 = (r27 > r11 ? 1 : (r27 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x0054
            float r13 = r27 * r10
            int r13 = (int) r13     // Catch:{ all -> 0x00b2 }
            r1.inDensity = r13     // Catch:{ all -> 0x00b2 }
        L_0x0054:
            if (r8 != 0) goto L_0x0095
            r1.inJustDecodeBounds = r6     // Catch:{ all -> 0x00b2 }
            r13 = r1
            r14 = r23
            r15 = r22
            r16 = r24
            r17 = r12
            r18 = r26
            r19 = r21
            decodeBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00b2 }
            int r6 = r1.outWidth     // Catch:{ all -> 0x00b2 }
            int r1 = r1.outHeight     // Catch:{ all -> 0x00b2 }
            android.graphics.BitmapFactory$Options r13 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00b2 }
            r13.<init>()     // Catch:{ all -> 0x00b2 }
            android.graphics.Bitmap$Config r14 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00b2 }
            r13.inPreferredConfig = r14     // Catch:{ all -> 0x00b2 }
            if (r0 <= r2) goto L_0x0079
            if (r6 < r1) goto L_0x007d
        L_0x0079:
            if (r0 >= r2) goto L_0x0082
            if (r6 <= r1) goto L_0x0082
        L_0x007d:
            r20 = r6
            r6 = r1
            r1 = r20
        L_0x0082:
            if (r6 > r0) goto L_0x0086
            if (r1 <= r2) goto L_0x0096
        L_0x0086:
            float r6 = (float) r6     // Catch:{ all -> 0x00b2 }
            float r0 = (float) r0     // Catch:{ all -> 0x00b2 }
            float r6 = r6 / r0
            float r0 = (float) r1     // Catch:{ all -> 0x00b2 }
            float r1 = (float) r2     // Catch:{ all -> 0x00b2 }
            float r0 = r0 / r1
            float r0 = java.lang.Math.max(r6, r0)     // Catch:{ all -> 0x00b2 }
            int r0 = (int) r0     // Catch:{ all -> 0x00b2 }
            r13.inSampleSize = r0     // Catch:{ all -> 0x00b2 }
            r1 = r0
            goto L_0x0097
        L_0x0095:
            r13 = r1
        L_0x0096:
            r1 = 0
        L_0x0097:
            if (r3 == 0) goto L_0x009b
            r13.inPreferredConfig = r3     // Catch:{ all -> 0x00af }
        L_0x009b:
            bindlowMemeryOption(r13)     // Catch:{ all -> 0x00af }
            r14 = r23
            r15 = r22
            r16 = r24
            r17 = r12
            r18 = r26
            r19 = r21
            android.graphics.Bitmap r9 = decodeBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00af }
            goto L_0x00ec
        L_0x00af:
            r0 = move-exception
            r14 = r12
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            r14 = r12
        L_0x00b4:
            r1 = 0
        L_0x00b5:
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ all -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r4, r2)     // Catch:{ all -> 0x00f4 }
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x00f4 }
            r0.<init>()     // Catch:{ all -> 0x00f4 }
            int r2 = (r27 > r11 ? 1 : (r27 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x00c8
            float r2 = r27 * r10
            int r2 = (int) r2     // Catch:{ all -> 0x00f4 }
            r0.inDensity = r2     // Catch:{ all -> 0x00f4 }
        L_0x00c8:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ all -> 0x00f4 }
            r0.inPreferredConfig = r2     // Catch:{ all -> 0x00f4 }
            if (r8 != 0) goto L_0x00d2
            if (r1 == 0) goto L_0x00d2
            r0.inSampleSize = r1     // Catch:{ all -> 0x00f4 }
        L_0x00d2:
            bindlowMemeryOption(r0)     // Catch:{ all -> 0x00f4 }
            r10 = r0
            r11 = r23
            r12 = r22
            r13 = r24
            r15 = r26
            r16 = r21
            android.graphics.Bitmap r9 = decodeBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00e5 }
            goto L_0x00ec
        L_0x00e5:
            r0 = move-exception
            r1 = r0
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x00f4 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r4, r0)     // Catch:{ all -> 0x00f4 }
        L_0x00ec:
            setBitmapDensity(r9)
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r9)
            return r0
        L_0x00f4:
            r0 = move-exception
            setBitmapDensity(r9)
            throw r0
        L_0x00f9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.getBitmapNative(int, java.lang.String, byte[], android.net.Uri, java.io.InputStream, boolean, float, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public static Bitmap rotate(Bitmap bitmap, float f, boolean z) {
        Throwable th;
        Bitmap bitmap2;
        if (bitmap == null || f % 360.0f == 0.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.setRotate(f, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        try {
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            try {
                setBitmapDensity(bitmap2);
                StringBuilder sb = new StringBuilder();
                sb.append("resultBmp is null: ");
                sb.append(bitmap2 == null);
                sb.append("  degree:");
                sb.append(f);
                Log.m105918d(TAG, sb.toString());
                if (z && bitmap != bitmap2) {
                    Log.m105925i(TAG, "rotate bitmap recycle ajsdfasdf adsf. %s", bitmap);
                    bitmap.recycle();
                }
                return BitmapTracer.trace(bitmap2);
            } catch (Throwable th4) {
                th = th4;
                Log.m105919d(TAG, "createBitmap failed : %s ", Util.stackTraceToString(th));
                return bitmap2;
            }
        } catch (Throwable th5) {
            bitmap2 = bitmap;
            th = th5;
            Log.m105919d(TAG, "createBitmap failed : %s ", Util.stackTraceToString(th));
            return bitmap2;
        }
    }

    public static boolean createThumbNail(String str, int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str2, boolean z, PInt pInt, PInt pInt2, boolean z2, boolean z3, int i4) {
        int i5;
        Bitmap bitmap;
        String str3 = str;
        int i6 = i;
        int i7 = i2;
        String str4 = str2;
        boolean z4 = z2;
        if (Util.isNullOrNil(str)) {
            Log.m105928w(TAG, "file path is null.");
            return false;
        } else if (!C86013q1.m106450k(str)) {
            Log.m105928w(TAG, "file did not exists.");
            return false;
        } else {
            if (z) {
                i5 = Exif.fromFile(str).getOrientationInDegree();
                Log.m105919d(TAG, "degress:%d", Integer.valueOf(i5));
            } else {
                i5 = 0;
            }
            if (i5 == 90 || i5 == 270) {
                bitmap = extractThumbNail(str, i2, i, z4);
                if (z) {
                    bitmap = rotate(bitmap, (float) i5);
                }
            } else {
                bitmap = extractThumbNail(str, i, i2, z4);
                if (z) {
                    bitmap = rotate(bitmap, (float) i5);
                }
            }
            if (bitmap == null) {
                return false;
            }
            Bitmap drawBackgroundInNeed = drawBackgroundInNeed(bitmap, str, i4);
            try {
                pInt.value = drawBackgroundInNeed.getWidth();
                pInt2.value = drawBackgroundInNeed.getHeight();
                Bitmap.CompressFormat compressFormat2 = compressFormat;
                int i8 = i3;
                saveBitmapToImage(drawBackgroundInNeed, i3, compressFormat, str4, true);
                return true;
            } catch (IOException unused) {
                Log.m105920e(TAG, "create thumbnail from orig failed: " + str4);
                return false;
            }
        }
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, boolean z, float f) {
        return getRoundedCornerBitmap(bitmap, z, f, false, (int[]) null);
    }

    public static Bitmap decodeStream(InputStream inputStream, float f) {
        return decodeStream(inputStream, f, 0, 0);
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, boolean z, float f, int[] iArr) {
        return getRoundedCornerBitmap(bitmap, z, f, false, iArr);
    }

    public static Bitmap decodeStream(InputStream inputStream) {
        return decodeStream(inputStream, 0.0f, 0, 0);
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, boolean z, float[] fArr, boolean z2) {
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105920e(TAG, "getRoundedCornerBitmap in bitmap is null");
            return null;
        } else if (fArr == null || fArr.length != 4) {
            Log.m105920e(TAG, "getRoundedCornerBitmap roundPxArray invalid");
            return null;
        } else {
            setBitmapDensity(bitmap);
            Bitmap createBitmap = createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888, z2);
            if (createBitmap == null) {
                return null;
            }
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(rect);
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setFilterBitmap(true);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-4144960);
            canvas.drawPath(createRoundedRectPath(rectF, fArr[0], fArr[1], fArr[2], fArr[3]), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            if (z) {
                Log.m105925i(TAG, "getRoundedCornerBitmap bitmap recycle %s", bitmap);
                bitmap.recycle();
            }
            setBitmapDensity(createBitmap);
            return BitmapTracer.trace(createBitmap);
        }
    }

    public static BitmapFactory.Options getImageOptions(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105920e(TAG, "getImageOptions invalid path");
            return null;
        }
        try {
            return getImageOptions(C86013q1.m106423E(str), true);
        } catch (FileNotFoundException e) {
            Log.printErrStackTrace(TAG, e, "Decode bitmap failed.", new Object[0]);
            return new BitmapFactory.Options();
        }
    }

    public static boolean rotate(String str, int i, Bitmap.CompressFormat compressFormat, int i2, String str2, String str3) {
        return rotate(str, i, compressFormat, i2, str2 + str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r13 < r8) goto L_0x00be;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x00e5 A[EDGE_INSN: B:115:0x00e5->B:46:0x00e5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b A[Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7 A[Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e7 A[Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0107 A[Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f A[Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0130 A[Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0133 A[Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0134 A[Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017f A[Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0185 A[Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap extractThumbNailFromStream(java.io.InputStream r18, int r19, int r20, boolean r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "x"
            r5 = 0
            java.lang.String r6 = "MicroMsg.BitmapUtil"
            if (r2 <= 0) goto L_0x02e5
            if (r1 > 0) goto L_0x0014
            goto L_0x02e5
        L_0x0014:
            boolean r7 = r18.markSupported()
            if (r7 == 0) goto L_0x001b
            goto L_0x0033
        L_0x001b:
            boolean r7 = r0 instanceof java.io.FileInputStream
            if (r7 == 0) goto L_0x0027
            com.tencent.mm.sdk.platformtools.FileSeekingInputStream r7 = new com.tencent.mm.sdk.platformtools.FileSeekingInputStream
            java.io.FileInputStream r0 = (java.io.FileInputStream) r0
            r7.<init>(r0)
            goto L_0x0034
        L_0x0027:
            boolean r7 = r18.markSupported()
            if (r7 != 0) goto L_0x0033
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream
            r7.<init>(r0)
            goto L_0x0034
        L_0x0033:
            r7 = r0
        L_0x0034:
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r8 = 0
            r9 = 1
            r0.inJustDecodeBounds = r9     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10 = 8388608(0x800000, float:1.17549435E-38)
            r7.mark(r10)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            android.graphics.Bitmap r10 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r7, r5, r0)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r7.reset()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            if (r10 == 0) goto L_0x0057
            java.lang.String r11 = "extractThumeNail bitmap recycle, adsf. %s"
            java.lang.Object[] r12 = new java.lang.Object[r9]     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r12[r8] = r10     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r12)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10.recycle()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
        L_0x0057:
            int r10 = r0.outHeight     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            if (r10 <= 0) goto L_0x02a3
            int r13 = r0.outWidth     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            if (r13 > 0) goto L_0x0061
            goto L_0x02a3
        L_0x0061:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.String r13 = "extractThumbNail: round="
            r10.append(r13)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10.append(r1)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10.append(r4)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10.append(r2)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.String r13 = ", crop="
            r10.append(r13)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10.append(r3)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r10 = r0.outHeight     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            double r13 = (double) r10     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r13 = r13 * r15
            double r11 = (double) r2     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            double r13 = r13 / r11
            int r10 = r0.outWidth     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            double r8 = (double) r10
            double r8 = r8 * r15
            r17 = r6
            double r5 = (double) r1
            double r8 = r8 / r5
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.String r15 = "extractThumbNail: extract beX = "
            r10.append(r15)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r10.append(r8)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.String r15 = ", beY = "
            r10.append(r15)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r10.append(r13)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r15 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r10)     // Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }
            if (r3 == 0) goto L_0x00ba
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00c0
            goto L_0x00be
        L_0x00ba:
            int r10 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c0
        L_0x00be:
            r1 = r8
            goto L_0x00c1
        L_0x00c0:
            r1 = r13
        L_0x00c1:
            int r1 = (int) r1     // Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }
            r0.inSampleSize = r1     // Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }
            r2 = 1
            if (r1 > r2) goto L_0x00c9
            r0.inSampleSize = r2     // Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }
        L_0x00c9:
            int r1 = r0.outHeight     // Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }
            int r2 = r0.outWidth     // Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }
            int r10 = r1 * r2
            r16 = r7
            int r7 = r0.inSampleSize     // Catch:{ OutOfMemoryError -> 0x0298, IOException -> 0x0295 }
            int r10 = r10 / r7
            int r10 = r10 / r7
            r17 = r15
            r15 = 2764800(0x2a3000, float:3.87431E-39)
            if (r10 <= r15) goto L_0x00e5
            int r7 = r7 + 1
            r0.inSampleSize = r7     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r7 = r16
            r15 = r17
            goto L_0x00c9
        L_0x00e5:
            if (r3 == 0) goto L_0x0107
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f9
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 * r7
            double r7 = (double) r1     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r5 = r5 * r7
            double r1 = (double) r2     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r5 = r5 / r1
            double r1 = java.lang.Math.ceil(r5)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            goto L_0x0118
        L_0x00f9:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 * r5
            double r5 = (double) r2     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r11 = r11 * r5
            double r1 = (double) r1     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r11 = r11 / r1
            double r1 = java.lang.Math.ceil(r11)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            goto L_0x0129
        L_0x0107:
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x011c
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 * r7
            double r7 = (double) r1     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r5 = r5 * r7
            double r1 = (double) r2     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r5 = r5 / r1
            double r1 = java.lang.Math.ceil(r5)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
        L_0x0118:
            int r1 = (int) r1     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r2 = r19
            goto L_0x012d
        L_0x011c:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r11 = r11 * r5
            double r5 = (double) r2     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r11 = r11 * r5
            double r1 = (double) r1     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            double r11 = r11 / r1
            double r1 = java.lang.Math.ceil(r11)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
        L_0x0129:
            int r1 = (int) r1     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r2 = r1
            r1 = r20
        L_0x012d:
            if (r1 <= 0) goto L_0x0130
            goto L_0x0131
        L_0x0130:
            r1 = 1
        L_0x0131:
            if (r2 <= 0) goto L_0x0134
            goto L_0x0135
        L_0x0134:
            r2 = 1
        L_0x0135:
            r5 = 0
            r0.inJustDecodeBounds = r5     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5 = 1
            r0.inMutable = r5     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.String r6 = "bitmap required size="
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.append(r2)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.append(r4)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.append(r1)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.String r6 = ", orig="
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            int r6 = r0.outWidth     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.append(r4)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            int r6 = r0.outHeight     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.String r6 = ", sample="
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            int r6 = r0.inSampleSize     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            java.lang.String r5 = r5.toString()     // Catch:{ OutOfMemoryError -> 0x029f, IOException -> 0x029b }
            r6 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            bindlowMemeryOption(r0)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r7 = r16
            r5 = 0
            android.graphics.Bitmap r0 = com.tencent.p014mm.graphics.MMBitmapFactory.m98738g(r7, r5, r0)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = "bitmap decode failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            return r5
        L_0x0185:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.String r7 = "bitmap decoded size="
            r5.append(r7)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r7 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5.append(r7)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5.append(r4)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r7 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5.append(r7)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.String r5 = r5.toString()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r5)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r0, r2, r1, r5)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            if (r0 == r1) goto L_0x01be
            if (r1 == 0) goto L_0x01be
            java.lang.String r2 = "extractThumbNail bitmap recycle adsfad. %s"
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5 = 0
            r7[r5] = r0     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r7)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r0.recycle()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r0 = r1
        L_0x01be:
            if (r3 == 0) goto L_0x028d
            int r1 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r2 = r19
            if (r1 >= r2) goto L_0x01e7
            java.lang.String r1 = "bmw < width %d %d"
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r3 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r7 = 0
            r5[r7] = r3     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r3 = 1
            r5[r3] = r2     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r1, r5)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r1 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            goto L_0x01e8
        L_0x01e7:
            r1 = r2
        L_0x01e8:
            int r2 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r3 = r20
            if (r2 >= r3) goto L_0x020f
            java.lang.String r2 = "bmh < height %d %d"
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r5 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r8 = 0
            r7[r8] = r5     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5 = 1
            r7[r5] = r3     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r2, r7)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r2 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            goto L_0x0210
        L_0x020f:
            r2 = r3
        L_0x0210:
            int r3 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r3 = r3 - r1
            r5 = 1
            int r3 = r3 >> r5
            int r7 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r7 = r7 - r2
            int r7 = r7 >> r5
            if (r3 < 0) goto L_0x0221
            if (r7 >= 0) goto L_0x0253
        L_0x0221:
            java.lang.String r5 = "fix crop image error %d %d %d %d"
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r9 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10 = 0
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r9 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10 = 1
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10 = 2
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r10 = 3
            r8[r10] = r9     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r5, r8)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            if (r3 >= 0) goto L_0x0250
            r3 = 0
        L_0x0250:
            if (r7 >= 0) goto L_0x0253
            r7 = 0
        L_0x0253:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r3, r7, r1, r2)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            if (r1 != 0) goto L_0x025a
            return r0
        L_0x025a:
            if (r1 == r0) goto L_0x026b
            java.lang.String r2 = "extractThumbNail bitmap recycle adsfaasdfad. %s"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r5 = 0
            r3[r5] = r0     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r0.recycle()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r0 = r1
        L_0x026b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.String r2 = "bitmap croped size="
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r2 = r0.getWidth()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r1.append(r4)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r2 = r0.getHeight()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r1)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
        L_0x028d:
            setBitmapDensity(r0)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            android.graphics.Bitmap r0 = com.tencent.p014mm.sdk.platformtools.BitmapTracer.trace(r0)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            return r0
        L_0x0295:
            r0 = move-exception
            r6 = r15
            goto L_0x02c1
        L_0x0298:
            r0 = move-exception
            r6 = r15
            goto L_0x02cb
        L_0x029b:
            r0 = move-exception
            r6 = r17
            goto L_0x02c1
        L_0x029f:
            r0 = move-exception
            r6 = r17
            goto L_0x02cb
        L_0x02a3:
            java.lang.String r1 = "decode[%s] error, outHeight[%d] outWidth[%d]"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r3 = 0
            r2[r3] = r7     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r4 = 1
            r2[r4] = r3     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            int r0 = r0.outWidth     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r3 = 2
            r2[r3] = r0     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r1, r2)     // Catch:{ OutOfMemoryError -> 0x02ca, IOException -> 0x02c0 }
            r1 = 0
            return r1
        L_0x02c0:
            r0 = move-exception
        L_0x02c1:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Failed decode bitmap"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r2, r1)
            goto L_0x02e3
        L_0x02ca:
            r0 = move-exception
        L_0x02cb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "decode bitmap failed: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
        L_0x02e3:
            r1 = 0
            return r1
        L_0x02e5:
            r3 = r2
            r2 = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "extractThumbNail height:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " width:"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNailFromStream(java.io.InputStream, int, int, boolean):android.graphics.Bitmap");
    }
}
