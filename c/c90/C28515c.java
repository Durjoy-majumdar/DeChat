package c90;

import android.hardware.camera2.CaptureRequest;
import gy3.C87412m;
import java.lang.reflect.Constructor;

/* renamed from: c90.c */
public final class C28515c {

    /* renamed from: a */
    public static Constructor<CaptureRequest.Key<?>> f78343a;

    /* renamed from: a */
    public static final <T> CaptureRequest.Key<T> m38232a(String str, Class<T> cls) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(cls, "klass");
        try {
            if (f78343a == null) {
                Constructor<CaptureRequest.Key> constructor = CaptureRequest.Key.class.getConstructor(new Class[]{String.class, cls.getClass()});
                f78343a = constructor;
                C87412m.m108591d(constructor);
                constructor.setAccessible(true);
            }
            try {
                Constructor<CaptureRequest.Key<?>> constructor2 = f78343a;
                C87412m.m108591d(constructor2);
                return constructor2.newInstance(new Object[]{str, cls});
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        } catch (NoSuchMethodException e2) {
            e2.getMessage();
            return null;
        }
    }
}
