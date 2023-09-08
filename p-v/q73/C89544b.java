package q73;

import android.content.MutableContextWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: q73.b */
public final class C89544b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ MutableContextWrapper f257688d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f257689e;

    /* renamed from: f */
    public final /* synthetic */ C89558k0 f257690f;

    /* renamed from: g */
    public final /* synthetic */ C89538a f257691g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89544b(MutableContextWrapper mutableContextWrapper, ViewGroup viewGroup, C89558k0 k0Var, C89538a aVar) {
        super(0);
        this.f257688d = mutableContextWrapper;
        this.f257689e = viewGroup;
        this.f257690f = k0Var;
        this.f257691g = aVar;
    }

    public Object invoke() {
        this.f257688d.setBaseContext(this.f257689e.getContext());
        ViewParent parent = this.f257690f.mo123872b().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f257690f.mo123872b());
        }
        this.f257689e.addView(this.f257690f.mo123872b());
        this.f257691g.mo123851n(this.f257690f.mo123872b());
        return C13598b0.f38549a;
    }
}
