package bx1;

import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomMemberInfoResponse;
import java.util.LinkedList;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import te3.C49335eu3;

/* renamed from: bx1.d */
public class C39849d extends C89132b<GetChatroomMemberInfoResponse> {
    public C39849d(LinkedList<String> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127067b = new GetChatroomMemberInfoResponse();
        GetChatroomMemberInfoRequest getChatroomMemberInfoRequest = new GetChatroomMemberInfoRequest();
        getChatroomMemberInfoRequest.username_list = linkedList;
        bVar.f127066a = getChatroomMemberInfoRequest;
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroommemberinfo";
        bVar.f127069d = 4982;
        mo123453j(bVar.mo72403a());
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
        GetChatroomMemberInfoResponse getChatroomMemberInfoResponse = (GetChatroomMemberInfoResponse) eu32;
    }
}
