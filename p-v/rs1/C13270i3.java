package rs1;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.plugin.finder.view.FinderWordingLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import jq3.C60905o;
import rx3.C13598b0;
import sx3.C64175a0;
import te3.C49016cl;
import te3.C49160dl;

/* renamed from: rs1.i3 */
public final class C13270i3 extends C87413o implements C32226l<C2815r0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C49160dl f37656d;

    /* renamed from: e */
    public final /* synthetic */ FinderWordingLayout f37657e;

    /* renamed from: f */
    public final /* synthetic */ C13181d3 f37658f;

    /* renamed from: g */
    public final /* synthetic */ C60905o f37659g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13270i3(C49160dl dlVar, FinderWordingLayout finderWordingLayout, C13181d3 d3Var, C60905o oVar) {
        super(1);
        this.f37656d = dlVar;
        this.f37657e = finderWordingLayout;
        this.f37658f = d3Var;
        this.f37659g = oVar;
    }

    public Object invoke(Object obj) {
        C2815r0 r0Var = (C2815r0) obj;
        C87412m.m108594g(r0Var, LocaleUtil.ITALIAN);
        LinkedList<C49016cl> linkedList = this.f37656d.f132389f;
        C87412m.m108593f(linkedList, "buzzword.items");
        C64175a0.m75512t(linkedList, new C13258h3(r0Var));
        if (Util.isNullOrNil((List) this.f37657e.getDataList())) {
            FinderWordingLayout.m4234d(this.f37657e, false, 1, (Object) null);
            C39622i0 a = C39818r.f106831a.mo62443b(this.f37658f.getContext()).mo75002a(FinderDescPanelUIC.class);
            C87412m.m108593f(a, "UICProvider.of(context).…DescPanelUIC::class.java)");
            C60905o oVar = this.f37659g;
            Map<Long, Integer> map = FinderDescPanelUIC.f18610J;
            ((FinderDescPanelUIC) a).mo5125m3(oVar, 0, false);
        }
        return C13598b0.f38549a;
    }
}
