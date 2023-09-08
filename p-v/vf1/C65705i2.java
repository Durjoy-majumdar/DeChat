package vf1;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveDelManagerUI;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: vf1.i2 */
public final class C65705i2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveDelManagerUI f189051d;

    public C65705i2(FinderLiveDelManagerUI finderLiveDelManagerUI) {
        this.f189051d = finderLiveDelManagerUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        FinderLiveDelManagerUI finderLiveDelManagerUI = this.f189051d;
        int i = FinderLiveDelManagerUI.f158985j;
        finderLiveDelManagerUI.getClass();
        Intent intent = new Intent();
        intent.putExtra("Select_Contact", Util.listToString(finderLiveDelManagerUI.f158986d.mo88155F4(), ","));
        finderLiveDelManagerUI.setResult(-1, intent);
        finderLiveDelManagerUI.finish();
        finderLiveDelManagerUI.mo77429H7();
        finderLiveDelManagerUI.f158986d.notifyDataSetChanged();
        return true;
    }
}
