package it2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.album.SnsAlbumUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: it2.b */
public class C46285b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ SnsAlbumUI f124735d;

    public C46285b(SnsAlbumUI snsAlbumUI) {
        this.f124735d = snsAlbumUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$2");
        if (this.f124735d.getActivity() != null) {
            this.f124735d.getActivity().finish();
        }
        SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.album.SnsAlbumUI$2");
        return true;
    }
}
