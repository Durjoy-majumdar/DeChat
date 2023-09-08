package po3;

import com.tencent.p014mm.p136ui.widget.cropview.CropLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: po3.g */
public final class C110237g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ CropLayout f329758d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110237g(CropLayout cropLayout) {
        super(0);
        this.f329758d = cropLayout;
    }

    public Object invoke() {
        this.f329758d.getContentRectF().round(this.f329758d.getContentCenterRect());
        return C13598b0.f38549a;
    }
}
