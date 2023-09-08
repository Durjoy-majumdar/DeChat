package xo1;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: xo1.g */
public final class C66391g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f191123d;

    /* renamed from: e */
    public final /* synthetic */ C66388f f191124e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66391g(Bitmap bitmap, C66388f fVar) {
        super(0);
        this.f191123d = bitmap;
        this.f191124e = fVar;
    }

    public Object invoke() {
        this.f191124e.mo90486G3(this.f191123d.getWidth() > this.f191123d.getHeight());
        ImageView imageView = this.f191124e.f191115o;
        if (imageView != null) {
            imageView.setImageBitmap(this.f191123d);
        }
        return C13598b0.f38549a;
    }
}
