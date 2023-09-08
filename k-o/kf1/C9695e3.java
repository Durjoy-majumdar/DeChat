package kf1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.e3 */
public final class C9695e3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderHalfScreenContract$Presenter f30101d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9695e3(FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter) {
        super(0);
        this.f30101d = finderHalfScreenContract$Presenter;
    }

    public Object invoke() {
        C32227p<? super Integer, ? super String, C13598b0> pVar = this.f30101d.f13092x;
        if (pVar != null) {
            pVar.invoke(-4036, this.f30101d.f29961d.getResources().getString(C0966R.string.erm));
        }
        return C13598b0.f38549a;
    }
}
