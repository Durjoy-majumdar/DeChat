package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.text.format.DateFormat;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.storage.C72963f4;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.j8 */
public class C74079j8 extends C74023i {
    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        View inflate = layoutInflater.inflate(C0966R.C0971layout.f6974tt, (ViewGroup) null);
        C74088k8 k8Var = new C74088k8();
        k8Var.mo103158a(inflate, false);
        inflate.setTag(k8Var);
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
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        cVar.timeTV.setVisibility(0);
        TextView textView = cVar.timeTV;
        Activity f = bVar.mo91565f();
        long createTime = f4Var.getCreateTime();
        textView.setText(f.getString(C0966R.string.f0p) + DateFormat.format(f.getString(C0966R.string.f0n), createTime));
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return i == -1879048188;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }
}
