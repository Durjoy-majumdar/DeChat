package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiAddVideoToFavorites;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiAddVideoToFavorites$DoFavoriteParams;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.i1 */
final class C82541i1<InputType, ResultType> implements C80916r {

    /* renamed from: a */
    public static final C82541i1<InputType, ResultType> f241632a = new C82541i1<>();

    public Object invoke(Object obj) {
        int i;
        JsApiAddVideoToFavorites.DoFavoriteParams doFavoriteParams = (JsApiAddVideoToFavorites.DoFavoriteParams) obj;
        try {
            i = C82838n1.m101588a(doFavoriteParams.f240404d, doFavoriteParams.f240405e);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, fail since " + e);
            i = Integer.MIN_VALUE;
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiAddVideoToFavorites", "doFavoriteMainProcess, result: " + i);
        return new IPCInteger(i);
    }
}
