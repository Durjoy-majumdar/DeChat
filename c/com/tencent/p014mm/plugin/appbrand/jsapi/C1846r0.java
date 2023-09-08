package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiAddFileToFavorites;
import com.tencent.p014mm.sdk.platformtools.Log;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/plugin/appbrand/jsapi/JsApiAddFileToFavorites$DoFavoriteParams;", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.r0 */
final class C1846r0<InputType, ResultType> implements C80916r {

    /* renamed from: a */
    public static final C1846r0<InputType, ResultType> f11656a = new C1846r0<>();

    public Object invoke(Object obj) {
        int i;
        JsApiAddFileToFavorites.DoFavoriteParams doFavoriteParams = (JsApiAddFileToFavorites.DoFavoriteParams) obj;
        try {
            i = C1886w0.m1907a(doFavoriteParams.f10911d, doFavoriteParams.f10912e, doFavoriteParams.f10913f);
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrand.JsApiAddFileToFavorites", "doFavoriteMainProcess, fail since " + e);
            i = Integer.MIN_VALUE;
        }
        Log.m105924i("MicroMsg.AppBrand.JsApiAddFileToFavorites", "doFavoriteMainProcess, result: " + i);
        return new IPCInteger(i);
    }
}
