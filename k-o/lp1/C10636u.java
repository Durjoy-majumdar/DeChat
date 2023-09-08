package lp1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: lp1.u */
public final class C10636u extends C87413o implements C32226l<Bitmap, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f32047d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10636u(ImageView imageView) {
        super(1);
        this.f32047d = imageView;
    }

    public Object invoke(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = this.f32047d;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        return C13598b0.f38549a;
    }
}
