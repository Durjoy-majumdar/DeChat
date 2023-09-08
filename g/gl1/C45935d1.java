package gl1;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGameWelfareTaskProgressView;
import fy3.C32224a;
import gy3.C87413o;
import qj1.C47844c7;
import vk1.C65761b;

/* renamed from: gl1.d1 */
public final class C45935d1 extends C87413o implements C32224a<C47844c7> {

    /* renamed from: d */
    public final /* synthetic */ C65761b f123935d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveGameWelfareTaskProgressView f123936e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45935d1(C65761b bVar, FinderLiveGameWelfareTaskProgressView finderLiveGameWelfareTaskProgressView) {
        super(0);
        this.f123935d = bVar;
        this.f123936e = finderLiveGameWelfareTaskProgressView;
    }

    public Object invoke() {
        return new C47844c7(new FrameLayout(this.f123935d.getContext()), this.f123936e, this.f123935d);
    }
}
