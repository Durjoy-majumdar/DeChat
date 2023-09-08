package gp2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import e42.C7594e;
import e42.C7596h;
import eb0.C31543z5;
import gy3.C87412m;
import hp2.C87580d;

/* renamed from: gp2.g */
public final class C87293g<T extends C7594e> extends C87580d<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        return "getServerTimeMillisSync";
    }

    /* renamed from: p */
    public C7596h mo121697p(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        C87412m.m108594g(hVar, "data");
        C7596h hVar2 = new C7596h();
        hVar2.put("serverTime", C31543z5.m39453c());
        mo120845j(hVar2);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetServerTimeMillisSync");
        return hVar2;
    }
}
