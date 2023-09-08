package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50907q24;
import te3.C51052r24;
import te3.C52007xq3;

/* renamed from: com.tencent.mm.modelsimple.f0 */
public class C40358f0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108455d;

    /* renamed from: e */
    public final C47350c f108456e;

    public C40358f0(int i, C52007xq3 xq32) {
        Log.m105925i("MicroMsg.NetSceneSetMsgRemind", "[NetSceneSetMsgRemind] opType:%s RemindId:%s time:%s Type:%s SubType:%s", Integer.valueOf(i), xq32.f144877d, Integer.valueOf(xq32.f144879f), Integer.valueOf(xq32.f144878e), Integer.valueOf(xq32.f144880g));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50907q24();
        bVar.f127067b = new C51052r24();
        bVar.f127068c = "/cgi-bin/micromsg-bin/setmsgremind";
        bVar.f127069d = 525;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108456e = a;
        C50907q24 q242 = (C50907q24) a.f127055a.f127080a;
        q242.f140104d = i == 0 ? 1 : i;
        q242.f140105e = xq32;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108455d = nVar;
        return dispatch(gVar, this.f108456e, this);
    }

    public int getType() {
        return 525;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (i2 == 0 && i3 == 0) {
            Log.m105925i("MicroMsg.NetSceneSetMsgRemind", "[onGYNetEnd] RemindId:%s", ((C51052r24) this.f108456e.f127056b.f127083a).f140680d);
        } else {
            Log.m105921e("MicroMsg.NetSceneSetMsgRemind", "[onGYNetEnd] errType:%s,errCode:%s,errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        }
        this.f108455d.onSceneEnd(i2, i3, str, this);
    }
}
