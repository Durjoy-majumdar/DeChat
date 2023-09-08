package com.tencent.p014mm.p136ui.conversation;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.MainUISetTopEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.ui.conversation.RefreshHelper$4 */
class RefreshHelper$4 extends IListener<MainUISetTopEvent> {

    /* renamed from: d */
    public final /* synthetic */ ConversationListView f219511d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RefreshHelper$4(C74739q2 q2Var, C0125s sVar, ConversationListView conversationListView) {
        super(sVar);
        this.f219511d = conversationListView;
        this.__eventId = -765268918;
    }

    public boolean callback(IEvent iEvent) {
        MainUISetTopEvent mainUISetTopEvent = (MainUISetTopEvent) iEvent;
        ConversationListView conversationListView = this.f219511d;
        if (conversationListView != null) {
            conversationListView.setSelection(0);
        }
        return false;
    }
}
