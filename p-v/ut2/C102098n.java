package ut2;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: ut2.n */
public final class C102098n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ ImproveMainUIC f300649d;

    /* renamed from: e */
    public final /* synthetic */ int f300650e;

    /* renamed from: f */
    public final /* synthetic */ int f300651f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f300652g;

    /* renamed from: ut2.n$a */
    public static final class C102099a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ImproveMainUIC f300653d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C102099a(ImproveMainUIC improveMainUIC) {
            super(0);
            this.f300653d = improveMainUIC;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1$onGlobalLayout$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1$onGlobalLayout$1");
            ImproveMainUIC improveMainUIC = this.f300653d;
            ImproveMainUIC.m122709d3(improveMainUIC, improveMainUIC.getRecycleView(), 0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1$onGlobalLayout$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1$onGlobalLayout$1");
            return b0Var;
        }
    }

    public C102098n(ImproveMainUIC improveMainUIC, int i, int i2, C8478d0 d0Var) {
        this.f300649d = improveMainUIC;
        this.f300650e = i;
        this.f300651f = i2;
        this.f300652g = d0Var;
    }

    public void onGlobalLayout() {
        View view;
        SnsMethodCalculate.markStartTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
        WxLinearLayoutManager layoutManager = this.f300649d.getLayoutManager();
        int i = this.f300650e;
        int i2 = this.f300651f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$restoreRecyclerViewPosition$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int i3 = 0;
        layoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$restoreRecyclerViewPosition$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        int C = this.f300649d.getLayoutManager().mo16957C();
        RecyclerView.C16631z I0 = this.f300649d.getRecycleView().mo17023I0(this.f300650e);
        if (!(I0 == null || (view = I0.f44854d) == null)) {
            i3 = view.getTop();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("resume recyclerView position:");
        sb.append(this.f300650e);
        sb.append(" offset:");
        sb.append(this.f300651f);
        sb.append(" nowPos:");
        sb.append(C);
        sb.append(" nowOffset:");
        sb.append(i3);
        sb.append(" index:");
        C8478d0 d0Var = this.f300652g;
        int i4 = d0Var.f27483d;
        d0Var.f27483d = i4 + 1;
        sb.append(i4);
        Log.m105924i("MicroMsg.Improve.MainUIC", sb.toString());
        if ((C == this.f300650e && i3 == this.f300651f) || this.f300652g.f27483d >= 10) {
            this.f300649d.getRecycleView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C61926c.m72666K(200, new C102099a(this.f300649d));
        }
        SnsMethodCalculate.markEndTimeMs("onGlobalLayout", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$restoreRecyclerViewPosition$1");
    }
}
