package xm1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.nearby.newlivesquare.LiveEntranceFragmentViewCallback;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: xm1.p */
public final class C15845p extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveEntranceFragmentViewCallback f42669d;

    /* renamed from: e */
    public final /* synthetic */ int f42670e;

    /* renamed from: f */
    public final /* synthetic */ C0740i2 f42671f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16613e<C60905o> f42672g;

    /* renamed from: h */
    public final /* synthetic */ int f42673h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15845p(LiveEntranceFragmentViewCallback liveEntranceFragmentViewCallback, int i, C0740i2 i2Var, RecyclerView.C16613e<C60905o> eVar, int i2) {
        super(0);
        this.f42669d = liveEntranceFragmentViewCallback;
        this.f42670e = i;
        this.f42671f = i2Var;
        this.f42672g = eVar;
        this.f42673h = i2;
    }

    public Object invoke() {
        if (C87412m.m108589b((C0740i2) C110818d0.m150917O(this.f42669d.f15710i, this.f42670e), this.f42671f)) {
            this.f42669d.f15710i.remove(this.f42670e);
            this.f42672g.notifyItemRemoved(this.f42673h);
        }
        return C13598b0.f38549a;
    }
}
