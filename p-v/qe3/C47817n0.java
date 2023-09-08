package qe3;

import qe3.C89631w;
import te3.C50490n33;

/* renamed from: qe3.n0 */
public class C47817n0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C50490n33 f128381a = new C50490n33();

    public int getCmdId() {
        return 27;
    }

    public int getFuncId() {
        return 139;
    }

    public byte[] toProtoBuf() {
        this.f128381a.setBaseRequest(C89631w.m112065a(this));
        return this.f128381a.toByteArray();
    }
}
