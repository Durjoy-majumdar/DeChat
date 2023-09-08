package ow3;

import as3.C103862c0;
import as3.C103867e;
import as3.C103875g1;
import as3.C103894p0;
import as3.C103914z0;
import bs3.C104161b;
import bs3.C104162c;
import nw3.C109803i0;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.e */
public class C110081e extends C112672d {

    /* renamed from: j */
    public String f329388j = null;

    /* renamed from: k */
    public int f329389k = 0;

    /* renamed from: l */
    public long f329390l = 0;

    /* renamed from: m */
    public int f329391m = 0;

    public C110081e(C110081e eVar) {
        this.f329388j = eVar.f329388j;
        this.f329389k = eVar.f329389k;
        this.f329390l = eVar.f329390l;
        this.f329391m = eVar.f329391m;
        this.f337366c = eVar.f337366c;
        this.f337368e = eVar.f337368e;
        this.f337370g = eVar.f337370g;
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            C103862c0 c0Var = new C103862c0();
            C108421e.m146905c(c0Var, bArr);
            return c0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSEnterVoiceRoomReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 202;
    }

    public C110081e(String str, int i, long j, byte[] bArr, int i2, int i3, String str2) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "enter2", str, Integer.valueOf(i), Long.valueOf(j), str2);
        C103867e eVar = new C103867e();
        try {
            eVar.f306962b = str;
            this.f329388j = str;
            eVar.f306963c = i;
            this.f329389k = i;
            eVar.f306964d = j;
            this.f329390l = j;
            eVar.f306966f = i3;
            this.f329391m = i3;
            C103914z0 z0Var = new C103914z0();
            z0Var.f307250m = str2;
            eVar.f306970j = z0Var;
            C104161b.m138993b("MicroMsg.Voip", this.f337364a, "wXgroupId", str2);
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
            eVar.f306965e = g1Var;
            this.f337370g = i2;
            eVar.f306967g = 2;
            eVar.f306969i = C109803i0.m149217a(C104162c.f308396a);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneEnterVoiceRoom constructor", e);
        }
        mo164403e(141, eVar);
    }
}
