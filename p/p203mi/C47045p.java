package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48767av1;
import te3.C48911bv1;

/* renamed from: mi.p */
public class C47045p extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126420d;

    /* renamed from: e */
    public final C47350c f126421e;

    /* renamed from: f */
    public C48911bv1 f126422f;

    public C47045p(String str) {
        Log.m105925i("MicroMsg.NetSceneGetAssociateChatRoomManageInfo", "NetSceneGetAssociateChatRoomManageInfo roomname:%s", Util.nullAs(str, ""));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getassociatechatroommanageinfo";
        bVar.f127069d = 3553;
        bVar.f127066a = new C48767av1();
        bVar.f127067b = new C48911bv1();
        C47350c a = bVar.mo72403a();
        this.f126421e = a;
        C48767av1 av12 = (C48767av1) a.f127055a.f127080a;
        av12.f130778d = Util.nullAs(str, "");
        av12.f130780f = 0;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126420d = nVar;
        C47350c cVar = this.f126421e;
        this.f126422f = (C48911bv1) cVar.f127056b.f127083a;
        return dispatch(gVar, cVar, this);
    }

    public int getType() {
        return 3553;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetAssociateChatRoomManageInfo", "onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f126420d.onSceneEnd(i2, i3, str, this);
    }

    public C47045p(String str, boolean z) {
        Log.m105925i("MicroMsg.NetSceneGetAssociateChatRoomManageInfo", "NetSceneGetAssociateChatRoomManageInfo ticket:%s", Util.nullAs(str, ""));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getassociatechatroommanageinfo";
        bVar.f127069d = 3553;
        bVar.f127066a = new C48767av1();
        bVar.f127067b = new C48911bv1();
        C47350c a = bVar.mo72403a();
        this.f126421e = a;
        C48767av1 av12 = (C48767av1) a.f127055a.f127080a;
        av12.f130779e = Util.nullAs(str, "");
        av12.f130780f = 1;
    }
}
