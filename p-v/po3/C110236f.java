package po3;

import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: po3.f */
public final class C110236f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CropLayout f329757d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110236f(CropLayout cropLayout) {
        super(0);
        this.f329757d = cropLayout;
    }

    public Object invoke() {
        this.f329757d.getContentRectF().round(this.f329757d.getContentCenterRect());
        return C13598b0.f38549a;
    }
}
