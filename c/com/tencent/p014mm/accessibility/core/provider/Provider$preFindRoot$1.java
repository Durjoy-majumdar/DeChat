package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo182093d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo182094d2 = {"<anonymous>", "", "config", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
/* renamed from: com.tencent.mm.accessibility.core.provider.Provider$preFindRoot$1 */
public final class Provider$preFindRoot$1 extends C87413o implements C32226l<MMBaseAccessibilityConfig, Boolean> {
    public final /* synthetic */ View $view;
    public final /* synthetic */ Provider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Provider$preFindRoot$1(Provider provider, View view) {
        super(1);
        this.this$0 = provider;
        this.$view = view;
    }

    public final Boolean invoke(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        C87412m.m108594g(mMBaseAccessibilityConfig, "config");
        List<C32227p> access$getMappers$p = this.this$0.mappers;
        View view = this.$view;
        ArrayList arrayList = new ArrayList();
        for (C32227p invoke : access$getMappers$p) {
            List list = (List) invoke.invoke(view, mMBaseAccessibilityConfig);
            if (list != null) {
                arrayList.add(list);
            }
        }
        View view2 = this.$view;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return Boolean.valueOf(z);
                }
                List list2 = (List) it.next();
                if (!z) {
                    if (mMBaseAccessibilityConfig.findRoot$plugin_autoaccessibility_release(view2, list2) != null) {
                        z = true;
                    }
                }
            }
        }
    }
}
