package ki1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ki1.a */
public final class C61097a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f173964d;

    /* renamed from: e */
    public final /* synthetic */ C61100d f173965e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61097a(Bitmap bitmap, C61100d dVar) {
        super(0);
        this.f173964d = bitmap;
        this.f173965e = dVar;
    }

    public Object invoke() {
        if (this.f173964d != null) {
            this.f173965e.f173972g.f175525d.setImageDrawable(new BitmapDrawable(this.f173965e.getContext().getResources(), this.f173964d));
        }
        return C13598b0.f38549a;
    }
}
