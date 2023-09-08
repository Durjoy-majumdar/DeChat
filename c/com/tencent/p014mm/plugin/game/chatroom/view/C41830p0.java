package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import ix1.C46337n;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.p0 */
public class C41830p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameChatListView.C41771f f112746d;

    public C41830p0(GameChatListView.C41771f fVar) {
        this.f112746d = fVar;
    }

    public void run() {
        Iterator it = ((HashSet) this.f112746d.f112561i).iterator();
        while (it.hasNext()) {
            C46337n nVar = (C46337n) it.next();
            ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
            if (chatroomMsgPack != null) {
                long j = chatroomMsgPack.seq;
                long j2 = GameChatListView.this.f112536g2;
                if (j == j2) {
                    nVar.f124867Y0 = j2;
                    nVar.mo71733H();
                    GameChatListView.this.f112536g2 = -1;
                }
            }
        }
    }
}
