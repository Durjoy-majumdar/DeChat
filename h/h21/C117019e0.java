package h21;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.collect.p038ui.CollectMainUI;
import nj3.C11184p0;
import te3.C51549ui;

/* renamed from: h21.e0 */
public class C117019e0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C51549ui f350670d;

    /* renamed from: e */
    public final /* synthetic */ CollectMainUI f350671e;

    public C117019e0(CollectMainUI collectMainUI, C51549ui uiVar) {
        this.f350671e = collectMainUI;
        this.f350670d = uiVar;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        CollectMainUI collectMainUI = this.f350671e;
        collectMainUI.f345611h = 2;
        CollectMainUI.m162068J7(collectMainUI, this.f350670d.f142863e.get(itemId));
    }
}
