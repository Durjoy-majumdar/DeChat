package com.tencent.p014mm.plugin.secdata.p843ui;

import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmActivity;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;
import p640ox.C77049b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\b\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002j\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003`\u0005H\u0016¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Ljava/util/HashSet;", "Ljava/lang/Class;", "Lcom/tencent/mm/ui/component/UIComponent;", "Lkotlin/collections/HashSet;", "set", "Lrx3/b0;", "superImportUIComponents", "<init>", "()V", "secdata-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.secdata.ui.MMSecDataActivity */
public abstract class MMSecDataActivity extends BaseMvvmActivity {
    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(((C77049b) C86312j.m106911c(C77049b.class)).mo72355fL());
    }
}
