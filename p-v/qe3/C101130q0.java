package qe3;

import qe3.C89631w;
import te3.C101865x33;

/* renamed from: qe3.q0 */
public class C101130q0 extends C89631w.C89636e implements C89631w.C89635c {

    /* renamed from: a */
    public C101865x33 f296025a = new C101865x33();

    public int fromProtoBuf(byte[] bArr) {
        C101865x33 x332 = (C101865x33) new C101865x33().parseFrom(bArr);
        this.f296025a = x332;
        return x332.f299845d;
    }

    public int getCmdId() {
        return 1000000121;
    }
}
