package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.C95762e;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import jr2.C99016j;
import p214om.C11502f;
import ps2.C100894u;
import vr2.C102236a0;
import vr2.C102244f;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.a0 */
public class C96012a0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280403d;

    public C96012a0(TimelineClickListener timelineClickListener) {
        this.f280403d = timelineClickListener;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AdapterView<?> adapterView2 = adapterView;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView2);
        arrayList.add(view2);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
        Log.m105924i("MicroMsg.TimelineClickListener", "unlike click");
        if (!(adapterView.getAdapter() instanceof C95762e)) {
            Log.m105928w("MicroMsg.TimelineClickListener", "unknown unlike adapter click");
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        C102244f fVar = (C102244f) view.getTag();
        SnsInfo DN = C94866e1.Yx0().mo139798DN(fVar.f301109c);
        if (DN == null) {
            try {
                this.f280403d.mo132104y(view2);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.TimelineClickListener", "onUnLikeFinishError exp=" + e.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean z = false;
        if (i == 0) {
            if (DN.isAd()) {
                ADInfo l = TimelineClickListener.m122990l(this.f280403d, DN);
                ((C99016j) C86312j.m106911c(C99016j.class)).mo55732rh(11855, DN.getAdRecSrc(), 3, l == null ? "" : l.viewId, Integer.valueOf(DN.getAdRecSrc()));
            }
            ADInfo.C95010c cVar = fVar.f301107a.f280527k.adUnlikeInfo;
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("hasReasonOptions", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            if (cVar.mo131416a().size() > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("hasReasonOptions", "com.tencent.mm.plugin.sns.storage.ADInfo$AdUnlikeInfo");
            if (z) {
                C95762e eVar = (C95762e) adapterView.getAdapter();
                eVar.getClass();
                SnsMethodCalculate.markStartTimeMs("stepForward", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
                eVar.f279363g++;
                SnsMethodCalculate.markEndTimeMs("stepForward", "com.tencent.mm.plugin.sns.ui.AdUnLikeReasonAdapter");
                eVar.notifyDataSetChanged();
                adapterView2.setOnItemClickListener(this.f280403d.f280362R);
                this.f280403d.mo132102w(view2);
                ADInfo.C95010c.C95011a aVar = new ADInfo.C95010c.C95011a();
                aVar.f275658d = 101;
                aVar.f275661g = fVar.f301111e;
                aVar.f275662h = 0;
                C94877g0 g0Var = new C94877g0(DN.field_snsId, 8, (Object) aVar);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(g0Var);
            } else if (fVar.f301107a.f280527k.forbidClick) {
                SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            } else {
                this.f280403d.mo132103x(view2);
                ADInfo.C95010c.C95011a aVar2 = new ADInfo.C95010c.C95011a();
                aVar2.f275661g = fVar.f301111e;
                aVar2.f275662h = System.currentTimeMillis();
                C94877g0 g0Var2 = new C94877g0(DN.field_snsId, 8, (Object) aVar2);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(g0Var2);
            }
        } else {
            ADXml.C95016e eVar2 = fVar.f301107a.f280526j.adFeedbackInfo;
            if (eVar2 == null) {
                Log.m105920e("MicroMsg.TimelineClickListener", "click feedback item but no report url");
                SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
                C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            int i2 = i - 1;
            if (i2 < ((LinkedList) eVar2.f275680a).size()) {
                String str = ((ADXml.C95017f) ((LinkedList) eVar2.f275680a).get(i2)).f275684d;
                try {
                    str = C100894u.m132224d(str, String.format("snsid=%s", new Object[]{DN.getTimeLine().f283893Id}), String.format("aid=%s", new Object[]{DN.getAid()}), String.format("traceid=%s", new Object[]{DN.getTraceid()}), String.format("uin=%s", new Object[]{C86709a0.m107523b().mo121111i()}));
                } catch (Exception unused) {
                }
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("useJs", true);
                intent.putExtra("KPublisherId", "sns_" + C102236a0.m134765q0(DN.field_snsId));
                intent.putExtra("pre_username", DN.field_userName);
                intent.putExtra("prePublishId", "sns_" + C102236a0.m134765q0(DN.field_snsId));
                intent.putExtra("preUsername", DN.field_userName);
                ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93190w(intent, TimelineClickListener.m122988j(this.f280403d));
            }
        }
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$33");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$33", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
