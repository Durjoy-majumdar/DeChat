package xd2;

import android.util.Pair;
import com.tencent.p014mm.autogen.mmdata.rpt.SendPatActionReportStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C75592q0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49637h04;
import te3.C64382g04;
import vd2.C78384d;

/* renamed from: xd2.b */
public class C66246b extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f190300d;

    /* renamed from: e */
    public C11385n f190301e;

    /* renamed from: f */
    public Pair<Long, Long> f190302f;

    /* renamed from: g */
    public SendPatActionReportStruct f190303g;

    public C66246b(Pair<Long, Long> pair, String str, String str2, int i) {
        C64382g04 g042 = new C64382g04();
        g042.f183266d = C75592q0.m90789s();
        g042.f183267e = str;
        g042.f183268f = str2;
        g042.f183269g = ((C78384d) C86312j.m106911c(C78384d.class)).rd0(pair);
        g042.f183270h = i;
        this.f190302f = pair;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = g042;
        bVar.f127068c = "/cgi-bin/micromsg-bin/sendpat";
        bVar.f127069d = 849;
        bVar.f127067b = new C49637h04();
        this.f190300d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f190301e = nVar;
        return dispatch(gVar, this.f190300d, this);
    }

    public int getType() {
        return 849;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneSendPat", "errType %d, errCode %d, errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f190301e.onSceneEnd(i2, i3, str, this);
    }
}
