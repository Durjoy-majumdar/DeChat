package p737wf;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wf.a */
public final class C38088a {

    /* renamed from: a */
    public static boolean f100678a;

    static {
        try {
            Class.forName("com.oplus.util.OplusHoraeThermalHelper").getDeclaredMethod("getInstance", new Class[0]);
            f100678a = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            f100678a = false;
        }
    }

    /* renamed from: a */
    public static float m41721a() {
        if (!f100678a) {
            return -1.0f;
        }
        try {
            Class<?> cls = Class.forName("com.oplus.util.OplusHoraeThermalHelper");
            return ((Float) cls.getDeclaredMethod("getCurrentThermal", new Class[0]).invoke(cls.getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]), new Object[0])).floatValue();
        } catch (Throwable th) {
            Log.m105928w("", "getCurrentThermal failed: " + th.getMessage());
            return -1.0f;
        }
    }
}
