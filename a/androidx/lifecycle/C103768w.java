package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.w */
public class C103768w {

    /* renamed from: a */
    public static Map<Class<?>, Integer> f306540a = new HashMap();

    /* renamed from: b */
    public static Map<Class<?>, List<Constructor<? extends C103763h>>> f306541b = new HashMap();

    /* renamed from: a */
    public static C103763h m138178a(Constructor<? extends C103763h> constructor, Object obj) {
        try {
            return (C103763h) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public static String m138179b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: c */
    public static int m138180c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z;
        Class<C0124r> cls2 = C0124r.class;
        Integer num = (Integer) ((HashMap) f306540a).get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b = m138179b(canonicalName);
                if (!name.isEmpty()) {
                    b = name + "." + b;
                }
                constructor = Class.forName(b).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor != null) {
                ((HashMap) f306541b).put(cls, Collections.singletonList(constructor));
            } else {
                C103754b bVar = C103754b.f306510c;
                Boolean bool = (Boolean) ((HashMap) bVar.f306512b).get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                ((HashMap) bVar.f306512b).put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            } else if (((C112974b0) declaredMethods[i2].getAnnotation(C112974b0.class)) != null) {
                                bVar.mo145127a(cls, declaredMethods);
                                z = true;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (m138180c(superclass) != 1) {
                            arrayList = new ArrayList((Collection) ((HashMap) f306541b).get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class cls3 = interfaces[i3];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (m138180c(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) ((HashMap) f306541b).get(cls3));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            ((HashMap) f306541b).put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        ((HashMap) f306540a).put(cls, Integer.valueOf(i));
        return i;
    }
}
