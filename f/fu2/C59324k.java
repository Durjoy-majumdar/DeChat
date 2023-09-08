package fu2;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.C96085n8;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ft3.C116895f;
import gu2.C98214b;
import gy3.C87412m;

/* renamed from: fu2.k */
public final class C59324k extends C97987a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59324k(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo71269a(View view) {
        SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
        C98214b c = mo137310c();
        if (c == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
            return;
        }
        View h = mo137314h();
        if (h == null) {
            SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
            return;
        }
        C97987a.m126563g();
        C116895f.m164891c("MicroMsg.Improve.Click", "ImproveFinderLiveClick");
        h.setTag(c.mo137509G2());
        C96085n8.m123117y(h);
        SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderLiveClick");
    }
}
