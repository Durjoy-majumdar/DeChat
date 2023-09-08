package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct;
import com.tencent.p014mm.p136ui.chatting.C30838o2;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import h81.C32735h;
import i61.C98602h;
import ky2.C10432i;
import nj3.C76874e0;
import z51.C39315g;
import zg3.C79330c;
import zj3.C79381s;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z5 */
public class C74327z5 extends C74023i implements C73774p2 {

    /* renamed from: v */
    public C67391b f218341v;

    /* renamed from: w */
    public C30838o2 f218342w;

    /* renamed from: x */
    public C73935b6 f218343x;

    /* renamed from: y */
    public C73926a6 f218344y;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6957tc);
        C73946c6 c6Var = new C73946c6();
        c6Var.mo103019a(n4Var, false);
        n4Var.setTag(c6Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return ((C79381s) bVar.f193278b.mo102812a(C79381s.class)).mo102174F0(menuItem, bVar, f4Var);
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        String str;
        String str2;
        C72963f4 f4Var2 = f4Var;
        Class cls = C39315g.class;
        if (!f4Var.mo100973L3() || !C97625j3.m125812b().mo105883I()) {
            return true;
        }
        int b = ((C74243t8) view.getTag()).mo103252b();
        EmojiInfo G = ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(f4Var.mo108765s2());
        if (G == null) {
            Log.m105929w("MicroMsg.emoji.ChattingItemEmojiTo", "emoji is null. md5:%s", f4Var.mo108765s2());
            return true;
        }
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        boolean C1 = G.mo62633C1();
        int i = G.field_catalog;
        IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
        if (i == 81 || G.mo62637I0() || G.field_groupId.equalsIgnoreCase("com.tencent.xin.emoticon.tuzki2")) {
            str = "com.tencent.xin.emoticon.tuzki2";
            str2 = "emoji file no exist. cannot save or resend.";
        } else if (C1) {
            str = "com.tencent.xin.emoticon.tuzki2";
            str2 = "emoji file no exist. cannot save or resend.";
            e0Var.mo107136c(b, 104, 0, view.getContext().getString(C0966R.string.b_e), C0966R.raw.icons_filled_addsticker);
        } else {
            str = "com.tencent.xin.emoticon.tuzki2";
            str2 = "emoji file no exist. cannot save or resend.";
            Log.m105924i("MicroMsg.emoji.ChattingItemEmojiTo", str2);
        }
        if (!G.mo62637I0()) {
            if (C1) {
                e0Var.mo107136c(b, 113, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            } else {
                Log.m105924i("MicroMsg.emoji.ChattingItemEmojiTo", str2);
            }
        }
        String r = this.f218341v.mo91577r();
        C87412m.m108594g(r, "chatId");
        C79330c.f232896a = System.currentTimeMillis();
        C79330c.f232897b = G;
        C79330c.f232898c = r;
        RelatedEmoticonActionStruct relatedEmoticonActionStruct = new RelatedEmoticonActionStruct();
        relatedEmoticonActionStruct.f265792d = C79330c.f232896a;
        relatedEmoticonActionStruct.f265793e = 1;
        relatedEmoticonActionStruct.mo126627u(G.field_groupId);
        relatedEmoticonActionStruct.mo126626t(G.getMd5());
        relatedEmoticonActionStruct.mo126625s(r);
        relatedEmoticonActionStruct.mo86054n();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo175912v(1257, 1);
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_similar_emoji, true);
        if (!e && !G.mo62678k() && (view.getContext() instanceof Activity) && view.getContext().getResources().getConfiguration().orientation == 1 && wf) {
            Log.m105924i("MicroMsg.emoji.ChattingItemEmojiTo", "menu add similar emoji item.");
            e0Var.mo107136c(b, 115, 0, view.getContext().getString(C0966R.string.b_h), C0966R.raw.icons_filled_othersticker);
        }
        if (((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137994B(G)) {
            e0Var.mo107136c(b, 135, 0, view.getContext().getString(C0966R.string.b_4), C0966R.raw.icons_filled_makesticker);
        }
        if (!e) {
            String str3 = G.field_groupId;
            if ((!Util.isNullOrNil(str3) && !Util.isEqual(str3, "capture")) && !G.mo62678k() && !G.field_groupId.equalsIgnoreCase(str)) {
                e0Var.mo107136c(b, 128, 0, view.getContext().getString(C0966R.string.b_g), C0966R.raw.icons_filled_sticker_album);
            }
        }
        if (!f4Var.mo100967F3() && f4Var.mo100973L3() && ((f4Var.mo101000j3() || f4Var2.f230728K == 1) && mo103083Q(f4Var2, this.f218341v) && mo103081O(f4Var.mo108768t()))) {
            e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
        }
        if (!this.f218341v.mo91584y()) {
            e0Var.mo107136c(b, 100, 0, view.getContext().getString(C0966R.string.b9z), C0966R.raw.icons_filled_delete);
        }
        if (f4Var.getStatus() == 5) {
            e0Var.mo107136c(b, 103, 0, view.getContext().getString(C0966R.string.f360269bb2), C0966R.raw.icons_filled_refresh);
        }
        nVar.mo160131h(12789, 0, G.getMd5(), 0, G.field_designerID, G.field_groupId, "", "", "", "", "", G.field_activityid);
        return true;
    }

    /* renamed from: a */
    public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        f4Var.unsetOmittedFailResend();
        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(f4Var.getMsgId(), f4Var);
        ((C79381s) bVar.f193278b.mo102812a(C79381s.class)).mo102175w1(f4Var);
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x035f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26237f(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r31, ck3.C67391b r32, com.tencent.p014mm.storage.C72963f4 r33, java.lang.String r34) {
        /*
            r30 = this;
            r7 = r30
            r5 = r32
            r2 = r33
            java.lang.Class<zj3.l> r0 = zj3.C79368l.class
            java.lang.Class<z51.g> r1 = z51.C39315g.class
            r7.f218341v = r5
            r3 = r31
            com.tencent.mm.ui.chatting.viewitems.c6 r3 = (com.tencent.p014mm.p136ui.chatting.viewitems.C73946c6) r3
            di3.d r4 = di3.C86312j.m106911c(r1)
            z51.g r4 = (z51.C39315g) r4
            zc3.a r4 = r4.mo58035cm()
            java.lang.String r6 = r33.mo108765s2()
            i61.h r4 = (i61.C98602h) r4
            com.tencent.mm.storage.emotion.EmojiInfo r4 = r4.mo137999G(r6)
            if (r4 == 0) goto L_0x02bb
            java.lang.String r6 = r33.getContent()
            com.tencent.mm.storage.o2 r15 = new com.tencent.mm.storage.o2
            r15.<init>(r6)
            java.lang.String r6 = r33.mo108768t()
            r4.f284125Q1 = r6
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView r8 = r3.f217033b
            long r10 = r33.getMsgId()
            boolean r6 = r4.mo62678k()
            r14 = 1
            r13 = 0
            if (r6 == 0) goto L_0x004f
            long r16 = r33.getMsgId()
            boolean r6 = bp3.C67301m.m79638c(r16)
            if (r6 == 0) goto L_0x004f
            r12 = 1
            goto L_0x0050
        L_0x004f:
            r12 = 0
        L_0x0050:
            r9 = r4
            r6 = 0
            r13 = r15
            r8.mo135109b(r9, r10, r12, r13)
            android.view.ViewStub r8 = r3.f217035d
            r13 = 8
            if (r8 == 0) goto L_0x0141
            boolean r9 = r15.f212822e
            if (r9 == 0) goto L_0x0139
            r8.setVisibility(r6)
            android.view.View r8 = r3.convertView
            r9 = 2131299403(0x7f090c4b, float:1.8216806E38)
            android.view.View r8 = r8.findViewById(r9)
            r10 = 2131299204(0x7f090b84, float:1.8216403E38)
            android.view.View r8 = r8.findViewById(r10)
            r12 = r8
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.content.res.Resources r8 = r32.mo91572m()
            r10 = 2131824881(0x7f1110f1, float:1.9282602E38)
            java.lang.String r8 = r8.getString(r10)
            android.text.Spanned r8 = android.text.Html.fromHtml(r8)
            r12.setText(r8)
            android.view.View r8 = r3.convertView
            android.view.View r8 = r8.findViewById(r9)
            r9 = 2131299203(0x7f090b83, float:1.82164E38)
            android.view.View r8 = r8.findViewById(r9)
            r11 = r8
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            com.tencent.mm.ui.chatting.viewitems.t8 r10 = new com.tencent.mm.ui.chatting.viewitems.t8
            r16 = 0
            java.lang.String r17 = r32.mo91573n()
            r18 = 0
            java.lang.String r9 = r4.field_groupId
            r20 = 1
            r21 = 0
            java.lang.String r19 = ""
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            java.lang.String r24 = ""
            java.lang.String r25 = ""
            r8 = r10
            r26 = r9
            r9 = r33
            r6 = r10
            r10 = r16
            r27 = r11
            r11 = r3
            r28 = r12
            r12 = r17
            r13 = r18
            r14 = r19
            r29 = r15
            r15 = r22
            r16 = r23
            r17 = r24
            r18 = r26
            r19 = r25
            r8.<init>((com.tencent.p014mm.storage.C72963f4) r9, (boolean) r10, (uj3.C78208e) r11, (java.lang.String) r12, (boolean) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (boolean) r20, (boolean) r21)
            r8 = r28
            r8.setTag(r6)
            com.tencent.mm.ui.chatting.l2 r6 = r7.mo103096n(r5)
            r8.setOnClickListener(r6)
            di3.d r6 = di3.C86312j.m106911c(r1)
            z51.g r6 = (z51.C39315g) r6
            zc3.a r6 = r6.mo58035cm()
            i61.h r6 = (i61.C98602h) r6
            r6.getClass()
            java.lang.Class<lc3.b> r6 = lc3.C10485b.class
            k40.a r6 = f40.C86709a0.m107533q(r6)
            lc3.b r6 = (lc3.C10485b) r6
            pj.f r6 = r6.vh0()
            java.lang.String r8 = "EmotionRewardOption"
            r9 = 0
            int r6 = r6.mo107404b(r8, r9)
            r8 = 4
            r6 = r6 & r8
            if (r6 != r8) goto L_0x0108
            r14 = 1
            goto L_0x0109
        L_0x0108:
            r14 = 0
        L_0x0109:
            if (r14 == 0) goto L_0x0131
            r8 = r27
            r8.setVisibility(r9)
            com.tencent.mm.ui.chatting.viewitems.t8 r6 = new com.tencent.mm.ui.chatting.viewitems.t8
            boolean r9 = r32.mo91583x()
            java.lang.String r10 = r32.mo91573n()
            r6.<init>(r2, r9, r3, r10)
            r8.setTag(r6)
            com.tencent.mm.ui.chatting.o2 r6 = r7.f218342w
            if (r6 != 0) goto L_0x012b
            com.tencent.mm.ui.chatting.o2 r6 = new com.tencent.mm.ui.chatting.o2
            r6.<init>(r5)
            r7.f218342w = r6
        L_0x012b:
            com.tencent.mm.ui.chatting.o2 r6 = r7.f218342w
            r8.setOnClickListener(r6)
            goto L_0x0143
        L_0x0131:
            r8 = r27
            r6 = 8
            r8.setVisibility(r6)
            goto L_0x0145
        L_0x0139:
            r29 = r15
            r6 = 8
            r8.setVisibility(r6)
            goto L_0x0145
        L_0x0141:
            r29 = r15
        L_0x0143:
            r6 = 8
        L_0x0145:
            boolean r8 = r4.mo62678k()
            if (r8 == 0) goto L_0x01cf
            r8 = r29
            boolean r9 = r8.f212820c
            if (r9 != 0) goto L_0x01cf
            r9 = 1
            r8.f212820c = r9
            java.lang.String r8 = r8.mo101198e()
            r2.mo108732L2(r8)
            eb0.c r8 = eb0.C97625j3.m125812b()
            g62.l r8 = r8.mo105911z()
            long r10 = r33.getMsgId()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            com.tencent.mm.storage.f4 r8 = r8.b00(r10)
            int r8 = r8.getStatus()
            r2.mo100991d(r8)
            eb0.c r8 = eb0.C97625j3.m125812b()
            g62.l r8 = r8.mo105911z()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            r8.getClass()
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r11 = r33.getContent()
            java.lang.String r12 = "content"
            r10.put(r12, r11)
            int r11 = r33.getStatus()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "status"
            r10.put(r12, r11)
            zh3.f r11 = r8.f212775p
            long r12 = r33.getMsgId()
            java.lang.String r12 = r8.gy0(r12)
            java.lang.String[] r13 = new java.lang.String[r9]
            long r14 = r33.getMsgId()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r15 = 0
            r13[r15] = r14
            java.lang.String r14 = "msgId=?"
            int r10 = r11.update(r12, r10, r14, r13)
            if (r10 == 0) goto L_0x01d0
            r8.doNotify()
            g62.l$e r10 = new g62.l$e
            java.lang.String r11 = r33.mo108768t()
            java.lang.String r12 = "update"
            r10.<init>(r11, r12, r2, r15)
            r8.mo101123jo(r10)
            goto L_0x01d0
        L_0x01cf:
            r9 = 1
        L_0x01d0:
            boolean r8 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
            r10 = 2
            if (r8 == 0) goto L_0x0204
            r8 = 0
            r7.mo103093i0(r3, r8, r9)
            int r8 = r33.getStatus()
            if (r8 != r10) goto L_0x01fc
            com.tencent.mm.ui.chatting.manager.a r8 = r5.f193278b
            xi.d r8 = r8.mo102812a(r0)
            zj3.l r8 = (zj3.C79368l) r8
            long r9 = r33.getMsgId()
            boolean r8 = r7.mo103080N(r8, r9)
            if (r8 == 0) goto L_0x01fc
            android.widget.ImageView r8 = r3.f217034c
            if (r8 == 0) goto L_0x0217
            r9 = 0
            r8.setVisibility(r9)
            goto L_0x0217
        L_0x01fc:
            android.widget.ImageView r8 = r3.f217034c
            if (r8 == 0) goto L_0x0217
            r8.setVisibility(r6)
            goto L_0x0217
        L_0x0204:
            android.widget.ImageView r8 = r3.f217034c
            if (r8 == 0) goto L_0x020b
            r8.setVisibility(r6)
        L_0x020b:
            int r8 = r33.getStatus()
            if (r8 >= r10) goto L_0x0213
            r14 = 1
            goto L_0x0214
        L_0x0213:
            r14 = 0
        L_0x0214:
            r7.mo103093i0(r3, r14, r9)
        L_0x0217:
            boolean r8 = u61.C101964h.m134233o(r4)
            if (r8 == 0) goto L_0x0275
            android.view.View r6 = r3.f217036e
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r8.mo10233c(r10)
            java.lang.Object[] r10 = r8.mo10232b()
            java.lang.String r11 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiTo"
            java.lang.String r12 = "filling"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r6
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r9 = 0
            java.lang.Object r8 = r8.mo10231a(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r10 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiTo"
            java.lang.String r11 = "filling"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r9 = r6
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            android.view.View r6 = r3.f217036e
            com.tencent.mm.ui.chatting.viewitems.a6 r8 = r7.f218344y
            if (r8 != 0) goto L_0x026f
            com.tencent.mm.ui.chatting.viewitems.a6 r8 = new com.tencent.mm.ui.chatting.viewitems.a6
            ck3.b r9 = r7.f218341v
            r8.<init>(r9)
            r7.f218344y = r8
        L_0x026f:
            com.tencent.mm.ui.chatting.viewitems.a6 r8 = r7.f218344y
            r6.setOnClickListener(r8)
            goto L_0x02bb
        L_0x0275:
            android.view.View r8 = r3.f217036e
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r15.mo10233c(r6)
            java.lang.Object[] r10 = r15.mo10232b()
            java.lang.String r11 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiTo"
            java.lang.String r12 = "filling"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r8
            r34 = r0
            r0 = r15
            r15 = r6
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r6 = 0
            java.lang.Object r0 = r0.mo10231a(r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r10 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$ChattingItemEmojiTo"
            java.lang.String r11 = "filling"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x02bd
        L_0x02bb:
            r34 = r0
        L_0x02bd:
            java.lang.String r0 = ""
            if (r4 == 0) goto L_0x0328
            boolean r6 = r4.mo62678k()
            if (r6 == 0) goto L_0x0328
            java.lang.String r1 = r4.field_name
            java.lang.String r6 = "jsb_j"
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x02df
            ck3.b r0 = r7.f218341v
            android.app.Activity r0 = r0.mo91565f()
            r1 = 2131824927(0x7f11111f, float:1.9282696E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0342
        L_0x02df:
            java.lang.String r1 = r4.field_name
            java.lang.String r6 = "jsb_s"
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x02f7
            ck3.b r0 = r7.f218341v
            android.app.Activity r0 = r0.mo91565f()
            r1 = 2131824928(0x7f111120, float:1.9282698E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0342
        L_0x02f7:
            java.lang.String r1 = r4.field_name
            java.lang.String r6 = "jsb_b"
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x030f
            ck3.b r0 = r7.f218341v
            android.app.Activity r0 = r0.mo91565f()
            r1 = 2131824926(0x7f11111e, float:1.9282694E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0342
        L_0x030f:
            java.lang.String r1 = r4.field_name
            java.lang.String r6 = "dice"
            boolean r1 = r1.startsWith(r6)
            if (r1 == 0) goto L_0x0342
            java.lang.String r1 = r4.field_name
            java.lang.String r4 = "dice_"
            java.lang.String r1 = r1.replace(r4, r0)
            java.lang.String r4 = ".png"
            java.lang.String r0 = r1.replace(r4, r0)
            goto L_0x0342
        L_0x0328:
            if (r4 == 0) goto L_0x0342
            di3.d r1 = di3.C86312j.m106911c(r1)
            z51.g r1 = (z51.C39315g) r1
            zc3.a r1 = r1.mo58035cm()
            java.lang.String r4 = r4.getMd5()
            i61.h r1 = (i61.C98602h) r1
            java.lang.String r1 = r1.mo138012T(r4)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r0)
        L_0x0342:
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView r1 = r3.f217033b
            r1.setContentDescription(r0)
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView r0 = r3.f217033b
            com.tencent.mm.ui.chatting.viewitems.t8 r1 = new com.tencent.mm.ui.chatting.viewitems.t8
            boolean r4 = r32.mo91583x()
            java.lang.String r6 = r32.mo91573n()
            r1.<init>(r2, r4, r3, r6)
            r0.setTag(r1)
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView r0 = r3.f217033b
            com.tencent.mm.ui.chatting.viewitems.b6 r1 = r7.f218343x
            if (r1 != 0) goto L_0x0366
            com.tencent.mm.ui.chatting.viewitems.b6 r1 = new com.tencent.mm.ui.chatting.viewitems.b6
            r1.<init>(r5)
            r7.f218343x = r1
        L_0x0366:
            com.tencent.mm.ui.chatting.viewitems.b6 r1 = r7.f218343x
            r0.setOnClickListener(r1)
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView r0 = r3.f217033b
            com.tencent.mm.ui.chatting.viewitems.i$e r1 = r7.mo103098p(r5)
            r0.setOnLongClickListener(r1)
            com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView r0 = r3.f217033b
            com.tencent.mm.ui.chatting.manager.a r1 = r5.f193278b
            r4 = r34
            xi.d r1 = r1.mo102812a(r4)
            zj3.l r1 = (zj3.C79368l) r1
            com.tencent.mm.ui.chatting.h2 r1 = r1.mo108189Z4()
            r0.setOnTouchListener(r1)
            java.lang.String r4 = r32.mo91573n()
            boolean r6 = r32.mo91583x()
            r0 = r30
            r1 = r3
            r2 = r33
            r3 = r4
            r4 = r6
            r5 = r32
            r6 = r30
            r0.mo103087e0(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74327z5.mo26237f(com.tencent.mm.ui.chatting.viewitems.i$c, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 47;
    }
}
