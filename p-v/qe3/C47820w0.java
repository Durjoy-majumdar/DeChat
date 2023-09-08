package qe3;

import qe3.C89631w;
import te3.C51035qz3;

/* renamed from: qe3.w0 */
public class C47820w0 extends C89631w.C89634d implements C89631w.C89633b {

    /* renamed from: a */
    public C51035qz3 f128384a = new C51035qz3();

    public int getCmdId() {
        return 42;
    }

    public int getFuncId() {
        return 131;
    }

    public byte[] toProtoBuf() {
        this.f128384a.setBaseRequest(C89631w.m112065a(this));
        return this.f128384a.toByteArray();
    }
}
