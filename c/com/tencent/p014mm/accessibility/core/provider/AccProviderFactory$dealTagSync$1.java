package com.tencent.p014mm.accessibility.core.provider;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.ViewTag;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo182094d2 = {"Landroid/view/View;", "it", "Lrx3/b0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.accessibility.core.provider.AccProviderFactory$dealTagSync$1 */
public final class AccProviderFactory$dealTagSync$1 extends C87413o implements C32226l<View, C13598b0> {
    public static final AccProviderFactory$dealTagSync$1 INSTANCE = new AccProviderFactory$dealTagSync$1();

    public AccProviderFactory$dealTagSync$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((View) obj);
        return C13598b0.f38549a;
    }

    public final void invoke(View view) {
        C87412m.m108594g(view, LocaleUtil.ITALIAN);
        view.setTag(C0966R.C0970id.kdr, new ViewTag());
    }
}
