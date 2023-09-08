package ry1;

import android.view.MenuItem;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.GameOverSeaCenterUI;
import uy1.C52642c;

/* renamed from: ry1.v0 */
public class C48165v0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameOverSeaCenterUI f129097d;

    public C48165v0(GameOverSeaCenterUI gameOverSeaCenterUI) {
        this.f129097d = gameOverSeaCenterUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        C40314g.m43484c(this.f129097d.getContext(), 10, 1008, 1, C52642c.m59002t(this.f129097d.getContext(), this.f129097d.f114105C, (String) null), this.f129097d.f113685i, (String) null);
        return true;
    }
}
