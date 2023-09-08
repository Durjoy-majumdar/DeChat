package t83;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;

/* renamed from: t83.g1 */
public final class C36979g1 {
    /* renamed from: a */
    public static final boolean m41111a() {
        if (!BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG && ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_debug, 0) != 1) {
            return false;
        }
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("_webview_jsloader");
        C87412m.m108593f(mmkv, "getMMKV(\"_webview_jsloader\")");
        return mmkv.getBoolean("vconsole", false);
    }
}
