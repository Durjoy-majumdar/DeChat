package com.tencent.p014mm.plugin.appbrand.jsapi.fakenative;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.jsapi.fakenative.JsApiRemoveSplashScreenshot;
import gs0.C87324b;
import kotlin.Metadata;
import x20.C15618a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/fakenative/JsApiRemoveSplashScreenshot$RemoveParams;", "params", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "callback", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/jsapi/fakenative/JsApiRemoveSplashScreenshot$RemoveParams;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.fakenative.j */
final class C29511j<InputType, ResultType> implements C80883e {

    /* renamed from: d */
    public static final C29511j<InputType, ResultType> f80390d = new C29511j<>();

    public void invoke(Object obj, C1256g gVar) {
        JsApiRemoveSplashScreenshot.RemoveParams removeParams = (JsApiRemoveSplashScreenshot.RemoveParams) obj;
        if (removeParams != null) {
            String str = removeParams.f80388d;
            int i = removeParams.f80389e;
            C87324b bVar = (C87324b) C81161g2.Bx0(C87324b.class);
            if (bVar != null) {
                C87324b.C32517a aVar = C87324b.f253068f;
                bVar.mo121719jo(str, i, C87324b.C32518b.C32519a.f86360a);
            }
        }
        if (gVar != null) {
            C15618a.m14625a(gVar);
        }
    }
}
