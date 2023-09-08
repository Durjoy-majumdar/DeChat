package com.tencent.p014mm.chatroom.plugin.listener;

import com.tencent.p014mm.autogen.events.RevokeNativeMsgEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import p203mi.C76758b0;

/* renamed from: com.tencent.mm.chatroom.plugin.listener.n */
public class C28897n extends IStaticListener<RevokeNativeMsgEvent> {
    public boolean callback(IEvent iEvent) {
        RevokeNativeMsgEvent revokeNativeMsgEvent = (RevokeNativeMsgEvent) iEvent;
        if (revokeNativeMsgEvent instanceof RevokeNativeMsgEvent) {
            Log.m105925i("MicroMsg.RevokeNativeMessageListener", "RevokeNativeMsgEvent recall result:%s", C76758b0.m92502g(revokeNativeMsgEvent.f78950d.f78951a));
        }
        return false;
    }
}
