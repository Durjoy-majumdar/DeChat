package z24;

import j20.C117292a;
import k20.C9556a;

/* renamed from: z24.h */
public final class C91612h implements C91608d {
    /* renamed from: a */
    public void mo125483a(String str) {
        C9556a aVar = new C9556a();
        aVar.mo10233c(str);
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "org/extra/relinker/SystemLibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "org/extra/relinker/SystemLibraryLoader", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    /* renamed from: b */
    public String mo125484b(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }
}
