package com.tencent.p014mm.plugin.finder.feed.p052ui;

import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;
import kq1.C10385a;
import kq1.C61132b;
import rs1.C13317l7;
import sx3.C110826x0;
import ts1.C14078c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderMixCellUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderMixCellUI */
public final class FinderMixCellUI extends MMFinderUI {
    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.remove(C13317l7.class);
        hashSet.addAll(C110826x0.m151017e(C61132b.class, C10385a.class, C14078c.class));
    }
}
