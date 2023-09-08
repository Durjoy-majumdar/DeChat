package eb1;

import qe3.C89631w;
import te3.C101859vv1;

/* renamed from: eb1.h */
public class C97634h extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C101859vv1 f286406a = new C101859vv1();

    public int fromProtoBuf(byte[] bArr) {
        C101859vv1 vv12 = (C101859vv1) new C101859vv1().parseFrom(bArr);
        this.f286406a = vv12;
        C89631w.m112066b(this, vv12.getBaseResponse());
        return this.f286406a.getBaseResponse().f135955d;
    }

    public int getCmdId() {
        return 0;
    }
}
