package bt1;

import android.graphics.Bitmap;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bt1.k */
public final class C54574k extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<Bitmap> f153027d;

    /* renamed from: e */
    public final /* synthetic */ C54585t f153028e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54574k(C8479f0<Bitmap> f0Var, C54585t tVar) {
        super(0);
        this.f153027d = f0Var;
        this.f153028e = tVar;
    }

    public Object invoke() {
        Bitmap bitmap = (Bitmap) this.f153027d.f27484d;
        if (bitmap != null) {
            this.f153028e.mo75445i(bitmap);
        }
        return C13598b0.f38549a;
    }
}
