package com.tencent.p014mm.p136ui;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.eclipsesource.mmv8.Platform;

/* renamed from: com.tencent.mm.ui.y4 */
public class C75044y4 {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m89989a(android.content.Context r5) {
        /*
            java.lang.String r0 = "WeUIToolHelper"
            r1 = 0
            if (r5 != 0) goto L_0x000c
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "[getActionBarHeight] context is null!"
            com.tencent.p014mm.p136ui.C85975v4.m106309f(r0, r3, r2)
        L_0x000c:
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131165255(0x7f070047, float:1.7944722E38)
            int r2 = r2.getDimensionPixelSize(r3)
            boolean r3 = r5 instanceof androidx.appcompat.app.AppCompatActivity
            if (r3 == 0) goto L_0x002c
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5
            androidx.appcompat.app.ActionBar r3 = r5.getSupportActionBar()
            if (r3 == 0) goto L_0x0041
            androidx.appcompat.app.ActionBar r5 = r5.getSupportActionBar()
            int r5 = r5.mo91101l()
            goto L_0x0042
        L_0x002c:
            boolean r3 = r5 instanceof android.app.Activity
            if (r3 == 0) goto L_0x0041
            android.app.Activity r5 = (android.app.Activity) r5
            android.app.ActionBar r3 = r5.getActionBar()
            if (r3 == 0) goto L_0x0041
            android.app.ActionBar r5 = r5.getActionBar()
            int r5 = r5.getHeight()
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 > 0) goto L_0x0045
            r5 = r2
        L_0x0045:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3[r1] = r4
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3[r1] = r2
            java.lang.String r1 = "[getActionBarHeight] real:%s defaultVal:%s"
            com.tencent.p014mm.p136ui.C85975v4.m106306c(r0, r1, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.C75044y4.m89989a(android.content.Context):int");
    }

    /* renamed from: b */
    public static Point m89990b(Context context) {
        Point point = new Point();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (Build.VERSION.SDK_INT >= 30) {
            Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
            if (bounds != null) {
                point.x = bounds.width();
                point.y = bounds.height();
            } else {
                defaultDisplay.getRealSize(point);
            }
        } else {
            defaultDisplay.getRealSize(point);
        }
        return point;
    }

    /* renamed from: c */
    public static int m89991c(Context context) {
        int i = 0;
        if (!(m89993e(context) > 0)) {
            return 0;
        }
        int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID);
        if (identifier > 0) {
            i = Resources.getSystem().getDimensionPixelSize(identifier);
        }
        int e = m89993e(context);
        return (e == 0 || e >= i) ? i : e;
    }

    /* renamed from: d */
    public static boolean m89992d(Context context) {
        return m89993e(context) > 0;
    }

    /* renamed from: e */
    public static int m89993e(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Point b = m89990b(context);
        int max = Math.max(point.y, point.x);
        boolean z = false;
        if (context.getResources().getConfiguration().orientation == 1) {
            max = point.y;
        }
        int max2 = Math.max(b.y, b.x);
        Rect rect = new Rect();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            max = Math.max(rect.bottom, rect.right);
            if (context.getResources().getConfiguration().orientation == 1) {
                z = true;
            }
            if (z) {
                max = rect.bottom;
            }
        }
        return max2 - max;
    }

    /* renamed from: f */
    public static int m89994f(Context context) {
        return m89995g(context, C74942w4.m89784a(context, 25));
    }

    /* renamed from: g */
    public static int m89995g(Context context, int i) {
        int i2 = m89997i(context, i);
        if (i2 > 0) {
            if (!(context instanceof Activity)) {
                return i2;
            }
            Activity activity = (Activity) context;
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            if (displayMetrics == null || rect.height() <= 0) {
                return i2;
            }
            int height = displayMetrics.heightPixels - rect.height();
            C85975v4.m106306c("WeUIToolHelper", "[fixStatusBarHeight] new statusBar:%s ", Integer.valueOf(height));
            if (height == 0) {
                height = rect.top;
                C85975v4.m106306c("WeUIToolHelper", "[fixStatusBarHeight] new DisplayFrameTop:%s ", Integer.valueOf(height));
            }
            if (height <= i2 || height - i2 >= 100) {
                return i2;
            }
            C85975v4.m106306c("WeUIToolHelper", "[fixStatusBarHeight] return new statusBar:%s ", Integer.valueOf(height));
            return height;
        } else if (i2 > 0) {
            return i2;
        } else {
            C85975v4.m106306c("WeUIToolHelper", "[getStatusBarHeight] return default!!!", new Object[0]);
            return i;
        }
    }

    /* renamed from: h */
    public static int m89996h(Context context) {
        return m89997i(context, C74942w4.m89784a(context, 25));
    }

    /* renamed from: i */
    public static int m89997i(Context context, int i) {
        int i2;
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            String obj = cls.getField("status_bar_height").get(cls.newInstance()).toString();
            if (obj != null) {
                try {
                    if (obj.length() > 0) {
                        i2 = Integer.decode(obj).intValue();
                        i = context.getResources().getDimensionPixelSize(i2);
                        C85975v4.m106306c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", Integer.valueOf(i));
                        return i;
                    }
                } catch (NumberFormatException e) {
                    C85975v4.m106307d("WeUIUtil", e, "", new Object[0]);
                }
            }
            i2 = 0;
            i = context.getResources().getDimensionPixelSize(i2);
        } catch (Exception e2) {
            C85975v4.m106309f("WeUIToolHelper", "getStatusBarHeightFromSysR by R$dimen fail: " + e2.getMessage(), new Object[0]);
            try {
                i = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", Platform.ANDROID));
            } catch (Exception e3) {
                C85975v4.m106309f("WeUIToolHelper", "getStatusBarHeightFromSysR by identifier fail: " + e3.getMessage(), new Object[0]);
            }
        }
        C85975v4.m106306c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", Integer.valueOf(i));
        return i;
    }

    /* renamed from: j */
    public static int m89998j(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: k */
    public static boolean m89999k(Context context) {
        return !(context instanceof Activity) || (((Activity) context).getWindow().getAttributes().flags & 1024) != 1024;
    }
}
