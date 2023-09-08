package com.tencent.p014mm.accessibility.core.provider;

import android.os.Bundle;
import android.view.View;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.AccProviderFactory$dispatchOnAction$1 */
public final class AccProviderFactory$dispatchOnAction$1 extends C87413o implements C32224a<C13598b0> {
    public final /* synthetic */ int $action;
    public final /* synthetic */ Bundle $args;
    public final /* synthetic */ View $view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccProviderFactory$dispatchOnAction$1(View view, int i, Bundle bundle) {
        super(0);
        this.$view = view;
        this.$action = i;
        this.$args = bundle;
    }

    public final void invoke() {
        List<Provider> access$getProviders$p = AccProviderFactory.providers;
        View view = this.$view;
        int i = this.$action;
        Bundle bundle = this.$args;
        for (Provider provider : access$getProviders$p) {
            if ((provider.getAuthority() & 8) == 8) {
                provider.dealOnAction(view, i, bundle);
            }
        }
    }
}
