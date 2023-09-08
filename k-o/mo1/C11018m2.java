package mo1;

import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: mo1.m2 */
public final class C11018m2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f32742d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11018m2(ImageView imageView) {
        super(0);
        this.f32742d = imageView;
    }

    public Object invoke() {
        ImageView imageView = this.f32742d;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        return C13598b0.f38549a;
    }
}
