package com.tencent.p014mm.plugin.fav.p047ui;

import android.view.ContextMenu;
import android.view.View;
import bp3.C79758p;
import com.tencent.p014mm.C0966R;
import pb1.C100703e0;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101834rc0;
import tf3.C101875i;

/* renamed from: com.tencent.mm.plugin.fav.ui.w */
public class C93713w implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ int f270515d;

    /* renamed from: e */
    public final /* synthetic */ FavFilterUI f270516e;

    public C93713w(FavFilterUI favFilterUI, int i) {
        this.f270516e = favFilterUI;
        this.f270515d = i;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C100703e0 e0Var = new C100703e0();
        FavFilterUI favFilterUI = this.f270516e;
        C100755z h = favFilterUI.f269694o.getItem((this.f270515d - favFilterUI.f269695p.getHeaderViewsCount()) - 1);
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
        if (this.f270516e.f269687e == 22) {
            contextMenu.add(0, 6, 0, C0966R.string.cqv);
        }
        contextMenu.add(0, 1, 0, C0966R.string.cp_);
        if (C79758p.f233760a.mo109883f(new C101875i()) == 1) {
            contextMenu.add(0, 7, 0, C0966R.string.cty);
        }
    }
}
