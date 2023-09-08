package ow3;

import as3.C103871f0;
import as3.C103873g;
import bs3.C104161b;
import com.tencent.xweb.util.WXWebReporter;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.i */
public class C110085i extends C112672d {
    public C110085i(String str, int i, long j, int i2) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneRejectVoiceGroup");
        C103873g gVar = new C103873g();
        try {
            gVar.f306997b = str;
            gVar.f306998c = i;
            gVar.f306999d = j;
            gVar.f307000e = i2;
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneRejectVoiceGroup constructor", e);
        }
        mo164403e(WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD, gVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103871f0 f0Var = new C103871f0();
            C108421e.m146905c(f0Var, bArr);
            return f0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSRejectEnterVoiceRoomReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 207;
    }
}
