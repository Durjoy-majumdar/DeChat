package be1;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderTopicContentUIC;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import gy3.C87412m;

/* renamed from: be1.f */
public final class C0271f extends FinderTopicContentUIC {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0271f(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public int mo316c3(int i) {
        return 1;
    }

    /* renamed from: d3 */
    public int mo317d3() {
        return 22;
    }

    /* renamed from: f3 */
    public FinderTabUIC mo318f3() {
        C39622i0 a = C39818r.f106831a.mo62444c(getActivity()).mo75002a(C0272g.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…rTopicTabUIC::class.java)");
        return (FinderTabUIC) a;
    }

    /* renamed from: g3 */
    public String mo319g3() {
        String stringExtra = getIntent().getStringExtra("key_topic_title");
        return stringExtra == null ? "" : stringExtra;
    }

    /* renamed from: i3 */
    public int mo320i3() {
        return 1;
    }
}
