package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84315o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs;", "kotlin.jvm.PlatformType", "data", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/NavigatorInterceptor$CheckIsActiveMiniGameIPCResult;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.t */
final class C82822t<InputType, ResultType> implements C1255d {

    /* renamed from: d */
    public static final C82822t<InputType, ResultType> f242216d = new C82822t<>();

    public void invoke(Object obj, C1256g gVar) {
        NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs navigatorInterceptor$CheckIsActiveMiniGameIPCArgs = (NavigatorInterceptor$CheckIsActiveMiniGameIPCArgs) obj;
        C80264l b = AppBrandProcessesManager.f246131g.mo116962a().mo111387b(navigatorInterceptor$CheckIsActiveMiniGameIPCArgs.f80418d, navigatorInterceptor$CheckIsActiveMiniGameIPCArgs.f80419e);
        C13598b0 b0Var = null;
        C84315o oVar = b instanceof C84315o ? (C84315o) b : null;
        if (oVar != null) {
            gVar.mo894a(new NavigatorInterceptor$CheckIsActiveMiniGameIPCResult(true, oVar.f246202j));
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            gVar.mo894a(new NavigatorInterceptor$CheckIsActiveMiniGameIPCResult(false, false));
        }
    }
}
