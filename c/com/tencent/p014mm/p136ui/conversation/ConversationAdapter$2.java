package com.tencent.p014mm.p136ui.conversation;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.BackupResetAccUinEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.ui.conversation.ConversationAdapter$2 */
class ConversationAdapter$2 extends IListener<BackupResetAccUinEvent> {

    /* renamed from: d */
    public final /* synthetic */ C74697k f219322d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationAdapter$2(C74697k kVar, C0125s sVar) {
        super(sVar);
        this.f219322d = kVar;
        this.__eventId = -991574716;
    }

    public boolean callback(IEvent iEvent) {
        BackupResetAccUinEvent backupResetAccUinEvent = (BackupResetAccUinEvent) iEvent;
        C74697k kVar = this.f219322d;
        kVar.f219616x = true;
        kVar.f219615w = true;
        return false;
    }
}
