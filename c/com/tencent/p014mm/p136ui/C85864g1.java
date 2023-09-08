package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.tencent.p014mm.sdk.vendor.MIUI;

/* renamed from: com.tencent.mm.ui.g1 */
public class C85864g1 {
    /* JADX WARNING: Removed duplicated region for block: B:11:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m106126a(android.content.Context r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            goto L_0x0016
        L_0x0004:
            java.lang.String r1 = "window"
            java.lang.Object r2 = r5.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            if (r2 != 0) goto L_0x0018
            java.lang.String r5 = "Luggage.LuggageUIHelper"
            java.lang.String r1 = "getRealBottomHeight, get NULL windowManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r1)
        L_0x0016:
            r2 = 0
            goto L_0x006b
        L_0x0018:
            android.view.Display r2 = r2.getDefaultDisplay()
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            r2.getSize(r3)
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            java.lang.Object r1 = r5.getSystemService(r1)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRealSize(r2)
            int r1 = r3.y
            int r3 = r3.x
            int r1 = java.lang.Math.max(r1, r3)
            int r3 = r2.y
            int r2 = r2.x
            int r2 = java.lang.Math.max(r3, r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            boolean r4 = r5 instanceof android.app.Activity
            if (r4 == 0) goto L_0x006a
            android.app.Activity r5 = (android.app.Activity) r5
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            r5.getWindowVisibleDisplayFrame(r3)
            int r5 = r3.bottom
            int r1 = r3.top
            int r5 = r5 - r1
            int r1 = r3.right
            int r3 = r3.left
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r5, r1)
        L_0x006a:
            int r2 = r2 - r1
        L_0x006b:
            if (r2 <= 0) goto L_0x006f
            r5 = 1
            goto L_0x0070
        L_0x006f:
            r5 = 0
        L_0x0070:
            if (r5 == 0) goto L_0x008a
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r2 = "dimen"
            java.lang.String r3 = "android"
            int r5 = r5.getIdentifier(r1, r2, r3)
            if (r5 <= 0) goto L_0x008a
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            int r0 = r0.getDimensionPixelSize(r5)
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C85864g1.m106126a(android.content.Context):int");
    }

    /* renamed from: b */
    public static boolean m106127b(Window window, boolean z) {
        if (!(window == null || window.getDecorView() == null)) {
            if (Build.VERSION.SDK_INT >= 23 && !MIUI.isMIUIV8()) {
                View decorView = window.getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                decorView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static void m106128c(Context context) {
        if (context instanceof Activity) {
            m106129d(((Activity) context).getWindow());
        }
    }

    /* renamed from: d */
    public static void m106129d(Window window) {
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: e */
    public static int m106130e(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return ((((int) ((((float) (i & 255)) * f) + (((float) (i2 & 255)) * f2))) & 255) << 0) | ((((int) ((((float) ((i >> 24) & 255)) * f) + (((float) ((i2 >> 24) & 255)) * f2))) & 255) << 24) | ((((int) ((((float) ((i >> 16) & 255)) * f) + (((float) ((i2 >> 16) & 255)) * f2))) & 255) << 16) | ((((int) ((((float) ((i >> 8) & 255)) * f) + (((float) ((i2 >> 8) & 255)) * f2))) & 255) << 8);
    }
}
