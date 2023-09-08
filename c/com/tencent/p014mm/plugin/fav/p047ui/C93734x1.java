package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.ContextMenu;
import android.view.View;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import pb1.C100703e0;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;
import tf3.C101875i;

/* renamed from: com.tencent.mm.plugin.fav.ui.x1 */
public class C93734x1 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ int f270571d;

    /* renamed from: e */
    public final /* synthetic */ long f270572e;

    /* renamed from: f */
    public final /* synthetic */ FavoriteIndexUI f270573f;

    public C93734x1(FavoriteIndexUI favoriteIndexUI, int i, long j) {
        this.f270573f = favoriteIndexUI;
        this.f270571d = i;
        this.f270572e = j;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C100703e0 e0Var = new C100703e0();
        FavoriteIndexUI favoriteIndexUI = this.f270573f;
        C100755z h = favoriteIndexUI.f269912H.getItem((this.f270571d - favoriteIndexUI.f269624h.getHeaderViewsCount()) - 1);
        Log.m105925i("MicroMsg.FavoriteIndexUI", "onCreateContextMenu() pos:%s id:%s fav_id:%s", Integer.valueOf(this.f270571d), Long.valueOf(this.f270572e), Integer.valueOf(h.field_id));
        boolean c = e0Var.mo140134c(h);
        if (!c) {
            contextMenu.add(0, 3, 0, C0966R.string.cqx);
        }
        if (c && C100734q.m131841c0(h)) {
            contextMenu.add(0, 3, 0, C0966R.string.cqx);
        }
        if (h.field_type == 8) {
            C101834rc0 D = C100734q.m131813D(h);
            if (C100734q.m131834Y(D) && !C100734q.m131835Z(D)) {
                contextMenu.add(0, 4, 0, C0966R.string.cpk);
            }
        }
        contextMenu.add(0, 2, 0, C0966R.string.cnr);
        contextMenu.add(0, 0, 0, C0966R.string.f360418cn2);
        contextMenu.add(0, 1, 0, C0966R.string.cp_);
        if (C79758p.f233760a.mo109883f(new C101875i()) == 1) {
            contextMenu.add(0, 5, 0, C0966R.string.cty);
        }
    }
}
