package in3;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.Window;
import com.tencent.p014mm.p136ui.C85864g1;

/* renamed from: in3.e */
public class C87773e extends C85864g1 {
    /* renamed from: d */
    public static void m109211d(Window window) {
        if (window != null) {
            int i = window.getAttributes().flags;
            int i2 = (-67108865 & i) | Integer.MIN_VALUE;
            if (i2 != i) {
                window.setFlags(i2, i2);
            }
            if (window.getStatusBarColor() != 0) {
                window.setStatusBarColor(0);
            }
        }
    }

    /* renamed from: f */
    public static ContextThemeWrapper m109212f(Context context) {
        Context baseContext;
        if (context == null) {
            return null;
        }
        if (context instanceof ContextThemeWrapper) {
            return (ContextThemeWrapper) context;
        }
        if (!(context instanceof ContextWrapper) || (baseContext = ((ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return m109212f(baseContext);
    }

    /* renamed from: g */
    public static boolean m109213g(Window window) {
        return (window == null || window.getDecorView() == null || Build.VERSION.SDK_INT < 23 || (window.getDecorView().getSystemUiVisibility() & 8192) == 0) ? false : true;
    }
}
