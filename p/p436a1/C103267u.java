package p436a1;

import android.graphics.Canvas;
import android.os.Build;
import gy3.C87412m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a1.u */
public final class C103267u {

    /* renamed from: a */
    public static final C103267u f304486a = new C103267u();

    /* renamed from: b */
    public static Method f304487b;

    /* renamed from: c */
    public static Method f304488c;

    /* renamed from: d */
    public static boolean f304489d;

    /* renamed from: a */
    public final void mo143045a(Canvas canvas, boolean z) {
        Method method;
        C87412m.m108594g(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C103269v.f304491a.mo143046a(canvas, z);
            return;
        }
        if (!f304489d) {
            if (i == 28) {
                Class<Class> cls = Class.class;
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, new Class[0].getClass()});
                    f304487b = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertReorderBarrier", new Class[0]});
                    f304488c = (Method) declaredMethod.invoke(Canvas.class, new Object[]{"insertInorderBarrier", new Class[0]});
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            } else {
                f304487b = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                f304488c = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
            }
            Method method2 = f304487b;
            if (method2 != null) {
                method2.setAccessible(true);
            }
            Method method3 = f304488c;
            if (method3 != null) {
                method3.setAccessible(true);
            }
            f304489d = true;
        }
        if (z) {
            try {
                Method method4 = f304487b;
                if (method4 != null) {
                    C87412m.m108591d(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (!z && (method = f304488c) != null) {
            C87412m.m108591d(method);
            method.invoke(canvas, new Object[0]);
        }
    }
}
