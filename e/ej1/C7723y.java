package ej1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import de3.C75375u;
import fy3.C32224a;
import go3.C76003c;
import gy3.C87413o;
import qk1.C12806i0;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: ej1.y */
public final class C7723y extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Context f26151d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f26152e;

    /* renamed from: f */
    public final /* synthetic */ C7721x f26153f;

    /* renamed from: g */
    public final /* synthetic */ C75375u f26154g;

    /* renamed from: h */
    public final /* synthetic */ int f26155h;

    /* renamed from: i */
    public final /* synthetic */ C12806i0.C12807a f26156i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7723y(Context context, Bitmap bitmap, C7721x xVar, C75375u uVar, int i, C12806i0.C12807a aVar) {
        super(0);
        this.f26151d = context;
        this.f26152e = bitmap;
        this.f26153f = xVar;
        this.f26154g = uVar;
        this.f26155h = i;
        this.f26156i = aVar;
    }

    public Object invoke() {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f26151d.getResources(), this.f26152e);
        bitmapDrawable.setBounds(0, 0, ((Number) ((C36570n) this.f26153f.f26148i).getValue()).intValue(), ((Number) ((C36570n) this.f26153f.f26148i).getValue()).intValue());
        C76003c cVar = new C76003c(bitmapDrawable, 1);
        C75375u uVar = this.f26154g;
        int i = this.f26155h;
        uVar.mo105705b(cVar, i, i + 1, 33);
        this.f26156i.f36658A.mo104279b(this.f26154g);
        this.f26156i.f36658A.invalidate();
        return C13598b0.f38549a;
    }
}
