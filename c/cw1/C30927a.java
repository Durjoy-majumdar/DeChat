package cw1;

import bw1.C28430a;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dw1.C31320g;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48649a12;
import te3.C52195z02;

/* renamed from: cw1.a */
public class C30927a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f83011d;

    /* renamed from: e */
    public C52195z02 f83012e;

    /* renamed from: f */
    public C48649a12 f83013f;

    /* renamed from: g */
    public C31320g f83014g = null;

    /* renamed from: h */
    public C11385n f83015h = null;

    /* renamed from: i */
    public C28430a f83016i;

    /* renamed from: j */
    public String f83017j = null;

    public C30927a(C28430a aVar, C31320g gVar) {
        if (aVar != null) {
            this.f83014g = gVar;
            this.f83016i = aVar;
            int i = 0;
            Log.m105925i("MicroMsg.NetSceneGetFuncMsg", "new NetSceneGetFuncMsg, cgi: %s, cmdId: %s, functionMsgId: %s", aVar.mo55975P5(), Integer.valueOf(aVar.mo55972M5()), aVar.mo55977S5());
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C52195z02();
            bVar.f127067b = new C48649a12();
            bVar.f127069d = 825;
            bVar.f127068c = aVar.mo55975P5();
            bVar.f127070e = aVar.mo55972M5();
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f83011d = a;
            C52195z02 z022 = (C52195z02) a.f127055a.f127080a;
            this.f83012e = z022;
            z022.f145617d = aVar.mo55977S5();
            if (aVar.mo55974O5() != null) {
                this.f83012e.f145618e = aVar.mo55974O5();
            }
            this.f83012e.f145620g = aVar.mo55976Q5();
            Object[] objArr = new Object[3];
            C52195z02 z023 = this.f83012e;
            objArr[0] = z023.f145617d;
            objArr[1] = Long.valueOf(z023.f145620g.f139226d);
            C89349b bVar2 = this.f83012e.f145620g.f139227e;
            objArr[2] = Integer.valueOf(bVar2 != null ? bVar2.f257327a.length : i);
            Log.m105925i("MicroMsg.NetSceneGetFuncMsg", "NetSceneGetFuncMsg request FunctionMsgID[%s] BusinessId[%d, %d]", objArr);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        C28430a aVar = this.f83016i;
        if (aVar != null) {
            Log.m105925i("MicroMsg.NetSceneGetFuncMsg", "doScene, functionMsgId: %s", aVar.mo55977S5());
            this.f83016i.mo55978d(1);
        }
        this.f83015h = nVar;
        return dispatch(gVar, this.f83011d, this);
    }

    public int getType() {
        return 825;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C48649a12 a122 = (C48649a12) ((C47350c) uVar).f127056b.f127083a;
        this.f83013f = a122;
        this.f83017j = a122.f130212g;
        Log.m105925i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s, opCode: %s, responseCustomBuff==null: %s, response.version: %s, functionMsgId: %s", Integer.valueOf(i2), Integer.valueOf(i3), str, Integer.valueOf(this.f83013f.f130209d), Boolean.valueOf(Util.isNullOrNil(this.f83017j)), Long.valueOf(this.f83013f.f130210e), this.f83016i.mo55977S5());
        if (!Util.isNullOrNil(this.f83017j)) {
            C52195z02 z022 = (C52195z02) this.f83011d.f127055a.f127080a;
            this.f83012e = z022;
            z022.f145618e = this.f83017j;
        }
        if (i2 == 0 || i3 == 0) {
            if (this.f83016i.getReportId() != 0) {
                C117407d.INSTANCE.idkeyStat((long) this.f83016i.getReportId(), (long) this.f83016i.mo55973N5(), 1, false);
            } else {
                Log.m105928w("MicroMsg.NetSceneGetFuncMsg", "fetchItem.getReportId() is 0!");
            }
            this.f83015h.onSceneEnd(i2, i3, str, this);
            C31320g gVar = this.f83014g;
            if (gVar != null) {
                gVar.mo58072a(i2, i3, str, this);
            }
        } else if (i2 == 4) {
            Log.m105924i("MicroMsg.NetSceneGetFuncMsg", "server error");
            this.f83015h.onSceneEnd(i2, i3, str, this);
            C31320g gVar2 = this.f83014g;
            if (gVar2 != null) {
                gVar2.mo58072a(i2, i3, str, this);
            }
        } else {
            Log.m105924i("MicroMsg.NetSceneGetFuncMsg", "onGYNetEnd, local error");
            this.f83015h.onSceneEnd(i2, i3, str, this);
            C31320g gVar3 = this.f83014g;
            if (gVar3 != null) {
                gVar3.mo58072a(i2, i3, str, this);
            }
        }
        this.f83014g = null;
    }
}
