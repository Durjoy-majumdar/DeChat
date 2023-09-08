package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import j20.C117292a;
import java.util.ArrayList;
import vr2.C102236a0;
import vr2.C102244f;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.z */
public class C96061z implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280478d;

    public C96061z(TimelineClickListener timelineClickListener) {
        this.f280478d = timelineClickListener;
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$32");
        this.f280478d.mo132105z(view2);
        if (view.getTag() == null || !(view.getTag() instanceof C102244f)) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$32");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C102244f fVar = (C102244f) view.getTag();
        SnsInfo DN = C94866e1.Yx0().mo139798DN(fVar.f301109c);
        if (DN == null) {
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$32");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (DN.isAd()) {
            fVar.f301111e = System.currentTimeMillis();
            SnsAdClick snsAdClick = new SnsAdClick(TimelineClickListener.m122989k(this.f280478d), TimelineClickListener.m122989k(this.f280478d) == 0 ? 1 : 2, DN.field_snsId, 20, 0);
            C102260r.m134864d(snsAdClick, this.f280478d.f280378h, DN, 20);
            C102236a0.m134773u0(snsAdClick);
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$32");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$32", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
