package eb0;

import qe3.C89631w;
import te3.C50940qb2;

/* renamed from: eb0.p3 */
public class C45622p3 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C50940qb2 f123388a = new C50940qb2();

    public int fromProtoBuf(byte[] bArr) {
        C50940qb2 qb22 = (C50940qb2) new C50940qb2().parseFrom(bArr);
        this.f123388a = qb22;
        C89631w.m112066b(this, qb22.getBaseResponse());
        return this.f123388a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
