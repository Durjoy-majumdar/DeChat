package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import vr2.C102236a0;
import vr2.C102260r;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.n0 */
public class C96046n0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280457d;

    public C96046n0(TimelineClickListener timelineClickListener) {
        this.f280457d = timelineClickListener;
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
        if (view.getTag() instanceof BaseTimeLineItem.BaseViewHolder) {
            SnsInfo DN = C94866e1.Yx0().mo139798DN(((BaseTimeLineItem.BaseViewHolder) view.getTag()).f279956g);
            if (DN == null) {
                SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else if (DN.isAd()) {
                Log.m105924i("MicroMsg.TimelineClickListener", "click the ad tailLink button");
                SnsAdClick snsAdClick = new SnsAdClick(TimelineClickListener.m122989k(this.f280457d), TimelineClickListener.m122989k(this.f280457d) == 0 ? 1 : 2, DN.field_snsId, 24, 0);
                C102260r.m134864d(snsAdClick, this.f280457d.f280378h, DN, 24);
                C102236a0.m134773u0(snsAdClick);
                this.f280457d.mo132095p(view2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$8");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
