package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49395f90;
import te3.C49532g90;

/* renamed from: com.tencent.mm.modelsimple.r */
public class C40367r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108480d;

    /* renamed from: e */
    public final C47350c f108481e;

    public C40367r(String str, int i, String str2, byte[] bArr, int i2) {
        Log.m105925i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s, %d", str, Integer.valueOf(i), str2, Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49395f90();
        bVar.f127067b = new C49532g90();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/entertempsession";
        bVar.f127069d = 1066;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108481e = a;
        if (str2 == null) {
            str2 = "";
        } else if (str2.length() > 32 && i != 19) {
            str2 = str2.substring(0, 32);
        }
        C49395f90 f902 = (C49395f90) a.f127055a.f127080a;
        f902.f133354d = str;
        f902.f133355e = i;
        f902.f133356f = C89349b.m111675b(str2);
        if (bArr == null) {
            f902.f133357g = C89349b.m111674a(new byte[0]);
        } else {
            f902.f133357g = C89349b.m111674a(bArr);
        }
        f902.f133358h = i2;
        Log.m105925i("MicroMsg.NetSceneEnterTempSession", "NetSceneEnterTempSession %s, %s, %s", str, Integer.valueOf(i), Integer.valueOf(f902.f133357g.f257327a.length));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108480d = nVar;
        return dispatch(gVar, this.f108481e, this);
    }

    public int getType() {
        return 1066;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneEnterTempSession", "onGYNetEnd: %d, %d, %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f108480d.onSceneEnd(i2, i3, str, this);
    }
}
