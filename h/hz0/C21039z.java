package hz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C22537yw1;
import te3.C52317zw1;
import te3.xa4;

/* renamed from: hz0.z */
public class C21039z extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f59529d;

    /* renamed from: e */
    public C11385n f59530e;

    /* renamed from: f */
    public String f59531f;

    public C21039z(String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, xa4 xa4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C22537yw1();
        bVar.f127067b = new C52317zw1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcarditeminfo";
        bVar.f127069d = 1057;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f59529d = a;
        C22537yw1 yw12 = (C22537yw1) a.f127055a.f127080a;
        yw12.f64822d = str;
        yw12.f64823e = i;
        yw12.f64824f = str2;
        yw12.f64825g = str3;
        yw12.f64827i = str4;
        yw12.f64826h = str5;
        yw12.f64828j = i2;
        yw12.f64829n = str6;
        yw12.f64830o = xa4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f59530e = nVar;
        return dispatch(gVar, this.f59529d, this);
    }

    public int getType() {
        return 1057;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetCardItemInfo", "onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            this.f59531f = ((C52317zw1) this.f59529d.f127056b.f127083a).f146251d;
        }
        this.f59530e.onSceneEnd(i2, i3, str, this);
    }
}
