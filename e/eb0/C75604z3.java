package eb0;

import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.autogen.events.DeleteMsgEvent;
import com.tencent.p014mm.autogen.events.MsgInsertWithNewContactEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.SemiXml;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72986n2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tav.coremedia.TimeUtil;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.SQLiteDirectCursor;
import com.tencent.wcdb.database.SQLiteStatement;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ob0.C35136m;
import q90.C101062d;
import qp3.C118204f;
import te3.C77949j3;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: eb0.z3 */
public final class C75604z3 {

    /* renamed from: a */
    public static volatile long f222092a;

    /* renamed from: b */
    public static volatile boolean f222093b;

    /* renamed from: A */
    public static String m90826A(String str, String str2) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        if (Util.isNullOrNil(str2)) {
            return str;
        }
        return str2 + ": " + str;
    }

    /* renamed from: B */
    public static void m90827B() {
        Cursor rawQuery = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).f212775p.rawQuery("select * from message wherecontent like '%aaaabbbbbfdf%'", (String[]) null, 2);
        rawQuery.getCount();
        SystemClock.sleep(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        rawQuery.close();
    }

    /* renamed from: C */
    public static void m90828C(C72963f4 f4Var) {
        Class cls = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(f4Var.mo108768t());
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            C72996z1 z1Var2 = new C72996z1(f4Var.mo108768t());
            z1Var2.setType(2);
            MsgInsertWithNewContactEvent msgInsertWithNewContactEvent = new MsgInsertWithNewContactEvent();
            msgInsertWithNewContactEvent.f78869d.f78870a = z1Var2;
            msgInsertWithNewContactEvent.publish();
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(z1Var2);
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
    }

    /* renamed from: a */
    public static int m90829a() {
        com.tencent.wcdb.Cursor rawQueryWithFactory;
        if (f222093b) {
            Log.m105924i("MicroMsg.MsgInfoStorageLogic", "checkUnfinishedDeleteMsgTask already started.");
            return -1;
        }
        C72986n2 n2Var = (C72986n2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96093DX();
        n2Var.getClass();
        HashMap hashMap = new HashMap();
        try {
            long Yt = n2Var.mo101182Yt("SELECT reserved2 FROM DeletedConversationInfo WHERE userName=''", (String[]) null);
            rawQueryWithFactory = n2Var.f212813e.mo125615f().rawQueryWithFactory(SQLiteDirectCursor.FACTORY, "SELECT userName, reserved2 FROM DeletedConversationInfo WHERE reserved2 > 0", (Object[]) null, "DeletedConversationInfo");
            while (rawQueryWithFactory.moveToNext()) {
                String string = rawQueryWithFactory.getString(0);
                long j = rawQueryWithFactory.getLong(1);
                if (j == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                    j = 0;
                }
                ((C101062d) n2Var.f212812d).mo139557c(string, Long.valueOf(Math.max(Yt, j)));
                hashMap.put(string, Long.valueOf(j));
            }
            rawQueryWithFactory.close();
        } catch (IllegalStateException e) {
            Log.printErrStackTrace("MicroMsg.DeletedConversationInfoStorage", e, "getAllUnfinishDeleteTalker failed", new Object[0]);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (hashMap.isEmpty()) {
            Log.m105924i("MicroMsg.MsgInfoStorageLogic", "summerdel checkUnfinishedDeleteMsgTask all finished!");
            return 0;
        }
        ThreadPool.post(new z3$$d(hashMap), "checkUnfinishedDeleteMsgTask");
        return hashMap.size();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x020d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0213, code lost:
        r0 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:99:0x01f9, B:108:0x0209] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0209 A[SYNTHETIC, Splitter:B:108:0x0209] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m90830b(long r26, int r28) {
        /*
            r0 = r26
            r2 = r28
            java.lang.String r3 = "message"
            java.lang.Class<f62.k0> r4 = f62.C75700k0.class
            java.lang.String r5 = "MicroMsg.MsgInfoStorageLogic"
            java.lang.System.currentTimeMillis()
            r6 = 1
            if (r2 != r6) goto L_0x0013
            eb0.z3$$j.m107249b()
        L_0x0013:
            eb0.z3$$j r8 = new eb0.z3$$j     // Catch:{ IOException -> 0x0224 }
            r8.<init>()     // Catch:{ IOException -> 0x0224 }
            k40.a r9 = f40.C86709a0.m107533q(r4)     // Catch:{ all -> 0x0215 }
            f62.k0 r9 = (f62.C75700k0) r9     // Catch:{ all -> 0x0215 }
            g62.l r9 = r9.mo96095LE()     // Catch:{ all -> 0x0215 }
            com.tencent.mm.storage.g4 r9 = (com.tencent.p014mm.storage.C72972g4) r9     // Catch:{ all -> 0x0215 }
            android.database.Cursor r9 = r9.mo101143uP(r3, r0)     // Catch:{ all -> 0x0215 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0204 }
            r8.f251328g = r10     // Catch:{ all -> 0x0204 }
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0034:
            boolean r16 = r9.moveToNext()     // Catch:{ all -> 0x0204 }
            if (r16 == 0) goto L_0x00a3
            com.tencent.mm.storage.f4 r6 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x009b }
            r6.<init>()     // Catch:{ all -> 0x009b }
            r6.convertFrom(r9)     // Catch:{ all -> 0x009b }
            int r17 = r6.getType()     // Catch:{ all -> 0x009b }
            switch(r17) {
                case -1879048191: goto L_0x004f;
                case -1879048190: goto L_0x004f;
                case -1879048189: goto L_0x004f;
                default: goto L_0x0049;
            }
        L_0x0049:
            r7 = r17
            r17 = r5
            r5 = 3
            goto L_0x0054
        L_0x004f:
            r17 = r5
            r5 = 3
            r7 = 49
        L_0x0054:
            if (r7 == r5) goto L_0x007d
            r5 = 23
            if (r7 == r5) goto L_0x007d
            r5 = 34
            if (r7 == r5) goto L_0x007a
            r5 = 49
            if (r7 == r5) goto L_0x0077
            r5 = 62
            if (r7 == r5) goto L_0x0074
            r5 = 486539313(0x1d000031, float:1.6940758E-21)
            if (r7 == r5) goto L_0x0074
            r5 = 43
            if (r7 == r5) goto L_0x0074
            r5 = 44
            if (r7 == r5) goto L_0x0074
            goto L_0x007f
        L_0x0074:
            int r13 = r13 + 1
            goto L_0x007f
        L_0x0077:
            int r12 = r12 + 1
            goto L_0x007f
        L_0x007a:
            int r11 = r11 + 1
            goto L_0x007f
        L_0x007d:
            int r10 = r10 + 1
        L_0x007f:
            int r14 = r14 + 1
            r5 = 1
            m90833e(r6, r5)     // Catch:{ all -> 0x0095 }
            int r15 = r15 + r5
            r5 = 100
            if (r15 < r5) goto L_0x0097
            r8.mo120970a()     // Catch:{ all -> 0x0095 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0095 }
            r8.f251328g = r5     // Catch:{ all -> 0x0095 }
            r15 = 0
            goto L_0x0097
        L_0x0095:
            r0 = move-exception
            goto L_0x009e
        L_0x0097:
            r5 = r17
            r6 = 1
            goto L_0x0034
        L_0x009b:
            r0 = move-exception
            r17 = r5
        L_0x009e:
            r1 = r0
            r2 = r17
            goto L_0x0207
        L_0x00a3:
            r17 = r5
            r5 = 23
            r6 = 34
            r9.close()     // Catch:{ all -> 0x0200 }
            r8.mo120970a()     // Catch:{ all -> 0x0200 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0200 }
            r8.f251328g = r5     // Catch:{ all -> 0x0200 }
            k40.a r4 = f40.C86709a0.m107533q(r4)     // Catch:{ all -> 0x0200 }
            f62.k0 r4 = (f62.C75700k0) r4     // Catch:{ all -> 0x0200 }
            g62.l r4 = r4.mo96095LE()     // Catch:{ all -> 0x0200 }
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4     // Catch:{ all -> 0x0200 }
            int r0 = r4.mo101079Ow(r3, r0)     // Catch:{ all -> 0x0200 }
            r8.mo120970a()     // Catch:{ all -> 0x0200 }
            kj2.d r1 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0200 }
            r19 = 1333(0x535, float:1.868E-42)
            r20 = 10
            r21 = 3
            r23 = 1
            r18 = r1
            r22 = r0
            r18.mo160138m(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0200 }
            long r3 = r8.f251327f     // Catch:{ all -> 0x0200 }
            r19 = 1333(0x535, double:6.586E-321)
            r21 = 8
            r5 = 1000(0x3e8, double:4.94E-321)
            long r23 = r3 / r5
            r25 = 1
            r18 = r1
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ all -> 0x0200 }
            r5 = 1
            if (r2 != r5) goto L_0x00fe
            r19 = 1333(0x535, double:6.586E-321)
            r21 = 1
            r23 = 1
            r25 = 1
            r18 = r1
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ all -> 0x00fb }
            goto L_0x00fe
        L_0x00fb:
            r0 = move-exception
            goto L_0x0186
        L_0x00fe:
            r5 = 10000000(0x989680, float:1.4012985E-38)
            if (r0 < r5) goto L_0x0106
            r6 = 26
            goto L_0x0126
        L_0x0106:
            r5 = 1000000(0xf4240, float:1.401298E-39)
            if (r0 < r5) goto L_0x010e
            r6 = 25
            goto L_0x0126
        L_0x010e:
            r5 = 100000(0x186a0, float:1.4013E-40)
            if (r0 < r5) goto L_0x0116
            r6 = 24
            goto L_0x0126
        L_0x0116:
            r5 = 10000(0x2710, float:1.4013E-41)
            if (r0 < r5) goto L_0x011d
            r6 = 23
            goto L_0x0126
        L_0x011d:
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r5) goto L_0x0124
            r6 = 22
            goto L_0x0126
        L_0x0124:
            r6 = 21
        L_0x0126:
            r19 = 1333(0x535, double:6.586E-321)
            long r5 = (long) r6
            r23 = 1
            r25 = 1
            r18 = r1
            r21 = r5
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ all -> 0x0200 }
            r5 = 1800000(0x1b7740, double:8.89318E-318)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x013e
            r7 = 36
            goto L_0x0167
        L_0x013e:
            r5 = 600000(0x927c0, double:2.964394E-318)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0148
            r7 = 35
            goto L_0x0167
        L_0x0148:
            r5 = 180000(0x2bf20, double:8.8932E-319)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0152
            r7 = 34
            goto L_0x0167
        L_0x0152:
            r5 = 60000(0xea60, double:2.9644E-319)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x015c
            r7 = 33
            goto L_0x0167
        L_0x015c:
            r5 = 10000(0x2710, double:4.9407E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0165
            r7 = 32
            goto L_0x0167
        L_0x0165:
            r7 = 31
        L_0x0167:
            r19 = 1333(0x535, double:6.586E-321)
            long r5 = (long) r7     // Catch:{ all -> 0x0200 }
            r23 = 1
            r25 = 1
            r18 = r1
            r21 = r5
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ all -> 0x0200 }
            if (r0 <= 0) goto L_0x018b
            r19 = 1333(0x535, double:6.586E-321)
            r21 = 12
            long r5 = (long) r0
            long r23 = r3 / r5
            r25 = 1
            r18 = r1
            r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ all -> 0x00fb }
            goto L_0x018b
        L_0x0186:
            r1 = r0
            r2 = r17
            goto L_0x0218
        L_0x018b:
            r0 = 18923(0x49eb, float:2.6517E-41)
            r5 = 8
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0200 }
            java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0200 }
            r7 = 0
            r5[r7] = r6     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r28)     // Catch:{ all -> 0x0200 }
            r6 = 1
            r5[r6] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0200 }
            r6 = 2
            r5[r6] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0200 }
            r7 = 3
            r5[r7] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0200 }
            r7 = 4
            r5[r7] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0200 }
            r9 = 5
            r5[r9] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0200 }
            r15 = 6
            r5[r15] = r2     // Catch:{ all -> 0x0200 }
            r2 = 7
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0200 }
            r5[r2] = r16     // Catch:{ all -> 0x0200 }
            r1.mo160131h(r0, r5)     // Catch:{ all -> 0x0200 }
            java.lang.String r0 = "Clear all messages, time: %d, total: %d, app: %d, image: %d, video: %d, voice: %d"
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ all -> 0x0200 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0200 }
            r3 = 0
            r1[r3] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0200 }
            r3 = 1
            r1[r3] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0200 }
            r1[r6] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0200 }
            r3 = 3
            r1[r3] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0200 }
            r1[r7] = r2     // Catch:{ all -> 0x0200 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0200 }
            r1[r9] = r2     // Catch:{ all -> 0x0200 }
            r2 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)     // Catch:{ all -> 0x0213 }
            r8.close()     // Catch:{ IOException -> 0x0222 }
            goto L_0x022e
        L_0x0200:
            r0 = move-exception
            r2 = r17
            goto L_0x0217
        L_0x0204:
            r0 = move-exception
            r2 = r5
            r1 = r0
        L_0x0207:
            if (r9 == 0) goto L_0x0212
            r9.close()     // Catch:{ all -> 0x020d }
            goto L_0x0212
        L_0x020d:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch:{ all -> 0x0213 }
        L_0x0212:
            throw r1     // Catch:{ all -> 0x0213 }
        L_0x0213:
            r0 = move-exception
            goto L_0x0217
        L_0x0215:
            r0 = move-exception
            r2 = r5
        L_0x0217:
            r1 = r0
        L_0x0218:
            r8.close()     // Catch:{ all -> 0x021c }
            goto L_0x0221
        L_0x021c:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch:{ IOException -> 0x0222 }
        L_0x0221:
            throw r1     // Catch:{ IOException -> 0x0222 }
        L_0x0222:
            r0 = move-exception
            goto L_0x0226
        L_0x0224:
            r0 = move-exception
            r2 = r5
        L_0x0226:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x022e:
            eb0.z3$$j.m107249b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75604z3.m90830b(long, int):void");
    }

    /* renamed from: c */
    public static void m90831c() {
        Class cls = C75700k0.class;
        List<C72963f4> bO = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101106bO("qmessage");
        if (bO != null) {
            for (int i = 0; i < bO.size(); i++) {
                m90833e(bO.get(i), true);
            }
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101104bD("qmessage");
    }

    /* renamed from: d */
    public static void m90832d() {
        Class cls = C75700k0.class;
        List<C72963f4> bO = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101106bO("tmessage");
        if (bO != null) {
            for (int i = 0; i < bO.size(); i++) {
                m90833e(bO.get(i), true);
            }
        }
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101104bD("tmessage");
    }

    /* renamed from: e */
    public static void m90833e(C72963f4 f4Var, boolean z) {
        if (f4Var != null) {
            C35136m a = C35136m.C35140d.m40570a(Integer.valueOf(((C31478i2) C86312j.m106911c(C31478i2.class)).mo58194ih(f4Var.getType())));
            if (a != null) {
                a.mo56404ld(new C35136m.C35138c(f4Var));
            }
            if (z) {
                DeleteMsgEvent deleteMsgEvent = new DeleteMsgEvent();
                deleteMsgEvent.f78765d.f78766a = f4Var.getMsgId();
                deleteMsgEvent.f78765d.f78767b = f4Var.mo108768t();
                deleteMsgEvent.f78765d.f78768c = f4Var.getType();
                deleteMsgEvent.publish();
            }
        }
    }

    /* renamed from: f */
    public static int m90834f(long j) {
        Class cls = C75700k0.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(j);
        if (b002.getMsgId() != j) {
            return 0;
        }
        m90833e(b002, true);
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101125kD(j);
    }

    /* renamed from: g */
    public static int m90835g(String str, long j) {
        Class cls = C75700k0.class;
        C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(str, j);
        if (h302.mo108774y2() != j) {
            return 0;
        }
        m90833e(h302, true);
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).mo101087SE(str, j);
    }

    /* renamed from: h */
    public static void m90836h(String str, z3$$g z3__g) {
        m90837i(Collections.singletonList(str), z3__g, MAlarmHandler.NEXT_FIRE_INTERVAL);
    }

    /* renamed from: i */
    public static void m90837i(List<String> list, z3$$g z3__g, long j) {
        Log.m105925i("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker[%s] stack[%s]", Objects.toString(list), Util.getStack());
        z3$$e z3__e = new z3$$e(z3__g);
        if (list == null || list.isEmpty()) {
            Log.m105920e("MicroMsg.MsgInfoStorageLogic", "summerdel deleteMsgByTalker is null or empty");
            MMHandlerThread.postToMainThread(z3__e);
            return;
        }
        ThreadPool.post(new z3$$f(list, j, z3__e), "AsyncDeleteMessageStage1");
    }

    /* renamed from: j */
    public static int m90838j(List<String> list, z3$$i z3__i, long j, long j2, CancellationSignal cancellationSignal) {
        z3$$i z3__i2 = z3__i;
        CancellationSignal cancellationSignal2 = cancellationSignal;
        String str = " AND (type = ";
        if (cancellationSignal2 == null || !cancellationSignal.isCanceled()) {
            C31505r2 r2Var = (C31505r2) C86312j.m106911c(C31505r2.class);
            SQLiteDatabase f = C86709a0.m107535s().f251811i.mo125615f();
            if (z3__i2 != null) {
                z3__i2.mo105958a(0, list.size());
            }
            Object[] objArr = new Object[2];
            int i = 0;
            int i2 = 0;
            while (i < list.size()) {
                int i3 = i + 4;
                int min = Math.min(i3, list.size());
                List<String> subList = list.subList(i, min);
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                int i4 = i3;
                sb.append(TextUtils.join(",", new C118204f(subList, new z3$$b())));
                sb.append(")");
                String sb4 = sb.toString();
                long nanoTime = System.nanoTime();
                C119179t tVar = C119157j.f356862d;
                String str2 = str;
                ((C119157j) tVar).mo183871b(new z3$$c(subList, r2Var, j2), "SyncDeleteFTSTalker");
                f.beginTransaction();
                try {
                    objArr[0] = Long.valueOf(j);
                    objArr[1] = Long.valueOf(j2);
                    f.execSQL("DELETE FROM ImgInfo2 WHERE id IN (SELECT ImgInfo2.reserved1 FROM message JOIN ImgInfo2 ON message.msgId = ImgInfo2.msglocalid WHERE talker IN " + sb4 + " AND type = " + 3 + " AND message.createTime >= ? AND message.createTime < ?)", objArr, cancellationSignal2);
                    f.execSQL("DELETE FROM ImgInfo2 WHERE msglocalid IN (SELECT msgId FROM message WHERE talker IN " + sb4 + " AND type = " + 3 + " AND createTime >= ? AND createTime < ?)", objArr, cancellationSignal2);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("(");
                    sb5.append(TextUtils.join(",", Arrays.asList(new Integer[]{43, 62, 44, 486539313})));
                    sb5.append(")");
                    String sb6 = sb5.toString();
                    f.execSQL("DELETE FROM videoinfo2 WHERE filename IN (SELECT imgPath FROM message WHERE talker IN " + sb4 + " AND type IN " + sb6 + " AND createTime >= ? AND createTime < ?)", objArr, cancellationSignal2);
                    f.execSQL("DELETE FROM voiceinfo WHERE FileName IN (SELECT imgPath FROM message WHERE talker IN " + sb4 + " AND type = " + 34 + " AND createTime >= ? AND createTime < ?)", objArr, cancellationSignal2);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("DELETE FROM appattach WHERE msgInfoId IN (SELECT msgId FROM message WHERE talker IN ");
                    sb7.append(sb4);
                    String str3 = str2;
                    sb7.append(str3);
                    sb7.append(49);
                    sb7.append(" OR type = ");
                    sb7.append(1090519089);
                    sb7.append(") AND createTime >= ? AND createTime < ?)");
                    f.execSQL(sb7.toString(), objArr, cancellationSignal2);
                    f.execSQL("DELETE FROM AppMessage WHERE msgId IN (SELECT msgId FROM message WHERE talker IN " + sb4 + str3 + 49 + " OR type >= 65585) AND createTime >= ? AND createTime < ?)", objArr, cancellationSignal2);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("DELETE FROM message WHERE talker IN ");
                    sb8.append(sb4);
                    sb8.append(" AND createTime >= ? AND createTime < ?");
                    SQLiteStatement compileStatement = f.compileStatement(sb8.toString());
                    compileStatement.bindAllArgs(objArr);
                    int executeUpdateDelete = compileStatement.executeUpdateDelete(cancellationSignal2);
                    f.setTransactionSuccessful();
                    try {
                        f.endTransaction();
                    } catch (RuntimeException unused) {
                    }
                    i2 += executeUpdateDelete;
                    z3$$i z3__i3 = z3__i;
                    if (z3__i3 != null) {
                        z3__i3.mo105958a(min, list.size());
                    }
                    Log.m105925i("MicroMsg.MsgInfoStorageLogic", "(time: %d, messages: %d) deleteMsgByTalkerSync: %s", Long.valueOf((System.nanoTime() - nanoTime) / TimeUtil.SECOND_TO_US), Integer.valueOf(executeUpdateDelete), sb4);
                    str = str3;
                    z3__i2 = z3__i3;
                    i = i4;
                } catch (OperationCanceledException e) {
                    z3$$i z3__i4 = z3__i;
                    if (z3__i4 != null) {
                        z3__i4.mo105959d(true, i2);
                        try {
                            f.endTransaction();
                        } catch (RuntimeException unused2) {
                        }
                        return i2;
                    }
                    throw e;
                } catch (Throwable th) {
                    try {
                        f.endTransaction();
                    } catch (RuntimeException unused3) {
                    }
                    throw th;
                }
            }
            z3$$i z3__i5 = z3__i2;
            if (z3__i5 != null) {
                z3__i5.mo105959d(false, i2);
            }
            return i2;
        }
        if (z3__i2 != null) {
            z3__i2.mo105959d(true, 0);
        }
        return 0;
    }

    /* renamed from: k */
    public static int m90839k(String str) {
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101089TE(str);
    }

    /* renamed from: l */
    public static String m90840l(boolean z, String str, int i) {
        return (!z || str == null || i != 0) ? str : m90849u(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r4 = ((com.tencent.p014mm.storage.C72972g4) ((f62.C75700k0) f40.C86709a0.m107533q(f62.C75700k0.class)).mo96095LE()).Ex0(r4);
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m90841m(java.lang.String r4, long r5) {
        /*
            if (r4 == 0) goto L_0x001e
            java.lang.Class<f62.k0> r0 = f62.C75700k0.class
            k40.a r0 = f40.C86709a0.m107533q(r0)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r4 = r0.Ex0(r4)
            if (r4 == 0) goto L_0x001e
            long r0 = r4.getCreateTime()
            r2 = 1
            long r0 = r0 + r2
            goto L_0x0020
        L_0x001e:
            r0 = 0
        L_0x0020:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r2
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0029
            return r0
        L_0x0029:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75604z3.m90841m(java.lang.String, long):long");
    }

    /* renamed from: n */
    public static void m90842n(C72963f4 f4Var, C35136m.C35137a aVar) {
        int i;
        if (f4Var == null || aVar == null || aVar.f94242a == null) {
            Log.m105921e("MicroMsg.MsgInfoStorageLogic", "summerbadcr fixRecvMsgWithAddMsgInfo error input is null, stack[%s]", Util.getStack());
            return;
        }
        long y2 = f4Var.mo108774y2();
        C77949j3 j3Var = aVar.f94242a;
        if (y2 == j3Var.f227638r) {
            if (f4Var.mo108769t2() == 0 || j3Var.f227639s != 0) {
                if (f4Var.mo108772w2() == 0 && (i = j3Var.f227639s) != 0) {
                    f4Var.mo108744X2((long) i);
                }
                int o2 = f4Var.mo108762o2();
                int i2 = aVar.f94243b ? o2 | 2 : o2 & -3;
                int i3 = aVar.f94244c ? i2 | 1 : i2 & -2;
                f4Var.mo108735O2(aVar.f94245d ? i3 | 4 : i3 & -5);
                if (f4Var.getMsgId() != 0) {
                    return;
                }
                if (aVar.f94243b || aVar.f94246e) {
                    if (Log.getLogLevel() <= 1) {
                        Log.m105925i("MicroMsg.MsgInfoStorageLogic", "fixRecvMsgWithAddMsgInfo fixtime case 2 fixTime:%s content:%s", Long.valueOf(aVar.f94247f), f4Var.getContent());
                    }
                    f4Var.mo108733M2(aVar.f94247f);
                }
            } else if (f4Var.getMsgId() == 0 && aVar.f94246e) {
                if (Log.getLogLevel() <= 1) {
                    Log.m105925i("MicroMsg.MsgInfoStorageLogic", "fixRecvMsgWithAddMsgInfo fixtime case 1, fixTime:%s content:%s", Long.valueOf(aVar.f94247f), f4Var.getContent());
                }
                f4Var.mo108733M2(aVar.f94247f);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0066  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m90843o(java.lang.String r12) {
        /*
            long r0 = m90844p()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "MicroMsg.MsgInfoStorageLogic"
            java.lang.String r6 = "[oneliang] fix send msg create time, after fix, now is :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r6, r3)
            r3 = 2
            r6 = 1
            if (r12 == 0) goto L_0x005f
            java.lang.Class<f62.k0> r8 = f62.C75700k0.class
            k40.a r8 = f40.C86709a0.m107533q(r8)
            f62.k0 r8 = (f62.C75700k0) r8
            g62.l r8 = r8.mo96095LE()
            com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
            com.tencent.mm.storage.f4 r12 = r8.Ex0(r12)
            if (r12 == 0) goto L_0x005f
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]
            long r9 = r12.getMsgId()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r5] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            r8[r2] = r9
            long r9 = r12.getCreateTime()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r8[r3] = r9
            java.lang.String r9 = "[oneliang] fix send msg create time, before return, msg id:%s, now is :%s createTime:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r9, r8)
            long r8 = r12.getCreateTime()
            long r8 = r8 + r6
            int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x005f
            long r8 = r12.getCreateTime()
            long r8 = r8 + r6
            goto L_0x0060
        L_0x005f:
            r8 = r0
        L_0x0060:
            long r10 = f222092a
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x007c
            long r8 = r8 + r6
            java.lang.Object[] r12 = new java.lang.Object[r3]
            long r6 = f222092a
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r12[r5] = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12[r2] = r0
            java.lang.String r0 = "[oneliang] fix send msg create time, check lastSendMsgCreateTime %s, now is :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r12)
        L_0x007c:
            f222092a = r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75604z3.m90843o(java.lang.String):long");
    }

    /* renamed from: p */
    public static long m90844p() {
        long currentTimeMillis = System.currentTimeMillis();
        long c = C31543z5.m39453c();
        if (Math.abs(currentTimeMillis - c) > 300000) {
            Log.m105928w("MicroMsg.MsgInfoStorageLogic", "[getFixTime] nowServer:" + c + " now:" + currentTimeMillis);
        }
        return c;
    }

    /* renamed from: q */
    public static int m90845q(C35136m.C35137a aVar) {
        int i = aVar.f94243b ? 2 : 0;
        if (aVar.f94244c) {
            i |= 1;
        }
        return aVar.f94245d ? i | 4 : i;
    }

    /* renamed from: r */
    public static String m90846r(String str) {
        int t = m90848t(str);
        return t != -1 ? str.substring(t + 1).trim() : str;
    }

    /* renamed from: s */
    public static String m90847s(String str) {
        int t = m90848t(str);
        if (t == -1) {
            return null;
        }
        return str.substring(0, t);
    }

    /* renamed from: t */
    public static int m90848t(String str) {
        if (str == null) {
            Log.m105920e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos text is null]");
            return -1;
        } else if (str.length() <= 0) {
            Log.m105920e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos length < 0]");
            return -1;
        } else if (str.startsWith(SemiXml.MAGIC_HEAD)) {
            Log.m105920e("MicroMsg.MsgInfoStorageLogic", "dz[getGroupChatMsgTalkerPos startsWith(SemiXml.MAGIC_HEAD)]");
            return -1;
        } else {
            int indexOf = str.indexOf(58);
            if (indexOf == -1 || !str.substring(0, indexOf).contains("<")) {
                return indexOf;
            }
            Log.m105920e("MicroMsg.MsgInfoStorageLogic", "dz[reject illegal character]");
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r0 = r0 + 2;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m90849u(java.lang.String r2) {
        /*
            int r0 = m90848t(r2)
            r1 = -1
            if (r0 != r1) goto L_0x0008
            return r2
        L_0x0008:
            int r0 = r0 + 2
            int r1 = r2.length()
            if (r0 < r1) goto L_0x0011
            return r2
        L_0x0011:
            java.lang.String r2 = r2.substring(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: eb0.C75604z3.m90849u(java.lang.String):java.lang.String");
    }

    /* renamed from: v */
    public static int m90850v(String str) {
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).Yx0(str);
    }

    /* renamed from: w */
    public static z3$$h m90851w(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        try {
            Map<String, String> parseXml = XmlParser.parseXml(str, "msgsource", (String) null);
            if (parseXml != null) {
                if (!parseXml.isEmpty()) {
                    z3$$h z3__h = new z3$$h();
                    z3__h.f222094a = parseXml.get(".msgsource.bizmsg.msgcluster");
                    z3__h.f222099f = parseXml.get(".msgsource.kf.kf_worker");
                    z3__h.f222100g = Util.getInt(parseXml.get(".msgsource.kf.kf_type_new"), 0);
                    String nullAsNil = Util.nullAsNil(parseXml.get(".msgsource.bizmsg.bizclientmsgid"));
                    z3__h.f222098e = nullAsNil;
                    if (Util.isNullOrNil(nullAsNil)) {
                        z3__h.f222098e = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.climsgid"));
                    }
                    z3__h.f222105l = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.qy_msg_type"));
                    z3__h.f222106m = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.chat_type"));
                    z3__h.f222107n = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.bizchat_id"));
                    z3__h.f222108o = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.bizchat_ver"));
                    z3__h.f222109p = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.user_id"));
                    z3__h.f222110q = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.user_nickname"));
                    z3__h.f222111r = Util.nullAsNil(parseXml.get(".msgsource.enterprise_info.sync_from_qy_im"));
                    z3__h.f222103j = parseXml.get(".msgsource.strangerantispamticket.$ticket");
                    z3__h.f222104k = Util.getInt(parseXml.get(".msgsource.strangerantispamticket.$scene"), 0);
                    z3__h.f222112s = parseXml.get(".msgsource.NotAutoDownloadRange");
                    z3__h.f222113t = Util.getInt(parseXml.get(".msgsource.DownloadLimitKbps"), 0);
                    Util.getInt(parseXml.get(".msgsource.videopreloadlen"), 0);
                    z3__h.f222114u = Util.getInt(parseXml.get(".msgsource.PreDownload"), 0);
                    z3__h.f222115v = Util.getInt(parseXml.get(".msgsource.PreDownloadNetType"), 0);
                    z3__h.f222116w = parseXml.get(".msgsource.NoPreDownloadRange");
                    z3__h.f222095b = Util.getInt(parseXml.get(".msgsource.msg_cluster_type"), -1);
                    z3__h.f222096c = Util.getInt(parseXml.get(".msgsource.service_type"), -1);
                    z3__h.f222097d = Util.getInt(parseXml.get(".msgsource.scene"), -1);
                    z3__h.f222101h = Util.getInt(parseXml.get(".msgsource.bizmsg.msg_predict"), 0);
                    z3__h.f222102i = Util.getLong(parseXml.get(".msgsource.bizflag"), 0);
                    return z3__h;
                }
            }
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MsgInfoStorageLogic", "exception:%s", Util.stackTraceToString(e));
            Log.m105921e("MicroMsg.MsgInfoStorageLogic", "Exception in getMsgSourceValue, %s", e.getMessage());
            return null;
        }
    }

    /* renamed from: x */
    public static long m90852x(C72963f4 f4Var) {
        Class cls = C75700k0.class;
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(f4Var.mo108768t());
        if (z1Var == null || ((int) z1Var.f108320R1) == 0) {
            C72996z1 z1Var2 = new C72996z1(f4Var.mo108768t());
            z1Var2.setType(2);
            MsgInsertWithNewContactEvent msgInsertWithNewContactEvent = new MsgInsertWithNewContactEvent();
            msgInsertWithNewContactEvent.f78869d.f78870a = z1Var2;
            msgInsertWithNewContactEvent.publish();
            ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69667P3(z1Var2);
        }
        return ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).my0(f4Var);
    }

    /* renamed from: y */
    public static boolean m90853y(int i) {
        switch (i) {
            case 22:
            case 23:
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
                return true;
            default:
                return false;
        }
    }

    @Deprecated
    /* renamed from: z */
    public static int m90854z(String str) {
        return m90848t(str);
    }
}
