package qe3;

import com.tencent.p014mm.sdk.platformtools.Util;
import pe3.C89349b;
import qe3.C89631w;
import te3.C51520ub0;

/* renamed from: qe3.g0 */
public class C47810g0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public boolean f128370a = true;

    /* renamed from: b */
    public C51520ub0 f128371b = new C51520ub0();

    public C47810g0(boolean z) {
        this.f128370a = z;
    }

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return this.f128370a ? 3944 : 836;
    }

    public byte[] toProtoBuf() {
        this.f128371b.setBaseRequest(C89631w.m112065a(this));
        if (this.f128370a) {
            byte[] uuidRandom = Util.getUuidRandom();
            setRsaInfo(C101125b1.m132538d());
            this.f128371b.f142717d = C89349b.m111674a(uuidRandom);
            if (!C101127f.f296015a) {
                setPassKey(uuidRandom);
            }
        }
        return this.f128371b.toByteArray();
    }
}
