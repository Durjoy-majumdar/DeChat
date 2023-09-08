package hp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import e42.C7594e;
import e42.C7596h;
import e42.C86430i;
import gy3.C87412m;

/* renamed from: hp2.c */
public abstract class C87579c<T extends C7594e> extends C86430i<T> {
    /* renamed from: q */
    public void mo18q(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        C87412m.m108594g(hVar, "data");
        Log.m105924i("SnsAdMb.JsApi", "the async jsapi " + mo16e() + " is called");
        if (mo121699t()) {
            Log.m105924i("SnsAdMb.JsApi", "the async jsapi need activity");
            T t = this.f251227a;
            if (t == null || t.mo8720e0() == null) {
                Log.m105920e("SnsAdMb.JsApi", "the async jsapi need activity, but the activity is null");
                mo122027r(mo120842g(10000, "the activity is null, please check it!"));
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
                return;
            }
        }
        try {
            mo121698s(hVar);
        } catch (Throwable th) {
            Log.m105928w("SnsAdMb.JsApi", "there is something exception: " + th.getMessage());
            mo122027r(mo120842g(CodecError.FLUSH_ILLEGAL, "there is something exception: " + th.getMessage()));
        }
        Log.m105924i("SnsAdMb.JsApi", "the async jsapi " + mo16e() + " end");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }

    /* renamed from: r */
    public final void mo122027r(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        C87412m.m108594g(hVar, "data");
        try {
            mo120840p().invoke(hVar);
        } catch (Throwable th) {
            Log.m105920e("SnsAdMb.JsApi", "call back to js has an exception, " + th.getMessage());
        }
        SnsMethodCalculate.markEndTimeMs("backToJs", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
    }

    /* renamed from: s */
    public abstract void mo121698s(C7596h hVar);

    /* renamed from: t */
    public boolean mo121699t() {
        SnsMethodCalculate.markStartTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        SnsMethodCalculate.markEndTimeMs("shouldNeedActivity", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiSnsAdLoggedAsyncBase");
        return true;
    }
}
