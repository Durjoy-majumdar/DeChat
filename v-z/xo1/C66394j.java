package xo1;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import xo1.C66396l;

/* renamed from: xo1.j */
public final class C66394j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C66396l.C66397a.C66398a f191128d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f191129e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66394j(C66396l.C66397a.C66398a aVar, Bitmap bitmap) {
        super(0);
        this.f191128d = aVar;
        this.f191129e = bitmap;
    }

    public Object invoke() {
        this.f191128d.f191140C.setImageBitmap(this.f191129e);
        C66396l.C66397a.C66398a aVar = this.f191128d;
        float width = ((float) this.f191129e.getWidth()) / ((float) this.f191129e.getHeight());
        ViewGroup.LayoutParams layoutParams = aVar.f191138A.getLayoutParams();
        if (width > 1.0f) {
            layoutParams.width = (int) aVar.f191143z.getContext().getResources().getDimension(C0966R.dimen.f3721of);
            layoutParams.height = (int) aVar.f191143z.getContext().getResources().getDimension(C0966R.dimen.f3713c6);
        } else {
            layoutParams.width = (int) aVar.f191143z.getContext().getResources().getDimension(C0966R.dimen.f3713c6);
            layoutParams.height = (int) aVar.f191143z.getContext().getResources().getDimension(C0966R.dimen.f3721of);
        }
        aVar.f191138A.setLayoutParams(layoutParams);
        return C13598b0.f38549a;
    }
}
