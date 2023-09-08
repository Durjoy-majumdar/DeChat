package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import com.tencent.p014mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import di0.C86299o;
import di3.C86312j;
import eb0.C75604z3;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C46106g;
import ht1.C76243a5;
import kr0.C76630x0;
import nj3.C76874e0;
import te3.C49557gg1;
import wi0.C66117m;
import zj3.C66869c;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.w1 */
public final class C57800w1 {

    /* renamed from: a */
    public final boolean f165392a;

    /* renamed from: b */
    public C67391b f165393b;

    public C57800w1(boolean z) {
        this.f165392a = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0260  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82225a(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i r28, com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder r29, uj3.C78208e r30, ck3.C67391b r31, com.tencent.p014mm.storage.C72963f4 r32, java.lang.String r33) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            r4 = r32
            java.lang.Class<pl1.s0> r5 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            java.lang.Class<zj3.l> r7 = zj3.C79368l.class
            java.lang.Class<ht1.g> r8 = ht1.C46106g.class
            java.lang.String r9 = "chattingItem"
            gy3.C87412m.m108594g(r1, r9)
            java.lang.String r9 = "ui"
            gy3.C87412m.m108594g(r3, r9)
            java.lang.String r9 = "msg"
            gy3.C87412m.m108594g(r4, r9)
            r0.f165393b = r3
            java.lang.String r9 = "MicroMsg.ChattingItemAppMsgFinderOrder"
            if (r2 != 0) goto L_0x002e
            java.lang.String r1 = "filling not AppMsgFinderProductHolder"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            return
        L_0x002e:
            android.view.View r10 = r2.convertView
            if (r10 != 0) goto L_0x0033
            goto L_0x0042
        L_0x0033:
            java.lang.Class<zj3.c> r11 = zj3.C66869c.class
            com.tencent.mm.ui.chatting.manager.a r12 = r3.f193278b
            xi.d r11 = r12.mo102812a(r11)
            zj3.c r11 = (zj3.C66869c) r11
            if (r11 == 0) goto L_0x0042
            r11.mo26188V0(r3, r10, r4)
        L_0x0042:
            java.lang.String r10 = r32.getContent()
            if (r10 == 0) goto L_0x0051
            java.lang.String r12 = r32.mo108775z2()
            com.tencent.mm.message.l$b r10 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r10, r12)
            goto L_0x0052
        L_0x0051:
            r10 = 0
        L_0x0052:
            if (r10 == 0) goto L_0x005b
            com.tencent.mm.message.g r12 = r10.mo93555w(r8)
            ht1.g r12 = (ht1.C46106g) r12
            goto L_0x005c
        L_0x005b:
            r12 = 0
        L_0x005c:
            r13 = 2
            r14 = 8
            r11 = 0
            if (r12 == 0) goto L_0x0382
            com.tencent.mm.message.g r8 = r10.mo93555w(r8)
            ht1.g r8 = (ht1.C46106g) r8
            te3.gg1 r8 = r8.f124277b
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r10 != 0) goto L_0x0098
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r10 != 0) goto L_0x0098
            boolean r10 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r10 == 0) goto L_0x0077
            goto L_0x0098
        L_0x0077:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "products:"
            r10.append(r12)
            java.lang.String r12 = r8.f134032e
            r10.append(r12)
            java.lang.String r12 = ",price:"
            r10.append(r12)
            java.lang.String r12 = r8.f134034g
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            goto L_0x00b0
        L_0x0098:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "filling shareObject:"
            r10.append(r12)
            org.json.JSONObject r12 = o40.C61937h.m72709h(r8)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
        L_0x00b0:
            java.lang.String r9 = r8.f134032e
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x00b7
            r9 = r10
        L_0x00b7:
            int r12 = r8.f134033f
            int r16 = r9.length()
            if (r16 != 0) goto L_0x00c2
            r16 = 1
            goto L_0x00c4
        L_0x00c2:
            r16 = 0
        L_0x00c4:
            if (r16 == 0) goto L_0x00d3
            com.tencent.mm.ui.widget.MMNeat7extView r9 = r29.getTitleTv()
            if (r9 != 0) goto L_0x00ce
            goto L_0x01f4
        L_0x00ce:
            r9.setVisibility(r14)
            goto L_0x01f4
        L_0x00d3:
            android.app.Activity r16 = r31.mo91565f()
            android.content.res.Resources r14 = r16.getResources()
            java.lang.Object[] r15 = new java.lang.Object[r13]
            r15[r11] = r9
            java.lang.String r18 = java.lang.String.valueOf(r12)
            r16 = 1
            r15[r16] = r18
            r11 = 2131828412(0x7f111ebc, float:1.9289764E38)
            java.lang.String r11 = r14.getString(r11, r15)
            java.lang.String r14 = "ui.context.resources.get… productCount.toString())"
            gy3.C87412m.m108593f(r11, r14)
            com.tencent.mm.ui.widget.MMNeat7extView r14 = r29.getTitleTv()
            if (r14 == 0) goto L_0x0105
            android.app.Activity r15 = r31.mo91565f()
            android.text.SpannableString r11 = de3.C75370s.m90380f(r15, r11)
            r14.mo104279b(r11)
        L_0x0105:
            android.app.Activity r11 = r31.mo91565f()
            r14 = 232(0xe8, float:3.25E-43)
            int r11 = kg3.C76577a.m92151b(r11, r14)
            com.tencent.mm.ui.widget.MMNeat7extView r14 = r29.getTitleTv()
            if (r14 == 0) goto L_0x01f4
            r15 = 2147483647(0x7fffffff, float:NaN)
            yr3.a r11 = r14.mo154990i(r11, r15)
            r15 = r11
            com.tencent.neattextview.textview.layout.NeatLayout r15 = (com.tencent.neattextview.textview.layout.NeatLayout) r15
            r17 = r10
            int r10 = r15.f319992L
            if (r10 <= r13) goto L_0x01e8
            if (r12 < r13) goto L_0x0142
            android.app.Activity r10 = r31.mo91565f()
            android.content.res.Resources r10 = r10.getResources()
            r13 = 1
            java.lang.Object[] r0 = new java.lang.Object[r13]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r18 = 0
            r0[r18] = r12
            r12 = 2131828410(0x7f111eba, float:1.928976E38)
            java.lang.String r0 = r10.getString(r12, r0)
            goto L_0x015c
        L_0x0142:
            r13 = 1
            r18 = 0
            android.app.Activity r0 = r31.mo91565f()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.Object[] r10 = new java.lang.Object[r13]
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r10[r18] = r12
            r12 = 2131828411(0x7f111ebb, float:1.9289762E38)
            java.lang.String r0 = r0.getString(r12, r10)
        L_0x015c:
            java.lang.String r10 = "if (productCount >= 2) {…                        }"
            gy3.C87412m.m108593f(r0, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            r10.append(r0)
            java.lang.String r9 = r10.toString()
            int r10 = r15.f319992L
            r13 = 0
            r15 = 0
        L_0x0174:
            if (r13 >= r10) goto L_0x0184
            r12 = 1
            if (r13 <= r12) goto L_0x0181
            r12 = r11
            yr3.c r12 = (yr3.C112481c) r12
            float r12 = r12.mo109134r0(r13)
            float r15 = r15 + r12
        L_0x0181:
            int r13 = r13 + 1
            goto L_0x0174
        L_0x0184:
            float r10 = r14.getTextSize()
            r11 = 0
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x01dd
            int r10 = r9.length()
            int r12 = r0.length()
            int r10 = r10 - r12
            r12 = 1
            int r10 = r10 - r12
            r11 = 0
            r12 = 0
        L_0x019a:
            r13 = -1
            if (r13 >= r10) goto L_0x01ba
            android.text.TextPaint r13 = r14.getPaint()
            char r19 = r9.charAt(r10)
            java.lang.String r4 = java.lang.String.valueOf(r19)
            float r4 = r13.measureText(r4)
            float r12 = r12 + r4
            int r11 = r11 + 1
            int r4 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x01b5
            goto L_0x01ba
        L_0x01b5:
            int r10 = r10 + -1
            r4 = r32
            goto L_0x019a
        L_0x01ba:
            r4 = 2
            int r11 = r11 + r4
            int r4 = r9.length()
            int r10 = r0.length()
            int r4 = r4 - r10
            int r4 = r4 - r11
            int r10 = r9.length()
            int r0 = r0.length()
            int r10 = r10 - r0
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = z04.C112550d0.m153781Q(r9, r4, r10, r0)
            java.lang.String r9 = r0.toString()
        L_0x01dd:
            android.app.Activity r0 = r31.mo91565f()
            android.text.SpannableString r0 = de3.C75370s.m90380f(r0, r9)
            r14.mo104279b(r0)
        L_0x01e8:
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r29.getTitleTv()
            if (r0 != 0) goto L_0x01ef
            goto L_0x01f6
        L_0x01ef:
            r4 = 0
            r0.setVisibility(r4)
            goto L_0x01f6
        L_0x01f4:
            r17 = r10
        L_0x01f6:
            android.widget.TextView r0 = r29.getStateTv()
            if (r0 == 0) goto L_0x0223
            java.lang.String r4 = r8.f134035h
            if (r4 == 0) goto L_0x0209
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0207
            goto L_0x0209
        L_0x0207:
            r4 = 0
            goto L_0x020a
        L_0x0209:
            r4 = 1
        L_0x020a:
            if (r4 == 0) goto L_0x0212
            r4 = 8
            r0.setVisibility(r4)
            goto L_0x0223
        L_0x0212:
            android.app.Activity r4 = r31.mo91565f()
            java.lang.String r9 = r8.f134035h
            android.text.SpannableString r4 = de3.C75370s.m90380f(r4, r9)
            r0.setText(r4)
            r4 = 0
            r0.setVisibility(r4)
        L_0x0223:
            android.widget.TextView r0 = r29.getDescTv()
            if (r0 == 0) goto L_0x0250
            java.lang.String r4 = r8.f134034g
            if (r4 == 0) goto L_0x0236
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0234
            goto L_0x0236
        L_0x0234:
            r4 = 0
            goto L_0x0237
        L_0x0236:
            r4 = 1
        L_0x0237:
            if (r4 == 0) goto L_0x023f
            r4 = 8
            r0.setVisibility(r4)
            goto L_0x0250
        L_0x023f:
            android.app.Activity r4 = r31.mo91565f()
            java.lang.String r9 = r8.f134034g
            android.text.SpannableString r4 = de3.C75370s.m90380f(r4, r9)
            r0.setText(r4)
            r4 = 0
            r0.setVisibility(r4)
        L_0x0250:
            java.lang.String r0 = r8.f134034g
            if (r0 == 0) goto L_0x025d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x025b
            goto L_0x025d
        L_0x025b:
            r0 = 0
            goto L_0x025e
        L_0x025d:
            r0 = 1
        L_0x025e:
            if (r0 != 0) goto L_0x02bd
            java.lang.String r0 = r8.f134035h
            if (r0 == 0) goto L_0x026d
            int r0 = r0.length()
            if (r0 != 0) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r0 = 0
            goto L_0x026e
        L_0x026d:
            r0 = 1
        L_0x026e:
            if (r0 == 0) goto L_0x0271
            goto L_0x02bd
        L_0x0271:
            android.view.View r9 = r29.getDivider()
            if (r9 != 0) goto L_0x0279
            goto L_0x0308
        L_0x0279:
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r4 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r0.mo10233c(r10)
            java.lang.Object[] r20 = r0.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$FinderOrderDelegate"
            java.lang.String r22 = "filling"
            java.lang.String r23 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r9
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = 0
            java.lang.Object r0 = r0.mo10231a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9.setVisibility(r0)
            java.lang.String r10 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$FinderOrderDelegate"
            java.lang.String r11 = "filling"
            java.lang.String r12 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0308
        L_0x02bd:
            android.view.View r0 = r29.getDivider()
            if (r0 != 0) goto L_0x02c4
            goto L_0x0308
        L_0x02c4:
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            r9 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r4.mo10233c(r10)
            java.lang.Object[] r20 = r4.mo10232b()
            java.lang.String r21 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$FinderOrderDelegate"
            java.lang.String r22 = "filling"
            java.lang.String r23 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r0
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            r9 = 0
            java.lang.Object r4 = r4.mo10231a(r9)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setVisibility(r4)
            java.lang.String r20 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$FinderOrderDelegate"
            java.lang.String r21 = "filling"
            java.lang.String r22 = "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
        L_0x0308:
            android.widget.ImageView r0 = r29.getCoverIv()
            if (r0 == 0) goto L_0x0349
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62446e(r6)
            bl3.c r4 = r4.mo62447c(r5)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11870V()
            java.lang.Class<pl1.t0> r9 = pl1.C62368t0.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            pl1.t0 r9 = (pl1.C62368t0) r9
            java.lang.String r8 = r8.f134036i
            if (r8 != 0) goto L_0x032d
            r10 = r17
            goto L_0x032e
        L_0x032d:
            r10 = r8
        L_0x032e:
            up1.y r8 = up1.C27696y.THUMB_IMAGE
            pl1.g0 r8 = r9.mo87412UE(r10, r8)
            pl1.e0$a r9 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r r10 = bl3.C39818r.f106831a
            bl3.r$a r6 = r10.mo62446e(r6)
            bl3.c r5 = r6.mo62447c(r5)
            pl1.s0 r5 = (pl1.C11990s0) r5
            n60.f r5 = r5.mo11867O2(r9)
            r4.mo85957c(r8, r0, r5)
        L_0x0349:
            android.view.View r0 = r2.clickArea
            com.tencent.mm.ui.chatting.viewitems.i$f r4 = r1.mo103099u(r3)
            r0.setOnClickListener(r4)
            android.view.View r0 = r2.clickArea
            com.tencent.mm.ui.chatting.viewitems.i$e r4 = r1.mo103098p(r3)
            r0.setOnLongClickListener(r4)
            android.view.View r0 = r2.clickArea
            com.tencent.mm.ui.chatting.manager.a r4 = r3.f193278b
            xi.d r4 = r4.mo102812a(r7)
            zj3.l r4 = (zj3.C79368l) r4
            if (r4 == 0) goto L_0x036c
            com.tencent.mm.ui.chatting.h2 r4 = r4.mo108189Z4()
            goto L_0x036d
        L_0x036c:
            r4 = 0
        L_0x036d:
            r0.setOnTouchListener(r4)
            com.tencent.mm.ui.chatting.viewitems.t8 r0 = new com.tencent.mm.ui.chatting.viewitems.t8
            boolean r4 = r31.mo91583x()
            r5 = r32
            r6 = 0
            r0.<init>(r5, r4, r2, r6)
            android.view.View r4 = r2.clickArea
            r4.setTag(r0)
            goto L_0x0383
        L_0x0382:
            r5 = r4
        L_0x0383:
            r0 = r27
            boolean r4 = r0.f165392a
            if (r4 != 0) goto L_0x03d6
            boolean r4 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.m87878T()
            if (r4 == 0) goto L_0x03d6
            android.widget.ProgressBar r4 = r2.uploadingPB
            if (r4 == 0) goto L_0x0398
            r6 = 8
            r4.setVisibility(r6)
        L_0x0398:
            int r4 = r32.getStatus()
            r6 = 2
            if (r4 != r6) goto L_0x03c3
            com.tencent.mm.ui.chatting.manager.a r3 = r3.f193278b
            xi.d r3 = r3.mo102812a(r7)
            zj3.l r3 = (zj3.C79368l) r3
            long r4 = r32.getMsgId()
            boolean r1 = r1.mo103080N(r3, r4)
            if (r1 == 0) goto L_0x03c3
            android.widget.ImageView r1 = r29.getTickIV()
            if (r1 == 0) goto L_0x03f7
            android.widget.ImageView r1 = r29.getTickIV()
            gy3.C87412m.m108591d(r1)
            r3 = 0
            r1.setVisibility(r3)
            goto L_0x03f7
        L_0x03c3:
            android.widget.ImageView r1 = r29.getTickIV()
            if (r1 == 0) goto L_0x03f7
            android.widget.ImageView r1 = r29.getTickIV()
            gy3.C87412m.m108591d(r1)
            r4 = 8
            r1.setVisibility(r4)
            goto L_0x03f7
        L_0x03d6:
            r3 = 0
            r4 = 8
            android.widget.ImageView r6 = r29.getTickIV()
            if (r6 == 0) goto L_0x03e9
            android.widget.ImageView r6 = r29.getTickIV()
            gy3.C87412m.m108591d(r6)
            r6.setVisibility(r4)
        L_0x03e9:
            int r4 = r32.getStatus()
            r5 = 2
            if (r4 >= r5) goto L_0x03f2
            r11 = 1
            goto L_0x03f3
        L_0x03f2:
            r11 = 0
        L_0x03f3:
            r3 = 1
            r1.mo103093i0(r2, r11, r3)
        L_0x03f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C57800w1.mo82225a(com.tencent.mm.ui.chatting.viewitems.i, com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder, uj3.e, ck3.b, com.tencent.mm.storage.f4, java.lang.String):void");
    }

    /* renamed from: b */
    public final View mo82226b(LayoutInflater layoutInflater, View view) {
        if (view == null || view.getTag() == null) {
            view = this.f165392a ? new C6807n4(layoutInflater, C0966R.C0971layout.d3t) : new C6807n4(layoutInflater, C0966R.C0971layout.d3u);
            view.setTag(new ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder().build(view, !this.f165392a));
        }
        return view;
    }

    /* renamed from: c */
    public final boolean mo82227c(C74023i iVar, C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C87412m.m108594g(iVar, "chattingItem");
        if (e0Var == null || view == null) {
            return false;
        }
        C67391b bVar = this.f165393b;
        if (bVar != null) {
            if (this.f165392a) {
                Object tag = view.getTag();
                C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                ((C74243t8) tag).mo103252b();
                if (f4Var != null) {
                    e0Var.removeItem(116);
                }
            } else {
                Object tag2 = view.getTag();
                C87412m.m108592e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                int b = ((C74243t8) tag2).mo103252b();
                if (f4Var != null) {
                    e0Var.removeItem(116);
                    if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && iVar.mo103083Q(f4Var, bVar) && iVar.mo103081O(f4Var.mo108768t()) && !bVar.mo91580u()) {
                        e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo82228d(View view, C67391b bVar, C72963f4 f4Var) {
        View view2 = view;
        C67391b bVar2 = bVar;
        C72963f4 f4Var2 = f4Var;
        C87412m.m108594g(f4Var2, "msg");
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u == null || bVar2 == null) {
            Log.m105924i("MicroMsg.ChattingItemAppMsgFinderOrder", "onItemClick content is null");
        } else {
            C49557gg1 gg12 = ((C46106g) u.mo93555w(C46106g.class)).f124277b;
            Activity f = bVar.mo91565f();
            C87412m.m108593f(f, "ui.context");
            String str = gg12.f134037j;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            String str3 = gg12.f134038n;
            if (str3 != null) {
                str2 = str3;
            }
            Log.m105924i("MicroMsg.ChattingItemAppMsgFinderOrder", "enterShoppingWeApp appId:" + str + ",enterPath:" + str2);
            C86299o oVar = new C86299o();
            oVar.f250930b = str;
            oVar.f250934f = str2;
            oVar.f250939k = C1824s.CTRL_INDEX;
            oVar.f250931c = ((C76243a5) C86312j.m106911c(C76243a5.class)).mo13211J();
            oVar.f250912A = new HalfScreenConfig(true, 0, (HalfScreenConfig.C55451a) null, false, (HalfScreenConfig.BackgroundShapeConfig) null, false, (HalfScreenConfig.CloseWhenClickEmptyAreaConfig) null, HalfScreenConfig.C55453c.HIDE, false, false, (WeAppHalfScreenStatusChangeListener) null, (HalfScreenConfig.C55456f) null, false, false, (C66117m) null, false, (HalfScreenConfig.ShareActionConfig) null, 0, 0, 0, false, false, false, (HalfScreenConfig.C55455e) null, false, HalfScreenConfig.CustomSubjectInfo.f157973f, 0, false, false, 0, false, false, false, -33554562, 1, (C8480h) null);
            oVar.f250916E = new C57798v1();
            ((C76630x0) C86312j.m106911c(C76630x0.class)).mo106898tv(f, oVar);
        }
        if (bVar2 == null || view2 == null) {
            return true;
        }
        C66869c cVar = (C66869c) bVar2.f193278b.mo102812a(C66869c.class);
        if (cVar == null) {
            return true;
        }
        cVar.mo26187U2(bVar2, view2, f4Var2);
        return true;
    }

    /* renamed from: e */
    public final void mo82229e(View view, C67391b bVar, C72963f4 f4Var) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(f4Var, "msg");
        if (!this.f165392a && f4Var.mo101020w3()) {
            C72695v.m85081w(f4Var);
            C75604z3.m90834f(f4Var.getMsgId());
            bVar.mo91541B(true);
        }
    }
}
