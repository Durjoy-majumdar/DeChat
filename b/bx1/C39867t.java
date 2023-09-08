package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse;
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

/* renamed from: bx1.t */
public final class C39867t extends C117747y implements C1311n {

    /* renamed from: d */
    public final String f106918d;

    /* renamed from: e */
    public final String f106919e;

    /* renamed from: f */
    public C11385n f106920f;

    /* renamed from: g */
    public final C13601g f106921g = C36568h.m40986b(C13602i.NONE, new C39868a(this));

    /* renamed from: bx1.t$a */
    public static final class C39868a extends C87413o implements C32224a<C47350c> {

        /* renamed from: d */
        public final /* synthetic */ C39867t f106922d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39868a(C39867t tVar) {
            super(0);
            this.f106922d = tVar;
        }

        public Object invoke() {
            C47350c.C47352b bVar = new C47350c.C47352b();
            C39867t tVar = this.f106922d;
            bVar.f127066a = new SyncChatroomMemberRequest();
            bVar.f127067b = new SyncChatroomMemberResponse();
            bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/syncchatroommember";
            tVar.getClass();
            bVar.f127069d = 4713;
            C47350c a = bVar.mo72403a();
            C47465a aVar = a.f127055a.f127080a;
            if (aVar instanceof SyncChatroomMemberRequest) {
                SyncChatroomMemberRequest syncChatroomMemberRequest = (SyncChatroomMemberRequest) aVar;
                C39867t tVar2 = this.f106922d;
                syncChatroomMemberRequest.chatroom_name = tVar2.f106918d;
                syncChatroomMemberRequest.last_version = tVar2.f106919e;
            }
            return a;
        }
    }

    public C39867t(String str, String str2) {
        C87412m.m108594g(str, "chatroomName");
        this.f106918d = str;
        this.f106919e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106920f = nVar;
        Object value = this.f106921g.getValue();
        C87412m.m108593f(value, "<get-commReqResp>(...)");
        return dispatch(gVar, (C47350c) value, this);
    }

    public int getType() {
        return 4713;
    }

    /* renamed from: j1 */
    public final SyncChatroomMemberRequest mo62495j1() {
        Object value = this.f106921g.getValue();
        C87412m.m108593f(value, "<get-commReqResp>(...)");
        C47465a aVar = ((C47350c) value).f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberRequest");
        return (SyncChatroomMemberRequest) aVar;
    }

    /* renamed from: k1 */
    public final SyncChatroomMemberResponse mo62496k1() {
        Object value = this.f106921g.getValue();
        C87412m.m108593f(value, "<get-commReqResp>(...)");
        C47465a aVar = ((C47350c) value).f127056b.f127083a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.SyncChatroomMemberResponse");
        return (SyncChatroomMemberResponse) aVar;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiSyncChatroomMember", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f106920f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
