package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.WalletQueryRemittanceStatusEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import eb0.C75592q0;
import i21.C98591h;
import ke3.C88144b;
import nj3.C76874e0;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.f3 */
public class C57749f3 {

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.f3$d */
    public static class C57750d implements C72963f4.C72966d<C57750d> {

        /* renamed from: b */
        public WalletQueryRemittanceStatusEvent f165288b;

        public C57750d(WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent) {
            this.f165288b = walletQueryRemittanceStatusEvent;
        }

        /* renamed from: a */
        public boolean mo82132a(Object obj) {
            return this.f165288b.compareContent(((C57750d) obj).f165288b);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.f3$a */
    public static class C57751a extends C74023i.C74026c {

        /* renamed from: b */
        public ImageView f165289b;

        /* renamed from: c */
        public TextView f165290c;

        /* renamed from: d */
        public TextView f165291d;

        /* renamed from: e */
        public View f165292e;

        /* renamed from: f */
        public ImageView f165293f;

        /* renamed from: g */
        public TextView f165294g;

        /* renamed from: h */
        public TextView f165295h;

        /* renamed from: i */
        public int f165296i = 0;

        /* renamed from: a */
        public C57751a mo82207a(View view, boolean z) {
            super.create(view);
            this.timeTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b8z);
            this.checkBox = (CheckBox) this.convertView.findViewById(C0966R.C0970id.b46);
            this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
            this.userTV = (TextView) this.convertView.findViewById(C0966R.C0970id.b9_);
            this.f165292e = this.convertView.findViewById(C0966R.C0970id.ecx);
            this.f165293f = (ImageView) this.convertView.findViewById(C0966R.C0970id.c7p);
            this.f165294g = (TextView) this.convertView.findViewById(C0966R.C0970id.f6137yb);
            this.f165295h = (TextView) this.convertView.findViewById(C0966R.C0970id.nrd);
            this.f165289b = (ImageView) this.convertView.findViewById(C0966R.C0970id.f6136ya);
            this.f165290c = (TextView) this.convertView.findViewById(C0966R.C0970id.f6135y_);
            this.f165291d = (TextView) this.convertView.findViewById(C0966R.C0970id.f6138yc);
            this.f165296i = C74023i.m87886m(MMApplicationContext.getContext());
            C85875k4.m106189j0(this.f165291d.getPaint(), 0.8f);
            return this;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.f3$b */
    public static class C57752b extends C74023i {

        /* renamed from: v */
        public C67391b f165297v;

        /* renamed from: o0 */
        public static boolean m66601o0(C67391b bVar, C72963f4 f4Var) {
            C67391b bVar2 = bVar;
            if (!WeChatBrands.Business.Entries.SessionPayment.checkAvailable(bVar.mo91565f())) {
                return true;
            }
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("sender_name", f4Var.mo108768t());
            int i = u.f195489G0;
            String str = ".ui.RemittanceDetailUI";
            if (i != 1) {
                if (i != 11) {
                    if (i != 21) {
                        switch (i) {
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                                break;
                            case 7:
                                break;
                            default:
                                switch (i) {
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                        break;
                                    case 27:
                                        break;
                                    default:
                                        String str2 = Util.isNullOrNil(u.f195572f1) ? u.f195586j : u.f195572f1;
                                        Log.m105929w("MicroMsg.ChattingItemAppMsgRemittanceFrom", "Unrecognized type %d, probably version to low & check update! url:%s", Integer.valueOf(u.f195489G0), str2);
                                        if (Util.isNullOrNil(str2)) {
                                            return true;
                                        }
                                        intent.putExtra("rawUrl", str2);
                                        C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                                        return true;
                                }
                        }
                    }
                }
                intent.putExtra("is_sender", true);
                intent.putExtra("appmsg_type", u.f195489G0);
                intent.putExtra("transfer_id", u.f195501J0);
                intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, u.f195497I0);
                intent.putExtra("effective_date", u.f195507L0);
                intent.putExtra("total_fee", u.f195516O0);
                intent.putExtra("fee_type", u.f195519P0);
                intent.putExtra("payer_name", u.f195510M0);
                intent.putExtra("receiver_name", u.f195513N0);
                if (C75592q0.m90763K()) {
                    C88144b.m109791i(bVar.mo91565f(), "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, (Bundle) null);
                    return true;
                }
                C88144b.m109791i(bVar.mo91565f(), "remittance", str, intent, (Bundle) null);
                return true;
            }
            String str3 = str;
            intent.putExtra("invalid_time", u.f195504K0);
            intent.putExtra("is_sender", false);
            intent.putExtra("appmsg_type", u.f195489G0);
            intent.putExtra("transfer_id", u.f195501J0);
            intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, u.f195497I0);
            intent.putExtra("effective_date", u.f195507L0);
            intent.putExtra("total_fee", u.f195516O0);
            intent.putExtra("fee_type", u.f195519P0);
            intent.putExtra("key_msg_id", f4Var.getMsgId());
            intent.putExtra("payer_name", u.f195510M0);
            intent.putExtra("receiver_name", u.f195513N0);
            if (C75592q0.m90763K()) {
                C88144b.m109797o(bVar.f193286j, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, 221);
                return true;
            }
            C88144b.m109797o(bVar.f193286j, "remittance", str3, intent, 221);
            return true;
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6902rq);
            C57751a aVar = new C57751a();
            aVar.mo82207a(n4Var, true);
            n4Var.setTag(aVar);
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
            int b = ((C74243t8) view.getTag()).mo103252b();
            if (f4Var == null) {
                return false;
            }
            e0Var.mo107136c(b, 100, 0, this.f165297v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return m66601o0(bVar, f4Var);
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return C57749f3.m66598a(f4Var);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x037a, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b94);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0384, code lost:
            if (r13 != 1) goto L_0x038f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0386, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.f360261b90);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x038f, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8y);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0396, code lost:
            if (r13 == 0) goto L_0x03a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0398, code lost:
            if (r13 != 1) goto L_0x039b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x039b, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8y);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a1, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8x);
            r1 = hi3.C87515a.m108835e(r30.mo91572m(), com.tencent.p014mm.C0966R.raw.remark_address_icon, 0.0f);
            r1.setBounds(0, 0, kg3.C76577a.m92151b(r30.mo91565f(), 16), kg3.C76577a.m92151b(r30.mo91565f(), 16));
            r5.f165290c.setCompoundDrawables(r1, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x03d2, code lost:
            if (r13 != 2) goto L_0x03da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x03d4, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_received_icon);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x03da, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_icon);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x03df, code lost:
            if (r13 != 2) goto L_0x03eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x03e5, code lost:
            if (r8.f154910e.f154914c == false) goto L_0x03eb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x03e7, code lost:
            mo82208p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x03eb, code lost:
            mo82209q0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x03ee, code lost:
            r2 = r30;
            r5.clickArea.setOnClickListener(mo103099u(r2));
            r5.clickArea.setOnLongClickListener(mo103098p(r2));
            r5.clickArea.setOnTouchListener(((zj3.C79368l) r2.f193278b.mo102812a(zj3.C79368l.class)).mo108189Z4());
            r5.clickArea.setTag(new com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8(r31, r30.mo91583x(), r5, (java.lang.String) null));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0272, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8p);
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_cancle_icon);
            mo82208p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0284, code lost:
            if (r10 == false) goto L_0x028f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0286, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8u);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x028f, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8v);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x0297, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_received_icon);
            mo82208p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a1, code lost:
            if (r10 == false) goto L_0x02ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x02a3, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.f360262b91);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x02ac, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b95);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x02b4, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_cancle_icon);
            mo82208p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x02be, code lost:
            if (r10 == false) goto L_0x02c9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x02c0, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8z);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x02c9, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.f360263b93);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x02d1, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_received_icon);
            mo82208p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02db, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b9g);
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_expired_icon);
            r5.clickArea.setBackgroundResource(com.tencent.p014mm.C0966R.C0969drawable.c2c_chatfrom_remittance_expired_bg);
            r5.clickArea.setPadding(0, 0, 0, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02fb, code lost:
            if (r5.f165292e == null) goto L_0x03ee;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0301, code lost:
            if (com.tencent.p014mm.p136ui.C85875k4.m106211z() == false) goto L_0x0320;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0303, code lost:
            r5.f165289b.setAlpha(0.3f);
            r5.f165290c.setAlpha(0.3f);
            r5.f165291d.setAlpha(0.3f);
            r5.f165294g.setAlpha(0.3f);
            r5.f165295h.setAlpha(0.3f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0320, code lost:
            r5.f165289b.setAlpha(1.0f);
            r5.f165290c.setAlpha(1.0f);
            r5.f165291d.setAlpha(1.0f);
            r5.f165294g.setAlpha(0.8f);
            r5.f165295h.setAlpha(0.8f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x033e, code lost:
            r5.f165292e.setBackgroundResource(com.tencent.p014mm.C0966R.color.ahf);
            r5.f165293f.setVisibility(0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0353, code lost:
            if (r12.f157426b != 0) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x035b, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6.f195532T1) != false) goto L_0x0378;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x035e, code lost:
            if (r13 == 2) goto L_0x0378;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0360, code lost:
            r5.f165290c.setText(((p629ny.C76979h) di3.C86312j.m106911c(p629ny.C76979h.class)).mo107057T1(r30.mo91565f(), r6.f195532T1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0378, code lost:
            if (r13 != 0) goto L_0x0383;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r29, ck3.C67391b r30, com.tencent.p014mm.storage.C72963f4 r31, java.lang.String r32) {
            /*
                r28 = this;
                r0 = r28
                r1 = r30
                java.lang.Class<d62.i> r2 = d62.C75339i.class
                java.lang.Class<zz.f> r3 = p287zz.C79442f.class
                java.lang.Class<zz.i> r4 = p287zz.C79445i.class
                r0.f165297v = r1
                r5 = r29
                com.tencent.mm.ui.chatting.viewitems.f3$a r5 = (com.tencent.p014mm.p136ui.chatting.viewitems.C57749f3.C57751a) r5
                java.lang.String r6 = r31.getContent()
                if (r6 == 0) goto L_0x001f
                java.lang.String r8 = r31.mo108775z2()
                com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r8)
                goto L_0x0020
            L_0x001f:
                r6 = 0
            L_0x0020:
                if (r6 == 0) goto L_0x0426
                android.widget.TextView r8 = r5.f165295h
                r9 = 2011(0x7db, float:2.818E-42)
                r10 = 0
                if (r8 == 0) goto L_0x0036
                int r11 = r6.f195582i
                if (r11 != r9) goto L_0x0031
                r8.setVisibility(r10)
                goto L_0x0036
            L_0x0031:
                r11 = 8
                r8.setVisibility(r11)
            L_0x0036:
                android.view.View r8 = r5.clickArea
                int r11 = r5.f165296i
                r5.resetChatBubbleWidth(r8, r11)
                android.view.View r8 = r5.clickArea
                r11 = 2131231415(0x7f0802b7, float:1.807891E38)
                r8.setBackgroundResource(r11)
                android.view.View r8 = r5.clickArea
                r8.setPadding(r10, r10, r10, r10)
                android.widget.TextView r8 = r5.f165290c
                r11 = 1
                r8.setSingleLine(r11)
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent r8 = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent
                r8.<init>()
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$a r12 = r8.f154909d
                java.lang.String r13 = r6.f195501J0
                r12.f154911a = r13
                r8.publish()
                java.lang.Class<com.tencent.mm.message.k> r12 = com.tencent.p014mm.message.C55268k.class
                com.tencent.mm.message.g r12 = r6.mo93555w(r12)
                com.tencent.mm.message.k r12 = (com.tencent.p014mm.message.C55268k) r12
                boolean r13 = r30.mo91583x()
                r14 = 2
                java.lang.String r15 = ""
                if (r13 == 0) goto L_0x0097
                java.lang.String r13 = r12.f157427c
                java.lang.String r15 = r30.mo91573n()
                boolean r13 = r13.equals(r15)
                if (r13 == 0) goto L_0x007d
                r13 = 0
                goto L_0x008c
            L_0x007d:
                java.lang.String r13 = r12.f157428d
                java.lang.String r15 = r30.mo91573n()
                boolean r13 = r13.equals(r15)
                if (r13 == 0) goto L_0x008b
                r13 = 1
                goto L_0x008c
            L_0x008b:
                r13 = 2
            L_0x008c:
                java.lang.String r15 = r12.f157428d
                java.lang.String r7 = r12.f157427c
                java.lang.String r16 = r30.mo91577r()
                r9 = r16
                goto L_0x00ba
            L_0x0097:
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b r7 = r8.f154910e
                boolean r13 = r7.f154913b
                int r7 = r7.f154912a
                r9 = -2
                if (r7 != r9) goto L_0x00a1
                r13 = 0
            L_0x00a1:
                if (r13 != 0) goto L_0x00ac
                java.lang.String r7 = r30.mo91577r()
                java.lang.String r9 = r30.mo91573n()
                goto L_0x00b4
            L_0x00ac:
                java.lang.String r7 = r30.mo91573n()
                java.lang.String r9 = r30.mo91577r()
            L_0x00b4:
                r27 = r15
                r15 = r7
                r7 = r9
                r9 = r27
            L_0x00ba:
                int r10 = r6.f195489G0
                if (r10 == r11) goto L_0x00da
                r11 = 21
                if (r10 == r11) goto L_0x00da
                r11 = 7
                if (r10 == r11) goto L_0x00da
                r11 = 27
                if (r10 != r11) goto L_0x00ca
                goto L_0x00da
            L_0x00ca:
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
                if (r10 != 0) goto L_0x00da
                r10 = r32
                boolean r10 = r10.equals(r7)
                if (r10 == 0) goto L_0x00da
                r10 = 0
                goto L_0x00db
            L_0x00da:
                r10 = 1
            L_0x00db:
                java.lang.Object[] r11 = new java.lang.Object[r14]
                java.lang.Integer r19 = java.lang.Integer.valueOf(r13)
                r17 = 0
                r11[r17] = r19
                java.lang.Boolean r19 = java.lang.Boolean.valueOf(r10)
                r18 = 1
                r11[r18] = r19
                java.lang.String r14 = "MicroMsg.ChattingItemAppMsgRemittanceFrom"
                java.lang.String r1 = "roleType: %s, fromPayer: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r11)
                boolean r1 = r30.mo91583x()
                r11 = 18
                if (r1 != 0) goto L_0x0136
                int r1 = r6.f195582i
                r14 = 2011(0x7db, float:2.818E-42)
                if (r1 != r14) goto L_0x0103
                goto L_0x0136
            L_0x0103:
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                r1.<init>()
                java.lang.String r2 = r6.f195493H0
                r1.append(r2)
                di3.d r2 = di3.C86312j.m106911c(r3)
                r20 = r2
                zz.f r20 = (p287zz.C79442f) r20
                android.app.Activity r21 = r30.mo91565f()
                r22 = 0
                r23 = 0
                r24 = -1
                r25 = 0
                r26 = 0
                android.text.style.TextAppearanceSpan r2 = r20.n20(r21, r22, r23, r24, r25, r26)
                int r3 = r1.length()
                r4 = 0
                r1.setSpan(r2, r4, r3, r11)
                android.widget.TextView r2 = r5.f165291d
                r2.setText(r1)
                goto L_0x0244
            L_0x0136:
                r1 = 14
                if (r10 == 0) goto L_0x01c4
                di3.d r2 = di3.C86312j.m106911c(r2)
                d62.i r2 = (d62.C75339i) r2
                java.lang.String r2 = r2.mo62519pb(r7, r9)
                int r9 = r6.f195582i
                r14 = 2011(0x7db, float:2.818E-42)
                if (r9 != r14) goto L_0x0165
                boolean r9 = r30.mo91583x()
                if (r9 == 0) goto L_0x015b
                di3.d r9 = di3.C86312j.m106911c(r4)
                zz.i r9 = (p287zz.C79445i) r9
                java.lang.String r2 = r9.l50(r2, r7)
                goto L_0x0165
            L_0x015b:
                di3.d r9 = di3.C86312j.m106911c(r4)
                zz.i r9 = (p287zz.C79445i) r9
                java.lang.String r2 = r9.mo109183JQ(r2, r7)
            L_0x0165:
                di3.d r4 = di3.C86312j.m106911c(r4)
                zz.i r4 = (p287zz.C79445i) r4
                java.lang.String r1 = r4.mo109195vJ(r2, r1)
                android.app.Activity r2 = r30.mo91565f()
                r4 = 2131823516(0x7f110b9c, float:1.9279834E38)
                r7 = 1
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r7 = 0
                r9[r7] = r1
                java.lang.String r1 = r2.getString(r4, r9)
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r2.append(r1)
                r4 = 2
                if (r13 == r4) goto L_0x01bd
                java.lang.String r4 = r6.f195493H0
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x01bd
                java.lang.String r4 = r6.f195493H0
                r2.append(r4)
                di3.d r3 = di3.C86312j.m106911c(r3)
                r20 = r3
                zz.f r20 = (p287zz.C79442f) r20
                android.app.Activity r21 = r30.mo91565f()
                r22 = 0
                r23 = 0
                r24 = -1
                r25 = 0
                r26 = 0
                android.text.style.TextAppearanceSpan r3 = r20.n20(r21, r22, r23, r24, r25, r26)
                int r1 = r1.length()
                int r4 = r2.length()
                r2.setSpan(r3, r1, r4, r11)
            L_0x01bd:
                android.widget.TextView r1 = r5.f165291d
                r1.setText(r2)
                goto L_0x0244
            L_0x01c4:
                di3.d r2 = di3.C86312j.m106911c(r2)
                d62.i r2 = (d62.C75339i) r2
                java.lang.String r2 = r2.mo62519pb(r15, r9)
                di3.d r7 = di3.C86312j.m106911c(r4)
                zz.i r7 = (p287zz.C79445i) r7
                java.lang.String r2 = r7.l50(r2, r15)
                di3.d r4 = di3.C86312j.m106911c(r4)
                zz.i r4 = (p287zz.C79445i) r4
                java.lang.String r1 = r4.mo109195vJ(r2, r1)
                r2 = 2
                if (r13 == r2) goto L_0x022e
                android.app.Activity r2 = r30.mo91565f()
                r4 = 2131823518(0x7f110b9e, float:1.9279838E38)
                r7 = 1
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r7 = 0
                r9[r7] = r1
                java.lang.String r1 = r2.getString(r4, r9)
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r4 = r6.f195493H0
                r2.append(r4)
                di3.d r3 = di3.C86312j.m106911c(r3)
                r20 = r3
                zz.f r20 = (p287zz.C79442f) r20
                android.app.Activity r21 = r30.mo91565f()
                r22 = 0
                r23 = 0
                r24 = -1
                r25 = 0
                r26 = 0
                android.text.style.TextAppearanceSpan r3 = r20.n20(r21, r22, r23, r24, r25, r26)
                int r1 = r1.length()
                int r4 = r2.length()
                r2.setSpan(r3, r1, r4, r11)
                android.widget.TextView r1 = r5.f165291d
                r1.setText(r2)
                goto L_0x0244
            L_0x022e:
                android.app.Activity r2 = r30.mo91565f()
                r3 = 2131823515(0x7f110b9b, float:1.9279832E38)
                r4 = 1
                java.lang.Object[] r7 = new java.lang.Object[r4]
                r4 = 0
                r7[r4] = r1
                java.lang.String r1 = r2.getString(r3, r7)
                android.widget.TextView r2 = r5.f165291d
                r2.setText(r1)
            L_0x0244:
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b r1 = r8.f154910e
                int r1 = r1.f154912a
                if (r1 > 0) goto L_0x024c
                int r1 = r6.f195489G0
            L_0x024c:
                android.widget.TextView r2 = r5.f165290c
                r3 = 0
                r2.setCompoundDrawables(r3, r3, r3, r3)
                r2 = 2131755310(0x7f10012e, float:1.9141496E38)
                r3 = 2131755308(0x7f10012c, float:1.9141492E38)
                r4 = 2131755311(0x7f10012f, float:1.9141498E38)
                switch(r1) {
                    case 1: goto L_0x034e;
                    case 2: goto L_0x02db;
                    case 3: goto L_0x02be;
                    case 4: goto L_0x02a1;
                    case 5: goto L_0x0284;
                    case 6: goto L_0x0272;
                    case 7: goto L_0x034e;
                    case 8: goto L_0x02be;
                    case 9: goto L_0x02a1;
                    case 10: goto L_0x02db;
                    case 11: goto L_0x0272;
                    default: goto L_0x025e;
                }
            L_0x025e:
                switch(r1) {
                    case 21: goto L_0x034e;
                    case 22: goto L_0x02db;
                    case 23: goto L_0x02be;
                    case 24: goto L_0x02a1;
                    case 25: goto L_0x0284;
                    case 26: goto L_0x0272;
                    case 27: goto L_0x034e;
                    default: goto L_0x0261;
                }
            L_0x0261:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r2)
                android.widget.TextView r1 = r5.f165291d
                java.lang.String r2 = r6.f195574g
                r1.setText(r2)
                r0.mo82209q0(r5)
                goto L_0x03ee
            L_0x0272:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823496(0x7f110b88, float:1.9279793E38)
                r1.setText(r2)
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r3)
                r0.mo82208p0(r5)
                goto L_0x03ee
            L_0x0284:
                if (r10 == 0) goto L_0x028f
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823501(0x7f110b8d, float:1.9279803E38)
                r1.setText(r2)
                goto L_0x0297
            L_0x028f:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823502(0x7f110b8e, float:1.9279805E38)
                r1.setText(r2)
            L_0x0297:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r4)
                r0.mo82208p0(r5)
                goto L_0x03ee
            L_0x02a1:
                if (r10 == 0) goto L_0x02ac
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823508(0x7f110b94, float:1.9279818E38)
                r1.setText(r2)
                goto L_0x02b4
            L_0x02ac:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823512(0x7f110b98, float:1.9279826E38)
                r1.setText(r2)
            L_0x02b4:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r3)
                r0.mo82208p0(r5)
                goto L_0x03ee
            L_0x02be:
                if (r10 == 0) goto L_0x02c9
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823506(0x7f110b92, float:1.9279814E38)
                r1.setText(r2)
                goto L_0x02d1
            L_0x02c9:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823510(0x7f110b96, float:1.9279822E38)
                r1.setText(r2)
            L_0x02d1:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r4)
                r0.mo82208p0(r5)
                goto L_0x03ee
            L_0x02db:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823525(0x7f110ba5, float:1.9279852E38)
                r1.setText(r2)
                android.widget.ImageView r1 = r5.f165289b
                r2 = 2131755309(0x7f10012d, float:1.9141494E38)
                r1.setImageResource(r2)
                android.view.View r1 = r5.clickArea
                r2 = 2131231426(0x7f0802c2, float:1.8078933E38)
                r1.setBackgroundResource(r2)
                android.view.View r1 = r5.clickArea
                r2 = 0
                r1.setPadding(r2, r2, r2, r2)
                android.view.View r1 = r5.f165292e
                if (r1 == 0) goto L_0x03ee
                boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r1 == 0) goto L_0x0320
                android.widget.ImageView r1 = r5.f165289b
                r2 = 1050253722(0x3e99999a, float:0.3)
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165290c
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165291d
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165294g
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165295h
                r1.setAlpha(r2)
                goto L_0x033e
            L_0x0320:
                android.widget.ImageView r1 = r5.f165289b
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165290c
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165291d
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165294g
                r2 = 1061997773(0x3f4ccccd, float:0.8)
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165295h
                r1.setAlpha(r2)
            L_0x033e:
                android.view.View r1 = r5.f165292e
                r2 = 2131101688(0x7f0607f8, float:1.7815793E38)
                r1.setBackgroundResource(r2)
                android.widget.ImageView r1 = r5.f165293f
                r2 = 0
                r1.setVisibility(r2)
                goto L_0x03ee
            L_0x034e:
                int r1 = r12.f157426b
                r3 = 2131823505(0x7f110b91, float:1.9279812E38)
                if (r1 != 0) goto L_0x0395
                java.lang.String r1 = r6.f195532T1
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0378
                r1 = 2
                if (r13 == r1) goto L_0x0378
                android.widget.TextView r1 = r5.f165290c
                java.lang.Class<ny.h> r3 = p629ny.C76979h.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                ny.h r3 = (p629ny.C76979h) r3
                android.app.Activity r7 = r30.mo91565f()
                java.lang.String r6 = r6.f195532T1
                android.text.SpannableString r3 = r3.mo107057T1(r7, r6)
                r1.setText(r3)
                goto L_0x03d1
            L_0x0378:
                if (r13 != 0) goto L_0x0383
                android.widget.TextView r1 = r5.f165290c
                r3 = 2131823511(0x7f110b97, float:1.9279824E38)
                r1.setText(r3)
                goto L_0x03d1
            L_0x0383:
                r1 = 1
                if (r13 != r1) goto L_0x038f
                android.widget.TextView r1 = r5.f165290c
                r3 = 2131823507(0x7f110b93, float:1.9279816E38)
                r1.setText(r3)
                goto L_0x03d1
            L_0x038f:
                android.widget.TextView r1 = r5.f165290c
                r1.setText(r3)
                goto L_0x03d1
            L_0x0395:
                r1 = 1
                if (r13 == 0) goto L_0x03a1
                if (r13 != r1) goto L_0x039b
                goto L_0x03a1
            L_0x039b:
                android.widget.TextView r1 = r5.f165290c
                r1.setText(r3)
                goto L_0x03d1
            L_0x03a1:
                android.widget.TextView r1 = r5.f165290c
                r3 = 2131823504(0x7f110b90, float:1.927981E38)
                r1.setText(r3)
                android.content.res.Resources r1 = r30.mo91572m()
                r3 = 2131756894(0x7f10075e, float:1.9144708E38)
                r6 = 0
                android.graphics.drawable.Drawable r1 = hi3.C87515a.m108835e(r1, r3, r6)
                android.app.Activity r3 = r30.mo91565f()
                r6 = 16
                int r3 = kg3.C76577a.m92151b(r3, r6)
                android.app.Activity r7 = r30.mo91565f()
                int r6 = kg3.C76577a.m92151b(r7, r6)
                r7 = 0
                r1.setBounds(r7, r7, r3, r6)
                android.widget.TextView r3 = r5.f165290c
                r6 = 0
                r3.setCompoundDrawables(r1, r6, r6, r6)
            L_0x03d1:
                r1 = 2
                if (r13 != r1) goto L_0x03da
                android.widget.ImageView r2 = r5.f165289b
                r2.setImageResource(r4)
                goto L_0x03df
            L_0x03da:
                android.widget.ImageView r3 = r5.f165289b
                r3.setImageResource(r2)
            L_0x03df:
                if (r13 != r1) goto L_0x03eb
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b r1 = r8.f154910e
                boolean r1 = r1.f154914c
                if (r1 == 0) goto L_0x03eb
                r0.mo82208p0(r5)
                goto L_0x03ee
            L_0x03eb:
                r0.mo82209q0(r5)
            L_0x03ee:
                android.view.View r1 = r5.clickArea
                r2 = r30
                com.tencent.mm.ui.chatting.viewitems.i$f r3 = r0.mo103099u(r2)
                r1.setOnClickListener(r3)
                android.view.View r1 = r5.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r3 = r0.mo103098p(r2)
                r1.setOnLongClickListener(r3)
                android.view.View r1 = r5.clickArea
                java.lang.Class<zj3.l> r3 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r4 = r2.f193278b
                xi.d r3 = r4.mo102812a(r3)
                zj3.l r3 = (zj3.C79368l) r3
                com.tencent.mm.ui.chatting.h2 r3 = r3.mo108189Z4()
                r1.setOnTouchListener(r3)
                com.tencent.mm.ui.chatting.viewitems.t8 r1 = new com.tencent.mm.ui.chatting.viewitems.t8
                boolean r2 = r30.mo91583x()
                r3 = r31
                r4 = 0
                r1.<init>(r3, r2, r5, r4)
                android.view.View r2 = r5.clickArea
                r2.setTag(r1)
            L_0x0426:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C57749f3.C57752b.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 419430449;
        }

        /* renamed from: p0 */
        public final void mo82208p0(C57751a aVar) {
            aVar.clickArea.setBackgroundResource(C0966R.C0969drawable.f4672jm);
            aVar.clickArea.setPadding(0, 0, 0, 0);
            if (aVar.f165292e != null) {
                if (C85875k4.m106211z()) {
                    aVar.f165289b.setAlpha(0.3f);
                    aVar.f165290c.setAlpha(0.3f);
                    aVar.f165291d.setAlpha(0.3f);
                    aVar.f165294g.setAlpha(0.3f);
                    aVar.f165295h.setAlpha(0.3f);
                } else {
                    aVar.f165289b.setAlpha(1.0f);
                    aVar.f165290c.setAlpha(1.0f);
                    aVar.f165291d.setAlpha(1.0f);
                    aVar.f165294g.setAlpha(0.8f);
                    aVar.f165295h.setAlpha(0.8f);
                }
                aVar.f165292e.setBackgroundResource(C0966R.color.ahf);
                aVar.f165293f.setVisibility(0);
            }
        }

        /* renamed from: q0 */
        public final void mo82209q0(C57751a aVar) {
            if (aVar.f165292e != null) {
                if (C85875k4.m106211z()) {
                    aVar.f165289b.setAlpha(0.8f);
                    aVar.f165290c.setAlpha(0.8f);
                    aVar.f165291d.setAlpha(0.8f);
                    aVar.f165294g.setAlpha(0.5f);
                    aVar.f165295h.setAlpha(0.5f);
                } else {
                    aVar.f165289b.setAlpha(1.0f);
                    aVar.f165290c.setAlpha(1.0f);
                    aVar.f165291d.setAlpha(1.0f);
                    aVar.f165294g.setAlpha(0.8f);
                    aVar.f165295h.setAlpha(0.8f);
                }
                aVar.f165292e.setBackgroundResource(C0966R.color.ahf);
                aVar.f165293f.setVisibility(0);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.f3$c */
    public static class C57753c extends C74023i {

        /* renamed from: v */
        public C67391b f165298v;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.f3$c$a */
        public class C57754a implements C88144b.C76564c {

            /* renamed from: a */
            public final /* synthetic */ C67391b f165299a;

            public C57754a(C67391b bVar) {
                this.f165299a = bVar;
            }

            public void onActivityResult(int i, int i2, Intent intent) {
                if (i == 221 && intent != null) {
                    String stringExtra = intent.getStringExtra("result_msg");
                    if (!Util.isNullOrNil(stringExtra)) {
                        C76879j.m92712F(this.f165299a.mo91565f(), stringExtra, "", false);
                    }
                }
            }
        }

        /* renamed from: o0 */
        public static boolean m66612o0(C67391b bVar, C72963f4 f4Var) {
            C67391b bVar2 = bVar;
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                return false;
            }
            Intent intent = new Intent();
            intent.putExtra("sender_name", f4Var.mo108768t());
            int i = u.f195489G0;
            if (i != 1) {
                if (i != 11) {
                    if (i != 21) {
                        switch (i) {
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                                break;
                            case 7:
                                break;
                            default:
                                switch (i) {
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                        break;
                                    case 27:
                                        break;
                                    default:
                                        String str = Util.isNullOrNil(u.f195572f1) ? u.f195586j : u.f195572f1;
                                        Log.m105929w("MicroMsg.ChattingItemAppMsgRemittanceTo", "Unrecognized type %d, probably version to low & check update! url:%s", Integer.valueOf(u.f195489G0), str);
                                        if (!Util.isNullOrNil(str)) {
                                            intent.putExtra("rawUrl", str);
                                            C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
                                            break;
                                        }
                                        break;
                                }
                        }
                    }
                }
                intent.putExtra("appmsg_type", i);
                intent.putExtra("transfer_id", u.f195501J0);
                intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, u.f195497I0);
                intent.putExtra("effective_date", u.f195507L0);
                intent.putExtra("total_fee", u.f195516O0);
                intent.putExtra("fee_type", u.f195519P0);
                intent.putExtra("payer_name", u.f195510M0);
                intent.putExtra("receiver_name", u.f195513N0);
                if (C75592q0.m90763K()) {
                    C88144b.m109791i(bVar.mo91565f(), "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, (Bundle) null);
                } else {
                    C88144b.m109791i(bVar.mo91565f(), "remittance", ".ui.RemittanceDetailUI", intent, (Bundle) null);
                }
                return true;
            }
            intent.putExtra("invalid_time", u.f195504K0);
            intent.putExtra("is_sender", true);
            intent.putExtra("appmsg_type", u.f195489G0);
            intent.putExtra("transfer_id", u.f195501J0);
            intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, u.f195497I0);
            intent.putExtra("effective_date", u.f195507L0);
            intent.putExtra("total_fee", u.f195516O0);
            intent.putExtra("fee_type", u.f195519P0);
            intent.putExtra("payer_name", u.f195510M0);
            intent.putExtra("receiver_name", u.f195513N0);
            intent.putExtra("key_msg_id", f4Var.getMsgId());
            C57754a aVar = new C57754a(bVar2);
            if (C75592q0.m90763K()) {
                C88144b.m109798p(bVar2.f193279c, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, 221, aVar);
            } else {
                C88144b.m109798p(bVar2.f193279c, "remittance", ".ui.RemittanceDetailUI", intent, 221, aVar);
            }
            return true;
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6952t7);
            C57751a aVar = new C57751a();
            aVar.mo82207a(n4Var, false);
            n4Var.setTag(aVar);
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
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u == null) {
                return false;
            }
            e0Var.mo107136c(b, 100, 0, this.f165298v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new WalletQueryRemittanceStatusEvent();
            walletQueryRemittanceStatusEvent.f154909d.f154911a = u.f195501J0;
            walletQueryRemittanceStatusEvent.publish();
            int i = walletQueryRemittanceStatusEvent.f154910e.f154912a;
            if (i <= 0) {
                i = u.f195489G0;
            }
            if (i != 1 && i != 21 && i != 7 && i != 27) {
                return false;
            }
            if ((f4Var.getStatus() != 2 && f4Var.f230728K != 1) || !mo103083Q(f4Var, this.f165298v) || !mo103081O(f4Var.mo108768t()) || this.f165298v.mo91580u()) {
                return false;
            }
            e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
            return false;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            return m66612o0(bVar, f4Var);
        }

        /* renamed from: d */
        public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            return C57749f3.m66598a(f4Var);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x037a, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.f360261b90);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0383, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8y);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x038a, code lost:
            if (r14 == false) goto L_0x0395;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x038c, code lost:
            if (r14 != true) goto L_0x038f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x038f, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8y);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0395, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8x);
            r1 = hi3.C87515a.m108835e(r29.mo91572m(), com.tencent.p014mm.C0966R.raw.remark_address_icon, 0.0f);
            r1.setBounds(0, 0, kg3.C76577a.m92151b(r29.mo91565f(), 16), kg3.C76577a.m92151b(r29.mo91565f(), 16));
            r5.f165290c.setCompoundDrawables(r1, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x03c6, code lost:
            if (r14 != true) goto L_0x03ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x03c8, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_received_icon);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x03ce, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_icon);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x03d3, code lost:
            if (r14 != true) goto L_0x03df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x03d9, code lost:
            if (r8.f154910e.f154914c == false) goto L_0x03df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x03db, code lost:
            mo82210p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x03df, code lost:
            mo82211q0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x03e2, code lost:
            r2 = r29;
            r5.clickArea.setOnClickListener(mo103099u(r2));
            r5.clickArea.setOnLongClickListener(mo103098p(r2));
            r5.clickArea.setOnTouchListener(((zj3.C79368l) r2.f193278b.mo102812a(zj3.C79368l.class)).mo108189Z4());
            r5.clickArea.setTag(new com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8(r30, r0.f165298v.mo91583x(), r5, (java.lang.String) null));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0266, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8p);
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_cancle_icon);
            mo82210p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0278, code lost:
            if (r9 == false) goto L_0x0283;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x027a, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8u);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0283, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8v);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x028b, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_received_icon);
            mo82210p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0295, code lost:
            if (r9 == false) goto L_0x02a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0297, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.f360262b91);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x02a0, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b95);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x02a8, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_cancle_icon);
            mo82210p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x02b2, code lost:
            if (r9 == false) goto L_0x02bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x02b4, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b8z);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x02bd, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.f360263b93);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x02c5, code lost:
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_received_icon);
            mo82210p0(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x02cf, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b9g);
            r5.f165289b.setImageResource(com.tencent.p014mm.C0966R.raw.c2c_remittance_expired_icon);
            r5.clickArea.setBackgroundResource(com.tencent.p014mm.C0966R.C0969drawable.c2c_chatto_remittance_expired_bg);
            r5.clickArea.setPadding(0, 0, 0, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x02ef, code lost:
            if (r5.f165292e == null) goto L_0x03e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02f5, code lost:
            if (com.tencent.p014mm.p136ui.C85875k4.m106211z() == false) goto L_0x0314;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x02f7, code lost:
            r5.f165289b.setAlpha(0.3f);
            r5.f165290c.setAlpha(0.3f);
            r5.f165291d.setAlpha(0.3f);
            r5.f165294g.setAlpha(0.3f);
            r5.f165295h.setAlpha(0.3f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x0314, code lost:
            r5.f165289b.setAlpha(1.0f);
            r5.f165290c.setAlpha(1.0f);
            r5.f165291d.setAlpha(1.0f);
            r5.f165294g.setAlpha(0.8f);
            r5.f165295h.setAlpha(0.8f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x0332, code lost:
            r5.f165292e.setBackgroundResource(com.tencent.p014mm.C0966R.color.ahf);
            r5.f165293f.setVisibility(0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0347, code lost:
            if (r12.f157426b != 0) goto L_0x0389;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x034f, code lost:
            if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r6.f195532T1) != false) goto L_0x036c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0352, code lost:
            if (r14 == true) goto L_0x036c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0354, code lost:
            r5.f165290c.setText(((p629ny.C76979h) di3.C86312j.m106911c(p629ny.C76979h.class)).mo107057T1(r29.mo91565f(), r6.f195532T1));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x036c, code lost:
            if (r14 != false) goto L_0x0377;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x036e, code lost:
            r5.f165290c.setText(com.tencent.p014mm.C0966R.string.b94);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0378, code lost:
            if (r14 != true) goto L_0x0383;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r28, ck3.C67391b r29, com.tencent.p014mm.storage.C72963f4 r30, java.lang.String r31) {
            /*
                r27 = this;
                r0 = r27
                r1 = r29
                java.lang.Class<d62.i> r2 = d62.C75339i.class
                java.lang.Class<zz.f> r3 = p287zz.C79442f.class
                java.lang.Class<zz.i> r4 = p287zz.C79445i.class
                r0.f165298v = r1
                r5 = r28
                com.tencent.mm.ui.chatting.viewitems.f3$a r5 = (com.tencent.p014mm.p136ui.chatting.viewitems.C57749f3.C57751a) r5
                java.lang.String r6 = r30.getContent()
                if (r6 == 0) goto L_0x001f
                java.lang.String r8 = r30.mo108775z2()
                com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r6, r8)
                goto L_0x0020
            L_0x001f:
                r6 = 0
            L_0x0020:
                if (r6 == 0) goto L_0x041c
                android.widget.TextView r8 = r5.f165295h
                r9 = 2011(0x7db, float:2.818E-42)
                r10 = 0
                if (r8 == 0) goto L_0x0036
                int r11 = r6.f195582i
                if (r11 != r9) goto L_0x0031
                r8.setVisibility(r10)
                goto L_0x0036
            L_0x0031:
                r11 = 8
                r8.setVisibility(r11)
            L_0x0036:
                android.view.View r8 = r5.clickArea
                int r11 = r5.f165296i
                r5.resetChatBubbleWidth(r8, r11)
                android.view.View r8 = r5.clickArea
                r11 = 2131231428(0x7f0802c4, float:1.8078937E38)
                r8.setBackgroundResource(r11)
                android.view.View r8 = r5.clickArea
                r8.setPadding(r10, r10, r10, r10)
                android.widget.TextView r8 = r5.f165290c
                r11 = 1
                r8.setSingleLine(r11)
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent r8 = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent
                r8.<init>()
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$a r12 = r8.f154909d
                java.lang.String r13 = r6.f195501J0
                r12.f154911a = r13
                r8.publish()
                java.lang.Class<com.tencent.mm.message.k> r12 = com.tencent.p014mm.message.C55268k.class
                com.tencent.mm.message.g r12 = r6.mo93555w(r12)
                com.tencent.mm.message.k r12 = (com.tencent.p014mm.message.C55268k) r12
                boolean r13 = r29.mo91583x()
                java.lang.String r14 = ""
                if (r13 == 0) goto L_0x008c
                java.lang.String r13 = r12.f157427c
                java.lang.String r14 = r29.mo91573n()
                boolean r13 = r13.equals(r14)
                if (r13 == 0) goto L_0x007e
                java.lang.String r13 = r12.f157428d
                r14 = 0
                goto L_0x0083
            L_0x007e:
                java.lang.String r13 = r29.mo91573n()
                r14 = 1
            L_0x0083:
                java.lang.String r15 = r12.f157427c
                java.lang.String r16 = r29.mo91577r()
                r7 = r16
                goto L_0x00af
            L_0x008c:
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b r13 = r8.f154910e
                boolean r15 = r13.f154913b
                int r13 = r13.f154912a
                r7 = -2
                if (r13 != r7) goto L_0x0096
                r15 = 0
            L_0x0096:
                if (r15 != 0) goto L_0x00a1
                java.lang.String r13 = r29.mo91577r()
                java.lang.String r7 = r29.mo91573n()
                goto L_0x00a9
            L_0x00a1:
                java.lang.String r13 = r29.mo91573n()
                java.lang.String r7 = r29.mo91577r()
            L_0x00a9:
                r26 = r15
                r15 = r7
                r7 = r14
                r14 = r26
            L_0x00af:
                int r9 = r6.f195489G0
                if (r9 == r11) goto L_0x00cf
                r11 = 21
                if (r9 == r11) goto L_0x00cf
                r11 = 7
                if (r9 == r11) goto L_0x00cf
                r11 = 27
                if (r9 != r11) goto L_0x00bf
                goto L_0x00cf
            L_0x00bf:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
                if (r9 != 0) goto L_0x00cf
                r9 = r31
                boolean r9 = r9.equals(r15)
                if (r9 == 0) goto L_0x00cf
                r9 = 0
                goto L_0x00d0
            L_0x00cf:
                r9 = 1
            L_0x00d0:
                r11 = 2
                java.lang.Object[] r1 = new java.lang.Object[r11]
                java.lang.Integer r18 = java.lang.Integer.valueOf(r14)
                r1[r10] = r18
                java.lang.Boolean r18 = java.lang.Boolean.valueOf(r9)
                r17 = 1
                r1[r17] = r18
                java.lang.String r11 = "MicroMsg.ChattingItemAppMsgRemittanceTo"
                java.lang.String r10 = "roleType: %s, fromPayer: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r10, r1)
                boolean r1 = r29.mo91583x()
                r10 = 18
                if (r1 != 0) goto L_0x012a
                int r1 = r6.f195582i
                r11 = 2011(0x7db, float:2.818E-42)
                if (r1 != r11) goto L_0x00f7
                goto L_0x012a
            L_0x00f7:
                android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
                r1.<init>()
                java.lang.String r2 = r6.f195493H0
                r1.append(r2)
                di3.d r2 = di3.C86312j.m106911c(r3)
                r19 = r2
                zz.f r19 = (p287zz.C79442f) r19
                android.app.Activity r20 = r29.mo91565f()
                r21 = 0
                r22 = 0
                r23 = -1
                r24 = 0
                r25 = 0
                android.text.style.TextAppearanceSpan r2 = r19.n20(r20, r21, r22, r23, r24, r25)
                int r3 = r1.length()
                r4 = 0
                r1.setSpan(r2, r4, r3, r10)
                android.widget.TextView r2 = r5.f165291d
                r2.setText(r1)
                goto L_0x0238
            L_0x012a:
                r1 = 14
                if (r9 == 0) goto L_0x01b8
                di3.d r2 = di3.C86312j.m106911c(r2)
                d62.i r2 = (d62.C75339i) r2
                java.lang.String r2 = r2.mo62519pb(r15, r7)
                int r7 = r6.f195582i
                r11 = 2011(0x7db, float:2.818E-42)
                if (r7 != r11) goto L_0x0159
                boolean r7 = r29.mo91583x()
                if (r7 == 0) goto L_0x014f
                di3.d r7 = di3.C86312j.m106911c(r4)
                zz.i r7 = (p287zz.C79445i) r7
                java.lang.String r2 = r7.l50(r2, r15)
                goto L_0x0159
            L_0x014f:
                di3.d r7 = di3.C86312j.m106911c(r4)
                zz.i r7 = (p287zz.C79445i) r7
                java.lang.String r2 = r7.mo109183JQ(r2, r15)
            L_0x0159:
                di3.d r4 = di3.C86312j.m106911c(r4)
                zz.i r4 = (p287zz.C79445i) r4
                java.lang.String r1 = r4.mo109195vJ(r2, r1)
                android.app.Activity r2 = r29.mo91565f()
                r4 = 2131823516(0x7f110b9c, float:1.9279834E38)
                r7 = 1
                java.lang.Object[] r11 = new java.lang.Object[r7]
                r7 = 0
                r11[r7] = r1
                java.lang.String r1 = r2.getString(r4, r11)
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r2.append(r1)
                r4 = 2
                if (r14 == r4) goto L_0x01b1
                java.lang.String r4 = r6.f195493H0
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
                if (r4 != 0) goto L_0x01b1
                java.lang.String r4 = r6.f195493H0
                r2.append(r4)
                di3.d r3 = di3.C86312j.m106911c(r3)
                r19 = r3
                zz.f r19 = (p287zz.C79442f) r19
                android.app.Activity r20 = r29.mo91565f()
                r21 = 0
                r22 = 0
                r23 = -1
                r24 = 0
                r25 = 0
                android.text.style.TextAppearanceSpan r3 = r19.n20(r20, r21, r22, r23, r24, r25)
                int r1 = r1.length()
                int r4 = r2.length()
                r2.setSpan(r3, r1, r4, r10)
            L_0x01b1:
                android.widget.TextView r1 = r5.f165291d
                r1.setText(r2)
                goto L_0x0238
            L_0x01b8:
                di3.d r2 = di3.C86312j.m106911c(r2)
                d62.i r2 = (d62.C75339i) r2
                java.lang.String r2 = r2.mo62519pb(r13, r7)
                di3.d r7 = di3.C86312j.m106911c(r4)
                zz.i r7 = (p287zz.C79445i) r7
                java.lang.String r2 = r7.l50(r2, r13)
                di3.d r4 = di3.C86312j.m106911c(r4)
                zz.i r4 = (p287zz.C79445i) r4
                java.lang.String r1 = r4.mo109195vJ(r2, r1)
                r2 = 2
                if (r14 == r2) goto L_0x0222
                android.app.Activity r2 = r29.mo91565f()
                r4 = 2131823518(0x7f110b9e, float:1.9279838E38)
                r7 = 1
                java.lang.Object[] r11 = new java.lang.Object[r7]
                r7 = 0
                r11[r7] = r1
                java.lang.String r1 = r2.getString(r4, r11)
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r4 = r6.f195493H0
                r2.append(r4)
                di3.d r3 = di3.C86312j.m106911c(r3)
                r19 = r3
                zz.f r19 = (p287zz.C79442f) r19
                android.app.Activity r20 = r29.mo91565f()
                r21 = 0
                r22 = 0
                r23 = -1
                r24 = 0
                r25 = 0
                android.text.style.TextAppearanceSpan r3 = r19.n20(r20, r21, r22, r23, r24, r25)
                int r1 = r1.length()
                int r4 = r2.length()
                r2.setSpan(r3, r1, r4, r10)
                android.widget.TextView r1 = r5.f165291d
                r1.setText(r2)
                goto L_0x0238
            L_0x0222:
                android.app.Activity r2 = r29.mo91565f()
                r3 = 2131823515(0x7f110b9b, float:1.9279832E38)
                r4 = 1
                java.lang.Object[] r7 = new java.lang.Object[r4]
                r4 = 0
                r7[r4] = r1
                java.lang.String r1 = r2.getString(r3, r7)
                android.widget.TextView r2 = r5.f165291d
                r2.setText(r1)
            L_0x0238:
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b r1 = r8.f154910e
                int r1 = r1.f154912a
                if (r1 > 0) goto L_0x0240
                int r1 = r6.f195489G0
            L_0x0240:
                android.widget.TextView r2 = r5.f165290c
                r3 = 0
                r2.setCompoundDrawables(r3, r3, r3, r3)
                r2 = 2131755310(0x7f10012e, float:1.9141496E38)
                r3 = 2131755308(0x7f10012c, float:1.9141492E38)
                r4 = 2131755311(0x7f10012f, float:1.9141498E38)
                switch(r1) {
                    case 1: goto L_0x0342;
                    case 2: goto L_0x02cf;
                    case 3: goto L_0x02b2;
                    case 4: goto L_0x0295;
                    case 5: goto L_0x0278;
                    case 6: goto L_0x0266;
                    case 7: goto L_0x0342;
                    case 8: goto L_0x02b2;
                    case 9: goto L_0x0295;
                    case 10: goto L_0x02cf;
                    case 11: goto L_0x0266;
                    default: goto L_0x0252;
                }
            L_0x0252:
                switch(r1) {
                    case 21: goto L_0x0342;
                    case 22: goto L_0x02cf;
                    case 23: goto L_0x02b2;
                    case 24: goto L_0x0295;
                    case 25: goto L_0x0278;
                    case 26: goto L_0x0266;
                    case 27: goto L_0x0342;
                    default: goto L_0x0255;
                }
            L_0x0255:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r2)
                android.widget.TextView r1 = r5.f165291d
                java.lang.String r2 = r6.f195574g
                r1.setText(r2)
                r0.mo82211q0(r5)
                goto L_0x03e2
            L_0x0266:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823496(0x7f110b88, float:1.9279793E38)
                r1.setText(r2)
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r3)
                r0.mo82210p0(r5)
                goto L_0x03e2
            L_0x0278:
                if (r9 == 0) goto L_0x0283
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823501(0x7f110b8d, float:1.9279803E38)
                r1.setText(r2)
                goto L_0x028b
            L_0x0283:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823502(0x7f110b8e, float:1.9279805E38)
                r1.setText(r2)
            L_0x028b:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r4)
                r0.mo82210p0(r5)
                goto L_0x03e2
            L_0x0295:
                if (r9 == 0) goto L_0x02a0
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823508(0x7f110b94, float:1.9279818E38)
                r1.setText(r2)
                goto L_0x02a8
            L_0x02a0:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823512(0x7f110b98, float:1.9279826E38)
                r1.setText(r2)
            L_0x02a8:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r3)
                r0.mo82210p0(r5)
                goto L_0x03e2
            L_0x02b2:
                if (r9 == 0) goto L_0x02bd
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823506(0x7f110b92, float:1.9279814E38)
                r1.setText(r2)
                goto L_0x02c5
            L_0x02bd:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823510(0x7f110b96, float:1.9279822E38)
                r1.setText(r2)
            L_0x02c5:
                android.widget.ImageView r1 = r5.f165289b
                r1.setImageResource(r4)
                r0.mo82210p0(r5)
                goto L_0x03e2
            L_0x02cf:
                android.widget.TextView r1 = r5.f165290c
                r2 = 2131823525(0x7f110ba5, float:1.9279852E38)
                r1.setText(r2)
                android.widget.ImageView r1 = r5.f165289b
                r2 = 2131755309(0x7f10012d, float:1.9141494E38)
                r1.setImageResource(r2)
                android.view.View r1 = r5.clickArea
                r2 = 2131231439(0x7f0802cf, float:1.807896E38)
                r1.setBackgroundResource(r2)
                android.view.View r1 = r5.clickArea
                r2 = 0
                r1.setPadding(r2, r2, r2, r2)
                android.view.View r1 = r5.f165292e
                if (r1 == 0) goto L_0x03e2
                boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
                if (r1 == 0) goto L_0x0314
                android.widget.ImageView r1 = r5.f165289b
                r2 = 1050253722(0x3e99999a, float:0.3)
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165290c
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165291d
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165294g
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165295h
                r1.setAlpha(r2)
                goto L_0x0332
            L_0x0314:
                android.widget.ImageView r1 = r5.f165289b
                r2 = 1065353216(0x3f800000, float:1.0)
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165290c
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165291d
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165294g
                r2 = 1061997773(0x3f4ccccd, float:0.8)
                r1.setAlpha(r2)
                android.widget.TextView r1 = r5.f165295h
                r1.setAlpha(r2)
            L_0x0332:
                android.view.View r1 = r5.f165292e
                r2 = 2131101688(0x7f0607f8, float:1.7815793E38)
                r1.setBackgroundResource(r2)
                android.widget.ImageView r1 = r5.f165293f
                r2 = 0
                r1.setVisibility(r2)
                goto L_0x03e2
            L_0x0342:
                int r1 = r12.f157426b
                r3 = 2131823505(0x7f110b91, float:1.9279812E38)
                if (r1 != 0) goto L_0x0389
                java.lang.String r1 = r6.f195532T1
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x036c
                r1 = 2
                if (r14 == r1) goto L_0x036c
                android.widget.TextView r1 = r5.f165290c
                java.lang.Class<ny.h> r3 = p629ny.C76979h.class
                di3.d r3 = di3.C86312j.m106911c(r3)
                ny.h r3 = (p629ny.C76979h) r3
                android.app.Activity r7 = r29.mo91565f()
                java.lang.String r6 = r6.f195532T1
                android.text.SpannableString r3 = r3.mo107057T1(r7, r6)
                r1.setText(r3)
                goto L_0x03c5
            L_0x036c:
                if (r14 != 0) goto L_0x0377
                android.widget.TextView r1 = r5.f165290c
                r3 = 2131823511(0x7f110b97, float:1.9279824E38)
                r1.setText(r3)
                goto L_0x03c5
            L_0x0377:
                r1 = 1
                if (r14 != r1) goto L_0x0383
                android.widget.TextView r1 = r5.f165290c
                r3 = 2131823507(0x7f110b93, float:1.9279816E38)
                r1.setText(r3)
                goto L_0x03c5
            L_0x0383:
                android.widget.TextView r1 = r5.f165290c
                r1.setText(r3)
                goto L_0x03c5
            L_0x0389:
                r1 = 1
                if (r14 == 0) goto L_0x0395
                if (r14 != r1) goto L_0x038f
                goto L_0x0395
            L_0x038f:
                android.widget.TextView r1 = r5.f165290c
                r1.setText(r3)
                goto L_0x03c5
            L_0x0395:
                android.widget.TextView r1 = r5.f165290c
                r3 = 2131823504(0x7f110b90, float:1.927981E38)
                r1.setText(r3)
                android.content.res.Resources r1 = r29.mo91572m()
                r3 = 2131756894(0x7f10075e, float:1.9144708E38)
                r6 = 0
                android.graphics.drawable.Drawable r1 = hi3.C87515a.m108835e(r1, r3, r6)
                android.app.Activity r3 = r29.mo91565f()
                r6 = 16
                int r3 = kg3.C76577a.m92151b(r3, r6)
                android.app.Activity r7 = r29.mo91565f()
                int r6 = kg3.C76577a.m92151b(r7, r6)
                r7 = 0
                r1.setBounds(r7, r7, r3, r6)
                android.widget.TextView r3 = r5.f165290c
                r6 = 0
                r3.setCompoundDrawables(r1, r6, r6, r6)
            L_0x03c5:
                r1 = 2
                if (r14 != r1) goto L_0x03ce
                android.widget.ImageView r2 = r5.f165289b
                r2.setImageResource(r4)
                goto L_0x03d3
            L_0x03ce:
                android.widget.ImageView r3 = r5.f165289b
                r3.setImageResource(r2)
            L_0x03d3:
                if (r14 != r1) goto L_0x03df
                com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent$b r1 = r8.f154910e
                boolean r1 = r1.f154914c
                if (r1 == 0) goto L_0x03df
                r0.mo82210p0(r5)
                goto L_0x03e2
            L_0x03df:
                r0.mo82211q0(r5)
            L_0x03e2:
                android.view.View r1 = r5.clickArea
                r2 = r29
                com.tencent.mm.ui.chatting.viewitems.i$f r3 = r0.mo103099u(r2)
                r1.setOnClickListener(r3)
                android.view.View r1 = r5.clickArea
                com.tencent.mm.ui.chatting.viewitems.i$e r3 = r0.mo103098p(r2)
                r1.setOnLongClickListener(r3)
                android.view.View r1 = r5.clickArea
                java.lang.Class<zj3.l> r3 = zj3.C79368l.class
                com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
                xi.d r2 = r2.mo102812a(r3)
                zj3.l r2 = (zj3.C79368l) r2
                com.tencent.mm.ui.chatting.h2 r2 = r2.mo108189Z4()
                r1.setOnTouchListener(r2)
                com.tencent.mm.ui.chatting.viewitems.t8 r1 = new com.tencent.mm.ui.chatting.viewitems.t8
                ck3.b r2 = r0.f165298v
                boolean r2 = r2.mo91583x()
                r3 = r30
                r4 = 0
                r1.<init>(r3, r2, r5, r4)
                android.view.View r2 = r5.clickArea
                r2.setTag(r1)
            L_0x041c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C57749f3.C57753c.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 419430449;
        }

        /* renamed from: p0 */
        public final void mo82210p0(C57751a aVar) {
            aVar.clickArea.getPaddingLeft();
            aVar.clickArea.getPaddingTop();
            aVar.clickArea.getPaddingRight();
            aVar.clickArea.getPaddingBottom();
            aVar.clickArea.setBackgroundResource(C0966R.C0969drawable.f4674jo);
            aVar.clickArea.setPadding(0, 0, 0, 0);
            if (aVar.f165292e != null) {
                if (C85875k4.m106211z()) {
                    aVar.f165289b.setAlpha(0.3f);
                    aVar.f165290c.setAlpha(0.3f);
                    aVar.f165291d.setAlpha(0.3f);
                    aVar.f165294g.setAlpha(0.3f);
                    aVar.f165295h.setAlpha(0.3f);
                } else {
                    aVar.f165289b.setAlpha(1.0f);
                    aVar.f165290c.setAlpha(1.0f);
                    aVar.f165291d.setAlpha(1.0f);
                    aVar.f165294g.setAlpha(0.8f);
                    aVar.f165295h.setAlpha(0.8f);
                }
                aVar.f165292e.setBackgroundResource(C0966R.color.ahf);
                aVar.f165293f.setVisibility(0);
            }
        }

        /* renamed from: q0 */
        public final void mo82211q0(C57751a aVar) {
            if (aVar.f165292e != null) {
                if (C85875k4.m106211z()) {
                    aVar.f165289b.setAlpha(0.8f);
                    aVar.f165290c.setAlpha(0.8f);
                    aVar.f165291d.setAlpha(0.8f);
                    aVar.f165294g.setAlpha(0.5f);
                    aVar.f165295h.setAlpha(0.5f);
                } else {
                    aVar.f165289b.setAlpha(1.0f);
                    aVar.f165290c.setAlpha(1.0f);
                    aVar.f165291d.setAlpha(1.0f);
                    aVar.f165294g.setAlpha(0.8f);
                    aVar.f165295h.setAlpha(0.8f);
                }
                aVar.f165292e.setBackgroundResource(C0966R.color.ahf);
                aVar.f165293f.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public static C72963f4.C72966d m66598a(C72963f4 f4Var) {
        if (f4Var != null) {
            String content = f4Var.getContent();
            C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
            if (u != null) {
                WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new WalletQueryRemittanceStatusEvent();
                walletQueryRemittanceStatusEvent.f154909d.f154911a = u.f195501J0;
                walletQueryRemittanceStatusEvent.publish();
                return new C57750d(walletQueryRemittanceStatusEvent);
            }
        }
        return null;
    }
}
