package ow3;

import as3.C103865d0;
import as3.C103870f;
import bs3.C104161b;
import com.tencent.thumbplayer.api.TPOptionalID;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.f */
public class C110082f extends C112672d {
    public C110082f(String str, int i, long j, int i2) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "eixt", str, Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(i2));
        C103870f fVar = new C103870f();
        try {
            fVar.f306982b = str;
            fVar.f306983c = i;
            fVar.f306984d = j;
            fVar.f306985e = i2;
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneExitVoiceRoom constructor", e);
        }
        mo164403e(TPOptionalID.f349338xc9bdf6cd, fVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            C103865d0 d0Var = new C103865d0();
            C108421e.m146905c(d0Var, bArr);
            return d0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSExitVoiceRoomReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 203;
    }
}
