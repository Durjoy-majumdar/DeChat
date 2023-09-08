package yu2;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerPreviewUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yu2.n */
public final class C102955n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerPreviewUI f303847d;

    public C102955n(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        this.f303847d = snsAlbumPickerPreviewUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initNextButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initNextButton$1$1");
        if (SnsAlbumPickerPreviewUI.m123157c8(this.f303847d).isEmpty()) {
            SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI = this.f303847d;
            SnsMethodCalculate.markStartTimeMs("access$getMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            String str = snsAlbumPickerPreviewUI.f280760p0;
            SnsMethodCalculate.markEndTimeMs("access$getMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            snsAlbumPickerPreviewUI.mo133684d8(str, SnsAlbumPickerPreviewUI.m123157c8(this.f303847d));
        }
        Intent intent = new Intent();
        intent.putExtra("sns_album_select_mediaobj_id_list", SnsAlbumPickerPreviewUI.m123157c8(this.f303847d));
        this.f303847d.setResult(-1, intent);
        this.f303847d.finish();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initNextButton$1$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initNextButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
