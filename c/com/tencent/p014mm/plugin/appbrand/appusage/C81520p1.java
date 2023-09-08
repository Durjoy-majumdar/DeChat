package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.appusage.C81504j;
import di3.C86312j;
import f40.C86709a0;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/appusage/p1;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/appusage/AppIdentity;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.appusage.p1 */
final class C81520p1 implements C80916r<AppIdentity, IPCBoolean> {
    public Object invoke(Object obj) {
        boolean z;
        AppIdentity appIdentity = (AppIdentity) obj;
        if (!C86709a0.m107522a() || appIdentity == null) {
            z = false;
        } else {
            C81504j.C81505a aVar = C81504j.f239105a;
            z = ((C68585h1) C86312j.m106911c(C68585h1.class)).mo94244mJ(appIdentity.f239038d, appIdentity.f239039e);
        }
        return new IPCBoolean(z);
    }
}
