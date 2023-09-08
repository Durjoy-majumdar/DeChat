package v30;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.VFSStrategy;
import j30.C76385a;

/* renamed from: v30.b */
public class C90748b {

    /* renamed from: a */
    public static final String f260642a;

    /* renamed from: b */
    public static final String f260643b;

    static {
        String str = VFSStrategy.m163776d("PublicResource") + "/kara/fewshot/xgboost";
        f260642a = str;
        f260643b = str + "/libxgboost.so";
    }

    /* renamed from: a */
    public static boolean m113818a() {
        if (!C76385a.m91810b()) {
            Log.m105920e("Kara.XgboostEnv", "need 64");
            return false;
        }
        String str = f260643b;
        if (!new C86009m1(str).mo119967g()) {
            Log.m105920e("Kara.XgboostEnv", "so no exists");
            return false;
        }
        try {
            System.load(str);
        } catch (Throwable unused) {
            Log.m105920e("Kara.XgboostEnv", "so load error");
        }
        Log.m105924i("Kara.XgboostEnv", "init succ");
        return true;
    }
}
