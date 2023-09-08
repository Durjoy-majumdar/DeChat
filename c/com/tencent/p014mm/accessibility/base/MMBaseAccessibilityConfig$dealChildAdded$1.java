package com.tencent.p014mm.accessibility.base;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.accessibility.uitl.AccNodeUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig$dealChildAdded$1 */
public final class MMBaseAccessibilityConfig$dealChildAdded$1 implements Runnable {
    public final /* synthetic */ MMBaseAccessibilityConfig this$0;

    public MMBaseAccessibilityConfig$dealChildAdded$1(MMBaseAccessibilityConfig mMBaseAccessibilityConfig) {
        this.this$0 = mMBaseAccessibilityConfig;
    }

    public final void run() {
        View rootView = this.this$0.getRootView();
        final MMBaseAccessibilityConfig mMBaseAccessibilityConfig = this.this$0;
        MapExpandKt.visitChild(rootView, new C32226l<View, C13598b0>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((View) obj);
                return C13598b0.f38549a;
            }

            public final void invoke(View view) {
                C87412m.m108594g(view, LocaleUtil.ITALIAN);
                AccNodeUtil.INSTANCE.checkDelegate(view);
                MMBaseAccessibilityConfig mMBaseAccessibilityConfig = mMBaseAccessibilityConfig;
                mMBaseAccessibilityConfig.setOnHierarchyChangeListener(view instanceof ViewGroup ? (ViewGroup) view : null, mMBaseAccessibilityConfig);
            }
        });
    }
}
