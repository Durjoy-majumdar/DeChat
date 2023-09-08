package qe3;

import qe3.C89631w;
import te3.C50631o33;

/* renamed from: qe3.o0 */
public class C47818o0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C50631o33 f128382a = new C50631o33();

    public int fromProtoBuf(byte[] bArr) {
        C50631o33 o332 = (C50631o33) new C50631o33().parseFrom(bArr);
        this.f128382a = o332;
        C89631w.m112066b(this, o332.getBaseResponse());
        return this.f128382a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 1000000027;
    }
}
