package p206nj;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import j20.C117292a;
import k20.C9556a;

/* renamed from: nj.i */
public final class C76862i {

    /* renamed from: a */
    public static C76864b f224685a = new C76863a();

    /* renamed from: nj.i$a */
    public class C76863a implements C76864b {
        /* renamed from: R0 */
        public boolean mo107117R0(String str) {
            Log.m105924i("MicroMsg.exp.ExpansionsProxy", " System.loadLibrary(), name = " + str);
            C9556a aVar = new C9556a();
            aVar.mo10233c(str);
            Object obj = new Object();
            C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/mm/compatible/util/ExpansionsProxy$1", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            System.loadLibrary((String) aVar.mo10231a(0));
            C117292a.m165359e(obj, "com/tencent/mm/compatible/util/ExpansionsProxy$1", "tryLoadLibrary", "(Ljava/lang/String;)Z", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            return true;
        }

        /* renamed from: a */
        public boolean mo107118a(String str) {
            return false;
        }

        /* renamed from: b */
        public boolean mo107119b() {
            return false;
        }

        /* renamed from: c */
        public void mo107120c(Context context) {
        }

        public AssetManager getAssets() {
            return MMApplicationContext.getContext().getAssets();
        }

        public boolean isInstalled(String str) {
            return true;
        }
    }

    /* renamed from: nj.i$b */
    public interface C76864b {
        /* renamed from: R0 */
        boolean mo107117R0(String str);

        /* renamed from: a */
        boolean mo107118a(String str);

        /* renamed from: b */
        boolean mo107119b();

        /* renamed from: c */
        void mo107120c(Context context);

        AssetManager getAssets();

        boolean isInstalled(String str);
    }

    /* renamed from: a */
    public static boolean m92661a(String str) {
        return f224685a.isInstalled(str);
    }
}
