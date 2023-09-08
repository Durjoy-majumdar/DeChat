package t72;

/* renamed from: t72.n */
public class C48554n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f129880d;

    /* renamed from: e */
    public final /* synthetic */ long f129881e;

    /* renamed from: f */
    public final /* synthetic */ long f129882f;

    /* renamed from: g */
    public final /* synthetic */ long f129883g;

    /* renamed from: h */
    public final /* synthetic */ long f129884h;

    /* renamed from: i */
    public final /* synthetic */ long f129885i;

    /* renamed from: j */
    public final /* synthetic */ C118391i f129886j;

    public C48554n(C118391i iVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.f129886j = iVar;
        this.f129880d = j;
        this.f129881e = j2;
        this.f129882f = j3;
        this.f129883g = j4;
        this.f129884h = j5;
        this.f129885i = j6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088 A[Catch:{ Exception -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae A[Catch:{ Exception -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1 A[Catch:{ Exception -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7 A[Catch:{ Exception -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010d A[Catch:{ Exception -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010e A[Catch:{ Exception -> 0x0372 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0162 A[Catch:{ Exception -> 0x0372 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r34 = this;
            r1 = r34
            java.lang.String r0 = ";"
            java.lang.String r2 = "MicroMsg.SubCoreBaseMonitor"
            r3 = 0
            com.tencent.mm.plugin.report.kvdata.log_14375 r4 = new com.tencent.mm.plugin.report.kvdata.log_14375     // Catch:{ Exception -> 0x0375 }
            r4.<init>()     // Catch:{ Exception -> 0x0375 }
            r5 = 1
            r4.type_ = r5     // Catch:{ Exception -> 0x0375 }
            com.tencent.mm.plugin.report.kvdata.BDStatusInfo r6 = new com.tencent.mm.plugin.report.kvdata.BDStatusInfo     // Catch:{ Exception -> 0x0375 }
            r6.<init>()     // Catch:{ Exception -> 0x0375 }
            r4.dbStatusInfo_ = r6     // Catch:{ Exception -> 0x0375 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0375 }
            f40.o r7 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0375 }
            java.lang.String r7 = r7.mo121140g()     // Catch:{ Exception -> 0x0375 }
            android.net.Uri r7 = com.tencent.p014mm.vfs.C116299g2.m163858n(r7)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r8 = r7.getPath()     // Catch:{ Exception -> 0x0372 }
            if (r8 == 0) goto L_0x0045
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r3, r3)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r9 = r7.getPath()     // Catch:{ Exception -> 0x0372 }
            boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x0372 }
            if (r9 != 0) goto L_0x0045
            android.net.Uri$Builder r7 = r7.buildUpon()     // Catch:{ Exception -> 0x0372 }
            android.net.Uri$Builder r7 = r7.path(r8)     // Catch:{ Exception -> 0x0372 }
            android.net.Uri r7 = r7.build()     // Catch:{ Exception -> 0x0372 }
        L_0x0045:
            com.tencent.mm.vfs.f0 r8 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0372 }
            r9 = 0
            com.tencent.mm.vfs.f0$h r7 = r8.mo177799l(r7, r9)     // Catch:{ Exception -> 0x0372 }
            boolean r8 = r7.mo177810a()     // Catch:{ Exception -> 0x0372 }
            if (r8 != 0) goto L_0x0053
            goto L_0x005d
        L_0x0053:
            com.tencent.mm.vfs.FileSystem$c r8 = r7.f348991a     // Catch:{ Exception -> 0x0372 }
            java.lang.String r7 = r7.f348992b     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.vfs.b0 r7 = r8.mo119945q(r7)     // Catch:{ Exception -> 0x0372 }
            if (r7 != 0) goto L_0x0060
        L_0x005d:
            r7 = 0
            goto L_0x0062
        L_0x0060:
            long r7 = r7.f250473c     // Catch:{ Exception -> 0x0372 }
        L_0x0062:
            r6.mmDBSize_ = r7     // Catch:{ Exception -> 0x0375 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0375 }
            r12.<init>()     // Catch:{ Exception -> 0x0375 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0375 }
            f40.o r13 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0375 }
            java.lang.String r13 = r13.f251807e     // Catch:{ Exception -> 0x0372 }
            r12.append(r13)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r13 = "SnsMicroMsg.db"
            r12.append(r13)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0375 }
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r13 = r12.getPath()     // Catch:{ Exception -> 0x0372 }
            if (r13 == 0) goto L_0x00a2
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r3, r3)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r14 = r12.getPath()     // Catch:{ Exception -> 0x0372 }
            boolean r14 = r14.equals(r13)     // Catch:{ Exception -> 0x0372 }
            if (r14 != 0) goto L_0x00a2
            android.net.Uri$Builder r12 = r12.buildUpon()     // Catch:{ Exception -> 0x0372 }
            android.net.Uri$Builder r12 = r12.path(r13)     // Catch:{ Exception -> 0x0372 }
            android.net.Uri r12 = r12.build()     // Catch:{ Exception -> 0x0372 }
        L_0x00a2:
            com.tencent.mm.vfs.f0 r13 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.vfs.f0$h r12 = r13.mo177799l(r12, r9)     // Catch:{ Exception -> 0x0372 }
            boolean r13 = r12.mo177810a()     // Catch:{ Exception -> 0x0372 }
            if (r13 != 0) goto L_0x00b1
            r14 = 0
            goto L_0x00c1
        L_0x00b1:
            com.tencent.mm.vfs.FileSystem$c r13 = r12.f348991a     // Catch:{ Exception -> 0x0372 }
            java.lang.String r12 = r12.f348992b     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.vfs.b0 r12 = r13.mo119945q(r12)     // Catch:{ Exception -> 0x0372 }
            if (r12 != 0) goto L_0x00be
            r12 = 0
            goto L_0x00c0
        L_0x00be:
            long r12 = r12.f250473c     // Catch:{ Exception -> 0x0372 }
        L_0x00c0:
            r14 = r12
        L_0x00c1:
            r6.snsDBSize_ = r14     // Catch:{ Exception -> 0x0375 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0375 }
            r12.<init>()     // Catch:{ Exception -> 0x0375 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0375 }
            f40.o r13 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0375 }
            java.lang.String r13 = r13.f251807e     // Catch:{ Exception -> 0x0372 }
            r12.append(r13)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r13 = "enFavorite.db"
            r12.append(r13)     // Catch:{ Exception -> 0x0375 }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x0375 }
            android.net.Uri r12 = com.tencent.p014mm.vfs.C116299g2.m163858n(r12)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r13 = r12.getPath()     // Catch:{ Exception -> 0x0372 }
            if (r13 == 0) goto L_0x0101
            java.lang.String r13 = com.tencent.p014mm.vfs.C116299g2.m163855k(r13, r3, r3)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r10 = r12.getPath()     // Catch:{ Exception -> 0x0372 }
            boolean r10 = r10.equals(r13)     // Catch:{ Exception -> 0x0372 }
            if (r10 != 0) goto L_0x0101
            android.net.Uri$Builder r10 = r12.buildUpon()     // Catch:{ Exception -> 0x0372 }
            android.net.Uri$Builder r10 = r10.path(r13)     // Catch:{ Exception -> 0x0372 }
            android.net.Uri r12 = r10.build()     // Catch:{ Exception -> 0x0372 }
        L_0x0101:
            com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.vfs.f0$h r10 = r10.mo177799l(r12, r9)     // Catch:{ Exception -> 0x0372 }
            boolean r11 = r10.mo177810a()     // Catch:{ Exception -> 0x0372 }
            if (r11 != 0) goto L_0x010e
            goto L_0x0118
        L_0x010e:
            com.tencent.mm.vfs.FileSystem$c r11 = r10.f348991a     // Catch:{ Exception -> 0x0372 }
            java.lang.String r10 = r10.f348992b     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.vfs.b0 r10 = r11.mo119945q(r10)     // Catch:{ Exception -> 0x0372 }
            if (r10 != 0) goto L_0x011b
        L_0x0118:
            r10 = 0
            goto L_0x011d
        L_0x011b:
            long r10 = r10.f250473c     // Catch:{ Exception -> 0x0372 }
        L_0x011d:
            r6.favDBSize_ = r10     // Catch:{ Exception -> 0x0375 }
            t72.i r12 = r1.f129886j     // Catch:{ Exception -> 0x0375 }
            r13 = 4
            r26 = r6
            long r5 = r1.f129880d     // Catch:{ Exception -> 0x0375 }
            r27 = r4
            r3 = r14
            r14 = r7
            r16 = r5
            r12.Bx0(r13, r14, r16)     // Catch:{ Exception -> 0x0372 }
            t72.i r5 = r1.f129886j     // Catch:{ Exception -> 0x0372 }
            r21 = 128(0x80, float:1.794E-43)
            long r12 = r1.f129881e     // Catch:{ Exception -> 0x0372 }
            r20 = r5
            r22 = r10
            r24 = r12
            r20.Bx0(r21, r22, r24)     // Catch:{ Exception -> 0x0372 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0372 }
            r5.<init>()     // Catch:{ Exception -> 0x0372 }
            r5.append(r7)     // Catch:{ Exception -> 0x0372 }
            r5.append(r0)     // Catch:{ Exception -> 0x0372 }
            r5.append(r3)     // Catch:{ Exception -> 0x0372 }
            r5.append(r0)     // Catch:{ Exception -> 0x0372 }
            r5.append(r10)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0372 }
            f40.C86709a0.m107528h()     // Catch:{ Exception -> 0x0372 }
            f40.o r6 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0372 }
            zh3.f r6 = r6.f251811i     // Catch:{ Exception -> 0x0372 }
            r7 = 2
            if (r6 == 0) goto L_0x02ee
            boolean r8 = r6.mo125628r()     // Catch:{ Exception -> 0x0372 }
            if (r8 != 0) goto L_0x016a
            goto L_0x02ee
        L_0x016a:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0372 }
            java.lang.String r8 = "PRAGMA freelist_count"
            r12 = 0
            android.database.Cursor r8 = r6.rawQuery(r8, r9, r12)     // Catch:{ Exception -> 0x0372 }
            r12 = 0
            if (r8 == 0) goto L_0x0188
        L_0x0179:
            boolean r14 = r8.moveToNext()     // Catch:{ Exception -> 0x0372 }
            if (r14 == 0) goto L_0x0185
            r14 = 0
            long r12 = r8.getLong(r14)     // Catch:{ Exception -> 0x0372 }
            goto L_0x0179
        L_0x0185:
            r8.close()     // Catch:{ Exception -> 0x0372 }
        L_0x0188:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0372 }
            r8.<init>()     // Catch:{ Exception -> 0x0372 }
            java.lang.String r14 = "freeListCount = "
            r8.append(r14)     // Catch:{ Exception -> 0x0372 }
            r8.append(r12)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0372 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)     // Catch:{ Exception -> 0x0372 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ Exception -> 0x0372 }
            r8.<init>()     // Catch:{ Exception -> 0x0372 }
            java.lang.String r14 = "SELECT name FROM sqlite_master WHERE type='table'"
            android.database.Cursor r14 = r6.rawQuery(r14, r9, r7)     // Catch:{ Exception -> 0x0372 }
            if (r14 == 0) goto L_0x01c1
            java.lang.String r15 = "name"
            int r15 = r14.getColumnIndex(r15)     // Catch:{ Exception -> 0x0372 }
        L_0x01af:
            boolean r16 = r14.moveToNext()     // Catch:{ Exception -> 0x0372 }
            if (r16 == 0) goto L_0x01be
            java.lang.String r7 = r14.getString(r15)     // Catch:{ Exception -> 0x0372 }
            r8.add(r7)     // Catch:{ Exception -> 0x0372 }
            r7 = 2
            goto L_0x01af
        L_0x01be:
            r14.close()     // Catch:{ Exception -> 0x0372 }
        L_0x01c1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0372 }
            r7.<init>()     // Catch:{ Exception -> 0x0372 }
            r7.append(r5)     // Catch:{ Exception -> 0x0372 }
            r7.append(r0)     // Catch:{ Exception -> 0x0372 }
            int r5 = r8.size()     // Catch:{ Exception -> 0x0372 }
            r7.append(r5)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r5 = r7.toString()     // Catch:{ Exception -> 0x0372 }
            int r7 = r8.size()     // Catch:{ Exception -> 0x0372 }
            r14 = r26
            r14.mmDBTableCount_ = r7     // Catch:{ Exception -> 0x0372 }
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch:{ Exception -> 0x0372 }
            r7.<init>()     // Catch:{ Exception -> 0x0372 }
            r14.tableList_ = r7     // Catch:{ Exception -> 0x0372 }
            java.util.Iterator r14 = r8.iterator()     // Catch:{ Exception -> 0x0372 }
            r20 = 0
        L_0x01ec:
            boolean r15 = r14.hasNext()     // Catch:{ Exception -> 0x0372 }
            if (r15 == 0) goto L_0x02c8
            java.lang.Object r15 = r14.next()     // Catch:{ Exception -> 0x0372 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0372 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0372 }
            r9.<init>()     // Catch:{ Exception -> 0x0372 }
            r22 = r12
            java.lang.String r12 = "select count(*) from "
            r9.append(r12)     // Catch:{ Exception -> 0x0372 }
            r9.append(r15)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0372 }
            r12 = 2
            r13 = 0
            android.database.Cursor r9 = r6.rawQuery(r9, r13, r12)     // Catch:{ Exception -> 0x0372 }
            if (r9 == 0) goto L_0x0228
            boolean r12 = r9.moveToFirst()     // Catch:{ Exception -> 0x0372 }
            if (r12 == 0) goto L_0x021f
            r12 = 0
            long r24 = r9.getLong(r12)     // Catch:{ Exception -> 0x0372 }
            goto L_0x0221
        L_0x021f:
            r24 = 0
        L_0x0221:
            r9.close()     // Catch:{ Exception -> 0x0372 }
            r9 = r14
            r13 = r24
            goto L_0x022b
        L_0x0228:
            r9 = r14
            r13 = 0
        L_0x022b:
            long r20 = r20 + r13
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0372 }
            r12.<init>()     // Catch:{ Exception -> 0x0372 }
            r12.append(r5)     // Catch:{ Exception -> 0x0372 }
            r12.append(r0)     // Catch:{ Exception -> 0x0372 }
            r12.append(r15)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r5 = ":"
            r12.append(r5)     // Catch:{ Exception -> 0x0372 }
            r12.append(r13)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r5 = r12.toString()     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.plugin.report.kvdata.TableInfo r12 = new com.tencent.mm.plugin.report.kvdata.TableInfo     // Catch:{ Exception -> 0x0372 }
            r12.<init>()     // Catch:{ Exception -> 0x0372 }
            r12.name_ = r15     // Catch:{ Exception -> 0x0372 }
            r12.count_ = r13     // Catch:{ Exception -> 0x0372 }
            r7.add(r12)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r12 = "message"
            boolean r12 = r12.equals(r15)     // Catch:{ Exception -> 0x0372 }
            if (r12 == 0) goto L_0x0270
            t72.i r12 = r1.f129886j     // Catch:{ Exception -> 0x0372 }
            r29 = 8
            r25 = r5
            r24 = r6
            long r5 = r1.f129882f     // Catch:{ Exception -> 0x0372 }
            r28 = r12
            r30 = r13
            r32 = r5
            r28.Bx0(r29, r30, r32)     // Catch:{ Exception -> 0x0372 }
            r12 = r7
            goto L_0x02bd
        L_0x0270:
            r25 = r5
            r24 = r6
            java.lang.String r5 = "rconversation"
            boolean r5 = r5.equals(r15)     // Catch:{ Exception -> 0x0372 }
            if (r5 == 0) goto L_0x028d
            t72.i r5 = r1.f129886j     // Catch:{ Exception -> 0x0372 }
            r29 = 16
            r12 = r7
            long r6 = r1.f129883g     // Catch:{ Exception -> 0x0372 }
            r28 = r5
            r30 = r13
            r32 = r6
            r28.Bx0(r29, r30, r32)     // Catch:{ Exception -> 0x0372 }
            goto L_0x02bd
        L_0x028d:
            r12 = r7
            java.lang.String r5 = "rcontact"
            boolean r5 = r5.equals(r15)     // Catch:{ Exception -> 0x0372 }
            if (r5 == 0) goto L_0x02a6
            t72.i r5 = r1.f129886j     // Catch:{ Exception -> 0x0372 }
            r29 = 32
            long r6 = r1.f129884h     // Catch:{ Exception -> 0x0372 }
            r28 = r5
            r30 = r13
            r32 = r6
            r28.Bx0(r29, r30, r32)     // Catch:{ Exception -> 0x0372 }
            goto L_0x02bd
        L_0x02a6:
            java.lang.String r5 = "chatroom"
            boolean r5 = r5.equals(r15)     // Catch:{ Exception -> 0x0372 }
            if (r5 == 0) goto L_0x02bd
            t72.i r5 = r1.f129886j     // Catch:{ Exception -> 0x0372 }
            r29 = 64
            long r6 = r1.f129885i     // Catch:{ Exception -> 0x0372 }
            r28 = r5
            r30 = r13
            r32 = r6
            r28.Bx0(r29, r30, r32)     // Catch:{ Exception -> 0x0372 }
        L_0x02bd:
            r14 = r9
            r7 = r12
            r12 = r22
            r6 = r24
            r5 = r25
            r9 = 0
            goto L_0x01ec
        L_0x02c8:
            r22 = r12
            java.lang.String r0 = "summerreportDBInfo dump all table count %d last %d"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0372 }
            int r6 = r8.size()     // Catch:{ Exception -> 0x0372 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0372 }
            r8 = 0
            r7[r8] = r6     // Catch:{ Exception -> 0x0372 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0372 }
            long r8 = r8 - r10
            java.lang.Long r6 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x0372 }
            r8 = 1
            r7[r8] = r6     // Catch:{ Exception -> 0x0372 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r7)     // Catch:{ Exception -> 0x0372 }
            r10 = r20
            r6 = r22
            goto L_0x02f7
        L_0x02ee:
            java.lang.String r0 = "summerreportDBInfo db is not open!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)     // Catch:{ Exception -> 0x0372 }
            r6 = 0
            r10 = 0
        L_0x02f7:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ Exception -> 0x0372 }
            java.lang.String r8 = "storage_heavy_user_db_total_count"
            r0.encode((java.lang.String) r8, (long) r10)     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ Exception -> 0x0372 }
            java.lang.String r8 = "storage_heavy_user_db_table_result"
            r0.encode((java.lang.String) r8, (java.lang.String) r5)     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ Exception -> 0x0372 }
            java.lang.String r8 = "storage_heavy_user_db_freelist_count"
            r0.encode((java.lang.String) r8, (long) r6)     // Catch:{ Exception -> 0x0372 }
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x0372 }
            r10 = 13778(0x35d2, float:1.9307E-41)
            r11 = 0
            r12 = 0
            r13 = 1
            r6 = 3
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0372 }
            r7 = 1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0372 }
            r9 = 0
            r14[r9] = r8     // Catch:{ Exception -> 0x0372 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0372 }
            r14[r7] = r8     // Catch:{ Exception -> 0x0372 }
            r7 = 2
            r14[r7] = r5     // Catch:{ Exception -> 0x0372 }
            r9 = r0
            r9.mo160128e(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0372 }
            r10 = 13778(0x35d2, float:1.9307E-41)
            r11 = 0
            r12 = 0
            r13 = 1
            java.lang.Object[] r14 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0372 }
            r6 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0372 }
            r8 = 0
            r14[r8] = r7     // Catch:{ Exception -> 0x0372 }
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x0372 }
            r14[r6] = r8     // Catch:{ Exception -> 0x0372 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0372 }
            r14[r7] = r3     // Catch:{ Exception -> 0x0372 }
            r9 = r0
            r9.mo160128e(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0372 }
            r3 = 14375(0x3827, float:2.0144E-41)
            r4 = r27
            r6 = 0
            r0.mo175916z(r3, r4, r6, r6)     // Catch:{ Exception -> 0x0372 }
            r18 = 418(0x1a2, double:2.065E-321)
            r20 = 3
            r22 = 1
            r24 = 1
            r17 = r0
            r17.idkeyStat(r18, r20, r22, r24)     // Catch:{ Exception -> 0x0372 }
            java.lang.String r0 = "summerreportDBInfo result[%s]"
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0372 }
            r4 = 0
            r3[r4] = r5     // Catch:{ Exception -> 0x0372 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r3)     // Catch:{ Exception -> 0x0372 }
            goto L_0x0389
        L_0x0372:
            r0 = move-exception
            r3 = 0
            goto L_0x0376
        L_0x0375:
            r0 = move-exception
        L_0x0376:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "reportDBInfo err!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r4, r3)
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 418(0x1a2, double:2.065E-321)
            r8 = 4
            r10 = 1
            r12 = 1
            r5.idkeyStat(r6, r8, r10, r12)
        L_0x0389:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t72.C48554n.run():void");
    }
}
