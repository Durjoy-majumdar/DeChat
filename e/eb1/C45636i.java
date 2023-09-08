package eb1;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C49884iq3;
import te3.C51018qv3;

/* renamed from: eb1.i */
public class C45636i extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C49884iq3 f123416a = new C49884iq3();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return 931;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        C49884iq3 iq32 = this.f123416a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        iq32.f135594h = qv32;
        this.f123416a.setBaseRequest(C89631w.m112065a(this));
        setPassKey(this.f123416a.f135594h.f140574f.mo123703f());
        return this.f123416a.toByteArray();
    }
}
