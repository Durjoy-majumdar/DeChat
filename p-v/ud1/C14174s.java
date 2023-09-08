package ud1;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderTopicContentUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import gy3.C87412m;

/* renamed from: ud1.s */
public final class C14174s extends FinderTopicContentUIC {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14174s(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public int mo316c3(int i) {
        return 15;
    }

    /* renamed from: d3 */
    public int mo317d3() {
        return 138;
    }

    /* renamed from: e3 */
    public int mo2199e3() {
        return getActivity().getIntent().getIntExtra("key_latest_index", 0);
    }

    /* renamed from: f3 */
    public FinderTabUIC mo318f3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C14175t.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…cTopicTabUIC::class.java)");
        return (FinderTabUIC) a;
    }

    /* renamed from: i3 */
    public int mo320i3() {
        return 15;
    }

    /* renamed from: j3 */
    public boolean mo2200j3() {
        return 1 == this.f12457d;
    }
}
