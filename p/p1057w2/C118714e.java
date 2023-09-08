package p1057w2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p1050v2.C111319e;

/* renamed from: w2.e */
public class C118714e extends C118719j {

    /* renamed from: a */
    public static Class<?> f355222a;

    /* renamed from: b */
    public static Constructor<?> f355223b;

    /* renamed from: c */
    public static Method f355224c;

    /* renamed from: d */
    public static Method f355225d;

    /* renamed from: e */
    public static boolean f355226e;

    /* renamed from: g */
    public static boolean m167397g(Object obj, String str, int i, boolean z) {
        m167398h();
        try {
            return ((Boolean) f355224c.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public static void m167398h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f355226e) {
            f355226e = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            f355223b = constructor;
            f355222a = cls;
            f355224c = method;
            f355225d = method2;
        }
    }

    /* renamed from: a */
    public Typeface mo183460a(Context context, C111319e.C111321b bVar, Resources resources, int i) {
        m167398h();
        try {
            Object newInstance = f355223b.newInstance(new Object[0]);
            C111319e.C111323c[] cVarArr = bVar.f333288a;
            int length = cVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C111319e.C111323c cVar = cVarArr[i2];
                File d = C90886k.m114011d(context);
                if (d == null) {
                    return null;
                }
                try {
                    if (!C90886k.m114009b(d, resources, cVar.f333298f)) {
                        d.delete();
                        return null;
                    } else if (!m167397g(newInstance, d.getPath(), cVar.f333294b, cVar.f333295c)) {
                        return null;
                    } else {
                        d.delete();
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d.delete();
                }
            }
            m167398h();
            try {
                Object newInstance2 = Array.newInstance(f355222a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f355225d.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo183461b(android.content.Context r4, android.os.CancellationSignal r5, p1091b3.C113133l[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            b3.l r6 = r3.mo183470f(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f338532a     // Catch:{ IOException -> 0x0084 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0084 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0084 }
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x004b }
            r6.<init>()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r7 = "/proc/self/fd/"
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r5.getFd()     // Catch:{ ErrnoException -> 0x004b }
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = r6.toString()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x004b }
            android.system.StructStat r7 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r7.st_mode     // Catch:{ ErrnoException -> 0x004b }
            boolean r7 = android.system.OsConstants.S_ISREG(r7)     // Catch:{ ErrnoException -> 0x004b }
            if (r7 == 0) goto L_0x004b
            java.io.File r7 = new java.io.File     // Catch:{ ErrnoException -> 0x004b }
            r7.<init>(r6)     // Catch:{ ErrnoException -> 0x004b }
            goto L_0x004c
        L_0x0049:
            r4 = move-exception
            goto L_0x007b
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r7 == 0) goto L_0x005d
            boolean r6 = r7.canRead()     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r7)     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x005d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r6.<init>(r7)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r4 = r3.mo183469c(r4, r6)     // Catch:{ all -> 0x0071 }
            r6.close()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x0071:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0049 }
        L_0x007a:
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x007b:
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0084 }
        L_0x0083:
            throw r4     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1057w2.C118714e.mo183461b(android.content.Context, android.os.CancellationSignal, b3.l[], int):android.graphics.Typeface");
    }
}
