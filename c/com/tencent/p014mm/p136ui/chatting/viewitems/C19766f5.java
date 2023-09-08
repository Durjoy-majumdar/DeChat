package com.tencent.p014mm.p136ui.chatting.viewitems;

import ck3.C67391b;
import com.tencent.p014mm.autogen.events.UpdateWxaOptionsEvent;
import com.tencent.p014mm.msgsubscription.SubscribeMsgRequestResult;
import com.tencent.p014mm.p136ui.chatting.viewitems.C19768g5;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f5 */
public class C19766f5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SubscribeMsgRequestResult f56223d;

    /* renamed from: e */
    public final /* synthetic */ C19768g5.C19769a.C19770a f56224e;

    public C19766f5(C19768g5.C19769a.C19770a aVar, SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f56224e = aVar;
        this.f56223d = subscribeMsgRequestResult;
    }

    public void run() {
        UpdateWxaOptionsEvent updateWxaOptionsEvent = new UpdateWxaOptionsEvent();
        UpdateWxaOptionsEvent.C67810a aVar = updateWxaOptionsEvent.f193994d;
        aVar.f193996a = C19768g5.this.f56228d;
        aVar.f193997b = !this.f56223d.f49008o ? 1 : 2;
        aVar.f193998c = 1;
        updateWxaOptionsEvent.publish();
        C67391b bVar = C19768g5.this.f56230f.f216867v;
        if (bVar != null) {
            bVar.mo91540A();
        }
    }
}
