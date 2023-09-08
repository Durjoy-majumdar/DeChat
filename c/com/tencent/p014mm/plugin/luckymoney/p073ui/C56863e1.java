package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.view.View;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyHistoryEnvelopeUI;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.e1 */
public class C56863e1 implements ListScrollPAGView.C17718h {

    /* renamed from: a */
    public final /* synthetic */ View f162908a;

    public C56863e1(LuckyMoneyHistoryEnvelopeUI.C69408j jVar, View view) {
        this.f162908a = view;
    }

    /* renamed from: a */
    public void mo21256a(ListScrollPAGView listScrollPAGView) {
    }

    /* renamed from: b */
    public void mo21257b(ListScrollPAGView listScrollPAGView) {
    }

    /* renamed from: c */
    public void mo21258c(ListScrollPAGView listScrollPAGView) {
    }

    /* renamed from: d */
    public void mo21259d(ListScrollPAGView listScrollPAGView) {
        View view = this.f162908a;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$3", "onAnimationStart", "(Lcom/tencent/mm/chatting/component/ListScrollPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$3", "onAnimationStart", "(Lcom/tencent/mm/chatting/component/ListScrollPAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
