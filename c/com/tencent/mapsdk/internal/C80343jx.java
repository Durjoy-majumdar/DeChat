package com.tencent.mapsdk.internal;

import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: com.tencent.mapsdk.internal.jx */
public final class C80343jx {
    /* renamed from: a */
    private static void m97834a(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: b */
    private static boolean m97838b(String str, String str2, int i) {
        return m97833a(str, str2, i) > 0;
    }

    /* renamed from: c */
    private static boolean m97839c(String str, String str2, int i) {
        return m97833a(str, str2, i) == 0;
    }

    /* renamed from: a */
    private static void m97835a(View view, float f, float f2) {
        view.setScaleX(f);
        view.setScaleY(f2);
    }

    /* renamed from: a */
    private static void m97836a(Object obj, String str, int i, float... fArr) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(obj, str, new float[]{fArr[0], fArr[1]});
        ofFloat.setDuration((long) i);
        ofFloat.start();
    }

    /* renamed from: a */
    public static boolean m97837a(String str, String str2) {
        return m97833a(str, str2, 3) < 0;
    }

    /* renamed from: a */
    public static int m97833a(String str, String str2, int i) {
        int i2 = 0;
        if (C40002he.m42805a(str) || C40002he.m42805a(str2) || str.equals(str2)) {
            return 0;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i3 = 0;
        while (i2 < i) {
            String str3 = "0";
            String str4 = i2 < split.length ? split[i2] : str3;
            if (i2 < split2.length) {
                str3 = split2[i2];
            }
            try {
                i3 = Integer.valueOf(Integer.parseInt(str4)).compareTo(Integer.valueOf(Integer.parseInt(str3)));
                if (i3 != 0) {
                    break;
                }
                i2++;
            } catch (Exception unused) {
            }
        }
        return i3;
    }
}
