package cj1;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cj1.o3 */
public final class C0580o3 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ int f1385d;

    /* renamed from: e */
    public final /* synthetic */ int f1386e;

    /* renamed from: f */
    public final /* synthetic */ long f1387f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0580o3(int i, int i2, long j) {
        super(0);
        this.f1385d = i;
        this.f1386e = i2;
        this.f1387f = j;
    }

    public Object invoke() {
        return "errCode:" + this.f1385d + " errType:" + this.f1386e + " liveId:" + this.f1387f;
    }
}
