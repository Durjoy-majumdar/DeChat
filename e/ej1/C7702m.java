package ej1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import de3.C75375u;
import fy3.C32224a;
import go3.C76003c;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87413o;
import qk1.C12806i0;
import rx3.C13598b0;

/* renamed from: ej1.m */
public final class C7702m extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f26117d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f26118e;

    /* renamed from: f */
    public final /* synthetic */ C7692l f26119f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<C75375u> f26120g;

    /* renamed from: h */
    public final /* synthetic */ C8478d0 f26121h;

    /* renamed from: i */
    public final /* synthetic */ C12806i0.C12807a f26122i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7702m(Context context, Bitmap bitmap, C7692l lVar, C8479f0<C75375u> f0Var, C8478d0 d0Var, C12806i0.C12807a aVar) {
        super(0);
        this.f26117d = context;
        this.f26118e = bitmap;
        this.f26119f = lVar;
        this.f26120g = f0Var;
        this.f26121h = d0Var;
        this.f26122i = aVar;
    }

    public Object invoke() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f26117d.getResources(), this.f26118e);
        bitmapDrawable.setBounds(0, 0, this.f26119f.mo8815n(), this.f26119f.mo8815n());
        C76003c cVar = new C76003c(bitmapDrawable, 1);
        int i = this.f26121h.f27483d;
        ((C75375u) this.f26120g.f27484d).mo105705b(cVar, i, i + 1, 33);
        this.f26122i.f36658A.mo104279b((CharSequence) this.f26120g.f27484d);
        this.f26122i.f36658A.invalidate();
        return C13598b0.f38549a;
    }
}
