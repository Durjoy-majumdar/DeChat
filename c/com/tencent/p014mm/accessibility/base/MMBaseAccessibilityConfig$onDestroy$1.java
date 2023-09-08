package com.tencent.p014mm.accessibility.base;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Landroid/view/View;", "it", "Lrx3/b0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$onDestroy$1 */
public final class MMBaseAccessibilityConfig$onDestroy$1 extends C87413o implements C32226l<View, C13598b0> {
    public final /* synthetic */ MMBaseAccessibilityConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMBaseAccessibilityConfig$onDestroy$1(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        super(1);
        this.this$0 = mMBaseAccessibilityConfig;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(View view) {
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        this.this$0.setOnHierarchyChangeListener(view instanceof ViewGroup ? (ViewGroup) view : null, (ViewGroup.OnHierarchyChangeListener) null);
    }
}
