package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import kotlin.Metadata;
import p763ym.C79138l;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "kotlin.jvm.PlatformType", "appIdHolder", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b0 */
final class C1628b0<InputType, ResultType> implements C80916r {

    /* renamed from: a */
    public static final C1628b0<InputType, ResultType> f11249a = new C1628b0<>();

    public Object invoke(Object obj) {
        String str = ((IPCString) obj).f10315d;
        C79138l lVar = (C79138l) C86312j.m106911c(C79138l.class);
        String str2 = null;
        C44561j appInfo = lVar != null ? lVar.getAppInfo(str) : null;
        if (appInfo != null) {
            str2 = appInfo.field_packageName;
        }
        boolean f = str2 == null ? false : C72688j0.m85020f(MMApplicationContext.getContext(), str2);
        Log.m105924i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByAppId, theAppId: " + str + ", packageName: " + str2 + ", isInstalled: " + f);
        return new IPCBoolean(f);
    }
}
