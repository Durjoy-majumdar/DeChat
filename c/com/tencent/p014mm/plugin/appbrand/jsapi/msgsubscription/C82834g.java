package com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription;

import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage;
import com.tencent.p014mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import p284zb.C91635f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.g */
public final class C82834g implements SubscribeMsgExecutor.C82831b {

    /* renamed from: a */
    public final /* synthetic */ JsApiRequestSubscribeMessage.SubscribeMsgTask f242251a;

    public C82834g(JsApiRequestSubscribeMessage.SubscribeMsgTask subscribeMsgTask) {
        this.f242251a = subscribeMsgTask;
    }

    /* renamed from: a */
    public void mo115059a(int i, int i2, String str, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(str, "errMsg");
        this.f242251a.mo17818a(i, i2, str, subscribeMsgRequestResult);
    }

    /* renamed from: b */
    public void mo115060b(SubscribeMsgRequestResult subscribeMsgRequestResult) {
        C87412m.m108594g(subscribeMsgRequestResult, "result");
        if (subscribeMsgRequestResult.f49017x) {
            JsApiRequestSubscribeMessage.SubscribeMsgTask.m101573e(this.f242251a, "cancel", (Map) null, 0, 6, (Object) null);
            return;
        }
        HashMap hashMap = new HashMap();
        for (SubscribeMsgTmpItem subscribeMsgTmpItem : subscribeMsgRequestResult.f49004h) {
            hashMap.put(subscribeMsgTmpItem.f49021f, subscribeMsgTmpItem.f49029q);
        }
        JsApiRequestSubscribeMessage.SubscribeMsgTask subscribeMsgTask = this.f242251a;
        JsApiRequestSubscribeMessage.C1757a aVar = JsApiRequestSubscribeMessage.f242232g;
        C91635f fVar = subscribeMsgTask.f242236h;
        C87412m.m108591d(fVar);
        JsApiRequestSubscribeMessage jsApiRequestSubscribeMessage = subscribeMsgTask.f242238j;
        C87412m.m108591d(jsApiRequestSubscribeMessage);
        Integer num = subscribeMsgTask.f242237i;
        C87412m.m108591d(num);
        aVar.mo1741a(fVar, jsApiRequestSubscribeMessage, num.intValue(), "ok", hashMap, 0);
    }
}
