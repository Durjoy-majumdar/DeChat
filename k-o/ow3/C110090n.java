package ow3;

import as3.C103882j0;
import as3.C103883k;
import bs3.C104161b;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.n */
public class C110090n extends C112672d {

    /* renamed from: j */
    public String f329401j;

    /* renamed from: k */
    public int f329402k;

    /* renamed from: l */
    public long f329403l;

    /* renamed from: m */
    public int f329404m;

    /* renamed from: n */
    public int f329405n;

    /* renamed from: o */
    public String f329406o;

    public C110090n(String str, int i, long j, int i2, String str2, int i3, String str3, String str4) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneSwitchVideoGroup");
        C103883k kVar = new C103883k();
        try {
            kVar.f307050e = str;
            this.f329401j = str;
            kVar.f307048c = i;
            this.f329402k = i;
            kVar.f307049d = j;
            this.f329403l = j;
            kVar.f307047b = i2;
            this.f329404m = i2;
            kVar.f307053h = i3;
            this.f329405n = i3;
            kVar.f307051f = System.currentTimeMillis();
            kVar.f307052g = str2 == null ? "" : str2;
            str3 = str3 == null ? "" : str3;
            kVar.f307054i = str3;
            this.f329406o = str3;
            kVar.f307055j = str4 == null ? "" : str4;
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneSwitchVideoGroup constructor", e);
        }
        mo164403e(243, kVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103882j0 j0Var = new C103882j0();
            C108421e.m146905c(j0Var, bArr);
            return j0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSSwitchVideoGroupReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
    }
}
