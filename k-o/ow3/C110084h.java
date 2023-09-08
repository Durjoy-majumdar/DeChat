package ow3;

import as3.C103887m;
import as3.C103890n0;
import bs3.C104161b;
import bs3.C104162c;
import nw3.C109774c;
import nw3.C109803i0;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.h */
public class C110084h extends C112672d {
    public C110084h(String str, int i, long j, int i2, int i3) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneRejectVoiceGroup");
        C103887m mVar = new C103887m();
        try {
            mVar.f307074b = str;
            mVar.f307075c = i;
            mVar.f307076d = j;
            mVar.f307077e = i2;
            mVar.f307078f = 2;
            mVar.f307079g = C109803i0.m149217a(C104162c.f308396a);
            if (i3 == 0) {
                mVar.f307080h = 0;
            } else {
                mVar.f307080h = 1;
            }
            C104161b.m138997f(this.f337364a, "NetSceneRedirect redirect type:", Integer.valueOf(mVar.f307080h));
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneRedirect constructor", e);
        }
        mo164403e(211, mVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103890n0 n0Var = new C103890n0();
            C108421e.m146905c(n0Var, bArr);
            return n0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSVoiceRedirectReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 211;
    }
}
