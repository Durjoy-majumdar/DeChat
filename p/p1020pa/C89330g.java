package p1020pa;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.eclipsesource.mmv8.Platform;
import p1005ma.C88718b;

/* renamed from: pa.g */
public class C89330g {

    /* renamed from: a */
    public static String f257299a;

    /* renamed from: b */
    public static String f257300b;

    /* renamed from: a */
    public static String m111649a(String str) {
        return (!m111654f(str) && !str.contains("huawei") && !str.contains("honor")) ? (str.contains("xiaomi") || str.contains("redmi")) ? "force_fsg_nav_bar" : str.contains("vivo") ? "navigation_gesture_on" : str.contains("oppo") ? "hide_navigationbar_enable" : str.contains("samsung") ? "navigationbar_hide_bar_enabled" : str.contains("nokia") ? Build.VERSION.SDK_INT < 28 ? "navigation_bar_can_hiden" : "swipe_up_to_switch_apps_enabled" : "navigationbar_is_min" : "navigationbar_is_min";
    }

    /* renamed from: b */
    public static int m111650b(Context context) {
        int i = 0;
        if (!m111651c(context)) {
            return 0;
        }
        int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID);
        if (identifier > 0) {
            i = Resources.getSystem().getDimensionPixelSize(identifier);
        }
        int d = m111652d(context);
        return (d == 0 || d >= i) ? i : d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m111651c(android.content.Context r4) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = f257299a     // Catch:{ Exception -> 0x0072 }
            boolean r2 = m111654f(r2)     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = android.os.Build.BRAND     // Catch:{ Exception -> 0x0072 }
            f257299a = r2     // Catch:{ Exception -> 0x0072 }
        L_0x000e:
            java.lang.String r2 = f257300b     // Catch:{ Exception -> 0x0072 }
            boolean r2 = m111654f(r2)     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0072 }
            f257300b = r2     // Catch:{ Exception -> 0x0072 }
        L_0x001a:
            java.lang.String r2 = f257299a     // Catch:{ Exception -> 0x0072 }
            boolean r2 = m111654f(r2)     // Catch:{ Exception -> 0x0072 }
            if (r2 != 0) goto L_0x002a
            java.lang.String r2 = f257299a     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0072 }
            f257299a = r2     // Catch:{ Exception -> 0x0072 }
        L_0x002a:
            java.lang.String r2 = f257300b     // Catch:{ Exception -> 0x0072 }
            boolean r2 = m111654f(r2)     // Catch:{ Exception -> 0x0072 }
            if (r2 != 0) goto L_0x003a
            java.lang.String r2 = f257300b     // Catch:{ Exception -> 0x0072 }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x0072 }
            f257300b = r2     // Catch:{ Exception -> 0x0072 }
        L_0x003a:
            java.lang.String r2 = f257299a     // Catch:{ Exception -> 0x0072 }
            boolean r2 = m111654f(r2)     // Catch:{ Exception -> 0x0072 }
            if (r2 != 0) goto L_0x0072
            java.lang.String r2 = f257299a     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = "huawei"
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0072 }
            if (r2 != 0) goto L_0x0056
            java.lang.String r2 = f257299a     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = "honor"
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x0072
        L_0x0056:
            java.lang.String r2 = f257300b     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = "lio-an00m"
            boolean r2 = r2.contains(r3)     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x0072
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = f257299a     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = m111649a(r3)     // Catch:{ Exception -> 0x0072 }
            int r2 = android.provider.Settings.Global.getInt(r2, r3, r1)     // Catch:{ Exception -> 0x0072 }
            if (r2 == 0) goto L_0x0072
            r2 = 1
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            if (r2 == 0) goto L_0x0076
            return r1
        L_0x0076:
            int r4 = m111652d(r4)
            if (r4 <= 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1020pa.C89330g.m111651c(android.content.Context):boolean");
    }

    /* renamed from: d */
    public static int m111652d(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Point point2 = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point2);
        int max = Math.max(point.y, point.x);
        boolean z = false;
        if (context.getResources().getConfiguration().orientation == 1) {
            max = point.y;
        }
        int max2 = Math.max(point2.y, point2.x);
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

    /* renamed from: e */
    public static int m111653e(Context context) {
        int i;
        if (context != null && C89329f.f257298a < 0.0f) {
            C89329f.f257298a = context.getResources().getDisplayMetrics().density;
        }
        int round = Math.round(C89329f.f257298a * ((float) 25));
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            String obj = cls.getField("status_bar_height").get(cls.newInstance()).toString();
            if (obj != null) {
                try {
                    if (obj.length() > 0) {
                        i = Integer.decode(obj).intValue();
                        round = context.getResources().getDimensionPixelSize(i);
                        C88718b.m110681c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", Integer.valueOf(round));
                        return round;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            i = 0;
            round = context.getResources().getDimensionPixelSize(i);
        } catch (Exception unused2) {
        }
        C88718b.m110681c("WeUIToolHelper", "[getStatusBarHeightFromSysR] :%s ", Integer.valueOf(round));
        return round;
    }

    /* renamed from: f */
    public static boolean m111654f(String str) {
        return str == null || str.length() <= 0;
    }
}
