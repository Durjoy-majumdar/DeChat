package com.tencent.p014mm.p136ui;

import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;

/* renamed from: com.tencent.mm.ui.o3 */
public class C74803o3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SubscribeMsgRequestResult f219936d;

    /* renamed from: e */
    public final /* synthetic */ C45034p3 f219937e;

    public C74803o3(C45034p3 p3Var, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f219937e = p3Var;
        this.f219936d = subscribeMsgRequestResult;
    }

    public void run() {
        UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
        UpdateWxaOptionsEvent.C67810a aVar = updateWxaOptionsEvent.f193994d;
        aVar.f193996a = this.f219937e.f122140e;
        aVar.f193997b = !this.f219936d.f49008o ? 1 : 2;
        aVar.f193998c = 1;
        updateWxaOptionsEvent.publish();
    }
}
