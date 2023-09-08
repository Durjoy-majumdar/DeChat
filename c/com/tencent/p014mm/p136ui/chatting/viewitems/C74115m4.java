package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.C74343y0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C30765p3;
import com.tencent.p014mm.storage.C30771q3;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import d62.C75339i;
import df2.C7325a;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import h81.C32735h;
import he0.C76158j;
import i21.C98591h;
import j20.C117292a;
import java.util.Set;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import ky2.C10432i;
import le3.C10499a;
import nj3.C76874e0;
import nj3.C76879j;
import p248ug.C52570c0;
import rx3.C13601g;
import rx3.C36570n;
import sf0.C77702q0;
import zj3.C79351f;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.m4 */
public final class C74115m4 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m4$a */
    public static class C74116a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f217535b;

        /* renamed from: c */
        public TextView f217536c;

        /* renamed from: d */
        public TextView f217537d;

        /* renamed from: e */
        public TextView f217538e;

        /* renamed from: f */
        public int f217539f;

        /* renamed from: g */
        public ImageView f217540g;

        /* renamed from: a */
        public C74023i.C74026c mo103179a(View view, boolean z) {
            super.create(view);
            this.f217535b = (ImageView) view.findViewById(C0966R.C0970id.b3t);
            this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
            this.f217536c = (TextView) view.findViewById(C0966R.C0970id.b96);
            this.f217537d = (TextView) view.findViewById(C0966R.C0970id.b9a);
            this.f217538e = (TextView) view.findViewById(C0966R.C0970id.f357686b82);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.clickArea = view.findViewById(C0966R.C0970id.b47);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            if (!z) {
                this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
                this.f217540g = (ImageView) view.findViewById(C0966R.C0970id.b8x);
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            }
            this.f217539f = C74023i.m87886m(MMApplicationContext.getContext());
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m4$b */
    public static class C74117b extends C74023i {

        /* renamed from: v */
        public C67391b f217541v;

        /* renamed from: w */
        public String f217542w;

        /* renamed from: x */
        public String f217543x;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6905ru);
            C74116a aVar = new C74116a();
            aVar.mo103179a(n4Var, true);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 118) {
                return false;
            }
            Activity f = bVar.mo91565f();
            int i = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent()).f212691q;
            Set<String> set = C45628s0.f123410p;
            if (C72996z1.m85810M4(i) && !WeChatBrands.Business.Entries.SessionOa.checkAvailable(f)) {
                return true;
            }
            if (C74343y0.m88774r(f4Var)) {
                C76879j.m92754y(f, f.getString(C0966R.string.f16), "", f.getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                return false;
            } else if (C74343y0.m88775s(f4Var)) {
                C76879j.m92754y(f, f.getString(C0966R.string.f17), "", f.getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                return false;
            } else {
                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
                intent.putExtra("Retr_Msg_Type", 8);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C67391b bVar2 = bVar;
                C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemCard$ChattingItemCardFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemCard$ChattingItemCardFrom", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
            String str = Rv0.f212675a;
            if (str == null || str.length() <= 0) {
                Log.m105920e("MicroMsg.ChattingItemCardFrom", "getView : parse possible friend msg failed");
            }
            this.f217542w = Rv0.f212675a;
            int i = Rv0.f212691q;
            Set<String> set = C45628s0.f123410p;
            boolean M4 = C72996z1.m85810M4(i);
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_forward_card, 0) == 1) {
                z = true;
            }
            if ((z && f4Var.getType() != 66 && !C72996z1.m85843n5(this.f217541v.mo91577r()) && !C72996z1.m85844o5(this.f217541v.mo91577r())) || M4) {
                e0Var.mo107136c(b, 118, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            if (!this.f217541v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            C74243t8 t8Var = (C74243t8) view.getTag();
            C74115m4.m88192b(bVar, t8Var.f217968b, f4Var.getContent(), t8Var.f217969c, f4Var.mo108769t2() == 0, f4Var);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0113, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r5) == false) goto L_0x0131;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r10, ck3.C67391b r11, com.tencent.p014mm.storage.C72963f4 r12, java.lang.String r13) {
            /*
                r9 = this;
                r9.f217541v = r11
                com.tencent.mm.ui.chatting.viewitems.m4$a r10 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.C74116a) r10
                boolean r0 = r11.mo91583x()
                if (r0 == 0) goto L_0x0013
                java.lang.String r0 = r12.getContent()
                java.lang.String r0 = eb0.C75604z3.m90849u(r0)
                goto L_0x0017
            L_0x0013:
                java.lang.String r0 = r12.getContent()
            L_0x0017:
                eb0.c r1 = eb0.C97625j3.m125812b()
                g62.l r1 = r1.mo105911z()
                com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
                com.tencent.mm.storage.f4$b r1 = r1.Rv0(r0)
                java.lang.String r2 = r1.f212675a
                java.lang.String r3 = "MicroMsg.ChattingItemCardFrom"
                if (r2 == 0) goto L_0x0031
                int r2 = r2.length()
                if (r2 > 0) goto L_0x0036
            L_0x0031:
                java.lang.String r2 = "getView : parse possible friend msg failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            L_0x0036:
                java.lang.String r2 = r1.f212675a
                r9.f217542w = r2
                java.lang.String r2 = ""
                r9.f217543x = r2
                boolean r4 = sf0.C77702q0.m93719b(r0)
                r5 = 0
                if (r4 != 0) goto L_0x0064
                java.lang.String r4 = "msg"
                java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r4, r5)
                if (r0 != 0) goto L_0x0052
                java.lang.String r4 = "null==attrs"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            L_0x0052:
                if (r0 == 0) goto L_0x0064
                java.lang.String r3 = ".msg.$wechatid"
                boolean r4 = r0.containsKey(r3)
                if (r4 == 0) goto L_0x0064
                java.lang.Object r0 = r0.get(r3)
                java.lang.String r0 = (java.lang.String) r0
                r9.f217543x = r0
            L_0x0064:
                java.lang.Class<ln.i> r0 = p196ln.C76708i.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ln.i r0 = (p196ln.C76708i) r0
                java.lang.String r3 = r9.f217542w
                int r4 = r1.f212680f
                r0.mo106848yE(r3, r4)
                android.view.View r0 = r10.clickArea
                int r3 = r10.f217539f
                r10.resetChatBubbleWidth(r0, r3)
                int r0 = r1.f212691q
                java.util.Set<java.lang.String> r3 = eb0.C45628s0.f123410p
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85810M4(r0)
                r3 = 8
                if (r0 == 0) goto L_0x00c8
                android.widget.TextView r0 = r10.f217536c
                r4 = 2131823430(0x7f110b46, float:1.927966E38)
                r0.setText(r4)
                android.widget.TextView r0 = r10.f217537d
                r0.setVisibility(r3)
                r0 = 16
                boolean r0 = p206nj.C11171e.m11046c(r0)
                if (r0 == 0) goto L_0x00a1
                android.widget.ImageView r0 = r10.f217535b
                r0.setBackground(r5)
                goto L_0x00a6
            L_0x00a1:
                android.widget.ImageView r0 = r10.f217535b
                r0.setBackgroundDrawable(r5)
            L_0x00a6:
                android.widget.ImageView r0 = r10.f217535b
                java.lang.String r4 = r9.f217542w
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r6 == 0) goto L_0x00b7
                r4 = 2131231376(0x7f080290, float:1.8078831E38)
                r0.setImageResource(r4)
                goto L_0x00c2
            L_0x00b7:
                java.lang.Class<ln.f> r6 = p196ln.C76705f.class
                di3.d r6 = di3.C86312j.m106911c(r6)
                ln.f r6 = (p196ln.C76705f) r6
                r6.mo106822J5(r0, r4)
            L_0x00c2:
                android.widget.TextView r0 = r10.f217538e
                com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.m88191a(r1, r0, r11)
                goto L_0x00e4
            L_0x00c8:
                android.widget.TextView r0 = r10.f217538e
                r0.setCompoundDrawables(r5, r5, r5, r5)
                android.widget.TextView r0 = r10.f217536c
                r4 = 2131823602(0x7f110bf2, float:1.9280008E38)
                r0.setText(r4)
                android.widget.ImageView r0 = r10.f217535b
                r4 = 2131231871(0x7f08047f, float:1.8079835E38)
                r0.setBackgroundResource(r4)
                android.widget.ImageView r0 = r10.f217535b
                java.lang.String r4 = r9.f217542w
                com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87883d0(r0, r4)
            L_0x00e4:
                java.lang.String r0 = r9.f217543x
                int r4 = r1.f212691q
                boolean r4 = com.tencent.p014mm.storage.C72996z1.m85810M4(r4)
                r6 = 1
                r7 = 0
                if (r4 == 0) goto L_0x0116
                rx3.g r8 = df2.C7325a.f25439a
                rx3.n r8 = (rx3.C36570n) r8
                java.lang.Object r8 = r8.getValue()
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x0101
                goto L_0x010f
            L_0x0101:
                int r8 = r1.f212691q
                r8 = r8 & 512(0x200, float:7.175E-43)
                if (r8 <= 0) goto L_0x0109
                r8 = 1
                goto L_0x010a
            L_0x0109:
                r8 = 0
            L_0x010a:
                if (r8 != 0) goto L_0x010d
                goto L_0x010f
            L_0x010d:
                java.lang.String r5 = r1.f212674C
            L_0x010f:
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                if (r8 != 0) goto L_0x0116
                goto L_0x0131
            L_0x0116:
                boolean r5 = sf0.C77702q0.m93719b(r0)
                if (r5 != 0) goto L_0x012a
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85802I4(r0)
                if (r5 != 0) goto L_0x012a
                boolean r5 = com.tencent.p014mm.storage.C72996z1.m85796D5(r0)
                if (r5 == 0) goto L_0x0129
                goto L_0x012a
            L_0x0129:
                r6 = 0
            L_0x012a:
                if (r6 != 0) goto L_0x0130
                if (r4 == 0) goto L_0x012f
                goto L_0x0130
            L_0x012f:
                r2 = r0
            L_0x0130:
                r5 = r2
            L_0x0131:
                boolean r0 = sf0.C77702q0.m93719b(r5)
                if (r0 != 0) goto L_0x0142
                android.widget.TextView r0 = r10.f217537d
                r0.setVisibility(r7)
                android.widget.TextView r0 = r10.f217537d
                r0.setText(r5)
                goto L_0x0147
            L_0x0142:
                android.widget.TextView r0 = r10.f217537d
                r0.setVisibility(r3)
            L_0x0147:
                android.widget.TextView r0 = r10.f217538e
                java.lang.Class<ny.h> r2 = p629ny.C76979h.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                ny.h r2 = (p629ny.C76979h) r2
                android.app.Activity r3 = r11.mo91565f()
                java.lang.String r4 = r1.f212676b
                android.widget.TextView r5 = r10.f217538e
                float r5 = r5.getTextSize()
                int r5 = (int) r5
                android.text.SpannableString r2 = r2.op0(r3, r4, r5)
                r0.setText(r2)
                java.lang.String r0 = r9.f217542w
                com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.m88193c(r11, r0, r1, r10)
                android.view.View r0 = r10.clickArea
                com.tencent.mm.ui.chatting.viewitems.t8 r1 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r2 = r11.mo91583x()
                r1.<init>(r12, r2, r10, r13)
                r0.setTag(r1)
                android.view.View r12 = r10.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$f r13 = r9.mo103099u(r11)
                r12.setOnClickListener(r13)
                android.view.View r12 = r10.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r13 = r9.mo103098p(r11)
                r12.setOnLongClickListener(r13)
                android.view.View r10 = r10.clickArea
                java.lang.Class<zj3.l> r12 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r11 = r11.f193278b
                xi.d r11 = r11.mo102812a(r12)
                zj3.l r11 = (zj3.C79368l) r11
                com.tencent.mm.ui.chatting.h2 r11 = r11.mo108189Z4()
                r10.setOnTouchListener(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.C74117b.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (!z) {
                return i == 42 || i == 66;
            }
            return false;
        }

        /* renamed from: n0 */
        public boolean mo103045n0(C67391b bVar) {
            return bVar.mo91583x();
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.m4$c */
    public static class C74118c extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217544v;

        /* renamed from: w */
        public String f217545w;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6955ta);
            C74116a aVar = new C74116a();
            aVar.mo103179a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            if (menuItem.getItemId() != 118) {
                return false;
            }
            Activity f = bVar.mo91565f();
            if (C74343y0.m88774r(f4Var)) {
                C76879j.m92754y(f, f.getString(C0966R.string.f16), "", f.getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                return false;
            } else if (C74343y0.m88775s(f4Var)) {
                C76879j.m92754y(f, f.getString(C0966R.string.f17), "", f.getString(C0966R.string.lkg), (DialogInterface.OnClickListener) null);
                return false;
            } else {
                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
                intent.putExtra("Retr_Msg_Type", 8);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C67391b bVar2 = bVar;
                C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemCard$ChattingItemCardTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemCard$ChattingItemCardTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return false;
            }
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            int b = ((C74243t8) view.getTag()).mo103252b();
            C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent());
            String str = Rv0.f212675a;
            if (str == null || str.length() <= 0) {
                Log.m105920e("MicroMsg.ChattingItemCardTo", "getView : parse possible friend msg failed");
            }
            this.f217545w = Rv0.f212675a;
            int i = Rv0.f212691q;
            Set<String> set = C45628s0.f123410p;
            boolean M4 = C72996z1.m85810M4(i);
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_forward_card, 0) == 1) {
                z = true;
            }
            if ((z && f4Var.getType() != 66 && !C72996z1.m85843n5(this.f217544v.mo91577r()) && !C72996z1.m85844o5(this.f217544v.mo91577r())) || M4) {
                e0Var.mo107136c(b, 118, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            if (!f4Var.mo100967F3() && ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && f4Var.mo100975N3() && mo103083Q(f4Var, this.f217544v) && mo103081O(f4Var.mo108768t()))) {
                e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            }
            if (!this.f217544v.mo91584y()) {
                e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            f4Var.unsetOmittedFailResend();
            ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
            ((C79351f) bVar.f193278b.mo102812a(C79351f.class)).mo102464d(f4Var);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            C74243t8 t8Var = (C74243t8) view.getTag();
            C74115m4.m88192b(bVar, t8Var.f217968b, f4Var.getContent(), t8Var.f217969c, f4Var.mo108769t2() == 0, f4Var);
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ff, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r0) != false) goto L_0x0102;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r12, ck3.C67391b r13, com.tencent.p014mm.storage.C72963f4 r14, java.lang.String r15) {
            /*
                r11 = this;
                java.lang.Class<zj3.l> r15 = zj3.C79368l.class
                r11.f217544v = r13
                r1 = r12
                com.tencent.mm.ui.chatting.viewitems.m4$a r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.C74116a) r1
                eb0.c r12 = eb0.C97625j3.m125812b()
                g62.l r12 = r12.mo105911z()
                java.lang.String r0 = r14.getContent()
                com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
                com.tencent.mm.storage.f4$b r12 = r12.Rv0(r0)
                java.lang.String r0 = r12.f212675a
                java.lang.String r2 = "MicroMsg.ChattingItemCardTo"
                if (r0 == 0) goto L_0x0025
                int r0 = r0.length()
                if (r0 > 0) goto L_0x002a
            L_0x0025:
                java.lang.String r0 = "getView : parse possible friend msg failed"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            L_0x002a:
                java.lang.String r0 = r12.f212675a
                r11.f217545w = r0
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                boolean r0 = eb0.C45628s0.m50738C(r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r5 = 0
                r4[r5] = r0
                java.lang.String r0 = r11.f217545w
                r6 = 1
                r4[r6] = r0
                java.lang.String r0 = "dancy is biz: %s, userName: %s "
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r0, r4)
                android.view.View r0 = r1.clickArea
                int r2 = r1.f217539f
                r1.resetChatBubbleWidth(r0, r2)
                int r0 = r12.f212691q
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85810M4(r0)
                r2 = 8
                r4 = 0
                if (r0 == 0) goto L_0x009a
                android.widget.TextView r0 = r1.f217536c
                r7 = 2131823430(0x7f110b46, float:1.927966E38)
                r0.setText(r7)
                android.widget.TextView r0 = r1.f217537d
                r0.setVisibility(r2)
                r0 = 16
                boolean r0 = p206nj.C11171e.m11046c(r0)
                if (r0 == 0) goto L_0x0073
                android.widget.ImageView r0 = r1.f217535b
                r0.setBackground(r4)
                goto L_0x0078
            L_0x0073:
                android.widget.ImageView r0 = r1.f217535b
                r0.setBackgroundDrawable(r4)
            L_0x0078:
                android.widget.ImageView r0 = r1.f217535b
                java.lang.String r7 = r11.f217545w
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r8 == 0) goto L_0x0089
                r7 = 2131231376(0x7f080290, float:1.8078831E38)
                r0.setImageResource(r7)
                goto L_0x0094
            L_0x0089:
                java.lang.Class<ln.f> r8 = p196ln.C76705f.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                ln.f r8 = (p196ln.C76705f) r8
                r8.mo106822J5(r0, r7)
            L_0x0094:
                android.widget.TextView r0 = r1.f217538e
                com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.m88191a(r12, r0, r13)
                goto L_0x00b6
            L_0x009a:
                android.widget.TextView r0 = r1.f217538e
                r0.setCompoundDrawables(r4, r4, r4, r4)
                android.widget.TextView r0 = r1.f217536c
                r7 = 2131823602(0x7f110bf2, float:1.9280008E38)
                r0.setText(r7)
                android.widget.ImageView r0 = r1.f217535b
                r7 = 2131231871(0x7f08047f, float:1.8079835E38)
                r0.setBackgroundResource(r7)
                android.widget.ImageView r0 = r1.f217535b
                java.lang.String r7 = r11.f217545w
                com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87883d0(r0, r7)
            L_0x00b6:
                android.widget.TextView r0 = r1.f217538e
                java.lang.Class<ny.h> r7 = p629ny.C76979h.class
                di3.d r7 = di3.C86312j.m106911c(r7)
                ny.h r7 = (p629ny.C76979h) r7
                android.app.Activity r8 = r13.mo91565f()
                java.lang.String r9 = r12.f212676b
                android.widget.TextView r10 = r1.f217538e
                float r10 = r10.getTextSize()
                android.text.SpannableString r7 = r7.yp0(r8, r9, r10)
                r0.setText(r7)
                int r0 = r12.f212691q
                boolean r0 = com.tencent.p014mm.storage.C72996z1.m85810M4(r0)
                if (r0 == 0) goto L_0x0102
                rx3.g r0 = df2.C7325a.f25439a
                rx3.n r0 = (rx3.C36570n) r0
                java.lang.Object r0 = r0.getValue()
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x00ec
                goto L_0x00f7
            L_0x00ec:
                int r0 = r12.f212691q
                r0 = r0 & 512(0x200, float:7.175E-43)
                if (r0 <= 0) goto L_0x00f4
                r0 = 1
                goto L_0x00f5
            L_0x00f4:
                r0 = 0
            L_0x00f5:
                if (r0 != 0) goto L_0x00f9
            L_0x00f7:
                r0 = r4
                goto L_0x00fb
            L_0x00f9:
                java.lang.String r0 = r12.f212674C
            L_0x00fb:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r7 != 0) goto L_0x0102
                goto L_0x0104
            L_0x0102:
                java.lang.String r0 = ""
            L_0x0104:
                boolean r7 = sf0.C77702q0.m93719b(r0)
                if (r7 != 0) goto L_0x0115
                android.widget.TextView r7 = r1.f217537d
                r7.setVisibility(r5)
                android.widget.TextView r7 = r1.f217537d
                r7.setText(r0)
                goto L_0x011a
            L_0x0115:
                android.widget.TextView r0 = r1.f217537d
                r0.setVisibility(r2)
            L_0x011a:
                java.lang.String r0 = r11.f217545w
                com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.m88193c(r13, r0, r12, r1)
                android.view.View r12 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r7 = r13.mo91583x()
                r0.<init>(r14, r7, r1, r4)
                r12.setTag(r0)
                android.view.View r12 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$f r0 = r11.mo103099u(r13)
                r12.setOnClickListener(r0)
                android.view.View r12 = r1.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r0 = r11.mo103098p(r13)
                r12.setOnLongClickListener(r0)
                android.view.View r12 = r1.clickArea
                com.tencent.mm.ui.chatting.manager.a r0 = r13.f193278b
                xi.d r0 = r0.mo102812a(r15)
                zj3.l r0 = (zj3.C79368l) r0
                com.tencent.mm.ui.chatting.h2 r0 = r0.mo108189Z4()
                r12.setOnTouchListener(r0)
                boolean r12 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r12 == 0) goto L_0x0181
                r11.mo103093i0(r1, r5, r6)
                int r12 = r14.getStatus()
                if (r12 != r3) goto L_0x0179
                com.tencent.mm.ui.chatting.manager.a r12 = r13.f193278b
                xi.d r12 = r12.mo102812a(r15)
                zj3.l r12 = (zj3.C79368l) r12
                long r3 = r14.getMsgId()
                boolean r12 = r11.mo103080N(r12, r3)
                if (r12 == 0) goto L_0x0179
                android.widget.ImageView r12 = r1.f217540g
                if (r12 == 0) goto L_0x018b
                r12.setVisibility(r5)
                goto L_0x018b
            L_0x0179:
                android.widget.ImageView r12 = r1.f217540g
                if (r12 == 0) goto L_0x018b
                r12.setVisibility(r2)
                goto L_0x018b
            L_0x0181:
                int r12 = r14.getStatus()
                if (r12 >= r3) goto L_0x0188
                r5 = 1
            L_0x0188:
                r11.mo103093i0(r1, r5, r6)
            L_0x018b:
                java.lang.String r3 = r13.mo91573n()
                boolean r4 = r13.mo91583x()
                r0 = r11
                r2 = r14
                r5 = r13
                r6 = r11
                r0.mo103087e0(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74115m4.C74118c.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            if (z) {
                return i == 42 || i == 66;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m88191a(C72963f4.C72964b bVar, TextView textView, C67391b bVar2) {
        Drawable drawable;
        C13601g gVar = C7325a.f25439a;
        if (((Boolean) ((C36570n) C7325a.f25439a).getValue()).booleanValue()) {
            int i = bVar.f212691q;
            int i2 = C72996z1.f214113Y1;
            boolean z = true;
            boolean z2 = (i & 16) > 0;
            if ((i & 512) <= 0) {
                z = false;
            }
            if (z2 || z) {
                boolean z3 = C85875k4.m106211z();
                if (z) {
                    drawable = bVar2.mo91565f().getDrawable(z3 ? C0966R.C0969drawable.c3s : C0966R.C0969drawable.c3r);
                } else {
                    drawable = bVar2.mo91565f().getDrawable(z3 ? C0966R.C0969drawable.cgh : C0966R.C0969drawable.cgg);
                }
                int b = C76577a.m92151b(bVar2.mo91565f(), 4);
                int b2 = C76577a.m92151b(bVar2.mo91565f(), 16);
                drawable.setBounds(0, 0, b2, b2);
                textView.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                textView.setCompoundDrawablePadding(b);
                return;
            }
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: b */
    public static void m88192b(C67391b bVar, String str, String str2, boolean z, boolean z2, C72963f4 f4Var) {
        Class cls = C52570c0.class;
        Class cls2 = C10432i.class;
        boolean z3 = false;
        int i = 1;
        Log.m105925i("MicroMsg.ChattingItemCard", "dealClickCardMsgEvent, fromUser:%s, groupChat:%s, recv:%s, msgType:%s,msgContent:%s", str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(f4Var.getType()), str2);
        if (z && z2) {
            str2 = C75604z3.m90849u(str2);
        }
        C72963f4.C72964b Rv0 = ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(str2);
        String str3 = Rv0.f212675a;
        if ((!C72996z1.m85843n5(str3) && !C72996z1.m85847r5(str3)) || WeChatBrands.Business.Entries.GlobalWeCom.checkAvailable(bVar.mo91565f())) {
            Intent intent = new Intent();
            int i2 = Rv0.f212691q;
            Set<String> set = C45628s0.f123410p;
            if (!C72996z1.m85810M4(i2)) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(1430, 0);
                C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str3);
                if (z1Var == null || !z1Var.mo62927s3()) {
                    C30765p3 jo = ((C30771q3) C97625j3.m125812b().mo105910y()).mo57694jo(str3);
                    if (jo == null || C77702q0.m93719b(jo.field_username)) {
                        if (jo == null || C77702q0.m93719b(jo.field_encryptUsername)) {
                            C30765p3 p3Var = new C30765p3();
                            p3Var.field_encryptUsername = str3 == null ? "" : str3;
                            p3Var.field_modifyTime = System.currentTimeMillis();
                            p3Var.field_modifyTime = System.currentTimeMillis();
                            if (!((C30771q3) C97625j3.m125812b().mo105910y()).replace(p3Var)) {
                                Log.m105921e("MicroMsg.ChattingItemCard", "add friendUser fail, encryptUsername:%s", str3);
                            }
                        }
                        intent.putExtra("force_get_contact", true);
                        Log.m105924i("MicroMsg.ChattingItemCard", "need to get contact to judge if Friend, KForceGetContact is true");
                        nVar.mo175911u(1430, 3);
                    } else {
                        str3 = jo.field_username;
                        Log.m105925i("MicroMsg.ChattingItemCard", "find in FriendUser Map, friend:%s", z1Var.getUsername());
                        nVar.mo175911u(1430, 2);
                    }
                } else {
                    str3 = z1Var.getUsername();
                    Log.m105925i("MicroMsg.ChattingItemCard", "find in contact, friend:%s", z1Var.getUsername());
                    nVar.mo175911u(1430, 1);
                }
            } else if (WeChatBrands.Business.Entries.SessionOa.checkAvailable(bVar.mo91565f())) {
                C72996z1 z1Var2 = C97625j3.m125812b().mo105907v().get(str3);
                if (z1Var2 != null && ((C10432i) C86312j.m106911c(cls2)).mo10750e()) {
                    int fd = ((C10432i) C86312j.m106911c(cls2)).mo10751fd();
                    if (fd == 0 && !z1Var2.mo62927s3()) {
                        ((C10432i) C86312j.m106911c(cls2)).mo10755m4(bVar.mo91565f());
                        C52570c0 c0Var = (C52570c0) C86709a0.m107533q(cls);
                        if (z) {
                            i = 2;
                        }
                        c0Var.n80(i, str3, Rv0.f212676b);
                        return;
                    } else if (fd == 2) {
                        ((C10432i) C86312j.m106911c(cls2)).mo10755m4(bVar.mo91565f());
                        C52570c0 c0Var2 = (C52570c0) C86709a0.m107533q(cls);
                        if (z) {
                            i = 2;
                        }
                        c0Var2.n80(i, str3, Rv0.f212676b);
                        return;
                    }
                }
            } else {
                return;
            }
            intent.putExtra("Contact_User", str3);
            intent.putExtra("Contact_Alias", Rv0.f212677c);
            intent.putExtra("Contact_Nick", Rv0.f212676b);
            intent.putExtra("Contact_QuanPin", Rv0.f212678d);
            intent.putExtra("Contact_PyInitial", Rv0.f212679e);
            intent.putExtra("Contact_Uin", Rv0.f212684j);
            intent.putExtra("Contact_Mobile_MD5", Rv0.f212682h);
            intent.putExtra("Contact_full_Mobile_MD5", Rv0.f212683i);
            intent.putExtra("Contact_QQNick", Rv0.mo101028e());
            intent.putExtra("User_From_Fmessage", false);
            intent.putExtra("Contact_Scene", Rv0.f212681g);
            intent.putExtra("Contact_FMessageCard", true);
            intent.putExtra("Contact_RemarkName", Rv0.f212686l);
            intent.putExtra("Contact_VUser_Info_Flag", Rv0.f212691q);
            intent.putExtra("Contact_VUser_Info", Rv0.f212692r);
            intent.putExtra("Contact_BrandIconURL", Rv0.f212693s);
            intent.putExtra("Contact_Province", Rv0.mo101027d());
            intent.putExtra("Contact_City", Rv0.mo101024a());
            intent.putExtra("Contact_Sex", Rv0.f212689o);
            intent.putExtra("Contact_Signature", Rv0.f212690p);
            intent.putExtra("Contact_ShowUserName", true);
            intent.putExtra("Contact_KSnsIFlag", 0);
            intent.putExtra("Contact_Source_FMessage", 17);
            intent.putExtra("source_from_user_name", str);
            intent.putExtra("source_from_nick_name", ((C75339i) C86312j.m106911c(C75339i.class)).mo62514P1(str));
            intent.putExtra("AntispamTicket", Rv0.f212698x);
            intent.putExtra("key_add_contact_openim_appid", Rv0.f212699y);
            intent.putExtra("key_add_contact_custom_detail", Rv0.f212673B);
            if ((f4Var.f230723F & 512) > 0) {
                z3 = true;
            }
            intent.putExtra("key_forward_flag", z3);
            intent.putExtra("key_msg_id", f4Var.getMsgId());
            if ((Rv0.f212691q & 8) > 0) {
                if (C77702q0.m93719b(str) || !C97625j3.m125812b().mo105907v().get(str).mo62916m3()) {
                    intent.putExtra("Contact_Scene", 17);
                    C115669n nVar2 = C115669n.INSTANCE;
                    nVar2.kvStat(10298, Rv0.f212675a + "," + 17);
                } else {
                    intent.putExtra("Contact_Scene", 41);
                    C115669n nVar3 = C115669n.INSTANCE;
                    nVar3.kvStat(10298, Rv0.f212675a + "," + 41);
                }
            }
            if (C72996z1.m85843n5(Rv0.f212675a) && Rv0.f212681g == 0) {
                intent.putExtra("Contact_Scene", 17);
            }
            if (C72996z1.m85810M4(Rv0.f212691q)) {
                if (bVar.mo91583x()) {
                    intent.putExtra("preChatTYPE", 2);
                } else {
                    intent.putExtra("preChatTYPE", 1);
                }
                intent.putExtra("prePublishId", "msg_" + f4Var.mo108774y2());
                if (C77702q0.m93719b(str)) {
                    str = C75592q0.m90789s();
                }
                intent.putExtra("preUsername", str);
                intent.putExtra("preChatName", f4Var.mo108768t());
            }
            C88144b.m109791i(bVar.mo91565f(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
            C10499a.m10432a(Rv0.f212681g);
        }
    }

    /* renamed from: c */
    public static void m88193c(C67391b bVar, String str, C72963f4.C72964b bVar2, C74116a aVar) {
        Class cls = C76158j.class;
        if (C72996z1.m85843n5(str)) {
            String Rn0 = ((C76158j) C86312j.m106911c(cls)).Rn0(bVar2.f212699y, "openim_card_type_name", C76158j.C8510a.TYPE_WORDING);
            if (TextUtils.isEmpty(Rn0)) {
                aVar.f217536c.setText(C0966R.string.ba9);
            } else {
                aVar.f217536c.setText(Rn0);
            }
            aVar.f217535b.setBackgroundResource(C0966R.C0969drawable.bfa);
            C74023i.m87883d0(aVar.f217535b, str);
            String str2 = bVar2.f212672A;
            String str3 = bVar2.f212700z;
            CharSequence charSequence = str3;
            if (!C77702q0.m93719b(str2)) {
                charSequence = ((C76158j) C86312j.m106911c(cls)).De0(bVar.mo91565f(), str2, str3, aVar.f217537d.getTextSize());
            }
            if (!TextUtils.isEmpty(charSequence)) {
                aVar.f217537d.setVisibility(0);
                aVar.f217537d.setText(charSequence);
                return;
            }
            aVar.f217537d.setVisibility(8);
        }
    }
}
