package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatRoomListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import cx1.C45219a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.j */
public class C41803j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomJoinOrQuitEvent f112656d;

    /* renamed from: e */
    public final /* synthetic */ ChatRoomListView.C417482 f112657e;

    public C41803j(ChatRoomListView.C417482 r1, ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent) {
        this.f112657e = r1;
        this.f112656d = chatRoomJoinOrQuitEvent;
    }

    public void run() {
        ChatRoomListView.C41755e eVar = ChatRoomListView.this.f112394D1;
        String str = this.f112656d.f107400d.f107402b;
        synchronized (eVar) {
            int i = 0;
            while (true) {
                if (i < ((CopyOnWriteArrayList) eVar.f112418d).size()) {
                    ChatroomData b = C41811n.m45333b((C45219a) ((CopyOnWriteArrayList) eVar.f112418d).get(i));
                    if (b != null && Util.nullAsNil(b.chatroom_name).equals(str)) {
                        List<C45219a> list = eVar.f112418d;
                        ((CopyOnWriteArrayList) list).remove(((CopyOnWriteArrayList) list).get(i));
                        eVar.notifyItemRemoved(i);
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
