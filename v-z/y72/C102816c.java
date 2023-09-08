package y72;

import android.database.Cursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72976h2;
import hv0.C98544e;
import java.util.LinkedList;
import lu3.C88656g;
import yu0.C102913k;
import zt3.C119157j;

/* renamed from: y72.c */
public class C102816c {

    /* renamed from: a */
    public boolean f303511a = false;

    /* renamed from: b */
    public C102815a f303512b;

    /* renamed from: y72.c$a */
    public class C102817a implements C88656g {

        /* renamed from: d */
        public final /* synthetic */ LinkedList f303513d;

        /* renamed from: e */
        public final /* synthetic */ C102819d f303514e;

        /* renamed from: f */
        public final /* synthetic */ long f303515f;

        /* renamed from: g */
        public final /* synthetic */ long f303516g;

        /* renamed from: h */
        public final /* synthetic */ int f303517h;

        public C102817a(LinkedList linkedList, C102819d dVar, long j, long j2, int i) {
            this.f303513d = linkedList;
            this.f303514e = dVar;
            this.f303515f = j;
            this.f303516g = j2;
            this.f303517h = i;
        }

        public String getKey() {
            return "msgSynchronizePackThread";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0197, code lost:
            r23 = r2;
            r25 = r6;
            r26 = "getMore";
            r2 = r14;
            r4 = r15;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r28 = this;
                r1 = r28
                long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                java.util.LinkedList r0 = r1.f303513d
                java.lang.String r6 = "MicroMsg.MsgSynchronizePack"
                if (r0 == 0) goto L_0x034d
                int r0 = r0.size()
                if (r0 > 0) goto L_0x0014
                goto L_0x034d
            L_0x0014:
                java.lang.String r0 = y72.C102825i.m135893b()
                yu0.C102913k.m136047l(r0)
                java.lang.String r0 = y72.C102825i.m135894c()
                yu0.C102913k.m136047l(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                eb0.c r7 = eb0.C97625j3.m125812b()
                java.lang.String r7 = r7.mo105891f()
                r0.append(r7)
                java.lang.String r7 = "msgsynchronize/"
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                yu0.C102913k.m136047l(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                eb0.c r7 = eb0.C97625j3.m125812b()
                java.lang.String r7 = r7.mo105891f()
                r0.append(r7)
                java.lang.String r7 = "msgsynchronize.zip"
                r0.append(r7)
                java.lang.String r0 = r0.toString()
                yu0.C102913k.m136047l(r0)
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                hv0.e r7 = hv0.C98544e.m128035f()
                hv0.c r7 = r7.mo137901e()
                com.tencent.mm.storage.v1 r7 = r7.mo137894b()
                r8 = 2
                r9 = 0
                java.lang.Object r7 = r7.mo119684e(r8, r9)
                java.lang.String r7 = (java.lang.String) r7
                com.tencent.mm.pointers.PInt r15 = new com.tencent.mm.pointers.PInt
                r15.<init>()
                com.tencent.mm.pointers.PInt r13 = new com.tencent.mm.pointers.PInt
                r13.<init>()
                com.tencent.mm.pointers.PLong r14 = new com.tencent.mm.pointers.PLong
                r14.<init>()
                java.util.LinkedList r10 = r1.f303513d
                java.util.Iterator r22 = r10.iterator()
            L_0x008a:
                boolean r10 = r22.hasNext()
                java.lang.String r12 = "getMore"
                if (r10 == 0) goto L_0x0197
                java.lang.Object r10 = r22.next()
                r11 = r10
                y72.c$b r11 = (y72.C102816c.C102818b) r11
                y72.c r10 = y72.C102816c.this
                boolean r10 = r10.f303511a
                if (r10 == 0) goto L_0x00a7
                java.lang.String r10 = "startSynchronizePack has been canceled!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r10)
                goto L_0x0197
            L_0x00a7:
                hv0.e r10 = hv0.C98544e.m128035f()
                hv0.c r10 = r10.mo137901e()
                com.tencent.mm.storage.v3 r10 = r10.mo137895c()
                java.lang.String r9 = r11.f303519a
                com.tencent.mm.storage.i2 r10 = (com.tencent.p014mm.storage.C44660i2) r10
                com.tencent.mm.storage.h2 r9 = r10.mo69771j(r9)
                if (r9 == 0) goto L_0x00c2
                int r9 = r9.mo108786G2()
                goto L_0x00c3
            L_0x00c2:
                r9 = 0
            L_0x00c3:
                y72.d r10 = r1.f303514e
                java.lang.String r10 = r10.f303520a
                boolean r10 = r10.equals(r12)
                if (r10 == 0) goto L_0x0119
                y72.c r10 = y72.C102816c.this
                y72.d r8 = r1.f303514e
                long r4 = r1.f303515f
                r23 = r2
                long r2 = r1.f303516g
                r25 = r0
                int r0 = r1.f303517h
                r16 = r11
                r11 = r8
                r8 = r12
                r12 = r16
                r26 = r8
                r8 = r13
                r27 = r14
                r13 = r4
                r4 = r15
                r15 = r2
                r17 = r7
                r18 = r9
                r19 = r4
                r20 = r27
                r21 = r0
                r10.mo142549c(r11, r12, r13, r15, r17, r18, r19, r20, r21)
                r2 = r27
                long r9 = r2.value
                int r0 = y72.C38972b.f105005j
                long r11 = (long) r0
                int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r0 < 0) goto L_0x0113
                r3 = 1
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Long r3 = java.lang.Long.valueOf(r9)
                r5 = 0
                r0[r5] = r3
                java.lang.String r3 = "startSynchronizePack getMore has reach the max pack number, msgCount:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r0)
                goto L_0x0192
            L_0x0113:
                r0 = r25
            L_0x0115:
                r25 = r6
                goto L_0x0187
            L_0x0119:
                r25 = r0
                r23 = r2
                r16 = r11
                r26 = r12
                r8 = r13
                r2 = r14
                r4 = r15
                int r0 = r8.value
                int r3 = y72.C38972b.f105001f
                if (r0 >= r3) goto L_0x0192
                y72.c r0 = y72.C102816c.this
                r0.getClass()
                pv0.n r0 = new pv0.n
                r0.<init>()
                r3 = r16
                java.lang.String r5 = r3.f303519a
                r0.f127529f = r5
                hv0.e r5 = hv0.C98544e.m128035f()
                hv0.c r5 = r5.mo137901e()
                g62.l r5 = r5.mo137897e()
                java.lang.String r10 = r3.f303519a
                com.tencent.mm.storage.g4 r5 = (com.tencent.p014mm.storage.C72972g4) r5
                long r10 = r5.Dx0(r10)
                r12 = 1000(0x3e8, double:4.94E-321)
                long r10 = r10 / r12
                int r5 = (int) r10
                r0.f127527d = r5
                r0.f127528e = r9
                r5 = r25
                r5.add(r0)
                int r0 = r8.value
                r10 = 1
                int r0 = r0 + r10
                r8.value = r0
                int r0 = r4.value
                int r10 = y72.C38972b.f104999d
                if (r0 >= r10) goto L_0x0185
                y72.c r10 = y72.C102816c.this
                y72.d r11 = r1.f303514e
                long r13 = r1.f303515f
                r0 = r5
                r25 = r6
                long r5 = r1.f303516g
                int r15 = r1.f303517h
                r12 = r3
                r3 = r15
                r15 = r5
                r17 = r7
                r18 = r9
                r19 = r4
                r20 = r2
                r21 = r3
                r10.mo142549c(r11, r12, r13, r15, r17, r18, r19, r20, r21)
                goto L_0x0187
            L_0x0185:
                r0 = r5
                goto L_0x0115
            L_0x0187:
                r14 = r2
                r15 = r4
                r13 = r8
                r2 = r23
                r6 = r25
                r8 = 2
                r9 = 0
                goto L_0x008a
            L_0x0192:
                r0 = r25
                r25 = r6
                goto L_0x019f
            L_0x0197:
                r23 = r2
                r25 = r6
                r26 = r12
                r2 = r14
                r4 = r15
            L_0x019f:
                y72.c r3 = y72.C102816c.this
                boolean r3 = r3.f303511a
                if (r3 == 0) goto L_0x01ad
                java.lang.String r0 = "MsgSynchronizePack canceled!"
                r3 = r25
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
                return
            L_0x01ad:
                r3 = r25
                y72.d r5 = r1.f303514e
                java.lang.String r5 = r5.f303520a
                r6 = r26
                boolean r5 = r5.equals(r6)
                if (r5 != 0) goto L_0x0213
                pv0.o r5 = new pv0.o
                r5.<init>()
                r5.f127530d = r0
                com.tencent.mm.storage.l3 r0 = fd0.C75743h.vx0()
                int r0 = r0.mo101166Ow()
                r5.f127531e = r0
                byte[] r0 = r5.toByteArray()     // Catch:{ Exception -> 0x01f6 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f6 }
                r6.<init>()     // Catch:{ Exception -> 0x01f6 }
                eb0.c r8 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r8 = r8.mo105901p()     // Catch:{ Exception -> 0x01f6 }
                r6.append(r8)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r8 = "msgsynchronize/syncFile/"
                r6.append(r8)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r8 = "sessionlist"
                y72.C102825i.m135892a(r6, r8, r0)     // Catch:{ Exception -> 0x01f6 }
                java.lang.String r0 = "BackupSessionInfoList pack finish."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ Exception -> 0x01f6 }
                goto L_0x0213
            L_0x01f6:
                r0 = move-exception
                r6 = 2
                java.lang.Object[] r8 = new java.lang.Object[r6]
                java.util.LinkedList<pv0.n> r5 = r5.f127530d
                int r5 = r5.size()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 0
                r8[r6] = r5
                java.lang.String r0 = r0.getMessage()
                r5 = 1
                r8[r5] = r0
                java.lang.String r0 = "ERROR: BackupSessionInfoList to Buffer, list:%d :%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r0, r8)
            L_0x0213:
                java.lang.String r0 = y72.C102825i.m135893b()
                java.lang.String r5 = y72.C102825i.m135894c()
                com.tencent.p014mm.vfs.C86013q1.m106439U(r0, r5)
                java.lang.String r0 = y72.C102825i.m135894c()
                long r5 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
                r0 = 4
                java.lang.Object[] r8 = new java.lang.Object[r0]
                int r9 = r4.value
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                r10 = 0
                r8[r10] = r9
                long r9 = r2.value
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r10 = 1
                r8[r10] = r9
                r9 = 1024(0x400, double:5.06E-321)
                long r5 = r5 / r9
                java.lang.Long r9 = java.lang.Long.valueOf(r5)
                r10 = 2
                r8[r10] = r9
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.milliSecondsToNow(r23)
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r10 = 3
                r8[r10] = r9
                java.lang.String r9 = "startSynchronizePack finish, sessionCount:%d, msgCount:%d, fileLen:%d KB, backupCostTime[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r8)
                y72.d r3 = r1.f303514e
                int r4 = r4.value
                long r8 = (long) r4
                long r11 = r2.value
                r3.f303522c = r8
                r3.f303523d = r11
                r3.f303524e = r5
                java.lang.String r2 = new java.lang.String
                r2.<init>(r7)
                r3.f303530k = r2
                y72.c r2 = y72.C102816c.this
                y72.a r2 = r2.f303512b
                if (r2 == 0) goto L_0x034c
                y72.d r3 = r1.f303514e
                java.lang.String r4 = y72.C102825i.m135894c()
                java.util.LinkedList r5 = r1.f303513d
                int r5 = r5.size()
                y72.h r2 = (y72.C102823h) r2
                r6 = 5
                java.lang.Object[] r7 = new java.lang.Object[r6]
                r8 = 0
                r7[r8] = r4
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
                r9 = 1
                r7[r9] = r8
                long r8 = r3.f303522c
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r9 = 2
                r7[r9] = r8
                long r8 = r3.f303523d
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r7[r10] = r8
                long r8 = r3.f303524e
                java.lang.Long r8 = java.lang.Long.valueOf(r8)
                r7[r0] = r8
                java.lang.String r0 = "MicroMsg.MsgSynchronizeServer"
                java.lang.String r8 = "onMsgSynchronizePackFinish filePath:%s, conversationSize:%d, msgSyncSessionCount:%d, msgSyncMsgCount:%d, msgSyncMsgSize:%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r8, r7)
                long r7 = r3.f303522c
                r9 = 0
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 > 0) goto L_0x02cc
                long r7 = r3.f303523d
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 > 0) goto L_0x02cc
                long r7 = r3.f303524e
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 > 0) goto L_0x02cc
                java.lang.String r4 = "no data should be synchronize"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                r4 = 1
                r2.mo142553c(r3, r4)
                goto L_0x034c
            L_0x02cc:
                y72.f r7 = new y72.f
                r7.<init>(r2, r3)
                y72.g r8 = new y72.g
                r8.<init>(r2, r3, r7)
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r9 = "MSG_SYNCHRONIZE_"
                r7.append(r9)
                r7.append(r5)
                java.lang.String r5 = "_"
                r7.append(r5)
                long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
                r7.append(r9)
                java.lang.String r5 = r7.toString()
                gi.g r7 = new gi.g
                r7.<init>()
                java.lang.String r9 = "task_MsgSynchronizeServer"
                r7.f287660d = r9
                r7.f287662f = r8
                r7.field_mediaId = r5
                r7.field_fullpath = r4
                r7.field_fileType = r6
                hv0.e r4 = hv0.C98544e.m128035f()
                hv0.c r4 = r4.mo137901e()
                com.tencent.mm.storage.v1 r4 = r4.mo137894b()
                r6 = 0
                r8 = 2
                java.lang.Object r4 = r4.mo119684e(r8, r6)
                java.lang.String r4 = (java.lang.String) r4
                r7.field_talker = r4
                r7.field_priority = r8
                java.lang.Class<qo.l> r4 = p663qo.C101213l.class
                di3.d r4 = di3.C86312j.m106911c(r4)
                qo.l r4 = (p663qo.C101213l) r4
                boolean r4 = r4.if0(r7)
                if (r4 != 0) goto L_0x034c
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r6 = 0
                r4[r6] = r5
                java.lang.String r5 = "msgSynchronize addSendTask failed. clientid:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r5, r4)
                java.lang.String r0 = r3.f303520a
                r2.mo142552b(r0)
                r4 = 0
                r6 = 0
                r8 = 0
                r10 = 0
                r12 = 1
                int r13 = r2.f303548b
                java.lang.String r14 = r3.f303520a
                y72.C38972b.m41983b(r4, r6, r8, r10, r12, r13, r14)
            L_0x034c:
                return
            L_0x034d:
                r3 = r6
                r2 = 1
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.util.LinkedList r2 = r1.f303513d
                if (r2 != 0) goto L_0x0357
                r2 = -1
                goto L_0x035b
            L_0x0357:
                int r2 = r2.size()
            L_0x035b:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r4 = 0
                r0[r4] = r2
                java.lang.String r2 = "startSynchronizePack MsgSynchronizeSessionList is null or zero, msgSynchronizeSessionList size:%d."
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r2, r0)
                y72.c r0 = y72.C102816c.this
                y72.a r0 = r0.f303512b
                if (r0 == 0) goto L_0x0373
                y72.h r0 = (y72.C102823h) r0
                r0.mo142551a()
            L_0x0373:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y72.C102816c.C102817a.run():void");
        }
    }

    /* renamed from: y72.c$b */
    public static class C102818b {

        /* renamed from: a */
        public String f303519a;

        public C102818b(String str) {
            this.f303519a = str;
        }
    }

    /* renamed from: a */
    public LinkedList<C102818b> mo142547a() {
        long nowMilliSecond = Util.nowMilliSecond();
        LinkedList<C102818b> linkedList = new LinkedList<>();
        Cursor I = ((C44660i2) C98544e.m128035f().mo137901e().mo137895c()).mo69738I(1, C102913k.m136055t(), "*", -1);
        if (I.getCount() == 0) {
            Log.m105920e("MicroMsg.MsgSynchronizePack", "calculateConversationList empty conversation!");
            I.close();
            return linkedList;
        }
        Log.m105925i("MicroMsg.MsgSynchronizePack", "calculateConversationList count[%d]", Integer.valueOf(I.getCount()));
        int i = 0;
        while (true) {
            if (!I.moveToNext()) {
                break;
            } else if (this.f303511a) {
                I.close();
                Log.m105920e("MicroMsg.MsgSynchronizePack", "calculateConversationList is cancel!");
                return linkedList;
            } else if (i >= C38972b.f105001f) {
                Log.m105925i("MicroMsg.MsgSynchronizePack", "calculateConversationList convCount has reach the max, finish. convCount:%d", Integer.valueOf(i));
                break;
            } else {
                C72976h2 h2Var = new C72976h2();
                h2Var.convertFrom(I);
                if (!Util.isNullOrNil(h2Var.getUsername())) {
                    int Vx0 = ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).Vx0(h2Var.getUsername());
                    Log.m105925i("MicroMsg.MsgSynchronizePack", "calculateConversationList user:%s convMsgCount:%d, convCount:%d", h2Var.getUsername(), Integer.valueOf(Vx0), Integer.valueOf(i));
                    if (Vx0 > 0) {
                        linkedList.add(new C102818b(h2Var.getUsername()));
                        i++;
                    }
                }
            }
        }
        I.close();
        Log.m105924i("MicroMsg.MsgSynchronizePack", "calculateConversationList loading time:" + Util.milliSecondsToNow(nowMilliSecond));
        return linkedList;
    }

    /* renamed from: b */
    public void mo142548b(C102819d dVar, LinkedList<C102818b> linkedList, long j, long j2, int i) {
        ((C119157j) C119157j.f356862d).mo183884o(new C102817a(linkedList, dVar, j, j2, i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0122  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo142549c(y72.C102819d r28, y72.C102816c.C102818b r29, long r30, long r32, java.lang.String r34, int r35, com.tencent.p014mm.pointers.PInt r36, com.tencent.p014mm.pointers.PLong r37, int r38) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r36
            r5 = r37
            r6 = r38
            java.lang.String r7 = "_"
            java.lang.String r0 = r2.f303520a
            java.lang.String r8 = "getMore"
            boolean r8 = r0.equals(r8)
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.u3 r0 = r0.mo105907v()
            java.lang.String r9 = r3.f303519a
            com.tencent.mm.storage.z1 r0 = r0.get(r9)
            int r0 = r0.mo73953E2()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85810M4(r0)
            r9 = 1
            if (r0 == 0) goto L_0x0030
            return r9
        L_0x0030:
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r11 = r3.f303519a
            r12 = 0
            r0[r12] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r35)
            r0[r9] = r11
            java.lang.String r11 = "MicroMsg.MsgSynchronizePack"
            java.lang.String r13 = "synchronizeSessionPack convName:%s, unReadCount:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r13, r0)
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r6)
            hv0.e r0 = hv0.C98544e.m128035f()
            hv0.c r0 = r0.mo137901e()
            g62.l r0 = r0.mo137897e()
            java.lang.String r15 = r3.f303519a
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            r0.getClass()
            int r16 = (r32 > r30 ? 1 : (r32 == r30 ? 0 : -1))
            if (r16 >= 0) goto L_0x006e
            r9 = r30
            r18 = r13
            r12 = r32
            goto L_0x0074
        L_0x006e:
            r9 = r32
            r18 = r13
            r12 = r30
        L_0x0074:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r19 = r7
            java.lang.String r7 = "SELECT COUNT(*) FROM ( SELECT * FROM "
            r4.append(r7)
            java.lang.String r7 = r0.hy0(r15)
            r4.append(r7)
            java.lang.String r7 = " WHERE"
            r4.append(r7)
            java.lang.String r5 = r0.iy0(r15)
            r4.append(r5)
            java.lang.String r5 = " AND createTime >= "
            r20 = r14
            java.lang.String r14 = ""
            r21 = 0
            int r23 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r23 <= 0) goto L_0x00af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            goto L_0x00b0
        L_0x00af:
            r1 = r14
        L_0x00b0:
            r4.append(r1)
            java.lang.String r1 = " AND createTime <= "
            int r12 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r12 <= 0) goto L_0x00c9
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r1)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            goto L_0x00ca
        L_0x00c9:
            r9 = r14
        L_0x00ca:
            r4.append(r9)
            java.lang.String r9 = " ORDER BY "
            r4.append(r9)
            java.lang.String r10 = "createTime"
            r4.append(r10)
            java.lang.String r12 = ")"
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r12 = 2
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r17 = 0
            r13[r17] = r15
            r15 = 1
            r13[r15] = r4
            java.lang.String r15 = "MicroMsg.MsgInfoStorage"
            java.lang.String r12 = "getCountAfterStratTimeBeforeEndTime talk:%s [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r15, r12, r13)
            zh3.f r0 = r0.f212775p
            r12 = 0
            r13 = 2
            android.database.Cursor r4 = r0.rawQuery(r4, r12, r13)
            boolean r0 = r4.moveToFirst()     // Catch:{ Exception -> 0x010a }
            if (r0 == 0) goto L_0x0111
            r13 = 0
            int r0 = r4.getInt(r13)     // Catch:{ Exception -> 0x010a }
            goto L_0x0112
        L_0x0105:
            r0 = move-exception
            r3 = r27
            goto L_0x0356
        L_0x010a:
            r0 = move-exception
            r13 = 0
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ all -> 0x0105 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r15, r0, r14, r12)     // Catch:{ all -> 0x0105 }
        L_0x0111:
            r0 = 0
        L_0x0112:
            r4.close()
            java.lang.String r4 = "synchronizeSessionPack session no message to sync"
            if (r0 > 0) goto L_0x0122
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
            r3 = r27
        L_0x011f:
            r1 = 0
            goto L_0x024b
        L_0x0122:
            hv0.e r12 = hv0.C98544e.m128035f()
            hv0.c r12 = r12.mo137901e()
            g62.l r12 = r12.mo137897e()
            java.lang.String r13 = r3.f303519a
            com.tencent.mm.storage.g4 r12 = (com.tencent.p014mm.storage.C72972g4) r12
            r12.getClass()
            if (r16 >= 0) goto L_0x0144
            r16 = r4
            r26 = r11
            r24 = r14
            r25 = r15
            r14 = r30
            r3 = r32
            goto L_0x0150
        L_0x0144:
            r16 = r4
            r26 = r11
            r24 = r14
            r25 = r15
            r3 = r30
            r14 = r32
        L_0x0150:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r2 = "SELECT * FROM ( SELECT * FROM "
            r11.append(r2)
            java.lang.String r2 = r12.hy0(r13)
            r11.append(r2)
            r11.append(r7)
            java.lang.String r2 = r12.iy0(r13)
            r11.append(r2)
            int r2 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r2 <= 0) goto L_0x017f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0181
        L_0x017f:
            r2 = r24
        L_0x0181:
            r11.append(r2)
            int r2 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r2 <= 0) goto L_0x0198
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            goto L_0x019a
        L_0x0198:
            r14 = r24
        L_0x019a:
            r11.append(r14)
            r11.append(r9)
            r11.append(r10)
            java.lang.String r1 = " DESC LIMIT "
            r11.append(r1)
            r11.append(r6)
            java.lang.String r1 = ") ORDER BY "
            r11.append(r1)
            r11.append(r10)
            java.lang.String r1 = " ASC"
            r11.append(r1)
            java.lang.String r1 = r11.toString()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r13
            java.lang.Integer r4 = java.lang.Integer.valueOf(r38)
            r5 = 1
            r2[r5] = r4
            r4 = 2
            r2[r4] = r1
            java.lang.String r4 = "getCursorAfterStratTimeBeforeEndTimeLimit talk:%s limitCount:%d [%s]"
            r7 = r25
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r4, r2)
            zh3.f r2 = r12.f212775p
            r4 = 0
            android.database.Cursor r1 = r2.rawQuery(r1, r4)
            if (r8 == 0) goto L_0x01e7
            if (r0 <= r6) goto L_0x01e3
            r2 = r28
            r2.f303526g = r3
            goto L_0x01e7
        L_0x01e3:
            r2 = r28
            r2.f303526g = r5
        L_0x01e7:
            boolean r0 = r1.moveToNext()
            java.lang.String r2 = "synchronizeSessionPack is cancel!"
            if (r0 == 0) goto L_0x0235
            r3 = r27
            boolean r0 = r3.f303511a
            if (r0 == 0) goto L_0x0200
            r5 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            r1.close()
            goto L_0x011f
        L_0x0200:
            r5 = r26
            com.tencent.mm.storage.f4 r0 = new com.tencent.mm.storage.f4
            r0.<init>()
            r0.convertFrom(r1)
            long r6 = r0.getCreateTime()
            int r2 = (r6 > r30 ? 1 : (r6 == r30 ? 0 : -1))
            if (r2 < 0) goto L_0x022e
            long r6 = r0.getCreateTime()
            int r2 = (r6 > r32 ? 1 : (r6 == r32 ? 0 : -1))
            if (r2 > 0) goto L_0x022e
            int r2 = r0.getType()
            r6 = 922746929(0x37000031, float:7.629439E-6)
            if (r2 != r6) goto L_0x0225
            r2 = 0
            goto L_0x0226
        L_0x0225:
            r2 = 1
        L_0x0226:
            if (r2 == 0) goto L_0x022e
            r6 = r20
            r6.add(r0)
            goto L_0x0230
        L_0x022e:
            r6 = r20
        L_0x0230:
            r26 = r5
            r20 = r6
            goto L_0x01e7
        L_0x0235:
            r3 = r27
            r6 = r20
            r5 = r26
            r1.close()
            int r0 = r6.size()
            if (r0 > 0) goto L_0x024c
            r0 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            goto L_0x011f
        L_0x024b:
            return r1
        L_0x024c:
            r1 = 0
            java.util.Iterator r6 = r6.iterator()
            r7 = r35
        L_0x0253:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x02b6
            java.lang.Object r0 = r6.next()
            r8 = r0
            com.tencent.mm.storage.f4 r8 = (com.tencent.p014mm.storage.C72963f4) r8
            boolean r0 = r3.f303511a
            if (r0 == 0) goto L_0x0268
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
            return r1
        L_0x0268:
            com.tencent.mm.pointers.PLong r11 = new com.tencent.mm.pointers.PLong
            r11.<init>()
            java.util.LinkedList r12 = new java.util.LinkedList
            r12.<init>()
            r9 = 0
            if (r7 <= 0) goto L_0x0277
            r13 = 1
            goto L_0x0278
        L_0x0277:
            r13 = 0
        L_0x0278:
            r14 = 1
            r10 = r34
            te3.f9 r0 = dv0.C75459j.m90495a(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0281 }
            r8 = 0
            goto L_0x028d
        L_0x0281:
            r0 = move-exception
            r1 = r0
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r9 = "packMsg"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r1, r9, r0)
            r0 = r4
        L_0x028d:
            if (r0 != 0) goto L_0x0294
            r8 = r37
            r1 = r18
            goto L_0x02b2
        L_0x0294:
            r1 = r18
            r1.add(r0)
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r0 = r0.toString()
            r10[r8] = r0
            java.lang.String r0 = "bakItem:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r0, r10)
            r8 = r37
            long r9 = r8.value
            r11 = 1
            long r9 = r9 + r11
            r8.value = r9
            int r7 = r7 + -1
        L_0x02b2:
            r18 = r1
            r1 = 0
            goto L_0x0253
        L_0x02b6:
            r1 = r18
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r2 = r1.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r0[r4] = r2
            java.lang.String r2 = "synchronizeSessionPack bakChatMsgList size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r2, r0)
            te3.g9 r2 = new te3.g9
            r2.<init>()
            r2.f298276e = r1
            int r0 = r1.size()
            r2.f298275d = r0
            byte[] r0 = r2.toByteArray()     // Catch:{ Exception -> 0x0335 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0335 }
            r4.<init>()     // Catch:{ Exception -> 0x0335 }
            java.lang.String r6 = "MSG_"
            r4.append(r6)     // Catch:{ Exception -> 0x0335 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x0335 }
            r4.append(r1)     // Catch:{ Exception -> 0x0335 }
            r1 = r19
            r4.append(r1)     // Catch:{ Exception -> 0x0335 }
            r6 = r29
            java.lang.String r6 = r6.f303519a     // Catch:{ Exception -> 0x0335 }
            r4.append(r6)     // Catch:{ Exception -> 0x0335 }
            r4.append(r1)     // Catch:{ Exception -> 0x0335 }
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ Exception -> 0x0335 }
            r4.append(r6)     // Catch:{ Exception -> 0x0335 }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x0335 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0335 }
            r4.<init>()     // Catch:{ Exception -> 0x0335 }
            eb0.c r6 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0335 }
            java.lang.String r6 = r6.mo105901p()     // Catch:{ Exception -> 0x0335 }
            r4.append(r6)     // Catch:{ Exception -> 0x0335 }
            java.lang.String r6 = "msgsynchronize/syncFile/"
            r4.append(r6)     // Catch:{ Exception -> 0x0335 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0335 }
            y72.C102825i.m135892a(r4, r1, r0)     // Catch:{ Exception -> 0x0335 }
            java.lang.String r0 = "synchronizeSessionPack add MsgSynchronize, tagTextClientId:%s"
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0335 }
            r4 = 0
            r6[r4] = r1     // Catch:{ Exception -> 0x0335 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r6)     // Catch:{ Exception -> 0x0335 }
            r1 = r36
            r2 = 1
            goto L_0x0350
        L_0x0335:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r2.f298275d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 0
            r1[r4] = r2
            java.lang.String r0 = r0.getMessage()
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "ERROR: synchronizeSessionPack BakChatMsgList to Buffer list:%d :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r0, r1)
            r1 = r36
        L_0x0350:
            int r0 = r1.value
            int r0 = r0 + r2
            r1.value = r0
            return r2
        L_0x0356:
            r4.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y72.C102816c.mo142549c(y72.d, y72.c$b, long, long, java.lang.String, int, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PLong, int):boolean");
    }
}
