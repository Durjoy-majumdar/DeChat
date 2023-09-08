package cj1;

import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: cj1.k */
public final class C54780k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54769i f153551d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54780k(C54769i iVar) {
        super(0);
        this.f153551d = iVar;
    }

    public Object invoke() {
        C56032b bVar = this.f153551d.f153504b;
        if (bVar != null) {
            C56032b.showProgressWithBlurBg$default(bVar, (String) null, 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
