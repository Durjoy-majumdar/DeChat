package po3;

import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: po3.h */
public final class C110238h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CropLayout f329759d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110238h(CropLayout cropLayout) {
        super(0);
        this.f329759d = cropLayout;
    }

    public Object invoke() {
        this.f329759d.getContentRectF().round(this.f329759d.getContentCenterRect());
        return C13598b0.f38549a;
    }
}
