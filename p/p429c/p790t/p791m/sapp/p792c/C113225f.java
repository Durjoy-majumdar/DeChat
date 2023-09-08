package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import dalvik.system.DexClassLoader;

/* renamed from: c.t.m.sapp.c.f */
public class C113225f {

    /* renamed from: a */
    public static DexClassLoader f338799a;

    /* renamed from: b */
    public static Context f338800b;

    /* renamed from: c */
    public static C113225f f338801c;

    public C113225f(Context context) {
        f338800b = context;
        C113231n.m154982a(context).mo165780a();
    }

    /* renamed from: a */
    public static C113225f m154950a(Context context) {
        if (f338801c == null) {
            synchronized (C113225f.class) {
                if (f338801c == null) {
                    f338801c = new C113225f(context);
                }
            }
        }
        return f338801c;
    }

    /* renamed from: b */
    public void mo165766b() {
        try {
            new Thread(new C113228i(f338800b, C113233r.m155023e(C113233r.m155014c(f338800b, "__SP_Tencent_Loc_COMP_INFO__sapp_", "")), false)).start();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public void mo165767c() {
        f338801c = null;
        f338799a = null;
    }

    /* renamed from: a */
    public synchronized DexClassLoader mo165765a() {
        DexClassLoader dexClassLoader = f338799a;
        if (dexClassLoader != null) {
            return dexClassLoader;
        }
        Context context = f338800b;
        if (context == null) {
            return null;
        }
        C79907d.m97052a(context).mo110068b("load_sapp");
        C113233r.f338826e = System.currentTimeMillis();
        DexClassLoader b = C113227h.m154957a(f338800b).mo165771b();
        f338799a = b;
        if (b != null) {
            C113223e.m154939a(f338800b).mo165755a();
        }
        mo165766b();
        C79907d.m97052a(f338800b).mo110069c("load_sapp");
        return f338799a;
    }
}
