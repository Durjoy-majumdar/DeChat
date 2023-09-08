package com.tencent.p014mm.feature.brandservice.flutter.model;

import com.tencent.pigeon.BizPigeon;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.b */
public final class C17750b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FlutterBizPlugin f48876d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17750b(FlutterBizPlugin flutterBizPlugin) {
        super(0);
        this.f48876d = flutterBizPlugin;
    }

    public Object invoke() {
        BizPigeon.BizCallbackApi bizCallbackApi = this.f48876d.f48843d;
        if (bizCallbackApi != null) {
            BizPigeon.BizNotifyInfo bizNotifyInfo = new BizPigeon.BizNotifyInfo();
            bizNotifyInfo.setEventType(Long.valueOf((long) BizPigeon.BizNotifyEventType.eventTypeUpdate.ordinal()));
            bizCallbackApi.onDataChange(bizNotifyInfo, C17749a.f48875a);
        }
        return C13598b0.f38549a;
    }
}
