package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.q8 */
public class C43146q8 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C43155u8 f116720d;

    public C43146q8(C43155u8 u8Var) {
        this.f116720d = u8Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$1");
        this.f116720d.mo67375b();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimelineEmojiInfoHelper$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/TimelineEmojiInfoHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
