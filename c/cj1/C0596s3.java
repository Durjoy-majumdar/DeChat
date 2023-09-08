package cj1;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cj1.s3 */
public final class C0596s3 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ int f1407d;

    /* renamed from: e */
    public final /* synthetic */ int f1408e;

    /* renamed from: f */
    public final /* synthetic */ long f1409f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0596s3(int i, int i2, long j) {
        super(0);
        this.f1407d = i;
        this.f1408e = i2;
        this.f1409f = j;
    }

    public Object invoke() {
        return "errCode:" + this.f1407d + " errType:" + this.f1408e + " liveId:" + this.f1409f;
    }
}
