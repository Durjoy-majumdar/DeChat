package t71;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.rl4;
import te3.sl4;

/* renamed from: t71.o */
public class C48553o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f129875d = null;

    /* renamed from: e */
    public C47350c f129876e = null;

    /* renamed from: f */
    public int f129877f;

    /* renamed from: g */
    public int f129878g;

    /* renamed from: h */
    public int f129879h;

    public C48553o(int i, int i2) {
        this.f129877f = i;
        this.f129878g = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new rl4();
        bVar.f127067b = new sl4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/rank/updateranksetting";
        bVar.f127069d = 1044;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f129876e = a;
        rl4 rl4 = (rl4) a.f127055a.f127080a;
        rl4.f141024d = this.f129877f;
        rl4.f141025e = this.f129878g;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f129875d = nVar;
        return dispatch(gVar, this.f129876e, this);
    }

    public int getType() {
        return 1044;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneUpdateRankSetting", "hy: scene end. errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f129879h = ((sl4) this.f129876e.f127056b.f127083a).f141597d;
        }
        this.f129875d.onSceneEnd(i2, i3, str, this);
    }
}
