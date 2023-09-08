package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.g7 */
public class C95795g7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsUploadConfigView f279546d;

    public C95795g7(SnsUploadConfigView snsUploadConfigView) {
        this.f279546d = snsUploadConfigView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$3");
        SnsUploadConfigView snsUploadConfigView = this.f279546d;
        int i = SnsUploadConfigView.f278888u;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z = snsUploadConfigView.f278894i;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markStartTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView.f278894i = !z;
        SnsMethodCalculate.markEndTimeMs("access$502", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsUploadConfigView snsUploadConfigView2 = this.f279546d;
        SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z2 = snsUploadConfigView2.f278894i;
        SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (z2) {
            SnsUploadConfigView snsUploadConfigView3 = this.f279546d;
            SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            snsUploadConfigView3.f278893h = false;
            SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        }
        SnsUploadConfigView snsUploadConfigView4 = this.f279546d;
        SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView4.mo133063c();
        SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
