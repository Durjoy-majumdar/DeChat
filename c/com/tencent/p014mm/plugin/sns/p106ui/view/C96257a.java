package com.tencent.p014mm.plugin.sns.p106ui.view;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$w;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineUI$$y0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.SnsStoryHeaderView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.sns.ui.view.a */
public class C96257a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsStoryHeaderView f281299d;

    public C96257a(SnsStoryHeaderView snsStoryHeaderView) {
        this.f281299d = snsStoryHeaderView;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$1");
        SnsStoryHeaderView snsStoryHeaderView = this.f281299d;
        int i = SnsStoryHeaderView.f281281x;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        SnsStoryHeaderView.C96256a aVar = snsStoryHeaderView.f281298w;
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        if (aVar != null) {
            SnsStoryHeaderView snsStoryHeaderView2 = this.f281299d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            SnsStoryHeaderView.C96256a aVar2 = snsStoryHeaderView2.f281298w;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
            SnsTimeLineUI$$w snsTimeLineUI$$w = (SnsTimeLineUI$$w) aVar2;
            snsTimeLineUI$$w.getClass();
            SnsMethodCalculate.markStartTimeMs("onEnterStory", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$41");
            SnsTimeLineUI$$y0 M7 = SnsTimeLineUI.m122285M7(snsTimeLineUI$$w.f278790a);
            M7.getClass();
            SnsMethodCalculate.markStartTimeMs("closeActionUp", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            if (SnsTimeLineUI.m122291S7(M7.f278791A).getVisibility() != 0) {
                SnsMethodCalculate.markEndTimeMs("closeActionUp", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            } else {
                M7.mo133006a();
                SnsTimeLineUI.m122291S7(M7.f278791A).clearAnimation();
                SnsTimeLineUI.m122291S7(M7.f278791A).startAnimation(M7);
                M7.mo133011e((long) (M7.f278809x + 100));
                M7.f278802q = false;
                SnsMethodCalculate.markEndTimeMs("closeActionUp", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$RefreshAnim");
            }
            SnsMethodCalculate.markEndTimeMs("onEnterStory", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$41");
        }
        C115669n.INSTANCE.mo175913w(1015, 5, 1);
        SnsStoryHeaderView snsStoryHeaderView3 = this.f281299d;
        SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        snsStoryHeaderView3.getClass();
        SnsMethodCalculate.markStartTimeMs("goToStoryGallery", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        Log.m105925i("MicroMsg.SnsStoryHeaderView", "goToStoryGallery: %s", Integer.valueOf(((LinkedList) snsStoryHeaderView3.f281284f).size()));
        ((LinkedList) snsStoryHeaderView3.f281284f).size();
        SnsMethodCalculate.markEndTimeMs("goToStoryGallery", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/view/SnsStoryHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
