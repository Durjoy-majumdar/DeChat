package p853i4;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i4.y */
public class C108365y extends C108364x {

    /* renamed from: k */
    public static Method f324416k;

    /* renamed from: l */
    public static boolean f324417l;

    /* renamed from: b */
    public void mo158857b(View view, int i, int i2, int i3, int i4) {
        if (!f324417l) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setLeftTopRightBottom", new Class[]{cls2, cls2, cls2, cls2});
                f324416k = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f324417l = true;
        }
        Method method = f324416k;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
