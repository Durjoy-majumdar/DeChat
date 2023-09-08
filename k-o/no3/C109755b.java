package no3;

import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: no3.b */
public class C109755b {
    /* renamed from: a */
    public static void m149078a(Spannable spannable) {
        Class<?> cls;
        Class[] clsArr = {Spannable.class};
        try {
            cls = Class.forName(MetaKeyKeyListener.class.getName());
        } catch (Throwable unused) {
            cls = null;
        }
        Method method = null;
        while (cls != Object.class) {
            try {
                method = cls.getDeclaredMethod("resetLockedMeta", clsArr);
            } catch (Throwable unused2) {
            }
            cls = cls.getSuperclass();
        }
        Object[] objArr = {spannable};
        try {
            method.setAccessible(true);
            method.invoke((Object) null, objArr);
        } catch (Throwable unused3) {
        }
    }

    /* renamed from: b */
    public static void m149079b(View view, Spannable spannable) {
        Class<?> cls;
        Class[] clsArr = {Spannable.class};
        try {
            cls = Class.forName(MetaKeyKeyListener.class.getName());
        } catch (Throwable unused) {
            cls = null;
        }
        Method method = null;
        while (cls != Object.class) {
            try {
                method = cls.getDeclaredMethod("stopSelecting", clsArr);
            } catch (Throwable unused2) {
            }
            cls = cls.getSuperclass();
        }
        Object[] objArr = {view, spannable};
        try {
            method.setAccessible(true);
            method.invoke((Object) null, objArr);
        } catch (Throwable unused3) {
        }
    }
}
