package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import pb1.C100703e0;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;

/* renamed from: com.tencent.mm.plugin.fav.ui.a1 */
public class C93484a1 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ int f269967d;

    /* renamed from: e */
    public final /* synthetic */ FavSearchUI f269968e;

    public C93484a1(FavSearchUI favSearchUI, int i) {
        this.f269968e = favSearchUI;
        this.f269967d = i;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C100703e0 e0Var = new C100703e0();
        FavSearchUI favSearchUI = this.f269968e;
        C100755z h = favSearchUI.f269809n.getItem((this.f269967d - favSearchUI.f269812q.getHeaderViewsCount()) - 1);
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
        if (h.f295172Q0) {
            contextMenu.add(0, 5, 0, C0966R.string.coq);
        }
        contextMenu.add(0, 0, 0, C0966R.string.f360418cn2);
        contextMenu.add(0, 1, 0, C0966R.string.cp_);
    }
}
