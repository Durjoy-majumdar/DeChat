package com.tencent.p014mm.plugin.sns.p106ui.listener;

import android.view.View;
import android.widget.AdapterView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94877g0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADInfo;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import vr2.C102244f;

/* renamed from: com.tencent.mm.plugin.sns.ui.listener.b0 */
public class C96013b0 implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ TimelineClickListener f280404d;

    public C96013b0(TimelineClickListener timelineClickListener) {
        this.f280404d = timelineClickListener;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
        if (view.getTag() != null && (view.getTag() instanceof C102244f)) {
            C102244f fVar = (C102244f) view.getTag();
            if (i < fVar.f301107a.f280527k.adUnlikeInfo.mo131416a().size()) {
                ADInfo aDInfo = fVar.f301107a.f280527k;
                if (aDInfo.forbidClick) {
                    SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                ADInfo.C95010c.C95011a aVar = aDInfo.adUnlikeInfo.mo131416a().get(i);
                Log.m105925i("MicroMsg.TimelineClickListener", "unlike item click, reason=%s, id=%s", aVar.f275655a, Integer.valueOf(aVar.f275658d));
                SnsInfo DN = C94866e1.Yx0().mo139798DN(fVar.f301109c);
                if (DN == null) {
                    SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                this.f280404d.mo132103x(view);
                aVar.f275661g = fVar.f301111e;
                aVar.f275662h = System.currentTimeMillis();
                C94877g0 g0Var = new C94877g0(DN.field_snsId, 8, (Object) aVar);
                C86709a0.m107528h();
                C86709a0.m107529k().f251779b.mo123460f(g0Var);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$34");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$34", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
