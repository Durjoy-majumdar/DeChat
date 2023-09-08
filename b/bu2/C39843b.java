package bu2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.improve.cover.SnsImproveCoverLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gy3.C87413o;
import kg3.C76577a;

/* renamed from: bu2.b */
public final class C39843b extends C87413o implements C32224a<Integer> {

    /* renamed from: d */
    public final /* synthetic */ SnsImproveCoverLayout f106860d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39843b(SnsImproveCoverLayout snsImproveCoverLayout) {
        super(0);
        this.f106860d = snsImproveCoverLayout;
    }

    public Object invoke() {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$foldHeight$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$foldHeight$2");
        Integer valueOf = Integer.valueOf(C76577a.m92155f(this.f106860d.getContext(), C0966R.dimen.aoc));
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$foldHeight$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.cover.SnsImproveCoverLayout$foldHeight$2");
        return valueOf;
    }
}
