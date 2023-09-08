package p849e3;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import com.eclipsesource.mmv8.Platform;
import java.lang.reflect.Method;

/* renamed from: e3.v */
public final class C107222v {

    /* renamed from: a */
    public static Method f320820a;

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f320820a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static float m145282a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f320820a) != null) {
            try {
                return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m145283b(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : m145282a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static int m145284c(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: d */
    public static float m145285d(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : m145282a(viewConfiguration, context);
    }

    /* renamed from: e */
    public static boolean m145286e(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", Platform.ANDROID);
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
