package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.y5 */
public class C71262y5 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsSightUploadSayFooter f206226d;

    public C71262y5(SnsSightUploadSayFooter snsSightUploadSayFooter) {
        this.f206226d = snsSightUploadSayFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$4");
        SnsSightUploadSayFooter snsSightUploadSayFooter = this.f206226d;
        int i = SnsSightUploadSayFooter.f206148t;
        SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        snsSightUploadSayFooter.getClass();
        SnsMethodCalculate.markStartTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        if (snsSightUploadSayFooter.f206150o.getVisibility() == 8) {
            snsSightUploadSayFooter.f206149n.hideVKB();
            SnsMethodCalculate.markStartTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            snsSightUploadSayFooter.f206150o.mo100197i();
            snsSightUploadSayFooter.f206150o.setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("showSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            snsSightUploadSayFooter.f206151p.requestFocus();
            snsSightUploadSayFooter.f206152q.setImageResource(C0966R.raw.sight_icon_keyboard);
        } else {
            snsSightUploadSayFooter.f206151p.requestFocus();
            SnsMethodCalculate.markStartTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            snsSightUploadSayFooter.f206150o.mo100196h();
            snsSightUploadSayFooter.f206150o.setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("hideSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
            snsSightUploadSayFooter.f206149n.showVKB();
            snsSightUploadSayFooter.f206152q.setImageResource(C0966R.raw.sight_icon_emoji);
        }
        SnsMethodCalculate.markEndTimeMs("toggleSmileyPanel", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightUploadSayFooter$4");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsSightUploadSayFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
