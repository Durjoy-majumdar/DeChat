package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.PublishChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.PublishChatroomMsgResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

/* renamed from: bx1.p */
public final class C39862p extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f106906d;

    /* renamed from: e */
    public final long f106907e;

    /* renamed from: f */
    public C11385n f106908f;

    /* renamed from: g */
    public final C13601g f106909g = C36568h.m40986b(C13602i.NONE, new C39863a(this));

    /* renamed from: bx1.p$a */
    public static final class C39863a extends C87413o implements C32224a<C47350c> {

        /* renamed from: d */
        public final /* synthetic */ C39862p f106910d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39863a(C39862p pVar) {
            super(0);
            this.f106910d = pVar;
        }

        public Object invoke() {
            C47350c.C47352b bVar = new C47350c.C47352b();
            C39862p pVar = this.f106910d;
            bVar.f127066a = new PublishChatroomMsgRequest();
            bVar.f127067b = new PublishChatroomMsgResponse();
            bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/publishchatroommsg";
            pVar.getClass();
            bVar.f127069d = 4565;
            C47350c a = bVar.mo72403a();
            C47465a aVar = a.f127055a.f127080a;
            if (aVar instanceof PublishChatroomMsgRequest) {
                PublishChatroomMsgRequest publishChatroomMsgRequest = (PublishChatroomMsgRequest) aVar;
                C39862p pVar2 = this.f106910d;
                publishChatroomMsgRequest.chatroom_name = pVar2.f106906d;
                publishChatroomMsgRequest.seq = pVar2.f106907e;
            }
            return a;
        }
    }

    public C39862p(String str, long j) {
        C87412m.m108594g(str, "chatroomName");
        this.f106906d = str;
        this.f106907e = j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106908f = nVar;
        Object value = this.f106909g.getValue();
        C87412m.m108593f(value, "<get-commReqResp>(...)");
        return dispatch(gVar, (C47350c) value, this);
    }

    public int getType() {
        return 4565;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiPublishChatroomMsg", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f106908f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
