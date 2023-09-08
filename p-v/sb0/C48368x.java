package sb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48702af;
import te3.fl4;
import te3.gl4;

/* renamed from: sb0.x */
public class C48368x extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129488d;

    /* renamed from: e */
    public C47350c f129489e;

    /* renamed from: f */
    public Object f129490f;

    public C48368x(String str, String str2, C48702af afVar, C48702af afVar2, Object obj) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fl4();
        bVar.f127067b = new gl4();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/updatebizchatmemberlist";
        bVar.f127069d = 1357;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129489e = a;
        fl4 fl4 = (fl4) a.f127055a.f127080a;
        fl4.f133581d = str;
        fl4.f133582e = str2;
        fl4.f133583f = afVar;
        fl4.f133584g = afVar2;
        this.f129490f = obj;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129488d = nVar;
        Log.m105924i("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "do scene");
        return dispatch(gVar, this.f129489e, this);
    }

    public int getType() {
        return 1357;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f129488d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
