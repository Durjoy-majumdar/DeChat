package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgOptions;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteInfo;
import com.tencent.p014mm.plugin.game.chatroom.view.GameChatListView;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.n0 */
public class C41826n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f112736d;

    /* renamed from: e */
    public final /* synthetic */ VoteInfo f112737e;

    /* renamed from: f */
    public final /* synthetic */ GameChatListView.C41771f f112738f;

    public C41826n0(GameChatListView.C41771f fVar, long j, VoteInfo voteInfo) {
        this.f112738f = fVar;
        this.f112736d = j;
        this.f112737e = voteInfo;
    }

    public void run() {
        for (ChatroomMsgPack next : this.f112738f.f112557e) {
            if (next.seq == this.f112736d) {
                if (next.msg_options == null) {
                    next.msg_options = new MsgOptions();
                }
                next.msg_options.vote_info = this.f112737e;
                List<ChatroomMsgPack> list = this.f112738f.f112557e;
                list.set(list.indexOf(next), next);
                return;
            }
        }
    }
}
