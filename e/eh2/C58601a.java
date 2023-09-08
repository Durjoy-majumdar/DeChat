package eh2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.recordvideo.jumper.CaptureDataManager;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordMediaReportInfo;
import gy3.C87412m;

/* renamed from: eh2.a */
public final class C58601a implements CaptureDataManager.C94403b {
    /* renamed from: U5 */
    public void mo79064U5(boolean z, RecordMediaReportInfo recordMediaReportInfo, Bundle bundle) {
        C87412m.m108594g(recordMediaReportInfo, "reportInfo");
        C87412m.m108594g(bundle, "extData");
    }

    /* renamed from: i2 */
    public void mo4197i2(Context context, CaptureDataManager.CaptureVideoNormalModel captureVideoNormalModel, Bundle bundle) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(captureVideoNormalModel, "model");
        C87412m.m108594g(bundle, "extData");
        Intent intent = new Intent();
        intent.putExtra("key_extra_data", bundle);
        intent.putExtra("KSEGMENTMEDIAINFO", captureVideoNormalModel);
        Activity activity = (Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    /* renamed from: l1 */
    public boolean mo4198l1(Context context, Bundle bundle, CaptureDataManager.C94402a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bundle, "extData");
        C87412m.m108594g(aVar, "finishController");
        return false;
    }
}
