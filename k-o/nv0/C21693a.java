package nv0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gv0.C20842c;
import p823sg.C90194m;
import pe3.C47465a;
import pe3.C89349b;
import pv0.C22017y;
import pv0.C22018z;

/* renamed from: nv0.a */
public class C21693a extends C20842c {

    /* renamed from: u */
    public C22017y f61398u = new C22017y();

    /* renamed from: v */
    public C22018z f61399v = new C22018z();

    /* renamed from: w */
    public final String f61400w;

    /* renamed from: x */
    public final byte[] f61401x;

    /* renamed from: y */
    public final String f61402y;

    /* renamed from: z */
    public boolean f61403z = false;

    public C21693a(String str, String str2, byte[] bArr, String str3, int i, int i2) {
        Log.m105925i("MicroMsg.BakOldAuthScene", "summerbak init id:%s,  hello:%s, ok:%s, stack[%s]", str3, str, str2, Util.getStack());
        this.f61398u.f62310f = new C89349b(C90194m.m112882c(str.getBytes(), bArr));
        C22017y yVar = this.f61398u;
        yVar.f62308d = 0;
        yVar.f62309e = str3;
        yVar.f62311g = i;
        this.f61400w = str2;
        this.f61402y = str3;
        this.f61401x = bArr;
    }

    public int getType() {
        return 1;
    }

    /* renamed from: q1 */
    public C47465a mo32542q1() {
        return this.f61398u;
    }

    /* renamed from: r1 */
    public C47465a mo32543r1() {
        return this.f61399v;
    }

    /* renamed from: t1 */
    public void mo32544t1(int i) {
        C22018z zVar = this.f61399v;
        int i2 = zVar.f62316e;
        if (i2 != 0) {
            Log.m105921e("MicroMsg.BakOldAuthScene", "errType %d", Integer.valueOf(i2));
            mo32546m1(4, this.f61399v.f62316e, "not not success");
        } else if (this.f61402y.equals(zVar.f62317f)) {
            String str = new String(C90194m.m112881b(this.f61399v.f62318g.f257327a, this.f61401x));
            boolean equals = str.length() != this.f61400w.length() ? false : str.equals(this.f61400w);
            this.f61403z = equals;
            Log.m105925i("MicroMsg.BakOldAuthScene", "check ok result:%b", Boolean.valueOf(equals));
            if (this.f61403z) {
                mo32546m1(0, 0, "auth ok");
                this.f61398u.f62310f = new C89349b(C90194m.m112882c(this.f61400w.getBytes(), this.f61401x));
                C22017y yVar = this.f61398u;
                yVar.f62308d = 1;
                yVar.f62309e = this.f61402y;
                try {
                    Log.m105924i("MicroMsg.BakOldAuthScene", "directSendAuthOk");
                    C20842c.m22886w1(this.f61398u.toByteArray(), 1, i);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BakOldAuthScene", e, "directSendAuthOk req to bur err.", new Object[0]);
                }
            } else {
                Log.m105920e("MicroMsg.BakOldAuthScene", "check ok failed");
                mo32546m1(4, 1, "not ok packet");
            }
        } else {
            Log.m105920e("MicroMsg.BakOldAuthScene", "not the same id");
            mo32546m1(4, -1, "not the same id");
        }
    }
}
