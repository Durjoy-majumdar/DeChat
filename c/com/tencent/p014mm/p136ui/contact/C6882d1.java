package com.tencent.p014mm.p136ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.contact.d1 */
public class C6882d1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ GroupCardSelectUI f24520d;

    public C6882d1(GroupCardSelectUI groupCardSelectUI) {
        this.f24520d = groupCardSelectUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_User", Util.listToString(this.f24520d.f24401o, ","));
        this.f24520d.setResult(-1, intent);
        this.f24520d.finish();
        return true;
    }
}
