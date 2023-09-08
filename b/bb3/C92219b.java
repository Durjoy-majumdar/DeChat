package bb3;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: bb3.b */
public abstract class C92219b {

    /* renamed from: a */
    public static float f263941a = Float.MAX_VALUE;

    /* renamed from: b */
    public static float f263942b = Float.MAX_VALUE;

    /* renamed from: c */
    public static int f263943c = -1;

    /* renamed from: d */
    public static float f263944d = 48.0f;

    /* renamed from: a */
    public static float m115908a() {
        float f;
        synchronized (C92219b.class) {
            if (f263942b == Float.MAX_VALUE) {
                Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                f263942b = displayMetrics.density * MMApplicationContext.getContext().getResources().getConfiguration().fontScale;
            }
            f = f263942b;
        }
        return f;
    }

    /* renamed from: b */
    public static int m115909b() {
        float f;
        if (f263943c == -1) {
            synchronized (C92219b.class) {
                try {
                    if (f263941a == Float.MAX_VALUE) {
                        Display defaultDisplay = ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        f263941a = displayMetrics.density;
                    }
                    f = f263941a;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            f263943c = Math.round(f * 30.0f);
        }
        return f263943c;
    }
}
