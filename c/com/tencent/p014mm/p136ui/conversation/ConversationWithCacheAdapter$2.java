package com.tencent.p014mm.p136ui.conversation;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.BackupResetAccUinEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.ui.conversation.ConversationWithCacheAdapter$2 */
class ConversationWithCacheAdapter$2 extends IListener<BackupResetAccUinEvent> {

    /* renamed from: d */
    public final /* synthetic */ C74720p f219393d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationWithCacheAdapter$2(C74720p pVar, C0125s sVar) {
        super(sVar);
        this.f219393d = pVar;
        this.__eventId = -991574716;
    }

    public boolean callback(IEvent iEvent) {
        BackupResetAccUinEvent backupResetAccUinEvent = (BackupResetAccUinEvent) iEvent;
        this.f219393d.f219686C = true;
        return false;
    }
}
