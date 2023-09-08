package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u0 */
public class C74262u0 extends C74023i {
    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6914s3);
        C74219t0 t0Var = new C74219t0();
        t0Var.mo103240a(n4Var, true);
        n4Var.setTag(t0Var);
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
        e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return false;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r7, ck3.C67391b r8, com.tencent.p014mm.storage.C72963f4 r9, java.lang.String r10) {
        /*
            r6 = this;
            com.tencent.mm.ui.chatting.viewitems.t0 r7 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74219t0) r7
            java.lang.String r10 = r9.getContent()
            java.lang.String r0 = r8.mo91577r()
            java.lang.Class<zj3.e> r1 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r2 = r8.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.e r1 = (zj3.C79348e) r1
            boolean r2 = r8.mo91583x()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0043
            boolean r1 = r1.mo70071q1()
            if (r1 != 0) goto L_0x0043
            int r1 = eb0.C75604z3.m90848t(r10)
            r2 = -1
            if (r1 == r2) goto L_0x0043
            java.lang.String r2 = r10.substring(r3, r1)
            java.lang.String r2 = r2.trim()
            if (r2 == 0) goto L_0x003a
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x003a
            r0 = r2
        L_0x003a:
            int r1 = r1 + r4
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r10 = r10.trim()
        L_0x0043:
            r1 = 0
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r1)     // Catch:{ Exception -> 0x0053 }
            if (r10 == 0) goto L_0x0063
            java.lang.String r10 = r10.f195598m     // Catch:{ Exception -> 0x0053 }
            java.lang.String r1 = "UTF-8"
            java.lang.String r10 = java.net.URLDecoder.decode(r10, r1)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0065
        L_0x0053:
            r10 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r10 = r10.getMessage()
            r1[r3] = r10
            java.lang.String r10 = "MicroMsg.ChattingItemTextFrom"
            java.lang.String r2 = "getMsgContent error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r10, r2, r1)
        L_0x0063:
            java.lang.String r10 = ""
        L_0x0065:
            r6.mo102973h(r7, r8, r9, r0)
            r6.mo103089g(r7, r8, r0, r9)
            com.tencent.mm.ui.widget.MMTextView r0 = r7.f217887b
            r0.setText(r10)
            com.tencent.mm.ui.widget.MMTextView r10 = r7.f217887b
            int r0 = r9.getType()
            java.lang.String r1 = r8.mo91577r()
            r2 = 301989937(0x12000031, float:4.0389914E-28)
            if (r0 == r2) goto L_0x008a
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            r0.mo107076oL(r10, r4, r1)
        L_0x008a:
            r10.getText()
            boolean r10 = r8.mo91583x()
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
            r0.<init>()
            r0.f212238a = r9
            r0.f217969c = r10
            r0.f217970d = r7
            com.tencent.mm.ui.widget.MMTextView r9 = r7.f217887b
            r9.setTag(r0)
            com.tencent.mm.ui.widget.MMTextView r9 = r7.f217887b
            com.tencent.mm.ui.chatting.viewitems.i$e r10 = r6.mo103098p(r8)
            r9.setOnLongClickListener(r10)
            com.tencent.mm.ui.widget.MMTextView r7 = r7.f217887b
            java.lang.Class<zj3.l> r9 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r8 = r8.f193278b
            xi.d r8 = r8.mo102812a(r9)
            zj3.l r8 = (zj3.C79368l) r8
            com.tencent.mm.ui.chatting.g2 r8 = r8.getDoubleClickListener()
            r7.setOnDoubleClickLitsener(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74262u0.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return !z && i == 503316529;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return false;
    }

    /* renamed from: n0 */
    public boolean mo103045n0(C67391b bVar) {
        return bVar.mo91583x();
    }
}
