package rl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: rl1.i0 */
public final class C13042i0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f37148d;

    /* renamed from: e */
    public final /* synthetic */ C13022d0 f37149e;

    /* renamed from: f */
    public final /* synthetic */ String f37150f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13042i0(boolean z, C13022d0 d0Var, String str) {
        super(0);
        this.f37148d = z;
        this.f37149e = d0Var;
        this.f37150f = str;
    }

    public Object invoke() {
        if (this.f37148d) {
            this.f37149e.mo12533G3(this.f37150f);
        }
        boolean T = C61926c.m72675T(this.f37149e.f37097j, new C13040h0(this.f37150f));
        Log.m105924i("MMFinder.LiveLotterySlice", "removeLotteryInfoFromList localLotteryInfo:" + this.f37149e.f37098n + " remove:" + T + ",saveId:" + this.f37148d + '!');
        this.f37149e.mo12547n3("remove", false);
        return C13598b0.f38549a;
    }
}
