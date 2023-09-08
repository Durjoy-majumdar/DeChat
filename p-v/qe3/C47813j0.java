package qe3;

import com.tencent.p014mm.sdk.platformtools.Util;
import pe3.C89349b;
import qe3.C89631w;
import te3.C51809wb0;

/* renamed from: qe3.j0 */
public class C47813j0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public boolean f128376a = true;

    /* renamed from: b */
    public C51809wb0 f128377b = new C51809wb0();

    public C47813j0(boolean z) {
        this.f128376a = z;
    }

    public int getCmdId() {
        return 0;
    }

    public int getFuncId() {
        return this.f128376a ? 3789 : 3644;
    }

    public byte[] toProtoBuf() {
        this.f128377b.setBaseRequest(C89631w.m112065a(this));
        if (this.f128376a) {
            byte[] uuidRandom = Util.getUuidRandom();
            setRsaInfo(C101125b1.m132538d());
            this.f128377b.f143956d = C89349b.m111674a(uuidRandom);
            if (!C101127f.f296015a) {
                setPassKey(uuidRandom);
            }
        }
        return this.f128377b.toByteArray();
    }
}
