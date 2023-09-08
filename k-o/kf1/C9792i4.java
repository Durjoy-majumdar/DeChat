package kf1;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import kg3.C76577a;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: kf1.i4 */
public final class C9792i4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f30321d;

    /* renamed from: e */
    public final /* synthetic */ int f30322e;

    /* renamed from: f */
    public final /* synthetic */ C9765h4 f30323f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f30324g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9792i4(Bitmap bitmap, int i, C9765h4 h4Var, ImageView imageView) {
        super(0);
        this.f30321d = bitmap;
        this.f30322e = i;
        this.f30323f = h4Var;
        this.f30324g = imageView;
    }

    public Object invoke() {
        if (!(this.f30321d.getHeight() == 0 || this.f30321d.getWidth() == 0)) {
            int i = this.f30322e;
            C9765h4 h4Var = this.f30323f;
            float f = C9765h4.f30239x0;
            h4Var.getClass();
            if (i == 0) {
                ViewGroup.LayoutParams layoutParams = this.f30324g.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                float b = ((float) C76577a.m92151b(this.f30323f.getContext(), 20)) / ((float) this.f30321d.getHeight());
                layoutParams.height = C76577a.m92151b(this.f30323f.getContext(), 20);
                layoutParams.width = (int) (((float) this.f30321d.getWidth()) * b);
                this.f30324g.setLayoutParams(layoutParams);
            }
        }
        LinkedList<C13604l<ImageView, Bitmap>> linkedList = this.f30323f.f30259U;
        ImageView imageView = this.f30324g;
        Bitmap bitmap = this.f30321d;
        C87412m.m108593f(bitmap, "resource");
        linkedList.add(new C13604l(imageView, bitmap));
        this.f30323f.mo10367j3();
        return C13598b0.f38549a;
    }
}
