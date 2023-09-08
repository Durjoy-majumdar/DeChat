package ow3;

import as3.C103877h0;
import as3.C103879i;
import as3.C103896q0;
import bs3.C104161b;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import java.util.List;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.m */
public class C110089m extends C112672d {

    /* renamed from: j */
    public String f329398j;

    /* renamed from: k */
    public int f329399k;

    /* renamed from: l */
    public long f329400l;

    public C110089m(String str, int i, long j, List<C103896q0> list) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneSubscribeScreenSharingVideo");
        C103879i iVar = new C103879i();
        try {
            iVar.f307025d = str;
            this.f329398j = str;
            iVar.f307023b = i;
            this.f329399k = i;
            iVar.f307024c = j;
            this.f329400l = j;
            int size = list.size();
            C103896q0[] q0VarArr = null;
            if (size > 0) {
                q0VarArr = new C103896q0[size];
                for (int i2 = 0; i2 < size; i2++) {
                    q0VarArr[i2] = list.get(i2);
                }
            }
            iVar.f307026e = q0VarArr;
            iVar.f307027f = System.currentTimeMillis();
            C104161b.m138995d("MicroMsg.Voip", "roomId: %d, roomKey: %d, groupId: %s, timestamp: %d, memberCnt: %d", Integer.valueOf(iVar.f307023b), Long.valueOf(iVar.f307024c), iVar.f307025d, Long.valueOf(iVar.f307027f), Integer.valueOf(size));
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneSubscribeScreenSharingVideo constructor", e);
        }
        mo164403e(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION, iVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103877h0 h0Var = new C103877h0();
            C108421e.m146905c(h0Var, bArr);
            return h0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSSubscribeScreenSharingVideoReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 802;
    }
}
