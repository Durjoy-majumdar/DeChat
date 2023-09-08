package yu2;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: yu2.a0 */
public final class C102919a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303778d;

    public C102919a0(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303778d = snsAlbumPickerUI;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$firstPageLoadRunnable$1");
        SnsAlbumPickerUI snsAlbumPickerUI = this.f303778d;
        int i = SnsAlbumPickerUI.f280763B;
        SnsMethodCalculate.markStartTimeMs("access$getMIsFinishing$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        boolean z = snsAlbumPickerUI.f280765d;
        SnsMethodCalculate.markEndTimeMs("access$getMIsFinishing$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (z) {
            Log.m105918d("MicroMsg.SnsAlbumPickerUI", "firstPageLoadRunnable: too fast that it finish");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$firstPageLoadRunnable$1");
            return;
        }
        SnsAlbumPickerUI snsAlbumPickerUI2 = this.f303778d;
        SnsMethodCalculate.markStartTimeMs("access$fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI2.getClass();
        SnsMethodCalculate.markStartTimeMs("fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C5431p1.C5432a aVar = snsAlbumPickerUI2.f280767f;
        if (aVar != null) {
            SnsMethodCalculate.markStartTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            aVar.mo6423t(2, snsAlbumPickerUI2.f280769h, snsAlbumPickerUI2.f280764A);
        }
        C5431p1.C5432a aVar2 = snsAlbumPickerUI2.f280767f;
        if (aVar2 != null) {
            SnsMethodCalculate.markStartTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            String str = snsAlbumPickerUI2.f280769h;
            aVar2.mo6413d(2, str, C87412m.m108589b(str, snsAlbumPickerUI2.mo133694O7()), C87412m.m108589b(snsAlbumPickerUI2.f280769h, snsAlbumPickerUI2.mo133694O7()), 0);
        }
        SnsMethodCalculate.markEndTimeMs("fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("access$fetchFirstPageRemoteSnsAlbumData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$firstPageLoadRunnable$1");
    }
}
