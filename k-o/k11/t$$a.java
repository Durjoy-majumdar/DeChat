package k11;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingDetailUI;

public final /* synthetic */ class t$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingDetailUI f290487d;

    public /* synthetic */ t$$a(CleanChattingDetailUI cleanChattingDetailUI) {
        this.f290487d = cleanChattingDetailUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        CleanChattingDetailUI cleanChattingDetailUI = this.f290487d;
        int i = CleanChattingDetailUI.f267875s;
        cleanChattingDetailUI.finish();
        return false;
    }
}
