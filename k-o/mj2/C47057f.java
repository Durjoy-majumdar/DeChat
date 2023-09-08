package mj2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49333eu1;
import te3.C49472fu1;
import te3.C49923j0;
import te3.C50058k0;

/* renamed from: mj2.f */
public class C47057f extends C117747y implements C1311n {

    /* renamed from: h */
    public static Object f126465h = new Object();

    /* renamed from: d */
    public C47350c f126466d;

    /* renamed from: e */
    public C11385n f126467e;

    /* renamed from: f */
    public C49333eu1 f126468f = null;

    /* renamed from: g */
    public C50058k0 f126469g;

    public C47057f(int i, int i2) {
        mo72210j1(true);
        C49923j0 j0Var = new C49923j0();
        C49333eu1 eu12 = new C49333eu1();
        this.f126468f = eu12;
        try {
            j0Var.f135785d = i;
            j0Var.f135786e = i2;
            eu12.f133122d = j0Var;
        } catch (Exception unused) {
            Log.m105920e("MicroMsg.NetSceneGetAPMStrategy", "parse data error");
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126467e = nVar;
        if (!C86709a0.m107523b().mo121115m()) {
            Log.m105928w("MicroMsg.NetSceneGetAPMStrategy", "get mrs strategy must go after login");
            return -1;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127072g = false;
        bVar.f127066a = this.f126468f;
        bVar.f127067b = new C49472fu1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getapmstrategy";
        bVar.f127069d = 914;
        C47350c a = bVar.mo72403a();
        this.f126466d = a;
        int dispatch = dispatch(gVar, a, this);
        if (dispatch < 0) {
            Log.m105925i("MicroMsg.NetSceneGetAPMStrategy", "mark all failed. do scene %d", Integer.valueOf(dispatch));
            try {
                this.f126469g = null;
                mo72210j1(false);
            } catch (Exception e) {
                Log.m105921e("MicroMsg.NetSceneGetAPMStrategy", "onStrategyResp failed  hash:%d  , ex:%s", Integer.valueOf(hashCode()), Util.stackTraceToString(e));
            }
        }
        return dispatch;
    }

    public int getType() {
        return 914;
    }

    /* renamed from: j1 */
    public void mo72210j1(boolean z) {
        synchronized (f126465h) {
        }
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        try {
            this.f126469g = null;
            if (C86709a0.m107529k().f251779b != null) {
                if (C86709a0.m107529k().f251779b.f256809d != null) {
                    if (i2 != 0) {
                        Log.m105920e("MicroMsg.NetSceneGetAPMStrategy", "get report strategy err, errType:" + i2 + ", errCode:" + i3);
                        this.f126467e.onSceneEnd(i2, i3, str, this);
                        mo72210j1(false);
                        return;
                    }
                    Log.m105918d("MicroMsg.NetSceneGetAPMStrategy", "get report strategy ok");
                    this.f126469g = ((C49472fu1) this.f126466d.f127056b.f127083a).f133687d;
                    this.f126467e.onSceneEnd(i2, i3, str, this);
                    mo72210j1(false);
                    return;
                }
            }
            Log.m105922f("MicroMsg.NetSceneGetAPMStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
            this.f126467e.onSceneEnd(i2, i3, str, this);
        } finally {
            mo72210j1(false);
        }
    }
}
