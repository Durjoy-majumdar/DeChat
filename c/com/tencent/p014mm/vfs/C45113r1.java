package com.tencent.p014mm.vfs;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import oa1.C117731d;

/* renamed from: com.tencent.mm.vfs.r1 */
public final class C45113r1 {
    /* renamed from: a */
    public static long m49956a(String str, String str2, boolean z) {
        boolean z2 = false;
        boolean z3 = (WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED) ? true : !"0".equals(C117731d.m166007c().mo182444f("clicfg_enable_refcount_linking", "0", false, true));
        if (z && z3) {
            z2 = true;
        }
        return C86013q1.m106443d(str, str2, z2);
    }

    /* renamed from: b */
    public static String m49957b(String str, boolean z) {
        try {
            String i = C86013q1.m106448i(str, z);
            if (i == null) {
                return str;
            }
            Log.m105925i("MicroMsg.VFSFileOpEx", "exportExternalPath:%s to realPath:%s", str, i);
            return i;
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.VFSFileOpEx", th, "exportExternalPath failed", new Object[0]);
            return str;
        }
    }
}
