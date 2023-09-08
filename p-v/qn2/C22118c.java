package qn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import nn2.C76942m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C22512m34;
import te3.C50212l34;

/* renamed from: qn2.c */
public class C22118c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f62534d;

    /* renamed from: e */
    public final C47350c f62535e;

    /* renamed from: f */
    public C22120e f62536f;

    public C22118c(float f, float f2, int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50212l34();
        bVar.f127067b = new C22512m34();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/card/shakecard";
        bVar.f127069d = 1250;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f62535e = a;
        C50212l34 l342 = (C50212l34) a.f127055a.f127080a;
        l342.f137155e = f2;
        l342.f137154d = f;
        l342.f137156f = i;
        l342.f137157g = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f62534d = nVar;
        return dispatch(gVar, this.f62535e, this);
    }

    public int getType() {
        return 1250;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneShakeCard", "onGYNetEnd, getType = " + 1250 + " errType = " + i2 + " errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            C22512m34 m342 = (C22512m34) this.f62535e.f127056b.f127083a;
            if (m342 != null) {
                C22120e eVar = new C22120e();
                this.f62536f = eVar;
                eVar.f62543a = m342.f64202d;
                eVar.f62544b = m342.f64203e;
                eVar.f62545c = m342.f64204f;
                eVar.f62546d = m342.f64205g;
                eVar.f62547e = m342.f64208j;
                eVar.f62548f = m342.f64209n;
                eVar.f62549g = m342.f64210o;
                eVar.f62550h = m342.f64211p;
                eVar.f62551i = m342.f64212q;
                eVar.f62552j = m342.f64213r;
                eVar.f62553k = m342.f64214s;
                eVar.f62554l = m342.f64215t;
                eVar.f62555m = m342.f64216u;
                eVar.f62556n = m342.f64217v;
                eVar.f62557o = m342.f64218w;
                eVar.f62558p = m342.f64219x;
                C76942m.xx0().f62542f = this.f62536f.f62555m;
            } else {
                C22120e eVar2 = new C22120e();
                this.f62536f = eVar2;
                eVar2.f62543a = 3;
                eVar2.f62555m = C76942m.xx0().f62542f;
            }
        } else {
            C22120e eVar3 = new C22120e();
            this.f62536f = eVar3;
            eVar3.f62543a = 3;
            eVar3.f62555m = C76942m.xx0().f62542f;
        }
        this.f62534d.onSceneEnd(i2, i3, str, this);
    }
}
