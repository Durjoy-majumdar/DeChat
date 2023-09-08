package com.tencent.p014mm.plugin.profile.p088ui;

import android.view.MenuItem;
import kf2.C46723f;

/* renamed from: com.tencent.mm.plugin.profile.ui.ContactInfoUI$$m */
public class ContactInfoUI$$m implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactInfoUI f202556d;

    public ContactInfoUI$$m(ContactInfoUI contactInfoUI) {
        this.f202556d = contactInfoUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f202556d.finish();
        String username = this.f202556d.f202536n.getUsername();
        ContactInfoUI contactInfoUI = this.f202556d;
        C46723f.m52019a(username, 1501, contactInfoUI.f202534i, contactInfoUI.f202547y, contactInfoUI.getIntent());
        return true;
    }
}
