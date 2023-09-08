package yu2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.picker.SnsAlbumPickerUI;

/* renamed from: yu2.r */
public final class C102959r implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumPickerUI f303851d;

    public C102959r(SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f303851d = snsAlbumPickerUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initActionBar$1");
        this.f303851d.onBackPressed();
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initActionBar$1");
        return true;
    }
}
