package la1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49679ha0;
import te3.C49818ia0;

/* renamed from: la1.f */
public class C46837f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125982d;

    /* renamed from: e */
    public int f125983e;

    /* renamed from: f */
    public int f125984f;

    /* renamed from: g */
    public String f125985g;

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125982d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49679ha0();
        bVar.f127067b = new C49818ia0();
        bVar.f127068c = "/cgi-bin/mmexptappsvr-bin/reportexptdebug";
        bVar.f127069d = 2743;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C49679ha0 ha02 = (C49679ha0) a.f127055a.f127080a;
        ha02.f134523d = this.f125983e;
        ha02.f134524e = (int) Util.nowSecond();
        ha02.f134525f = this.f125984f;
        ha02.f134526g = this.f125985g;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 2743;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneDebugReport", "send expt debug info ongynetend type[%d] errType[%d] errCode[%d] errMsg[%s]", Integer.valueOf(this.f125983e), Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f125982d.onSceneEnd(i2, i3, str, this);
    }
}
