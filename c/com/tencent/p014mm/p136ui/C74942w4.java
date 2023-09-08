package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;

/* renamed from: com.tencent.mm.ui.w4 */
public class C74942w4 {

    /* renamed from: a */
    public static float f220334a = -1.0f;

    /* renamed from: b */
    public static float f220335b;

    /* renamed from: c */
    public static SparseIntArray f220336c = new SparseIntArray();

    /* renamed from: a */
    public static int m89784a(Context context, int i) {
        return Math.round(m89787d(context) * ((float) i));
    }

    /* renamed from: b */
    public static Drawable m89785b(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: c */
    public static int m89786c(Context context, int i) {
        if (context == null) {
            C85975v4.m106305b("WeUIResHelper", "get dimension pixel size, resId %d, but context is null" + i, new Object[0]);
            return 0;
        }
        int i2 = f220336c.get(i, 0);
        if (i2 != 0) {
            return i2;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        f220336c.put(i, dimensionPixelSize);
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static float m89787d(Context context) {
        if (context != null && f220334a < 0.0f) {
            f220334a = context.getResources().getDisplayMetrics().density;
        }
        return f220334a;
    }

    /* renamed from: e */
    public static float m89788e(Context context) {
        if (f220335b == 0.0f) {
            if (context == null) {
                f220335b = 1.0f;
            } else {
                f220335b = context.getSharedPreferences("com.tencent.mm_preferences", 0).getFloat("text_size_scale_key", 1.0f);
            }
        }
        return f220335b;
    }
}
