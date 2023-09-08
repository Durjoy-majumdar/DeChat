package tx2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C47350c;
import te3.bf4;
import te3.cf4;

/* renamed from: tx2.d */
public class C52385d extends C52387f {

    /* renamed from: d */
    public C11385n f146433d;

    /* renamed from: e */
    public final C47350c f146434e;

    /* renamed from: f */
    public final String f146435f;

    /* renamed from: g */
    public int f146436g;

    /* renamed from: h */
    public int f146437h;

    /* renamed from: i */
    public int f146438i;

    public C52385d(int i, long j, int i2, String str, int i3) {
        this.f146438i = i3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new bf4();
        bVar.f127067b = new cf4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/talkmicaction";
        bVar.f127069d = 334;
        bVar.f127070e = 146;
        bVar.f127071f = 1000000146;
        C47350c a = bVar.mo72403a();
        this.f146434e = a;
        bf4 bf4 = (bf4) a.f127055a.f127080a;
        bf4.f131086d = i;
        bf4.f131087e = j;
        bf4.f131088f = i2;
        bf4.f131089g = (int) Util.nowSecond();
        this.f146436g = i2;
        this.f146435f = str;
        bf4.f131090h = i3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneTalkMicAction", "doScene");
        this.f146433d = nVar;
        return dispatch(gVar, this.f146434e, this);
    }

    public int getType() {
        return 334;
    }

    /* renamed from: j1 */
    public String mo73384j1() {
        return this.f146435f;
    }

    /* renamed from: k1 */
    public int mo73385k1() {
        return this.f146438i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneTalkMicAction", "onGYNetEnd errType:" + i2 + " errCode:" + i3);
        if (i2 == 0 && i3 == 0) {
            this.f146437h = ((cf4) this.f146434e.f127056b.f127083a).f131704d;
            this.f146433d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f146433d.onSceneEnd(i2, i3, str, this);
    }
}
