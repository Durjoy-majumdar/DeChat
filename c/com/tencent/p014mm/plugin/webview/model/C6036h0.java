package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50305ls2;
import te3.C50444ms2;

/* renamed from: com.tencent.mm.plugin.webview.model.h0 */
public class C6036h0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f22309d;

    /* renamed from: e */
    public final C47350c f22310e;

    /* renamed from: f */
    public String f22311f;

    /* renamed from: g */
    public String f22312g;

    /* renamed from: h */
    public String f22313h;

    /* renamed from: i */
    public String f22314i;

    /* renamed from: j */
    public int f22315j;

    public C6036h0(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50305ls2();
        bVar.f127067b = new C50444ms2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_getuseropenid";
        bVar.f127069d = 1177;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22310e = a;
        C50305ls2 ls22 = (C50305ls2) a.f127055a.f127080a;
        ls22.f137629d = str;
        ls22.f137630e = str2;
        ls22.f137631f = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f22309d = nVar;
        return dispatch(gVar, this.f22310e, this);
    }

    public int getType() {
        return 1177;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneMMBizGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C50444ms2 ms22 = (C50444ms2) this.f22310e.f127056b.f127083a;
            String str2 = ms22.f138177d;
            this.f22311f = str2;
            String str3 = ms22.f138180g;
            this.f22312g = str3;
            String str4 = ms22.f138179f;
            this.f22313h = str4;
            String str5 = ms22.f138178e;
            this.f22314i = str5;
            int i4 = ms22.f138181h;
            this.f22315j = i4;
            Log.m105919d("MicroMsg.NetSceneMMBizGetUserOpenId", "openid:%s, sign:%s, head_img_url:%s, nick_name:%s, friend_relation:%d", str2, str3, str4, str5, Integer.valueOf(i4));
        }
        this.f22309d.onSceneEnd(i2, i3, str, this);
    }
}
