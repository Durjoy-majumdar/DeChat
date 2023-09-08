package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.l0 */
public class C41808l0 implements Comparator<ChatroomMsgPack> {
    public C41808l0(GameChatListView.C41771f fVar) {
    }

    public int compare(Object obj, Object obj2) {
        int i = (((ChatroomMsgPack) obj).seq > ((ChatroomMsgPack) obj2).seq ? 1 : (((ChatroomMsgPack) obj).seq == ((ChatroomMsgPack) obj2).seq ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? 1 : -1;
    }
}
