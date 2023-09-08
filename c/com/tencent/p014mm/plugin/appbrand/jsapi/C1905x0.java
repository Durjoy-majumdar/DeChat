package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kotlin.Metadata;
import pb1.C100714h1;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.x0 */
final class C1905x0<InputType, ResultType> implements C80916r {

    /* renamed from: a */
    public static final C1905x0<InputType, ResultType> f11758a = new C1905x0<>();

    public Object invoke(Object obj) {
        int i;
        IPCString iPCString = (IPCString) obj;
        String str = iPCString != null ? iPCString.f10315d : null;
        if (str == null) {
            i = Integer.MIN_VALUE;
        } else {
            DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
            ((C100714h1) C86312j.m106911c(C100714h1.class)).mo135060mH(doFavoriteEvent, 6, str);
            doFavoriteEvent.publish();
            i = doFavoriteEvent.f264675e.f9046a;
            Log.m105924i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "doFavoriteMainProcess, ret: " + i);
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiAddImageToFavorites", "doFavoriteMainProcess, result: " + i);
        return new IPCInteger(i);
    }
}
