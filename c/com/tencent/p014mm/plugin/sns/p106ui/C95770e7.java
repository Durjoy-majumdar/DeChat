package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.sns.ui.e7 */
public class C95770e7 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ Context f279394d;

    /* renamed from: e */
    public final /* synthetic */ SnsUploadConfigView f279395e;

    public C95770e7(SnsUploadConfigView snsUploadConfigView, Context context) {
        this.f279395e = snsUploadConfigView;
        this.f279394d = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$1");
        SnsUploadConfigView snsUploadConfigView = this.f279395e;
        int i = SnsUploadConfigView.f278888u;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z = snsUploadConfigView.f278896n;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        if (!z) {
            SnsUploadConfigView snsUploadConfigView2 = this.f279395e;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            boolean z2 = snsUploadConfigView2.f278893h;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
            if (z2) {
                C76879j.m92738i(this.f279394d, C0966R.string.jib, C0966R.string.a3h);
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$1");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        SnsUploadConfigView snsUploadConfigView3 = this.f279395e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        boolean z3 = snsUploadConfigView3.f278896n;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView3.f278896n = !z3;
        SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsUploadConfigView snsUploadConfigView4 = this.f279395e;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        snsUploadConfigView4.mo133064d();
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsUploadConfigView$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsUploadConfigView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
