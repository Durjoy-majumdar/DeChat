package yu2;

import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import gy3.C87412m;

/* renamed from: yu2.q */
public final class C102958q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303850d;

    public C102958q(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303850d = snsAlbumPickerUI;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$fetchNextPageRemoteSnsAlbumData$1");
        SnsAlbumPickerUI snsAlbumPickerUI = this.f303850d;
        int i = SnsAlbumPickerUI.f280763B;
        SnsMethodCalculate.markStartTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.f280766e = true;
        SnsMethodCalculate.markEndTimeMs("access$setMIsDataFetching$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsAlbumPickerUI snsAlbumPickerUI2 = this.f303850d;
        SnsMethodCalculate.markStartTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C5431p1.C5432a aVar = snsAlbumPickerUI2.f280767f;
        SnsMethodCalculate.markEndTimeMs("access$getMSnsServer$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        if (aVar != null) {
            this.f303850d.getClass();
            SnsMethodCalculate.markStartTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsMethodCalculate.markEndTimeMs("getSnsServerType", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI snsAlbumPickerUI3 = this.f303850d;
            SnsMethodCalculate.markStartTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            String str = snsAlbumPickerUI3.f280769h;
            SnsMethodCalculate.markEndTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI snsAlbumPickerUI4 = this.f303850d;
            SnsMethodCalculate.markStartTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            String str2 = snsAlbumPickerUI4.f280769h;
            SnsMethodCalculate.markEndTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI snsAlbumPickerUI5 = this.f303850d;
            SnsMethodCalculate.markStartTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            String O7 = snsAlbumPickerUI5.mo133694O7();
            SnsMethodCalculate.markEndTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            boolean b = C87412m.m108589b(str2, O7);
            SnsAlbumPickerUI snsAlbumPickerUI6 = this.f303850d;
            SnsMethodCalculate.markStartTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            String str3 = snsAlbumPickerUI6.f280769h;
            SnsMethodCalculate.markEndTimeMs("access$getMUserName$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            SnsAlbumPickerUI snsAlbumPickerUI7 = this.f303850d;
            SnsMethodCalculate.markStartTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            String O72 = snsAlbumPickerUI7.mo133694O7();
            SnsMethodCalculate.markEndTimeMs("access$getMSelfName", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            boolean b2 = C87412m.m108589b(str3, O72);
            SnsAlbumPickerUI snsAlbumPickerUI8 = this.f303850d;
            SnsMethodCalculate.markStartTimeMs("access$getMSnsSource$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            snsAlbumPickerUI8.getClass();
            SnsMethodCalculate.markEndTimeMs("access$getMSnsSource$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            aVar.mo6414e(2, str, b, b2, 0);
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$fetchNextPageRemoteSnsAlbumData$1");
    }
}
