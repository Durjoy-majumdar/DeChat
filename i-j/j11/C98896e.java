package j11;

import a70.C112760b;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.cmd.C30650a;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import java.io.File;
import java.util.ArrayList;
import lu3.C34379c;
import wy0.C102506a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: j11.e */
public class C98896e extends C86301e {

    /* renamed from: d */
    public long f289906d;

    /* renamed from: e */
    public long f289907e;

    /* renamed from: f */
    public long f289908f;

    /* renamed from: g */
    public long f289909g;

    /* renamed from: h */
    public long f289910h = -1;

    /* renamed from: i */
    public long[] f289911i = new long[4];

    public C98896e() {
        new ArrayList();
    }

    public static synchronized C98896e wx0() {
        C98896e eVar;
        Class cls = C98896e.class;
        synchronized (cls) {
            eVar = (C98896e) C86312j.m106911c(cls);
        }
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:141:0x05ad, code lost:
        if (r0 == false) goto L_0x05af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x030b, code lost:
        if (r7 != false) goto L_0x030d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0337 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0326 A[Catch:{ all -> 0x0375, all -> 0x0378 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAccountInitialized(android.content.Context r30) {
        /*
            r29 = this;
            super.onAccountInitialized(r30)
            java.lang.String r0 = "MicroMsg.SubCoreClean"
            java.lang.String r1 = "summerclean onAccountPostReset updated"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            j11.a r0 = new j11.a
            r0.<init>()
            java.lang.String r1 = "//clean"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            com.tencent.p014mm.pluginsdk.cmd.C30650a.m39147b(r0, r1)
            wy0.a r0 = wy0.C102506a.f301832a
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            wy0.a$b r1 = new wy0.a$b
            r1.<init>()
            wy0.C102506a.f301834c = r1
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r3 = "android.intent.action.SCREEN_ON"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.SCREEN_OFF"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.ACTION_POWER_CONNECTED"
            r2.addAction(r3)
            java.lang.String r3 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            r2.addAction(r3)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r0.registerReceiver(r1, r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r1 = "LinkifyError"
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.getBoolean(r1, r2)
            java.lang.String r4 = "targetFilePath"
            r5 = -11
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "_backup"
            java.lang.String r7 = ", status = "
            java.lang.String r8 = ", targetFilePath = "
            java.lang.String r9 = ", originalFilePath = "
            java.lang.String r10 = ""
            java.lang.String r11 = "rescueFileLinkFileFromError"
            java.lang.String r12 = "MicroMsg.DuplicateFileLinkifyLogic"
            r15 = 6
            r13 = 1
            if (r0 == 0) goto L_0x037e
            wy0.l r0 = wy0.C102520l.f301871a
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)
            kj2.d r0 = kj2.C117407d.INSTANCE
            java.lang.Object[] r14 = new java.lang.Object[r15]
            r19 = -10
            java.lang.Integer r19 = java.lang.Integer.valueOf(r19)
            r14[r2] = r19
            r14[r13] = r3
            r15 = 2
            r14[r15] = r3
            r17 = 3
            r14[r17] = r10
            r18 = 4
            r14[r18] = r10
            r16 = 5
            r14[r16] = r3
            r13 = 26980(0x6964, float:3.7807E-41)
            r0.mo160131h(r13, r14)
            yy0.b r0 = wy0.C102520l.f301872b
            zh3.f r0 = r0.f303871d
            com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()
            java.lang.Object[] r13 = new java.lang.Object[r15]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            r13[r2] = r14
            r14 = 13
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r20 = 1
            r13[r20] = r15
            java.lang.String r15 = "SELECT id,originalPath,targetPath,status from WxFileIndexLinkify WHERE status!=? and status!=?"
            com.tencent.wcdb.Cursor r13 = r0.rawQuery(r15, r13)
            int r0 = r13.getCount()     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r15.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r14 = "unFinishedLinkify count = "
            r15.append(r14)     // Catch:{ all -> 0x0375 }
            r15.append(r0)     // Catch:{ all -> 0x0375 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r14)     // Catch:{ all -> 0x0375 }
            if (r0 != 0) goto L_0x00d8
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x0375 }
            r0.putBoolean(r1, r2)     // Catch:{ all -> 0x0375 }
        L_0x00d8:
            boolean r0 = r13.moveToNext()     // Catch:{ all -> 0x0375 }
            if (r0 == 0) goto L_0x0364
            long r0 = r13.getLong(r2)     // Catch:{ all -> 0x0375 }
            r14 = 1
            java.lang.String r15 = r13.getString(r14)     // Catch:{ all -> 0x0375 }
            r14 = 2
            java.lang.String r2 = r13.getString(r14)     // Catch:{ all -> 0x0375 }
            r21 = r10
            r14 = 3
            int r10 = r13.getInt(r14)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r14.<init>()     // Catch:{ all -> 0x0375 }
            r22 = r11
            java.lang.String r11 = "saveFileLinkFileFromError, id = "
            r14.append(r11)     // Catch:{ all -> 0x0375 }
            r14.append(r0)     // Catch:{ all -> 0x0375 }
            r14.append(r9)     // Catch:{ all -> 0x0375 }
            r14.append(r15)     // Catch:{ all -> 0x0375 }
            r14.append(r8)     // Catch:{ all -> 0x0375 }
            r14.append(r2)     // Catch:{ all -> 0x0375 }
            r14.append(r7)     // Catch:{ all -> 0x0375 }
            r14.append(r10)     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = r14.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r11)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r11.<init>()     // Catch:{ all -> 0x0375 }
            r11.append(r2)     // Catch:{ all -> 0x0375 }
            java.lang.String r14 = "_link"
            r11.append(r14)     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r14.<init>()     // Catch:{ all -> 0x0375 }
            r14.append(r2)     // Catch:{ all -> 0x0375 }
            r14.append(r6)     // Catch:{ all -> 0x0375 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0375 }
            r23 = r6
            kj2.d r6 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x0375 }
            r24 = r7
            r25 = r8
            r7 = 6
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x0375 }
            r7 = 0
            r8[r7] = r5     // Catch:{ all -> 0x0375 }
            r7 = 1
            r8[r7] = r3     // Catch:{ all -> 0x0375 }
            r7 = 2
            r8[r7] = r3     // Catch:{ all -> 0x0375 }
            r7 = 3
            r8[r7] = r15     // Catch:{ all -> 0x0375 }
            r7 = 4
            r8[r7] = r2     // Catch:{ all -> 0x0375 }
            r16 = 5
            r8[r16] = r3     // Catch:{ all -> 0x0375 }
            r7 = 26980(0x6964, float:3.7807E-41)
            r6.mo160131h(r7, r8)     // Catch:{ all -> 0x0375 }
            if (r10 == 0) goto L_0x02eb
            r7 = 1
            if (r10 == r7) goto L_0x02df
            r7 = 2
            if (r10 == r7) goto L_0x026d
            r7 = 3
            if (r10 == r7) goto L_0x023a
            r7 = 4
            if (r10 == r7) goto L_0x0208
            switch(r10) {
                case 10: goto L_0x01e4;
                case 11: goto L_0x019c;
                case 12: goto L_0x0174;
                default: goto L_0x0170;
            }     // Catch:{ all -> 0x0375 }
        L_0x0170:
            r8 = 13
            goto L_0x030f
        L_0x0174:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ all -> 0x0375 }
            if (r7 != 0) goto L_0x0170
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106463x(r11, r2)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r8.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = "LINKIFY_LINK_STATUS_DELETE_TARGET_DONE moveFileRet = "
            r8.append(r10)     // Catch:{ all -> 0x0375 }
            r8.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0170
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r8 = 13
            r7.mo142698fY(r0, r8)     // Catch:{ all -> 0x0375 }
            goto L_0x0170
        L_0x019c:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x01c1
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106447h(r11)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r8.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = "LINKIFY_LINK_STATUS_COPY_LINK_DONE deleteLinkFileRet = "
            r8.append(r10)     // Catch:{ all -> 0x0375 }
            r8.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0170
            r7 = 1
            r8 = 13
            goto L_0x0310
        L_0x01c1:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106463x(r11, r2)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r8.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = "LINKIFY_LINK_STATUS_COPY_LINK_DONE moveFileRet = "
            r8.append(r10)     // Catch:{ all -> 0x0375 }
            r8.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0170
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r8 = 13
            r7.mo142698fY(r0, r8)     // Catch:{ all -> 0x0375 }
            goto L_0x030f
        L_0x01e4:
            r8 = 13
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r11)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x030f
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106447h(r11)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r10.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = "LINKIFY_LINK_STATUS_START deleteLinkFileRet = "
            r10.append(r11)     // Catch:{ all -> 0x0375 }
            r10.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x030f
            goto L_0x030d
        L_0x0208:
            r8 = 13
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r14)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0232
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106447h(r14)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r10.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = "LINKIFY_FILE_STATUS_MOVE_FILE_DONE deleteBackupRet = "
            r10.append(r11)     // Catch:{ all -> 0x0375 }
            r10.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x030f
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r10 = 5
            r7.mo142698fY(r0, r10)     // Catch:{ all -> 0x0375 }
            goto L_0x030f
        L_0x0232:
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r10 = 5
            r7.mo142698fY(r0, r10)     // Catch:{ all -> 0x0375 }
            goto L_0x030f
        L_0x023a:
            r8 = 13
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ all -> 0x0375 }
            if (r7 != 0) goto L_0x024b
            com.tencent.p014mm.vfs.C86013q1.m106463x(r11, r2)     // Catch:{ all -> 0x0375 }
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r10 = 4
            r7.mo142698fY(r0, r10)     // Catch:{ all -> 0x0375 }
        L_0x024b:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106447h(r14)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r10.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = "LINKIFY_FILE_STATUS_DELETE_TARGET_DONE deleteBackupRet = "
            r10.append(r11)     // Catch:{ all -> 0x0375 }
            r10.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x030f
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r10 = 5
            r7.mo142698fY(r0, r10)     // Catch:{ all -> 0x0375 }
            goto L_0x030f
        L_0x026d:
            r8 = 13
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)     // Catch:{ all -> 0x0375 }
            if (r7 != 0) goto L_0x02d5
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106447h(r2)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0281
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r10 = 3
            r7.mo142698fY(r0, r10)     // Catch:{ all -> 0x0375 }
        L_0x0281:
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106463x(r11, r2)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r10.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = "LINKIFY_FILE_STATUS_COPY_LINK_DONE, SAVE from error, moveFileRet, ret = "
            r10.append(r11)     // Catch:{ all -> 0x0375 }
            r10.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r10)     // Catch:{ all -> 0x0375 }
            if (r7 != 0) goto L_0x02b0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r10.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = "LINKIFY_FILE_STATUS_COPY_LINK_DONE, !!! maybe file was lost = "
            r10.append(r11)     // Catch:{ all -> 0x0375 }
            r10.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r7 = r10.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r7)     // Catch:{ all -> 0x0375 }
            goto L_0x030f
        L_0x02b0:
            yy0.b r7 = wy0.C102520l.f301872b     // Catch:{ all -> 0x0375 }
            r10 = 4
            r7.mo142698fY(r0, r10)     // Catch:{ all -> 0x0375 }
            boolean r10 = com.tencent.p014mm.vfs.C86013q1.m106447h(r14)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r11.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r14 = "LINKIFY_FILE_STATUS_COPY_LINK_DONE, deleteBackupRet = "
            r11.append(r14)     // Catch:{ all -> 0x0375 }
            r11.append(r10)     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)     // Catch:{ all -> 0x0375 }
            if (r10 == 0) goto L_0x030f
            r10 = 5
            r7.mo142698fY(r0, r10)     // Catch:{ all -> 0x0375 }
            goto L_0x030f
        L_0x02d5:
            wy0.l r7 = wy0.C102520l.f301871a     // Catch:{ all -> 0x0375 }
            gy3.C87412m.m108593f(r2, r4)     // Catch:{ all -> 0x0375 }
            boolean r7 = r7.mo142136c(r2, r14, r11)     // Catch:{ all -> 0x0375 }
            goto L_0x0310
        L_0x02df:
            r8 = 13
            wy0.l r7 = wy0.C102520l.f301871a     // Catch:{ all -> 0x0375 }
            gy3.C87412m.m108593f(r2, r4)     // Catch:{ all -> 0x0375 }
            boolean r7 = r7.mo142136c(r2, r14, r11)     // Catch:{ all -> 0x0375 }
            goto L_0x0310
        L_0x02eb:
            r8 = 13
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106450k(r14)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x030f
            boolean r7 = com.tencent.p014mm.vfs.C86013q1.m106447h(r14)     // Catch:{ all -> 0x0375 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r10.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = "LINKIFY_FILE_STATUS_START, deleteBackupFileRet = "
            r10.append(r11)     // Catch:{ all -> 0x0375 }
            r10.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x030f
        L_0x030d:
            r7 = 1
            goto L_0x0310
        L_0x030f:
            r7 = 0
        L_0x0310:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0375 }
            r10.<init>()     // Catch:{ all -> 0x0375 }
            java.lang.String r11 = "deleteThisLinkify = "
            r10.append(r11)     // Catch:{ all -> 0x0375 }
            r10.append(r7)     // Catch:{ all -> 0x0375 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0375 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r10)     // Catch:{ all -> 0x0375 }
            if (r7 == 0) goto L_0x0337
            java.util.concurrent.FutureTask r7 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0375 }
            wy0.m r10 = new wy0.m     // Catch:{ all -> 0x0375 }
            r10.<init>(r0)     // Catch:{ all -> 0x0375 }
            r7.<init>(r10)     // Catch:{ all -> 0x0375 }
            zt3.t r0 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0375 }
            zt3.j r0 = (zt3.C119157j) r0     // Catch:{ all -> 0x0375 }
            r0.mo183875f(r7)     // Catch:{ all -> 0x0375 }
        L_0x0337:
            r0 = 6
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0375 }
            r0 = -30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0375 }
            r7 = 0
            r1[r7] = r0     // Catch:{ all -> 0x0375 }
            r0 = 1
            r1[r0] = r3     // Catch:{ all -> 0x0375 }
            r0 = 2
            r1[r0] = r3     // Catch:{ all -> 0x0375 }
            r0 = 3
            r1[r0] = r15     // Catch:{ all -> 0x0375 }
            r0 = 4
            r1[r0] = r2     // Catch:{ all -> 0x0375 }
            r0 = 5
            r1[r0] = r3     // Catch:{ all -> 0x0375 }
            r0 = 26980(0x6964, float:3.7807E-41)
            r6.mo160131h(r0, r1)     // Catch:{ all -> 0x0375 }
            r10 = r21
            r11 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r2 = 0
            goto L_0x00d8
        L_0x0364:
            r23 = r6
            r24 = r7
            r25 = r8
            r21 = r10
            r22 = r11
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0375 }
            r0 = 0
            cy3.C58003b.m67160a(r13, r0)
            goto L_0x0388
        L_0x0375:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0378 }
        L_0x0378:
            r0 = move-exception
            r2 = r0
            cy3.C58003b.m67160a(r13, r1)
            throw r2
        L_0x037e:
            r23 = r6
            r24 = r7
            r25 = r8
            r21 = r10
            r22 = r11
        L_0x0388:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r1 = "DownloadMigrationError"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x060c
            wy0.l r0 = wy0.C102520l.f301871a
            r0 = r22
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            kj2.d r0 = kj2.C117407d.INSTANCE
            r6 = 6
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r6 = -100
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7[r2] = r6
            r2 = 1
            r7[r2] = r3
            r6 = 2
            r7[r6] = r3
            r6 = 3
            r7[r6] = r21
            r6 = 4
            r7[r6] = r21
            r6 = 5
            r7[r6] = r3
            r6 = 26980(0x6964, float:3.7807E-41)
            r0.mo160131h(r6, r7)
            yy0.b r0 = wy0.C102520l.f301872b
            zh3.f r0 = r0.f303871d
            com.tencent.wcdb.database.SQLiteDatabase r0 = r0.mo125615f()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r8 = 0
            r6[r8] = r7
            java.lang.String r7 = "SELECT id,originalPath,targetPath,status,indexRowId,msgId from WxFileIndexDownloadMigration WHERE status!=?"
            com.tencent.wcdb.Cursor r6 = r0.rawQuery(r7, r6)
            int r0 = r6.getCount()     // Catch:{ all -> 0x0602 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0602 }
            r7.<init>()     // Catch:{ all -> 0x0602 }
            java.lang.String r8 = "rescueDownloadMigrationError count = "
            r7.append(r8)     // Catch:{ all -> 0x0602 }
            r7.append(r0)     // Catch:{ all -> 0x0602 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0602 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r7)     // Catch:{ all -> 0x0602 }
            if (r0 != 0) goto L_0x03ff
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()     // Catch:{ all -> 0x03fa }
            r7 = 0
            r0.putBoolean(r1, r7)     // Catch:{ all -> 0x03fa }
            goto L_0x03ff
        L_0x03fa:
            r0 = move-exception
            r28 = r6
            goto L_0x05ef
        L_0x03ff:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0602 }
            if (r0 == 0) goto L_0x05f3
            r0 = 0
            long r7 = r6.getLong(r0)     // Catch:{ all -> 0x03fa }
            r0 = 1
            java.lang.String r1 = r6.getString(r0)     // Catch:{ all -> 0x03fa }
            r0 = 2
            java.lang.String r10 = r6.getString(r0)     // Catch:{ all -> 0x03fa }
            r0 = 3
            int r11 = r6.getInt(r0)     // Catch:{ all -> 0x03fa }
            r0 = 4
            long r13 = r6.getLong(r0)     // Catch:{ all -> 0x03fa }
            r0 = 5
            long r21 = r6.getLong(r0)     // Catch:{ all -> 0x03fa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03fa }
            r0.<init>()     // Catch:{ all -> 0x03fa }
            java.lang.String r15 = "rescueDownloadMigrationError, id = "
            r0.append(r15)     // Catch:{ all -> 0x03fa }
            r0.append(r7)     // Catch:{ all -> 0x03fa }
            r0.append(r9)     // Catch:{ all -> 0x03fa }
            r0.append(r1)     // Catch:{ all -> 0x03fa }
            r15 = r25
            r0.append(r15)     // Catch:{ all -> 0x03fa }
            r0.append(r10)     // Catch:{ all -> 0x03fa }
            r2 = r24
            r0.append(r2)     // Catch:{ all -> 0x03fa }
            r0.append(r11)     // Catch:{ all -> 0x03fa }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03fa }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ all -> 0x03fa }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x03fa }
            r0.<init>()     // Catch:{ all -> 0x03fa }
            r0.append(r1)     // Catch:{ all -> 0x03fa }
            r24 = r2
            r2 = r23
            r0.append(r2)     // Catch:{ all -> 0x03fa }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03fa }
            r23 = r2
            kj2.d r2 = kj2.C117407d.INSTANCE     // Catch:{ all -> 0x03fa }
            r25 = r9
            r26 = r15
            r9 = 6
            java.lang.Object[] r15 = new java.lang.Object[r9]     // Catch:{ all -> 0x03fa }
            r9 = 0
            r15[r9] = r5     // Catch:{ all -> 0x03fa }
            r9 = 1
            r15[r9] = r3     // Catch:{ all -> 0x03fa }
            r9 = 2
            r15[r9] = r3     // Catch:{ all -> 0x03fa }
            r9 = 3
            r15[r9] = r1     // Catch:{ all -> 0x03fa }
            r9 = 4
            r15[r9] = r10     // Catch:{ all -> 0x03fa }
            r9 = 5
            r15[r9] = r3     // Catch:{ all -> 0x03fa }
            r9 = 26980(0x6964, float:3.7807E-41)
            r2.mo160131h(r9, r15)     // Catch:{ all -> 0x03fa }
            if (r11 == 0) goto L_0x056a
            r9 = 1
            if (r11 == r9) goto L_0x056a
            java.lang.String r0 = "wcf://attachment/"
            r9 = 46
            r15 = 2
            if (r11 == r15) goto L_0x04f4
            r15 = 3
            if (r11 == r15) goto L_0x04a6
            r15 = 4
            if (r11 == r15) goto L_0x0497
            goto L_0x04ef
        L_0x0497:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ all -> 0x03fa }
            if (r0 != 0) goto L_0x049e
            goto L_0x04e4
        L_0x049e:
            yy0.b r0 = wy0.C102520l.f301872b     // Catch:{ all -> 0x03fa }
            r9 = 200(0xc8, float:2.8E-43)
            r0.mo142706vP(r7, r9)     // Catch:{ all -> 0x03fa }
            goto L_0x04ef
        L_0x04a6:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03fa }
            r11.<init>()     // Catch:{ all -> 0x03fa }
            java.lang.String r15 = com.tencent.p014mm.vfs.C86013q1.m106457r(r10)     // Catch:{ all -> 0x03fa }
            r11.append(r15)     // Catch:{ all -> 0x03fa }
            r11.append(r9)     // Catch:{ all -> 0x03fa }
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106454o(r10)     // Catch:{ all -> 0x03fa }
            r11.append(r9)     // Catch:{ all -> 0x03fa }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x03fa }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x03fa }
            r11.<init>()     // Catch:{ all -> 0x03fa }
            r11.append(r0)     // Catch:{ all -> 0x03fa }
            r11.append(r9)     // Catch:{ all -> 0x03fa }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x03fa }
            wy0.a r9 = wy0.C102506a.f301832a     // Catch:{ all -> 0x03fa }
            yy0.b r9 = r9.mo142120e()     // Catch:{ all -> 0x03fa }
            r9.mo142686CP(r13, r0)     // Catch:{ all -> 0x03fa }
            yy0.b r0 = wy0.C102520l.f301872b     // Catch:{ all -> 0x03fa }
            r9 = 4
            r0.mo142706vP(r7, r9)     // Catch:{ all -> 0x03fa }
            boolean r9 = com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ all -> 0x03fa }
            if (r9 == 0) goto L_0x04ea
        L_0x04e4:
            r27 = r5
            r28 = r6
            goto L_0x05af
        L_0x04ea:
            r9 = 200(0xc8, float:2.8E-43)
            r0.mo142706vP(r7, r9)     // Catch:{ all -> 0x03fa }
        L_0x04ef:
            r27 = r5
            r28 = r6
            goto L_0x0566
        L_0x04f4:
            yy0.b r11 = wy0.C102520l.f301872b     // Catch:{ all -> 0x03fa }
            r15 = 2
            r11.mo142706vP(r7, r15)     // Catch:{ all -> 0x03fa }
            f40.o r15 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x04e4 }
            zh3.f r15 = r15.f251811i     // Catch:{ Exception -> 0x04e4 }
            com.tencent.wcdb.database.SQLiteDatabase r15 = r15.mo125615f()     // Catch:{ Exception -> 0x04e4 }
            java.lang.String r9 = "UPDATE appattach SET fileFullPath=? WHERE msgInfoId=?"
            r27 = r5
            r28 = r6
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x05af }
            gy3.C87412m.m108593f(r10, r4)     // Catch:{ Exception -> 0x05af }
            r5 = 0
            r6[r5] = r10     // Catch:{ Exception -> 0x05af }
            java.lang.Long r5 = java.lang.Long.valueOf(r21)     // Catch:{ Exception -> 0x05af }
            r20 = 1
            r6[r20] = r5     // Catch:{ Exception -> 0x05af }
            r15.execSQL(r9, r6)     // Catch:{ Exception -> 0x05af }
            r5 = 3
            r11.mo142706vP(r7, r5)     // Catch:{ all -> 0x05ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ee }
            r5.<init>()     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106457r(r10)     // Catch:{ all -> 0x05ee }
            r5.append(r6)     // Catch:{ all -> 0x05ee }
            r6 = 46
            r5.append(r6)     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = com.tencent.p014mm.vfs.C86013q1.m106454o(r10)     // Catch:{ all -> 0x05ee }
            r5.append(r6)     // Catch:{ all -> 0x05ee }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x05ee }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ee }
            r6.<init>()     // Catch:{ all -> 0x05ee }
            r6.append(r0)     // Catch:{ all -> 0x05ee }
            r6.append(r5)     // Catch:{ all -> 0x05ee }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x05ee }
            wy0.a r5 = wy0.C102506a.f301832a     // Catch:{ all -> 0x05ee }
            yy0.b r5 = r5.mo142120e()     // Catch:{ all -> 0x05ee }
            r5.mo142686CP(r13, r0)     // Catch:{ all -> 0x05ee }
            r0 = 4
            r11.mo142706vP(r7, r0)     // Catch:{ all -> 0x05ee }
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r1)     // Catch:{ all -> 0x05ee }
            if (r0 != 0) goto L_0x0561
            goto L_0x05af
        L_0x0561:
            r0 = 200(0xc8, float:2.8E-43)
            r11.mo142706vP(r7, r0)     // Catch:{ all -> 0x05ee }
        L_0x0566:
            r0 = 6
            r5 = 200(0xc8, float:2.8E-43)
            goto L_0x05c3
        L_0x056a:
            r27 = r5
            r28 = r6
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ all -> 0x05ee }
            if (r5 == 0) goto L_0x058f
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ all -> 0x05ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ee }
            r5.<init>()     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = "LINKIFY_FILE_STATUS_START||DOWNLOAD_MIGRATION_STATUS_COPY_BACKUP_DONE, deleteBackupFileRet = "
            r5.append(r6)     // Catch:{ all -> 0x05ee }
            r5.append(r0)     // Catch:{ all -> 0x05ee }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x05ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)     // Catch:{ all -> 0x05ee }
            if (r0 != 0) goto L_0x058f
            goto L_0x05af
        L_0x058f:
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)     // Catch:{ all -> 0x05ee }
            if (r0 == 0) goto L_0x05bb
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106447h(r10)     // Catch:{ all -> 0x05ee }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x05ee }
            r5.<init>()     // Catch:{ all -> 0x05ee }
            java.lang.String r6 = "LINKIFY_FILE_STATUS_START||DOWNLOAD_MIGRATION_STATUS_COPY_BACKUP_DONE, deleteTargetFileRet = "
            r5.append(r6)     // Catch:{ all -> 0x05ee }
            r5.append(r0)     // Catch:{ all -> 0x05ee }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x05ee }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)     // Catch:{ all -> 0x05ee }
            if (r0 != 0) goto L_0x05bb
        L_0x05af:
            r0 = 6
            r1 = 4
            r5 = 200(0xc8, float:2.8E-43)
            r7 = 1
            r8 = 0
            r9 = 2
            r10 = 5
            r11 = 3
            r13 = 26980(0x6964, float:3.7807E-41)
            goto L_0x05e2
        L_0x05bb:
            yy0.b r0 = wy0.C102520l.f301872b     // Catch:{ all -> 0x05ee }
            r5 = 200(0xc8, float:2.8E-43)
            r0.mo142706vP(r7, r5)     // Catch:{ all -> 0x05ee }
            r0 = 6
        L_0x05c3:
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x05ee }
            r7 = -120(0xffffffffffffff88, float:NaN)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x05ee }
            r8 = 0
            r6[r8] = r7     // Catch:{ all -> 0x05ee }
            r7 = 1
            r6[r7] = r3     // Catch:{ all -> 0x05ee }
            r9 = 2
            r6[r9] = r3     // Catch:{ all -> 0x05ee }
            r11 = 3
            r6[r11] = r1     // Catch:{ all -> 0x05ee }
            r1 = 4
            r6[r1] = r10     // Catch:{ all -> 0x05ee }
            r10 = 5
            r6[r10] = r3     // Catch:{ all -> 0x05ee }
            r13 = 26980(0x6964, float:3.7807E-41)
            r2.mo160131h(r13, r6)     // Catch:{ all -> 0x05ee }
        L_0x05e2:
            r9 = r25
            r25 = r26
            r5 = r27
            r6 = r28
            r2 = 200(0xc8, float:2.8E-43)
            goto L_0x03ff
        L_0x05ee:
            r0 = move-exception
        L_0x05ef:
            r2 = r0
            r1 = r28
            goto L_0x0605
        L_0x05f3:
            r28 = r6
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x05fe }
            r1 = r28
            r0 = 0
            cy3.C58003b.m67160a(r1, r0)
            goto L_0x060c
        L_0x05fe:
            r0 = move-exception
            r1 = r28
            goto L_0x0604
        L_0x0602:
            r0 = move-exception
            r1 = r6
        L_0x0604:
            r2 = r0
        L_0x0605:
            throw r2     // Catch:{ all -> 0x0606 }
        L_0x0606:
            r0 = move-exception
            r3 = r0
            cy3.C58003b.m67160a(r1, r2)
            throw r3
        L_0x060c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j11.C98896e.onAccountInitialized(android.content.Context):void");
    }

    public void onAccountReleased(Context context) {
        Log.m105924i("MicroMsg.SubCoreClean", "summerclean onAccountRelease");
        this.f289906d = 0;
        this.f289907e = 0;
        this.f289909g = 0;
        C102506a.C102508b bVar = C102506a.f301834c;
        if (bVar != null) {
            MMApplicationContext.getContext().unregisterReceiver(bVar);
            C34379c<?> cVar = bVar.f301844b;
            if (cVar != null) {
                cVar.cancel(false);
            }
            bVar.f301844b = null;
            CancellationSignal cancellationSignal = bVar.f301843a;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            bVar.f301843a = null;
        }
        C30650a.m39148c("//clean");
    }

    public long[] vx0() {
        String str;
        boolean z;
        File externalCacheDir = MMApplicationContext.getContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            try {
                z = Environment.isExternalStorageEmulated(externalCacheDir);
            } catch (Exception unused) {
                z = false;
            }
            str = z ? C112760b.m154216X() : C112760b.m154230f0();
        } else {
            str = C112760b.m154216X();
        }
        try {
            StatFs statFs = new StatFs(str);
            return new long[]{statFs.getAvailableBytes(), statFs.getTotalBytes()};
        } catch (Exception unused2) {
            return new long[]{1, 1};
        }
    }

    public void xx0(int i, CancellationSignal cancellationSignal) {
        if (WeChatEnvironment.hasDebugger() || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_BLUE || BuildInfo.IS_FLAVOR_PURPLE) {
            long j = 0;
            if (this.f289911i[i] > 0) {
                while (j < this.f289911i[i]) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException unused) {
                    }
                    if (cancellationSignal == null || !cancellationSignal.isCanceled()) {
                        j += 1000;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
