package b34;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* renamed from: b34.a */
public class C79664a {

    /* renamed from: a */
    public final Class<?> f233574a;

    /* renamed from: b */
    public final Object f233575b;

    /* renamed from: b34.a$a */
    public static class C39725a {
    }

    public C79664a(Class<?> cls, Object obj) {
        this.f233574a = cls;
        this.f233575b = obj;
    }

    /* renamed from: a */
    public static <T extends AccessibleObject> T m96759a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* renamed from: h */
    public static C79664a m96760h(Class<?> cls) {
        return new C79664a(cls, cls);
    }

    /* renamed from: i */
    public static C79664a m96761i(Object obj) {
        return new C79664a(obj == null ? Object.class : obj.getClass(), obj);
    }

    /* renamed from: j */
    public static C79664a m96762j(String str) {
        try {
            Class<?> cls = Class.forName(str);
            return new C79664a(cls, cls);
        } catch (Exception e) {
            throw new C79665b(e);
        }
    }

    /* renamed from: k */
    public static C79664a m96763k(Method method, Object obj, Object... objArr) {
        try {
            m96759a(method);
            if (method.getReturnType() != Void.TYPE) {
                return m96761i(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m96761i(obj);
        } catch (Exception e) {
            throw new C79665b(e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class<?>[] m96764n(java.lang.Object... r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0006
            java.lang.Class[] r3 = new java.lang.Class[r0]
            return r3
        L_0x0006:
            int r1 = r3.length
            java.lang.Class[] r1 = new java.lang.Class[r1]
        L_0x0009:
            int r2 = r3.length
            if (r0 >= r2) goto L_0x001c
            r2 = r3[r0]
            if (r2 != 0) goto L_0x0013
            java.lang.Class<b34.a$a> r2 = b34.C79664a.C39725a.class
            goto L_0x0017
        L_0x0013:
            java.lang.Class r2 = r2.getClass()
        L_0x0017:
            r1[r0] = r2
            int r0 = r0 + 1
            goto L_0x0009
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b34.C79664a.m96764n(java.lang.Object[]):java.lang.Class[]");
    }

    /* renamed from: o */
    public static Class<?> m96765o(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r1 = r1.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r1 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        return m96763k(mo109798m(r4, r0), r3.f233575b, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        throw new b34.C79665b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r1 = r1.getDeclaredMethod(r4, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b34.C79664a mo109789b(java.lang.String r4, java.lang.Object... r5) {
        /*
            r3 = this;
            java.lang.Class[] r0 = m96764n(r5)
            java.lang.Class<?> r1 = r3.f233574a     // Catch:{ NoSuchMethodException -> 0x0023 }
            java.lang.reflect.Method r1 = r1.getMethod(r4, r0)     // Catch:{ NoSuchMethodException -> 0x000b }
            goto L_0x000f
        L_0x000b:
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r4, r0)     // Catch:{ NoSuchMethodException -> 0x0016 }
        L_0x000f:
            java.lang.Object r2 = r3.f233575b     // Catch:{ NoSuchMethodException -> 0x0023 }
            b34.a r4 = m96763k(r1, r2, r5)     // Catch:{ NoSuchMethodException -> 0x0023 }
            return r4
        L_0x0016:
            java.lang.Class r1 = r1.getSuperclass()     // Catch:{ NoSuchMethodException -> 0x0023 }
            if (r1 == 0) goto L_0x001d
            goto L_0x000b
        L_0x001d:
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ NoSuchMethodException -> 0x0023 }
            r1.<init>()     // Catch:{ NoSuchMethodException -> 0x0023 }
            throw r1     // Catch:{ NoSuchMethodException -> 0x0023 }
        L_0x0023:
            java.lang.reflect.Method r4 = r3.mo109798m(r4, r0)     // Catch:{ NoSuchMethodException -> 0x002e }
            java.lang.Object r0 = r3.f233575b     // Catch:{ NoSuchMethodException -> 0x002e }
            b34.a r4 = m96763k(r4, r0, r5)     // Catch:{ NoSuchMethodException -> 0x002e }
            return r4
        L_0x002e:
            r4 = move-exception
            b34.b r5 = new b34.b
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b34.C79664a.mo109789b(java.lang.String, java.lang.Object[]):b34.a");
    }

    /* renamed from: c */
    public C79664a mo109790c() {
        return mo109791d(new Object[0]);
    }

    /* renamed from: d */
    public C79664a mo109791d(Object... objArr) {
        Class[] n = m96764n(objArr);
        try {
            Constructor<?> declaredConstructor = this.f233574a.getDeclaredConstructor(n);
            return new C79664a(declaredConstructor.getDeclaringClass(), ((Constructor) m96759a(declaredConstructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new C79665b(e);
        } catch (NoSuchMethodException e2) {
            Constructor[] declaredConstructors = this.f233574a.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i = 0;
            while (i < length) {
                Constructor constructor = declaredConstructors[i];
                if (mo109795g(constructor.getParameterTypes(), n)) {
                    try {
                        return new C79664a(constructor.getDeclaringClass(), ((Constructor) m96759a(constructor)).newInstance(objArr));
                    } catch (Exception e3) {
                        throw new C79665b(e3);
                    }
                } else {
                    i++;
                }
            }
            throw new C79665b(e2);
        }
    }

    /* renamed from: e */
    public final Field mo109792e(String str) {
        Class cls = this.f233574a;
        try {
            return (Field) m96759a(cls.getField(str));
        } catch (NoSuchFieldException e) {
            do {
                try {
                    return (Field) m96759a(cls.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        throw new C79665b(e);
                    }
                }
            } while (cls != null);
            throw new C79665b(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C79664a) {
            return this.f233575b.equals(((C79664a) obj).f233575b);
        }
        return false;
    }

    /* renamed from: f */
    public <T> T mo109794f(String str) {
        try {
            Field e = mo109792e(str);
            e.getType();
            return e.get(this.f233575b);
        } catch (Exception e2) {
            throw new C79665b(e2);
        }
    }

    /* renamed from: g */
    public final boolean mo109795g(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C39725a.class && !m96765o(clsArr[i]).isAssignableFrom(m96765o(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f233575b.hashCode();
    }

    /* renamed from: l */
    public C79664a mo109797l(String str, Object obj) {
        try {
            Field e = mo109792e(str);
            if ((e.getModifiers() & 16) == 16) {
                Field declaredField = Field.class.getDeclaredField("modifiers");
                declaredField.setAccessible(true);
                declaredField.setInt(e, e.getModifiers() & -17);
            }
            Object obj2 = this.f233575b;
            if (obj instanceof C79664a) {
                obj = ((C79664a) obj).f233575b;
            }
            e.set(obj2, obj);
            return this;
        } catch (Exception e2) {
            throw new C79665b(e2);
        }
    }

    /* renamed from: m */
    public final Method mo109798m(String str, Class<?>[] clsArr) {
        Class cls = this.f233574a;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                Method method = methods[i];
                if (!method.getName().equals(str) || !mo109795g(method.getParameterTypes(), clsArr)) {
                    z = false;
                }
                if (z) {
                    return method;
                }
                i++;
            } else {
                do {
                    for (Method method2 : cls.getDeclaredMethods()) {
                        if (method2.getName().equals(str) && mo109795g(method2.getParameterTypes(), clsArr)) {
                            return method2;
                        }
                    }
                    cls = cls.getSuperclass();
                } while (cls != null);
                throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + this.f233574a + ".");
            }
        }
    }

    public String toString() {
        return this.f233575b.toString();
    }
}
