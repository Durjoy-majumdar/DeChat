package cj1;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cj1.t3 */
public final class C0621t3 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ int f1471d;

    /* renamed from: e */
    public final /* synthetic */ int f1472e;

    /* renamed from: f */
    public final /* synthetic */ long f1473f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0621t3(int i, int i2, long j) {
        super(0);
        this.f1471d = i;
        this.f1472e = i2;
        this.f1473f = j;
    }

    public Object invoke() {
        return "errCode:" + this.f1471d + " errType:" + this.f1472e + " liveId:" + this.f1473f;
    }
}
