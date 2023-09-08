package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C6784h2;
import com.tencent.p014mm.p136ui.chatting.manager.C6789c;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74082k3;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import de3.C45331f0;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75604z3;
import eb0.C97625j3;
import jm2.C46562a;
import kb0.C76528a;
import ke3.C88144b;
import nj3.C76874e0;
import p629ny.C76979h;
import p763ym.C79138l;
import zj3.C79368l;
import zj3.C79371n;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l3 */
public class C74098l3 extends C74023i {

    /* renamed from: v */
    public C67391b f217481v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6903rr);
        C74082k3 k3Var = new C74082k3();
        k3Var.mo103154a(n4Var, true);
        n4Var.setTag(k3Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        int itemId = menuItem.getItemId();
        if (itemId == 102) {
            String str = C68070l.C68072b.m80422u(C75604z3.m90840l(bVar.mo91582w(), f4Var.getContent(), f4Var.mo108769t2()), (String) null).f195570f;
            ClipboardHelper.setText(str);
            C46562a aVar = C46562a.INSTANCE;
            aVar.F80(1, f4Var.mo108774y2() + "", Util.getUTF8ByteLength(str));
            return false;
        } else if (itemId != 111) {
            return false;
        } else {
            C6789c.m7088a(f4Var, bVar.mo91565f(), new l3$$a(bVar, f4Var));
            return false;
        }
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (!C75569c4.m90687t(f4Var)) {
            int i = b;
            e0Var.mo107136c(i, 102, 0, this.f217481v.mo91572m().getString(C0966R.string.b9x), C0966R.raw.icons_filled_copy);
            e0Var.mo107136c(i, 111, 0, this.f217481v.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
        }
        C88144b.m109788f("favorite");
        e0Var.mo107136c(b, 116, 0, this.f217481v.mo91572m().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
        if (C75569c4.m90690w(f4Var)) {
            e0Var.clear();
        }
        if (this.f217481v.mo91584y()) {
            return true;
        }
        e0Var.mo107136c(b, 100, 0, this.f217481v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C74082k3.C74083a aVar;
        String str2;
        int indexOf;
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        Class cls = C79138l.class;
        this.f217481v = bVar2;
        ((C79371n) bVar2.f193278b.mo102812a(C79371n.class)).mo102406W4(f4Var2);
        C74082k3 k3Var = (C74082k3) cVar;
        String content = f4Var.getContent();
        if (bVar.mo91583x() && (indexOf = f4Var.getContent().indexOf(58)) != -1) {
            content = f4Var.getContent().substring(indexOf + 1);
        }
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null && u.f195582i == 1) {
            C44561j appInfo = ((C79138l) C86312j.m106911c(cls)).getAppInfo(u.f195562d);
            String str3 = (appInfo == null || (str2 = appInfo.field_appName) == null || str2.trim().length() <= 0) ? u.f195484F : appInfo.field_appName;
            String str4 = u.f195562d;
            if (str4 == null || str4.length() <= 0 || !mo103084W(str3)) {
                k3Var.f217404c.setVisibility(8);
            } else {
                k3Var.f217404c.setText(bVar.mo91572m().getString(C0966R.string.bby, new Object[]{((C79138l) C86312j.m106911c(cls)).mo74019xG(bVar.mo91565f(), appInfo, str3)}));
                k3Var.f217404c.setVisibility(0);
                mo103076J(bVar2, k3Var.f217404c, u.f195562d);
                mo103079M(bVar2, k3Var.f217404c, u.f195562d);
            }
            String str5 = u.f195642x;
            if (str5 == null || str5.length() <= 0) {
                k3Var.f217405d.setVisibility(8);
            } else {
                mo103073G(bVar2, k3Var.f217405d, C74243t8.m88488a(u.f195642x));
                k3Var.f217405d.setVisibility(0);
            }
            k3Var.f217403b.setClickable(true);
            Bundle a = C45331f0.m50242a(bVar.mo91583x(), C76528a.m92004a(f4Var.mo108768t()));
            Bundle f = C74059i7.m88001f(f4Var2, bVar2, str);
            f.putAll(a);
            k3Var.f217403b.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).mo107082uA(k3Var.f217403b.getContext(), !C75569c4.m90693z(f4Var), u.f195570f, (int) k3Var.f217403b.getTextSize(), 4, f, C76979h.f224926w0, 0));
        }
        k3Var.f217403b.setTag(new C74243t8(f4Var2, bVar.mo91583x(), k3Var, (String) null));
        if (C97625j3.m125812b().mo105883I()) {
            k3Var.f217403b.setOnLongClickListener(mo103098p(bVar2));
            if (u != null && u.f195582i == 1) {
                MMNeat7extView mMNeat7extView = k3Var.f217403b;
                C6784h2 Z4 = ((C79368l) bVar2.f193278b.mo102812a(C79368l.class)).mo108189Z4();
                if (Z4 != null) {
                    aVar = k3Var.f217406e;
                    aVar.f217407j = Z4;
                } else {
                    aVar = null;
                }
                mMNeat7extView.setOnTouchListener(aVar);
            }
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 16777265;
    }
}
