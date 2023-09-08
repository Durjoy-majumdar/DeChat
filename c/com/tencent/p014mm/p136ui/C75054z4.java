package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.eclipsesource.mmv8.Platform;

/* renamed from: com.tencent.mm.ui.z4 */
public class C75054z4 {

    /* renamed from: a */
    public static Boolean f220812a;

    /* renamed from: a */
    public static Point m90003a(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: b */
    public static int m90004b(Context context) {
        int identifier;
        if (!m90005c(context) || (identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID)) <= 0) {
            return 0;
        }
        return Resources.getSystem().getDimensionPixelSize(identifier);
    }

    /* renamed from: c */
    public static boolean m90005c(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        Point a = m90003a(context);
        return Math.max(a.y, a.x) > Math.max(point.y, point.x);
    }

    /* renamed from: d */
    public static boolean m90006d() {
        if (f220812a == null) {
            String str = Build.MANUFACTURER;
            f220812a = Boolean.valueOf(!TextUtils.isEmpty(str) && str.equalsIgnoreCase("xiaomi"));
        }
        return f220812a.booleanValue();
    }
}
