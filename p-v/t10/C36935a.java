package t10;

import j20.C117292a;
import k20.C9556a;

/* renamed from: t10.a */
public class C36935a {

    /* renamed from: a */
    public static C36937b f97989a = new C36936a();

    /* renamed from: t10.a$a */
    public class C36936a implements C36937b {
        public void loadLibrary(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/game/lockstep/LockstepLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/game/lockstep/LockstepLoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: t10.a$b */
    public interface C36937b {
        void loadLibrary(String str);
    }
}
