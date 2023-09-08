package p723vf;

import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: vf.m */
public class C90790m {
    /* renamed from: a */
    public static <T> T m113857a(Class<?> cls, String str, Object obj) {
        return new C90788k(cls, str).mo124907a(obj);
    }

    /* renamed from: b */
    public static Method m113858b(Object obj, String str, Class<?>... clsArr) {
        if (Build.VERSION.SDK_INT <= 29) {
            try {
                Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class}).invoke(obj.getClass(), new Object[]{str, clsArr});
                method.setAccessible(true);
                return method;
            } catch (Exception e) {
                C118672d.m167352b("Matrix.ReflectUtils", e.toString() + "isHard=%s\n%s", Boolean.TRUE, C90779e.m113849d(e));
            }
        } else {
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Exception e2) {
                C118672d.m167352b("Matrix.ReflectUtils", e2.toString() + "isHard=%s\n%s", Boolean.FALSE, C90779e.m113849d(e2));
            }
        }
        return null;
    }

    /* renamed from: c */
    public static <T> T m113859c(Object obj, String str, T t) {
        if (obj == null) {
            return t;
        }
        try {
            Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", new Class[]{String.class}).invoke(obj.getClass(), new Object[]{str});
            field.setAccessible(true);
            return field.get(obj);
        } catch (Exception e) {
            C118672d.m167352b("Matrix.ReflectUtils", e.toString() + "isHard=%s\n%s", Boolean.TRUE, C90779e.m113849d(e));
            return t;
        }
    }
}
