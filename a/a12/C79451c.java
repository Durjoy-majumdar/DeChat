package a12;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import ev3.C86700b;

/* renamed from: a12.c */
public class C79451c extends C86700b {

    /* renamed from: c */
    public final int f232992c;

    public C79451c(Context context) {
        super(context);
        int memoryClass = ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryClass();
        this.f232992c = memoryClass;
        ShareTinkerLog.m106533v("Tinker.TinkerPatchListener", "application maxMemory:" + memoryClass, new Object[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo109429b(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r1
            long r6 = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getFileOrDirectorySize(r2)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r7 = 1
            r4[r7] = r6
            java.lang.String r6 = "Tinker.TinkerPatchListener"
            java.lang.String r8 = "receive a patch file: %s, file size:%d"
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106533v(r6, r8, r4)
            int r1 = super.mo109429b(r17, r18)
            if (r1 != 0) goto L_0x0072
            r8 = 83886080(0x5000000, double:4.14452303E-316)
            int r1 = r0.f232992c
            r4 = 45
            if (r1 >= r4) goto L_0x0034
            r1 = -23
            goto L_0x0072
        L_0x0034:
            r10 = 0
            java.io.File r1 = android.os.Environment.getDataDirectory()     // Catch:{ Exception -> 0x005e }
            android.os.StatFs r4 = new android.os.StatFs     // Catch:{ Exception -> 0x005e }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x005e }
            r4.<init>(r1)     // Catch:{ Exception -> 0x005e }
            int r1 = r4.getAvailableBlocks()     // Catch:{ Exception -> 0x005e }
            long r12 = (long) r1     // Catch:{ Exception -> 0x005e }
            int r1 = r4.getBlockSize()     // Catch:{ Exception -> 0x005e }
            long r14 = (long) r1
            long r12 = r12 * r14
            int r1 = r4.getBlockCount()     // Catch:{ Exception -> 0x005c }
            long r14 = (long) r1     // Catch:{ Exception -> 0x005c }
            int r1 = r4.getBlockSize()     // Catch:{ Exception -> 0x005c }
            long r3 = (long) r1
            long r14 = r14 * r3
            goto L_0x0061
        L_0x005c:
            goto L_0x0060
        L_0x005e:
            r12 = r10
        L_0x0060:
            r14 = r10
        L_0x0061:
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 == 0) goto L_0x006b
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x006b
            r1 = 1
            goto L_0x006c
        L_0x006b:
            r1 = 0
        L_0x006c:
            if (r1 != 0) goto L_0x0071
            r1 = -21
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            if (r1 != 0) goto L_0x00ad
            android.content.Context r3 = r0.f251710a
            iv3.C87821a.m109275c(r3)
            if (r1 != 0) goto L_0x00ad
            java.util.Properties r3 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.fastGetPatchPackageMeta(r2)
            if (r3 != 0) goto L_0x0084
            r1 = -24
            goto L_0x00ad
        L_0x0084:
            java.lang.String r4 = "patch.basepack.client.ver"
            java.lang.String r3 = r3.getProperty(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "get BASE_CLIENT_VERSION:"
            r4.append(r8)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r8 = new java.lang.Object[r5]
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.m106533v(r6, r4, r8)
            if (r3 == 0) goto L_0x00ab
            java.lang.String r4 = a70.C79471a.f233015c
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L_0x00ad
        L_0x00ab:
            r1 = -25
        L_0x00ad:
            if (r1 != 0) goto L_0x00c6
            boolean r3 = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isVmArt()
            if (r3 == 0) goto L_0x00c6
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>()
            java.lang.StackTraceElement[] r3 = r3.getStackTrace()
            boolean r3 = com.tencent.p014mm.app.C80588d1.m98204a(r3)
            if (r3 == 0) goto L_0x00c6
            r1 = -26
        L_0x00c6:
            java.util.Properties r2 = b12.C79644b.m96723a(r2)
            if (r2 == 0) goto L_0x00e5
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION
            java.lang.String r4 = "patch.client.ver"
            java.lang.String r4 = r2.getProperty(r4)
            java.lang.String r6 = "NEW_TINKER_ID"
            java.lang.String r2 = r2.getProperty(r6)
            if (r1 != 0) goto L_0x00df
            r6 = 1
            goto L_0x00e0
        L_0x00df:
            r6 = 0
        L_0x00e0:
            r8 = 2
            x02.C38431f.m41870a(r3, r4, r2, r8, r6)
            goto L_0x00eb
        L_0x00e5:
            java.lang.String r2 = "patchCheck properties is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r2)
        L_0x00eb:
            if (r1 != 0) goto L_0x00ee
            goto L_0x00ef
        L_0x00ee:
            r7 = 0
        L_0x00ef:
            java.lang.String r2 = "Tinker.HotPatchReportHelper"
            java.lang.String r3 = "hp_report try to apply hotpatch"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 338(0x152, float:4.74E-43)
            r3 = 71
            r4 = 2
            r8.mo175910t(r2, r4, r3, r5)
            if (r7 == 0) goto L_0x010c
            r9 = 338(0x152, double:1.67E-321)
            r11 = 7
            r13 = 1
            r15 = 1
            r8.idkeyStat(r9, r11, r13, r15)
        L_0x010c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a12.C79451c.mo109429b(java.lang.String, java.lang.String):int");
    }
}
