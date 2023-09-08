package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75604z3;
import ht1.C60200t1;
import ht1.C76245e1;
import nj3.C76874e0;
import p629ny.C76979h;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.n1 */
public class C74132n1 extends C74023i implements C73774p2 {

    /* renamed from: v */
    public C67391b f217626v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6938sq);
        C74096l1 l1Var = new C74096l1();
        l1Var.mo103162a(n4Var, true);
        n4Var.setTag(l1Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (f4Var != null && ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217626v) && mo103081O(f4Var.mo108768t()) && !this.f217626v.mo91580u())) {
            e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
        }
        return true;
    }

    /* renamed from: a */
    public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        if (f4Var.mo101020w3()) {
            C72695v.m85081w(f4Var);
            C75604z3.m90834f(f4Var.getMsgId());
            bVar.mo91541B(true);
        }
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
        Class cls2 = C79368l.class;
        this.f217626v = bVar;
        C74096l1 l1Var = (C74096l1) cVar;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        boolean z = false;
        if (u != null) {
            C76245e1 e1Var = (C76245e1) u.mo93555w(C76245e1.class);
            if (e1Var != null) {
                l1Var.f217475b.setImageDrawable(C74933u4.m89768e(bVar.mo91565f(), C0966R.raw.icons_outlined_finder_guarantee, bVar.mo91572m().getColor(C0966R.color.f2960ag)));
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
            l1Var.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(cls2)).mo108189Z4());
            l1Var.clickArea.setTag(new C74243t8(f4Var, this.f217626v.mo91583x(), l1Var, (String) null));
        }
        if (C74023i.m87878T()) {
            mo103093i0(l1Var, false, true);
            if (f4Var.getStatus() != 2 || !mo103080N((C79368l) bVar.f193278b.mo102812a(cls2), f4Var.getMsgId())) {
                ImageView imageView = l1Var.f217479f;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else {
                ImageView imageView2 = l1Var.f217479f;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
        } else {
            ImageView imageView3 = l1Var.f217479f;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
            if (f4Var.getStatus() < 2) {
                z = true;
            }
            mo103093i0(l1Var, z, true);
        }
        mo103087e0(l1Var, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 1076887601;
    }
}
