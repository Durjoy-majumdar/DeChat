package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.report.service.C85405m;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.TestTimeForSns */
public class TestTimeForSns extends FrameLayout {
    public final boolean DEBUG = true;
    public final String TAG = "MicroMsg.TestTimeForSns";
    public long beginTime;
    private boolean hasDrawed;
    private C95702a listener;

    /* renamed from: com.tencent.mm.plugin.sns.ui.TestTimeForSns$a */
    public interface C95702a {
    }

    public TestTimeForSns(Context context) {
        super(context);
    }

    public void dispatchDraw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        super.dispatchDraw(canvas);
        if (!this.hasDrawed) {
            this.hasDrawed = true;
            C95702a aVar = this.listener;
            if (aVar != null) {
                SnsTimeLineUI$$h0 snsTimeLineUI$$h0 = (SnsTimeLineUI$$h0) aVar;
                snsTimeLineUI$$h0.getClass();
                SnsMethodCalculate.markStartTimeMs("onViewDrawed", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$52");
                Log.m105924i("MicroMsg.SnsTimeLineUI", "sns has drawed");
                SnsTimeLineUI.m122298Z7(snsTimeLineUI$$h0.f278752a).post(new C96068m6(snsTimeLineUI$$h0));
                SnsMethodCalculate.markEndTimeMs("onViewDrawed", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$52");
            }
        }
        C85405m.m105412b(10);
        C85405m.m105412b(22);
        SnsMethodCalculate.markEndTimeMs("dispatchDraw", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
    }

    public boolean hasDrawed() {
        SnsMethodCalculate.markStartTimeMs("hasDrawed", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        boolean z = this.hasDrawed;
        SnsMethodCalculate.markEndTimeMs("hasDrawed", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        return z;
    }

    public void setListener(C95702a aVar) {
        SnsMethodCalculate.markStartTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
        this.listener = aVar;
        SnsMethodCalculate.markEndTimeMs("setListener", "com.tencent.mm.plugin.sns.ui.TestTimeForSns");
    }

    public TestTimeForSns(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
