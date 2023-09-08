package com.tencent.p014mm.p136ui.conversation;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.RePullEmojiInfoDescEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.ui.conversation.RefreshHelper$2 */
class RefreshHelper$2 extends IListener<RePullEmojiInfoDescEvent> {

    /* renamed from: d */
    public final /* synthetic */ MMHandler f165452d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshHelper$2(C74739q2 q2Var, C0125s sVar, MMHandler mMHandler) {
        super(sVar);
        this.f165452d = mMHandler;
        this.__eventId = -474068419;
    }

    public boolean callback(IEvent iEvent) {
        RePullEmojiInfoDescEvent rePullEmojiInfoDescEvent = (RePullEmojiInfoDescEvent) iEvent;
        this.f165452d.sendEmptyMessage(0);
        return false;
    }
}
