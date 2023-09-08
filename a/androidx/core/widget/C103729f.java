package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.f */
public final class C103729f {

    /* renamed from: a */
    public static Method f306422a;

    /* renamed from: b */
    public static boolean f306423b;

    /* renamed from: c */
    public static Field f306424c;

    /* renamed from: d */
    public static boolean f306425d;

    /* renamed from: androidx.core.widget.f$a */
    public static class C103730a {
        /* renamed from: a */
        public static void m138095a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2, i3);
        }
    }

    /* renamed from: androidx.core.widget.f$b */
    public static class C103731b {
        /* renamed from: a */
        public static boolean m138096a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        /* renamed from: b */
        public static int m138097b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        /* renamed from: c */
        public static void m138098c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        /* renamed from: d */
        public static void m138099d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* renamed from: a */
    public static void m138093a(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C103731b.m138098c(popupWindow, z);
            return;
        }
        if (!f306425d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f306424c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f306425d = true;
        }
        Field field = f306424c;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: b */
    public static void m138094b(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C103731b.m138099d(popupWindow, i);
            return;
        }
        if (!f306423b) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f306422a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f306423b = true;
        }
        Method method = f306422a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
