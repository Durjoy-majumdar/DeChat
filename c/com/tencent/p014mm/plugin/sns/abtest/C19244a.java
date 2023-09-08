package com.tencent.p014mm.plugin.sns.abtest;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.sns.abtest.NotInterestMenu;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.abtest.a */
public class C19244a implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ NotInterestMenu f54214d;

    public C19244a(NotInterestMenu notInterestMenu) {
        this.f54214d = notInterestMenu;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/abtest/NotInterestMenu$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$1");
        NotInterestMenu notInterestMenu = this.f54214d;
        int[] iArr = NotInterestMenu.f54208g;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        notInterestMenu.getClass();
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        if (NotInterestMenu.m20385a(this.f54214d) != null) {
            if (i == 0) {
                NotInterestMenu.C19243c a = NotInterestMenu.m20385a(this.f54214d);
                NotInterestMenu notInterestMenu2 = this.f54214d;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                SnsInfo snsInfo = notInterestMenu2.f54211f;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                a.mo24700b(snsInfo);
            } else if (i == 1) {
                NotInterestMenu.C19243c a2 = NotInterestMenu.m20385a(this.f54214d);
                NotInterestMenu notInterestMenu3 = this.f54214d;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                SnsInfo snsInfo2 = notInterestMenu3.f54211f;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                a2.mo24701c(snsInfo2);
            } else if (i == 2) {
                NotInterestMenu.C19243c a3 = NotInterestMenu.m20385a(this.f54214d);
                NotInterestMenu notInterestMenu4 = this.f54214d;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                SnsInfo snsInfo3 = notInterestMenu4.f54211f;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
                a3.mo24699a(snsInfo3);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/abtest/NotInterestMenu$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
