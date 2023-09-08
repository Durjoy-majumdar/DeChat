package u21;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: u21.h */
public abstract class C101956h {

    /* renamed from: a */
    public static float f300153a = Float.MAX_VALUE;

    /* renamed from: b */
    public static float f300154b = Float.MAX_VALUE;

    /* renamed from: c */
    public static int f300155c = -1;

    /* renamed from: d */
    public static float f300156d = 48.0f;

    /* renamed from: a */
    public static float m134204a() {
        float f;
        synchronized (C101956h.class) {
            if (f300154b == Float.MAX_VALUE) {
                Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                f300154b = displayMetrics.density * MMApplicationContext.getContext().getResources().getConfiguration().fontScale;
            }
            f = f300154b;
        }
        return f;
    }

    /* renamed from: b */
    public static int m134205b() {
        float f;
        if (f300155c == -1) {
            synchronized (C101956h.class) {
                try {
                    if (f300153a == Float.MAX_VALUE) {
                        Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        f300153a = displayMetrics.density;
                    }
                    f = f300153a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            f300155c = Math.round(f * 30.0f);
        }
        return f300155c;
    }
}
