package xk1;

import com.tencent.p014mm.network.C40384w;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import xk1.C66297d2;

/* renamed from: xk1.l2 */
public final class C53362l2 extends C40384w.C40385a {

    /* renamed from: e */
    public final /* synthetic */ C66297d2 f150165e;

    /* renamed from: xk1.l2$a */
    public static final class C53363a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ boolean f150166d;

        /* renamed from: e */
        public final /* synthetic */ C66297d2 f150167e;

        /* renamed from: f */
        public final /* synthetic */ int f150168f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C53363a(boolean z, C66297d2 d2Var, int i) {
            super(0);
            this.f150166d = z;
            this.f150167e = d2Var;
            this.f150168f = i;
        }

        public Object invoke() {
            if (this.f150166d) {
                C66297d2.C53358b bVar = this.f150167e.f190842C;
                bVar.f150160b = this.f150168f;
                bVar.f150159a = 0;
            } else {
                C66297d2 d2Var = this.f150167e;
                C66297d2.C53358b bVar2 = d2Var.f190842C;
                bVar2.f150160b = 0;
                bVar2.f150159a = d2Var.f190847H;
            }
            return C13598b0.f38549a;
        }
    }

    public C53362l2(C66297d2 d2Var) {
        this.f150165e = d2Var;
    }

    /* renamed from: Yt */
    public void mo62838Yt(boolean z, float f, float f2, boolean z2, int i, int i2, int i3, boolean z3, int i4, int i5, int i6) {
        Log.m105924i("Finder.FinderLivePostUIC", "onSpeedTestDone rttSuccessful:" + z + " rtt:" + f + " jitter:" + f2 + " uploadSuccessful:" + z2 + " aveUpSpeed:" + i + " minUpSpeed:" + i2 + " maxUpSpeed:" + i3 + " downloadSuccessful:" + z3 + " aveDownSpeed:" + i4 + " minDownSpeed:" + i5 + " maxDownSpeed:" + i6);
        C61926c.m72668M(new C53363a(z2, this.f150165e, i));
    }

    /* renamed from: pB */
    public void mo62839pB(boolean z, float f, float f2, boolean z2, int i, int i2, int i3) {
        Log.m105924i("Finder.FinderLivePostUIC", "onUploadAndRttDone rttSuccessful:" + z + " rtt:" + f + " jitter:" + f2 + " uploadSuccessful:" + z2 + " aveSpeed:" + i + " minSpeed:" + i2 + " maxSpeed:" + i3);
    }
}
