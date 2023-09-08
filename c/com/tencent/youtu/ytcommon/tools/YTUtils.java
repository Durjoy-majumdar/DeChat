package com.tencent.youtu.ytcommon.tools;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Map;

public class YTUtils {
    private static final String TAG = "ToolUtils";
    private static Map<String, String> mLoadedLibrary = new HashMap();

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void loadLibrary(String str) {
        if (mLoadedLibrary.get(str) == null) {
            YTLogger.m144668i(TAG, "[YTUtils.loadLibrary] " + System.getProperty("java.library.path"));
            System.loadLibrary(str);
            mLoadedLibrary.put(str, "loaded");
        }
    }

    public static void prepareMatrix(Matrix matrix, boolean z, int i, int i2, int i3) {
        YTLogger.m144667e(TAG, "prepareMatrix viewWidth=" + i2 + ",viewHeight=" + i3 + ",displayOrientation=" + i);
        matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
        matrix.postRotate((float) i);
        float f = (float) i2;
        float f2 = (float) i3;
        matrix.postScale(f / 2000.0f, f2 / 2000.0f);
        matrix.postTranslate(f / 2.0f, f2 / 2.0f);
    }

    public static Rect trans2ScreenRect(Context context, int i, int i2, Rect rect) {
        float f;
        float f2;
        int i3 = i;
        int i4 = i2;
        Rect rect2 = rect;
        long currentTimeMillis = System.currentTimeMillis();
        YTLogger.m144667e(TAG, "trans2ScreenRect srcRect=" + rect.toString());
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        YTLogger.m144667e(TAG, "trans2ScreenRect dm.widthPixels=" + displayMetrics.widthPixels);
        YTLogger.m144667e(TAG, "trans2ScreenRect dm.heightPixels=" + displayMetrics.heightPixels);
        YTLogger.m144667e(TAG, "trans2ScreenRect previewWidth=" + i3);
        YTLogger.m144667e(TAG, "trans2ScreenRect previewHeight=" + i4);
        int i5 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        float f3 = (float) i3;
        float f4 = (float) i4;
        double d = (double) ((f3 * 1.0f) / f4);
        boolean z = i5 > i6;
        int i7 = z ? i5 : i6;
        if (z) {
            i5 = i6;
        }
        boolean z2 = z;
        double d2 = (double) i7;
        long j = currentTimeMillis;
        double d3 = ((double) i5) * d;
        if (d2 < d3) {
            i7 = (int) d3;
        } else {
            i5 = (int) (d2 / d);
        }
        if (z2) {
            int i8 = i7;
            i7 = i5;
            i5 = i8;
        }
        YTLogger.m144666d(TAG, "trans2ScreenRect aspectRatio=" + d);
        YTLogger.m144666d(TAG, "trans2ScreenRect widthLonger=" + z2);
        YTLogger.m144667e(TAG, "trans2ScreenRect screenWidth=" + i5);
        YTLogger.m144667e(TAG, "trans2ScreenRect screenHeight=" + i7);
        float f5 = 0.0f;
        if (i4 * i7 > i5 * i3) {
            f2 = (((float) i7) * 1.0f) / f3;
            f5 = (((float) i5) - (f4 * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = (((float) i5) * 1.0f) / f4;
            f = (((float) i7) - (f3 * f2)) * 0.5f;
        }
        Rect rect3 = new Rect();
        rect3.set((int) ((((float) rect2.left) * f2) - f5), (int) ((((float) rect2.top) * f2) - f), (int) (((float) rect2.right) * f2), (int) (((float) rect2.bottom) * f2));
        YTLogger.m144666d(TAG, "scale=" + f2);
        YTLogger.m144666d(TAG, "dx=" + f5);
        YTLogger.m144666d(TAG, "dy=" + f);
        YTLogger.m144666d(TAG, "screenWidth=" + i5);
        YTLogger.m144666d(TAG, "screenHeight=" + i7);
        YTLogger.m144666d(TAG, "dWidth=" + i4);
        YTLogger.m144666d(TAG, "dHeight=" + i3);
        YTLogger.m144666d(TAG, "dst=" + rect3.toString());
        float f6 = (float) ((i5 - displayMetrics.widthPixels) / 2);
        float f7 = (float) ((i7 - displayMetrics.heightPixels) / 2);
        rect2.set((int) ((((float) rect2.left) * f2) - f6), (int) ((((float) rect2.top) * f2) - f7), (int) ((((float) rect2.right) * f2) - f6), (int) ((((float) rect2.bottom) * f2) - f7));
        YTLogger.m144666d(TAG, "target=" + rect.toString() + ",time=" + (System.currentTimeMillis() - j));
        return rect2;
    }

    public static Rect trans2ScreenRectForYT(Context context, int i, int i2, Rect rect) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        YTLogger.m144667e(TAG, "trans2ScreenRectForYT dm.widthPixels=" + displayMetrics.widthPixels);
        YTLogger.m144667e(TAG, "trans2ScreenRectForYT dm.heightPixels=" + displayMetrics.heightPixels);
        YTLogger.m144667e(TAG, "trans2ScreenRectForYT previewHeight=" + i2);
        float f = (((float) displayMetrics.widthPixels) * 1.0f) / ((float) i2);
        int i3 = rect.left;
        rect.set((int) (((float) i3) * f), (int) (((float) rect.top) * f), (int) (((float) (i3 + rect.width())) * f), (int) (((float) (rect.top + rect.height())) * f));
        return rect;
    }

    public static Rect translateToMeteringAreaCoordinate(int i, int i2, Rect rect) {
        Rect rect2 = new Rect();
        Matrix matrix = new Matrix();
        prepareMatrix(matrix, true, 90, i, i2);
        matrix.postRotate(0.0f);
        RectF rectF = new RectF(((float) rect.left) * 1.0f, ((float) rect.top) * 1.0f, ((float) rect.right) * 1.0f, ((float) rect.bottom) * 1.0f);
        YTLogger.m144667e(TAG, "translationToMeteringAreaCoordinate old rectF.left=" + rectF.left + ",rectF.top=" + rectF.top + ",rectF.right=" + rectF.right + ",rectF.bottom=" + rectF.bottom);
        Matrix matrix2 = new Matrix();
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        YTLogger.m144667e(TAG, "translationToMeteringAreaCoordinate new rectF.left=" + rectF.left + ",rectF.top=" + rectF.top + ",rectF.right=" + rectF.right + ",rectF.bottom=" + rectF.bottom);
        rect2.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        return rect2;
    }
}
