package com.tencent.p014mm.modelcdntran;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.g74;
import te3.h74;

/* renamed from: com.tencent.mm.modelcdntran.c0 */
public class C40355c0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f108451d;

    /* renamed from: e */
    public C11385n f108452e;

    public C40355c0(int i, int i2, int i3) {
        Log.m105925i("MicroMsg.NetSceneGetCdnDistance", "summersafecdn init Scene ver %d prov %d city %d [%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Util.getStack());
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new g74();
        bVar.f127067b = new h74();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsgetcdndistance";
        bVar.f127069d = 7989;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108451d = a;
        g74 g74 = (g74) a.f127055a.f127080a;
        g74.f133904d = i;
        g74.f133906f = i2;
        g74.f133905e = i3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108452e = nVar;
        if (C86709a0.m107523b().mo121110g() != 0) {
            return dispatch(gVar, this.f108451d, this);
        }
        Log.m105920e("MicroMsg.NetSceneGetCdnDistance", "has not set uin.");
        return -1;
    }

    public int getType() {
        return 7989;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C89349b bVar;
        Log.m105918d("MicroMsg.NetSceneGetCdnDistance", "summersafecdn onGYNetEnd errtype:" + i2 + " errcode:" + i3);
        h74 h74 = (h74) ((C47350c) uVar).f127056b.f127083a;
        boolean z = true;
        if (i2 == 0 && i3 == 0 && (bVar = h74.f134477d) != null) {
            try {
                CdnLogic.setSnsDistanceData(h74.f134478e, h74.f134480g, h74.f134479f, bVar.mo123703f());
            } catch (Exception e) {
                Log.m105929w("MicroMsg.NetSceneGetCdnDistance", "what: %s", e.getLocalizedMessage());
                Log.printErrStackTrace("MicroMsg.NetSceneGetCdnDistance", e, "", new Object[0]);
            }
            this.f108452e.onSceneEnd(i2, i3, str, this);
            return;
        }
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = Integer.valueOf(i3);
        if (h74.f134477d != null) {
            z = false;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105929w("MicroMsg.NetSceneGetCdnDistance", "onGYNetEnd: [%d ,%d]  data is null :%b", objArr);
        this.f108452e.onSceneEnd(i2, i3, str, this);
    }
}
