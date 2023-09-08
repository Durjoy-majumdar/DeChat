package qe3;

import qe3.C89631w;
import te3.C51180rz3;

/* renamed from: qe3.x0 */
public class C47821x0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C51180rz3 f128385a = new C51180rz3();

    public int fromProtoBuf(byte[] bArr) {
        C51180rz3 rz32 = (C51180rz3) new C51180rz3().parseFrom(bArr);
        this.f128385a = rz32;
        C89631w.m112066b(this, rz32.getBaseResponse());
        return this.f128385a.getBaseResponse().f135955d;
    }
}
