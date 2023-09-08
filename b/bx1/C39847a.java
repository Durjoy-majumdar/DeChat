package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BlockChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.BlockChatroomMsgResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.a */
public class C39847a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106867d;

    /* renamed from: e */
    public final C47350c f106868e;

    public C39847a(String str, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new BlockChatroomMsgRequest();
        bVar.f127067b = new BlockChatroomMsgResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/blockchatroommsg";
        bVar.f127069d = 4516;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106868e = a;
        BlockChatroomMsgRequest blockChatroomMsgRequest = (BlockChatroomMsgRequest) a.f127055a.f127080a;
        blockChatroomMsgRequest.chatroom_name = str;
        blockChatroomMsgRequest.seq = j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106867d = nVar;
        return dispatch(gVar, this.f106868e, this);
    }

    public int getType() {
        return 4516;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiBlockChatRoomMsg", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f106867d.onSceneEnd(i2, i3, str, this);
    }
}
