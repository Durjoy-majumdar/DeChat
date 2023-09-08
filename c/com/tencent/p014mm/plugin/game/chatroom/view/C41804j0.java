package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import java.util.Iterator;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.j0 */
public class C41804j0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameChatListView f112658d;

    public C41804j0(GameChatListView gameChatListView) {
        this.f112658d = gameChatListView;
    }

    public void run() {
        if (this.f112658d.f112534e2.size() != 0) {
            GameChatListView.C41774h hVar = null;
            Iterator<GameChatListView.C41774h> it = this.f112658d.f112534e2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GameChatListView.C41774h next = it.next();
                if (!next.f112573b) {
                    hVar = next;
                    break;
                }
            }
            if (hVar != null) {
                this.f112658d.setNoticeTag(hVar);
            }
        }
    }
}
