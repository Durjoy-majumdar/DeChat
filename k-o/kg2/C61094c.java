package kg2;

import c63.C67346c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51580up1;
import te3.C64734tp1;

/* renamed from: kg2.c */
public class C61094c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f173956d;

    /* renamed from: e */
    public C47350c f173957e;

    /* renamed from: f */
    public String f173958f;

    /* renamed from: g */
    public String f173959g;

    public C61094c(String str, String str2, String str3, String str4, String str5) {
        this.f173958f = str2;
        this.f173959g = str3;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64734tp1();
        bVar.f127067b = new C51580up1();
        bVar.f127068c = "/cgi-bin/mmpay-bin/flowdatarechargepreinquery";
        bVar.f127069d = 1555;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f173957e = a;
        C64734tp1 tp12 = (C64734tp1) a.f127055a.f127080a;
        tp12.f185629d = str;
        tp12.f185630e = str2;
        tp12.f185631f = str3;
        tp12.f185632g = str4;
        tp12.f185633h = str5;
        tp12.f185634i = C67346c.m79699b().mo91479c(str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f173956d = nVar;
        return dispatch(gVar, this.f173957e, this);
    }

    public int getType() {
        return 1555;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneFlowDataRechargePreinQuery", "errCode " + i3 + ", errMsg " + str);
        this.f173956d.onSceneEnd(i2, i3, str, this);
    }
}
