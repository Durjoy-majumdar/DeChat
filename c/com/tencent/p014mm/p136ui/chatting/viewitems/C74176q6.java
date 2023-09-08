package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76874e0;
import rb0.C48009v0;
import s90.C77632o;
import zj3.C79352f0;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q6 */
public class C74176q6 extends C74023i implements C73774p2 {

    /* renamed from: v */
    public C67391b f217734v;

    /* renamed from: w */
    public C74196r6 f217735w;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6959te);
        C74215s6 s6Var = new C74215s6();
        s6Var.mo103237a(n4Var, false);
        n4Var.setTag(s6Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        if (menuItem.getItemId() != 127) {
            return false;
        }
        if (!f4Var.mo100982U3()) {
            return true;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(f4Var);
        C73313b1.m86457c(bVar.mo91565f(), linkedList, bVar.mo91583x(), bVar.mo91574o().getUsername(), (C77632o) null);
        return true;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        if (f4Var.getType() == 48) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var.getStatus() == 5) {
                e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
            }
            e0Var.mo107136c(b, 127, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            if ((C48009v0.Fx0().mo72759TO(16) > 0) && !this.f217734v.mo91584y()) {
                e0Var.add(b, 114, 0, (CharSequence) view.getContext().getString(C0966R.string.b9w));
            }
            C88144b.m109788f("favorite");
            e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new ExDeviceHaveBindNetworkDeviceEvent();
            exDeviceHaveBindNetworkDeviceEvent.f236178d.f236180a = f4Var.getMsgId();
            exDeviceHaveBindNetworkDeviceEvent.publish();
            if (exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a) {
                e0Var.mo107136c(b, 129, 0, view.getContext().getString(C0966R.string.b_8), C0966R.raw.icons_filled_open);
            }
            if (!f4Var.mo100967F3() && f4Var.mo100982U3() && ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217734v) && mo103081O(f4Var.mo108768t()))) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
            if (!this.f217734v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        f4Var.unsetOmittedFailResend();
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
        ((C79352f0) bVar.f193278b.mo102812a(C79352f0.class)).mo102435d(f4Var);
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f217734v = bVar;
        C74215s6 s6Var = (C74215s6) cVar;
        if (this.f217735w == null) {
            this.f217735w = new C74196r6(bVar);
        }
        C74215s6.m88453c(this, s6Var, f4Var, false, cVar, bVar, str, this.f217735w, mo103098p(bVar));
        if (C74023i.m87878T()) {
            if (f4Var.getStatus() == 2) {
                if (mo103080N((C79368l) bVar.f193278b.mo102812a(C79368l.class), f4Var.getMsgId())) {
                    ImageView imageView = s6Var.f217876i;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                }
            }
            ImageView imageView2 = s6Var.f217876i;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        mo103087e0(s6Var, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 48;
    }
}
