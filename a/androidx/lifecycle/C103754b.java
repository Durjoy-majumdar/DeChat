package androidx.lifecycle;

import androidx.lifecycle.C39623j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
public final class C103754b {

    /* renamed from: c */
    public static C103754b f306510c = new C103754b();

    /* renamed from: a */
    public final Map<Class<?>, C103755a> f306511a = new HashMap();

    /* renamed from: b */
    public final Map<Class<?>, Boolean> f306512b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    public static class C103755a {

        /* renamed from: a */
        public final Map<C39623j.C39625b, List<C103756b>> f306513a = new HashMap();

        /* renamed from: b */
        public final Map<C103756b, C39623j.C39625b> f306514b;

        public C103755a(Map<C103756b, C39623j.C39625b> map) {
            this.f306514b = map;
            for (Map.Entry next : map.entrySet()) {
                C39623j.C39625b bVar = (C39623j.C39625b) next.getValue();
                List list = this.f306513a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f306513a.put(bVar, list);
                }
                list.add((C103756b) next.getKey());
            }
        }

        /* renamed from: a */
        public static void m138163a(List<C103756b> list, C0125s sVar, C39623j.C39625b bVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    C103756b bVar2 = list.get(size);
                    bVar2.getClass();
                    try {
                        int i = bVar2.f306515a;
                        if (i == 0) {
                            bVar2.f306516b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar2.f306516b.invoke(obj, new Object[]{sVar});
                        } else if (i == 2) {
                            bVar2.f306516b.invoke(obj, new Object[]{sVar, bVar});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    public static final class C103756b {

        /* renamed from: a */
        public final int f306515a;

        /* renamed from: b */
        public final Method f306516b;

        public C103756b(int i, Method method) {
            this.f306515a = i;
            this.f306516b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C103756b)) {
                return false;
            }
            C103756b bVar = (C103756b) obj;
            return this.f306515a == bVar.f306515a && this.f306516b.getName().equals(bVar.f306516b.getName());
        }

        public int hashCode() {
            return (this.f306515a * 31) + this.f306516b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final C103755a mo145127a(Class<?> cls, Method[] methodArr) {
        int i;
        C103755a b;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b = mo145128b(superclass)) == null)) {
            hashMap.putAll(b.f306514b);
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Map.Entry next : mo145128b(b2).f306514b.entrySet()) {
                mo145129c(hashMap, (C103756b) next.getKey(), (C39623j.C39625b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            C112974b0 b0Var = (C112974b0) method.getAnnotation(C112974b0.class);
            if (b0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C0125s.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C39623j.C39625b value = b0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C39623j.C39625b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C39623j.C39625b.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    mo145129c(hashMap, new C103756b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C103755a aVar = new C103755a(hashMap);
        ((HashMap) this.f306511a).put(cls, aVar);
        ((HashMap) this.f306512b).put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public C103755a mo145128b(Class<?> cls) {
        C103755a aVar = (C103755a) ((HashMap) this.f306511a).get(cls);
        return aVar != null ? aVar : mo145127a(cls, (Method[]) null);
    }

    /* renamed from: c */
    public final void mo145129c(Map<C103756b, C39623j.C39625b> map, C103756b bVar, C39623j.C39625b bVar2, Class<?> cls) {
        C39623j.C39625b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f306516b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }
}
