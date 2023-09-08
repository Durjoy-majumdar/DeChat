package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.e3 */
public final class C4869e3 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C69597g3 f19954d;

    public C4869e3(C69597g3 g3Var) {
        this.f19954d = g3Var;
    }

    public final void run() {
        View view = this.f19954d.f200925n;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C87412m.m108603p("containerView");
        throw null;
    }
}
