package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51481u2;
import te3.C51631v2;

/* renamed from: com.tencent.mm.plugin.webview.model.s */
public class C6057s extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f22353d;

    /* renamed from: e */
    public C11385n f22354e;

    public C6057s(String str, String str2, byte[] bArr, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51481u2();
        bVar.f127067b = new C51631v2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_addavatar";
        bVar.f127069d = 2500;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22353d = a;
        C51481u2 u2Var = (C51481u2) a.f127055a.f127080a;
        u2Var.f142560h = str;
        u2Var.f142556d = str2;
        u2Var.f142557e = new C89349b(bArr, 0, bArr.length);
        u2Var.f142559g = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f22354e = nVar;
        return dispatch(gVar, this.f22353d, this);
    }

    public int getType() {
        return 2500;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f22354e.onSceneEnd(i2, i3, str, this);
    }

    public C6057s(String str, String str2, String str3, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51481u2();
        bVar.f127067b = new C51631v2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/oauth_addavatar";
        bVar.f127069d = 2500;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22353d = a;
        C51481u2 u2Var = (C51481u2) a.f127055a.f127080a;
        u2Var.f142560h = str;
        u2Var.f142556d = str2;
        u2Var.f142558f = str3;
        u2Var.f142559g = i;
    }
}
