package nb2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nb2.f */
public final class C47217f extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f126778d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f126779e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47217f(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.f126778d = imageView;
        this.f126779e = bitmap;
    }

    public Object invoke() {
        this.f126778d.setImageBitmap(this.f126779e);
        return C13598b0.f38549a;
    }
}
