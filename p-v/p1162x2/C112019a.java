package p1162x2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: x2.a */
public final class C112019a {

    /* renamed from: a */
    public static Method f335326a;

    /* renamed from: b */
    public static boolean f335327b;

    /* renamed from: c */
    public static Method f335328c;

    /* renamed from: d */
    public static boolean f335329d;

    /* renamed from: a */
    public static void m152743a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m152743a(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof C112023e) {
            m152743a(((C112023e) drawable).mo163694b());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    m152743a(child);
                }
            }
        }
    }

    /* renamed from: b */
    public static int m152744b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f335329d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f335328c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f335329d = true;
        }
        Method method = f335328c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception unused2) {
                f335328c = null;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m152745c(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (!f335327b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f335326a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f335327b = true;
        }
        Method method = f335326a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception unused2) {
                f335326a = null;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static void m152746d(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: e */
    public static void m152747e(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: f */
    public static void m152748f(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: g */
    public static Drawable m152749g(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof C112022d)) ? new C112025g(drawable) : drawable;
    }
}
