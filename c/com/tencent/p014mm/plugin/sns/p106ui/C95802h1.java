package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.h1 */
public class C95802h1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ LongVideoFullScreenView f279552d;

    public C95802h1(LongVideoFullScreenView longVideoFullScreenView) {
        this.f279552d = longVideoFullScreenView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$3");
        try {
            Log.m105925i("LongVideoFullScreenView", "play btn onclick isPlaying[%b]", Boolean.valueOf(LongVideoFullScreenView.m121524d(this.f279552d).isPlaying()));
            LongVideoFullScreenView.m121522a(this.f279552d, true);
            if (LongVideoFullScreenView.m121524d(this.f279552d).isPlaying()) {
                LongVideoFullScreenView longVideoFullScreenView = this.f279552d;
                SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView.mo132222v();
                SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            } else {
                LongVideoFullScreenView longVideoFullScreenView2 = this.f279552d;
                SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                boolean z = longVideoFullScreenView2.f276952y;
                SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                if (z) {
                    this.f279552d.mo132197i();
                } else {
                    this.f279552d.mo132221t();
                }
                LongVideoFullScreenView longVideoFullScreenView3 = this.f279552d;
                SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView3.mo132223w();
                SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
            LongVideoFullScreenView longVideoFullScreenView4 = this.f279552d;
            SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            boolean z2 = longVideoFullScreenView4.f276918J;
            SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (z2) {
                LongVideoFullScreenView longVideoFullScreenView5 = this.f279552d;
                SnsMethodCalculate.markStartTimeMs("access$2008", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView5.f276922N++;
                SnsMethodCalculate.markEndTimeMs("access$2008", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
        } catch (Throwable th) {
            Log.m105920e("LongVideoFullScreenView", th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
