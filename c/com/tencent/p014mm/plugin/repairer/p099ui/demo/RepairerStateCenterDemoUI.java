package com.tencent.p014mm.plugin.repairer.p099ui.demo;

import bj2.C67249a;
import bj2.C67253c;
import bj2.C67263e;
import bj2.C67275l;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.repairer.p099ui.BaseRepairerUI;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/repairer/ui/demo/RepairerStateCenterDemoUI;", "Lcom/tencent/mm/plugin/repairer/ui/BaseRepairerUI;", "<init>", "()V", "ui-repairer_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.repairer.ui.demo.RepairerStateCenterDemoUI */
public final class RepairerStateCenterDemoUI extends BaseRepairerUI {
    public int getLayoutId() {
        return C0966R.C0971layout.bsu;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C67275l.class);
        hashSet.add(C67249a.class);
        hashSet.add(C67253c.class);
        hashSet.add(C67263e.class);
    }
}
