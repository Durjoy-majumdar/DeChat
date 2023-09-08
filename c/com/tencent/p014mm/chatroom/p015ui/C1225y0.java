package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.chatroom.ui.y0 */
public class C1225y0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ManageChatroomUI f10268d;

    public C1225y0(ManageChatroomUI manageChatroomUI) {
        this.f10268d = manageChatroomUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f10268d.finish();
        return true;
    }
}
