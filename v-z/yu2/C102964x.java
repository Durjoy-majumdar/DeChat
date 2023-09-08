package yu2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yu2.x */
public final class C102964x implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303856d;

    public C102964x(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303856d = snsAlbumPickerUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initSnsAlbumNextButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumNextButton$1");
        C102923d K7 = SnsAlbumPickerUI.m123171K7(this.f303856d);
        K7.getClass();
        SnsMethodCalculate.markStartTimeMs("getSelectedItemList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        List<C102944e0> S5 = K7.mo142645S5();
        SnsMethodCalculate.markEndTimeMs("getSelectedItemList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        this.f303856d.mo133698S7(S5);
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumNextButton$1");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initSnsAlbumNextButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
