package com.tencent.p014mm.plugin.appbrand.jsapi.system;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"", "message", "Lrx3/b0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.system.JsApiSetScreenBrightness2$invoke$logI$1 */
public final class JsApiSetScreenBrightness2$invoke$logI$1 extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C82381f f80438d;

    /* renamed from: e */
    public final /* synthetic */ int f80439e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsApiSetScreenBrightness2$invoke$logI$1(C82381f fVar, int i) {
        super(1);
        this.f80438d = fVar;
        this.f80439e = i;
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        C87412m.m108594g(str, StateEvent.Name.MESSAGE);
        Log.m105924i("Luggage.JsApiSetScreenBrightness2", "invoke(appId:" + this.f80438d.getAppId() + ", callbackId:" + this.f80439e + ") " + str);
        return C13598b0.f38549a;
    }
}
