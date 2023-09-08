package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C76912y0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.view.j7 */
public final class C4082j7 extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

    /* renamed from: d */
    public static final C4082j7 f18212d = new C4082j7();

    public C4082j7() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
            String string = MMApplicationContext.getContext().getResources().getString(booleanValue2 ? C0966R.string.e44 : C0966R.string.f360673e42);
            C87412m.m108593f(string, "if (enable) MMApplicatio…action_comment_forbidden)");
            C76912y0.m92766e(MMApplicationContext.getContext(), string, C4068h7.f18196a);
        } else {
            String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.e3q);
            C87412m.m108593f(string2, "getContext().resources.g…ofile_action_fail_prefix)");
            StringBuilder sb = new StringBuilder();
            sb.append(string2);
            sb.append(MMApplicationContext.getContext().getResources().getString(booleanValue2 ? C0966R.string.e3z : C0966R.string.f360674e43));
            C76912y0.m92766e(MMApplicationContext.getContext(), sb.toString(), C4074i7.f18201a);
        }
        return C13598b0.f38549a;
    }
}
