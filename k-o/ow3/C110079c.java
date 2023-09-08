package ow3;

import as3.C103856a0;
import as3.C103858b;
import bs3.C104161b;
import com.tencent.xweb.util.WXWebReporter;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.c */
public class C110079c extends C112672d {
    public C110079c(String str, int i, int i2) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneCancelCreateVoiceGroup");
        C103858b bVar = new C103858b();
        try {
            bVar.f306856b = str;
            bVar.f306857c = i;
            this.f337370g = i2;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneCancelCreateVoiceGroup constructor", e);
        }
        mo164403e(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_FAILED, bVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103856a0 a0Var = new C103856a0();
            C108421e.m146905c(a0Var, bArr);
            return a0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSCancelCreateVoiceGroupReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 208;
    }
}
