package zg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fm0.C86982t0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p823sg.C77710q;
import te3.C50982qm3;
import te3.C51018qv3;
import te3.C64684rm3;
import xg0.C78803b;

/* renamed from: zg0.f */
public class C66802f extends C117747y implements C1311n {

    /* renamed from: d */
    public int f191919d;

    /* renamed from: e */
    public C11385n f191920e;

    /* renamed from: f */
    public C47350c f191921f;

    public C66802f(String str, String str2, C77710q qVar) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50982qm3();
        bVar.f127067b = new C64684rm3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/rcptinfoimport";
        bVar.f127069d = C86982t0.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("a2key is ");
        sb.append(!Util.isNullOrNil(str));
        sb.append(", newa2key is ");
        sb.append(!Util.isNullOrNil(str2));
        Log.m105918d("MicroMsg.NetSceneRcptInfoImportYiXun", sb.toString());
        C47350c a = bVar.mo72403a();
        this.f191921f = a;
        C50982qm3 qm32 = (C50982qm3) a.f127055a.f127080a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.decodeHexString(str));
        qm32.f140396e = qv32;
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(Util.decodeHexString(str2));
        qm32.f140397f = qv33;
        qm32.f140395d = qVar.f226490d;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f191920e = nVar;
        return dispatch(gVar, this.f191921f, this);
    }

    public int getType() {
        return C86982t0.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRcptInfoImportYiXun", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C64684rm3 rm32 = (C64684rm3) ((C47350c) uVar).f127056b.f127083a;
            this.f191919d = rm32.f185206e;
            Log.m105918d("MicroMsg.NetSceneRcptInfoImportYiXun", "status : " + this.f191919d);
            if (rm32.f185205d.f185431e != null && this.f191919d == 0) {
                Log.m105918d("MicroMsg.NetSceneRcptInfoImportYiXun", "resp.rImpl.rcptinfolist.rcptinfolist " + rm32.f185205d.f185431e.size());
                C78803b.vx0();
                C78803b.xx0().mo183785j(rm32.f185205d.f185431e);
                C78803b.vx0();
                C78803b.xx0().mo183784i();
            }
        }
        this.f191920e.onSceneEnd(i2, i3, str, this);
    }
}
