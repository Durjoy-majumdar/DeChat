package lp1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: lp1.g */
public final class C10614g extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f31998d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10614g(ImageView imageView) {
        super(1);
        this.f31998d = imageView;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = this.f31998d;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return C13598b0.f38549a;
    }
}
