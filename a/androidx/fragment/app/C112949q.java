package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p1042u.C111059i;

/* renamed from: androidx.fragment.app.q */
public class C112949q {

    /* renamed from: a */
    public static final C111059i<ClassLoader, C111059i<String, Class<?>>> f338131a = new C111059i<>();

    /* renamed from: b */
    public static Class<?> m154548b(ClassLoader classLoader, String str) {
        C111059i<ClassLoader, C111059i<String, Class<?>>> iVar = f338131a;
        C111059i orDefault = iVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C111059i();
            iVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    /* renamed from: c */
    public static Class<? extends Fragment> m154549c(ClassLoader classLoader, String str) {
        try {
            return m154548b(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C112883j("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C112883j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo165135a(ClassLoader classLoader, String str) {
        throw null;
    }
}
