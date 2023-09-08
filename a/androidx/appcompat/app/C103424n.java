package androidx.appcompat.app;

import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.n */
public class C103424n {

    /* renamed from: a */
    public static Field f305082a;

    /* renamed from: b */
    public static boolean f305083b;

    /* renamed from: c */
    public static Class f305084c;

    /* renamed from: d */
    public static boolean f305085d;

    /* renamed from: e */
    public static Field f305086e;

    /* renamed from: f */
    public static boolean f305087f;

    /* renamed from: g */
    public static Field f305088g;

    /* renamed from: h */
    public static boolean f305089h;

    /* renamed from: a */
    public static void m137177a(Object obj) {
        if (!f305085d) {
            try {
                f305084c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f305085d = true;
        }
        Class cls = f305084c;
        if (cls != null) {
            if (!f305087f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f305086e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f305087f = true;
            }
            Field field = f305086e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
