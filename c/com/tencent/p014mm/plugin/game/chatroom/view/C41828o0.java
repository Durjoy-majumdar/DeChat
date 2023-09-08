package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.autogen.chatroom.TopicInfo;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.o0 */
public class C41828o0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f112741d;

    /* renamed from: e */
    public final /* synthetic */ TopicInfo f112742e;

    /* renamed from: f */
    public final /* synthetic */ GameChatListView.C41771f f112743f;

    public C41828o0(GameChatListView.C41771f fVar, long j, TopicInfo topicInfo) {
        this.f112743f = fVar;
        this.f112741d = j;
        this.f112742e = topicInfo;
    }

    public void run() {
        for (ChatroomMsgPack next : this.f112743f.f112557e) {
            if (next.seq == this.f112741d) {
                if (next.msg_options == null) {
                    next.msg_options = new MsgOptions();
                }
                next.msg_options.topic_info = this.f112742e;
                List<ChatroomMsgPack> list = this.f112743f.f112557e;
                list.set(list.indexOf(next), next);
                return;
            }
        }
    }
}
