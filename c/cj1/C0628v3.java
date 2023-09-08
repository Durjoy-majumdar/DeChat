package cj1;

import fy3.C32224a;
import gy3.C87413o;

/* renamed from: cj1.v3 */
public final class C0628v3 extends C87413o implements C32224a<String> {

    /* renamed from: d */
    public final /* synthetic */ int f1483d;

    /* renamed from: e */
    public final /* synthetic */ long f1484e;

    /* renamed from: f */
    public final /* synthetic */ long f1485f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0628v3(int i, long j, long j2) {
        super(0);
        this.f1483d = i;
        this.f1484e = j;
        this.f1485f = j2;
    }

    public Object invoke() {
        return "errCode:" + this.f1483d + " roomId:" + this.f1484e + " liveId:" + this.f1485f;
    }
}
