package eu2;

import android.view.View;
import com.tencent.p014mm.autogen.events.SnsFinderPostEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import gu2.C98214b;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import o40.C61926c;
import rx3.C13598b0;
import yn2.C102887v0;

/* renamed from: eu2.n */
public final class C97734n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C97736r f286702d;

    /* renamed from: e */
    public final /* synthetic */ C98214b f286703e;

    /* renamed from: eu2.n$a */
    public static final class C97735a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C97736r f286704d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97735a(C97736r rVar) {
            super(0);
            this.f286704d = rVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFinderPostView$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFinderPostView$1$1");
            this.f286704d.getFinderPostStub().setVisibility(8);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFinderPostView$1$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFinderPostView$1$1");
            return b0Var;
        }
    }

    public C97734n(C97736r rVar, C98214b bVar) {
        this.f286702d = rVar;
        this.f286703e = bVar;
    }

    public final void onClick(View view) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFinderPostView$1");
        SnsFinderPostEvent snsFinderPostEvent = new SnsFinderPostEvent();
        snsFinderPostEvent.f265144d.f265146b = this.f286702d.getContext();
        SnsFinderPostEvent.C92576a aVar = snsFinderPostEvent.f265144d;
        if (this.f286702d.getViewType() == 37 || this.f286702d.getViewType() == 36) {
            C102887v0 v0Var = C102887v0.VideoPath;
            i = 2;
        } else {
            C102887v0 v0Var2 = C102887v0.VideoPath;
            i = 0;
        }
        aVar.f265145a = i;
        snsFinderPostEvent.f265144d.f265147c = this.f286703e.mo137505C2();
        snsFinderPostEvent.publish();
        C61926c.m72666K(700, new C97735a(this.f286702d));
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$loadFinderPostView$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure$loadFinderPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
