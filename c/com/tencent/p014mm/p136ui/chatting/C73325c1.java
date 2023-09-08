package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.util.Pair;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.C73313b1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.QueueWorkerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import ht1.C60166f;
import ht1.C60181l;
import ht1.C60200t1;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import s90.C77632o;
import te3.C64378fw2;
import te3.C64682rk1;

/* renamed from: com.tencent.mm.ui.chatting.c1 */
public class C73325c1 implements QueueWorkerThread.ThreadObject {

    /* renamed from: d */
    public final /* synthetic */ C73313b1.C73320g f215438d;

    /* renamed from: e */
    public final /* synthetic */ Context f215439e;

    /* renamed from: f */
    public final /* synthetic */ String f215440f;

    /* renamed from: g */
    public final /* synthetic */ boolean f215441g;

    /* renamed from: h */
    public final /* synthetic */ Runnable f215442h;

    public C73325c1(C73313b1.C73320g gVar, Context context, String str, boolean z, Runnable runnable) {
        this.f215438d = gVar;
        this.f215439e = context;
        this.f215440f = str;
        this.f215441g = z;
        this.f215442h = runnable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:244:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0633  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x06a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean doInBackground() {
        /*
            r17 = this;
            r1 = r17
            com.tencent.mm.ui.chatting.b1$g r0 = r1.f215438d
            r2 = 0
            if (r0 == 0) goto L_0x06a7
            java.util.List<com.tencent.mm.storage.f4> r0 = r0.f215425a
            if (r0 != 0) goto L_0x000d
            goto L_0x06a7
        L_0x000d:
            java.util.Iterator r3 = r0.iterator()
        L_0x0011:
            boolean r0 = r3.hasNext()
            r4 = 1
            if (r0 == 0) goto L_0x06a5
            java.lang.Object r0 = r3.next()
            r12 = r0
            com.tencent.mm.storage.f4 r12 = (com.tencent.p014mm.storage.C72963f4) r12
            android.content.Context r8 = r1.f215439e
            java.lang.String r9 = r1.f215440f
            com.tencent.mm.ui.chatting.b1$g r0 = r1.f215438d
            boolean r11 = r0.f215426b
            java.lang.Class<wo.b> r0 = p740wo.C53193b.class
            com.tencent.mm.ui.chatting.a$c r5 = com.tencent.p014mm.p136ui.chatting.C73304a.C73307c.Samll
            com.tencent.mm.ui.chatting.a$b r6 = com.tencent.p014mm.p136ui.chatting.C73304a.C73306b.Chatroom
            com.tencent.mm.ui.chatting.a$b r7 = com.tencent.p014mm.p136ui.chatting.C73304a.C73306b.Chat
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r13 = new java.lang.Object[r4]
            long r14 = r12.getMsgId()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13[r2] = r14
            java.lang.String r14 = "MicroMsg.ChattingEditModeRetransmitMsg"
            java.lang.String r15 = "retransmitSingleMsg %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r15, r13)
            boolean r13 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88746E(r12)
            if (r13 != 0) goto L_0x06a0
            boolean r13 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88771o(r12)
            if (r13 == 0) goto L_0x0054
            goto L_0x06a0
        L_0x0054:
            java.lang.Class<rn.v> r13 = p227rn.C48053v.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            rn.v r13 = (p227rn.C48053v) r13
            boolean r13 = r13.mo72614OE(r9)
            if (r13 == 0) goto L_0x0087
            boolean r13 = r12.mo100979R3()
            if (r13 != 0) goto L_0x0087
            boolean r13 = r12.mo100993e4()
            if (r13 != 0) goto L_0x0087
            boolean r13 = r12.mo100995g4()
            if (r13 != 0) goto L_0x0087
            java.lang.Object[] r0 = new java.lang.Object[r4]
            int r4 = r12.getType()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0[r2] = r4
            java.lang.String r4 = "not bizChatSupport msg:type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r4, r0)
            goto L_0x06a0
        L_0x0087:
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85846q5(r9)
            r2 = 3
            r4 = 19
            if (r13 == 0) goto L_0x01aa
            boolean r13 = r12.mo100979R3()
            if (r13 == 0) goto L_0x0097
            goto L_0x00b2
        L_0x0097:
            boolean r13 = r12.mo100994f4()
            if (r13 == 0) goto L_0x009e
            goto L_0x00b2
        L_0x009e:
            boolean r13 = r12.mo100989b4()
            if (r13 == 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            boolean r13 = r12.mo100993e4()
            if (r13 == 0) goto L_0x00ac
            goto L_0x00b2
        L_0x00ac:
            boolean r13 = r12.mo100982U3()
            if (r13 == 0) goto L_0x00b5
        L_0x00b2:
            r13 = 0
            goto L_0x01a6
        L_0x00b5:
            boolean r13 = r12.mo100973L3()
            if (r13 == 0) goto L_0x00c8
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821467(0x7f11039b, float:1.9275678E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x00c8:
            boolean r13 = r12.mo100975N3()
            if (r13 == 0) goto L_0x00db
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821544(0x7f1103e8, float:1.9275834E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x00db:
            boolean r13 = r12.mo100995g4()
            if (r13 == 0) goto L_0x00ee
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x00ee:
            boolean r13 = r12.mo101020w3()
            if (r13 == 0) goto L_0x0179
            java.lang.String r13 = r12.getContent()
            java.lang.String r15 = "msg"
            java.lang.String r13 = com.tencent.p014mm.sdk.p134kt.CommonKt.extractSubXmlTag(r13, r15)
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r15 != 0) goto L_0x016d
            cc3.d r15 = new cc3.d
            r15.<init>()
            sm2.a r13 = r15.mo141104j(r13)
            cc3.d r13 = (cc3.C26835d) r13
            int r13 = r13.mo53871H()
            if (r13 == r2) goto L_0x0161
            if (r13 == r4) goto L_0x0155
            r15 = 24
            if (r13 == r15) goto L_0x0149
            r15 = 33
            if (r13 == r15) goto L_0x00b2
            r15 = 51
            if (r13 == r15) goto L_0x013d
            r15 = 74
            if (r13 == r15) goto L_0x00b2
            r15 = 82
            if (r13 == r15) goto L_0x00b2
            r15 = 5
            if (r13 == r15) goto L_0x00b2
            r15 = 6
            if (r13 == r15) goto L_0x00b2
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821615(0x7f11042f, float:1.9275978E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x013d:
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821532(0x7f1103dc, float:1.927581E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x0149:
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821616(0x7f110430, float:1.927598E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x0155:
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821659(0x7f11045b, float:1.9276067E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x0161:
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821602(0x7f110422, float:1.9275952E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x016d:
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r15 = 2131821615(0x7f11042f, float:1.9275978E38)
            java.lang.String r13 = r13.getString(r15)
            goto L_0x0184
        L_0x0179:
            r15 = 2131821615(0x7f11042f, float:1.9275978E38)
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r13 = r13.getString(r15)
        L_0x0184:
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r15 != 0) goto L_0x00b2
            pc0.a0$f r15 = pc0.C100760a0.m131931a(r9)
            r15.f295187a = r9
            r15.f295189c = r13
            int r13 = eb0.C45628s0.m50810y(r9)
            r15.f295190d = r13
            r13 = 0
            r15.f295191e = r13
            r13 = 4
            r15.f295194h = r13
            pc0.a0$b r13 = r15.mo140195a()
            r13.mo123694a()
            r13 = 1
        L_0x01a6:
            if (r13 == 0) goto L_0x01aa
            goto L_0x06a0
        L_0x01aa:
            boolean r13 = r12.mo100979R3()
            if (r13 == 0) goto L_0x01b5
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88752K(r8, r9, r12)
            goto L_0x06a0
        L_0x01b5:
            boolean r13 = r12.mo100994f4()
            if (r13 == 0) goto L_0x01c0
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88755N(r8, r9, r12)
            goto L_0x06a0
        L_0x01c0:
            boolean r13 = r12.mo100989b4()
            if (r13 == 0) goto L_0x01e4
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88755N(r8, r9, r12)
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r2 == 0) goto L_0x01d0
            goto L_0x01d1
        L_0x01d0:
            r6 = r7
        L_0x01d1:
            if (r2 == 0) goto L_0x01de
            di3.d r0 = di3.C86312j.m106911c(r0)
            wo.b r0 = (p740wo.C53193b) r0
            int r0 = r0.mo73729p1(r9)
            goto L_0x01df
        L_0x01de:
            r0 = 0
        L_0x01df:
            com.tencent.p014mm.p136ui.chatting.C73304a.m86447c(r6, r5, r12, r0)
            goto L_0x06a0
        L_0x01e4:
            boolean r13 = r12.mo100993e4()
            if (r13 == 0) goto L_0x01ef
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88754M(r8, r9, r12, r11)
            goto L_0x06a0
        L_0x01ef:
            boolean r13 = r12.mo100987Z3()
            java.lang.String r15 = "MicroMsg.ChattingEditModeLogic"
            java.lang.String r2 = ""
            r4 = 0
            if (r13 == 0) goto L_0x025a
            java.lang.String r0 = "appmsg"
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88756O(r8, r9, r12, r0)
            if (r0 != 0) goto L_0x0204
            goto L_0x06a0
        L_0x0204:
            java.lang.String r0 = r12.getContent()
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r4)
            if (r0 == 0) goto L_0x0242
            int r4 = r0.f195582i
            r5 = 53
            if (r4 == r5) goto L_0x0218
            r5 = 57
            if (r4 != r5) goto L_0x0242
        L_0x0218:
            java.lang.String r0 = r0.mo93550m()
            int r4 = r12.mo108769t2()
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88760d(r0, r4, r11)
            if (r0 == 0) goto L_0x023b
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x022d
            goto L_0x023b
        L_0x022d:
            d62.j r2 = d62.C7250m.m7431a()
            int r4 = eb0.C45628s0.m50810y(r9)
            r5 = 0
            r2.mo136257Tm(r9, r0, r4, r5)
            goto L_0x06a0
        L_0x023b:
            java.lang.String r0 = "Transfer text erro: content null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x06a0
        L_0x0242:
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            if (r0 == 0) goto L_0x024e
            int r0 = r0.f195582i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0250
        L_0x024e:
            java.lang.String r0 = "null"
        L_0x0250:
            r4 = 0
            r2[r4] = r0
            java.lang.String r0 = "sendAppMsgToText fail.(%s)"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r2)
            goto L_0x06a0
        L_0x025a:
            boolean r13 = r12.mo100988a4()
            if (r13 != 0) goto L_0x02f8
            boolean r13 = r12.mo101020w3()
            if (r13 == 0) goto L_0x0268
            goto L_0x02f8
        L_0x0268:
            boolean r0 = r12.mo100975N3()
            if (r0 == 0) goto L_0x029f
            java.lang.String r0 = "friendcard"
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88756O(r8, r9, r12, r0)
            if (r0 != 0) goto L_0x0278
            goto L_0x06a0
        L_0x0278:
            java.lang.String r0 = r12.getContent()
            int r2 = r12.mo108769t2()
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88760d(r0, r2, r11)
            com.tencent.mm.storage.f4$b r2 = com.tencent.p014mm.storage.C72963f4.C72964b.m85654f(r0)
            d62.j r4 = d62.C7250m.m7431a()
            java.lang.String r2 = r2.f212675a
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85843n5(r2)
            if (r2 == 0) goto L_0x0297
            r2 = 66
            goto L_0x0299
        L_0x0297:
            r2 = 42
        L_0x0299:
            r5 = 0
            r4.mo136257Tm(r9, r0, r2, r5)
            goto L_0x06a0
        L_0x029f:
            boolean r0 = r12.mo100981T3()
            if (r0 == 0) goto L_0x02d5
            java.lang.String r0 = "kefucard"
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88756O(r8, r9, r12, r0)
            if (r0 != 0) goto L_0x02af
            goto L_0x06a0
        L_0x02af:
            java.lang.String r0 = r12.getContent()
            int r2 = r12.mo108769t2()
            java.lang.String r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88760d(r0, r2, r11)
            java.lang.Class<he0.h> r2 = he0.C46021h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            he0.h r2 = (he0.C46021h) r2
            ie0.m r2 = r2.mo71455Rm(r0)
            if (r2 == 0) goto L_0x06a0
            d62.j r2 = d62.C7250m.m7431a()
            r4 = 67
            r5 = 0
            r2.mo136257Tm(r9, r0, r4, r5)
            goto L_0x06a0
        L_0x02d5:
            boolean r0 = r12.mo100973L3()
            if (r0 != 0) goto L_0x02ed
            boolean r0 = r12.mo101022y3()
            if (r0 == 0) goto L_0x02e2
            goto L_0x02ed
        L_0x02e2:
            boolean r0 = r12.mo100982U3()
            if (r0 == 0) goto L_0x06a0
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88753L(r8, r9, r12, r11)
            goto L_0x06a0
        L_0x02ed:
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88747F(r12)
            if (r0 != 0) goto L_0x06a0
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88751J(r8, r9, r12)
            goto L_0x06a0
        L_0x02f8:
            boolean r13 = com.tencent.p014mm.storage.C72996z1.m85820U5(r9)
            if (r13 == 0) goto L_0x02ff
            goto L_0x0300
        L_0x02ff:
            r6 = r7
        L_0x0300:
            if (r13 == 0) goto L_0x030d
            di3.d r0 = di3.C86312j.m106911c(r0)
            wo.b r0 = (p740wo.C53193b) r0
            int r0 = r0.mo73729p1(r9)
            goto L_0x030e
        L_0x030d:
            r0 = 0
        L_0x030e:
            com.tencent.p014mm.p136ui.chatting.C73304a.m86447c(r6, r5, r12, r0)
            boolean r0 = r12.mo101022y3()
            r5 = 2
            if (r0 == 0) goto L_0x0393
            java.lang.String r0 = "appEmoji"
            boolean r0 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88756O(r8, r9, r12, r0)
            if (r0 != 0) goto L_0x0322
            goto L_0x06a0
        L_0x0322:
            java.lang.String r0 = r12.getContent()
            com.tencent.mm.storage.o2 r2 = new com.tencent.mm.storage.o2
            r2.<init>(r0)
            java.lang.String r0 = r12.getContent()
            java.lang.String r4 = r12.mo108775z2()
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r4)
            if (r0 != 0) goto L_0x0342
            com.tencent.mm.message.l$b r0 = new com.tencent.mm.message.l$b
            r0.<init>()
            java.lang.String r4 = r2.f212821d
            r0.f195610p = r4
        L_0x0342:
            java.lang.String r4 = r0.f195610p
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x038c
            java.lang.String r4 = r0.f195610p
            java.lang.String r6 = "-1"
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L_0x0355
            goto L_0x038c
        L_0x0355:
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r5 = 0
            r4[r5] = r9
            java.lang.String r5 = r0.f195610p
            r6 = 1
            r4[r6] = r5
            java.lang.String r5 = "jacks send App Emoji: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r5, r4)
            java.lang.Class<z51.g> r4 = z51.C39315g.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            z51.g r4 = (z51.C39315g) r4
            zc3.a r4 = r4.mo58035cm()
            java.lang.String r0 = r0.f195610p
            i61.h r4 = (i61.C98602h) r4
            com.tencent.mm.storage.emotion.EmojiInfo r0 = r4.mo137999G(r0)
            if (r0 == 0) goto L_0x037f
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88764h(r0, r9)
            goto L_0x06a0
        L_0x037f:
            r4 = 1
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = "emoji is null. content:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r0)
            goto L_0x06a0
        L_0x038c:
            java.lang.String r0 = "emoji md5 is null. ignore resend"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r0)
            goto L_0x06a0
        L_0x0393:
            boolean r0 = r12.mo100967F3()
            if (r0 == 0) goto L_0x04f6
            java.lang.Class<gw0.b> r0 = gw0.C76073b.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x04df }
            gw0.b r0 = (gw0.C76073b) r0     // Catch:{ Exception -> 0x04df }
            long r5 = r12.getMsgId()     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r12.getContent()     // Catch:{ Exception -> 0x04df }
            s90.f r0 = r0.mo94597JZ(r5, r7)     // Catch:{ Exception -> 0x04df }
            java.util.LinkedList<s90.j> r5 = r0.f226295i     // Catch:{ Exception -> 0x04df }
            if (r5 == 0) goto L_0x06a0
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x04df }
            r7 = r11
            r6 = 0
        L_0x03b7:
            boolean r10 = r5.hasNext()     // Catch:{ Exception -> 0x04df }
            if (r10 == 0) goto L_0x06a0
            java.lang.Object r10 = r5.next()     // Catch:{ Exception -> 0x04df }
            s90.j r10 = (s90.C77630j) r10     // Catch:{ Exception -> 0x04df }
            com.tencent.mm.message.l$b r13 = new com.tencent.mm.message.l$b     // Catch:{ Exception -> 0x04df }
            r13.<init>()     // Catch:{ Exception -> 0x04df }
            java.lang.String r14 = r10.f226336r     // Catch:{ Exception -> 0x04df }
            sg.g<java.lang.Long, s90.i> r16 = com.tencent.p014mm.message.C92721n.f266840a     // Catch:{ Exception -> 0x04df }
            boolean r14 = kb0.C9576e.m9260a(r14)     // Catch:{ Exception -> 0x04df }
            if (r14 == 0) goto L_0x03de
            com.tencent.mm.message.l$b r13 = com.tencent.p014mm.p136ui.chatting.C73687g1.m87263a(r9, r10)     // Catch:{ Exception -> 0x04df }
            java.lang.String r10 = r10.f226341w     // Catch:{ Exception -> 0x04df }
            com.tencent.p014mm.p136ui.chatting.C73687g1.m87265c(r9, r7, r13, r10)     // Catch:{ Exception -> 0x04df }
            r4 = r0
            goto L_0x04d7
        L_0x03de:
            java.lang.String r7 = r10.f226325d     // Catch:{ Exception -> 0x04df }
            r13.f195570f = r7     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r10.f226332n     // Catch:{ Exception -> 0x04df }
            r13.f195574g = r7     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = "view"
            r13.f195578h = r7     // Catch:{ Exception -> 0x04df }
            r7 = 5
            r13.f195582i = r7     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r10.f226326e     // Catch:{ Exception -> 0x04df }
            r13.f195586j = r7     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r0.f226292f     // Catch:{ Exception -> 0x04df }
            r13.f195634v = r7     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r0.f226293g     // Catch:{ Exception -> 0x04df }
            r13.f195638w = r7     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r0.f226294h     // Catch:{ Exception -> 0x04df }
            r13.f195642x = r7     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = com.tencent.p014mm.message.C92721n.m116882j(r10)     // Catch:{ Exception -> 0x04df }
            r13.f195646y = r7     // Catch:{ Exception -> 0x04df }
            com.tencent.mm.message.f r7 = new com.tencent.mm.message.f     // Catch:{ Exception -> 0x04df }
            r7.<init>()     // Catch:{ Exception -> 0x04df }
            int r14 = r10.f226333o     // Catch:{ Exception -> 0x04df }
            r7.f195417b = r14     // Catch:{ Exception -> 0x04df }
            int r4 = r10.f226317I     // Catch:{ Exception -> 0x04df }
            r7.f195423h = r4     // Catch:{ Exception -> 0x04df }
            r4 = 5
            if (r14 != r4) goto L_0x042b
            java.lang.String r4 = r10.f226315G     // Catch:{ Exception -> 0x04df }
            r7.f195425j = r4     // Catch:{ Exception -> 0x04df }
            r4 = r0
            long r0 = r10.f226329h     // Catch:{ Exception -> 0x04df }
            int r1 = (int) r0     // Catch:{ Exception -> 0x04df }
            r7.f195418c = r1     // Catch:{ Exception -> 0x04df }
            int r0 = r10.f226335q     // Catch:{ Exception -> 0x04df }
            r7.f195419d = r0     // Catch:{ Exception -> 0x04df }
            int r0 = r10.f226313E     // Catch:{ Exception -> 0x04df }
            r7.f195420e = r0     // Catch:{ Exception -> 0x04df }
            int r0 = r10.f226314F     // Catch:{ Exception -> 0x04df }
            r7.f195421f = r0     // Catch:{ Exception -> 0x04df }
            goto L_0x042c
        L_0x042b:
            r4 = r0
        L_0x042c:
            r13.mo93545f(r7)     // Catch:{ Exception -> 0x04df }
            java.lang.String r0 = r13.f195646y     // Catch:{ Exception -> 0x04df }
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x04df }
            if (r0 == 0) goto L_0x0455
            java.lang.Class<ln.g> r0 = p196ln.C76706g.class
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ Exception -> 0x04df }
            ln.g r0 = (p196ln.C76706g) r0     // Catch:{ Exception -> 0x04df }
            ln.n r0 = r0.mo106832eg()     // Catch:{ Exception -> 0x04df }
            java.lang.String r1 = r12.mo108768t()     // Catch:{ Exception -> 0x04df }
            com.tencent.mm.modelavatar.o r0 = (com.tencent.p014mm.modelavatar.C68098o) r0     // Catch:{ Exception -> 0x04df }
            com.tencent.mm.modelavatar.n r0 = r0.mo93607Lo(r1)     // Catch:{ Exception -> 0x04df }
            if (r0 == 0) goto L_0x0455
            java.lang.String r0 = r0.mo93594c()     // Catch:{ Exception -> 0x04df }
            r13.f195646y = r0     // Catch:{ Exception -> 0x04df }
        L_0x0455:
            r0 = 0
            java.lang.String r1 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r13, r0, r0)     // Catch:{ Exception -> 0x04df }
            int r0 = r10.f226333o     // Catch:{ Exception -> 0x04df }
            r7 = 5
            if (r0 != r7) goto L_0x04a5
            java.lang.String r0 = r12.getContent()     // Catch:{ Exception -> 0x04df }
            java.util.Map r0 = com.tencent.p014mm.sdk.platformtools.SemiXml.decode(r0)     // Catch:{ Exception -> 0x04df }
            if (r0 == 0) goto L_0x04cf
            if (r6 != 0) goto L_0x046d
            r7 = r2
            goto L_0x047c
        L_0x046d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04df }
            r7.<init>()     // Catch:{ Exception -> 0x04df }
            r7.append(r6)     // Catch:{ Exception -> 0x04df }
            r7.append(r2)     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x04df }
        L_0x047c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04df }
            r10.<init>()     // Catch:{ Exception -> 0x04df }
            java.lang.String r13 = ".msg.appmsg.mmreader.category.item"
            r10.append(r13)     // Catch:{ Exception -> 0x04df }
            r10.append(r7)     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x04df }
            java.lang.Class<ht1.p4> r10 = ht1.C60193p4.class
            di3.d r10 = di3.C86312j.m106911c(r10)     // Catch:{ Exception -> 0x04df }
            ht1.p4 r10 = (ht1.C60193p4) r10     // Catch:{ Exception -> 0x04df }
            java.lang.String r0 = r10.D90(r7, r0)     // Catch:{ Exception -> 0x04df }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)     // Catch:{ Exception -> 0x04df }
            if (r7 != 0) goto L_0x04cf
            java.lang.String r1 = "biz enter finder logic"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)     // Catch:{ Exception -> 0x04df }
            goto L_0x04ce
        L_0x04a5:
            r7 = 19
            if (r0 != r7) goto L_0x04cf
            sj3.p r0 = sj3.C63941p.f181254a     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r12.getContent()     // Catch:{ Exception -> 0x04df }
            s90.h r7 = r0.mo88706d(r7, r6)     // Catch:{ Exception -> 0x04df }
            java.lang.String r10 = r7.f180629g     // Catch:{ Exception -> 0x04df }
            java.lang.String r7 = r7.f180628f     // Catch:{ Exception -> 0x04df }
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.mo88705c(r10, r7)     // Catch:{ Exception -> 0x04df }
            if (r0 == 0) goto L_0x04cf
            java.lang.Class<ht1.m4> r1 = ht1.C60186m4.class
            di3.d r1 = di3.C86312j.m106911c(r1)     // Catch:{ Exception -> 0x04df }
            ht1.m4 r1 = (ht1.C60186m4) r1     // Catch:{ Exception -> 0x04df }
            com.tencent.mm.message.l$b r0 = r1.mo85186PP(r0)     // Catch:{ Exception -> 0x04df }
            r1 = 0
            java.lang.String r0 = com.tencent.p014mm.message.C68070l.C68072b.m80420s(r0, r1, r1)     // Catch:{ Exception -> 0x04df }
        L_0x04ce:
            r1 = r0
        L_0x04cf:
            int r0 = r12.mo108769t2()     // Catch:{ Exception -> 0x04df }
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88750I(r8, r9, r1, r0, r11)     // Catch:{ Exception -> 0x04df }
            r7 = r11
        L_0x04d7:
            int r6 = r6 + 1
            r1 = r17
            r0 = r4
            r4 = 0
            goto L_0x03b7
        L_0x04df:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r2, r4)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getLocalizedMessage()
            r2[r1] = r0
            java.lang.String r0 = "[oneliang]retransmit multi app msg error : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r15, r0, r2)
            goto L_0x06a0
        L_0x04f6:
            boolean r0 = r12.mo101016t3()
            if (r0 == 0) goto L_0x050d
            java.lang.Class<hg.d> r0 = p548hg.C98450d.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            hg.d r0 = (p548hg.C98450d) r0
            long r1 = r12.getMsgId()
            r0.es0(r8, r9, r1)
            goto L_0x06a0
        L_0x050d:
            int r0 = r12.mo108769t2()
            if (r0 != 0) goto L_0x051c
            java.lang.String r0 = r12.getContent()
            java.lang.String r0 = eb0.C75604z3.m90849u(r0)
            goto L_0x0520
        L_0x051c:
            java.lang.String r0 = r12.getContent()
        L_0x0520:
            r1 = 0
            com.tencent.mm.message.l$b r4 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r1)
            if (r4 != 0) goto L_0x052e
            java.lang.String r0 = "parse app message content fail"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r0)
            goto L_0x06a0
        L_0x052e:
            java.lang.Class<ym.l> r1 = p763ym.C79138l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ym.l r1 = (p763ym.C79138l) r1
            java.lang.String r6 = r4.f195562d
            r7 = 0
            com.tencent.mm.pluginsdk.model.app.j r1 = r1.mo73990GW(r6, r7)
            if (r1 == 0) goto L_0x054c
            boolean r1 = r1.mo69359k()
            if (r1 == 0) goto L_0x054c
            java.lang.String r0 = "do not forward game msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            goto L_0x06a0
        L_0x054c:
            int r1 = r4.f195582i
            r6 = 19
            if (r1 != r6) goto L_0x0565
            com.tencent.mm.autogen.events.RecordOperationEvent r0 = new com.tencent.mm.autogen.events.RecordOperationEvent
            r0.<init>()
            com.tencent.mm.autogen.events.RecordOperationEvent$a r1 = r0.f265027d
            r2 = 4
            r1.f265029a = r2
            r1.f265039k = r12
            r1.f265033e = r9
            r0.publish()
            goto L_0x06a0
        L_0x0565:
            r6 = 6
            if (r1 != r6) goto L_0x0635
            java.lang.String r1 = r4.f195650z
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0635
            java.lang.String r1 = r4.f195650z
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x058f
            java.lang.String r1 = r4.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r1)
            if (r1 != 0) goto L_0x0595
            long r6 = r12.getMsgId()
            r1 = 0
            com.tencent.p014mm.pluginsdk.model.app.C72695v.m85072n(r6, r0, r1)
            java.lang.String r0 = r4.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r0)
            goto L_0x0595
        L_0x058f:
            java.lang.String r0 = r4.f195606o
            com.tencent.mm.pluginsdk.model.app.d r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85065g(r0)
        L_0x0595:
            if (r1 == 0) goto L_0x05b1
            com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = r1.field_fileFullPath
            r0.<init>((java.lang.String) r6)
            boolean r6 = r0.mo119967g()
            if (r6 == 0) goto L_0x05b1
            long r6 = r0.mo119980r()
            r15 = r14
            long r13 = r1.field_totalLen
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x05b2
            r0 = 1
            goto L_0x05b3
        L_0x05b1:
            r15 = r14
        L_0x05b2:
            r0 = 0
        L_0x05b3:
            if (r0 != 0) goto L_0x0633
            gi.g r0 = new gi.g
            r0.<init>()
            java.lang.String r5 = "task_ChattingEditModeRetransmitMsg"
            r0.f287660d = r5
            com.tencent.mm.ui.chatting.d1 r13 = new com.tencent.mm.ui.chatting.d1
            r5 = r13
            r6 = r4
            r7 = r1
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.f287662f = r13
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            java.lang.String r7 = r12.mo108768t()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            long r9 = r12.getMsgId()
            r8.append(r9)
            java.lang.String r2 = r8.toString()
            java.lang.String r8 = "checkExist"
            java.lang.String r2 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r8, r5, r7, r2)
            r0.field_mediaId = r2
            java.lang.String r2 = r4.f195524R
            r0.field_aesKey = r2
            r2 = 19
            r0.field_fileType = r2
            java.lang.String r2 = r4.f195472C
            r0.field_authKey = r2
            java.lang.String r2 = r4.f195650z
            r0.f287672s = r2
            if (r1 == 0) goto L_0x060c
            java.lang.String r2 = r1.field_fileFullPath
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x060c
            java.lang.String r1 = r1.field_fileFullPath
            r0.field_fullpath = r1
            goto L_0x061e
        L_0x060c:
            eb0.c r1 = eb0.C97625j3.m125812b()
            java.lang.String r1 = r1.mo105889d()
            java.lang.String r2 = r4.f195570f
            java.lang.String r4 = r4.f195602n
            java.lang.String r1 = com.tencent.p014mm.pluginsdk.model.app.C72695v.m85063e(r1, r2, r4)
            r0.field_fullpath = r1
        L_0x061e:
            java.lang.Class<qo.l> r1 = p663qo.C101213l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            qo.l r1 = (p663qo.C101213l) r1
            boolean r0 = r1.xf0(r0)
            if (r0 != 0) goto L_0x06a0
            java.lang.String r0 = "openim attach download failed before rescend"
            r1 = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            goto L_0x06a0
        L_0x0633:
            r1 = r15
            goto L_0x0636
        L_0x0635:
            r1 = r14
        L_0x0636:
            int r0 = r4.f195582i
            r6 = 5
            if (r0 != r6) goto L_0x069d
            java.lang.String r0 = r4.f195586j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x069d
            java.lang.String r0 = r4.f195586j     // Catch:{ UnsupportedEncodingException -> 0x064d }
            java.lang.String r6 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x064d }
            r6 = 0
            goto L_0x0654
        L_0x064d:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r2, r7)
        L_0x0654:
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r7 = 6
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r7 = 13378(0x3442, float:1.8747E-41)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            r0[r6] = r15
            java.lang.String r4 = r4.f195586j
            r6 = 1
            r0[r6] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r0[r5] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r0[r6] = r4
            r4 = 4
            r0[r4] = r10
            r4 = 5
            r0[r4] = r10
            java.lang.String r6 = "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r6, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r4 = 0
            r1[r4] = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            r4 = 1
            r1[r4] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1[r5] = r2
            r2 = 3
            r1[r2] = r10
            r2 = 4
            r1[r2] = r10
            r0.mo160131h(r7, r1)
        L_0x069d:
            com.tencent.p014mm.p136ui.chatting.C74343y0.m88749H(r8, r9, r12, r11)
        L_0x06a0:
            r1 = r17
            r2 = 0
            goto L_0x0011
        L_0x06a5:
            r1 = 1
            return r1
        L_0x06a7:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.C73325c1.doInBackground():boolean");
    }

    public boolean onPostExecute() {
        C60181l lVar;
        C60166f fVar;
        Class cls = C60200t1.class;
        if (this.f215438d.f215425a != null) {
            C115669n.INSTANCE.mo160131h(10811, 5, Integer.valueOf(this.f215438d.f215425a.size()), Integer.valueOf(this.f215438d.f215425a.size() - C74343y0.m88761e(this.f215438d.f215425a)));
        }
        List<C72963f4> list = this.f215438d.f215425a;
        if (list != null) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            for (C72963f4 next : list) {
                if (next.mo101020w3()) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(next.getContent()), (String) null);
                    if (!(u == null || u.f195582i != 51 || (fVar = (C60166f) u.mo93555w(C60166f.class)) == null)) {
                        C64682rk1 rk12 = fVar.f171710b;
                        linkedList.add(new Pair(rk12.f185183d, rk12.f185191o));
                    }
                    if (!(u == null || u.f195582i != 71 || (lVar = (C60181l) u.mo93555w(C60181l.class)) == null)) {
                        C64378fw2 fw22 = lVar.f171715b;
                        linkedList2.add(new Pair(fw22.f183241d, fw22.f183248n));
                    }
                }
            }
            if (!Util.isNullOrNil((List) linkedList)) {
                ((C60200t1) C86312j.m106911c(cls)).Tr0(linkedList, false);
            }
            if (!Util.isNullOrNil((List) linkedList2)) {
                ((C60200t1) C86312j.m106911c(cls)).Tr0(linkedList2, true);
            }
        }
        if (this.f215441g) {
            if (this.f215442h != null) {
                Log.m105926v("MicroMsg.ChattingEditModeRetransmitMsg", "call back is not null, do call back");
                this.f215442h.run();
            }
            WeakReference<C77632o> weakReference = this.f215438d.f215427c;
            if (!(weakReference == null || weakReference.get() == null)) {
                this.f215438d.f215427c.get().mo22502r7(C77632o.C77633a.trans);
            }
            C73313b1.C73320g gVar = this.f215438d;
            if (gVar != null) {
                gVar.f215425a = null;
                gVar.f215426b = false;
                gVar.f215427c = null;
                gVar.f215428d = null;
                gVar.f215429e = null;
                gVar.f215430f = null;
            }
            C73313b1.C73320g gVar2 = C73313b1.f215414a;
            gVar2.f215425a = null;
            gVar2.f215426b = false;
            gVar2.f215427c = null;
            gVar2.f215428d = null;
            gVar2.f215429e = null;
            gVar2.f215430f = null;
        }
        return true;
    }
}
