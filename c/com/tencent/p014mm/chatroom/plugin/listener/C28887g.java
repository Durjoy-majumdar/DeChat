package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.autogen.events.GetChatRoomInfoDetailEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import p530fx.C45819c;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.g */
public class C28887g extends IStaticListener<GetChatRoomInfoDetailEvent> {
    public boolean callback(IEvent iEvent) {
        GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent = (GetChatRoomInfoDetailEvent) iEvent;
        if ((getChatRoomInfoDetailEvent instanceof GetChatRoomInfoDetailEvent) && !Util.isNullOrNil(getChatRoomInfoDetailEvent.f78814d.f78815a)) {
            ((C45819c) C86312j.m106911c(C45819c.class)).mo71192mK(getChatRoomInfoDetailEvent.f78814d.f78815a).mo71504o(getChatRoomInfoDetailEvent.f78814d.f78815a).mo100865c();
            Log.m105925i("MicroMsg.GetChatRoomInfoDetailListener", "getChatRoomInfoDetailListener roomname:%s", getChatRoomInfoDetailEvent.f78814d.f78815a);
        }
        return false;
    }
}
