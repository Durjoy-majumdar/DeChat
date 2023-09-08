package qe3;

import qe3.C89631w;
import te3.C50323lx1;

/* renamed from: qe3.m0 */
public class C47816m0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C50323lx1 f128380a = new C50323lx1();

    public int fromProtoBuf(byte[] bArr) {
        C50323lx1 lx12 = (C50323lx1) new C50323lx1().parseFrom(bArr);
        this.f128380a = lx12;
        C89631w.m112066b(this, lx12.getBaseResponse());
        return this.f128380a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 1000000179;
    }
}
