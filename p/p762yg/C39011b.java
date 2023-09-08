package p762yg;

import j20.C117292a;
import k20.C9556a;

/* renamed from: yg.b */
public class C39011b {

    /* renamed from: a */
    public static C39013b f105067a = new C39012a();

    /* renamed from: yg.b$a */
    public class C39012a implements C39013b {
        public void loadLibrary(String str) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/appbrand/commonjni/delegates/LoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/appbrand/commonjni/delegates/LoadDelegate$1", "loadLibrary", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        }
    }

    /* renamed from: yg.b$b */
    public interface C39013b {
        void loadLibrary(String str);
    }
}
