package eb0;

import qe3.C89631w;
import te3.C51522ub2;

/* renamed from: eb0.r3 */
public class C45627r3 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C51522ub2 f123394a = new C51522ub2();

    public int fromProtoBuf(byte[] bArr) {
        C51522ub2 ub22 = (C51522ub2) new C51522ub2().parseFrom(bArr);
        this.f123394a = ub22;
        C89631w.m112066b(this, ub22.getBaseResponse());
        return this.f123394a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
