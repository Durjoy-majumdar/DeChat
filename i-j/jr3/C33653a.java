package jr3;

import j20.C117292a;
import k20.C9556a;

/* renamed from: jr3.a */
public class C33653a {

    /* renamed from: a */
    public static C33655b f91067a = new C33654a();

    /* renamed from: jr3.a$a */
    public class C33654a implements C33655b {
        public void loadLibrary(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/websocket/libwcwss/WcwssLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/websocket/libwcwss/WcwssLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: jr3.a$b */
    public interface C33655b {
        void loadLibrary(String str);
    }
}
