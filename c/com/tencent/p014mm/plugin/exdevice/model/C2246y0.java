package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.exdevice.model.y0 */
public class C2246y0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f12315d;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f12315d = nVar;
        return dispatch(gVar, (C114799u) null, this);
    }

    public int getType() {
        return 1719;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneGetHardDeviceHelpUrl", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f12315d.onSceneEnd(i2, i3, str, this);
    }
}
