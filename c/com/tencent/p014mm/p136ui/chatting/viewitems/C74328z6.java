package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import nj3.C76874e0;
import p629ny.C76979h;
import vb0.C78380a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z6 */
public class C74328z6 extends C74059i7.C74060a {

    /* renamed from: A */
    public C67391b f218345A;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6928sg);
        C73936b7 b7Var = new C73936b7();
        b7Var.mo103015a(n4Var, true);
        n4Var.setTag(b7Var);
        return n4Var;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        if (!f4Var.mo100968G3()) {
            return true;
        }
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (f4Var.getStatus() == 5) {
            e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
        }
        if (this.f218345A.mo91584y()) {
            return true;
        }
        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f218345A = bVar;
        C73936b7 b7Var = (C73936b7) cVar;
        C78380a.C78381a a = C78380a.C78381a.m94648a(f4Var.getContent());
        if (a != null) {
            String str2 = a.f229690a;
            mo102973h(b7Var, bVar, f4Var, str2);
            mo103089g(b7Var, bVar, str2, f4Var);
            ((C76979h) C86312j.m106911c(C76979h.class)).mo107078or(b7Var.f217022b.getContext(), C78380a.m94646a(a), (int) b7Var.f217022b.getTextSize(), 1, (Object) null, "");
            b7Var.f217022b.setTag(new C74243t8(f4Var, bVar.mo91583x(), b7Var, (String) null));
            b7Var.f217022b.setOnLongClickListener(mo103098p(bVar));
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        if (!z) {
            return i == 55 || i == 57;
        }
        return false;
    }
}
