package ry1;

import android.view.MenuItem;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.GameDownloadGuidanceUI;
import uy1.C52642c;

/* renamed from: ry1.b0 */
public class C48107b0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameDownloadGuidanceUI f128969d;

    public C48107b0(GameDownloadGuidanceUI gameDownloadGuidanceUI) {
        this.f128969d = gameDownloadGuidanceUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C40314g.m43484c(this.f128969d.getContext(), 10, 1008, 1, C52642c.m59002t(this.f128969d.getContext(), this.f128969d.f113835x, (String) null), this.f128969d.f113685i, (String) null);
        return true;
    }
}
