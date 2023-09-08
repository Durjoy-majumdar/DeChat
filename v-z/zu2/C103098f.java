package zu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: zu2.f */
public class C103098f {
    /* renamed from: a */
    public static boolean m136375a(View view, float f, float f2) {
        SnsMethodCalculate.markStartTimeMs("inView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
        if (view == null || f < ((float) view.getLeft()) || f > ((float) view.getRight()) || f2 < ((float) view.getTop()) || f2 > ((float) view.getBottom())) {
            SnsMethodCalculate.markEndTimeMs("inView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
            return false;
        }
        SnsMethodCalculate.markEndTimeMs("inView", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridUtils");
        return true;
    }
}
