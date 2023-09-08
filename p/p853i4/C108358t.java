package p853i4;

import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i4.t */
public class C108358t {
    /* renamed from: a */
    public static void m146762a(ViewGroup viewGroup, boolean z) {
        if (!C108359u.f324400b) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                C108359u.f324399a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            C108359u.f324400b = true;
        }
        Method method = C108359u.f324399a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
