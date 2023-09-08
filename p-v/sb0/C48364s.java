package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50763p02;
import te3.C50896q02;

/* renamed from: sb0.s */
public class C48364s extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129479d;

    /* renamed from: e */
    public C47350c f129480e;

    public C48364s(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50763p02();
        bVar.f127067b = new C50896q02();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getfavbizchatlist";
        bVar.f127069d = WXWebReporter.ID1367KeyDef.f57028ID;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129480e = a;
        ((C50763p02) a.f127055a.f127080a).f139482d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129479d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneGetFavBizChatList", "do scene");
        return dispatch(gVar, this.f129480e, this);
    }

    public int getType() {
        return WXWebReporter.ID1367KeyDef.f57028ID;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneGetFavBizChatList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129479d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
