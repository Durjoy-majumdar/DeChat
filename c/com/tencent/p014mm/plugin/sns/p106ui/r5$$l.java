package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: com.tencent.mm.plugin.sns.ui.r5$$l */
public class r5$$l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C96198r5 f116725d;

    public r5$$l(C96198r5 r5Var) {
        this.f116725d = r5Var;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$9");
        Intent intent = new Intent();
        intent.putExtra("enter_scene", 2);
        C88144b.m109791i(C96198r5.m123301f(this.f116725d), "setting", ".ui.setting.SettingsPrivacyUI", intent, (Bundle) null);
        C115669n.INSTANCE.mo160131h(14098, 8);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter$9");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSelfAdapter$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
