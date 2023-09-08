package y72;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMStack;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C97625j3;
import ob0.C11385n;
import ob0.C117747y;
import yu0.C102913k;

/* renamed from: y72.h */
public class C102823h implements C102815a {

    /* renamed from: f */
    public static C102823h f303546f;

    /* renamed from: a */
    public C102816c f303547a;

    /* renamed from: b */
    public int f303548b;

    /* renamed from: c */
    public long f303549c;

    /* renamed from: d */
    public boolean f303550d = false;

    /* renamed from: e */
    public boolean f303551e = false;

    /* renamed from: y72.h$a */
    public class C102824a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C102819d f303552d;

        public C102824a(C102819d dVar) {
            this.f303552d = dVar;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C97625j3.m125815e().mo123470p(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this);
            if (i == 0 && i2 == 0) {
                Log.m105924i("MicroMsg.MsgSynchronizeServer", "msgSynchronize success. ");
                C102913k.m136047l(C102825i.m135893b());
                C102913k.m136047l(C102825i.m135894c());
                C102823h hVar = C102823h.this;
                hVar.f303551e = false;
                long milliSecondsToNow = Util.milliSecondsToNow(hVar.f303549c);
                if (this.f303552d.f303520a.equals("afterLogin")) {
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.idkeyStat(466, 1, 1, false);
                    C115669n nVar2 = nVar;
                    nVar2.idkeyStat(466, 5, this.f303552d.f303524e, false);
                    nVar2.idkeyStat(466, 7, milliSecondsToNow, false);
                    nVar.idkeyStat(466, 11, this.f303552d.f303523d, false);
                    nVar.idkeyStat(466, 12, this.f303552d.f303522c, false);
                } else if (this.f303552d.f303520a.equals("afterSleep")) {
                    C115669n nVar3 = C115669n.INSTANCE;
                    nVar3.idkeyStat(466, 16, 1, false);
                    C115669n nVar4 = nVar3;
                    nVar4.idkeyStat(466, 20, this.f303552d.f303524e, false);
                    nVar4.idkeyStat(466, 22, milliSecondsToNow, false);
                    nVar3.idkeyStat(466, 26, this.f303552d.f303523d, false);
                    nVar3.idkeyStat(466, 27, this.f303552d.f303522c, false);
                } else if (this.f303552d.f303520a.equals("getMore")) {
                    C115669n nVar5 = C115669n.INSTANCE;
                    nVar5.idkeyStat(466, 32, 1, false);
                    C115669n nVar6 = nVar5;
                    nVar6.idkeyStat(466, 36, this.f303552d.f303524e, false);
                    nVar6.idkeyStat(466, 38, milliSecondsToNow, false);
                    nVar5.idkeyStat(466, 42, this.f303552d.f303523d, false);
                    nVar5.idkeyStat(466, 43, this.f303552d.f303522c, false);
                }
                C102819d dVar = this.f303552d;
                C38972b.m41983b(dVar.f303524e, milliSecondsToNow, dVar.f303523d, dVar.f303522c, 0, C102823h.this.f303548b, dVar.f303520a);
                return;
            }
            Log.m105921e("MicroMsg.MsgSynchronizeServer", "msgSynchronize appmsg.  errType:%d, errCode:%d, errMsg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C102823h.this.mo142551a();
            if (this.f303552d.f303520a.equals("afterLogin")) {
                C115669n.INSTANCE.idkeyStat(466, 3, 1, false);
            } else if (this.f303552d.f303520a.equals("afterSleep")) {
                C115669n.INSTANCE.idkeyStat(466, 18, 1, false);
            } else if (this.f303552d.f303520a.equals("getMore")) {
                C115669n.INSTANCE.idkeyStat(466, 34, 1, false);
            }
            C38972b.m41983b(0, 0, 0, 0, 2, C102823h.this.f303548b, this.f303552d.f303520a);
        }
    }

    /* renamed from: a */
    public void mo142551a() {
        Log.m105921e("MicroMsg.MsgSynchronizeServer", "MsgSynchronizeServer cancel, Caller:%s", MMStack.getCaller());
        this.f303547a.f303511a = true;
        this.f303551e = false;
    }

    /* renamed from: b */
    public final void mo142552b(String str) {
        if (str.equals("afterLogin")) {
            C115669n.INSTANCE.idkeyStat(466, 2, 1, false);
        } else if (str.equals("afterSleep")) {
            C115669n.INSTANCE.idkeyStat(466, 17, 1, false);
        } else if (str.equals("getMore")) {
            C115669n.INSTANCE.idkeyStat(466, 33, 1, false);
        }
    }

    /* renamed from: c */
    public final void mo142553c(C102819d dVar, boolean z) {
        String str;
        Log.m105925i("MicroMsg.MsgSynchronizeServer", "msgSynchronize start send AppMsg, isEmpty[%b].", Boolean.valueOf(z));
        C97625j3.m125815e().mo123455a(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, new C102824a(dVar));
        if (dVar.f303520a.equals("getMore")) {
            str = dVar.f303525f + "," + dVar.f303526g;
        } else {
            str = "";
        }
        String str2 = str;
        C97625j3.m125815e().mo123460f(z ? new C102820e("", "NULL", 0, dVar.f303530k, dVar.f303520a, str2, dVar.f303531l) : new C102820e(dVar.f303527h, dVar.f303528i, dVar.f303529j, dVar.f303530k, dVar.f303520a, str2, dVar.f303531l));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo142554d(java.lang.String r30, java.lang.String r31, byte[] r32, java.lang.String r33) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r1
            r6 = 1
            r4[r6] = r2
            int r7 = r0.f303548b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 2
            r4[r8] = r7
            java.lang.String r7 = "MicroMsg.MsgSynchronizeServer"
            java.lang.String r9 = "start, action:%s, extInfo:%s, loginDevice[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r4)
            boolean r4 = r0.f303551e
            if (r4 == 0) goto L_0x002f
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r1
            java.lang.String r1 = "synchronize has Started!!!!! reject! action:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r2)
            return
        L_0x002f:
            r0.f303551e = r6
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f303549c = r9
            y72.c r4 = r0.f303547a
            if (r4 == 0) goto L_0x003d
            r4.f303511a = r6
        L_0x003d:
            y72.c r4 = new y72.c
            r4.<init>()
            r0.f303547a = r4
            y72.d r10 = new y72.d
            r10.<init>(r1)
            r4 = r32
            r10.f303521b = r4
            r4 = r33
            r10.f303531l = r4
            java.lang.String r4 = "afterLogin"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x010b
            int r1 = r0.f303548b
            java.lang.Object[] r2 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r5] = r3
            java.lang.String r3 = "startLoginSynchronize, loginDevice[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r3, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 466(0x1d2, double:2.3E-321)
            r14 = 0
            r16 = 1
            r18 = 0
            r11 = r2
            r11.idkeyStat(r12, r14, r16, r18)
            hv0.e r3 = hv0.C98544e.m128035f()
            r3.mo137899c()
            y72.c r3 = r0.f303547a
            r3.f303512b = r0
            java.util.LinkedList r11 = r3.mo142547a()
            java.lang.Object[] r3 = new java.lang.Object[r6]
            int r4 = r11.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r5] = r4
            java.lang.String r4 = "startLoginSynchronize calculateConversationList finish. conversationList size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r4, r3)
            int r3 = r11.size()
            if (r3 != 0) goto L_0x00ea
            java.lang.String r3 = "startLoginSynchronize, No conversation to synchronize"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r3)
            r29.mo142551a()
            long r3 = r0.f303549c
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r3)
            r5 = 466(0x1d2, double:2.3E-321)
            r14 = 1
            r16 = 1
            r19 = 0
            r12 = 466(0x1d2, double:2.3E-321)
            r18 = 0
            r11 = r2
            r11.idkeyStat(r12, r14, r16, r18)
            r14 = 5
            r16 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            r14 = 7
            r16 = r3
            r11.idkeyStat(r12, r14, r16, r18)
            r14 = 11
            r7 = 0
            r16 = 0
            r11.idkeyStat(r12, r14, r16, r18)
            r14 = 12
            r12 = r5
            r11.idkeyStat(r12, r14, r16, r18)
            r11 = 0
            r15 = 0
            r21 = 1
            r13 = r3
            r17 = r7
            r20 = r1
            y72.C38972b.m41982a(r11, r13, r15, r17, r19, r20, r21)
            goto L_0x036b
        L_0x00ea:
            int r1 = y72.C38972b.f105002g
            if (r1 >= 0) goto L_0x00f0
            long r1 = (long) r1
            goto L_0x00fd
        L_0x00f0:
            int r1 = r1 * 24
            int r1 = r1 * 60
            int r1 = r1 * 60
            int r1 = r1 * 1000
            long r1 = (long) r1
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r1)
        L_0x00fd:
            r12 = r1
            y72.c r9 = r0.f303547a
            long r14 = java.lang.System.currentTimeMillis()
            int r16 = y72.C38972b.f105000e
            r9.mo142548b(r10, r11, r12, r14, r16)
            goto L_0x036b
        L_0x010b:
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r4 = r4.mo105906u()
            com.tencent.mm.storage.y1$a r9 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_MSG_SYNCHRONIZE_BOOLEAN
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Object r4 = r4.mo119685f(r9, r11)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x012d
            java.lang.String r1 = "start reject!!!User did not approve synchroinze!!!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            r29.mo142551a()
            return
        L_0x012d:
            java.lang.String r4 = ","
            java.lang.String[] r2 = r2.split(r4)
            java.lang.String r4 = "afterSleep"
            boolean r4 = r1.equals(r4)
            java.lang.String r9 = "start extinfo size wrong, action:%s, exinfo:%s"
            java.lang.String r11 = "start reject!!!Abtest reject synchroinze after sleep."
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x024c
            int r3 = y72.C38972b.f105003h
            if (r3 > 0) goto L_0x014e
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r11)
            r29.mo142551a()
            return
        L_0x014e:
            int r3 = r2.length
            if (r3 >= r8) goto L_0x015e
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r5] = r1
            r3[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r3)
            r29.mo142551a()
            return
        L_0x015e:
            r1 = r2[r5]
            long r3 = yu0.C102913k.m136036a(r1, r5)
            long r3 = r3 * r12
            r1 = r2[r6]
            long r1 = yu0.C102913k.m136036a(r1, r5)
            long r1 = r1 * r12
            int r9 = r0.f303548b
            java.lang.Object[] r11 = new java.lang.Object[r6]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11[r5] = r12
            java.lang.String r12 = "startAfterSleepSynchronize, loginDevice[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r12, r11)
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r14 = 466(0x1d2, double:2.3E-321)
            r16 = 15
            r18 = 1
            r20 = 0
            r13 = r11
            r13.idkeyStat(r14, r16, r18, r20)
            hv0.e r12 = hv0.C98544e.m128035f()
            r12.mo137899c()
            y72.c r12 = r0.f303547a
            r12.f303512b = r0
            java.util.LinkedList r12 = r12.mo142547a()
            java.lang.Object[] r13 = new java.lang.Object[r6]
            int r14 = r12.size()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r13[r5] = r14
            java.lang.String r14 = "startAfterSleepSynchronize getConversationList finish. conversationList size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r14, r13)
            int r13 = r12.size()
            if (r13 != 0) goto L_0x0200
            java.lang.String r1 = "startAfterSleepSynchronize, No conversation to synchronize"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            r29.mo142551a()
            long r1 = r0.f303549c
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r1)
            r3 = 466(0x1d2, double:2.3E-321)
            r16 = 16
            r18 = 1
            r5 = 0
            r14 = 466(0x1d2, double:2.3E-321)
            r20 = 0
            r13 = r11
            r13.idkeyStat(r14, r16, r18, r20)
            r16 = 20
            r18 = 0
            r13.idkeyStat(r14, r16, r18, r20)
            r16 = 22
            r18 = r1
            r13.idkeyStat(r14, r16, r18, r20)
            r16 = 26
            r6 = 0
            r18 = 0
            r13.idkeyStat(r14, r16, r18, r20)
            r16 = 27
            r14 = r3
            r13.idkeyStat(r14, r16, r18, r20)
            r11 = 0
            r15 = 0
            r21 = 2
            r13 = r1
            r17 = r6
            r19 = r5
            r20 = r9
            y72.C38972b.m41982a(r11, r13, r15, r17, r19, r20, r21)
            goto L_0x036b
        L_0x0200:
            int r9 = y72.C38972b.f105002g
            if (r9 >= 0) goto L_0x0206
            long r13 = (long) r9
            goto L_0x0213
        L_0x0206:
            int r9 = r9 * 24
            int r9 = r9 * 60
            int r9 = r9 * 60
            int r9 = r9 * 1000
            long r13 = (long) r9
            long r13 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r13)
        L_0x0213:
            int r9 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r9 >= 0) goto L_0x0218
            goto L_0x0219
        L_0x0218:
            r13 = r3
        L_0x0219:
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x0223
            long r1 = java.lang.System.currentTimeMillis()
        L_0x0223:
            int r3 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0240
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.Long r4 = java.lang.Long.valueOf(r13)
            r3[r5] = r4
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3[r6] = r1
            java.lang.String r1 = "startAfterSleepSynchronize no msg should be synchroinzed. startTime[%d], endTIme[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r1, r3)
            r0.mo142553c(r10, r6)
            goto L_0x036b
        L_0x0240:
            y72.c r9 = r0.f303547a
            int r16 = y72.C38972b.f105000e
            r11 = r12
            r12 = r13
            r14 = r1
            r9.mo142548b(r10, r11, r12, r14, r16)
            goto L_0x036b
        L_0x024c:
            java.lang.String r4 = "getMore"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x036b
            int r4 = y72.C38972b.f105004i
            if (r4 > 0) goto L_0x025f
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r11)
            r29.mo142551a()
            return
        L_0x025f:
            int r4 = r2.length
            r11 = 5
            if (r4 >= r11) goto L_0x0270
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r5] = r1
            r3[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r7, r9, r3)
            r29.mo142551a()
            return
        L_0x0270:
            r1 = r2[r5]
            r4 = r2[r6]
            long r14 = yu0.C102913k.m136036a(r4, r5)
            long r14 = r14 * r12
            r4 = r2[r8]
            long r16 = yu0.C102913k.m136036a(r4, r5)
            long r16 = r16 * r12
            r3 = r2[r3]
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r10.f303525f = r4
            r3 = 4
            r2 = r2[r3]
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r5)
            int r3 = r0.f303548b
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r4[r5] = r9
            java.lang.String r9 = "startGetMoreSynchronize, loginDevice[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r4)
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r19 = 466(0x1d2, double:2.3E-321)
            r21 = 31
            r23 = 1
            r25 = 0
            r18 = r4
            r18.idkeyStat(r19, r21, r23, r25)
            hv0.e r9 = hv0.C98544e.m128035f()
            r9.mo137899c()
            y72.c r9 = r0.f303547a
            r9.f303512b = r0
            java.util.LinkedList r11 = new java.util.LinkedList
            r11.<init>()
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r9 == 0) goto L_0x02c8
            goto L_0x02f6
        L_0x02c8:
            hv0.e r9 = hv0.C98544e.m128035f()
            hv0.c r9 = r9.mo137901e()
            g62.l r9 = r9.mo137897e()
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9
            int r9 = r9.Vx0(r1)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r5] = r1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r8[r6] = r12
            java.lang.String r12 = "MicroMsg.MsgSynchronizePack"
            java.lang.String r13 = "addConversationList user:%s convMsgCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r8)
            if (r9 > 0) goto L_0x02ee
            goto L_0x02f6
        L_0x02ee:
            y72.c$b r8 = new y72.c$b
            r8.<init>(r1)
            r11.add(r8)
        L_0x02f6:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            int r6 = r11.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r5] = r6
            java.lang.String r5 = "startGetMoreSynchronize addConversationList finish. conversationList size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r5, r1)
            int r1 = r11.size()
            if (r1 != 0) goto L_0x0361
            java.lang.String r1 = "startGetMoreSynchronize, No conversation to synchronize"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            r29.mo142551a()
            long r1 = r0.f303549c
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r1)
            r5 = 466(0x1d2, double:2.3E-321)
            r21 = 32
            r23 = 1
            r7 = 0
            r19 = 466(0x1d2, double:2.3E-321)
            r25 = 0
            r18 = r4
            r18.idkeyStat(r19, r21, r23, r25)
            r21 = 36
            r23 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            r21 = 38
            r23 = r1
            r18.idkeyStat(r19, r21, r23, r25)
            r21 = 42
            r8 = 0
            r23 = 0
            r18.idkeyStat(r19, r21, r23, r25)
            r21 = 43
            r19 = r5
            r23 = r8
            r25 = r7
            r18.idkeyStat(r19, r21, r23, r25)
            r18 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 3
            r20 = r1
            r27 = r3
            y72.C38972b.m41982a(r18, r20, r22, r24, r26, r27, r28)
            goto L_0x036b
        L_0x0361:
            y72.c r9 = r0.f303547a
            r12 = r14
            r14 = r16
            r16 = r2
            r9.mo142548b(r10, r11, r12, r14, r16)
        L_0x036b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y72.C102823h.mo142554d(java.lang.String, java.lang.String, byte[], java.lang.String):void");
    }
}
