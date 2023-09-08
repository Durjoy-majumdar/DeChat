package cv2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.view.SnsStoryHeaderView;

/* renamed from: cv2.a */
public class C97381a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsStoryHeaderView f285879d;

    public C97381a(SnsStoryHeaderView snsStoryHeaderView) {
        this.f285879d = snsStoryHeaderView;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$2");
        SnsStoryHeaderView snsStoryHeaderView = this.f285879d;
        int i = SnsStoryHeaderView.f281281x;
        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        snsStoryHeaderView.mo133942b();
        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView$2");
    }
}
