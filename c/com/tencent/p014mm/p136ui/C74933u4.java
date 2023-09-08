package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: com.tencent.mm.ui.u4 */
public class C74933u4 {
    /* renamed from: a */
    public static int m89764a(int i, int i2) {
        if (i2 >= 0 && i2 <= 100) {
            return (i & 16777215) | (((int) ((((double) i2) * 0.01d) * 255.0d)) << 24);
        }
        C85975v4.m106305b("alphaColor", "alpha must be between 0 and 100", new Object[0]);
        return i;
    }

    /* renamed from: b */
    public static int m89765b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / 255);
        return Color.argb(i3, m89766c(Color.red(i), alpha2, Color.red(i2), alpha, i3), m89766c(Color.green(i), alpha2, Color.green(i2), alpha, i3), m89766c(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    /* renamed from: c */
    public static int m89766c(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    /* renamed from: d */
    public static Drawable m89767d(Context context, int i, int i2, int i3, int i4, float f) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(i4, i4);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(i3);
        Drawable mutate = context.getResources().getDrawable(i).mutate();
        mutate.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, mutate});
        layerDrawable.setLayerSize(1, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        layerDrawable.setLayerGravity(1, 17);
        layerDrawable.setDrawable(0, gradientDrawable);
        return layerDrawable;
    }

    /* renamed from: e */
    public static Drawable m89768e(Context context, int i, int i2) {
        Drawable drawable = context.getResources().getDrawable(i);
        if (drawable != null) {
            int i3 = i2 != 0 ? (16777215 & i2) | -16777216 : i2;
            int alpha = Color.alpha(i2);
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_ATOP));
            if (i2 != 0) {
                drawable.setAlpha(alpha);
            }
        }
        return drawable;
    }

    /* renamed from: f */
    public static Drawable m89769f(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP));
        }
        return drawable;
    }

    /* renamed from: g */
    public static boolean m89770g(int i) {
        return 1.0d - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / 255.0d) >= 0.3d;
    }
}
