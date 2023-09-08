package yu2;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;

/* renamed from: yu2.c0 */
public final class C102922c0 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303784d;

    public C102922c0(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303784d = snsAlbumPickerUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showMaterialLoadingDialog$1");
        SnsAlbumPickerUI snsAlbumPickerUI = this.f303784d;
        int i = SnsAlbumPickerUI.f280763B;
        SnsMethodCalculate.markStartTimeMs("access$setMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        snsAlbumPickerUI.f280776r = true;
        SnsMethodCalculate.markEndTimeMs("access$setMIsCancelCurDownload$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        SnsAlbumPickerUI snsAlbumPickerUI2 = this.f303784d;
        SnsMethodCalculate.markStartTimeMs("access$getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        C102914a R7 = snsAlbumPickerUI2.mo133697R7();
        SnsMethodCalculate.markEndTimeMs("access$getSnsFileSaveHelper", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
        R7.mo142637f();
        SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$showMaterialLoadingDialog$1");
    }
}
