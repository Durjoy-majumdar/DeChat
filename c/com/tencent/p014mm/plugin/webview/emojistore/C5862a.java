package com.tencent.p014mm.plugin.webview.emojistore;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C51018qv3;
import te3.C51027qx3;
import te3.C51172rx3;

/* renamed from: com.tencent.mm.plugin.webview.emojistore.a */
public class C5862a extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f22054d;

    /* renamed from: e */
    public C11385n f22055e;

    /* renamed from: f */
    public int f22056f;

    /* renamed from: g */
    public String f22057g;

    /* renamed from: h */
    public byte[] f22058h = null;

    /* renamed from: i */
    public int f22059i = -1;

    /* renamed from: j */
    public boolean f22060j = true;

    /* renamed from: n */
    public long f22061n = 0;

    public C5862a(int i, String str, byte[] bArr, int i2, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51027qx3();
        bVar.f127067b = new C51172rx3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsearchemotion";
        bVar.f127069d = 234;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f22054d = bVar.mo72403a();
        this.f22056f = i;
        this.f22057g = str;
        this.f22058h = bArr;
        this.f22059i = i2;
        this.f22061n = j;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f22055e = nVar;
        C51027qx3 qx32 = (C51027qx3) this.f22054d.f127055a.f127080a;
        if (!Util.isNullOrNil(this.f22058h)) {
            qx32.f140600f = C48374j0.m53712a(this.f22058h);
            this.f22060j = false;
            qx32.f140601g = this.f22061n;
        } else {
            qx32.f140600f = new C51018qv3();
            this.f22060j = true;
        }
        C51018qv3 qv32 = qx32.f140600f;
        Log.m105918d("MicroMsg.emoji.NetSceneSearchEmotion", qv32 == null ? "Buf is NULL" : qv32.toString());
        qx32.f140598d = this.f22056f;
        qx32.f140599e = this.f22057g;
        return dispatch(gVar, this.f22054d, this);
    }

    public int getType() {
        return 234;
    }

    /* renamed from: j1 */
    public C51172rx3 mo6908j1() {
        C47350c cVar = this.f22054d;
        if (cVar == null) {
            return null;
        }
        return (C51172rx3) cVar.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.emoji.NetSceneSearchEmotion", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f22055e.onSceneEnd(i2, i3, str, this);
    }
}
