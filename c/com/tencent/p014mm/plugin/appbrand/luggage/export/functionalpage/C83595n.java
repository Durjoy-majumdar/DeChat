package com.tencent.p014mm.plugin.appbrand.luggage.export.functionalpage;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81661j;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/luggage/export/functionalpage/n;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandSysConfigWC;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.n */
final class C83595n implements C80916r<IPCString, AppBrandSysConfigWC> {
    public Object invoke(Object obj) {
        AppBrandSysConfigWC d;
        IPCString iPCString = (IPCString) obj;
        Log.m105924i("MicroMsg.AppBrand.FunctionalConfigAssembler", "invoke GetSycConfigTask with " + iPCString);
        try {
            C87412m.m108591d(iPCString);
            if (!C86709a0.m107523b().mo121114l() || (d = C81661j.m100179d(iPCString.f10315d)) == null) {
                return null;
            }
            d.f234876S0 = AppBrandGlobalSystemConfig.m100099b();
            return d;
        } catch (Exception e) {
            if (!BuildInfo.DEBUG) {
                return null;
            }
            throw e;
        }
    }
}
