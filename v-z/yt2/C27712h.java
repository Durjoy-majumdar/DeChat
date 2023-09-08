package yt2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.Map;
import nj3.C11182m0;
import nj3.C76874e0;

/* renamed from: yt2.h */
public final class C27712h implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C53578f f76723d;

    public C27712h(C53578f fVar) {
        this.f76723d = fVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$1");
        e0Var.clear();
        for (Map.Entry value : C53578f.m60109d3(this.f76723d).entrySet()) {
            e0Var.mo107174t(((C39160b) value.getValue()).mo61964a());
        }
        SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$setupBottomSheet$1");
    }
}
