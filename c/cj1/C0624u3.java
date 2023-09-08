package cj1;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cj1.u3 */
public final class C0624u3 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ int f1476d;

    /* renamed from: e */
    public final /* synthetic */ int f1477e;

    /* renamed from: f */
    public final /* synthetic */ long f1478f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0624u3(int i, int i2, long j) {
        super(0);
        this.f1476d = i;
        this.f1477e = i2;
        this.f1478f = j;
    }

    public Object invoke() {
        return "errCode:" + this.f1476d + " errType:" + this.f1477e + " liveId:" + this.f1478f;
    }
}
