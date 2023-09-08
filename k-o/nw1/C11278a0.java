package nw1;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: nw1.a0 */
public final class C11278a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ImageView f33207d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f33208e;

    /* renamed from: f */
    public final /* synthetic */ int f33209f;

    /* renamed from: g */
    public final /* synthetic */ int f33210g;

    /* renamed from: h */
    public final /* synthetic */ C32227p<Integer, Integer, Object> f33211h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11278a0(ImageView imageView, Bitmap bitmap, int i, int i2, C32227p<? super Integer, ? super Integer, ? extends Object> pVar) {
        super(0);
        this.f33207d = imageView;
        this.f33208e = bitmap;
        this.f33209f = i;
        this.f33210g = i2;
        this.f33211h = pVar;
    }

    public Object invoke() {
        this.f33207d.setImageBitmap(this.f33208e);
        this.f33207d.setLayoutParams(new FrameLayout.LayoutParams(this.f33209f, this.f33210g));
        this.f33211h.invoke(Integer.valueOf(this.f33209f), Integer.valueOf(this.f33210g));
        return C13598b0.f38549a;
    }
}
