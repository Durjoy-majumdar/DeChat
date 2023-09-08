package ow3;

import as3.C103889n;
import as3.C103892o0;
import bs3.C104161b;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.o */
public class C110091o extends C112672d {

    /* renamed from: j */
    public String f329407j;

    /* renamed from: k */
    public int f329408k;

    /* renamed from: l */
    public long f329409l;

    public C110091o(String str, int i, long j, int i2, int i3) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "hello", str, Integer.valueOf(i), Long.valueOf(j));
        C103889n nVar = new C103889n();
        nVar.f307086f = i3;
        nVar.f307083c = i;
        this.f329408k = i;
        nVar.f307084d = j;
        this.f329409l = j;
        nVar.f307082b = str;
        this.f329407j = str;
        nVar.f307085e = i2;
        try {
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneVoiceRoomHello constructor", e);
        }
        mo164403e(147, nVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            C103892o0 o0Var = new C103892o0();
            C108421e.m146905c(o0Var, bArr);
            return o0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSVoiceRoomHelloReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 205;
    }
}
