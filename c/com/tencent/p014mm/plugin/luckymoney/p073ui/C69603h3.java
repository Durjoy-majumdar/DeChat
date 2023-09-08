package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.h3 */
public final class C69603h3 implements ListScrollPAGView.C17718h {

    /* renamed from: a */
    public final /* synthetic */ int f200953a;

    /* renamed from: b */
    public final /* synthetic */ C69626k3 f200954b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f200955c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f200956d;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.h3$a */
    public static final class C69604a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImageView f200957d;

        /* renamed from: e */
        public final /* synthetic */ ImageView f200958e;

        public C69604a(ImageView imageView, ImageView imageView2) {
            this.f200957d = imageView;
            this.f200958e = imageView2;
        }

        public final void run() {
            this.f200957d.setVisibility(4);
            this.f200958e.setVisibility(4);
        }
    }

    public C69603h3(int i, C69626k3 k3Var, ImageView imageView, ImageView imageView2) {
        this.f200953a = i;
        this.f200954b = k3Var;
        this.f200955c = imageView;
        this.f200956d = imageView2;
    }

    /* renamed from: a */
    public void mo21256a(ListScrollPAGView listScrollPAGView) {
        C87412m.m108594g(listScrollPAGView, "view");
    }

    /* renamed from: b */
    public void mo21257b(ListScrollPAGView listScrollPAGView) {
        C87412m.m108594g(listScrollPAGView, "view");
    }

    /* renamed from: c */
    public void mo21258c(ListScrollPAGView listScrollPAGView) {
        C87412m.m108594g(listScrollPAGView, "view");
    }

    /* renamed from: d */
    public void mo21259d(ListScrollPAGView listScrollPAGView) {
        C87412m.m108594g(listScrollPAGView, "view");
        if (this.f200953a == 2) {
            View view = this.f200954b.f200991g;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/chatting/component/ListScrollPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/chatting/component/ListScrollPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View view3 = this.f200954b.f200991g;
                if (view3 != null) {
                    view3.postDelayed(new C69604a(this.f200956d, this.f200955c), 100);
                } else {
                    C87412m.m108603p("pagWidgetLl");
                    throw null;
                }
            } else {
                C87412m.m108603p("pagWidgetLl");
                throw null;
            }
        } else {
            View view4 = this.f200954b.f200989e;
            if (view4 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/chatting/component/ListScrollPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC$renderEnvelopeDynamic$1", "onAnimationStart", "(Lcom/tencent/mm/chatting/component/ListScrollPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200955c.setVisibility(4);
                return;
            }
            C87412m.m108603p("pagLl");
            throw null;
        }
    }
}
