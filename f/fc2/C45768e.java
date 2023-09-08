package fc2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49497g10;
import te3.C49639h10;
import te3.C51163rv3;
import te3.C64234an2;
import wm0.C91036c;

/* renamed from: fc2.e */
public class C45768e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f123654d;

    /* renamed from: e */
    public C11385n f123655e;

    /* renamed from: f */
    public String f123656f;

    public C45768e(String str, String str2, String str3, C64234an2 an22, int i, LinkedList<C51163rv3> linkedList, String str4, String str5) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49497g10();
        bVar.f127067b = new C49639h10();
        bVar.f127068c = "/cgi-bin/micromsg-bin/createpoi";
        bVar.f127069d = C91036c.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f123654d = bVar.mo72403a();
        String nullAs = Util.nullAs(str4, "");
        String nullAs2 = Util.nullAs(str5, "");
        C49497g10 g102 = (C49497g10) this.f123654d.f127055a.f127080a;
        g102.f133772d = str;
        g102.f133773e = str2;
        g102.f133775g = an22;
        g102.f133776h = i;
        if (linkedList != null) {
            g102.f133777i = linkedList;
        }
        g102.f133778j = nullAs;
        g102.f133779n = nullAs2;
        g102.f133774f = str3;
        Log.m105919d("MicroMsg.NetSceneCreatePoi", "[req] name:%s, district:%s, Street: %s lat:%f, long:%f, count:%d, tel:%s, url:%s", str, str2, str3, Float.valueOf(an22.f182095e), Float.valueOf(an22.f182094d), Integer.valueOf(i), nullAs, nullAs2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123655e = nVar;
        return dispatch(gVar, this.f123654d, this);
    }

    public int getType() {
        return C91036c.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneCreatePoi", "netId:%d, errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        C47350c.C47354d dVar = this.f123654d.f127056b;
        C49639h10 h102 = (C49639h10) dVar.f127083a;
        if (dVar.getRetCode() != 0) {
            this.f123655e.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f123656f = h102.f134403d;
        Log.m105918d("MicroMsg.NetSceneCreatePoi", "poi:" + this.f123656f);
        this.f123655e.onSceneEnd(i2, i3, str, this);
    }
}
