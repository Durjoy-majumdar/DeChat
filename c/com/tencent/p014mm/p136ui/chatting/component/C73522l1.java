package com.tencent.p014mm.p136ui.chatting.component;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72805l0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.ChatFooter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import ht1.C46117w1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import p270xi.C91212b;
import qy2.C77457v;
import rb0.C48009v0;
import xy1.C53472h;
import zj3.C79338a1;
import zj3.C79348e;
import zj3.C79349e0;
import zj3.C79365j;
import zj3.C79366k;
import zj3.C79377q;
import zj3.C79384u0;
import zj3.C79387w;

@C91212b(exportInterface = C79338a1.class)
/* renamed from: com.tencent.mm.ui.chatting.component.l1 */
public class C73522l1 extends C73412a implements C79338a1 {

    /* renamed from: e */
    public boolean f215966e = false;

    /* renamed from: f */
    public boolean f215967f = false;

    /* renamed from: g */
    public String f215968g;

    /* renamed from: h */
    public String f215969h;

    /* renamed from: i */
    public long f215970i;

    /* renamed from: j */
    public long f215971j = -1;

    /* renamed from: n */
    public C57674a f215972n = C57674a.hide;

    /* renamed from: com.tencent.mm.ui.chatting.component.l1$a */
    public enum C57674a {
        hide,
        show
    }

    /* renamed from: F4 */
    public void mo26186F4() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0300  */
    /* renamed from: G4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26160G4() {
        /*
            r18 = this;
            r0 = r18
            java.lang.Class<zj3.w> r1 = zj3.C79387w.class
            ck3.b r2 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r1)
            zj3.w r2 = (zj3.C79387w) r2
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r2.mo102193k1()
            java.lang.String r4 = "MicroMsg.ChattingUI.DraftComponent"
            if (r3 != 0) goto L_0x0017
            goto L_0x0046
        L_0x0017:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r2.mo102193k1()
            boolean r3 = r3.f211917p1
            if (r3 == 0) goto L_0x0029
            com.tencent.mm.ui.chatting.component.l1$a r3 = com.tencent.p014mm.p136ui.chatting.component.C73522l1.C57674a.show
            r0.f215972n = r3
            java.lang.String r3 = "jacks mark refreshKeyBordState keybord state: show"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
            goto L_0x0032
        L_0x0029:
            com.tencent.mm.ui.chatting.component.l1$a r3 = com.tencent.p014mm.p136ui.chatting.component.C73522l1.C57674a.hide
            r0.f215972n = r3
            java.lang.String r3 = "jacks mark refreshKeyBordState keybord state: hide"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r3)
        L_0x0032:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r2.mo102193k1()
            java.lang.String r3 = r3.getLastText()
            r0.f215968g = r3
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r2.mo102193k1()
            long r2 = r2.getLastQuoteMsgId()
            r0.f215970i = r2
        L_0x0046:
            ck3.b r2 = r0.f215752d
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r1 = r2.mo102812a(r1)
            zj3.w r1 = (zj3.C79387w) r1
            ck3.b r2 = r0.f215752d
            java.lang.Class<zj3.e> r3 = zj3.C79348e.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.e r2 = (zj3.C79348e) r2
            boolean r3 = r2.mo70071q1()
            r5 = 1
            if (r3 == 0) goto L_0x00be
            sb0.b r3 = rb0.C48009v0.Dx0()
            long r6 = r2.mo70068i4()
            sb0.a r2 = r3.mo73024Yt(r6)
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r1.mo102193k1()
            if (r3 == 0) goto L_0x0366
            java.lang.String r3 = r0.f215969h
            if (r3 == 0) goto L_0x008d
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r3 = r1.mo102193k1()
            java.lang.String r3 = r3.getLastText()
            java.lang.String r3 = r3.trim()
            java.lang.String r6 = r0.f215969h
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x0366
        L_0x008d:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
            java.lang.String r1 = r1.getLastText()
            java.lang.String r1 = r1.trim()
            r0.f215969h = r1
            r2.field_editingMsg = r1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x00a6
            long r6 = r2.field_lastMsgTime
            goto L_0x00aa
        L_0x00a6:
            long r6 = java.lang.System.currentTimeMillis()
        L_0x00aa:
            long r5 = sb0.C48329b.m53633kD(r2, r5, r6)
            r2.field_flag = r5
            sb0.b r1 = rb0.C48009v0.Dx0()
            r1.mo73020LL(r2)
            java.lang.String r1 = "set editMsg history"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r1)
            goto L_0x0366
        L_0x00be:
            ck3.b r2 = r0.f215752d
            java.lang.Class<zj3.j> r3 = zj3.C79365j.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.j r2 = (zj3.C79365j) r2
            boolean r2 = r2.mo70105e4()
            if (r2 == 0) goto L_0x0111
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r1.mo102193k1()
            if (r2 == 0) goto L_0x0366
            java.lang.String r2 = r0.f215969h
            if (r2 == 0) goto L_0x00ee
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r1.mo102193k1()
            java.lang.String r2 = r2.getLastText()
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r0.f215969h
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0366
        L_0x00ee:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
            java.lang.String r1 = r1.getLastText()
            java.lang.String r1 = r1.trim()
            r0.f215969h = r1
            java.lang.Class<ht1.w1> r1 = ht1.C46117w1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.w1 r1 = (ht1.C46117w1) r1
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            java.lang.String r3 = r0.f215969h
            r1.mo64578G(r2, r3)
            goto L_0x0366
        L_0x0111:
            ck3.b r2 = r0.f215752d
            java.lang.Class<zj3.k> r3 = zj3.C79366k.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.k r2 = (zj3.C79366k) r2
            boolean r2 = r2.mo70129g1()
            if (r2 == 0) goto L_0x0164
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r1.mo102193k1()
            if (r2 == 0) goto L_0x0366
            java.lang.String r2 = r0.f215969h
            if (r2 == 0) goto L_0x0141
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r1.mo102193k1()
            java.lang.String r2 = r2.getLastText()
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r0.f215969h
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0366
        L_0x0141:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
            java.lang.String r1 = r1.getLastText()
            java.lang.String r1 = r1.trim()
            r0.f215969h = r1
            java.lang.Class<xy1.h> r1 = xy1.C53472h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            xy1.h r1 = (xy1.C53472h) r1
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            java.lang.String r3 = r0.f215969h
            r1.mo70721G(r2, r3)
            goto L_0x0366
        L_0x0164:
            ck3.b r2 = r0.f215752d
            java.lang.Class<zj3.q> r3 = zj3.C79377q.class
            com.tencent.mm.ui.chatting.manager.a r2 = r2.f193278b
            xi.d r2 = r2.mo102812a(r3)
            zj3.q r2 = (zj3.C79377q) r2
            boolean r2 = r2.mo70131k2()
            if (r2 == 0) goto L_0x01b7
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r1.mo102193k1()
            if (r2 == 0) goto L_0x0366
            java.lang.String r2 = r0.f215969h
            if (r2 == 0) goto L_0x0194
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r2 = r1.mo102193k1()
            java.lang.String r2 = r2.getLastText()
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r0.f215969h
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0366
        L_0x0194:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
            java.lang.String r1 = r1.getLastText()
            java.lang.String r1 = r1.trim()
            r0.f215969h = r1
            java.lang.Class<qy2.v> r1 = qy2.C77457v.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qy2.v r1 = (qy2.C77457v) r1
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            java.lang.String r3 = r0.f215969h
            r1.mo74146G(r2, r3)
            goto L_0x0366
        L_0x01b7:
            f40.e r2 = f40.C86709a0.m107523b()
            boolean r2 = r2.mo121114l()
            r3 = 0
            if (r2 == 0) goto L_0x01d7
            eb0.c r2 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r2 = r2.mo105908w()
            ck3.b r6 = r0.f215752d
            java.lang.String r6 = r6.mo91577r()
            com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
            com.tencent.mm.storage.h2 r2 = r2.mo69771j(r6)
            goto L_0x01d8
        L_0x01d7:
            r2 = r3
        L_0x01d8:
            if (r2 != 0) goto L_0x022c
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r1.mo102193k1()
            if (r6 == 0) goto L_0x022c
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r6 = r1.mo102193k1()
            java.lang.String r6 = r6.getLastText()
            java.lang.String r6 = r6.trim()
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x022c
            com.tencent.mm.storage.h2 r2 = new com.tencent.mm.storage.h2
            ck3.b r6 = r0.f215752d
            com.tencent.mm.storage.z1 r6 = r6.mo91574o()
            java.lang.String r6 = r6.getUsername()
            r2.<init>(r6)
            long r6 = java.lang.System.currentTimeMillis()
            r2.mo108793N2(r6)
            ck3.b r6 = r0.f215752d
            java.lang.Class<zj3.h0> r7 = zj3.C79361h0.class
            com.tencent.mm.ui.chatting.manager.a r6 = r6.f193278b
            xi.d r6 = r6.mo102812a(r7)
            zj3.h0 r6 = (zj3.C79361h0) r6
            boolean r6 = r6.mo102468o1()
            if (r6 == 0) goto L_0x021f
            r6 = 4194304(0x400000, float:5.877472E-39)
            r2.mo108371j3(r6)
        L_0x021f:
            eb0.c r6 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r6 = r6.mo105908w()
            com.tencent.mm.storage.i2 r6 = (com.tencent.p014mm.storage.C44660i2) r6
            r6.mo69751W(r2)
        L_0x022c:
            r6 = 3
            r7 = 0
            r8 = 2
            if (r2 == 0) goto L_0x0346
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r9 = r1.mo102193k1()
            if (r9 == 0) goto L_0x0346
            java.lang.String r9 = r0.f215969h
            r10 = 4
            r11 = 21170(0x52b2, float:2.9665E-41)
            java.lang.String r12 = "hidden_conv_parent"
            if (r9 == 0) goto L_0x0257
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r9 = r1.mo102193k1()
            java.lang.String r9 = r9.getLastText()
            java.lang.String r9 = r9.trim()
            java.lang.String r13 = r0.f215969h
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x0255
            goto L_0x0257
        L_0x0255:
            r9 = 0
            goto L_0x02a3
        L_0x0257:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r9 = r1.mo102193k1()
            java.lang.String r9 = r9.getLastText()
            java.lang.String r9 = r9.trim()
            r0.f215969h = r9
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r9 = r1.mo102193k1()
            java.lang.String r9 = r9.getLastText()
            java.lang.String r9 = r9.trim()
            r2.mo108796Q2(r9)
            java.lang.String r9 = r2.mo108782C2()
            boolean r9 = r12.equalsIgnoreCase(r9)
            if (r9 == 0) goto L_0x02a2
            r2.mo108807c3(r3)
            com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r13 = new java.lang.Object[r6]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            r13[r7] = r14
            java.lang.String r14 = r2.getUsername()
            r13[r5] = r14
            java.lang.String r14 = r2.getUsername()
            int r14 = eb0.C45629t0.m50816c(r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r8] = r14
            r9.mo160131h(r11, r13)
        L_0x02a2:
            r9 = 1
        L_0x02a3:
            long r13 = r0.f215971j
            r15 = -1
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x02c1
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r13 = r1.mo102193k1()
            long r13 = r13.getLastQuoteMsgId()
            r16 = r9
            long r8 = r0.f215971j
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((long) r13, (long) r8)
            if (r8 != 0) goto L_0x02be
            goto L_0x02c1
        L_0x02be:
            r9 = r16
            goto L_0x02fe
        L_0x02c1:
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r1 = r1.mo102193k1()
            long r8 = r1.getLastQuoteMsgId()
            r0.f215971j = r8
            r2.mo108797R2(r8)
            java.lang.String r1 = r2.mo108782C2()
            boolean r1 = r12.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x02fd
            r2.mo108807c3(r3)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r3[r7] = r8
            java.lang.String r8 = r2.getUsername()
            r3[r5] = r8
            java.lang.String r8 = r2.getUsername()
            int r8 = eb0.C45629t0.m50816c(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 2
            r3[r9] = r8
            r1.mo160131h(r11, r3)
        L_0x02fd:
            r9 = 1
        L_0x02fe:
            if (r9 == 0) goto L_0x0346
            java.lang.String r1 = r2.mo108824r2()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0319
            long r8 = r2.mo108825s2()
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0319
            long r8 = r2.mo108821o2()
            goto L_0x031d
        L_0x0319:
            long r8 = java.lang.System.currentTimeMillis()
        L_0x031d:
            long r8 = g62.C45881a.m51165b(r2, r5, r8)
            r2.mo101161T2(r8)
            ck3.b r1 = r0.f215752d
            java.lang.Class<zj3.c0> r3 = zj3.C79343c0.class
            com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
            xi.d r1 = r1.mo102812a(r3)
            zj3.c0 r1 = (zj3.C79343c0) r1
            boolean r1 = r1.mo102625l4()
            r1 = r1 ^ r5
            eb0.c r3 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r3 = r3.mo105908w()
            java.lang.String r8 = r2.getUsername()
            com.tencent.mm.storage.i2 r3 = (com.tencent.p014mm.storage.C44660i2) r3
            r3.mo69775m0(r2, r8, r7, r1)
        L_0x0346:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r2 = r0.f215969h
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.secPrint(r2)
            r1[r7] = r2
            long r2 = r0.f215971j
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r5] = r2
            ck3.b r2 = r0.f215752d
            java.lang.String r2 = r2.mo91577r()
            r3 = 2
            r1[r3] = r2
            java.lang.String r2 = "[doDestroy] set editMsg history! content:%s quoteMsgId:%s username:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r2, r1)
        L_0x0366:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.C73522l1.mo26160G4():void");
    }

    /* renamed from: N3 */
    public void mo102487N3() {
        int i;
        if (!Util.isNullOrNil(this.f215752d.mo91577r())) {
            C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
            if (wVar.mo102193k1() == null) {
                return;
            }
            if (!Util.isNullOrNil(this.f215968g) || this.f215970i != 0) {
                boolean z = wVar.mo102193k1().getMode() == 1 && Util.isNullOrNil(wVar.mo102196r5());
                boolean i2 = ((C79384u0) this.f215752d.f193278b.mo102812a(C79384u0.class)).mo102510i2();
                if (!z || i2) {
                    mo102489Z5();
                } else {
                    mo102488Y5();
                }
                if (this.f215970i != 0) {
                    wVar.mo102193k1().setLastQuoteMsgId(this.f215970i);
                }
                boolean s4 = ((C79348e) this.f215752d.f193278b.mo102812a(C79348e.class)).mo70075s4();
                if ((this.f215752d.mo91582w() || s4) && this.f215966e) {
                    this.f215966e = false;
                    List<String> atSomebodyList = wVar.mo102193k1().getAtSomebodyList();
                    if (atSomebodyList != null && atSomebodyList.size() > 0) {
                        int insertPos = wVar.mo102193k1().getInsertPos();
                        if (insertPos > this.f215968g.length()) {
                            insertPos = this.f215968g.length();
                        }
                        String substring = this.f215968g.substring(0, insertPos);
                        int i3 = insertPos;
                        int i4 = 0;
                        for (String next : atSomebodyList) {
                            if (!Util.isNullOrNil(next)) {
                                if (i4 > 0) {
                                    substring = substring + "@" + next + 8197;
                                    i = next.length() + 2;
                                } else {
                                    substring = substring + next + 8197;
                                    i = next.length() + 1;
                                }
                                i3 += i;
                            }
                            i4++;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(substring);
                        String str = this.f215968g;
                        sb.append(str.substring(insertPos, str.length()));
                        String sb4 = sb.toString();
                        wVar.mo102193k1().setLastContent(sb4);
                        wVar.mo102193k1().mo100352G0(sb4, i3, false);
                        ((LinkedList) wVar.mo102193k1().f211795P.f212004c).clear();
                        mo102488Y5();
                    }
                } else {
                    wVar.mo102193k1().setLastContent(this.f215968g);
                    wVar.mo102193k1().setLastText(this.f215968g);
                    if ((!Util.isNullOrNil(this.f215968g) || this.f215970i != 0) && !i2 && Util.isNullOrNil(wVar.mo102196r5())) {
                        wVar.mo102197v4();
                        this.f215752d.mo91542C(true, true, false);
                    }
                }
                wVar.mo102181L2();
                return;
            }
            if (((C79349e0) this.f215752d.f193278b.mo102812a(C79349e0.class)).mo102241i1()) {
                wVar.mo102193k1().setLastText(this.f215968g);
                wVar.mo102193k1().setHint(this.f215752d.mo91572m().getString(C0966R.string.bci));
                wVar.mo102193k1().setLastQuoteMsgId(this.f215970i);
            } else if (wVar.mo102193k1().getIsVoiceInputPanleShow()) {
                wVar.mo102181L2();
            } else {
                mo102489Z5();
            }
        }
    }

    /* renamed from: N5 */
    public void mo70052N5(int i, int i2, Intent intent) {
        String str;
        Class cls = C79387w.class;
        if (i != 212) {
            if (i == 229 && intent != null) {
                C44661m1 Lo = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69799Lo(this.f215752d.mo91577r());
                C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(cls);
                for (String str2 : intent.getStringExtra("KSelectUserList").split(",")) {
                    if (str2.equals("notify@all")) {
                        str = this.f215752d.mo91572m().getString(C0966R.string.a_d, new Object[]{""});
                    } else {
                        Set<String> set = C45628s0.f123410p;
                        C86709a0.m107528h();
                        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str2);
                        String q2 = Lo != null ? Lo.mo69789q2(z1Var.getUsername()) : null;
                        if (Util.isNullOrNil(q2)) {
                            q2 = z1Var.mo62909j3();
                        }
                        str = Util.isNullOrNil(q2) ? z1Var.getUsername() : q2;
                    }
                    Log.m105925i("MicroMsg.ChattingUI.DraftComponent", "atSomeOne username:%s, DisplayName:%s", str2, str);
                    if (Util.isNullOrNil(str)) {
                        Log.m105919d("MicroMsg.ChattingUI.DraftComponent", "@ %s", "[nobody]");
                        ((LinkedList) wVar.mo102193k1().f211795P.f212004c).add("");
                    } else {
                        Log.m105919d("MicroMsg.ChattingUI.DraftComponent", "@ %s", str);
                        ((LinkedList) wVar.mo102193k1().f211795P.f212004c).add(str);
                        wVar.mo102193k1().mo100443p(this.f215752d.mo91577r(), str2, str);
                        this.f215966e = true;
                    }
                }
            }
        } else if (intent != null) {
            C79387w wVar2 = (C79387w) this.f215752d.f193278b.mo102812a(cls);
            String stringExtra = intent.getStringExtra("select_raw_user_name");
            String stringExtra2 = intent.getStringExtra("Select_Conv_User");
            if (Util.isNullOrNil(stringExtra2)) {
                Log.m105919d("MicroMsg.ChattingUI.DraftComponent", "@ %s", "[nobody]");
                ((LinkedList) wVar2.mo102193k1().f211795P.f212004c).add("");
                this.f215966e = false;
                return;
            }
            Log.m105919d("MicroMsg.ChattingUI.DraftComponent", "@ %s", stringExtra2);
            ((LinkedList) wVar2.mo102193k1().f211795P.f212004c).add(stringExtra2);
            wVar2.mo102193k1().mo100443p(this.f215752d.mo91577r(), stringExtra, stringExtra2);
            this.f215966e = true;
        }
    }

    /* renamed from: O4 */
    public void mo26162O4() {
        Log.m105918d("MicroMsg.ChattingUI.DraftComponent", "jacks mark reset keybord state");
        this.f215972n = C57674a.hide;
        if (this.f215752d.mo91574o() != null) {
            C79348e eVar = (C79348e) this.f215752d.f193278b.mo102812a(C79348e.class);
            if (eVar.mo70071q1()) {
                String str = C48009v0.Dx0().mo73024Yt(eVar.mo70068i4()).field_editingMsg;
                this.f215968g = str;
                this.f215969h = str;
                return;
            }
            if (((C79365j) this.f215752d.f193278b.mo102812a(C79365j.class)).mo70105e4()) {
                String U = ((C46117w1) C86312j.m106911c(C46117w1.class)).mo64581U(this.f215752d.mo91577r());
                this.f215968g = U;
                this.f215969h = U;
                return;
            }
            if (((C79366k) this.f215752d.f193278b.mo102812a(C79366k.class)).mo70129g1()) {
                String U2 = ((C53472h) C86312j.m106911c(C53472h.class)).mo70725U(this.f215752d.mo91577r());
                this.f215968g = U2;
                this.f215969h = U2;
                return;
            }
            if (((C79377q) this.f215752d.f193278b.mo102812a(C79377q.class)).mo70131k2()) {
                String U3 = ((C77457v) C86312j.m106911c(C77457v.class)).mo74147U(this.f215752d.mo91577r());
                this.f215968g = U3;
                this.f215969h = U3;
                return;
            }
            C72976h2 j = ((C44660i2) C97625j3.m125812b().mo105908w()).mo69771j(this.f215752d.mo91577r());
            if (j != null) {
                String r2 = j.mo108824r2();
                this.f215968g = r2;
                this.f215969h = r2;
                long s2 = j.mo108825s2();
                this.f215970i = s2;
                this.f215971j = s2;
            }
        }
    }

    /* renamed from: R5 */
    public void mo70146R5(Configuration configuration) {
        C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
        this.f215968g = wVar.mo102193k1().getLastText();
        this.f215970i = wVar.mo102193k1().getLastQuoteMsgId();
        mo102487N3();
    }

    /* renamed from: U5 */
    public boolean mo70055U5(int i, KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getKeyCode() == 67) {
            C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
            if (keyEvent.getAction() == 0) {
                if (wVar.mo102193k1().getCharAtCursor() == 8197) {
                    this.f215967f = true;
                } else {
                    this.f215967f = false;
                }
            }
            if (keyEvent.getAction() == 1 && this.f215967f) {
                this.f215967f = false;
                ChatFooter k1 = wVar.mo102193k1();
                String r = this.f215752d.mo91577r();
                int selectionStart = k1.getSelectionStart();
                String substring = k1.getLastText().substring(0, selectionStart);
                int lastIndexOf = substring.lastIndexOf(64);
                if (lastIndexOf < substring.length() && lastIndexOf >= 0) {
                    k1.setLastText(substring.substring(0, lastIndexOf) + k1.getLastText().substring(selectionStart));
                    k1.f211888j.setSelection(lastIndexOf);
                    if (Util.isNullOrNil(substring)) {
                        i2 = 0;
                    } else {
                        int i3 = -1;
                        int i4 = 0;
                        while (true) {
                            int indexOf = substring.indexOf(8197, i3);
                            if (indexOf == -1) {
                                break;
                            }
                            i3 = indexOf + 1;
                            i4++;
                        }
                        i2 = i4 + 1;
                    }
                    LinkedList linkedList = k1.f211795P.f212006e.get(r);
                    String substring2 = substring.substring(lastIndexOf + 1, selectionStart);
                    if (linkedList != null && linkedList.size() >= i2) {
                        int i5 = i2 - 1;
                        if (((HashMap) linkedList.get(i5)).containsKey(substring2)) {
                            linkedList.remove(i5);
                            k1.f211795P.f212006e.put(r, linkedList);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: Y5 */
    public final void mo102488Y5() {
        C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
        if (wVar.mo102193k1() != null) {
            ChatFooter k1 = wVar.mo102193k1();
            k1.getClass();
            k1.postDelayed(new C72805l0(k1), 500);
        }
    }

    /* renamed from: Z5 */
    public final void mo102489Z5() {
        C79387w wVar = (C79387w) this.f215752d.f193278b.mo102812a(C79387w.class);
        if (wVar.mo102193k1() != null) {
            boolean z = this.f215972n == C57674a.show;
            ChatFooter k1 = wVar.mo102193k1();
            k1.getClass();
            Log.m105924i("MicroMsg.ChatFooter", "withoutLastText: ");
            k1.mo100429h0();
            k1.mo100501w0(z);
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
    }

    /* renamed from: u5 */
    public void mo26170u5() {
    }
}
