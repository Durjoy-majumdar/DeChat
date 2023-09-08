package fh1;

import com.tencent.p014mm.plugin.finder.live.controller.LivePromoteBannerController$initView$5;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import jq3.C60905o;
import jq3.C9493c;

/* renamed from: fh1.a2 */
public final class C58996a2 extends WxRecyclerAdapter<C9493c> {

    /* renamed from: G */
    public final /* synthetic */ C59018f2 f168792G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58996a2(C59018f2 f2Var, LivePromoteBannerController$initView$5 livePromoteBannerController$initView$5, ArrayList<C9493c> arrayList) {
        super(livePromoteBannerController$initView$5, arrayList, false);
        this.f168792G = f2Var;
    }

    /* renamed from: F4 */
    public int mo82597F4() {
        if (this.f168792G.f168889y.size() > 0) {
            return Integer.MAX_VALUE;
        }
        return super.mo82597F4();
    }

    /* renamed from: G4 */
    public long mo82598G4(int i) {
        return 0;
    }

    /* renamed from: O4 */
    public int mo82600O4(int i) {
        return 1;
    }

    /* renamed from: o6 */
    public void mo10426w5(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
        if (this.f168792G.f168889y.size() > 0) {
            i %= this.f168792G.f168889y.size();
        }
        super.mo10426w5(oVar, i);
    }

    /* renamed from: p6 */
    public void mo82615y5(C60905o oVar, int i, List<Object> list) {
        C87412m.m108594g(oVar, "holder");
        C87412m.m108594g(list, "payloads");
        if (this.f168792G.f168889y.size() > 0) {
            i %= this.f168792G.f168889y.size();
        }
        super.mo82615y5(oVar, i, list);
    }
}
