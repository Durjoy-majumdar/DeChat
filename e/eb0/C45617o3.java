package eb0;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C50808pb2;
import te3.C51018qv3;

/* renamed from: eb0.o3 */
public class C45617o3 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C50808pb2 f123383a = new C50808pb2();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return 616;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        C50808pb2 pb22 = this.f123383a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        pb22.f139693f = qv32;
        this.f123383a.setBaseRequest(C89631w.m112065a(this));
        return this.f123383a.toByteArray();
    }
}
