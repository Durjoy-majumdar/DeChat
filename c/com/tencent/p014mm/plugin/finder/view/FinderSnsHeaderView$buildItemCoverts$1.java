package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.C0966R;
import er1.C58784w3;
import jq3.C60896i;
import jq3.C9500j;
import kg3.C76577a;
import kotlin.Metadata;
import ve1.C14508e8;
import ve1.C14590p;
import ve1.C14615q8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/FinderSnsHeaderView$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderSnsHeaderView$buildItemCoverts$1 */
public final class FinderSnsHeaderView$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderSnsHeaderView this$0;

    public FinderSnsHeaderView$buildItemCoverts$1(FinderSnsHeaderView finderSnsHeaderView) {
        this.this$0 = finderSnsHeaderView;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == 2004) {
            return new C14508e8();
        }
        if (i != 2015) {
            C58784w3.f168295a.mo83916b(this.this$0.f17933d, i);
            return new C14590p();
        }
        C14615q8 q8Var = new C14615q8();
        FinderSnsHeaderView finderSnsHeaderView = this.this$0;
        q8Var.f40453e = 1;
        float min = ((float) (Math.min(finderSnsHeaderView.getContext().getResources().getDisplayMetrics().heightPixels, finderSnsHeaderView.getContext().getResources().getDisplayMetrics().widthPixels) - C76577a.m92151b(finderSnsHeaderView.getContext(), 16))) / 3.5f;
        if (min <= 0.0f) {
            min = finderSnsHeaderView.getContext().getResources().getDimension(C0966R.dimen.f3713c6);
        }
        q8Var.f40454f = (int) ((min * ((float) 4)) / ((float) 3));
        return q8Var;
    }
}
