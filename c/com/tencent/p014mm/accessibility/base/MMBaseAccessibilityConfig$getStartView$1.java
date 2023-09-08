package com.tencent.p014mm.accessibility.base;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Landroid/view/View;", "it", "Lrx3/b0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$getStartView$1 */
public final class MMBaseAccessibilityConfig$getStartView$1 extends C87413o implements C32226l<View, C13598b0> {
    public final /* synthetic */ C8477a0 $hasFound;
    public final /* synthetic */ C8479f0<View> $target;
    public final /* synthetic */ MMBaseAccessibilityConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig$getStartView$1(C8477a0 a0Var, MMBaseAccessibilityConfig mMBaseAccessibilityConfig, C8479f0<View> f0Var) {
        super(1);
        this.$hasFound = a0Var;
        this.this$0 = mMBaseAccessibilityConfig;
        this.$target = f0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(View view) {
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        if (!this.$hasFound.f27482d) {
            List list = this.this$0.getStartViewRootMap$plugin_autoaccessibility_release().get(Integer.valueOf(view.getId()));
            if (list != null) {
                MMBaseAccessibilityConfig mMBaseAccessibilityConfig = this.this$0;
                C8479f0<View> f0Var = this.$target;
                C8477a0 a0Var = this.$hasFound;
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    Integer access$getLayoutId = mMBaseAccessibilityConfig.getLayoutId(view);
                    if (access$getLayoutId != null && access$getLayoutId.intValue() == intValue) {
                        f0Var.f27484d = view;
                        a0Var.f27482d = true;
                        return;
                    }
                    return;
                }
            }
            int id = view.getId();
            Integer startViewId$plugin_autoaccessibility_release = this.this$0.getStartViewId$plugin_autoaccessibility_release();
            if (startViewId$plugin_autoaccessibility_release != null && id == startViewId$plugin_autoaccessibility_release.intValue() && C87412m.m108589b(this.this$0.getLayoutId(view), this.this$0.getStartViewLayoutId$plugin_autoaccessibility_release())) {
                this.$target.f27484d = view;
                this.$hasFound.f27482d = true;
            }
        }
    }
}
