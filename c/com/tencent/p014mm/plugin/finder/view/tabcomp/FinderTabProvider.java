package com.tencent.p014mm.plugin.finder.view.tabcomp;

import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.sample.FinderSampleTabUI;
import gy3.C87412m;
import java.util.List;
import kotlin.Metadata;
import ls1.C10647i;
import ls1.C10648k;
import ls1.C61391g;
import ls1.C61393j;
import ls1.C61394l;
import ls1.C61395m;
import rx3.C13598b0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/tabcomp/FinderTabProvider;", "Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "fragments", "Lls1/m;", "tabContainer", "Lls1/g;", "tabs", "Lls1/l;", "tabViewAction", "Ljava/util/List;", "getFragments", "()Ljava/util/List;", "setFragments", "(Ljava/util/List;)V", "Lls1/m;", "getTabContainer", "()Lls1/m;", "setTabContainer", "(Lls1/m;)V", "getTabs", "setTabs", "Lls1/l;", "getTabViewAction", "()Lls1/l;", "setTabViewAction", "(Lls1/l;)V", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider */
public class FinderTabProvider implements IFinderTabProvider {
    private List<? extends FinderHomeTabFragment> fragments;
    private C61395m tabContainer = new C61393j();
    private C61394l tabViewAction = new C10648k();
    private List<? extends C61391g> tabs = C64197v.m75534c(new C10647i((CharSequence) "喜欢"), new C10647i((CharSequence) "点赞"), new C10647i((CharSequence) "提到"));

    public FinderTabProvider() {
        FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment = new FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment.f17332j = 101;
        C13598b0 b0Var = C13598b0.f38549a;
        FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment2 = new FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment2.f17332j = 102;
        FinderSampleTabUI.FinderSampleTabFragment finderSampleTabFragment3 = new FinderSampleTabUI.FinderSampleTabFragment();
        finderSampleTabFragment3.f17332j = 103;
        this.fragments = C64197v.m75534c(finderSampleTabFragment, finderSampleTabFragment2, finderSampleTabFragment3);
    }

    public List<FinderHomeTabFragment> fragments() {
        return this.fragments;
    }

    public final List<FinderHomeTabFragment> getFragments() {
        return this.fragments;
    }

    public final C61395m getTabContainer() {
        return this.tabContainer;
    }

    public final C61394l getTabViewAction() {
        return this.tabViewAction;
    }

    public final List<C61391g> getTabs() {
        return this.tabs;
    }

    public boolean isDynamic() {
        return false;
    }

    public final void setFragments(List<? extends FinderHomeTabFragment> list) {
        C87412m.m108594g(list, "<set-?>");
        this.fragments = list;
    }

    public final void setTabContainer(C61395m mVar) {
        C87412m.m108594g(mVar, "<set-?>");
        this.tabContainer = mVar;
    }

    public final void setTabViewAction(C61394l lVar) {
        C87412m.m108594g(lVar, "<set-?>");
        this.tabViewAction = lVar;
    }

    public final void setTabs(List<? extends C61391g> list) {
        C87412m.m108594g(list, "<set-?>");
        this.tabs = list;
    }

    public C61395m tabContainer() {
        return this.tabContainer;
    }

    public C61394l tabViewAction() {
        return this.tabViewAction;
    }

    public List<C61391g> tabs() {
        return this.tabs;
    }
}
