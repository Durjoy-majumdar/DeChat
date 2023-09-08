package rg3;

import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;

/* renamed from: rg3.c */
public final class C36325c {

    /* renamed from: a */
    public static Map<Integer, Boolean> f96692a = new HashMap();

    /* renamed from: a */
    public static void m40947a(int i, Object obj) {
        Log.m105925i("MicroMsg.SandBoxCore", "regLifeCycle, id=" + i + ", class=%s", obj.getClass().getName());
        ((HashMap) f96692a).put(Integer.valueOf(i), Boolean.TRUE);
        Log.m105924i("MicroMsg.SandBoxCore", "regLifeCycle, map size=" + ((HashMap) f96692a).size());
    }

    /* renamed from: b */
    public static void m40948b(int i, Object obj) {
        Log.m105925i("MicroMsg.SandBoxCore", "unregLifeCycle, id=" + i + ", class=%s", obj.getClass().getName());
        ((HashMap) f96692a).remove(Integer.valueOf(i));
        Log.m105924i("MicroMsg.SandBoxCore", "unregLifeCycle, map size=" + ((HashMap) f96692a).size());
        if (((HashMap) f96692a).size() == 0) {
            int myPid = Process.myPid();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(myPid));
            Object obj2 = new Object();
            C117292a.m165358d(obj2, aVar.mo10232b(), "com/tencent/mm/sandbox/SandBoxCore", "unregLifeCycle", "(ILjava/lang/Object;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Process.killProcess(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(obj2, "com/tencent/mm/sandbox/SandBoxCore", "unregLifeCycle", "(ILjava/lang/Object;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
            Log.m105928w("MicroMsg.SandBoxCore", "Sandbox exit Now.");
            Log.appenderFlushSync();
        }
    }
}
