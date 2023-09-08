package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48818b72;
import te3.C48966c72;

/* renamed from: com.tencent.mm.plugin.webview.model.a0 */
public class C43695a0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f118074d;

    /* renamed from: e */
    public C11385n f118075e;

    /* renamed from: f */
    public Object f118076f;

    public C43695a0(String str, String str2, int i, int i2) {
        Log.m105919d("MicroMsg.NetSceneGetReadingModeInfoProxy", "NetSceneSetOAuthScope doScene url[%s], userAgent[%s], width[%d], height[%d]", str, str2, Integer.valueOf(i), Integer.valueOf(i2));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48818b72();
        bVar.f127067b = new C48966c72();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getreadingmodeinfo";
        bVar.f127069d = 673;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f118074d = a;
        C48818b72 b722 = (C48818b72) a.f127055a.f127080a;
        b722.f130991d = str;
        b722.f130992e = str2;
        b722.f130993f = i;
        b722.f130994g = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneGetReadingModeInfoProxy", "doScene");
        this.f118075e = nVar;
        return dispatch(gVar, this.f118074d, this);
    }

    public int getType() {
        return 673;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + i2 + ", errCode = " + i3);
        this.f118075e.onSceneEnd(i2, i3, str, this);
        if (i2 != 0 || i3 != 0) {
            Log.m105920e("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + i2 + ", errCode = " + i3);
        }
    }
}
