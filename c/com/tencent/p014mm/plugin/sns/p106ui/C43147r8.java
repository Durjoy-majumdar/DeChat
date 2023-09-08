package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.ui.r8 */
public class C43147r8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ View f116726d;

    /* renamed from: e */
    public final /* synthetic */ View f116727e;

    /* renamed from: f */
    public final /* synthetic */ C43155u8 f116728f;

    public C43147r8(C43155u8 u8Var, View view, View view2) {
        this.f116728f = u8Var;
        this.f116726d = view;
        this.f116727e = view2;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$2");
        C43155u8 u8Var = this.f116728f;
        View view = this.f116727e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        u8Var.getClass();
        SnsMethodCalculate.markStartTimeMs("initEmojiView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper", "initEmojiView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper", "initEmojiView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u8Var.f116743g = true;
        u8Var.f116741e.setAnimationListener(new C43149s8(u8Var));
        view.startAnimation(u8Var.f116741e);
        SnsMethodCalculate.markEndTimeMs("initEmojiView", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$2");
    }
}
