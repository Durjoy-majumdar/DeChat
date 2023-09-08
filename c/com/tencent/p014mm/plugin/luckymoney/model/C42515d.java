package com.tencent.p014mm.plugin.luckymoney.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import te3.C51355t72;
import te3.C51504u72;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.d */
public class C42515d extends C89132b<C51504u72> {
    public C42515d(String str, String str2, int i, int i2, int i3, String str3) {
        Log.m105925i("MicroMsg.CgiGetRedpacketFission", "packetId: %s senderUsername：%s msgCreateTime:%s,packetSource：%s sceneType:%s", str, str2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        C51355t72 t722 = new C51355t72();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = t722;
        bVar.f127067b = new C51504u72();
        bVar.f127069d = 6957;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getredpacketfission";
        t722.f142019d = str;
        t722.f142020e = str2;
        t722.f142021f = i;
        t722.f142022g = i2;
        t722.f142023h = i3;
        if (!Util.isNullOrNil(str3)) {
            t722.f142024i = C89349b.m111674a(str3.getBytes());
        }
        mo123453j(bVar.mo72403a());
    }
}
