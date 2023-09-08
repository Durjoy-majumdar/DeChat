package eb0;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C51018qv3;
import te3.uq4;

/* renamed from: eb0.s3 */
public class C58541s3 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public uq4 f167581a = new uq4();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return 617;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        uq4 uq4 = this.f167581a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        uq4.f185790h = qv32;
        this.f167581a.setBaseRequest(C89631w.m112065a(this));
        return this.f167581a.toByteArray();
    }
}
