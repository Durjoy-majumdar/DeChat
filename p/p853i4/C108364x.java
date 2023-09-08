package p853i4;

import android.graphics.Matrix;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i4.x */
public class C108364x extends C108363w {

    /* renamed from: e */
    public static Method f324410e;

    /* renamed from: f */
    public static boolean f324411f;

    /* renamed from: g */
    public static Method f324412g;

    /* renamed from: h */
    public static boolean f324413h;

    /* renamed from: i */
    public static Method f324414i;

    /* renamed from: j */
    public static boolean f324415j;

    /* renamed from: c */
    public void mo158855c(View view, Matrix matrix) {
        if (!f324411f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f324410e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f324411f = true;
        }
        Method method = f324410e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: d */
    public void mo158856d(View view, Matrix matrix) {
        if (!f324413h) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f324412g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            f324413h = true;
        }
        Method method = f324412g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }
}
