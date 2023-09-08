package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87200o;
import qe3.C89625d;
import te3.C118469th;
import te3.C51545uh;

/* renamed from: com.tencent.mm.plugin.scanner.model.w */
public class C115673w extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f347027d;

    /* renamed from: e */
    public C11385n f347028e;

    public C115673w(String str, String str2, int i, String str3, int i2, int i3, int i4, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C118469th();
        bVar.f127067b = new C51545uh();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/bizscanproductreport";
        bVar.f127069d = 1064;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f347027d = a;
        C118469th thVar = (C118469th) a.f127055a.f127080a;
        thVar.f354449d = C89625d.f257837c;
        thVar.f354450e = C89625d.f257836b;
        thVar.f354451f = C89625d.f257839e;
        thVar.f354452g = C87200o.f252873f;
        thVar.f354453h = LocaleUtil.getApplicationLanguage();
        thVar.f354454i = i3;
        thVar.f354455j = str4;
        thVar.f354456n = str;
        thVar.f354457o = str2;
        thVar.f354458p = i;
        thVar.f354459q = str3;
        thVar.f354460r = i2;
        thVar.f354461s = i4;
        Log.m105926v("MircoMsg.NetSceneScanProductReport", "statid:" + str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f347028e = nVar;
        return dispatch(gVar, this.f347027d, this);
    }

    public int getType() {
        return 1064;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MircoMsg.NetSceneScanProductReport", "errType = " + i2 + ", errCode = " + i3);
        this.f347028e.onSceneEnd(i2, i3, str, this);
    }
}
