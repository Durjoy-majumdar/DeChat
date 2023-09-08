package com.tencent.p014mm.plugin.dbbackup;

import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.wcdb.repair.DBDumpUtil;

/* renamed from: com.tencent.mm.plugin.dbbackup.l */
public class C93096l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C86009m1 f268217d;

    /* renamed from: e */
    public final /* synthetic */ String f268218e;

    /* renamed from: f */
    public final /* synthetic */ C93095a f268219f;

    /* renamed from: com.tencent.mm.plugin.dbbackup.l$a */
    public class C93097a implements DBDumpUtil.ExecuteSqlCallback {

        /* renamed from: a */
        public final /* synthetic */ int[] f268220a;

        public C93097a(C93096l lVar, int[] iArr) {
            this.f268220a = iArr;
        }

        public String preExecute(String str) {
            int[] iArr = this.f268220a;
            iArr[0] = iArr[0] + 1;
            return null;
        }
    }

    public C93096l(C115392k kVar, C86009m1 m1Var, String str, C93095a aVar) {
        this.f268217d = m1Var;
        this.f268218e = str;
        this.f268219f = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r24 = this;
            r0 = r24
            r1 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0008 }
            goto L_0x0009
        L_0x0008:
        L_0x0009:
            eb0.c r1 = eb0.C97625j3.m125812b()
            java.lang.String r1 = r1.mo105901p()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            com.tencent.mm.vfs.m1 r3 = r0.f268217d
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = ".db"
            java.lang.String r5 = "temp.db"
            java.lang.String r3 = r3.replace(r4, r5)
            r2.append(r3)
            java.lang.String r5 = r2.toString()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r12 = 0
            r3[r12] = r5
            java.lang.String r13 = "MicroMsg.SubCoreDBBackup"
            java.lang.String r4 = "temp db path is %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r4, r3)
            com.tencent.mm.vfs.m1 r3 = r0.f268217d
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r5)
            r6 = 0
            java.lang.String r7 = r4.getPath()
            if (r7 == 0) goto L_0x0064
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r12, r12)
            java.lang.String r8 = r4.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0064
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r7)
            android.net.Uri r4 = r4.build()
        L_0x0064:
            com.tencent.mm.vfs.f0$h r3 = r3.mo119989z()
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r4 = r7.mo177799l(r4, r6)
            boolean r6 = r3.mo177810a()
            if (r6 == 0) goto L_0x0088
            boolean r6 = r4.mo177810a()
            if (r6 != 0) goto L_0x007b
            goto L_0x0088
        L_0x007b:
            com.tencent.mm.vfs.FileSystem$c r6 = r4.f348991a     // Catch:{ IOException -> 0x0087 }
            java.lang.String r4 = r4.f348992b     // Catch:{ IOException -> 0x0087 }
            com.tencent.mm.vfs.FileSystem$c r7 = r3.f348991a     // Catch:{ IOException -> 0x0087 }
            java.lang.String r3 = r3.f348992b     // Catch:{ IOException -> 0x0087 }
            r6.mo119946t(r4, r7, r3)     // Catch:{ IOException -> 0x0087 }
            goto L_0x0088
        L_0x0087:
        L_0x0088:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "sqlTemp.sql"
            r3.append(r1)
            java.lang.String r7 = r3.toString()
            java.lang.String r14 = "getcontactinfo"
            java.lang.String r15 = "contact"
            java.lang.String r16 = "contact_ext"
            java.lang.String r17 = "ContactCmdBuf"
            java.lang.String r18 = "rcontact"
            java.lang.String r19 = "img_flag"
            java.lang.String r20 = "userinfo"
            java.lang.String[] r1 = new java.lang.String[]{r14, r15, r16, r17, r18, r19, r20}
            java.util.List r8 = java.util.Arrays.asList(r1)
            int[] r1 = new int[r2]
            long r14 = java.lang.System.currentTimeMillis()
            eb0.c r3 = eb0.C97625j3.m125812b()
            zh3.f r3 = r3.mo105909x()
            java.lang.String r6 = r0.f268218e
            r9 = 0
            com.tencent.mm.plugin.dbbackup.l$a r10 = new com.tencent.mm.plugin.dbbackup.l$a
            r10.<init>(r0, r1)
            r11 = 1
            boolean r4 = r3.mo125628r()
            if (r4 != 0) goto L_0x00e0
            java.lang.String r3 = r3.f262814a
            java.lang.Object[] r4 = new java.lang.Object[r2]
            com.tencent.mm.sdk.platformtools.MMStack r5 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r4[r12] = r5
            java.lang.String r5 = "DB IS CLOSED ! {%s}"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r5, r4)
            r3 = 0
            goto L_0x00e8
        L_0x00e0:
            zh3.e r3 = r3.f262815b
            com.tencent.wcdb.database.SQLiteDatabase r4 = r3.f356742a
            boolean r3 = com.tencent.wcdb.repair.DBDumpUtil.doRecoveryDb(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00e8:
            if (r3 == 0) goto L_0x0134
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            r4.getClass()
            f40.C86709a0.m107528h()
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r6 = 348167(0x55007, float:4.87886E-40)
            r4.mo119676J(r6, r5)
            eb0.c r4 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v3 r4 = r4.mo105908w()
            com.tencent.mm.storage.i2 r4 = (com.tencent.p014mm.storage.C44660i2) r4
            r4.mo69758c0()
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            r4.getClass()
            eb0.c r4 = eb0.C97625j3.m125812b()
            g62.l r4 = r4.mo105911z()
            com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
            r4.zy0()
            r4 = 12
            goto L_0x0136
        L_0x0134:
            r4 = 15
        L_0x0136:
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r17 = 181(0xb5, double:8.94E-322)
            long r6 = (long) r4
            r21 = 1
            r23 = 1
            r16 = r5
            r19 = r6
            r16.idkeyStat(r17, r19, r21, r23)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r14
            r4 = 2
            java.lang.Object[] r8 = new java.lang.Object[r4]
            r9 = r1[r12]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r12] = r9
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r8[r2] = r9
            java.lang.String r9 = "execute %d sql and last %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r9, r8)
            r8 = 11224(0x2bd8, float:1.5728E-41)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r9[r12] = r10
            r9[r2] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r9[r4] = r1
            r5.mo160131h(r8, r9)
            com.tencent.mm.sdk.platformtools.MMHandlerThread r1 = f40.C86709a0.m107525e()
            r1.setLowPriority()
            com.tencent.mm.plugin.dbbackup.a r1 = r0.f268219f
            if (r1 == 0) goto L_0x0189
            if (r3 == 0) goto L_0x0185
            goto L_0x0186
        L_0x0185:
            r12 = -1
        L_0x0186:
            r1.mo127599a(r12)
        L_0x0189:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.dbbackup.C93096l.run():void");
    }
}
