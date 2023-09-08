package je0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51698vi2;
import te3.C51838wi2;
import te3.C51932x63;

/* renamed from: je0.r */
public class C46495r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125262d;

    /* renamed from: e */
    public final C47350c f125263e;

    /* renamed from: f */
    public String f125264f;

    public C46495r(String str, LinkedList<C51932x63> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51698vi2();
        bVar.f127067b = new C51838wi2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/inviteopenimchatroommember";
        bVar.f127069d = 887;
        C47350c a = bVar.mo72403a();
        this.f125263e = a;
        this.f125264f = str;
        C51698vi2 vi22 = (C51698vi2) a.f127055a.f127080a;
        vi22.f143492d = str;
        vi22.f143493e = linkedList;
        Log.m105925i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "roomname: %s, size:%d", str, Integer.valueOf(linkedList.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125262d = nVar;
        return dispatch(gVar, this.f125263e, this);
    }

    public int getType() {
        return 887;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.Openim.NetSceneInviteOpenIMChatRoomMember", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, roomname = %s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.f125264f);
        C11385n nVar = this.f125262d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
