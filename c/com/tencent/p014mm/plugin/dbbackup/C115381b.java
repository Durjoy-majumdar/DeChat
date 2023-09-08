package com.tencent.p014mm.plugin.dbbackup;

import android.content.Context;
import android.widget.Toast;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import qo3.C89779i0;
import yc3.C38992a;

/* renamed from: com.tencent.mm.plugin.dbbackup.b */
public class C115381b implements C38992a {

    /* renamed from: c */
    public static final String[] f345831c = {StateEvent.Name.MESSAGE, "ImgInfo2", "videoinfo2", "EmojiInfo", "rconversation", "appattach"};

    /* renamed from: a */
    public C115392k f345832a;

    /* renamed from: b */
    public MMHandler f345833b = null;

    public C115381b(C115392k kVar) {
        this.f345832a = kVar;
    }

    /* renamed from: b */
    public static /* synthetic */ void m162196b(C89779i0 i0Var, Context context, boolean z) {
        i0Var.dismiss();
        StringBuilder sb = new StringBuilder();
        sb.append("Database scan ");
        sb.append(z ? "succeeded" : StateEvent.ProcessResult.FAILED);
        Toast.makeText(context, sb.toString(), 0).show();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0777, code lost:
        if (r3 != 5) goto L_0x0787;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018b, code lost:
        r42 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cb, code lost:
        r8 = r40;
     */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0876  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x087b  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x088c  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0891  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x08a2  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x08a7  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x08b8  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x08d1 A[SYNTHETIC, Splitter:B:301:0x08d1] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x094a A[SYNTHETIC, Splitter:B:333:0x094a] */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0953 A[SYNTHETIC, Splitter:B:338:0x0953] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0957  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x096c  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0a05  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0a88  */
    /* JADX WARNING: Removed duplicated region for block: B:354:0x0a8b  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0a91  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0a96  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0ab8  */
    /* JADX WARNING: Removed duplicated region for block: B:373:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38a(android.content.Context r41, java.lang.String[] r42, java.lang.String r43) {
        /*
            r40 = this;
            r8 = r40
            r15 = r41
            r0 = r42
            r14 = 0
            r1 = r0[r14]
            r1.getClass()
            int r2 = r1.hashCode()
            r7 = 6
            r9 = 2
            r10 = 1
            switch(r2) {
                case -1955673212: goto L_0x009b;
                case -1870250080: goto L_0x008f;
                case -1832373669: goto L_0x0084;
                case -1648083177: goto L_0x0079;
                case -1183597639: goto L_0x006e;
                case -896707907: goto L_0x0063;
                case -398050965: goto L_0x0058;
                case -137452885: goto L_0x004d;
                case 206015859: goto L_0x0040;
                case 1483443294: goto L_0x0033;
                case 1793722114: goto L_0x0026;
                case 2027162967: goto L_0x0019;
                default: goto L_0x0016;
            }
        L_0x0016:
            r1 = -1
            goto L_0x00a6
        L_0x0019:
            java.lang.String r2 = "//dbbusy"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0022
            goto L_0x0016
        L_0x0022:
            r1 = 11
            goto L_0x00a6
        L_0x0026:
            java.lang.String r2 = "//recoverdb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002f
            goto L_0x0016
        L_0x002f:
            r1 = 10
            goto L_0x00a6
        L_0x0033:
            java.lang.String r2 = "//recover-old"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003c
            goto L_0x0016
        L_0x003c:
            r1 = 9
            goto L_0x00a6
        L_0x0040:
            java.lang.String r2 = "//fixdb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0049
            goto L_0x0016
        L_0x0049:
            r1 = 8
            goto L_0x00a6
        L_0x004d:
            java.lang.String r2 = "//repairdb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0056
            goto L_0x0016
        L_0x0056:
            r1 = 7
            goto L_0x00a6
        L_0x0058:
            java.lang.String r2 = "//corruptdb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0061
            goto L_0x0016
        L_0x0061:
            r1 = 6
            goto L_0x00a6
        L_0x0063:
            java.lang.String r2 = "//iotracedb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x006c
            goto L_0x0016
        L_0x006c:
            r1 = 5
            goto L_0x00a6
        L_0x006e:
            java.lang.String r2 = "//dbscanleaf"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0077
            goto L_0x0016
        L_0x0077:
            r1 = 4
            goto L_0x00a6
        L_0x0079:
            java.lang.String r2 = "//post-recover"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0082
            goto L_0x0016
        L_0x0082:
            r1 = 3
            goto L_0x00a6
        L_0x0084:
            java.lang.String r2 = "//recover-status"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x008d
            goto L_0x0016
        L_0x008d:
            r1 = 2
            goto L_0x00a6
        L_0x008f:
            java.lang.String r2 = "//backupdb"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0099
            goto L_0x0016
        L_0x0099:
            r1 = 1
            goto L_0x00a6
        L_0x009b:
            java.lang.String r2 = "//recover"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00a5
            goto L_0x0016
        L_0x00a5:
            r1 = 0
        L_0x00a6:
            r4 = 8388627(0x800013, float:1.175497E-38)
            r13 = 2131834504(0x7f113688, float:1.930212E38)
            r12 = -2
            r5 = 2131834503(0x7f113687, float:1.9302118E38)
            r6 = 2131821704(0x7f110488, float:1.9276159E38)
            r11 = 0
            switch(r1) {
                case 0: goto L_0x0acb;
                case 1: goto L_0x06e6;
                case 2: goto L_0x0689;
                case 3: goto L_0x0676;
                case 4: goto L_0x0610;
                case 5: goto L_0x0545;
                case 6: goto L_0x02a3;
                case 7: goto L_0x025b;
                case 8: goto L_0x021c;
                case 9: goto L_0x0116;
                case 10: goto L_0x00eb;
                case 11: goto L_0x00b8;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            return r14
        L_0x00b8:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r8.f345833b
            if (r0 != 0) goto L_0x00d7
            com.tencent.mm.sdk.platformtools.MMHandler r0 = new com.tencent.mm.sdk.platformtools.MMHandler
            com.tencent.mm.plugin.dbbackup.g r1 = new com.tencent.mm.plugin.dbbackup.g
            r1.<init>(r8)
            java.lang.String r2 = "DBBusyTest"
            r0.<init>((java.lang.String) r2, (com.tencent.p014mm.sdk.platformtools.MMHandler.Callback) r1)
            r8.f345833b = r0
            r0.sendEmptyMessage(r10)
            java.lang.String r0 = "TEST: Begin transaction"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r10)
            r0.show()
            goto L_0x00ea
        L_0x00d7:
            r0.sendEmptyMessage(r9)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r8.f345833b
            r0.quitSafely()
            r8.f345833b = r11
            java.lang.String r0 = "TEST: End transaction"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r10)
            r0.show()
        L_0x00ea:
            return r10
        L_0x00eb:
            int r1 = r0.length
            if (r1 <= r10) goto L_0x00f0
            r11 = r0[r10]
        L_0x00f0:
            long r12 = java.lang.System.nanoTime()
            java.lang.String r2 = r15.getString(r6)
            java.lang.String r3 = r15.getString(r5)
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r41
            qo3.i0 r3 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.dbbackup.k r0 = r8.f345832a
            com.tencent.mm.plugin.dbbackup.e r7 = new com.tencent.mm.plugin.dbbackup.e
            r1 = r7
            r2 = r40
            r4 = r12
            r6 = r41
            r1.<init>(r2, r3, r4, r6)
            r0.xx0(r11, r7)
            return r10
        L_0x0116:
            f40.o r0 = f40.C86709a0.m107535s()
            java.lang.String r0 = r0.mo121148o()
            if (r0 != 0) goto L_0x0125
            nj3.C76879j.m92738i(r15, r13, r6)
            goto L_0x0214
        L_0x0125:
            java.lang.String r2 = r15.getString(r6)
            java.lang.String r3 = r15.getString(r5)
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r41
            r13 = 3
            r7 = 4
            r12 = 5
            r0 = -1
            qo3.i0 r1 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            java.lang.Class<lc3.c> r2 = lc3.C117474c.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            lc3.c r2 = (lc3.C117474c) r2
            eb0.u5 r2 = r2.Rk0()
            r3 = 1800000(0x1b7740, double:8.89318E-318)
            monitor-enter(r2)
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ all -> 0x0219 }
            com.tencent.mm.sdk.platformtools.MMStack r11 = com.tencent.p014mm.sdk.platformtools.Util.getStack()     // Catch:{ all -> 0x0219 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0219 }
            r2.f350062d = r11     // Catch:{ all -> 0x0219 }
            int r11 = r2.f350063e     // Catch:{ all -> 0x0219 }
            if (r11 != r10) goto L_0x018e
            r2.f350061c = r5     // Catch:{ all -> 0x0219 }
            r2.f350060b = r3     // Catch:{ all -> 0x0219 }
            java.lang.String r5 = "MicroMsg.SyncPauser"
            java.lang.String r6 = "requestToPause currState:STATE_RUNNING timeout:%d %s"
            java.lang.Object[] r7 = new java.lang.Object[r9]     // Catch:{ all -> 0x0219 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0219 }
            r7[r14] = r3     // Catch:{ all -> 0x0219 }
            java.lang.String r3 = r2.f350062d     // Catch:{ all -> 0x0219 }
            r7[r10] = r3     // Catch:{ all -> 0x0219 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r7)     // Catch:{ all -> 0x0219 }
            r2.f350063e = r9     // Catch:{ all -> 0x0219 }
            eb0.u5$a r3 = r2.f350059a     // Catch:{ all -> 0x0219 }
            com.tencent.mm.plugin.zero.p$a r3 = (com.tencent.p014mm.plugin.zero.C115861p.C115862a) r3     // Catch:{ all -> 0x0219 }
            com.tencent.mm.plugin.zero.p r3 = com.tencent.p014mm.plugin.zero.C115861p.this     // Catch:{ all -> 0x0219 }
            pc0.e0 r3 = r3.yn0()     // Catch:{ all -> 0x0219 }
            pc0.i r3 = r3.f352709e     // Catch:{ all -> 0x0219 }
            if (r3 != 0) goto L_0x0185
            r14 = 1
        L_0x0185:
            if (r14 == 0) goto L_0x018a
            r2.mo180731b()     // Catch:{ all -> 0x0219 }
        L_0x018a:
            monitor-exit(r2)
            r42 = r1
            goto L_0x01cd
        L_0x018e:
            r42 = r1
            long r0 = r2.f350061c     // Catch:{ all -> 0x0219 }
            long r7 = r2.f350060b     // Catch:{ all -> 0x0215 }
            long r0 = r0 + r7
            long r5 = r5 + r3
            int r16 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r16 <= 0) goto L_0x01a0
            long r16 = r5 - r0
            long r7 = r7 + r16
            r2.f350060b = r7     // Catch:{ all -> 0x0215 }
        L_0x01a0:
            java.lang.String r7 = "MicroMsg.SyncPauser"
            java.lang.String r8 = "requestToPause currState:%s ParamTimeout:%d diff:%s newTimeout:%s %s"
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ all -> 0x0215 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0215 }
            r12[r14] = r11     // Catch:{ all -> 0x0215 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0215 }
            r12[r10] = r3     // Catch:{ all -> 0x0215 }
            long r5 = r5 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0215 }
            r12[r9] = r0     // Catch:{ all -> 0x0215 }
            long r0 = r2.f350060b     // Catch:{ all -> 0x0215 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0215 }
            r12[r13] = r0     // Catch:{ all -> 0x0215 }
            java.lang.String r0 = r2.f350062d     // Catch:{ all -> 0x0215 }
            r1 = 4
            r12[r1] = r0     // Catch:{ all -> 0x0215 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r12)     // Catch:{ all -> 0x0215 }
            monitor-exit(r2)
            r8 = r40
        L_0x01cd:
            com.tencent.mm.plugin.dbbackup.k r0 = r8.f345832a
            com.tencent.mm.plugin.dbbackup.c r1 = new com.tencent.mm.plugin.dbbackup.c
            r3 = r42
            r1.<init>(r8, r2, r3, r15)
            r0.getClass()
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r4 = "DBRecoverStarted"
            r2.<init>((java.io.File) r3, (java.lang.String) r4)
            com.tencent.mars.comm.WakerLock r3 = new com.tencent.mars.comm.WakerLock
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = "MicroMsg.SubCoreDBBackup"
            r3.<init>(r4, r5)
            com.tencent.mm.plugin.dbbackup.m r4 = new com.tencent.mm.plugin.dbbackup.m
            r4.<init>(r0, r2, r1, r3)
            java.lang.String r0 = "Database recover started."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            r3.lock()
            com.tencent.mm.plugin.report.service.n r11 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r12 = 181(0xb5, double:8.94E-322)
            r14 = 28
            r16 = 1
            r18 = 1
            r11.idkeyStat(r12, r14, r16, r18)
            r2.mo119964e()     // Catch:{ IOException -> 0x0210 }
        L_0x0210:
            r0 = -1
            r4.mo127599a(r0)
        L_0x0214:
            return r10
        L_0x0215:
            r0 = move-exception
            r8 = r40
            goto L_0x021a
        L_0x0219:
            r0 = move-exception
        L_0x021a:
            monitor-exit(r2)
            throw r0
        L_0x021c:
            int r1 = r0.length
            if (r1 > r10) goto L_0x0220
            goto L_0x025a
        L_0x0220:
            r0 = r0[r10]
            r0.getClass()
            java.lang.String r1 = "duplicated-messages"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x023a
            java.lang.String r1 = "rconv-dirty"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0237
            goto L_0x023c
        L_0x0237:
            java.lang.String r11 = "DELETE FROM rconversation WHERE typeof(flag) <> 'integer'"
            goto L_0x023c
        L_0x023a:
            java.lang.String r11 = "DELETE FROM message WHERE rowid NOT IN (SELECT max(rowid) FROM message GROUP BY talker,msgSvrId,createTime)"
        L_0x023c:
            if (r11 == 0) goto L_0x025a
            r2 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r3 = "正在执行修复"
            r1 = r41
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            zt3.t r1 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.dbbackup.b$$d r2 = new com.tencent.mm.plugin.dbbackup.b$$d
            r2.<init>(r11, r0, r15)
            zt3.j r1 = (zt3.C119157j) r1
            java.lang.String r0 = "DBCommand"
            r1.mo183876g(r2, r0)
            r14 = 1
        L_0x025a:
            return r14
        L_0x025b:
            int r1 = r0.length
            if (r1 <= r10) goto L_0x0260
            r11 = r0[r10]
        L_0x0260:
            long r16 = java.lang.System.nanoTime()
            java.lang.String r2 = r15.getString(r6)
            java.lang.String r3 = r15.getString(r5)
            r4 = 1
            r5 = 0
            r6 = 0
            r1 = r41
            qo3.i0 r0 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.dbbackup.k r7 = r8.f345832a
            com.tencent.mm.plugin.dbbackup.f r9 = new com.tencent.mm.plugin.dbbackup.f
            r1 = r9
            r2 = r40
            r3 = r0
            r4 = r16
            r6 = r41
            r1.<init>(r2, r3, r4, r6)
            int r1 = r7.yx0(r11, r9)
            if (r1 == 0) goto L_0x02a2
            if (r0 == 0) goto L_0x028f
            r0.dismiss()
        L_0x028f:
            r0 = -3
            if (r1 == r0) goto L_0x029b
            if (r1 == r12) goto L_0x0298
            r13 = 2131834502(0x7f113686, float:1.9302116E38)
            goto L_0x029b
        L_0x0298:
            r13 = 2131834505(0x7f113689, float:1.9302122E38)
        L_0x029b:
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (int) r13, (int) r10)
            r0.show()
        L_0x02a2:
            return r10
        L_0x02a3:
            r1 = -1
            r6 = 4
            r13 = 3
            f40.o r5 = f40.C86709a0.m107535s()
            java.lang.String r5 = r5.f251807e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r1 = "ctest/"
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = "EnMicroMsg.db"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r2)
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            java.lang.String r23 = ""
            java.lang.String r24 = "-journal"
            java.lang.String r25 = "-wal"
            java.lang.String r26 = ".sm"
            java.lang.String r27 = ".li"
            java.lang.String r28 = ".ini"
            java.lang.String[] r12 = new java.lang.String[]{r23, r24, r25, r26, r27, r28}
            int r3 = r0.length
            if (r3 <= r10) goto L_0x048a
            r0 = r0[r10]
            r0.getClass()
            int r3 = r0.hashCode()
            switch(r3) {
                case -2109750458: goto L_0x032a;
                case -778987502: goto L_0x031f;
                case 3095028: goto L_0x0314;
                case 1220142353: goto L_0x0309;
                case 1933703003: goto L_0x02fd;
                default: goto L_0x02fc;
            }
        L_0x02fc:
            goto L_0x0336
        L_0x02fd:
            java.lang.String r3 = "recover-test"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0307
            goto L_0x0336
        L_0x0307:
            r0 = 4
            goto L_0x0337
        L_0x0309:
            java.lang.String r3 = "make-test"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0312
            goto L_0x0336
        L_0x0312:
            r0 = 3
            goto L_0x0337
        L_0x0314:
            java.lang.String r3 = "dump"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x031d
            goto L_0x0336
        L_0x031d:
            r0 = 2
            goto L_0x0337
        L_0x031f:
            java.lang.String r3 = "clear-test"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0328
            goto L_0x0336
        L_0x0328:
            r0 = 1
            goto L_0x0337
        L_0x032a:
            java.lang.String r3 = "test-delete"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0334
            goto L_0x0336
        L_0x0334:
            r0 = 0
            goto L_0x0337
        L_0x0336:
            r0 = -1
        L_0x0337:
            java.lang.String r3 = "Corruption test database not exist."
            if (r0 == 0) goto L_0x0422
            if (r0 == r10) goto L_0x0406
            if (r0 == r9) goto L_0x03d5
            if (r0 == r13) goto L_0x0368
            if (r0 == r6) goto L_0x0345
            goto L_0x0544
        L_0x0345:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r0 != 0) goto L_0x0354
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r3, (int) r14)
            r0.show()
            goto L_0x0543
        L_0x0354:
            com.tencent.mm.plugin.dbbackup.b$$b r0 = new com.tencent.mm.plugin.dbbackup.b$$b
            r3 = r1
            r1 = r0
            r6 = r2
            r2 = r12
            r4 = r5
            r5 = r6
            r6 = r41
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r1 = "Do you really want to recover test database?\nYour current database WILL BE LOST."
            nj3.C76879j.m92750u(r15, r1, r11, r0, r11)
            goto L_0x0543
        L_0x0368:
            r3 = r1
            r6 = r2
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r0 == 0) goto L_0x037b
            java.lang.String r0 = "Corruption test database exists.\nClear or recover before creating a new one."
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r10)
            r0.show()
            goto L_0x0543
        L_0x037b:
            eb0.c r0 = eb0.C97625j3.m125812b()
            zh3.f r0 = r0.mo105909x()
            com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()
            r0.close()
            com.tencent.p014mm.vfs.C86013q1.m106461v(r6)
        L_0x038d:
            if (r14 >= r7) goto L_0x03ce
            r0 = r12[r14]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r2 = 9
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163532d(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.vfs.C86013q1.m106463x(r1, r0)
            r1 = 9
            com.tencent.p014mm.vfs.AccessControlFileSystem.m163534f(r1)
            int r14 = r14 + 1
            goto L_0x038d
        L_0x03ce:
            com.tencent.wcdb.database.SQLiteCipherSpec r0 = com.tencent.p014mm.plugin.dbbackup.C115392k.f345883j
            com.tencent.p014mm.p136ui.MMAppMgr.m85985e(r15, r10)
            goto L_0x0543
        L_0x03d5:
            f40.o r0 = f40.C86709a0.m107535s()
            java.lang.String r0 = r0.mo121148o()
            if (r0 != 0) goto L_0x03e9
            java.lang.String r0 = "没有找到损坏信息"
            java.lang.String r1 = ""
            nj3.C76879j.m92748s(r15, r0, r1)
            goto L_0x0543
        L_0x03e9:
            r2 = 0
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r3 = "正在获取损坏信息"
            r1 = r41
            qo3.i0 r1 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.dbbackup.b$$a r3 = new com.tencent.mm.plugin.dbbackup.b$$a
            r3.<init>(r0, r1, r15)
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r0 = "DBCommand"
            r2.mo183876g(r3, r0)
            goto L_0x0543
        L_0x0406:
            r6 = r2
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r0 != 0) goto L_0x0416
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r3, (int) r14)
            r0.show()
            goto L_0x0543
        L_0x0416:
            com.tencent.mm.plugin.dbbackup.b$$c r0 = new com.tencent.mm.plugin.dbbackup.b$$c
            r0.<init>(r6, r15)
            java.lang.String r1 = "Do you really want to clear test database?\nIt can't be recovered anymore."
            nj3.C76879j.m92750u(r15, r1, r11, r0, r11)
            goto L_0x0543
        L_0x0422:
            com.tencent.mm.vfs.f0 r0 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            java.util.Map r1 = r0.mo177791d()
            java.lang.String r2 = "dbProtect"
            java.lang.String r1 = com.tencent.p014mm.vfs.C116299g2.m163848d(r1, r2)
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            java.lang.String r4 = "clicfg_vfs_db_protect"
            java.lang.String r5 = "0"
            java.lang.String r3 = r3.mo58776F5(r4, r5)
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0447
            java.lang.String r3 = "lt-t-t-ttt"
            goto L_0x0449
        L_0x0447:
            java.lang.String r3 = "ll-l-l-lll"
        L_0x0449:
            com.tencent.mm.vfs.f0$b r4 = r0.mo177789b()
            r4.mo177806f(r2, r3)
            r4.mo177801a()
            com.tencent.p014mm.vfs.C116306k.f349021a = r10
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            f40.o r4 = f40.C86709a0.m107535s()
            zh3.f r4 = r4.f251811i
            java.lang.String r4 = r4.mo125620j()
            r3.append(r4)
            java.lang.String r4 = "-wal"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.vfs.C86013q1.m106447h(r3)
            com.tencent.p014mm.vfs.C116306k.f349021a = r14
            com.tencent.mm.vfs.f0$b r0 = r0.mo177789b()
            r0.mo177806f(r2, r1)
            r0.mo177801a()
            java.lang.String r0 = "Test delete EnMiroMsg.db-wal"
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r14)
            r0.show()
            goto L_0x0543
        L_0x048a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 512(0x200, float:7.175E-43)
            r0.<init>(r1)
            f40.o r1 = f40.C86709a0.m107535s()
            java.lang.String r1 = r1.mo121148o()
            java.lang.String r2 = "Corrupted DB: "
            r0.append(r2)
            if (r1 != 0) goto L_0x04a6
            java.lang.String r1 = "not exist"
            r0.append(r1)
            goto L_0x04fd
        L_0x04a6:
            java.lang.String r2 = "/ctest/"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L_0x04b2
            java.lang.String r2 = "test"
            goto L_0x04b4
        L_0x04b2:
            java.lang.String r2 = "exists"
        L_0x04b4:
            r0.append(r2)
            java.lang.String r2 = "\nCorrupted DB size: "
            r0.append(r2)
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r1)
            r0.append(r2)
            java.lang.String r2 = "\nSaved master exists: "
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = ".sm"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            r0.append(r2)
            java.lang.String r2 = "\nContent backup exists: "
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = ".bak"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            boolean r1 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            r0.append(r1)
        L_0x04fd:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r15)
            r1.setText(r0)
            r1.setGravity(r4)
            r0 = 1092616192(0x41200000, float:10.0)
            r1.setTextSize(r10, r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r3, r2)
            r1.setLayoutParams(r0)
            android.content.res.Resources r0 = r41.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r0 = r0.getColor(r2)
            r1.setTextColor(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.MONOSPACE
            r1.setTypeface(r0)
            android.text.method.ScrollingMovementMethod r0 = new android.text.method.ScrollingMovementMethod
            r0.<init>()
            r1.setMovementMethod(r0)
            android.content.res.Resources r0 = r41.getResources()
            r2 = 2131165553(0x7f070171, float:1.7945326E38)
            int r0 = r0.getDimensionPixelSize(r2)
            r1.setPadding(r0, r0, r0, r0)
            nj3.C76879j.m92746q(r15, r11, r1, r11)
        L_0x0543:
            r14 = 1
        L_0x0544:
            return r14
        L_0x0545:
            r13 = 3
            java.lang.String r0 = ""
            int r1 = com.tencent.wcdb.database.SQLiteDebug.getLastErrorLine()
            java.util.ArrayList r2 = com.tencent.wcdb.database.SQLiteDebug.getLastIOTraceStats()
            if (r2 == 0) goto L_0x060f
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x055a
            goto L_0x060f
        L_0x055a:
            java.lang.Object r2 = r2.get(r14)
            com.tencent.wcdb.database.SQLiteDebug$IOTraceStats r2 = (com.tencent.wcdb.database.SQLiteDebug.IOTraceStats) r2
            eb0.c r3 = eb0.C97625j3.m125812b()     // Catch:{ Exception -> 0x0589 }
            int r3 = r3.mo105881G()     // Catch:{ Exception -> 0x0589 }
            java.lang.String r5 = p156gj.C87203t.m108270f(r10)     // Catch:{ Exception -> 0x0589 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0589 }
            r6.<init>()     // Catch:{ Exception -> 0x0589 }
            r6.append(r5)     // Catch:{ Exception -> 0x0589 }
            r6.append(r3)     // Catch:{ Exception -> 0x0589 }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x0589 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x0589 }
            java.lang.String r3 = p823sg.C90193h.m112878f(r3)     // Catch:{ Exception -> 0x0589 }
            r5 = 7
            java.lang.String r3 = r3.substring(r14, r5)     // Catch:{ Exception -> 0x0589 }
            goto L_0x058b
        L_0x0589:
            r3 = r0
        L_0x058b:
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5[r14] = r1
            r5[r10] = r3
            java.lang.String r1 = r2.toString()
            r5[r9] = r1
            java.lang.String r1 = "DB corrupted (line: %d, hash: %s) => %s"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            byte[] r3 = r2.lastReadPage
            if (r3 == 0) goto L_0x05aa
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r14)
            goto L_0x05ab
        L_0x05aa:
            r3 = r0
        L_0x05ab:
            byte[] r2 = r2.lastJournalReadPage
            if (r2 == 0) goto L_0x05b3
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r14)
        L_0x05b3:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r5 = "lastReadPage"
            r2.put(r5, r3)
            java.lang.String r3 = "lastJournalReadPage"
            r2.put(r3, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.String r3 = "DBCorrupt"
            r0.mo160135k(r3, r1, r2)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r15)
            r0.setText(r1)
            r0.setGravity(r4)
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r10, r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r1.<init>(r3, r2)
            r0.setLayoutParams(r1)
            android.content.res.Resources r1 = r41.getResources()
            r2 = 2131099800(0x7f060098, float:1.7811963E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.MONOSPACE
            r0.setTypeface(r1)
            android.text.method.ScrollingMovementMethod r1 = new android.text.method.ScrollingMovementMethod
            r1.<init>()
            r0.setMovementMethod(r1)
            android.content.res.Resources r1 = r41.getResources()
            r2 = 2131165553(0x7f070171, float:1.7945326E38)
            int r1 = r1.getDimensionPixelSize(r2)
            r0.setPadding(r1, r1, r1, r1)
            nj3.C76879j.m92746q(r15, r11, r0, r11)
        L_0x060f:
            return r10
        L_0x0610:
            int r1 = r0.length
            if (r1 <= r10) goto L_0x064d
            r1 = r0[r10]
            java.lang.String r2 = "test-cancel"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0643
            boolean r0 = q41.C101028a.f295816g
            r0 = r0 ^ r10
            q41.C101028a.f295816g = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r0 == 0) goto L_0x062d
            java.lang.String r0 = "Set"
            goto L_0x062f
        L_0x062d:
            java.lang.String r0 = "Unset"
        L_0x062f:
            r1.append(r0)
            java.lang.String r0 = " leaf backup cancel test."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = android.widget.Toast.makeText(r15, r0, r14)
            r0.show()
            goto L_0x0675
        L_0x0643:
            r0 = r0[r10]
            r4 = 0
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r0, r4)
            r12 = r5
            goto L_0x0650
        L_0x064d:
            r4 = 0
            r12 = r4
        L_0x0650:
            com.tencent.wcdb.support.CancellationSignal r0 = new com.tencent.wcdb.support.CancellationSignal
            r0.<init>()
            r4 = 1
            r5 = 1
            com.tencent.mm.plugin.dbbackup.b$$e r6 = new com.tencent.mm.plugin.dbbackup.b$$e
            r6.<init>(r0)
            java.lang.String r2 = ""
            java.lang.String r3 = "Scanning database pages"
            r1 = r41
            qo3.i0 r1 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            zt3.t r2 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.dbbackup.b$$f r3 = new com.tencent.mm.plugin.dbbackup.b$$f
            r3.<init>(r0, r1, r15)
            zt3.j r2 = (zt3.C119157j) r2
            r2.getClass()
            r2.mo183889t(r3, r12, r11)
        L_0x0675:
            return r10
        L_0x0676:
            com.tencent.mm.plugin.dbbackup.k r0 = r8.f345832a
            eb0.c r1 = eb0.C97625j3.m125812b()
            r0.wx0(r1)
            java.lang.String r0 = "Post recovery cleanup done."
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r14)
            r0.show()
            return r10
        L_0x0689:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            int r2 = r0.length
            r3 = 89
            if (r2 <= r10) goto L_0x06c9
            r0 = r0[r10]     // Catch:{ NumberFormatException -> 0x06c6 }
            java.lang.Integer r0 = java.lang.Integer.decode(r0)     // Catch:{ NumberFormatException -> 0x06c6 }
            int r0 = r0.intValue()     // Catch:{ NumberFormatException -> 0x06c6 }
            if (r0 > r9) goto L_0x06c0
            if (r0 < 0) goto L_0x06c0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x06c6 }
            r1.mo119676J(r3, r2)     // Catch:{ NumberFormatException -> 0x06c6 }
            r1.mo119681a(r10)     // Catch:{ NumberFormatException -> 0x06c6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x06c6 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x06c6 }
            java.lang.String r2 = "Recovery status set to "
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x06c6 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x06c6 }
            java.lang.String r0 = r1.toString()     // Catch:{ NumberFormatException -> 0x06c6 }
            goto L_0x06de
        L_0x06c0:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x06c6 }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x06c6 }
            throw r0     // Catch:{ NumberFormatException -> 0x06c6 }
        L_0x06c6:
            java.lang.String r0 = "Recovery status must be 0, 1 or 2"
            goto L_0x06de
        L_0x06c9:
            int r0 = r1.mo119688i(r3, r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Recovery status is "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x06de:
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r14)
            r0.show()
            return r10
        L_0x06e6:
            r3 = -1
            r4 = 0
            r6 = 4
            r12 = 5
            r13 = 3
            int r1 = r0.length
            if (r1 <= r10) goto L_0x07aa
            r1 = r0[r10]
            java.lang.String r2 = "cipher"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x07aa
            eb0.c r1 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r1 = r1.mo105906u()
            int r2 = r0.length
            r4 = 237571(0x3a003, float:3.32908E-40)
            if (r2 <= r9) goto L_0x0787
            r0 = r0[r9]
            r0.getClass()
            int r2 = r0.hashCode()
            r5 = 48
            if (r2 == r5) goto L_0x0763
            r5 = 49
            if (r2 == r5) goto L_0x0758
            r5 = 3521(0xdc1, float:4.934E-42)
            if (r2 == r5) goto L_0x074d
            r5 = 3551(0xddf, float:4.976E-42)
            if (r2 == r5) goto L_0x0742
            r5 = 109935(0x1ad6f, float:1.54052E-40)
            if (r2 == r5) goto L_0x0737
            r5 = 119527(0x1d2e7, float:1.67493E-40)
            if (r2 == r5) goto L_0x072b
            goto L_0x076d
        L_0x072b:
            java.lang.String r2 = "yes"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0735
            goto L_0x076d
        L_0x0735:
            r3 = 5
            goto L_0x076d
        L_0x0737:
            java.lang.String r2 = "off"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0740
            goto L_0x076d
        L_0x0740:
            r3 = 4
            goto L_0x076d
        L_0x0742:
            java.lang.String r2 = "on"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x074b
            goto L_0x076d
        L_0x074b:
            r3 = 3
            goto L_0x076d
        L_0x074d:
            java.lang.String r2 = "no"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0756
            goto L_0x076d
        L_0x0756:
            r3 = 2
            goto L_0x076d
        L_0x0758:
            java.lang.String r2 = "1"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0761
            goto L_0x076d
        L_0x0761:
            r3 = 1
            goto L_0x076d
        L_0x0763:
            java.lang.String r2 = "0"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x076c
            goto L_0x076d
        L_0x076c:
            r3 = 0
        L_0x076d:
            if (r3 == 0) goto L_0x0781
            if (r3 == r10) goto L_0x077a
            if (r3 == r9) goto L_0x0781
            if (r3 == r13) goto L_0x077a
            if (r3 == r6) goto L_0x0781
            if (r3 == r12) goto L_0x077a
            goto L_0x0787
        L_0x077a:
            r1.mo119679M(r4, r14)
            r1.mo119681a(r10)
            goto L_0x0787
        L_0x0781:
            r1.mo119679M(r4, r10)
            r1.mo119681a(r10)
        L_0x0787:
            int r0 = r1.mo119688i(r4, r14)
            if (r0 != 0) goto L_0x078f
            r0 = 1
            goto L_0x0790
        L_0x078f:
            r0 = 0
        L_0x0790:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Database backup with cipher: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r15, (java.lang.CharSequence) r0, (int) r14)
            r0.show()
            goto L_0x0ac9
        L_0x07aa:
            int r1 = r0.length
            if (r1 <= r10) goto L_0x07b9
            r0 = r0[r10]
            java.lang.String r1 = "incremental"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x07b9
            r0 = 1
            goto L_0x07ba
        L_0x07b9:
            r0 = 0
        L_0x07ba:
            long r17 = java.lang.System.nanoTime()
            r19 = 1
            r20 = 0
            r21 = 0
            java.lang.String r2 = "Database Backup"
            java.lang.String r3 = "Backing database up. Please wait..."
            r1 = r41
            r23 = r4
            r4 = r19
            r5 = r20
            r12 = 4
            r6 = r21
            qo3.i0 r19 = nj3.C76879j.m92723Q(r1, r2, r3, r4, r5, r6)
            com.tencent.mm.plugin.dbbackup.k r5 = r8.f345832a
            com.tencent.mm.plugin.dbbackup.d r27 = new com.tencent.mm.plugin.dbbackup.d
            r1 = r27
            r2 = r40
            r3 = r19
            r4 = r0
            r13 = r5
            r5 = r17
            r17 = 6
            r7 = r41
            r1.<init>(r2, r3, r4, r5, r7)
            boolean r1 = r13.f345887g
            java.lang.String r2 = "MicroMsg.SubCoreDBBackup"
            if (r1 == 0) goto L_0x07ff
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "backup"
            r0[r14] = r1
            java.lang.String r1 = "Backup or recover task is in progress, %s canceled"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r1, r0)
            goto L_0x0ab6
        L_0x07ff:
            eb0.c r28 = eb0.C97625j3.m125812b()
            java.lang.String r1 = r28.mo105900o()
            zh3.f r3 = r28.mo105909x()
            com.tencent.wcdb.database.SQLiteDatabase r3 = r3.mo125615f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = ".bak"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r6 = ".tmp"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r1)
            java.lang.String r9 = ".sm"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r6)
            java.lang.String r32 = r9.toString()
            if (r0 == 0) goto L_0x0863
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r6 == 0) goto L_0x0862
            com.tencent.p014mm.vfs.C86013q1.m106442c(r4, r5)
            r6 = 24
            r6 = r0
            r9 = 24
            goto L_0x0866
        L_0x0862:
            r0 = 0
        L_0x0863:
            r6 = r0
            r9 = 8
        L_0x0866:
            com.tencent.wcdb.database.SQLiteDatabase$CursorFactory r0 = com.tencent.wcdb.database.SQLiteDirectCursor.FACTORY
            java.lang.String r10 = "SELECT max(msgId) FROM message;"
            com.tencent.wcdb.Cursor r10 = r3.rawQueryWithFactory(r0, r10, r11, r11)
            boolean r25 = r10.moveToFirst()
            r29 = -1
            if (r25 == 0) goto L_0x087b
            long r25 = r10.getLong(r14)
            goto L_0x087d
        L_0x087b:
            r25 = r29
        L_0x087d:
            r10.close()
            java.lang.String r10 = "SELECT max(id) FROM ImgInfo2;"
            com.tencent.wcdb.Cursor r10 = r3.rawQueryWithFactory(r0, r10, r11, r11)
            boolean r31 = r10.moveToFirst()
            if (r31 == 0) goto L_0x0891
            long r33 = r10.getLong(r14)
            goto L_0x0893
        L_0x0891:
            r33 = r29
        L_0x0893:
            r10.close()
            java.lang.String r10 = "SELECT max(rowid) FROM videoinfo2;"
            com.tencent.wcdb.Cursor r10 = r3.rawQueryWithFactory(r0, r10, r11, r11)
            boolean r31 = r10.moveToFirst()
            if (r31 == 0) goto L_0x08a7
            long r35 = r10.getLong(r14)
            goto L_0x08a9
        L_0x08a7:
            r35 = r29
        L_0x08a9:
            r10.close()
            java.lang.String r10 = "SELECT max(rowid) FROM EmojiInfo;"
            com.tencent.wcdb.Cursor r0 = r3.rawQueryWithFactory(r0, r10, r11, r11)
            boolean r10 = r0.moveToFirst()
            if (r10 == 0) goto L_0x08bc
            long r29 = r0.getLong(r14)
        L_0x08bc:
            r0.close()
            long[] r10 = new long[r12]
            r10[r14] = r25
            r22 = 1
            r10[r22] = r33
            r18 = 2
            r10[r18] = r35
            r21 = 3
            r10[r21] = r29
            if (r6 == 0) goto L_0x0957
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            com.tencent.mm.vfs.t1 r0 = new com.tencent.mm.vfs.t1     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            r14.<init>()     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            r14.append(r1)     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            java.lang.String r12 = ".bcur"
            r14.append(r12)     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            java.lang.String r12 = r14.toString()     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            r0.<init>((java.lang.String) r12)     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0939, all -> 0x0936 }
            java.lang.String r0 = r11.readLine()     // Catch:{ Exception -> 0x0934 }
            if (r0 == 0) goto L_0x08f7
            long r29 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0934 }
            goto L_0x08f9
        L_0x08f7:
            r29 = r23
        L_0x08f9:
            java.lang.String r0 = r11.readLine()     // Catch:{ Exception -> 0x0934 }
            if (r0 == 0) goto L_0x0904
            long r33 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0934 }
            goto L_0x0906
        L_0x0904:
            r33 = r23
        L_0x0906:
            java.lang.String r0 = r11.readLine()     // Catch:{ Exception -> 0x0934 }
            if (r0 == 0) goto L_0x0911
            long r35 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0934 }
            goto L_0x0913
        L_0x0911:
            r35 = r23
        L_0x0913:
            java.lang.String r0 = r11.readLine()     // Catch:{ Exception -> 0x0934 }
            if (r0 == 0) goto L_0x091d
            long r23 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0934 }
        L_0x091d:
            r12 = 4
            long[] r0 = new long[r12]     // Catch:{ Exception -> 0x0934 }
            r12 = 0
            r0[r12] = r29     // Catch:{ Exception -> 0x0934 }
            r12 = 1
            r0[r12] = r33     // Catch:{ Exception -> 0x0934 }
            r12 = 2
            r0[r12] = r35     // Catch:{ Exception -> 0x0934 }
            r12 = 3
            r0[r12] = r23     // Catch:{ Exception -> 0x0934 }
            r11.close()     // Catch:{ IOException -> 0x0930 }
            goto L_0x0931
        L_0x0930:
        L_0x0931:
            r42 = r6
            goto L_0x095a
        L_0x0934:
            r0 = move-exception
            goto L_0x093b
        L_0x0936:
            r0 = move-exception
            r11 = 0
            goto L_0x0951
        L_0x0939:
            r0 = move-exception
            r11 = 0
        L_0x093b:
            java.lang.String r12 = "Failed to read previous cursor '%s'"
            r42 = r6
            r14 = 1
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x0950 }
            r14 = 0
            r6[r14] = r1     // Catch:{ all -> 0x0950 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r12, r6)     // Catch:{ all -> 0x0950 }
            if (r11 == 0) goto L_0x0959
            r11.close()     // Catch:{ IOException -> 0x094e }
            goto L_0x0959
        L_0x094e:
            goto L_0x0959
        L_0x0950:
            r0 = move-exception
        L_0x0951:
            if (r11 == 0) goto L_0x0956
            r11.close()     // Catch:{ IOException -> 0x0956 }
        L_0x0956:
            throw r0
        L_0x0957:
            r42 = r6
        L_0x0959:
            r0 = 0
        L_0x095a:
            java.lang.String r2 = "rconversation"
            java.lang.String r6 = "conversation"
            java.lang.String r11 = "EmojiInfo"
            java.lang.String r12 = "videoinfo2"
            java.lang.String r14 = "ImgInfo2"
            java.lang.String r23 = "message"
            r8 = 12
            if (r0 == 0) goto L_0x0a05
            int r15 = r0.length
            r24 = r4
            r4 = 4
            if (r15 < r4) goto L_0x0a07
            java.lang.String[] r4 = new java.lang.String[r8]
            r8 = 0
            r4[r8] = r23
            r34 = r5
            r15 = 2
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r29 = r0[r8]
            java.lang.Long r18 = java.lang.Long.valueOf(r29)
            r5[r8] = r18
            r29 = r10[r8]
            java.lang.Long r18 = java.lang.Long.valueOf(r29)
            r22 = 1
            r5[r22] = r18
            java.lang.String r8 = "msgId > %d AND msgId <= %d"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            r4[r22] = r5
            r4[r15] = r14
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r29 = r0[r22]
            java.lang.Long r8 = java.lang.Long.valueOf(r29)
            r14 = 0
            r5[r14] = r8
            r29 = r10[r22]
            java.lang.Long r8 = java.lang.Long.valueOf(r29)
            r5[r22] = r8
            java.lang.String r8 = "id > %d AND id <= %d"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            r8 = 3
            r4[r8] = r5
            r5 = 4
            r4[r5] = r12
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r29 = r0[r15]
            java.lang.Long r8 = java.lang.Long.valueOf(r29)
            r5[r14] = r8
            r29 = r10[r15]
            java.lang.Long r8 = java.lang.Long.valueOf(r29)
            r5[r22] = r8
            java.lang.String r8 = "rowid > %d AND rowid <= %d"
            java.lang.String r5 = java.lang.String.format(r8, r5)
            r12 = 5
            r4[r12] = r5
            r4[r17] = r11
            java.lang.Object[] r5 = new java.lang.Object[r15]
            r11 = 3
            r17 = r0[r11]
            java.lang.Long r12 = java.lang.Long.valueOf(r17)
            r5[r14] = r12
            r11 = r10[r11]
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r5[r22] = r11
            java.lang.String r5 = java.lang.String.format(r8, r5)
            r8 = 7
            r4[r8] = r5
            r5 = 8
            r4[r5] = r6
            r5 = 9
            r6 = 0
            r4[r5] = r6
            r5 = 10
            r4[r5] = r2
            r2 = 11
            r4[r2] = r6
            r23 = r0
            r5 = r1
            goto L_0x0a84
        L_0x0a05:
            r24 = r4
        L_0x0a07:
            r34 = r5
            java.lang.String[] r4 = new java.lang.String[r8]
            r5 = 0
            r4[r5] = r23
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "msgId <= "
            r8.append(r15)
            r23 = r0
            r15 = r1
            r0 = r10[r5]
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r1 = 1
            r4[r1] = r0
            r5 = 2
            r4[r5] = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "id <= "
            r0.append(r5)
            r5 = r15
            r14 = r10[r1]
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r1 = 3
            r4[r1] = r0
            r1 = 4
            r4[r1] = r12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "rowid <= "
            r0.append(r1)
            r8 = 2
            r14 = r10[r8]
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            r8 = 5
            r4[r8] = r0
            r4[r17] = r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r1 = 3
            r11 = r10[r1]
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            r1 = 7
            r4[r1] = r0
            r1 = 8
            r4[r1] = r6
            r1 = 9
            r6 = 0
            r4[r1] = r6
            r1 = 10
            r4[r1] = r2
            r1 = 11
            r4[r1] = r6
        L_0x0a84:
            r38 = r4
            if (r23 != 0) goto L_0x0a8b
            r30 = 0
            goto L_0x0a8d
        L_0x0a8b:
            r30 = r42
        L_0x0a8d:
            boolean r0 = r13.f345888h
            if (r0 == 0) goto L_0x0a96
            r0 = r9 | 3
            r37 = r0
            goto L_0x0a98
        L_0x0a96:
            r37 = r9
        L_0x0a98:
            com.tencent.mm.plugin.dbbackup.j r0 = new com.tencent.mm.plugin.dbbackup.j
            r25 = r0
            r26 = r13
            r29 = r7
            r31 = r3
            r33 = r5
            r35 = r23
            r36 = r10
            r39 = r24
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r1 = 1
            r13.f345887g = r1
            java.lang.String r1 = "DB Backup"
            com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r1)
            r14 = 1
        L_0x0ab6:
            if (r14 != 0) goto L_0x0ac9
            if (r19 == 0) goto L_0x0abd
            r19.dismiss()
        L_0x0abd:
            java.lang.String r0 = "Database is busy."
            r1 = r41
            r2 = 0
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r1, (java.lang.CharSequence) r0, (int) r2)
            r0.show()
        L_0x0ac9:
            r3 = 1
            return r3
        L_0x0acb:
            r1 = r15
            r2 = 0
            r3 = 1
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.dbbackup.DBRecoveryUI> r4 = com.tencent.p014mm.plugin.dbbackup.DBRecoveryUI.class
            r0.<init>(r1, r4)
            java.lang.String r4 = "scene"
            r5 = 2
            r0.putExtra(r4, r5)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r4)
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r0)
            java.lang.Object[] r10 = r4.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/dbbackup/DBCommand"
            java.lang.String r12 = "newRecover"
            java.lang.String r13 = "(Landroid/content/Context;[Ljava/lang/String;)Z"
            java.lang.String r14 = "Undefined"
            java.lang.String r15 = "startActivity"
            java.lang.String r16 = "(Landroid/content/Intent;)V"
            r9 = r41
            r8 = 1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r4.mo10231a(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/dbbackup/DBCommand"
            java.lang.String r3 = "newRecover"
            java.lang.String r4 = "(Landroid/content/Context;[Ljava/lang/String;)Z"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "startActivity"
            java.lang.String r7 = "(Landroid/content/Intent;)V"
            r1 = r41
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.dbbackup.C115381b.mo38a(android.content.Context, java.lang.String[], java.lang.String):boolean");
    }
}
