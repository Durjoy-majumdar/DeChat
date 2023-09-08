package hp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import e42.C7594e;
import e42.C7596h;
import e42.C86432k;
import gy3.C87412m;

/* renamed from: hp2.d */
public abstract class C87580d<T extends C7594e> extends C86432k<T> {
    /* renamed from: o */
    public final C7596h mo62167o(C7596h hVar) {
        C7596h hVar2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        C87412m.m108594g(hVar, "data");
        Log.m105924i("SnsAdMb.JsApi", "the jsapi " + mo16e() + " is called");
        SnsMethodCalculate.markStartTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        SnsMethodCalculate.markEndTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        T t = this.f251227a;
        if (t == null || t.mo8720e0() == null) {
            Log.m105928w("SnsAdMb.JsApi", "the activity is null");
            C7596h g = mo120842g(10000, "activity is null");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
            return g;
        }
        try {
            hVar2 = mo121697p(hVar);
            Log.m105924i("SnsAdMb.JsApi", "the jsapi " + mo16e() + " end, result is " + hVar2);
        } catch (Exception e) {
            Log.m105924i("SnsAdMb.JsApi", "there is something exception: " + e.getMessage());
            hVar2 = mo120842g(CodecError.FLUSH_ILLEGAL, "there is something exception: " + e.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedBase");
        return hVar2;
    }

    /* renamed from: p */
    public abstract C7596h mo121697p(C7596h hVar);
}
