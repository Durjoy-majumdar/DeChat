package zl3;

import com.tencent.p014mm.p136ui.halfscreen.HalfScreenTransparentActivity;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: zl3.b */
public final class C79400b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ HalfScreenTransparentActivity f232920d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79400b(HalfScreenTransparentActivity halfScreenTransparentActivity) {
        super(0);
        this.f232920d = halfScreenTransparentActivity;
    }

    public Object invoke() {
        C79400b.super.finish();
        this.f232920d.overridePendingTransition(0, 0);
        return C13598b0.f38549a;
    }
}
