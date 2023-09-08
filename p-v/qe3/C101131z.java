package qe3;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C89631w;
import te3.C51018qv3;
import te3.C77928fd;

/* renamed from: qe3.z */
public class C101131z extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C77928fd f296026a = new C77928fd();

    public int getFuncId() {
        return 145;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        C77928fd fdVar = this.f296026a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        fdVar.f227371q = qv32;
        this.f296026a.setBaseRequest(C89631w.m112065a(this));
        return this.f296026a.toByteArray();
    }
}
