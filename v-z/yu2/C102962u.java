package yu2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import yu2.C102923d;

/* renamed from: yu2.u */
public final class C102962u implements C102923d.C102925b {

    /* renamed from: a */
    public final /* synthetic */ SnsAlbumPickerUI f303854a;

    public C102962u(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303854a = snsAlbumPickerUI;
    }

    /* renamed from: a */
    public void mo142650a(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onSelectItemChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$3");
        SnsAlbumPickerUI snsAlbumPickerUI = this.f303854a;
        int i5 = SnsAlbumPickerUI.f280763B;
        SnsMethodCalculate.markStartTimeMs("access$updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.mo133699T7(i);
        SnsMethodCalculate.markEndTimeMs("access$updateNextButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsMethodCalculate.markEndTimeMs("onSelectItemChanged", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$3");
    }
}
