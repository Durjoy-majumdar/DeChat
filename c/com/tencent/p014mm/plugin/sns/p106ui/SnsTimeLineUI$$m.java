package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.item.BaseTimeLineItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import pu2.C100921i0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$m */
public class SnsTimeLineUI$$m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsTimeLineUI f278766d;

    public SnsTimeLineUI$$m(SnsTimeLineUI snsTimeLineUI) {
        this.f278766d = snsTimeLineUI;
    }

    public void run() {
        int i;
        int i2;
        String str;
        int i3;
        SnsTimeLineBaseAdapter snsTimeLineBaseAdapter;
        int i4;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$31");
        if (SnsTimeLineUI.m122282J7(this.f278766d) == null) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$31");
            return;
        }
        SnsTimeLineUI snsTimeLineUI = this.f278766d;
        SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        boolean z = snsTimeLineUI.f278619B1;
        SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        if (!z) {
            Log.m105925i("MicroMsg.SnsTimeLineUI", "zeustest update onFling notify resume %s", Integer.valueOf(SnsTimeLineUI.m122302d8(this.f278766d).f278851d.getFirstVisiblePosition() - SnsTimeLineUI.m122302d8(this.f278766d).f278851d.getHeaderViewsCount()));
            C94866e1.Fx0().mo131118g0();
            SnsTimeLineBaseAdapter g = SnsTimeLineUI.m122282J7(this.f278766d).mo137288g();
            g.getClass();
            SnsMethodCalculate.markStartTimeMs("reConverItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            int firstVisiblePosition = g.f278563O.getFirstVisiblePosition();
            SnsMethodCalculate.markStartTimeMs("getHeaderViewsCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            ListView listView = g.f278563O;
            if (listView != null) {
                i = listView.getHeaderViewsCount();
                SnsMethodCalculate.markEndTimeMs("getHeaderViewsCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else {
                SnsMethodCalculate.markEndTimeMs("getHeaderViewsCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                i = 1;
            }
            int i5 = firstVisiblePosition - i;
            int lastVisiblePosition = g.f278563O.getLastVisiblePosition();
            SnsMethodCalculate.markStartTimeMs("getHeaderViewsCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            ListView listView2 = g.f278563O;
            if (listView2 != null) {
                i2 = listView2.getHeaderViewsCount();
                SnsMethodCalculate.markEndTimeMs("getHeaderViewsCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else {
                SnsMethodCalculate.markEndTimeMs("getHeaderViewsCount", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
                i2 = 1;
            }
            int i6 = lastVisiblePosition - i2;
            StringBuilder sb = new StringBuilder();
            sb.append("%s reConverItem start ~ end ");
            sb.append(i5);
            String str2 = " ";
            sb.append(str2);
            sb.append(i6);
            Log.m105925i("MicroMsg.SnsTimeLineBaseAdapter", sb.toString(), "[image-flow]");
            int count = g.f278567a.getCount();
            while (i5 <= i6 && i5 < count) {
                SnsInfo i7 = g.mo132919i(i5);
                View view = g.f278587u.get(Integer.valueOf(i5));
                if (view instanceof C100921i0) {
                    ((C100921i0) view).mo140385A();
                    i4 = count;
                    snsTimeLineBaseAdapter = g;
                    i3 = i6;
                    str = str2;
                } else if (view == null || i7 == null || view.getTag() == null) {
                    i4 = count;
                    snsTimeLineBaseAdapter = g;
                    i3 = i6;
                    str = str2;
                    Log.m105920e("MicroMsg.SnsTimeLineBaseAdapter", " passe " + i5);
                } else {
                    BaseTimeLineItem.BaseViewHolder baseViewHolder = (BaseTimeLineItem.BaseViewHolder) view.getTag();
                    Log.m105924i("MicroMsg.SnsTimeLineBaseAdapter", "reConverItem " + i5 + str2 + baseViewHolder.f279948c);
                    BaseTimeLineItem baseTimeLineItem = baseViewHolder.f279965k0;
                    C96275w6 h0 = g.mo132918h().mo133189h0(i5);
                    baseTimeLineItem.getClass();
                    SnsMethodCalculate.markStartTimeMs("quickFillItem", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                    TimeLineObject timeLine = i7.getTimeLine();
                    i4 = count;
                    snsTimeLineBaseAdapter = g;
                    i3 = i6;
                    C96275w6 w6Var = h0;
                    str = str2;
                    baseTimeLineItem.mo81015o(baseViewHolder, i5, w6Var, timeLine, baseViewHolder.f279946b, baseTimeLineItem.f279906g);
                    baseTimeLineItem.mo133402v(w6Var, timeLine);
                    SnsMethodCalculate.markEndTimeMs("quickFillItem", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
                }
                i5++;
                count = i4;
                g = snsTimeLineBaseAdapter;
                i6 = i3;
                str2 = str;
            }
            SnsMethodCalculate.markEndTimeMs("reConverItem", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$31");
    }
}
