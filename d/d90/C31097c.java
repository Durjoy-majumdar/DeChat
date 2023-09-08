package d90;

import android.hardware.camera2.CaptureResult;
import gy3.C87412m;
import java.lang.reflect.Constructor;

/* renamed from: d90.c */
public final class C31097c {

    /* renamed from: a */
    public static Constructor<CaptureResult.Key<?>> f83382a;

    /* renamed from: a */
    public static final <T> CaptureResult.Key<T> m39305a(String str, Class<T> cls) {
        C87412m.m108594g(str, "name");
        C87412m.m108594g(cls, "klass");
        try {
            if (f83382a == null) {
                Constructor<CaptureResult.Key> constructor = CaptureResult.Key.class.getConstructor(new Class[]{String.class, cls.getClass()});
                f83382a = constructor;
                C87412m.m108591d(constructor);
                constructor.setAccessible(true);
            }
            try {
                Constructor<CaptureResult.Key<?>> constructor2 = f83382a;
                C87412m.m108591d(constructor2);
                CaptureResult.Key<?> newInstance = constructor2.newInstance(new Object[]{str, cls});
                C87412m.m108592e(newInstance, "null cannot be cast to non-null type android.hardware.camera2.CaptureResult.Key<T of com.tencent.mm.media.widget.camera2.effect.result.WCResultKeyCreator.resultKey>");
                return newInstance;
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
