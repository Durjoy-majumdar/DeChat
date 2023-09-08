package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import java.lang.reflect.Field;
import p1119i.C108289c;
import p1162x2.C112023e;

/* renamed from: androidx.appcompat.widget.p */
public class C103556p {

    /* renamed from: a */
    public static final Rect f305821a = new Rect();

    /* renamed from: b */
    public static Class<?> f305822b;

    static {
        try {
            f305822b = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m137671a(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!m137671a(a)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof C112023e) {
            return m137671a(((C112023e) drawable).mo163694b());
        } else {
            if (drawable instanceof C108289c) {
                return m137671a(((C108289c) drawable).f324242d);
            }
            if (drawable instanceof ScaleDrawable) {
                return m137671a(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    /* renamed from: b */
    public static void m137672b(Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            int[] state = drawable.getState();
            if (state == null || state.length == 0) {
                drawable.setState(C103518a0.f305699e);
            } else {
                drawable.setState(C103518a0.f305700f);
            }
            drawable.setState(state);
        }
    }

    /* renamed from: c */
    public static Rect m137673c(Drawable drawable) {
        if (f305822b != null) {
            try {
                if (drawable instanceof C112023e) {
                    drawable = ((C112023e) drawable).mo163694b();
                }
                Object invoke = drawable.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(drawable, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f305822b.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
            }
        }
        return f305821a;
    }

    /* renamed from: d */
    public static PorterDuff.Mode m137674d(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
