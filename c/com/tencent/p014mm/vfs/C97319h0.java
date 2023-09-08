package com.tencent.p014mm.vfs;

import android.os.CancellationSignal;
import com.tencent.p014mm.vfs.ImageGCFileSystem;

/* renamed from: com.tencent.mm.vfs.h0 */
public class C97319h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f285616d;

    /* renamed from: e */
    public final /* synthetic */ ImageGCFileSystem.C116218c f285617e;

    public C97319h0(ImageGCFileSystem.C116218c cVar, CancellationSignal cancellationSignal) {
        this.f285617e = cVar;
        this.f285616d = cancellationSignal;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00be A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r36 = this;
            r0 = r36
            long r1 = java.lang.System.currentTimeMillis()
            f40.o r3 = f40.C86709a0.m107535s()
            zh3.f r3 = r3.f251811i
            com.tencent.wcdb.database.SQLiteDatabase r3 = r3.mo125615f()
            r4 = 0
            java.lang.String r5 = "SELECT bigImgPath,thumbImgPath FROM ImgInfo2"
            com.tencent.wcdb.Cursor r3 = r3.rawQuery(r5, r4)
            r4 = 0
            r16 = r1
            r1 = r4
            r6 = r1
            r8 = r6
            r10 = r8
            r12 = r10
            r14 = r12
            r18 = r14
            r20 = r18
            r22 = r20
        L_0x0027:
            boolean r24 = r3.moveToNext()
            r25 = r1
            java.lang.String r2 = "VFS.ImageGCFileSystem"
            r1 = 0
            if (r24 == 0) goto L_0x0180
            r24 = r2
            java.lang.String r2 = r3.getString(r1)
            r27 = r14
            r1 = 1
            java.lang.String r14 = r3.getString(r1)
            android.os.CancellationSignal r1 = r0.f285616d
            boolean r1 = r1.isCanceled()
            if (r1 == 0) goto L_0x0054
            r1 = r10
            r14 = r18
            r18 = r20
            r10 = r22
            r0 = r24
            r20 = 1
            goto L_0x018c
        L_0x0054:
            java.lang.String r1 = ""
            r15 = 0
            java.lang.String r2 = com.tencent.p014mm.vfs.ImageGCFileSystem.m163646b(r2, r1, r1, r15)
            java.lang.String r1 = com.tencent.p014mm.vfs.ImageGCFileSystem.m163646b(r14, r1, r1, r15)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r1)
            java.lang.String r15 = "hd"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            boolean r15 = com.tencent.p014mm.vfs.C86013q1.m106450k(r14)
            boolean r29 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            r30 = 1
            if (r2 == 0) goto L_0x00a3
            if (r15 == 0) goto L_0x0094
            com.tencent.mm.vfs.b0 r2 = com.tencent.p014mm.vfs.C86013q1.m106453n(r14)
            if (r2 == 0) goto L_0x0094
            long r4 = r4 + r30
            r32 = r4
            long r4 = r2.f250474d
            long r6 = r6 + r4
            long r8 = r8 + r30
            long r10 = r10 + r4
            r4 = r32
        L_0x0094:
            if (r29 == 0) goto L_0x00bc
            com.tencent.mm.vfs.b0 r2 = com.tencent.p014mm.vfs.C86013q1.m106453n(r1)
            if (r2 == 0) goto L_0x00bc
            long r4 = r4 + r30
            r32 = r4
            long r4 = r2.f250474d
            goto L_0x00b3
        L_0x00a3:
            if (r15 == 0) goto L_0x00bc
            if (r29 == 0) goto L_0x00bc
            com.tencent.mm.vfs.b0 r2 = com.tencent.p014mm.vfs.C86013q1.m106453n(r1)
            if (r2 == 0) goto L_0x00bc
            long r4 = r4 + r30
            r32 = r4
            long r4 = r2.f250474d
        L_0x00b3:
            long r6 = r6 + r4
            long r12 = r12 + r30
            long r4 = r27 + r4
            r27 = r4
            r4 = r32
        L_0x00bc:
            if (r15 == 0) goto L_0x0162
            if (r29 == 0) goto L_0x0162
            com.tencent.mm.vfs.b0 r2 = com.tencent.p014mm.vfs.C86013q1.m106453n(r1)
            if (r2 == 0) goto L_0x0162
            long r14 = r25 + r30
            r32 = r4
            long r4 = r2.f250474d
            r25 = r14
            r14 = r18
            long r18 = r14 + r4
            com.tencent.mm.vfs.ImageGCFileSystem$c r4 = r0.f285617e
            r4.getClass()
            boolean r4 = com.tencent.p014mm.vfs.ImageGCFileSystem.f348763g
            if (r4 == 0) goto L_0x0119
            long r4 = java.lang.System.currentTimeMillis()
            long r14 = r2.f250475e
            long r4 = r4 - r14
            r14 = 86400000(0x5265c00, double:4.2687272E-316)
            int r29 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r29 <= 0) goto L_0x0119
            r4 = 1
            boolean r5 = r2.mo119955b(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r14 = "delete Thumb File, fe = "
            r4.append(r14)
            java.lang.String r14 = r2.f250471a
            r4.append(r14)
            java.lang.String r14 = ", ret = "
            r4.append(r14)
            r4.append(r5)
            java.lang.String r14 = ", modifiedTime = "
            r4.append(r14)
            long r14 = r2.f250475e
            r4.append(r14)
            java.lang.String r4 = r4.toString()
            r14 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            goto L_0x011c
        L_0x0119:
            r14 = r24
            r5 = 0
        L_0x011c:
            if (r5 == 0) goto L_0x012d
            r34 = r12
            r12 = r20
            long r20 = r12 + r30
            long r12 = r2.f250474d
            r29 = r10
            r10 = r22
            long r22 = r10 + r12
            goto L_0x0135
        L_0x012d:
            r29 = r10
            r34 = r12
            r12 = r20
            r10 = r22
        L_0x0135:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "delete unused thumb : "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = "ret = "
            r4.append(r10)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            r2[r5] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r1, r2)
            goto L_0x0174
        L_0x0162:
            r32 = r4
            r29 = r10
            r34 = r12
            r14 = r18
            r12 = r20
            r10 = r22
            r22 = r10
            r20 = r12
            r18 = r14
        L_0x0174:
            r1 = r25
            r14 = r27
            r10 = r29
            r4 = r32
            r12 = r34
            goto L_0x0027
        L_0x0180:
            r0 = r2
            r1 = r10
            r27 = r14
            r14 = r18
            r18 = r20
            r10 = r22
            r20 = 0
        L_0x018c:
            long r21 = java.lang.System.currentTimeMillis()
            r23 = r10
            long r10 = r21 - r16
            r3.close()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r16 = r10
            java.lang.String r10 = "thumbRedundantFileCount = "
            r3.append(r10)
            r10 = r25
            r3.append(r10)
            java.lang.String r10 = ", thumbRedundantFileDiskSpace = "
            r3.append(r10)
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "totalCount = "
            r3.append(r10)
            r3.append(r4)
            java.lang.String r10 = ", totalSize = "
            r3.append(r10)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "hdThCount = "
            r3.append(r10)
            r3.append(r8)
            java.lang.String r10 = ", hdThSize = "
            r3.append(r10)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "thCount = "
            r3.append(r10)
            r3.append(r12)
            java.lang.String r10 = ", thSize = "
            r3.append(r10)
            r10 = r27
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r21 = r4
            java.lang.String r4 = "deletedCount = "
            r3.append(r4)
            r4 = r23
            r3.append(r4)
            r23 = r14
            java.lang.String r14 = ", deletedSize = "
            r3.append(r14)
            r14 = r18
            r3.append(r14)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "thumb scan duration = "
            r3.append(r10)
            r10 = r16
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r3 = "extreme_storage_wechat_total"
            r10 = -1
            r18 = r12
            long r12 = r0.getLong(r3, r10)
            r0 = -1
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 == 0) goto L_0x0266
            float r0 = (float) r6
            float r3 = (float) r12
            float r0 = r0 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r3
            int r0 = (int) r0
        L_0x0266:
            kj2.d r3 = kj2.C117407d.INSTANCE
            r10 = 22046(0x561e, float:3.0893E-41)
            r11 = 18
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r12 = "image2-thumb"
            r13 = 0
            r11[r13] = r12
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r14 = 1
            r11[r14] = r12
            r12 = 2
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r11[r12] = r4
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r11[r4] = r5
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r13)
            r11[r4] = r5
            r4 = 5
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            r11[r4] = r5
            r4 = 6
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r11[r4] = r1
            r1 = 7
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            r11[r1] = r2
            r1 = 8
            java.lang.Long r2 = java.lang.Long.valueOf(r27)
            r11[r1] = r2
            r1 = 9
            java.lang.Long r2 = java.lang.Long.valueOf(r25)
            r11[r1] = r2
            r1 = 10
            java.lang.Long r2 = java.lang.Long.valueOf(r23)
            r11[r1] = r2
            r1 = 11
            r2 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r11[r1] = r4
            r1 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r11[r1] = r2
            r1 = 13
            java.lang.Long r2 = java.lang.Long.valueOf(r21)
            r11[r1] = r2
            r1 = 14
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r11[r1] = r2
            r1 = 15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r11[r1] = r2
            r1 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r1] = r0
            r0 = 17
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            r11[r0] = r1
            r3.mo160131h(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C97319h0.run():void");
    }
}
