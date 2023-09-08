package ow3;

import as3.C103874g0;
import as3.C103876h;
import bs3.C104161b;
import com.tencent.xweb.util.WXWebReporter;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.l */
public class C110088l extends C112672d {

    /* renamed from: j */
    public String f329395j;

    /* renamed from: k */
    public int f329396k;

    /* renamed from: l */
    public long f329397l;

    public C110088l(String str, int i, long j, String str2) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneSubscribeLargeVideo");
        C103876h hVar = new C103876h();
        try {
            hVar.f307009e = str;
            this.f329395j = str;
            hVar.f307006b = i;
            this.f329396k = i;
            hVar.f307007c = j;
            this.f329397l = j;
            hVar.f307008d = str2;
            hVar.f307010f = System.currentTimeMillis();
            C104161b.m138995d("MicroMsg.Voip", "roomId: %d, roomKey: %d, groupId: %s, ownerUserName: %s, timestamp: %d", Integer.valueOf(hVar.f307006b), Long.valueOf(hVar.f307007c), hVar.f307009e, hVar.f307008d, Long.valueOf(hVar.f307010f));
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneSwitchVideoGroup constructor", e);
        }
        mo164403e(WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, hVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103874g0 g0Var = new C103874g0();
            C108421e.m146905c(g0Var, bArr);
            return g0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSSubscribeLargeVideoReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 800;
    }
}
