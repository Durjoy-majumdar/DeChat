package yu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerPreviewUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yu2.p */
public final class C102957p implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerPreviewUI f303849d;

    public C102957p(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        this.f303849d = snsAlbumPickerPreviewUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initSelectArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initSelectArea$2");
        SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI = this.f303849d;
        int i = SnsAlbumPickerPreviewUI.f280747R0;
        SnsMethodCalculate.markStartTimeMs("access$getMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        String str = snsAlbumPickerPreviewUI.f280760p0;
        SnsMethodCalculate.markEndTimeMs("access$getMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        snsAlbumPickerPreviewUI.mo133684d8(str, SnsAlbumPickerPreviewUI.m123157c8(this.f303849d));
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initSelectArea$2");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initSelectArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
