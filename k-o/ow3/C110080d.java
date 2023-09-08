package ow3;

import as3.C103859b0;
import as3.C103864d;
import as3.C103869e1;
import as3.C103875g1;
import as3.C103894p0;
import as3.C103914z0;
import bs3.C104161b;
import bs3.C104162c;
import cs3.C106962a;
import nw3.C109803i0;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.d */
public class C110080d extends C112672d {

    /* renamed from: j */
    public String f329385j;

    /* renamed from: k */
    public int f329386k;

    /* renamed from: l */
    public boolean f329387l = true;

    public C110080d(String str, String[] strArr, byte[] bArr, String str2, C103869e1 e1Var, int i, int i2, long j, String str3, boolean z, String str4) {
        String str5 = str;
        byte[] bArr2 = bArr;
        C103869e1 e1Var2 = e1Var;
        int i3 = i;
        int i4 = i2;
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "create");
        C103864d dVar = new C103864d();
        try {
            dVar.f306952h = str5;
            this.f329385j = str5;
            dVar.f306949e = i3;
            this.f337370g = i3;
            if (e1Var2 != null) {
                dVar.f306951g = e1Var2;
            }
            C103914z0 z0Var = new C103914z0();
            z0Var.f307239b = str2;
            z0Var.f307250m = str4;
            z0Var.f307249l = C106962a.f320180a;
            z0Var.f307241d = i4;
            this.f329386k = i4;
            this.f329387l = z;
            z0Var.f307242e = j;
            dVar.f306946b = z0Var;
            dVar.f306955k = strArr;
            dVar.f306953i = str3 == null ? "" : str3;
            C103894p0 p0Var = new C103894p0();
            if (bArr2 != null) {
                p0Var.f307125c = bArr2;
                p0Var.f307124b = bArr2.length;
            } else {
                p0Var.f307124b = 0;
            }
            C103875g1 g1Var = new C103875g1();
            g1Var.f307004b = 3;
            g1Var.f307005c = p0Var;
            dVar.f306948d = g1Var;
            dVar.f306950f = 2;
            dVar.f306954j = C109803i0.m149217a(C104162c.f308396a);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneCreateVoiceGroup constructor", e);
        }
        mo164403e(139, dVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103859b0 b0Var = new C103859b0();
            C108421e.m146905c(b0Var, bArr);
            return b0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSCreateVoiceGroupReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 201;
    }
}
