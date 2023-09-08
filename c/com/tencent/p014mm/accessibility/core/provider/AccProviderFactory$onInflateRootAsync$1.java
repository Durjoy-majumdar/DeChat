package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.accessibility.base.ConstantsAccessibility;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import fy3.C32224a;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import o40.C61926c;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.AccProviderFactory$onInflateRootAsync$1 */
public final class AccProviderFactory$onInflateRootAsync$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ WeakReference<View> $rootWrapper;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccProviderFactory$onInflateRootAsync$1(WeakReference<View> weakReference) {
        super(0);
        this.$rootWrapper = weakReference;
    }

    public final void invoke() {
        final WeakReference<View> weakReference = this.$rootWrapper;
        C61926c.m72662G(ConstantsAccessibility.THREAD_TAG, false, new C32224a<C13598b0>() {
            public final void invoke() {
                View view = weakReference.get();
                if (view != null) {
                    MapExpandKt.visitChild(view, C1045771.INSTANCE);
                }
            }
        }, 200);
    }
}
