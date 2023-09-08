package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.wcdb.database.SQLiteCipherSpec;
import com.tencent.wcdb.repair.BackupKit;
import com.tencent.wcdb.repair.RecoverKit;
import com.tencent.wcdb.repair.RepairKit;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86301e;
import di3.C86312j;
import eb0.C75566c;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import java.text.SimpleDateFormat;
import p158gt.C98201k;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.dbbackup.k */
public class C115392k extends C86301e {

    /* renamed from: j */
    public static final SQLiteCipherSpec f345883j = new SQLiteCipherSpec().setPageSize(1024).setSQLCipherVersion(1);

    /* renamed from: d */
    public volatile BackupKit f345884d;

    /* renamed from: e */
    public volatile RecoverKit f345885e;

    /* renamed from: f */
    public volatile RepairKit f345886f;

    /* renamed from: g */
    public volatile boolean f345887g = false;

    /* renamed from: h */
    public boolean f345888h = false;

    /* renamed from: i */
    public final SimpleDateFormat f345889i = new SimpleDateFormat("HH:mm:ss.SSS");

    /* renamed from: com.tencent.mm.plugin.dbbackup.k$a */
    public class C115393a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75566c f345890d;

        /* renamed from: e */
        public final /* synthetic */ String f345891e;

        /* renamed from: f */
        public final /* synthetic */ long f345892f;

        /* renamed from: g */
        public final /* synthetic */ C93095a f345893g;

        public C115393a(C75566c cVar, String str, long j, C93095a aVar) {
            this.f345890d = cVar;
            this.f345891e = str;
            this.f345892f = j;
            this.f345893g = aVar;
        }

        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v2, types: [boolean] */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d3, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02d4, code lost:
            r2 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x02d6, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x02d7, code lost:
            r3 = -1;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x02e5 A[Catch:{ all -> 0x0313 }] */
        /* JADX WARNING: Removed duplicated region for block: B:105:0x02fb  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0309  */
        /* JADX WARNING: Removed duplicated region for block: B:113:0x031b  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0329  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x02d3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000c] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r31 = this;
                r1 = r31
                java.lang.String r0 = ".bak"
                java.lang.String r2 = "MicroMsg.SubCoreDBBackup"
                com.tencent.mm.plugin.dbbackup.k r3 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r4 = 0
                r3.f345885e = r4
                r6 = 0
                eb0.c r7 = r1.f345890d     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r7.mo105911z()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                eb0.c r7 = r1.f345890d     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r7.mo105908w()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.lang.Class<gt.k> r7 = p158gt.C98201k.class
                di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                gt.k r7 = (p158gt.C98201k) r7     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r7.mo137277xi()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.lang.Class<rz.s> r7 = p682rz.C101488s.class
                di3.d r7 = di3.C86312j.m106911c(r7)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                rz.s r7 = (p682rz.C101488s) r7     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r7.Kj0()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                long r7 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r9.<init>()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r10 = 1
                java.lang.String r11 = p156gj.C87203t.m108270f(r10)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r9.append(r11)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                eb0.c r11 = r1.f345890d     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                int r11 = r11.mo105881G()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r9.append(r11)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                byte[] r9 = r9.getBytes()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                byte[] r11 = p823sg.C90193h.m112879g(r9)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.lang.String r9 = p823sg.C90193h.m112878f(r9)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r12 = 7
                java.lang.String r9 = r9.substring(r6, r12)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                byte[] r13 = r9.getBytes()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.util.Set<java.lang.String> r9 = zh3.C119118e.f356726f     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r16 = 805306368(0x30000000, float:4.656613E-10)
                eb0.c r9 = r1.f345890d     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                zh3.f r9 = r9.mo105909x()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                com.tencent.wcdb.database.SQLiteDatabase r9 = r9.mo125615f()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.lang.String r12 = r9.getPath()     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                com.tencent.wcdb.database.SQLiteCipherSpec r14 = com.tencent.p014mm.plugin.dbbackup.C115392k.f345883j     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                r15 = 0
                r17 = 0
                r18 = 0
                com.tencent.wcdb.database.SQLiteDatabase r9 = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x02d6, all -> 0x02d3 }
                java.lang.String r12 = r1.f345891e     // Catch:{ Exception -> 0x02d0 }
                r13 = 2
                if (r12 == 0) goto L_0x0087
                java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ Exception -> 0x02d0 }
                r0[r6] = r12     // Catch:{ Exception -> 0x02d0 }
                r12 = r0
                goto L_0x00ce
            L_0x0087:
                java.lang.String[] r12 = new java.lang.String[r13]     // Catch:{ Exception -> 0x02d0 }
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d0 }
                r14.<init>()     // Catch:{ Exception -> 0x02d0 }
                eb0.c r15 = r1.f345890d     // Catch:{ Exception -> 0x02d0 }
                r15.getClass()     // Catch:{ Exception -> 0x02d0 }
                f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x02d0 }
                f40.o r15 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x02d0 }
                java.lang.String r15 = r15.mo121148o()     // Catch:{ Exception -> 0x02d0 }
                r14.append(r15)     // Catch:{ Exception -> 0x02d0 }
                r14.append(r0)     // Catch:{ Exception -> 0x02d0 }
                java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x02d0 }
                r12[r6] = r14     // Catch:{ Exception -> 0x02d0 }
                java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d0 }
                r14.<init>()     // Catch:{ Exception -> 0x02d0 }
                f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x02d0 }
                f40.o r15 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x02d0 }
                java.lang.String r15 = r15.f251806d     // Catch:{ Exception -> 0x02d0 }
                r14.append(r15)     // Catch:{ Exception -> 0x02d0 }
                java.lang.String r15 = "dbback/"
                r14.append(r15)     // Catch:{ Exception -> 0x02d0 }
                java.lang.String r15 = "EnMicroMsg.db"
                r14.append(r15)     // Catch:{ Exception -> 0x02d0 }
                r14.append(r0)     // Catch:{ Exception -> 0x02d0 }
                java.lang.String r0 = r14.toString()     // Catch:{ Exception -> 0x02d0 }
                r12[r10] = r0     // Catch:{ Exception -> 0x02d0 }
            L_0x00ce:
                int r14 = r12.length     // Catch:{ Exception -> 0x02cd }
                r15 = 0
                r3 = 0
                r18 = -3
            L_0x00d4:
                if (r3 >= r14) goto L_0x01aa
                r5 = r12[r3]     // Catch:{ Exception -> 0x01a7 }
                com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x017c }
                r0.<init>((java.lang.String) r5)     // Catch:{ Exception -> 0x017c }
                boolean r19 = r0.mo119961a()     // Catch:{ Exception -> 0x017c }
                if (r19 != 0) goto L_0x00e9
                r23 = r7
                r21 = r14
                goto L_0x019b
            L_0x00e9:
                long r15 = r0.mo119980r()     // Catch:{ Exception -> 0x017c }
                java.lang.String r0 = "[Recover] backupSize: %d, diskFreeSpace: %d"
                java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x017c }
                java.lang.Long r20 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x017c }
                r4[r6] = r20     // Catch:{ Exception -> 0x017c }
                r21 = r14
                long r13 = r1.f345892f     // Catch:{ Exception -> 0x017a }
                java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x017a }
                r4[r10] = r13     // Catch:{ Exception -> 0x017a }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r4)     // Catch:{ Exception -> 0x017a }
                long r13 = r1.f345892f     // Catch:{ Exception -> 0x017a }
                r22 = 10
                long r22 = r22 * r15
                int r0 = (r13 > r22 ? 1 : (r13 == r22 ? 0 : -1))
                if (r0 >= 0) goto L_0x013c
                com.tencent.mm.plugin.dbbackup.a r0 = r1.f345893g     // Catch:{ Exception -> 0x017a }
                if (r0 == 0) goto L_0x0116
                r4 = -2
                r0.mo127599a(r4)     // Catch:{ Exception -> 0x017a }
            L_0x0116:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e
                if (r0 == 0) goto L_0x0128
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e
                r0.release()
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345885e = r2
            L_0x0128:
                if (r9 == 0) goto L_0x012d
                r9.close()
            L_0x012d:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r0.f345887g = r6
            L_0x0131:
                com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
                r0.setLowPriority()
                return
            L_0x0139:
                r23 = r7
                goto L_0x0181
            L_0x013c:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x017a }
                r4 = 2
                java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x017a }
                r14 = 10004(0x2714, float:1.4019E-41)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x017a }
                r13[r6] = r14     // Catch:{ Exception -> 0x017a }
                java.lang.String r14 = "%d|%d"
                java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x017a }
                java.lang.Long r4 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x017a }
                r10[r6] = r4     // Catch:{ Exception -> 0x017a }
                r23 = r7
                long r6 = r1.f345892f     // Catch:{ Exception -> 0x0178 }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0178 }
                r7 = 1
                r10[r7] = r6     // Catch:{ Exception -> 0x0178 }
                java.lang.String r6 = java.lang.String.format(r14, r10)     // Catch:{ Exception -> 0x0178 }
                r13[r7] = r6     // Catch:{ Exception -> 0x0178 }
                r6 = 11098(0x2b5a, float:1.5552E-41)
                r0.mo160131h(r6, r13)     // Catch:{ Exception -> 0x0178 }
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x0178 }
                com.tencent.wcdb.repair.RecoverKit r6 = new com.tencent.wcdb.repair.RecoverKit     // Catch:{ Exception -> 0x0178 }
                r4 = 0
                java.lang.String r5 = p823sg.C48380r.m53726a(r5, r4)     // Catch:{ Exception -> 0x0178 }
                r6.<init>(r9, r5, r11)     // Catch:{ Exception -> 0x0178 }
                r0.f345885e = r6     // Catch:{ Exception -> 0x0178 }
                goto L_0x01ac
            L_0x0178:
                r0 = move-exception
                goto L_0x0181
            L_0x017a:
                r0 = move-exception
                goto L_0x0139
            L_0x017c:
                r0 = move-exception
                r23 = r7
                r21 = r14
            L_0x0181:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01a7 }
                r5.<init>()     // Catch:{ Exception -> 0x01a7 }
                java.lang.String r6 = "Initialize RecoverKit failed: "
                r5.append(r6)     // Catch:{ Exception -> 0x01a7 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x01a7 }
                r5.append(r0)     // Catch:{ Exception -> 0x01a7 }
                java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x01a7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)     // Catch:{ Exception -> 0x01a7 }
                r18 = -1
            L_0x019b:
                int r3 = r3 + 1
                r14 = r21
                r7 = r23
                r4 = 0
                r6 = 0
                r10 = 1
                r13 = 2
                goto L_0x00d4
            L_0x01a7:
                r0 = move-exception
                goto L_0x02ca
            L_0x01aa:
                r23 = r7
            L_0x01ac:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x01a7 }
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e     // Catch:{ Exception -> 0x01a7 }
                if (r0 == 0) goto L_0x02b7
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x01a7 }
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e     // Catch:{ Exception -> 0x01a7 }
                r3 = 0
                int r5 = r0.run(r3)     // Catch:{ Exception -> 0x01a7 }
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x02b4 }
                eb0.c r3 = r1.f345890d     // Catch:{ Exception -> 0x02b4 }
                r0.wx0(r3)     // Catch:{ Exception -> 0x02b4 }
                long r6 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x02b4 }
                long r6 = r6 - r23
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x02b4 }
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e     // Catch:{ Exception -> 0x02b4 }
                int r0 = r0.successCount()     // Catch:{ Exception -> 0x02b4 }
                com.tencent.mm.plugin.dbbackup.k r3 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x02b4 }
                com.tencent.wcdb.repair.RecoverKit r3 = r3.f345885e     // Catch:{ Exception -> 0x02b4 }
                int r3 = r3.failureCount()     // Catch:{ Exception -> 0x02b4 }
                com.tencent.mm.plugin.dbbackup.k r8 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x02b4 }
                com.tencent.wcdb.repair.RecoverKit r8 = r8.f345885e     // Catch:{ Exception -> 0x02b4 }
                java.lang.String r8 = r8.lastError()     // Catch:{ Exception -> 0x02b4 }
                com.tencent.mm.plugin.dbbackup.k r10 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x02b4 }
                com.tencent.wcdb.repair.RecoverKit r10 = r10.f345885e     // Catch:{ Exception -> 0x02b4 }
                r10.release()     // Catch:{ Exception -> 0x02b4 }
                com.tencent.mm.plugin.dbbackup.k r10 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x02b4 }
                r11 = 0
                r10.f345885e = r11     // Catch:{ Exception -> 0x02b4 }
                r9.close()     // Catch:{ Exception -> 0x02b4 }
                java.lang.String r9 = "Database recover %s, elapsed %.2f seconds. [success: %d, failure: %d]"
                r10 = 4
                java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                if (r5 != 0) goto L_0x01fa
                java.lang.String r12 = "succeeded"
                goto L_0x0202
            L_0x01fa:
                r12 = 1
                if (r5 != r12) goto L_0x0200
                java.lang.String r12 = "canceled"
                goto L_0x0202
            L_0x0200:
                java.lang.String r12 = "failed"
            L_0x0202:
                r4 = 0
                r11[r4] = r12     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                float r12 = (float) r6     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r13 = 1315859240(0x4e6e6b28, float:1.0E9)
                float r12 = r12 / r13
                java.lang.Float r12 = java.lang.Float.valueOf(r12)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r13 = 1
                r11[r13] = r12     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r13 = 2
                r11[r13] = r12     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r13 = 3
                r11[r13] = r12     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r9, r11)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                if (r5 != 0) goto L_0x0229
                r8 = 10005(0x2715, float:1.402E-41)
                r9 = 22
                goto L_0x024d
            L_0x0229:
                r9 = 1
                if (r5 != r9) goto L_0x0230
                r8 = 10006(0x2716, float:1.4021E-41)
                r9 = -1
                goto L_0x024d
            L_0x0230:
                com.tencent.mm.plugin.report.service.n r9 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.String r11 = "DBRepair"
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r12.<init>()     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.String r14 = "Backup recover failed: "
                r12.append(r14)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r12.append(r8)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.String r8 = r12.toString()     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r12 = 0
                r9.mo160135k(r11, r8, r12)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r8 = 10007(0x2717, float:1.4023E-41)
                r9 = 23
            L_0x024d:
                com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r12 = 2
                java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r4 = 0
                r14[r4] = r8     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.String r8 = "%d|%d|%d|%d"
                java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r10[r4] = r12     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r15 = 1000000(0xf4240, double:4.940656E-318)
                long r6 = r6 / r15
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r7 = 1
                r10[r7] = r6     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r6 = 2
                r10[r6] = r0     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r10[r13] = r0     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                java.lang.String r0 = java.lang.String.format(r8, r10)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r3 = 1
                r14[r3] = r0     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r0 = 11098(0x2b5a, float:1.5552E-41)
                r11.mo160131h(r0, r14)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                if (r9 < 0) goto L_0x0297
                r24 = 181(0xb5, double:8.94E-322)
                long r6 = (long) r9     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                r28 = 1
                r30 = 1
                r23 = r11
                r26 = r6
                r23.idkeyStat(r24, r26, r28, r30)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
            L_0x0297:
                com.tencent.mm.plugin.dbbackup.a r0 = r1.f345893g     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
                if (r0 == 0) goto L_0x029e
                r0.mo127599a(r5)     // Catch:{ Exception -> 0x02b1, all -> 0x02d3 }
            L_0x029e:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e
                if (r0 == 0) goto L_0x030c
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e
                r0.release()
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345885e = r2
                goto L_0x030c
            L_0x02b1:
                r0 = move-exception
                r3 = r5
                goto L_0x02d8
            L_0x02b4:
                r0 = move-exception
                r3 = r5
                goto L_0x02d9
            L_0x02b7:
                com.tencent.mm.plugin.report.service.n r20 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x02cd }
                r21 = 181(0xb5, double:8.94E-322)
                r23 = 31
                r25 = 1
                r27 = 1
                r20.idkeyStat(r21, r23, r25, r27)     // Catch:{ Exception -> 0x02cd }
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x02cd }
                r0.<init>()     // Catch:{ Exception -> 0x02cd }
                throw r0     // Catch:{ Exception -> 0x02cd }
            L_0x02ca:
                r3 = r18
                goto L_0x02d9
            L_0x02cd:
                r0 = move-exception
                r3 = -3
                goto L_0x02d9
            L_0x02d0:
                r0 = move-exception
                r3 = -1
                goto L_0x02d9
            L_0x02d3:
                r0 = move-exception
                r2 = 0
                goto L_0x0315
            L_0x02d6:
                r0 = move-exception
                r3 = -1
            L_0x02d8:
                r9 = 0
            L_0x02d9:
                java.lang.String r5 = "Failed to start database recovery"
                r4 = 0
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0313 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r5, r6)     // Catch:{ all -> 0x0313 }
                com.tencent.mm.plugin.dbbackup.a r0 = r1.f345893g     // Catch:{ all -> 0x0313 }
                if (r0 == 0) goto L_0x02e8
                r0.mo127599a(r3)     // Catch:{ all -> 0x0313 }
            L_0x02e8:
                com.tencent.mm.plugin.report.service.n r10 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0313 }
                r11 = 181(0xb5, double:8.94E-322)
                r13 = 23
                r15 = 1
                r17 = 1
                r10.idkeyStat(r11, r13, r15, r17)     // Catch:{ all -> 0x0313 }
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e
                if (r0 == 0) goto L_0x0307
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r0 = r0.f345885e
                r0.release()
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345885e = r2
            L_0x0307:
                if (r9 == 0) goto L_0x030c
                r9.close()
            L_0x030c:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345887g = r2
                goto L_0x0131
            L_0x0313:
                r0 = move-exception
                r2 = r9
            L_0x0315:
                com.tencent.mm.plugin.dbbackup.k r3 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r3 = r3.f345885e
                if (r3 == 0) goto L_0x0327
                com.tencent.mm.plugin.dbbackup.k r3 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RecoverKit r3 = r3.f345885e
                r3.release()
                com.tencent.mm.plugin.dbbackup.k r3 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r5 = 0
                r3.f345885e = r5
            L_0x0327:
                if (r2 == 0) goto L_0x032c
                r2.close()
            L_0x032c:
                com.tencent.mm.plugin.dbbackup.k r2 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r3 = 0
                r2.f345887g = r3
                com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = f40.C86709a0.m107525e()
                r2.setLowPriority()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.dbbackup.C115392k.C115393a.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.dbbackup.k$b */
    public class C115394b implements Runnable {

        /* renamed from: d */
        public final String[] f345895d = {StateEvent.Name.MESSAGE, "ImgInfo2", "videoinfo2", "EmojiInfo", "conversation", "rconversation", "appattach"};

        /* renamed from: e */
        public final /* synthetic */ C75566c f345896e;

        /* renamed from: f */
        public final /* synthetic */ String f345897f;

        /* renamed from: g */
        public final /* synthetic */ C93095a f345898g;

        public C115394b(C75566c cVar, String str, C93095a aVar) {
            this.f345896e = cVar;
            this.f345897f = str;
            this.f345898g = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0188 A[Catch:{ Exception -> 0x0200, all -> 0x01fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x018c A[Catch:{ Exception -> 0x0200, all -> 0x01fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x01a1 A[Catch:{ Exception -> 0x0200, all -> 0x01fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x01ac A[Catch:{ Exception -> 0x0200, all -> 0x01fc }] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01e0  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0213 A[Catch:{ all -> 0x0266 }] */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0243  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0256  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x026d  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x027b  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0280  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r27 = this;
                r1 = r27
                java.lang.String r0 = ".sm"
                java.lang.String r2 = "Repair failed: "
                java.lang.String r3 = "DBRepair"
                java.lang.String r4 = "MicroMsg.SubCoreDBBackup"
                com.tencent.mm.plugin.dbbackup.k r5 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r6 = 0
                r5.f345886f = r6
                r7 = 1
                r8 = 0
                eb0.c r9 = r1.f345896e     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9.mo105911z()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                eb0.c r9 = r1.f345896e     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9.mo105908w()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.Class<gt.k> r9 = p158gt.C98201k.class
                di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                gt.k r9 = (p158gt.C98201k) r9     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9.mo137277xi()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.Class<rz.s> r9 = p682rz.C101488s.class
                di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                rz.s r9 = (p682rz.C101488s) r9     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9.Kj0()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9.<init>()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.String r10 = p156gj.C87203t.m108270f(r7)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9.append(r10)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                eb0.c r10 = r1.f345896e     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                int r10 = r10.mo105881G()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9.append(r10)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                byte[] r9 = r9.getBytes()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                byte[] r10 = p823sg.C90193h.m112879g(r9)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.String r9 = p823sg.C90193h.m112878f(r9)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r11 = 7
                java.lang.String r9 = r9.substring(r8, r11)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                byte[] r9 = r9.getBytes()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.util.Set<java.lang.String> r11 = zh3.C119118e.f356726f     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r15 = 805306368(0x30000000, float:4.656613E-10)
                eb0.c r11 = r1.f345896e     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                zh3.f r11 = r11.mo105909x()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                com.tencent.wcdb.database.SQLiteDatabase r11 = r11.mo125615f()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.String r11 = r11.getPath()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                com.tencent.wcdb.database.SQLiteCipherSpec r13 = com.tencent.p014mm.plugin.dbbackup.C115392k.f345883j     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r14 = 0
                r16 = 0
                r17 = 0
                r12 = r9
                com.tencent.wcdb.database.SQLiteDatabase r11 = com.tencent.wcdb.database.SQLiteDatabase.openDatabase(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                long r12 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r14 = 2
                java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r5.<init>()     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.String r6 = r1.f345897f     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r5.append(r6)     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r5.append(r0)     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r15[r8] = r5     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r5.<init>()     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.String r6 = r6.f251806d     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r5.append(r6)     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.String r6 = "dbback/"
                r5.append(r6)     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.String r6 = "EnMicroMsg.db"
                r5.append(r6)     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r5.append(r0)     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r15[r7] = r0     // Catch:{ Exception -> 0x01f9, all -> 0x01f6 }
                r5 = 0
                r6 = 0
            L_0x00bd:
                if (r6 >= r14) goto L_0x00fe
                r0 = r15[r6]     // Catch:{ Exception -> 0x015e }
                java.lang.String r0 = p823sg.C48380r.m53726a(r0, r8)     // Catch:{ Exception -> 0x015e }
                java.lang.String[] r8 = r1.f345895d     // Catch:{ Exception -> 0x00e0 }
                com.tencent.wcdb.repair.RepairKit$MasterInfo r5 = com.tencent.wcdb.repair.RepairKit.MasterInfo.load(r0, r10, r8)     // Catch:{ Exception -> 0x00e0 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e0 }
                r8.<init>()     // Catch:{ Exception -> 0x00e0 }
                java.lang.String r14 = "Loaded saved master: "
                r8.append(r14)     // Catch:{ Exception -> 0x00e0 }
                r8.append(r0)     // Catch:{ Exception -> 0x00e0 }
                java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x00e0 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x00e0 }
                goto L_0x00fe
            L_0x00e0:
                r0 = move-exception
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x015e }
                r8.<init>()     // Catch:{ Exception -> 0x015e }
                java.lang.String r14 = "Failed to load saved master: "
                r8.append(r14)     // Catch:{ Exception -> 0x015e }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x015e }
                r8.append(r0)     // Catch:{ Exception -> 0x015e }
                java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x015e }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)     // Catch:{ Exception -> 0x015e }
                int r6 = r6 + 1
                r8 = 0
                r14 = 2
                goto L_0x00bd
            L_0x00fe:
                if (r5 != 0) goto L_0x0119
                java.lang.String[] r0 = r1.f345895d     // Catch:{ Exception -> 0x015e }
                com.tencent.wcdb.repair.RepairKit$MasterInfo r5 = com.tencent.wcdb.repair.RepairKit.MasterInfo.make(r0)     // Catch:{ Exception -> 0x015e }
                java.lang.String r0 = "Saved master not available."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r0)     // Catch:{ Exception -> 0x015e }
                com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x015e }
                r20 = 181(0xb5, double:8.94E-322)
                r22 = 32
                r24 = 1
                r26 = 1
                r19.idkeyStat(r20, r22, r24, r26)     // Catch:{ Exception -> 0x015e }
                goto L_0x012d
            L_0x0119:
                if (r6 <= 0) goto L_0x012d
                java.lang.String r0 = "Use backup saved master."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x015e }
                com.tencent.mm.plugin.report.service.n r19 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x015e }
                r20 = 181(0xb5, double:8.94E-322)
                r22 = 33
                r24 = 1
                r26 = 1
                r19.idkeyStat(r20, r22, r24, r26)     // Catch:{ Exception -> 0x015e }
            L_0x012d:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x015e }
                com.tencent.wcdb.repair.RepairKit r6 = new com.tencent.wcdb.repair.RepairKit     // Catch:{ Exception -> 0x015e }
                java.lang.String r8 = r1.f345897f     // Catch:{ Exception -> 0x015e }
                com.tencent.wcdb.database.SQLiteCipherSpec r10 = com.tencent.p014mm.plugin.dbbackup.C115392k.f345883j     // Catch:{ Exception -> 0x015e }
                r6.<init>(r8, r9, r10, r5)     // Catch:{ Exception -> 0x015e }
                r0.f345886f = r6     // Catch:{ Exception -> 0x015e }
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x015e }
                com.tencent.wcdb.repair.RepairKit r0 = r0.f345886f     // Catch:{ Exception -> 0x015e }
                int r0 = r0.output(r11, r7)     // Catch:{ Exception -> 0x015e }
                if (r0 != 0) goto L_0x0146
                r0 = 1
                goto L_0x0147
            L_0x0146:
                r0 = 0
            L_0x0147:
                com.tencent.mm.plugin.dbbackup.k r6 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x015e }
                com.tencent.wcdb.repair.RepairKit r6 = r6.f345886f     // Catch:{ Exception -> 0x015e }
                boolean r6 = r6.isHeaderCorrupted()     // Catch:{ Exception -> 0x015e }
                if (r6 == 0) goto L_0x0161
                com.tencent.mm.plugin.dbbackup.k r6 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x015e }
                com.tencent.wcdb.repair.RepairKit r6 = r6.f345886f     // Catch:{ Exception -> 0x015e }
                boolean r6 = r6.isDataCorrupted()     // Catch:{ Exception -> 0x015e }
                if (r6 != 0) goto L_0x015c
                goto L_0x0161
            L_0x015c:
                r6 = 0
                goto L_0x0162
            L_0x015e:
                r0 = move-exception
                goto L_0x0203
            L_0x0161:
                r6 = 1
            L_0x0162:
                r0 = r0 & r6
                r11.close()     // Catch:{ Exception -> 0x015e }
                r5.release()     // Catch:{ Exception -> 0x01f4, all -> 0x01f2 }
                com.tencent.mm.plugin.dbbackup.k r5 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                com.tencent.wcdb.repair.RepairKit r5 = r5.f345886f     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r5.release()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                com.tencent.mm.plugin.dbbackup.k r5 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r6 = 0
                r5.f345886f = r6     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                com.tencent.mm.plugin.dbbackup.k r5 = com.tencent.p014mm.plugin.dbbackup.C115392k.this     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                eb0.c r6 = r1.f345896e     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r5.wx0(r6)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                long r5 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                long r5 = r5 - r12
                java.lang.String r8 = "DB repair %s, elapsed %.2f seconds."
                r9 = 2
                java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                if (r0 == 0) goto L_0x018c
                java.lang.String r10 = "succeeded"
                goto L_0x018e
            L_0x018c:
                java.lang.String r10 = "failed"
            L_0x018e:
                r11 = 0
                r9[r11] = r10     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                float r5 = (float) r5     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r6 = 1315859240(0x4e6e6b28, float:1.0E9)
                float r5 = r5 / r6
                java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9[r7] = r5     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r9)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                if (r0 == 0) goto L_0x01ac
                r0 = 26
                com.tencent.mm.plugin.dbbackup.a r5 = r1.f345898g     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                if (r5 == 0) goto L_0x01cf
                r6 = 0
                r5.mo127599a(r6)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                goto L_0x01cf
            L_0x01ac:
                r0 = 27
                com.tencent.mm.plugin.dbbackup.a r5 = r1.f345898g     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                if (r5 == 0) goto L_0x01b6
                r6 = -1
                r5.mo127599a(r6)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
            L_0x01b6:
                com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r6.<init>()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r6.append(r2)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.String r8 = com.tencent.wcdb.repair.RepairKit.lastError()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r6.append(r8)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r8 = 0
                r5.mo160135k(r3, r6, r8)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
            L_0x01cf:
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r9 = 181(0xb5, double:8.94E-322)
                long r11 = (long) r0     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                r13 = 1
                r15 = 1
                r8.idkeyStat(r9, r11, r13, r15)     // Catch:{ Exception -> 0x0200, all -> 0x01fc }
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RepairKit r0 = r0.f345886f
                if (r0 == 0) goto L_0x01ec
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RepairKit r0 = r0.f345886f
                r0.release()
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345886f = r2
            L_0x01ec:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345887g = r2
                goto L_0x025e
            L_0x01f2:
                r0 = move-exception
                goto L_0x01fe
            L_0x01f4:
                r0 = move-exception
                goto L_0x0202
            L_0x01f6:
                r0 = move-exception
                r5 = 0
                goto L_0x0267
            L_0x01f9:
                r0 = move-exception
                r5 = 0
                goto L_0x0203
            L_0x01fc:
                r0 = move-exception
                r5 = 0
            L_0x01fe:
                r11 = 0
                goto L_0x0267
            L_0x0200:
                r0 = move-exception
                r5 = 0
            L_0x0202:
                r11 = 0
            L_0x0203:
                java.lang.String r6 = "Failed to repair database '%s'"
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0266 }
                java.lang.String r8 = r1.f345897f     // Catch:{ all -> 0x0266 }
                r9 = 0
                r7[r9] = r8     // Catch:{ all -> 0x0266 }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r6, r7)     // Catch:{ all -> 0x0266 }
                com.tencent.mm.plugin.dbbackup.a r0 = r1.f345898g     // Catch:{ all -> 0x0266 }
                if (r0 == 0) goto L_0x0217
                r4 = -1
                r0.mo127599a(r4)     // Catch:{ all -> 0x0266 }
            L_0x0217:
                com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x0266 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0266 }
                r4.<init>()     // Catch:{ all -> 0x0266 }
                r4.append(r2)     // Catch:{ all -> 0x0266 }
                java.lang.String r2 = com.tencent.wcdb.repair.RepairKit.lastError()     // Catch:{ all -> 0x0266 }
                r4.append(r2)     // Catch:{ all -> 0x0266 }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0266 }
                r4 = 0
                r0.mo160135k(r3, r2, r4)     // Catch:{ all -> 0x0266 }
                r19 = 181(0xb5, double:8.94E-322)
                r21 = 27
                r23 = 1
                r25 = 1
                r18 = r0
                r18.idkeyStat(r19, r21, r23, r25)     // Catch:{ all -> 0x0266 }
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RepairKit r0 = r0.f345886f
                if (r0 == 0) goto L_0x024f
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RepairKit r0 = r0.f345886f
                r0.release()
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345886f = r2
            L_0x024f:
                if (r11 == 0) goto L_0x0254
                r11.close()
            L_0x0254:
                if (r5 == 0) goto L_0x0259
                r5.release()
            L_0x0259:
                com.tencent.mm.plugin.dbbackup.k r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r2 = 0
                r0.f345887g = r2
            L_0x025e:
                com.tencent.mm.sdk.platformtools.MMHandlerThread r0 = f40.C86709a0.m107525e()
                r0.setLowPriority()
                return
            L_0x0266:
                r0 = move-exception
            L_0x0267:
                com.tencent.mm.plugin.dbbackup.k r2 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RepairKit r2 = r2.f345886f
                if (r2 == 0) goto L_0x0279
                com.tencent.mm.plugin.dbbackup.k r2 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                com.tencent.wcdb.repair.RepairKit r2 = r2.f345886f
                r2.release()
                com.tencent.mm.plugin.dbbackup.k r2 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r3 = 0
                r2.f345886f = r3
            L_0x0279:
                if (r11 == 0) goto L_0x027e
                r11.close()
            L_0x027e:
                if (r5 == 0) goto L_0x0283
                r5.release()
            L_0x0283:
                com.tencent.mm.plugin.dbbackup.k r2 = com.tencent.p014mm.plugin.dbbackup.C115392k.this
                r3 = 0
                r2.f345887g = r3
                com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = f40.C86709a0.m107525e()
                r2.setLowPriority()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.dbbackup.C115392k.C115394b.run():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[SYNTHETIC, Splitter:B:20:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060 A[SYNTHETIC, Splitter:B:26:0x0060] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean vx0(com.tencent.p014mm.plugin.dbbackup.C115392k r7, java.lang.String r8, long[] r9) {
        /*
            r7.getClass()
            r7 = 0
            r0 = 1
            r1 = 0
            com.tencent.mm.vfs.u1 r2 = new com.tencent.mm.vfs.u1     // Catch:{ IOException -> 0x0049, all -> 0x0045 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0049, all -> 0x0045 }
            r3.<init>()     // Catch:{ IOException -> 0x0049, all -> 0x0045 }
            r3.append(r8)     // Catch:{ IOException -> 0x0049, all -> 0x0045 }
            java.lang.String r4 = ".bcur"
            r3.append(r4)     // Catch:{ IOException -> 0x0049, all -> 0x0045 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0049, all -> 0x0045 }
            r2.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x0049, all -> 0x0045 }
            int r7 = r9.length     // Catch:{ IOException -> 0x0043 }
            r3 = 0
        L_0x001e:
            if (r3 >= r7) goto L_0x003d
            r4 = r9[r3]     // Catch:{ IOException -> 0x0043 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0043 }
            r6.<init>()     // Catch:{ IOException -> 0x0043 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ IOException -> 0x0043 }
            r6.append(r4)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r4 = "\n"
            r6.append(r4)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x0043 }
            r2.write(r4)     // Catch:{ IOException -> 0x0043 }
            int r3 = r3 + 1
            goto L_0x001e
        L_0x003d:
            r2.close()     // Catch:{ IOException -> 0x005d }
            goto L_0x005d
        L_0x0041:
            r7 = move-exception
            goto L_0x005e
        L_0x0043:
            r7 = move-exception
            goto L_0x004c
        L_0x0045:
            r8 = move-exception
            r2 = r7
            r7 = r8
            goto L_0x005e
        L_0x0049:
            r9 = move-exception
            r2 = r7
            r7 = r9
        L_0x004c:
            java.lang.String r9 = "MicroMsg.SubCoreDBBackup"
            java.lang.String r3 = "Failed to write previous cursor '%s'"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0041 }
            r0[r1] = r8     // Catch:{ all -> 0x0041 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r7, r3, r0)     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x005c
            r2.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            r0 = 0
        L_0x005d:
            return r0
        L_0x005e:
            if (r2 == 0) goto L_0x0063
            r2.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.dbbackup.C115392k.vx0(com.tencent.mm.plugin.dbbackup.k, java.lang.String, long[]):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: java.io.PrintWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.io.PrintWriter} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0304  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccountInitialized(android.content.Context r19) {
        /*
            r18 = this;
            r1 = r18
            super.onAccountInitialized(r19)
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            f40.o r2 = f40.C86709a0.m107535s()
            zh3.f r2 = r2.f251811i
            com.tencent.wcdb.database.SQLiteDatabase r2 = r2.mo125615f()
            r3 = 237571(0x3a003, float:3.32908E-40)
            r4 = 0
            int r0 = r0.mo119688i(r3, r4)
            r3 = 1
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            r1.f345888h = r0
            com.tencent.mm.plugin.dbbackup.b r0 = new com.tencent.mm.plugin.dbbackup.b
            r0.<init>(r1)
            java.lang.String r5 = "//recover-old"
            java.lang.String r6 = "//recover"
            java.lang.String r7 = "//post-recover"
            java.lang.String r8 = "//backupdb"
            java.lang.String r9 = "//recoverdb"
            java.lang.String r10 = "//repairdb"
            java.lang.String r11 = "//corruptdb"
            java.lang.String r12 = "//iotracedb"
            java.lang.String r13 = "//recover-status"
            java.lang.String r14 = "//dbbusy"
            java.lang.String r15 = "//fixdb"
            java.lang.String r16 = "//dbscanleaf"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            com.tencent.p014mm.pluginsdk.cmd.C30650a.m39147b(r0, r5)
            java.lang.String r5 = "MicroMsg.SubCoreDBBackup"
            java.lang.String r0 = r2.getPath()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = ".sm"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r7 = ".tmp"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            f40.o r8 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r8 = r8.mo121142i()
            r9 = 237569(0x3a001, float:3.32905E-40)
            r10 = 0
            long r10 = r8.mo119672F(r9, r10)
            long r12 = java.lang.System.currentTimeMillis()
            com.tencent.mm.vfs.m1 r14 = new com.tencent.mm.vfs.m1
            r14.<init>((java.lang.String) r0)
            boolean r0 = r14.mo119967g()
            if (r0 == 0) goto L_0x009e
            long r10 = r12 - r10
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x009e
            goto L_0x0122
        L_0x009e:
            long r10 = java.lang.System.nanoTime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r15 = p156gj.C87203t.m108270f(r3)
            r0.append(r15)
            eb0.c r15 = eb0.C97625j3.m125812b()
            int r15 = r15.mo105881G()
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            byte[] r0 = r0.getBytes()
            byte[] r0 = p823sg.C90193h.m112879g(r0)
            com.tencent.mm.vfs.m1 r15 = new com.tencent.mm.vfs.m1
            r15.<init>((java.lang.String) r6)
            java.lang.String r6 = p823sg.C48380r.m53726a(r6, r3)     // Catch:{ RuntimeException -> 0x00d3 }
            boolean r0 = com.tencent.wcdb.repair.RepairKit.MasterInfo.save(r2, r6, r0)     // Catch:{ RuntimeException -> 0x00d3 }
            goto L_0x00dc
        L_0x00d3:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r6 = "Failed to backup database master."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r2)
            r0 = 0
        L_0x00dc:
            if (r0 == 0) goto L_0x00ec
            r14.mo119966f()
            boolean r0 = r15.mo119988y(r14)
            r8.mo119680N(r9, r12)
            r8.mo119681a(r4)
            goto L_0x00ef
        L_0x00ec:
            r15.mo119966f()
        L_0x00ef:
            long r8 = java.lang.System.nanoTime()
            long r8 = r8 - r10
            r2 = 2
            java.lang.Object[] r6 = new java.lang.Object[r2]
            if (r0 == 0) goto L_0x00fc
            java.lang.String r2 = "SUCCEEDED"
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r2 = "FAILED"
        L_0x00fe:
            r6[r4] = r2
            float r2 = (float) r8
            r8 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r8
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r6[r3] = r2
            java.lang.String r2 = "Master table backup %s, elapsed %.3f"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r6)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r9 = 181(0xb5, double:8.94E-322)
            if (r0 == 0) goto L_0x0119
            r5 = 24
            goto L_0x011b
        L_0x0119:
            r5 = 25
        L_0x011b:
            r11 = r5
            r13 = 1
            r15 = 0
            r8.idkeyStat(r9, r11, r13, r15)
        L_0x0122:
            java.lang.String r2 = p156gj.C87203t.m108270f(r3)
            java.lang.String r5 = "MicroMsg.DBRecoveryUtils"
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "KeyInfo.bin"
            java.io.File r0 = r0.getFileStreamPath(r6)
            com.tencent.mm.vfs.m1 r6 = com.tencent.p014mm.vfs.C86009m1.m106378c(r0)
            com.tencent.mm.vfs.m1 r8 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = r6.mo119976n()
            r0.append(r9)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r8.<init>((java.lang.String) r0)
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "_wEcHAT_"
            byte[] r0 = r0.getBytes()
            java.lang.String r9 = "RC4"
            r7.<init>(r0, r9)
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch:{ Exception -> 0x0211 }
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            r11 = 0
            r12 = 2
            r9.init(r12, r7)     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
            javax.crypto.CipherInputStream r13 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
            java.io.InputStream r14 = com.tencent.p014mm.vfs.C86013q1.m106422D(r6)     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
            r13.<init>(r14, r9)     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
            r0.<init>(r13)     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x019b, all -> 0x0198 }
        L_0x017c:
            java.lang.String r0 = r12.readLine()     // Catch:{ Exception -> 0x0196 }
            if (r0 == 0) goto L_0x01a4
            boolean r13 = r0.equals(r2)     // Catch:{ Exception -> 0x0196 }
            if (r13 == 0) goto L_0x0192
            java.lang.String r0 = "Key information is already backed up."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x0196 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            goto L_0x021a
        L_0x0192:
            r10.add(r0)     // Catch:{ Exception -> 0x0196 }
            goto L_0x017c
        L_0x0196:
            r0 = move-exception
            goto L_0x019d
        L_0x0198:
            r0 = move-exception
            goto L_0x020d
        L_0x019b:
            r0 = move-exception
            r12 = r11
        L_0x019d:
            java.lang.String r13 = "Failed to load key information."
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x020b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r13, r14)     // Catch:{ all -> 0x020b }
        L_0x01a4:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r12)
            r9.init(r3, r7)     // Catch:{ Exception -> 0x01fa }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ Exception -> 0x01fa }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x01fa }
            javax.crypto.CipherOutputStream r7 = new javax.crypto.CipherOutputStream     // Catch:{ Exception -> 0x01fa }
            java.io.OutputStream r12 = com.tencent.p014mm.vfs.C86013q1.m106426H(r8)     // Catch:{ Exception -> 0x01fa }
            r7.<init>(r12, r9)     // Catch:{ Exception -> 0x01fa }
            r0.<init>(r7)     // Catch:{ Exception -> 0x01fa }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01fa }
            r3.println(r2)     // Catch:{ Exception -> 0x01f5, all -> 0x01f3 }
            java.util.Iterator r0 = r10.iterator()     // Catch:{ Exception -> 0x01f5, all -> 0x01f3 }
        L_0x01c4:
            boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x01f5, all -> 0x01f3 }
            if (r2 == 0) goto L_0x01d4
            java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x01f5, all -> 0x01f3 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x01f5, all -> 0x01f3 }
            r3.println(r2)     // Catch:{ Exception -> 0x01f5, all -> 0x01f3 }
            goto L_0x01c4
        L_0x01d4:
            r3.close()     // Catch:{ Exception -> 0x01f5, all -> 0x01f3 }
            r6.mo119966f()     // Catch:{ Exception -> 0x01fa }
            boolean r0 = r8.mo119988y(r6)     // Catch:{ Exception -> 0x01fa }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01fa }
            r2.<init>()     // Catch:{ Exception -> 0x01fa }
            java.lang.String r3 = "Backup key information succeeded: "
            r2.append(r3)     // Catch:{ Exception -> 0x01fa }
            r2.append(r0)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x01fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0202
        L_0x01f3:
            r0 = move-exception
            goto L_0x0207
        L_0x01f5:
            r0 = move-exception
            r11 = r3
            goto L_0x01fb
        L_0x01f8:
            r0 = move-exception
            goto L_0x0206
        L_0x01fa:
            r0 = move-exception
        L_0x01fb:
            java.lang.String r2 = "Failed to backup key information."
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f8 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r3)     // Catch:{ all -> 0x01f8 }
        L_0x0202:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r11)
            goto L_0x021a
        L_0x0206:
            r3 = r11
        L_0x0207:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r3)
            throw r0
        L_0x020b:
            r0 = move-exception
            r11 = r12
        L_0x020d:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r11)
            throw r0
        L_0x0211:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r3 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r2, r3, r0)
        L_0x021a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.o r2 = f40.C86709a0.m107535s()
            java.lang.String r2 = r2.f251806d
            r0.append(r2)
            java.lang.String r2 = "dbback/"
            r0.append(r2)
            java.lang.String r2 = "EnMicroMsg.db"
            r0.append(r2)
            java.lang.String r3 = ".bak"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.o r4 = f40.C86709a0.m107535s()
            java.lang.String r4 = r4.f251806d
            r0.append(r4)
            java.lang.String r4 = "dbback/corrupted/"
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.o r4 = f40.C86709a0.m107535s()
            java.lang.String r4 = r4.f251807e
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            f40.o r4 = f40.C86709a0.m107535s()
            java.lang.String r4 = r4.f251807e
            r0.append(r4)
            java.lang.String r4 = "corrupted/"
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            rx3.g r0 = q41.C101031c.f295820b
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            qh3.b$b r0 = (qh3.C89661b.C89663b) r0
            rx3.g r0 = q41.C101031c.f295821c
            rx3.n r0 = (rx3.C36570n) r0
            r0.getValue()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            f40.o r0 = f40.C86709a0.m107535s()
            java.lang.String r0 = r0.f251807e
            com.tencent.mm.sdk.platformtools.MMHandlerThread r2 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.dbbackup.n r3 = new com.tencent.mm.plugin.dbbackup.n
            r3.<init>(r1, r0)
            r4 = 60000(0xea60, double:2.9644E-319)
            r2.postToWorkerDelayed(r3, r4)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            java.lang.Class<h81.h> r2 = h81.C32735h.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            h81.h r2 = (h81.C32735h) r2
            java.lang.String r3 = "0"
            if (r0 != 0) goto L_0x02e1
            java.lang.String r4 = "clicfg_vfs_db_protect"
            java.lang.String r4 = r2.mo58776F5(r4, r3)
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x02de
            goto L_0x02e1
        L_0x02de:
            java.lang.String r4 = "ll-l-l-lll"
            goto L_0x02e3
        L_0x02e1:
            java.lang.String r4 = "lt-t-t-ttt"
        L_0x02e3:
            com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$b r5 = r5.mo177789b()
            java.lang.String r6 = "dbProtect"
            r5.mo177806f(r6, r4)
            r5.mo177801a()
            java.lang.String r4 = "clicfg_vfs_db_protect_assert"
            java.lang.String r2 = r2.mo58776F5(r4, r3)
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0304
            java.lang.String r2 = "vfs_db_protect_assert"
            com.tencent.p014mm.vfs.C116299g2.m163864t(r2)
            goto L_0x031a
        L_0x0304:
            java.io.File r2 = new java.io.File
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r3 = r3.getCacheDir()
            java.io.File r3 = r3.getParentFile()
            java.lang.String r4 = ".vfs/vfs_db_protect_assert.timestamp"
            r2.<init>(r3, r4)
            r2.delete()
        L_0x031a:
            com.tencent.mm.plugin.dbbackup.SubCoreDBBackup$7 r2 = new com.tencent.mm.plugin.dbbackup.SubCoreDBBackup$7
            f40.e r3 = f40.C86709a0.m107523b()
            f40.a r3 = r3.f251755f
            r2.<init>(r3, r0)
            r2.alive()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.dbbackup.C115392k.onAccountInitialized(android.content.Context):void");
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        synchronized (this) {
            this.f345887g = false;
            if (this.f345884d != null) {
                this.f345884d.onCancel();
            }
        }
        C30650a.m39148c("//recover-old", "//recover", "//post-recover", "//backupdb", "//recoverdb", "//repairdb", "//corruptdb", "//iotracedb", "//recover-status", "//dbbusy", "//fixdb", "//dbscanleaf");
    }

    public void wx0(C75566c cVar) {
        C72972g4 g4Var = (C72972g4) cVar.mo105911z();
        g4Var.getClass();
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(348167, 1);
        g4Var.zy0();
        ((C44660i2) cVar.mo105908w()).mo69758c0();
        ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).Ex0();
        C85801v1 u = cVar.mo105906u();
        u.mo119677K(C72994y1.C72995a.USERINFO_EMOJI_NEW_EMOJI_INT, 0);
        u.mo119677K(C72994y1.C72995a.USERINFO_EMOJI_NEW_PANEL_INT, 0);
        u.mo119677K(C72994y1.C72995a.USERINFO_EMOJI_NEW_SUGGEST_INT, 0);
    }

    @Deprecated
    public synchronized int xx0(String str, C93095a aVar) {
        C115393a aVar2 = new C115393a(C97625j3.m125812b(), str, Util.getDataAvailableSize(), aVar);
        this.f345887g = true;
        C86709a0.m107525e().setHighPriority();
        C86709a0.m107525e().postAtFrontOfQueueToWorker(aVar2);
        return 0;
    }

    @Deprecated
    public synchronized int yx0(String str, C93095a aVar) {
        C75566c b = C97625j3.m125812b();
        if (str == null) {
            b.getClass();
            C86709a0.m107528h();
            str = C86709a0.m107535s().mo121148o();
        }
        long dataAvailableSize = Util.getDataAvailableSize();
        C86009m1 m1Var = str == null ? null : new C86009m1(str);
        if (m1Var != null) {
            if (m1Var.mo119961a()) {
                Log.m105925i("MicroMsg.SubCoreDBBackup", "[Repair] inFileSize: %d, diskFreeSpace: %d", Long.valueOf(m1Var.mo119980r()), Long.valueOf(dataAvailableSize));
                if (((float) dataAvailableSize) < ((float) m1Var.mo119980r()) * 1.5f) {
                    return -2;
                }
                C115394b bVar = new C115394b(b, str, aVar);
                this.f345887g = true;
                C86709a0.m107525e().setHighPriority();
                C86709a0.m107525e().postAtFrontOfQueueToWorker(bVar);
                return 0;
            }
        }
        return -3;
    }
}
