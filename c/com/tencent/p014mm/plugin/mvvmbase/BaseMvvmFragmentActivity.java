package com.tencent.p014mm.plugin.mvvmbase;

import android.content.Intent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.vas.launcher.VASLauncher;
import gj3.C59474h;
import gy3.C87412m;
import java.util.HashSet;
import kotlin.Metadata;
import wb2.C65946a;
import wq3.C91097v;
import yb2.C79062b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmFragmentActivity;", "Lcom/tencent/mm/ui/vas/launcher/VASLauncher;", "<init>", "()V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mvvmbase.BaseMvvmFragmentActivity */
public abstract class BaseMvvmFragmentActivity extends VASLauncher {
    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C65946a.class);
        hashSet.add(C91097v.class);
        hashSet.add(C59474h.class);
        Intent intent = getIntent();
        C87412m.m108593f(intent, "intent");
        for (Class add : C79062b.m95630a(intent)) {
            hashSet.add(add);
        }
    }
}
