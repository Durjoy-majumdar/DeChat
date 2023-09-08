package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SendChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SendChatroomMsgResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import yw1.C53591c;

/* renamed from: bx1.r */
public class C39865r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106914d;

    /* renamed from: e */
    public final C47350c f106915e;

    public C39865r(C53591c.C53595d dVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new SendChatroomMsgRequest();
        bVar.f127067b = new SendChatroomMsgResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/sendchatroommsg";
        bVar.f127069d = 4993;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106915e = a;
        SendChatroomMsgRequest sendChatroomMsgRequest = (SendChatroomMsgRequest) a.f127055a.f127080a;
        sendChatroomMsgRequest.chatroom_name = dVar.f150615b;
        ChatroomMsgPack chatroomMsgPack = new ChatroomMsgPack();
        chatroomMsgPack.msg_type = dVar.f150616c;
        chatroomMsgPack.from_username = dVar.f150614a;
        if (Util.isNullOrNil(dVar.f150617d)) {
            dVar.f150617d = String.format("gamelife_chatroom_%s%s%s_%s", new Object[]{MD5Util.getMD5String(Util.nullAsNil(dVar.f150614a)), dVar.f150615b, Integer.valueOf(Util.getIntRandom(10, 0)), Long.valueOf(System.currentTimeMillis())});
        }
        Log.m105925i("GameChatRoom.CgiSendChatRoomMsg", "send chat msg, msgType:%d", Integer.valueOf(dVar.f150616c));
        chatroomMsgPack.cli_msg_id = dVar.f150617d;
        chatroomMsgPack.channel_id = dVar.f150618e;
        chatroomMsgPack.send_time = System.currentTimeMillis();
        chatroomMsgPack.msg_content = dVar.f150620g;
        chatroomMsgPack.msg_options = dVar.f150619f;
        sendChatroomMsgRequest.msg_pack = chatroomMsgPack;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106914d = nVar;
        return dispatch(gVar, this.f106915e, this);
    }

    public int getType() {
        return 4993;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiSendChatRoomMsg", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f106914d.onSceneEnd(i2, i3, str, this);
    }
}
