package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.accessibility.core.ViewTagManager;
import com.tencent.p014mm.accessibility.uitl.IdUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Landroid/view/View;", "it", "Lrx3/b0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.DisableChildModifier$dealOnViewInflateAsync$1 */
public final class DisableChildModifier$dealOnViewInflateAsync$1 extends C87413o implements C32226l<View, C13598b0> {
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisableChildModifier$dealOnViewInflateAsync$1(View view) {
        super(1);
        this.$view = view;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(View view) {
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        DisableChildModifier disableChildModifier = DisableChildModifier.INSTANCE;
        final View view2 = this.$view;
        disableChildModifier.visitChild(view2, new C32226l<View, C13598b0>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C13598b0.f38549a;
            }

            public final void invoke(View view) {
                C87412m.m108594g(view, LocaleUtil.ITALIAN);
                ViewTag tagData = ViewTagManager.INSTANCE.getTagData(view);
                if (tagData != null) {
                    tagData.setDisableFocusFlag(Boolean.TRUE);
                }
                DisableChildModifier disableChildModifier = DisableChildModifier.INSTANCE;
                View view2 = view2;
                disableChildModifier.logMsg(DisableChildModifier.TAG, view2, "success set tag_acc_disable_flag on child" + IdUtil.INSTANCE.getName(view2.getId()));
            }
        });
    }
}
