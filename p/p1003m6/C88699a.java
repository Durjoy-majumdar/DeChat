package p1003m6;

/* renamed from: m6.a */
public class C88699a {

    /* renamed from: a */
    public static C88700b f256049a;

    /* renamed from: a */
    public static boolean m110646a(String str) {
        C88700b bVar;
        synchronized (C88699a.class) {
            bVar = f256049a;
            if (bVar == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return bVar.loadLibrary(str, 0);
    }
}
