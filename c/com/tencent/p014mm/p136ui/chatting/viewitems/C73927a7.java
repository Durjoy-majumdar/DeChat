package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
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

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a7 */
public class C73927a7 extends C74059i7.C74061b {

    /* renamed from: A */
    public C67391b f216991A;

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        if (!f4Var.mo100968G3()) {
            return true;
        }
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (f4Var.getStatus() == 5) {
            e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
        }
        if (this.f216991A.mo91584y()) {
            return true;
        }
        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f216991A = bVar;
        C74059i7.C74068g gVar = (C74059i7.C74068g) cVar;
        C78380a.C78381a a = C78380a.C78381a.m94648a(f4Var.getContent());
        mo103093i0(gVar, f4Var.getStatus() < 2, true);
        ((C76979h) C86312j.m106911c(C76979h.class)).mo107078or(gVar.f217322b.getContext(), C78380a.m94646a(a), (int) gVar.f217322b.getTextSize(), 1, (Object) null, "");
        gVar.f217322b.setTag(new C74243t8(f4Var, bVar.mo91583x(), gVar, (String) null));
        gVar.f217322b.setOnLongClickListener(mo103098p(bVar));
        mo103087e0(gVar, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        if (z) {
            return i == 55 || i == 57;
        }
        return false;
    }
}
