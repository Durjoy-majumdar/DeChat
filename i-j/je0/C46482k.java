package je0;

import a11.C39478b;
import com.tencent.p014mm.autogen.events.GetChatRoomInfoDetailEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import qe0.C47802c;
import te3.C51500u63;
import te3.C51783w42;
import te3.C51923x42;

/* renamed from: je0.k */
public class C46482k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125226d;

    /* renamed from: e */
    public final C47350c f125227e;

    /* renamed from: f */
    public final String f125228f;

    public C46482k(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51783w42();
        bVar.f127067b = new C51923x42();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getopenimchatroomcontact";
        bVar.f127069d = 407;
        C47350c a = bVar.mo72403a();
        this.f125227e = a;
        this.f125228f = str;
        ((C51783w42) a.f127055a.f127080a).f143854d = str;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "get roomname:%s", str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125226d = nVar;
        return dispatch(gVar, this.f125227e, this);
    }

    public int getType() {
        return 407;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C51500u63 u632;
        Log.m105925i("MicroMsg.Openim.NetSceneGetOpenIMChatRoomContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname:%s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125228f);
        if (i2 == 0 && i3 == 0 && (u632 = ((C51923x42) ((C47350c) uVar).f127056b.f127083a).f144451d) != null) {
            int i4 = u632.f142621e;
            C47802c.m53112b(u632, i4, i4);
            try {
                boolean X = ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69752X(u632.f142620d);
                boolean tk = ((C39478b) C86312j.m106911c(C39478b.class)).mo62081tk(u632.f142620d);
                Log.m105925i("OpenIMChatRoomContactLogic", "updateChatroomContactByGetRoomContact chatroom:%s isExistConversation:%s isNeedUpdateChatRoomInfo:%s", u632.f142620d, Boolean.valueOf(X), Boolean.valueOf(tk));
                if (X && tk) {
                    GetChatRoomInfoDetailEvent getChatRoomInfoDetailEvent = new GetChatRoomInfoDetailEvent();
                    getChatRoomInfoDetailEvent.f78814d.f78815a = u632.f142620d;
                    getChatRoomInfoDetailEvent.publish();
                }
            } catch (Exception e) {
                Log.m105921e("OpenIMChatRoomContactLogic", "updateChatroomContactByGetRoomContact chatroom:%s, exception:%s %s", u632.f142620d, e.getClass().getSimpleName(), e.getMessage());
            }
        }
        C11385n nVar = this.f125226d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
