package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import ht1.C60200t1;
import ht1.C76245e1;
import nj3.C76874e0;
import p629ny.C76979h;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m1 */
public class C74112m1 extends C74023i {

    /* renamed from: v */
    public C67391b f217532v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6888r_);
        C74096l1 l1Var = new C74096l1();
        l1Var.mo103162a(n4Var, false);
        n4Var.setTag(l1Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        C76245e1 e1Var;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u == null || (e1Var = (C76245e1) u.mo93555w(C76245e1.class)) == null) {
            return false;
        }
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76815U5(bVar.mo91565f(), e1Var.f223342f, e1Var.f223340d, 1201, "");
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        Class cls = C76979h.class;
        this.f217532v = bVar;
        C74096l1 l1Var = (C74096l1) cVar;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null) {
            C76245e1 e1Var = (C76245e1) u.mo93555w(C76245e1.class);
            if (e1Var != null) {
                l1Var.f217475b.setImageDrawable(C74933u4.m89768e(bVar.mo91565f(), C0966R.raw.icons_outlined_finder_guarantee, bVar.mo91565f().getResources().getColor(C0966R.color.Orange_100)));
                l1Var.f217476c.setText(C0966R.string.d79);
                if (Util.isNullOrNil(e1Var.f223339c)) {
                    l1Var.f217477d.setVisibility(8);
                } else {
                    l1Var.f217477d.setVisibility(0);
                    l1Var.f217477d.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), e1Var.f223339c));
                }
                l1Var.f217478e.setText(((C76979h) C86312j.m106911c(cls)).mo107057T1(bVar.mo91565f(), e1Var.f223338b));
            }
            l1Var.clickArea.setOnClickListener(mo103099u(bVar));
            l1Var.clickArea.setOnLongClickListener(mo103098p(bVar));
            l1Var.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            l1Var.clickArea.setTag(new C74243t8(f4Var, this.f217532v.mo91583x(), l1Var, (String) null));
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 1076887601;
    }
}
