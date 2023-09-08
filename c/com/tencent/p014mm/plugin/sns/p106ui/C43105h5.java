package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.h5 */
public class C43105h5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f116652d;

    public C43105h5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f116652d = snsOnlineVideoActivity;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$2");
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f116652d;
        int i = SnsOnlineVideoActivity.f278370y0;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean z = snsOnlineVideoActivity.f278377G;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity.setTitleVisibility(z ? 8 : 0);
        SnsOnlineVideoActivity snsOnlineVideoActivity2 = this.f116652d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        boolean z2 = snsOnlineVideoActivity2.f278377G;
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        snsOnlineVideoActivity2.f278377G = !z2;
        SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
