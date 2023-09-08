package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.ipcall.model.C105385g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import m12.C109470c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C48724aj3;
import te3.C52269zi3;
import z33.C112597j;

/* renamed from: p12.l */
public class C110104l extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f329412d = null;

    /* renamed from: e */
    public C52269zi3 f329413e = null;

    /* renamed from: f */
    public C11385n f329414f;

    public C110104l(int i, long j, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52269zi3();
        bVar.f127067b = new C48724aj3();
        bVar.f127069d = WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC;
        bVar.f127068c = "/cgi-bin/micromsg-bin/pstnreport";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f329412d = a;
        C52269zi3 zi32 = (C52269zi3) a.f127055a.f127080a;
        this.f329413e = zi32;
        zi32.f145981g = i;
        zi32.f145982h = j;
        zi32.f145983i = z ? 1 : 0;
        Log.m105919d("MicroMsg.NetSceneIPCallReport", "NetSceneIPCallReport, roomId: %d, callseq: %d, gotAnswer: %d", Integer.valueOf(i), Long.valueOf(this.f329413e.f145982h), Integer.valueOf(this.f329413e.f145983i));
        C52269zi3 zi33 = this.f329413e;
        C109470c Dx0 = C105385g.Dx0();
        Dx0.getClass();
        String str = "" + Dx0.f327664l + "," + Dx0.f327665m + "," + Dx0.f327666n + "," + Dx0.f327667o + "," + Dx0.f327668p + "," + Dx0.f327653a + "," + Dx0.f327654b + "," + Dx0.f327655c + "," + Dx0.f327656d + "," + Dx0.f327657e + "," + Dx0.f327658f + "," + Dx0.f327659g + "," + Dx0.f327660h + "," + Dx0.f327661i + "," + Dx0.f327662j + "," + Dx0.f327669q + "," + C112597j.m153940e(MMApplicationContext.getContext()) + "," + Dx0.f327646A + "," + Dx0.f327647B + "," + Dx0.f327648C + "," + Dx0.f327649D + "," + Dx0.f327650E + Dx0.f327677y + "," + Dx0.f327652G;
        Log.m105925i("MicroMsg.IPCallReportHelper", "getPstnClientReportString, result: %s", str);
        zi33.f145978d = C48374j0.m53720i(str);
        C52269zi3 zi34 = this.f329413e;
        C109470c Dx02 = C105385g.Dx0();
        Dx02.getClass();
        String str2 = "" + Dx02.f327664l + "," + Dx02.f327665m + "," + Dx02.f327666n + Dx02.f327676x + "";
        Log.m105925i("MicroMsg.IPCallReportHelper", "getPstnChannelReportString, result: %s", str2);
        zi34.f145979e = C48374j0.m53720i(str2);
        C52269zi3 zi35 = this.f329413e;
        C109470c Dx03 = C105385g.Dx0();
        Dx03.getClass();
        String str3 = "" + Dx03.f327664l + "," + Dx03.f327665m + "," + Dx03.f327666n + Dx03.f327675w + "";
        Log.m105925i("MicroMsg.IPCallReportHelper", "getPstnEngineReport, result: %s", str3);
        zi35.f145980f = C48374j0.m53720i(str3);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f329414f = nVar;
        return dispatch(gVar, this.f329412d, this);
    }

    public int getType() {
        return WXWebReporter.WXXWEB_IDKEY_X5_LOAD_URL_MAX_FAILED_TEST_SYS_SUC;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallReport", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        C48724aj3 aj32 = (C48724aj3) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f329414f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}
