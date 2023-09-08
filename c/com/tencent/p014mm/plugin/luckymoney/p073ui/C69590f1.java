package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.animation.ValueAnimator;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyHistoryEnvelopeUI;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.f1 */
public class C69590f1 implements ListScrollPAGView.C17719f {

    /* renamed from: a */
    public final /* synthetic */ LuckyMoneyHistoryEnvelopeUI.C69407i f200904a;

    /* renamed from: b */
    public final /* synthetic */ ListScrollPAGView f200905b;

    /* renamed from: c */
    public final /* synthetic */ C60905o f200906c;

    public C69590f1(LuckyMoneyHistoryEnvelopeUI.C69408j jVar, LuckyMoneyHistoryEnvelopeUI.C69407i iVar, ListScrollPAGView listScrollPAGView, C60905o oVar) {
        this.f200904a = iVar;
        this.f200905b = listScrollPAGView;
        this.f200906c = oVar;
    }

    public void onFlush() {
        if (!this.f200904a.f200001e) {
            ValueAnimator valueAnimator = this.f200905b.f48756h;
            if (valueAnimator != null ? valueAnimator.isRunning() : false) {
                View D = this.f200906c.mo85812D(C0966R.C0970id.g2c);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(4);
                View view = D;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View D2 = this.f200906c.mo85812D(C0966R.C0970id.f358612g24);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(4);
                View view2 = D2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View D3 = this.f200906c.mo85812D(C0966R.C0970id.g2a);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(4);
                View view3 = D3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem$4", "onFlush", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f200906c.mo85812D(C0966R.C0970id.g2_).setBackgroundResource(C0966R.color.ahf);
                this.f200904a.f200001e = true;
            }
        }
    }
}
