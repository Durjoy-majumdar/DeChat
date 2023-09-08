package ow3;

import as3.C103875g1;
import as3.C103884k0;
import as3.C103885l;
import as3.C103894p0;
import bs3.C104161b;
import com.tencent.xweb.util.WXWebReporter;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.a */
public class C110077a extends C112672d {

    /* renamed from: j */
    public String f329377j = null;

    /* renamed from: k */
    public int f329378k = 0;

    /* renamed from: l */
    public long f329379l = 0;

    /* renamed from: m */
    public int f329380m;

    /* renamed from: n */
    public int f329381n;

    public C110077a(String str, int i, long j, int i2, int i3, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneAckVoiceGroup");
        C103885l lVar = new C103885l();
        try {
            lVar.f307067b = str;
            this.f329377j = str;
            lVar.f307068c = i;
            this.f329378k = i;
            lVar.f307069d = j;
            this.f329379l = j;
            this.f329380m = i3;
            this.f329381n = i2;
            C103894p0 p0Var = new C103894p0();
            if (bArr != null) {
                p0Var.f307125c = bArr;
                p0Var.f307124b = bArr.length;
            } else {
                p0Var.f307124b = 0;
            }
            C103875g1 g1Var = new C103875g1();
            g1Var.f307004b = 3;
            g1Var.f307005c = p0Var;
            lVar.f307070e = g1Var;
            this.f337370g = i2;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneAckVoiceGroup constructor", e);
        }
        mo164403e(WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD, lVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103884k0 k0Var = new C103884k0();
            C108421e.m146905c(k0Var, bArr);
            return k0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSVoiceAckReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 206;
    }
}
