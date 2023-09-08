package com.tencent.p014mm.plugin.secdata.p843ui;

import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.mvvmbase.BaseMvvmPresenterActivity;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;
import p628nx.C61909d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/secdata/ui/WxPresenterSecDataActivity;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmPresenterActivity;", "<init>", "()V", "secdata-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.secdata.ui.WxPresenterSecDataActivity */
public abstract class WxPresenterSecDataActivity extends BaseMvvmPresenterActivity {
    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C61909d.class);
    }
}
