package p853i4;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i4.w */
public class C108363w extends C108366z {

    /* renamed from: a */
    public static Method f324406a;

    /* renamed from: b */
    public static boolean f324407b;

    /* renamed from: c */
    public static Method f324408c;

    /* renamed from: d */
    public static boolean f324409d;

    /* renamed from: a */
    public float mo158854a(View view) {
        if (!f324409d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f324408c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f324409d = true;
        }
        Method method = f324408c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo158854a(view);
    }
}
