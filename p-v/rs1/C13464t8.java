package rs1;

import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import rx3.C13598b0;

/* renamed from: rs1.t8 */
public final class C13464t8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13442s8 f38163d;

    /* renamed from: e */
    public final /* synthetic */ WxRecyclerAdapter<?> f38164e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13464t8(C13442s8 s8Var, WxRecyclerAdapter<?> wxRecyclerAdapter) {
        super(0);
        this.f38163d = s8Var;
        this.f38164e = wxRecyclerAdapter;
    }

    public Object invoke() {
        this.f38163d.f38101p0.add(new WeakReference(this.f38164e));
        Iterator<WeakReference<WxRecyclerAdapter<?>>> it = this.f38163d.f38101p0.iterator();
        C87412m.m108593f(it, "dataAdapterListener.iterator()");
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
        return C13598b0.f38549a;
    }
}
