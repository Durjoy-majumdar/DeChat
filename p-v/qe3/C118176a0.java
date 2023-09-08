package qe3;

import qe3.C89631w;
import te3.C77934gd;

/* renamed from: qe3.a0 */
public class C118176a0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C77934gd f353291a = new C77934gd();

    public int fromProtoBuf(byte[] bArr) {
        C77934gd gdVar = (C77934gd) new C77934gd().parseFrom(bArr);
        this.f353291a = gdVar;
        C89631w.m112066b(this, gdVar.getBaseResponse());
        return this.f353291a.getBaseResponse().f135955d;
    }
}
