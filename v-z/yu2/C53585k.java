package yu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerPreviewUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yu2.k */
public final class C53585k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerPreviewUI f150589d;

    public C53585k(SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        this.f150589d = snsAlbumPickerPreviewUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initBackButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initBackButton$1");
        this.f150589d.finish();
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initBackButton$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initBackButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
