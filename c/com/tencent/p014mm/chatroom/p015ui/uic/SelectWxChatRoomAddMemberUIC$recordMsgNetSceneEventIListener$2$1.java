package com.tencent.p014mm.chatroom.p015ui.uic;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.autogen.events.RecordMsgNetSceneEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/chatroom/ui/uic/SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/RecordMsgNetSceneEvent;", "ui-chatroom_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.chatroom.ui.uic.SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1 */
public final class SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1 extends IListener<RecordMsgNetSceneEvent> {

    /* renamed from: d */
    public final /* synthetic */ C67995a f195141d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectWxChatRoomAddMemberUIC$recordMsgNetSceneEventIListener$2$1(AppCompatActivity appCompatActivity, C67995a aVar) {
        super(appCompatActivity);
        this.f195141d = aVar;
    }

    public boolean callback(IEvent iEvent) {
        RecordMsgNetSceneEvent recordMsgNetSceneEvent = (RecordMsgNetSceneEvent) iEvent;
        C87412m.m108594g(recordMsgNetSceneEvent, "event");
        long j = recordMsgNetSceneEvent.f193874d.f193875a;
        if (j != 0) {
            Log.m105925i("MicroMsg.SelectWxChatRoomAddMemberUIC", "RecordMsgNetSceneEvent msgId:%s netSceneMsgId:%s isSucc:%s", Long.valueOf(j), this.f195141d.f195150o.first, Boolean.valueOf(recordMsgNetSceneEvent.f193874d.f193876b));
            long j2 = recordMsgNetSceneEvent.f193874d.f193875a;
            Long l = (Long) this.f195141d.f195150o.first;
            if (l != null && j2 == l.longValue()) {
                RecordMsgNetSceneEvent.C67771a aVar = recordMsgNetSceneEvent.f193874d;
                if (aVar.f193876b) {
                    this.f195141d.mo93386m3();
                } else {
                    C67995a aVar2 = this.f195141d;
                    String str = aVar.f193877c;
                    C87412m.m108593f(str, "event.data.errMsg");
                    aVar2.mo93384k3(0, "send record error", str);
                }
            }
        }
        return false;
    }
}
