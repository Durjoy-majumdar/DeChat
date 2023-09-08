package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import bl3.C54492n;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.plugin.luckymoney.model.C69198d0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.i3 */
public final class C69610i3 implements C75142u0.C75149e {

    /* renamed from: a */
    public final /* synthetic */ C69626k3 f200967a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.i3$a */
    public static final class C69611a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f200968d;

        /* renamed from: e */
        public final /* synthetic */ C69626k3 f200969e;

        public C69611a(String str, C69626k3 k3Var) {
            this.f200968d = str;
            this.f200969e = k3Var;
        }

        public final void run() {
            C69198d0 d0Var = C69198d0.f199107a;
            String str = this.f200968d;
            ListScrollPAGView listScrollPAGView = this.f200969e.f200992h;
            if (listScrollPAGView != null) {
                d0Var.mo95355e(1, str, listScrollPAGView);
            } else {
                C87412m.m108603p("pagWidgetView");
                throw null;
            }
        }
    }

    public C69610i3(C69626k3 k3Var) {
        this.f200967a = k3Var;
    }

    /* renamed from: a */
    public void mo95346a(C75142u0.C75143a aVar) {
        C87412m.m108594g(aVar, "result");
        if (aVar instanceof C75142u0.C75143a.C75145b) {
            String str = ((C75142u0.C75143a.C75145b) aVar).f221112a;
            Log.m105925i(C54492n.TAG, "downloadComplete success，file path: %s", str);
            C69626k3 k3Var = this.f200967a;
            View view = k3Var.f200991g;
            if (view != null) {
                view.postDelayed(new C69611a(str, k3Var), 170);
            } else {
                C87412m.m108603p("pagWidgetLl");
                throw null;
            }
        } else {
            Log.m105925i(C54492n.TAG, "downloadComplete failed，errorCode: %s", Integer.valueOf(((C75142u0.C75143a.C75144a) aVar).f221111a));
            View view2 = this.f200967a.f200991g;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$2", "downloadComplete", "(Lcom/tencent/mm/wallet_core/model/WalletPagDownloader$Result;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            C87412m.m108603p("pagWidgetLl");
            throw null;
        }
    }
}
