package ow3;

import as3.C103855a;
import as3.C103913z;
import bs3.C104161b;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.b */
public class C110078b extends C112672d {

    /* renamed from: j */
    public String f329382j;

    /* renamed from: k */
    public int f329383k;

    /* renamed from: l */
    public long f329384l;

    public C110078b(String str, int i, long j, String[] strArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "addmember", str);
        C103855a aVar = new C103855a();
        try {
            aVar.f306842b = str;
            this.f329382j = str;
            this.f329383k = i;
            aVar.f306844d = j;
            this.f329384l = j;
            aVar.f306847g = strArr;
            aVar.f306843c = i;
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneAddVoiceGroupMember constructor", e);
        }
        mo164403e(145, aVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            C103913z zVar = new C103913z();
            C108421e.m146905c(zVar, bArr);
            return zVar;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSAddVoiceGroupMemberReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return 204;
    }
}
