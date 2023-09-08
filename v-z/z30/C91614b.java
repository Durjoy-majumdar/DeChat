package z30;

import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import oa1.C117731d;

/* renamed from: z30.b */
public class C91614b {

    /* renamed from: a */
    public static final String f262457a = (VFSStrategy.m163776d("PublicResource") + "/kara/so");

    /* renamed from: b */
    public static boolean f262458b = false;

    /* renamed from: z30.b$a */
    public static class C91615a {

        /* renamed from: a */
        public String f262459a;

        /* renamed from: b */
        public String f262460b;

        /* renamed from: c */
        public String f262461c;

        /* renamed from: d */
        public String f262462d;

        /* renamed from: e */
        public String f262463e;

        /* renamed from: f */
        public String f262464f;

        public C91615a(C91613a aVar) {
        }

        /* renamed from: a */
        public String mo125485a() {
            if (BuildInfo.IS_ARM64) {
                return this.f262459a + "_" + this.f262460b + ".so";
            }
            return this.f262461c + "_" + this.f262462d + ".so";
        }
    }

    /* renamed from: a */
    public static C91615a m114959a() {
        String f = C117731d.m166007c().mo182444f("clicfg_plugin_kara_env_so_name_64", "", true, true);
        String f2 = C117731d.m166007c().mo182444f("clicfg_plugin_kara_env_so_md5_64", "", true, true);
        String f3 = C117731d.m166007c().mo182444f("clicfg_plugin_kara_env_so_name_32", "", true, true);
        String f4 = C117731d.m166007c().mo182444f("clicfg_plugin_kara_env_so_md5_32", "", true, true);
        String f5 = C117731d.m166007c().mo182444f("clicfg_plugin_kara_env_so_min_version", "", true, true);
        String f6 = C117731d.m166007c().mo182444f("clicfg_plugin_kara_env_so_download_url_32", "", true, true);
        String f7 = C117731d.m166007c().mo182444f("clicfg_plugin_kara_env_so_download_url_64", "", true, true);
        if (TextUtils.isEmpty(f) || TextUtils.isEmpty(f2) || TextUtils.isEmpty(f3) || TextUtils.isEmpty(f4) || TextUtils.isEmpty(f5) || TextUtils.isEmpty(f6) || TextUtils.isEmpty(f7)) {
            return null;
        }
        C91615a aVar = new C91615a((C91613a) null);
        aVar.f262459a = f;
        aVar.f262460b = f2;
        aVar.f262461c = f3;
        aVar.f262462d = f4;
        aVar.f262463e = f6;
        aVar.f262464f = f7;
        return aVar;
    }

    /* renamed from: b */
    public static boolean m114960b() {
        C91615a a = m114959a();
        if (a == null) {
            return false;
        }
        return C86013q1.m106450k(f262457a + "/" + a.mo125485a());
    }
}
