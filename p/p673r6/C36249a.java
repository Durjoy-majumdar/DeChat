package p673r6;

import j20.C117292a;
import k20.C9556a;

/* renamed from: r6.a */
public class C36249a {

    /* renamed from: a */
    public static C36251b f96532a = new C36250a();

    /* renamed from: r6.a$a */
    public static class C36250a implements C36251b {
        public void loadLibrary(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/github/henryye/nativeiv/delegate/LibraryLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/github/henryye/nativeiv/delegate/LibraryLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: r6.a$b */
    public interface C36251b {
        void loadLibrary(String str);
    }
}
