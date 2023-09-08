package j30;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Util;
import oa1.C117731d;

/* renamed from: j30.a */
public class C76385a {
    /* renamed from: a */
    public static boolean m91809a() {
        return Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_abi_32_open", "1", false, true), 1) != 0;
    }

    /* renamed from: b */
    public static boolean m91810b() {
        return BuildInfo.IS_ARM64 && Util.getInt(C117731d.m166007c().mo182444f("clicfg_plugin_kara_few_shot_open", "0", false, true), 0) != 0;
    }
}
