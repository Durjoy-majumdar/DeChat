package rl1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: rl1.m */
public final class C13051m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f37172d;

    /* renamed from: e */
    public final /* synthetic */ C13044k f37173e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13051m(int i, C13044k kVar) {
        super(0);
        this.f37172d = i;
        this.f37173e = kVar;
    }

    public Object invoke() {
        int i = this.f37172d;
        boolean z = false;
        if (i >= 0 && i < this.f37173e.getItemCount()) {
            z = true;
        }
        if (z) {
            this.f37173e.f37153d.remove(this.f37172d);
            this.f37173e.notifyDataSetChanged();
        } else {
            Log.m105920e("FinderLiveLotteryPanelListAdapter", "removeItem index:" + this.f37172d + " fail,itemCount:" + this.f37173e.getItemCount());
        }
        return C13598b0.f38549a;
    }
}
