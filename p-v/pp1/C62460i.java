package pp1;

import android.graphics.Bitmap;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: pp1.i */
public final class C62460i extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f177473d;

    /* renamed from: e */
    public final /* synthetic */ C62461j f177474e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62460i(Bitmap bitmap, C62461j jVar) {
        super(0);
        this.f177473d = bitmap;
        this.f177474e = jVar;
    }

    public Object invoke() {
        C13598b0 b0Var;
        Bitmap bitmap = this.f177473d;
        if (bitmap != null) {
            C62461j jVar = this.f177474e;
            if (jVar.mo87509m().getLayoutParams().height > 0) {
                jVar.mo87509m().getLayoutParams().width = (int) ((((float) jVar.mo87509m().getLayoutParams().height) * ((float) bitmap.getWidth())) / ((float) bitmap.getHeight()));
            }
            jVar.mo87509m().setImageBitmap(bitmap);
            jVar.mo87509m().setVisibility(0);
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f177474e.mo87509m().setVisibility(8);
        }
        return C13598b0.f38549a;
    }
}
