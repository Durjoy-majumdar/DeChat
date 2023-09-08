package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomMsgResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.e */
public class C39850e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106871d;

    /* renamed from: e */
    public final C47350c f106872e;

    /* renamed from: f */
    public int f106873f;

    /* renamed from: g */
    public long f106874g;

    public C39850e(String str, long j, long j2, int i, long j3, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new GetChatroomMsgRequest();
        bVar.f127067b = new GetChatroomMsgResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroommsg";
        bVar.f127069d = 4562;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106872e = a;
        GetChatroomMsgRequest getChatroomMsgRequest = (GetChatroomMsgRequest) a.f127055a.f127080a;
        getChatroomMsgRequest.chatroom_name = str;
        if (j > 0) {
            getChatroomMsgRequest.seq_gt = j;
        } else if (j2 > 0) {
            getChatroomMsgRequest.seq_lt = j2;
        }
        getChatroomMsgRequest.channel_id = i2;
        this.f106873f = i;
        this.f106874g = j3;
        Log.m105925i("GameChatRoom.CgiGetChatRoomMsg", "gtSeq:%d, ltSeq:%d, channelId:%d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106871d = nVar;
        return dispatch(gVar, this.f106872e, this);
    }

    public int getType() {
        return 4562;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiGetChatRoomMsg", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f106871d.onSceneEnd(i2, i3, str, this);
    }
}
