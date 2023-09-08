package am1;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: am1.a */
public final class C54136a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54137b f152050d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54136a(C54137b bVar) {
        super(0);
        this.f152050d = bVar;
    }

    public Object invoke() {
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f152050d.f152053c.f160545g;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.onChanged();
        }
        return C13598b0.f38549a;
    }
}
