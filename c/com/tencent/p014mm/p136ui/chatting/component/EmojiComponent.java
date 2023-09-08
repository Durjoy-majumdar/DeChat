package com.tencent.p014mm.p136ui.chatting.component;

import ah3.C92002b;
import android.content.res.Configuration;
import ck3.C67391b;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AppEmojiMsgProgressEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73673d4;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import di3.C86312j;
import eb0.C97625j3;
import i61.C98602h;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C76912y0;
import p270xi.C91212b;
import tc0.C48629h;
import tc0.C77885p;
import z51.C39315g;
import zj3.C79381s;
import zt3.C119157j;

@C91212b(exportInterface = C79381s.class)
/* renamed from: com.tencent.mm.ui.chatting.component.EmojiComponent */
public class EmojiComponent extends C73412a implements C79381s {

    /* renamed from: e */
    public IListener f215505e = new IListener<AppEmojiMsgProgressEvent>(C40008f.f107254d) {
        {
            this.__eventId = -1339190943;
        }

        public boolean callback(IEvent iEvent) {
            AppEmojiMsgProgressEvent appEmojiMsgProgressEvent = (AppEmojiMsgProgressEvent) iEvent;
            C67391b bVar = EmojiComponent.this.f215752d;
            if (bVar == null) {
                return false;
            }
            if (appEmojiMsgProgressEvent.f193475d.f193478c == 1) {
                bVar.mo91571l().post(new C73553n1(this));
                return false;
            }
            bVar.mo91571l().post(new C73560o1(this, appEmojiMsgProgressEvent));
            return false;
        }
    };

    /* renamed from: f */
    public C92002b f215506f;

    /* renamed from: com.tencent.mm.ui.chatting.component.EmojiComponent$a */
    public class C73345a implements Runnable {
        public C73345a(EmojiComponent emojiComponent) {
        }

        public void run() {
            ArrayList arrayList;
            C96926b0 b = C96926b0.m124490b();
            synchronized (b.f283937d) {
                arrayList = new ArrayList(b.f283937d);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C96926b0.m124490b().mo135518c(((SmileyPanelConfigInfo) it.next()).field_key);
            }
        }
    }

    /* renamed from: Y5 */
    public static EmojiInfo m86511Y5(C72963f4 f4Var) {
        Class cls = C39315g.class;
        if (f4Var.mo100973L3()) {
            return ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(f4Var.mo108765s2());
        }
        C72989o2 o2Var = new C72989o2(f4Var.getContent());
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2());
        if (u == null) {
            u = new C68070l.C68072b();
            u.f195610p = o2Var.f212821d;
        }
        if (Util.isNullOrNil(u.f195610p) || u.f195610p.equals("-1")) {
            return null;
        }
        return ((C98602h) ((C39315g) C86312j.m106911c(cls)).mo58035cm()).mo137999G(u.f195610p);
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0120 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo102174F0(android.view.MenuItem r32, ck3.C67391b r33, com.tencent.p014mm.storage.C72963f4 r34) {
        /*
            r31 = this;
            r1 = r31
            r2 = r33
            r0 = r34
            java.lang.Class<z51.g> r3 = z51.C39315g.class
            java.lang.Class<zj3.w> r4 = zj3.C79387w.class
            int r5 = r32.getItemId()
            r6 = 103(0x67, float:1.44E-43)
            if (r5 == r6) goto L_0x051b
            r6 = 104(0x68, float:1.46E-43)
            r7 = 10
            r8 = 4
            r9 = 2
            r10 = 3
            java.lang.String r13 = ""
            r16 = 6
            r17 = 5
            r15 = 0
            r11 = 1
            if (r5 == r6) goto L_0x03ec
            r6 = 128(0x80, float:1.794E-43)
            java.lang.String r12 = "-1"
            if (r5 == r6) goto L_0x0338
            r6 = 135(0x87, float:1.89E-43)
            if (r5 == r6) goto L_0x02d4
            java.lang.String r6 = "MicroMsg.ChattingUI.EmojiComponent"
            switch(r5) {
                case 113: goto L_0x01d6;
                case 114: goto L_0x01c0;
                case 115: goto L_0x0033;
                default: goto L_0x0032;
            }
        L_0x0032:
            return r15
        L_0x0033:
            boolean r3 = r34.mo100973L3()
            if (r3 != 0) goto L_0x0041
            boolean r3 = r34.mo101022y3()
            if (r3 != 0) goto L_0x0041
            goto L_0x01bf
        L_0x0041:
            com.tencent.mm.storage.emotion.EmojiInfo r3 = m86511Y5(r34)
            if (r3 != 0) goto L_0x0049
            goto L_0x01bf
        L_0x0049:
            com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct
            r0.<init>()
            long r7 = zg3.C79330c.f232896a
            r0.f265792d = r7
            r7 = 2
            r0.f265793e = r7
            java.lang.String r5 = r3.field_groupId
            r0.mo126627u(r5)
            java.lang.String r5 = r3.getMd5()
            r0.mo126626t(r5)
            java.lang.String r5 = zg3.C79330c.f232898c
            r0.mo126625s(r5)
            r0.mo86054n()
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 1257(0x4e9, double:6.21E-321)
            r0.mo175912v(r9, r7)
            com.tencent.mm.ui.chatting.manager.a r0 = r2.f193278b
            xi.d r0 = r0.mo102812a(r4)
            zj3.w r0 = (zj3.C79387w) r0
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r0.mo102193k1()
            int r5 = r4.getCurrentScrollHeight()
            android.app.Activity r0 = r33.mo91565f()
            int r0 = p248ug.C78160t0.m94370a(r0)
            r4.mo100350F0(r0, r11, r15, r15)
            java.lang.Class<zj3.l> r0 = zj3.C79368l.class
            com.tencent.mm.ui.chatting.manager.a r7 = r2.f193278b
            xi.d r0 = r7.mo102812a(r0)
            r7 = r0
            zj3.l r7 = (zj3.C79368l) r7
            int r0 = r7.getCount()
            int r0 = r0 - r11
            te3.va3 r8 = new te3.va3
            r8.<init>()
            r9 = r0
        L_0x00a2:
            if (r9 < 0) goto L_0x012b
            java.util.LinkedList<te3.ua3> r0 = r8.f143414d
            int r0 = r0.size()
            r10 = 20
            if (r0 > r10) goto L_0x012b
            te3.ua3 r10 = new te3.ua3
            r10.<init>()
            com.tencent.mm.storage.f4 r12 = r7.getItem(r9)
            int r0 = r12.getType()
            r10.f142701d = r0
            int r0 = com.tencent.p014mm.message.C40339m.m43520a(r12)
            r10.f142702e = r0
            boolean r0 = r12.mo101020w3()     // Catch:{ Exception -> 0x00e7 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r0 = r12.getContent()     // Catch:{ Exception -> 0x00e7 }
            java.lang.String r14 = r12.mo108775z2()     // Catch:{ Exception -> 0x00e7 }
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r14)     // Catch:{ Exception -> 0x00e7 }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r14 = r0.f195604n1     // Catch:{ Exception -> 0x00e7 }
            boolean r14 = android.text.TextUtils.isEmpty(r14)     // Catch:{ Exception -> 0x00e7 }
            if (r14 == 0) goto L_0x00e0
            goto L_0x00f1
        L_0x00e0:
            java.lang.String r0 = r0.f195604n1     // Catch:{ Exception -> 0x00e7 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x00e7 }
            goto L_0x00f2
        L_0x00e7:
            r0 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r11]
            r14[r15] = r0
            java.lang.String r0 = "AppMessageHelper"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r0, r13, r14)
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            r10.f142703f = r0
            r19 = r13
            long r13 = r12.getCreateTime()
            r10.f142705h = r13
            int r0 = r12.mo108769t2()
            r10.f142706i = r0
            boolean r0 = r12.mo100973L3()
            if (r0 == 0) goto L_0x0120
            com.tencent.mm.storage.emotion.EmojiInfo r0 = m86511Y5(r12)
            if (r0 == 0) goto L_0x0120
            java.lang.String r12 = r0.field_md5
            r10.f142704g = r12
            java.lang.String r13 = r3.field_md5
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0120
            r10.f142708n = r11
            java.lang.String r0 = r0.field_lensId
            r10.f142707j = r0
        L_0x0120:
            int r9 = r9 + -1
            java.util.LinkedList<te3.ua3> r0 = r8.f143414d
            r0.add(r10)
            r13 = r19
            goto L_0x00a2
        L_0x012b:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.util.LinkedList<te3.ua3> r7 = r8.f143414d
            int r7 = r7.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r15] = r7
            java.lang.String r7 = " add ctxs size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r0)
            com.tencent.mm.ui.chatting.e3 r0 = new com.tencent.mm.ui.chatting.e3
            com.tencent.mm.storage.z1 r7 = r33.mo91574o()
            java.lang.String r9 = r33.mo91577r()
            r0.<init>(r2, r7, r9)
            java.lang.Class<h81.h> r7 = h81.C32735h.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r9 = h81.C32735h.C32737c.clicfg_enable_sos_emoji
            boolean r29 = r7.mo58784wf(r9, r11)
            com.tencent.mm.search.data.SimilarEmojiQueryModel r7 = new com.tencent.mm.search.data.SimilarEmojiQueryModel     // Catch:{ IOException -> 0x01ba }
            java.lang.String r20 = ""
            java.lang.String r3 = r3.field_md5     // Catch:{ IOException -> 0x01ba }
            java.lang.String r22 = r33.mo91577r()     // Catch:{ IOException -> 0x01ba }
            long r23 = zg3.C79330c.f232896a     // Catch:{ IOException -> 0x01ba }
            r25 = 3
            java.lang.String r26 = r33.mo91577r()     // Catch:{ IOException -> 0x01ba }
            byte[] r8 = r8.toByteArray()     // Catch:{ IOException -> 0x01ba }
            pe3.b r27 = pe3.C89349b.m111674a(r8)     // Catch:{ IOException -> 0x01ba }
            r28 = 0
            r19 = r7
            r21 = r3
            r30 = r0
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r30)     // Catch:{ IOException -> 0x01ba }
            int r0 = r4.f211884i1
            if (r0 != r11) goto L_0x0183
            r15 = 1
        L_0x0183:
            if (r15 == 0) goto L_0x018d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.setIgnoreScroll(r0)
            r4.mo100429h0()
        L_0x018d:
            r3 = 0
            r1.f215506f = r3
            ah3.b r0 = new ah3.b
            android.app.Activity r2 = r33.mo91565f()
            com.tencent.mm.ui.chatting.component.q1 r3 = new com.tencent.mm.ui.chatting.component.q1
            r3.<init>(r1, r15, r4, r5)
            r0.<init>(r2, r7, r3)
            r1.f215506f = r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x01b4
            r2 = 0
            r0.setDimAmount(r2)
            r2 = 131072(0x20000, float:1.83671E-40)
            r0.setFlags(r2, r2)
            r2 = 48
            r0.setSoftInputMode(r2)
        L_0x01b4:
            ah3.b r0 = r1.f215506f
            r0.show()
            goto L_0x01bf
        L_0x01ba:
            java.lang.String r0 = "SimilarEmojiQueryModel make error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
        L_0x01bf:
            return r11
        L_0x01c0:
            boolean r3 = r34.mo100973L3()
            if (r3 != 0) goto L_0x01ce
            boolean r3 = r34.mo101022y3()
            if (r3 == 0) goto L_0x01cd
            goto L_0x01ce
        L_0x01cd:
            return r15
        L_0x01ce:
            android.app.Activity r2 = r33.mo91565f()
            com.tencent.p014mm.p136ui.chatting.C73745l4.m87342c(r0, r2)
            return r11
        L_0x01d6:
            r19 = r13
            boolean r4 = r34.mo100973L3()
            if (r4 != 0) goto L_0x01e4
            boolean r4 = r34.mo101022y3()
            if (r4 == 0) goto L_0x02d3
        L_0x01e4:
            boolean r4 = r34.mo100973L3()
            if (r4 == 0) goto L_0x0200
            di3.d r3 = di3.C86312j.m106911c(r3)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            java.lang.String r4 = r34.mo108765s2()
            i61.h r3 = (i61.C98602h) r3
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r3.mo137999G(r4)
            goto L_0x0279
        L_0x0200:
            java.lang.String r4 = r34.getContent()
            if (r4 == 0) goto L_0x0223
            java.lang.String r5 = r34.mo108775z2()
            com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r4, r5)
            if (r4 == 0) goto L_0x0223
            di3.d r5 = di3.C86312j.m106911c(r3)
            z51.g r5 = (z51.C39315g) r5
            zc3.a r5 = r5.mo58035cm()
            java.lang.String r4 = r4.f195610p
            i61.h r5 = (i61.C98602h) r5
            com.tencent.mm.storage.emotion.EmojiInfo r14 = r5.mo137999G(r4)
            goto L_0x0224
        L_0x0223:
            r14 = 0
        L_0x0224:
            java.lang.Object[] r4 = new java.lang.Object[r11]
            if (r14 == 0) goto L_0x022a
            r5 = 1
            goto L_0x022b
        L_0x022a:
            r5 = 0
        L_0x022b:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r15] = r5
            java.lang.String r5 = "longCLickRetransmitEmoji: emoji from xml %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            if (r14 != 0) goto L_0x0278
            java.lang.String r4 = r34.getContent()
            com.tencent.mm.storage.o2 r5 = new com.tencent.mm.storage.o2
            r5.<init>(r4)
            java.lang.String r4 = r5.f212821d
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0264
            java.lang.String r4 = r5.f212821d
            boolean r4 = r4.equals(r12)
            if (r4 != 0) goto L_0x0264
            di3.d r3 = di3.C86312j.m106911c(r3)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            java.lang.String r4 = r5.f212821d
            i61.h r3 = (i61.C98602h) r3
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r3.mo137999G(r4)
            goto L_0x0265
        L_0x0264:
            r3 = r14
        L_0x0265:
            java.lang.Object[] r4 = new java.lang.Object[r11]
            if (r3 == 0) goto L_0x026b
            r5 = 1
            goto L_0x026c
        L_0x026b:
            r5 = 0
        L_0x026c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4[r15] = r5
            java.lang.String r5 = "longCLickRetransmitEmoji: emoji from content %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            goto L_0x0279
        L_0x0278:
            r3 = r14
        L_0x0279:
            com.tencent.mm.ui.chatting.component.p1 r4 = new com.tencent.mm.ui.chatting.component.p1
            r4.<init>(r0, r2)
            if (r3 == 0) goto L_0x02ca
            r4.run()
            java.lang.String r2 = r33.mo91577r()
            boolean r4 = com.tencent.p014mm.storage.C72996z1.m85820U5(r2)
            if (r4 == 0) goto L_0x0295
            java.lang.String r0 = r34.getContent()
            java.lang.String r2 = eb0.C75604z3.m90847s(r0)
        L_0x0295:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r7]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4[r15] = r5
            java.lang.String r5 = r3.getMd5()
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r4[r9] = r5
            java.lang.String r5 = r3.field_designerID
            r4[r10] = r5
            java.lang.String r5 = r3.field_groupId
            r4[r8] = r5
            r4[r17] = r2
            r4[r16] = r19
            r2 = 7
            r4[r2] = r19
            r2 = 8
            r4[r2] = r19
            java.lang.String r2 = r3.field_activityid
            r3 = 9
            r4[r3] = r2
            r2 = 12789(0x31f5, float:1.7921E-41)
            r0.mo160131h(r2, r4)
            goto L_0x02d3
        L_0x02ca:
            boolean r0 = r34.mo101022y3()
            if (r0 == 0) goto L_0x02d3
            r4.run()
        L_0x02d3:
            return r11
        L_0x02d4:
            r19 = r13
            com.tencent.mm.storage.emotion.EmojiInfo r0 = m86511Y5(r34)
            if (r0 != 0) goto L_0x02dd
            goto L_0x0337
        L_0x02dd:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 11
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)
            r4[r15] = r5
            java.lang.String r5 = r0.getMd5()
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r4[r9] = r5
            java.lang.String r5 = r0.field_designerID
            r4[r10] = r5
            java.lang.String r5 = r0.field_groupId
            r4[r8] = r5
            r4[r17] = r19
            r4[r16] = r19
            r5 = 7
            r4[r5] = r19
            r5 = 8
            r4[r5] = r19
            r5 = 9
            r4[r5] = r19
            java.lang.String r5 = r0.field_activityid
            r4[r7] = r5
            r5 = 12789(0x31f5, float:1.7921E-41)
            r3.mo160131h(r5, r4)
            android.app.Activity r3 = r33.mo91565f()
            android.app.Activity r4 = r33.mo91565f()
            r5 = 2131832197(0x7f112d85, float:1.9297441E38)
            java.lang.String r4 = r4.getString(r5)
            r5 = 0
            qo3.i0 r3 = qo3.C89779i0.m112248e(r3, r4, r15, r15, r5)
            nl.a r4 = new nl.a
            android.app.Activity r6 = r33.mo91565f()
            com.tencent.mm.ui.chatting.component.r1 r7 = new com.tencent.mm.ui.chatting.component.r1
            r7.<init>(r3, r2, r0)
            r4.<init>(r6, r0, r5, r7)
        L_0x0337:
            return r11
        L_0x0338:
            r19 = r13
            boolean r4 = r34.mo100973L3()
            if (r4 == 0) goto L_0x0355
            di3.d r3 = di3.C86312j.m106911c(r3)
            z51.g r3 = (z51.C39315g) r3
            zc3.a r3 = r3.mo58035cm()
            java.lang.String r0 = r34.mo108765s2()
            i61.h r3 = (i61.C98602h) r3
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r3.mo137999G(r0)
            goto L_0x0382
        L_0x0355:
            java.lang.String r0 = r34.getContent()
            com.tencent.mm.storage.o2 r4 = new com.tencent.mm.storage.o2
            r4.<init>(r0)
            java.lang.String r0 = r4.f212821d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x03eb
            java.lang.String r0 = r4.f212821d
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x0370
            goto L_0x03eb
        L_0x0370:
            di3.d r0 = di3.C86312j.m106911c(r3)
            z51.g r0 = (z51.C39315g) r0
            zc3.a r0 = r0.mo58035cm()
            java.lang.String r3 = r4.f212821d
            i61.h r0 = (i61.C98602h) r0
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r0.mo137999G(r3)
        L_0x0382:
            if (r0 == 0) goto L_0x03bc
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 11
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r4[r15] = r5
            java.lang.String r5 = r0.getMd5()
            r4[r11] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r4[r9] = r5
            java.lang.String r5 = r0.field_designerID
            r4[r10] = r5
            java.lang.String r5 = r0.field_groupId
            r4[r8] = r5
            r4[r17] = r19
            r4[r16] = r19
            r5 = 7
            r4[r5] = r19
            r5 = 8
            r4[r5] = r19
            r5 = 9
            r4[r5] = r19
            java.lang.String r5 = r0.field_activityid
            r4[r7] = r5
            r5 = 12789(0x31f5, float:1.7921E-41)
            r3.mo160131h(r5, r4)
        L_0x03bc:
            if (r0 != 0) goto L_0x03c1
            r13 = r19
            goto L_0x03c3
        L_0x03c1:
            java.lang.String r13 = r0.field_groupId
        L_0x03c3:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r0 != 0) goto L_0x03eb
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r3 = "preceding_scence"
            r0.putExtra(r3, r10)
            r3 = 16
            java.lang.String r4 = "download_entrance_scene"
            r0.putExtra(r4, r3)
            java.lang.String r3 = "extra_id"
            r0.putExtra(r3, r13)
            android.app.Activity r2 = r33.mo91565f()
            java.lang.String r3 = "emoji"
            java.lang.String r4 = ".ui.EmojiStoreDetailUI"
            r5 = 0
            ke3.C88144b.m109791i(r2, r3, r4, r0, r5)
        L_0x03eb:
            return r11
        L_0x03ec:
            r19 = r13
            boolean r3 = r34.mo100973L3()
            if (r3 != 0) goto L_0x03fc
            boolean r3 = r34.mo101022y3()
            if (r3 != 0) goto L_0x03fc
            goto L_0x051a
        L_0x03fc:
            com.tencent.mm.storage.emotion.EmojiInfo r3 = m86511Y5(r34)
            if (r3 != 0) goto L_0x0404
            goto L_0x051a
        L_0x0404:
            java.lang.String r5 = r34.mo108768t()
            boolean r6 = com.tencent.p014mm.storage.C72996z1.m85820U5(r5)
            if (r6 == 0) goto L_0x0416
            java.lang.String r0 = r34.getContent()
            java.lang.String r5 = eb0.C75604z3.m90847s(r0)
        L_0x0416:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 11
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r6[r15] = r12
            java.lang.String r12 = r3.getMd5()
            r6[r11] = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            r6[r9] = r12
            java.lang.String r12 = r3.field_designerID
            r6[r10] = r12
            java.lang.String r12 = r3.field_groupId
            r6[r8] = r12
            r6[r17] = r19
            r6[r16] = r19
            r12 = 7
            r6[r12] = r19
            r12 = 8
            r6[r12] = r19
            r12 = 9
            r6[r12] = r19
            java.lang.String r12 = r3.field_activityid
            r6[r7] = r12
            r7 = 12789(0x31f5, float:1.7921E-41)
            r0.mo160131h(r7, r6)
            com.tencent.mm.ui.chatting.manager.a r6 = r2.f193278b
            xi.d r4 = r6.mo102812a(r4)
            zj3.w r4 = (zj3.C79387w) r4
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter r4 = r4.mo102193k1()
            r6 = -1
            r4.mo100341B(r15, r11, r6)
            nl.c r4 = new nl.c
            android.app.Activity r6 = r33.mo91565f()
            android.app.Activity r2 = r33.mo91565f()
            r7 = 2131299184(0x7f090b70, float:1.8216362E38)
            android.view.View r2 = r2.findViewById(r7)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r4.<init>(r6, r2, r5, r3)
            dl.p r2 = p490dl.C97491p.f286143a
            r2.mo136773a(r15)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = r2.mo136774c()
            java.lang.String r3 = "custom_full"
            boolean r2 = r2.getBoolean(r3, r15)
            if (r2 == 0) goto L_0x04ed
            java.lang.String r2 = r4.f224788e
            java.lang.String r3 = "addToCustom. over max size."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            android.app.Activity r2 = r4.f224784a
            nl.d r3 = new nl.d
            r3.<init>(r4)
            nl.e r24 = p207nl.C76924e.f224795d
            r19 = 2131825114(0x7f1111da, float:1.9283075E38)
            r20 = 2131821471(0x7f11039f, float:1.9275686E38)
            r21 = 2131825032(0x7f111188, float:1.9282909E38)
            r22 = 2131821426(0x7f110372, float:1.9275595E38)
            r18 = r2
            r23 = r3
            nj3.C76879j.m92739j(r18, r19, r20, r21, r22, r23, r24)
            r2 = 10431(0x28bf, float:1.4617E-41)
            r3 = 9
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)
            r3[r15] = r5
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r4.f224787d
            java.lang.String r5 = r5.getMd5()
            r3[r11] = r5
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r4.f224787d
            java.lang.String r6 = r5.field_designerID
            r3[r9] = r6
            java.lang.String r5 = r5.field_groupId
            r3[r10] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r3[r8] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            r3[r17] = r5
            com.tencent.mm.storage.emotion.EmojiInfo r5 = r4.f224787d
            int r5 = r5.field_size
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r16] = r5
            java.lang.String r5 = r4.f224786c
            r6 = 7
            r3[r6] = r5
            com.tencent.mm.storage.emotion.EmojiInfo r4 = r4.f224787d
            java.lang.String r4 = r4.field_activityid
            r5 = 8
            r3[r5] = r4
            r0.mo160131h(r2, r3)
            goto L_0x051a
        L_0x04ed:
            android.app.Activity r0 = r4.f224784a
            boolean r0 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r0)
            if (r0 != 0) goto L_0x0504
            android.app.Activity r0 = r4.f224784a
            r2 = 2131821610(0x7f11042a, float:1.9275968E38)
            java.lang.String r2 = r0.getString(r2)
            r3 = r19
            nj3.C76879j.m92748s(r0, r2, r3)
            goto L_0x051a
        L_0x0504:
            r2 = 300(0x12c, double:1.48E-321)
            java.lang.Runnable r0 = r4.f224793j
            o40.C61926c.m72667L(r2, r0)
            nl.a r0 = new nl.a
            android.app.Activity r2 = r4.f224784a
            com.tencent.mm.storage.emotion.EmojiInfo r3 = r4.f224787d
            nl.b r5 = new nl.b
            r5.<init>(r4)
            r4 = 0
            r0.<init>(r2, r3, r4, r5)
        L_0x051a:
            return r11
        L_0x051b:
            boolean r0 = r1.mo102175w1(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.component.EmojiComponent.mo102174F0(android.view.MenuItem, ck3.b, com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: R5 */
    public void mo70146R5(Configuration configuration) {
        C92002b bVar = this.f215506f;
        if (bVar != null && bVar.isShowing()) {
            this.f215506f.dismiss();
            this.f215506f = null;
        }
    }

    /* renamed from: g5 */
    public void mo70046g5() {
        Log.m105924i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingEnterAnimEnd]");
        this.f215505e.alive();
        ((C119157j) C119157j.f356862d).mo183875f(new C73345a(this));
    }

    /* renamed from: l2 */
    public void mo70047l2() {
        super.mo70047l2();
        Log.m105924i("MicroMsg.ChattingUI.EmojiComponent", "[onComponentUnInstall]");
        this.f215505e.dead();
    }

    /* renamed from: u5 */
    public void mo26170u5() {
        Log.m105924i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingExitAnimStart]");
        this.f215505e.dead();
    }

    /* renamed from: w1 */
    public boolean mo102175w1(C72963f4 f4Var) {
        Log.m105925i("MicroMsg.ChattingUI.EmojiComponent", "[resendEmoji] %d", Long.valueOf(f4Var.getMsgId()));
        if (f4Var.mo100973L3()) {
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(this.f215752d.mo91565f(), this.f215752d.f193286j.getContentView());
            } else {
                Log.m105918d("MicroMsg.ChattingUI.EmojiComponent", "resendEmoji");
                if (!this.f215752d.mo91577r().equals("medianote")) {
                    ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
                }
                C73673d4.m87249c(f4Var);
            }
            return true;
        } else if (!f4Var.mo101022y3()) {
            return false;
        } else {
            Log.m105918d("MicroMsg.ChattingUI.EmojiComponent", "resendAppMsgEmoji");
            if (!this.f215752d.mo91577r().equals("medianote")) {
                ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C48629h(f4Var.mo108768t(), f4Var.mo108774y2()));
            }
            C73673d4.m87247a(f4Var);
            this.f215752d.mo91541B(true);
            return true;
        }
    }
}
