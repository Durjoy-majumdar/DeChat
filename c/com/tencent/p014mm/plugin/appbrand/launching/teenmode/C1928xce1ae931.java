package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import fy3.C32228q;
import kotlin.Metadata;
import ky2.C10432i;

@Metadata(mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$sam$com_tencent_mm_plugin_teenmode_api_ITeenModeService_AuthorizationReqResultCallback$0 */
public final class C1928xce1ae931 implements C10432i.C10433a {
    private final /* synthetic */ C32228q function;

    public C1928xce1ae931(C32228q qVar) {
        this.function = qVar;
    }

    public final /* synthetic */ void onResult(int i, String str, boolean z) {
        this.function.invoke(Integer.valueOf(i), str, Boolean.valueOf(z));
    }
}
