package ow3;

import as3.C103880i0;
import as3.C103881j;
import as3.C103898r0;
import bs3.C104161b;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C1862l;
import java.util.List;
import nw3.C109774c;
import p978i9.C108421e;
import zr3.C112672d;

/* renamed from: ow3.k */
public class C110087k extends C112672d {

    /* renamed from: j */
    public String f329392j;

    /* renamed from: k */
    public int f329393k;

    /* renamed from: l */
    public long f329394l;

    public C110087k(String str, int i, long j, List<C103898r0> list) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "NetSceneSubscribeGeneralVideo");
        C103881j jVar = new C103881j();
        try {
            jVar.f307032d = str;
            this.f329392j = str;
            jVar.f307030b = i;
            this.f329393k = i;
            jVar.f307031c = j;
            this.f329394l = j;
            int size = list.size();
            C103898r0[] r0VarArr = null;
            if (size > 0) {
                r0VarArr = new C103898r0[size];
                for (int i2 = 0; i2 < size; i2++) {
                    r0VarArr[i2] = list.get(i2);
                }
            }
            jVar.f307033e = r0VarArr;
            jVar.f307034f = System.currentTimeMillis();
            C104161b.m138995d("MicroMsg.Voip", "roomId: %d, roomKey: %d, groupId: %s, timestamp: %d, memberCnt: %d", Integer.valueOf(jVar.f307030b), Long.valueOf(jVar.f307031c), jVar.f307032d, Long.valueOf(jVar.f307034f), Integer.valueOf(size));
            this.f337370g = C109774c.m149103b().mo161018f(str);
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "NetSceneSubscribeGeneralVideo constructor", e);
        }
        mo164403e(257, jVar);
    }

    /* renamed from: b */
    public Object mo161496b(int i, byte[] bArr) {
        C104161b.m138993b("MicroMsg.Voip", this.f337364a, "data2Resp");
        if (bArr == null) {
            return null;
        }
        try {
            C103880i0 i0Var = new C103880i0();
            C108421e.m146905c(i0Var, bArr);
            return i0Var;
        } catch (Exception e) {
            C104161b.m138997f(this.f337364a, "data2Resp", e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public String mo161497c() {
        return "CsCmd.Cmd_V_CSSubscribeGeneralVideoReq";
    }

    /* renamed from: d */
    public int mo161498d() {
        return C1862l.CTRL_INDEX;
    }
}
