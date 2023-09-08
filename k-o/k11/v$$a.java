package k11;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.clean.p036ui.fileindexui.CleanChattingUI;

public final /* synthetic */ class v$$a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CleanChattingUI f290499d;

    public /* synthetic */ v$$a(CleanChattingUI cleanChattingUI) {
        this.f290499d = cleanChattingUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        CleanChattingUI cleanChattingUI = this.f290499d;
        long[] jArr = CleanChattingUI.f267888D;
        cleanChattingUI.finish();
        return false;
    }
}
