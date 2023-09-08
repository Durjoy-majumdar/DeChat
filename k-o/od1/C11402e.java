package od1;

import android.widget.ImageView;
import fy3.C32224a;
import gy3.C87413o;
import lu3.C34379c;
import rx3.C13598b0;

/* renamed from: od1.e */
public final class C11402e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11397c<Object> f33556d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f33557e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11402e(C11397c<Object> cVar, ImageView imageView) {
        super(0);
        this.f33556d = cVar;
        this.f33557e = imageView;
    }

    public Object invoke() {
        C34379c<?> cVar = this.f33556d.f33546o;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f33557e.setVisibility(0);
        this.f33556d.mo11407n3(true);
        return C13598b0.f38549a;
    }
}
