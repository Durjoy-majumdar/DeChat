package lm1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import jq3.C60905o;
import rx3.C13598b0;

/* renamed from: lm1.o */
public final class C10570o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ArrayList<C0740i2> f31881d;

    /* renamed from: e */
    public final /* synthetic */ C0740i2 f31882e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f31883f;

    /* renamed from: g */
    public final /* synthetic */ int f31884g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10570o(ArrayList<C0740i2> arrayList, C0740i2 i2Var, RecyclerView.C16613e<C60905o> eVar, int i) {
        super(0);
        this.f31881d = arrayList;
        this.f31882e = i2Var;
        this.f31883f = eVar;
        this.f31884g = i;
    }

    public Object invoke() {
        this.f31881d.remove(this.f31882e);
        this.f31883f.notifyItemRemoved(this.f31884g);
        return C13598b0.f38549a;
    }
}
