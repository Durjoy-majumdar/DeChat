package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomData;
import com.tencent.p014mm.plugin.game.chatroom.view.MyChatRoomListView;
import com.tencent.p014mm.sdk.platformtools.Util;
import cx1.C45219a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.t0 */
public class C41840t0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomJoinOrQuitEvent f112783d;

    /* renamed from: e */
    public final /* synthetic */ MyChatRoomListView.C417792 f112784e;

    public C41840t0(MyChatRoomListView.C417792 r1, ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent) {
        this.f112784e = r1;
        this.f112783d = chatRoomJoinOrQuitEvent;
    }

    public void run() {
        MyChatRoomListView.C41784c cVar = MyChatRoomListView.this.f112593D1;
        String str = this.f112783d.f107400d.f107402b;
        synchronized (cVar) {
            int i = 0;
            while (true) {
                if (i < ((CopyOnWriteArrayList) cVar.f112611d).size()) {
                    ChatroomData b = C41811n.m45333b((C45219a) ((CopyOnWriteArrayList) cVar.f112611d).get(i));
                    if (b != null && Util.nullAsNil(b.chatroom_name).equals(str)) {
                        List<C45219a> list = cVar.f112611d;
                        ((CopyOnWriteArrayList) list).remove(((CopyOnWriteArrayList) list).get(i));
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
