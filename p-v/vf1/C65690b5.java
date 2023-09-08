package vf1;

import android.content.Context;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderSharePostUI;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: vf1.b5 */
public final class C65690b5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderSharePostUI f189034d;

    /* renamed from: e */
    public final /* synthetic */ int f189035e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65690b5(FinderSharePostUI finderSharePostUI, int i) {
        super(0);
        this.f189034d = finderSharePostUI;
        this.f189035e = i;
    }

    public Object invoke() {
        C76912y0.makeText((Context) this.f189034d, this.f189035e, 0).show();
        FinderSharePostUI finderSharePostUI = this.f189034d;
        int i = FinderSharePostUI.f159030v;
        finderSharePostUI.mo77439N7();
        return C13598b0.f38549a;
    }
}
