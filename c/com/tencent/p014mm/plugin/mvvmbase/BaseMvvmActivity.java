package com.tencent.p014mm.plugin.mvvmbase;

import bl3.C39818r;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import com.tencent.p014mm.sdk.statecenter.UIStateCenter;
import gj3.C59474h;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;
import wb2.C65946a;
import wq3.C91097v;
import yb2.C66605h;
import yb2.C79062b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\b\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002j\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003`\u0005H\u0016J\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\f*\u00020\u000b¨\u0006\u0011"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "Ljava/util/HashSet;", "Ljava/lang/Class;", "Lcom/tencent/mm/ui/component/UIComponent;", "Lkotlin/collections/HashSet;", "set", "Lrx3/b0;", "superImportUIComponents", "Lcom/tencent/mm/sdk/coroutines/LifecycleScope;", "getUICScope", "Lcom/tencent/mm/sdk/statecenter/BaseState;", "State", "Lcom/tencent/mm/sdk/statecenter/UIStateCenter;", "getStateCenter", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity */
public abstract class BaseMvvmActivity extends VASActivity {
    public final <State extends BaseState> UIStateCenter<State> getStateCenter() {
        for (UIComponent uIComponent : getUiComponents()) {
            if (uIComponent instanceof C66605h) {
                UIStateCenter<State> uIStateCenter = ((C66605h) uIComponent).f191525d;
                if (uIStateCenter instanceof UIStateCenter) {
                    return uIStateCenter;
                }
                return null;
            }
        }
        return null;
    }

    public final LifecycleScope getUICScope() {
        return ((C65946a) C39818r.f106831a.mo62444c(this).mo75002a(C65946a.class)).mo89983c3();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C65946a.class);
        hashSet.add(C91097v.class);
        hashSet.add(C59474h.class);
        for (Class add : C79062b.m95630a(getIntent())) {
            hashSet.add(add);
        }
    }
}
