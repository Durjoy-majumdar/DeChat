package com.tencent.p014mm.chatroom.p015ui;

import android.view.MenuItem;

/* renamed from: com.tencent.mm.chatroom.ui.a */
public final class C1200a implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ChatRoomBindAppUI f10227d;

    public C1200a(ChatRoomBindAppUI chatRoomBindAppUI) {
        this.f10227d = chatRoomBindAppUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.f10227d.finish();
        return true;
    }
}
