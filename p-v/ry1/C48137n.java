package ry1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.game.p061ui.GameCategoryUI;
import com.tencent.p014mm.plugin.game.p061ui.GameSearchUI;
import com.tencent.wechat.aff.ting.TingClientProto;
import j20.C117292a;
import k20.C9556a;

/* renamed from: ry1.n */
public class C48137n implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameCategoryUI f129033d;

    public C48137n(GameCategoryUI gameCategoryUI) {
        this.f129033d = gameCategoryUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent(this.f129033d, GameSearchUI.class);
        int i = this.f129033d.f113671n;
        if (i == 1) {
            intent.putExtra("game_report_from_scene", TingClientProto.TingScene.TingScene_FinderProfileSinger_VALUE);
        } else if (i == 2) {
            intent.putExtra("game_report_from_scene", 1502);
        }
        GameCategoryUI gameCategoryUI = this.f129033d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        GameCategoryUI gameCategoryUI2 = gameCategoryUI;
        C117292a.m165358d(gameCategoryUI2, aVar.mo10232b(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        gameCategoryUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(gameCategoryUI2, "com/tencent/mm/plugin/game/ui/GameCategoryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
