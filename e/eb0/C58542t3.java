package eb0;

import qe3.C89631w;
import te3.vq4;

/* renamed from: eb0.t3 */
public class C58542t3 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public vq4 f167582a = new vq4();

    public int fromProtoBuf(byte[] bArr) {
        vq4 vq4 = (vq4) new vq4().parseFrom(bArr);
        this.f167582a = vq4;
        C89631w.m112066b(this, vq4.getBaseResponse());
        return this.f167582a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
