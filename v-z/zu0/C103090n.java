package zu0;

import android.database.Cursor;
import android.os.Looper;
import android.util.Pair;
import bp3.C67301m;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.BackupResetAccUinEvent;
import com.tencent.p014mm.autogen.events.CleanWxFileIndexEvent;
import com.tencent.p014mm.autogen.events.ShouldRescanMessagesEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.BackupReportErrorStruct;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.plugin.wear.model.C43457b;
import com.tencent.p014mm.plugin.wear.model.WearLogic;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30754l;
import com.tencent.p014mm.storage.C30758m;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.wcdb.DatabaseUtils;
import di3.C86312j;
import eb0.C97625j3;
import hv0.C98539a;
import hv0.C98540b;
import hv0.C98544e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import le2.C99412b;
import p1081gi.C98121d;
import te3.C51163rv3;
import te3.C64418hb3;
import te3.C77926f9;
import vd2.C78383a;
import yu0.C102909e;
import yu0.C102910f;
import zt3.C119157j;

/* renamed from: zu0.n */
public class C103090n {

    /* renamed from: t */
    public static boolean f304167t;

    /* renamed from: a */
    public boolean f304168a;

    /* renamed from: b */
    public boolean f304169b = false;

    /* renamed from: c */
    public final HashMap<String, String> f304170c;

    /* renamed from: d */
    public HashSet<String> f304171d = new HashSet<>();

    /* renamed from: e */
    public final int f304172e;

    /* renamed from: f */
    public final long f304173f;

    /* renamed from: g */
    public long f304174g;

    /* renamed from: h */
    public Object f304175h = new Object();

    /* renamed from: i */
    public final C102910f f304176i;

    /* renamed from: j */
    public final int f304177j;

    /* renamed from: k */
    public long f304178k = 0;

    /* renamed from: l */
    public C102909e f304179l;

    /* renamed from: m */
    public int f304180m = 0;

    /* renamed from: n */
    public final MultiProcessMMKV f304181n;

    /* renamed from: o */
    public BackupReportErrorStruct f304182o = new BackupReportErrorStruct();

    /* renamed from: p */
    public HashMap<String, Pair<Long, Long>> f304183p;

    /* renamed from: q */
    public C103091a f304184q;

    /* renamed from: r */
    public boolean f304185r;

    /* renamed from: s */
    public int f304186s;

    /* renamed from: zu0.n$a */
    public class C103091a {

        /* renamed from: a */
        public long f304187a = -1;

        /* renamed from: b */
        public boolean f304188b = false;

        public C103091a(C103090n nVar, C103088l lVar) {
        }

        /* renamed from: a */
        public void mo142827a() {
            if (C98544e.m128035f().mo137901e().f288979n != null) {
                this.f304187a = C98544e.m128035f().mo137901e().f288979n.beginTransaction(Thread.currentThread().getId());
                this.f304188b = true;
            }
        }

        /* renamed from: b */
        public void mo142828b() {
            if (this.f304188b && C98544e.m128035f().mo137901e().f288979n != null) {
                C98544e.m128035f().mo137901e().f288979n.endTransaction(this.f304187a);
                this.f304188b = false;
            }
        }
    }

    public C103090n(C102910f fVar, int i, C102909e eVar, int i2, boolean z, LinkedList<String> linkedList, LinkedList<Long> linkedList2) {
        C30758m j = C97625j3.m125812b().mo105895j();
        j.getClass();
        HashMap<String, String> hashMap = new HashMap<>();
        Cursor all = j.getAll();
        if (all == null) {
            Log.m105920e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getAllData failed.");
        } else {
            while (all.moveToNext()) {
                C30754l lVar = new C30754l();
                lVar.convertFrom(all);
                hashMap.put(lVar.field_msgListDataId, lVar.field_sessionName);
            }
            all.close();
        }
        this.f304170c = hashMap;
        this.f304176i = fVar;
        this.f304177j = i;
        this.f304179l = eVar;
        this.f304172e = i2;
        f304167t = z;
        this.f304173f = DatabaseUtils.longForQuery(C97625j3.m125812b().mo105895j().f82709d.mo125615f(), "SELECT COUNT(*) FROM BackupRecoverMsgListDataId", (String[]) null);
        HashMap<String, Pair<Long, Long>> hashMap2 = new HashMap<>();
        Iterator<Long> it = linkedList2.iterator();
        Iterator<String> it4 = linkedList.iterator();
        while (it4.hasNext()) {
            String next = it4.next();
            if (it.hasNext()) {
                long longValue = it.next().longValue();
                longValue = longValue == 0 ? Long.MIN_VALUE : longValue;
                if (!it.hasNext()) {
                    break;
                }
                long longValue2 = it.next().longValue();
                hashMap2.put(next, new Pair(Long.valueOf(longValue), Long.valueOf(longValue2 == 0 ? MAlarmHandler.NEXT_FIRE_INTERVAL : longValue2)));
            }
        }
        this.f304183p = hashMap2;
        this.f304171d.clear();
        this.f304174g = 0;
        this.f304181n = MultiProcessMMKV.getMMKV("MMKV_BACKUP");
        Log.m105925i("MicroMsg.BackupRecoverMerger", "BackupRecoverMerger, msgListDataIdHashMap[%d], backupMode[%d], totalMsgList[%d], totalSession[%d], isQuickBackup[%b]", Integer.valueOf(this.f304170c.size()), Integer.valueOf(i), Long.valueOf(this.f304173f), Integer.valueOf(i2), Boolean.valueOf(z));
    }

    /* renamed from: f */
    public static void m136339f(C103090n nVar, boolean z, int i) {
        int i2 = nVar.f304180m;
        if (i2 == 1 || i2 == 0) {
            if (i2 == 1) {
                nVar.mo142821u();
            }
            nVar.f304180m = 2;
            if (z) {
                int i3 = nVar.f304177j;
                if (i3 == 1) {
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, Boolean.FALSE);
                } else if (i3 == 2) {
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, Boolean.FALSE);
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C103089m(nVar));
            }
            Log.m105924i("MicroMsg.BackupRecoverMerger", "cancel and restart sync");
            if (i != 0) {
                nVar.f304176i.mo142622e().mo142628f(i);
                nVar.mo142820B(i);
            }
            nVar.f304180m = 0;
            synchronized (nVar) {
                nVar.f304169b = false;
            }
            int i4 = nVar.f304181n.getInt("MMKV_BACKUP_TRY_TIME", 0);
            nVar.f304181n.encode("MMKV_BACKUP_TRY_TIME", i4 > 0 ? i4 - 1 : 0);
            nVar.f304181n.encode("MMKV_BACKUP_NEED_REPORT", false);
            nVar.f304181n.encode("MMKV_BACKUP_ERROR_CACHE", "");
            nVar.f304176i.mo17659g();
        }
    }

    /* renamed from: m */
    public static void m136346m(C103090n nVar) {
        synchronized (nVar) {
            nVar.f304169b = false;
        }
    }

    /* renamed from: q */
    public static C103091a m136350q(C103090n nVar) {
        if (nVar.f304184q == null) {
            nVar.f304184q = new C103091a(nVar, (C103088l) null);
        }
        return nVar.f304184q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        if (f304167t == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00db, code lost:
        if (r8.f227333d == 1) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e0, code lost:
        r12 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r0 = dv0.C75459j.m90496b(r8, r21, r1.f304183p, r22, r23, r24, r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f0, code lost:
        if (r18 == false) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f2, code lost:
        if (r0 == null) goto L_0x010b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f8, code lost:
        r17 = r0.mo108768t();
        r18 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ff, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0100, code lost:
        r12 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0101, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("MicroMsg.BackupRecoverMerger", r0, "recoverMsgLists recoverMsg err", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
        zu0.C103092u.m136366c(r12.f227333d);
        r12 = -1;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m136351r(zu0.C103090n r19, java.lang.String r20, java.util.HashMap r21, android.util.Pair r22, java.lang.String r23, com.tencent.p014mm.pointers.PString r24, com.tencent.p014mm.pointers.PBool r25) {
        /*
            r1 = r19
            r2 = r20
            r9 = r23
            r19.getClass()
            java.lang.Class<pi.d> r10 = p644pi.C77089d.class
            r11 = 0
            r12 = -1
            byte[] r3 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r11, r12)
            r13 = 1
            te3.g9 r0 = new te3.g9     // Catch:{ Exception -> 0x016e }
            r0.<init>()     // Catch:{ Exception -> 0x016e }
            pe3.a r0 = r0.parseFrom(r3)     // Catch:{ Exception -> 0x016e }
            r14 = r0
            te3.g9 r14 = (te3.C101780g9) r14     // Catch:{ Exception -> 0x016e }
            java.util.LinkedList<te3.f9> r0 = r14.f298276e
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            java.lang.String r4 = ""
            r5 = r3
        L_0x002d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0085
            java.lang.Object r6 = r0.next()
            te3.f9 r6 = (te3.C77926f9) r6
            int r7 = r6.f227333d
            r8 = 49
            if (r7 != r8) goto L_0x0065
            te3.rv3 r7 = r6.f227337h
            java.lang.String r7 = r7.f141175d
            com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r3)
            if (r7 == 0) goto L_0x005a
            int r7 = r7.f195582i
            r8 = 62
            if (r7 != r8) goto L_0x005a
            if (r5 != 0) goto L_0x0056
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
        L_0x0056:
            r5.add(r6)
            goto L_0x002d
        L_0x005a:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 == 0) goto L_0x006f
            java.lang.String r4 = r1.mo142824x(r6, r9)
            goto L_0x006f
        L_0x0065:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r7 == 0) goto L_0x006f
            java.lang.String r4 = r1.mo142824x(r6, r9)
        L_0x006f:
            if (r5 == 0) goto L_0x0081
            boolean r7 = r5.isEmpty()
            if (r7 != 0) goto L_0x0081
            te3.f9 r5 = r1.mo142823w(r9, r5)
            if (r5 == 0) goto L_0x0080
            r2.add(r5)
        L_0x0080:
            r5 = r3
        L_0x0081:
            r2.add(r6)
            goto L_0x002d
        L_0x0085:
            if (r5 == 0) goto L_0x0096
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0096
            te3.f9 r0 = r1.mo142823w(r9, r5)
            if (r0 == 0) goto L_0x0096
            r2.add(r0)
        L_0x0096:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r15 = r24
            if (r0 != 0) goto L_0x00ab
            r15.value = r4
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r4
            java.lang.String r3 = "MicroMsg.BackupRecoverMerger"
            java.lang.String r4 = "checkPatMsg calculate real session talker %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r0)
        L_0x00ab:
            java.lang.String r0 = ""
            java.util.Iterator r16 = r2.iterator()
            r17 = r0
            r18 = 1
        L_0x00b5:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0115
            java.lang.Object r0 = r16.next()
            r8 = r0
            te3.f9 r8 = (te3.C77926f9) r8
            java.lang.Object r2 = r1.f304175h
            monitor-enter(r2)
            boolean r0 = r1.f304168a     // Catch:{ all -> 0x0112 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "MicroMsg.BackupRecoverMerger"
            java.lang.String r1 = "recoverMsgLists cancel!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)     // Catch:{ all -> 0x0112 }
            monitor-exit(r2)     // Catch:{ all -> 0x0112 }
            goto L_0x01df
        L_0x00d4:
            monitor-exit(r2)     // Catch:{ all -> 0x0112 }
            boolean r0 = f304167t
            if (r0 == 0) goto L_0x00de
            int r0 = r8.f227333d
            if (r0 == r13) goto L_0x00de
            goto L_0x00b5
        L_0x00de:
            java.util.HashMap<java.lang.String, android.util.Pair<java.lang.Long, java.lang.Long>> r4 = r1.f304183p     // Catch:{ Exception -> 0x00ff }
            r2 = r8
            r3 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r12 = r8
            r8 = r25
            com.tencent.mm.storage.f4 r0 = dv0.C75459j.m90496b(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00fd }
            if (r18 == 0) goto L_0x010b
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = r0.mo108768t()     // Catch:{ Exception -> 0x00fd }
            r17 = r0
            r18 = 0
            goto L_0x010b
        L_0x00fd:
            r0 = move-exception
            goto L_0x0101
        L_0x00ff:
            r0 = move-exception
            r12 = r8
        L_0x0101:
            java.lang.String r2 = "MicroMsg.BackupRecoverMerger"
            java.lang.String r3 = "recoverMsgLists recoverMsg err"
            java.lang.Object[] r4 = new java.lang.Object[r11]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
        L_0x010b:
            int r0 = r12.f227333d
            zu0.C103092u.m136366c(r0)
            r12 = -1
            goto L_0x00b5
        L_0x0112:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0112 }
            throw r0
        L_0x0115:
            zu0.C103092u.m136365b()
            di3.d r0 = di3.C86312j.m106911c(r10)
            pi.d r0 = (p644pi.C77089d) r0
            r0.getClass()
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85807K5(r17)
            if (r0 == 0) goto L_0x0167
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r17
            java.lang.String r1 = "MicroMsg.roomtools.PluginChatroomUI"
            java.lang.String r2 = "handleChatroomBackup talker:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r0)
            si.e r0 = p203mi.C34572d0.m40392c(r17)
            if (r0 != 0) goto L_0x013e
            java.lang.String r0 = "handleChatroomBackup groupTools is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            goto L_0x0167
        L_0x013e:
            int r2 = r0.field_queryState
            if (r2 != 0) goto L_0x0148
            java.lang.String r0 = "handleChatroomBackup groupTools is COL_STATE_NEED_QUERY"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)
            goto L_0x0167
        L_0x0148:
            r0.field_queryState = r11
            di3.d r2 = di3.C86312j.m106911c(r10)
            pi.d r2 = (p644pi.C77089d) r2
            si.f r2 = r2.xx0()
            java.lang.String[] r3 = new java.lang.String[r11]
            boolean r0 = r2.update(r0, r3)
            java.lang.Object[] r2 = new java.lang.Object[r13]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2[r11] = r0
            java.lang.String r0 = "handleChatroomBackup result:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
        L_0x0167:
            java.util.LinkedList<te3.f9> r0 = r14.f298276e
            int r12 = r0.size()
            goto L_0x01df
        L_0x016e:
            r0 = move-exception
            java.lang.String r1 = ""
            com.tencent.mm.vfs.m1 r4 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x01bf }
            r4.<init>((java.lang.String) r2)     // Catch:{ Exception -> 0x01bf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01bf }
            r5.<init>()     // Catch:{ Exception -> 0x01bf }
            r5.append(r1)     // Catch:{ Exception -> 0x01bf }
            boolean r6 = r4.mo119967g()     // Catch:{ Exception -> 0x01bf }
            r5.append(r6)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x01bf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01bf }
            r5.<init>()     // Catch:{ Exception -> 0x01bf }
            r5.append(r1)     // Catch:{ Exception -> 0x01bf }
            boolean r6 = r4.mo119961a()     // Catch:{ Exception -> 0x01bf }
            r5.append(r6)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r6 = ","
            r5.append(r6)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x01bf }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01bf }
            r5.<init>()     // Catch:{ Exception -> 0x01bf }
            r5.append(r1)     // Catch:{ Exception -> 0x01bf }
            long r6 = r4.mo119980r()     // Catch:{ Exception -> 0x01bf }
            r5.append(r6)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r4 = "."
            r5.append(r4)     // Catch:{ Exception -> 0x01bf }
            java.lang.String r1 = r5.toString()     // Catch:{ Exception -> 0x01bf }
            goto L_0x01c0
        L_0x01bf:
        L_0x01c0:
            java.lang.String r4 = "MicroMsg.BackupRecoverMerger"
            java.lang.String r5 = "read recoverPath error, path:%s, errInfo[%s], buflen:%d, %s,"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r11] = r2
            r6[r13] = r1
            r1 = 2
            if (r3 != 0) goto L_0x01d1
            r12 = -1
            goto L_0x01d2
        L_0x01d1:
            int r12 = r3.length
        L_0x01d2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r6[r1] = r2
            r1 = 3
            r6[r1] = r0
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r5, r6)
            r12 = -2
        L_0x01df:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C103090n.m136351r(zu0.n, java.lang.String, java.util.HashMap, android.util.Pair, java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PBool):int");
    }

    /* renamed from: A */
    public void mo142819A() {
        ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).wy0("BACKUP_MERGE_LOCK");
    }

    /* renamed from: B */
    public void mo142820B(int i) {
        C102909e eVar = this.f304179l;
        if (eVar != null) {
            eVar.mo17667K(i);
        }
    }

    /* renamed from: u */
    public void mo142821u() {
        Log.m105924i("MicroMsg.BackupRecoverMerger", "backupFinishMerge");
        new CleanWxFileIndexEvent().publish();
        new BackupResetAccUinEvent().publish();
        C98540b d = C98544e.m128035f().mo137900d();
        d.f288963b.post(new C98539a(d));
        ((C72972g4) C97625j3.m125812b().mo105911z()).zy0();
        new ShouldRescanMessagesEvent().publish();
        CrashReportFactory.setBackupMerge(false);
        ((C99412b) C86312j.m106911c(C99412b.class)).mo138503Gp();
        C43457b.vx0().requireAccountInitialized();
        WearLogic wearLogic = C43457b.vx0().f117465g;
        wearLogic.getClass();
        ((C72972g4) C97625j3.m125812b().mo105911z()).mo101137qq(wearLogic.f117447l, (Looper) null);
    }

    /* renamed from: v */
    public void mo142822v(boolean z, int i) {
        synchronized (this.f304175h) {
            Log.m105925i("MicroMsg.BackupRecoverMerger", "cancel, needClearContinueRecoverData[%b], mergeState[%d], updateState[%d]", Boolean.valueOf(z), Integer.valueOf(this.f304180m), Integer.valueOf(i));
            this.f304168a = true;
        }
        this.f304185r = z;
        this.f304186s = i;
        ((MMNotification) C97625j3.m125816f()).mo93212i(false);
        this.f304176i.mo17659g();
        this.f304179l = null;
    }

    /* renamed from: w */
    public final C77926f9 mo142823w(String str, List<C77926f9> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C77926f9 f9Var = list.get(0);
        C64418hb3 hb32 = new C64418hb3();
        hb32.f183463d = str;
        for (C77926f9 next : list) {
            C64418hb3 d = C67301m.m79639d(next.f227337h.f141175d);
            Log.m105919d("MicroMsg.BackupRecoverMerger", "find %s pat record in msg", next.f227334e);
            hb32.f183464e.addAll(d.f183464e);
        }
        C68070l.C68072b bVar = new C68070l.C68072b();
        C78383a aVar = new C78383a();
        aVar.f229698b = hb32;
        bVar.mo93545f(aVar);
        bVar.f195582i = 62;
        bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        C51163rv3 rv32 = new C51163rv3();
        rv32.mo73357f(Util.nullAs(C68070l.C68072b.m80420s(bVar, "", (C98121d) null), ""));
        f9Var.f227337h = rv32;
        return f9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo142824x(te3.C77926f9 r3, java.lang.String r4) {
        /*
            r2 = this;
            te3.rv3 r0 = r3.f227335f
            java.lang.String r0 = r0.f141175d
            te3.rv3 r3 = r3.f227336g
            java.lang.String r3 = r3.f141175d
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002d
            hv0.e r4 = hv0.C98544e.m128035f()
            hv0.c r4 = r4.mo137901e()
            int r1 = r4.f288980o
            if (r1 == 0) goto L_0x0027
            g62.p r4 = r4.f288972g
            com.tencent.mm.storage.s4 r4 = (com.tencent.p014mm.storage.C44667s4) r4
            boolean r4 = r4.mo69822qq(r0)
            if (r4 == 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            r4 = 0
            goto L_0x002e
        L_0x0027:
            eb0.b r3 = new eb0.b
            r3.<init>()
            throw r3
        L_0x002d:
            r4 = 1
        L_0x002e:
            if (r4 == 0) goto L_0x0031
            r0 = r3
        L_0x0031:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zu0.C103090n.mo142824x(te3.f9, java.lang.String):java.lang.String");
    }

    /* renamed from: y */
    public void mo142825y() {
        ((C72972g4) C98544e.m128035f().mo137901e().mo137897e()).qy0("BACKUP_MERGE_LOCK");
    }

    /* renamed from: z */
    public void mo142826z(boolean z) {
        boolean z2;
        synchronized (this) {
            if (this.f304169b) {
                z2 = true;
            } else {
                this.f304169b = true;
                z2 = false;
            }
        }
        if (z2) {
            Log.m105920e("MicroMsg.BackupRecoverMerger", "Already start merge, return.");
            return;
        }
        Log.m105924i("MicroMsg.BackupRecoverMerger", "startMerge");
        this.f304178k = 0;
        CrashReportFactory.setBackupMerge(true);
        this.f304176i.mo17658f();
        ((MMNotification) C97625j3.m125816f()).mo93212i(true);
        ((C99412b) C86312j.m106911c(C99412b.class)).mo138505Wa();
        C43457b.vx0().requireAccountInitialized();
        WearLogic wearLogic = C43457b.vx0().f117465g;
        wearLogic.getClass();
        ((C72972g4) C97625j3.m125812b().mo105911z()).sy0(wearLogic.f117447l);
        this.f304180m = 1;
        int i = this.f304177j;
        if (i == 1) {
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, Boolean.TRUE);
        } else if (i == 2) {
            C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, Boolean.TRUE);
        }
        MultiProcessMMKV multiProcessMMKV = this.f304181n;
        multiProcessMMKV.encode("MMKV_BACKUP_TRY_TIME", multiProcessMMKV.getInt("MMKV_BACKUP_TRY_TIME", 0) + 1);
        this.f304181n.encode("MMKV_BACKUP_NEED_REPORT", true);
        Log.m105925i("MicroMsg.BackupRecoverMerger", "startMergeImpl start, mergeState[%d], totalMsgList[%d], msgListDataIdHashMap[%d]", Integer.valueOf(this.f304180m), Long.valueOf(this.f304173f), Integer.valueOf(this.f304170c.size()));
        ((C119157j) C119157j.f356862d).mo183884o(new C103088l(this, z));
    }
}
