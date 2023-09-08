package p1057w2;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: w2.h */
public class C118717h extends C118716g {
    /* renamed from: j */
    public Typeface mo183464j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f355231f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f355237l.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: n */
    public Method mo183468n(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
