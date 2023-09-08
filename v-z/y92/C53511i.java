package y92;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: y92.i */
public final class C53511i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f150459d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f150460e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53511i(ImageView imageView, Bitmap bitmap) {
        super(0);
        this.f150459d = imageView;
        this.f150460e = bitmap;
    }

    public Object invoke() {
        this.f150459d.setScaleType(((float) this.f150460e.getWidth()) / ((float) this.f150460e.getHeight()) > ((float) this.f150459d.getWidth()) / ((float) this.f150459d.getHeight()) ? ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP);
        return C13598b0.f38549a;
    }
}
