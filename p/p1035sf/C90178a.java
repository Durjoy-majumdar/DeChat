package p1035sf;

import android.util.ArrayMap;
import java.lang.reflect.Field;

/* renamed from: sf.a */
public enum C90178a {
    INSTANCE;
    

    /* renamed from: d */
    public boolean f258899d;

    /* renamed from: a */
    public static boolean m112843a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap.size() < 1) {
                return false;
            }
            for (Object next : arrayMap.values()) {
                Field declaredField2 = next.getClass().getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(next)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
