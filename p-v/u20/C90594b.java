package u20;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import v20.C90741c;

/* renamed from: u20.b */
public class C90594b {
    /* renamed from: a */
    public static boolean m113493a(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            return true;
        }
        if (cls.isLocalClass() || cls.isMemberClass()) {
            return false;
        }
        for (Constructor parameterTypes : cls.getDeclaredConstructors()) {
            Class[] parameterTypes2 = parameterTypes.getParameterTypes();
            if (parameterTypes2 == null || parameterTypes2.length == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <T> T m113494b(Class<?> cls) {
        if (cls == null) {
            C90741c.m113808a("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
            return null;
        }
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e);
            return null;
        } catch (InstantiationException e2) {
            C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e3);
            return null;
        } catch (InvocationTargetException e4) {
            C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e4);
            return null;
        }
    }

    /* renamed from: c */
    public static <T> T m113495c(Class<?> cls, Class<?> cls2) {
        if (cls == null) {
            C90741c.m113808a("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
            return null;
        } else if (cls2 == null) {
            C90741c.m113808a("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
            return null;
        } else {
            try {
                if (!cls2.isAssignableFrom(cls)) {
                    C90741c.m113808a("IPC.ReflectUtil", "%s isAssignableFrom %s return false", cls2, cls);
                    return null;
                }
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e);
                return null;
            } catch (InstantiationException e2) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e2);
                return null;
            } catch (NoSuchMethodException e3) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e3);
                return null;
            } catch (InvocationTargetException e4) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e4);
                return null;
            }
        }
    }

    /* renamed from: d */
    public static <T> T m113496d(String str, Class<?> cls) {
        if (str == null || str.length() == 0) {
            C90741c.m113808a("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
            return null;
        } else if (cls == null) {
            C90741c.m113808a("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
            return null;
        } else {
            try {
                Class<?> cls2 = Class.forName(str);
                if (!cls.isAssignableFrom(cls2)) {
                    C90741c.m113808a("IPC.ReflectUtil", "%s isAssignableFrom %s return false", cls, cls2);
                    return null;
                }
                Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e);
                return null;
            } catch (IllegalAccessException e2) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e2);
                return null;
            } catch (InstantiationException e3) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e3);
                return null;
            } catch (NoSuchMethodException e4) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e4);
                return null;
            } catch (InvocationTargetException e5) {
                C90741c.m113808a("IPC.ReflectUtil", "reflect error : %s", e5);
                return null;
            }
        }
    }
}
