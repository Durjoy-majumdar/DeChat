package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Intent;
import android.view.MenuItem;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.p */
public class C2254p implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceLikeUI f12337d;

    public C2254p(ExdeviceLikeUI exdeviceLikeUI) {
        this.f12337d = exdeviceLikeUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent(this.f12337d, ExdeviceRankInfoUI.class);
        intent.putExtra("app_username", this.f12337d.f111128e);
        intent.putExtra("rank_id", "#");
        intent.putExtra("key_is_latest", true);
        intent.putExtra("device_type", 1);
        ExdeviceLikeUI exdeviceLikeUI = this.f12337d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        ExdeviceLikeUI exdeviceLikeUI2 = exdeviceLikeUI;
        C117292a.m165358d(exdeviceLikeUI2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        exdeviceLikeUI.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(exdeviceLikeUI2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceLikeUI$1", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f12337d.finish();
        return false;
    }
}
