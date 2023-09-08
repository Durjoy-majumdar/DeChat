package p165hr;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: hr.z */
public final class C8728z extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f27992d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f27993e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f27994f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8728z(ImageView imageView, Bitmap bitmap, C32226l<? super Bitmap, C13598b0> lVar) {
        super(0);
        this.f27992d = imageView;
        this.f27993e = bitmap;
        this.f27994f = lVar;
    }

    public Object invoke() {
        if (this.f27992d.getLayoutParams().height > 0) {
            this.f27992d.getLayoutParams().width = (int) Math.ceil((double) ((((float) this.f27992d.getLayoutParams().height) * ((float) this.f27993e.getWidth())) / ((float) this.f27993e.getHeight())));
        }
        this.f27992d.setImageBitmap(this.f27993e);
        this.f27992d.setVisibility(0);
        C32226l<Bitmap, C13598b0> lVar = this.f27994f;
        if (lVar != null) {
            lVar.invoke(this.f27993e);
        }
        return C13598b0.f38549a;
    }
}
