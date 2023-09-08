package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ea3.C7608b;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48870bk3;
import te3.C49015ck3;

/* renamed from: com.tencent.mm.plugin.webview.model.j0 */
public class C43719j0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f118169d;

    /* renamed from: e */
    public C11385n f118170e;

    /* renamed from: f */
    public long f118171f = 0;

    public C43719j0(int i, String str, LinkedList<String> linkedList, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48870bk3();
        bVar.f127067b = new C49015ck3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/qrconnect_authorize_confirm";
        bVar.f127069d = 1137;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f118169d = a;
        C48870bk3 bk32 = (C48870bk3) a.f127055a.f127080a;
        bk32.f131176e = i;
        bk32.f131175d = str;
        bk32.f131177f = linkedList;
        bk32.f131178g = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f118171f = System.currentTimeMillis();
        this.f118170e = nVar;
        return dispatch(gVar, this.f118169d, this);
    }

    public int getType() {
        return 1137;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f118170e.onSceneEnd(i2, i3, str, this);
        C7608b.INSTANCE.mo8745b(4, (int) (System.currentTimeMillis() - this.f118171f), i3);
    }
}
