package gq2;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: gq2.b */
public class C98170b implements View.OnLayoutChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C98171c f287804d;

    public C98170b(C98171c cVar) {
        this.f287804d = cVar;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SnsMethodCalculate.markStartTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$1");
        if (view.getVisibility() == 0) {
            C98171c cVar = this.f287804d;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            TextView textView = cVar.f287827w;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            if (textView != null) {
                C98171c cVar2 = this.f287804d;
                SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                int i9 = cVar2.f287807C;
                SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                C98171c cVar3 = this.f287804d;
                SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                TextView textView2 = cVar3.f287827w;
                SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                if (i9 != textView2.getWidth()) {
                    C98171c cVar4 = this.f287804d;
                    SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                    cVar4.mo137461a(0);
                    SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onLayoutChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$1");
    }
}
