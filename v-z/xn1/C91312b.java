package xn1;

import android.os.Build;
import android.view.Display;
import android.view.Window;
import gy3.C87412m;
import iy3.C60641c;

/* renamed from: xn1.b */
public final class C91312b {
    /* renamed from: a */
    public static final int m114551a(Window window) {
        float f;
        C87412m.m108594g(window, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = window.getContext().getDisplay();
            f = display != null ? display.getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        } else {
            f = window.getWindowManager().getDefaultDisplay().getRefreshRate();
        }
        return C60641c.m70921b(f);
    }
}
