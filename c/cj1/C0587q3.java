package cj1;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cj1.q3 */
public final class C0587q3 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ int f1394d;

    /* renamed from: e */
    public final /* synthetic */ int f1395e;

    /* renamed from: f */
    public final /* synthetic */ long f1396f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0587q3(int i, int i2, long j) {
        super(0);
        this.f1394d = i;
        this.f1395e = i2;
        this.f1396f = j;
    }

    public Object invoke() {
        return "errCode:" + this.f1394d + " errType:" + this.f1395e + " liveId:" + this.f1396f;
    }
}
