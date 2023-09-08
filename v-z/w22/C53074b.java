package w22;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;
import te3.C51706vk2;
import te3.C51844wk2;

/* renamed from: w22.b */
public class C53074b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f148135d;

    /* renamed from: e */
    public final C47350c f148136e;

    /* renamed from: f */
    public String f148137f = "";

    /* renamed from: g */
    public String f148138g;

    public C53074b(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51706vk2();
        bVar.f127067b = new C51844wk2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/jointrackroom";
        bVar.f127069d = 490;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f148136e = a;
        ((C51706vk2) a.f127055a.f127080a).f143542d = str;
        Log.m105918d("MicroMsg.NetSceneJoinTrackRoom", "chatNameId:" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148135d = nVar;
        return dispatch(gVar, this.f148136e, this);
    }

    public int getType() {
        return 490;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C47465a aVar = ((C47350c) uVar).f127056b.f127083a;
        C51844wk2 wk22 = aVar != null ? (C51844wk2) aVar : null;
        Log.m105919d("MicroMsg.NetSceneJoinTrackRoom", "onGYNetEnd errType %d errCode%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if ((i3 == 0 || i3 >= 1000) && wk22 != null) {
            String str2 = wk22.f144114d;
            this.f148137f = str2;
            Log.m105919d("MicroMsg.NetSceneJoinTrackRoom", "get trackRoomid %s", str2);
        }
        if (wk22 != null) {
            this.f148138g = wk22.f144115e;
        }
        C11385n nVar = this.f148135d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
