package oh1;

import android.view.ViewGroup;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: oh1.b */
public final class C11414b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C11415c f33579d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11414b(C11415c cVar) {
        super(0);
        this.f33579d = cVar;
    }

    public Object invoke() {
        C11415c cVar = this.f33579d;
        cVar.f33584q.stopTimer();
        ViewGroup viewGroup = cVar.f33581n;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return C13598b0.f38549a;
    }
}
