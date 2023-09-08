package hg0;

import qe3.C89631w;
import te3.C64438i70;

/* renamed from: hg0.b0 */
public class C59884b0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C64438i70 f170955a = new C64438i70();

    public int fromProtoBuf(byte[] bArr) {
        C64438i70 i702 = (C64438i70) new C64438i70().parseFrom(bArr);
        this.f170955a = i702;
        C89631w.m112066b(this, i702.getBaseResponse());
        return this.f170955a.getBaseResponse().f135955d;
    }
}
