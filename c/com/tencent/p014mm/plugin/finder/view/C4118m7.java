package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.m7 */
public final class C4118m7 extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public static final C4118m7 f18292d = new C4118m7();

    public C4118m7() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.m75);
            C87412m.m108593f(string, "getContext().resources.g…der_live_setting_success)");
            C76912y0.m92766e(MMApplicationContext.getContext(), string, C4090k7.f18226a);
        } else {
            String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.m74);
            C87412m.m108593f(string2, "getContext().resources.g…finder_live_setting_fail)");
            C76912y0.m92766e(MMApplicationContext.getContext(), string2, C4099l7.f18241a);
        }
        return C13598b0.f38549a;
    }
}
