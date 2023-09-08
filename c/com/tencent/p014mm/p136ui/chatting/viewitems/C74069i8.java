package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.storage.C72963f4;
import nj3.C76874e0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i8 */
public class C74069i8 extends C74022h8 {
    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6917s6);
        C74088k8 k8Var = new C74088k8();
        k8Var.mo103158a(n4Var, true);
        n4Var.setTag(k8Var);
        return n4Var;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C74088k8 k8Var = (C74088k8) cVar;
        C74023i.C74027e p = mo103098p(bVar);
        if (k8Var != null) {
            k8Var.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), k8Var, (String) null));
            k8Var.clickArea.setOnLongClickListener(p);
            k8Var.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048187;
    }
}
