package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetUserAtMemberListRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetUserAtMemberListResponse;
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

/* renamed from: bx1.l */
public final class C39859l extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f106897d;

    /* renamed from: e */
    public C11385n f106898e;

    /* renamed from: f */
    public final C13601g f106899f = C36568h.m40986b(C13602i.NONE, new C39860a(this));

    /* renamed from: bx1.l$a */
    public static final class C39860a extends C87413o implements C32224a<C47350c> {

        /* renamed from: d */
        public final /* synthetic */ C39859l f106900d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39860a(C39859l lVar) {
            super(0);
            this.f106900d = lVar;
        }

        public Object invoke() {
            C47350c.C47352b bVar = new C47350c.C47352b();
            C39859l lVar = this.f106900d;
            bVar.f127066a = new GetUserAtMemberListRequest();
            bVar.f127067b = new GetUserAtMemberListResponse();
            bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getuseratmemberlist";
            lVar.getClass();
            bVar.f127069d = 5069;
            C47350c a = bVar.mo72403a();
            C47465a aVar = a.f127055a.f127080a;
            if (aVar instanceof GetUserAtMemberListRequest) {
                ((GetUserAtMemberListRequest) aVar).chatroom_name = this.f106900d.f106897d;
            }
            return a;
        }
    }

    public C39859l(String str) {
        C87412m.m108594g(str, "chatroomName");
        this.f106897d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106898e = nVar;
        return dispatch(gVar, getCommReqResp(), this);
    }

    public final C47350c getCommReqResp() {
        Object value = this.f106899f.getValue();
        C87412m.m108593f(value, "<get-commReqResp>(...)");
        return (C47350c) value;
    }

    public int getType() {
        return 5069;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiGetUserAtMemberList", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f106898e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
