package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.MenuItem;
import com.tencent.p014mm.autogen.events.NotifyWNNoteOperationEvent;

/* renamed from: com.tencent.mm.plugin.fav.ui.t1 */
public class C93700t1 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ FavoriteIndexUI f270496d;

    public C93700t1(FavoriteIndexUI favoriteIndexUI) {
        this.f270496d = favoriteIndexUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        FavoriteIndexUI favoriteIndexUI = this.f270496d;
        int i = FavoriteIndexUI.f269910R;
        favoriteIndexUI.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new NotifyWNNoteOperationEvent();
        NotifyWNNoteOperationEvent.C92535a aVar = notifyWNNoteOperationEvent.f264942d;
        aVar.field_localId = currentTimeMillis;
        aVar.f264947d = favoriteIndexUI.getContext();
        notifyWNNoteOperationEvent.f264942d.f264944a = 9;
        notifyWNNoteOperationEvent.publish();
        return true;
    }
}
