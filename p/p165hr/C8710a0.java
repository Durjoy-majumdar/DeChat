package p165hr;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: hr.a0 */
public final class C8710a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f27939d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f27940e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8710a0(C32226l<? super Bitmap, C13598b0> lVar, ImageView imageView) {
        super(0);
        this.f27939d = lVar;
        this.f27940e = imageView;
    }

    public Object invoke() {
        C32226l<Bitmap, C13598b0> lVar = this.f27939d;
        if (lVar != null) {
            lVar.invoke(null);
        }
        this.f27940e.setVisibility(8);
        return C13598b0.f38549a;
    }
}
