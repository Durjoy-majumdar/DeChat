package yc2;

import android.util.LruCache;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/* renamed from: yc2.l */
public class C118980l {

    /* renamed from: a */
    public static final LruCache<String, LruCache<String, Field>> f356403a = new LruCache<>(50);

    /* renamed from: b */
    public static final LruCache<String, LruCache<String, Method>> f356404b = new LruCache<>(50);

    /* renamed from: yc2.l$a */
    public static class C118981a extends RuntimeException {
        public C118981a(Throwable th) {
            super(th);
        }
    }

    static {
        new LruCache(50);
    }

    /* renamed from: a */
    public static <T> T m167743a(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return m167746d(obj.getClass(), str, clsArr).invoke(obj, objArr);
        } catch (Throwable th) {
            throw new C118981a(th);
        }
    }

    /* renamed from: b */
    public static <T> T m167744b(Class<?> cls, String str, Class<?>[] clsArr, Object... objArr) {
        try {
            return m167746d(cls, str, clsArr).invoke((Object) null, objArr);
        } catch (Throwable th) {
            throw new C118981a(th);
        }
    }

    /* renamed from: c */
    public static Field m167745c(Class<?> cls, String str) {
        LruCache<String, LruCache<String, Field>> lruCache = f356403a;
        LruCache lruCache2 = lruCache.get(cls.getName());
        if (lruCache2 == null) {
            lruCache2 = new LruCache(30);
            lruCache.put(cls.getName(), lruCache2);
        }
        Field field = (Field) lruCache2.get(str);
        Class<? super Object> cls2 = cls;
        if (field != null) {
            return field;
        }
        while (true) {
            try {
                Field declaredField = cls2.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                lruCache2.put(str, declaredField);
                return declaredField;
            } catch (Throwable th) {
                if (cls2.getSuperclass() == null || cls2 == Object.class) {
                    throw th;
                }
                cls2 = cls2.getSuperclass();
            }
        }
        throw th;
    }

    /* renamed from: d */
    public static Method m167746d(Class<?> cls, String str, Class<?>... clsArr) {
        LruCache<String, LruCache<String, Method>> lruCache = f356404b;
        LruCache lruCache2 = lruCache.get(cls.getName());
        if (lruCache2 == null) {
            lruCache2 = new LruCache(30);
            lruCache.put(cls.getName(), lruCache2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(clsArr != null ? Arrays.toString(clsArr) : "[]");
        String sb4 = sb.toString();
        Method method = (Method) lruCache2.get(sb4);
        Class<? super Object> cls2 = cls;
        if (method != null) {
            return method;
        }
        while (true) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                lruCache2.put(sb4, declaredMethod);
                return declaredMethod;
            } catch (Throwable th) {
                if (cls2.getSuperclass() == null || cls2 == Object.class) {
                    throw th;
                }
                cls2 = cls2.getSuperclass();
            }
        }
        throw th;
    }

    /* renamed from: e */
    public static <T> T m167747e(Object obj, String str) {
        try {
            return m167745c(obj.getClass(), str).get(obj);
        } catch (Throwable th) {
            throw new C118981a(th);
        }
    }

    /* renamed from: f */
    public static <T> void m167748f(Object obj, String str, T t) {
        try {
            m167745c(obj.getClass(), str).set(obj, t);
        } catch (Throwable th) {
            throw new C118981a(th);
        }
    }
}
