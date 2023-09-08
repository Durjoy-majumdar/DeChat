package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import ke3.C88144b;
import nj3.C76874e0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.t6 */
public class C74234t6 extends C74023i {

    /* renamed from: v */
    public C67391b f217929v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f6910rz, (ViewGroup) null);
        C74268u6 u6Var = new C74268u6();
        u6Var.timeTV = (TextView) inflate.findViewById(C0966R.C0970id.b8z);
        u6Var.userTV = (TextView) inflate.findViewById(C0966R.C0970id.b9_);
        u6Var.f218145b = (ImageView) inflate.findViewById(C0966R.C0970id.b7g);
        u6Var.f218146c = (TextView) inflate.findViewById(C0966R.C0970id.f357689b91);
        u6Var.f218147d = (TextView) inflate.findViewById(C0966R.C0970id.b4b);
        u6Var.clickArea = inflate.findViewById(C0966R.C0970id.b47);
        inflate.setTag(u6Var);
        return inflate;
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
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (this.f217929v.mo91584y()) {
            return true;
        }
        e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        C74243t8 t8Var = (C74243t8) view.getTag();
        C72963f4.C72969f Ux0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Ux0(t8Var.f212238a.getContent());
        if (Util.nullAsNil(Ux0.f212727f).length() > 0) {
            C88144b.m109791i(bVar.mo91565f(), "qqmail", ".ui.ReadMailUI", new Intent().putExtra("msgid", t8Var.f212238a.getMsgId()), (Bundle) null);
            return true;
        } else if (Util.nullAsNil(Ux0.f212725d).length() <= 0) {
            return true;
        } else {
            C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", new Intent("android.intent.action.VIEW", Uri.parse(Ux0.f212725d)), (Bundle) null);
            return true;
        }
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f217929v = bVar;
        C74268u6 u6Var = (C74268u6) cVar;
        C72963f4.C72969f Ux0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Ux0(f4Var.getContent());
        u6Var.f218146c.setText(Ux0.f212722a);
        u6Var.f218147d.setText(Ux0.f212723b);
        mo103090g0(u6Var, Ux0.f212724c);
        u6Var.f218145b.setVisibility(Ux0.f212726e ? 0 : 8);
        u6Var.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), u6Var, (String) null));
        u6Var.clickArea.setOnClickListener(mo103099u(bVar));
        u6Var.clickArea.setOnLongClickListener(mo103098p(bVar));
        u6Var.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == 35;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }
}
