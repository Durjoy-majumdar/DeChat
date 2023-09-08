package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51825wf;
import te3.C51964xf;

/* renamed from: com.tencent.mm.plugin.scanner.model.r */
public class C42908r extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f116180d;

    /* renamed from: e */
    public C47350c f116181e;

    public C42908r(String str, LinkedList<String> linkedList, int i, String str2, double d, double d2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51825wf();
        bVar.f127067b = new C51964xf();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetactioninfo";
        bVar.f127069d = WXWebReporter.WXWEB_IDKEY_FR_POWERPOINT_ID;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116181e = a;
        C51825wf wfVar = (C51825wf) a.f127055a.f127080a;
        wfVar.f144005d = str;
        wfVar.f144007f = i;
        wfVar.f144008g = str2;
        wfVar.f144006e = linkedList;
        wfVar.f144010i = d2;
        wfVar.f144009h = d;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116180d = nVar;
        return dispatch(gVar, this.f116181e, this);
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_FR_POWERPOINT_ID;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetActionInfo", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        this.f116180d.onSceneEnd(i2, i3, str, this);
    }
}
