package eb1;

import qe3.C89631w;
import te3.C50024jq3;

/* renamed from: eb1.j */
public class C45637j extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C50024jq3 f123417a = new C50024jq3();

    public int fromProtoBuf(byte[] bArr) {
        C50024jq3 jq32 = (C50024jq3) new C50024jq3().parseFrom(bArr);
        this.f123417a = jq32;
        C89631w.m112066b(this, jq32.getBaseResponse());
        return this.f123417a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
