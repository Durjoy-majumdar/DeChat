package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47356x;

/* renamed from: com.tencent.mm.modelsimple.t */
public class C40371t extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f108494d;

    /* renamed from: e */
    public final C114799u f108495e = new C47356x();

    public C40371t(int i) {
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108494d = nVar;
        return dispatch(gVar, this.f108495e, this);
    }

    public int getType() {
        return 381;
    }

    public boolean needCheckCallback() {
        return false;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetCert", "dkcert onGYNetEnd [%d,%d]", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f108494d.onSceneEnd(i2, i3, str, this);
    }
}
