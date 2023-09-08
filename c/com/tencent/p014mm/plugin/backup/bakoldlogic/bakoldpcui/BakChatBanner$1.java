package com.tencent.p014mm.plugin.backup.bakoldlogic.bakoldpcui;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.PCManagerBakEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.BakChatBanner$1 */
class BakChatBanner$1 extends IListener<PCManagerBakEvent> {

    /* renamed from: d */
    public final /* synthetic */ C92943c f267648d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BakChatBanner$1(C92943c cVar, C0125s sVar) {
        super(sVar);
        this.f267648d = cVar;
        this.__eventId = 1255753272;
    }

    public boolean callback(IEvent iEvent) {
        PCManagerBakEvent pCManagerBakEvent = (PCManagerBakEvent) iEvent;
        this.f267648d.f230569f.post(new C92941a(this));
        return false;
    }
}
