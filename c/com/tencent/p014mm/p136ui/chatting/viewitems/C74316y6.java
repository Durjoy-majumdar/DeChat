package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86312j;
import eb0.C75604z3;
import eb0.C97625j3;
import gy3.C8480h;
import gy3.C87412m;
import he0.C76158j;
import ie0.C46223m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import nj3.C76874e0;
import p629ny.C76979h;
import zj3.C79370m0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.y6 */
public final class C74316y6 {

    /* renamed from: a */
    public static final C74321e f218311a = new C74321e((C8480h) null);

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y6$a */
    public static final class C74317a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f218312b;

        /* renamed from: c */
        public TextView f218313c;

        /* renamed from: d */
        public TextView f218314d;

        /* renamed from: e */
        public TextView f218315e;

        /* renamed from: f */
        public ImageView f218316f;

        /* renamed from: g */
        public int f218317g;

        /* renamed from: a */
        public final C74023i.C74026c mo103292a(View view, boolean z) {
            C87412m.m108594g(view, "convertView");
            super.create(view);
            this.f218312b = (ImageView) view.findViewById(C0966R.C0970id.b3t);
            this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
            this.f218313c = (TextView) view.findViewById(C0966R.C0970id.b96);
            this.f218314d = (TextView) view.findViewById(C0966R.C0970id.b9a);
            this.f218315e = (TextView) view.findViewById(C0966R.C0970id.f357686b82);
            this.userTV = (TextView) view.findViewById(C0966R.C0970id.b9_);
            this.clickArea = view.findViewById(C0966R.C0970id.b47);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.maskView = view.findViewById(C0966R.C0970id.b7h);
            if (!z) {
                this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
                this.f218316f = (ImageView) view.findViewById(C0966R.C0970id.b8x);
                this.uploadingPB = (ProgressBar) view.findViewById(C0966R.C0970id.f359466l14);
            }
            this.f218317g = C74023i.m87886m(MMApplicationContext.getContext());
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y6$b */
    public static final class C74318b implements View.OnClickListener {

        /* renamed from: d */
        public final C67391b f218318d;

        public C74318b(C67391b bVar) {
            C87412m.m108594g(bVar, "ui");
            this.f218318d = bVar;
        }

        public void onClick(View view) {
            C74243t8 t8Var;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view == null) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (view.getTag() instanceof C74243t8) {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                t8Var = (C74243t8) tag;
            } else {
                t8Var = null;
            }
            if (t8Var == null) {
                C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ((C79370m0) this.f218318d.f193278b.mo102812a(C79370m0.class)).mo70140f2(t8Var.f217968b, t8Var.f217960L);
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y6$c */
    public static final class C74319c extends C74023i {

        /* renamed from: v */
        public C67391b f218319v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            C87412m.m108594g(layoutInflater, "inflater");
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6911s0);
            C74317a aVar = new C74317a();
            aVar.mo103292a(n4Var, true);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: S */
        public boolean mo82213S() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(menuItem, "item");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (menuItem.getItemId() != 111) {
                return false;
            }
            C74316y6.f218311a.mo103295b(bVar, f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            if (f4Var == null) {
                return true;
            }
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            C67391b bVar = this.f218319v;
            C87412m.m108591d(bVar);
            e0Var.mo107136c(b, 111, 0, bVar.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            e0Var.removeItem(116);
            C67391b bVar2 = this.f218319v;
            if (bVar2 != null) {
                C87412m.m108591d(bVar2);
                if (!bVar2.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                }
            }
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003f, code lost:
            if ((r8.f124596a.length() == 0) != false) goto L_0x0041;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r5, ck3.C67391b r6, com.tencent.p014mm.storage.C72963f4 r7, java.lang.String r8) {
            /*
                r4 = this;
                java.lang.String r0 = "tag"
                gy3.C87412m.m108594g(r5, r0)
                java.lang.String r0 = "ui"
                gy3.C87412m.m108594g(r6, r0)
                java.lang.String r0 = "msg"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r0 = "userName"
                gy3.C87412m.m108594g(r8, r0)
                r4.f218319v = r6
                com.tencent.mm.ui.chatting.viewitems.y6$a r5 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74316y6.C74317a) r5
                android.view.View r8 = r5.clickArea
                int r0 = r5.f218317g
                r5.resetChatBubbleWidth(r8, r0)
                java.lang.Class<he0.h> r8 = he0.C46021h.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                he0.h r8 = (he0.C46021h) r8
                java.lang.String r0 = r7.getContent()
                ie0.m r8 = r8.mo71455Rm(r0)
                if (r8 == 0) goto L_0x0041
                java.lang.String r0 = r8.f124596a
                int r0 = r0.length()
                if (r0 != 0) goto L_0x003e
                r0 = 1
                goto L_0x003f
            L_0x003e:
                r0 = 0
            L_0x003f:
                if (r0 == 0) goto L_0x0048
            L_0x0041:
                java.lang.String r0 = "MicroMsg.ChattingItemOpenIMKefuNameCard"
                java.lang.String r1 = "alvinluo fillingOpenIMKefuCard content invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x0048:
                com.tencent.mm.ui.chatting.viewitems.y6$e r0 = com.tencent.p014mm.p136ui.chatting.viewitems.C74316y6.f218311a
                r0.mo103294a(r6, r8, r5)
                android.view.View r0 = r5.clickArea
                com.tencent.mm.ui.chatting.viewitems.t8 r1 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r2 = r6.mo91583x()
                if (r8 == 0) goto L_0x005b
                java.lang.String r3 = r8.f124596a
                if (r3 != 0) goto L_0x005d
            L_0x005b:
                java.lang.String r3 = ""
            L_0x005d:
                r1.<init>(r7, r2, r5, r3)
                android.os.Bundle r7 = new android.os.Bundle
                r7.<init>()
                java.lang.String r8 = r8.f124602g
                java.lang.String r2 = "kefu_card_ticket"
                r7.putString(r2, r8)
                r1.f217960L = r7
                r0.setTag(r1)
                android.view.View r7 = r5.clickArea
                com.tencent.mm.ui.chatting.viewitems.y6$b r8 = new com.tencent.mm.ui.chatting.viewitems.y6$b
                r8.<init>(r6)
                r7.setOnClickListener(r8)
                android.view.View r7 = r5.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r8 = r4.mo103098p(r6)
                r7.setOnLongClickListener(r8)
                android.view.View r5 = r5.clickArea
                java.lang.Class<zj3.l> r7 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
                xi.d r6 = r6.mo102812a(r7)
                zj3.l r6 = (zj3.C79368l) r6
                com.tencent.mm.ui.chatting.h2 r6 = r6.mo108189Z4()
                r5.setOnTouchListener(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74316y6.C74319c.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 67;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y6$d */
    public static final class C74320d extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f218320v;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            C87412m.m108594g(layoutInflater, "inflater");
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6960tf);
            C74317a aVar = new C74317a();
            aVar.mo103292a(n4Var, false);
            n4Var.setTag(aVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: S */
        public boolean mo82213S() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(menuItem, "item");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (menuItem.getItemId() != 111) {
                return false;
            }
            C74316y6.f218311a.mo103295b(bVar, f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            if (f4Var == null) {
                return true;
            }
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            C67391b bVar = this.f218320v;
            C87412m.m108591d(bVar);
            e0Var.mo107136c(b, 111, 0, bVar.mo91572m().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            e0Var.removeItem(116);
            if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f218320v) && mo103081O(f4Var.mo108768t())) {
                C67391b bVar2 = this.f218320v;
                C87412m.m108591d(bVar2);
                if (!bVar2.mo91580u()) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                    return true;
                }
            }
            C67391b bVar3 = this.f218320v;
            if (bVar3 != null) {
                C87412m.m108591d(bVar3);
                if (!bVar3.mo91584y()) {
                    e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                }
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (f4Var.mo108769t2() == 1 && f4Var.getType() == 67) {
                f4Var.unsetOmittedFailResend();
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
                ((C79370m0) bVar.f193278b.mo102812a(C79370m0.class)).mo70141g(f4Var);
            }
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(view, "v");
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
            if ((r10.f124596a.length() == 0) != false) goto L_0x0048;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r10, ck3.C67391b r11, com.tencent.p014mm.storage.C72963f4 r12, java.lang.String r13) {
            /*
                r9 = this;
                java.lang.Class<zj3.l> r0 = zj3.C79368l.class
                java.lang.String r1 = "tag"
                gy3.C87412m.m108594g(r10, r1)
                java.lang.String r1 = "ui"
                gy3.C87412m.m108594g(r11, r1)
                java.lang.String r1 = "msg"
                gy3.C87412m.m108594g(r12, r1)
                java.lang.String r1 = "userName"
                gy3.C87412m.m108594g(r13, r1)
                r9.f218320v = r11
                r3 = r10
                com.tencent.mm.ui.chatting.viewitems.y6$a r3 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74316y6.C74317a) r3
                android.view.View r10 = r3.clickArea
                int r13 = r3.f218317g
                r3.resetChatBubbleWidth(r10, r13)
                java.lang.Class<he0.h> r10 = he0.C46021h.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                he0.h r10 = (he0.C46021h) r10
                java.lang.String r13 = r12.getContent()
                ie0.m r10 = r10.mo71455Rm(r13)
                java.lang.String r13 = "MicroMsg.ChattingItemOpenIMKefuNameCard"
                r1 = 1
                r2 = 0
                if (r10 == 0) goto L_0x0048
                java.lang.String r4 = r10.f124596a
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0045
                r4 = 1
                goto L_0x0046
            L_0x0045:
                r4 = 0
            L_0x0046:
                if (r4 == 0) goto L_0x004d
            L_0x0048:
                java.lang.String r4 = "alvinluo fillingOpenIMKefuCard content invalid"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r4)
            L_0x004d:
                com.tencent.mm.ui.chatting.viewitems.y6$e r4 = com.tencent.p014mm.p136ui.chatting.viewitems.C74316y6.f218311a
                r4.mo103294a(r11, r10, r3)
                android.view.View r4 = r3.clickArea
                com.tencent.mm.ui.chatting.viewitems.t8 r5 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r6 = r11.mo91583x()
                if (r10 == 0) goto L_0x0060
                java.lang.String r7 = r10.f124596a
                if (r7 != 0) goto L_0x0062
            L_0x0060:
                java.lang.String r7 = ""
            L_0x0062:
                r5.<init>(r12, r6, r3, r7)
                android.os.Bundle r6 = new android.os.Bundle
                r6.<init>()
                java.lang.String r10 = r10.f124602g
                java.lang.String r7 = "kefu_card_ticket"
                r6.putString(r7, r10)
                r5.f217960L = r6
                r4.setTag(r5)
                android.view.View r10 = r3.clickArea
                com.tencent.mm.ui.chatting.viewitems.y6$b r4 = new com.tencent.mm.ui.chatting.viewitems.y6$b
                r4.<init>(r11)
                r10.setOnClickListener(r4)
                android.view.View r10 = r3.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r4 = r9.mo103098p(r11)
                r10.setOnLongClickListener(r4)
                android.view.View r10 = r3.clickArea
                com.tencent.mm.ui.chatting.manager.a r4 = r11.f193278b
                xi.d r4 = r4.mo102812a(r0)
                zj3.l r4 = (zj3.C79368l) r4
                com.tencent.mm.ui.chatting.h2 r4 = r4.mo108189Z4()
                r10.setOnTouchListener(r4)
                r10 = 2
                java.lang.Object[] r4 = new java.lang.Object[r10]
                int r5 = r12.getStatus()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r2] = r5
                boolean r5 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r4[r1] = r5
                java.lang.String r5 = "alvinluo fillingNameCard msg.status: %s, showSend: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105927v(r13, r5, r4)
                boolean r13 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
                if (r13 == 0) goto L_0x00eb
                r9.mo103093i0(r3, r2, r1)
                int r13 = r12.getStatus()
                if (r13 != r10) goto L_0x00e0
                com.tencent.mm.ui.chatting.manager.a r10 = r11.f193278b
                xi.d r10 = r10.mo102812a(r0)
                zj3.l r10 = (zj3.C79368l) r10
                long r0 = r12.getMsgId()
                boolean r10 = r9.mo103080N(r10, r0)
                if (r10 == 0) goto L_0x00e0
                android.widget.ImageView r10 = r3.f218316f
                if (r10 != 0) goto L_0x00dc
                goto L_0x00f5
            L_0x00dc:
                r10.setVisibility(r2)
                goto L_0x00f5
            L_0x00e0:
                android.widget.ImageView r10 = r3.f218316f
                if (r10 != 0) goto L_0x00e5
                goto L_0x00f5
            L_0x00e5:
                r13 = 8
                r10.setVisibility(r13)
                goto L_0x00f5
            L_0x00eb:
                int r13 = r12.getStatus()
                if (r13 >= r10) goto L_0x00f2
                r2 = 1
            L_0x00f2:
                r9.mo103093i0(r3, r2, r1)
            L_0x00f5:
                java.lang.String r5 = r11.mo91573n()
                boolean r6 = r11.mo91583x()
                r2 = r9
                r4 = r12
                r7 = r11
                r8 = r9
                r2.mo103087e0(r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74316y6.C74320d.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 67;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.y6$e */
    public static final class C74321e {
        public C74321e(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo103294a(C67391b bVar, C46223m mVar, C74317a aVar) {
            String str;
            String str2;
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(aVar, "holder");
            String str3 = "";
            if (mVar == null || (str = mVar.f124596a) == null) {
                str = str3;
            }
            ImageView imageView = aVar.f218312b;
            if (imageView != null) {
                imageView.setBackgroundResource(C0966R.C0969drawable.bfa);
            }
            C74023i.m87883d0(aVar.f218312b, str);
            TextView textView = aVar.f218315e;
            if (textView != null) {
                C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
                Activity f = bVar.mo91565f();
                if (!(mVar == null || (str2 = mVar.f124597b) == null)) {
                    str3 = str2;
                }
                TextView textView2 = aVar.f218315e;
                C87412m.m108591d(textView2);
                textView.setText(hVar.yp0(f, str3, textView2.getTextSize()));
            }
            TextView textView3 = aVar.f218313c;
            if (textView3 != null) {
                textView3.setText(C0966R.string.ba8);
            }
            String str4 = null;
            String str5 = mVar != null ? mVar.f124600e : null;
            if (mVar != null) {
                str4 = mVar.f124601f;
            }
            CharSequence charSequence = str4;
            if (!Util.isNullOrNil(str5)) {
                Activity f2 = bVar.mo91565f();
                TextView textView4 = aVar.f218314d;
                C87412m.m108591d(textView4);
                charSequence = ((C76158j) C86312j.m106911c(C76158j.class)).De0(f2, str5, str4, textView4.getTextSize());
            }
            if (!(charSequence == null || charSequence.length() == 0)) {
                TextView textView5 = aVar.f218314d;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                TextView textView6 = aVar.f218314d;
                if (textView6 != null) {
                    textView6.setText(charSequence);
                    return;
                }
                return;
            }
            TextView textView7 = aVar.f218314d;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
        }

        /* renamed from: b */
        public final void mo103295b(C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(bVar, "ui");
            if (f4Var != null) {
                Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
                intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
                intent.putExtra("Retr_Msg_Type", 8);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$Companion", "transmitCard", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                bVar.mo91556Q((Intent) aVar.mo10231a(0));
                C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$Companion", "transmitCard", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
