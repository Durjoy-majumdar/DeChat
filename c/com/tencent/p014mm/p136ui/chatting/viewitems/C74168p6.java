package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76874e0;
import rb0.C48009v0;
import s90.C77632o;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p6 */
public class C74168p6 extends C74023i {

    /* renamed from: v */
    public C67391b f217714v;

    /* renamed from: w */
    public C74196r6 f217715w;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6909ry);
        C74215s6 s6Var = new C74215s6();
        s6Var.mo103237a(n4Var, true);
        n4Var.setTag(s6Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        int itemId = menuItem.getItemId();
        if (itemId != 127) {
            return itemId == 129;
        }
        if (!f4Var.mo100982U3() || !WeChatBrands.Business.Entries.SessionLocation.checkAvailable(bVar.mo91565f())) {
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
            e0Var.mo107136c(b, 127, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            if ((C48009v0.Fx0().mo72759TO(16) > 0) && !this.f217714v.mo91584y()) {
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
            if (!this.f217714v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f217714v = bVar;
        C74215s6 s6Var = (C74215s6) cVar;
        if (this.f217715w == null) {
            this.f217715w = new C74196r6(bVar);
        }
        C74215s6.m88453c(this, s6Var, f4Var, true, cVar, bVar, str, this.f217715w, mo103098p(bVar));
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 48;
    }
}
