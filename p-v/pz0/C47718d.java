package pz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import jl0.C9464d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51359t82;
import te3.C51508u82;

/* renamed from: pz0.d */
public class C47718d extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f128198d;

    /* renamed from: e */
    public C11385n f128199e;

    /* renamed from: f */
    public String f128200f;

    /* renamed from: g */
    public String f128201g;

    public C47718d(String str, int i, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51359t82();
        bVar.f127067b = new C51508u82();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
        bVar.f127069d = C9464d.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128198d = a;
        C51359t82 t822 = (C51359t82) a.f127055a.f127080a;
        t822.f142032d = str;
        t822.f142033e = i;
        t822.f142034f = str2;
        t822.f142035g = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128199e = nVar;
        return dispatch(gVar, this.f128198d, this);
    }

    public int getType() {
        return C9464d.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", Integer.valueOf(C9464d.CTRL_INDEX), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C51508u82 u822 = (C51508u82) this.f128198d.f127056b.f127083a;
            Log.m105926v("MicroMsg.NetSceneGetShareCardConsumedInfo", "json:" + u822.f142676d);
            this.f128200f = u822.f142676d;
            this.f128201g = u822.f142678f;
        }
        this.f128199e.onSceneEnd(i2, i3, str, this);
    }
}
