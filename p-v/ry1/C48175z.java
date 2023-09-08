package ry1;

import android.content.Context;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.game.report.C40314g;
import com.tencent.p014mm.plugin.game.p061ui.GameDetailUI2;
import p141db.C7257a;
import py1.C47643o4;
import qo3.C77407n;

/* renamed from: ry1.z */
public class C48175z implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameDetailUI2 f129120d;

    public C48175z(GameDetailUI2 gameDetailUI2) {
        this.f129120d = gameDetailUI2;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        GameDetailUI2 gameDetailUI2 = this.f129120d;
        C47643o4 o4Var = gameDetailUI2.f113802p0;
        C77407n nVar = new C77407n((Context) gameDetailUI2.getContext(), 1, false);
        nVar.f225771i = new C48164v(gameDetailUI2, o4Var);
        nVar.f225782p = new C48166w(gameDetailUI2);
        nVar.mo107573q();
        AppCompatActivity context = this.f129120d.getContext();
        GameDetailUI2 gameDetailUI22 = this.f129120d;
        C40314g.m43487f(context, 12, C7257a.CTRL_INDEX, 1, 2, gameDetailUI22.f113792d, gameDetailUI22.f113799n, (String) null);
        return false;
    }
}
