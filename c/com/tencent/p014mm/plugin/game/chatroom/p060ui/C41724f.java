package com.tencent.p014mm.plugin.game.chatroom.p060ui;

import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.chatroom.p060ui.GameMoreChatRoomUI;
import com.tencent.p014mm.plugin.game.chatroom.view.C41811n;
import com.tencent.p014mm.sdk.platformtools.Util;
import cx1.C45219a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.chatroom.ui.f */
public class C41724f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomJoinOrQuitEvent f112300d;

    /* renamed from: e */
    public final /* synthetic */ GameMoreChatRoomUI.C417173 f112301e;

    public C41724f(GameMoreChatRoomUI.C417173 r1, ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent) {
        this.f112301e = r1;
        this.f112300d = chatRoomJoinOrQuitEvent;
    }

    public void run() {
        GameMoreChatRoomUI.C41720c cVar = GameMoreChatRoomUI.this.f112276i;
        String str = this.f112300d.f107400d.f107402b;
        synchronized (cVar) {
            int i = 0;
            while (true) {
                if (i < ((LinkedList) cVar.f112287d).size()) {
                    ChatroomData b = C41811n.m45333b((C45219a) ((LinkedList) cVar.f112287d).get(i));
                    if (b != null && Util.nullAsNil(b.chatroom_name).equals(str)) {
                        List<C45219a> list = cVar.f112287d;
                        ((LinkedList) list).remove(((LinkedList) list).get(i));
                        cVar.notifyItemRemoved(i);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
    }
}
