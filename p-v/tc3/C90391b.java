package tc3;

import android.content.Context;
import gy3.C87412m;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: tc3.b */
public final class C90391b {

    /* renamed from: a */
    public static final C90391b f259401a = new C90391b();

    /* renamed from: a */
    public final Object mo124603a(Context context) {
        Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
        method.setAccessible(true);
        Object invoke = method.invoke((Object) null, new Object[0]);
        if (invoke != null) {
            return invoke;
        }
        Field field = context.getClass().getField("mLoadedApk");
        field.setAccessible(true);
        Object obj = field.get(context);
        Field declaredField = obj.getClass().getDeclaredField("mActivityThread");
        declaredField.setAccessible(true);
        Object obj2 = declaredField.get(obj);
        C87412m.m108593f(obj2, "field[loadedApk]");
        return obj2;
    }
}
