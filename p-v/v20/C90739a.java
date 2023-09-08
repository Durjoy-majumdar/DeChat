package v20;

import java.lang.annotation.Annotation;

/* renamed from: v20.a */
public class C90739a {
    /* renamed from: a */
    public static boolean m113806a(Class<?> cls, Class<? extends Annotation> cls2) {
        if (!(cls == null || cls2 == null)) {
            if (cls.isAnnotationPresent(cls2)) {
                return true;
            }
            for (Class isAnnotationPresent : cls.getInterfaces()) {
                if (isAnnotationPresent.isAnnotationPresent(cls2)) {
                    return true;
                }
            }
            if (cls.getSuperclass() != null) {
                return m113806a(cls.getSuperclass(), cls2);
            }
        }
        return false;
    }
}
