package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tavkit.component.TAVPlayer;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52035xx3;
import te3.C52182yx3;

/* renamed from: com.tencent.mm.plugin.exdevice.model.e1 */
public class C41124e1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110790d = null;

    /* renamed from: e */
    public C47350c f110791e = null;

    public C41124e1(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52035xx3();
        bVar.f127067b = new C52182yx3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchharddevice";
        bVar.f127069d = TAVPlayer.VIDEO_PLAYER_WIDTH;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110791e = a;
        ((C52035xx3) a.f127055a.f127080a).f145013d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110790d = nVar;
        return dispatch(gVar, this.f110791e, this);
    }

    public int getType() {
        return TAVPlayer.VIDEO_PLAYER_WIDTH;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneSearchHardDevice", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f110790d.onSceneEnd(i2, i3, str, this);
    }
}
