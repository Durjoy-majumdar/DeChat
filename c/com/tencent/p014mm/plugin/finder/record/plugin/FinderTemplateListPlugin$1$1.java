package com.tencent.p014mm.plugin.finder.record.plugin;

import android.content.Context;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/record/plugin/FinderTemplateListPlugin$1$1", "Lcom/tencent/mm/plugin/finder/record/plugin/DynMarginLayoutManager;", "plugin-vlog-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.record.plugin.FinderTemplateListPlugin$1$1 */
public final class FinderTemplateListPlugin$1$1 extends DynMarginLayoutManager {

    /* renamed from: y */
    public final /* synthetic */ FinderTemplateListPlugin f160711y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTemplateListPlugin$1$1(FinderTemplateListPlugin finderTemplateListPlugin, Context context, int i) {
        super(context, i);
        this.f160711y = finderTemplateListPlugin;
        C87412m.m108593f(context, "context");
    }

    public boolean canScrollHorizontally() {
        return this.f160711y.f160701j && super.canScrollHorizontally();
    }
}
