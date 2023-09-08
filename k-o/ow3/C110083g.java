package ow3;

import as3.C103868e0;
import bs3.C104161b;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.g */
public class C110083g extends C112672d {
    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103868e0 e0Var = new C103868e0();
            C108421e.m146905c(e0Var, bArr);
            return e0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSModifyVoiceGroupInfoReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 209;
    }
}
