package com.tencent.p014mm.p136ui.contact;

import android.view.MenuItem;
import com.tencent.p014mm.p136ui.contact.OpenIMAddressUI;

/* renamed from: com.tencent.mm.ui.contact.o2 */
public class C74537o2 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ OpenIMAddressUI.OpenIMAddressUIFragment f219111d;

    public C74537o2(OpenIMAddressUI.OpenIMAddressUIFragment openIMAddressUIFragment) {
        this.f219111d = openIMAddressUIFragment;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f219111d.finish();
        return true;
    }
}
