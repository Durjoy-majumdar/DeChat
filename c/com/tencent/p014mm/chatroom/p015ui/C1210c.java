package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.chatroom.ui.c */
public final class C1210c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomOpenErrorInfoUI f10241d;

    public C1210c(ChatRoomOpenErrorInfoUI chatRoomOpenErrorInfoUI) {
        this.f10241d = chatRoomOpenErrorInfoUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f10241d.finish();
        return false;
    }
}
