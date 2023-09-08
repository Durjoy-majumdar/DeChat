package ys3;

import android.content.Context;
import ft3.C116895f;

/* renamed from: ys3.e */
public class C118994e {
    /* renamed from: a */
    public static Class<?> m167758a(Context context, String str, Object obj) {
        Class<?> cls;
        if (context != null) {
            try {
                cls = context.getClassLoader().loadClass(str);
            } catch (Throwable th) {
                C116895f.m164893e(th);
                return null;
            }
        } else {
            cls = Class.forName(str);
        }
        if (cls == null && obj != null) {
            cls = obj.getClass().getClassLoader().loadClass(str);
        }
        if (cls == null) {
            return null;
        }
        return cls;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[Catch:{ all -> 0x0011, all -> 0x001e }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[Catch:{ all -> 0x0011, all -> 0x001e }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m167759b(java.lang.Class<?> r1, java.lang.String r2, java.lang.Object r3) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0005
        L_0x0003:
            r1 = r0
            goto L_0x0016
        L_0x0005:
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ all -> 0x0011 }
            if (r1 != 0) goto L_0x000c
            goto L_0x0003
        L_0x000c:
            r2 = 1
            r1.setAccessible(r2)     // Catch:{ all -> 0x0011 }
            goto L_0x0016
        L_0x0011:
            r1 = move-exception
            ft3.C116895f.m164893e(r1)     // Catch:{ all -> 0x001e }
            goto L_0x0003
        L_0x0016:
            if (r1 != 0) goto L_0x0019
            return r0
        L_0x0019:
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x001e }
            return r1
        L_0x001e:
            r1 = move-exception
            ft3.C116895f.m164893e(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ys3.C118994e.m167759b(java.lang.Class, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
