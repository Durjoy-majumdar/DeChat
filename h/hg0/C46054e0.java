package hg0;

import qe3.C89631w;
import te3.C50372m92;

/* renamed from: hg0.e0 */
public class C46054e0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C50372m92 f124176a = new C50372m92();

    public int fromProtoBuf(byte[] bArr) {
        C50372m92 m922 = (C50372m92) new C50372m92().parseFrom(bArr);
        this.f124176a = m922;
        C89631w.m112066b(this, m922.getBaseResponse());
        return this.f124176a.getBaseResponse().f135955d;
    }
}
