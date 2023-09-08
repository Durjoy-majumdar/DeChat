package wy0;

import android.content.ContentValues;
import com.tencent.p014mm.plugin.appbrand.appstorage.ZipJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import com.tencent.wcdb.database.SQLiteDatabase;
import f40.C86709a0;
import gy3.C87412m;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import yy0.C102971b;
import zt3.C119157j;

/* renamed from: wy0.l */
public final class C102520l {

    /* renamed from: a */
    public static final C102520l f301871a = new C102520l();

    /* renamed from: b */
    public static final C102971b f301872b;

    /* renamed from: wy0.l$a */
    public static final class C102521a<V> implements Callable {

        /* renamed from: d */
        public final /* synthetic */ long f301873d;

        /* renamed from: e */
        public final /* synthetic */ String f301874e;

        /* renamed from: f */
        public final /* synthetic */ String f301875f;

        /* renamed from: g */
        public final /* synthetic */ String f301876g;

        /* renamed from: h */
        public final /* synthetic */ long f301877h;

        public C102521a(long j, String str, String str2, String str3, long j2) {
            this.f301873d = j;
            this.f301874e = str;
            this.f301875f = str2;
            this.f301876g = str3;
            this.f301877h = j2;
        }

        public Object call() {
            Log.m105924i("MicroMsg.DuplicateFileLinkifyLogic", "migrateFromDownload2Attachment, rowid=" + this.f301873d + ", filePath=" + this.f301874e + ", newAttachmentName = " + this.f301875f + ", indexFileName = " + this.f301876g);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f301874e);
            sb.append("_backup");
            String sb4 = sb.toString();
            MultiProcessMMKV.getDefault().putBoolean("DownloadMigrationError", true);
            C102971b bVar = C102520l.f301872b;
            String str = this.f301874e;
            String str2 = this.f301875f;
            long j = this.f301873d;
            long j2 = this.f301877h;
            SQLiteDatabase f = bVar.f303871d.mo125615f();
            ContentValues contentValues = new ContentValues();
            contentValues.put("originalPath", str);
            contentValues.put("targetPath", str2);
            contentValues.put("status", 0);
            contentValues.put("indexRowId", Long.valueOf(j));
            contentValues.put("msgId", Long.valueOf(j2));
            long insert = f.insert("WxFileIndexDownloadMigration", "id", contentValues);
            if (C86013q1.m106443d(this.f301874e, sb4, false) < 0) {
                return -101;
            }
            bVar.mo142706vP(insert, 1);
            if (!C86013q1.m106463x(sb4, this.f301875f)) {
                return -102;
            }
            bVar.mo142706vP(insert, 2);
            try {
                C86709a0.m107535s().f251811i.mo125615f().execSQL("UPDATE appattach SET fileFullPath=? WHERE msgInfoId=?", new Object[]{this.f301875f, Long.valueOf(this.f301877h)});
                bVar.mo142706vP(insert, 3);
                C102506a.f301832a.mo142120e().mo142686CP(this.f301873d, this.f301876g);
                bVar.mo142706vP(insert, 4);
                if (!C86013q1.m106447h(this.f301874e)) {
                    return Integer.valueOf(ZipJNI.UNZ_CRCERROR);
                }
                bVar.mo142706vP(insert, 200);
                MultiProcessMMKV.getDefault().putBoolean("DownloadMigrationError", false);
                return 200;
            } catch (Exception unused) {
                return -103;
            }
        }
    }

    static {
        C102971b e = C102506a.f301832a.mo142120e();
        C87412m.m108593f(e, "CalcWxNewService.wxFileIndexStorage");
        f301872b = e;
    }

    /* renamed from: a */
    public final void mo142134a() {
        try {
            f301872b.f303871d.mo125615f().execSQL("DELETE FROM WxFileIndexDownloadMigration WHERE status = ?", new Object[]{200});
        } catch (Throwable th) {
            throw new RuntimeException("deleteOldLinkify failed : " + th.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo142135b() {
        try {
            f301872b.f303871d.mo125615f().execSQL("DELETE FROM WxFileIndexLinkify WHERE status = ? OR status = ? OR status = ? OR status = ?", new Object[]{0, 10, 5, 13});
        } catch (Throwable th) {
            throw new RuntimeException("deleteOldLinkify failed : " + th.getMessage());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo142136c(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            java.lang.String r0 = "MicroMsg.DuplicateFileLinkifyLogic"
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0026
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106447h(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = "[LINKIFY_STATUS_COPY_LINK_DONE], deleteBackupFileRet = "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            if (r5 != 0) goto L_0x0026
            r5 = 0
            goto L_0x0027
        L_0x0026:
            r5 = 1
        L_0x0027:
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r7)
            if (r6 == 0) goto L_0x0049
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106447h(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r3 = "[LINKIFY_STATUS_COPY_LINK_DONE], deleteLinkFileRet = "
            r7.append(r3)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            if (r6 != 0) goto L_0x0049
            r6 = 0
            goto L_0x004a
        L_0x0049:
            r6 = 1
        L_0x004a:
            if (r5 == 0) goto L_0x004f
            if (r6 == 0) goto L_0x004f
            r1 = 1
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.C102520l.mo142136c(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        if (z04.C112551y.m153819s(r15, "/data", false) == false) goto L_0x0073;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo142137d(java.lang.String r24, java.lang.String r25, boolean r26) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            java.lang.String r2 = "originalFilePath"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "targetFilePath"
            gy3.C87412m.m108594g(r1, r2)
            com.tencent.mm.vfs.b0 r2 = com.tencent.p014mm.vfs.C86013q1.m106453n(r25)
            boolean r3 = gy3.C87412m.m108589b(r24, r25)
            r4 = -1
            r5 = 6
            r6 = 26980(0x6964, float:3.7807E-41)
            java.lang.String r7 = "MicroMsg.DuplicateFileLinkifyLogic"
            r8 = 5
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            r13 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)
            if (r3 == 0) goto L_0x0048
            kj2.d r2 = kj2.C117407d.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r13] = r4
            r3[r12] = r14
            r3[r11] = r14
            r3[r10] = r0
            r3[r9] = r1
            r3[r8] = r14
            r2.mo160131h(r6, r3)
            java.lang.String r0 = "produceLinkFile originalFilePath == targetFilePath, return 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            return r12
        L_0x0048:
            java.lang.String r3 = com.tencent.p014mm.vfs.C45113r1.m49957b(r0, r12)
            java.lang.String r15 = com.tencent.p014mm.vfs.C45113r1.m49957b(r1, r12)
            boolean r16 = gy3.C87412m.m108589b(r3, r15)
            if (r16 == 0) goto L_0x0057
            return r11
        L_0x0057:
            if (r26 == 0) goto L_0x0074
            java.lang.String r4 = "realOriPath"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r4 = "/data"
            boolean r3 = z04.C112551y.m153819s(r3, r4, r13)
            if (r3 == 0) goto L_0x0073
            java.lang.String r3 = "realTarPath"
            gy3.C87412m.m108593f(r15, r3)
            boolean r3 = z04.C112551y.m153819s(r15, r4, r13)
            if (r3 != 0) goto L_0x0074
        L_0x0073:
            return r10
        L_0x0074:
            r3 = -2
            java.lang.String r4 = ", targetFilePath = "
            if (r2 != 0) goto L_0x00ab
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r15 = "fe is null, originalFilePath = "
            r2.append(r15)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            kj2.d r2 = kj2.C117407d.INSTANCE
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r13] = r3
            r4[r12] = r14
            r4[r11] = r14
            r4[r10] = r0
            r4[r9] = r1
            r4[r8] = r14
            r2.mo160131h(r6, r4)
            return r9
        L_0x00ab:
            boolean r5 = r2.f250476f
            if (r5 != 0) goto L_0x0349
            long r5 = r2.f250473c
            r14 = 16384(0x4000, double:8.0948E-320)
            int r17 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r17 >= 0) goto L_0x00b9
            goto L_0x0349
        L_0x00b9:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r6 = "LinkifyError"
            r5.putBoolean(r6, r12)
            boolean r5 = r2 instanceof com.tencent.p014mm.vfs.C116326t0
            java.lang.String r14 = ", deleteTargetRet = "
            java.lang.String r15 = "deleteTarget failed, originalFilePath = "
            java.lang.String r3 = ", copyBackupRet = "
            java.lang.String r8 = "copyBackup failed, originalFilePath = "
            java.lang.String r9 = ", id = "
            java.lang.String r10 = "insertLinkify failed, originalFilePath = "
            java.lang.String r11 = "_link"
            r18 = 0
            if (r5 == 0) goto L_0x01db
            r20 = r14
            long r13 = r2.f250473c
            yy0.b r2 = f301872b
            r5 = 10
            r16 = r13
            long r12 = r2.mo142687DN(r0, r1, r5)
            int r5 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x010a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r2.append(r9)
            r2.append(r12)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = -10
            goto L_0x0348
        L_0x010a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r9 = 1
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r5, r9)
            int r11 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r11 >= 0) goto L_0x0144
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = -20
            goto L_0x0348
        L_0x0144:
            r3 = 11
            r2.mo142698fY(r12, r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106447h(r25)
            if (r3 != 0) goto L_0x0173
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r12 = r20
            r2.append(r12)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = -40
            goto L_0x0348
        L_0x0173:
            r3 = 12
            r2.mo142698fY(r12, r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106463x(r5, r1)
            if (r3 != 0) goto L_0x01a4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "moveFile failed, originalFilePath = "
            r2.append(r5)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r0 = ", moveFileRet = "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = -5
            goto L_0x0348
        L_0x01a4:
            r3 = 13
            r2.mo142698fY(r12, r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            r3 = 0
            r2.putBoolean(r6, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Linkify link file succ, "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " -> "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", size = "
            r2.append(r0)
            r0 = r16
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L_0x0348
        L_0x01db:
            r12 = r14
            long r13 = r2.f250473c
            yy0.b r2 = f301872b
            r20 = r13
            r5 = 0
            long r13 = r2.mo142687DN(r0, r1, r5)
            int r22 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r22 >= 0) goto L_0x020c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r2.append(r9)
            r2.append(r13)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = -1
            goto L_0x0347
        L_0x020c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r1)
            java.lang.String r11 = "_backup"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r16 = r12
            r5 = 0
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106443d(r1, r10, r5)
            int r22 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r22 >= 0) goto L_0x0258
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = -2
            goto L_0x0347
        L_0x0258:
            r3 = 1
            r2.mo142698fY(r13, r3)
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106443d(r0, r9, r3)
            int r3 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r3 >= 0) goto L_0x0289
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "copyLink failed, originalFilePath = "
            r2.append(r3)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r0 = ", copyLinkRet = "
            r2.append(r0)
            r2.append(r11)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = -3
            goto L_0x0347
        L_0x0289:
            r3 = 2
            r2.mo142698fY(r13, r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106447h(r25)
            if (r3 != 0) goto L_0x02b6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r15)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            r0 = r16
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = -4
            goto L_0x0347
        L_0x02b6:
            r3 = 3
            r2.mo142698fY(r13, r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106463x(r9, r1)
            if (r3 != 0) goto L_0x02e5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "moveFile failed, originalFilePath = "
            r2.append(r5)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r0 = ", moveFileRet = "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = -5
            goto L_0x0347
        L_0x02e5:
            r3 = 4
            r2.mo142698fY(r13, r3)
            boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
            if (r3 != 0) goto L_0x0313
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "deleteBackup , originalFilePath = "
            r2.append(r5)
            r2.append(r0)
            r2.append(r4)
            r2.append(r1)
            java.lang.String r0 = ", deleteBackupRet = "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = -6
            goto L_0x0347
        L_0x0313:
            r3 = 5
            r2.mo142698fY(r13, r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            r3 = 0
            r2.putBoolean(r6, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Linkify real file succ, "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " -> "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", size = "
            r2.append(r0)
            r0 = r20
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r0)
            r4 = 200(0xc8, float:2.8E-43)
        L_0x0347:
            r0 = r4
        L_0x0348:
            return r0
        L_0x0349:
            r0 = 5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wy0.C102520l.mo142137d(java.lang.String, java.lang.String, boolean):int");
    }

    /* renamed from: e */
    public final int mo142138e(long j, long j2, String str, String str2, String str3) {
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        String str4 = str2;
        C87412m.m108594g(str4, "newAttachmentName");
        String str5 = str3;
        C87412m.m108594g(str5, "indexFileName");
        FutureTask futureTask = new FutureTask(new C102521a(j, str, str4, str5, j2));
        ((C119157j) C119157j.f356862d).mo183875f(futureTask);
        Object obj = futureTask.get();
        C87412m.m108593f(obj, "migrateFutureTask.get()");
        return ((Number) obj).intValue();
    }
}
