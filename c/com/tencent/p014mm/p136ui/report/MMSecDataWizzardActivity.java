package com.tencent.p014mm.p136ui.report;

import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmWizardActivity;
import gy3.C87412m;
import hm2.C46083a;
import java.util.HashSet;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/ui/report/MMSecDataWizzardActivity;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmWizardActivity;", "<init>", "()V", "ui-sec-data_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.report.MMSecDataWizzardActivity */
public abstract class MMSecDataWizzardActivity extends BaseMvvmWizardActivity {
    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C46083a.class);
    }
}
