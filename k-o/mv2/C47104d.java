package mv2;

import qe3.C89631w;
import te3.yl4;

/* renamed from: mv2.d */
public class C47104d extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public yl4 f126576a = new yl4();

    public int fromProtoBuf(byte[] bArr) {
        yl4 yl4 = (yl4) new yl4().parseFrom(bArr);
        this.f126576a = yl4;
        C89631w.m112066b(this, yl4.getBaseResponse());
        return this.f126576a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
