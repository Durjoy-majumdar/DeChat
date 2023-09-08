package gp2;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13598b0;
import te3.C50098k92;

/* renamed from: gp2.v */
public final class C45941v implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ C32227p<Integer, String, C13598b0> f123939a;

    public C45941v(C32227p<? super Integer, ? super String, C13598b0> pVar) {
        this.f123939a = pVar;
    }

    /* renamed from: a */
    public final void mo288a(int i, int i2, String str, C47350c cVar) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$getSubBusinessInfo$1");
        if (i == 0 && i2 == 0) {
            try {
                C47465a aVar = cVar.f127056b.f127083a;
                if (aVar != null) {
                    if (aVar instanceof C50098k92) {
                        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetSubBusinessInfoResponse");
                        C32227p<Integer, String, C13598b0> pVar = this.f123939a;
                        String str2 = ((C50098k92) aVar).f136626d;
                        C87412m.m108593f(str2, "response.subBusinessUsername");
                        pVar.invoke(0, str2);
                    } else {
                        Log.m105920e("SnsAdMb.JsApi", "the type of response is not GetSubBusinessInfoResponse");
                        this.f123939a.invoke(1, "");
                    }
                    SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$getSubBusinessInfo$1");
                }
            } catch (Exception e) {
                Log.m105920e("SnsAdMb.JsApi", "there is a exception in " + e.getMessage());
                this.f123939a.invoke(1, "");
            }
        }
        Log.m105920e("SnsAdMb.JsApi", "the getSubBusinessInfo error the error code is " + i2);
        this.f123939a.invoke(1, "");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.ServiceChatHelper$getSubBusinessInfo$1");
    }
}
