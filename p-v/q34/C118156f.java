package q34;

import java.security.AccessController;

/* renamed from: q34.f */
public final class C118156f {

    /* renamed from: a */
    public static final int f353184a;

    /* renamed from: b */
    public static final boolean f353185b;

    static {
        int i;
        boolean z = false;
        try {
            i = ((Integer) Class.forName("android.os.Build$VERSION", true, System.getSecurityManager() == null ? ClassLoader.getSystemClassLoader() : (ClassLoader) AccessController.doPrivileged(new C118155e())).getField("SDK_INT").get((Object) null)).intValue();
        } catch (Exception unused) {
            i = 0;
        }
        f353184a = i;
        if (i != 0) {
            z = true;
        }
        f353185b = z;
    }
}
