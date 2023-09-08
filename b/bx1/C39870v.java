package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.VoteMsgResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;

/* renamed from: bx1.v */
public final class C39870v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106925d;

    /* renamed from: e */
    public C47350c f106926e;

    /* renamed from: f */
    public Long f106927f;

    /* renamed from: g */
    public String f106928g;

    /* renamed from: h */
    public Integer f106929h;

    public C39870v(String str, long j, boolean z, String str2, int i) {
        C87412m.m108594g(str, "chatRoomName");
        C87412m.m108594g(str2, "userName");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new VoteMsgRequest();
        bVar.f127067b = new VoteMsgResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/votemsg";
        bVar.f127069d = 4569;
        boolean z2 = false;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106926e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.VoteMsgRequest");
        VoteMsgRequest voteMsgRequest = (VoteMsgRequest) aVar;
        voteMsgRequest.chatroom_name = str;
        voteMsgRequest.seq = j;
        voteMsgRequest.is_vote = z;
        Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_GAME_CHAT_ROOM_VOTE_EDUCATION_INT, 0);
        C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.Int");
        voteMsgRequest.need_education = Util.nullAsNil((Integer) f) == 0 ? true : z2;
        Log.m105924i("GameChatRoom.CgiVoteMsg", "seq:" + j + ", isVote:" + z);
        this.f106927f = Long.valueOf(j);
        this.f106928g = str2;
        this.f106929h = Integer.valueOf(i);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106925d = nVar;
        return dispatch(gVar, this.f106926e, this);
    }

    public int getType() {
        return 4569;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiVoteMsg", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f106925d;
        C87412m.m108591d(nVar);
        nVar.onSceneEnd(i2, i3, str, this);
    }
}
