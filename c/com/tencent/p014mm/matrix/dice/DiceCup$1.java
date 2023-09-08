package com.tencent.p014mm.matrix.dice;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.PostSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import zt3.C119157j;

/* renamed from: com.tencent.mm.matrix.dice.DiceCup$1 */
class DiceCup$1 extends IListener<PostSyncTaskEvent> {

    /* renamed from: d */
    public final /* synthetic */ C80982a f237862d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiceCup$1(C80982a aVar, C0125s sVar) {
        super(sVar);
        this.f237862d = aVar;
        this.__eventId = -790196534;
    }

    public boolean callback(IEvent iEvent) {
        PostSyncTaskEvent postSyncTaskEvent = (PostSyncTaskEvent) iEvent;
        ((C119157j) C119157j.f356862d).mo183876g(this.f237862d, "MicroMsg.DiceCup");
        this.f237862d.f237865e.dead();
        return false;
    }
}
