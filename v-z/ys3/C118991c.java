package ys3;

import android.content.Context;
import android.text.TextUtils;
import ft3.C116895f;
import java.lang.reflect.Method;

/* renamed from: ys3.c */
public class C118991c {

    /* renamed from: a */
    public static Object f356421a;

    /* renamed from: b */
    public static Method f356422b;

    /* renamed from: c */
    public static boolean f356423c;

    static {
        Object obj;
        Method method = null;
        try {
            obj = C118994e.m167759b(C118994e.m167758a((Context) null, "libcore.io.Libcore", (Object) null), "os", (Object) null);
        } catch (Throwable unused) {
            f356423c = false;
            return;
        }
        f356421a = obj;
        Class[] clsArr = {String.class};
        try {
            Class<?> a = C118994e.m167758a((Context) null, "libcore.io.Os", (Object) null);
            if (a != null) {
                if (!TextUtils.isEmpty("stat")) {
                    Method declaredMethod = a.getDeclaredMethod("stat", clsArr);
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        method = declaredMethod;
                    }
                }
            }
        } catch (Throwable th) {
            C116895f.m164893e(th);
        }
        f356422b = method;
        f356423c = true;
    }
}
