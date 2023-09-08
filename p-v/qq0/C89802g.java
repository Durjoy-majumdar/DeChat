package qq0;

import android.animation.Animator;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: qq0.g */
public final class C89802g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C89797e f258206d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89802g(C89797e eVar) {
        super(0);
        this.f258206d = eVar;
    }

    public Object invoke() {
        C89814s sVar = this.f258206d.f258191f;
        if (sVar != null) {
            Animator animator = sVar.f258218e;
            if (animator != null) {
                animator.resume();
            }
            return C13598b0.f38549a;
        }
        C87412m.m108603p("blinkWrapper");
        throw null;
    }
}
