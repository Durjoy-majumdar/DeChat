package eb0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1884v4;
import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C51373tb2;

/* renamed from: eb0.q3 */
public class C45624q3 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C51373tb2 f123391a = new C51373tb2();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return C1884v4.CTRL_INDEX;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        C51373tb2 tb22 = this.f123391a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        tb22.f142102f = qv32;
        this.f123391a.setBaseRequest(C89631w.m112065a(this));
        return this.f123391a.toByteArray();
    }
}
