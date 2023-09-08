package com.tencent.p014mm.feature.brandservice.flutter.model;

import com.tencent.pigeon.BizPigeon;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.feature.brandservice.flutter.model.d */
public final class C17752d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FlutterBizPlugin f48878d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17752d(FlutterBizPlugin flutterBizPlugin) {
        super(0);
        this.f48878d = flutterBizPlugin;
    }

    public Object invoke() {
        BizPigeon.BizCallbackApi bizCallbackApi = this.f48878d.f48843d;
        if (bizCallbackApi != null) {
            BizPigeon.BizNotifyInfo bizNotifyInfo = new BizPigeon.BizNotifyInfo();
            bizNotifyInfo.setEventType(Long.valueOf((long) BizPigeon.BizNotifyEventType.eventTypeUpdate.ordinal()));
            bizCallbackApi.onDataChange(bizNotifyInfo, C17751c.f48877a);
        }
        return C13598b0.f38549a;
    }
}
