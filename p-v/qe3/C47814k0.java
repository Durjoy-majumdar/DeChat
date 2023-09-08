package qe3;

import qe3.C89631w;
import te3.C51950xb0;

/* renamed from: qe3.k0 */
public class C47814k0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C51950xb0 f128378a = new C51950xb0();

    public int fromProtoBuf(byte[] bArr) {
        C51950xb0 xb02 = (C51950xb0) new C51950xb0().parseFrom(bArr);
        this.f128378a = xb02;
        C89631w.m112066b(this, xb02.getBaseResponse());
        return this.f128378a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
