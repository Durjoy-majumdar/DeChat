package yu2;

import androidx.recyclerview.widget.GridLayoutManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;

/* renamed from: yu2.y */
public final class C102965y extends GridLayoutManager.C0127b {

    /* renamed from: b */
    public final /* synthetic */ SnsAlbumPickerUI f303857b;

    public C102965y(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303857b = snsAlbumPickerUI;
    }

    /* renamed from: c */
    public int mo118c(int i) {
        SnsMethodCalculate.markStartTimeMs("getSpanSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$1$1");
        int i2 = 1;
        if (SnsAlbumPickerUI.m123171K7(this.f303857b).getItemViewType(i) != 1) {
            i2 = 4;
        }
        SnsMethodCalculate.markEndTimeMs("getSpanSize", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumRecyclerView$1$1");
        return i2;
    }
}
