package eb1;

import qe3.C89631w;
import te3.vp4;

/* renamed from: eb1.l */
public class C45639l extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public vp4 f123419a = new vp4();

    public int fromProtoBuf(byte[] bArr) {
        vp4 vp4 = (vp4) new vp4().parseFrom(bArr);
        this.f123419a = vp4;
        C89631w.m112066b(this, vp4.getBaseResponse());
        return this.f123419a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
