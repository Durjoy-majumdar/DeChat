package ow3;

import as3.C103888m0;
import bs3.C104161b;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.j */
public class C110086j extends C112672d {
    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            C103888m0 m0Var = new C103888m0();
            C108421e.m146905c(m0Var, bArr);
            return m0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e);
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSVoiceMemberWhisperReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 213;
    }
}
