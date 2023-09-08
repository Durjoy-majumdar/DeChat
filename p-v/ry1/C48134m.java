package ry1;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.game.p061ui.GameCategoryUI;

/* renamed from: ry1.m */
public class C48134m implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameCategoryUI f129029d;

    public C48134m(GameCategoryUI gameCategoryUI) {
        this.f129029d = gameCategoryUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f129029d.finish();
        return true;
    }
}
