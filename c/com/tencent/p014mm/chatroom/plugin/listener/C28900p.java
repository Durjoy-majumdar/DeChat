package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.autogen.events.RevokeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import p203mi.C76758b0;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.p */
public class C28900p extends IStaticListener<RevokeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeMsgEvent revokeMsgEvent = (RevokeMsgEvent) iEvent;
        if (revokeMsgEvent instanceof RevokeMsgEvent) {
            Log.m105925i("MicroMsg.RevokeReceiveMessageListener", "RevokeMsgEvent recall result:%s", C76758b0.m92502g(revokeMsgEvent.f78943d.f78944a));
        }
        return false;
    }
}
