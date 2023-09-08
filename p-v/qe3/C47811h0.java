package qe3;

import qe3.C89631w;
import te3.C51673vb0;

/* renamed from: qe3.h0 */
public class C47811h0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C51673vb0 f128372a = new C51673vb0();

    public int fromProtoBuf(byte[] bArr) {
        C51673vb0 vb02 = (C51673vb0) new C51673vb0().parseFrom(bArr);
        this.f128372a = vb02;
        C89631w.m112066b(this, vb02.getBaseResponse());
        return this.f128372a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
