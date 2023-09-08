package yu2;

import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.List;
import yu2.C102923d;

/* renamed from: yu2.t */
public final class C102961t implements C102923d.C102926c {

    /* renamed from: a */
    public final /* synthetic */ SnsAlbumPickerUI f303853a;

    public C102961t(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303853a = snsAlbumPickerUI;
    }

    /* renamed from: a */
    public void mo142651a(List<C102944e0> list) {
        SnsMethodCalculate.markStartTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$2");
        C87412m.m108594g(list, "list");
        Log.m105924i("MicroMsg.SnsAlbumPickerUI", "Adapter onLoadDataFinish callback to UI ，list count = " + list.size());
        if (!list.isEmpty() || SnsAlbumPickerUI.m123171K7(this.f303853a).getItemCount() > 0) {
            SnsAlbumPickerUI.m123169I7(this.f303853a).setVisibility(0);
            SnsAlbumPickerUI snsAlbumPickerUI = this.f303853a;
            SnsMethodCalculate.markStartTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            TextView Q7 = snsAlbumPickerUI.mo133696Q7();
            SnsMethodCalculate.markEndTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            Q7.setVisibility(8);
        } else {
            SnsAlbumPickerUI.m123169I7(this.f303853a).setVisibility(4);
            SnsAlbumPickerUI snsAlbumPickerUI2 = this.f303853a;
            SnsMethodCalculate.markStartTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            TextView Q72 = snsAlbumPickerUI2.mo133696Q7();
            SnsMethodCalculate.markEndTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
            Q72.setVisibility(0);
            if (!SnsAlbumPickerUI.m123170J7(this.f303853a)) {
                SnsAlbumPickerUI snsAlbumPickerUI3 = this.f303853a;
                SnsMethodCalculate.markStartTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                TextView Q73 = snsAlbumPickerUI3.mo133696Q7();
                SnsMethodCalculate.markEndTimeMs("access$getMStateDataTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI");
                Q73.setText(this.f303853a.getString(C0966R.string.jaw));
            }
        }
        if (list.isEmpty() && SnsAlbumPickerUI.m123170J7(this.f303853a)) {
            SnsAlbumPickerUI.m123168H7(this.f303853a);
        }
        SnsMethodCalculate.markEndTimeMs("onLoadDataFinish", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$2");
    }
}
