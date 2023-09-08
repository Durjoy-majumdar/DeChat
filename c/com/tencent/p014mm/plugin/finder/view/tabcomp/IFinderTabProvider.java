package com.tencent.p014mm.plugin.finder.view.tabcomp;

import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import java.util.List;
import kotlin.Metadata;
import ls1.C61391g;
import ls1.C61394l;
import ls1.C61395m;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider */
public interface IFinderTabProvider {
    List<FinderHomeTabFragment> fragments();

    boolean isDynamic();

    C61395m tabContainer();

    C61394l tabViewAction();

    List<C61391g> tabs();
}
