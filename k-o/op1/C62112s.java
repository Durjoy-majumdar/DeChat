package op1;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import sk1.C63965x;
import te3.C64370fp1;

/* renamed from: op1.s */
public final class C62112s extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C62084h f176619d;

    /* renamed from: e */
    public final /* synthetic */ int f176620e;

    /* renamed from: f */
    public final /* synthetic */ C64370fp1 f176621f;

    /* renamed from: g */
    public final /* synthetic */ int f176622g;

    /* renamed from: h */
    public final /* synthetic */ Object f176623h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62112s(C62084h hVar, int i, C64370fp1 fp12, int i2, Object obj) {
        super(0);
        this.f176619d = hVar;
        this.f176620e = i;
        this.f176621f = fp12;
        this.f176622g = i2;
        this.f176623h = obj;
    }

    public Object invoke() {
        this.f176619d.f176535i.set(this.f176620e, new C63965x(this.f176621f));
        this.f176619d.notifyItemChanged(this.f176622g, this.f176623h);
        return C13598b0.f38549a;
    }
}
