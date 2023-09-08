package com.tencent.p014mm.plugin.multitalk.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C48650a13;
import te3.C48794b13;
import te3.C51018qv3;

/* renamed from: com.tencent.mm.plugin.multitalk.model.l0 */
public class C42575l0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f115187d;

    /* renamed from: e */
    public final C47350c f115188e;

    /* renamed from: f */
    public int f115189f;

    /* renamed from: g */
    public int f115190g;

    /* renamed from: h */
    public byte[] f115191h;

    public C42575l0(int i, int i2, byte[] bArr) {
        String str;
        this.f115189f = i;
        this.f115190g = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C48650a13();
        bVar.f127067b = new C48794b13();
        switch (i2) {
            case 1918:
                str = "/cgi-bin/qcwxmultitalk-bin/createtalkroom";
                break;
            case 1919:
                str = "/cgi-bin/qcwxmultitalk-bin/entertalkroom";
                break;
            case 1927:
                str = "/cgi-bin/qcwxmultitalk-bin/exittalkroom";
                break;
            case 1928:
                str = "/cgi-bin/qcwxmultitalk-bin/cancelcreatetalkroom";
                break;
            case 1929:
                str = "/cgi-bin/qcwxmultitalk-bin/rejectentertalkroom";
                break;
            case 1931:
                str = "/cgi-bin/qcwxmultitalk-bin/addmembers";
                break;
            case 1932:
                str = "/cgi-bin/qcwxmultitalk-bin/hellotalkroom";
                break;
            case 1933:
                str = "/cgi-bin/qcwxmultitalk-bin/miscinfo";
                break;
            case 1935:
                str = "/cgi-bin/qcwxmultitalk-bin/voiceackreq";
                break;
            case 1937:
                str = "/cgi-bin/qcwxmultitalk-bin/oiceredirectreq";
                break;
            case 1938:
                str = "/cgi-bin/qcwxmultitalk-bin/getgroupinfobatch";
                break;
            case 1939:
                str = "/cgi-bin/qcwxmultitalk-bin/memberwhisper";
                break;
            default:
                str = "";
                break;
        }
        Log.m105925i("MicroMsg.MT.NetSceneMultiTalk", "netSceneMultiTalk cmdid %d cgiName %s", Integer.valueOf(i2), str);
        bVar.f127068c = str;
        bVar.f127069d = this.f115190g;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f115188e = a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        ((C48650a13) a.f127055a.f127080a).f130216d = qv32;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f115187d = nVar;
        return dispatch(gVar, this.f115188e, this);
    }

    public int getType() {
        return this.f115190g;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.MT.NetSceneMultiTalk", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + " " + this.f115190g);
        this.f115191h = C48374j0.m53715d(((C48794b13) ((C47350c) uVar).f127056b.f127083a).f130890d);
        this.f115187d.onSceneEnd(i2, i3, str, this);
    }
}
