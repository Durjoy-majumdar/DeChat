package ub2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMVCardChooseView;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ub2.q */
public final class C65305q extends C87413o implements C32226l<Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f187965d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f187966e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f187967f;

    /* renamed from: g */
    public final /* synthetic */ MusicMVCardChooseView f187968g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65305q(boolean z, C8478d0 d0Var, C8478d0 d0Var2, MusicMVCardChooseView musicMVCardChooseView) {
        super(1);
        this.f187965d = z;
        this.f187966e = d0Var;
        this.f187967f = d0Var2;
        this.f187968g = musicMVCardChooseView;
    }

    public Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        if (!this.f187965d) {
            int i = (int) (((float) this.f187966e.f27483d) * floatValue);
            C8478d0 d0Var = this.f187967f;
            int i2 = i - d0Var.f27483d;
            d0Var.f27483d = i;
            RecyclerView recyclerView = this.f187968g.f163487e;
            if (recyclerView != null) {
                recyclerView.scrollBy(0, i2);
            }
        }
        return C13598b0.f38549a;
    }
}
