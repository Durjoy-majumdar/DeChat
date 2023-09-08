package eb1;

import com.tencent.p014mm.sdk.platformtools.Util;
import qe3.C101125b1;
import qe3.C89631w;
import te3.C51018qv3;
import te3.up4;

/* renamed from: eb1.k */
public class C45638k extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public up4 f123418a = new up4();

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return 930;
    }

    public byte[] toProtoBuf() {
        setRsaInfo(C101125b1.m132538d());
        up4 up4 = this.f123418a;
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(Util.getUuidRandom());
        up4.f143022f = qv32;
        this.f123418a.setBaseRequest(C89631w.m112065a(this));
        setPassKey(this.f123418a.f143022f.f140574f.mo123703f());
        return this.f123418a.toByteArray();
    }
}
