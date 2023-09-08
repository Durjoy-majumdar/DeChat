package p416qd;

import android.os.SystemClock;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import p673r6.C36249a;
import p673r6.C89876b;

/* renamed from: qd.b */
public class C89590b {

    /* renamed from: a */
    public static boolean f257787a;

    /* renamed from: b */
    public static C89592b f257788b = new C89591a();

    /* renamed from: qd.b$a */
    public class C89591a implements C89592b {
        /* renamed from: a */
        public String mo123712a(String str) {
            C87412m.m108594g(str, "libName");
            C89876b.f258326a.mo123902d("MagicBrush.Util", "hy: try find lib path " + str + " with dummy imp", new Object[0]);
            return "";
        }

        public void loadLibrary(String str) {
            C87412m.m108594g(str, "libName");
            C89876b.f258326a.mo123902d("MagicBrush.Util", "System.loadLibrary " + str + ' ' + null, new Object[0]);
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/magicbrush/utils/Util", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/magicbrush/utils/Util", "loadLibrary", "(Ljava/lang/String;Ljava/lang/ClassLoader;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: qd.b$b */
    public interface C89592b {
        /* renamed from: a */
        String mo123712a(String str);

        void loadLibrary(String str);
    }

    /* renamed from: a */
    public static void m112027a() {
        if (f257787a) {
            C89598h.m112045b("MagicBrush", "library already loaded", new Object[0]);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C89598h.m112045b("MagicBrush", "start loadLibraries", new Object[0]);
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        f257788b.loadLibrary("mmv8");
        long elapsedRealtime3 = SystemClock.elapsedRealtime();
        f257788b.loadLibrary("magicbrush");
        f257787a = true;
        C89598h.m112045b("MagicBrush", "total[%d]ms load mmv8 cost [%d]ms, load magicbrush cost [%d]ms", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), Long.valueOf(elapsedRealtime3 - elapsedRealtime2), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime3));
    }

    /* renamed from: b */
    public static void m112028b(String str) {
        f257788b.loadLibrary(str);
    }

    /* renamed from: c */
    public static void m112029c(C89592b bVar) {
        if (bVar != null) {
            f257788b = bVar;
            C36249a.f96532a = new C89593c(bVar);
        }
    }
}
