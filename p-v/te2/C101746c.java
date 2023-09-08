package te2;

import a14.C53934p0;
import com.tencent.p014mm.plugin.priority.model.precheck.downloader.C2CMsgPreDownloader;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tenpay.tsm.TSMException;
import di3.C86312j;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import ke2.C99129c;
import p749xh.C102676x0;
import rx3.C36570n;
import ue2.C102006d;
import wx3.C15601d;
import xe2.C102630a;
import xe2.C102631b;

/* renamed from: te2.c */
public final class C101746c extends C98597b {

    /* renamed from: f */
    public final int f297822f = -10041;

    /* renamed from: g */
    public final int f297823g = -5103059;

    /* renamed from: h */
    public final int f297824h = TSMException.ERR_ARG_IN;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101746c(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "plugin");
    }

    /* renamed from: g3 */
    public final void mo141174g3(String str) {
        C87412m.m108594g(str, "msgId");
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        cVar.f290673z.mo142290g3(str, 5);
        Log.m105924i("MicroMsg.C2CPreDownloadPLC", "c2c pre download: downloaded by other way, msgSvrId_type:" + str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x04c9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0529  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141175i3(com.tencent.p014mm.storage.C72963f4 r36) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            java.lang.Class<ke2.c> r2 = ke2.C99129c.class
            java.lang.String r3 = "msg"
            gy3.C87412m.m108594g(r1, r3)
            boolean r3 = r36.mo100979R3()
            java.lang.String r4 = "MicroMsg.C2CPreDownloadStorage"
            java.lang.String r5 = ", msgPd:"
            java.lang.String r6 = ", priority:"
            java.lang.String r7 = ", clientPriority:"
            java.lang.String r8 = ", serverPriority:"
            java.lang.String r9 = ", totalLen:"
            java.lang.String r10 = ", fromUser:"
            java.lang.String r11 = ", svrId_msgType:"
            java.lang.String r12 = "msgInfo.talker"
            java.lang.String r13 = ", msgPd is Null:"
            java.lang.String r14 = ", msgId:"
            java.lang.String r15 = ", msgSvrId:"
            java.lang.String r0 = "MicroMsg.C2CPreDownloadPLC"
            r16 = r0
            if (r3 == 0) goto L_0x0339
            te2.g$b r3 = te2.C101750g.f297828a
            java.lang.String r0 = r1.f230724G
            te2.g$c r0 = r3.mo141186f(r0)
            di3.d r2 = di3.C86312j.m106911c(r2)
            ke2.c r2 = (ke2.C99129c) r2
            r2.requireAccountInitialized()
            xe2.b r2 = r2.f290673z
            r2.getClass()
            xe2.a r1 = new xe2.a
            r1.<init>()
            r25 = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r26 = r14
            r27 = r15
            long r14 = r36.mo108774y2()
            r13.append(r14)
            java.lang.String r14 = "_1"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r1.mo142461D2(r13)
            r15 = r14
            long r13 = r36.getMsgId()
            r1.setMsgId(r13)
            long r13 = r36.getCreateTime()
            r1.mo142484y2(r13)
            java.lang.String r13 = r36.mo101010p2()
            r1.mo142458A2(r13)
            r13 = 1
            r1.mo142466d(r13)
            r1.mo142462E2(r13)
            java.lang.String r13 = r36.mo108768t()
            gy3.C87412m.m108593f(r13, r12)
            r13 = 40
            r1.mo142483x2(r13)
            int r13 = r0.f297833b
            r1.mo142464G2(r13)
            java.lang.String r13 = r36.mo108768t()
            gy3.C87412m.m108593f(r13, r12)
            int r13 = r3.mo141184d(r13)
            r1.mo142459B2(r13)
            int r13 = r1.mo142471m2()
            int r14 = r1.mo142480u2()
            r28 = r15
            int r15 = r1.mo142474p2()
            r29 = r12
            r12 = 1
            int r13 = r3.mo141181a(r13, r14, r12, r15)
            r1.mo142463F2(r13)
            int r12 = r0.f297834c
            r1.mo142485z2(r12)
            long r12 = r0.f297832a
            r1.mo142465H2(r12)
            long r12 = r0.f297832a
            r1.mo142460C2(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "c2c pre download storage insert mid image, msgId:"
            r12.append(r13)
            long r13 = r1.getMsgId()
            r12.append(r13)
            r12.append(r11)
            java.lang.String r13 = r1.mo142476r2()
            r12.append(r13)
            r12.append(r10)
            java.lang.String r13 = r1.mo142473o2()
            r12.append(r13)
            r12.append(r9)
            long r13 = r1.mo142481v2()
            r12.append(r13)
            r12.append(r8)
            int r13 = r1.mo142480u2()
            r12.append(r13)
            r12.append(r7)
            int r13 = r1.mo142471m2()
            r12.append(r13)
            r12.append(r6)
            int r13 = r1.mo142479t2()
            r12.append(r13)
            r12.append(r5)
            int r13 = r0.f297834c
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 14
            r24 = 0
            r18 = r2
            r19 = r1
            boolean r12 = com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.insert$default(r18, r19, r20, r21, r22, r23, r24)
            if (r12 != 0) goto L_0x015d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "c2c pre download storage insert mid image error, msgId:"
            r13.append(r14)
            long r14 = r1.getMsgId()
            r13.append(r14)
            r13.append(r11)
            java.lang.String r14 = r1.mo142476r2()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r13)
        L_0x015d:
            java.lang.Class<gt.k> r13 = p158gt.C98201k.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            gt.k r13 = (p158gt.C98201k) r13
            gt.m r13 = r13.mo137277xi()
            java.lang.String r14 = r36.mo108768t()
            r15 = r4
            r18 = r5
            long r4 = r36.mo108774y2()
            com.tencent.mm.modelimage.m r13 = (com.tencent.p014mm.modelimage.C92839m) r13
            com.tencent.mm.modelimage.k r4 = r13.mo127168NQ(r14, r4)
            boolean r4 = r4.mo127145p()
            java.lang.String r13 = "_2"
            if (r4 == 0) goto L_0x029b
            xe2.a r4 = new xe2.a
            r4.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r19 = r6
            long r5 = r36.mo108774y2()
            r14.append(r5)
            r14.append(r13)
            java.lang.String r5 = r14.toString()
            r4.mo142461D2(r5)
            long r5 = r36.getMsgId()
            r4.setMsgId(r5)
            long r5 = r36.getCreateTime()
            r4.mo142484y2(r5)
            java.lang.String r5 = r36.mo101010p2()
            r4.mo142458A2(r5)
            r5 = 1
            r4.mo142466d(r5)
            r5 = 2
            r4.mo142462E2(r5)
            long r5 = r0.f297835d
            r4.mo142465H2(r5)
            long r5 = r0.f297835d
            r4.mo142460C2(r5)
            java.lang.String r5 = r36.mo108768t()
            r6 = r29
            gy3.C87412m.m108593f(r5, r6)
            r5 = 40
            r4.mo142483x2(r5)
            int r5 = r0.f297836e
            r4.mo142464G2(r5)
            java.lang.String r5 = r36.mo108768t()
            gy3.C87412m.m108593f(r5, r6)
            int r5 = r3.mo141184d(r5)
            r4.mo142459B2(r5)
            int r5 = r1.mo142471m2()
            int r6 = r1.mo142480u2()
            int r14 = r1.mo142474p2()
            r17 = r15
            r15 = 2
            int r5 = r3.mo141181a(r5, r6, r15, r14)
            r4.mo142463F2(r5)
            int r5 = r0.f297837f
            r4.mo142485z2(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "c2c pre download storage insert large image, msgId:"
            r5.append(r6)
            long r14 = r4.getMsgId()
            r5.append(r14)
            r5.append(r11)
            java.lang.String r6 = r4.mo142476r2()
            r5.append(r6)
            r5.append(r10)
            java.lang.String r6 = r4.mo142473o2()
            r5.append(r6)
            r5.append(r9)
            long r9 = r4.mo142481v2()
            r5.append(r9)
            r5.append(r8)
            int r6 = r4.mo142480u2()
            r5.append(r6)
            r5.append(r7)
            int r6 = r4.mo142471m2()
            r5.append(r6)
            r14 = r19
            r5.append(r14)
            int r6 = r4.mo142479t2()
            r5.append(r6)
            r15 = r18
            r5.append(r15)
            int r6 = r0.f297837f
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 14
            r24 = 0
            r18 = r2
            r19 = r4
            boolean r2 = com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.insert$default(r18, r19, r20, r21, r22, r23, r24)
            if (r2 != 0) goto L_0x029c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "c2c pre download storage insert large image error, msgId:"
            r4.append(r5)
            long r7 = r1.getMsgId()
            r4.append(r7)
            r4.append(r11)
            java.lang.String r1 = r1.mo142476r2()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            goto L_0x029c
        L_0x029b:
            r2 = 1
        L_0x029c:
            if (r12 == 0) goto L_0x02a2
            if (r2 == 0) goto L_0x02a2
            r1 = 1
            goto L_0x02a3
        L_0x02a2:
            r1 = 0
        L_0x02a3:
            if (r1 != 0) goto L_0x02e1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "c2c pre download Error: addQuotaTask Failed, insert image failed, msgType:"
            r0.append(r1)
            int r1 = r36.getType()
            r0.append(r1)
            r1 = r27
            r0.append(r1)
            long r1 = r36.mo108774y2()
            r0.append(r1)
            r3 = r26
            r0.append(r3)
            long r1 = r36.getMsgId()
            r0.append(r1)
            r4 = r25
            r0.append(r4)
            r1 = 0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            return
        L_0x02e1:
            int r1 = r0.f297834c
            r2 = 1
            if (r1 != r2) goto L_0x030b
            java.lang.String r1 = r36.mo108768t()
            int r1 = r3.mo141183c(r2, r1)
            if (r1 == 0) goto L_0x030b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            long r4 = r36.mo108774y2()
            r1.append(r4)
            r2 = r28
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5 = r35
            r5.mo141178l3(r1)
            goto L_0x0310
        L_0x030b:
            r5 = r35
            r35.mo141177k3()
        L_0x0310:
            int r0 = r0.f297837f
            r1 = 1
            if (r0 != r1) goto L_0x0336
            java.lang.String r0 = r36.mo108768t()
            r1 = 2
            int r0 = r3.mo141183c(r1, r0)
            if (r0 == 0) goto L_0x0336
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r36.mo108774y2()
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r5.mo141178l3(r0)
        L_0x0336:
            r15 = r5
            goto L_0x075a
        L_0x0339:
            r0 = r4
            r4 = r13
            r3 = r14
            r1 = r15
            r15 = r5
            r14 = r6
            r6 = r12
            r12 = r16
            r5 = r35
            boolean r13 = r36.mo100994f4()
            if (r13 == 0) goto L_0x055a
            te2.g$b r13 = te2.C101750g.f297828a
            r5 = r36
            r18 = r12
            java.lang.String r12 = r5.f230724G
            java.lang.String r5 = "msgsource"
            r25 = r4
            r4 = 0
            java.util.Map r4 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r12, r5, r4)
            bp3.p r5 = bp3.C79758p.f233760a
            of3.f r12 = new of3.f
            r12.<init>()
            int r5 = r5.mo109883f(r12)
            r12 = r0
            r27 = r1
            if (r4 == 0) goto L_0x03ca
            java.lang.String r0 = ".msgsource.videomsg_pd.$cdnvideourl_pd_pri"
            boolean r1 = r4.containsKey(r0)
            if (r1 != 0) goto L_0x037b
            r16 = r14
            r21 = r15
            r0 = 0
            goto L_0x03d1
        L_0x037b:
            java.lang.String r1 = ".msgsource.videomsg_pd.$cdnvideourl_size"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r16 = r14
            r21 = r15
            r14 = 0
            long r19 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r14)
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            int r5 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            java.lang.String r0 = ".msgsource.videomsg_pd.$cdnvideourl_pd"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            java.lang.String r1 = ".msgsource.videomsg_pd.$cdnrawvideourl_size"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.p014mm.sdk.platformtools.Util.getLong(r1, r14)
            java.lang.String r1 = ".msgsource.videomsg_pd.$cdnrawvideourl_pd_pri"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r14 = 0
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r14)
            java.lang.String r1 = ".msgsource.videomsg_pd.$cdnrawvideourl_pd"
            java.lang.Object r1 = r4.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r14)
            r4 = r0
            r0 = r19
            goto L_0x03d2
        L_0x03ca:
            r16 = r14
            r21 = r15
            r14 = 0
            r0 = r14
        L_0x03d1:
            r4 = 0
        L_0x03d2:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ke2.c r2 = (ke2.C99129c) r2
            r2.requireAccountInitialized()
            xe2.b r2 = r2.f290673z
            r2.getClass()
            xe2.a r14 = new xe2.a
            r14.<init>()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r19 = r2
            r26 = r3
            long r2 = r36.mo108774y2()
            r15.append(r2)
            java.lang.String r2 = "_3"
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            r14.mo142461D2(r2)
            long r2 = r36.getCreateTime()
            r14.mo142484y2(r2)
            java.lang.String r2 = r36.mo101010p2()
            r14.mo142458A2(r2)
            r2 = 1
            r14.mo142466d(r2)
            long r2 = r36.getMsgId()
            r14.setMsgId(r2)
            r2 = 3
            r14.mo142462E2(r2)
            java.lang.String r3 = r36.mo108768t()
            gy3.C87412m.m108593f(r3, r6)
            r3 = 40
            r14.mo142483x2(r3)
            r14.mo142464G2(r5)
            r14.mo142485z2(r4)
            r14.mo142465H2(r0)
            r14.mo142460C2(r0)
            java.lang.String r0 = r36.mo108768t()
            gy3.C87412m.m108593f(r0, r6)
            int r0 = r13.mo141184d(r0)
            r14.mo142459B2(r0)
            int r0 = r14.mo142471m2()
            int r1 = r14.mo142480u2()
            int r3 = r14.mo142474p2()
            int r0 = r13.mo141181a(r0, r1, r2, r3)
            r14.mo142463F2(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "c2c pre download storage insert video, msgId:"
            r0.append(r1)
            long r1 = r14.getMsgId()
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = r14.mo142476r2()
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = r14.mo142473o2()
            r0.append(r1)
            r0.append(r9)
            long r1 = r14.mo142481v2()
            r0.append(r1)
            r0.append(r8)
            int r1 = r14.mo142480u2()
            r0.append(r1)
            r0.append(r7)
            int r1 = r14.mo142471m2()
            r0.append(r1)
            r1 = r16
            r0.append(r1)
            int r1 = r14.mo142479t2()
            r0.append(r1)
            r3 = r21
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 14
            r34 = 0
            r28 = r19
            r29 = r14
            boolean r0 = com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.insert$default(r28, r29, r30, r31, r32, r33, r34)
            if (r0 != 0) goto L_0x04eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "c2c pre download storage insert video error, msgId:"
            r1.append(r2)
            long r2 = r14.getMsgId()
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = r14.mo142476r2()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r1)
        L_0x04eb:
            if (r0 != 0) goto L_0x0529
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "c2c pre download Error: addQuotaTask Failed, insert video failed, msgType:"
            r0.append(r1)
            int r1 = r36.getType()
            r0.append(r1)
            r4 = r27
            r0.append(r4)
            long r1 = r36.mo108774y2()
            r0.append(r1)
            r5 = r26
            r0.append(r5)
            long r1 = r36.getMsgId()
            r0.append(r1)
            r13 = r25
            r0.append(r13)
            r1 = 0
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r0)
            return
        L_0x0529:
            r0 = 1
            if (r4 != r0) goto L_0x0553
            r0 = 3
            java.lang.String r1 = r36.mo108768t()
            int r0 = r13.mo141183c(r0, r1)
            if (r0 == 0) goto L_0x0553
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r36.mo108774y2()
            r0.append(r1)
            java.lang.String r1 = "_3"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r15 = r35
            r15.mo141178l3(r0)
            goto L_0x075a
        L_0x0553:
            r15 = r35
            r35.mo141177k3()
            goto L_0x075a
        L_0x055a:
            r5 = r3
            r13 = r4
            r3 = r15
            r15 = r35
            r4 = r1
            r1 = r14
            r14 = r12
            r12 = r0
            r0 = 0
            boolean r16 = r36.mo101023z3()
            if (r16 == 0) goto L_0x075a
            java.lang.String r16 = r36.mo108768t()
            boolean r16 = com.tencent.p014mm.storage.C72996z1.m85820U5(r16)
            if (r16 == 0) goto L_0x0583
            int r16 = r36.mo108769t2()
            if (r16 != 0) goto L_0x0583
            java.lang.String r16 = r36.getContent()
            java.lang.String r16 = eb0.C75604z3.m90849u(r16)
            goto L_0x0587
        L_0x0583:
            java.lang.String r16 = r36.getContent()
        L_0x0587:
            r18 = r14
            r14 = r16
            com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r14, r0)
            te2.g$b r14 = te2.C101750g.f297828a
            r26 = r5
            r25 = r13
            r13 = r36
            java.lang.String r5 = r13.f230724G
            te2.g$a r5 = r14.mo141185e(r5)
            if (r0 == 0) goto L_0x071f
            int r13 = r0.f195582i
            r27 = r4
            r4 = 6
            if (r13 != r4) goto L_0x0721
            di3.d r0 = di3.C86312j.m106911c(r2)
            ke2.c r0 = (ke2.C99129c) r0
            r0.requireAccountInitialized()
            xe2.b r0 = r0.f290673z
            r0.getClass()
            xe2.a r4 = new xe2.a
            r4.<init>()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r16 = r2
            r21 = r3
            long r2 = r36.mo108774y2()
            r13.append(r2)
            java.lang.String r2 = "_4"
            r13.append(r2)
            java.lang.String r2 = r13.toString()
            r4.mo142461D2(r2)
            long r2 = r36.getMsgId()
            r4.setMsgId(r2)
            long r2 = r36.getCreateTime()
            r4.mo142484y2(r2)
            java.lang.String r2 = r36.mo101010p2()
            r4.mo142458A2(r2)
            r2 = 1
            r4.mo142466d(r2)
            r2 = 4
            r4.mo142462E2(r2)
            java.lang.String r3 = r36.mo108768t()
            gy3.C87412m.m108593f(r3, r6)
            r3 = 40
            r4.mo142483x2(r3)
            int r3 = r5.f297830b
            r4.mo142464G2(r3)
            int r3 = r5.f297831c
            r4.mo142485z2(r3)
            long r2 = r5.f297829a
            r4.mo142465H2(r2)
            long r2 = r5.f297829a
            r4.mo142460C2(r2)
            java.lang.String r2 = r36.mo108768t()
            gy3.C87412m.m108593f(r2, r6)
            int r2 = r14.mo141184d(r2)
            r4.mo142459B2(r2)
            int r2 = r4.mo142471m2()
            int r3 = r4.mo142480u2()
            int r6 = r4.mo142474p2()
            r13 = 4
            int r2 = r14.mo141181a(r2, r3, r13, r6)
            r4.mo142463F2(r2)
            java.lang.String r2 = r4.mo142476r2()
            java.lang.String r3 = "item.msgItemId"
            gy3.C87412m.m108593f(r2, r3)
            xe2.a r2 = r0.mo142287d3(r2)
            if (r2 == 0) goto L_0x0648
            r3 = r14
            r0 = 0
            goto L_0x06dd
        L_0x0648:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "c2c pre download storage insert file, msgId:"
            r2.append(r3)
            r3 = r14
            long r13 = r4.getMsgId()
            r2.append(r13)
            r2.append(r11)
            java.lang.String r6 = r4.mo142476r2()
            r2.append(r6)
            r2.append(r10)
            java.lang.String r6 = r4.mo142473o2()
            r2.append(r6)
            r2.append(r9)
            long r9 = r4.mo142481v2()
            r2.append(r9)
            r2.append(r8)
            int r6 = r4.mo142480u2()
            r2.append(r6)
            r2.append(r7)
            int r6 = r4.mo142471m2()
            r2.append(r6)
            r2.append(r1)
            int r1 = r4.mo142479t2()
            r2.append(r1)
            r1 = r21
            r2.append(r1)
            int r1 = r5.f297831c
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 14
            r24 = 0
            r18 = r0
            r19 = r4
            boolean r0 = com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage.insert$default(r18, r19, r20, r21, r22, r23, r24)
            if (r0 != 0) goto L_0x06dd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "c2c pre download storage insert file error, msgId:"
            r1.append(r2)
            long r5 = r4.getMsgId()
            r1.append(r5)
            r1.append(r11)
            java.lang.String r2 = r4.mo142476r2()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r1)
        L_0x06dd:
            if (r0 == 0) goto L_0x075a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r36.mo108774y2()
            r0.append(r1)
            java.lang.String r1 = "_4"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            di3.d r1 = di3.C86312j.m106911c(r16)
            ke2.c r1 = (ke2.C99129c) r1
            r1.requireAccountInitialized()
            xe2.b r1 = r1.f290673z
            xe2.a r1 = r1.mo142287d3(r0)
            if (r1 == 0) goto L_0x075a
            int r1 = r1.mo142472n2()
            r2 = 1
            if (r1 != r2) goto L_0x071b
            r1 = 4
            java.lang.String r2 = r36.mo108768t()
            int r1 = r3.mo141183c(r1, r2)
            if (r1 == 0) goto L_0x071b
            r15.mo141178l3(r0)
            goto L_0x075a
        L_0x071b:
            r35.mo141177k3()
            goto L_0x075a
        L_0x071f:
            r27 = r4
        L_0x0721:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "c2c pre download Error: addQuotaTask Failed, insert file failed, appMsgContentType:"
            r1.append(r2)
            int r0 = r0.f195582i
            r1.append(r0)
            r0 = r27
            r1.append(r0)
            long r2 = r36.mo108774y2()
            r1.append(r2)
            r0 = r26
            r1.append(r0)
            long r2 = r36.getMsgId()
            r1.append(r2)
            r0 = r25
            r1.append(r0)
            r0 = 0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r18
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
        L_0x075a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.C101746c.mo141175i3(com.tencent.mm.storage.f4):void");
    }

    /* renamed from: j3 */
    public final void mo141176j3(C72963f4 f4Var) {
        Class cls = C99129c.class;
        C87412m.m108594g(f4Var, "msg");
        C99129c cVar = (C99129c) C86312j.m106911c(cls);
        cVar.requireAccountInitialized();
        C102631b bVar = cVar.f290673z;
        long msgId = f4Var.getMsgId();
        bVar.getClass();
        for (C102630a aVar : C102676x0.f303129u.selectAll().log("MicroMsg.C2CPreDownloadStorage").where(C102676x0.f303131w.equal((Number) Long.valueOf(msgId))).build().multiQuery(bVar.getDbProvider().getDB(), C102630a.class)) {
            C99129c cVar2 = (C99129c) C86312j.m106911c(cls);
            cVar2.requireAccountInitialized();
            cVar2.f290655A.mo129636e(f4Var.getMsgId(), aVar.mo142477s2(), f4Var.mo108774y2());
            C99129c cVar3 = (C99129c) C86312j.m106911c(cls);
            cVar3.requireAccountInitialized();
            C102631b bVar2 = cVar3.f290673z;
            String r2 = aVar.mo142476r2();
            C87412m.m108593f(r2, "it.msgItemId");
            bVar2.mo142286c3(r2);
        }
    }

    /* renamed from: k3 */
    public final void mo141177k3() {
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C2CMsgPreDownloader c2CMsgPreDownloader = cVar.f290655A;
        C87412m.m108593f(c2CMsgPreDownloader, "getService(PluginPriorit…java).c2CMsgPreDownloader");
        c2CMsgPreDownloader.mo129639h(false);
    }

    /* renamed from: l3 */
    public final void mo141178l3(String str) {
        C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
        cVar.requireAccountInitialized();
        C2CMsgPreDownloader c2CMsgPreDownloader = cVar.f290655A;
        c2CMsgPreDownloader.getClass();
        C87412m.m108594g(str, "msgItemId");
        LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) c2CMsgPreDownloader.f272436h).getValue(), (C53934p0) null, new C102006d(str, c2CMsgPreDownloader, (C15601d<? super C102006d>) null), 1, (Object) null);
    }
}
