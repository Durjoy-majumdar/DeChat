package com.tencent.p014mm.p136ui.conversation;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.RefreshMainUIMultitalkIconEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.ui.conversation.RefreshHelper$3 */
class RefreshHelper$3 extends IListener<RefreshMainUIMultitalkIconEvent> {

    /* renamed from: d */
    public final /* synthetic */ C74739q2 f219510d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshHelper$3(C74739q2 q2Var, C0125s sVar) {
        super(sVar);
        this.f219510d = q2Var;
        this.__eventId = -893558668;
    }

    public boolean callback(IEvent iEvent) {
        RefreshMainUIMultitalkIconEvent refreshMainUIMultitalkIconEvent = (RefreshMainUIMultitalkIconEvent) iEvent;
        if (this.f219510d.f219774e == null) {
            return true;
        }
        MMHandlerThread.postToMainThread(new C74709l2(this));
        return true;
    }
}
