package cj1;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cj1.p3 */
public final class C0583p3 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ int f1389d;

    /* renamed from: e */
    public final /* synthetic */ int f1390e;

    /* renamed from: f */
    public final /* synthetic */ long f1391f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0583p3(int i, int i2, long j) {
        super(0);
        this.f1389d = i;
        this.f1390e = i2;
        this.f1391f = j;
    }

    public Object invoke() {
        return "errCode:" + this.f1389d + " errType:" + this.f1390e + " liveId:" + this.f1391f;
    }
}
