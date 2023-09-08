package kq2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import j20.C117292a;
import java.util.ArrayList;
import oq2.C100373a;

/* renamed from: kq2.a */
public class C99159a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsInfo f290747d;

    /* renamed from: e */
    public final /* synthetic */ C99160b f290748e;

    public C99159a(C99160b bVar, SnsInfo snsInfo) {
        this.f290748e = bVar;
        this.f290747d = snsInfo;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ad/timeline/item/AdFinderTopicTimeLineItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem$1");
        try {
            C100373a aVar = this.f290748e.f290756x;
            if (aVar != null) {
                SnsMethodCalculate.markStartTimeMs("updateBarClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                aVar.f293971d++;
                SnsMethodCalculate.markEndTimeMs("updateBarClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            }
            this.f290748e.mo138526D(view, this.f290747d);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ad/timeline/item/AdFinderTopicTimeLineItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
