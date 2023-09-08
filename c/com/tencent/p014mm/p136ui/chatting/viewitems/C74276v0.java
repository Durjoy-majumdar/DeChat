package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.v0 */
public class C74276v0 extends C74023i implements C73774p2 {
    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6963ti);
        C74219t0 t0Var = new C74219t0();
        t0Var.mo103240a(n4Var, false);
        n4Var.setTag(t0Var);
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
        e0Var.mo107136c(((C74243t8) view.getTag()).mo103252b(), 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        return false;
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
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r9, ck3.C67391b r10, com.tencent.p014mm.storage.C72963f4 r11, java.lang.String r12) {
        /*
            r8 = this;
            java.lang.Class<zj3.l> r12 = zj3.C79368l.class
            java.lang.String r0 = "MicroMsg.ChattingItemTextTo"
            r2 = r9
            com.tencent.mm.ui.chatting.viewitems.t0 r2 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74219t0) r2
            boolean r9 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
            r1 = 0
            r3 = 1
            r4 = 2
            if (r9 == 0) goto L_0x0078
            r8.mo103093i0(r2, r1, r3)
            int r9 = r11.getStatus()
            r5 = 8
            if (r9 == r3) goto L_0x0066
            int r9 = r11.getStatus()
            r6 = 5
            if (r9 != r6) goto L_0x0023
            goto L_0x0066
        L_0x0023:
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f217887b
            r6 = 2131231724(0x7f0803ec, float:1.8079537E38)
            r9.setBackgroundResource(r6)
            android.widget.ImageView r9 = r2.f217889d
            if (r9 == 0) goto L_0x0084
            com.tencent.mm.ui.chatting.manager.a r9 = r10.f193278b
            xi.d r9 = r9.mo102812a(r12)
            zj3.l r9 = (zj3.C79368l) r9
            long r6 = r11.getMsgId()
            boolean r9 = r8.mo103080N(r9, r6)
            if (r9 == 0) goto L_0x0060
            boolean r9 = r11.f212665D1
            if (r9 == 0) goto L_0x005a
            android.view.animation.AlphaAnimation r9 = new android.view.animation.AlphaAnimation
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r5, r6)
            r5 = 300(0x12c, double:1.48E-321)
            r9.setDuration(r5)
            com.tencent.mm.ui.widget.MMTextView r5 = r2.f217887b
            r5.startAnimation(r9)
            r11.f212665D1 = r1
        L_0x005a:
            android.widget.ImageView r9 = r2.f217889d
            r9.setVisibility(r1)
            goto L_0x0084
        L_0x0060:
            android.widget.ImageView r9 = r2.f217889d
            r9.setVisibility(r5)
            goto L_0x0084
        L_0x0066:
            android.widget.ImageView r9 = r2.f217889d
            if (r9 == 0) goto L_0x006d
            r9.setVisibility(r5)
        L_0x006d:
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f217887b
            r5 = 2131231725(0x7f0803ed, float:1.807954E38)
            r9.setBackgroundResource(r5)
            r11.f212665D1 = r3
            goto L_0x0084
        L_0x0078:
            int r9 = r11.getStatus()
            if (r9 >= r4) goto L_0x0080
            r9 = 1
            goto L_0x0081
        L_0x0080:
            r9 = 0
        L_0x0081:
            r8.mo103093i0(r2, r9, r3)
        L_0x0084:
            java.lang.String r9 = r11.getContent()
            r5 = 0
            com.tencent.mm.message.l$b r9 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r9, r5)     // Catch:{ Exception -> 0x0098 }
            if (r9 == 0) goto L_0x00a6
            java.lang.String r9 = r9.f195598m     // Catch:{ Exception -> 0x0098 }
            java.lang.String r5 = "UTF-8"
            java.lang.String r9 = java.net.URLDecoder.decode(r9, r5)     // Catch:{ Exception -> 0x0098 }
            goto L_0x00a8
        L_0x0098:
            r9 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r9 = r9.getMessage()
            r5[r1] = r9
            java.lang.String r9 = "getMsgContent error: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r9, r5)
        L_0x00a6:
            java.lang.String r9 = ""
        L_0x00a8:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r5 == 0) goto L_0x00c9
            java.lang.Object[] r4 = new java.lang.Object[r4]
            long r5 = r11.getMsgId()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r1] = r5
            long r5 = r11.mo108774y2()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r4[r3] = r5
            java.lang.String r5 = "[carl] text to, content is null! why?? localid : %s, svrid : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r4)
        L_0x00c9:
            com.tencent.mm.ui.widget.MMTextView r0 = r2.f217887b
            r0.setMinWidth(r1)
            com.tencent.mm.ui.widget.MMTextView r0 = r2.f217887b
            r0.setText(r9)
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f217887b
            int r0 = r11.getType()
            java.lang.String r1 = r10.mo91577r()
            r4 = 301989937(0x12000031, float:4.0389914E-28)
            if (r0 == r4) goto L_0x00ed
            java.lang.Class<ny.h> r0 = p629ny.C76979h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ny.h r0 = (p629ny.C76979h) r0
            r0.mo107076oL(r9, r3, r1)
        L_0x00ed:
            r9.getText()
            boolean r9 = r10.mo91583x()
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
            r0.<init>()
            r0.f212238a = r11
            r0.f217969c = r9
            r0.f217970d = r2
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f217887b
            r9.setTag(r0)
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f217887b
            com.tencent.mm.ui.chatting.viewitems.i$e r0 = r8.mo103098p(r10)
            r9.setOnLongClickListener(r0)
            com.tencent.mm.ui.widget.MMTextView r9 = r2.f217887b
            com.tencent.mm.ui.chatting.manager.a r0 = r10.f193278b
            xi.d r12 = r0.mo102812a(r12)
            zj3.l r12 = (zj3.C79368l) r12
            com.tencent.mm.ui.chatting.g2 r12 = r12.getDoubleClickListener()
            r9.setOnDoubleClickLitsener(r12)
            java.lang.String r4 = r10.mo91573n()
            boolean r5 = r10.mo91583x()
            r1 = r8
            r3 = r11
            r6 = r10
            r7 = r8
            r1.mo103087e0(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74276v0.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 503316529;
    }
}
